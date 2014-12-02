/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */

package app;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.percederberg.grammatica.parser.Node;
import net.percederberg.grammatica.parser.ParseException;
import net.percederberg.grammatica.parser.Production;
import net.percederberg.grammatica.parser.Token;

/**
 *
 * @author   Maciej && Mateusz
 * @version  1.0
 */
public class LatexMathInterpreter extends LatexMathAnalyzer {

    StringBuilder mathml;
    Integer indentation;

    public LatexMathInterpreter() {
        mathml = new StringBuilder();
        indentation = 0;
    }

    @Override
    public Node exitMath(Production node) throws ParseException {

        ArrayList values = getChildValues(node);

        for (int i = 0; i < values.size(); i++) {

            String value = (String) values.get(i);
            if (value.startsWith("<math") ||
                    value.startsWith("<mo>") || value.startsWith("<mi>") || value.startsWith("<mn>")) {

                appendTabulation();
                mathml.append(value+"\n");
                continue;
            }

            if (value.startsWith("</")) {

                if (indentation > 0) indentation--;
                appendTabulation();
                mathml.append(value+"\n");

            } else if (value.startsWith("<")) {

                appendTabulation();
                mathml.append(value+"\n");
                indentation++;

            } else {

                appendTabulation();
                mathml.append(value+"\n");

            }
        }

        node.addValues(getChildValues(node));
        return node;
    }
    
    @Override
    protected Node exitMathInline(Production node) throws ParseException {
        ArrayList values = getChildValues(node);
        values.add(0, "<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display=\"inline\">");
        values.add("</math>");
        
        node.addValues(values);
        return node;
    }
    
    @Override
    protected Node exitMathDisplay(Production node) throws ParseException {
        ArrayList values = getChildValues(node);
        values.add(0, "<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display=\"block\">");
        values.add("</math>");
        
        node.addValues(values);
        return node;
    }
    
    @Override
    protected Node exitStatement(Production node) throws ParseException { 
  
        ArrayList values = getChildValues(node); 
        String exp = (String) values.get(0); 
        int count = node.getChildCount();
        //System.out.println(exp); 
        if (count > 1) { 
              
            values.add(0, "<mrow>"); 
            values.add("</mrow>"); 
              
        }

        node.addValues(values);
        return node;

    }

    @Override
    protected Node exitExpression(Production node) throws ParseException {
        
        ArrayList values = getChildValues(node);
        int count = node.getChildCount();
        if (values.size() > 1) {

            values.add(0, "<mrow>");
            values.add("</mrow>");

        }

        node.addValues(values);
        return node;
    }

    @Override
    protected Node exitComponent(Production node) {
      
        ArrayList values = new ArrayList();
        values.addAll(node.getChildAt(0).getAllValues());

        for (int i = 1; i < node.getChildCount(); i++) {

            if (node.getChildAt(i).getName().equals("FactorExt") &&
                    node.getChildAt(i-1).getName().equals("FactorExt") && 
                    containsFirstChild(node.getChildAt(i-1), "Functions")) {

                values.add("<mo>&ApplyFunction;</mo>");
            } else if (node.getChildAt(i).getName().equals("FactorExt") &&
                    !node.getChildAt(i-1).getName().equals("BinaryOperator")) {

                values.add("<mo>&InvisibleTimes;</mo>");
            } 

            values.addAll(node.getChildAt(i).getAllValues());
        }

        node.addValues(values);
        return node;
    }

    @Override
    protected Node exitFactorExt(Production node) {

        int childCount = node.getChildCount();
        ArrayList values = getChildValues(node);
        String markupName = "";
        
        ArrayList<String> underover = new ArrayList();
        underover.add("INTEGRAL");
        underover.add("OINTEGRAL");
        underover.add("SUM");
        underover.add("PROD");
        underover.add("LIM");        
        
        byte [] scripts = new byte[]{0, 0};
        boolean uo = false;

        Node child = node;
        while (child.getChildCount() > 0) {
            child = child.getChildAt(0);
        }
      
        if (underover.contains(child.getName())) {
            uo = true;
        }
        
        for (int i = 0; i < node.getChildCount(); i++) {
            
            String name = node.getChildAt(i).getName();
            if (name.equals("Subscript")) {
                scripts[0] = 1;
            } else if (name.equals("Superscript")) {
                scripts[1] = 2;
            }
            
        }
        
        
        byte result = (byte) (scripts[0] + scripts[1]);
        
        if (uo) {
            
            switch (result) {
                case 1: markupName = "<munder>"; break;
                case 2: markupName = "<mover>"; break;
                case 3: markupName = "<munderover>"; break;
                default: markupName = ""; break;
            }

        } else {
            
            switch (result) {
                case 1: markupName = "<msub>"; break;
                case 2: markupName = "<msup>"; break;
                case 3: markupName = "<msubsup>"; break;
                default: markupName = ""; break;
            }
    
        }
        
        if (result > 0) {
            
            values.add(0, markupName);
            values.add(getEndingMarkup(markupName));
            
        }
        
        /*
        switch (childCount) {

            case 2:

                String name = node.getChildAt(1).getName();
                

                    if (name.equals("Subscript")) {
                        markupName = "<msub>";
                    } else if (name.equals("Superscript")) {
                        markupName = "<msup>";
                    } else {
                        markupName = "";
                    }

                

                values.add(0, markupName);
                values.add(getEndingMarkup(markupName));
                break;

            case 3:

                markupName = "<msubsup>";

                values.add(0, markupName);
                values.add(getEndingMarkup(markupName));
                break;

            default:
                break;

        }*/

        node.addValues(values);
        return node;
    }

    @Override
    protected Node exitFactor(Production node) {

        int count = node.getChildCount();
        ArrayList values = new ArrayList();
        String mrow = "<mrow>";
        
        if (count > 1) {

            for (int i = 0; i < count; i++) {

                Node child = node.getChildAt(i);
                if (child.getName().equals("L_CURLY_BRACKET") ||
                        child.getName().equals("R_CURLY_BRACKET")) {
                    continue;
                }

                values.addAll(child.getAllValues());
            }
            
            values.add(0, mrow);
            values.add(getEndingMarkup(mrow));

            node.addValues(values);
        } else {

            node.addValues(getChildValues(node));

        }

        return node;
    }

    @Override
    protected Node exitConstructions(Production node) {

        String name = node.getChildAt(0).getName();
        ArrayList values = getChildValues(node);


        if (name.equals("FRAC")) {
            values.add(0, "<mfrac>");
            values.add("</mfrac>");

        } else if (name.equals("SQRT")) {
            ArrayList function = new ArrayList();
            if (node.getChildAt(1).getName().equals("L_BRACKET")) {

                function.add("<mroot>");
                function.addAll(node.getChildAt(4).getAllValues()); // podstawa 
                function.addAll(node.getChildAt(2).getAllValues()); // stopień pierwiastka 
                function.add("</mroot>");

            } else {

                function.add("<msqrt>");
                function.addAll(node.getChildAt(1).getAllValues()); // podstawa 
                function.add("</msqrt>");

            }

            values = function;

        }

        node.addValues(values);
        return node;
    }
    
    @Override
    protected Node exitParameter(Production node) {

        int count = node.getChildCount();
        ArrayList values = new ArrayList();

        for (int i = 0; i < count; i++) {

            Node child = node.getChildAt(i);
            if (child.getName().equals("L_CURLY_BRACKET") ||
                    child.getName().equals("R_CURLY_BRACKET")) {
                continue;
            }

            if (child.getName().equals("DIGIT")) {
                values.add("<mn>" + child.getValue(0) + "</mn>");
            } else {
                values.addAll(child.getAllValues());
            }

        }

        node.addValues(values);
        return node;
    }

    @Override
    protected Node exitSubscript(Production node) {

        ArrayList values = getChildValues(node);
        ListIterator it = values.listIterator();

        while (it.hasNext()) {

            String value = (String) it.next();

            if (value.equals("_")) {
                it.remove();
            }

        }

        node.addValues(values);
        return node;
    }

    @Override
    protected Node exitSuperscript(Production node) {

        ArrayList values = getChildValues(node);
        ListIterator it = values.listIterator();

        while (it.hasNext()) {

            String value = (String) it.next();

            if (value.equals("^")) {
                it.remove();
            }

        }

        node.addValues(values);
        return node;
    }

   /* @Override
    public Node exitIntExpression(Production node) throws ParseException {

        ArrayList values = new ArrayList();
        Node child;

        int pos = 0;
        for (int i = 0; i < node.getChildCount(); i++) {
            if (node.getChildAt(i).getName().equals("Expression")) {
                pos = i;
                break;
            }
        }

        values.add("<munderover>");
        values.addAll(node.getChildAt(0).getAllValues());
        if (pos == 1) {

            values.add("<mn></mn>");
            values.add("<mn></mn>");

        } else if (pos == 2) {

            child = node.getChildAt(1);
            if (child.getName().equals("Subscript")) {

                values.addAll(child.getAllValues());
                values.add("<mn></mn>");

            } else if (child.getName().equals("Superscript")) {

                values.add("<mn></mn>");
                values.addAll(child.getAllValues());

            }

        } else {

            values.addAll(node.getChildAt(1).getAllValues());
            values.addAll(node.getChildAt(2).getAllValues());

        }

        boolean IdAfterMathrm = false;
        for (int i = pos; i < node.getChildCount(); i++) {

            child = node.getChildAt(i);
            if (child.getName().equals("Expression"))
                values.add("</munderover>");

            if (child.getName().equals("MATHRM")) IdAfterMathrm = true;
            
            if (child.getName().equals("COMMA") || child.getName().equals("MATHRM") ||
                child.getName().equals("L_CURLY_BRACKET") || child.getName().equals("R_CURLY_BRACKET") ||
                child.getName().equals("BACKSLASH"))
                continue;
            
            if (IdAfterMathrm && child.getName().equals("IDENT")) {
                
                String value = (String) child.getValue(0);
                value = value.replaceAll("mi", "mo");
                values.add(value);
                
                IdAfterMathrm = false;                
            } else {
                values.addAll(child.getAllValues());
            }
            
            
        }

        node.addValues(values);
        return node;
    }*/

    /*@Override
    public Node exitSumExpression(Production node) throws ParseException {

        ArrayList values = new ArrayList();
        Node child;

        int pos = 0;
        for (int i = 0; i < node.getChildCount(); i++) {
            if (node.getChildAt(i).getName().equals("Expression")) {
                pos = i;
                break;
            }
        }

        values.add("<munderover>");
        values.addAll(node.getChildAt(0).getAllValues());
        if (pos == 1) {

            values.add("<mn></mn>");
            values.add("<mn></mn>");

        } else if (pos == 2) {

            child = node.getChildAt(1);
            if (child.getName().equals("Stmt_subscript")) {

                values.addAll(child.getAllValues());
                values.add("<mn></mn>");

            } else if (child.getName().equals("Superscript")) {

                values.add("<mn></mn>");
                values.addAll(child.getAllValues());

            }

        } else {

            values.addAll(node.getChildAt(1).getAllValues());
            values.addAll(node.getChildAt(2).getAllValues());

        }

        for (int i = pos; i < node.getChildCount(); i++) {

            child = node.getChildAt(i);
            if (child.getName().equals("Expression"))
                values.add("</munderover>");

            values.addAll(child.getAllValues());
        }

        node.addValues(values);
        return node;
    }*/

   /* @Override
    public Node exitLogExpression(Production node) throws ParseException {

        ArrayList values = new ArrayList();

        String name = node.getChildAt(0).getName();
        if (name.equals("LN")) {

            boolean superscript = false;
            for (int i = 0; i < node.getChildCount(); i++) {

                Node child = node.getChildAt(i);
                if (child.getName().equals("Superscript")) {
                    superscript = true;
                    values.add(0, "<msup>");
                }

                if (child.getName().equals("Expression") && superscript) {
                    values.add("</msup>");
                }

                values.addAll(child.getAllValues());
            }

        } else if (name.equals("Log_symbol")) {

            boolean superscript = false;
            boolean subscript = false;

            for (int i = 0; i < node.getChildCount(); i++) {

                Node child = node.getChildAt(i);
                if (child.getName().equals("Superscript")) superscript = true;
                if (child.getName().equals("Subscript")) subscript = true;
            }

            String markupName = null;
            if (superscript && subscript) markupName = "<msubsup>";
            else if (superscript) markupName = "<msup>";
            else if (subscript) markupName = "<msub>";

            if (markupName != null) values.add(0, markupName);
            for (int i = 0; i < node.getChildCount(); i++) {

                if (node.getChildAt(i).getName().equals("Expression") && markupName != null) {
                    values.add(getEndingMarkup(markupName));
                }

                values.addAll(node.getChildAt(i).getAllValues());
            }
        }

        node.addValues(values);
        return node;

    }*/

   /* @Override
    public Node exitTrigExpression(Production node) throws ParseException {

        ArrayList values = new ArrayList();

        boolean superscript = false;
        boolean subscript = false;

        for (int i = 0; i < node.getChildCount(); i++) {

            Node child = node.getChildAt(i);
            if (child.getName().equals("Superscript")) superscript = true;
            if (child.getName().equals("Subscript")) subscript = true;
        }

        String markupName = null;
        if (superscript && subscript) markupName = "<msubsup>";
        else if (superscript) markupName = "<msup>";
        else if (subscript) markupName = "<msub>";

        if (markupName != null) values.add(0, markupName);
        for (int i = 0; i < node.getChildCount(); i++) {

            if (node.getChildAt(i).getName().equals("Component") && markupName != null) {
                values.add(getEndingMarkup(markupName));
            }

            values.addAll(node.getChildAt(i).getAllValues());
        }

        node.addValues(values);
        return node;
    }*/

    /*@Override
    public Node exitLimExpression(Production node) throws ParseException {

        ArrayList values = new ArrayList();
        boolean superscript = false;

        for (int i = 0; i < node.getChildCount(); i++) {

            Node child = node.getChildAt(i);
            if (child.getName().equals("Subscript")) {
                superscript = true;
                values.add(0, "<munder>");
            }

            if (child.getName().equals("Expression") && superscript) {
                values.add("</munder>");
            }

            values.addAll(child.getAllValues());
        }

        node.addValues(values);
        return node;
    }*/
    
    @Override
    public Node exitNumber(Production node) {
        ArrayList values = getChildValues(node);
        ListIterator it = values.listIterator();
        StringBuilder value = new StringBuilder();

        values.add(0, "<mn>");
        values.add("</mn>");

        for (Object str : values) {
            value.append((String) str);
        }

        node.addValue(value.toString());
        return node;
    }

    @Override
    public Node exitIdent(Token node) {
        node.addValue("<mi>" + node.getImage() + "</mi>");
        return node;
    }
    
    @Override
    protected Node exitRelation(Production node) throws ParseException {
        node.addValue("<mo>" + node.getChildAt(0).getValue(0) + "</mo>");
        return node;
    }
    
    @Override
    protected Node exitPlusOrMinus(Production node) throws ParseException {
        node.addValue("<mo>" + node.getChildAt(0).getValue(0) + "</mo>");
        return node;
    }

    @Override
    protected Node exitBinaryOperator(Production node) throws ParseException {
        node.addValue("<mo>" + node.getChildAt(0).getValue(0) + "</mo>");
        return node;
    }

    @Override
    protected Node exitUnaryOperator(Production node) throws ParseException {
        node.addValue("<mo>" + node.getChildAt(0).getValue(0) + "</mo>");
        return node;
    }
    
    @Override
    protected Node exitUnaryOperatorLeft(Production node) throws ParseException {
        node.addValue("<mo>" + node.getChildAt(0).getValue(0) + "</mo>");
        return node;
    }
    
    @Override
    protected Node exitSpecialSymbols(Production node) throws ParseException {
        node.addValue("<mi>" + node.getChildAt(0).getValue(0) + "</mi>");
        return node;
    }
    
    @Override
    protected Node exitGreek(Production node) throws ParseException {
        node.addValue("<mi>" + node.getChildAt(0).getValue(0) + "</mi>");
        return node;
    }
    
    @Override
    protected Node exitLoglikeSymbols(Production node) throws ParseException {
        node.addValue(node.getChildAt(0).getValue(0));
        return node;
    }
    
    @Override
    protected Node exitFunctions(Production node) throws ParseException {
        node.addValue("<mo>" + node.getChildAt(0).getValue(0) + "</mo>");
        return node;
    }

    /* ------------------------------- TOKENY ------------------------------- */
    @Override
    public void enterSBackslash(Token node) {
        node.addValue("<br />");
    }

    @Override
    public void enterDigit(Token node) {
        node.addValue(node.getImage());
    }
   
    /* -------------------- Characters ------------------------------ */
    @Override
    protected void enterPlus(Token node) throws ParseException {
        node.addValue("+");
    }

    @Override
    protected void enterMinus(Token node) throws ParseException {
        node.addValue("-");
    }

    @Override
    protected void enterAsterisk(Token node) throws ParseException {
        node.addValue("*");
    }

    @Override
    protected void enterSlash(Token node) throws ParseException {
        node.addValue("/");
    }

    @Override
    protected void enterExclamation(Token node) throws ParseException {
        node.addValue("!");
    }
    
        @Override
    protected void enterComma(Token node) throws ParseException {
        node.addValue(",");
    }

    @Override
    protected void enterUnderscore(Token node) throws ParseException {
        node.addValue("_");
    }

    @Override
    protected void enterApostrophe(Token node) throws ParseException {
        node.addValue("'");
    }
    
    @Override
    public void enterDot(Token node) throws ParseException {
        node.addValue(node.getImage());
    }
    
    @Override
    public void enterColon(Token node) throws ParseException {
        node.addValue(node.getImage());
    }
    
    /* ------------------ Delimeters ------------------------------- */
    @Override
    protected void enterLParenthesis(Token node) throws ParseException {
        node.addValue("<mo>(</mo>");
    }

    @Override
    protected void enterRParenthesis(Token node) throws ParseException {
        node.addValue("<mo>)</mo>");
    }

    @Override
    protected void enterLBracket(Token node) throws ParseException {
        node.addValue("<mo>[</mo>");
    }

    @Override
    protected void enterRBracket(Token node) throws ParseException {
        node.addValue("<mo>]</mo>");
    }
    
    @Override
    protected void enterLCurlyBracket(Token node) throws ParseException {
        node.addValue("{");
    }
    
    @Override
    protected void enterRCurlyBracket(Token node) throws ParseException {
        node.addValue("}");
    }
    
    @Override
    protected void enterLFloor(Token node) throws ParseException {
        node.addValue("<mo>&lfloor;</mo>");
    }
    
    @Override
    protected void enterRFloor(Token node) throws ParseException {
        node.addValue("<mo>&rfloor;</mo>");
    }
    
    @Override
    protected void enterLCeil(Token node) throws ParseException {
        node.addValue("<mo>&lceil;</mo>");
    }
    
    @Override
    protected void enterRCeil(Token node) throws ParseException {
        node.addValue("<mo>&rceil;</mo>");
    }
    
    @Override
    protected void enterLAngle(Token node) throws ParseException {
        node.addValue("<mo>&langle;</mo>");
    }
    
    @Override
    protected void enterRAngle(Token node) throws ParseException {
        node.addValue("<mo>&rangle;</mo>");
    }

    /* ------------------ Relations ------------------------ */
    @Override
    protected void enterNequal(Token node) throws ParseException {
        node.addValue("!=");
    }

    @Override
    protected void enterNequal2(Token node) throws ParseException {
        node.addValue("&ne;");
    }

    @Override
    protected void enterEqual(Token node) throws ParseException {
        node.addValue("=");
    }

    @Override
    protected void enterLt(Token node) throws ParseException {
        node.addValue("&lt;");
    }
    
    @Override
    protected void enterLet(Token node) throws ParseException {
        node.addValue("&le;");
    }

    @Override
    protected void enterGt(Token node) throws ParseException {
        node.addValue("&gt;");
    }

    @Override
    protected void enterGet(Token node) throws ParseException {
        node.addValue("&ge;");
    }
    
    @Override
    protected void enterPrec(Token node) throws ParseException {
        node.addValue("&pr;");
    }
    
    @Override
    protected void enterSucc(Token node) throws ParseException {
        node.addValue("&sc;");
    }
    
    @Override
    protected void enterPreceq(Token node) throws ParseException {
        node.addValue("&prcue;");
    }
    
    @Override
    protected void enterSucceq(Token node) throws ParseException {
        node.addValue("&sccue;");
    }

    @Override
    protected void enterLl(Token node) throws ParseException {
        node.addValue("&ll;");
    }
    
    @Override
    protected void enterGg(Token node) throws ParseException {
        node.addValue("&gg;");
    }
    
    @Override
    protected void enterSubset(Token node) throws ParseException {
        node.addValue("&sub;");
    }
    
    @Override
    protected void enterSupset(Token node) throws ParseException {
        node.addValue("&sup;");
    }
    
    @Override
    protected void enterSubseteq(Token node) throws ParseException {
        node.addValue("&sube;");
    }
    
    @Override
    protected void enterSupseteq(Token node) throws ParseException {
        node.addValue("&supe;");
    }
    
    @Override
    protected void enterNsubseteq(Token node) throws ParseException {
        node.addValue("&nsube;");
    }
    
    @Override
    protected void enterNsupseteq(Token node) throws ParseException {
        node.addValue("&nsupe;");
    }
    
    @Override
    protected void enterIn(Token node) throws ParseException {
        node.addValue("&isin;");
    }

    @Override
    protected void enterNi(Token node) throws ParseException {
        node.addValue("&ni;");
    }
    
    @Override
    protected void enterNotin(Token node) throws ParseException {
        node.addValue("&notin;");
    }
    
    @Override
    protected void enterEquiv(Token node) throws ParseException {
        node.addValue("&equiv;");
    }
    
    @Override
    protected void enterSim(Token node) throws ParseException {
        node.addValue("&sim;");
    }
    
    @Override
    protected void enterSimeq(Token node) throws ParseException {
        node.addValue("&simeq;");
    }
    
    /* ------------------- Additional operators --------------------- */
    @Override
    protected void enterTo(Token node) throws ParseException {
        node.addValue("&rarr;");
    }
    
    @Override
    protected void enterGets(Token node) throws ParseException {
        node.addValue("&larr;");
    }
    
    @Override
    protected void enterBmod(Token node) throws ParseException {
        node.addValue("mod");
    }
    
    @Override
    protected void enterForall(Token node) throws ParseException {
        node.addValue("&forall;");
    }
    
    @Override
    protected void enterExists(Token node) throws ParseException {
        node.addValue("&exist;");
    }
    
    @Override
    protected void enterNexists(Token node) throws ParseException {
        node.addValue("&nexists;");
    }

    @Override
    protected void enterPm(Token node) throws ParseException {
        node.addValue("&plusmn;");
    }
   
    @Override
    protected void enterMp(Token node) throws ParseException {
        node.addValue("&mnplus;");
    }
    
    @Override
    protected void enterDiv(Token node) throws ParseException {
        node.addValue("&divide;");
    }
    
    @Override
    protected void enterAst(Token node) throws ParseException {
        node.addValue("&ast;");
    }
    
    @Override
    protected void enterTimes(Token node) throws ParseException {
        node.addValue("&times;");
    }
    
    @Override
    protected void enterLeftarrow(Token node) throws ParseException {
        node.addValue("&larr;");
    }
    
    @Override
    protected void enterRightarrow(Token node) throws ParseException {
        node.addValue("&rarr;");
    }
    
    /* ------------------ Special symbols ------------------------ */
    @Override
    protected void enterLdots(Token node) throws ParseException {
        node.addValue("&hellip;");
    }
    
    @Override
    protected void enterCdots(Token node) throws ParseException {
        node.addValue("&ctdot;");
    }
    
    @Override
    protected void enterInfty(Token node) throws ParseException {
        node.addValue("&infin;");
    }
    
    @Override
    protected void enterEmptyset(Token node) throws ParseException {
        node.addValue("&empty;");
    }
    
    @Override
    protected void enterVarnothing(Token node) throws ParseException {
        node.addValue("&#8709;");
    }
    
    /* ------------------ Functions ------------------------ */
    @Override
    protected void enterIntegral(Token node) throws ParseException {
        node.addValue("&int;");
    }
    
    @Override
    protected void enterOintegral(Token node) throws ParseException {
        node.addValue("&oint;");
    }

    @Override
    protected void enterSum(Token node) throws ParseException {
        node.addValue("&sum;");
    }
    
    @Override
    protected void enterProd(Token node) throws ParseException {
        node.addValue("&prod;");
    }
    
    /* ------------------- Misc ------------------------------------- */
    @Override
    protected void enterPrime(Token node) throws ParseException {
        node.addValue("&prime;");
    }
    
    @Override
    protected void enterRe(Token node) throws ParseException {
        node.addValue("Re");
    }
    
    @Override
    protected void enterIm(Token node) throws ParseException {
        node.addValue("Im");
    }

    /* ------------------- Log-like symbols ------------------------- */
    @Override
    protected void enterArccos(Token node) throws ParseException {
        node.addValue("arccos");
    }

    @Override
    protected void enterArcsin(Token node) throws ParseException {
        node.addValue("arcsin");
    }

    @Override
    protected void enterArctan(Token node) throws ParseException {
        node.addValue("arctan");
    }
    
    @Override
    protected void enterArccot(Token node) throws ParseException {
        node.addValue("arccot");
    }
    
    @Override
    protected void enterArg(Token node) throws ParseException {
        node.addValue("arg");
    }

    @Override
    protected void enterCos(Token node) throws ParseException {
        node.addValue("cos");
    }

    @Override
    protected void enterCosh(Token node) throws ParseException {
        node.addValue("cosh");
    }

    @Override
    protected void enterCot(Token node) throws ParseException {
        node.addValue("cot");
    }

    @Override
    protected void enterCoth(Token node) throws ParseException {
        node.addValue("coth");
    }
    
    @Override
    protected void enterCsc(Token node) throws ParseException {
        node.addValue("csc");
    }
    
    @Override
    protected void enterExp(Token node) throws ParseException {
        node.addValue("exp");
    }
    
    @Override
    protected void enterLg(Token node) throws ParseException {
        node.addValue("lg");
    }
    
    @Override
    protected void enterLim(Token node) throws ParseException {
        node.addValue("lim");
    }
    
    @Override
    protected void enterLn(Token node) throws ParseException {
        node.addValue("ln");
    }
    
    @Override
    protected void enterLog(Token node) throws ParseException {
        node.addValue("log");
    }
    
    @Override
    protected void enterSec(Token node) throws ParseException {
        node.addValue("sec");
    }
    
    @Override
    protected void enterSin(Token node) throws ParseException {
        node.addValue("sin");
    }

    @Override
    protected void enterSinh(Token node) throws ParseException {
        node.addValue("sinh");
    }
    
    @Override
    protected void enterSup(Token node) throws ParseException {
        node.addValue("sup");
    }

    @Override
    protected void enterTan(Token node) throws ParseException {
        node.addValue("tan");
    }

    @Override
    protected void enterTanh(Token node) throws ParseException {
        node.addValue("tanh");
    }
    
    /*@Override
    protected void enterLiminf(Token node) throws ParseException {
        node.addValue("lim");
    }

    @Override
    protected void enterLimsup(Token node) throws ParseException {
        node.addValue("lim");
    }*/

   
    
    

    /* ------------------- Inne ---------------------------------- */
    
    
    @Override
    protected void enterBackslash(Token node) throws ParseException {
        node.addValue("\\");
    }

    /* ------------------ Greckie litery ----------------------- */
    @Override
    protected void enterAlpha(Token node) throws ParseException {
        node.addValue("&alpha;");
    }

    @Override
    protected void enterBeta(Token node) throws ParseException {
        node.addValue("&beta;");
    }

    @Override
    protected void enterGamma(Token node) throws ParseException {
        node.addValue("&gamma;");
    }

    @Override
    protected void enterDelta(Token node) throws ParseException {
        node.addValue("&delta;");
    }

    @Override
    protected void enterEpsilon(Token node) throws ParseException {
        node.addValue("&epsilon;");
    }

    @Override
    protected void enterZeta(Token node) throws ParseException {
        node.addValue("&zeta;");
    }

    @Override
    protected void enterEta(Token node) throws ParseException {
        node.addValue("&eta;");
    }

    @Override
    protected void enterTheta(Token node) throws ParseException {
        node.addValue("&theta;");
    }

    @Override
    protected void enterKappa(Token node) throws ParseException {
        node.addValue("&kappa;");
    }

    @Override
    protected void enterLambda(Token node) throws ParseException {
        node.addValue("&lambda;");
    }

    @Override
    protected void enterMu(Token node) throws ParseException {
        node.addValue("&mu;");
    }

    @Override
    protected void enterNu(Token node) throws ParseException {
        node.addValue("&nu;");
    }

    @Override
    protected void enterXi(Token node) throws ParseException {
        node.addValue("&xi;");
    }

    @Override
    protected void enterPi(Token node) throws ParseException {
        node.addValue("&pi;");
    }

    @Override
    protected void enterRho(Token node) throws ParseException {
        node.addValue("&rho;");
    }

    @Override
    protected void enterSigma(Token node) throws ParseException {
        node.addValue("&sigma;");
    }

    @Override
    protected void enterTau(Token node) throws ParseException {
        node.addValue("&tau;");
    }

    @Override
    protected void enterUpsilon(Token node) throws ParseException {
        node.addValue("&upsilon;");
    }

    @Override
    protected void enterPhi(Token node) throws ParseException {
        node.addValue("&phi;");
    }

    @Override
    protected void enterChi(Token node) throws ParseException {
        node.addValue("&chi;");
    }

    @Override
    protected void enterOmega(Token node) throws ParseException {
        node.addValue("&omega;");
    }

    @Override
    protected void enterVarepsilon(Token node) throws ParseException {
        node.addValue("\u03b6");
    }

    @Override
    protected void enterVartheta(Token node) throws ParseException {
        node.addValue("\u03d2");
    }

    @Override
    protected void enterVarpi(Token node) throws ParseException {
        node.addValue("\u03d6");
    }

    @Override
    protected void enterVarrho(Token node) throws ParseException {
        node.addValue("\u03f1");
    }

    @Override
    protected void enterVarsigma(Token node) throws ParseException {
        node.addValue("\u03c2");
    }

    @Override
    protected void enterVarphi(Token node) throws ParseException {
        node.addValue("\u03c6");
    }
    
    @Override
    protected void enterBgamma(Token node) throws ParseException {
        node.addValue("&Gamma;");
    }
    
    @Override
    protected void enterBdelta(Token node) throws ParseException {
        node.addValue("&Delta;");
    }

    @Override
    protected void enterBtheta(Token node) throws ParseException {
        node.addValue("&Theta;");
    }
    
    @Override
    protected void enterBlambda(Token node) throws ParseException {
        node.addValue("&Lambda;");
    }
    
    @Override
    protected void enterBxi(Token node) throws ParseException {
        node.addValue("&Xi;");
    }
    
    @Override
    protected void enterBpi(Token node) throws ParseException {
        node.addValue("&Pi;");
    }
    
    @Override
    protected void enterBsigma(Token node) throws ParseException {
        node.addValue("&Sigma;");
    }
    
    @Override
    protected void enterBupsilon(Token node) throws ParseException {
        node.addValue("&Upsilon;");
    }
    
    @Override
    protected void enterBphi(Token node) throws ParseException {
        node.addValue("&Phi;");
    }
    
    @Override
    protected void enterBpsi(Token node) throws ParseException {
        node.addValue("&Psi;");
    }
    
    @Override
    protected void enterBomega(Token node) throws ParseException {
        node.addValue("&Omega;");
    }
    
    

    /* ------------------------------------------------------------------ */
    public String getMathML() {
        return mathml.toString();
    }

    protected void appendTabulation() {
        for (int i = 0; i < indentation; i++)
            mathml.append("    ");
    }

    protected String getEndingMarkup(String markup) {

        if (markup.isEmpty())
            return markup;

        StringBuilder str = new StringBuilder(markup);
        str.insert(1, "/");
        return str.toString();

    }
    
    protected boolean containsFirstChild(Node node, String childName) {
        
        Node child = node;
        while (child.getChildCount() > 0) {
            child = child.getChildAt(0);
            if (child.getName().equals(childName))
                return true;
        }
        
        return false;
    }
} 
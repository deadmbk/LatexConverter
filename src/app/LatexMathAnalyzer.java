/*
 * LatexMathAnalyzer.java
 *
 * THIS FILE HAS BEEN GENERATED AUTOMATICALLY. DO NOT EDIT!
 */

package app;

import net.percederberg.grammatica.parser.Analyzer;
import net.percederberg.grammatica.parser.Node;
import net.percederberg.grammatica.parser.ParseException;
import net.percederberg.grammatica.parser.Production;
import net.percederberg.grammatica.parser.Token;

/**
 * A class providing callback methods for the parser.
 *
 * @author   Maciej
 * @version  1.0
 */
abstract class LatexMathAnalyzer extends Analyzer {

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enter(Node node) throws ParseException {
        switch (node.getId()) {
        case LatexMathConstants.IDENT:
            enterIdent((Token) node);
            break;
        case LatexMathConstants.DIGIT:
            enterDigit((Token) node);
            break;
        case LatexMathConstants.S_DOLLAR:
            enterSDollar((Token) node);
            break;
        case LatexMathConstants.S_PERCENT:
            enterSPercent((Token) node);
            break;
        case LatexMathConstants.S_UNDERSCORE:
            enterSUnderscore((Token) node);
            break;
        case LatexMathConstants.S_LBRACE:
            enterSLbrace((Token) node);
            break;
        case LatexMathConstants.S_RBRACE:
            enterSRbrace((Token) node);
            break;
        case LatexMathConstants.S_AMPERSAND:
            enterSAmpersand((Token) node);
            break;
        case LatexMathConstants.S_HASH:
            enterSHash((Token) node);
            break;
        case LatexMathConstants.S_BACKSLASH:
            enterSBackslash((Token) node);
            break;
        case LatexMathConstants.S_BACKSLASH_A:
            enterSBackslashA((Token) node);
            break;
        case LatexMathConstants.TILDE:
            enterTilde((Token) node);
            break;
        case LatexMathConstants.BACKTICK:
            enterBacktick((Token) node);
            break;
        case LatexMathConstants.EXCLAMATION:
            enterExclamation((Token) node);
            break;
        case LatexMathConstants.AT:
            enterAt((Token) node);
            break;
        case LatexMathConstants.HASH:
            enterHash((Token) node);
            break;
        case LatexMathConstants.DOLLAR:
            enterDollar((Token) node);
            break;
        case LatexMathConstants.PERCENT:
            enterPercent((Token) node);
            break;
        case LatexMathConstants.CARET:
            enterCaret((Token) node);
            break;
        case LatexMathConstants.AMPERSAND:
            enterAmpersand((Token) node);
            break;
        case LatexMathConstants.ASTERISK:
            enterAsterisk((Token) node);
            break;
        case LatexMathConstants.UNDERSCORE:
            enterUnderscore((Token) node);
            break;
        case LatexMathConstants.MINUS:
            enterMinus((Token) node);
            break;
        case LatexMathConstants.PLUS:
            enterPlus((Token) node);
            break;
        case LatexMathConstants.EQUAL:
            enterEqual((Token) node);
            break;
        case LatexMathConstants.BACKSLASH:
            enterBackslash((Token) node);
            break;
        case LatexMathConstants.VERT_BAR:
            enterVertBar((Token) node);
            break;
        case LatexMathConstants.COLON:
            enterColon((Token) node);
            break;
        case LatexMathConstants.SEMICOLON:
            enterSemicolon((Token) node);
            break;
        case LatexMathConstants.APOSTROPHE:
            enterApostrophe((Token) node);
            break;
        case LatexMathConstants.QUOTATION:
            enterQuotation((Token) node);
            break;
        case LatexMathConstants.COMMA:
            enterComma((Token) node);
            break;
        case LatexMathConstants.DOT:
            enterDot((Token) node);
            break;
        case LatexMathConstants.SLASH:
            enterSlash((Token) node);
            break;
        case LatexMathConstants.QUESTION:
            enterQuestion((Token) node);
            break;
        case LatexMathConstants.L_PARENTHESIS:
            enterLParenthesis((Token) node);
            break;
        case LatexMathConstants.R_PARENTHESIS:
            enterRParenthesis((Token) node);
            break;
        case LatexMathConstants.L_BRACKET:
            enterLBracket((Token) node);
            break;
        case LatexMathConstants.R_BRACKET:
            enterRBracket((Token) node);
            break;
        case LatexMathConstants.L_CURLY_BRACKET:
            enterLCurlyBracket((Token) node);
            break;
        case LatexMathConstants.R_CURLY_BRACKET:
            enterRCurlyBracket((Token) node);
            break;
        case LatexMathConstants.L_FLOOR:
            enterLFloor((Token) node);
            break;
        case LatexMathConstants.R_FLOOR:
            enterRFloor((Token) node);
            break;
        case LatexMathConstants.L_CEIL:
            enterLCeil((Token) node);
            break;
        case LatexMathConstants.R_CEIL:
            enterRCeil((Token) node);
            break;
        case LatexMathConstants.L_ANGLE:
            enterLAngle((Token) node);
            break;
        case LatexMathConstants.R_ANGLE:
            enterRAngle((Token) node);
            break;
        case LatexMathConstants.NEQUAL:
            enterNequal((Token) node);
            break;
        case LatexMathConstants.NEQUAL2:
            enterNequal2((Token) node);
            break;
        case LatexMathConstants.LT:
            enterLt((Token) node);
            break;
        case LatexMathConstants.LET:
            enterLet((Token) node);
            break;
        case LatexMathConstants.GT:
            enterGt((Token) node);
            break;
        case LatexMathConstants.GET:
            enterGet((Token) node);
            break;
        case LatexMathConstants.PREC:
            enterPrec((Token) node);
            break;
        case LatexMathConstants.SUCC:
            enterSucc((Token) node);
            break;
        case LatexMathConstants.PRECEQ:
            enterPreceq((Token) node);
            break;
        case LatexMathConstants.SUCCEQ:
            enterSucceq((Token) node);
            break;
        case LatexMathConstants.LL:
            enterLl((Token) node);
            break;
        case LatexMathConstants.GG:
            enterGg((Token) node);
            break;
        case LatexMathConstants.SUBSET:
            enterSubset((Token) node);
            break;
        case LatexMathConstants.SUPSET:
            enterSupset((Token) node);
            break;
        case LatexMathConstants.SUBSETEQ:
            enterSubseteq((Token) node);
            break;
        case LatexMathConstants.SUPSETEQ:
            enterSupseteq((Token) node);
            break;
        case LatexMathConstants.NSUBSETEQ:
            enterNsubseteq((Token) node);
            break;
        case LatexMathConstants.NSUPSETEQ:
            enterNsupseteq((Token) node);
            break;
        case LatexMathConstants.IN:
            enterIn((Token) node);
            break;
        case LatexMathConstants.NI:
            enterNi((Token) node);
            break;
        case LatexMathConstants.NOTIN:
            enterNotin((Token) node);
            break;
        case LatexMathConstants.EQUIV:
            enterEquiv((Token) node);
            break;
        case LatexMathConstants.SIM:
            enterSim((Token) node);
            break;
        case LatexMathConstants.SIMEQ:
            enterSimeq((Token) node);
            break;
        case LatexMathConstants.TO:
            enterTo((Token) node);
            break;
        case LatexMathConstants.GETS:
            enterGets((Token) node);
            break;
        case LatexMathConstants.BMOD:
            enterBmod((Token) node);
            break;
        case LatexMathConstants.FORALL:
            enterForall((Token) node);
            break;
        case LatexMathConstants.EXISTS:
            enterExists((Token) node);
            break;
        case LatexMathConstants.NEXISTS:
            enterNexists((Token) node);
            break;
        case LatexMathConstants.PM:
            enterPm((Token) node);
            break;
        case LatexMathConstants.MP:
            enterMp((Token) node);
            break;
        case LatexMathConstants.DIV:
            enterDiv((Token) node);
            break;
        case LatexMathConstants.AST:
            enterAst((Token) node);
            break;
        case LatexMathConstants.TIMES:
            enterTimes((Token) node);
            break;
        case LatexMathConstants.LEFTARROW:
            enterLeftarrow((Token) node);
            break;
        case LatexMathConstants.RIGHTARROW:
            enterRightarrow((Token) node);
            break;
        case LatexMathConstants.LDOTS:
            enterLdots((Token) node);
            break;
        case LatexMathConstants.INFTY:
            enterInfty((Token) node);
            break;
        case LatexMathConstants.CDOTS:
            enterCdots((Token) node);
            break;
        case LatexMathConstants.EMPTYSET:
            enterEmptyset((Token) node);
            break;
        case LatexMathConstants.VARNOTHING:
            enterVarnothing((Token) node);
            break;
        case LatexMathConstants.PARTIAL:
            enterPartial((Token) node);
            break;
        case LatexMathConstants.FRAC:
            enterFrac((Token) node);
            break;
        case LatexMathConstants.SQRT:
            enterSqrt((Token) node);
            break;
        case LatexMathConstants.SUM:
            enterSum((Token) node);
            break;
        case LatexMathConstants.INTEGRAL:
            enterIntegral((Token) node);
            break;
        case LatexMathConstants.PROD:
            enterProd((Token) node);
            break;
        case LatexMathConstants.OINTEGRAL:
            enterOintegral((Token) node);
            break;
        case LatexMathConstants.MATHRM:
            enterMathrm((Token) node);
            break;
        case LatexMathConstants.PRIME:
            enterPrime((Token) node);
            break;
        case LatexMathConstants.RE:
            enterRe((Token) node);
            break;
        case LatexMathConstants.IM:
            enterIm((Token) node);
            break;
        case LatexMathConstants.ARCCOS:
            enterArccos((Token) node);
            break;
        case LatexMathConstants.ARCSIN:
            enterArcsin((Token) node);
            break;
        case LatexMathConstants.ARCTAN:
            enterArctan((Token) node);
            break;
        case LatexMathConstants.ARCCOT:
            enterArccot((Token) node);
            break;
        case LatexMathConstants.ARG:
            enterArg((Token) node);
            break;
        case LatexMathConstants.COS:
            enterCos((Token) node);
            break;
        case LatexMathConstants.COSH:
            enterCosh((Token) node);
            break;
        case LatexMathConstants.COT:
            enterCot((Token) node);
            break;
        case LatexMathConstants.COTH:
            enterCoth((Token) node);
            break;
        case LatexMathConstants.CSC:
            enterCsc((Token) node);
            break;
        case LatexMathConstants.EXP:
            enterExp((Token) node);
            break;
        case LatexMathConstants.LG:
            enterLg((Token) node);
            break;
        case LatexMathConstants.LIM:
            enterLim((Token) node);
            break;
        case LatexMathConstants.LN:
            enterLn((Token) node);
            break;
        case LatexMathConstants.LOG:
            enterLog((Token) node);
            break;
        case LatexMathConstants.SEC:
            enterSec((Token) node);
            break;
        case LatexMathConstants.SIN:
            enterSin((Token) node);
            break;
        case LatexMathConstants.SINH:
            enterSinh((Token) node);
            break;
        case LatexMathConstants.SUP:
            enterSup((Token) node);
            break;
        case LatexMathConstants.TAN:
            enterTan((Token) node);
            break;
        case LatexMathConstants.TANH:
            enterTanh((Token) node);
            break;
        case LatexMathConstants.INF:
            enterInf((Token) node);
            break;
        case LatexMathConstants.ALPHA:
            enterAlpha((Token) node);
            break;
        case LatexMathConstants.BETA:
            enterBeta((Token) node);
            break;
        case LatexMathConstants.GAMMA:
            enterGamma((Token) node);
            break;
        case LatexMathConstants.DELTA:
            enterDelta((Token) node);
            break;
        case LatexMathConstants.EPSILON:
            enterEpsilon((Token) node);
            break;
        case LatexMathConstants.VAREPSILON:
            enterVarepsilon((Token) node);
            break;
        case LatexMathConstants.ZETA:
            enterZeta((Token) node);
            break;
        case LatexMathConstants.ETA:
            enterEta((Token) node);
            break;
        case LatexMathConstants.THETA:
            enterTheta((Token) node);
            break;
        case LatexMathConstants.VARTHETA:
            enterVartheta((Token) node);
            break;
        case LatexMathConstants.KAPPA:
            enterKappa((Token) node);
            break;
        case LatexMathConstants.LAMBDA:
            enterLambda((Token) node);
            break;
        case LatexMathConstants.MU:
            enterMu((Token) node);
            break;
        case LatexMathConstants.NU:
            enterNu((Token) node);
            break;
        case LatexMathConstants.XI:
            enterXi((Token) node);
            break;
        case LatexMathConstants.PI:
            enterPi((Token) node);
            break;
        case LatexMathConstants.VARPI:
            enterVarpi((Token) node);
            break;
        case LatexMathConstants.RHO:
            enterRho((Token) node);
            break;
        case LatexMathConstants.VARRHO:
            enterVarrho((Token) node);
            break;
        case LatexMathConstants.SIGMA:
            enterSigma((Token) node);
            break;
        case LatexMathConstants.VARSIGMA:
            enterVarsigma((Token) node);
            break;
        case LatexMathConstants.TAU:
            enterTau((Token) node);
            break;
        case LatexMathConstants.UPSILON:
            enterUpsilon((Token) node);
            break;
        case LatexMathConstants.PHI:
            enterPhi((Token) node);
            break;
        case LatexMathConstants.VARPHI:
            enterVarphi((Token) node);
            break;
        case LatexMathConstants.CHI:
            enterChi((Token) node);
            break;
        case LatexMathConstants.PSI:
            enterPsi((Token) node);
            break;
        case LatexMathConstants.OMEGA:
            enterOmega((Token) node);
            break;
        case LatexMathConstants.BGAMMA:
            enterBgamma((Token) node);
            break;
        case LatexMathConstants.BDELTA:
            enterBdelta((Token) node);
            break;
        case LatexMathConstants.BTHETA:
            enterBtheta((Token) node);
            break;
        case LatexMathConstants.BLAMBDA:
            enterBlambda((Token) node);
            break;
        case LatexMathConstants.BXI:
            enterBxi((Token) node);
            break;
        case LatexMathConstants.BPI:
            enterBpi((Token) node);
            break;
        case LatexMathConstants.BSIGMA:
            enterBsigma((Token) node);
            break;
        case LatexMathConstants.BUPSILON:
            enterBupsilon((Token) node);
            break;
        case LatexMathConstants.BPHI:
            enterBphi((Token) node);
            break;
        case LatexMathConstants.BPSI:
            enterBpsi((Token) node);
            break;
        case LatexMathConstants.BOMEGA:
            enterBomega((Token) node);
            break;
        case LatexMathConstants.DOCUMENTCLASS:
            enterDocumentclass((Token) node);
            break;
        case LatexMathConstants.USEPACKAGE:
            enterUsepackage((Token) node);
            break;
        case LatexMathConstants.BEGIN_ENV:
            enterBeginEnv((Token) node);
            break;
        case LatexMathConstants.END_ENV:
            enterEndEnv((Token) node);
            break;
        case LatexMathConstants.BEGIN_DOCUMENT:
            enterBeginDocument((Token) node);
            break;
        case LatexMathConstants.END_DOCUMENT:
            enterEndDocument((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_FLEQN:
            enterDocOptFleqn((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_LEQNO:
            enterDocOptLeqno((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_DRAFT:
            enterDocOptDraft((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_LANDSCAPE:
            enterDocOptLandscape((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_FONT_10:
            enterDocOptFont10((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_FONT_11:
            enterDocOptFont11((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_FONT_12:
            enterDocOptFont12((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAPER_LETTER:
            enterDocOptPaperLetter((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAPER_A4:
            enterDocOptPaperA4((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAPER_A5:
            enterDocOptPaperA5((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAPER_B5:
            enterDocOptPaperB5((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAPER_EXECUTIVE:
            enterDocOptPaperExecutive((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAPER_LEGAL:
            enterDocOptPaperLegal((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_COLUMN_ONE:
            enterDocOptColumnOne((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_COLUMN_TWO:
            enterDocOptColumnTwo((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAGE_TITLE:
            enterDocOptPageTitle((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_PAGE_NOTITLE:
            enterDocOptPageNotitle((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_SIDE_ONE:
            enterDocOptSideOne((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_SIDE_TWO:
            enterDocOptSideTwo((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_OPEN_ANY:
            enterDocOptOpenAny((Token) node);
            break;
        case LatexMathConstants.DOC_OPT_OPEN_RIGHT:
            enterDocOptOpenRight((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_ARTICLE:
            enterDocClassArticle((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_IEEE:
            enterDocClassIeee((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_PROC:
            enterDocClassProc((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_MINIMAL:
            enterDocClassMinimal((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_REPORT:
            enterDocClassReport((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_BOOK:
            enterDocClassBook((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_SLIDES:
            enterDocClassSlides((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_MEMOIR:
            enterDocClassMemoir((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_LETTER:
            enterDocClassLetter((Token) node);
            break;
        case LatexMathConstants.DOC_CLASS_BEAMER:
            enterDocClassBeamer((Token) node);
            break;
        case LatexMathConstants.MATH_BEGIN:
            enterMathBegin((Token) node);
            break;
        case LatexMathConstants.MATH_END:
            enterMathEnd((Token) node);
            break;
        case LatexMathConstants.DISPLAYMATH_BEGIN:
            enterDisplaymathBegin((Token) node);
            break;
        case LatexMathConstants.DISPLAYMATH_END:
            enterDisplaymathEnd((Token) node);
            break;
        case LatexMathConstants.EQUATION_BEGIN:
            enterEquationBegin((Token) node);
            break;
        case LatexMathConstants.EQUATION_END:
            enterEquationEnd((Token) node);
            break;
        case LatexMathConstants.EQUATION_A_BEGIN:
            enterEquationABegin((Token) node);
            break;
        case LatexMathConstants.S_LPARENTHESIS:
            enterSLparenthesis((Token) node);
            break;
        case LatexMathConstants.S_RPARENTHESIS:
            enterSRparenthesis((Token) node);
            break;
        case LatexMathConstants.S_LBRACKET:
            enterSLbracket((Token) node);
            break;
        case LatexMathConstants.S_RBRACKET:
            enterSRbracket((Token) node);
            break;
        case LatexMathConstants.DOCUMENT:
            enterDocument((Production) node);
            break;
        case LatexMathConstants.PREAMBLE:
            enterPreamble((Production) node);
            break;
        case LatexMathConstants.DOCUMENTCLASS_DECLARATION:
            enterDocumentclassDeclaration((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_CLASS_TYPE:
            enterDocumentClassType((Production) node);
            break;
        case LatexMathConstants.CLASSNAME:
            enterClassname((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_OPTIONS:
            enterDocumentOptions((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_OPTION:
            enterDocumentOption((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_FONTSIZE:
            enterDocumentFontsize((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_PAPERSIZE:
            enterDocumentPapersize((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_COLUMNS:
            enterDocumentColumns((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_START_PAGE:
            enterDocumentStartPage((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_OUTPUT_SIDE:
            enterDocumentOutputSide((Production) node);
            break;
        case LatexMathConstants.DOCUMENT_OPEN:
            enterDocumentOpen((Production) node);
            break;
        case LatexMathConstants.PACKAGE_DECLARATION:
            enterPackageDeclaration((Production) node);
            break;
        case LatexMathConstants.PACKAGE_OPTIONS:
            enterPackageOptions((Production) node);
            break;
        case LatexMathConstants.PACKAGE_NAME:
            enterPackageName((Production) node);
            break;
        case LatexMathConstants.PACKAGE_PARAMETER:
            enterPackageParameter((Production) node);
            break;
        case LatexMathConstants.WORD:
            enterWord((Production) node);
            break;
        case LatexMathConstants.NUMBER:
            enterNumber((Production) node);
            break;
        case LatexMathConstants.SPECIAL_CHAR:
            enterSpecialChar((Production) node);
            break;
        case LatexMathConstants.WORD_NUMERIC:
            enterWordNumeric((Production) node);
            break;
        case LatexMathConstants.NUMERIC:
            enterNumeric((Production) node);
            break;
        case LatexMathConstants.NAME:
            enterName((Production) node);
            break;
        case LatexMathConstants.TEXT:
            enterText((Production) node);
            break;
        case LatexMathConstants.COMMAND:
            enterCommand((Production) node);
            break;
        case LatexMathConstants.COMMAND_PARAMETERS:
            enterCommandParameters((Production) node);
            break;
        case LatexMathConstants.COMMAND_OPTIONAL_PARAMETER:
            enterCommandOptionalParameter((Production) node);
            break;
        case LatexMathConstants.COMMAND_REQUIRED_PARAMETER:
            enterCommandRequiredParameter((Production) node);
            break;
        case LatexMathConstants.COMMAND_CONTENT:
            enterCommandContent((Production) node);
            break;
        case LatexMathConstants.SPECIAL_COMMAND:
            enterSpecialCommand((Production) node);
            break;
        case LatexMathConstants.ENVIRONMENT:
            enterEnvironment((Production) node);
            break;
        case LatexMathConstants.ENVIRONMENT_OPTIONAL_PARAMETER:
            enterEnvironmentOptionalParameter((Production) node);
            break;
        case LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER:
            enterEnvironmentRequiredParameter((Production) node);
            break;
        case LatexMathConstants.BODY:
            enterBody((Production) node);
            break;
        case LatexMathConstants.CONTENT:
            enterContent((Production) node);
            break;
        case LatexMathConstants.ALLOWED_TOKENS:
            enterAllowedTokens((Production) node);
            break;
        case LatexMathConstants.MATH:
            enterMath((Production) node);
            break;
        case LatexMathConstants.MATH_INLINE:
            enterMathInline((Production) node);
            break;
        case LatexMathConstants.MATH_DISPLAY:
            enterMathDisplay((Production) node);
            break;
        case LatexMathConstants.STATEMENT:
            enterStatement((Production) node);
            break;
        case LatexMathConstants.RELATION:
            enterRelation((Production) node);
            break;
        case LatexMathConstants.EXPRESSION:
            enterExpression((Production) node);
            break;
        case LatexMathConstants.PLUS_OR_MINUS:
            enterPlusOrMinus((Production) node);
            break;
        case LatexMathConstants.COMPONENT:
            enterComponent((Production) node);
            break;
        case LatexMathConstants.FACTOR_EXT:
            enterFactorExt((Production) node);
            break;
        case LatexMathConstants.BINARY_OPERATOR:
            enterBinaryOperator((Production) node);
            break;
        case LatexMathConstants.UNARY_OPERATOR:
            enterUnaryOperator((Production) node);
            break;
        case LatexMathConstants.UNARY_OPERATOR_LEFT:
            enterUnaryOperatorLeft((Production) node);
            break;
        case LatexMathConstants.FACTOR:
            enterFactor((Production) node);
            break;
        case LatexMathConstants.SPECIAL_SYMBOL:
            enterSpecialSymbol((Production) node);
            break;
        case LatexMathConstants.GREEK:
            enterGreek((Production) node);
            break;
        case LatexMathConstants.FUNCTION:
            enterFunction((Production) node);
            break;
        case LatexMathConstants.LOGLIKE_SYMBOL:
            enterLoglikeSymbol((Production) node);
            break;
        case LatexMathConstants.OPERATOR_IDENT:
            enterOperatorIdent((Production) node);
            break;
        case LatexMathConstants.CONSTRUCTION:
            enterConstruction((Production) node);
            break;
        case LatexMathConstants.PARAMETER:
            enterParameter((Production) node);
            break;
        case LatexMathConstants.SUBSCRIPT:
            enterSubscript((Production) node);
            break;
        case LatexMathConstants.SUPERSCRIPT:
            enterSuperscript((Production) node);
            break;
        }
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exit(Node node) throws ParseException {
        switch (node.getId()) {
        case LatexMathConstants.IDENT:
            return exitIdent((Token) node);
        case LatexMathConstants.DIGIT:
            return exitDigit((Token) node);
        case LatexMathConstants.S_DOLLAR:
            return exitSDollar((Token) node);
        case LatexMathConstants.S_PERCENT:
            return exitSPercent((Token) node);
        case LatexMathConstants.S_UNDERSCORE:
            return exitSUnderscore((Token) node);
        case LatexMathConstants.S_LBRACE:
            return exitSLbrace((Token) node);
        case LatexMathConstants.S_RBRACE:
            return exitSRbrace((Token) node);
        case LatexMathConstants.S_AMPERSAND:
            return exitSAmpersand((Token) node);
        case LatexMathConstants.S_HASH:
            return exitSHash((Token) node);
        case LatexMathConstants.S_BACKSLASH:
            return exitSBackslash((Token) node);
        case LatexMathConstants.S_BACKSLASH_A:
            return exitSBackslashA((Token) node);
        case LatexMathConstants.TILDE:
            return exitTilde((Token) node);
        case LatexMathConstants.BACKTICK:
            return exitBacktick((Token) node);
        case LatexMathConstants.EXCLAMATION:
            return exitExclamation((Token) node);
        case LatexMathConstants.AT:
            return exitAt((Token) node);
        case LatexMathConstants.HASH:
            return exitHash((Token) node);
        case LatexMathConstants.DOLLAR:
            return exitDollar((Token) node);
        case LatexMathConstants.PERCENT:
            return exitPercent((Token) node);
        case LatexMathConstants.CARET:
            return exitCaret((Token) node);
        case LatexMathConstants.AMPERSAND:
            return exitAmpersand((Token) node);
        case LatexMathConstants.ASTERISK:
            return exitAsterisk((Token) node);
        case LatexMathConstants.UNDERSCORE:
            return exitUnderscore((Token) node);
        case LatexMathConstants.MINUS:
            return exitMinus((Token) node);
        case LatexMathConstants.PLUS:
            return exitPlus((Token) node);
        case LatexMathConstants.EQUAL:
            return exitEqual((Token) node);
        case LatexMathConstants.BACKSLASH:
            return exitBackslash((Token) node);
        case LatexMathConstants.VERT_BAR:
            return exitVertBar((Token) node);
        case LatexMathConstants.COLON:
            return exitColon((Token) node);
        case LatexMathConstants.SEMICOLON:
            return exitSemicolon((Token) node);
        case LatexMathConstants.APOSTROPHE:
            return exitApostrophe((Token) node);
        case LatexMathConstants.QUOTATION:
            return exitQuotation((Token) node);
        case LatexMathConstants.COMMA:
            return exitComma((Token) node);
        case LatexMathConstants.DOT:
            return exitDot((Token) node);
        case LatexMathConstants.SLASH:
            return exitSlash((Token) node);
        case LatexMathConstants.QUESTION:
            return exitQuestion((Token) node);
        case LatexMathConstants.L_PARENTHESIS:
            return exitLParenthesis((Token) node);
        case LatexMathConstants.R_PARENTHESIS:
            return exitRParenthesis((Token) node);
        case LatexMathConstants.L_BRACKET:
            return exitLBracket((Token) node);
        case LatexMathConstants.R_BRACKET:
            return exitRBracket((Token) node);
        case LatexMathConstants.L_CURLY_BRACKET:
            return exitLCurlyBracket((Token) node);
        case LatexMathConstants.R_CURLY_BRACKET:
            return exitRCurlyBracket((Token) node);
        case LatexMathConstants.L_FLOOR:
            return exitLFloor((Token) node);
        case LatexMathConstants.R_FLOOR:
            return exitRFloor((Token) node);
        case LatexMathConstants.L_CEIL:
            return exitLCeil((Token) node);
        case LatexMathConstants.R_CEIL:
            return exitRCeil((Token) node);
        case LatexMathConstants.L_ANGLE:
            return exitLAngle((Token) node);
        case LatexMathConstants.R_ANGLE:
            return exitRAngle((Token) node);
        case LatexMathConstants.NEQUAL:
            return exitNequal((Token) node);
        case LatexMathConstants.NEQUAL2:
            return exitNequal2((Token) node);
        case LatexMathConstants.LT:
            return exitLt((Token) node);
        case LatexMathConstants.LET:
            return exitLet((Token) node);
        case LatexMathConstants.GT:
            return exitGt((Token) node);
        case LatexMathConstants.GET:
            return exitGet((Token) node);
        case LatexMathConstants.PREC:
            return exitPrec((Token) node);
        case LatexMathConstants.SUCC:
            return exitSucc((Token) node);
        case LatexMathConstants.PRECEQ:
            return exitPreceq((Token) node);
        case LatexMathConstants.SUCCEQ:
            return exitSucceq((Token) node);
        case LatexMathConstants.LL:
            return exitLl((Token) node);
        case LatexMathConstants.GG:
            return exitGg((Token) node);
        case LatexMathConstants.SUBSET:
            return exitSubset((Token) node);
        case LatexMathConstants.SUPSET:
            return exitSupset((Token) node);
        case LatexMathConstants.SUBSETEQ:
            return exitSubseteq((Token) node);
        case LatexMathConstants.SUPSETEQ:
            return exitSupseteq((Token) node);
        case LatexMathConstants.NSUBSETEQ:
            return exitNsubseteq((Token) node);
        case LatexMathConstants.NSUPSETEQ:
            return exitNsupseteq((Token) node);
        case LatexMathConstants.IN:
            return exitIn((Token) node);
        case LatexMathConstants.NI:
            return exitNi((Token) node);
        case LatexMathConstants.NOTIN:
            return exitNotin((Token) node);
        case LatexMathConstants.EQUIV:
            return exitEquiv((Token) node);
        case LatexMathConstants.SIM:
            return exitSim((Token) node);
        case LatexMathConstants.SIMEQ:
            return exitSimeq((Token) node);
        case LatexMathConstants.TO:
            return exitTo((Token) node);
        case LatexMathConstants.GETS:
            return exitGets((Token) node);
        case LatexMathConstants.BMOD:
            return exitBmod((Token) node);
        case LatexMathConstants.FORALL:
            return exitForall((Token) node);
        case LatexMathConstants.EXISTS:
            return exitExists((Token) node);
        case LatexMathConstants.NEXISTS:
            return exitNexists((Token) node);
        case LatexMathConstants.PM:
            return exitPm((Token) node);
        case LatexMathConstants.MP:
            return exitMp((Token) node);
        case LatexMathConstants.DIV:
            return exitDiv((Token) node);
        case LatexMathConstants.AST:
            return exitAst((Token) node);
        case LatexMathConstants.TIMES:
            return exitTimes((Token) node);
        case LatexMathConstants.LEFTARROW:
            return exitLeftarrow((Token) node);
        case LatexMathConstants.RIGHTARROW:
            return exitRightarrow((Token) node);
        case LatexMathConstants.LDOTS:
            return exitLdots((Token) node);
        case LatexMathConstants.INFTY:
            return exitInfty((Token) node);
        case LatexMathConstants.CDOTS:
            return exitCdots((Token) node);
        case LatexMathConstants.EMPTYSET:
            return exitEmptyset((Token) node);
        case LatexMathConstants.VARNOTHING:
            return exitVarnothing((Token) node);
        case LatexMathConstants.PARTIAL:
            return exitPartial((Token) node);
        case LatexMathConstants.FRAC:
            return exitFrac((Token) node);
        case LatexMathConstants.SQRT:
            return exitSqrt((Token) node);
        case LatexMathConstants.SUM:
            return exitSum((Token) node);
        case LatexMathConstants.INTEGRAL:
            return exitIntegral((Token) node);
        case LatexMathConstants.PROD:
            return exitProd((Token) node);
        case LatexMathConstants.OINTEGRAL:
            return exitOintegral((Token) node);
        case LatexMathConstants.MATHRM:
            return exitMathrm((Token) node);
        case LatexMathConstants.PRIME:
            return exitPrime((Token) node);
        case LatexMathConstants.RE:
            return exitRe((Token) node);
        case LatexMathConstants.IM:
            return exitIm((Token) node);
        case LatexMathConstants.ARCCOS:
            return exitArccos((Token) node);
        case LatexMathConstants.ARCSIN:
            return exitArcsin((Token) node);
        case LatexMathConstants.ARCTAN:
            return exitArctan((Token) node);
        case LatexMathConstants.ARCCOT:
            return exitArccot((Token) node);
        case LatexMathConstants.ARG:
            return exitArg((Token) node);
        case LatexMathConstants.COS:
            return exitCos((Token) node);
        case LatexMathConstants.COSH:
            return exitCosh((Token) node);
        case LatexMathConstants.COT:
            return exitCot((Token) node);
        case LatexMathConstants.COTH:
            return exitCoth((Token) node);
        case LatexMathConstants.CSC:
            return exitCsc((Token) node);
        case LatexMathConstants.EXP:
            return exitExp((Token) node);
        case LatexMathConstants.LG:
            return exitLg((Token) node);
        case LatexMathConstants.LIM:
            return exitLim((Token) node);
        case LatexMathConstants.LN:
            return exitLn((Token) node);
        case LatexMathConstants.LOG:
            return exitLog((Token) node);
        case LatexMathConstants.SEC:
            return exitSec((Token) node);
        case LatexMathConstants.SIN:
            return exitSin((Token) node);
        case LatexMathConstants.SINH:
            return exitSinh((Token) node);
        case LatexMathConstants.SUP:
            return exitSup((Token) node);
        case LatexMathConstants.TAN:
            return exitTan((Token) node);
        case LatexMathConstants.TANH:
            return exitTanh((Token) node);
        case LatexMathConstants.INF:
            return exitInf((Token) node);
        case LatexMathConstants.ALPHA:
            return exitAlpha((Token) node);
        case LatexMathConstants.BETA:
            return exitBeta((Token) node);
        case LatexMathConstants.GAMMA:
            return exitGamma((Token) node);
        case LatexMathConstants.DELTA:
            return exitDelta((Token) node);
        case LatexMathConstants.EPSILON:
            return exitEpsilon((Token) node);
        case LatexMathConstants.VAREPSILON:
            return exitVarepsilon((Token) node);
        case LatexMathConstants.ZETA:
            return exitZeta((Token) node);
        case LatexMathConstants.ETA:
            return exitEta((Token) node);
        case LatexMathConstants.THETA:
            return exitTheta((Token) node);
        case LatexMathConstants.VARTHETA:
            return exitVartheta((Token) node);
        case LatexMathConstants.KAPPA:
            return exitKappa((Token) node);
        case LatexMathConstants.LAMBDA:
            return exitLambda((Token) node);
        case LatexMathConstants.MU:
            return exitMu((Token) node);
        case LatexMathConstants.NU:
            return exitNu((Token) node);
        case LatexMathConstants.XI:
            return exitXi((Token) node);
        case LatexMathConstants.PI:
            return exitPi((Token) node);
        case LatexMathConstants.VARPI:
            return exitVarpi((Token) node);
        case LatexMathConstants.RHO:
            return exitRho((Token) node);
        case LatexMathConstants.VARRHO:
            return exitVarrho((Token) node);
        case LatexMathConstants.SIGMA:
            return exitSigma((Token) node);
        case LatexMathConstants.VARSIGMA:
            return exitVarsigma((Token) node);
        case LatexMathConstants.TAU:
            return exitTau((Token) node);
        case LatexMathConstants.UPSILON:
            return exitUpsilon((Token) node);
        case LatexMathConstants.PHI:
            return exitPhi((Token) node);
        case LatexMathConstants.VARPHI:
            return exitVarphi((Token) node);
        case LatexMathConstants.CHI:
            return exitChi((Token) node);
        case LatexMathConstants.PSI:
            return exitPsi((Token) node);
        case LatexMathConstants.OMEGA:
            return exitOmega((Token) node);
        case LatexMathConstants.BGAMMA:
            return exitBgamma((Token) node);
        case LatexMathConstants.BDELTA:
            return exitBdelta((Token) node);
        case LatexMathConstants.BTHETA:
            return exitBtheta((Token) node);
        case LatexMathConstants.BLAMBDA:
            return exitBlambda((Token) node);
        case LatexMathConstants.BXI:
            return exitBxi((Token) node);
        case LatexMathConstants.BPI:
            return exitBpi((Token) node);
        case LatexMathConstants.BSIGMA:
            return exitBsigma((Token) node);
        case LatexMathConstants.BUPSILON:
            return exitBupsilon((Token) node);
        case LatexMathConstants.BPHI:
            return exitBphi((Token) node);
        case LatexMathConstants.BPSI:
            return exitBpsi((Token) node);
        case LatexMathConstants.BOMEGA:
            return exitBomega((Token) node);
        case LatexMathConstants.DOCUMENTCLASS:
            return exitDocumentclass((Token) node);
        case LatexMathConstants.USEPACKAGE:
            return exitUsepackage((Token) node);
        case LatexMathConstants.BEGIN_ENV:
            return exitBeginEnv((Token) node);
        case LatexMathConstants.END_ENV:
            return exitEndEnv((Token) node);
        case LatexMathConstants.BEGIN_DOCUMENT:
            return exitBeginDocument((Token) node);
        case LatexMathConstants.END_DOCUMENT:
            return exitEndDocument((Token) node);
        case LatexMathConstants.DOC_OPT_FLEQN:
            return exitDocOptFleqn((Token) node);
        case LatexMathConstants.DOC_OPT_LEQNO:
            return exitDocOptLeqno((Token) node);
        case LatexMathConstants.DOC_OPT_DRAFT:
            return exitDocOptDraft((Token) node);
        case LatexMathConstants.DOC_OPT_LANDSCAPE:
            return exitDocOptLandscape((Token) node);
        case LatexMathConstants.DOC_OPT_FONT_10:
            return exitDocOptFont10((Token) node);
        case LatexMathConstants.DOC_OPT_FONT_11:
            return exitDocOptFont11((Token) node);
        case LatexMathConstants.DOC_OPT_FONT_12:
            return exitDocOptFont12((Token) node);
        case LatexMathConstants.DOC_OPT_PAPER_LETTER:
            return exitDocOptPaperLetter((Token) node);
        case LatexMathConstants.DOC_OPT_PAPER_A4:
            return exitDocOptPaperA4((Token) node);
        case LatexMathConstants.DOC_OPT_PAPER_A5:
            return exitDocOptPaperA5((Token) node);
        case LatexMathConstants.DOC_OPT_PAPER_B5:
            return exitDocOptPaperB5((Token) node);
        case LatexMathConstants.DOC_OPT_PAPER_EXECUTIVE:
            return exitDocOptPaperExecutive((Token) node);
        case LatexMathConstants.DOC_OPT_PAPER_LEGAL:
            return exitDocOptPaperLegal((Token) node);
        case LatexMathConstants.DOC_OPT_COLUMN_ONE:
            return exitDocOptColumnOne((Token) node);
        case LatexMathConstants.DOC_OPT_COLUMN_TWO:
            return exitDocOptColumnTwo((Token) node);
        case LatexMathConstants.DOC_OPT_PAGE_TITLE:
            return exitDocOptPageTitle((Token) node);
        case LatexMathConstants.DOC_OPT_PAGE_NOTITLE:
            return exitDocOptPageNotitle((Token) node);
        case LatexMathConstants.DOC_OPT_SIDE_ONE:
            return exitDocOptSideOne((Token) node);
        case LatexMathConstants.DOC_OPT_SIDE_TWO:
            return exitDocOptSideTwo((Token) node);
        case LatexMathConstants.DOC_OPT_OPEN_ANY:
            return exitDocOptOpenAny((Token) node);
        case LatexMathConstants.DOC_OPT_OPEN_RIGHT:
            return exitDocOptOpenRight((Token) node);
        case LatexMathConstants.DOC_CLASS_ARTICLE:
            return exitDocClassArticle((Token) node);
        case LatexMathConstants.DOC_CLASS_IEEE:
            return exitDocClassIeee((Token) node);
        case LatexMathConstants.DOC_CLASS_PROC:
            return exitDocClassProc((Token) node);
        case LatexMathConstants.DOC_CLASS_MINIMAL:
            return exitDocClassMinimal((Token) node);
        case LatexMathConstants.DOC_CLASS_REPORT:
            return exitDocClassReport((Token) node);
        case LatexMathConstants.DOC_CLASS_BOOK:
            return exitDocClassBook((Token) node);
        case LatexMathConstants.DOC_CLASS_SLIDES:
            return exitDocClassSlides((Token) node);
        case LatexMathConstants.DOC_CLASS_MEMOIR:
            return exitDocClassMemoir((Token) node);
        case LatexMathConstants.DOC_CLASS_LETTER:
            return exitDocClassLetter((Token) node);
        case LatexMathConstants.DOC_CLASS_BEAMER:
            return exitDocClassBeamer((Token) node);
        case LatexMathConstants.MATH_BEGIN:
            return exitMathBegin((Token) node);
        case LatexMathConstants.MATH_END:
            return exitMathEnd((Token) node);
        case LatexMathConstants.DISPLAYMATH_BEGIN:
            return exitDisplaymathBegin((Token) node);
        case LatexMathConstants.DISPLAYMATH_END:
            return exitDisplaymathEnd((Token) node);
        case LatexMathConstants.EQUATION_BEGIN:
            return exitEquationBegin((Token) node);
        case LatexMathConstants.EQUATION_END:
            return exitEquationEnd((Token) node);
        case LatexMathConstants.EQUATION_A_BEGIN:
            return exitEquationABegin((Token) node);
        case LatexMathConstants.S_LPARENTHESIS:
            return exitSLparenthesis((Token) node);
        case LatexMathConstants.S_RPARENTHESIS:
            return exitSRparenthesis((Token) node);
        case LatexMathConstants.S_LBRACKET:
            return exitSLbracket((Token) node);
        case LatexMathConstants.S_RBRACKET:
            return exitSRbracket((Token) node);
        case LatexMathConstants.DOCUMENT:
            return exitDocument((Production) node);
        case LatexMathConstants.PREAMBLE:
            return exitPreamble((Production) node);
        case LatexMathConstants.DOCUMENTCLASS_DECLARATION:
            return exitDocumentclassDeclaration((Production) node);
        case LatexMathConstants.DOCUMENT_CLASS_TYPE:
            return exitDocumentClassType((Production) node);
        case LatexMathConstants.CLASSNAME:
            return exitClassname((Production) node);
        case LatexMathConstants.DOCUMENT_OPTIONS:
            return exitDocumentOptions((Production) node);
        case LatexMathConstants.DOCUMENT_OPTION:
            return exitDocumentOption((Production) node);
        case LatexMathConstants.DOCUMENT_FONTSIZE:
            return exitDocumentFontsize((Production) node);
        case LatexMathConstants.DOCUMENT_PAPERSIZE:
            return exitDocumentPapersize((Production) node);
        case LatexMathConstants.DOCUMENT_COLUMNS:
            return exitDocumentColumns((Production) node);
        case LatexMathConstants.DOCUMENT_START_PAGE:
            return exitDocumentStartPage((Production) node);
        case LatexMathConstants.DOCUMENT_OUTPUT_SIDE:
            return exitDocumentOutputSide((Production) node);
        case LatexMathConstants.DOCUMENT_OPEN:
            return exitDocumentOpen((Production) node);
        case LatexMathConstants.PACKAGE_DECLARATION:
            return exitPackageDeclaration((Production) node);
        case LatexMathConstants.PACKAGE_OPTIONS:
            return exitPackageOptions((Production) node);
        case LatexMathConstants.PACKAGE_NAME:
            return exitPackageName((Production) node);
        case LatexMathConstants.PACKAGE_PARAMETER:
            return exitPackageParameter((Production) node);
        case LatexMathConstants.WORD:
            return exitWord((Production) node);
        case LatexMathConstants.NUMBER:
            return exitNumber((Production) node);
        case LatexMathConstants.SPECIAL_CHAR:
            return exitSpecialChar((Production) node);
        case LatexMathConstants.WORD_NUMERIC:
            return exitWordNumeric((Production) node);
        case LatexMathConstants.NUMERIC:
            return exitNumeric((Production) node);
        case LatexMathConstants.NAME:
            return exitName((Production) node);
        case LatexMathConstants.TEXT:
            return exitText((Production) node);
        case LatexMathConstants.COMMAND:
            return exitCommand((Production) node);
        case LatexMathConstants.COMMAND_PARAMETERS:
            return exitCommandParameters((Production) node);
        case LatexMathConstants.COMMAND_OPTIONAL_PARAMETER:
            return exitCommandOptionalParameter((Production) node);
        case LatexMathConstants.COMMAND_REQUIRED_PARAMETER:
            return exitCommandRequiredParameter((Production) node);
        case LatexMathConstants.COMMAND_CONTENT:
            return exitCommandContent((Production) node);
        case LatexMathConstants.SPECIAL_COMMAND:
            return exitSpecialCommand((Production) node);
        case LatexMathConstants.ENVIRONMENT:
            return exitEnvironment((Production) node);
        case LatexMathConstants.ENVIRONMENT_OPTIONAL_PARAMETER:
            return exitEnvironmentOptionalParameter((Production) node);
        case LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER:
            return exitEnvironmentRequiredParameter((Production) node);
        case LatexMathConstants.BODY:
            return exitBody((Production) node);
        case LatexMathConstants.CONTENT:
            return exitContent((Production) node);
        case LatexMathConstants.ALLOWED_TOKENS:
            return exitAllowedTokens((Production) node);
        case LatexMathConstants.MATH:
            return exitMath((Production) node);
        case LatexMathConstants.MATH_INLINE:
            return exitMathInline((Production) node);
        case LatexMathConstants.MATH_DISPLAY:
            return exitMathDisplay((Production) node);
        case LatexMathConstants.STATEMENT:
            return exitStatement((Production) node);
        case LatexMathConstants.RELATION:
            return exitRelation((Production) node);
        case LatexMathConstants.EXPRESSION:
            return exitExpression((Production) node);
        case LatexMathConstants.PLUS_OR_MINUS:
            return exitPlusOrMinus((Production) node);
        case LatexMathConstants.COMPONENT:
            return exitComponent((Production) node);
        case LatexMathConstants.FACTOR_EXT:
            return exitFactorExt((Production) node);
        case LatexMathConstants.BINARY_OPERATOR:
            return exitBinaryOperator((Production) node);
        case LatexMathConstants.UNARY_OPERATOR:
            return exitUnaryOperator((Production) node);
        case LatexMathConstants.UNARY_OPERATOR_LEFT:
            return exitUnaryOperatorLeft((Production) node);
        case LatexMathConstants.FACTOR:
            return exitFactor((Production) node);
        case LatexMathConstants.SPECIAL_SYMBOL:
            return exitSpecialSymbol((Production) node);
        case LatexMathConstants.GREEK:
            return exitGreek((Production) node);
        case LatexMathConstants.FUNCTION:
            return exitFunction((Production) node);
        case LatexMathConstants.LOGLIKE_SYMBOL:
            return exitLoglikeSymbol((Production) node);
        case LatexMathConstants.OPERATOR_IDENT:
            return exitOperatorIdent((Production) node);
        case LatexMathConstants.CONSTRUCTION:
            return exitConstruction((Production) node);
        case LatexMathConstants.PARAMETER:
            return exitParameter((Production) node);
        case LatexMathConstants.SUBSCRIPT:
            return exitSubscript((Production) node);
        case LatexMathConstants.SUPERSCRIPT:
            return exitSuperscript((Production) node);
        }
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void child(Production node, Node child)
        throws ParseException {

        switch (node.getId()) {
        case LatexMathConstants.DOCUMENT:
            childDocument(node, child);
            break;
        case LatexMathConstants.PREAMBLE:
            childPreamble(node, child);
            break;
        case LatexMathConstants.DOCUMENTCLASS_DECLARATION:
            childDocumentclassDeclaration(node, child);
            break;
        case LatexMathConstants.DOCUMENT_CLASS_TYPE:
            childDocumentClassType(node, child);
            break;
        case LatexMathConstants.CLASSNAME:
            childClassname(node, child);
            break;
        case LatexMathConstants.DOCUMENT_OPTIONS:
            childDocumentOptions(node, child);
            break;
        case LatexMathConstants.DOCUMENT_OPTION:
            childDocumentOption(node, child);
            break;
        case LatexMathConstants.DOCUMENT_FONTSIZE:
            childDocumentFontsize(node, child);
            break;
        case LatexMathConstants.DOCUMENT_PAPERSIZE:
            childDocumentPapersize(node, child);
            break;
        case LatexMathConstants.DOCUMENT_COLUMNS:
            childDocumentColumns(node, child);
            break;
        case LatexMathConstants.DOCUMENT_START_PAGE:
            childDocumentStartPage(node, child);
            break;
        case LatexMathConstants.DOCUMENT_OUTPUT_SIDE:
            childDocumentOutputSide(node, child);
            break;
        case LatexMathConstants.DOCUMENT_OPEN:
            childDocumentOpen(node, child);
            break;
        case LatexMathConstants.PACKAGE_DECLARATION:
            childPackageDeclaration(node, child);
            break;
        case LatexMathConstants.PACKAGE_OPTIONS:
            childPackageOptions(node, child);
            break;
        case LatexMathConstants.PACKAGE_NAME:
            childPackageName(node, child);
            break;
        case LatexMathConstants.PACKAGE_PARAMETER:
            childPackageParameter(node, child);
            break;
        case LatexMathConstants.WORD:
            childWord(node, child);
            break;
        case LatexMathConstants.NUMBER:
            childNumber(node, child);
            break;
        case LatexMathConstants.SPECIAL_CHAR:
            childSpecialChar(node, child);
            break;
        case LatexMathConstants.WORD_NUMERIC:
            childWordNumeric(node, child);
            break;
        case LatexMathConstants.NUMERIC:
            childNumeric(node, child);
            break;
        case LatexMathConstants.NAME:
            childName(node, child);
            break;
        case LatexMathConstants.TEXT:
            childText(node, child);
            break;
        case LatexMathConstants.COMMAND:
            childCommand(node, child);
            break;
        case LatexMathConstants.COMMAND_PARAMETERS:
            childCommandParameters(node, child);
            break;
        case LatexMathConstants.COMMAND_OPTIONAL_PARAMETER:
            childCommandOptionalParameter(node, child);
            break;
        case LatexMathConstants.COMMAND_REQUIRED_PARAMETER:
            childCommandRequiredParameter(node, child);
            break;
        case LatexMathConstants.COMMAND_CONTENT:
            childCommandContent(node, child);
            break;
        case LatexMathConstants.SPECIAL_COMMAND:
            childSpecialCommand(node, child);
            break;
        case LatexMathConstants.ENVIRONMENT:
            childEnvironment(node, child);
            break;
        case LatexMathConstants.ENVIRONMENT_OPTIONAL_PARAMETER:
            childEnvironmentOptionalParameter(node, child);
            break;
        case LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER:
            childEnvironmentRequiredParameter(node, child);
            break;
        case LatexMathConstants.BODY:
            childBody(node, child);
            break;
        case LatexMathConstants.CONTENT:
            childContent(node, child);
            break;
        case LatexMathConstants.ALLOWED_TOKENS:
            childAllowedTokens(node, child);
            break;
        case LatexMathConstants.MATH:
            childMath(node, child);
            break;
        case LatexMathConstants.MATH_INLINE:
            childMathInline(node, child);
            break;
        case LatexMathConstants.MATH_DISPLAY:
            childMathDisplay(node, child);
            break;
        case LatexMathConstants.STATEMENT:
            childStatement(node, child);
            break;
        case LatexMathConstants.RELATION:
            childRelation(node, child);
            break;
        case LatexMathConstants.EXPRESSION:
            childExpression(node, child);
            break;
        case LatexMathConstants.PLUS_OR_MINUS:
            childPlusOrMinus(node, child);
            break;
        case LatexMathConstants.COMPONENT:
            childComponent(node, child);
            break;
        case LatexMathConstants.FACTOR_EXT:
            childFactorExt(node, child);
            break;
        case LatexMathConstants.BINARY_OPERATOR:
            childBinaryOperator(node, child);
            break;
        case LatexMathConstants.UNARY_OPERATOR:
            childUnaryOperator(node, child);
            break;
        case LatexMathConstants.UNARY_OPERATOR_LEFT:
            childUnaryOperatorLeft(node, child);
            break;
        case LatexMathConstants.FACTOR:
            childFactor(node, child);
            break;
        case LatexMathConstants.SPECIAL_SYMBOL:
            childSpecialSymbol(node, child);
            break;
        case LatexMathConstants.GREEK:
            childGreek(node, child);
            break;
        case LatexMathConstants.FUNCTION:
            childFunction(node, child);
            break;
        case LatexMathConstants.LOGLIKE_SYMBOL:
            childLoglikeSymbol(node, child);
            break;
        case LatexMathConstants.OPERATOR_IDENT:
            childOperatorIdent(node, child);
            break;
        case LatexMathConstants.CONSTRUCTION:
            childConstruction(node, child);
            break;
        case LatexMathConstants.PARAMETER:
            childParameter(node, child);
            break;
        case LatexMathConstants.SUBSCRIPT:
            childSubscript(node, child);
            break;
        case LatexMathConstants.SUPERSCRIPT:
            childSuperscript(node, child);
            break;
        }
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterIdent(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitIdent(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDigit(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDigit(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSDollar(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSDollar(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSPercent(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSPercent(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSUnderscore(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSUnderscore(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSLbrace(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSLbrace(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSRbrace(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSRbrace(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSAmpersand(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSAmpersand(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSHash(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSHash(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSBackslash(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSBackslash(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSBackslashA(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSBackslashA(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTilde(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTilde(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBacktick(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBacktick(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterExclamation(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitExclamation(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterAt(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitAt(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterHash(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitHash(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDollar(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDollar(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPercent(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPercent(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCaret(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCaret(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterAmpersand(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitAmpersand(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterAsterisk(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitAsterisk(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterUnderscore(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitUnderscore(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMinus(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMinus(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPlus(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPlus(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEqual(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEqual(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBackslash(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBackslash(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVertBar(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVertBar(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterColon(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitColon(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSemicolon(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSemicolon(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterApostrophe(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitApostrophe(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterQuotation(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitQuotation(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterComma(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitComma(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDot(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDot(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSlash(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSlash(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterQuestion(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitQuestion(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLParenthesis(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLParenthesis(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRParenthesis(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRParenthesis(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLBracket(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLBracket(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRBracket(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRBracket(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLCurlyBracket(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLCurlyBracket(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRCurlyBracket(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRCurlyBracket(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLFloor(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLFloor(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRFloor(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRFloor(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLCeil(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLCeil(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRCeil(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRCeil(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLAngle(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLAngle(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRAngle(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRAngle(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNequal(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNequal(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNequal2(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNequal2(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLt(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLt(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLet(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLet(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterGt(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitGt(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterGet(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitGet(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPrec(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPrec(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSucc(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSucc(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPreceq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPreceq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSucceq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSucceq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLl(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLl(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterGg(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitGg(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSubset(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSubset(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSupset(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSupset(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSubseteq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSubseteq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSupseteq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSupseteq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNsubseteq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNsubseteq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNsupseteq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNsupseteq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterIn(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitIn(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNotin(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNotin(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEquiv(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEquiv(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSim(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSim(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSimeq(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSimeq(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTo(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTo(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterGets(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitGets(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBmod(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBmod(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterForall(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitForall(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterExists(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitExists(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNexists(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNexists(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPm(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPm(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMp(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMp(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDiv(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDiv(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterAst(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitAst(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTimes(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTimes(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLeftarrow(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLeftarrow(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRightarrow(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRightarrow(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLdots(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLdots(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterInfty(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitInfty(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCdots(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCdots(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEmptyset(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEmptyset(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVarnothing(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVarnothing(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPartial(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPartial(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterFrac(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitFrac(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSqrt(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSqrt(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSum(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSum(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterIntegral(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitIntegral(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterProd(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitProd(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterOintegral(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitOintegral(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMathrm(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMathrm(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPrime(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPrime(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRe(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRe(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterIm(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitIm(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterArccos(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitArccos(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterArcsin(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitArcsin(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterArctan(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitArctan(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterArccot(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitArccot(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterArg(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitArg(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCos(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCos(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCosh(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCosh(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCot(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCot(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCoth(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCoth(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCsc(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCsc(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterExp(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitExp(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLg(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLg(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLim(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLim(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLn(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLn(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLog(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLog(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSec(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSec(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSin(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSin(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSinh(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSinh(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSup(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSup(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTan(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTan(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTanh(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTanh(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterInf(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitInf(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterAlpha(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitAlpha(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBeta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBeta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterGamma(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitGamma(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDelta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDelta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEpsilon(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEpsilon(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVarepsilon(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVarepsilon(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterZeta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitZeta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTheta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTheta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVartheta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVartheta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterKappa(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitKappa(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLambda(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLambda(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMu(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMu(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNu(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNu(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterXi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitXi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVarpi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVarpi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRho(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRho(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVarrho(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVarrho(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSigma(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSigma(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVarsigma(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVarsigma(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterTau(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitTau(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterUpsilon(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitUpsilon(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPhi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPhi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterVarphi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitVarphi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterChi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitChi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPsi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPsi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterOmega(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitOmega(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBgamma(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBgamma(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBdelta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBdelta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBtheta(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBtheta(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBlambda(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBlambda(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBxi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBxi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBpi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBpi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBsigma(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBsigma(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBupsilon(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBupsilon(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBphi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBphi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBpsi(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBpsi(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBomega(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBomega(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentclass(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentclass(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterUsepackage(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitUsepackage(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBeginEnv(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBeginEnv(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEndEnv(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEndEnv(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBeginDocument(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBeginDocument(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEndDocument(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEndDocument(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptFleqn(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptFleqn(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptLeqno(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptLeqno(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptDraft(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptDraft(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptLandscape(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptLandscape(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptFont10(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptFont10(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptFont11(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptFont11(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptFont12(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptFont12(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPaperLetter(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPaperLetter(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPaperA4(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPaperA4(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPaperA5(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPaperA5(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPaperB5(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPaperB5(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPaperExecutive(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPaperExecutive(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPaperLegal(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPaperLegal(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptColumnOne(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptColumnOne(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptColumnTwo(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptColumnTwo(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPageTitle(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPageTitle(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptPageNotitle(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptPageNotitle(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptSideOne(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptSideOne(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptSideTwo(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptSideTwo(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptOpenAny(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptOpenAny(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocOptOpenRight(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocOptOpenRight(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassArticle(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassArticle(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassIeee(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassIeee(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassProc(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassProc(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassMinimal(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassMinimal(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassReport(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassReport(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassBook(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassBook(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassSlides(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassSlides(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassMemoir(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassMemoir(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassLetter(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassLetter(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocClassBeamer(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocClassBeamer(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMathBegin(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMathBegin(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMathEnd(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMathEnd(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDisplaymathBegin(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDisplaymathBegin(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDisplaymathEnd(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDisplaymathEnd(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEquationBegin(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEquationBegin(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEquationEnd(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEquationEnd(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEquationABegin(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEquationABegin(Token node)
        throws ParseException {

        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSLparenthesis(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSLparenthesis(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSRparenthesis(Token node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSRparenthesis(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSLbracket(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSLbracket(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSRbracket(Token node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSRbracket(Token node) throws ParseException {
        return node;
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocument(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocument(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocument(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPreamble(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPreamble(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childPreamble(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentclassDeclaration(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentclassDeclaration(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentclassDeclaration(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentClassType(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentClassType(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentClassType(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterClassname(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitClassname(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childClassname(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentOptions(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentOptions(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentOptions(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentOption(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentOption(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentOption(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentFontsize(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentFontsize(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentFontsize(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentPapersize(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentPapersize(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentPapersize(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentColumns(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentColumns(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentColumns(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentStartPage(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentStartPage(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentStartPage(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentOutputSide(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentOutputSide(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentOutputSide(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterDocumentOpen(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitDocumentOpen(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childDocumentOpen(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPackageDeclaration(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPackageDeclaration(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childPackageDeclaration(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPackageOptions(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPackageOptions(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childPackageOptions(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPackageName(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPackageName(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childPackageName(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPackageParameter(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPackageParameter(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childPackageParameter(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterWord(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitWord(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childWord(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNumber(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNumber(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childNumber(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSpecialChar(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSpecialChar(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childSpecialChar(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterWordNumeric(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitWordNumeric(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childWordNumeric(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterNumeric(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitNumeric(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childNumeric(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterName(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitName(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childName(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterText(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitText(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childText(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCommand(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCommand(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childCommand(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCommandParameters(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCommandParameters(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childCommandParameters(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCommandOptionalParameter(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCommandOptionalParameter(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childCommandOptionalParameter(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCommandRequiredParameter(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCommandRequiredParameter(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childCommandRequiredParameter(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterCommandContent(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitCommandContent(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childCommandContent(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSpecialCommand(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSpecialCommand(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childSpecialCommand(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEnvironment(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEnvironment(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childEnvironment(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEnvironmentOptionalParameter(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEnvironmentOptionalParameter(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childEnvironmentOptionalParameter(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterEnvironmentRequiredParameter(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitEnvironmentRequiredParameter(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childEnvironmentRequiredParameter(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBody(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBody(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childBody(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterContent(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitContent(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childContent(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterAllowedTokens(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitAllowedTokens(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childAllowedTokens(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMath(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMath(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childMath(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMathInline(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMathInline(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childMathInline(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterMathDisplay(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitMathDisplay(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childMathDisplay(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterStatement(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitStatement(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childStatement(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterRelation(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitRelation(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childRelation(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterExpression(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitExpression(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childExpression(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterPlusOrMinus(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitPlusOrMinus(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childPlusOrMinus(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterComponent(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitComponent(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childComponent(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterFactorExt(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitFactorExt(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childFactorExt(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterBinaryOperator(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitBinaryOperator(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childBinaryOperator(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterUnaryOperator(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitUnaryOperator(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childUnaryOperator(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterUnaryOperatorLeft(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitUnaryOperatorLeft(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childUnaryOperatorLeft(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterFactor(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitFactor(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childFactor(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSpecialSymbol(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSpecialSymbol(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childSpecialSymbol(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterGreek(Production node) throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitGreek(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childGreek(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterFunction(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitFunction(Production node) throws ParseException {
        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childFunction(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterLoglikeSymbol(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitLoglikeSymbol(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childLoglikeSymbol(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterOperatorIdent(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitOperatorIdent(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childOperatorIdent(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterConstruction(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitConstruction(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childConstruction(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterParameter(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitParameter(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childParameter(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSubscript(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSubscript(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childSubscript(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }

    /**
     * Called when entering a parse tree node.
     *
     * @param node           the node being entered
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void enterSuperscript(Production node)
        throws ParseException {
    }

    /**
     * Called when exiting a parse tree node.
     *
     * @param node           the node being exited
     *
     * @return the node to add to the parse tree, or
     *         null if no parse tree should be created
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected Node exitSuperscript(Production node)
        throws ParseException {

        return node;
    }

    /**
     * Called when adding a child to a parse tree node.
     *
     * @param node           the parent node
     * @param child          the child node, or null
     *
     * @throws ParseException if the node analysis discovered errors
     */
    protected void childSuperscript(Production node, Node child)
        throws ParseException {

        node.addChild(child);
    }
}

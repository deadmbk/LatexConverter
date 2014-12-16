/*
 * LatexMathTokenizer.java
 *
 * THIS FILE HAS BEEN GENERATED AUTOMATICALLY. DO NOT EDIT!
 */

package app;

import java.io.Reader;

import net.percederberg.grammatica.parser.ParserCreationException;
import net.percederberg.grammatica.parser.TokenPattern;
import net.percederberg.grammatica.parser.Tokenizer;

/**
 * A character stream tokenizer.
 *
 * @author   Maciej
 * @version  1.0
 */
class LatexMathTokenizer extends Tokenizer {

    /**
     * Creates a new tokenizer for the specified input stream.
     *
     * @param input          the input stream to read
     *
     * @throws ParserCreationException if the tokenizer couldn't be
     *             initialized correctly
     */
    public LatexMathTokenizer(Reader input)
        throws ParserCreationException {

        super(input, false);
        createPatterns();
    }

    /**
     * Initializes the tokenizer by creating all the token patterns.
     *
     * @throws ParserCreationException if the tokenizer couldn't be
     *             initialized correctly
     */
    private void createPatterns() throws ParserCreationException {
        TokenPattern  pattern;

        pattern = new TokenPattern(LatexMathConstants.IDENT,
                                   "IDENT",
                                   TokenPattern.REGEXP_TYPE,
                                   "[a-zA-Z]");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DIGIT,
                                   "DIGIT",
                                   TokenPattern.REGEXP_TYPE,
                                   "[0-9]");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.WHITESPACE,
                                   "WHITESPACE",
                                   TokenPattern.REGEXP_TYPE,
                                   "[ \\t\\n\\r]+");
        pattern.setIgnore();
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LINE_COMMENT,
                                   "LINE_COMMENT",
                                   TokenPattern.REGEXP_TYPE,
                                   "%.*\\n");
        pattern.setIgnore();
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_DOLLAR,
                                   "S_DOLLAR",
                                   TokenPattern.STRING_TYPE,
                                   "\\$");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_PERCENT,
                                   "S_PERCENT",
                                   TokenPattern.STRING_TYPE,
                                   "\\%");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_UNDERSCORE,
                                   "S_UNDERSCORE",
                                   TokenPattern.STRING_TYPE,
                                   "\\_");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_LBRACE,
                                   "S_LBRACE",
                                   TokenPattern.STRING_TYPE,
                                   "\\{");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_RBRACE,
                                   "S_RBRACE",
                                   TokenPattern.STRING_TYPE,
                                   "\\}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_AMPERSAND,
                                   "S_AMPERSAND",
                                   TokenPattern.STRING_TYPE,
                                   "\\&");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_HASH,
                                   "S_HASH",
                                   TokenPattern.STRING_TYPE,
                                   "\\#");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_BACKSLASH,
                                   "S_BACKSLASH",
                                   TokenPattern.STRING_TYPE,
                                   "\\\\");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_BACKSLASH_A,
                                   "S_BACKSLASH_A",
                                   TokenPattern.STRING_TYPE,
                                   "\\\\*");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.TILDE,
                                   "TILDE",
                                   TokenPattern.STRING_TYPE,
                                   "~");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BACKTICK,
                                   "BACKTICK",
                                   TokenPattern.STRING_TYPE,
                                   "`");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EXCLAMATION,
                                   "EXCLAMATION",
                                   TokenPattern.STRING_TYPE,
                                   "!");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.AT,
                                   "AT",
                                   TokenPattern.STRING_TYPE,
                                   "@");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.HASH,
                                   "HASH",
                                   TokenPattern.STRING_TYPE,
                                   "#");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DOLLAR,
                                   "DOLLAR",
                                   TokenPattern.STRING_TYPE,
                                   "$");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PERCENT,
                                   "PERCENT",
                                   TokenPattern.STRING_TYPE,
                                   "%");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.CARET,
                                   "CARET",
                                   TokenPattern.STRING_TYPE,
                                   "^");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.AMPERSAND,
                                   "AMPERSAND",
                                   TokenPattern.STRING_TYPE,
                                   "&");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ASTERISK,
                                   "ASTERISK",
                                   TokenPattern.STRING_TYPE,
                                   "*");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.UNDERSCORE,
                                   "UNDERSCORE",
                                   TokenPattern.STRING_TYPE,
                                   "_");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.MINUS,
                                   "MINUS",
                                   TokenPattern.STRING_TYPE,
                                   "-");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PLUS,
                                   "PLUS",
                                   TokenPattern.STRING_TYPE,
                                   "+");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EQUAL,
                                   "EQUAL",
                                   TokenPattern.STRING_TYPE,
                                   "=");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BACKSLASH,
                                   "BACKSLASH",
                                   TokenPattern.STRING_TYPE,
                                   "\\");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VERT_BAR,
                                   "VERT_BAR",
                                   TokenPattern.STRING_TYPE,
                                   "|");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.COLON,
                                   "COLON",
                                   TokenPattern.STRING_TYPE,
                                   ":");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SEMICOLON,
                                   "SEMICOLON",
                                   TokenPattern.STRING_TYPE,
                                   ";");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.APOSTROPHE,
                                   "APOSTROPHE",
                                   TokenPattern.STRING_TYPE,
                                   "'");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.QUOTATION,
                                   "QUOTATION",
                                   TokenPattern.REGEXP_TYPE,
                                   "\"");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.COMMA,
                                   "COMMA",
                                   TokenPattern.STRING_TYPE,
                                   ",");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DOT,
                                   "DOT",
                                   TokenPattern.STRING_TYPE,
                                   ".");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SLASH,
                                   "SLASH",
                                   TokenPattern.STRING_TYPE,
                                   "/");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.QUESTION,
                                   "QUESTION",
                                   TokenPattern.STRING_TYPE,
                                   "?");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.L_PARENTHESIS,
                                   "L_PARENTHESIS",
                                   TokenPattern.STRING_TYPE,
                                   "(");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.R_PARENTHESIS,
                                   "R_PARENTHESIS",
                                   TokenPattern.STRING_TYPE,
                                   ")");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.L_BRACKET,
                                   "L_BRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "[");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.R_BRACKET,
                                   "R_BRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "]");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.L_CURLY_BRACKET,
                                   "L_CURLY_BRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "{");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.R_CURLY_BRACKET,
                                   "R_CURLY_BRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.L_FLOOR,
                                   "L_FLOOR",
                                   TokenPattern.STRING_TYPE,
                                   "\\lfloor");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.R_FLOOR,
                                   "R_FLOOR",
                                   TokenPattern.STRING_TYPE,
                                   "\\rfloor");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.L_CEIL,
                                   "L_CEIL",
                                   TokenPattern.STRING_TYPE,
                                   "\\lceil");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.R_CEIL,
                                   "R_CEIL",
                                   TokenPattern.STRING_TYPE,
                                   "\\rceil");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.L_ANGLE,
                                   "L_ANGLE",
                                   TokenPattern.STRING_TYPE,
                                   "\\langle");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.R_ANGLE,
                                   "R_ANGLE",
                                   TokenPattern.STRING_TYPE,
                                   "\\rangle");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NEQUAL,
                                   "NEQUAL",
                                   TokenPattern.STRING_TYPE,
                                   "!=");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NEQUAL2,
                                   "NEQUAL2",
                                   TokenPattern.STRING_TYPE,
                                   "\\neq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LT,
                                   "LT",
                                   TokenPattern.STRING_TYPE,
                                   "<");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LET,
                                   "LET",
                                   TokenPattern.STRING_TYPE,
                                   "\\leq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.GT,
                                   "GT",
                                   TokenPattern.STRING_TYPE,
                                   ">");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.GET,
                                   "GET",
                                   TokenPattern.STRING_TYPE,
                                   "\\geq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PREC,
                                   "PREC",
                                   TokenPattern.STRING_TYPE,
                                   "\\prec");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUCC,
                                   "SUCC",
                                   TokenPattern.STRING_TYPE,
                                   "\\succ");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PRECEQ,
                                   "PRECEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\preceq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUCCEQ,
                                   "SUCCEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\succeq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LL,
                                   "LL",
                                   TokenPattern.STRING_TYPE,
                                   "\\ll");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.GG,
                                   "GG",
                                   TokenPattern.STRING_TYPE,
                                   "\\gg");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUBSET,
                                   "SUBSET",
                                   TokenPattern.STRING_TYPE,
                                   "\\subset");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUPSET,
                                   "SUPSET",
                                   TokenPattern.STRING_TYPE,
                                   "\\supset");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUBSETEQ,
                                   "SUBSETEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\subseteq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUPSETEQ,
                                   "SUPSETEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\supseteq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NSUBSETEQ,
                                   "NSUBSETEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\nsubseteq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NSUPSETEQ,
                                   "NSUPSETEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\nsupseteq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.IN,
                                   "IN",
                                   TokenPattern.STRING_TYPE,
                                   "\\in");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NI,
                                   "NI",
                                   TokenPattern.STRING_TYPE,
                                   "\\ni");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NOTIN,
                                   "NOTIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\notin");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EQUIV,
                                   "EQUIV",
                                   TokenPattern.STRING_TYPE,
                                   "\\equiv");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SIM,
                                   "SIM",
                                   TokenPattern.STRING_TYPE,
                                   "\\sim");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SIMEQ,
                                   "SIMEQ",
                                   TokenPattern.STRING_TYPE,
                                   "\\simeq");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.APPROX,
                                   "APPROX",
                                   TokenPattern.STRING_TYPE,
                                   "\\approx");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.FORALL,
                                   "FORALL",
                                   TokenPattern.STRING_TYPE,
                                   "\\forall");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EXISTS,
                                   "EXISTS",
                                   TokenPattern.STRING_TYPE,
                                   "\\exists");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NEXISTS,
                                   "NEXISTS",
                                   TokenPattern.STRING_TYPE,
                                   "\\nexists");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.TO,
                                   "TO",
                                   TokenPattern.STRING_TYPE,
                                   "\\to");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.GETS,
                                   "GETS",
                                   TokenPattern.STRING_TYPE,
                                   "\\gets");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BMOD,
                                   "BMOD",
                                   TokenPattern.STRING_TYPE,
                                   "\\bmod");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PM,
                                   "PM",
                                   TokenPattern.STRING_TYPE,
                                   "\\pm");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.MP,
                                   "MP",
                                   TokenPattern.STRING_TYPE,
                                   "\\mp");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DIV,
                                   "DIV",
                                   TokenPattern.STRING_TYPE,
                                   "\\div");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.AST,
                                   "AST",
                                   TokenPattern.STRING_TYPE,
                                   "\\ast");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.TIMES,
                                   "TIMES",
                                   TokenPattern.STRING_TYPE,
                                   "\\times");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LEFTARROW,
                                   "LEFTARROW",
                                   TokenPattern.STRING_TYPE,
                                   "\\leftarrow");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.RIGHTARROW,
                                   "RIGHTARROW",
                                   TokenPattern.STRING_TYPE,
                                   "\\rightarrow");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.CDOT,
                                   "CDOT",
                                   TokenPattern.STRING_TYPE,
                                   "\\cdot");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PRIME,
                                   "PRIME",
                                   TokenPattern.STRING_TYPE,
                                   "\\prime");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LDOTS,
                                   "LDOTS",
                                   TokenPattern.STRING_TYPE,
                                   "\\ldots");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.INFTY,
                                   "INFTY",
                                   TokenPattern.STRING_TYPE,
                                   "\\infty");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.CDOTS,
                                   "CDOTS",
                                   TokenPattern.STRING_TYPE,
                                   "\\cdots");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EMPTYSET,
                                   "EMPTYSET",
                                   TokenPattern.STRING_TYPE,
                                   "\\emptyset");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VARNOTHING,
                                   "VARNOTHING",
                                   TokenPattern.STRING_TYPE,
                                   "\\varnothing");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.FRAC,
                                   "FRAC",
                                   TokenPattern.STRING_TYPE,
                                   "\\frac");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SQRT,
                                   "SQRT",
                                   TokenPattern.STRING_TYPE,
                                   "\\sqrt");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUM,
                                   "SUM",
                                   TokenPattern.STRING_TYPE,
                                   "\\sum");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.INTEGRAL,
                                   "INTEGRAL",
                                   TokenPattern.STRING_TYPE,
                                   "\\int");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PROD,
                                   "PROD",
                                   TokenPattern.STRING_TYPE,
                                   "\\prod");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.OINTEGRAL,
                                   "OINTEGRAL",
                                   TokenPattern.STRING_TYPE,
                                   "\\oint");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PARTIAL,
                                   "PARTIAL",
                                   TokenPattern.STRING_TYPE,
                                   "\\partial");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.MATHRM,
                                   "MATHRM",
                                   TokenPattern.STRING_TYPE,
                                   "\\mathrm");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.RE,
                                   "RE",
                                   TokenPattern.STRING_TYPE,
                                   "\\Re");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.IM,
                                   "IM",
                                   TokenPattern.STRING_TYPE,
                                   "\\Im");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ARCCOS,
                                   "ARCCOS",
                                   TokenPattern.STRING_TYPE,
                                   "\\arccos");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ARCSIN,
                                   "ARCSIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\arcsin");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ARCTAN,
                                   "ARCTAN",
                                   TokenPattern.STRING_TYPE,
                                   "\\arctan");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ARCCOT,
                                   "ARCCOT",
                                   TokenPattern.STRING_TYPE,
                                   "\\arccot");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ARG,
                                   "ARG",
                                   TokenPattern.STRING_TYPE,
                                   "\\arg");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.COS,
                                   "COS",
                                   TokenPattern.STRING_TYPE,
                                   "\\cos");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.COSH,
                                   "COSH",
                                   TokenPattern.STRING_TYPE,
                                   "\\cosh");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.COT,
                                   "COT",
                                   TokenPattern.STRING_TYPE,
                                   "\\cot");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.COTH,
                                   "COTH",
                                   TokenPattern.STRING_TYPE,
                                   "\\coth");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.CSC,
                                   "CSC",
                                   TokenPattern.STRING_TYPE,
                                   "\\csc");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EXP,
                                   "EXP",
                                   TokenPattern.STRING_TYPE,
                                   "\\exp");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LG,
                                   "LG",
                                   TokenPattern.STRING_TYPE,
                                   "\\lg");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LIM,
                                   "LIM",
                                   TokenPattern.STRING_TYPE,
                                   "\\lim");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LN,
                                   "LN",
                                   TokenPattern.STRING_TYPE,
                                   "\\ln");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LOG,
                                   "LOG",
                                   TokenPattern.STRING_TYPE,
                                   "\\log");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SEC,
                                   "SEC",
                                   TokenPattern.STRING_TYPE,
                                   "\\sec");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SIN,
                                   "SIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\sin");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SINH,
                                   "SINH",
                                   TokenPattern.STRING_TYPE,
                                   "\\sinh");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SUP,
                                   "SUP",
                                   TokenPattern.STRING_TYPE,
                                   "\\sup");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.TAN,
                                   "TAN",
                                   TokenPattern.STRING_TYPE,
                                   "\\tan");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.TANH,
                                   "TANH",
                                   TokenPattern.STRING_TYPE,
                                   "\\tanh");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.INF,
                                   "INF",
                                   TokenPattern.STRING_TYPE,
                                   "\\inf");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ALPHA,
                                   "ALPHA",
                                   TokenPattern.STRING_TYPE,
                                   "\\alpha");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BETA,
                                   "BETA",
                                   TokenPattern.STRING_TYPE,
                                   "\\beta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.GAMMA,
                                   "GAMMA",
                                   TokenPattern.STRING_TYPE,
                                   "\\gamma");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DELTA,
                                   "DELTA",
                                   TokenPattern.STRING_TYPE,
                                   "\\delta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EPSILON,
                                   "EPSILON",
                                   TokenPattern.STRING_TYPE,
                                   "\\epsilon");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VAREPSILON,
                                   "VAREPSILON",
                                   TokenPattern.STRING_TYPE,
                                   "\\varepsilon");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ZETA,
                                   "ZETA",
                                   TokenPattern.STRING_TYPE,
                                   "\\zeta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.ETA,
                                   "ETA",
                                   TokenPattern.STRING_TYPE,
                                   "\\eta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.THETA,
                                   "THETA",
                                   TokenPattern.STRING_TYPE,
                                   "\\theta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VARTHETA,
                                   "VARTHETA",
                                   TokenPattern.STRING_TYPE,
                                   "\\vartheta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.KAPPA,
                                   "KAPPA",
                                   TokenPattern.STRING_TYPE,
                                   "\\kappa");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.LAMBDA,
                                   "LAMBDA",
                                   TokenPattern.STRING_TYPE,
                                   "\\lambda");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.MU,
                                   "MU",
                                   TokenPattern.STRING_TYPE,
                                   "\\mu");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.NU,
                                   "NU",
                                   TokenPattern.STRING_TYPE,
                                   "\\nu");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.XI,
                                   "XI",
                                   TokenPattern.STRING_TYPE,
                                   "\\xi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PI,
                                   "PI",
                                   TokenPattern.STRING_TYPE,
                                   "\\pi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VARPI,
                                   "VARPI",
                                   TokenPattern.STRING_TYPE,
                                   "\\varpi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.RHO,
                                   "RHO",
                                   TokenPattern.STRING_TYPE,
                                   "\\rho");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VARRHO,
                                   "VARRHO",
                                   TokenPattern.STRING_TYPE,
                                   "\\varrho");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.SIGMA,
                                   "SIGMA",
                                   TokenPattern.STRING_TYPE,
                                   "\\sigma");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VARSIGMA,
                                   "VARSIGMA",
                                   TokenPattern.STRING_TYPE,
                                   "\\varsigma");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.TAU,
                                   "TAU",
                                   TokenPattern.STRING_TYPE,
                                   "\\tau");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.UPSILON,
                                   "UPSILON",
                                   TokenPattern.STRING_TYPE,
                                   "\\upsilon");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PHI,
                                   "PHI",
                                   TokenPattern.STRING_TYPE,
                                   "\\phi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.VARPHI,
                                   "VARPHI",
                                   TokenPattern.STRING_TYPE,
                                   "\\varphi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.CHI,
                                   "CHI",
                                   TokenPattern.STRING_TYPE,
                                   "\\chi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.PSI,
                                   "PSI",
                                   TokenPattern.STRING_TYPE,
                                   "\\psi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.OMEGA,
                                   "OMEGA",
                                   TokenPattern.STRING_TYPE,
                                   "\\omega");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BGAMMA,
                                   "BGAMMA",
                                   TokenPattern.STRING_TYPE,
                                   "\\Gamma");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BDELTA,
                                   "BDELTA",
                                   TokenPattern.STRING_TYPE,
                                   "\\Delta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BTHETA,
                                   "BTHETA",
                                   TokenPattern.STRING_TYPE,
                                   "\\Theta");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BLAMBDA,
                                   "BLAMBDA",
                                   TokenPattern.STRING_TYPE,
                                   "\\Lambda");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BXI,
                                   "BXI",
                                   TokenPattern.STRING_TYPE,
                                   "\\Xi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BPI,
                                   "BPI",
                                   TokenPattern.STRING_TYPE,
                                   "\\Pi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BSIGMA,
                                   "BSIGMA",
                                   TokenPattern.STRING_TYPE,
                                   "\\Sigma");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BUPSILON,
                                   "BUPSILON",
                                   TokenPattern.STRING_TYPE,
                                   "\\Upsilon");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BPHI,
                                   "BPHI",
                                   TokenPattern.STRING_TYPE,
                                   "\\Phi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BPSI,
                                   "BPSI",
                                   TokenPattern.STRING_TYPE,
                                   "\\Psi");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BOMEGA,
                                   "BOMEGA",
                                   TokenPattern.STRING_TYPE,
                                   "\\Omega");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DOCUMENTCLASS,
                                   "DOCUMENTCLASS",
                                   TokenPattern.STRING_TYPE,
                                   "\\documentclass");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.USEPACKAGE,
                                   "USEPACKAGE",
                                   TokenPattern.STRING_TYPE,
                                   "\\usepackage");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BEGIN_ENV,
                                   "BEGIN_ENV",
                                   TokenPattern.STRING_TYPE,
                                   "\\begin");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.END_ENV,
                                   "END_ENV",
                                   TokenPattern.STRING_TYPE,
                                   "\\end");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.BEGIN_DOCUMENT,
                                   "BEGIN_DOCUMENT",
                                   TokenPattern.STRING_TYPE,
                                   "\\begin{document}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.END_DOCUMENT,
                                   "END_DOCUMENT",
                                   TokenPattern.STRING_TYPE,
                                   "\\end{document}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.MATH_BEGIN,
                                   "MATH_BEGIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\begin{math}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.MATH_END,
                                   "MATH_END",
                                   TokenPattern.STRING_TYPE,
                                   "\\end{math}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DISPLAYMATH_BEGIN,
                                   "DISPLAYMATH_BEGIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\begin{displaymath}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.DISPLAYMATH_END,
                                   "DISPLAYMATH_END",
                                   TokenPattern.STRING_TYPE,
                                   "\\end{displaymath}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EQUATION_BEGIN,
                                   "EQUATION_BEGIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\begin{equation}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EQUATION_END,
                                   "EQUATION_END",
                                   TokenPattern.STRING_TYPE,
                                   "\\end{equation}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.EQUATION_A_BEGIN,
                                   "EQUATION_A_BEGIN",
                                   TokenPattern.STRING_TYPE,
                                   "\\begin{equation*}");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_LPARENTHESIS,
                                   "S_LPARENTHESIS",
                                   TokenPattern.STRING_TYPE,
                                   "\\(");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_RPARENTHESIS,
                                   "S_RPARENTHESIS",
                                   TokenPattern.STRING_TYPE,
                                   "\\)");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_LBRACKET,
                                   "S_LBRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "\\[");
        addPattern(pattern);

        pattern = new TokenPattern(LatexMathConstants.S_RBRACKET,
                                   "S_RBRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "\\]");
        addPattern(pattern);
    }
}

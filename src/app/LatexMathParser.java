/*
 * LatexMathParser.java
 *
 * THIS FILE HAS BEEN GENERATED AUTOMATICALLY. DO NOT EDIT!
 */

package app;

import java.io.Reader;

import net.percederberg.grammatica.parser.ParserCreationException;
import net.percederberg.grammatica.parser.ProductionPattern;
import net.percederberg.grammatica.parser.ProductionPatternAlternative;
import net.percederberg.grammatica.parser.RecursiveDescentParser;
import net.percederberg.grammatica.parser.Tokenizer;

/**
 * A token stream parser.
 *
 * @author   Maciej
 * @version  1.0
 */
class LatexMathParser extends RecursiveDescentParser {

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_1 = 3001;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_2 = 3002;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_3 = 3003;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_4 = 3004;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_5 = 3005;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_6 = 3006;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_7 = 3007;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_8 = 3008;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_9 = 3009;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_10 = 3010;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_11 = 3011;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_12 = 3012;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_13 = 3013;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_14 = 3014;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_15 = 3015;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_16 = 3016;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_17 = 3017;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_18 = 3018;

    /**
     * A generated production node identity constant.
     */
    private static final int SUBPRODUCTION_19 = 3019;

    /**
     * Creates a new parser with a default analyzer.
     *
     * @param in             the input stream to read from
     *
     * @throws ParserCreationException if the parser couldn't be
     *             initialized correctly
     */
    public LatexMathParser(Reader in) throws ParserCreationException {
        super(in);
        createPatterns();
    }

    /**
     * Creates a new parser.
     *
     * @param in             the input stream to read from
     * @param analyzer       the analyzer to use while parsing
     *
     * @throws ParserCreationException if the parser couldn't be
     *             initialized correctly
     */
    public LatexMathParser(Reader in, LatexMathAnalyzer analyzer)
        throws ParserCreationException {

        super(in, analyzer);
        createPatterns();
    }

    /**
     * Creates a new tokenizer for this parser. Can be overridden by a
     * subclass to provide a custom implementation.
     *
     * @param in             the input stream to read from
     *
     * @return the tokenizer created
     *
     * @throws ParserCreationException if the tokenizer couldn't be
     *             initialized correctly
     */
    protected Tokenizer newTokenizer(Reader in)
        throws ParserCreationException {

        return new LatexMathTokenizer(in);
    }

    /**
     * Initializes the parser by creating all the production patterns.
     *
     * @throws ParserCreationException if the parser couldn't be
     *             initialized correctly
     */
    private void createPatterns() throws ParserCreationException {
        ProductionPattern             pattern;
        ProductionPatternAlternative  alt;

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT,
                                        "Document");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.PREAMBLE, 1, 1);
        alt.addProduction(LatexMathConstants.BODY, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PREAMBLE,
                                        "Preamble");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENTCLASS_DECLARATION, 1, 1);
        alt.addProduction(LatexMathConstants.PACKAGE_DECLARATION, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENTCLASS_DECLARATION,
                                        "DocumentclassDeclaration");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOCUMENTCLASS, 1, 1);
        alt.addProduction(LatexMathConstants.DOCUMENT_OPTIONS, 0, 1);
        alt.addProduction(LatexMathConstants.DOCUMENT_CLASS_TYPE, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_CLASS_TYPE,
                                        "DocumentClassType");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CURLY_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.CLASSNAME, 1, 1);
        alt.addToken(LatexMathConstants.R_CURLY_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.CLASSNAME,
                                        "Classname");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_ARTICLE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_IEEE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_PROC, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_MINIMAL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_REPORT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_BOOK, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_SLIDES, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_MEMOIR, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_LETTER, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_CLASS_BEAMER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_OPTIONS,
                                        "DocumentOptions");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.DOCUMENT_OPTION, 1, 1);
        alt.addProduction(SUBPRODUCTION_1, 0, -1);
        alt.addToken(LatexMathConstants.R_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_OPTION,
                                        "DocumentOption");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_FONTSIZE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_PAPERSIZE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_FLEQN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_LEQNO, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_DRAFT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_COLUMNS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_START_PAGE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_OUTPUT_SIDE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_LANDSCAPE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_OPEN, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_FONTSIZE,
                                        "DocumentFontsize");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_FONT_10, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_FONT_11, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_FONT_12, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_PAPERSIZE,
                                        "DocumentPapersize");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAPER_LETTER, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAPER_A4, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAPER_A5, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAPER_B5, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAPER_EXECUTIVE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAPER_LEGAL, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_COLUMNS,
                                        "DocumentColumns");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_COLUMN_ONE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_COLUMN_TWO, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_START_PAGE,
                                        "DocumentStartPage");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAGE_TITLE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_PAGE_NOTITLE, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_OUTPUT_SIDE,
                                        "DocumentOutputSide");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_SIDE_ONE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_SIDE_TWO, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.DOCUMENT_OPEN,
                                        "DocumentOpen");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_OPEN_ANY, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOC_OPT_OPEN_RIGHT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PACKAGE_DECLARATION,
                                        "PackageDeclaration");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.USEPACKAGE, 1, 1);
        alt.addProduction(LatexMathConstants.PACKAGE_OPTIONS, 0, 1);
        alt.addProduction(LatexMathConstants.PACKAGE_NAME, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PACKAGE_OPTIONS,
                                        "PackageOptions");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.PACKAGE_PARAMETER, 1, 1);
        alt.addProduction(SUBPRODUCTION_2, 0, -1);
        alt.addToken(LatexMathConstants.R_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PACKAGE_NAME,
                                        "PackageName");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CURLY_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.WORD, 1, 1);
        alt.addProduction(SUBPRODUCTION_3, 0, -1);
        alt.addToken(LatexMathConstants.R_CURLY_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PACKAGE_PARAMETER,
                                        "PackageParameter");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.WORD, 1, 1);
        alt.addProduction(SUBPRODUCTION_4, 0, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.WORD,
                                        "Word");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        alt.addProduction(SUBPRODUCTION_5, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.NUMBER,
                                        "Number");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DIGIT, 1, -1);
        alt.addProduction(SUBPRODUCTION_6, 0, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.SPECIAL_CHAR,
                                        "SpecialChar");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.TILDE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BACKTICK, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EXCLAMATION, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.AT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.CARET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ASTERISK, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.MINUS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PLUS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EQUAL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VERT_BAR, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COLON, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.AMPERSAND, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SEMICOLON, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.APOSTROPHE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.QUOTATION, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COMMA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.QUESTION, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_PARENTHESIS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.R_PARENTHESIS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.GT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.WORD_NUMERIC,
                                        "WordNumeric");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.WORD, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.NUMERIC, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.NUMERIC,
                                        "Numeric");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.NUMBER, 1, 1);
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.NAME,
                                        "Name");
        alt = new ProductionPatternAlternative();
        alt.addProduction(SUBPRODUCTION_7, 1, 1);
        alt.addProduction(SUBPRODUCTION_8, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.TEXT,
                                        "Text");
        alt = new ProductionPatternAlternative();
        alt.addProduction(SUBPRODUCTION_9, 1, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.COMMAND,
                                        "Command");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BACKSLASH, 1, 1);
        alt.addProduction(LatexMathConstants.NAME, 1, 1);
        alt.addProduction(LatexMathConstants.COMMAND_PARAMETERS, 0, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.COMMAND_PARAMETERS,
                                        "CommandParameters");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.COMMAND_OPTIONAL_PARAMETER, 0, -1);
        alt.addProduction(LatexMathConstants.COMMAND_REQUIRED_PARAMETER, 1, 1);
        alt.addProduction(SUBPRODUCTION_10, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.COMMAND_OPTIONAL_PARAMETER,
                                        "CommandOptionalParameter");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.NAME, 1, 1);
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.COMMAND_REQUIRED_PARAMETER,
                                        "CommandRequiredParameter");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CURLY_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.COMMAND_CONTENT, 0, -1);
        alt.addToken(LatexMathConstants.R_CURLY_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.COMMAND_CONTENT,
                                        "CommandContent");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.TEXT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.COMMAND, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.ALLOWED_TOKENS, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.SPECIAL_COMMAND,
                                        "SpecialCommand");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_DOLLAR, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_PERCENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_UNDERSCORE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_LBRACE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_RBRACE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_AMPERSAND, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_HASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_BACKSLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_BACKSLASH_A, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.ENVIRONMENT,
                                        "Environment");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BEGIN_ENV, 1, 1);
        alt.addProduction(LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER, 1, 1);
        alt.addProduction(LatexMathConstants.ENVIRONMENT_OPTIONAL_PARAMETER, 0, 1);
        alt.addProduction(LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER, 0, -1);
        alt.addProduction(LatexMathConstants.CONTENT, 1, -1);
        alt.addToken(LatexMathConstants.END_ENV, 1, 1);
        alt.addProduction(LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.ENVIRONMENT_OPTIONAL_PARAMETER,
                                        "EnvironmentOptionalParameter");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.NAME, 1, 1);
        alt.addToken(LatexMathConstants.R_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.ENVIRONMENT_REQUIRED_PARAMETER,
                                        "EnvironmentRequiredParameter");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CURLY_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.NAME, 1, 1);
        alt.addToken(LatexMathConstants.R_CURLY_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.BODY,
                                        "Body");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BEGIN_DOCUMENT, 1, 1);
        alt.addProduction(LatexMathConstants.CONTENT, 0, -1);
        alt.addToken(LatexMathConstants.END_DOCUMENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.CONTENT,
                                        "Content");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.COMMAND, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.ENVIRONMENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.TEXT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.ALLOWED_TOKENS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.MATH, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.ALLOWED_TOKENS,
                                        "AllowedTokens");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.SPECIAL_COMMAND, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.CLASSNAME, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.DOCUMENT_OPTION, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.GREEK, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.MATH,
                                        "Math");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.MATH_INLINE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.MATH_DISPLAY, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(SUBPRODUCTION_11, 1, 1);
        alt.addProduction(SUBPRODUCTION_12, 0, -1);
        alt.addToken(LatexMathConstants.EQUATION_END, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.MATH_INLINE,
                                        "MathInline");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.MATH_BEGIN, 1, 1);
        alt.addProduction(LatexMathConstants.STATEMENT, 0, -1);
        alt.addToken(LatexMathConstants.MATH_END, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_LPARENTHESIS, 1, 1);
        alt.addProduction(LatexMathConstants.STATEMENT, 0, -1);
        alt.addToken(LatexMathConstants.S_RPARENTHESIS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOLLAR, 1, 1);
        alt.addProduction(LatexMathConstants.STATEMENT, 0, -1);
        alt.addToken(LatexMathConstants.DOLLAR, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.MATH_DISPLAY,
                                        "MathDisplay");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DISPLAYMATH_BEGIN, 1, 1);
        alt.addProduction(SUBPRODUCTION_13, 0, -1);
        alt.addToken(LatexMathConstants.DISPLAYMATH_END, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_LBRACKET, 1, 1);
        alt.addProduction(SUBPRODUCTION_14, 0, -1);
        alt.addToken(LatexMathConstants.S_RBRACKET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOLLAR, 1, 1);
        alt.addToken(LatexMathConstants.DOLLAR, 1, 1);
        alt.addProduction(SUBPRODUCTION_15, 0, -1);
        alt.addToken(LatexMathConstants.DOLLAR, 1, 1);
        alt.addToken(LatexMathConstants.DOLLAR, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.STATEMENT,
                                        "Statement");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addProduction(SUBPRODUCTION_16, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.RELATION,
                                        "Relation");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EQUAL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NEQUAL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NEQUAL2, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.GT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.GET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PREC, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUCC, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PRECEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUCCEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.GG, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUBSET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUPSET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUBSETEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUPSETEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EQUIV, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SIM, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SIMEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NOTIN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NSUPSETEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NSUBSETEQ, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COLON, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.EXPRESSION,
                                        "Expression");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.PLUS_OR_MINUS, 0, 1);
        alt.addProduction(LatexMathConstants.COMPONENT, 1, 1);
        alt.addProduction(SUBPRODUCTION_17, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PLUS_OR_MINUS,
                                        "PlusOrMinus");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PLUS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.MINUS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PM, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.MP, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.COMPONENT,
                                        "Component");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.UNARY_OPERATOR_LEFT, 0, 1);
        alt.addProduction(LatexMathConstants.FACTOR_EXT, 1, 1);
        alt.addProduction(LatexMathConstants.UNARY_OPERATOR, 0, 1);
        alt.addProduction(SUBPRODUCTION_18, 0, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.FACTOR_EXT,
                                        "FactorExt");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.CONSTRUCTIONS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.FACTOR, 1, 1);
        alt.addProduction(LatexMathConstants.SUBSCRIPT, 0, 1);
        alt.addProduction(LatexMathConstants.SUPERSCRIPT, 0, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.BINARY_OPERATOR,
                                        "BinaryOperator");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ASTERISK, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.TO, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.GETS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BMOD, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.TIMES, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.AST, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DIV, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LEFTARROW, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.RIGHTARROW, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COMMA, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.UNARY_OPERATOR,
                                        "UnaryOperator");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EXCLAMATION, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.APOSTROPHE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PRIME, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.UNARY_OPERATOR_LEFT,
                                        "UnaryOperatorLeft");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.FORALL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EXISTS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NEXISTS, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.FACTOR,
                                        "Factor");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.NUMBER, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_PARENTHESIS, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_PARENTHESIS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CEIL, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_CEIL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_FLOOR, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_FLOOR, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_ANGLE, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_ANGLE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_LBRACE, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.S_RBRACE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CURLY_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_CURLY_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.SPECIAL_SYMBOLS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.GREEK, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.FUNCTIONS, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.SPECIAL_SYMBOLS,
                                        "SpecialSymbols");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LDOTS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.CDOTS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.INFTY, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EMPTYSET, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VARNOTHING, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.GREEK,
                                        "Greek");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ALPHA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BETA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.GAMMA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DELTA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EPSILON, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VAREPSILON, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ZETA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ETA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.THETA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VARTHETA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.KAPPA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LAMBDA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.MU, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.NU, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.XI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VARPI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.RHO, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VARRHO, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SIGMA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VARSIGMA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.TAU, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.UPSILON, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PHI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.VARPHI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.CHI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PSI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.OMEGA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BGAMMA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BDELTA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BTHETA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BLAMBDA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BXI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BPI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BSIGMA, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BUPSILON, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BPHI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BPSI, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.BOMEGA, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.LOGLIKE_SYMBOLS,
                                        "LoglikeSymbols");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ARCCOS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ARCSIN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ARCTAN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ARCCOT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COSH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COTH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.CSC, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LG, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LOG, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SEC, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SIN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SINH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.TAN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.TANH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.ARG, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EXP, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.LIM, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUP, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.CONSTRUCTIONS,
                                        "Constructions");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.FRAC, 1, 1);
        alt.addProduction(LatexMathConstants.PARAMETER, 1, 1);
        alt.addProduction(LatexMathConstants.PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SQRT, 1, 1);
        alt.addProduction(SUBPRODUCTION_19, 0, 1);
        alt.addProduction(LatexMathConstants.PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.FUNCTIONS,
                                        "Functions");
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.LOGLIKE_SYMBOLS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.RE, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IM, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.INTEGRAL, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.SUM, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.PROD, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.OINTEGRAL, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.PARAMETER,
                                        "Parameter");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DIGIT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.SPECIAL_SYMBOLS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.FUNCTIONS, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.GREEK, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_CURLY_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.STATEMENT, 0, -1);
        alt.addToken(LatexMathConstants.R_CURLY_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.SUBSCRIPT,
                                        "Subscript");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.UNDERSCORE, 1, 1);
        alt.addProduction(LatexMathConstants.PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(LatexMathConstants.SUPERSCRIPT,
                                        "Superscript");
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.CARET, 1, 1);
        alt.addProduction(LatexMathConstants.PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_1,
                                        "Subproduction1");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COMMA, 1, 1);
        alt.addProduction(LatexMathConstants.DOCUMENT_OPTION, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_2,
                                        "Subproduction2");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COMMA, 1, 1);
        alt.addProduction(LatexMathConstants.PACKAGE_PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_3,
                                        "Subproduction3");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.COMMA, 1, 1);
        alt.addProduction(LatexMathConstants.WORD, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_4,
                                        "Subproduction4");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EQUAL, 1, 1);
        alt.addProduction(LatexMathConstants.WORD_NUMERIC, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_5,
                                        "Subproduction5");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DIGIT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_6,
                                        "Subproduction6");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DOT, 1, 1);
        alt.addToken(LatexMathConstants.DIGIT, 1, -1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_7,
                                        "Subproduction7");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.SPECIAL_CHAR, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_8,
                                        "Subproduction8");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.IDENT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.DIGIT, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.SPECIAL_CHAR, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_9,
                                        "Subproduction9");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.WORD, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.NUMBER, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.SPECIAL_CHAR, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_10,
                                        "Subproduction10");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.COMMAND_REQUIRED_PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.COMMAND_OPTIONAL_PARAMETER, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_11,
                                        "Subproduction11");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EQUATION_A_BEGIN, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.EQUATION_BEGIN, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_12,
                                        "Subproduction12");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_BACKSLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.STATEMENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_13,
                                        "Subproduction13");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_BACKSLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.STATEMENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_14,
                                        "Subproduction14");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_BACKSLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.STATEMENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_15,
                                        "Subproduction15");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.S_BACKSLASH, 1, 1);
        pattern.addAlternative(alt);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.STATEMENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_16,
                                        "Subproduction16");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.RELATION, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_17,
                                        "Subproduction17");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.PLUS_OR_MINUS, 1, 1);
        alt.addProduction(LatexMathConstants.COMPONENT, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_18,
                                        "Subproduction18");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addProduction(LatexMathConstants.BINARY_OPERATOR, 0, 1);
        alt.addProduction(LatexMathConstants.UNARY_OPERATOR_LEFT, 0, 1);
        alt.addProduction(LatexMathConstants.FACTOR_EXT, 1, 1);
        alt.addProduction(LatexMathConstants.UNARY_OPERATOR, 0, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);

        pattern = new ProductionPattern(SUBPRODUCTION_19,
                                        "Subproduction19");
        pattern.setSynthetic(true);
        alt = new ProductionPatternAlternative();
        alt.addToken(LatexMathConstants.L_BRACKET, 1, 1);
        alt.addProduction(LatexMathConstants.EXPRESSION, 1, 1);
        alt.addToken(LatexMathConstants.R_BRACKET, 1, 1);
        pattern.addAlternative(alt);
        addPattern(pattern);
    }
}

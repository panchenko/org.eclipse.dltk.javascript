// $ANTLR 3.0.1 JS.g 2010-09-28 20:52:27

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "AT", "DOTDOT", "COLONCOLON", "XMLFragment", "XMLFragmentEnd", "XMLFragmentError", "CALL_ARGUMENTS", "ARGUMENTS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "FOREACH", "GETTER", "SETTER", "DEFAULT_XML_NAMESPACE", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XmlAttribute", "XML_LITERAL", "EMPTY_STATEMENT", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminatorChar", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int PACKAGE=58;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=156;
    public static final int RegularExpressionChar=193;
    public static final int LOCALNAME=130;
    public static final int XMLFragmentEnd=121;
    public static final int MOD=89;
    public static final int SHL=92;
    public static final int CONST=43;
    public static final int DO=13;
    public static final int DQUOTE=153;
    public static final int LineTerminatorChar=166;
    public static final int NOT=98;
    public static final int EOF=-1;
    public static final int CEXPR=132;
    public static final int DIVASS=116;
    public static final int BYINDEX=128;
    public static final int INC=90;
    public static final int RPAREN=72;
    public static final int FINAL=49;
    public static final int FORSTEP=135;
    public static final int IMPORT=53;
    public static final int EOL=168;
    public static final int OctalDigit=179;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int GET=33;
    public static final int WhiteSpace=161;
    public static final int EXPORT=47;
    public static final int EQ=82;
    public static final int GOTO=51;
    public static final int XORASS=114;
    public static final int SHU=94;
    public static final int RBRACK=74;
    public static final int RBRACE=70;
    public static final int STATIC=63;
    public static final int INV=99;
    public static final int ELSE=14;
    public static final int NATIVE=57;
    public static final int INT=54;
    public static final int DEFAULT_XML_NAMESPACE=139;
    public static final int FF=157;
    public static final int OctalEscapeSequence=187;
    public static final int RegularExpressionFirstChar=192;
    public static final int TYPEOF=28;
    public static final int GT=79;
    public static final int CALL=131;
    public static final int CharacterEscapeSequence=185;
    public static final int LAND=100;
    public static final int PINC=147;
    public static final int PROTECTED=60;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int SUB=87;
    public static final int RegularExpressionLiteral=178;
    public static final int FLOAT=50;
    public static final int DecimalIntegerLiteral=181;
    public static final int HexDigit=172;
    public static final int LPAREN=71;
    public static final int AT=117;
    public static final int IMPLEMENTS=52;
    public static final int YIELD=35;
    public static final int SHRASS=110;
    public static final int PS=165;
    public static final int MultiLineComment=169;
    public static final int ADD=86;
    public static final int ZeroToThree=186;
    public static final int ITEM=140;
    public static final int UnicodeEscapeSequence=189;
    public static final int SHUASS=111;
    public static final int SHORT=62;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=154;
    public static final int SAME=84;
    public static final int COLON=103;
    public static final int StringLiteral=171;
    public static final int XMLFragment=120;
    public static final int PAREXPR=145;
    public static final int ENUM=46;
    public static final int CALL_ARGUMENTS=123;
    public static final int NBSP=159;
    public static final int HexIntegerLiteral=184;
    public static final int SP=158;
    public static final int BLOCK=126;
    public static final int LineTerminator=167;
    public static final int INTERFACE=55;
    public static final int DIV=115;
    public static final int LONG=56;
    public static final int CR=163;
    public static final int PUBLIC=61;
    public static final int LOR=101;
    public static final int LT=78;
    public static final int WHILE=31;
    public static final int BackslashSequence=191;
    public static final int LS=164;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=41;
    public static final int DecimalDigit=174;
    public static final int BYFIELD=127;
    public static final int BREAK=7;
    public static final int Identifier=177;
    public static final int WXML=36;
    public static final int POS=148;
    public static final int DOUBLE=45;
    public static final int ExponentPart=180;
    public static final int VAR=29;
    public static final int VOID=30;
    public static final int SUPER=64;
    public static final int EACH=17;
    public static final int LABELLED=141;
    public static final int ADDASS=105;
    public static final int ARRAY=125;
    public static final int ARGUMENTS=124;
    public static final int PRIVATE=59;
    public static final int SWITCH=24;
    public static final int NULL=4;
    public static final int THROWS=66;
    public static final int DELETE=12;
    public static final int MUL=88;
    public static final int IdentifierStartASCII=173;
    public static final int TRY=27;
    public static final int NAMESPACE=37;
    public static final int SHLASS=109;
    public static final int COLONCOLON=119;
    public static final int USP=160;
    public static final int ANDASS=112;
    public static final int EMPTY_STATEMENT=151;
    public static final int IdentifierNameASCIIStart=176;
    public static final int QUE=102;
    public static final int OR=96;
    public static final int SETTER=138;
    public static final int DEBUGGER=44;
    public static final int FOREACH=136;
    public static final int PDEC=146;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=190;
    public static final int THROW=26;
    public static final int MULASS=107;
    public static final int XmlAttribute=149;
    public static final int DEC=91;
    public static final int OctalIntegerLiteral=183;
    public static final int CLASS=42;
    public static final int HexEscapeSequence=188;
    public static final int ORASS=113;
    public static final int NAMEDVALUE=142;
    public static final int SingleLineComment=170;
    public static final int GTE=81;
    public static final int XMLFragmentError=122;
    public static final int FOR=16;
    public static final int DOTDOT=118;
    public static final int ABSTRACT=38;
    public static final int AND=95;
    public static final int LTE=80;
    public static final int IF=19;
    public static final int SUBASS=106;
    public static final int SYNCHRONIZED=65;
    public static final int BOOLEAN=39;
    public static final int EXPR=133;
    public static final int IN=20;
    public static final int CONTINUE=10;
    public static final int OBJECT=144;
    public static final int COMMA=77;
    public static final int TRANSIENT=67;
    public static final int FORITER=134;
    public static final int MODASS=108;
    public static final int DOT=75;
    public static final int IdentifierPart=175;
    public static final int WITH=32;
    public static final int BYTE=40;
    public static final int XOR=97;
    public static final int VOLATILE=68;
    public static final int GETTER=137;
    public static final int NSAME=85;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=129;
    public static final int TAB=155;
    public static final int DecimalLiteral=182;
    public static final int TRUE=5;
    public static final int NEQ=83;
    public static final int FINALLY=15;
    public static final int NEG=143;
    public static final int ASSIGN=104;
    public static final int XML_LITERAL=150;
    public static final int SEMIC=76;
    public static final int EXTENDS=48;
    public static final int BSLASH=152;
    public static final int LF=162;

        public JSParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "JS.g"; }


    private boolean typeInformationEnabled;

    public final boolean isTypeInformationEnabled() {
    	return typeInformationEnabled;
    }

    public void setTypeInformationEnabled(boolean value) {
    	this.typeInformationEnabled = value;
    }

    protected void reportFailure(Throwable t) {
    }

    protected void reportRuleError(RecognitionException re) {
    	reportError(re);
    	recover(input,re);
    }

    private final Stack<JSParserState> states = new Stack<JSParserState>();

    protected void pushState(JSParserRule rule) {
    	states.push(new JSParserState(peekState(), rule));
    }

    protected void popState() {
    	states.pop();
    }

    public JSParserState peekState() {
    	return states.isEmpty() ? null : states.peek();
    }

    protected void syncToSet() {
    }

    protected void typeRefExpected() {
    	throw new UnsupportedOperationException("override typeRefExpected()");
    }

    private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result;
    	if (isLeftHandSideExpression(lhs))
    	{
    		switch (input.LA(1))
    		{
    			case ASSIGN:
    			case MULASS:
    			case DIVASS:
    			case MODASS:
    			case ADDASS:
    			case SUBASS:
    			case SHLASS:
    			case SHRASS:
    			case SHUASS:
    			case ANDASS:
    			case XORASS:
    			case ORASS:
    				result = true;
    				break;
    			default:
    				result = false;
    				break;
    		}
    	}
    	else
    	{
    		result = false;
    	}
    	
    	cached[0] = Boolean.valueOf(result);
    	return result;
    }

    private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
    {
    	if (lhs.getTree() == null) // e.g. during backtracking
    	{
    		return true;
    	}
    	else
    	{
      		if (JSLexer.isIdentifierKeyword(((Tree)lhs.getTree()).getType())) {
    			return true;
    		}
    		switch (((Tree)lhs.getTree()).getType())
    		{
    		// primaryExpression
    			case THIS:
    			case Identifier:
    			case XmlAttribute:
    			case NULL:
    			case TRUE:
    			case FALSE:
    			case DecimalLiteral:
    			case OctalIntegerLiteral:
    			case HexIntegerLiteral:
    			case StringLiteral:
    			case RegularExpressionLiteral:
    			case XMLFragment:
    			case XMLFragmentEnd:
    			case ARRAY:
    			case OBJECT:
    			case PAREXPR:
    		// functionExpression
    			case FUNCTION:
    		// newExpression
    			case NEW:
    		// leftHandSideExpression
    			case CALL:
    			case BYFIELD:
    			case BYINDEX:
    				return true;
    			
    			default:
    				return false;
    		}
    	}
    }
    	
    private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final void promoteEOL(ParserRuleReturnScope rule)
    {
    	// Get current token and its type (the possibly offending token).
    	Token lt = input.LT(1);
    	int la = lt.getType();
    	
    	// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
    	// EOL and MultiLineComment are not offending as they're already promoted in a previous call to this method.
    	// Promoting an EOL means switching it from off channel to on channel.
    	// A MultiLineComment gets promoted when it contains an EOL.
    	if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment))
    	{
    		// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
    		for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
    		{
    			lt = input.get(ix);
    			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
    			{
    				// On channel token found: stop scanning.
    				break;
    			}
    			else if (lt.getType() == EOL || (lt.getType() == MultiLineComment && lt.getText().matches("/.*\r\n|\r|\n")))
    			{
    				// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
    				lt.setChannel(Token.DEFAULT_CHANNEL);
    				input.seek(lt.getTokenIndex());
    				if (rule != null)
    				{
    					rule.start = lt;
    				}
    				break;
    			}
    		}
    	}
    }	


    public static class token_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start token
    // JS.g:627:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute );
    public final token_return token() throws RecognitionException {
        token_return retval = new token_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLFragment3=null;
        Token XMLFragmentEnd4=null;
        Token StringLiteral7=null;
        reservedWord_return reservedWord1 = null;

        identifier_return identifier2 = null;

        punctuator_return punctuator5 = null;

        numericLiteral_return numericLiteral6 = null;

        xmlAttribute_return xmlAttribute8 = null;


        Object XMLFragment3_tree=null;
        Object XMLFragmentEnd4_tree=null;
        Object StringLiteral7_tree=null;

        try {
            // JS.g:628:2: ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute )
            int alt1=8;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case EACH:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case GET:
            case SET:
            case YIELD:
            case WXML:
            case NAMESPACE:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt1=1;
                }
                break;
            case Identifier:
                {
                alt1=2;
                }
                break;
            case XMLFragment:
                {
                alt1=3;
                }
                break;
            case XMLFragmentEnd:
                {
                alt1=4;
                }
                break;
            case LBRACE:
            case RBRACE:
            case LPAREN:
            case RPAREN:
            case LBRACK:
            case RBRACK:
            case DOT:
            case SEMIC:
            case COMMA:
            case LT:
            case GT:
            case LTE:
            case GTE:
            case EQ:
            case NEQ:
            case SAME:
            case NSAME:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case INC:
            case DEC:
            case SHL:
            case SHR:
            case SHU:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case INV:
            case LAND:
            case LOR:
            case QUE:
            case COLON:
            case ASSIGN:
            case ADDASS:
            case SUBASS:
            case MULASS:
            case MODASS:
            case SHLASS:
            case SHRASS:
            case SHUASS:
            case ANDASS:
            case ORASS:
            case XORASS:
            case DIV:
            case DIVASS:
            case DOTDOT:
            case COLONCOLON:
                {
                alt1=5;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=6;
                }
                break;
            case StringLiteral:
                {
                alt1=7;
                }
                break;
            case AT:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("627:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:628:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1950);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:629:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1955);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:630:4: XMLFragment
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragment3=(Token)input.LT(1);
                    match(input,XMLFragment,FOLLOW_XMLFragment_in_token1960); 
                    XMLFragment3_tree = (Object)adaptor.create(XMLFragment3);
                    adaptor.addChild(root_0, XMLFragment3_tree);


                    }
                    break;
                case 4 :
                    // JS.g:631:4: XMLFragmentEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragmentEnd4=(Token)input.LT(1);
                    match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_token1965); 
                    XMLFragmentEnd4_tree = (Object)adaptor.create(XMLFragmentEnd4);
                    adaptor.addChild(root_0, XMLFragmentEnd4_tree);


                    }
                    break;
                case 5 :
                    // JS.g:632:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1970);
                    punctuator5=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator5.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:633:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1975);
                    numericLiteral6=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral6.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:634:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral7=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1980); 
                    StringLiteral7_tree = (Object)adaptor.create(StringLiteral7);
                    adaptor.addChild(root_0, StringLiteral7_tree);


                    }
                    break;
                case 8 :
                    // JS.g:635:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_token1985);
                    xmlAttribute8=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end token

    public static class reservedWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start reservedWord
    // JS.g:640:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final reservedWord_return reservedWord() throws RecognitionException {
        reservedWord_return retval = new reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL11=null;
        keyword_return keyword9 = null;

        futureReservedWord_return futureReservedWord10 = null;

        booleanLiteral_return booleanLiteral12 = null;


        Object NULL11_tree=null;

        try {
            // JS.g:641:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case EACH:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case GET:
            case SET:
            case YIELD:
            case WXML:
            case NAMESPACE:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt2=2;
                }
                break;
            case NULL:
                {
                alt2=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("640:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:641:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1998);
                    keyword9=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword9.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:642:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord2003);
                    futureReservedWord10=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord10.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:643:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL11=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord2008); 
                    NULL11_tree = (Object)adaptor.create(NULL11);
                    adaptor.addChild(root_0, NULL11_tree);


                    }
                    break;
                case 4 :
                    // JS.g:644:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2013);
                    booleanLiteral12=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end reservedWord

    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start keyword
    // JS.g:651:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:652:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=NAMESPACE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set13));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_keyword0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end keyword

    public static class futureReservedWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start futureReservedWord
    // JS.g:689:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // JS.g:690:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set14));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_futureReservedWord0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end futureReservedWord

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start identifier
    // JS.g:763:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | Identifier );
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            // JS.g:764:3: ( WXML | GET | SET | EACH | NAMESPACE | Identifier )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set15=(Token)input.LT(1);
            if ( input.LA(1)==EACH||(input.LA(1)>=GET && input.LA(1)<=SET)||(input.LA(1)>=WXML && input.LA(1)<=NAMESPACE)||input.LA(1)==Identifier ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set15));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_identifier0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end identifier

    public static class xmlAttribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start xmlAttribute
    // JS.g:772:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );
    public final xmlAttribute_return xmlAttribute() throws RecognitionException {
        xmlAttribute_return retval = new xmlAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT16=null;
        Token AT18=null;
        Token MUL19=null;
        identifier_return identifier17 = null;


        Object AT16_tree=null;
        Object AT18_tree=null;
        Object MUL19_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:773:3: ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==AT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==MUL) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EACH||(LA3_1>=GET && LA3_1<=SET)||(LA3_1>=WXML && LA3_1<=NAMESPACE)||LA3_1==Identifier) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("772:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("772:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // JS.g:773:5: AT identifier
                    {
                    AT16=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2513); 
                    stream_AT.add(AT16);

                    pushFollow(FOLLOW_identifier_in_xmlAttribute2515);
                    identifier17=identifier();
                    _fsp--;

                    stream_identifier.add(identifier17.getTree());

                    // AST REWRITE
                    // elements: identifier, AT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 773:19: -> ^( XmlAttribute AT identifier )
                    {
                        // JS.g:773:22: ^( XmlAttribute AT identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(XmlAttribute, "XmlAttribute"), root_1);

                        adaptor.addChild(root_1, stream_AT.next());
                        adaptor.addChild(root_1, stream_identifier.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // JS.g:774:5: AT MUL
                    {
                    AT18=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2531); 
                    stream_AT.add(AT18);

                    MUL19=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_xmlAttribute2533); 
                    stream_MUL.add(MUL19);


                    // AST REWRITE
                    // elements: MUL, AT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 774:12: -> ^( XmlAttribute AT MUL )
                    {
                        // JS.g:774:15: ^( XmlAttribute AT MUL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(XmlAttribute, "XmlAttribute"), root_1);

                        adaptor.addChild(root_1, stream_AT.next());
                        adaptor.addChild(root_1, stream_MUL.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end xmlAttribute

    public static class punctuator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start punctuator
    // JS.g:781:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // JS.g:782:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set20=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS)||(input.LA(1)>=DOTDOT && input.LA(1)<=COLONCOLON) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set20));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_punctuator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end punctuator

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // JS.g:838:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL21=null;
        Token StringLiteral24=null;
        Token RegularExpressionLiteral25=null;
        booleanLiteral_return booleanLiteral22 = null;

        numericLiteral_return numericLiteral23 = null;

        xmlLiteral_return xmlLiteral26 = null;


        Object NULL21_tree=null;
        Object StringLiteral24_tree=null;
        Object RegularExpressionLiteral25_tree=null;

        try {
            // JS.g:839:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral )
            int alt4=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt4=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt4=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=3;
                }
                break;
            case StringLiteral:
                {
                alt4=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt4=5;
                }
                break;
            case XMLFragment:
            case XMLFragmentEnd:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("838:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:839:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL21=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2819); 
                    NULL21_tree = (Object)adaptor.create(NULL21);
                    adaptor.addChild(root_0, NULL21_tree);


                    }
                    break;
                case 2 :
                    // JS.g:840:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2824);
                    booleanLiteral22=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral22.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:841:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2829);
                    numericLiteral23=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral23.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:842:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral24=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2834); 
                    StringLiteral24_tree = (Object)adaptor.create(StringLiteral24);
                    adaptor.addChild(root_0, StringLiteral24_tree);


                    }
                    break;
                case 5 :
                    // JS.g:843:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral25=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2839); 
                    RegularExpressionLiteral25_tree = (Object)adaptor.create(RegularExpressionLiteral25);
                    adaptor.addChild(root_0, RegularExpressionLiteral25_tree);


                    }
                    break;
                case 6 :
                    // JS.g:844:4: xmlLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlLiteral_in_literal2844);
                    xmlLiteral26=xmlLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, xmlLiteral26.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class xmlLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start xmlLiteral
    // JS.g:847:1: xmlLiteral : ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) ;
    public final xmlLiteral_return xmlLiteral() throws RecognitionException {
        xmlLiteral_return retval = new xmlLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLFragment27=null;
        Token LBRACE28=null;
        Token RBRACE30=null;
        Token XMLFragmentEnd31=null;
        expression_return expression29 = null;


        Object XMLFragment27_tree=null;
        Object LBRACE28_tree=null;
        Object RBRACE30_tree=null;
        Object XMLFragmentEnd31_tree=null;
        RewriteRuleTokenStream stream_XMLFragment=new RewriteRuleTokenStream(adaptor,"token XMLFragment");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_XMLFragmentEnd=new RewriteRuleTokenStream(adaptor,"token XMLFragmentEnd");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:848:2: ( ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) )
            // JS.g:848:4: ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd
            {
            // JS.g:848:4: ( XMLFragment LBRACE expression RBRACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==XMLFragment) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JS.g:849:6: XMLFragment LBRACE expression RBRACE
            	    {
            	    XMLFragment27=(Token)input.LT(1);
            	    match(input,XMLFragment,FOLLOW_XMLFragment_in_xmlLiteral2862); 
            	    stream_XMLFragment.add(XMLFragment27);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_EXPRESSION); 
            	    LBRACE28=(Token)input.LT(1);
            	    match(input,LBRACE,FOLLOW_LBRACE_in_xmlLiteral2879); 
            	    stream_LBRACE.add(LBRACE28);

            	    pushFollow(FOLLOW_expression_in_xmlLiteral2881);
            	    expression29=expression();
            	    _fsp--;

            	    stream_expression.add(expression29.getTree());
            	    RBRACE30=(Token)input.LT(1);
            	    match(input,RBRACE,FOLLOW_RBRACE_in_xmlLiteral2883); 
            	    stream_RBRACE.add(RBRACE30);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_XML); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            XMLFragmentEnd31=(Token)input.LT(1);
            match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_xmlLiteral2899); 
            stream_XMLFragmentEnd.add(XMLFragmentEnd31);


            // AST REWRITE
            // elements: expression, XMLFragmentEnd, XMLFragment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 854:4: -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
            {
                // JS.g:854:7: ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);

                // JS.g:854:21: ( XMLFragment )*
                while ( stream_XMLFragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_XMLFragment.next());

                }
                stream_XMLFragment.reset();
                // JS.g:854:34: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();
                adaptor.addChild(root_1, stream_XMLFragmentEnd.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
             ((JSTokenStream)input).setMode(JSTokenSource.MODE_JS); 
        }
        return retval;
    }
    // $ANTLR end xmlLiteral

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start booleanLiteral
    // JS.g:878:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // JS.g:879:2: ( TRUE | FALSE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set32=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set32));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_booleanLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end booleanLiteral

    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start numericLiteral
    // JS.g:925:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;

        Object set33_tree=null;

        try {
            // JS.g:926:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set33=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set33));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_numericLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end numericLiteral

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start primaryExpression
    // JS.g:1015:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS34=null;
        identifier_return identifier35 = null;

        xmlAttribute_return xmlAttribute36 = null;

        literal_return literal37 = null;

        arrayLiteral_return arrayLiteral38 = null;

        objectLiteral_return objectLiteral39 = null;

        parenExpression_return parenExpression40 = null;


        Object THIS34_tree=null;

        try {
            // JS.g:1016:2: ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
            int alt6=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt6=1;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt6=2;
                }
                break;
            case AT:
                {
                alt6=3;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case XMLFragment:
            case XMLFragmentEnd:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt6=4;
                }
                break;
            case LBRACK:
                {
                alt6=5;
                }
                break;
            case LBRACE:
                {
                alt6=6;
                }
                break;
            case LPAREN:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1015:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // JS.g:1016:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS34=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3689); 
                    THIS34_tree = (Object)adaptor.create(THIS34);
                    adaptor.addChild(root_0, THIS34_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1017:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3694);
                    identifier35=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1018:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_primaryExpression3699);
                    xmlAttribute36=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute36.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1019:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3704);
                    literal37=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal37.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1020:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3709);
                    arrayLiteral38=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral38.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1021:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3714);
                    objectLiteral39=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral39.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1022:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3719);
                    parenExpression40=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression40.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end primaryExpression

    public static class parenExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start parenExpression
    // JS.g:1025:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
    public final parenExpression_return parenExpression() throws RecognitionException {
        parenExpression_return retval = new parenExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token RPAREN42=null;
        expression_return expression41 = null;


        Object lpar_tree=null;
        Object RPAREN42_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1026:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:1026:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3735); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3737);
            expression41=expression();
            _fsp--;

            stream_expression.add(expression41.getTree());
            RPAREN42=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3739); 
            stream_RPAREN.add(RPAREN42);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1026:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:1026:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(PAREXPR, lpar,  "PAREXPR"), root_1);

                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end parenExpression

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arrayLiteral
    // JS.g:1029:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA44=null;
        Token RBRACK46=null;
        arrayItem_return arrayItem43 = null;

        arrayItem_return arrayItem45 = null;


        Object lb_tree=null;
        Object COMMA44_tree=null;
        Object RBRACK46_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:1030:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:1030:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3764); 
            stream_LBRACK.add(lb);

            // JS.g:1030:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=NULL && LA9_0<=FALSE)||LA9_0==DELETE||(LA9_0>=EACH && LA9_0<=FUNCTION)||LA9_0==NEW||LA9_0==THIS||LA9_0==TYPEOF||LA9_0==VOID||(LA9_0>=GET && LA9_0<=NAMESPACE)||LA9_0==LBRACE||LA9_0==LPAREN||LA9_0==LBRACK||LA9_0==COMMA||(LA9_0>=ADD && LA9_0<=SUB)||(LA9_0>=INC && LA9_0<=DEC)||(LA9_0>=NOT && LA9_0<=INV)||LA9_0==AT||(LA9_0>=XMLFragment && LA9_0<=XMLFragmentEnd)||LA9_0==StringLiteral||(LA9_0>=Identifier && LA9_0<=RegularExpressionLiteral)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RBRACK) ) {
                int LA9_2 = input.LA(2);

                if ( ( input.LA(1) == COMMA ) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // JS.g:1030:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3768);
                    arrayItem43=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem43.getTree());
                    // JS.g:1030:26: ( COMMA ( arrayItem )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:1030:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA44=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3772); 
                    	    stream_COMMA.add(COMMA44);

                    	    // JS.g:1030:34: ( arrayItem )?
                    	    int alt7=2;
                    	    switch ( input.LA(1) ) {
                    	        case NULL:
                    	        case TRUE:
                    	        case FALSE:
                    	        case DELETE:
                    	        case EACH:
                    	        case FUNCTION:
                    	        case NEW:
                    	        case THIS:
                    	        case TYPEOF:
                    	        case VOID:
                    	        case GET:
                    	        case SET:
                    	        case YIELD:
                    	        case WXML:
                    	        case NAMESPACE:
                    	        case LBRACE:
                    	        case LPAREN:
                    	        case LBRACK:
                    	        case ADD:
                    	        case SUB:
                    	        case INC:
                    	        case DEC:
                    	        case NOT:
                    	        case INV:
                    	        case AT:
                    	        case XMLFragment:
                    	        case XMLFragmentEnd:
                    	        case StringLiteral:
                    	        case Identifier:
                    	        case RegularExpressionLiteral:
                    	        case DecimalLiteral:
                    	        case OctalIntegerLiteral:
                    	        case HexIntegerLiteral:
                    	            {
                    	            alt7=1;
                    	            }
                    	            break;
                    	        case RBRACK:
                    	            {
                    	            int LA7_2 = input.LA(2);

                    	            if ( ( input.LA(1) == COMMA ) ) {
                    	                alt7=1;
                    	            }
                    	            }
                    	            break;
                    	        case COMMA:
                    	            {
                    	            int LA7_3 = input.LA(2);

                    	            if ( ( input.LA(1) == COMMA ) ) {
                    	                alt7=1;
                    	            }
                    	            }
                    	            break;
                    	    }

                    	    switch (alt7) {
                    	        case 1 :
                    	            // JS.g:1030:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3774);
                    	            arrayItem45=arrayItem();
                    	            _fsp--;

                    	            stream_arrayItem.add(arrayItem45.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK46=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3783); 
            stream_RBRACK.add(RBRACK46);


            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1031:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:1031:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:1031:28: ( arrayItem )*
                while ( stream_arrayItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayItem.next());

                }
                stream_arrayItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arrayLiteral

    public static class arrayItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arrayItem
    // JS.g:1034:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1035:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:1035:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:1035:4: (expr= assignmentExpression | {...}?)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=NULL && LA10_0<=FALSE)||LA10_0==DELETE||(LA10_0>=EACH && LA10_0<=FUNCTION)||LA10_0==NEW||LA10_0==THIS||LA10_0==TYPEOF||LA10_0==VOID||(LA10_0>=GET && LA10_0<=NAMESPACE)||LA10_0==LBRACE||LA10_0==LPAREN||LA10_0==LBRACK||(LA10_0>=ADD && LA10_0<=SUB)||(LA10_0>=INC && LA10_0<=DEC)||(LA10_0>=NOT && LA10_0<=INV)||LA10_0==AT||(LA10_0>=XMLFragment && LA10_0<=XMLFragmentEnd)||LA10_0==StringLiteral||(LA10_0>=Identifier && LA10_0<=RegularExpressionLiteral)||(LA10_0>=DecimalLiteral && LA10_0<=HexIntegerLiteral)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RBRACK||LA10_0==COMMA) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1035:4: (expr= assignmentExpression | {...}?)", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1035:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3811);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1035:34: {...}?
                    {
                    if ( !( input.LA(1) == COMMA ) ) {
                        throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
                    }

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1036:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1036:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1036:13: ( $expr)?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.next());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arrayItem

    public static class objectLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectLiteral
    // JS.g:1039:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA48=null;
        Token COMMA50=null;
        Token RBRACE51=null;
        objectPropertyInitializer_return objectPropertyInitializer47 = null;

        objectPropertyInitializer_return objectPropertyInitializer49 = null;


        Object lb_tree=null;
        Object COMMA48_tree=null;
        Object COMMA50_tree=null;
        Object RBRACE51_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:1040:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) )
            // JS.g:1040:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3843); 
            stream_LBRACE.add(lb);

            // JS.g:1040:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EACH||(LA13_0>=GET && LA13_0<=SET)||(LA13_0>=WXML && LA13_0<=NAMESPACE)||LA13_0==AT||LA13_0==StringLiteral||LA13_0==Identifier||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // JS.g:1040:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3847);
                    objectPropertyInitializer47=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer47.getTree());
                    // JS.g:1040:42: ( COMMA objectPropertyInitializer )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==EACH||(LA11_1>=GET && LA11_1<=SET)||(LA11_1>=WXML && LA11_1<=NAMESPACE)||LA11_1==AT||LA11_1==StringLiteral||LA11_1==Identifier||(LA11_1>=DecimalLiteral && LA11_1<=HexIntegerLiteral)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // JS.g:1040:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA48=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3851); 
                    	    stream_COMMA.add(COMMA48);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3853);
                    	    objectPropertyInitializer49=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // JS.g:1040:79: ( COMMA )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COMMA) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // JS.g:1040:79: COMMA
                            {
                            COMMA50=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3858); 
                            stream_COMMA.add(COMMA50);


                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE51=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3863); 
            stream_RBRACE.add(RBRACE51);


            // AST REWRITE
            // elements: COMMA, objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1041:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
            {
                // JS.g:1041:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1041:30: ( objectPropertyInitializer )*
                while ( stream_objectPropertyInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectPropertyInitializer.next());

                }
                stream_objectPropertyInitializer.reset();
                // JS.g:1041:57: ( COMMA )*
                while ( stream_COMMA.hasNext() ) {
                    adaptor.addChild(root_1, stream_COMMA.next());

                }
                stream_COMMA.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end objectLiteral

    public static class objectPropertyInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectPropertyInitializer
    // JS.g:1044:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair52 = null;

        getMethodDeclaration_return getMethodDeclaration53 = null;

        setMethodDeclaration_return setMethodDeclaration54 = null;



        try {
            // JS.g:1045:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt14=3;
            switch ( input.LA(1) ) {
            case GET:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EACH||(LA14_1>=GET && LA14_1<=SET)||(LA14_1>=WXML && LA14_1<=NAMESPACE)||LA14_1==Identifier) ) {
                    alt14=2;
                }
                else if ( (LA14_1==COLON) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1044:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case EACH:
            case WXML:
            case NAMESPACE:
            case AT:
            case StringLiteral:
            case Identifier:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt14=1;
                }
                break;
            case SET:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==EACH||(LA14_3>=GET && LA14_3<=SET)||(LA14_3>=WXML && LA14_3<=NAMESPACE)||LA14_3==Identifier) ) {
                    alt14=3;
                }
                else if ( (LA14_3==COLON) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1044:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1044:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // JS.g:1045:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3890);
                    nameValuePair52=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair52.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1046:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3897);
                    getMethodDeclaration53=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration53.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1047:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3903);
                    setMethodDeclaration54=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration54.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end objectPropertyInitializer

    public static class nameValuePair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nameValuePair
    // JS.g:1050:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON56=null;
        propertyName_return propertyName55 = null;

        assignmentExpression_return assignmentExpression57 = null;


        Object COLON56_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1051:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1051:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3916);
            propertyName55=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName55.getTree());
            COLON56=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3918); 
            stream_COLON.add(COLON56);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3920);
            assignmentExpression57=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression57.getTree());

            // AST REWRITE
            // elements: propertyName, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1052:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1052:5: ^( NAMEDVALUE propertyName assignmentExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(NAMEDVALUE, "NAMEDVALUE"), root_1);

                adaptor.addChild(root_1, stream_propertyName.next());
                adaptor.addChild(root_1, stream_assignmentExpression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end nameValuePair

    public static class propertyName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start propertyName
    // JS.g:1055:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral59=null;
        identifier_return identifier58 = null;

        numericLiteral_return numericLiteral60 = null;

        xmlAttribute_return xmlAttribute61 = null;


        Object StringLiteral59_tree=null;

        try {
            // JS.g:1056:2: ( identifier | StringLiteral | numericLiteral | xmlAttribute )
            int alt15=4;
            switch ( input.LA(1) ) {
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt15=1;
                }
                break;
            case StringLiteral:
                {
                alt15=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt15=3;
                }
                break;
            case AT:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1055:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // JS.g:1056:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3944);
                    identifier58=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier58.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1057:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral59=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3949); 
                    StringLiteral59_tree = (Object)adaptor.create(StringLiteral59);
                    adaptor.addChild(root_0, StringLiteral59_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1058:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3954);
                    numericLiteral60=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral60.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1059:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_propertyName3959);
                    xmlAttribute61=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute61.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end propertyName

    public static class memberExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start memberExpression
    // JS.g:1071:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression62 = null;

        functionExpression_return functionExpression63 = null;

        newExpression_return newExpression64 = null;



        try {
            // JS.g:1072:2: ( primaryExpression | functionExpression | newExpression )
            int alt16=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case EACH:
            case THIS:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case AT:
            case XMLFragment:
            case XMLFragmentEnd:
            case StringLiteral:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt16=1;
                }
                break;
            case FUNCTION:
                {
                alt16=2;
                }
                break;
            case NEW:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1071:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // JS.g:1072:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3977);
                    primaryExpression62=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression62.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1073:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3982);
                    functionExpression63=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression63.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1074:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3987);
                    newExpression64=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression64.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end memberExpression

    public static class newExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start newExpression
    // JS.g:1077:1: newExpression : NEW leftHandSideExpressionTail ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW65=null;
        leftHandSideExpressionTail_return leftHandSideExpressionTail66 = null;


        Object NEW65_tree=null;

        try {
            // JS.g:1078:2: ( NEW leftHandSideExpressionTail )
            // JS.g:1078:4: NEW leftHandSideExpressionTail
            {
            root_0 = (Object)adaptor.nil();

            NEW65=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3998); 
            NEW65_tree = (Object)adaptor.create(NEW65);
            root_0 = (Object)adaptor.becomeRoot(NEW65_tree, root_0);

            pushFollow(FOLLOW_leftHandSideExpressionTail_in_newExpression4001);
            leftHandSideExpressionTail66=leftHandSideExpressionTail();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpressionTail66.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end newExpression

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arguments
    // JS.g:1082:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN67=null;
        Token COMMA69=null;
        Token RPAREN71=null;
        assignmentExpression_return assignmentExpression68 = null;

        assignmentExpression_return assignmentExpression70 = null;


        Object LPAREN67_tree=null;
        Object COMMA69_tree=null;
        Object RPAREN71_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1083:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) )
            // JS.g:1083:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN67=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments4014); 
            stream_LPAREN.add(LPAREN67);

            // JS.g:1083:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=NULL && LA18_0<=FALSE)||LA18_0==DELETE||(LA18_0>=EACH && LA18_0<=FUNCTION)||LA18_0==NEW||LA18_0==THIS||LA18_0==TYPEOF||LA18_0==VOID||(LA18_0>=GET && LA18_0<=NAMESPACE)||LA18_0==LBRACE||LA18_0==LPAREN||LA18_0==LBRACK||(LA18_0>=ADD && LA18_0<=SUB)||(LA18_0>=INC && LA18_0<=DEC)||(LA18_0>=NOT && LA18_0<=INV)||LA18_0==AT||(LA18_0>=XMLFragment && LA18_0<=XMLFragmentEnd)||LA18_0==StringLiteral||(LA18_0>=Identifier && LA18_0<=RegularExpressionLiteral)||(LA18_0>=DecimalLiteral && LA18_0<=HexIntegerLiteral)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1083:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments4018);
                    assignmentExpression68=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression68.getTree());
                    // JS.g:1083:34: ( COMMA assignmentExpression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // JS.g:1083:36: COMMA assignmentExpression
                    	    {
                    	    COMMA69=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments4022); 
                    	    stream_COMMA.add(COMMA69);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments4024);
                    	    assignmentExpression70=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression70.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN71=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments4032); 
            stream_RPAREN.add(RPAREN71);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1084:2: -> ^( CALL_ARGUMENTS ( assignmentExpression )* )
            {
                // JS.g:1084:5: ^( CALL_ARGUMENTS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL_ARGUMENTS, "CALL_ARGUMENTS"), root_1);

                // JS.g:1084:23: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignmentExpression.next());

                }
                stream_assignmentExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arguments

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start leftHandSideExpression
    // JS.g:1087:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK74=null;
        Token RBRACK76=null;
        Token DOT77=null;
        Token DOTDOT79=null;
        Token COLONCOLON81=null;
        memberExpression_return memberExpression72 = null;

        arguments_return arguments73 = null;

        expression_return expression75 = null;

        rightHandSideExpression_return rightHandSideExpression78 = null;

        rightHandSideExpression_return rightHandSideExpression80 = null;

        expression_return expression82 = null;


        Object LBRACK74_tree=null;
        Object RBRACK76_tree=null;
        Object DOT77_tree=null;
        Object DOTDOT79_tree=null;
        Object COLONCOLON81_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_COLONCOLON=new RewriteRuleTokenStream(adaptor,"token COLONCOLON");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
         pushState(JSParserRule.LEFT_HAND_SIDE_EXPRESSION); 
        try {
            // JS.g:1089:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1090:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1090:3: ( memberExpression -> memberExpression )
            // JS.g:1091:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4070);
            memberExpression72=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression72.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1091:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1093:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            loop19:
            do {
                int alt19=6;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt19=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt19=2;
                    }
                    break;
                case DOT:
                    {
                    alt19=3;
                    }
                    break;
                case DOTDOT:
                    {
                    alt19=4;
                    }
                    break;
                case COLONCOLON:
                    {
                    alt19=5;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // JS.g:1094:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression4091);
            	    arguments73=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments73.getTree());

            	    // AST REWRITE
            	    // elements: arguments, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1094:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1094:22: ^( CALL $leftHandSideExpression arguments )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_arguments.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 2 :
            	    // JS.g:1095:7: LBRACK expression RBRACK
            	    {
            	    LBRACK74=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4116); 
            	    stream_LBRACK.add(LBRACK74);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4118);
            	    expression75=expression();
            	    _fsp--;

            	    stream_expression.add(expression75.getTree());
            	    RBRACK76=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4120); 
            	    stream_RBRACK.add(RBRACK76);


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1095:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // JS.g:1095:36: ^( BYINDEX $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, "BYINDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1096:7: DOT rightHandSideExpression
            	    {
            	    DOT77=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4142); 
            	    stream_DOT.add(DOT77);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4144);
            	    rightHandSideExpression78=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression78.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, rightHandSideExpression, DOT
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1096:35: -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression )
            	    {
            	        // JS.g:1096:38: ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        adaptor.addChild(root_1, stream_rightHandSideExpression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1097:7: DOTDOT rightHandSideExpression
            	    {
            	    DOTDOT79=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4167); 
            	    stream_DOTDOT.add(DOTDOT79);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4169);
            	    rightHandSideExpression80=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression80.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1097:38: -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // JS.g:1097:41: ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_rightHandSideExpression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 5 :
            	    // JS.g:1098:7: COLONCOLON expression
            	    {
            	    COLONCOLON81=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4188); 
            	    stream_COLONCOLON.add(COLONCOLON81);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4190);
            	    expression82=expression();
            	    _fsp--;

            	    stream_expression.add(expression82.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1098:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1098:32: ^( LOCALNAME $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(LOCALNAME, "LOCALNAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException e) {
             reportRuleError(e); 
        }
        catch (RuntimeException e) {
             reportFailure(e); 
        }
        finally {
             popState(); 
        }
        return retval;
    }
    // $ANTLR end leftHandSideExpression

    public static class leftHandSideExpressionTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start leftHandSideExpressionTail
    // JS.g:1105:1: leftHandSideExpressionTail : ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpressionTail expression ) )* ;
    public final leftHandSideExpressionTail_return leftHandSideExpressionTail() throws RecognitionException {
        leftHandSideExpressionTail_return retval = new leftHandSideExpressionTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK84=null;
        Token RBRACK86=null;
        Token DOT87=null;
        Token DOTDOT89=null;
        Token COLONCOLON91=null;
        memberExpression_return memberExpression83 = null;

        expression_return expression85 = null;

        rightHandSideExpression_return rightHandSideExpression88 = null;

        rightHandSideExpression_return rightHandSideExpression90 = null;

        expression_return expression92 = null;


        Object LBRACK84_tree=null;
        Object RBRACK86_tree=null;
        Object DOT87_tree=null;
        Object DOTDOT89_tree=null;
        Object COLONCOLON91_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_COLONCOLON=new RewriteRuleTokenStream(adaptor,"token COLONCOLON");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
        try {
            // JS.g:1106:3: ( ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpressionTail expression ) )* )
            // JS.g:1107:3: ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpressionTail expression ) )*
            {
            // JS.g:1107:3: ( memberExpression -> memberExpression )
            // JS.g:1108:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpressionTail4249);
            memberExpression83=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression83.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1108:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1110:3: ( LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpressionTail expression ) )*
            loop20:
            do {
                int alt20=5;
                switch ( input.LA(1) ) {
                case LBRACK:
                    {
                    alt20=1;
                    }
                    break;
                case DOT:
                    {
                    alt20=2;
                    }
                    break;
                case DOTDOT:
                    {
                    alt20=3;
                    }
                    break;
                case COLONCOLON:
                    {
                    alt20=4;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // JS.g:1111:5: LBRACK expression RBRACK
            	    {
            	    LBRACK84=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpressionTail4270); 
            	    stream_LBRACK.add(LBRACK84);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpressionTail4272);
            	    expression85=expression();
            	    _fsp--;

            	    stream_expression.add(expression85.getTree());
            	    RBRACK86=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpressionTail4274); 
            	    stream_RBRACK.add(RBRACK86);


            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1111:31: -> ^( BYINDEX $leftHandSideExpressionTail expression )
            	    {
            	        // JS.g:1111:34: ^( BYINDEX $leftHandSideExpressionTail expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, "BYINDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 2 :
            	    // JS.g:1112:7: DOT rightHandSideExpression
            	    {
            	    DOT87=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpressionTail4296); 
            	    stream_DOT.add(DOT87);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpressionTail4298);
            	    rightHandSideExpression88=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression88.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpressionTail, DOT, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1112:35: -> ^( BYFIELD $leftHandSideExpressionTail DOT rightHandSideExpression )
            	    {
            	        // JS.g:1112:38: ^( BYFIELD $leftHandSideExpressionTail DOT rightHandSideExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        adaptor.addChild(root_1, stream_rightHandSideExpression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1113:7: DOTDOT rightHandSideExpression
            	    {
            	    DOTDOT89=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpressionTail4321); 
            	    stream_DOTDOT.add(DOTDOT89);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpressionTail4323);
            	    rightHandSideExpression90=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression90.getTree());

            	    // AST REWRITE
            	    // elements: rightHandSideExpression, leftHandSideExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1113:38: -> ^( ALLCHILDREN $leftHandSideExpressionTail rightHandSideExpression )
            	    {
            	        // JS.g:1113:41: ^( ALLCHILDREN $leftHandSideExpressionTail rightHandSideExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_rightHandSideExpression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1114:7: COLONCOLON expression
            	    {
            	    COLONCOLON91=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpressionTail4342); 
            	    stream_COLONCOLON.add(COLONCOLON91);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpressionTail4344);
            	    expression92=expression();
            	    _fsp--;

            	    stream_expression.add(expression92.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1114:29: -> ^( LOCALNAME $leftHandSideExpressionTail expression )
            	    {
            	        // JS.g:1114:32: ^( LOCALNAME $leftHandSideExpressionTail expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(LOCALNAME, "LOCALNAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end leftHandSideExpressionTail

    public static class rightHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rightHandSideExpression
    // JS.g:1118:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL96=null;
        parenExpression_return parenExpression93 = null;

        identifier_return identifier94 = null;

        xmlAttribute_return xmlAttribute95 = null;


        Object MUL96_tree=null;

        try {
            // JS.g:1119:3: ( parenExpression | identifier | xmlAttribute | MUL )
            int alt21=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt21=1;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt21=2;
                }
                break;
            case AT:
                {
                alt21=3;
                }
                break;
            case MUL:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1118:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // JS.g:1119:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4373);
                    parenExpression93=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression93.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1120:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4380);
                    identifier94=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier94.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1121:5: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4386);
                    xmlAttribute95=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute95.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1122:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL96=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4392); 
                    MUL96_tree = (Object)adaptor.create(MUL96);
                    adaptor.addChild(root_0, MUL96_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rightHandSideExpression

    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfixExpression
    // JS.g:1135:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression97 = null;

        postfixOperator_return postfixOperator98 = null;



        try {
            // JS.g:1136:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1136:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4409);
            leftHandSideExpression97=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression97.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1136:95: ( postfixOperator )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==INC) ) {
                alt22=1;
            }
            else if ( (LA22_0==DEC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // JS.g:1136:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4415);
                    postfixOperator98=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator98.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end postfixExpression

    public static class postfixOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfixOperator
    // JS.g:1139:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1140:2: (op= INC | op= DEC )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INC) ) {
                alt23=1;
            }
            else if ( (LA23_0==DEC) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1139:1: postfixOperator : (op= INC | op= DEC );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // JS.g:1140:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4433); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1141:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4442); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PDEC); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end postfixOperator

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unaryExpression
    // JS.g:1148:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression99 = null;

        unaryOperator_return unaryOperator100 = null;

        unaryExpression_return unaryExpression101 = null;



        try {
            // JS.g:1149:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=NULL && LA24_0<=FALSE)||(LA24_0>=EACH && LA24_0<=FUNCTION)||LA24_0==NEW||LA24_0==THIS||(LA24_0>=GET && LA24_0<=SET)||(LA24_0>=WXML && LA24_0<=NAMESPACE)||LA24_0==LBRACE||LA24_0==LPAREN||LA24_0==LBRACK||LA24_0==AT||(LA24_0>=XMLFragment && LA24_0<=XMLFragmentEnd)||LA24_0==StringLiteral||(LA24_0>=Identifier && LA24_0<=RegularExpressionLiteral)||(LA24_0>=DecimalLiteral && LA24_0<=HexIntegerLiteral)) ) {
                alt24=1;
            }
            else if ( (LA24_0==DELETE||LA24_0==TYPEOF||LA24_0==VOID||LA24_0==YIELD||(LA24_0>=ADD && LA24_0<=SUB)||(LA24_0>=INC && LA24_0<=DEC)||(LA24_0>=NOT && LA24_0<=INV)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1148:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // JS.g:1149:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4459);
                    postfixExpression99=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression99.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1150:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4464);
                    unaryOperator100=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator100.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4467);
                    unaryExpression101=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression101.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unaryExpression

    public static class unaryOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unaryOperator
    // JS.g:1153:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE102=null;
        Token VOID103=null;
        Token TYPEOF104=null;
        Token INC105=null;
        Token DEC106=null;
        Token INV107=null;
        Token NOT108=null;
        Token YIELD109=null;

        Object op_tree=null;
        Object DELETE102_tree=null;
        Object VOID103_tree=null;
        Object TYPEOF104_tree=null;
        Object INC105_tree=null;
        Object DEC106_tree=null;
        Object INV107_tree=null;
        Object NOT108_tree=null;
        Object YIELD109_tree=null;

        try {
            // JS.g:1154:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt25=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt25=1;
                }
                break;
            case VOID:
                {
                alt25=2;
                }
                break;
            case TYPEOF:
                {
                alt25=3;
                }
                break;
            case INC:
                {
                alt25=4;
                }
                break;
            case DEC:
                {
                alt25=5;
                }
                break;
            case ADD:
                {
                alt25=6;
                }
                break;
            case SUB:
                {
                alt25=7;
                }
                break;
            case INV:
                {
                alt25=8;
                }
                break;
            case NOT:
                {
                alt25=9;
                }
                break;
            case YIELD:
                {
                alt25=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1153:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // JS.g:1154:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE102=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4479); 
                    DELETE102_tree = (Object)adaptor.create(DELETE102);
                    adaptor.addChild(root_0, DELETE102_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1155:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID103=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4484); 
                    VOID103_tree = (Object)adaptor.create(VOID103);
                    adaptor.addChild(root_0, VOID103_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1156:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF104=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4489); 
                    TYPEOF104_tree = (Object)adaptor.create(TYPEOF104);
                    adaptor.addChild(root_0, TYPEOF104_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1157:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC105=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4494); 
                    INC105_tree = (Object)adaptor.create(INC105);
                    adaptor.addChild(root_0, INC105_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1158:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC106=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4499); 
                    DEC106_tree = (Object)adaptor.create(DEC106);
                    adaptor.addChild(root_0, DEC106_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1159:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4506); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1160:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4515); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1161:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV107=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4522); 
                    INV107_tree = (Object)adaptor.create(INV107);
                    adaptor.addChild(root_0, INV107_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1162:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT108=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4527); 
                    NOT108_tree = (Object)adaptor.create(NOT108);
                    adaptor.addChild(root_0, NOT108_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1163:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD109=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4532); 
                    YIELD109_tree = (Object)adaptor.create(YIELD109);
                    adaptor.addChild(root_0, YIELD109_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unaryOperator

    public static class namespaceStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start namespaceStatement
    // JS.g:1168:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT110=null;
        Token WXML111=null;
        Token NAMESPACE112=null;
        Token ASSIGN113=null;
        Token StringLiteral114=null;
        semic_return semic115 = null;


        Object DEFAULT110_tree=null;
        Object WXML111_tree=null;
        Object NAMESPACE112_tree=null;
        Object ASSIGN113_tree=null;
        Object StringLiteral114_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1169:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) )
            // JS.g:1169:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            DEFAULT110=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4546); 
            stream_DEFAULT.add(DEFAULT110);

            WXML111=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4548); 
            stream_WXML.add(WXML111);

            NAMESPACE112=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4550); 
            stream_NAMESPACE.add(NAMESPACE112);

            ASSIGN113=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4552); 
            stream_ASSIGN.add(ASSIGN113);

            StringLiteral114=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4554); 
            stream_StringLiteral.add(StringLiteral114);

            pushFollow(FOLLOW_semic_in_namespaceStatement4556);
            semic115=semic();
            _fsp--;

            stream_semic.add(semic115.getTree());

            // AST REWRITE
            // elements: WXML, StringLiteral, DEFAULT, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1170:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
            {
                // JS.g:1170:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(DEFAULT_XML_NAMESPACE, "DEFAULT_XML_NAMESPACE"), root_1);

                adaptor.addChild(root_1, stream_DEFAULT.next());
                adaptor.addChild(root_1, stream_WXML.next());
                adaptor.addChild(root_1, stream_ASSIGN.next());
                adaptor.addChild(root_1, stream_StringLiteral.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end namespaceStatement

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // JS.g:1175:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set117=null;
        unaryExpression_return unaryExpression116 = null;

        unaryExpression_return unaryExpression118 = null;


        Object set117_tree=null;

        try {
            // JS.g:1176:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1176:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4588);
            unaryExpression116=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression116.getTree());
            // JS.g:1176:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=MUL && LA26_0<=MOD)||LA26_0==DIV) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JS.g:1176:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set117=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set117), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4592);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4607);
            	    unaryExpression118=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression118.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // JS.g:1183:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set120=null;
        multiplicativeExpression_return multiplicativeExpression119 = null;

        multiplicativeExpression_return multiplicativeExpression121 = null;


        Object set120_tree=null;

        try {
            // JS.g:1184:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1184:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4625);
            multiplicativeExpression119=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression119.getTree());
            // JS.g:1184:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=ADD && LA27_0<=SUB)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1184:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set120=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set120), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4629);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4640);
            	    multiplicativeExpression121=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression121.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end additiveExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // JS.g:1191:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;
        additiveExpression_return additiveExpression122 = null;

        additiveExpression_return additiveExpression124 = null;


        Object set123_tree=null;

        try {
            // JS.g:1192:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1192:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4659);
            additiveExpression122=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression122.getTree());
            // JS.g:1192:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=SHL && LA28_0<=SHU)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1192:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set123=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set123), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4663);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4678);
            	    additiveExpression124=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression124.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end shiftExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // JS.g:1199:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set126=null;
        shiftExpression_return shiftExpression125 = null;

        shiftExpression_return shiftExpression127 = null;


        Object set126_tree=null;

        try {
            // JS.g:1200:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1200:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4697);
            shiftExpression125=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression125.getTree());
            // JS.g:1200:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==INSTANCEOF||(LA29_0>=LT && LA29_0<=GTE)) ) {
                    alt29=1;
                }
                else if ( (LA29_0==IN) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1200:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set126=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set126), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4701);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4728);
            	    shiftExpression127=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression127.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpression

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpressionNoIn
    // JS.g:1203:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set129=null;
        shiftExpression_return shiftExpression128 = null;

        shiftExpression_return shiftExpression130 = null;


        Object set129_tree=null;

        try {
            // JS.g:1204:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1204:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4742);
            shiftExpression128=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression128.getTree());
            // JS.g:1204:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==INSTANCEOF||(LA30_0>=LT && LA30_0<=GTE)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1204:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set129=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set129), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4746);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4769);
            	    shiftExpression130=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression130.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpressionNoIn

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // JS.g:1211:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set132=null;
        relationalExpression_return relationalExpression131 = null;

        relationalExpression_return relationalExpression133 = null;


        Object set132_tree=null;

        try {
            // JS.g:1212:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1212:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4788);
            relationalExpression131=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression131.getTree());
            // JS.g:1212:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=EQ && LA31_0<=NSAME)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1212:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set132=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set132), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4792);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4811);
            	    relationalExpression133=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression133.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpression

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpressionNoIn
    // JS.g:1215:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set135=null;
        relationalExpressionNoIn_return relationalExpressionNoIn134 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn136 = null;


        Object set135_tree=null;

        try {
            // JS.g:1216:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1216:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4825);
            relationalExpressionNoIn134=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn134.getTree());
            // JS.g:1216:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=EQ && LA32_0<=NSAME)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1216:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set135=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set135), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4829);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4848);
            	    relationalExpressionNoIn136=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn136.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpressionNoIn

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpression
    // JS.g:1223:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND138=null;
        equalityExpression_return equalityExpression137 = null;

        equalityExpression_return equalityExpression139 = null;


        Object AND138_tree=null;

        try {
            // JS.g:1224:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1224:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4868);
            equalityExpression137=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression137.getTree());
            // JS.g:1224:23: ( AND equalityExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==AND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1224:25: AND equalityExpression
            	    {
            	    AND138=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4872); 
            	    AND138_tree = (Object)adaptor.create(AND138);
            	    root_0 = (Object)adaptor.becomeRoot(AND138_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4875);
            	    equalityExpression139=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression139.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseANDExpression

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpressionNoIn
    // JS.g:1227:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND141=null;
        equalityExpressionNoIn_return equalityExpressionNoIn140 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn142 = null;


        Object AND141_tree=null;

        try {
            // JS.g:1228:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1228:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4889);
            equalityExpressionNoIn140=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn140.getTree());
            // JS.g:1228:27: ( AND equalityExpressionNoIn )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1228:29: AND equalityExpressionNoIn
            	    {
            	    AND141=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4893); 
            	    AND141_tree = (Object)adaptor.create(AND141);
            	    root_0 = (Object)adaptor.becomeRoot(AND141_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4896);
            	    equalityExpressionNoIn142=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn142.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseANDExpressionNoIn

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpression
    // JS.g:1231:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR144=null;
        bitwiseANDExpression_return bitwiseANDExpression143 = null;

        bitwiseANDExpression_return bitwiseANDExpression145 = null;


        Object XOR144_tree=null;

        try {
            // JS.g:1232:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1232:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4912);
            bitwiseANDExpression143=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression143.getTree());
            // JS.g:1232:25: ( XOR bitwiseANDExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==XOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1232:27: XOR bitwiseANDExpression
            	    {
            	    XOR144=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4916); 
            	    XOR144_tree = (Object)adaptor.create(XOR144);
            	    root_0 = (Object)adaptor.becomeRoot(XOR144_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4919);
            	    bitwiseANDExpression145=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression145.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseXORExpression

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpressionNoIn
    // JS.g:1235:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR147=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn146 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn148 = null;


        Object XOR147_tree=null;

        try {
            // JS.g:1236:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1236:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4935);
            bitwiseANDExpressionNoIn146=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn146.getTree());
            // JS.g:1236:29: ( XOR bitwiseANDExpressionNoIn )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==XOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1236:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR147=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4939); 
            	    XOR147_tree = (Object)adaptor.create(XOR147);
            	    root_0 = (Object)adaptor.becomeRoot(XOR147_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4942);
            	    bitwiseANDExpressionNoIn148=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn148.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseXORExpressionNoIn

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpression
    // JS.g:1239:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR150=null;
        bitwiseXORExpression_return bitwiseXORExpression149 = null;

        bitwiseXORExpression_return bitwiseXORExpression151 = null;


        Object OR150_tree=null;

        try {
            // JS.g:1240:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1240:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4957);
            bitwiseXORExpression149=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression149.getTree());
            // JS.g:1240:25: ( OR bitwiseXORExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==OR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1240:27: OR bitwiseXORExpression
            	    {
            	    OR150=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4961); 
            	    OR150_tree = (Object)adaptor.create(OR150);
            	    root_0 = (Object)adaptor.becomeRoot(OR150_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4964);
            	    bitwiseXORExpression151=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression151.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseORExpression

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpressionNoIn
    // JS.g:1243:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR153=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn152 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn154 = null;


        Object OR153_tree=null;

        try {
            // JS.g:1244:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1244:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4979);
            bitwiseXORExpressionNoIn152=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn152.getTree());
            // JS.g:1244:29: ( OR bitwiseXORExpressionNoIn )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1244:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR153=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4983); 
            	    OR153_tree = (Object)adaptor.create(OR153);
            	    root_0 = (Object)adaptor.becomeRoot(OR153_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4986);
            	    bitwiseXORExpressionNoIn154=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn154.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseORExpressionNoIn

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpression
    // JS.g:1251:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND156=null;
        bitwiseORExpression_return bitwiseORExpression155 = null;

        bitwiseORExpression_return bitwiseORExpression157 = null;


        Object LAND156_tree=null;

        try {
            // JS.g:1252:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1252:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5005);
            bitwiseORExpression155=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression155.getTree());
            // JS.g:1252:24: ( LAND bitwiseORExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LAND) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1252:26: LAND bitwiseORExpression
            	    {
            	    LAND156=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression5009); 
            	    LAND156_tree = (Object)adaptor.create(LAND156);
            	    root_0 = (Object)adaptor.becomeRoot(LAND156_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5012);
            	    bitwiseORExpression157=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression157.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalANDExpression

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpressionNoIn
    // JS.g:1255:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND159=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn158 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn160 = null;


        Object LAND159_tree=null;

        try {
            // JS.g:1256:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1256:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5026);
            bitwiseORExpressionNoIn158=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn158.getTree());
            // JS.g:1256:28: ( LAND bitwiseORExpressionNoIn )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LAND) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1256:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND159=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn5030); 
            	    LAND159_tree = (Object)adaptor.create(LAND159);
            	    root_0 = (Object)adaptor.becomeRoot(LAND159_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5033);
            	    bitwiseORExpressionNoIn160=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn160.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalANDExpressionNoIn

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpression
    // JS.g:1259:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR162=null;
        logicalANDExpression_return logicalANDExpression161 = null;

        logicalANDExpression_return logicalANDExpression163 = null;


        Object LOR162_tree=null;

        try {
            // JS.g:1260:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1260:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5048);
            logicalANDExpression161=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression161.getTree());
            // JS.g:1260:25: ( LOR logicalANDExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LOR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JS.g:1260:27: LOR logicalANDExpression
            	    {
            	    LOR162=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression5052); 
            	    LOR162_tree = (Object)adaptor.create(LOR162);
            	    root_0 = (Object)adaptor.becomeRoot(LOR162_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5055);
            	    logicalANDExpression163=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression163.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalORExpression

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpressionNoIn
    // JS.g:1263:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR165=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn164 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn166 = null;


        Object LOR165_tree=null;

        try {
            // JS.g:1264:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1264:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5070);
            logicalANDExpressionNoIn164=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn164.getTree());
            // JS.g:1264:29: ( LOR logicalANDExpressionNoIn )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LOR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1264:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR165=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn5074); 
            	    LOR165_tree = (Object)adaptor.create(LOR165);
            	    root_0 = (Object)adaptor.becomeRoot(LOR165_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5077);
            	    logicalANDExpressionNoIn166=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn166.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalORExpressionNoIn

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionalExpression
    // JS.g:1271:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE168=null;
        Token COLON170=null;
        logicalORExpression_return logicalORExpression167 = null;

        assignmentExpression_return assignmentExpression169 = null;

        assignmentExpression_return assignmentExpression171 = null;


        Object QUE168_tree=null;
        Object COLON170_tree=null;

        try {
            // JS.g:1272:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1272:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression5096);
            logicalORExpression167=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression167.getTree());
            // JS.g:1272:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==QUE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // JS.g:1272:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE168=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression5100); 
                    QUE168_tree = (Object)adaptor.create(QUE168);
                    root_0 = (Object)adaptor.becomeRoot(QUE168_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5103);
                    assignmentExpression169=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression169.getTree());
                    COLON170=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression5105); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5108);
                    assignmentExpression171=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression171.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditionalExpression

    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionalExpressionNoIn
    // JS.g:1275:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE173=null;
        Token COLON175=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn172 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn174 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn176 = null;


        Object QUE173_tree=null;
        Object COLON175_tree=null;

        try {
            // JS.g:1276:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1276:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5122);
            logicalORExpressionNoIn172=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn172.getTree());
            // JS.g:1276:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // JS.g:1276:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE173=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn5126); 
                    QUE173_tree = (Object)adaptor.create(QUE173);
                    root_0 = (Object)adaptor.becomeRoot(QUE173_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5129);
                    assignmentExpressionNoIn174=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn174.getTree());
                    COLON175=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn5131); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5134);
                    assignmentExpressionNoIn176=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn176.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditionalExpressionNoIn

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentExpression
    // JS.g:1305:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator177 = null;

        assignmentExpression_return assignmentExpression178 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1310:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1310:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5162);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1311:2: ({...}? assignmentOperator assignmentExpression )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=ASSIGN && LA45_0<=XORASS)||LA45_0==DIVASS) ) {
                int LA45_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // JS.g:1311:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5169);
                    assignmentOperator177=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator177.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5172);
                    assignmentExpression178=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression178.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentExpression

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentOperator
    // JS.g:1314:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set179=null;

        Object set179_tree=null;

        try {
            // JS.g:1315:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set179=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set179));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentOperator

    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentExpressionNoIn
    // JS.g:1318:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator180 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn181 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1323:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1323:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5250);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1324:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=ASSIGN && LA46_0<=XORASS)||LA46_0==DIVASS) ) {
                int LA46_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // JS.g:1324:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5257);
                    assignmentOperator180=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator180.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5260);
                    assignmentExpressionNoIn181=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn181.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentExpressionNoIn

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // JS.g:1331:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA182=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA182_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1332:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1332:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5282);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1332:32: ( COMMA exprs+= assignmentExpression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // JS.g:1332:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA182=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5286); 
            	    stream_COMMA.add(COMMA182);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5290);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (Object)adaptor.nil();
            // 1333:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1333:28: ^( CEXPR ( $exprs)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1334:2: -> $exprs
            {
                adaptor.addChild(root_0, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionNoIn
    // JS.g:1337:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA183=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA183_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1338:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1338:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5327);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1338:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1338:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA183=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5331); 
            	    stream_COMMA.add(COMMA183);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5335);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (Object)adaptor.nil();
            // 1339:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1339:28: ^( CEXPR ( $exprs)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1340:2: -> $exprs
            {
                adaptor.addChild(root_0, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionNoIn

    public static class semic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start semic
    // JS.g:1365:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC184=null;
        Token EOF185=null;
        Token RBRACE186=null;
        Token EOL187=null;
        Token MultiLineComment188=null;

        Object SEMIC184_tree=null;
        Object EOF185_tree=null;
        Object RBRACE186_tree=null;
        Object EOL187_tree=null;
        Object MultiLineComment188_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1373:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt49=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt49=1;
                }
                break;
            case EOF:
                {
                alt49=2;
                }
                break;
            case RBRACE:
                {
                alt49=3;
                }
                break;
            case EOL:
                {
                alt49=4;
                }
                break;
            case MultiLineComment:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1365:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // JS.g:1373:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC184=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5386); 
                    SEMIC184_tree = (Object)adaptor.create(SEMIC184);
                    adaptor.addChild(root_0, SEMIC184_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1374:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF185=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5391); 
                    EOF185_tree = (Object)adaptor.create(EOF185);
                    adaptor.addChild(root_0, EOF185_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1375:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE186=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5396); 
                    RBRACE186_tree = (Object)adaptor.create(RBRACE186);
                    adaptor.addChild(root_0, RBRACE186_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1376:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL187=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5403); 
                    EOL187_tree = (Object)adaptor.create(EOL187);
                    adaptor.addChild(root_0, EOL187_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1376:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment188=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5407); 
                    MultiLineComment188_tree = (Object)adaptor.create(MultiLineComment188);
                    adaptor.addChild(root_0, MultiLineComment188_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end semic

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // JS.g:1384:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block189 = null;

        statementTail_return statementTail190 = null;



        try {
            // JS.g:1389:2: ({...}? block | statementTail )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LBRACE) ) {
                int LA50_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1384:1: statement options {k=1; } : ({...}? block | statementTail );", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA50_0>=NULL && LA50_0<=BREAK)||(LA50_0>=CONTINUE && LA50_0<=DO)||(LA50_0>=FOR && LA50_0<=IF)||(LA50_0>=NEW && LA50_0<=NAMESPACE)||LA50_0==CONST||LA50_0==LPAREN||LA50_0==LBRACK||LA50_0==SEMIC||(LA50_0>=ADD && LA50_0<=SUB)||(LA50_0>=INC && LA50_0<=DEC)||(LA50_0>=NOT && LA50_0<=INV)||LA50_0==AT||(LA50_0>=XMLFragment && LA50_0<=XMLFragmentEnd)||LA50_0==StringLiteral||(LA50_0>=Identifier && LA50_0<=RegularExpressionLiteral)||(LA50_0>=DecimalLiteral && LA50_0<=HexIntegerLiteral)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1384:1: statement options {k=1; } : ({...}? block | statementTail );", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // JS.g:1389:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5436);
                    block189=block();
                    _fsp--;

                    adaptor.addChild(root_0, block189.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1390:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5441);
                    statementTail190=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail190.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class statementTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statementTail
    // JS.g:1393:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement191 = null;

        emptyStatement_return emptyStatement192 = null;

        expressionStatement_return expressionStatement193 = null;

        ifStatement_return ifStatement194 = null;

        iterationStatement_return iterationStatement195 = null;

        continueStatement_return continueStatement196 = null;

        breakStatement_return breakStatement197 = null;

        returnStatement_return returnStatement198 = null;

        withStatement_return withStatement199 = null;

        labelledStatement_return labelledStatement200 = null;

        switchStatement_return switchStatement201 = null;

        throwStatement_return throwStatement202 = null;

        tryStatement_return tryStatement203 = null;

        constStatement_return constStatement204 = null;

        namespaceStatement_return namespaceStatement205 = null;



        try {
            // JS.g:1394:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt51=15;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt51=1;
                }
                break;
            case SEMIC:
                {
                alt51=2;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case YIELD:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case AT:
            case XMLFragment:
            case XMLFragmentEnd:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt51=3;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                int LA51_4 = input.LA(2);

                if ( (LA51_4==EOF||(LA51_4>=IN && LA51_4<=INSTANCEOF)||(LA51_4>=RBRACE && LA51_4<=LPAREN)||LA51_4==LBRACK||(LA51_4>=DOT && LA51_4<=XOR)||(LA51_4>=LAND && LA51_4<=QUE)||(LA51_4>=ASSIGN && LA51_4<=DIVASS)||(LA51_4>=DOTDOT && LA51_4<=COLONCOLON)||(LA51_4>=EOL && LA51_4<=MultiLineComment)) ) {
                    alt51=3;
                }
                else if ( (LA51_4==COLON) ) {
                    alt51=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1393:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 51, 4, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt51=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt51=5;
                }
                break;
            case CONTINUE:
                {
                alt51=6;
                }
                break;
            case BREAK:
                {
                alt51=7;
                }
                break;
            case RETURN:
                {
                alt51=8;
                }
                break;
            case WITH:
                {
                alt51=9;
                }
                break;
            case SWITCH:
                {
                alt51=11;
                }
                break;
            case THROW:
                {
                alt51=12;
                }
                break;
            case TRY:
                {
                alt51=13;
                }
                break;
            case CONST:
                {
                alt51=14;
                }
                break;
            case DEFAULT:
                {
                alt51=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1393:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // JS.g:1394:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5453);
                    variableStatement191=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement191.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1395:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5458);
                    emptyStatement192=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement192.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1396:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5463);
                    expressionStatement193=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement193.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1397:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5468);
                    ifStatement194=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement194.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1398:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5473);
                    iterationStatement195=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement195.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1399:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5478);
                    continueStatement196=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement196.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1400:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5483);
                    breakStatement197=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement197.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1401:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5488);
                    returnStatement198=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement198.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1402:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5493);
                    withStatement199=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement199.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1403:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5498);
                    labelledStatement200=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement200.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1404:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5503);
                    switchStatement201=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement201.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1405:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5508);
                    throwStatement202=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement202.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1406:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5513);
                    tryStatement203=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement203.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1407:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5518);
                    constStatement204=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement204.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1408:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5523);
                    namespaceStatement205=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement205.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statementTail

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // JS.g:1413:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE207=null;
        statement_return statement206 = null;


        Object lb_tree=null;
        Object RBRACE207_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1414:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1414:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5538); 
            stream_LBRACE.add(lb);

            // JS.g:1414:14: ( statement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=NULL && LA52_0<=BREAK)||(LA52_0>=CONTINUE && LA52_0<=DO)||(LA52_0>=FOR && LA52_0<=IF)||(LA52_0>=NEW && LA52_0<=NAMESPACE)||LA52_0==CONST||LA52_0==LBRACE||LA52_0==LPAREN||LA52_0==LBRACK||LA52_0==SEMIC||(LA52_0>=ADD && LA52_0<=SUB)||(LA52_0>=INC && LA52_0<=DEC)||(LA52_0>=NOT && LA52_0<=INV)||LA52_0==AT||(LA52_0>=XMLFragment && LA52_0<=XMLFragmentEnd)||LA52_0==StringLiteral||(LA52_0>=Identifier && LA52_0<=RegularExpressionLiteral)||(LA52_0>=DecimalLiteral && LA52_0<=HexIntegerLiteral)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // JS.g:1414:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5540);
            	    statement206=statement();
            	    _fsp--;

            	    stream_statement.add(statement206.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            RBRACE207=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5543); 
            stream_RBRACE.add(RBRACE207);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1415:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1415:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1415:28: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block

    public static class variableStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableStatement
    // JS.g:1422:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR208=null;
        Token COMMA210=null;
        variableDeclaration_return variableDeclaration209 = null;

        variableDeclaration_return variableDeclaration211 = null;

        semic_return semic212 = null;


        Object VAR208_tree=null;
        Object COMMA210_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1423:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1423:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR208=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5572); 
            stream_VAR.add(VAR208);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5574);
            variableDeclaration209=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration209.getTree());
            // JS.g:1423:28: ( COMMA variableDeclaration )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JS.g:1423:30: COMMA variableDeclaration
            	    {
            	    COMMA210=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5578); 
            	    stream_COMMA.add(COMMA210);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5580);
            	    variableDeclaration211=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration211.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5585);
            semic212=semic();
            _fsp--;

            stream_semic.add(semic212.getTree());

            // AST REWRITE
            // elements: VAR, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1424:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1424:5: ^( VAR ( variableDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_1);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclaration.next());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableStatement

    public static class typeRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeRef
    // JS.g:1427:1: typeRef : ( identifier | );
    public final typeRef_return typeRef() throws RecognitionException {
        typeRef_return retval = new typeRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier213 = null;



        try {
            // JS.g:1428:2: ( identifier | )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EACH||(LA54_0>=GET && LA54_0<=SET)||(LA54_0>=WXML && LA54_0<=NAMESPACE)||LA54_0==Identifier) ) {
                alt54=1;
            }
            else if ( (LA54_0==EOF||LA54_0==IN||(LA54_0>=LBRACE && LA54_0<=RBRACE)||LA54_0==RPAREN||(LA54_0>=SEMIC && LA54_0<=COMMA)||LA54_0==ASSIGN||(LA54_0>=EOL && LA54_0<=MultiLineComment)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1427:1: typeRef : ( identifier | );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // JS.g:1428:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_typeRef5608);
                    identifier213=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier213.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1429:4: 
                    {
                    root_0 = (Object)adaptor.nil();

                     typeRefExpected(); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end typeRef

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclaration
    // JS.g:1432:1: variableDeclaration : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON215=null;
        Token ASSIGN217=null;
        identifier_return identifier214 = null;

        typeRef_return typeRef216 = null;

        assignmentExpression_return assignmentExpression218 = null;


        Object COLON215_tree=null;
        Object ASSIGN217_tree=null;

        try {
            // JS.g:1433:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? )
            // JS.g:1433:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5624);
            identifier214=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier214.getTree(), root_0);
            // JS.g:1433:16: ({...}? => COLON typeRef )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COLON) && ( isTypeInformationEnabled() )) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // JS.g:1433:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON215=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclaration5632); 
                    COLON215_tree = (Object)adaptor.create(COLON215);
                    adaptor.addChild(root_0, COLON215_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclaration5634);
                    typeRef216=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef216.getTree());

                    }
                    break;

            }

            // JS.g:1433:69: ( ASSIGN assignmentExpression )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ASSIGN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // JS.g:1433:71: ASSIGN assignmentExpression
                    {
                    ASSIGN217=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5641); 
                    ASSIGN217_tree = (Object)adaptor.create(ASSIGN217);
                    adaptor.addChild(root_0, ASSIGN217_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5643);
                    assignmentExpression218=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression218.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableDeclaration

    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclarationNoIn
    // JS.g:1436:1: variableDeclarationNoIn : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON220=null;
        Token ASSIGN222=null;
        identifier_return identifier219 = null;

        typeRef_return typeRef221 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn223 = null;


        Object COLON220_tree=null;
        Object ASSIGN222_tree=null;

        try {
            // JS.g:1437:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1437:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5658);
            identifier219=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier219.getTree(), root_0);
            // JS.g:1437:16: ({...}? => COLON typeRef )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON) && ( isTypeInformationEnabled() )) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // JS.g:1437:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclarationNoIn", " isTypeInformationEnabled() ");
                    }
                    COLON220=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclarationNoIn5666); 
                    COLON220_tree = (Object)adaptor.create(COLON220);
                    adaptor.addChild(root_0, COLON220_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclarationNoIn5668);
                    typeRef221=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef221.getTree());

                    }
                    break;

            }

            // JS.g:1437:69: ( ASSIGN assignmentExpressionNoIn )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ASSIGN) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // JS.g:1437:71: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN222=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5675); 
                    ASSIGN222_tree = (Object)adaptor.create(ASSIGN222);
                    adaptor.addChild(root_0, ASSIGN222_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5677);
                    assignmentExpressionNoIn223=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn223.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableDeclarationNoIn

    public static class constStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constStatement
    // JS.g:1440:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST224=null;
        Token COMMA226=null;
        variableDeclaration_return variableDeclaration225 = null;

        variableDeclaration_return variableDeclaration227 = null;

        semic_return semic228 = null;


        Object CONST224_tree=null;
        Object COMMA226_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1441:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1441:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST224=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5692); 
            stream_CONST.add(CONST224);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5694);
            variableDeclaration225=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration225.getTree());
            // JS.g:1441:31: ( COMMA variableDeclaration )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==COMMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // JS.g:1441:33: COMMA variableDeclaration
            	    {
            	    COMMA226=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5698); 
            	    stream_COMMA.add(COMMA226);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5700);
            	    variableDeclaration227=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration227.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5705);
            semic228=semic();
            _fsp--;

            stream_semic.add(semic228.getTree());

            // AST REWRITE
            // elements: CONST, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1442:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1442:6: ^( CONST ( variableDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CONST.next(), root_1);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclaration.next());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end constStatement

    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start emptyStatement
    // JS.g:1449:1: emptyStatement : SEMIC -> EMPTY_STATEMENT[$SEMIC] ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC229=null;

        Object SEMIC229_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");

        try {
            // JS.g:1450:2: ( SEMIC -> EMPTY_STATEMENT[$SEMIC] )
            // JS.g:1450:4: SEMIC
            {
            SEMIC229=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5735); 
            stream_SEMIC.add(SEMIC229);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1450:10: -> EMPTY_STATEMENT[$SEMIC]
            {
                adaptor.addChild(root_0, adaptor.create(EMPTY_STATEMENT, SEMIC229));

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end emptyStatement

    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionStatement
    // JS.g:1463:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression230 = null;

        semic_return semic231 = null;



        try {
            // JS.g:1464:2: ( expression semic )
            // JS.g:1464:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5758);
            expression230=expression();
            _fsp--;

            adaptor.addChild(root_0, expression230.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5760);
            semic231=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionStatement

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifStatement
    // JS.g:1471:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF232=null;
        Token LPAREN233=null;
        Token RPAREN235=null;
        Token ELSE237=null;
        expression_return expression234 = null;

        statement_return statement236 = null;

        statement_return statement238 = null;


        Object IF232_tree=null;
        Object LPAREN233_tree=null;
        Object RPAREN235_tree=null;
        Object ELSE237_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1473:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1473:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF232=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5778); 
            stream_IF.add(IF232);

            LPAREN233=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5780); 
            stream_LPAREN.add(LPAREN233);

            pushFollow(FOLLOW_expression_in_ifStatement5782);
            expression234=expression();
            _fsp--;

            stream_expression.add(expression234.getTree());
            RPAREN235=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5784); 
            stream_RPAREN.add(RPAREN235);

            pushFollow(FOLLOW_statement_in_ifStatement5786);
            statement236=statement();
            _fsp--;

            stream_statement.add(statement236.getTree());
            // JS.g:1473:42: ({...}? ELSE statement )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==ELSE) ) {
                int LA60_1 = input.LA(2);

                if ( ( input.LA(1) == ELSE ) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // JS.g:1473:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE237=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5792); 
                    stream_ELSE.add(ELSE237);

                    pushFollow(FOLLOW_statement_in_ifStatement5794);
                    statement238=statement();
                    _fsp--;

                    stream_statement.add(statement238.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IF, expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1474:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1474:5: ^( IF expression ( statement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ifStatement

    public static class iterationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start iterationStatement
    // JS.g:1481:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement239 = null;

        whileStatement_return whileStatement240 = null;

        forEachStatement_return forEachStatement241 = null;

        forStatement_return forStatement242 = null;



        try {
            // JS.g:1482:2: ( doStatement | whileStatement | forEachStatement | forStatement )
            int alt61=4;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt61=1;
                }
                break;
            case WHILE:
                {
                alt61=2;
                }
                break;
            case FOR:
                {
                int LA61_3 = input.LA(2);

                if ( (LA61_3==EACH) ) {
                    alt61=3;
                }
                else if ( (LA61_3==LPAREN) ) {
                    alt61=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1481:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 61, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1481:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // JS.g:1482:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5827);
                    doStatement239=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement239.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1483:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5832);
                    whileStatement240=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement240.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1484:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5837);
                    forEachStatement241=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement241.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1485:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5842);
                    forStatement242=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement242.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end iterationStatement

    public static class doStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start doStatement
    // JS.g:1488:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO243=null;
        Token WHILE245=null;
        Token LPAREN246=null;
        Token RPAREN248=null;
        statement_return statement244 = null;

        expression_return expression247 = null;

        semic_return semic249 = null;


        Object DO243_tree=null;
        Object WHILE245_tree=null;
        Object LPAREN246_tree=null;
        Object RPAREN248_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1489:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1489:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO243=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5854); 
            stream_DO.add(DO243);

            pushFollow(FOLLOW_statement_in_doStatement5856);
            statement244=statement();
            _fsp--;

            stream_statement.add(statement244.getTree());
            WHILE245=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5858); 
            stream_WHILE.add(WHILE245);

            LPAREN246=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5860); 
            stream_LPAREN.add(LPAREN246);

            pushFollow(FOLLOW_expression_in_doStatement5862);
            expression247=expression();
            _fsp--;

            stream_expression.add(expression247.getTree());
            RPAREN248=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5864); 
            stream_RPAREN.add(RPAREN248);

            pushFollow(FOLLOW_semic_in_doStatement5866);
            semic249=semic();
            _fsp--;

            stream_semic.add(semic249.getTree());

            // AST REWRITE
            // elements: DO, expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1490:2: -> ^( DO statement expression )
            {
                // JS.g:1490:5: ^( DO statement expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DO.next(), root_1);

                adaptor.addChild(root_1, stream_statement.next());
                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end doStatement

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whileStatement
    // JS.g:1493:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE250=null;
        Token LPAREN251=null;
        Token RPAREN253=null;
        expression_return expression252 = null;

        statement_return statement254 = null;


        Object WHILE250_tree=null;
        Object LPAREN251_tree=null;
        Object RPAREN253_tree=null;

        try {
            // JS.g:1494:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1494:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE250=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5891); 
            WHILE250_tree = (Object)adaptor.create(WHILE250);
            root_0 = (Object)adaptor.becomeRoot(WHILE250_tree, root_0);

            LPAREN251=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5894); 
            pushFollow(FOLLOW_expression_in_whileStatement5897);
            expression252=expression();
            _fsp--;

            adaptor.addChild(root_0, expression252.getTree());
            RPAREN253=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5899); 
            pushFollow(FOLLOW_statement_in_whileStatement5902);
            statement254=statement();
            _fsp--;

            adaptor.addChild(root_0, statement254.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end whileStatement

    public static class forEachStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forEachStatement
    // JS.g:1539:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH255=null;
        Token LPAREN256=null;
        Token RPAREN258=null;
        forEachControl_return forEachControl257 = null;

        statement_return statement259 = null;


        Object forKeyword_tree=null;
        Object EACH255_tree=null;
        Object LPAREN256_tree=null;
        Object RPAREN258_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1540:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1540:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5919); 
            stream_FOR.add(forKeyword);

            EACH255=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5921); 
            stream_EACH.add(EACH255);

            LPAREN256=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5923); 
            stream_LPAREN.add(LPAREN256);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5925);
            forEachControl257=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl257.getTree());
            RPAREN258=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5927); 
            stream_RPAREN.add(RPAREN258);

            pushFollow(FOLLOW_statement_in_forEachStatement5929);
            statement259=statement();
            _fsp--;

            stream_statement.add(statement259.getTree());

            // AST REWRITE
            // elements: statement, forEachControl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1541:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1541:7: ^( FOREACH[$forKeyword] forEachControl statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOREACH, forKeyword), root_1);

                adaptor.addChild(root_1, stream_forEachControl.next());
                adaptor.addChild(root_1, stream_statement.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forEachStatement

    public static class forEachControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forEachControl
    // JS.g:1544:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar260 = null;

        forControlExpression_return forControlExpression261 = null;



        try {
            // JS.g:1545:3: ( forControlVar | forControlExpression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==VAR) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=NULL && LA62_0<=FALSE)||LA62_0==DELETE||(LA62_0>=EACH && LA62_0<=FUNCTION)||LA62_0==NEW||LA62_0==THIS||LA62_0==TYPEOF||LA62_0==VOID||(LA62_0>=GET && LA62_0<=NAMESPACE)||LA62_0==LBRACE||LA62_0==LPAREN||LA62_0==LBRACK||(LA62_0>=ADD && LA62_0<=SUB)||(LA62_0>=INC && LA62_0<=DEC)||(LA62_0>=NOT && LA62_0<=INV)||LA62_0==AT||(LA62_0>=XMLFragment && LA62_0<=XMLFragmentEnd)||LA62_0==StringLiteral||(LA62_0>=Identifier && LA62_0<=RegularExpressionLiteral)||(LA62_0>=DecimalLiteral && LA62_0<=HexIntegerLiteral)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1544:1: forEachControl : ( forControlVar | forControlExpression );", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // JS.g:1545:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5957);
                    forControlVar260=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar260.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1546:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5963);
                    forControlExpression261=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression261.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forEachControl

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forStatement
    // JS.g:1549:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR262=null;
        Token LPAREN263=null;
        Token RPAREN265=null;
        forControl_return forControl264 = null;

        statement_return statement266 = null;


        Object FOR262_tree=null;
        Object LPAREN263_tree=null;
        Object RPAREN265_tree=null;

        try {
            // JS.g:1550:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1550:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR262=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5975); 
            FOR262_tree = (Object)adaptor.create(FOR262);
            root_0 = (Object)adaptor.becomeRoot(FOR262_tree, root_0);

            LPAREN263=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5978); 
            pushFollow(FOLLOW_forControl_in_forStatement5981);
            forControl264=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl264.getTree());
            RPAREN265=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5983); 
            pushFollow(FOLLOW_statement_in_forStatement5986);
            statement266=statement();
            _fsp--;

            adaptor.addChild(root_0, statement266.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forStatement

    public static class forControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControl
    // JS.g:1553:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar267 = null;

        forControlExpression_return forControlExpression268 = null;

        forControlSemic_return forControlSemic269 = null;



        try {
            // JS.g:1554:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt63=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt63=1;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case EACH:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case GET:
            case SET:
            case YIELD:
            case WXML:
            case NAMESPACE:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case AT:
            case XMLFragment:
            case XMLFragmentEnd:
            case StringLiteral:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt63=2;
                }
                break;
            case SEMIC:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1553:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // JS.g:1554:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5997);
                    forControlVar267=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar267.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1555:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl6002);
                    forControlExpression268=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression268.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1556:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl6007);
                    forControlSemic269=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic269.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControl

    public static class forControlVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControlVar
    // JS.g:1559:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR270=null;
        Token IN272=null;
        Token COMMA274=null;
        Token SEMIC276=null;
        Token SEMIC277=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn271 = null;

        expression_return expression273 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn275 = null;


        Object VAR270_tree=null;
        Object IN272_tree=null;
        Object COMMA274_tree=null;
        Object SEMIC276_tree=null;
        Object SEMIC277_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1560:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1560:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR270=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar6018); 
            stream_VAR.add(VAR270);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6020);
            variableDeclarationNoIn271=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn271.getTree());
            // JS.g:1561:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IN) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=SEMIC && LA67_0<=COMMA)) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1561:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // JS.g:1562:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1562:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1563:4: IN expression
                    {
                    IN272=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar6032); 
                    stream_IN.add(IN272);

                    pushFollow(FOLLOW_expression_in_forControlVar6034);
                    expression273=expression();
                    _fsp--;

                    stream_expression.add(expression273.getTree());

                    // AST REWRITE
                    // elements: variableDeclarationNoIn, VAR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1564:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1564:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1564:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1564:51: ^( EXPR expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_expression.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;
                case 2 :
                    // JS.g:1567:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1567:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1568:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1568:4: ( COMMA variableDeclarationNoIn )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==COMMA) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // JS.g:1568:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA274=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar6080); 
                    	    stream_COMMA.add(COMMA274);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6082);
                    	    variableDeclarationNoIn275=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn275.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    SEMIC276=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6087); 
                    stream_SEMIC.add(SEMIC276);

                    // JS.g:1568:48: (ex1= expression )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=NULL && LA65_0<=FALSE)||LA65_0==DELETE||(LA65_0>=EACH && LA65_0<=FUNCTION)||LA65_0==NEW||LA65_0==THIS||LA65_0==TYPEOF||LA65_0==VOID||(LA65_0>=GET && LA65_0<=NAMESPACE)||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)||LA65_0==AT||(LA65_0>=XMLFragment && LA65_0<=XMLFragmentEnd)||LA65_0==StringLiteral||(LA65_0>=Identifier && LA65_0<=RegularExpressionLiteral)||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // JS.g:1568:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6091);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC277=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6094); 
                    stream_SEMIC.add(SEMIC277);

                    // JS.g:1568:70: (ex2= expression )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==DELETE||(LA66_0>=EACH && LA66_0<=FUNCTION)||LA66_0==NEW||LA66_0==THIS||LA66_0==TYPEOF||LA66_0==VOID||(LA66_0>=GET && LA66_0<=NAMESPACE)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||LA66_0==AT||(LA66_0>=XMLFragment && LA66_0<=XMLFragmentEnd)||LA66_0==StringLiteral||(LA66_0>=Identifier && LA66_0<=RegularExpressionLiteral)||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // JS.g:1568:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6098);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex1, VAR, variableDeclarationNoIn, ex2
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1569:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1569:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1569:18: ^( VAR ( variableDeclarationNoIn )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        if ( !(stream_variableDeclarationNoIn.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclarationNoIn.hasNext() ) {
                            adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        }
                        stream_variableDeclarationNoIn.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1569:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1569:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1569:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1569:76: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControlVar

    public static class forControlExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControlExpression
    // JS.g:1574:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN278=null;
        Token SEMIC279=null;
        Token SEMIC280=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN278_tree=null;
        Object SEMIC279_tree=null;
        Object SEMIC280_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1579:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1579:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6164);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1580:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IN) ) {
                alt70=1;
            }
            else if ( (LA70_0==SEMIC) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1580:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // JS.g:1581:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1581:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1582:4: IN ex2= expression
                    {
                    IN278=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression6179); 
                    stream_IN.add(IN278);

                    pushFollow(FOLLOW_expression_in_forControlExpression6183);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    // AST REWRITE
                    // elements: ex1, ex2
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1583:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1583:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1583:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1583:33: ^( EXPR $ex2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex2.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;
                case 2 :
                    // JS.g:1586:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1586:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1587:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC279=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6229); 
                    stream_SEMIC.add(SEMIC279);

                    // JS.g:1587:13: (ex2= expression )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=NULL && LA68_0<=FALSE)||LA68_0==DELETE||(LA68_0>=EACH && LA68_0<=FUNCTION)||LA68_0==NEW||LA68_0==THIS||LA68_0==TYPEOF||LA68_0==VOID||(LA68_0>=GET && LA68_0<=NAMESPACE)||LA68_0==LBRACE||LA68_0==LPAREN||LA68_0==LBRACK||(LA68_0>=ADD && LA68_0<=SUB)||(LA68_0>=INC && LA68_0<=DEC)||(LA68_0>=NOT && LA68_0<=INV)||LA68_0==AT||(LA68_0>=XMLFragment && LA68_0<=XMLFragmentEnd)||LA68_0==StringLiteral||(LA68_0>=Identifier && LA68_0<=RegularExpressionLiteral)||(LA68_0>=DecimalLiteral && LA68_0<=HexIntegerLiteral)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // JS.g:1587:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6233);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC280=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6236); 
                    stream_SEMIC.add(SEMIC280);

                    // JS.g:1587:35: (ex3= expression )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==DELETE||(LA69_0>=EACH && LA69_0<=FUNCTION)||LA69_0==NEW||LA69_0==THIS||LA69_0==TYPEOF||LA69_0==VOID||(LA69_0>=GET && LA69_0<=NAMESPACE)||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||LA69_0==AT||(LA69_0>=XMLFragment && LA69_0<=XMLFragmentEnd)||LA69_0==StringLiteral||(LA69_0>=Identifier && LA69_0<=RegularExpressionLiteral)||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // JS.g:1587:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6240);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex2, ex3, ex1
                    // token labels: 
                    // rule labels: retval, ex3, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"token ex3",ex3!=null?ex3.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1588:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1588:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1588:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1588:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1588:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1588:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1588:57: ( $ex3)?
                        if ( stream_ex3.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex3.next());

                        }
                        stream_ex3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControlExpression

    public static class forControlSemic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControlSemic
    // JS.g:1593:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC281=null;
        Token SEMIC282=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC281_tree=null;
        Object SEMIC282_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1594:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1594:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC281=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6299); 
            stream_SEMIC.add(SEMIC281);

            // JS.g:1594:13: (ex1= expression )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=NULL && LA71_0<=FALSE)||LA71_0==DELETE||(LA71_0>=EACH && LA71_0<=FUNCTION)||LA71_0==NEW||LA71_0==THIS||LA71_0==TYPEOF||LA71_0==VOID||(LA71_0>=GET && LA71_0<=NAMESPACE)||LA71_0==LBRACE||LA71_0==LPAREN||LA71_0==LBRACK||(LA71_0>=ADD && LA71_0<=SUB)||(LA71_0>=INC && LA71_0<=DEC)||(LA71_0>=NOT && LA71_0<=INV)||LA71_0==AT||(LA71_0>=XMLFragment && LA71_0<=XMLFragmentEnd)||LA71_0==StringLiteral||(LA71_0>=Identifier && LA71_0<=RegularExpressionLiteral)||(LA71_0>=DecimalLiteral && LA71_0<=HexIntegerLiteral)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1594:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6303);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC282=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6306); 
            stream_SEMIC.add(SEMIC282);

            // JS.g:1594:35: (ex2= expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=NULL && LA72_0<=FALSE)||LA72_0==DELETE||(LA72_0>=EACH && LA72_0<=FUNCTION)||LA72_0==NEW||LA72_0==THIS||LA72_0==TYPEOF||LA72_0==VOID||(LA72_0>=GET && LA72_0<=NAMESPACE)||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||LA72_0==AT||(LA72_0>=XMLFragment && LA72_0<=XMLFragmentEnd)||LA72_0==StringLiteral||(LA72_0>=Identifier && LA72_0<=RegularExpressionLiteral)||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1594:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6310);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ex2, ex1
            // token labels: 
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1595:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1595:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1595:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1595:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1595:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1595:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1595:50: ( $ex2)?
                if ( stream_ex2.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex2.next());

                }
                stream_ex2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControlSemic

    public static class continueStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start continueStatement
    // JS.g:1607:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE283=null;
        Token Identifier284=null;
        semic_return semic285 = null;


        Object CONTINUE283_tree=null;
        Object Identifier284_tree=null;

        try {
            // JS.g:1608:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1608:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE283=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6364); 
            CONTINUE283_tree = (Object)adaptor.create(CONTINUE283);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE283_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1608:67: ( Identifier )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Identifier) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1608:67: Identifier
                    {
                    Identifier284=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6369); 
                    Identifier284_tree = (Object)adaptor.create(Identifier284);
                    adaptor.addChild(root_0, Identifier284_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6372);
            semic285=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end continueStatement

    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start breakStatement
    // JS.g:1620:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK286=null;
        Token Identifier287=null;
        semic_return semic288 = null;


        Object BREAK286_tree=null;
        Object Identifier287_tree=null;

        try {
            // JS.g:1621:2: ( BREAK ( Identifier )? semic )
            // JS.g:1621:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK286=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6391); 
            BREAK286_tree = (Object)adaptor.create(BREAK286);
            root_0 = (Object)adaptor.becomeRoot(BREAK286_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1621:64: ( Identifier )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Identifier) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1621:64: Identifier
                    {
                    Identifier287=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6396); 
                    Identifier287_tree = (Object)adaptor.create(Identifier287);
                    adaptor.addChild(root_0, Identifier287_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6399);
            semic288=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end breakStatement

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start returnStatement
    // JS.g:1641:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN289=null;
        expression_return expression290 = null;

        semic_return semic291 = null;


        Object RETURN289_tree=null;

        try {
            // JS.g:1642:2: ( RETURN ( expression )? semic )
            // JS.g:1642:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN289=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6418); 
            RETURN289_tree = (Object)adaptor.create(RETURN289);
            root_0 = (Object)adaptor.becomeRoot(RETURN289_tree, root_0);

             promoteEOL(null); 
            // JS.g:1642:34: ( expression )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=NULL && LA75_0<=FALSE)||LA75_0==DELETE||(LA75_0>=EACH && LA75_0<=FUNCTION)||LA75_0==NEW||LA75_0==THIS||LA75_0==TYPEOF||LA75_0==VOID||(LA75_0>=GET && LA75_0<=NAMESPACE)||LA75_0==LBRACE||LA75_0==LPAREN||LA75_0==LBRACK||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)||LA75_0==AT||(LA75_0>=XMLFragment && LA75_0<=XMLFragmentEnd)||LA75_0==StringLiteral||(LA75_0>=Identifier && LA75_0<=RegularExpressionLiteral)||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1642:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6423);
                    expression290=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression290.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6426);
            semic291=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end returnStatement

    public static class withStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start withStatement
    // JS.g:1649:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH292=null;
        Token LPAREN293=null;
        Token RPAREN295=null;
        expression_return expression294 = null;

        statement_return statement296 = null;


        Object WITH292_tree=null;
        Object LPAREN293_tree=null;
        Object RPAREN295_tree=null;

        try {
            // JS.g:1650:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1650:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH292=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6443); 
            WITH292_tree = (Object)adaptor.create(WITH292);
            root_0 = (Object)adaptor.becomeRoot(WITH292_tree, root_0);

            LPAREN293=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6446); 
            pushFollow(FOLLOW_expression_in_withStatement6449);
            expression294=expression();
            _fsp--;

            adaptor.addChild(root_0, expression294.getTree());
            RPAREN295=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6451); 
            pushFollow(FOLLOW_statement_in_withStatement6454);
            statement296=statement();
            _fsp--;

            adaptor.addChild(root_0, statement296.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end withStatement

    public static class switchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start switchStatement
    // JS.g:1657:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH297=null;
        Token LPAREN298=null;
        Token RPAREN300=null;
        Token LBRACE301=null;
        Token RBRACE304=null;
        expression_return expression299 = null;

        defaultClause_return defaultClause302 = null;

        caseClause_return caseClause303 = null;


        Object SWITCH297_tree=null;
        Object LPAREN298_tree=null;
        Object RPAREN300_tree=null;
        Object LBRACE301_tree=null;
        Object RBRACE304_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");
        try {
            // JS.g:1658:2: ( SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) )
            // JS.g:1658:4: SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE
            {
            SWITCH297=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6470); 
            stream_SWITCH.add(SWITCH297);

            LPAREN298=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6472); 
            stream_LPAREN.add(LPAREN298);

            pushFollow(FOLLOW_expression_in_switchStatement6474);
            expression299=expression();
            _fsp--;

            stream_expression.add(expression299.getTree());
            RPAREN300=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6476); 
            stream_RPAREN.add(RPAREN300);

            LBRACE301=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6478); 
            stream_LBRACE.add(LBRACE301);

            // JS.g:1658:43: ( defaultClause | caseClause )*
            loop76:
            do {
                int alt76=3;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==DEFAULT) ) {
                    alt76=1;
                }
                else if ( (LA76_0==CASE) ) {
                    alt76=2;
                }


                switch (alt76) {
            	case 1 :
            	    // JS.g:1658:45: defaultClause
            	    {
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6482);
            	    defaultClause302=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause302.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1658:61: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6486);
            	    caseClause303=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause303.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            RBRACE304=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6491); 
            stream_RBRACE.add(RBRACE304);


            // AST REWRITE
            // elements: SWITCH, defaultClause, caseClause, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1659:2: -> ^( SWITCH expression ( defaultClause )* ( caseClause )* )
            {
                // JS.g:1659:5: ^( SWITCH expression ( defaultClause )* ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1659:26: ( defaultClause )*
                while ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1659:41: ( caseClause )*
                while ( stream_caseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseClause.next());

                }
                stream_caseClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end switchStatement

    public static class caseClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start caseClause
    // JS.g:1662:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE305=null;
        Token COLON307=null;
        expression_return expression306 = null;

        statement_return statement308 = null;


        Object CASE305_tree=null;
        Object COLON307_tree=null;

        try {
            // JS.g:1663:2: ( CASE expression COLON ( statement )* )
            // JS.g:1663:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE305=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6519); 
            CASE305_tree = (Object)adaptor.create(CASE305);
            root_0 = (Object)adaptor.becomeRoot(CASE305_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6522);
            expression306=expression();
            _fsp--;

            adaptor.addChild(root_0, expression306.getTree());
            COLON307=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6524); 
            // JS.g:1663:28: ( statement )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DEFAULT) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==WXML) ) {
                        alt77=1;
                    }


                }
                else if ( ((LA77_0>=NULL && LA77_0<=BREAK)||LA77_0==CONTINUE||(LA77_0>=DELETE && LA77_0<=DO)||(LA77_0>=FOR && LA77_0<=IF)||(LA77_0>=NEW && LA77_0<=NAMESPACE)||LA77_0==CONST||LA77_0==LBRACE||LA77_0==LPAREN||LA77_0==LBRACK||LA77_0==SEMIC||(LA77_0>=ADD && LA77_0<=SUB)||(LA77_0>=INC && LA77_0<=DEC)||(LA77_0>=NOT && LA77_0<=INV)||LA77_0==AT||(LA77_0>=XMLFragment && LA77_0<=XMLFragmentEnd)||LA77_0==StringLiteral||(LA77_0>=Identifier && LA77_0<=RegularExpressionLiteral)||(LA77_0>=DecimalLiteral && LA77_0<=HexIntegerLiteral)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // JS.g:1663:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6527);
            	    statement308=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement308.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end caseClause

    public static class defaultClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start defaultClause
    // JS.g:1666:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT309=null;
        Token COLON310=null;
        statement_return statement311 = null;


        Object DEFAULT309_tree=null;
        Object COLON310_tree=null;

        try {
            // JS.g:1667:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1667:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT309=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6540); 
            DEFAULT309_tree = (Object)adaptor.create(DEFAULT309);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT309_tree, root_0);

            COLON310=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6543); 
            // JS.g:1667:20: ( statement )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==DEFAULT) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==WXML) ) {
                        alt78=1;
                    }


                }
                else if ( ((LA78_0>=NULL && LA78_0<=BREAK)||LA78_0==CONTINUE||(LA78_0>=DELETE && LA78_0<=DO)||(LA78_0>=FOR && LA78_0<=IF)||(LA78_0>=NEW && LA78_0<=NAMESPACE)||LA78_0==CONST||LA78_0==LBRACE||LA78_0==LPAREN||LA78_0==LBRACK||LA78_0==SEMIC||(LA78_0>=ADD && LA78_0<=SUB)||(LA78_0>=INC && LA78_0<=DEC)||(LA78_0>=NOT && LA78_0<=INV)||LA78_0==AT||(LA78_0>=XMLFragment && LA78_0<=XMLFragmentEnd)||LA78_0==StringLiteral||(LA78_0>=Identifier && LA78_0<=RegularExpressionLiteral)||(LA78_0>=DecimalLiteral && LA78_0<=HexIntegerLiteral)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JS.g:1667:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6546);
            	    statement311=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement311.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end defaultClause

    public static class labelledStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start labelledStatement
    // JS.g:1674:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON313=null;
        identifier_return identifier312 = null;

        statement_return statement314 = null;


        Object COLON313_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1675:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1675:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6563);
            identifier312=identifier();
            _fsp--;

            stream_identifier.add(identifier312.getTree());
            COLON313=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6565); 
            stream_COLON.add(COLON313);

            pushFollow(FOLLOW_statement_in_labelledStatement6567);
            statement314=statement();
            _fsp--;

            stream_statement.add(statement314.getTree());

            // AST REWRITE
            // elements: statement, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1676:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1676:5: ^( LABELLED identifier statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(LABELLED, "LABELLED"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                adaptor.addChild(root_1, stream_statement.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end labelledStatement

    public static class throwStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start throwStatement
    // JS.g:1698:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW315=null;
        expression_return expression316 = null;

        semic_return semic317 = null;


        Object THROW315_tree=null;

        try {
            // JS.g:1699:2: ( THROW expression semic )
            // JS.g:1699:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW315=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6598); 
            THROW315_tree = (Object)adaptor.create(THROW315);
            root_0 = (Object)adaptor.becomeRoot(THROW315_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6603);
            expression316=expression();
            _fsp--;

            adaptor.addChild(root_0, expression316.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6605);
            semic317=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end throwStatement

    public static class tryStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tryStatement
    // JS.g:1706:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY318=null;
        block_return block319 = null;

        catchClause_return catchClause320 = null;

        finallyClause_return finallyClause321 = null;

        finallyClause_return finallyClause322 = null;


        Object TRY318_tree=null;

        try {
            // JS.g:1707:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1707:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY318=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6622); 
            TRY318_tree = (Object)adaptor.create(TRY318);
            root_0 = (Object)adaptor.becomeRoot(TRY318_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6625);
            block319=block();
            _fsp--;

            adaptor.addChild(root_0, block319.getTree());
            // JS.g:1707:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==CATCH) ) {
                alt81=1;
            }
            else if ( (LA81_0==FINALLY) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1707:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // JS.g:1707:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1707:17: ( catchClause )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==CATCH) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // JS.g:1707:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6629);
                    	    catchClause320=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause320.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);

                    // JS.g:1707:30: ( finallyClause )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==FINALLY) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // JS.g:1707:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6632);
                            finallyClause321=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause321.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1707:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6637);
                    finallyClause322=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause322.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tryStatement

    public static class catchClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start catchClause
    // JS.g:1710:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH323=null;
        Token LPAREN324=null;
        Token RPAREN327=null;
        identifier_return identifier325 = null;

        catchFilter_return catchFilter326 = null;

        block_return block328 = null;


        Object CATCH323_tree=null;
        Object LPAREN324_tree=null;
        Object RPAREN327_tree=null;

        try {
            // JS.g:1711:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1711:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH323=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6651); 
            CATCH323_tree = (Object)adaptor.create(CATCH323);
            root_0 = (Object)adaptor.becomeRoot(CATCH323_tree, root_0);

            LPAREN324=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6654); 
            pushFollow(FOLLOW_identifier_in_catchClause6657);
            identifier325=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier325.getTree());
            // JS.g:1711:30: ( catchFilter )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IF) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // JS.g:1711:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6659);
                    catchFilter326=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter326.getTree());

                    }
                    break;

            }

            RPAREN327=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6662); 
            pushFollow(FOLLOW_block_in_catchClause6665);
            block328=block();
            _fsp--;

            adaptor.addChild(root_0, block328.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end catchClause

    public static class catchFilter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start catchFilter
    // JS.g:1714:1: catchFilter : IF expression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF329=null;
        expression_return expression330 = null;


        Object IF329_tree=null;

        try {
            // JS.g:1715:2: ( IF expression )
            // JS.g:1715:4: IF expression
            {
            root_0 = (Object)adaptor.nil();

            IF329=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6676); 
            IF329_tree = (Object)adaptor.create(IF329);
            adaptor.addChild(root_0, IF329_tree);

            pushFollow(FOLLOW_expression_in_catchFilter6678);
            expression330=expression();
            _fsp--;

            adaptor.addChild(root_0, expression330.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end catchFilter

    public static class finallyClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start finallyClause
    // JS.g:1718:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY331=null;
        block_return block332 = null;


        Object FINALLY331_tree=null;

        try {
            // JS.g:1719:2: ( FINALLY block )
            // JS.g:1719:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY331=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6690); 
            FINALLY331_tree = (Object)adaptor.create(FINALLY331);
            root_0 = (Object)adaptor.becomeRoot(FINALLY331_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6693);
            block332=block();
            _fsp--;

            adaptor.addChild(root_0, block332.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end finallyClause

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionDeclaration
    // JS.g:1732:1: functionDeclaration : FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION333=null;
        Token COLON335=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList334 = null;

        typeRef_return typeRef336 = null;

        functionBody_return functionBody337 = null;


        Object FUNCTION333_tree=null;
        Object COLON335_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1733:2: ( FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody ) )
            // JS.g:1733:4: FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION333=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6714); 
            stream_FUNCTION.add(FUNCTION333);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6718);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6720);
            formalParameterList334=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList334.getTree());
            // JS.g:1733:49: ({...}? => COLON typeRef )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==COLON) && ( isTypeInformationEnabled() )) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // JS.g:1733:51: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON335=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionDeclaration6727); 
                    stream_COLON.add(COLON335);

                    pushFollow(FOLLOW_typeRef_in_functionDeclaration6729);
                    typeRef336=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef336.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionDeclaration6734);
            functionBody337=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody337.getTree());

            // AST REWRITE
            // elements: name, FUNCTION, formalParameterList, COLON, functionBody, typeRef
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1734:2: -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody )
            {
                // JS.g:1734:5: ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1734:43: ( COLON )?
                if ( stream_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_COLON.next());

                }
                stream_COLON.reset();
                // JS.g:1734:50: ( typeRef )?
                if ( stream_typeRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeRef.next());

                }
                stream_typeRef.reset();
                adaptor.addChild(root_1, stream_functionBody.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionDeclaration

    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionExpression
    // JS.g:1737:1: functionExpression : FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION338=null;
        Token COLON340=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList339 = null;

        typeRef_return typeRef341 = null;

        functionBody_return functionBody342 = null;


        Object FUNCTION338_tree=null;
        Object COLON340_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1738:2: ( FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1738:4: FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION338=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6767); 
            stream_FUNCTION.add(FUNCTION338);

            // JS.g:1738:17: (name= identifier )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EACH||(LA84_0>=GET && LA84_0<=SET)||(LA84_0>=WXML && LA84_0<=NAMESPACE)||LA84_0==Identifier) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // JS.g:1738:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6771);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6774);
            formalParameterList339=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList339.getTree());
            // JS.g:1738:50: ({...}? => COLON typeRef )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==COLON) && ( isTypeInformationEnabled() )) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // JS.g:1738:52: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionExpression", " isTypeInformationEnabled() ");
                    }
                    COLON340=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionExpression6781); 
                    stream_COLON.add(COLON340);

                    pushFollow(FOLLOW_typeRef_in_functionExpression6783);
                    typeRef341=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef341.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionExpression6788);
            functionBody342=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody342.getTree());

            // AST REWRITE
            // elements: name, formalParameterList, FUNCTION, functionBody
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1739:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1739:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1739:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.next());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.next());
                adaptor.addChild(root_1, stream_functionBody.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionExpression

    public static class formalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameter
    // JS.g:1742:1: formalParameter : identifier ({...}? => COLON typeRef )? ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON344=null;
        identifier_return identifier343 = null;

        typeRef_return typeRef345 = null;


        Object COLON344_tree=null;

        try {
            // JS.g:1743:2: ( identifier ({...}? => COLON typeRef )? )
            // JS.g:1743:4: identifier ({...}? => COLON typeRef )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameter6816);
            identifier343=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier343.getTree(), root_0);
            // JS.g:1743:16: ({...}? => COLON typeRef )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==COLON) && ( isTypeInformationEnabled() )) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // JS.g:1743:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "formalParameter", " isTypeInformationEnabled() ");
                    }
                    COLON344=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_formalParameter6824); 
                    COLON344_tree = (Object)adaptor.create(COLON344);
                    adaptor.addChild(root_0, COLON344_tree);

                    pushFollow(FOLLOW_typeRef_in_formalParameter6826);
                    typeRef345=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef345.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end formalParameter

    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameterList
    // JS.g:1746:1: formalParameterList : LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN346=null;
        Token COMMA348=null;
        Token RPAREN350=null;
        formalParameter_return formalParameter347 = null;

        formalParameter_return formalParameter349 = null;


        Object LPAREN346_tree=null;
        Object COMMA348_tree=null;
        Object RPAREN350_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // JS.g:1747:2: ( LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) )
            // JS.g:1747:4: LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN
            {
            LPAREN346=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6840); 
            stream_LPAREN.add(LPAREN346);

            // JS.g:1747:11: ( formalParameter ( COMMA formalParameter )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==EACH||(LA88_0>=GET && LA88_0<=SET)||(LA88_0>=WXML && LA88_0<=NAMESPACE)||LA88_0==Identifier) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // JS.g:1747:13: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_formalParameterList6844);
                    formalParameter347=formalParameter();
                    _fsp--;

                    stream_formalParameter.add(formalParameter347.getTree());
                    // JS.g:1747:29: ( COMMA formalParameter )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // JS.g:1747:31: COMMA formalParameter
                    	    {
                    	    COMMA348=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6848); 
                    	    stream_COMMA.add(COMMA348);

                    	    pushFollow(FOLLOW_formalParameter_in_formalParameterList6850);
                    	    formalParameter349=formalParameter();
                    	    _fsp--;

                    	    stream_formalParameter.add(formalParameter349.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN350=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6858); 
            stream_RPAREN.add(RPAREN350);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1748:2: -> ^( ARGUMENTS ( formalParameter )* )
            {
                // JS.g:1748:5: ^( ARGUMENTS ( formalParameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // JS.g:1748:18: ( formalParameter )*
                while ( stream_formalParameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameter.next());

                }
                stream_formalParameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end formalParameterList

    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionBody
    // JS.g:1751:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE352=null;
        sourceElement_return sourceElement351 = null;


        Object lb_tree=null;
        Object RBRACE352_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
         pushState(JSParserRule.FUNCTION_BODY); 
        try {
            // JS.g:1753:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1753:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6888); 
            stream_LBRACE.add(lb);

            // JS.g:1753:14: ( sourceElement )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=NULL && LA89_0<=BREAK)||(LA89_0>=CONTINUE && LA89_0<=DO)||(LA89_0>=FOR && LA89_0<=IF)||(LA89_0>=NEW && LA89_0<=NAMESPACE)||LA89_0==CONST||LA89_0==LBRACE||LA89_0==LPAREN||LA89_0==LBRACK||LA89_0==SEMIC||(LA89_0>=ADD && LA89_0<=SUB)||(LA89_0>=INC && LA89_0<=DEC)||(LA89_0>=NOT && LA89_0<=INV)||LA89_0==AT||(LA89_0>=XMLFragment && LA89_0<=XMLFragmentEnd)||LA89_0==StringLiteral||(LA89_0>=Identifier && LA89_0<=RegularExpressionLiteral)||(LA89_0>=DecimalLiteral && LA89_0<=HexIntegerLiteral)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // JS.g:1753:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6890);
            	    sourceElement351=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement351.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            RBRACE352=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6893); 
            stream_RBRACE.add(RBRACE352);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1754:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1754:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1754:28: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.next());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
             popState(); 
        }
        return retval;
    }
    // $ANTLR end functionBody

    public static class getMethodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start getMethodDeclaration
    // JS.g:1763:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN353=null;
        Token RPAREN354=null;
        identifier_return name = null;

        functionBody_return functionBody355 = null;


        Object get_tree=null;
        Object LPAREN353_tree=null;
        Object RPAREN354_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1764:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) )
            // JS.g:1764:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6930); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6934);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN353=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6936); 
            stream_LPAREN.add(LPAREN353);

            RPAREN354=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6938); 
            stream_RPAREN.add(RPAREN354);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6940);
            functionBody355=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody355.getTree());

            // AST REWRITE
            // elements: identifier, functionBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1765:4: -> ^( GETTER[$get] identifier functionBody )
            {
                // JS.g:1765:7: ^( GETTER[$get] identifier functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(GETTER, get), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                adaptor.addChild(root_1, stream_functionBody.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end getMethodDeclaration

    public static class setMethodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start setMethodDeclaration
    // JS.g:1768:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN356=null;
        Token RPAREN357=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody358 = null;


        Object set_tree=null;
        Object LPAREN356_tree=null;
        Object RPAREN357_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1769:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) )
            // JS.g:1769:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6971); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6975);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN356=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6977); 
            stream_LPAREN.add(LPAREN356);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6981);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN357=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6983); 
            stream_RPAREN.add(RPAREN357);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6985);
            functionBody358=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody358.getTree());

            // AST REWRITE
            // elements: name, param, functionBody
            // token labels: 
            // rule labels: retval, param, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"token param",param!=null?param.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1770:5: -> ^( SETTER[$set] $name $param functionBody )
            {
                // JS.g:1770:8: ^( SETTER[$set] $name $param functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SETTER, set), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_param.next());
                adaptor.addChild(root_1, stream_functionBody.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end setMethodDeclaration

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // JS.g:1777:1: program : sourceElementSync ( sourceElement sourceElementSync )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF362=null;
        sourceElementSync_return sourceElementSync359 = null;

        sourceElement_return sourceElement360 = null;

        sourceElementSync_return sourceElementSync361 = null;


        Object EOF362_tree=null;

         pushState(JSParserRule.PROGRAM); 
        try {
            // JS.g:1779:2: ( sourceElementSync ( sourceElement sourceElementSync )* EOF )
            // JS.g:1779:4: sourceElementSync ( sourceElement sourceElementSync )* EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sourceElementSync_in_program7026);
            sourceElementSync359=sourceElementSync();
            _fsp--;

            adaptor.addChild(root_0, sourceElementSync359.getTree());
            // JS.g:1779:22: ( sourceElement sourceElementSync )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=NULL && LA90_0<=BREAK)||(LA90_0>=CONTINUE && LA90_0<=DO)||(LA90_0>=FOR && LA90_0<=IF)||(LA90_0>=NEW && LA90_0<=NAMESPACE)||LA90_0==CONST||LA90_0==LBRACE||LA90_0==LPAREN||LA90_0==LBRACK||LA90_0==SEMIC||(LA90_0>=ADD && LA90_0<=SUB)||(LA90_0>=INC && LA90_0<=DEC)||(LA90_0>=NOT && LA90_0<=INV)||LA90_0==AT||(LA90_0>=XMLFragment && LA90_0<=XMLFragmentEnd)||LA90_0==StringLiteral||(LA90_0>=Identifier && LA90_0<=RegularExpressionLiteral)||(LA90_0>=DecimalLiteral && LA90_0<=HexIntegerLiteral)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // JS.g:1779:23: sourceElement sourceElementSync
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program7029);
            	    sourceElement360=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement360.getTree());
            	    pushFollow(FOLLOW_sourceElementSync_in_program7031);
            	    sourceElementSync361=sourceElementSync();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElementSync361.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            EOF362=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program7035); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class sourceElementSync_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sourceElementSync
    // JS.g:1782:1: sourceElementSync : ;
    public final sourceElementSync_return sourceElementSync() throws RecognitionException {
        sourceElementSync_return retval = new sourceElementSync_return();
        retval.start = input.LT(1);

        Object root_0 = null;


        	syncToSet();

        try {
            // JS.g:1786:2: ()
            // JS.g:1787:3: 
            {
            root_0 = (Object)adaptor.nil();

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end sourceElementSync

    public static class sourceElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sourceElement
    // JS.g:1794:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration363 = null;

        statement_return statement364 = null;



        try {
            // JS.g:1799:2: ({...}? functionDeclaration | statement )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==FUNCTION) ) {
                int LA91_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt91=1;
                }
                else if ( (true) ) {
                    alt91=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1794:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 91, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA91_0>=NULL && LA91_0<=BREAK)||(LA91_0>=CONTINUE && LA91_0<=DO)||(LA91_0>=FOR && LA91_0<=EACH)||LA91_0==IF||(LA91_0>=NEW && LA91_0<=NAMESPACE)||LA91_0==CONST||LA91_0==LBRACE||LA91_0==LPAREN||LA91_0==LBRACK||LA91_0==SEMIC||(LA91_0>=ADD && LA91_0<=SUB)||(LA91_0>=INC && LA91_0<=DEC)||(LA91_0>=NOT && LA91_0<=INV)||LA91_0==AT||(LA91_0>=XMLFragment && LA91_0<=XMLFragmentEnd)||LA91_0==StringLiteral||(LA91_0>=Identifier && LA91_0<=RegularExpressionLiteral)||(LA91_0>=DecimalLiteral && LA91_0<=HexIntegerLiteral)) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1794:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // JS.g:1799:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement7080);
                    functionDeclaration363=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration363.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1800:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement7085);
                    statement364=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement364.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportRuleError(re);
        }
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end sourceElement


 

    public static final BitSet FOLLOW_reservedWord_in_token1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_token1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_token1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_token1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2513 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_xmlAttribute2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2531 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_MUL_in_xmlAttribute2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlLiteral_in_literal2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_xmlLiteral2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_xmlLiteral2879 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_xmlLiteral2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_xmlLiteral2883 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_xmlLiteral2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_primaryExpression3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3735 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3764 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC026A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3772 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC026A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3843 = new BitSet(new long[]{0x0000003600020000L,0x0020000000000040L,0x01C2080000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3851 = new BitSet(new long[]{0x0000003600020000L,0x0020000000000000L,0x01C2080000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3916 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3918 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_propertyName3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3998 = new BitSet(new long[]{0x0000003602460070L,0x03200000000002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_leftHandSideExpressionTail_in_newExpression4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments4014 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC003A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments4022 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4070 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression4091 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4116 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4120 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4142 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4144 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4167 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4169 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4188 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4190 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpressionTail4249 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A00L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpressionTail4270 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpressionTail4272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpressionTail4274 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A00L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpressionTail4296 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpressionTail4298 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A00L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpressionTail4321 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpressionTail4323 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A00L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpressionTail4342 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpressionTail4344 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A00L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4409 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4464 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4546 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4550 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4588 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4592 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4607 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4629 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4659 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4663 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4678 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4697 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4701 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4728 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4742 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4746 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4769 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4788 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4792 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4811 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4825 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4829 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4848 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4868 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4872 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4875 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4889 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4893 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4896 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4912 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4916 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4919 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4935 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4939 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4942 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4957 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4961 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4964 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4979 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4983 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4986 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5005 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression5009 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5012 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5026 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn5030 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5033 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5048 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression5052 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5055 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5070 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn5074 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5077 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression5096 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression5100 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5103 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5105 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5122 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn5126 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5129 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn5131 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5162 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5169 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5250 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5257 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5286 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5331 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5538 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_block5540 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5572 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5578 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeRef5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5624 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration5632 = new BitSet(new long[]{0x0000003600020002L,0x0000010000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclaration5634 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5641 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5658 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclarationNoIn5666 = new BitSet(new long[]{0x0000003600020002L,0x0000010000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclarationNoIn5668 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5675 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5692 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5698 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5780 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5784 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5786 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5792 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5854 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5856 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5860 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5894 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5899 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5919 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5923 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5927 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5978 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement5981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5983 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar6018 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6020 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar6032 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar6080 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6087 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6094 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6164 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6179 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6229 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6236 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6299 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6306 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0002030000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0002030000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6418 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012E0L,0x01C60B0000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6446 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6451 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6472 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6478 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6482 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6486 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6519 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6522 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6524 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6527 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6540 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6543 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6546 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6563 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6565 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6598 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6625 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6629 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6654 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6657 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6676 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_catchFilter6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6714 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6720 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionDeclaration6727 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000020L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionDeclaration6729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6767 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6774 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionExpression6781 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000020L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionExpression6783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameter6816 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_formalParameter6824 = new BitSet(new long[]{0x0000003600020002L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_formalParameter6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6840 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000100L,0x0002000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6848 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6888 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6890 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6930 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6971 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6977 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7026 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_sourceElement_in_program7029 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7031 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_EOF_in_program7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement7085 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.0.1 JS.g 2010-03-02 19:30:01

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "AT", "DOTDOT", "COLONCOLON", "XMLFragment", "XMLFragmentEnd", "XMLFragmentError", "CALL_ARGUMENTS", "ARGUMENTS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "FOREACH", "GETTER", "SETTER", "DEFAULT_XML_NAMESPACE", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XmlAttribute", "XML_LITERAL", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminatorChar", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int PACKAGE=58;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=155;
    public static final int RegularExpressionChar=192;
    public static final int LOCALNAME=130;
    public static final int XMLFragmentEnd=121;
    public static final int MOD=89;
    public static final int SHL=92;
    public static final int CONST=43;
    public static final int DO=13;
    public static final int DQUOTE=152;
    public static final int LineTerminatorChar=165;
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
    public static final int EOL=167;
    public static final int OctalDigit=178;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int GET=33;
    public static final int WhiteSpace=160;
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
    public static final int FF=156;
    public static final int OctalEscapeSequence=186;
    public static final int RegularExpressionFirstChar=191;
    public static final int TYPEOF=28;
    public static final int GT=79;
    public static final int CALL=131;
    public static final int CharacterEscapeSequence=184;
    public static final int LAND=100;
    public static final int PINC=147;
    public static final int PROTECTED=60;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int SUB=87;
    public static final int RegularExpressionLiteral=177;
    public static final int FLOAT=50;
    public static final int DecimalIntegerLiteral=180;
    public static final int HexDigit=171;
    public static final int LPAREN=71;
    public static final int AT=117;
    public static final int IMPLEMENTS=52;
    public static final int YIELD=35;
    public static final int SHRASS=110;
    public static final int PS=164;
    public static final int MultiLineComment=168;
    public static final int ADD=86;
    public static final int ZeroToThree=185;
    public static final int ITEM=140;
    public static final int UnicodeEscapeSequence=188;
    public static final int SHUASS=111;
    public static final int SHORT=62;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=153;
    public static final int SAME=84;
    public static final int COLON=103;
    public static final int StringLiteral=170;
    public static final int XMLFragment=120;
    public static final int PAREXPR=145;
    public static final int ENUM=46;
    public static final int CALL_ARGUMENTS=123;
    public static final int NBSP=158;
    public static final int HexIntegerLiteral=183;
    public static final int SP=157;
    public static final int BLOCK=126;
    public static final int LineTerminator=166;
    public static final int INTERFACE=55;
    public static final int DIV=115;
    public static final int LONG=56;
    public static final int CR=162;
    public static final int PUBLIC=61;
    public static final int LOR=101;
    public static final int LT=78;
    public static final int WHILE=31;
    public static final int BackslashSequence=190;
    public static final int LS=163;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=41;
    public static final int DecimalDigit=173;
    public static final int BYFIELD=127;
    public static final int BREAK=7;
    public static final int Identifier=176;
    public static final int WXML=36;
    public static final int POS=148;
    public static final int DOUBLE=45;
    public static final int ExponentPart=179;
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
    public static final int IdentifierStartASCII=172;
    public static final int TRY=27;
    public static final int NAMESPACE=37;
    public static final int SHLASS=109;
    public static final int COLONCOLON=119;
    public static final int USP=159;
    public static final int ANDASS=112;
    public static final int IdentifierNameASCIIStart=175;
    public static final int QUE=102;
    public static final int OR=96;
    public static final int SETTER=138;
    public static final int DEBUGGER=44;
    public static final int FOREACH=136;
    public static final int PDEC=146;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=189;
    public static final int THROW=26;
    public static final int MULASS=107;
    public static final int XmlAttribute=149;
    public static final int DEC=91;
    public static final int OctalIntegerLiteral=182;
    public static final int CLASS=42;
    public static final int ORASS=113;
    public static final int HexEscapeSequence=187;
    public static final int NAMEDVALUE=142;
    public static final int SingleLineComment=169;
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
    public static final int IdentifierPart=174;
    public static final int WITH=32;
    public static final int BYTE=40;
    public static final int XOR=97;
    public static final int VOLATILE=68;
    public static final int GETTER=137;
    public static final int NSAME=85;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=129;
    public static final int TAB=154;
    public static final int DecimalLiteral=181;
    public static final int TRUE=5;
    public static final int NEQ=83;
    public static final int FINALLY=15;
    public static final int NEG=143;
    public static final int ASSIGN=104;
    public static final int XML_LITERAL=150;
    public static final int SEMIC=76;
    public static final int EXTENDS=48;
    public static final int BSLASH=151;
    public static final int LF=161;

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
    // JS.g:638:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute );
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
            // JS.g:639:2: ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute )
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
                    new NoViableAltException("638:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:639:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1946);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:640:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1951);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:641:4: XMLFragment
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragment3=(Token)input.LT(1);
                    match(input,XMLFragment,FOLLOW_XMLFragment_in_token1956); 
                    XMLFragment3_tree = (Object)adaptor.create(XMLFragment3);
                    adaptor.addChild(root_0, XMLFragment3_tree);


                    }
                    break;
                case 4 :
                    // JS.g:642:4: XMLFragmentEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragmentEnd4=(Token)input.LT(1);
                    match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_token1961); 
                    XMLFragmentEnd4_tree = (Object)adaptor.create(XMLFragmentEnd4);
                    adaptor.addChild(root_0, XMLFragmentEnd4_tree);


                    }
                    break;
                case 5 :
                    // JS.g:643:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1966);
                    punctuator5=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator5.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:644:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1971);
                    numericLiteral6=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral6.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:645:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral7=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1976); 
                    StringLiteral7_tree = (Object)adaptor.create(StringLiteral7);
                    adaptor.addChild(root_0, StringLiteral7_tree);


                    }
                    break;
                case 8 :
                    // JS.g:646:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_token1981);
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
    // JS.g:651:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
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
            // JS.g:652:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
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
                    new NoViableAltException("651:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:652:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1994);
                    keyword9=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword9.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:653:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1999);
                    futureReservedWord10=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord10.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:654:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL11=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord2004); 
                    NULL11_tree = (Object)adaptor.create(NULL11);
                    adaptor.addChild(root_0, NULL11_tree);


                    }
                    break;
                case 4 :
                    // JS.g:655:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2009);
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
    // JS.g:662:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:663:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
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
    // JS.g:700:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // JS.g:701:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
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
    // JS.g:774:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | Identifier );
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            // JS.g:775:3: ( WXML | GET | SET | EACH | NAMESPACE | Identifier )
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
    // JS.g:783:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );
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
            // JS.g:784:3: ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) )
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
                        new NoViableAltException("783:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("783:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // JS.g:784:5: AT identifier
                    {
                    AT16=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2509); 
                    stream_AT.add(AT16);

                    pushFollow(FOLLOW_identifier_in_xmlAttribute2511);
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
                    // 784:19: -> ^( XmlAttribute AT identifier )
                    {
                        // JS.g:784:22: ^( XmlAttribute AT identifier )
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
                    // JS.g:785:5: AT MUL
                    {
                    AT18=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2527); 
                    stream_AT.add(AT18);

                    MUL19=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_xmlAttribute2529); 
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
                    // 785:12: -> ^( XmlAttribute AT MUL )
                    {
                        // JS.g:785:15: ^( XmlAttribute AT MUL )
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
    // JS.g:792:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // JS.g:793:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
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
    // JS.g:849:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );
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
            // JS.g:850:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral )
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
                    new NoViableAltException("849:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:850:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL21=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2815); 
                    NULL21_tree = (Object)adaptor.create(NULL21);
                    adaptor.addChild(root_0, NULL21_tree);


                    }
                    break;
                case 2 :
                    // JS.g:851:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2820);
                    booleanLiteral22=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral22.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:852:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2825);
                    numericLiteral23=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral23.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:853:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral24=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2830); 
                    StringLiteral24_tree = (Object)adaptor.create(StringLiteral24);
                    adaptor.addChild(root_0, StringLiteral24_tree);


                    }
                    break;
                case 5 :
                    // JS.g:854:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral25=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2835); 
                    RegularExpressionLiteral25_tree = (Object)adaptor.create(RegularExpressionLiteral25);
                    adaptor.addChild(root_0, RegularExpressionLiteral25_tree);


                    }
                    break;
                case 6 :
                    // JS.g:855:4: xmlLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlLiteral_in_literal2840);
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
    // JS.g:858:1: xmlLiteral : ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) ;
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
            // JS.g:859:2: ( ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) )
            // JS.g:859:4: ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd
            {
            // JS.g:859:4: ( XMLFragment LBRACE expression RBRACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==XMLFragment) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JS.g:860:6: XMLFragment LBRACE expression RBRACE
            	    {
            	    XMLFragment27=(Token)input.LT(1);
            	    match(input,XMLFragment,FOLLOW_XMLFragment_in_xmlLiteral2858); 
            	    stream_XMLFragment.add(XMLFragment27);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_EXPRESSION); 
            	    LBRACE28=(Token)input.LT(1);
            	    match(input,LBRACE,FOLLOW_LBRACE_in_xmlLiteral2875); 
            	    stream_LBRACE.add(LBRACE28);

            	    pushFollow(FOLLOW_expression_in_xmlLiteral2877);
            	    expression29=expression();
            	    _fsp--;

            	    stream_expression.add(expression29.getTree());
            	    RBRACE30=(Token)input.LT(1);
            	    match(input,RBRACE,FOLLOW_RBRACE_in_xmlLiteral2879); 
            	    stream_RBRACE.add(RBRACE30);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_XML); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            XMLFragmentEnd31=(Token)input.LT(1);
            match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_xmlLiteral2895); 
            stream_XMLFragmentEnd.add(XMLFragmentEnd31);


            // AST REWRITE
            // elements: expression, XMLFragment, XMLFragmentEnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 865:4: -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
            {
                // JS.g:865:7: ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);

                // JS.g:865:21: ( XMLFragment )*
                while ( stream_XMLFragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_XMLFragment.next());

                }
                stream_XMLFragment.reset();
                // JS.g:865:34: ( expression )*
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
    // JS.g:888:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // JS.g:889:2: ( TRUE | FALSE )
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
    // JS.g:935:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;

        Object set33_tree=null;

        try {
            // JS.g:936:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
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
    // JS.g:1025:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
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
            // JS.g:1026:2: ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
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
                    new NoViableAltException("1025:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // JS.g:1026:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS34=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3672); 
                    THIS34_tree = (Object)adaptor.create(THIS34);
                    adaptor.addChild(root_0, THIS34_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1027:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3677);
                    identifier35=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1028:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_primaryExpression3682);
                    xmlAttribute36=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute36.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1029:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3687);
                    literal37=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal37.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1030:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3692);
                    arrayLiteral38=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral38.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1031:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3697);
                    objectLiteral39=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral39.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1032:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3702);
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
    // JS.g:1035:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
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
            // JS.g:1036:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:1036:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3718); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3720);
            expression41=expression();
            _fsp--;

            stream_expression.add(expression41.getTree());
            RPAREN42=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3722); 
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
            // 1036:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:1036:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
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
    // JS.g:1039:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
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
            // JS.g:1040:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:1040:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3747); 
            stream_LBRACK.add(lb);

            // JS.g:1040:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
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
                    // JS.g:1040:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3751);
                    arrayItem43=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem43.getTree());
                    // JS.g:1040:26: ( COMMA ( arrayItem )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:1040:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA44=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3755); 
                    	    stream_COMMA.add(COMMA44);

                    	    // JS.g:1040:34: ( arrayItem )?
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
                    	            // JS.g:1040:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3757);
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
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3766); 
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
            // 1041:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:1041:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:1041:28: ( arrayItem )*
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
    // JS.g:1044:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1045:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:1045:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:1045:4: (expr= assignmentExpression | {...}?)
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
                    new NoViableAltException("1045:4: (expr= assignmentExpression | {...}?)", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1045:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3794);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1045:34: {...}?
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
            // 1046:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1046:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1046:13: ( $expr)?
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
    // JS.g:1049:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) ;
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
            // JS.g:1050:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) )
            // JS.g:1050:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3826); 
            stream_LBRACE.add(lb);

            // JS.g:1050:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EACH||(LA13_0>=GET && LA13_0<=SET)||(LA13_0>=WXML && LA13_0<=NAMESPACE)||LA13_0==AT||LA13_0==StringLiteral||LA13_0==Identifier||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // JS.g:1050:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3830);
                    objectPropertyInitializer47=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer47.getTree());
                    // JS.g:1050:42: ( COMMA objectPropertyInitializer )*
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
                    	    // JS.g:1050:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA48=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3834); 
                    	    stream_COMMA.add(COMMA48);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3836);
                    	    objectPropertyInitializer49=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // JS.g:1050:79: ( COMMA )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COMMA) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // JS.g:1050:79: COMMA
                            {
                            COMMA50=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3841); 
                            stream_COMMA.add(COMMA50);


                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE51=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3846); 
            stream_RBRACE.add(RBRACE51);


            // AST REWRITE
            // elements: objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1051:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
            {
                // JS.g:1051:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1051:30: ( objectPropertyInitializer )*
                while ( stream_objectPropertyInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectPropertyInitializer.next());

                }
                stream_objectPropertyInitializer.reset();

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
    // JS.g:1054:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair52 = null;

        getMethodDeclaration_return getMethodDeclaration53 = null;

        setMethodDeclaration_return setMethodDeclaration54 = null;



        try {
            // JS.g:1055:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt14=3;
            switch ( input.LA(1) ) {
            case GET:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==COLON) ) {
                    alt14=1;
                }
                else if ( (LA14_1==EACH||(LA14_1>=GET && LA14_1<=SET)||(LA14_1>=WXML && LA14_1<=NAMESPACE)||LA14_1==Identifier) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1054:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 1, input);

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

                if ( (LA14_3==COLON) ) {
                    alt14=1;
                }
                else if ( (LA14_3==EACH||(LA14_3>=GET && LA14_3<=SET)||(LA14_3>=WXML && LA14_3<=NAMESPACE)||LA14_3==Identifier) ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1054:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1054:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // JS.g:1055:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3871);
                    nameValuePair52=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair52.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1056:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3878);
                    getMethodDeclaration53=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration53.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1057:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3884);
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
    // JS.g:1060:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
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
            // JS.g:1061:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1061:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3897);
            propertyName55=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName55.getTree());
            COLON56=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3899); 
            stream_COLON.add(COLON56);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3901);
            assignmentExpression57=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression57.getTree());

            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1062:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1062:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // JS.g:1065:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );
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
            // JS.g:1066:2: ( identifier | StringLiteral | numericLiteral | xmlAttribute )
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
                    new NoViableAltException("1065:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // JS.g:1066:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3925);
                    identifier58=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier58.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1067:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral59=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3930); 
                    StringLiteral59_tree = (Object)adaptor.create(StringLiteral59);
                    adaptor.addChild(root_0, StringLiteral59_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1068:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3935);
                    numericLiteral60=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral60.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1069:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_propertyName3940);
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
    // JS.g:1081:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression62 = null;

        functionExpression_return functionExpression63 = null;

        newExpression_return newExpression64 = null;



        try {
            // JS.g:1082:2: ( primaryExpression | functionExpression | newExpression )
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
                    new NoViableAltException("1081:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // JS.g:1082:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3958);
                    primaryExpression62=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression62.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1083:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3963);
                    functionExpression63=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression63.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1084:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3968);
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
    // JS.g:1087:1: newExpression : NEW memberExpression ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW65=null;
        memberExpression_return memberExpression66 = null;


        Object NEW65_tree=null;

        try {
            // JS.g:1088:2: ( NEW memberExpression )
            // JS.g:1088:4: NEW memberExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW65=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3979); 
            NEW65_tree = (Object)adaptor.create(NEW65);
            root_0 = (Object)adaptor.becomeRoot(NEW65_tree, root_0);

            pushFollow(FOLLOW_memberExpression_in_newExpression3982);
            memberExpression66=memberExpression();
            _fsp--;

            adaptor.addChild(root_0, memberExpression66.getTree());

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
    // JS.g:1092:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) ;
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
            // JS.g:1093:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) )
            // JS.g:1093:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN67=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3995); 
            stream_LPAREN.add(LPAREN67);

            // JS.g:1093:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=NULL && LA18_0<=FALSE)||LA18_0==DELETE||(LA18_0>=EACH && LA18_0<=FUNCTION)||LA18_0==NEW||LA18_0==THIS||LA18_0==TYPEOF||LA18_0==VOID||(LA18_0>=GET && LA18_0<=NAMESPACE)||LA18_0==LBRACE||LA18_0==LPAREN||LA18_0==LBRACK||(LA18_0>=ADD && LA18_0<=SUB)||(LA18_0>=INC && LA18_0<=DEC)||(LA18_0>=NOT && LA18_0<=INV)||LA18_0==AT||(LA18_0>=XMLFragment && LA18_0<=XMLFragmentEnd)||LA18_0==StringLiteral||(LA18_0>=Identifier && LA18_0<=RegularExpressionLiteral)||(LA18_0>=DecimalLiteral && LA18_0<=HexIntegerLiteral)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1093:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3999);
                    assignmentExpression68=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression68.getTree());
                    // JS.g:1093:34: ( COMMA assignmentExpression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // JS.g:1093:36: COMMA assignmentExpression
                    	    {
                    	    COMMA69=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments4003); 
                    	    stream_COMMA.add(COMMA69);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments4005);
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
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments4013); 
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
            // 1094:2: -> ^( CALL_ARGUMENTS ( assignmentExpression )* )
            {
                // JS.g:1094:5: ^( CALL_ARGUMENTS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL_ARGUMENTS, "CALL_ARGUMENTS"), root_1);

                // JS.g:1094:23: ( assignmentExpression )*
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
    // JS.g:1097:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
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

        expression_return expression80 = null;

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
            // JS.g:1099:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1100:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1100:3: ( memberExpression -> memberExpression )
            // JS.g:1101:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4051);
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
            // 1101:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1103:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
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
            	    // JS.g:1104:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression4072);
            	    arguments73=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments73.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1104:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1104:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1105:7: LBRACK expression RBRACK
            	    {
            	    LBRACK74=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4097); 
            	    stream_LBRACK.add(LBRACK74);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4099);
            	    expression75=expression();
            	    _fsp--;

            	    stream_expression.add(expression75.getTree());
            	    RBRACK76=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4101); 
            	    stream_RBRACK.add(RBRACK76);


            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1105:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // JS.g:1105:36: ^( BYINDEX $leftHandSideExpression expression )
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
            	    // JS.g:1106:7: DOT rightHandSideExpression
            	    {
            	    DOT77=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4123); 
            	    stream_DOT.add(DOT77);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4125);
            	    rightHandSideExpression78=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression78.getTree());

            	    // AST REWRITE
            	    // elements: DOT, leftHandSideExpression, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1106:35: -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression )
            	    {
            	        // JS.g:1106:38: ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression )
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
            	    // JS.g:1107:7: DOTDOT expression
            	    {
            	    DOTDOT79=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4148); 
            	    stream_DOTDOT.add(DOTDOT79);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4150);
            	    expression80=expression();
            	    _fsp--;

            	    stream_expression.add(expression80.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1107:25: -> ^( ALLCHILDREN $leftHandSideExpression expression )
            	    {
            	        // JS.g:1107:28: ^( ALLCHILDREN $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 5 :
            	    // JS.g:1108:7: COLONCOLON expression
            	    {
            	    COLONCOLON81=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4169); 
            	    stream_COLONCOLON.add(COLONCOLON81);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4171);
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
            	    // 1108:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1108:32: ^( LOCALNAME $leftHandSideExpression expression )
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

    public static class rightHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rightHandSideExpression
    // JS.g:1115:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL86=null;
        parenExpression_return parenExpression83 = null;

        identifier_return identifier84 = null;

        xmlAttribute_return xmlAttribute85 = null;


        Object MUL86_tree=null;

        try {
            // JS.g:1116:3: ( parenExpression | identifier | xmlAttribute | MUL )
            int alt20=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt20=1;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt20=2;
                }
                break;
            case AT:
                {
                alt20=3;
                }
                break;
            case MUL:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1115:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // JS.g:1116:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4222);
                    parenExpression83=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression83.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1117:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4229);
                    identifier84=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier84.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1118:5: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4235);
                    xmlAttribute85=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute85.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1119:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL86=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4241); 
                    MUL86_tree = (Object)adaptor.create(MUL86);
                    adaptor.addChild(root_0, MUL86_tree);


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
    // JS.g:1132:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression87 = null;

        postfixOperator_return postfixOperator88 = null;



        try {
            // JS.g:1133:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1133:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4258);
            leftHandSideExpression87=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression87.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1133:95: ( postfixOperator )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INC) ) {
                alt21=1;
            }
            else if ( (LA21_0==DEC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JS.g:1133:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4264);
                    postfixOperator88=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator88.getTree(), root_0);

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
    // JS.g:1136:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1137:2: (op= INC | op= DEC )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==INC) ) {
                alt22=1;
            }
            else if ( (LA22_0==DEC) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1136:1: postfixOperator : (op= INC | op= DEC );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // JS.g:1137:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4282); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1138:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4291); 
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
    // JS.g:1145:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression89 = null;

        unaryOperator_return unaryOperator90 = null;

        unaryExpression_return unaryExpression91 = null;



        try {
            // JS.g:1146:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=NULL && LA23_0<=FALSE)||(LA23_0>=EACH && LA23_0<=FUNCTION)||LA23_0==NEW||LA23_0==THIS||(LA23_0>=GET && LA23_0<=SET)||(LA23_0>=WXML && LA23_0<=NAMESPACE)||LA23_0==LBRACE||LA23_0==LPAREN||LA23_0==LBRACK||LA23_0==AT||(LA23_0>=XMLFragment && LA23_0<=XMLFragmentEnd)||LA23_0==StringLiteral||(LA23_0>=Identifier && LA23_0<=RegularExpressionLiteral)||(LA23_0>=DecimalLiteral && LA23_0<=HexIntegerLiteral)) ) {
                alt23=1;
            }
            else if ( (LA23_0==DELETE||LA23_0==TYPEOF||LA23_0==VOID||LA23_0==YIELD||(LA23_0>=ADD && LA23_0<=SUB)||(LA23_0>=INC && LA23_0<=DEC)||(LA23_0>=NOT && LA23_0<=INV)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1145:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // JS.g:1146:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4308);
                    postfixExpression89=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression89.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1147:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4313);
                    unaryOperator90=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator90.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4316);
                    unaryExpression91=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression91.getTree());

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
    // JS.g:1150:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE92=null;
        Token VOID93=null;
        Token TYPEOF94=null;
        Token INC95=null;
        Token DEC96=null;
        Token INV97=null;
        Token NOT98=null;
        Token YIELD99=null;

        Object op_tree=null;
        Object DELETE92_tree=null;
        Object VOID93_tree=null;
        Object TYPEOF94_tree=null;
        Object INC95_tree=null;
        Object DEC96_tree=null;
        Object INV97_tree=null;
        Object NOT98_tree=null;
        Object YIELD99_tree=null;

        try {
            // JS.g:1151:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt24=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt24=1;
                }
                break;
            case VOID:
                {
                alt24=2;
                }
                break;
            case TYPEOF:
                {
                alt24=3;
                }
                break;
            case INC:
                {
                alt24=4;
                }
                break;
            case DEC:
                {
                alt24=5;
                }
                break;
            case ADD:
                {
                alt24=6;
                }
                break;
            case SUB:
                {
                alt24=7;
                }
                break;
            case INV:
                {
                alt24=8;
                }
                break;
            case NOT:
                {
                alt24=9;
                }
                break;
            case YIELD:
                {
                alt24=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1150:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // JS.g:1151:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE92=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4328); 
                    DELETE92_tree = (Object)adaptor.create(DELETE92);
                    adaptor.addChild(root_0, DELETE92_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1152:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID93=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4333); 
                    VOID93_tree = (Object)adaptor.create(VOID93);
                    adaptor.addChild(root_0, VOID93_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1153:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF94=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4338); 
                    TYPEOF94_tree = (Object)adaptor.create(TYPEOF94);
                    adaptor.addChild(root_0, TYPEOF94_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1154:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC95=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4343); 
                    INC95_tree = (Object)adaptor.create(INC95);
                    adaptor.addChild(root_0, INC95_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1155:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC96=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4348); 
                    DEC96_tree = (Object)adaptor.create(DEC96);
                    adaptor.addChild(root_0, DEC96_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1156:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4355); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1157:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4364); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1158:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV97=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4371); 
                    INV97_tree = (Object)adaptor.create(INV97);
                    adaptor.addChild(root_0, INV97_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1159:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT98=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4376); 
                    NOT98_tree = (Object)adaptor.create(NOT98);
                    adaptor.addChild(root_0, NOT98_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1160:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD99=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4381); 
                    YIELD99_tree = (Object)adaptor.create(YIELD99);
                    adaptor.addChild(root_0, YIELD99_tree);


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
    // JS.g:1165:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT100=null;
        Token WXML101=null;
        Token NAMESPACE102=null;
        Token ASSIGN103=null;
        Token StringLiteral104=null;
        semic_return semic105 = null;


        Object DEFAULT100_tree=null;
        Object WXML101_tree=null;
        Object NAMESPACE102_tree=null;
        Object ASSIGN103_tree=null;
        Object StringLiteral104_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1166:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) )
            // JS.g:1166:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            DEFAULT100=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4395); 
            stream_DEFAULT.add(DEFAULT100);

            WXML101=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4397); 
            stream_WXML.add(WXML101);

            NAMESPACE102=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4399); 
            stream_NAMESPACE.add(NAMESPACE102);

            ASSIGN103=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4401); 
            stream_ASSIGN.add(ASSIGN103);

            StringLiteral104=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4403); 
            stream_StringLiteral.add(StringLiteral104);

            pushFollow(FOLLOW_semic_in_namespaceStatement4405);
            semic105=semic();
            _fsp--;

            stream_semic.add(semic105.getTree());

            // AST REWRITE
            // elements: WXML, StringLiteral, DEFAULT, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1167:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
            {
                // JS.g:1167:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
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
    // JS.g:1172:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set107=null;
        unaryExpression_return unaryExpression106 = null;

        unaryExpression_return unaryExpression108 = null;


        Object set107_tree=null;

        try {
            // JS.g:1173:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1173:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4437);
            unaryExpression106=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression106.getTree());
            // JS.g:1173:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=MUL && LA25_0<=MOD)||LA25_0==DIV) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JS.g:1173:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set107=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set107), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4441);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4456);
            	    unaryExpression108=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // JS.g:1180:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set110=null;
        multiplicativeExpression_return multiplicativeExpression109 = null;

        multiplicativeExpression_return multiplicativeExpression111 = null;


        Object set110_tree=null;

        try {
            // JS.g:1181:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1181:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4474);
            multiplicativeExpression109=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression109.getTree());
            // JS.g:1181:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=ADD && LA26_0<=SUB)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JS.g:1181:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set110=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set110), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4478);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4489);
            	    multiplicativeExpression111=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression111.getTree());

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
    // $ANTLR end additiveExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // JS.g:1188:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set113=null;
        additiveExpression_return additiveExpression112 = null;

        additiveExpression_return additiveExpression114 = null;


        Object set113_tree=null;

        try {
            // JS.g:1189:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1189:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4508);
            additiveExpression112=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression112.getTree());
            // JS.g:1189:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=SHL && LA27_0<=SHU)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1189:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set113=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set113), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4512);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4527);
            	    additiveExpression114=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression114.getTree());

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
    // $ANTLR end shiftExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // JS.g:1196:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set116=null;
        shiftExpression_return shiftExpression115 = null;

        shiftExpression_return shiftExpression117 = null;


        Object set116_tree=null;

        try {
            // JS.g:1197:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1197:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4546);
            shiftExpression115=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression115.getTree());
            // JS.g:1197:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==INSTANCEOF||(LA28_0>=LT && LA28_0<=GTE)) ) {
                    alt28=1;
                }
                else if ( (LA28_0==IN) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1197:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set116=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set116), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4550);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4577);
            	    shiftExpression117=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression117.getTree());

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
    // $ANTLR end relationalExpression

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpressionNoIn
    // JS.g:1200:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set119=null;
        shiftExpression_return shiftExpression118 = null;

        shiftExpression_return shiftExpression120 = null;


        Object set119_tree=null;

        try {
            // JS.g:1201:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1201:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4591);
            shiftExpression118=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression118.getTree());
            // JS.g:1201:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==INSTANCEOF||(LA29_0>=LT && LA29_0<=GTE)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1201:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set119=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set119), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4595);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4618);
            	    shiftExpression120=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression120.getTree());

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
    // $ANTLR end relationalExpressionNoIn

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // JS.g:1208:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set122=null;
        relationalExpression_return relationalExpression121 = null;

        relationalExpression_return relationalExpression123 = null;


        Object set122_tree=null;

        try {
            // JS.g:1209:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1209:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4637);
            relationalExpression121=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression121.getTree());
            // JS.g:1209:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=EQ && LA30_0<=NSAME)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1209:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set122=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set122), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4641);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4660);
            	    relationalExpression123=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression123.getTree());

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
    // $ANTLR end equalityExpression

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpressionNoIn
    // JS.g:1212:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set125=null;
        relationalExpressionNoIn_return relationalExpressionNoIn124 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn126 = null;


        Object set125_tree=null;

        try {
            // JS.g:1213:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1213:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4674);
            relationalExpressionNoIn124=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn124.getTree());
            // JS.g:1213:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=EQ && LA31_0<=NSAME)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1213:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set125=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set125), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4678);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4697);
            	    relationalExpressionNoIn126=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn126.getTree());

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
    // $ANTLR end equalityExpressionNoIn

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpression
    // JS.g:1220:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND128=null;
        equalityExpression_return equalityExpression127 = null;

        equalityExpression_return equalityExpression129 = null;


        Object AND128_tree=null;

        try {
            // JS.g:1221:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1221:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4717);
            equalityExpression127=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression127.getTree());
            // JS.g:1221:23: ( AND equalityExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==AND) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1221:25: AND equalityExpression
            	    {
            	    AND128=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4721); 
            	    AND128_tree = (Object)adaptor.create(AND128);
            	    root_0 = (Object)adaptor.becomeRoot(AND128_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4724);
            	    equalityExpression129=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression129.getTree());

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
    // $ANTLR end bitwiseANDExpression

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpressionNoIn
    // JS.g:1224:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND131=null;
        equalityExpressionNoIn_return equalityExpressionNoIn130 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn132 = null;


        Object AND131_tree=null;

        try {
            // JS.g:1225:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1225:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4738);
            equalityExpressionNoIn130=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn130.getTree());
            // JS.g:1225:27: ( AND equalityExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==AND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1225:29: AND equalityExpressionNoIn
            	    {
            	    AND131=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4742); 
            	    AND131_tree = (Object)adaptor.create(AND131);
            	    root_0 = (Object)adaptor.becomeRoot(AND131_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4745);
            	    equalityExpressionNoIn132=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn132.getTree());

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
    // $ANTLR end bitwiseANDExpressionNoIn

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpression
    // JS.g:1228:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR134=null;
        bitwiseANDExpression_return bitwiseANDExpression133 = null;

        bitwiseANDExpression_return bitwiseANDExpression135 = null;


        Object XOR134_tree=null;

        try {
            // JS.g:1229:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1229:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4761);
            bitwiseANDExpression133=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression133.getTree());
            // JS.g:1229:25: ( XOR bitwiseANDExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==XOR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1229:27: XOR bitwiseANDExpression
            	    {
            	    XOR134=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4765); 
            	    XOR134_tree = (Object)adaptor.create(XOR134);
            	    root_0 = (Object)adaptor.becomeRoot(XOR134_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4768);
            	    bitwiseANDExpression135=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression135.getTree());

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
    // $ANTLR end bitwiseXORExpression

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpressionNoIn
    // JS.g:1232:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR137=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn136 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn138 = null;


        Object XOR137_tree=null;

        try {
            // JS.g:1233:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1233:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4784);
            bitwiseANDExpressionNoIn136=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn136.getTree());
            // JS.g:1233:29: ( XOR bitwiseANDExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==XOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1233:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR137=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4788); 
            	    XOR137_tree = (Object)adaptor.create(XOR137);
            	    root_0 = (Object)adaptor.becomeRoot(XOR137_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4791);
            	    bitwiseANDExpressionNoIn138=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn138.getTree());

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
    // $ANTLR end bitwiseXORExpressionNoIn

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpression
    // JS.g:1236:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR140=null;
        bitwiseXORExpression_return bitwiseXORExpression139 = null;

        bitwiseXORExpression_return bitwiseXORExpression141 = null;


        Object OR140_tree=null;

        try {
            // JS.g:1237:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1237:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4806);
            bitwiseXORExpression139=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression139.getTree());
            // JS.g:1237:25: ( OR bitwiseXORExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==OR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1237:27: OR bitwiseXORExpression
            	    {
            	    OR140=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4810); 
            	    OR140_tree = (Object)adaptor.create(OR140);
            	    root_0 = (Object)adaptor.becomeRoot(OR140_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4813);
            	    bitwiseXORExpression141=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression141.getTree());

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
    // $ANTLR end bitwiseORExpression

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpressionNoIn
    // JS.g:1240:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR143=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn142 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn144 = null;


        Object OR143_tree=null;

        try {
            // JS.g:1241:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1241:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4828);
            bitwiseXORExpressionNoIn142=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn142.getTree());
            // JS.g:1241:29: ( OR bitwiseXORExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==OR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1241:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR143=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4832); 
            	    OR143_tree = (Object)adaptor.create(OR143);
            	    root_0 = (Object)adaptor.becomeRoot(OR143_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4835);
            	    bitwiseXORExpressionNoIn144=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn144.getTree());

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
    // $ANTLR end bitwiseORExpressionNoIn

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpression
    // JS.g:1248:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND146=null;
        bitwiseORExpression_return bitwiseORExpression145 = null;

        bitwiseORExpression_return bitwiseORExpression147 = null;


        Object LAND146_tree=null;

        try {
            // JS.g:1249:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1249:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4854);
            bitwiseORExpression145=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression145.getTree());
            // JS.g:1249:24: ( LAND bitwiseORExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LAND) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1249:26: LAND bitwiseORExpression
            	    {
            	    LAND146=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4858); 
            	    LAND146_tree = (Object)adaptor.create(LAND146);
            	    root_0 = (Object)adaptor.becomeRoot(LAND146_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4861);
            	    bitwiseORExpression147=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression147.getTree());

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
    // $ANTLR end logicalANDExpression

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpressionNoIn
    // JS.g:1252:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND149=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn148 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn150 = null;


        Object LAND149_tree=null;

        try {
            // JS.g:1253:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1253:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4875);
            bitwiseORExpressionNoIn148=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn148.getTree());
            // JS.g:1253:28: ( LAND bitwiseORExpressionNoIn )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LAND) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1253:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND149=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4879); 
            	    LAND149_tree = (Object)adaptor.create(LAND149);
            	    root_0 = (Object)adaptor.becomeRoot(LAND149_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4882);
            	    bitwiseORExpressionNoIn150=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn150.getTree());

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
    // $ANTLR end logicalANDExpressionNoIn

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpression
    // JS.g:1256:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR152=null;
        logicalANDExpression_return logicalANDExpression151 = null;

        logicalANDExpression_return logicalANDExpression153 = null;


        Object LOR152_tree=null;

        try {
            // JS.g:1257:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1257:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4897);
            logicalANDExpression151=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression151.getTree());
            // JS.g:1257:25: ( LOR logicalANDExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1257:27: LOR logicalANDExpression
            	    {
            	    LOR152=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4901); 
            	    LOR152_tree = (Object)adaptor.create(LOR152);
            	    root_0 = (Object)adaptor.becomeRoot(LOR152_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4904);
            	    logicalANDExpression153=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression153.getTree());

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
    // $ANTLR end logicalORExpression

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpressionNoIn
    // JS.g:1260:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR155=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn154 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn156 = null;


        Object LOR155_tree=null;

        try {
            // JS.g:1261:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1261:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4919);
            logicalANDExpressionNoIn154=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn154.getTree());
            // JS.g:1261:29: ( LOR logicalANDExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LOR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JS.g:1261:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR155=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4923); 
            	    LOR155_tree = (Object)adaptor.create(LOR155);
            	    root_0 = (Object)adaptor.becomeRoot(LOR155_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4926);
            	    logicalANDExpressionNoIn156=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn156.getTree());

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
    // $ANTLR end logicalORExpressionNoIn

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionalExpression
    // JS.g:1268:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE158=null;
        Token COLON160=null;
        logicalORExpression_return logicalORExpression157 = null;

        assignmentExpression_return assignmentExpression159 = null;

        assignmentExpression_return assignmentExpression161 = null;


        Object QUE158_tree=null;
        Object COLON160_tree=null;

        try {
            // JS.g:1269:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1269:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4945);
            logicalORExpression157=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression157.getTree());
            // JS.g:1269:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==QUE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // JS.g:1269:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE158=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4949); 
                    QUE158_tree = (Object)adaptor.create(QUE158);
                    root_0 = (Object)adaptor.becomeRoot(QUE158_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4952);
                    assignmentExpression159=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression159.getTree());
                    COLON160=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4954); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4957);
                    assignmentExpression161=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression161.getTree());

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
    // JS.g:1272:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE163=null;
        Token COLON165=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn162 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn164 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn166 = null;


        Object QUE163_tree=null;
        Object COLON165_tree=null;

        try {
            // JS.g:1273:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1273:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4971);
            logicalORExpressionNoIn162=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn162.getTree());
            // JS.g:1273:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==QUE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // JS.g:1273:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE163=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4975); 
                    QUE163_tree = (Object)adaptor.create(QUE163);
                    root_0 = (Object)adaptor.becomeRoot(QUE163_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4978);
                    assignmentExpressionNoIn164=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn164.getTree());
                    COLON165=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4980); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4983);
                    assignmentExpressionNoIn166=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn166.getTree());

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
    // JS.g:1302:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator167 = null;

        assignmentExpression_return assignmentExpression168 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1307:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1307:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5011);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1308:2: ({...}? assignmentOperator assignmentExpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=ASSIGN && LA44_0<=XORASS)||LA44_0==DIVASS) ) {
                int LA44_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // JS.g:1308:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5018);
                    assignmentOperator167=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator167.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5021);
                    assignmentExpression168=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression168.getTree());

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
    // JS.g:1311:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set169=null;

        Object set169_tree=null;

        try {
            // JS.g:1312:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set169=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set169));
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
    // JS.g:1315:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator170 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn171 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1320:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1320:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5099);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1321:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
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
                    // JS.g:1321:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5106);
                    assignmentOperator170=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator170.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5109);
                    assignmentExpressionNoIn171=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn171.getTree());

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
    // JS.g:1328:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA172=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA172_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1329:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1329:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5131);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1329:32: ( COMMA exprs+= assignmentExpression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // JS.g:1329:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA172=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5135); 
            	    stream_COMMA.add(COMMA172);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5139);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop46;
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
            // 1330:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1330:28: ^( CEXPR ( $exprs)+ )
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
            else // 1331:2: -> $exprs
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
    // JS.g:1334:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA173=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA173_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1335:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1335:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5176);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1335:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // JS.g:1335:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA173=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5180); 
            	    stream_COMMA.add(COMMA173);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5184);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
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
            // 1336:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1336:28: ^( CEXPR ( $exprs)+ )
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
            else // 1337:2: -> $exprs
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
    // JS.g:1362:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC174=null;
        Token EOF175=null;
        Token RBRACE176=null;
        Token EOL177=null;
        Token MultiLineComment178=null;

        Object SEMIC174_tree=null;
        Object EOF175_tree=null;
        Object RBRACE176_tree=null;
        Object EOL177_tree=null;
        Object MultiLineComment178_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1370:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt48=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt48=1;
                }
                break;
            case EOF:
                {
                alt48=2;
                }
                break;
            case RBRACE:
                {
                alt48=3;
                }
                break;
            case EOL:
                {
                alt48=4;
                }
                break;
            case MultiLineComment:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1362:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // JS.g:1370:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC174=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5235); 
                    SEMIC174_tree = (Object)adaptor.create(SEMIC174);
                    adaptor.addChild(root_0, SEMIC174_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1371:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF175=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5240); 
                    EOF175_tree = (Object)adaptor.create(EOF175);
                    adaptor.addChild(root_0, EOF175_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1372:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE176=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5245); 
                    RBRACE176_tree = (Object)adaptor.create(RBRACE176);
                    adaptor.addChild(root_0, RBRACE176_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1373:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL177=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5252); 
                    EOL177_tree = (Object)adaptor.create(EOL177);
                    adaptor.addChild(root_0, EOL177_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1373:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment178=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5256); 
                    MultiLineComment178_tree = (Object)adaptor.create(MultiLineComment178);
                    adaptor.addChild(root_0, MultiLineComment178_tree);


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
    // JS.g:1381:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block179 = null;

        statementTail_return statementTail180 = null;



        try {
            // JS.g:1386:2: ({...}? block | statementTail )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LBRACE) ) {
                int LA49_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statement options {k=1; } : ({...}? block | statementTail );", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA49_0>=NULL && LA49_0<=BREAK)||(LA49_0>=CONTINUE && LA49_0<=DO)||(LA49_0>=FOR && LA49_0<=IF)||(LA49_0>=NEW && LA49_0<=NAMESPACE)||LA49_0==CONST||LA49_0==LPAREN||LA49_0==LBRACK||LA49_0==SEMIC||(LA49_0>=ADD && LA49_0<=SUB)||(LA49_0>=INC && LA49_0<=DEC)||(LA49_0>=NOT && LA49_0<=INV)||LA49_0==AT||(LA49_0>=XMLFragment && LA49_0<=XMLFragmentEnd)||LA49_0==StringLiteral||(LA49_0>=Identifier && LA49_0<=RegularExpressionLiteral)||(LA49_0>=DecimalLiteral && LA49_0<=HexIntegerLiteral)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1381:1: statement options {k=1; } : ({...}? block | statementTail );", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // JS.g:1386:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5285);
                    block179=block();
                    _fsp--;

                    adaptor.addChild(root_0, block179.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1387:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5290);
                    statementTail180=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail180.getTree());

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
    // JS.g:1390:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement181 = null;

        emptyStatement_return emptyStatement182 = null;

        expressionStatement_return expressionStatement183 = null;

        ifStatement_return ifStatement184 = null;

        iterationStatement_return iterationStatement185 = null;

        continueStatement_return continueStatement186 = null;

        breakStatement_return breakStatement187 = null;

        returnStatement_return returnStatement188 = null;

        withStatement_return withStatement189 = null;

        labelledStatement_return labelledStatement190 = null;

        switchStatement_return switchStatement191 = null;

        throwStatement_return throwStatement192 = null;

        tryStatement_return tryStatement193 = null;

        constStatement_return constStatement194 = null;

        namespaceStatement_return namespaceStatement195 = null;



        try {
            // JS.g:1391:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt50=15;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt50=1;
                }
                break;
            case SEMIC:
                {
                alt50=2;
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
                alt50=3;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                int LA50_4 = input.LA(2);

                if ( (LA50_4==COLON) ) {
                    alt50=10;
                }
                else if ( (LA50_4==EOF||(LA50_4>=IN && LA50_4<=INSTANCEOF)||(LA50_4>=RBRACE && LA50_4<=LPAREN)||LA50_4==LBRACK||(LA50_4>=DOT && LA50_4<=XOR)||(LA50_4>=LAND && LA50_4<=QUE)||(LA50_4>=ASSIGN && LA50_4<=DIVASS)||(LA50_4>=DOTDOT && LA50_4<=COLONCOLON)||(LA50_4>=EOL && LA50_4<=MultiLineComment)) ) {
                    alt50=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1390:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 50, 4, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt50=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt50=5;
                }
                break;
            case CONTINUE:
                {
                alt50=6;
                }
                break;
            case BREAK:
                {
                alt50=7;
                }
                break;
            case RETURN:
                {
                alt50=8;
                }
                break;
            case WITH:
                {
                alt50=9;
                }
                break;
            case SWITCH:
                {
                alt50=11;
                }
                break;
            case THROW:
                {
                alt50=12;
                }
                break;
            case TRY:
                {
                alt50=13;
                }
                break;
            case CONST:
                {
                alt50=14;
                }
                break;
            case DEFAULT:
                {
                alt50=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1390:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // JS.g:1391:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5302);
                    variableStatement181=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement181.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1392:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5307);
                    emptyStatement182=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement182.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1393:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5312);
                    expressionStatement183=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement183.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1394:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5317);
                    ifStatement184=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement184.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1395:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5322);
                    iterationStatement185=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement185.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1396:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5327);
                    continueStatement186=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement186.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1397:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5332);
                    breakStatement187=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement187.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1398:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5337);
                    returnStatement188=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement188.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1399:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5342);
                    withStatement189=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement189.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1400:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5347);
                    labelledStatement190=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement190.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1401:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5352);
                    switchStatement191=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement191.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1402:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5357);
                    throwStatement192=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement192.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1403:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5362);
                    tryStatement193=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement193.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1404:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5367);
                    constStatement194=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement194.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1405:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5372);
                    namespaceStatement195=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement195.getTree());

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
    // JS.g:1410:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE197=null;
        statement_return statement196 = null;


        Object lb_tree=null;
        Object RBRACE197_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1411:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1411:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5387); 
            stream_LBRACE.add(lb);

            // JS.g:1411:14: ( statement )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=NULL && LA51_0<=BREAK)||(LA51_0>=CONTINUE && LA51_0<=DO)||(LA51_0>=FOR && LA51_0<=IF)||(LA51_0>=NEW && LA51_0<=NAMESPACE)||LA51_0==CONST||LA51_0==LBRACE||LA51_0==LPAREN||LA51_0==LBRACK||LA51_0==SEMIC||(LA51_0>=ADD && LA51_0<=SUB)||(LA51_0>=INC && LA51_0<=DEC)||(LA51_0>=NOT && LA51_0<=INV)||LA51_0==AT||(LA51_0>=XMLFragment && LA51_0<=XMLFragmentEnd)||LA51_0==StringLiteral||(LA51_0>=Identifier && LA51_0<=RegularExpressionLiteral)||(LA51_0>=DecimalLiteral && LA51_0<=HexIntegerLiteral)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // JS.g:1411:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5389);
            	    statement196=statement();
            	    _fsp--;

            	    stream_statement.add(statement196.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            RBRACE197=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5392); 
            stream_RBRACE.add(RBRACE197);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1412:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1412:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1412:28: ( statement )*
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
    // JS.g:1419:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR198=null;
        Token COMMA200=null;
        variableDeclaration_return variableDeclaration199 = null;

        variableDeclaration_return variableDeclaration201 = null;

        semic_return semic202 = null;


        Object VAR198_tree=null;
        Object COMMA200_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1420:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1420:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR198=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5421); 
            stream_VAR.add(VAR198);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5423);
            variableDeclaration199=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration199.getTree());
            // JS.g:1420:28: ( COMMA variableDeclaration )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // JS.g:1420:30: COMMA variableDeclaration
            	    {
            	    COMMA200=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5427); 
            	    stream_COMMA.add(COMMA200);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5429);
            	    variableDeclaration201=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration201.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5434);
            semic202=semic();
            _fsp--;

            stream_semic.add(semic202.getTree());

            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1421:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1421:5: ^( VAR ( variableDeclaration )+ )
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
    // JS.g:1424:1: typeRef : identifier ;
    public final typeRef_return typeRef() throws RecognitionException {
        typeRef_return retval = new typeRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier203 = null;



        try {
            // JS.g:1425:2: ( identifier )
            // JS.g:1425:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_typeRef5457);
            identifier203=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier203.getTree());

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
    // JS.g:1428:1: variableDeclaration : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON205=null;
        Token ASSIGN207=null;
        identifier_return identifier204 = null;

        typeRef_return typeRef206 = null;

        assignmentExpression_return assignmentExpression208 = null;


        Object COLON205_tree=null;
        Object ASSIGN207_tree=null;

        try {
            // JS.g:1429:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? )
            // JS.g:1429:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5468);
            identifier204=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier204.getTree(), root_0);
            // JS.g:1429:16: ({...}? => COLON typeRef )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COLON) && ( isTypeInformationEnabled() )) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // JS.g:1429:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON205=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclaration5476); 
                    COLON205_tree = (Object)adaptor.create(COLON205);
                    adaptor.addChild(root_0, COLON205_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclaration5478);
                    typeRef206=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef206.getTree());

                    }
                    break;

            }

            // JS.g:1429:69: ( ASSIGN assignmentExpression )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ASSIGN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // JS.g:1429:71: ASSIGN assignmentExpression
                    {
                    ASSIGN207=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5485); 
                    ASSIGN207_tree = (Object)adaptor.create(ASSIGN207);
                    adaptor.addChild(root_0, ASSIGN207_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5487);
                    assignmentExpression208=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression208.getTree());

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
    // JS.g:1432:1: variableDeclarationNoIn : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON210=null;
        Token ASSIGN212=null;
        identifier_return identifier209 = null;

        typeRef_return typeRef211 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn213 = null;


        Object COLON210_tree=null;
        Object ASSIGN212_tree=null;

        try {
            // JS.g:1433:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1433:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5502);
            identifier209=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier209.getTree(), root_0);
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
                        throw new FailedPredicateException(input, "variableDeclarationNoIn", " isTypeInformationEnabled() ");
                    }
                    COLON210=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclarationNoIn5510); 
                    COLON210_tree = (Object)adaptor.create(COLON210);
                    adaptor.addChild(root_0, COLON210_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclarationNoIn5512);
                    typeRef211=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef211.getTree());

                    }
                    break;

            }

            // JS.g:1433:69: ( ASSIGN assignmentExpressionNoIn )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ASSIGN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // JS.g:1433:71: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN212=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5519); 
                    ASSIGN212_tree = (Object)adaptor.create(ASSIGN212);
                    adaptor.addChild(root_0, ASSIGN212_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5521);
                    assignmentExpressionNoIn213=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn213.getTree());

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
    // JS.g:1436:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST214=null;
        Token COMMA216=null;
        variableDeclaration_return variableDeclaration215 = null;

        variableDeclaration_return variableDeclaration217 = null;

        semic_return semic218 = null;


        Object CONST214_tree=null;
        Object COMMA216_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1437:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1437:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST214=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5536); 
            stream_CONST.add(CONST214);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5538);
            variableDeclaration215=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration215.getTree());
            // JS.g:1437:31: ( COMMA variableDeclaration )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // JS.g:1437:33: COMMA variableDeclaration
            	    {
            	    COMMA216=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5542); 
            	    stream_COMMA.add(COMMA216);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5544);
            	    variableDeclaration217=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration217.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5549);
            semic218=semic();
            _fsp--;

            stream_semic.add(semic218.getTree());

            // AST REWRITE
            // elements: variableDeclaration, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1438:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1438:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1445:1: emptyStatement : SEMIC ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC219=null;

        Object SEMIC219_tree=null;

        try {
            // JS.g:1446:2: ( SEMIC )
            // JS.g:1446:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC219=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5579); 

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
    // JS.g:1459:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression220 = null;

        semic_return semic221 = null;



        try {
            // JS.g:1460:2: ( expression semic )
            // JS.g:1460:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5598);
            expression220=expression();
            _fsp--;

            adaptor.addChild(root_0, expression220.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5600);
            semic221=semic();
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
    // JS.g:1467:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF222=null;
        Token LPAREN223=null;
        Token RPAREN225=null;
        Token ELSE227=null;
        expression_return expression224 = null;

        statement_return statement226 = null;

        statement_return statement228 = null;


        Object IF222_tree=null;
        Object LPAREN223_tree=null;
        Object RPAREN225_tree=null;
        Object ELSE227_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1469:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1469:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF222=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5618); 
            stream_IF.add(IF222);

            LPAREN223=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5620); 
            stream_LPAREN.add(LPAREN223);

            pushFollow(FOLLOW_expression_in_ifStatement5622);
            expression224=expression();
            _fsp--;

            stream_expression.add(expression224.getTree());
            RPAREN225=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5624); 
            stream_RPAREN.add(RPAREN225);

            pushFollow(FOLLOW_statement_in_ifStatement5626);
            statement226=statement();
            _fsp--;

            stream_statement.add(statement226.getTree());
            // JS.g:1469:42: ({...}? ELSE statement )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ELSE) ) {
                int LA58_1 = input.LA(2);

                if ( ( input.LA(1) == ELSE ) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // JS.g:1469:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE227=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5632); 
                    stream_ELSE.add(ELSE227);

                    pushFollow(FOLLOW_statement_in_ifStatement5634);
                    statement228=statement();
                    _fsp--;

                    stream_statement.add(statement228.getTree());

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
            // 1470:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1470:5: ^( IF expression ( statement )+ )
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
    // JS.g:1477:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement229 = null;

        whileStatement_return whileStatement230 = null;

        forEachStatement_return forEachStatement231 = null;

        forStatement_return forStatement232 = null;



        try {
            // JS.g:1478:2: ( doStatement | whileStatement | forEachStatement | forStatement )
            int alt59=4;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt59=1;
                }
                break;
            case WHILE:
                {
                alt59=2;
                }
                break;
            case FOR:
                {
                int LA59_3 = input.LA(2);

                if ( (LA59_3==EACH) ) {
                    alt59=3;
                }
                else if ( (LA59_3==LPAREN) ) {
                    alt59=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1477:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 59, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1477:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // JS.g:1478:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5667);
                    doStatement229=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement229.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1479:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5672);
                    whileStatement230=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement230.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1480:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5677);
                    forEachStatement231=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement231.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1481:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5682);
                    forStatement232=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement232.getTree());

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
    // JS.g:1484:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO233=null;
        Token WHILE235=null;
        Token LPAREN236=null;
        Token RPAREN238=null;
        statement_return statement234 = null;

        expression_return expression237 = null;

        semic_return semic239 = null;


        Object DO233_tree=null;
        Object WHILE235_tree=null;
        Object LPAREN236_tree=null;
        Object RPAREN238_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1485:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1485:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO233=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5694); 
            stream_DO.add(DO233);

            pushFollow(FOLLOW_statement_in_doStatement5696);
            statement234=statement();
            _fsp--;

            stream_statement.add(statement234.getTree());
            WHILE235=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5698); 
            stream_WHILE.add(WHILE235);

            LPAREN236=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5700); 
            stream_LPAREN.add(LPAREN236);

            pushFollow(FOLLOW_expression_in_doStatement5702);
            expression237=expression();
            _fsp--;

            stream_expression.add(expression237.getTree());
            RPAREN238=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5704); 
            stream_RPAREN.add(RPAREN238);

            pushFollow(FOLLOW_semic_in_doStatement5706);
            semic239=semic();
            _fsp--;

            stream_semic.add(semic239.getTree());

            // AST REWRITE
            // elements: statement, DO, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1486:2: -> ^( DO statement expression )
            {
                // JS.g:1486:5: ^( DO statement expression )
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
    // JS.g:1489:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE240=null;
        Token LPAREN241=null;
        Token RPAREN243=null;
        expression_return expression242 = null;

        statement_return statement244 = null;


        Object WHILE240_tree=null;
        Object LPAREN241_tree=null;
        Object RPAREN243_tree=null;

        try {
            // JS.g:1490:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1490:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE240=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5731); 
            WHILE240_tree = (Object)adaptor.create(WHILE240);
            root_0 = (Object)adaptor.becomeRoot(WHILE240_tree, root_0);

            LPAREN241=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5734); 
            pushFollow(FOLLOW_expression_in_whileStatement5737);
            expression242=expression();
            _fsp--;

            adaptor.addChild(root_0, expression242.getTree());
            RPAREN243=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5739); 
            pushFollow(FOLLOW_statement_in_whileStatement5742);
            statement244=statement();
            _fsp--;

            adaptor.addChild(root_0, statement244.getTree());

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
    // JS.g:1535:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH245=null;
        Token LPAREN246=null;
        Token RPAREN248=null;
        forEachControl_return forEachControl247 = null;

        statement_return statement249 = null;


        Object forKeyword_tree=null;
        Object EACH245_tree=null;
        Object LPAREN246_tree=null;
        Object RPAREN248_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1536:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1536:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5759); 
            stream_FOR.add(forKeyword);

            EACH245=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5761); 
            stream_EACH.add(EACH245);

            LPAREN246=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5763); 
            stream_LPAREN.add(LPAREN246);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5765);
            forEachControl247=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl247.getTree());
            RPAREN248=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5767); 
            stream_RPAREN.add(RPAREN248);

            pushFollow(FOLLOW_statement_in_forEachStatement5769);
            statement249=statement();
            _fsp--;

            stream_statement.add(statement249.getTree());

            // AST REWRITE
            // elements: forEachControl, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1537:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1537:7: ^( FOREACH[$forKeyword] forEachControl statement )
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
    // JS.g:1540:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar250 = null;

        forControlExpression_return forControlExpression251 = null;



        try {
            // JS.g:1541:3: ( forControlVar | forControlExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==VAR) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||(LA60_0>=EACH && LA60_0<=FUNCTION)||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||(LA60_0>=GET && LA60_0<=NAMESPACE)||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||LA60_0==AT||(LA60_0>=XMLFragment && LA60_0<=XMLFragmentEnd)||LA60_0==StringLiteral||(LA60_0>=Identifier && LA60_0<=RegularExpressionLiteral)||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1540:1: forEachControl : ( forControlVar | forControlExpression );", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // JS.g:1541:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5797);
                    forControlVar250=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar250.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1542:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5803);
                    forControlExpression251=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression251.getTree());

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
    // JS.g:1545:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR252=null;
        Token LPAREN253=null;
        Token RPAREN255=null;
        forControl_return forControl254 = null;

        statement_return statement256 = null;


        Object FOR252_tree=null;
        Object LPAREN253_tree=null;
        Object RPAREN255_tree=null;

        try {
            // JS.g:1546:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1546:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR252=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5815); 
            FOR252_tree = (Object)adaptor.create(FOR252);
            root_0 = (Object)adaptor.becomeRoot(FOR252_tree, root_0);

            LPAREN253=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5818); 
            pushFollow(FOLLOW_forControl_in_forStatement5821);
            forControl254=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl254.getTree());
            RPAREN255=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5823); 
            pushFollow(FOLLOW_statement_in_forStatement5826);
            statement256=statement();
            _fsp--;

            adaptor.addChild(root_0, statement256.getTree());

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
    // JS.g:1549:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar257 = null;

        forControlExpression_return forControlExpression258 = null;

        forControlSemic_return forControlSemic259 = null;



        try {
            // JS.g:1550:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt61=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt61=1;
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
                alt61=2;
                }
                break;
            case SEMIC:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1549:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // JS.g:1550:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5837);
                    forControlVar257=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar257.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1551:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5842);
                    forControlExpression258=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression258.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1552:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5847);
                    forControlSemic259=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic259.getTree());

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
    // JS.g:1555:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR260=null;
        Token IN262=null;
        Token COMMA264=null;
        Token SEMIC266=null;
        Token SEMIC267=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn261 = null;

        expression_return expression263 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn265 = null;


        Object VAR260_tree=null;
        Object IN262_tree=null;
        Object COMMA264_tree=null;
        Object SEMIC266_tree=null;
        Object SEMIC267_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1556:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1556:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR260=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar5858); 
            stream_VAR.add(VAR260);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5860);
            variableDeclarationNoIn261=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn261.getTree());
            // JS.g:1557:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IN) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=SEMIC && LA65_0<=COMMA)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1557:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // JS.g:1558:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1558:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1559:4: IN expression
                    {
                    IN262=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar5872); 
                    stream_IN.add(IN262);

                    pushFollow(FOLLOW_expression_in_forControlVar5874);
                    expression263=expression();
                    _fsp--;

                    stream_expression.add(expression263.getTree());

                    // AST REWRITE
                    // elements: expression, variableDeclarationNoIn, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1560:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1560:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1560:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1560:51: ^( EXPR expression )
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
                    // JS.g:1563:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1563:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1564:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1564:4: ( COMMA variableDeclarationNoIn )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // JS.g:1564:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA264=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5920); 
                    	    stream_COMMA.add(COMMA264);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5922);
                    	    variableDeclarationNoIn265=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn265.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    SEMIC266=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5927); 
                    stream_SEMIC.add(SEMIC266);

                    // JS.g:1564:48: (ex1= expression )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||(LA63_0>=EACH && LA63_0<=FUNCTION)||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||(LA63_0>=GET && LA63_0<=NAMESPACE)||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||LA63_0==AT||(LA63_0>=XMLFragment && LA63_0<=XMLFragmentEnd)||LA63_0==StringLiteral||(LA63_0>=Identifier && LA63_0<=RegularExpressionLiteral)||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // JS.g:1564:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5931);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC267=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5934); 
                    stream_SEMIC.add(SEMIC267);

                    // JS.g:1564:70: (ex2= expression )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||(LA64_0>=EACH && LA64_0<=FUNCTION)||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||(LA64_0>=GET && LA64_0<=NAMESPACE)||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||LA64_0==AT||(LA64_0>=XMLFragment && LA64_0<=XMLFragmentEnd)||LA64_0==StringLiteral||(LA64_0>=Identifier && LA64_0<=RegularExpressionLiteral)||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // JS.g:1564:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5938);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: variableDeclarationNoIn, ex1, ex2, VAR
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1565:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1565:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1565:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1565:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1565:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1565:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1565:76: ( $ex2)?
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
    // JS.g:1570:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN268=null;
        Token SEMIC269=null;
        Token SEMIC270=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN268_tree=null;
        Object SEMIC269_tree=null;
        Object SEMIC270_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1575:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1575:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6004);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1576:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==IN) ) {
                alt68=1;
            }
            else if ( (LA68_0==SEMIC) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1576:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // JS.g:1577:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1577:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1578:4: IN ex2= expression
                    {
                    IN268=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression6019); 
                    stream_IN.add(IN268);

                    pushFollow(FOLLOW_expression_in_forControlExpression6023);
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
                    // 1579:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1579:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1579:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1579:33: ^( EXPR $ex2)
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
                    // JS.g:1582:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1582:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1583:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC269=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6069); 
                    stream_SEMIC.add(SEMIC269);

                    // JS.g:1583:13: (ex2= expression )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==DELETE||(LA66_0>=EACH && LA66_0<=FUNCTION)||LA66_0==NEW||LA66_0==THIS||LA66_0==TYPEOF||LA66_0==VOID||(LA66_0>=GET && LA66_0<=NAMESPACE)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||LA66_0==AT||(LA66_0>=XMLFragment && LA66_0<=XMLFragmentEnd)||LA66_0==StringLiteral||(LA66_0>=Identifier && LA66_0<=RegularExpressionLiteral)||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // JS.g:1583:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6073);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC270=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6076); 
                    stream_SEMIC.add(SEMIC270);

                    // JS.g:1583:35: (ex3= expression )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||(LA67_0>=EACH && LA67_0<=FUNCTION)||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||(LA67_0>=GET && LA67_0<=NAMESPACE)||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||LA67_0==AT||(LA67_0>=XMLFragment && LA67_0<=XMLFragmentEnd)||LA67_0==StringLiteral||(LA67_0>=Identifier && LA67_0<=RegularExpressionLiteral)||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // JS.g:1583:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6080);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex3, ex2, ex1
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
                    // 1584:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1584:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1584:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1584:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1584:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1584:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1584:57: ( $ex3)?
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
    // JS.g:1589:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC271=null;
        Token SEMIC272=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC271_tree=null;
        Object SEMIC272_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1590:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1590:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC271=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6139); 
            stream_SEMIC.add(SEMIC271);

            // JS.g:1590:13: (ex1= expression )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==DELETE||(LA69_0>=EACH && LA69_0<=FUNCTION)||LA69_0==NEW||LA69_0==THIS||LA69_0==TYPEOF||LA69_0==VOID||(LA69_0>=GET && LA69_0<=NAMESPACE)||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||LA69_0==AT||(LA69_0>=XMLFragment && LA69_0<=XMLFragmentEnd)||LA69_0==StringLiteral||(LA69_0>=Identifier && LA69_0<=RegularExpressionLiteral)||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // JS.g:1590:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6143);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC272=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6146); 
            stream_SEMIC.add(SEMIC272);

            // JS.g:1590:35: (ex2= expression )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=NULL && LA70_0<=FALSE)||LA70_0==DELETE||(LA70_0>=EACH && LA70_0<=FUNCTION)||LA70_0==NEW||LA70_0==THIS||LA70_0==TYPEOF||LA70_0==VOID||(LA70_0>=GET && LA70_0<=NAMESPACE)||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||LA70_0==AT||(LA70_0>=XMLFragment && LA70_0<=XMLFragmentEnd)||LA70_0==StringLiteral||(LA70_0>=Identifier && LA70_0<=RegularExpressionLiteral)||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // JS.g:1590:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6150);
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
            // 1591:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1591:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1591:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1591:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1591:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1591:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1591:50: ( $ex2)?
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
    // JS.g:1603:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE273=null;
        Token Identifier274=null;
        semic_return semic275 = null;


        Object CONTINUE273_tree=null;
        Object Identifier274_tree=null;

        try {
            // JS.g:1604:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1604:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE273=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6204); 
            CONTINUE273_tree = (Object)adaptor.create(CONTINUE273);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE273_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1604:67: ( Identifier )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Identifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1604:67: Identifier
                    {
                    Identifier274=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6209); 
                    Identifier274_tree = (Object)adaptor.create(Identifier274);
                    adaptor.addChild(root_0, Identifier274_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6212);
            semic275=semic();
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
    // JS.g:1616:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK276=null;
        Token Identifier277=null;
        semic_return semic278 = null;


        Object BREAK276_tree=null;
        Object Identifier277_tree=null;

        try {
            // JS.g:1617:2: ( BREAK ( Identifier )? semic )
            // JS.g:1617:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK276=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6231); 
            BREAK276_tree = (Object)adaptor.create(BREAK276);
            root_0 = (Object)adaptor.becomeRoot(BREAK276_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1617:64: ( Identifier )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Identifier) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1617:64: Identifier
                    {
                    Identifier277=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6236); 
                    Identifier277_tree = (Object)adaptor.create(Identifier277);
                    adaptor.addChild(root_0, Identifier277_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6239);
            semic278=semic();
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
    // JS.g:1637:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN279=null;
        expression_return expression280 = null;

        semic_return semic281 = null;


        Object RETURN279_tree=null;

        try {
            // JS.g:1638:2: ( RETURN ( expression )? semic )
            // JS.g:1638:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN279=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6258); 
            RETURN279_tree = (Object)adaptor.create(RETURN279);
            root_0 = (Object)adaptor.becomeRoot(RETURN279_tree, root_0);

             promoteEOL(null); 
            // JS.g:1638:34: ( expression )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=NULL && LA73_0<=FALSE)||LA73_0==DELETE||(LA73_0>=EACH && LA73_0<=FUNCTION)||LA73_0==NEW||LA73_0==THIS||LA73_0==TYPEOF||LA73_0==VOID||(LA73_0>=GET && LA73_0<=NAMESPACE)||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||LA73_0==AT||(LA73_0>=XMLFragment && LA73_0<=XMLFragmentEnd)||LA73_0==StringLiteral||(LA73_0>=Identifier && LA73_0<=RegularExpressionLiteral)||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1638:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6263);
                    expression280=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression280.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6266);
            semic281=semic();
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
    // JS.g:1645:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH282=null;
        Token LPAREN283=null;
        Token RPAREN285=null;
        expression_return expression284 = null;

        statement_return statement286 = null;


        Object WITH282_tree=null;
        Object LPAREN283_tree=null;
        Object RPAREN285_tree=null;

        try {
            // JS.g:1646:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1646:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH282=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6283); 
            WITH282_tree = (Object)adaptor.create(WITH282);
            root_0 = (Object)adaptor.becomeRoot(WITH282_tree, root_0);

            LPAREN283=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6286); 
            pushFollow(FOLLOW_expression_in_withStatement6289);
            expression284=expression();
            _fsp--;

            adaptor.addChild(root_0, expression284.getTree());
            RPAREN285=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6291); 
            pushFollow(FOLLOW_statement_in_withStatement6294);
            statement286=statement();
            _fsp--;

            adaptor.addChild(root_0, statement286.getTree());

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
    // JS.g:1653:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH287=null;
        Token LPAREN288=null;
        Token RPAREN290=null;
        Token LBRACE291=null;
        Token RBRACE294=null;
        expression_return expression289 = null;

        defaultClause_return defaultClause292 = null;

        caseClause_return caseClause293 = null;


        Object SWITCH287_tree=null;
        Object LPAREN288_tree=null;
        Object RPAREN290_tree=null;
        Object LBRACE291_tree=null;
        Object RBRACE294_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");

        	int defaultClauseCount = 0;

        try {
            // JS.g:1658:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // JS.g:1658:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH287=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6315); 
            stream_SWITCH.add(SWITCH287);

            LPAREN288=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6317); 
            stream_LPAREN.add(LPAREN288);

            pushFollow(FOLLOW_expression_in_switchStatement6319);
            expression289=expression();
            _fsp--;

            stream_expression.add(expression289.getTree());
            RPAREN290=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6321); 
            stream_RPAREN.add(RPAREN290);

            LBRACE291=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6323); 
            stream_LBRACE.add(LBRACE291);

            // JS.g:1658:43: ({...}? => defaultClause | caseClause )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==DEFAULT) && ( defaultClauseCount == 0 )) {
                    alt74=1;
                }
                else if ( (LA74_0==CASE) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // JS.g:1658:45: {...}? => defaultClause
            	    {
            	    if ( !( defaultClauseCount == 0 ) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6330);
            	    defaultClause292=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause292.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1658:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6336);
            	    caseClause293=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause293.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            RBRACE294=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6341); 
            stream_RBRACE.add(RBRACE294);


            // AST REWRITE
            // elements: SWITCH, caseClause, defaultClause, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1659:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // JS.g:1659:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1659:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
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

        Token CASE295=null;
        Token COLON297=null;
        expression_return expression296 = null;

        statement_return statement298 = null;


        Object CASE295_tree=null;
        Object COLON297_tree=null;

        try {
            // JS.g:1663:2: ( CASE expression COLON ( statement )* )
            // JS.g:1663:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE295=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6369); 
            CASE295_tree = (Object)adaptor.create(CASE295);
            root_0 = (Object)adaptor.becomeRoot(CASE295_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6372);
            expression296=expression();
            _fsp--;

            adaptor.addChild(root_0, expression296.getTree());
            COLON297=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6374); 
            // JS.g:1663:28: ( statement )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==DEFAULT) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==WXML) ) {
                        alt75=1;
                    }


                }
                else if ( ((LA75_0>=NULL && LA75_0<=BREAK)||LA75_0==CONTINUE||(LA75_0>=DELETE && LA75_0<=DO)||(LA75_0>=FOR && LA75_0<=IF)||(LA75_0>=NEW && LA75_0<=NAMESPACE)||LA75_0==CONST||LA75_0==LBRACE||LA75_0==LPAREN||LA75_0==LBRACK||LA75_0==SEMIC||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)||LA75_0==AT||(LA75_0>=XMLFragment && LA75_0<=XMLFragmentEnd)||LA75_0==StringLiteral||(LA75_0>=Identifier && LA75_0<=RegularExpressionLiteral)||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // JS.g:1663:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6377);
            	    statement298=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement298.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
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

        Token DEFAULT299=null;
        Token COLON300=null;
        statement_return statement301 = null;


        Object DEFAULT299_tree=null;
        Object COLON300_tree=null;

        try {
            // JS.g:1667:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1667:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT299=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6390); 
            DEFAULT299_tree = (Object)adaptor.create(DEFAULT299);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT299_tree, root_0);

            COLON300=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6393); 
            // JS.g:1667:20: ( statement )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==DEFAULT) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==WXML) ) {
                        alt76=1;
                    }


                }
                else if ( ((LA76_0>=NULL && LA76_0<=BREAK)||LA76_0==CONTINUE||(LA76_0>=DELETE && LA76_0<=DO)||(LA76_0>=FOR && LA76_0<=IF)||(LA76_0>=NEW && LA76_0<=NAMESPACE)||LA76_0==CONST||LA76_0==LBRACE||LA76_0==LPAREN||LA76_0==LBRACK||LA76_0==SEMIC||(LA76_0>=ADD && LA76_0<=SUB)||(LA76_0>=INC && LA76_0<=DEC)||(LA76_0>=NOT && LA76_0<=INV)||LA76_0==AT||(LA76_0>=XMLFragment && LA76_0<=XMLFragmentEnd)||LA76_0==StringLiteral||(LA76_0>=Identifier && LA76_0<=RegularExpressionLiteral)||(LA76_0>=DecimalLiteral && LA76_0<=HexIntegerLiteral)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // JS.g:1667:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6396);
            	    statement301=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement301.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
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

        Token COLON303=null;
        identifier_return identifier302 = null;

        statement_return statement304 = null;


        Object COLON303_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1675:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1675:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6413);
            identifier302=identifier();
            _fsp--;

            stream_identifier.add(identifier302.getTree());
            COLON303=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6415); 
            stream_COLON.add(COLON303);

            pushFollow(FOLLOW_statement_in_labelledStatement6417);
            statement304=statement();
            _fsp--;

            stream_statement.add(statement304.getTree());

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

        Token THROW305=null;
        expression_return expression306 = null;

        semic_return semic307 = null;


        Object THROW305_tree=null;

        try {
            // JS.g:1699:2: ( THROW expression semic )
            // JS.g:1699:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW305=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6448); 
            THROW305_tree = (Object)adaptor.create(THROW305);
            root_0 = (Object)adaptor.becomeRoot(THROW305_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6453);
            expression306=expression();
            _fsp--;

            adaptor.addChild(root_0, expression306.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6455);
            semic307=semic();
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

        Token TRY308=null;
        block_return block309 = null;

        catchClause_return catchClause310 = null;

        finallyClause_return finallyClause311 = null;

        finallyClause_return finallyClause312 = null;


        Object TRY308_tree=null;

        try {
            // JS.g:1707:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1707:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY308=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6472); 
            TRY308_tree = (Object)adaptor.create(TRY308);
            root_0 = (Object)adaptor.becomeRoot(TRY308_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6475);
            block309=block();
            _fsp--;

            adaptor.addChild(root_0, block309.getTree());
            // JS.g:1707:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==CATCH) ) {
                alt79=1;
            }
            else if ( (LA79_0==FINALLY) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1707:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // JS.g:1707:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1707:17: ( catchClause )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==CATCH) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // JS.g:1707:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6479);
                    	    catchClause310=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause310.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // JS.g:1707:30: ( finallyClause )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==FINALLY) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // JS.g:1707:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6482);
                            finallyClause311=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause311.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1707:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6487);
                    finallyClause312=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause312.getTree());

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

        Token CATCH313=null;
        Token LPAREN314=null;
        Token RPAREN317=null;
        identifier_return identifier315 = null;

        catchFilter_return catchFilter316 = null;

        block_return block318 = null;


        Object CATCH313_tree=null;
        Object LPAREN314_tree=null;
        Object RPAREN317_tree=null;

        try {
            // JS.g:1711:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1711:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH313=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6501); 
            CATCH313_tree = (Object)adaptor.create(CATCH313);
            root_0 = (Object)adaptor.becomeRoot(CATCH313_tree, root_0);

            LPAREN314=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6504); 
            pushFollow(FOLLOW_identifier_in_catchClause6507);
            identifier315=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier315.getTree());
            // JS.g:1711:30: ( catchFilter )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==IF) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // JS.g:1711:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6509);
                    catchFilter316=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter316.getTree());

                    }
                    break;

            }

            RPAREN317=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6512); 
            pushFollow(FOLLOW_block_in_catchClause6515);
            block318=block();
            _fsp--;

            adaptor.addChild(root_0, block318.getTree());

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
    // JS.g:1714:1: catchFilter : IF instanceofExpression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF319=null;
        instanceofExpression_return instanceofExpression320 = null;


        Object IF319_tree=null;

        try {
            // JS.g:1715:3: ( IF instanceofExpression )
            // JS.g:1715:5: IF instanceofExpression
            {
            root_0 = (Object)adaptor.nil();

            IF319=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6528); 
            IF319_tree = (Object)adaptor.create(IF319);
            root_0 = (Object)adaptor.becomeRoot(IF319_tree, root_0);

            pushFollow(FOLLOW_instanceofExpression_in_catchFilter6531);
            instanceofExpression320=instanceofExpression();
            _fsp--;

            adaptor.addChild(root_0, instanceofExpression320.getTree());

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

    public static class instanceofExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start instanceofExpression
    // JS.g:1718:1: instanceofExpression : identifier INSTANCEOF identifier ;
    public final instanceofExpression_return instanceofExpression() throws RecognitionException {
        instanceofExpression_return retval = new instanceofExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF322=null;
        identifier_return identifier321 = null;

        identifier_return identifier323 = null;


        Object INSTANCEOF322_tree=null;

        try {
            // JS.g:1719:3: ( identifier INSTANCEOF identifier )
            // JS.g:1719:5: identifier INSTANCEOF identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_instanceofExpression6546);
            identifier321=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier321.getTree());
            INSTANCEOF322=(Token)input.LT(1);
            match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceofExpression6548); 
            INSTANCEOF322_tree = (Object)adaptor.create(INSTANCEOF322);
            root_0 = (Object)adaptor.becomeRoot(INSTANCEOF322_tree, root_0);

            pushFollow(FOLLOW_identifier_in_instanceofExpression6551);
            identifier323=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier323.getTree());

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
    // $ANTLR end instanceofExpression

    public static class finallyClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start finallyClause
    // JS.g:1722:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY324=null;
        block_return block325 = null;


        Object FINALLY324_tree=null;

        try {
            // JS.g:1723:2: ( FINALLY block )
            // JS.g:1723:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY324=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6564); 
            FINALLY324_tree = (Object)adaptor.create(FINALLY324);
            root_0 = (Object)adaptor.becomeRoot(FINALLY324_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6567);
            block325=block();
            _fsp--;

            adaptor.addChild(root_0, block325.getTree());

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
    // JS.g:1736:1: functionDeclaration : FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION326=null;
        Token COLON328=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList327 = null;

        typeRef_return typeRef329 = null;

        functionBody_return functionBody330 = null;


        Object FUNCTION326_tree=null;
        Object COLON328_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1737:2: ( FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody ) )
            // JS.g:1737:4: FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION326=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6588); 
            stream_FUNCTION.add(FUNCTION326);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6592);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6594);
            formalParameterList327=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList327.getTree());
            // JS.g:1737:49: ({...}? => COLON typeRef )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==COLON) && ( isTypeInformationEnabled() )) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // JS.g:1737:51: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON328=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionDeclaration6601); 
                    stream_COLON.add(COLON328);

                    pushFollow(FOLLOW_typeRef_in_functionDeclaration6603);
                    typeRef329=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef329.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionDeclaration6608);
            functionBody330=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody330.getTree());

            // AST REWRITE
            // elements: formalParameterList, name, functionBody, typeRef, COLON, FUNCTION
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1738:2: -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody )
            {
                // JS.g:1738:5: ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1738:43: ( COLON )?
                if ( stream_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_COLON.next());

                }
                stream_COLON.reset();
                // JS.g:1738:50: ( typeRef )?
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
    // JS.g:1741:1: functionExpression : FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION331=null;
        Token COLON333=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList332 = null;

        typeRef_return typeRef334 = null;

        functionBody_return functionBody335 = null;


        Object FUNCTION331_tree=null;
        Object COLON333_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1742:2: ( FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1742:4: FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION331=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6641); 
            stream_FUNCTION.add(FUNCTION331);

            // JS.g:1742:17: (name= identifier )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==EACH||(LA82_0>=GET && LA82_0<=SET)||(LA82_0>=WXML && LA82_0<=NAMESPACE)||LA82_0==Identifier) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // JS.g:1742:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6645);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6648);
            formalParameterList332=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList332.getTree());
            // JS.g:1742:50: ({...}? => COLON typeRef )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==COLON) && ( isTypeInformationEnabled() )) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // JS.g:1742:52: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionExpression", " isTypeInformationEnabled() ");
                    }
                    COLON333=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionExpression6655); 
                    stream_COLON.add(COLON333);

                    pushFollow(FOLLOW_typeRef_in_functionExpression6657);
                    typeRef334=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef334.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionExpression6662);
            functionBody335=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody335.getTree());

            // AST REWRITE
            // elements: name, functionBody, FUNCTION, formalParameterList
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1743:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1743:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1743:17: ( $name)?
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
    // JS.g:1746:1: formalParameter : identifier ({...}? => COLON typeRef )? ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON337=null;
        identifier_return identifier336 = null;

        typeRef_return typeRef338 = null;


        Object COLON337_tree=null;

        try {
            // JS.g:1747:2: ( identifier ({...}? => COLON typeRef )? )
            // JS.g:1747:4: identifier ({...}? => COLON typeRef )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameter6690);
            identifier336=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier336.getTree(), root_0);
            // JS.g:1747:16: ({...}? => COLON typeRef )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==COLON) && ( isTypeInformationEnabled() )) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // JS.g:1747:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "formalParameter", " isTypeInformationEnabled() ");
                    }
                    COLON337=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_formalParameter6698); 
                    COLON337_tree = (Object)adaptor.create(COLON337);
                    adaptor.addChild(root_0, COLON337_tree);

                    pushFollow(FOLLOW_typeRef_in_formalParameter6700);
                    typeRef338=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef338.getTree());

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
    // JS.g:1750:1: formalParameterList : LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN339=null;
        Token COMMA341=null;
        Token RPAREN343=null;
        formalParameter_return formalParameter340 = null;

        formalParameter_return formalParameter342 = null;


        Object LPAREN339_tree=null;
        Object COMMA341_tree=null;
        Object RPAREN343_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // JS.g:1751:2: ( LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) )
            // JS.g:1751:4: LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN
            {
            LPAREN339=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6714); 
            stream_LPAREN.add(LPAREN339);

            // JS.g:1751:11: ( formalParameter ( COMMA formalParameter )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==EACH||(LA86_0>=GET && LA86_0<=SET)||(LA86_0>=WXML && LA86_0<=NAMESPACE)||LA86_0==Identifier) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // JS.g:1751:13: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_formalParameterList6718);
                    formalParameter340=formalParameter();
                    _fsp--;

                    stream_formalParameter.add(formalParameter340.getTree());
                    // JS.g:1751:29: ( COMMA formalParameter )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==COMMA) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // JS.g:1751:31: COMMA formalParameter
                    	    {
                    	    COMMA341=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6722); 
                    	    stream_COMMA.add(COMMA341);

                    	    pushFollow(FOLLOW_formalParameter_in_formalParameterList6724);
                    	    formalParameter342=formalParameter();
                    	    _fsp--;

                    	    stream_formalParameter.add(formalParameter342.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN343=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6732); 
            stream_RPAREN.add(RPAREN343);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1752:2: -> ^( ARGUMENTS ( formalParameter )* )
            {
                // JS.g:1752:5: ^( ARGUMENTS ( formalParameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // JS.g:1752:18: ( formalParameter )*
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
    // JS.g:1755:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE345=null;
        sourceElement_return sourceElement344 = null;


        Object lb_tree=null;
        Object RBRACE345_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
         pushState(JSParserRule.FUNCTION_BODY); 
        try {
            // JS.g:1757:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1757:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6762); 
            stream_LBRACE.add(lb);

            // JS.g:1757:14: ( sourceElement )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=NULL && LA87_0<=BREAK)||(LA87_0>=CONTINUE && LA87_0<=DO)||(LA87_0>=FOR && LA87_0<=IF)||(LA87_0>=NEW && LA87_0<=NAMESPACE)||LA87_0==CONST||LA87_0==LBRACE||LA87_0==LPAREN||LA87_0==LBRACK||LA87_0==SEMIC||(LA87_0>=ADD && LA87_0<=SUB)||(LA87_0>=INC && LA87_0<=DEC)||(LA87_0>=NOT && LA87_0<=INV)||LA87_0==AT||(LA87_0>=XMLFragment && LA87_0<=XMLFragmentEnd)||LA87_0==StringLiteral||(LA87_0>=Identifier && LA87_0<=RegularExpressionLiteral)||(LA87_0>=DecimalLiteral && LA87_0<=HexIntegerLiteral)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // JS.g:1757:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6764);
            	    sourceElement344=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement344.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            RBRACE345=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6767); 
            stream_RBRACE.add(RBRACE345);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1758:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1758:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1758:28: ( sourceElement )*
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
    // JS.g:1767:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN346=null;
        Token RPAREN347=null;
        identifier_return name = null;

        functionBody_return functionBody348 = null;


        Object get_tree=null;
        Object LPAREN346_tree=null;
        Object RPAREN347_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1768:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) )
            // JS.g:1768:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6804); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6808);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN346=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6810); 
            stream_LPAREN.add(LPAREN346);

            RPAREN347=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6812); 
            stream_RPAREN.add(RPAREN347);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6814);
            functionBody348=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody348.getTree());

            // AST REWRITE
            // elements: functionBody, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1769:4: -> ^( GETTER[$get] identifier functionBody )
            {
                // JS.g:1769:7: ^( GETTER[$get] identifier functionBody )
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
    // JS.g:1772:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN349=null;
        Token RPAREN350=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody351 = null;


        Object set_tree=null;
        Object LPAREN349_tree=null;
        Object RPAREN350_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1773:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) )
            // JS.g:1773:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6845); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6849);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN349=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6851); 
            stream_LPAREN.add(LPAREN349);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6855);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN350=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6857); 
            stream_RPAREN.add(RPAREN350);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6859);
            functionBody351=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody351.getTree());

            // AST REWRITE
            // elements: name, functionBody, param
            // token labels: 
            // rule labels: retval, param, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"token param",param!=null?param.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1774:5: -> ^( SETTER[$set] $name $param functionBody )
            {
                // JS.g:1774:8: ^( SETTER[$set] $name $param functionBody )
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
    // JS.g:1781:1: program : ( sourceElement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF353=null;
        sourceElement_return sourceElement352 = null;


        Object EOF353_tree=null;

         pushState(JSParserRule.PROGRAM); 
        try {
            // JS.g:1783:2: ( ( sourceElement )* EOF )
            // JS.g:1783:4: ( sourceElement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // JS.g:1783:4: ( sourceElement )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=NULL && LA88_0<=BREAK)||(LA88_0>=CONTINUE && LA88_0<=DO)||(LA88_0>=FOR && LA88_0<=IF)||(LA88_0>=NEW && LA88_0<=NAMESPACE)||LA88_0==CONST||LA88_0==LBRACE||LA88_0==LPAREN||LA88_0==LBRACK||LA88_0==SEMIC||(LA88_0>=ADD && LA88_0<=SUB)||(LA88_0>=INC && LA88_0<=DEC)||(LA88_0>=NOT && LA88_0<=INV)||LA88_0==AT||(LA88_0>=XMLFragment && LA88_0<=XMLFragmentEnd)||LA88_0==StringLiteral||(LA88_0>=Identifier && LA88_0<=RegularExpressionLiteral)||(LA88_0>=DecimalLiteral && LA88_0<=HexIntegerLiteral)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // JS.g:1783:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6900);
            	    sourceElement352=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement352.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            EOF353=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program6903); 

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

    public static class sourceElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sourceElement
    // JS.g:1791:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration354 = null;

        statement_return statement355 = null;



        try {
            // JS.g:1796:2: ({...}? functionDeclaration | statement )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==FUNCTION) ) {
                int LA89_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt89=1;
                }
                else if ( (true) ) {
                    alt89=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1791:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 89, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA89_0>=NULL && LA89_0<=BREAK)||(LA89_0>=CONTINUE && LA89_0<=DO)||(LA89_0>=FOR && LA89_0<=EACH)||LA89_0==IF||(LA89_0>=NEW && LA89_0<=NAMESPACE)||LA89_0==CONST||LA89_0==LBRACE||LA89_0==LPAREN||LA89_0==LBRACK||LA89_0==SEMIC||(LA89_0>=ADD && LA89_0<=SUB)||(LA89_0>=INC && LA89_0<=DEC)||(LA89_0>=NOT && LA89_0<=INV)||LA89_0==AT||(LA89_0>=XMLFragment && LA89_0<=XMLFragmentEnd)||LA89_0==StringLiteral||(LA89_0>=Identifier && LA89_0<=RegularExpressionLiteral)||(LA89_0>=DecimalLiteral && LA89_0<=HexIntegerLiteral)) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1791:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // JS.g:1796:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6932);
                    functionDeclaration354=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration354.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1797:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6937);
                    statement355=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement355.getTree());

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


 

    public static final BitSet FOLLOW_reservedWord_in_token1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_token1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_token1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_token1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2509 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_xmlAttribute2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_MUL_in_xmlAttribute2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlLiteral_in_literal2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_xmlLiteral2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_xmlLiteral2875 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_xmlLiteral2877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_xmlLiteral2879 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_xmlLiteral2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_primaryExpression3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3718 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3747 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC026A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3755 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC026A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3826 = new BitSet(new long[]{0x0000003600020000L,0x0020000000000040L,0x00E1040000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3834 = new BitSet(new long[]{0x0000003600020000L,0x0020000000000000L,0x00E1040000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3897 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3899 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_propertyName3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3979 = new BitSet(new long[]{0x0000003602460070L,0x03200000000002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3995 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC003A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments4003 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4051 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression4072 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4097 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4101 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4123 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0001000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4125 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4148 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4150 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4169 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4171 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4258 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4313 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4395 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4397 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4399 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4437 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4441 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4456 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4478 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4508 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4512 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4527 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4546 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4550 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4577 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4591 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4595 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4618 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4637 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4641 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4660 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4674 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4678 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4697 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4717 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4721 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4724 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4738 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4742 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4745 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4761 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4765 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4768 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4784 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4788 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4791 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4806 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4810 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4813 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4828 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4832 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4835 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4854 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4858 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4861 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4875 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4879 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4882 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4897 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4901 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4904 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4919 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4923 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4926 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4945 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4949 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4952 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4954 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4971 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4975 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4978 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4980 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5011 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5018 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5099 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5106 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5135 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5180 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5387 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_block5389 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5421 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000018000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5427 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeRef5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5468 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration5476 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclaration5478 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5485 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5502 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclarationNoIn5510 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclarationNoIn5512 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5519 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5536 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000018000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5542 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5620 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5624 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5626 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5632 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5694 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5696 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5700 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5734 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5739 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5759 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5763 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5767 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5818 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement5821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5823 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5858 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5860 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar5872 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5920 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5927 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5934 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6004 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6019 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6069 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6076 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6139 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6146 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0001018000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0001018000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6258 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012E0L,0x00E3058000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6286 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6291 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6317 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6323 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6330 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6336 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6369 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6372 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6374 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6377 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6390 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6393 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6396 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6413 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6415 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6448 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000018000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6475 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6479 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6504 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6507 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6528 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_instanceofExpression_in_catchFilter6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6546 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression6548 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6588 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6594 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionDeclaration6601 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionDeclaration6603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6641 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000080L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6648 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionExpression6655 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionExpression6657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameter6690 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_formalParameter6698 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_typeRef_in_formalParameter6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6714 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000100L,0x0001000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6722 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6762 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6764 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6804 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6845 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6851 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6900 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x00E3040000000000L});
    public static final BitSet FOLLOW_EOF_in_program6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6937 = new BitSet(new long[]{0x0000000000000002L});

}
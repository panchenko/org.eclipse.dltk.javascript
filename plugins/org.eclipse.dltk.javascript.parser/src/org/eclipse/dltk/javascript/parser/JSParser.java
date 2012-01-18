// $ANTLR 3.0.1 JS.g 2012-01-18 19:12:18

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

@SuppressWarnings({"cast","unused","rawtypes","unchecked"})
public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "AT", "DOTDOT", "COLONCOLON", "XMLFragment", "XMLFragmentEnd", "XMLFragmentError", "CALL_ARGUMENTS", "ARGUMENTS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "FOREACH", "GETTER", "SETTER", "DEFAULT_XML_NAMESPACE", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XmlAttribute", "XML_LITERAL", "EMPTY_STATEMENT", "FUNCTION_DECLARATION", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminatorChar", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int PACKAGE=58;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=157;
    public static final int RegularExpressionChar=194;
    public static final int LOCALNAME=130;
    public static final int XMLFragmentEnd=121;
    public static final int MOD=89;
    public static final int SHL=92;
    public static final int CONST=43;
    public static final int DO=13;
    public static final int DQUOTE=154;
    public static final int LineTerminatorChar=167;
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
    public static final int EOL=169;
    public static final int OctalDigit=180;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int GET=33;
    public static final int WhiteSpace=162;
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
    public static final int FF=158;
    public static final int OctalEscapeSequence=188;
    public static final int RegularExpressionFirstChar=193;
    public static final int TYPEOF=28;
    public static final int GT=79;
    public static final int CALL=131;
    public static final int CharacterEscapeSequence=186;
    public static final int LAND=100;
    public static final int PINC=147;
    public static final int PROTECTED=60;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int SUB=87;
    public static final int RegularExpressionLiteral=179;
    public static final int FLOAT=50;
    public static final int DecimalIntegerLiteral=182;
    public static final int HexDigit=173;
    public static final int LPAREN=71;
    public static final int AT=117;
    public static final int IMPLEMENTS=52;
    public static final int YIELD=35;
    public static final int SHRASS=110;
    public static final int PS=166;
    public static final int MultiLineComment=170;
    public static final int ADD=86;
    public static final int ZeroToThree=187;
    public static final int ITEM=140;
    public static final int UnicodeEscapeSequence=190;
    public static final int SHUASS=111;
    public static final int SHORT=62;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=155;
    public static final int SAME=84;
    public static final int COLON=103;
    public static final int StringLiteral=172;
    public static final int XMLFragment=120;
    public static final int PAREXPR=145;
    public static final int ENUM=46;
    public static final int CALL_ARGUMENTS=123;
    public static final int NBSP=160;
    public static final int HexIntegerLiteral=185;
    public static final int SP=159;
    public static final int BLOCK=126;
    public static final int LineTerminator=168;
    public static final int INTERFACE=55;
    public static final int DIV=115;
    public static final int FUNCTION_DECLARATION=152;
    public static final int LONG=56;
    public static final int CR=164;
    public static final int PUBLIC=61;
    public static final int LOR=101;
    public static final int LT=78;
    public static final int WHILE=31;
    public static final int BackslashSequence=192;
    public static final int LS=165;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=41;
    public static final int DecimalDigit=175;
    public static final int BYFIELD=127;
    public static final int BREAK=7;
    public static final int Identifier=178;
    public static final int WXML=36;
    public static final int POS=148;
    public static final int DOUBLE=45;
    public static final int ExponentPart=181;
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
    public static final int IdentifierStartASCII=174;
    public static final int TRY=27;
    public static final int NAMESPACE=37;
    public static final int SHLASS=109;
    public static final int COLONCOLON=119;
    public static final int USP=161;
    public static final int ANDASS=112;
    public static final int EMPTY_STATEMENT=151;
    public static final int IdentifierNameASCIIStart=177;
    public static final int QUE=102;
    public static final int OR=96;
    public static final int SETTER=138;
    public static final int DEBUGGER=44;
    public static final int FOREACH=136;
    public static final int PDEC=146;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=191;
    public static final int THROW=26;
    public static final int MULASS=107;
    public static final int XmlAttribute=149;
    public static final int DEC=91;
    public static final int OctalIntegerLiteral=184;
    public static final int CLASS=42;
    public static final int HexEscapeSequence=189;
    public static final int ORASS=113;
    public static final int NAMEDVALUE=142;
    public static final int SingleLineComment=171;
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
    public static final int IdentifierPart=176;
    public static final int WITH=32;
    public static final int BYTE=40;
    public static final int XOR=97;
    public static final int VOLATILE=68;
    public static final int GETTER=137;
    public static final int NSAME=85;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=129;
    public static final int TAB=156;
    public static final int DecimalLiteral=183;
    public static final int TRUE=5;
    public static final int NEQ=83;
    public static final int FINALLY=15;
    public static final int NEG=143;
    public static final int ASSIGN=104;
    public static final int XML_LITERAL=150;
    public static final int SEMIC=76;
    public static final int EXTENDS=48;
    public static final int BSLASH=153;
    public static final int LF=163;

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


    protected boolean isXmlEnabled() {
    	return false;
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

    protected void reportReservedKeyword(Token token) {
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
    // JS.g:623:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute );
    public final token_return token() throws RecognitionException {
        token_return retval = new token_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLFragment3=null;
        Token XMLFragmentEnd4=null;
        Token NULL6=null;
        Token StringLiteral9=null;
        reservedWord_return reservedWord1 = null;

        identifier_return identifier2 = null;

        punctuator_return punctuator5 = null;

        booleanLiteral_return booleanLiteral7 = null;

        numericLiteral_return numericLiteral8 = null;

        xmlAttribute_return xmlAttribute10 = null;


        Object XMLFragment3_tree=null;
        Object XMLFragmentEnd4_tree=null;
        Object NULL6_tree=null;
        Object StringLiteral9_tree=null;

        try {
            // JS.g:624:2: ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute )
            int alt1=10;
            switch ( input.LA(1) ) {
            case WXML:
                {
                alt1=1;
                }
                break;
            case GET:
                {
                alt1=1;
                }
                break;
            case SET:
                {
                alt1=1;
                }
                break;
            case EACH:
                {
                alt1=1;
                }
                break;
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
            case YIELD:
            case NAMESPACE:
                {
                alt1=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
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
            case NULL:
                {
                alt1=6;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt1=7;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=8;
                }
                break;
            case StringLiteral:
                {
                alt1=9;
                }
                break;
            case AT:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("623:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:624:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1954);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:625:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1959);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:626:4: XMLFragment
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragment3=(Token)input.LT(1);
                    match(input,XMLFragment,FOLLOW_XMLFragment_in_token1964); 
                    XMLFragment3_tree = (Object)adaptor.create(XMLFragment3);
                    adaptor.addChild(root_0, XMLFragment3_tree);


                    }
                    break;
                case 4 :
                    // JS.g:627:4: XMLFragmentEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragmentEnd4=(Token)input.LT(1);
                    match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_token1969); 
                    XMLFragmentEnd4_tree = (Object)adaptor.create(XMLFragmentEnd4);
                    adaptor.addChild(root_0, XMLFragmentEnd4_tree);


                    }
                    break;
                case 5 :
                    // JS.g:628:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1974);
                    punctuator5=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator5.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:629:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL6=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_token1979); 
                    NULL6_tree = (Object)adaptor.create(NULL6);
                    adaptor.addChild(root_0, NULL6_tree);


                    }
                    break;
                case 7 :
                    // JS.g:630:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_token1984);
                    booleanLiteral7=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral7.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:631:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1989);
                    numericLiteral8=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral8.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:632:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral9=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1994); 
                    StringLiteral9_tree = (Object)adaptor.create(StringLiteral9);
                    adaptor.addChild(root_0, StringLiteral9_tree);


                    }
                    break;
                case 10 :
                    // JS.g:633:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_token1999);
                    xmlAttribute10=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute10.getTree());

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
    // JS.g:638:1: reservedWord : keyword ;
    public final reservedWord_return reservedWord() throws RecognitionException {
        reservedWord_return retval = new reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        keyword_return keyword11 = null;



        try {
            // JS.g:639:2: ( keyword )
            // JS.g:639:4: keyword
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_keyword_in_reservedWord2012);
            keyword11=keyword();
            _fsp--;

            adaptor.addChild(root_0, keyword11.getTree());

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
    // JS.g:646:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // JS.g:647:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=NAMESPACE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set12));
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
    // JS.g:684:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:685:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=CLASS)||(input.LA(1)>=DEBUGGER && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set13));
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
    // JS.g:757:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier );
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WXML14=null;
        Token GET15=null;
        Token SET16=null;
        Token EACH17=null;
        Token NAMESPACE18=null;
        Token Identifier19=null;
        futureReservedWord_return word = null;


        Object WXML14_tree=null;
        Object GET15_tree=null;
        Object SET16_tree=null;
        Object EACH17_tree=null;
        Object NAMESPACE18_tree=null;
        Object Identifier19_tree=null;
        RewriteRuleSubtreeStream stream_futureReservedWord=new RewriteRuleSubtreeStream(adaptor,"rule futureReservedWord");
        try {
            // JS.g:758:3: ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier )
            int alt2=7;
            switch ( input.LA(1) ) {
            case WXML:
                {
                alt2=1;
                }
                break;
            case GET:
                {
                alt2=2;
                }
                break;
            case SET:
                {
                alt2=3;
                }
                break;
            case EACH:
                {
                alt2=4;
                }
                break;
            case NAMESPACE:
                {
                alt2=5;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
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
                alt2=6;
                }
                break;
            case Identifier:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("757:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:758:5: WXML
                    {
                    root_0 = (Object)adaptor.nil();

                    WXML14=(Token)input.LT(1);
                    match(input,WXML,FOLLOW_WXML_in_identifier2466); 
                    WXML14_tree = (Object)adaptor.create(WXML14);
                    adaptor.addChild(root_0, WXML14_tree);


                    }
                    break;
                case 2 :
                    // JS.g:759:5: GET
                    {
                    root_0 = (Object)adaptor.nil();

                    GET15=(Token)input.LT(1);
                    match(input,GET,FOLLOW_GET_in_identifier2472); 
                    GET15_tree = (Object)adaptor.create(GET15);
                    adaptor.addChild(root_0, GET15_tree);


                    }
                    break;
                case 3 :
                    // JS.g:760:5: SET
                    {
                    root_0 = (Object)adaptor.nil();

                    SET16=(Token)input.LT(1);
                    match(input,SET,FOLLOW_SET_in_identifier2478); 
                    SET16_tree = (Object)adaptor.create(SET16);
                    adaptor.addChild(root_0, SET16_tree);


                    }
                    break;
                case 4 :
                    // JS.g:761:5: EACH
                    {
                    root_0 = (Object)adaptor.nil();

                    EACH17=(Token)input.LT(1);
                    match(input,EACH,FOLLOW_EACH_in_identifier2484); 
                    EACH17_tree = (Object)adaptor.create(EACH17);
                    adaptor.addChild(root_0, EACH17_tree);


                    }
                    break;
                case 5 :
                    // JS.g:762:5: NAMESPACE
                    {
                    root_0 = (Object)adaptor.nil();

                    NAMESPACE18=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_identifier2490); 
                    NAMESPACE18_tree = (Object)adaptor.create(NAMESPACE18);
                    adaptor.addChild(root_0, NAMESPACE18_tree);


                    }
                    break;
                case 6 :
                    // JS.g:763:5: word= futureReservedWord
                    {
                    pushFollow(FOLLOW_futureReservedWord_in_identifier2498);
                    word=futureReservedWord();
                    _fsp--;

                    stream_futureReservedWord.add(word.getTree());
                     reportReservedKeyword(word.start); 

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 763:68: -> Identifier[word.start]
                    {
                        adaptor.addChild(root_0, adaptor.create(Identifier, word.start));

                    }



                    }
                    break;
                case 7 :
                    // JS.g:764:5: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier19=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_identifier2511); 
                    Identifier19_tree = (Object)adaptor.create(Identifier19);
                    adaptor.addChild(root_0, Identifier19_tree);


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
    // $ANTLR end identifier

    public static class xmlAttribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start xmlAttribute
    // JS.g:767:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );
    public final xmlAttribute_return xmlAttribute() throws RecognitionException {
        xmlAttribute_return retval = new xmlAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT20=null;
        Token AT22=null;
        Token MUL23=null;
        identifier_return identifier21 = null;


        Object AT20_tree=null;
        Object AT22_tree=null;
        Object MUL23_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:768:3: ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==AT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==MUL) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EACH||(LA3_1>=GET && LA3_1<=SET)||(LA3_1>=WXML && LA3_1<=CLASS)||(LA3_1>=DEBUGGER && LA3_1<=VOLATILE)||LA3_1==Identifier) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("767:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("767:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // JS.g:768:5: AT identifier
                    {
                    AT20=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2522); 
                    stream_AT.add(AT20);

                    pushFollow(FOLLOW_identifier_in_xmlAttribute2524);
                    identifier21=identifier();
                    _fsp--;

                    stream_identifier.add(identifier21.getTree());

                    // AST REWRITE
                    // elements: identifier, AT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 768:19: -> ^( XmlAttribute AT identifier )
                    {
                        // JS.g:768:22: ^( XmlAttribute AT identifier )
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
                    // JS.g:769:5: AT MUL
                    {
                    AT22=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2540); 
                    stream_AT.add(AT22);

                    MUL23=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_xmlAttribute2542); 
                    stream_MUL.add(MUL23);


                    // AST REWRITE
                    // elements: AT, MUL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 769:12: -> ^( XmlAttribute AT MUL )
                    {
                        // JS.g:769:15: ^( XmlAttribute AT MUL )
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
    // JS.g:776:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            // JS.g:777:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set24=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS)||(input.LA(1)>=DOTDOT && input.LA(1)<=COLONCOLON) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set24));
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
    // JS.g:833:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | {...}? => xmlLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL25=null;
        Token StringLiteral28=null;
        Token RegularExpressionLiteral29=null;
        booleanLiteral_return booleanLiteral26 = null;

        numericLiteral_return numericLiteral27 = null;

        xmlLiteral_return xmlLiteral30 = null;


        Object NULL25_tree=null;
        Object StringLiteral28_tree=null;
        Object RegularExpressionLiteral29_tree=null;

        try {
            // JS.g:834:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | {...}? => xmlLiteral )
            int alt4=6;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NULL) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=TRUE && LA4_0<=FALSE)) ) {
                alt4=2;
            }
            else if ( ((LA4_0>=DecimalLiteral && LA4_0<=HexIntegerLiteral)) ) {
                alt4=3;
            }
            else if ( (LA4_0==StringLiteral) ) {
                alt4=4;
            }
            else if ( (LA4_0==RegularExpressionLiteral) ) {
                alt4=5;
            }
            else if ( ((LA4_0>=XMLFragment && LA4_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt4=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("833:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | {...}? => xmlLiteral );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // JS.g:834:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL25=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2828); 
                    NULL25_tree = (Object)adaptor.create(NULL25);
                    adaptor.addChild(root_0, NULL25_tree);


                    }
                    break;
                case 2 :
                    // JS.g:835:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2833);
                    booleanLiteral26=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral26.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:836:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2838);
                    numericLiteral27=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral27.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:837:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral28=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2843); 
                    StringLiteral28_tree = (Object)adaptor.create(StringLiteral28);
                    adaptor.addChild(root_0, StringLiteral28_tree);


                    }
                    break;
                case 5 :
                    // JS.g:838:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral29=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2848); 
                    RegularExpressionLiteral29_tree = (Object)adaptor.create(RegularExpressionLiteral29);
                    adaptor.addChild(root_0, RegularExpressionLiteral29_tree);


                    }
                    break;
                case 6 :
                    // JS.g:839:4: {...}? => xmlLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "literal", " isXmlEnabled() ");
                    }
                    pushFollow(FOLLOW_xmlLiteral_in_literal2856);
                    xmlLiteral30=xmlLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, xmlLiteral30.getTree());

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
    // JS.g:842:1: xmlLiteral : ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) ;
    public final xmlLiteral_return xmlLiteral() throws RecognitionException {
        xmlLiteral_return retval = new xmlLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLFragment31=null;
        Token LBRACE32=null;
        Token RBRACE34=null;
        Token XMLFragmentEnd35=null;
        expression_return expression33 = null;


        Object XMLFragment31_tree=null;
        Object LBRACE32_tree=null;
        Object RBRACE34_tree=null;
        Object XMLFragmentEnd35_tree=null;
        RewriteRuleTokenStream stream_XMLFragment=new RewriteRuleTokenStream(adaptor,"token XMLFragment");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_XMLFragmentEnd=new RewriteRuleTokenStream(adaptor,"token XMLFragmentEnd");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:843:2: ( ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) )
            // JS.g:843:4: ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd
            {
            // JS.g:843:4: ( XMLFragment LBRACE expression RBRACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==XMLFragment) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JS.g:844:6: XMLFragment LBRACE expression RBRACE
            	    {
            	    XMLFragment31=(Token)input.LT(1);
            	    match(input,XMLFragment,FOLLOW_XMLFragment_in_xmlLiteral2874); 
            	    stream_XMLFragment.add(XMLFragment31);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_EXPRESSION); 
            	    LBRACE32=(Token)input.LT(1);
            	    match(input,LBRACE,FOLLOW_LBRACE_in_xmlLiteral2891); 
            	    stream_LBRACE.add(LBRACE32);

            	    pushFollow(FOLLOW_expression_in_xmlLiteral2893);
            	    expression33=expression();
            	    _fsp--;

            	    stream_expression.add(expression33.getTree());
            	    RBRACE34=(Token)input.LT(1);
            	    match(input,RBRACE,FOLLOW_RBRACE_in_xmlLiteral2895); 
            	    stream_RBRACE.add(RBRACE34);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_XML); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            XMLFragmentEnd35=(Token)input.LT(1);
            match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_xmlLiteral2911); 
            stream_XMLFragmentEnd.add(XMLFragmentEnd35);


            // AST REWRITE
            // elements: expression, XMLFragment, XMLFragmentEnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 849:4: -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
            {
                // JS.g:849:7: ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);

                // JS.g:849:21: ( XMLFragment )*
                while ( stream_XMLFragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_XMLFragment.next());

                }
                stream_XMLFragment.reset();
                // JS.g:849:34: ( expression )*
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
    // JS.g:873:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set36=null;

        Object set36_tree=null;

        try {
            // JS.g:874:2: ( TRUE | FALSE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set36=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set36));
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
    // JS.g:920:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;

        Object set37_tree=null;

        try {
            // JS.g:921:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set37=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set37));
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
    // JS.g:1010:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS38=null;
        identifier_return identifier39 = null;

        xmlAttribute_return xmlAttribute40 = null;

        literal_return literal41 = null;

        arrayLiteral_return arrayLiteral42 = null;

        objectLiteral_return objectLiteral43 = null;

        parenExpression_return parenExpression44 = null;


        Object THIS38_tree=null;

        try {
            // JS.g:1011:2: ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
            int alt6=7;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==THIS) ) {
                alt6=1;
            }
            else if ( (LA6_0==EACH||(LA6_0>=GET && LA6_0<=SET)||(LA6_0>=WXML && LA6_0<=CLASS)||(LA6_0>=DEBUGGER && LA6_0<=VOLATILE)||LA6_0==Identifier) ) {
                alt6=2;
            }
            else if ( (LA6_0==AT) ) {
                alt6=3;
            }
            else if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==StringLiteral||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)) ) {
                alt6=4;
            }
            else if ( ((LA6_0>=XMLFragment && LA6_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt6=4;
            }
            else if ( (LA6_0==LBRACK) ) {
                alt6=5;
            }
            else if ( (LA6_0==LBRACE) ) {
                alt6=6;
            }
            else if ( (LA6_0==LPAREN) ) {
                alt6=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1010:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // JS.g:1011:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS38=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3701); 
                    THIS38_tree = (Object)adaptor.create(THIS38);
                    adaptor.addChild(root_0, THIS38_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1012:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3706);
                    identifier39=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier39.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1013:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_primaryExpression3711);
                    xmlAttribute40=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute40.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1014:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3716);
                    literal41=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal41.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1015:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3721);
                    arrayLiteral42=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral42.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1016:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3726);
                    objectLiteral43=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral43.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1017:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3731);
                    parenExpression44=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression44.getTree());

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
    // JS.g:1020:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN ) ;
    public final parenExpression_return parenExpression() throws RecognitionException {
        parenExpression_return retval = new parenExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token RPAREN46=null;
        expression_return expression45 = null;


        Object lpar_tree=null;
        Object RPAREN46_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1021:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN ) )
            // JS.g:1021:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3747); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3749);
            expression45=expression();
            _fsp--;

            stream_expression.add(expression45.getTree());
            RPAREN46=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3751); 
            stream_RPAREN.add(RPAREN46);


            // AST REWRITE
            // elements: RPAREN, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1021:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN )
            {
                // JS.g:1021:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(PAREXPR, lpar,  "PAREXPR"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                adaptor.addChild(root_1, stream_RPAREN.next());

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
    // JS.g:1024:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? rb= RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token rb=null;
        Token COMMA48=null;
        arrayItem_return arrayItem47 = null;

        arrayItem_return arrayItem49 = null;


        Object lb_tree=null;
        Object rb_tree=null;
        Object COMMA48_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:1025:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? rb= RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb) )
            // JS.g:1025:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? rb= RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3778); 
            stream_LBRACK.add(lb);

            // JS.g:1025:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=NULL && LA9_0<=FALSE)||LA9_0==EACH||LA9_0==THIS||(LA9_0>=GET && LA9_0<=SET)||(LA9_0>=WXML && LA9_0<=CLASS)||(LA9_0>=DEBUGGER && LA9_0<=VOLATILE)||LA9_0==AT||LA9_0==StringLiteral||(LA9_0>=Identifier && LA9_0<=RegularExpressionLiteral)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=XMLFragment && LA9_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt9=1;
            }
            else if ( (LA9_0==DELETE||LA9_0==FUNCTION||LA9_0==NEW||LA9_0==TYPEOF||LA9_0==VOID||LA9_0==YIELD||LA9_0==LBRACE||LA9_0==LPAREN||LA9_0==LBRACK||LA9_0==COMMA||(LA9_0>=ADD && LA9_0<=SUB)||(LA9_0>=INC && LA9_0<=DEC)||(LA9_0>=NOT && LA9_0<=INV)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RBRACK) ) {
                int LA9_4 = input.LA(2);

                if ( ( input.LA(1) == COMMA ) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // JS.g:1025:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3782);
                    arrayItem47=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem47.getTree());
                    // JS.g:1025:26: ( COMMA ( arrayItem )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:1025:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA48=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3786); 
                    	    stream_COMMA.add(COMMA48);

                    	    // JS.g:1025:34: ( arrayItem )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==EACH||LA7_0==THIS||(LA7_0>=GET && LA7_0<=SET)||(LA7_0>=WXML && LA7_0<=CLASS)||(LA7_0>=DEBUGGER && LA7_0<=VOLATILE)||LA7_0==AT||LA7_0==StringLiteral||(LA7_0>=Identifier && LA7_0<=RegularExpressionLiteral)||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( ((LA7_0>=XMLFragment && LA7_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==YIELD||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==RBRACK) ) {
                    	        int LA7_4 = input.LA(2);

                    	        if ( ( input.LA(1) == COMMA ) ) {
                    	            alt7=1;
                    	        }
                    	    }
                    	    else if ( (LA7_0==COMMA) ) {
                    	        int LA7_5 = input.LA(2);

                    	        if ( ( input.LA(1) == COMMA ) ) {
                    	            alt7=1;
                    	        }
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // JS.g:1025:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3788);
                    	            arrayItem49=arrayItem();
                    	            _fsp--;

                    	            stream_arrayItem.add(arrayItem49.getTree());

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

            rb=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3799); 
            stream_RBRACK.add(rb);


            // AST REWRITE
            // elements: arrayItem, rb
            // token labels: rb
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_rb=new RewriteRuleTokenStream(adaptor,"token rb",rb);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1026:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb)
            {
                // JS.g:1026:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:1026:28: ( arrayItem )*
                while ( stream_arrayItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayItem.next());

                }
                stream_arrayItem.reset();
                adaptor.addChild(root_1, stream_rb.next());

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
    // JS.g:1029:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1030:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:1030:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:1030:4: (expr= assignmentExpression | {...}?)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=NULL && LA10_0<=FALSE)||LA10_0==EACH||LA10_0==THIS||(LA10_0>=GET && LA10_0<=SET)||(LA10_0>=WXML && LA10_0<=CLASS)||(LA10_0>=DEBUGGER && LA10_0<=VOLATILE)||LA10_0==AT||LA10_0==StringLiteral||(LA10_0>=Identifier && LA10_0<=RegularExpressionLiteral)||(LA10_0>=DecimalLiteral && LA10_0<=HexIntegerLiteral)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=XMLFragment && LA10_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt10=1;
            }
            else if ( (LA10_0==DELETE||LA10_0==FUNCTION||LA10_0==NEW||LA10_0==TYPEOF||LA10_0==VOID||LA10_0==YIELD||LA10_0==LBRACE||LA10_0==LPAREN||LA10_0==LBRACK||(LA10_0>=ADD && LA10_0<=SUB)||(LA10_0>=INC && LA10_0<=DEC)||(LA10_0>=NOT && LA10_0<=INV)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RBRACK||LA10_0==COMMA) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1030:4: (expr= assignmentExpression | {...}?)", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1030:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3829);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1030:34: {...}?
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
            // 1031:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1031:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1031:13: ( $expr)?
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
    // JS.g:1034:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA51=null;
        Token COMMA53=null;
        Token RBRACE54=null;
        objectPropertyInitializer_return objectPropertyInitializer50 = null;

        objectPropertyInitializer_return objectPropertyInitializer52 = null;


        Object lb_tree=null;
        Object COMMA51_tree=null;
        Object COMMA53_tree=null;
        Object RBRACE54_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:1035:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) )
            // JS.g:1035:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3861); 
            stream_LBRACE.add(lb);

            // JS.g:1035:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EACH||(LA13_0>=GET && LA13_0<=SET)||(LA13_0>=WXML && LA13_0<=CLASS)||(LA13_0>=DEBUGGER && LA13_0<=VOLATILE)||LA13_0==AT||LA13_0==StringLiteral||LA13_0==Identifier||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // JS.g:1035:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3865);
                    objectPropertyInitializer50=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer50.getTree());
                    // JS.g:1035:42: ( COMMA objectPropertyInitializer )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==EACH||(LA11_1>=GET && LA11_1<=SET)||(LA11_1>=WXML && LA11_1<=CLASS)||(LA11_1>=DEBUGGER && LA11_1<=VOLATILE)||LA11_1==AT||LA11_1==StringLiteral||LA11_1==Identifier||(LA11_1>=DecimalLiteral && LA11_1<=HexIntegerLiteral)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // JS.g:1035:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA51=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3869); 
                    	    stream_COMMA.add(COMMA51);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3871);
                    	    objectPropertyInitializer52=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // JS.g:1035:79: ( COMMA )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COMMA) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // JS.g:1035:79: COMMA
                            {
                            COMMA53=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3876); 
                            stream_COMMA.add(COMMA53);


                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE54=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3881); 
            stream_RBRACE.add(RBRACE54);


            // AST REWRITE
            // elements: COMMA, objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1036:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
            {
                // JS.g:1036:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1036:30: ( objectPropertyInitializer )*
                while ( stream_objectPropertyInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectPropertyInitializer.next());

                }
                stream_objectPropertyInitializer.reset();
                // JS.g:1036:57: ( COMMA )*
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
    // JS.g:1039:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair55 = null;

        getMethodDeclaration_return getMethodDeclaration56 = null;

        setMethodDeclaration_return setMethodDeclaration57 = null;



        try {
            // JS.g:1040:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt14=3;
            switch ( input.LA(1) ) {
            case EACH:
            case WXML:
            case NAMESPACE:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
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
            case GET:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==COLON) ) {
                    alt14=1;
                }
                else if ( (LA14_2==EACH||(LA14_2>=GET && LA14_2<=SET)||(LA14_2>=WXML && LA14_2<=CLASS)||(LA14_2>=DEBUGGER && LA14_2<=VOLATILE)||LA14_2==Identifier) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1039:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case SET:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==COLON) ) {
                    alt14=1;
                }
                else if ( (LA14_3==EACH||(LA14_3>=GET && LA14_3<=SET)||(LA14_3>=WXML && LA14_3<=CLASS)||(LA14_3>=DEBUGGER && LA14_3<=VOLATILE)||LA14_3==Identifier) ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1039:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1039:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // JS.g:1040:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3908);
                    nameValuePair55=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair55.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1041:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3915);
                    getMethodDeclaration56=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration56.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1042:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3921);
                    setMethodDeclaration57=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration57.getTree());

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
    // JS.g:1045:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON59=null;
        propertyName_return propertyName58 = null;

        assignmentExpression_return assignmentExpression60 = null;


        Object COLON59_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1046:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1046:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3934);
            propertyName58=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName58.getTree());
            COLON59=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3936); 
            stream_COLON.add(COLON59);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3938);
            assignmentExpression60=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression60.getTree());

            // AST REWRITE
            // elements: propertyName, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1047:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1047:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // JS.g:1050:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral62=null;
        identifier_return identifier61 = null;

        numericLiteral_return numericLiteral63 = null;

        xmlAttribute_return xmlAttribute64 = null;


        Object StringLiteral62_tree=null;

        try {
            // JS.g:1051:2: ( identifier | StringLiteral | numericLiteral | xmlAttribute )
            int alt15=4;
            switch ( input.LA(1) ) {
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
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
                    new NoViableAltException("1050:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // JS.g:1051:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3962);
                    identifier61=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier61.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1052:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral62=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3967); 
                    StringLiteral62_tree = (Object)adaptor.create(StringLiteral62);
                    adaptor.addChild(root_0, StringLiteral62_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1053:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3972);
                    numericLiteral63=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral63.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1054:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_propertyName3977);
                    xmlAttribute64=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute64.getTree());

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
    // JS.g:1066:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression65 = null;

        functionExpression_return functionExpression66 = null;

        newExpression_return newExpression67 = null;



        try {
            // JS.g:1067:2: ( primaryExpression | functionExpression | newExpression )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=NULL && LA16_0<=FALSE)||LA16_0==EACH||LA16_0==THIS||(LA16_0>=GET && LA16_0<=SET)||(LA16_0>=WXML && LA16_0<=CLASS)||(LA16_0>=DEBUGGER && LA16_0<=VOLATILE)||LA16_0==AT||LA16_0==StringLiteral||(LA16_0>=Identifier && LA16_0<=RegularExpressionLiteral)||(LA16_0>=DecimalLiteral && LA16_0<=HexIntegerLiteral)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=XMLFragment && LA16_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt16=1;
            }
            else if ( (LA16_0==LBRACE||LA16_0==LPAREN||LA16_0==LBRACK) ) {
                alt16=1;
            }
            else if ( (LA16_0==FUNCTION) ) {
                alt16=2;
            }
            else if ( (LA16_0==NEW) ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1066:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // JS.g:1067:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3995);
                    primaryExpression65=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression65.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1068:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression4000);
                    functionExpression66=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression66.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1069:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression4005);
                    newExpression67=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression67.getTree());

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
    // JS.g:1072:1: newExpression : NEW newExpressionTail ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW68=null;
        newExpressionTail_return newExpressionTail69 = null;


        Object NEW68_tree=null;

        try {
            // JS.g:1073:2: ( NEW newExpressionTail )
            // JS.g:1073:4: NEW newExpressionTail
            {
            root_0 = (Object)adaptor.nil();

            NEW68=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression4016); 
            NEW68_tree = (Object)adaptor.create(NEW68);
            root_0 = (Object)adaptor.becomeRoot(NEW68_tree, root_0);

            pushFollow(FOLLOW_newExpressionTail_in_newExpression4019);
            newExpressionTail69=newExpressionTail();
            _fsp--;

            adaptor.addChild(root_0, newExpressionTail69.getTree());

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
    // JS.g:1077:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN70=null;
        Token COMMA72=null;
        Token RPAREN74=null;
        assignmentExpression_return assignmentExpression71 = null;

        assignmentExpression_return assignmentExpression73 = null;


        Object LPAREN70_tree=null;
        Object COMMA72_tree=null;
        Object RPAREN74_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1078:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) )
            // JS.g:1078:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN70=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments4032); 
            stream_LPAREN.add(LPAREN70);

            // JS.g:1078:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=NULL && LA18_0<=FALSE)||LA18_0==EACH||LA18_0==THIS||(LA18_0>=GET && LA18_0<=SET)||(LA18_0>=WXML && LA18_0<=CLASS)||(LA18_0>=DEBUGGER && LA18_0<=VOLATILE)||LA18_0==AT||LA18_0==StringLiteral||(LA18_0>=Identifier && LA18_0<=RegularExpressionLiteral)||(LA18_0>=DecimalLiteral && LA18_0<=HexIntegerLiteral)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=XMLFragment && LA18_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt18=1;
            }
            else if ( (LA18_0==DELETE||LA18_0==FUNCTION||LA18_0==NEW||LA18_0==TYPEOF||LA18_0==VOID||LA18_0==YIELD||LA18_0==LBRACE||LA18_0==LPAREN||LA18_0==LBRACK||(LA18_0>=ADD && LA18_0<=SUB)||(LA18_0>=INC && LA18_0<=DEC)||(LA18_0>=NOT && LA18_0<=INV)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1078:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments4036);
                    assignmentExpression71=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression71.getTree());
                    // JS.g:1078:34: ( COMMA assignmentExpression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // JS.g:1078:36: COMMA assignmentExpression
                    	    {
                    	    COMMA72=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments4040); 
                    	    stream_COMMA.add(COMMA72);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments4042);
                    	    assignmentExpression73=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN74=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments4050); 
            stream_RPAREN.add(RPAREN74);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1079:2: -> ^( CALL_ARGUMENTS ( assignmentExpression )* )
            {
                // JS.g:1079:5: ^( CALL_ARGUMENTS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL_ARGUMENTS, "CALL_ARGUMENTS"), root_1);

                // JS.g:1079:23: ( assignmentExpression )*
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
    // JS.g:1082:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK77=null;
        Token RBRACK79=null;
        Token DOT80=null;
        Token DOTDOT81=null;
        Token COLONCOLON82=null;
        rightHandSideExpression_return r = null;

        memberExpression_return memberExpression75 = null;

        arguments_return arguments76 = null;

        expression_return expression78 = null;

        expression_return expression83 = null;


        Object LBRACK77_tree=null;
        Object RBRACK79_tree=null;
        Object DOT80_tree=null;
        Object DOTDOT81_tree=null;
        Object COLONCOLON82_tree=null;
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
            // JS.g:1084:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1085:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1085:3: ( memberExpression -> memberExpression )
            // JS.g:1086:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4088);
            memberExpression75=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression75.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1086:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1088:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            loop19:
            do {
                int alt19=6;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LPAREN) ) {
                    alt19=1;
                }
                else if ( (LA19_0==LBRACK) ) {
                    alt19=2;
                }
                else if ( (LA19_0==DOT) ) {
                    alt19=3;
                }
                else if ( (LA19_0==DOTDOT) && ( isXmlEnabled() )) {
                    int LA19_5 = input.LA(2);

                    if ( ( isXmlEnabled() ) ) {
                        alt19=4;
                    }


                }
                else if ( (LA19_0==COLONCOLON) && ( isXmlEnabled() )) {
                    int LA19_6 = input.LA(2);

                    if ( ( isXmlEnabled() ) ) {
                        alt19=5;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // JS.g:1089:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression4109);
            	    arguments76=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments76.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1089:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1089:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1090:7: LBRACK expression RBRACK
            	    {
            	    LBRACK77=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4134); 
            	    stream_LBRACK.add(LBRACK77);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4136);
            	    expression78=expression();
            	    _fsp--;

            	    stream_expression.add(expression78.getTree());
            	    RBRACK79=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4138); 
            	    stream_RBRACK.add(RBRACK79);


            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1090:33: -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression )
            	    {
            	        // JS.g:1090:36: ^( BYINDEX[$LBRACK] $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, LBRACK77), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1091:7: DOT r= rightHandSideExpression
            	    {
            	    DOT80=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4161); 
            	    stream_DOT.add(DOT80);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4165);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: DOT, leftHandSideExpression, r
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1091:37: -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? )
            	    {
            	        // JS.g:1091:40: ^( BYFIELD $leftHandSideExpression DOT ( $r)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        // JS.g:1091:79: ( $r)?
            	        if ( stream_r.hasNext() ) {
            	            adaptor.addChild(root_1, stream_r.next());

            	        }
            	        stream_r.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1092:7: {...}? => DOTDOT r= rightHandSideExpression
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "leftHandSideExpression", " isXmlEnabled() ");
            	    }
            	    DOTDOT81=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4193); 
            	    stream_DOTDOT.add(DOTDOT81);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4197);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: r, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1092:62: -> ^( ALLCHILDREN $leftHandSideExpression $r)
            	    {
            	        // JS.g:1092:65: ^( ALLCHILDREN $leftHandSideExpression $r)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_r.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 5 :
            	    // JS.g:1093:7: {...}? => COLONCOLON expression
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "leftHandSideExpression", " isXmlEnabled() ");
            	    }
            	    COLONCOLON82=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4220); 
            	    stream_COLONCOLON.add(COLONCOLON82);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4222);
            	    expression83=expression();
            	    _fsp--;

            	    stream_expression.add(expression83.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1093:51: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1093:54: ^( LOCALNAME $leftHandSideExpression expression )
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

    public static class newExpressionTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start newExpressionTail
    // JS.g:1100:1: newExpressionTail : ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? ;
    public final newExpressionTail_return newExpressionTail() throws RecognitionException {
        newExpressionTail_return retval = new newExpressionTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK85=null;
        Token RBRACK87=null;
        Token DOT88=null;
        Token DOTDOT89=null;
        Token COLONCOLON90=null;
        rightHandSideExpression_return r = null;

        memberExpression_return memberExpression84 = null;

        expression_return expression86 = null;

        expression_return expression91 = null;

        arguments_return arguments92 = null;


        Object LBRACK85_tree=null;
        Object RBRACK87_tree=null;
        Object DOT88_tree=null;
        Object DOTDOT89_tree=null;
        Object COLONCOLON90_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_COLONCOLON=new RewriteRuleTokenStream(adaptor,"token COLONCOLON");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
        try {
            // JS.g:1101:3: ( ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? )
            // JS.g:1102:3: ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            {
            // JS.g:1102:3: ( memberExpression -> memberExpression )
            // JS.g:1103:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_newExpressionTail4281);
            memberExpression84=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression84.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1103:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1105:3: ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r= rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail $r) | {...}? => COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )*
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LBRACK) ) {
                    alt20=1;
                }
                else if ( (LA20_0==DOT) ) {
                    alt20=2;
                }
                else if ( (LA20_0==DOTDOT) && ( isXmlEnabled() )) {
                    int LA20_4 = input.LA(2);

                    if ( ( isXmlEnabled() ) ) {
                        alt20=3;
                    }


                }
                else if ( (LA20_0==COLONCOLON) && ( isXmlEnabled() )) {
                    int LA20_5 = input.LA(2);

                    if ( ( isXmlEnabled() ) ) {
                        alt20=4;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // JS.g:1106:5: LBRACK expression RBRACK
            	    {
            	    LBRACK85=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_newExpressionTail4302); 
            	    stream_LBRACK.add(LBRACK85);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4304);
            	    expression86=expression();
            	    _fsp--;

            	    stream_expression.add(expression86.getTree());
            	    RBRACK87=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_newExpressionTail4306); 
            	    stream_RBRACK.add(RBRACK87);


            	    // AST REWRITE
            	    // elements: newExpressionTail, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1106:31: -> ^( BYINDEX[$LBRACK] $newExpressionTail expression )
            	    {
            	        // JS.g:1106:34: ^( BYINDEX[$LBRACK] $newExpressionTail expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, LBRACK85), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 2 :
            	    // JS.g:1107:7: DOT r= rightHandSideExpression
            	    {
            	    DOT88=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_newExpressionTail4329); 
            	    stream_DOT.add(DOT88);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4333);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: r, DOT, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1107:37: -> ^( BYFIELD $newExpressionTail DOT ( $r)? )
            	    {
            	        // JS.g:1107:40: ^( BYFIELD $newExpressionTail DOT ( $r)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        // JS.g:1107:74: ( $r)?
            	        if ( stream_r.hasNext() ) {
            	            adaptor.addChild(root_1, stream_r.next());

            	        }
            	        stream_r.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1108:7: {...}? => DOTDOT r= rightHandSideExpression
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "newExpressionTail", " isXmlEnabled() ");
            	    }
            	    DOTDOT89=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_newExpressionTail4361); 
            	    stream_DOTDOT.add(DOTDOT89);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4365);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: r, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1108:62: -> ^( ALLCHILDREN $newExpressionTail $r)
            	    {
            	        // JS.g:1108:65: ^( ALLCHILDREN $newExpressionTail $r)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_r.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1109:7: {...}? => COLONCOLON expression
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "newExpressionTail", " isXmlEnabled() ");
            	    }
            	    COLONCOLON90=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_newExpressionTail4388); 
            	    stream_COLONCOLON.add(COLONCOLON90);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4390);
            	    expression91=expression();
            	    _fsp--;

            	    stream_expression.add(expression91.getTree());

            	    // AST REWRITE
            	    // elements: expression, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1109:51: -> ^( LOCALNAME $newExpressionTail expression )
            	    {
            	        // JS.g:1109:54: ^( LOCALNAME $newExpressionTail expression )
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

            // JS.g:1111:3: ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAREN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JS.g:1112:5: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_newExpressionTail4416);
                    arguments92=arguments();
                    _fsp--;

                    stream_arguments.add(arguments92.getTree());

                    // AST REWRITE
                    // elements: newExpressionTail, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1112:19: -> ^( CALL $newExpressionTail arguments )
                    {
                        // JS.g:1112:22: ^( CALL $newExpressionTail arguments )
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
    // $ANTLR end newExpressionTail

    public static class rightHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rightHandSideExpression
    // JS.g:1116:1: rightHandSideExpression : ( parenExpression | identifier | {...}? => xmlAttribute | {...}? => MUL );
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
            // JS.g:1117:3: ( parenExpression | identifier | {...}? => xmlAttribute | {...}? => MUL )
            int alt22=4;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LPAREN) ) {
                alt22=1;
            }
            else if ( (LA22_0==EACH||(LA22_0>=GET && LA22_0<=SET)||(LA22_0>=WXML && LA22_0<=CLASS)||(LA22_0>=DEBUGGER && LA22_0<=VOLATILE)||LA22_0==Identifier) ) {
                alt22=2;
            }
            else if ( (LA22_0==AT) && ( isXmlEnabled() )) {
                alt22=3;
            }
            else if ( (LA22_0==MUL) && ( isXmlEnabled() )) {
                alt22=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1116:1: rightHandSideExpression : ( parenExpression | identifier | {...}? => xmlAttribute | {...}? => MUL );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // JS.g:1117:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4451);
                    parenExpression93=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression93.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1118:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4458);
                    identifier94=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier94.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1119:5: {...}? => xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "rightHandSideExpression", " isXmlEnabled() ");
                    }
                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4467);
                    xmlAttribute95=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute95.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1120:5: {...}? => MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "rightHandSideExpression", " isXmlEnabled() ");
                    }
                    MUL96=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4476); 
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
    // JS.g:1133:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression97 = null;

        postfixOperator_return postfixOperator98 = null;



        try {
            // JS.g:1134:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1134:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4493);
            leftHandSideExpression97=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression97.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1134:95: ( postfixOperator )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INC) ) {
                alt23=1;
            }
            else if ( (LA23_0==DEC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // JS.g:1134:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4499);
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
    // JS.g:1137:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1138:2: (op= INC | op= DEC )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==INC) ) {
                alt24=1;
            }
            else if ( (LA24_0==DEC) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1137:1: postfixOperator : (op= INC | op= DEC );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // JS.g:1138:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4517); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1139:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4526); 
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
    // JS.g:1146:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression99 = null;

        unaryOperator_return unaryOperator100 = null;

        unaryExpression_return unaryExpression101 = null;



        try {
            // JS.g:1147:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=NULL && LA25_0<=FALSE)||LA25_0==EACH||LA25_0==THIS||(LA25_0>=GET && LA25_0<=SET)||(LA25_0>=WXML && LA25_0<=CLASS)||(LA25_0>=DEBUGGER && LA25_0<=VOLATILE)||LA25_0==AT||LA25_0==StringLiteral||(LA25_0>=Identifier && LA25_0<=RegularExpressionLiteral)||(LA25_0>=DecimalLiteral && LA25_0<=HexIntegerLiteral)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=XMLFragment && LA25_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt25=1;
            }
            else if ( (LA25_0==FUNCTION||LA25_0==NEW||LA25_0==LBRACE||LA25_0==LPAREN||LA25_0==LBRACK) ) {
                alt25=1;
            }
            else if ( (LA25_0==DELETE||LA25_0==TYPEOF||LA25_0==VOID||LA25_0==YIELD||(LA25_0>=ADD && LA25_0<=SUB)||(LA25_0>=INC && LA25_0<=DEC)||(LA25_0>=NOT && LA25_0<=INV)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1146:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // JS.g:1147:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4543);
                    postfixExpression99=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression99.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1148:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4548);
                    unaryOperator100=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator100.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4551);
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
    // JS.g:1151:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
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
            // JS.g:1152:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt26=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt26=1;
                }
                break;
            case VOID:
                {
                alt26=2;
                }
                break;
            case TYPEOF:
                {
                alt26=3;
                }
                break;
            case INC:
                {
                alt26=4;
                }
                break;
            case DEC:
                {
                alt26=5;
                }
                break;
            case ADD:
                {
                alt26=6;
                }
                break;
            case SUB:
                {
                alt26=7;
                }
                break;
            case INV:
                {
                alt26=8;
                }
                break;
            case NOT:
                {
                alt26=9;
                }
                break;
            case YIELD:
                {
                alt26=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1151:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // JS.g:1152:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE102=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4563); 
                    DELETE102_tree = (Object)adaptor.create(DELETE102);
                    adaptor.addChild(root_0, DELETE102_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1153:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID103=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4568); 
                    VOID103_tree = (Object)adaptor.create(VOID103);
                    adaptor.addChild(root_0, VOID103_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1154:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF104=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4573); 
                    TYPEOF104_tree = (Object)adaptor.create(TYPEOF104);
                    adaptor.addChild(root_0, TYPEOF104_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1155:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC105=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4578); 
                    INC105_tree = (Object)adaptor.create(INC105);
                    adaptor.addChild(root_0, INC105_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1156:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC106=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4583); 
                    DEC106_tree = (Object)adaptor.create(DEC106);
                    adaptor.addChild(root_0, DEC106_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1157:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4590); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1158:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4599); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1159:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV107=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4606); 
                    INV107_tree = (Object)adaptor.create(INV107);
                    adaptor.addChild(root_0, INV107_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1160:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT108=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4611); 
                    NOT108_tree = (Object)adaptor.create(NOT108);
                    adaptor.addChild(root_0, NOT108_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1161:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD109=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4616); 
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
    // JS.g:1166:1: namespaceStatement : {...}? => DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT110=null;
        Token WXML111=null;
        Token NAMESPACE112=null;
        Token ASSIGN113=null;
        expression_return expression114 = null;

        semic_return semic115 = null;


        Object DEFAULT110_tree=null;
        Object WXML111_tree=null;
        Object NAMESPACE112_tree=null;
        Object ASSIGN113_tree=null;
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1167:3: ({...}? => DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) )
            // JS.g:1167:5: {...}? => DEFAULT WXML NAMESPACE ASSIGN expression semic
            {
            if ( !( isXmlEnabled() ) ) {
                throw new FailedPredicateException(input, "namespaceStatement", " isXmlEnabled() ");
            }
            DEFAULT110=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4633); 
            stream_DEFAULT.add(DEFAULT110);

            WXML111=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4635); 
            stream_WXML.add(WXML111);

            NAMESPACE112=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4637); 
            stream_NAMESPACE.add(NAMESPACE112);

            ASSIGN113=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4639); 
            stream_ASSIGN.add(ASSIGN113);

            pushFollow(FOLLOW_expression_in_namespaceStatement4641);
            expression114=expression();
            _fsp--;

            stream_expression.add(expression114.getTree());
            pushFollow(FOLLOW_semic_in_namespaceStatement4643);
            semic115=semic();
            _fsp--;

            stream_semic.add(semic115.getTree());

            // AST REWRITE
            // elements: ASSIGN, expression, WXML, DEFAULT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1168:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
            {
                // JS.g:1168:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(DEFAULT_XML_NAMESPACE, "DEFAULT_XML_NAMESPACE"), root_1);

                adaptor.addChild(root_1, stream_DEFAULT.next());
                adaptor.addChild(root_1, stream_WXML.next());
                adaptor.addChild(root_1, stream_ASSIGN.next());
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
    // $ANTLR end namespaceStatement

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // JS.g:1173:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set117=null;
        unaryExpression_return unaryExpression116 = null;

        unaryExpression_return unaryExpression118 = null;


        Object set117_tree=null;

        try {
            // JS.g:1174:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1174:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4675);
            unaryExpression116=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression116.getTree());
            // JS.g:1174:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=MUL && LA27_0<=MOD)||LA27_0==DIV) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1174:22: ( MUL | DIV | MOD ) unaryExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4679);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4694);
            	    unaryExpression118=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression118.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // JS.g:1181:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set120=null;
        multiplicativeExpression_return multiplicativeExpression119 = null;

        multiplicativeExpression_return multiplicativeExpression121 = null;


        Object set120_tree=null;

        try {
            // JS.g:1182:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1182:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4712);
            multiplicativeExpression119=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression119.getTree());
            // JS.g:1182:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=ADD && LA28_0<=SUB)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1182:31: ( ADD | SUB ) multiplicativeExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4716);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4727);
            	    multiplicativeExpression121=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression121.getTree());

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
    // $ANTLR end additiveExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // JS.g:1189:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;
        additiveExpression_return additiveExpression122 = null;

        additiveExpression_return additiveExpression124 = null;


        Object set123_tree=null;

        try {
            // JS.g:1190:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1190:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4746);
            additiveExpression122=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression122.getTree());
            // JS.g:1190:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=SHL && LA29_0<=SHU)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1190:25: ( SHL | SHR | SHU ) additiveExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4750);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4765);
            	    additiveExpression124=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression124.getTree());

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
    // $ANTLR end shiftExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // JS.g:1197:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set126=null;
        shiftExpression_return shiftExpression125 = null;

        shiftExpression_return shiftExpression127 = null;


        Object set126_tree=null;

        try {
            // JS.g:1198:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1198:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4784);
            shiftExpression125=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression125.getTree());
            // JS.g:1198:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==INSTANCEOF||(LA30_0>=LT && LA30_0<=GTE)) ) {
                    alt30=1;
                }
                else if ( (LA30_0==IN) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1198:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4788);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4815);
            	    shiftExpression127=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression127.getTree());

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
    // $ANTLR end relationalExpression

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpressionNoIn
    // JS.g:1201:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set129=null;
        shiftExpression_return shiftExpression128 = null;

        shiftExpression_return shiftExpression130 = null;


        Object set129_tree=null;

        try {
            // JS.g:1202:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1202:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4829);
            shiftExpression128=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression128.getTree());
            // JS.g:1202:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==INSTANCEOF||(LA31_0>=LT && LA31_0<=GTE)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1202:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4833);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4856);
            	    shiftExpression130=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression130.getTree());

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
    // $ANTLR end relationalExpressionNoIn

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // JS.g:1209:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set132=null;
        relationalExpression_return relationalExpression131 = null;

        relationalExpression_return relationalExpression133 = null;


        Object set132_tree=null;

        try {
            // JS.g:1210:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1210:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4875);
            relationalExpression131=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression131.getTree());
            // JS.g:1210:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=EQ && LA32_0<=NSAME)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1210:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4879);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4898);
            	    relationalExpression133=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression133.getTree());

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
    // $ANTLR end equalityExpression

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpressionNoIn
    // JS.g:1213:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set135=null;
        relationalExpressionNoIn_return relationalExpressionNoIn134 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn136 = null;


        Object set135_tree=null;

        try {
            // JS.g:1214:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1214:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4912);
            relationalExpressionNoIn134=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn134.getTree());
            // JS.g:1214:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=EQ && LA33_0<=NSAME)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1214:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4916);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4935);
            	    relationalExpressionNoIn136=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn136.getTree());

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
    // $ANTLR end equalityExpressionNoIn

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpression
    // JS.g:1221:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND138=null;
        equalityExpression_return equalityExpression137 = null;

        equalityExpression_return equalityExpression139 = null;


        Object AND138_tree=null;

        try {
            // JS.g:1222:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1222:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4955);
            equalityExpression137=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression137.getTree());
            // JS.g:1222:23: ( AND equalityExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1222:25: AND equalityExpression
            	    {
            	    AND138=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4959); 
            	    AND138_tree = (Object)adaptor.create(AND138);
            	    root_0 = (Object)adaptor.becomeRoot(AND138_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4962);
            	    equalityExpression139=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression139.getTree());

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
    // $ANTLR end bitwiseANDExpression

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpressionNoIn
    // JS.g:1225:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND141=null;
        equalityExpressionNoIn_return equalityExpressionNoIn140 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn142 = null;


        Object AND141_tree=null;

        try {
            // JS.g:1226:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1226:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4976);
            equalityExpressionNoIn140=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn140.getTree());
            // JS.g:1226:27: ( AND equalityExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==AND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1226:29: AND equalityExpressionNoIn
            	    {
            	    AND141=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4980); 
            	    AND141_tree = (Object)adaptor.create(AND141);
            	    root_0 = (Object)adaptor.becomeRoot(AND141_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4983);
            	    equalityExpressionNoIn142=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn142.getTree());

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
    // $ANTLR end bitwiseANDExpressionNoIn

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpression
    // JS.g:1229:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR144=null;
        bitwiseANDExpression_return bitwiseANDExpression143 = null;

        bitwiseANDExpression_return bitwiseANDExpression145 = null;


        Object XOR144_tree=null;

        try {
            // JS.g:1230:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1230:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4999);
            bitwiseANDExpression143=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression143.getTree());
            // JS.g:1230:25: ( XOR bitwiseANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==XOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1230:27: XOR bitwiseANDExpression
            	    {
            	    XOR144=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression5003); 
            	    XOR144_tree = (Object)adaptor.create(XOR144);
            	    root_0 = (Object)adaptor.becomeRoot(XOR144_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression5006);
            	    bitwiseANDExpression145=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression145.getTree());

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
    // $ANTLR end bitwiseXORExpression

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpressionNoIn
    // JS.g:1233:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR147=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn146 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn148 = null;


        Object XOR147_tree=null;

        try {
            // JS.g:1234:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1234:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5022);
            bitwiseANDExpressionNoIn146=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn146.getTree());
            // JS.g:1234:29: ( XOR bitwiseANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==XOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1234:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR147=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn5026); 
            	    XOR147_tree = (Object)adaptor.create(XOR147);
            	    root_0 = (Object)adaptor.becomeRoot(XOR147_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5029);
            	    bitwiseANDExpressionNoIn148=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn148.getTree());

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
    // $ANTLR end bitwiseXORExpressionNoIn

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpression
    // JS.g:1237:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR150=null;
        bitwiseXORExpression_return bitwiseXORExpression149 = null;

        bitwiseXORExpression_return bitwiseXORExpression151 = null;


        Object OR150_tree=null;

        try {
            // JS.g:1238:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1238:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5044);
            bitwiseXORExpression149=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression149.getTree());
            // JS.g:1238:25: ( OR bitwiseXORExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1238:27: OR bitwiseXORExpression
            	    {
            	    OR150=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression5048); 
            	    OR150_tree = (Object)adaptor.create(OR150);
            	    root_0 = (Object)adaptor.becomeRoot(OR150_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5051);
            	    bitwiseXORExpression151=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression151.getTree());

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
    // $ANTLR end bitwiseORExpression

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpressionNoIn
    // JS.g:1241:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR153=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn152 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn154 = null;


        Object OR153_tree=null;

        try {
            // JS.g:1242:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1242:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5066);
            bitwiseXORExpressionNoIn152=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn152.getTree());
            // JS.g:1242:29: ( OR bitwiseXORExpressionNoIn )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==OR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1242:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR153=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn5070); 
            	    OR153_tree = (Object)adaptor.create(OR153);
            	    root_0 = (Object)adaptor.becomeRoot(OR153_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5073);
            	    bitwiseXORExpressionNoIn154=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn154.getTree());

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
    // $ANTLR end bitwiseORExpressionNoIn

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpression
    // JS.g:1249:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND156=null;
        bitwiseORExpression_return bitwiseORExpression155 = null;

        bitwiseORExpression_return bitwiseORExpression157 = null;


        Object LAND156_tree=null;

        try {
            // JS.g:1250:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1250:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5092);
            bitwiseORExpression155=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression155.getTree());
            // JS.g:1250:24: ( LAND bitwiseORExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LAND) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1250:26: LAND bitwiseORExpression
            	    {
            	    LAND156=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression5096); 
            	    LAND156_tree = (Object)adaptor.create(LAND156);
            	    root_0 = (Object)adaptor.becomeRoot(LAND156_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5099);
            	    bitwiseORExpression157=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression157.getTree());

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
    // $ANTLR end logicalANDExpression

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpressionNoIn
    // JS.g:1253:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND159=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn158 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn160 = null;


        Object LAND159_tree=null;

        try {
            // JS.g:1254:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1254:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5113);
            bitwiseORExpressionNoIn158=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn158.getTree());
            // JS.g:1254:28: ( LAND bitwiseORExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LAND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JS.g:1254:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND159=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn5117); 
            	    LAND159_tree = (Object)adaptor.create(LAND159);
            	    root_0 = (Object)adaptor.becomeRoot(LAND159_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5120);
            	    bitwiseORExpressionNoIn160=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn160.getTree());

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
    // $ANTLR end logicalANDExpressionNoIn

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpression
    // JS.g:1257:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR162=null;
        logicalANDExpression_return logicalANDExpression161 = null;

        logicalANDExpression_return logicalANDExpression163 = null;


        Object LOR162_tree=null;

        try {
            // JS.g:1258:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1258:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5135);
            logicalANDExpression161=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression161.getTree());
            // JS.g:1258:25: ( LOR logicalANDExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LOR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1258:27: LOR logicalANDExpression
            	    {
            	    LOR162=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression5139); 
            	    LOR162_tree = (Object)adaptor.create(LOR162);
            	    root_0 = (Object)adaptor.becomeRoot(LOR162_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5142);
            	    logicalANDExpression163=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression163.getTree());

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
    // $ANTLR end logicalORExpression

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpressionNoIn
    // JS.g:1261:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR165=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn164 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn166 = null;


        Object LOR165_tree=null;

        try {
            // JS.g:1262:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1262:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5157);
            logicalANDExpressionNoIn164=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn164.getTree());
            // JS.g:1262:29: ( LOR logicalANDExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LOR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1262:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR165=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn5161); 
            	    LOR165_tree = (Object)adaptor.create(LOR165);
            	    root_0 = (Object)adaptor.becomeRoot(LOR165_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5164);
            	    logicalANDExpressionNoIn166=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn166.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // JS.g:1269:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
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
            // JS.g:1270:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1270:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression5183);
            logicalORExpression167=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression167.getTree());
            // JS.g:1270:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // JS.g:1270:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE168=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression5187); 
                    QUE168_tree = (Object)adaptor.create(QUE168);
                    root_0 = (Object)adaptor.becomeRoot(QUE168_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5190);
                    assignmentExpression169=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression169.getTree());
                    COLON170=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression5192); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5195);
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
    // JS.g:1273:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
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
            // JS.g:1274:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1274:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5209);
            logicalORExpressionNoIn172=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn172.getTree());
            // JS.g:1274:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==QUE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // JS.g:1274:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE173=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn5213); 
                    QUE173_tree = (Object)adaptor.create(QUE173);
                    root_0 = (Object)adaptor.becomeRoot(QUE173_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5216);
                    assignmentExpressionNoIn174=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn174.getTree());
                    COLON175=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn5218); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5221);
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
    // JS.g:1303:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator177 = null;

        assignmentExpression_return assignmentExpression178 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1308:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1308:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5249);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1309:2: ({...}? assignmentOperator assignmentExpression )?
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
                    // JS.g:1309:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5256);
                    assignmentOperator177=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator177.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5259);
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
    // JS.g:1312:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set179=null;

        Object set179_tree=null;

        try {
            // JS.g:1313:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
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
    // JS.g:1316:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator180 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn181 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1321:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1321:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5337);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1322:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=ASSIGN && LA47_0<=XORASS)||LA47_0==DIVASS) ) {
                int LA47_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // JS.g:1322:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5344);
                    assignmentOperator180=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator180.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5347);
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
    // JS.g:1329:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
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
            // JS.g:1330:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1330:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5369);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1330:32: ( COMMA exprs+= assignmentExpression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1330:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA182=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5373); 
            	    stream_COMMA.add(COMMA182);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5377);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
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
            // 1331:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1331:28: ^( CEXPR ( $exprs)+ )
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
            else // 1332:2: -> $exprs
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
    // JS.g:1335:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
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
            // JS.g:1336:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1336:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5414);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1336:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // JS.g:1336:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA183=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5418); 
            	    stream_COMMA.add(COMMA183);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5422);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop49;
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
            // 1337:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1337:28: ^( CEXPR ( $exprs)+ )
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
            else // 1338:2: -> $exprs
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
    // JS.g:1363:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
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
            // JS.g:1371:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt50=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt50=1;
                }
                break;
            case EOF:
                {
                alt50=2;
                }
                break;
            case RBRACE:
                {
                alt50=3;
                }
                break;
            case EOL:
                {
                alt50=4;
                }
                break;
            case MultiLineComment:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1363:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // JS.g:1371:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC184=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5473); 
                    SEMIC184_tree = (Object)adaptor.create(SEMIC184);
                    adaptor.addChild(root_0, SEMIC184_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1372:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF185=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5478); 
                    EOF185_tree = (Object)adaptor.create(EOF185);
                    adaptor.addChild(root_0, EOF185_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1373:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE186=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5483); 
                    RBRACE186_tree = (Object)adaptor.create(RBRACE186);
                    adaptor.addChild(root_0, RBRACE186_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1374:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL187=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5490); 
                    EOL187_tree = (Object)adaptor.create(EOL187);
                    adaptor.addChild(root_0, EOL187_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1374:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment188=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5494); 
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
    // JS.g:1382:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block189 = null;

        statementTail_return statementTail190 = null;



        try {
            // JS.g:1387:2: ({...}? block | statementTail )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==LBRACE) ) {
                int LA51_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1382:1: statement options {k=1; } : ({...}? block | statementTail );", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA51_0>=NULL && LA51_0<=FALSE)||LA51_0==EACH||LA51_0==THIS||LA51_0==VAR||(LA51_0>=GET && LA51_0<=SET)||(LA51_0>=WXML && LA51_0<=CLASS)||(LA51_0>=DEBUGGER && LA51_0<=VOLATILE)||LA51_0==SEMIC||LA51_0==AT||LA51_0==StringLiteral||(LA51_0>=Identifier && LA51_0<=RegularExpressionLiteral)||(LA51_0>=DecimalLiteral && LA51_0<=HexIntegerLiteral)) ) {
                alt51=2;
            }
            else if ( ((LA51_0>=XMLFragment && LA51_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt51=2;
            }
            else if ( (LA51_0==BREAK||LA51_0==CONTINUE||(LA51_0>=DELETE && LA51_0<=DO)||LA51_0==FOR||(LA51_0>=FUNCTION && LA51_0<=IF)||(LA51_0>=NEW && LA51_0<=SWITCH)||(LA51_0>=THROW && LA51_0<=TYPEOF)||(LA51_0>=VOID && LA51_0<=WITH)||LA51_0==YIELD||LA51_0==CONST||LA51_0==LPAREN||LA51_0==LBRACK||(LA51_0>=ADD && LA51_0<=SUB)||(LA51_0>=INC && LA51_0<=DEC)||(LA51_0>=NOT && LA51_0<=INV)) ) {
                alt51=2;
            }
            else if ( (LA51_0==DEFAULT) && ( isXmlEnabled() )) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1382:1: statement options {k=1; } : ({...}? block | statementTail );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // JS.g:1387:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5523);
                    block189=block();
                    _fsp--;

                    adaptor.addChild(root_0, block189.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1388:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5528);
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
    // JS.g:1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
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
            // JS.g:1392:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt52=15;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==VAR) ) {
                alt52=1;
            }
            else if ( (LA52_0==SEMIC) ) {
                alt52=2;
            }
            else if ( ((LA52_0>=NULL && LA52_0<=FALSE)||LA52_0==THIS||LA52_0==AT||LA52_0==StringLiteral||LA52_0==RegularExpressionLiteral||(LA52_0>=DecimalLiteral && LA52_0<=HexIntegerLiteral)) ) {
                alt52=3;
            }
            else if ( (LA52_0==WXML) ) {
                int LA52_4 = input.LA(2);

                if ( (LA52_4==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_4==EOF||(LA52_4>=IN && LA52_4<=INSTANCEOF)||(LA52_4>=RBRACE && LA52_4<=LPAREN)||LA52_4==LBRACK||(LA52_4>=DOT && LA52_4<=XOR)||(LA52_4>=LAND && LA52_4<=QUE)||(LA52_4>=ASSIGN && LA52_4<=DIVASS)||(LA52_4>=DOTDOT && LA52_4<=COLONCOLON)||(LA52_4>=EOL && LA52_4<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==GET) ) {
                int LA52_5 = input.LA(2);

                if ( (LA52_5==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_5==EOF||(LA52_5>=IN && LA52_5<=INSTANCEOF)||(LA52_5>=RBRACE && LA52_5<=LPAREN)||LA52_5==LBRACK||(LA52_5>=DOT && LA52_5<=XOR)||(LA52_5>=LAND && LA52_5<=QUE)||(LA52_5>=ASSIGN && LA52_5<=DIVASS)||(LA52_5>=DOTDOT && LA52_5<=COLONCOLON)||(LA52_5>=EOL && LA52_5<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 5, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==SET) ) {
                int LA52_6 = input.LA(2);

                if ( (LA52_6==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_6==EOF||(LA52_6>=IN && LA52_6<=INSTANCEOF)||(LA52_6>=RBRACE && LA52_6<=LPAREN)||LA52_6==LBRACK||(LA52_6>=DOT && LA52_6<=XOR)||(LA52_6>=LAND && LA52_6<=QUE)||(LA52_6>=ASSIGN && LA52_6<=DIVASS)||(LA52_6>=DOTDOT && LA52_6<=COLONCOLON)||(LA52_6>=EOL && LA52_6<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 6, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==EACH) ) {
                int LA52_7 = input.LA(2);

                if ( (LA52_7==EOF||(LA52_7>=IN && LA52_7<=INSTANCEOF)||(LA52_7>=RBRACE && LA52_7<=LPAREN)||LA52_7==LBRACK||(LA52_7>=DOT && LA52_7<=XOR)||(LA52_7>=LAND && LA52_7<=QUE)||(LA52_7>=ASSIGN && LA52_7<=DIVASS)||(LA52_7>=DOTDOT && LA52_7<=COLONCOLON)||(LA52_7>=EOL && LA52_7<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_7==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 7, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==NAMESPACE) ) {
                int LA52_8 = input.LA(2);

                if ( (LA52_8==EOF||(LA52_8>=IN && LA52_8<=INSTANCEOF)||(LA52_8>=RBRACE && LA52_8<=LPAREN)||LA52_8==LBRACK||(LA52_8>=DOT && LA52_8<=XOR)||(LA52_8>=LAND && LA52_8<=QUE)||(LA52_8>=ASSIGN && LA52_8<=DIVASS)||(LA52_8>=DOTDOT && LA52_8<=COLONCOLON)||(LA52_8>=EOL && LA52_8<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_8==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 8, input);

                    throw nvae;
                }
            }
            else if ( ((LA52_0>=ABSTRACT && LA52_0<=CLASS)||(LA52_0>=DEBUGGER && LA52_0<=VOLATILE)) ) {
                int LA52_9 = input.LA(2);

                if ( (LA52_9==EOF||(LA52_9>=IN && LA52_9<=INSTANCEOF)||(LA52_9>=RBRACE && LA52_9<=LPAREN)||LA52_9==LBRACK||(LA52_9>=DOT && LA52_9<=XOR)||(LA52_9>=LAND && LA52_9<=QUE)||(LA52_9>=ASSIGN && LA52_9<=DIVASS)||(LA52_9>=DOTDOT && LA52_9<=COLONCOLON)||(LA52_9>=EOL && LA52_9<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_9==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 9, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==Identifier) ) {
                int LA52_10 = input.LA(2);

                if ( (LA52_10==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_10==EOF||(LA52_10>=IN && LA52_10<=INSTANCEOF)||(LA52_10>=RBRACE && LA52_10<=LPAREN)||LA52_10==LBRACK||(LA52_10>=DOT && LA52_10<=XOR)||(LA52_10>=LAND && LA52_10<=QUE)||(LA52_10>=ASSIGN && LA52_10<=DIVASS)||(LA52_10>=DOTDOT && LA52_10<=COLONCOLON)||(LA52_10>=EOL && LA52_10<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 10, input);

                    throw nvae;
                }
            }
            else if ( ((LA52_0>=XMLFragment && LA52_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt52=3;
            }
            else if ( (LA52_0==DELETE||LA52_0==FUNCTION||LA52_0==NEW||LA52_0==TYPEOF||LA52_0==VOID||LA52_0==YIELD||LA52_0==LBRACE||LA52_0==LPAREN||LA52_0==LBRACK||(LA52_0>=ADD && LA52_0<=SUB)||(LA52_0>=INC && LA52_0<=DEC)||(LA52_0>=NOT && LA52_0<=INV)) ) {
                alt52=3;
            }
            else if ( (LA52_0==IF) ) {
                alt52=4;
            }
            else if ( (LA52_0==DO||LA52_0==FOR||LA52_0==WHILE) ) {
                alt52=5;
            }
            else if ( (LA52_0==CONTINUE) ) {
                alt52=6;
            }
            else if ( (LA52_0==BREAK) ) {
                alt52=7;
            }
            else if ( (LA52_0==RETURN) ) {
                alt52=8;
            }
            else if ( (LA52_0==WITH) ) {
                alt52=9;
            }
            else if ( (LA52_0==SWITCH) ) {
                alt52=11;
            }
            else if ( (LA52_0==THROW) ) {
                alt52=12;
            }
            else if ( (LA52_0==TRY) ) {
                alt52=13;
            }
            else if ( (LA52_0==CONST) ) {
                alt52=14;
            }
            else if ( (LA52_0==DEFAULT) && ( isXmlEnabled() )) {
                alt52=15;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1391:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // JS.g:1392:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5540);
                    variableStatement191=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement191.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1393:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5545);
                    emptyStatement192=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement192.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1394:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5550);
                    expressionStatement193=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement193.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1395:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5555);
                    ifStatement194=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement194.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1396:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5560);
                    iterationStatement195=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement195.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1397:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5565);
                    continueStatement196=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement196.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1398:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5570);
                    breakStatement197=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement197.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1399:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5575);
                    returnStatement198=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement198.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1400:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5580);
                    withStatement199=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement199.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1401:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5585);
                    labelledStatement200=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement200.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1402:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5590);
                    switchStatement201=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement201.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1403:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5595);
                    throwStatement202=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement202.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1404:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5600);
                    tryStatement203=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement203.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1405:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5605);
                    constStatement204=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement204.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1406:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5610);
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
    // JS.g:1411:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
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
            // JS.g:1412:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1412:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5625); 
            stream_LBRACE.add(lb);

            // JS.g:1412:14: ( statement )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=NULL && LA53_0<=FALSE)||LA53_0==EACH||LA53_0==THIS||LA53_0==VAR||(LA53_0>=GET && LA53_0<=SET)||(LA53_0>=WXML && LA53_0<=CLASS)||(LA53_0>=DEBUGGER && LA53_0<=LBRACE)||LA53_0==SEMIC||LA53_0==AT||LA53_0==StringLiteral||(LA53_0>=Identifier && LA53_0<=RegularExpressionLiteral)||(LA53_0>=DecimalLiteral && LA53_0<=HexIntegerLiteral)) ) {
                    alt53=1;
                }
                else if ( ((LA53_0>=XMLFragment && LA53_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt53=1;
                }
                else if ( (LA53_0==BREAK||LA53_0==CONTINUE||(LA53_0>=DELETE && LA53_0<=DO)||LA53_0==FOR||(LA53_0>=FUNCTION && LA53_0<=IF)||(LA53_0>=NEW && LA53_0<=SWITCH)||(LA53_0>=THROW && LA53_0<=TYPEOF)||(LA53_0>=VOID && LA53_0<=WITH)||LA53_0==YIELD||LA53_0==CONST||LA53_0==LPAREN||LA53_0==LBRACK||(LA53_0>=ADD && LA53_0<=SUB)||(LA53_0>=INC && LA53_0<=DEC)||(LA53_0>=NOT && LA53_0<=INV)) ) {
                    alt53=1;
                }
                else if ( (LA53_0==DEFAULT) && ( isXmlEnabled() )) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JS.g:1412:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5627);
            	    statement206=statement();
            	    _fsp--;

            	    stream_statement.add(statement206.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            RBRACE207=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5630); 
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
            // 1413:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1413:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1413:28: ( statement )*
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
    // JS.g:1420:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
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
            // JS.g:1421:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1421:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR208=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5659); 
            stream_VAR.add(VAR208);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5661);
            variableDeclaration209=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration209.getTree());
            // JS.g:1421:28: ( COMMA variableDeclaration )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // JS.g:1421:30: COMMA variableDeclaration
            	    {
            	    COMMA210=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5665); 
            	    stream_COMMA.add(COMMA210);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5667);
            	    variableDeclaration211=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration211.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5672);
            semic212=semic();
            _fsp--;

            stream_semic.add(semic212.getTree());

            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1422:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1422:5: ^( VAR ( variableDeclaration )+ )
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

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclaration
    // JS.g:1425:1: variableDeclaration : identifier ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN214=null;
        identifier_return identifier213 = null;

        assignmentExpression_return assignmentExpression215 = null;


        Object ASSIGN214_tree=null;

        try {
            // JS.g:1426:2: ( identifier ( ASSIGN assignmentExpression )? )
            // JS.g:1426:4: identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5695);
            identifier213=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier213.getTree(), root_0);
            // JS.g:1426:16: ( ASSIGN assignmentExpression )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ASSIGN) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // JS.g:1426:18: ASSIGN assignmentExpression
                    {
                    ASSIGN214=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5700); 
                    ASSIGN214_tree = (Object)adaptor.create(ASSIGN214);
                    adaptor.addChild(root_0, ASSIGN214_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5702);
                    assignmentExpression215=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression215.getTree());

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
    // JS.g:1429:1: variableDeclarationNoIn : identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN217=null;
        identifier_return identifier216 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn218 = null;


        Object ASSIGN217_tree=null;

        try {
            // JS.g:1430:2: ( identifier ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1430:4: identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5717);
            identifier216=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier216.getTree(), root_0);
            // JS.g:1430:16: ( ASSIGN assignmentExpressionNoIn )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ASSIGN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // JS.g:1430:18: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN217=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5722); 
                    ASSIGN217_tree = (Object)adaptor.create(ASSIGN217);
                    adaptor.addChild(root_0, ASSIGN217_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5724);
                    assignmentExpressionNoIn218=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn218.getTree());

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
    // JS.g:1433:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST219=null;
        Token COMMA221=null;
        variableDeclaration_return variableDeclaration220 = null;

        variableDeclaration_return variableDeclaration222 = null;

        semic_return semic223 = null;


        Object CONST219_tree=null;
        Object COMMA221_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1434:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1434:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST219=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5739); 
            stream_CONST.add(CONST219);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5741);
            variableDeclaration220=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration220.getTree());
            // JS.g:1434:31: ( COMMA variableDeclaration )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // JS.g:1434:33: COMMA variableDeclaration
            	    {
            	    COMMA221=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5745); 
            	    stream_COMMA.add(COMMA221);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5747);
            	    variableDeclaration222=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration222.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5752);
            semic223=semic();
            _fsp--;

            stream_semic.add(semic223.getTree());

            // AST REWRITE
            // elements: variableDeclaration, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1435:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1435:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1442:1: emptyStatement : SEMIC -> EMPTY_STATEMENT[$SEMIC] ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC224=null;

        Object SEMIC224_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");

        try {
            // JS.g:1443:2: ( SEMIC -> EMPTY_STATEMENT[$SEMIC] )
            // JS.g:1443:4: SEMIC
            {
            SEMIC224=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5782); 
            stream_SEMIC.add(SEMIC224);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1443:10: -> EMPTY_STATEMENT[$SEMIC]
            {
                adaptor.addChild(root_0, adaptor.create(EMPTY_STATEMENT, SEMIC224));

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
    // JS.g:1456:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression225 = null;

        semic_return semic226 = null;



        try {
            // JS.g:1457:2: ( expression semic )
            // JS.g:1457:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5805);
            expression225=expression();
            _fsp--;

            adaptor.addChild(root_0, expression225.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5807);
            semic226=semic();
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
    // JS.g:1464:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF227=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        Token ELSE232=null;
        expression_return expression229 = null;

        statement_return statement231 = null;

        statement_return statement233 = null;


        Object IF227_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;
        Object ELSE232_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1466:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1466:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF227=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5825); 
            stream_IF.add(IF227);

            LPAREN228=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5827); 
            stream_LPAREN.add(LPAREN228);

            pushFollow(FOLLOW_expression_in_ifStatement5829);
            expression229=expression();
            _fsp--;

            stream_expression.add(expression229.getTree());
            RPAREN230=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5831); 
            stream_RPAREN.add(RPAREN230);

            pushFollow(FOLLOW_statement_in_ifStatement5833);
            statement231=statement();
            _fsp--;

            stream_statement.add(statement231.getTree());
            // JS.g:1466:42: ({...}? ELSE statement )?
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
                    // JS.g:1466:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE232=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5839); 
                    stream_ELSE.add(ELSE232);

                    pushFollow(FOLLOW_statement_in_ifStatement5841);
                    statement233=statement();
                    _fsp--;

                    stream_statement.add(statement233.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: statement, expression, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1467:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1467:5: ^( IF expression ( statement )+ )
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
    // JS.g:1474:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement234 = null;

        whileStatement_return whileStatement235 = null;

        forEachStatement_return forEachStatement236 = null;

        forStatement_return forStatement237 = null;



        try {
            // JS.g:1475:2: ( doStatement | whileStatement | forEachStatement | forStatement )
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

                if ( (LA59_3==LPAREN) ) {
                    alt59=4;
                }
                else if ( (LA59_3==EACH) ) {
                    alt59=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1474:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 59, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1474:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // JS.g:1475:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5874);
                    doStatement234=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement234.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1476:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5879);
                    whileStatement235=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement235.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1477:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5884);
                    forEachStatement236=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement236.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1478:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5889);
                    forStatement237=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement237.getTree());

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
    // JS.g:1481:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO238=null;
        Token WHILE240=null;
        Token LPAREN241=null;
        Token RPAREN243=null;
        statement_return statement239 = null;

        expression_return expression242 = null;

        semic_return semic244 = null;


        Object DO238_tree=null;
        Object WHILE240_tree=null;
        Object LPAREN241_tree=null;
        Object RPAREN243_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1482:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1482:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO238=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5901); 
            stream_DO.add(DO238);

            pushFollow(FOLLOW_statement_in_doStatement5903);
            statement239=statement();
            _fsp--;

            stream_statement.add(statement239.getTree());
            WHILE240=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5905); 
            stream_WHILE.add(WHILE240);

            LPAREN241=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5907); 
            stream_LPAREN.add(LPAREN241);

            pushFollow(FOLLOW_expression_in_doStatement5909);
            expression242=expression();
            _fsp--;

            stream_expression.add(expression242.getTree());
            RPAREN243=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5911); 
            stream_RPAREN.add(RPAREN243);

            pushFollow(FOLLOW_semic_in_doStatement5913);
            semic244=semic();
            _fsp--;

            stream_semic.add(semic244.getTree());

            // AST REWRITE
            // elements: DO, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1483:2: -> ^( DO statement expression )
            {
                // JS.g:1483:5: ^( DO statement expression )
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
    // JS.g:1486:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE245=null;
        Token LPAREN246=null;
        Token RPAREN248=null;
        expression_return expression247 = null;

        statement_return statement249 = null;


        Object WHILE245_tree=null;
        Object LPAREN246_tree=null;
        Object RPAREN248_tree=null;

        try {
            // JS.g:1487:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1487:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE245=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5938); 
            WHILE245_tree = (Object)adaptor.create(WHILE245);
            root_0 = (Object)adaptor.becomeRoot(WHILE245_tree, root_0);

            LPAREN246=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5941); 
            pushFollow(FOLLOW_expression_in_whileStatement5944);
            expression247=expression();
            _fsp--;

            adaptor.addChild(root_0, expression247.getTree());
            RPAREN248=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5946); 
            pushFollow(FOLLOW_statement_in_whileStatement5949);
            statement249=statement();
            _fsp--;

            adaptor.addChild(root_0, statement249.getTree());

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
    // JS.g:1532:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH250=null;
        Token LPAREN251=null;
        Token RPAREN253=null;
        forEachControl_return forEachControl252 = null;

        statement_return statement254 = null;


        Object forKeyword_tree=null;
        Object EACH250_tree=null;
        Object LPAREN251_tree=null;
        Object RPAREN253_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1533:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1533:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5966); 
            stream_FOR.add(forKeyword);

            EACH250=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5968); 
            stream_EACH.add(EACH250);

            LPAREN251=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5970); 
            stream_LPAREN.add(LPAREN251);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5972);
            forEachControl252=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl252.getTree());
            RPAREN253=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5974); 
            stream_RPAREN.add(RPAREN253);

            pushFollow(FOLLOW_statement_in_forEachStatement5976);
            statement254=statement();
            _fsp--;

            stream_statement.add(statement254.getTree());

            // AST REWRITE
            // elements: forEachControl, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1534:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1534:7: ^( FOREACH[$forKeyword] forEachControl statement )
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
    // JS.g:1537:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar255 = null;

        forControlExpression_return forControlExpression256 = null;



        try {
            // JS.g:1538:3: ( forControlVar | forControlExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==VAR) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==EACH||LA60_0==THIS||(LA60_0>=GET && LA60_0<=SET)||(LA60_0>=WXML && LA60_0<=CLASS)||(LA60_0>=DEBUGGER && LA60_0<=VOLATILE)||LA60_0==AT||LA60_0==StringLiteral||(LA60_0>=Identifier && LA60_0<=RegularExpressionLiteral)||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)) ) {
                alt60=2;
            }
            else if ( ((LA60_0>=XMLFragment && LA60_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt60=2;
            }
            else if ( (LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==YIELD||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1537:1: forEachControl : ( forControlVar | forControlExpression );", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // JS.g:1538:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl6004);
                    forControlVar255=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar255.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1539:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl6010);
                    forControlExpression256=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression256.getTree());

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
    // JS.g:1542:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR257=null;
        Token LPAREN258=null;
        Token RPAREN260=null;
        forControl_return forControl259 = null;

        statement_return statement261 = null;


        Object FOR257_tree=null;
        Object LPAREN258_tree=null;
        Object RPAREN260_tree=null;

        try {
            // JS.g:1543:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1543:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR257=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement6022); 
            FOR257_tree = (Object)adaptor.create(FOR257);
            root_0 = (Object)adaptor.becomeRoot(FOR257_tree, root_0);

            LPAREN258=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement6025); 
            pushFollow(FOLLOW_forControl_in_forStatement6028);
            forControl259=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl259.getTree());
            RPAREN260=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement6030); 
            pushFollow(FOLLOW_statement_in_forStatement6033);
            statement261=statement();
            _fsp--;

            adaptor.addChild(root_0, statement261.getTree());

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
    // JS.g:1546:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar262 = null;

        forControlExpression_return forControlExpression263 = null;

        forControlSemic_return forControlSemic264 = null;



        try {
            // JS.g:1547:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==VAR) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==EACH||LA61_0==THIS||(LA61_0>=GET && LA61_0<=SET)||(LA61_0>=WXML && LA61_0<=CLASS)||(LA61_0>=DEBUGGER && LA61_0<=VOLATILE)||LA61_0==AT||LA61_0==StringLiteral||(LA61_0>=Identifier && LA61_0<=RegularExpressionLiteral)||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)) ) {
                alt61=2;
            }
            else if ( ((LA61_0>=XMLFragment && LA61_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt61=2;
            }
            else if ( (LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==YIELD||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)) ) {
                alt61=2;
            }
            else if ( (LA61_0==SEMIC) ) {
                alt61=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1546:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // JS.g:1547:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl6044);
                    forControlVar262=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar262.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1548:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl6049);
                    forControlExpression263=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression263.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1549:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl6054);
                    forControlSemic264=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic264.getTree());

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
    // JS.g:1552:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token semi1=null;
        Token semi2=null;
        Token VAR265=null;
        Token IN267=null;
        Token COMMA269=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn266 = null;

        expression_return expression268 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn270 = null;


        Object semi1_tree=null;
        Object semi2_tree=null;
        Object VAR265_tree=null;
        Object IN267_tree=null;
        Object COMMA269_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1553:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1553:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR265=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar6065); 
            stream_VAR.add(VAR265);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6067);
            variableDeclarationNoIn266=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn266.getTree());
            // JS.g:1554:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) )
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
                    new NoViableAltException("1554:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // JS.g:1555:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1555:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1556:4: IN expression
                    {
                    IN267=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar6079); 
                    stream_IN.add(IN267);

                    pushFollow(FOLLOW_expression_in_forControlVar6081);
                    expression268=expression();
                    _fsp--;

                    stream_expression.add(expression268.getTree());

                    // AST REWRITE
                    // elements: variableDeclarationNoIn, VAR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1557:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1557:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1557:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1557:51: ^( EXPR expression )
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
                    // JS.g:1560:3: ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1560:3: ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1561:4: ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )?
                    {
                    // JS.g:1561:4: ( COMMA variableDeclarationNoIn )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // JS.g:1561:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA269=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar6127); 
                    	    stream_COMMA.add(COMMA269);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6129);
                    	    variableDeclarationNoIn270=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn270.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    semi1=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6136); 
                    stream_SEMIC.add(semi1);

                    // JS.g:1561:54: (ex1= expression )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==EACH||LA63_0==THIS||(LA63_0>=GET && LA63_0<=SET)||(LA63_0>=WXML && LA63_0<=CLASS)||(LA63_0>=DEBUGGER && LA63_0<=VOLATILE)||LA63_0==AT||LA63_0==StringLiteral||(LA63_0>=Identifier && LA63_0<=RegularExpressionLiteral)||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                        alt63=1;
                    }
                    else if ( ((LA63_0>=XMLFragment && LA63_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                        alt63=1;
                    }
                    else if ( (LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==YIELD||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // JS.g:1561:54: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6140);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    semi2=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6145); 
                    stream_SEMIC.add(semi2);

                    // JS.g:1561:82: (ex2= expression )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==EACH||LA64_0==THIS||(LA64_0>=GET && LA64_0<=SET)||(LA64_0>=WXML && LA64_0<=CLASS)||(LA64_0>=DEBUGGER && LA64_0<=VOLATILE)||LA64_0==AT||LA64_0==StringLiteral||(LA64_0>=Identifier && LA64_0<=RegularExpressionLiteral)||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)) ) {
                        alt64=1;
                    }
                    else if ( ((LA64_0>=XMLFragment && LA64_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                        alt64=1;
                    }
                    else if ( (LA64_0==DELETE||LA64_0==FUNCTION||LA64_0==NEW||LA64_0==TYPEOF||LA64_0==VOID||LA64_0==YIELD||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // JS.g:1561:82: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6149);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: semi2, ex2, ex1, variableDeclarationNoIn, semi1, VAR
                    // token labels: semi2, semi1
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_semi2=new RewriteRuleTokenStream(adaptor,"token semi2",semi2);
                    RewriteRuleTokenStream stream_semi1=new RewriteRuleTokenStream(adaptor,"token semi1",semi1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1562:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1562:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1562:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1562:52: ^( $semi1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi1.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1562:64: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1562:72: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1562:80: ^( $semi2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi2.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1562:92: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1562:100: ( $ex2)?
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
    // JS.g:1567:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token semi1=null;
        Token semi2=null;
        Token IN271=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object semi1_tree=null;
        Object semi2_tree=null;
        Object IN271_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1572:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1572:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6229);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1573:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) )
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
                    new NoViableAltException("1573:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // JS.g:1574:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1574:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1575:4: IN ex2= expression
                    {
                    IN271=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression6244); 
                    stream_IN.add(IN271);

                    pushFollow(FOLLOW_expression_in_forControlExpression6248);
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
                    // 1576:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1576:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1576:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1576:33: ^( EXPR $ex2)
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
                    // JS.g:1579:3: (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1579:3: (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1580:4: semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )?
                    {
                    semi1=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6296); 
                    stream_SEMIC.add(semi1);

                    // JS.g:1580:19: (ex2= expression )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==EACH||LA66_0==THIS||(LA66_0>=GET && LA66_0<=SET)||(LA66_0>=WXML && LA66_0<=CLASS)||(LA66_0>=DEBUGGER && LA66_0<=VOLATILE)||LA66_0==AT||LA66_0==StringLiteral||(LA66_0>=Identifier && LA66_0<=RegularExpressionLiteral)||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                        alt66=1;
                    }
                    else if ( ((LA66_0>=XMLFragment && LA66_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                        alt66=1;
                    }
                    else if ( (LA66_0==DELETE||LA66_0==FUNCTION||LA66_0==NEW||LA66_0==TYPEOF||LA66_0==VOID||LA66_0==YIELD||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // JS.g:1580:19: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6300);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    semi2=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6305); 
                    stream_SEMIC.add(semi2);

                    // JS.g:1580:47: (ex3= expression )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==EACH||LA67_0==THIS||(LA67_0>=GET && LA67_0<=SET)||(LA67_0>=WXML && LA67_0<=CLASS)||(LA67_0>=DEBUGGER && LA67_0<=VOLATILE)||LA67_0==AT||LA67_0==StringLiteral||(LA67_0>=Identifier && LA67_0<=RegularExpressionLiteral)||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                        alt67=1;
                    }
                    else if ( ((LA67_0>=XMLFragment && LA67_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                        alt67=1;
                    }
                    else if ( (LA67_0==DELETE||LA67_0==FUNCTION||LA67_0==NEW||LA67_0==TYPEOF||LA67_0==VOID||LA67_0==YIELD||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // JS.g:1580:47: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6309);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex1, semi1, semi2, ex3, ex2
                    // token labels: semi2, semi1
                    // rule labels: retval, ex3, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_semi2=new RewriteRuleTokenStream(adaptor,"token semi2",semi2);
                    RewriteRuleTokenStream stream_semi1=new RewriteRuleTokenStream(adaptor,"token semi1",semi1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"token ex3",ex3!=null?ex3.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1581:4: -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1581:7: ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1581:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1581:33: ^( $semi1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi1.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1581:45: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1581:53: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1581:61: ^( $semi2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi2.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1581:73: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1581:81: ( $ex3)?
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
    // JS.g:1586:1: forControlSemic : semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token semi1=null;
        Token semi2=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object semi1_tree=null;
        Object semi2_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1587:2: (semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1587:4: semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )?
            {
            semi1=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6384); 
            stream_SEMIC.add(semi1);

            // JS.g:1587:19: (ex1= expression )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==EACH||LA69_0==THIS||(LA69_0>=GET && LA69_0<=SET)||(LA69_0>=WXML && LA69_0<=CLASS)||(LA69_0>=DEBUGGER && LA69_0<=VOLATILE)||LA69_0==AT||LA69_0==StringLiteral||(LA69_0>=Identifier && LA69_0<=RegularExpressionLiteral)||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)) ) {
                alt69=1;
            }
            else if ( ((LA69_0>=XMLFragment && LA69_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt69=1;
            }
            else if ( (LA69_0==DELETE||LA69_0==FUNCTION||LA69_0==NEW||LA69_0==TYPEOF||LA69_0==VOID||LA69_0==YIELD||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // JS.g:1587:19: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6388);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            semi2=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6393); 
            stream_SEMIC.add(semi2);

            // JS.g:1587:47: (ex2= expression )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=NULL && LA70_0<=FALSE)||LA70_0==EACH||LA70_0==THIS||(LA70_0>=GET && LA70_0<=SET)||(LA70_0>=WXML && LA70_0<=CLASS)||(LA70_0>=DEBUGGER && LA70_0<=VOLATILE)||LA70_0==AT||LA70_0==StringLiteral||(LA70_0>=Identifier && LA70_0<=RegularExpressionLiteral)||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=XMLFragment && LA70_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt70=1;
            }
            else if ( (LA70_0==DELETE||LA70_0==FUNCTION||LA70_0==NEW||LA70_0==TYPEOF||LA70_0==VOID||LA70_0==YIELD||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // JS.g:1587:47: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6397);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ex1, semi2, semi1, ex2
            // token labels: semi2, semi1
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_semi2=new RewriteRuleTokenStream(adaptor,"token semi2",semi2);
            RewriteRuleTokenStream stream_semi1=new RewriteRuleTokenStream(adaptor,"token semi1",semi1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1588:2: -> ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1588:5: ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1588:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1588:26: ^( $semi1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_semi1.next(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1588:38: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1588:46: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1588:54: ^( $semi2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_semi2.next(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1588:66: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1588:74: ( $ex2)?
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
    // JS.g:1600:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE272=null;
        Token Identifier273=null;
        semic_return semic274 = null;


        Object CONTINUE272_tree=null;
        Object Identifier273_tree=null;

        try {
            // JS.g:1601:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1601:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE272=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6465); 
            CONTINUE272_tree = (Object)adaptor.create(CONTINUE272);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE272_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1601:67: ( Identifier )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Identifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1601:67: Identifier
                    {
                    Identifier273=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6470); 
                    Identifier273_tree = (Object)adaptor.create(Identifier273);
                    adaptor.addChild(root_0, Identifier273_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6473);
            semic274=semic();
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
    // JS.g:1613:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK275=null;
        Token Identifier276=null;
        semic_return semic277 = null;


        Object BREAK275_tree=null;
        Object Identifier276_tree=null;

        try {
            // JS.g:1614:2: ( BREAK ( Identifier )? semic )
            // JS.g:1614:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK275=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6492); 
            BREAK275_tree = (Object)adaptor.create(BREAK275);
            root_0 = (Object)adaptor.becomeRoot(BREAK275_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1614:64: ( Identifier )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Identifier) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1614:64: Identifier
                    {
                    Identifier276=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6497); 
                    Identifier276_tree = (Object)adaptor.create(Identifier276);
                    adaptor.addChild(root_0, Identifier276_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6500);
            semic277=semic();
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
    // JS.g:1634:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN278=null;
        expression_return expression279 = null;

        semic_return semic280 = null;


        Object RETURN278_tree=null;

        try {
            // JS.g:1635:2: ( RETURN ( expression )? semic )
            // JS.g:1635:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN278=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6519); 
            RETURN278_tree = (Object)adaptor.create(RETURN278);
            root_0 = (Object)adaptor.becomeRoot(RETURN278_tree, root_0);

             promoteEOL(null); 
            // JS.g:1635:34: ( expression )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=NULL && LA73_0<=FALSE)||LA73_0==EACH||LA73_0==THIS||(LA73_0>=GET && LA73_0<=SET)||(LA73_0>=WXML && LA73_0<=CLASS)||(LA73_0>=DEBUGGER && LA73_0<=VOLATILE)||LA73_0==AT||LA73_0==StringLiteral||(LA73_0>=Identifier && LA73_0<=RegularExpressionLiteral)||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                alt73=1;
            }
            else if ( ((LA73_0>=XMLFragment && LA73_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt73=1;
            }
            else if ( (LA73_0==DELETE||LA73_0==FUNCTION||LA73_0==NEW||LA73_0==TYPEOF||LA73_0==VOID||LA73_0==YIELD||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1635:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6524);
                    expression279=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression279.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6527);
            semic280=semic();
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
    // JS.g:1642:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH281=null;
        Token LPAREN282=null;
        Token RPAREN284=null;
        expression_return expression283 = null;

        statement_return statement285 = null;


        Object WITH281_tree=null;
        Object LPAREN282_tree=null;
        Object RPAREN284_tree=null;

        try {
            // JS.g:1643:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1643:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH281=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6544); 
            WITH281_tree = (Object)adaptor.create(WITH281);
            root_0 = (Object)adaptor.becomeRoot(WITH281_tree, root_0);

            LPAREN282=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6547); 
            pushFollow(FOLLOW_expression_in_withStatement6550);
            expression283=expression();
            _fsp--;

            adaptor.addChild(root_0, expression283.getTree());
            RPAREN284=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6552); 
            pushFollow(FOLLOW_statement_in_withStatement6555);
            statement285=statement();
            _fsp--;

            adaptor.addChild(root_0, statement285.getTree());

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
    // JS.g:1650:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH286=null;
        Token LPAREN287=null;
        Token RPAREN289=null;
        Token LBRACE290=null;
        Token RBRACE293=null;
        expression_return expression288 = null;

        defaultClause_return defaultClause291 = null;

        caseClause_return caseClause292 = null;


        Object SWITCH286_tree=null;
        Object LPAREN287_tree=null;
        Object RPAREN289_tree=null;
        Object LBRACE290_tree=null;
        Object RBRACE293_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");
        try {
            // JS.g:1651:2: ( SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) )
            // JS.g:1651:4: SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE
            {
            SWITCH286=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6571); 
            stream_SWITCH.add(SWITCH286);

            LPAREN287=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6573); 
            stream_LPAREN.add(LPAREN287);

            pushFollow(FOLLOW_expression_in_switchStatement6575);
            expression288=expression();
            _fsp--;

            stream_expression.add(expression288.getTree());
            RPAREN289=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6577); 
            stream_RPAREN.add(RPAREN289);

            LBRACE290=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6579); 
            stream_LBRACE.add(LBRACE290);

            // JS.g:1651:43: ( defaultClause | caseClause )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==DEFAULT) ) {
                    alt74=1;
                }
                else if ( (LA74_0==CASE) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // JS.g:1651:45: defaultClause
            	    {
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6583);
            	    defaultClause291=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause291.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1651:61: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6587);
            	    caseClause292=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause292.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            RBRACE293=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6592); 
            stream_RBRACE.add(RBRACE293);


            // AST REWRITE
            // elements: SWITCH, expression, caseClause, defaultClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1652:2: -> ^( SWITCH expression ( defaultClause )* ( caseClause )* )
            {
                // JS.g:1652:5: ^( SWITCH expression ( defaultClause )* ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1652:26: ( defaultClause )*
                while ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1652:41: ( caseClause )*
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
    // JS.g:1655:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE294=null;
        Token COLON296=null;
        expression_return expression295 = null;

        statement_return statement297 = null;


        Object CASE294_tree=null;
        Object COLON296_tree=null;

        try {
            // JS.g:1656:2: ( CASE expression COLON ( statement )* )
            // JS.g:1656:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE294=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6620); 
            CASE294_tree = (Object)adaptor.create(CASE294);
            root_0 = (Object)adaptor.becomeRoot(CASE294_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6623);
            expression295=expression();
            _fsp--;

            adaptor.addChild(root_0, expression295.getTree());
            COLON296=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6625); 
            // JS.g:1656:28: ( statement )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==DEFAULT) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==WXML) && ( isXmlEnabled() )) {
                        alt75=1;
                    }


                }
                else if ( ((LA75_0>=NULL && LA75_0<=FALSE)||LA75_0==EACH||LA75_0==THIS||LA75_0==VAR||(LA75_0>=GET && LA75_0<=SET)||(LA75_0>=WXML && LA75_0<=CLASS)||(LA75_0>=DEBUGGER && LA75_0<=LBRACE)||LA75_0==SEMIC||LA75_0==AT||LA75_0==StringLiteral||(LA75_0>=Identifier && LA75_0<=RegularExpressionLiteral)||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                    alt75=1;
                }
                else if ( ((LA75_0>=XMLFragment && LA75_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt75=1;
                }
                else if ( (LA75_0==BREAK||LA75_0==CONTINUE||(LA75_0>=DELETE && LA75_0<=DO)||LA75_0==FOR||(LA75_0>=FUNCTION && LA75_0<=IF)||(LA75_0>=NEW && LA75_0<=SWITCH)||(LA75_0>=THROW && LA75_0<=TYPEOF)||(LA75_0>=VOID && LA75_0<=WITH)||LA75_0==YIELD||LA75_0==CONST||LA75_0==LPAREN||LA75_0==LBRACK||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // JS.g:1656:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6628);
            	    statement297=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement297.getTree());

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
    // JS.g:1659:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT298=null;
        Token COLON299=null;
        statement_return statement300 = null;


        Object DEFAULT298_tree=null;
        Object COLON299_tree=null;

        try {
            // JS.g:1660:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1660:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT298=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6641); 
            DEFAULT298_tree = (Object)adaptor.create(DEFAULT298);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT298_tree, root_0);

            COLON299=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6644); 
            // JS.g:1660:20: ( statement )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==DEFAULT) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==WXML) && ( isXmlEnabled() )) {
                        alt76=1;
                    }


                }
                else if ( ((LA76_0>=NULL && LA76_0<=FALSE)||LA76_0==EACH||LA76_0==THIS||LA76_0==VAR||(LA76_0>=GET && LA76_0<=SET)||(LA76_0>=WXML && LA76_0<=CLASS)||(LA76_0>=DEBUGGER && LA76_0<=LBRACE)||LA76_0==SEMIC||LA76_0==AT||LA76_0==StringLiteral||(LA76_0>=Identifier && LA76_0<=RegularExpressionLiteral)||(LA76_0>=DecimalLiteral && LA76_0<=HexIntegerLiteral)) ) {
                    alt76=1;
                }
                else if ( ((LA76_0>=XMLFragment && LA76_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt76=1;
                }
                else if ( (LA76_0==BREAK||LA76_0==CONTINUE||(LA76_0>=DELETE && LA76_0<=DO)||LA76_0==FOR||(LA76_0>=FUNCTION && LA76_0<=IF)||(LA76_0>=NEW && LA76_0<=SWITCH)||(LA76_0>=THROW && LA76_0<=TYPEOF)||(LA76_0>=VOID && LA76_0<=WITH)||LA76_0==YIELD||LA76_0==CONST||LA76_0==LPAREN||LA76_0==LBRACK||(LA76_0>=ADD && LA76_0<=SUB)||(LA76_0>=INC && LA76_0<=DEC)||(LA76_0>=NOT && LA76_0<=INV)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // JS.g:1660:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6647);
            	    statement300=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement300.getTree());

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
    // JS.g:1667:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON302=null;
        identifier_return identifier301 = null;

        statement_return statement303 = null;


        Object COLON302_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1668:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1668:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6664);
            identifier301=identifier();
            _fsp--;

            stream_identifier.add(identifier301.getTree());
            COLON302=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6666); 
            stream_COLON.add(COLON302);

            pushFollow(FOLLOW_statement_in_labelledStatement6668);
            statement303=statement();
            _fsp--;

            stream_statement.add(statement303.getTree());

            // AST REWRITE
            // elements: statement, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1669:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1669:5: ^( LABELLED identifier statement )
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
    // JS.g:1691:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW304=null;
        expression_return expression305 = null;

        semic_return semic306 = null;


        Object THROW304_tree=null;

        try {
            // JS.g:1692:2: ( THROW expression semic )
            // JS.g:1692:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW304=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6699); 
            THROW304_tree = (Object)adaptor.create(THROW304);
            root_0 = (Object)adaptor.becomeRoot(THROW304_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6704);
            expression305=expression();
            _fsp--;

            adaptor.addChild(root_0, expression305.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6706);
            semic306=semic();
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
    // JS.g:1699:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY307=null;
        block_return block308 = null;

        catchClause_return catchClause309 = null;

        finallyClause_return finallyClause310 = null;

        finallyClause_return finallyClause311 = null;


        Object TRY307_tree=null;

        try {
            // JS.g:1700:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1700:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY307=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6723); 
            TRY307_tree = (Object)adaptor.create(TRY307);
            root_0 = (Object)adaptor.becomeRoot(TRY307_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6726);
            block308=block();
            _fsp--;

            adaptor.addChild(root_0, block308.getTree());
            // JS.g:1700:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
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
                    new NoViableAltException("1700:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // JS.g:1700:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1700:17: ( catchClause )+
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
                    	    // JS.g:1700:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6730);
                    	    catchClause309=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause309.getTree());

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

                    // JS.g:1700:30: ( finallyClause )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==FINALLY) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // JS.g:1700:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6733);
                            finallyClause310=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause310.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1700:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6738);
                    finallyClause311=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause311.getTree());

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
    // JS.g:1703:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH312=null;
        Token LPAREN313=null;
        Token RPAREN316=null;
        identifier_return identifier314 = null;

        catchFilter_return catchFilter315 = null;

        block_return block317 = null;


        Object CATCH312_tree=null;
        Object LPAREN313_tree=null;
        Object RPAREN316_tree=null;

        try {
            // JS.g:1704:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1704:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH312=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6752); 
            CATCH312_tree = (Object)adaptor.create(CATCH312);
            root_0 = (Object)adaptor.becomeRoot(CATCH312_tree, root_0);

            LPAREN313=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6755); 
            pushFollow(FOLLOW_identifier_in_catchClause6758);
            identifier314=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier314.getTree());
            // JS.g:1704:30: ( catchFilter )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==IF) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // JS.g:1704:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6760);
                    catchFilter315=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter315.getTree());

                    }
                    break;

            }

            RPAREN316=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6763); 
            pushFollow(FOLLOW_block_in_catchClause6766);
            block317=block();
            _fsp--;

            adaptor.addChild(root_0, block317.getTree());

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
    // JS.g:1707:1: catchFilter : IF expression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF318=null;
        expression_return expression319 = null;


        Object IF318_tree=null;

        try {
            // JS.g:1708:2: ( IF expression )
            // JS.g:1708:4: IF expression
            {
            root_0 = (Object)adaptor.nil();

            IF318=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6777); 
            IF318_tree = (Object)adaptor.create(IF318);
            adaptor.addChild(root_0, IF318_tree);

            pushFollow(FOLLOW_expression_in_catchFilter6779);
            expression319=expression();
            _fsp--;

            adaptor.addChild(root_0, expression319.getTree());

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
    // JS.g:1711:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY320=null;
        block_return block321 = null;


        Object FINALLY320_tree=null;

        try {
            // JS.g:1712:2: ( FINALLY block )
            // JS.g:1712:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY320=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6791); 
            FINALLY320_tree = (Object)adaptor.create(FINALLY320);
            root_0 = (Object)adaptor.becomeRoot(FINALLY320_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6794);
            block321=block();
            _fsp--;

            adaptor.addChild(root_0, block321.getTree());

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
    // JS.g:1725:1: functionDeclaration : function= FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token function=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList322 = null;

        functionBody_return functionBody323 = null;


        Object function_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1726:2: (function= FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody ) )
            // JS.g:1726:4: function= FUNCTION name= identifier formalParameterList functionBody
            {
            function=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6817); 
            stream_FUNCTION.add(function);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6821);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6823);
            formalParameterList322=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList322.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6825);
            functionBody323=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody323.getTree());

            // AST REWRITE
            // elements: name, functionBody, formalParameterList
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1727:2: -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody )
            {
                // JS.g:1727:5: ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCTION_DECLARATION, function), root_1);

                adaptor.addChild(root_1, stream_name.next());
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
    // $ANTLR end functionDeclaration

    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionExpression
    // JS.g:1730:1: functionExpression : FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION324=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList325 = null;

        functionBody_return functionBody326 = null;


        Object FUNCTION324_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1731:2: ( FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1731:4: FUNCTION (name= identifier )? formalParameterList functionBody
            {
            FUNCTION324=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6853); 
            stream_FUNCTION.add(FUNCTION324);

            // JS.g:1731:17: (name= identifier )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==EACH||(LA81_0>=GET && LA81_0<=SET)||(LA81_0>=WXML && LA81_0<=CLASS)||(LA81_0>=DEBUGGER && LA81_0<=VOLATILE)||LA81_0==Identifier) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // JS.g:1731:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6857);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6860);
            formalParameterList325=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList325.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6862);
            functionBody326=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody326.getTree());

            // AST REWRITE
            // elements: FUNCTION, name, formalParameterList, functionBody
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1732:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1732:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1732:17: ( $name)?
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
    // JS.g:1735:1: formalParameter : identifier ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier327 = null;



        try {
            // JS.g:1736:2: ( identifier )
            // JS.g:1736:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameter6890);
            identifier327=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier327.getTree(), root_0);

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
    // JS.g:1739:1: formalParameterList : LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN328=null;
        Token COMMA330=null;
        Token RPAREN332=null;
        formalParameter_return formalParameter329 = null;

        formalParameter_return formalParameter331 = null;


        Object LPAREN328_tree=null;
        Object COMMA330_tree=null;
        Object RPAREN332_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // JS.g:1740:2: ( LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) )
            // JS.g:1740:4: LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN
            {
            LPAREN328=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6902); 
            stream_LPAREN.add(LPAREN328);

            // JS.g:1740:11: ( formalParameter ( COMMA formalParameter )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EACH||(LA83_0>=GET && LA83_0<=SET)||(LA83_0>=WXML && LA83_0<=CLASS)||(LA83_0>=DEBUGGER && LA83_0<=VOLATILE)||LA83_0==Identifier) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // JS.g:1740:13: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_formalParameterList6906);
                    formalParameter329=formalParameter();
                    _fsp--;

                    stream_formalParameter.add(formalParameter329.getTree());
                    // JS.g:1740:29: ( COMMA formalParameter )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==COMMA) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // JS.g:1740:31: COMMA formalParameter
                    	    {
                    	    COMMA330=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6910); 
                    	    stream_COMMA.add(COMMA330);

                    	    pushFollow(FOLLOW_formalParameter_in_formalParameterList6912);
                    	    formalParameter331=formalParameter();
                    	    _fsp--;

                    	    stream_formalParameter.add(formalParameter331.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN332=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6920); 
            stream_RPAREN.add(RPAREN332);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1741:2: -> ^( ARGUMENTS ( formalParameter )* )
            {
                // JS.g:1741:5: ^( ARGUMENTS ( formalParameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // JS.g:1741:18: ( formalParameter )*
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
    // JS.g:1744:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE334=null;
        sourceElement_return sourceElement333 = null;


        Object lb_tree=null;
        Object RBRACE334_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
         pushState(JSParserRule.FUNCTION_BODY); 
        try {
            // JS.g:1746:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1746:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6950); 
            stream_LBRACE.add(lb);

            // JS.g:1746:14: ( sourceElement )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=NULL && LA84_0<=FALSE)||(LA84_0>=EACH && LA84_0<=FUNCTION)||LA84_0==THIS||LA84_0==VAR||(LA84_0>=GET && LA84_0<=SET)||(LA84_0>=WXML && LA84_0<=CLASS)||(LA84_0>=DEBUGGER && LA84_0<=LBRACE)||LA84_0==SEMIC||LA84_0==AT||LA84_0==StringLiteral||(LA84_0>=Identifier && LA84_0<=RegularExpressionLiteral)||(LA84_0>=DecimalLiteral && LA84_0<=HexIntegerLiteral)) ) {
                    alt84=1;
                }
                else if ( ((LA84_0>=XMLFragment && LA84_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt84=1;
                }
                else if ( (LA84_0==BREAK||LA84_0==CONTINUE||(LA84_0>=DELETE && LA84_0<=DO)||LA84_0==FOR||LA84_0==IF||(LA84_0>=NEW && LA84_0<=SWITCH)||(LA84_0>=THROW && LA84_0<=TYPEOF)||(LA84_0>=VOID && LA84_0<=WITH)||LA84_0==YIELD||LA84_0==CONST||LA84_0==LPAREN||LA84_0==LBRACK||(LA84_0>=ADD && LA84_0<=SUB)||(LA84_0>=INC && LA84_0<=DEC)||(LA84_0>=NOT && LA84_0<=INV)) ) {
                    alt84=1;
                }
                else if ( (LA84_0==DEFAULT) && ( isXmlEnabled() )) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // JS.g:1746:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6952);
            	    sourceElement333=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement333.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            RBRACE334=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6955); 
            stream_RBRACE.add(RBRACE334);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1747:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1747:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1747:28: ( sourceElement )*
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
    // JS.g:1756:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN335=null;
        Token RPAREN336=null;
        identifier_return name = null;

        functionBody_return functionBody337 = null;


        Object get_tree=null;
        Object LPAREN335_tree=null;
        Object RPAREN336_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1757:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) )
            // JS.g:1757:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6992); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6996);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN335=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6998); 
            stream_LPAREN.add(LPAREN335);

            RPAREN336=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration7000); 
            stream_RPAREN.add(RPAREN336);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration7002);
            functionBody337=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody337.getTree());

            // AST REWRITE
            // elements: functionBody, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1758:4: -> ^( GETTER[$get] identifier functionBody )
            {
                // JS.g:1758:7: ^( GETTER[$get] identifier functionBody )
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
    // JS.g:1761:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN338=null;
        Token RPAREN339=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody340 = null;


        Object set_tree=null;
        Object LPAREN338_tree=null;
        Object RPAREN339_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1762:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) )
            // JS.g:1762:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration7033); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7037);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN338=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration7039); 
            stream_LPAREN.add(LPAREN338);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7043);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN339=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration7045); 
            stream_RPAREN.add(RPAREN339);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration7047);
            functionBody340=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody340.getTree());

            // AST REWRITE
            // elements: functionBody, param, name
            // token labels: 
            // rule labels: retval, param, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"token param",param!=null?param.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1763:5: -> ^( SETTER[$set] $name $param functionBody )
            {
                // JS.g:1763:8: ^( SETTER[$set] $name $param functionBody )
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
    // JS.g:1770:1: program : sourceElementSync ( sourceElement sourceElementSync )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF344=null;
        sourceElementSync_return sourceElementSync341 = null;

        sourceElement_return sourceElement342 = null;

        sourceElementSync_return sourceElementSync343 = null;


        Object EOF344_tree=null;

         pushState(JSParserRule.PROGRAM); 
        try {
            // JS.g:1772:2: ( sourceElementSync ( sourceElement sourceElementSync )* EOF )
            // JS.g:1772:4: sourceElementSync ( sourceElement sourceElementSync )* EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sourceElementSync_in_program7088);
            sourceElementSync341=sourceElementSync();
            _fsp--;

            adaptor.addChild(root_0, sourceElementSync341.getTree());
            // JS.g:1772:22: ( sourceElement sourceElementSync )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=NULL && LA85_0<=FALSE)||(LA85_0>=EACH && LA85_0<=FUNCTION)||LA85_0==THIS||LA85_0==VAR||(LA85_0>=GET && LA85_0<=SET)||(LA85_0>=WXML && LA85_0<=CLASS)||(LA85_0>=DEBUGGER && LA85_0<=LBRACE)||LA85_0==SEMIC||LA85_0==AT||LA85_0==StringLiteral||(LA85_0>=Identifier && LA85_0<=RegularExpressionLiteral)||(LA85_0>=DecimalLiteral && LA85_0<=HexIntegerLiteral)) ) {
                    alt85=1;
                }
                else if ( ((LA85_0>=XMLFragment && LA85_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt85=1;
                }
                else if ( (LA85_0==BREAK||LA85_0==CONTINUE||(LA85_0>=DELETE && LA85_0<=DO)||LA85_0==FOR||LA85_0==IF||(LA85_0>=NEW && LA85_0<=SWITCH)||(LA85_0>=THROW && LA85_0<=TYPEOF)||(LA85_0>=VOID && LA85_0<=WITH)||LA85_0==YIELD||LA85_0==CONST||LA85_0==LPAREN||LA85_0==LBRACK||(LA85_0>=ADD && LA85_0<=SUB)||(LA85_0>=INC && LA85_0<=DEC)||(LA85_0>=NOT && LA85_0<=INV)) ) {
                    alt85=1;
                }
                else if ( (LA85_0==DEFAULT) && ( isXmlEnabled() )) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // JS.g:1772:23: sourceElement sourceElementSync
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program7091);
            	    sourceElement342=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement342.getTree());
            	    pushFollow(FOLLOW_sourceElementSync_in_program7093);
            	    sourceElementSync343=sourceElementSync();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElementSync343.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            EOF344=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program7097); 

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
    // JS.g:1775:1: sourceElementSync : ;
    public final sourceElementSync_return sourceElementSync() throws RecognitionException {
        sourceElementSync_return retval = new sourceElementSync_return();
        retval.start = input.LT(1);

        Object root_0 = null;


        	syncToSet();

        try {
            // JS.g:1779:2: ()
            // JS.g:1780:3: 
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
    // JS.g:1787:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration345 = null;

        statement_return statement346 = null;



        try {
            // JS.g:1792:2: ({...}? functionDeclaration | statement )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==FUNCTION) ) {
                int LA86_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt86=1;
                }
                else if ( (true) ) {
                    alt86=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1787:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 86, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA86_0>=NULL && LA86_0<=FALSE)||LA86_0==EACH||LA86_0==THIS||LA86_0==VAR||(LA86_0>=GET && LA86_0<=SET)||(LA86_0>=WXML && LA86_0<=CLASS)||(LA86_0>=DEBUGGER && LA86_0<=LBRACE)||LA86_0==SEMIC||LA86_0==AT||LA86_0==StringLiteral||(LA86_0>=Identifier && LA86_0<=RegularExpressionLiteral)||(LA86_0>=DecimalLiteral && LA86_0<=HexIntegerLiteral)) ) {
                alt86=2;
            }
            else if ( ((LA86_0>=XMLFragment && LA86_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt86=2;
            }
            else if ( (LA86_0==BREAK||LA86_0==CONTINUE||(LA86_0>=DELETE && LA86_0<=DO)||LA86_0==FOR||LA86_0==IF||(LA86_0>=NEW && LA86_0<=SWITCH)||(LA86_0>=THROW && LA86_0<=TYPEOF)||(LA86_0>=VOID && LA86_0<=WITH)||LA86_0==YIELD||LA86_0==CONST||LA86_0==LPAREN||LA86_0==LBRACK||(LA86_0>=ADD && LA86_0<=SUB)||(LA86_0>=INC && LA86_0<=DEC)||(LA86_0>=NOT && LA86_0<=INV)) ) {
                alt86=2;
            }
            else if ( (LA86_0==DEFAULT) && ( isXmlEnabled() )) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1787:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // JS.g:1792:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement7142);
                    functionDeclaration345=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration345.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1793:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement7147);
                    statement346=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement346.getTree());

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

    public static class standaloneExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start standaloneExpression
    // JS.g:1798:1: standaloneExpression : expression EOF ;
    public final standaloneExpression_return standaloneExpression() throws RecognitionException {
        standaloneExpression_return retval = new standaloneExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF348=null;
        expression_return expression347 = null;


        Object EOF348_tree=null;

         pushState(JSParserRule.EXPRESSION); 
        try {
            // JS.g:1800:2: ( expression EOF )
            // JS.g:1800:4: expression EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_standaloneExpression7165);
            expression347=expression();
            _fsp--;

            adaptor.addChild(root_0, expression347.getTree());
            EOF348=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_standaloneExpression7167); 

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
    // $ANTLR end standaloneExpression


 

    public static final BitSet FOLLOW_reservedWord_in_token1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_token1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_token1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_token1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_token1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_token1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WXML_in_identifier2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_identifier2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_identifier2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EACH_in_identifier2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_identifier2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_identifier2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2522 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_xmlAttribute2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2540 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_MUL_in_xmlAttribute2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlLiteral_in_literal2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_xmlLiteral2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_xmlLiteral2891 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_xmlLiteral2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_xmlLiteral2895 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_xmlLiteral2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_primaryExpression3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3747 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3778 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC026BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3786 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC026BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3861 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000000005FL,0x0384100000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3869 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000000001FL,0x0384100000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3934 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3936 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_propertyName3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression4016 = new BitSet(new long[]{0xFFFFF7F602460070L,0x03200000000002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_newExpressionTail_in_newExpression4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments4032 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC003BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments4040 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4088 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression4109 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4134 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4138 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4161 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4165 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4193 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4197 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4220 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4222 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_memberExpression_in_newExpressionTail4281 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_newExpressionTail4302 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_newExpressionTail4306 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_newExpressionTail4329 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4333 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_newExpressionTail4361 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4365 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_newExpressionTail4388 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4390 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_newExpressionTail4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4493 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4548 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4633 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4635 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4637 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4639 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_namespaceStatement4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4675 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4679 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4694 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4716 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4746 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4750 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4765 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4784 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4788 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4815 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4829 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4833 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4856 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4875 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4879 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4898 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4912 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4916 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4935 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4955 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4959 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4962 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4976 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4980 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4983 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4999 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression5003 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression5006 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5022 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn5026 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5029 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5044 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression5048 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5051 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5066 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn5070 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5073 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5092 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression5096 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5099 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5113 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn5117 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5120 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5135 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression5139 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5142 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5157 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn5161 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5164 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression5183 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression5187 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5190 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5192 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5209 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn5213 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5216 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn5218 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5249 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5256 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5337 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5344 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5373 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5418 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5625 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_block5627 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5659 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5665 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5695 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5700 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5717 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5722 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5739 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5745 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5827 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5831 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5833 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5839 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5901 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5903 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5907 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5941 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5946 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5966 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5970 = new BitSet(new long[]{0xFFFFF7FE72461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5974 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement6022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement6025 = new BitSet(new long[]{0xFFFFF7FE72461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement6030 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar6065 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6067 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar6079 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar6127 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6136 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6145 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6229 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6244 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6296 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6305 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6384 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6393 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0004060000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0004060000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6519 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012FFL,0x038C160000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6547 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6552 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6573 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6579 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6583 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6587 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6620 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6623 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6625 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6628 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6641 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6644 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6647 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6664 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6666 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6699 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6726 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6730 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6755 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6758 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6777 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_catchFilter6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6817 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6853 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameter6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6902 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000011FL,0x0004000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6910 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6950 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6952 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6992 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration7000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration7033 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration7039 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration7045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7088 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_sourceElement_in_program7091 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7093 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_EOF_in_program7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_standaloneExpression7165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_standaloneExpression7167 = new BitSet(new long[]{0x0000000000000002L});

}
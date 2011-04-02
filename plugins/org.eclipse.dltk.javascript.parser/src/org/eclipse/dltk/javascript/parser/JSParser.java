// $ANTLR 3.0.1 JS.g 2011-04-02 12:54:12

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
    // JS.g:634:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute );
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
            // JS.g:635:2: ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute )
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
                    new NoViableAltException("634:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:635:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1954);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:636:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1959);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:637:4: XMLFragment
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragment3=(Token)input.LT(1);
                    match(input,XMLFragment,FOLLOW_XMLFragment_in_token1964); 
                    XMLFragment3_tree = (Object)adaptor.create(XMLFragment3);
                    adaptor.addChild(root_0, XMLFragment3_tree);


                    }
                    break;
                case 4 :
                    // JS.g:638:4: XMLFragmentEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragmentEnd4=(Token)input.LT(1);
                    match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_token1969); 
                    XMLFragmentEnd4_tree = (Object)adaptor.create(XMLFragmentEnd4);
                    adaptor.addChild(root_0, XMLFragmentEnd4_tree);


                    }
                    break;
                case 5 :
                    // JS.g:639:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1974);
                    punctuator5=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator5.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:640:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL6=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_token1979); 
                    NULL6_tree = (Object)adaptor.create(NULL6);
                    adaptor.addChild(root_0, NULL6_tree);


                    }
                    break;
                case 7 :
                    // JS.g:641:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_token1984);
                    booleanLiteral7=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral7.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:642:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1989);
                    numericLiteral8=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral8.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:643:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral9=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1994); 
                    StringLiteral9_tree = (Object)adaptor.create(StringLiteral9);
                    adaptor.addChild(root_0, StringLiteral9_tree);


                    }
                    break;
                case 10 :
                    // JS.g:644:4: xmlAttribute
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
    // JS.g:649:1: reservedWord : keyword ;
    public final reservedWord_return reservedWord() throws RecognitionException {
        reservedWord_return retval = new reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        keyword_return keyword11 = null;



        try {
            // JS.g:650:2: ( keyword )
            // JS.g:650:4: keyword
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
    // JS.g:657:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // JS.g:658:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
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
    // JS.g:695:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:696:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
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
    // JS.g:768:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier );
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
            // JS.g:769:3: ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier )
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
                    new NoViableAltException("768:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:769:5: WXML
                    {
                    root_0 = (Object)adaptor.nil();

                    WXML14=(Token)input.LT(1);
                    match(input,WXML,FOLLOW_WXML_in_identifier2466); 
                    WXML14_tree = (Object)adaptor.create(WXML14);
                    adaptor.addChild(root_0, WXML14_tree);


                    }
                    break;
                case 2 :
                    // JS.g:770:5: GET
                    {
                    root_0 = (Object)adaptor.nil();

                    GET15=(Token)input.LT(1);
                    match(input,GET,FOLLOW_GET_in_identifier2472); 
                    GET15_tree = (Object)adaptor.create(GET15);
                    adaptor.addChild(root_0, GET15_tree);


                    }
                    break;
                case 3 :
                    // JS.g:771:5: SET
                    {
                    root_0 = (Object)adaptor.nil();

                    SET16=(Token)input.LT(1);
                    match(input,SET,FOLLOW_SET_in_identifier2478); 
                    SET16_tree = (Object)adaptor.create(SET16);
                    adaptor.addChild(root_0, SET16_tree);


                    }
                    break;
                case 4 :
                    // JS.g:772:5: EACH
                    {
                    root_0 = (Object)adaptor.nil();

                    EACH17=(Token)input.LT(1);
                    match(input,EACH,FOLLOW_EACH_in_identifier2484); 
                    EACH17_tree = (Object)adaptor.create(EACH17);
                    adaptor.addChild(root_0, EACH17_tree);


                    }
                    break;
                case 5 :
                    // JS.g:773:5: NAMESPACE
                    {
                    root_0 = (Object)adaptor.nil();

                    NAMESPACE18=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_identifier2490); 
                    NAMESPACE18_tree = (Object)adaptor.create(NAMESPACE18);
                    adaptor.addChild(root_0, NAMESPACE18_tree);


                    }
                    break;
                case 6 :
                    // JS.g:774:5: word= futureReservedWord
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
                    // 774:68: -> Identifier[word.start]
                    {
                        adaptor.addChild(root_0, adaptor.create(Identifier, word.start));

                    }



                    }
                    break;
                case 7 :
                    // JS.g:775:5: Identifier
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
    // JS.g:778:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );
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
            // JS.g:779:3: ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) )
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
                        new NoViableAltException("778:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("778:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // JS.g:779:5: AT identifier
                    {
                    AT20=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2522); 
                    stream_AT.add(AT20);

                    pushFollow(FOLLOW_identifier_in_xmlAttribute2524);
                    identifier21=identifier();
                    _fsp--;

                    stream_identifier.add(identifier21.getTree());

                    // AST REWRITE
                    // elements: AT, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 779:19: -> ^( XmlAttribute AT identifier )
                    {
                        // JS.g:779:22: ^( XmlAttribute AT identifier )
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
                    // JS.g:780:5: AT MUL
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
                    // 780:12: -> ^( XmlAttribute AT MUL )
                    {
                        // JS.g:780:15: ^( XmlAttribute AT MUL )
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
    // JS.g:787:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            // JS.g:788:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
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
    // JS.g:844:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );
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
            // JS.g:845:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral )
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
                    new NoViableAltException("844:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:845:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL25=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2828); 
                    NULL25_tree = (Object)adaptor.create(NULL25);
                    adaptor.addChild(root_0, NULL25_tree);


                    }
                    break;
                case 2 :
                    // JS.g:846:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2833);
                    booleanLiteral26=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral26.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:847:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2838);
                    numericLiteral27=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral27.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:848:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral28=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2843); 
                    StringLiteral28_tree = (Object)adaptor.create(StringLiteral28);
                    adaptor.addChild(root_0, StringLiteral28_tree);


                    }
                    break;
                case 5 :
                    // JS.g:849:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral29=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2848); 
                    RegularExpressionLiteral29_tree = (Object)adaptor.create(RegularExpressionLiteral29);
                    adaptor.addChild(root_0, RegularExpressionLiteral29_tree);


                    }
                    break;
                case 6 :
                    // JS.g:850:4: xmlLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlLiteral_in_literal2853);
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
    // JS.g:853:1: xmlLiteral : ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) ;
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
            // JS.g:854:2: ( ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) )
            // JS.g:854:4: ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd
            {
            // JS.g:854:4: ( XMLFragment LBRACE expression RBRACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==XMLFragment) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JS.g:855:6: XMLFragment LBRACE expression RBRACE
            	    {
            	    XMLFragment31=(Token)input.LT(1);
            	    match(input,XMLFragment,FOLLOW_XMLFragment_in_xmlLiteral2871); 
            	    stream_XMLFragment.add(XMLFragment31);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_EXPRESSION); 
            	    LBRACE32=(Token)input.LT(1);
            	    match(input,LBRACE,FOLLOW_LBRACE_in_xmlLiteral2888); 
            	    stream_LBRACE.add(LBRACE32);

            	    pushFollow(FOLLOW_expression_in_xmlLiteral2890);
            	    expression33=expression();
            	    _fsp--;

            	    stream_expression.add(expression33.getTree());
            	    RBRACE34=(Token)input.LT(1);
            	    match(input,RBRACE,FOLLOW_RBRACE_in_xmlLiteral2892); 
            	    stream_RBRACE.add(RBRACE34);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_XML); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            XMLFragmentEnd35=(Token)input.LT(1);
            match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_xmlLiteral2908); 
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
            // 860:4: -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
            {
                // JS.g:860:7: ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);

                // JS.g:860:21: ( XMLFragment )*
                while ( stream_XMLFragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_XMLFragment.next());

                }
                stream_XMLFragment.reset();
                // JS.g:860:34: ( expression )*
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
    // JS.g:884:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set36=null;

        Object set36_tree=null;

        try {
            // JS.g:885:2: ( TRUE | FALSE )
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
    // JS.g:931:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;

        Object set37_tree=null;

        try {
            // JS.g:932:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
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
    // JS.g:1021:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
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
            // JS.g:1022:2: ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
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
                    new NoViableAltException("1021:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // JS.g:1022:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS38=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3698); 
                    THIS38_tree = (Object)adaptor.create(THIS38);
                    adaptor.addChild(root_0, THIS38_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1023:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3703);
                    identifier39=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier39.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1024:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_primaryExpression3708);
                    xmlAttribute40=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute40.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1025:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3713);
                    literal41=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal41.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1026:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3718);
                    arrayLiteral42=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral42.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1027:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3723);
                    objectLiteral43=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral43.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1028:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3728);
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
    // JS.g:1031:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
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
            // JS.g:1032:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:1032:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3744); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3746);
            expression45=expression();
            _fsp--;

            stream_expression.add(expression45.getTree());
            RPAREN46=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3748); 
            stream_RPAREN.add(RPAREN46);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1032:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:1032:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
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
    // JS.g:1035:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA48=null;
        Token RBRACK50=null;
        arrayItem_return arrayItem47 = null;

        arrayItem_return arrayItem49 = null;


        Object lb_tree=null;
        Object COMMA48_tree=null;
        Object RBRACK50_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:1036:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:1036:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3773); 
            stream_LBRACK.add(lb);

            // JS.g:1036:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=NULL && LA9_0<=FALSE)||LA9_0==DELETE||(LA9_0>=EACH && LA9_0<=FUNCTION)||LA9_0==NEW||LA9_0==THIS||LA9_0==TYPEOF||LA9_0==VOID||(LA9_0>=GET && LA9_0<=CLASS)||(LA9_0>=DEBUGGER && LA9_0<=LBRACE)||LA9_0==LPAREN||LA9_0==LBRACK||LA9_0==COMMA||(LA9_0>=ADD && LA9_0<=SUB)||(LA9_0>=INC && LA9_0<=DEC)||(LA9_0>=NOT && LA9_0<=INV)||LA9_0==AT||(LA9_0>=XMLFragment && LA9_0<=XMLFragmentEnd)||LA9_0==StringLiteral||(LA9_0>=Identifier && LA9_0<=RegularExpressionLiteral)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
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
                    // JS.g:1036:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3777);
                    arrayItem47=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem47.getTree());
                    // JS.g:1036:26: ( COMMA ( arrayItem )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:1036:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA48=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3781); 
                    	    stream_COMMA.add(COMMA48);

                    	    // JS.g:1036:34: ( arrayItem )?
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
                    	            // JS.g:1036:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3783);
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

            RBRACK50=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3792); 
            stream_RBRACK.add(RBRACK50);


            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1037:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:1037:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:1037:28: ( arrayItem )*
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
    // JS.g:1040:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1041:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:1041:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:1041:4: (expr= assignmentExpression | {...}?)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=NULL && LA10_0<=FALSE)||LA10_0==DELETE||(LA10_0>=EACH && LA10_0<=FUNCTION)||LA10_0==NEW||LA10_0==THIS||LA10_0==TYPEOF||LA10_0==VOID||(LA10_0>=GET && LA10_0<=CLASS)||(LA10_0>=DEBUGGER && LA10_0<=LBRACE)||LA10_0==LPAREN||LA10_0==LBRACK||(LA10_0>=ADD && LA10_0<=SUB)||(LA10_0>=INC && LA10_0<=DEC)||(LA10_0>=NOT && LA10_0<=INV)||LA10_0==AT||(LA10_0>=XMLFragment && LA10_0<=XMLFragmentEnd)||LA10_0==StringLiteral||(LA10_0>=Identifier && LA10_0<=RegularExpressionLiteral)||(LA10_0>=DecimalLiteral && LA10_0<=HexIntegerLiteral)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RBRACK||LA10_0==COMMA) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1041:4: (expr= assignmentExpression | {...}?)", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1041:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3820);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1041:34: {...}?
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
            // 1042:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1042:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1042:13: ( $expr)?
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
    // JS.g:1045:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA52=null;
        Token COMMA54=null;
        Token RBRACE55=null;
        objectPropertyInitializer_return objectPropertyInitializer51 = null;

        objectPropertyInitializer_return objectPropertyInitializer53 = null;


        Object lb_tree=null;
        Object COMMA52_tree=null;
        Object COMMA54_tree=null;
        Object RBRACE55_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:1046:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) )
            // JS.g:1046:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3852); 
            stream_LBRACE.add(lb);

            // JS.g:1046:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EACH||(LA13_0>=GET && LA13_0<=SET)||(LA13_0>=WXML && LA13_0<=CLASS)||(LA13_0>=DEBUGGER && LA13_0<=VOLATILE)||LA13_0==AT||LA13_0==StringLiteral||LA13_0==Identifier||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // JS.g:1046:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3856);
                    objectPropertyInitializer51=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer51.getTree());
                    // JS.g:1046:42: ( COMMA objectPropertyInitializer )*
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
                    	    // JS.g:1046:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA52=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3860); 
                    	    stream_COMMA.add(COMMA52);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3862);
                    	    objectPropertyInitializer53=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // JS.g:1046:79: ( COMMA )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COMMA) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // JS.g:1046:79: COMMA
                            {
                            COMMA54=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3867); 
                            stream_COMMA.add(COMMA54);


                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE55=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3872); 
            stream_RBRACE.add(RBRACE55);


            // AST REWRITE
            // elements: objectPropertyInitializer, COMMA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1047:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
            {
                // JS.g:1047:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1047:30: ( objectPropertyInitializer )*
                while ( stream_objectPropertyInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectPropertyInitializer.next());

                }
                stream_objectPropertyInitializer.reset();
                // JS.g:1047:57: ( COMMA )*
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
    // JS.g:1050:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair56 = null;

        getMethodDeclaration_return getMethodDeclaration57 = null;

        setMethodDeclaration_return setMethodDeclaration58 = null;



        try {
            // JS.g:1051:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
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

                if ( (LA14_2==EACH||(LA14_2>=GET && LA14_2<=SET)||(LA14_2>=WXML && LA14_2<=CLASS)||(LA14_2>=DEBUGGER && LA14_2<=VOLATILE)||LA14_2==Identifier) ) {
                    alt14=2;
                }
                else if ( (LA14_2==COLON) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1050:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case SET:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==EACH||(LA14_3>=GET && LA14_3<=SET)||(LA14_3>=WXML && LA14_3<=CLASS)||(LA14_3>=DEBUGGER && LA14_3<=VOLATILE)||LA14_3==Identifier) ) {
                    alt14=3;
                }
                else if ( (LA14_3==COLON) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1050:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1050:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // JS.g:1051:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3899);
                    nameValuePair56=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair56.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1052:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3906);
                    getMethodDeclaration57=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration57.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1053:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3912);
                    setMethodDeclaration58=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration58.getTree());

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
    // JS.g:1056:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON60=null;
        propertyName_return propertyName59 = null;

        assignmentExpression_return assignmentExpression61 = null;


        Object COLON60_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1057:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1057:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3925);
            propertyName59=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName59.getTree());
            COLON60=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3927); 
            stream_COLON.add(COLON60);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3929);
            assignmentExpression61=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression61.getTree());

            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1058:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1058:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // JS.g:1061:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral63=null;
        identifier_return identifier62 = null;

        numericLiteral_return numericLiteral64 = null;

        xmlAttribute_return xmlAttribute65 = null;


        Object StringLiteral63_tree=null;

        try {
            // JS.g:1062:2: ( identifier | StringLiteral | numericLiteral | xmlAttribute )
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
                    new NoViableAltException("1061:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // JS.g:1062:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3953);
                    identifier62=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier62.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1063:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral63=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3958); 
                    StringLiteral63_tree = (Object)adaptor.create(StringLiteral63);
                    adaptor.addChild(root_0, StringLiteral63_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1064:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3963);
                    numericLiteral64=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral64.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1065:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_propertyName3968);
                    xmlAttribute65=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute65.getTree());

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
    // JS.g:1077:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression66 = null;

        functionExpression_return functionExpression67 = null;

        newExpression_return newExpression68 = null;



        try {
            // JS.g:1078:2: ( primaryExpression | functionExpression | newExpression )
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
                    new NoViableAltException("1077:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // JS.g:1078:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3986);
                    primaryExpression66=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression66.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1079:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3991);
                    functionExpression67=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression67.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1080:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3996);
                    newExpression68=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression68.getTree());

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
    // JS.g:1083:1: newExpression : NEW newExpressionTail ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW69=null;
        newExpressionTail_return newExpressionTail70 = null;


        Object NEW69_tree=null;

        try {
            // JS.g:1084:2: ( NEW newExpressionTail )
            // JS.g:1084:4: NEW newExpressionTail
            {
            root_0 = (Object)adaptor.nil();

            NEW69=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression4007); 
            NEW69_tree = (Object)adaptor.create(NEW69);
            root_0 = (Object)adaptor.becomeRoot(NEW69_tree, root_0);

            pushFollow(FOLLOW_newExpressionTail_in_newExpression4010);
            newExpressionTail70=newExpressionTail();
            _fsp--;

            adaptor.addChild(root_0, newExpressionTail70.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1088:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN71=null;
        Token COMMA73=null;
        Token RPAREN75=null;
        assignmentExpression_return assignmentExpression72 = null;

        assignmentExpression_return assignmentExpression74 = null;


        Object LPAREN71_tree=null;
        Object COMMA73_tree=null;
        Object RPAREN75_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1089:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) )
            // JS.g:1089:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN71=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments4023); 
            stream_LPAREN.add(LPAREN71);

            // JS.g:1089:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=NULL && LA18_0<=FALSE)||LA18_0==DELETE||(LA18_0>=EACH && LA18_0<=FUNCTION)||LA18_0==NEW||LA18_0==THIS||LA18_0==TYPEOF||LA18_0==VOID||(LA18_0>=GET && LA18_0<=CLASS)||(LA18_0>=DEBUGGER && LA18_0<=LBRACE)||LA18_0==LPAREN||LA18_0==LBRACK||(LA18_0>=ADD && LA18_0<=SUB)||(LA18_0>=INC && LA18_0<=DEC)||(LA18_0>=NOT && LA18_0<=INV)||LA18_0==AT||(LA18_0>=XMLFragment && LA18_0<=XMLFragmentEnd)||LA18_0==StringLiteral||(LA18_0>=Identifier && LA18_0<=RegularExpressionLiteral)||(LA18_0>=DecimalLiteral && LA18_0<=HexIntegerLiteral)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1089:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments4027);
                    assignmentExpression72=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression72.getTree());
                    // JS.g:1089:34: ( COMMA assignmentExpression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // JS.g:1089:36: COMMA assignmentExpression
                    	    {
                    	    COMMA73=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments4031); 
                    	    stream_COMMA.add(COMMA73);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments4033);
                    	    assignmentExpression74=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN75=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments4041); 
            stream_RPAREN.add(RPAREN75);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1090:2: -> ^( CALL_ARGUMENTS ( assignmentExpression )* )
            {
                // JS.g:1090:5: ^( CALL_ARGUMENTS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL_ARGUMENTS, "CALL_ARGUMENTS"), root_1);

                // JS.g:1090:23: ( assignmentExpression )*
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
    // JS.g:1093:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK78=null;
        Token RBRACK80=null;
        Token DOT81=null;
        Token DOTDOT82=null;
        Token COLONCOLON84=null;
        rightHandSideExpression_return r = null;

        memberExpression_return memberExpression76 = null;

        arguments_return arguments77 = null;

        expression_return expression79 = null;

        rightHandSideExpression_return rightHandSideExpression83 = null;

        expression_return expression85 = null;


        Object LBRACK78_tree=null;
        Object RBRACK80_tree=null;
        Object DOT81_tree=null;
        Object DOTDOT82_tree=null;
        Object COLONCOLON84_tree=null;
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
            // JS.g:1095:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1096:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1096:3: ( memberExpression -> memberExpression )
            // JS.g:1097:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4079);
            memberExpression76=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression76.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1097:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1099:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
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
            	    // JS.g:1100:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression4100);
            	    arguments77=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments77.getTree());

            	    // AST REWRITE
            	    // elements: arguments, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1100:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1100:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1101:7: LBRACK expression RBRACK
            	    {
            	    LBRACK78=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4125); 
            	    stream_LBRACK.add(LBRACK78);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4127);
            	    expression79=expression();
            	    _fsp--;

            	    stream_expression.add(expression79.getTree());
            	    RBRACK80=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4129); 
            	    stream_RBRACK.add(RBRACK80);


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1101:33: -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression )
            	    {
            	        // JS.g:1101:36: ^( BYINDEX[$LBRACK] $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, LBRACK78), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1102:7: DOT r= rightHandSideExpression
            	    {
            	    DOT81=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4152); 
            	    stream_DOT.add(DOT81);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4156);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: r, leftHandSideExpression, DOT
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1102:37: -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? )
            	    {
            	        // JS.g:1102:40: ^( BYFIELD $leftHandSideExpression DOT ( $r)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        // JS.g:1102:79: ( $r)?
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
            	    // JS.g:1103:7: DOTDOT rightHandSideExpression
            	    {
            	    DOTDOT82=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4181); 
            	    stream_DOTDOT.add(DOTDOT82);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4183);
            	    rightHandSideExpression83=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression83.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1103:38: -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // JS.g:1103:41: ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression )
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
            	    // JS.g:1104:7: COLONCOLON expression
            	    {
            	    COLONCOLON84=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4202); 
            	    stream_COLONCOLON.add(COLONCOLON84);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4204);
            	    expression85=expression();
            	    _fsp--;

            	    stream_expression.add(expression85.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1104:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1104:32: ^( LOCALNAME $leftHandSideExpression expression )
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
    // JS.g:1111:1: newExpressionTail : ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? ;
    public final newExpressionTail_return newExpressionTail() throws RecognitionException {
        newExpressionTail_return retval = new newExpressionTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK87=null;
        Token RBRACK89=null;
        Token DOT90=null;
        Token DOTDOT91=null;
        Token COLONCOLON93=null;
        rightHandSideExpression_return r = null;

        memberExpression_return memberExpression86 = null;

        expression_return expression88 = null;

        rightHandSideExpression_return rightHandSideExpression92 = null;

        expression_return expression94 = null;

        arguments_return arguments95 = null;


        Object LBRACK87_tree=null;
        Object RBRACK89_tree=null;
        Object DOT90_tree=null;
        Object DOTDOT91_tree=null;
        Object COLONCOLON93_tree=null;
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
            // JS.g:1112:3: ( ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? )
            // JS.g:1113:3: ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            {
            // JS.g:1113:3: ( memberExpression -> memberExpression )
            // JS.g:1114:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_newExpressionTail4263);
            memberExpression86=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression86.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1114:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1116:3: ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )*
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
            	    // JS.g:1117:5: LBRACK expression RBRACK
            	    {
            	    LBRACK87=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_newExpressionTail4284); 
            	    stream_LBRACK.add(LBRACK87);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4286);
            	    expression88=expression();
            	    _fsp--;

            	    stream_expression.add(expression88.getTree());
            	    RBRACK89=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_newExpressionTail4288); 
            	    stream_RBRACK.add(RBRACK89);


            	    // AST REWRITE
            	    // elements: newExpressionTail, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1117:31: -> ^( BYINDEX[$LBRACK] $newExpressionTail expression )
            	    {
            	        // JS.g:1117:34: ^( BYINDEX[$LBRACK] $newExpressionTail expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, LBRACK87), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 2 :
            	    // JS.g:1118:7: DOT r= rightHandSideExpression
            	    {
            	    DOT90=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_newExpressionTail4311); 
            	    stream_DOT.add(DOT90);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4315);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: DOT, newExpressionTail, r
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1118:37: -> ^( BYFIELD $newExpressionTail DOT ( $r)? )
            	    {
            	        // JS.g:1118:40: ^( BYFIELD $newExpressionTail DOT ( $r)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        // JS.g:1118:74: ( $r)?
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
            	    // JS.g:1119:7: DOTDOT rightHandSideExpression
            	    {
            	    DOTDOT91=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_newExpressionTail4340); 
            	    stream_DOTDOT.add(DOTDOT91);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4342);
            	    rightHandSideExpression92=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression92.getTree());

            	    // AST REWRITE
            	    // elements: newExpressionTail, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1119:38: -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression )
            	    {
            	        // JS.g:1119:41: ^( ALLCHILDREN $newExpressionTail rightHandSideExpression )
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
            	    // JS.g:1120:7: COLONCOLON expression
            	    {
            	    COLONCOLON93=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_newExpressionTail4361); 
            	    stream_COLONCOLON.add(COLONCOLON93);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4363);
            	    expression94=expression();
            	    _fsp--;

            	    stream_expression.add(expression94.getTree());

            	    // AST REWRITE
            	    // elements: expression, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1120:29: -> ^( LOCALNAME $newExpressionTail expression )
            	    {
            	        // JS.g:1120:32: ^( LOCALNAME $newExpressionTail expression )
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

            // JS.g:1122:3: ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAREN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JS.g:1123:5: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_newExpressionTail4389);
                    arguments95=arguments();
                    _fsp--;

                    stream_arguments.add(arguments95.getTree());

                    // AST REWRITE
                    // elements: arguments, newExpressionTail
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1123:19: -> ^( CALL $newExpressionTail arguments )
                    {
                        // JS.g:1123:22: ^( CALL $newExpressionTail arguments )
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
    // JS.g:1127:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL99=null;
        parenExpression_return parenExpression96 = null;

        identifier_return identifier97 = null;

        xmlAttribute_return xmlAttribute98 = null;


        Object MUL99_tree=null;

        try {
            // JS.g:1128:3: ( parenExpression | identifier | xmlAttribute | MUL )
            int alt22=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt22=1;
                }
                break;
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
                alt22=2;
                }
                break;
            case AT:
                {
                alt22=3;
                }
                break;
            case MUL:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1127:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // JS.g:1128:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4424);
                    parenExpression96=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression96.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1129:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4431);
                    identifier97=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier97.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1130:5: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4437);
                    xmlAttribute98=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute98.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1131:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL99=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4443); 
                    MUL99_tree = (Object)adaptor.create(MUL99);
                    adaptor.addChild(root_0, MUL99_tree);


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
    // JS.g:1144:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression100 = null;

        postfixOperator_return postfixOperator101 = null;



        try {
            // JS.g:1145:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1145:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4460);
            leftHandSideExpression100=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression100.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1145:95: ( postfixOperator )?
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
                    // JS.g:1145:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4466);
                    postfixOperator101=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator101.getTree(), root_0);

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
    // JS.g:1148:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1149:2: (op= INC | op= DEC )
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
                    new NoViableAltException("1148:1: postfixOperator : (op= INC | op= DEC );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // JS.g:1149:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4484); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1150:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4493); 
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
    // JS.g:1157:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression102 = null;

        unaryOperator_return unaryOperator103 = null;

        unaryExpression_return unaryExpression104 = null;



        try {
            // JS.g:1158:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=NULL && LA25_0<=FALSE)||(LA25_0>=EACH && LA25_0<=FUNCTION)||LA25_0==NEW||LA25_0==THIS||(LA25_0>=GET && LA25_0<=SET)||(LA25_0>=WXML && LA25_0<=CLASS)||(LA25_0>=DEBUGGER && LA25_0<=LBRACE)||LA25_0==LPAREN||LA25_0==LBRACK||LA25_0==AT||(LA25_0>=XMLFragment && LA25_0<=XMLFragmentEnd)||LA25_0==StringLiteral||(LA25_0>=Identifier && LA25_0<=RegularExpressionLiteral)||(LA25_0>=DecimalLiteral && LA25_0<=HexIntegerLiteral)) ) {
                alt25=1;
            }
            else if ( (LA25_0==DELETE||LA25_0==TYPEOF||LA25_0==VOID||LA25_0==YIELD||(LA25_0>=ADD && LA25_0<=SUB)||(LA25_0>=INC && LA25_0<=DEC)||(LA25_0>=NOT && LA25_0<=INV)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1157:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // JS.g:1158:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4510);
                    postfixExpression102=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression102.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1159:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4515);
                    unaryOperator103=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator103.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4518);
                    unaryExpression104=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression104.getTree());

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
    // JS.g:1162:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE105=null;
        Token VOID106=null;
        Token TYPEOF107=null;
        Token INC108=null;
        Token DEC109=null;
        Token INV110=null;
        Token NOT111=null;
        Token YIELD112=null;

        Object op_tree=null;
        Object DELETE105_tree=null;
        Object VOID106_tree=null;
        Object TYPEOF107_tree=null;
        Object INC108_tree=null;
        Object DEC109_tree=null;
        Object INV110_tree=null;
        Object NOT111_tree=null;
        Object YIELD112_tree=null;

        try {
            // JS.g:1163:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
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
                    new NoViableAltException("1162:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // JS.g:1163:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE105=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4530); 
                    DELETE105_tree = (Object)adaptor.create(DELETE105);
                    adaptor.addChild(root_0, DELETE105_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1164:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID106=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4535); 
                    VOID106_tree = (Object)adaptor.create(VOID106);
                    adaptor.addChild(root_0, VOID106_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1165:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF107=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4540); 
                    TYPEOF107_tree = (Object)adaptor.create(TYPEOF107);
                    adaptor.addChild(root_0, TYPEOF107_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1166:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC108=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4545); 
                    INC108_tree = (Object)adaptor.create(INC108);
                    adaptor.addChild(root_0, INC108_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1167:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC109=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4550); 
                    DEC109_tree = (Object)adaptor.create(DEC109);
                    adaptor.addChild(root_0, DEC109_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1168:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4557); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1169:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4566); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1170:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV110=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4573); 
                    INV110_tree = (Object)adaptor.create(INV110);
                    adaptor.addChild(root_0, INV110_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1171:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT111=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4578); 
                    NOT111_tree = (Object)adaptor.create(NOT111);
                    adaptor.addChild(root_0, NOT111_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1172:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD112=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4583); 
                    YIELD112_tree = (Object)adaptor.create(YIELD112);
                    adaptor.addChild(root_0, YIELD112_tree);


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
    // JS.g:1177:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT113=null;
        Token WXML114=null;
        Token NAMESPACE115=null;
        Token ASSIGN116=null;
        expression_return expression117 = null;

        semic_return semic118 = null;


        Object DEFAULT113_tree=null;
        Object WXML114_tree=null;
        Object NAMESPACE115_tree=null;
        Object ASSIGN116_tree=null;
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1178:3: ( DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) )
            // JS.g:1178:5: DEFAULT WXML NAMESPACE ASSIGN expression semic
            {
            DEFAULT113=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4597); 
            stream_DEFAULT.add(DEFAULT113);

            WXML114=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4599); 
            stream_WXML.add(WXML114);

            NAMESPACE115=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4601); 
            stream_NAMESPACE.add(NAMESPACE115);

            ASSIGN116=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4603); 
            stream_ASSIGN.add(ASSIGN116);

            pushFollow(FOLLOW_expression_in_namespaceStatement4605);
            expression117=expression();
            _fsp--;

            stream_expression.add(expression117.getTree());
            pushFollow(FOLLOW_semic_in_namespaceStatement4607);
            semic118=semic();
            _fsp--;

            stream_semic.add(semic118.getTree());

            // AST REWRITE
            // elements: expression, WXML, DEFAULT, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1179:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
            {
                // JS.g:1179:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
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
    // JS.g:1184:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set120=null;
        unaryExpression_return unaryExpression119 = null;

        unaryExpression_return unaryExpression121 = null;


        Object set120_tree=null;

        try {
            // JS.g:1185:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1185:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4639);
            unaryExpression119=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression119.getTree());
            // JS.g:1185:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=MUL && LA27_0<=MOD)||LA27_0==DIV) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1185:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set120=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set120), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4643);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4658);
            	    unaryExpression121=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression121.getTree());

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
    // JS.g:1192:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;
        multiplicativeExpression_return multiplicativeExpression122 = null;

        multiplicativeExpression_return multiplicativeExpression124 = null;


        Object set123_tree=null;

        try {
            // JS.g:1193:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1193:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4676);
            multiplicativeExpression122=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression122.getTree());
            // JS.g:1193:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=ADD && LA28_0<=SUB)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1193:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set123=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set123), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4680);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4691);
            	    multiplicativeExpression124=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression124.getTree());

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
    // JS.g:1200:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set126=null;
        additiveExpression_return additiveExpression125 = null;

        additiveExpression_return additiveExpression127 = null;


        Object set126_tree=null;

        try {
            // JS.g:1201:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1201:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4710);
            additiveExpression125=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression125.getTree());
            // JS.g:1201:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=SHL && LA29_0<=SHU)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1201:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set126=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set126), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4714);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4729);
            	    additiveExpression127=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression127.getTree());

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
    // JS.g:1208:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set129=null;
        shiftExpression_return shiftExpression128 = null;

        shiftExpression_return shiftExpression130 = null;


        Object set129_tree=null;

        try {
            // JS.g:1209:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1209:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4748);
            shiftExpression128=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression128.getTree());
            // JS.g:1209:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
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
            	    // JS.g:1209:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set129=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set129), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4752);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4779);
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
    // $ANTLR end relationalExpression

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpressionNoIn
    // JS.g:1212:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set132=null;
        shiftExpression_return shiftExpression131 = null;

        shiftExpression_return shiftExpression133 = null;


        Object set132_tree=null;

        try {
            // JS.g:1213:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1213:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4793);
            shiftExpression131=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression131.getTree());
            // JS.g:1213:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==INSTANCEOF||(LA31_0>=LT && LA31_0<=GTE)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1213:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set132=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set132), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4797);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4820);
            	    shiftExpression133=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression133.getTree());

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
    // JS.g:1220:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set135=null;
        relationalExpression_return relationalExpression134 = null;

        relationalExpression_return relationalExpression136 = null;


        Object set135_tree=null;

        try {
            // JS.g:1221:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1221:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4839);
            relationalExpression134=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression134.getTree());
            // JS.g:1221:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=EQ && LA32_0<=NSAME)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1221:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4843);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4862);
            	    relationalExpression136=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression136.getTree());

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
    // JS.g:1224:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set138=null;
        relationalExpressionNoIn_return relationalExpressionNoIn137 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn139 = null;


        Object set138_tree=null;

        try {
            // JS.g:1225:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1225:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4876);
            relationalExpressionNoIn137=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn137.getTree());
            // JS.g:1225:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=EQ && LA33_0<=NSAME)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1225:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set138=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set138), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4880);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4899);
            	    relationalExpressionNoIn139=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn139.getTree());

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
    // JS.g:1232:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND141=null;
        equalityExpression_return equalityExpression140 = null;

        equalityExpression_return equalityExpression142 = null;


        Object AND141_tree=null;

        try {
            // JS.g:1233:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1233:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4919);
            equalityExpression140=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression140.getTree());
            // JS.g:1233:23: ( AND equalityExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1233:25: AND equalityExpression
            	    {
            	    AND141=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4923); 
            	    AND141_tree = (Object)adaptor.create(AND141);
            	    root_0 = (Object)adaptor.becomeRoot(AND141_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4926);
            	    equalityExpression142=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression142.getTree());

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
    // JS.g:1236:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND144=null;
        equalityExpressionNoIn_return equalityExpressionNoIn143 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn145 = null;


        Object AND144_tree=null;

        try {
            // JS.g:1237:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1237:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4940);
            equalityExpressionNoIn143=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn143.getTree());
            // JS.g:1237:27: ( AND equalityExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==AND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1237:29: AND equalityExpressionNoIn
            	    {
            	    AND144=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4944); 
            	    AND144_tree = (Object)adaptor.create(AND144);
            	    root_0 = (Object)adaptor.becomeRoot(AND144_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4947);
            	    equalityExpressionNoIn145=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn145.getTree());

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
    // JS.g:1240:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR147=null;
        bitwiseANDExpression_return bitwiseANDExpression146 = null;

        bitwiseANDExpression_return bitwiseANDExpression148 = null;


        Object XOR147_tree=null;

        try {
            // JS.g:1241:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1241:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4963);
            bitwiseANDExpression146=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression146.getTree());
            // JS.g:1241:25: ( XOR bitwiseANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==XOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1241:27: XOR bitwiseANDExpression
            	    {
            	    XOR147=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4967); 
            	    XOR147_tree = (Object)adaptor.create(XOR147);
            	    root_0 = (Object)adaptor.becomeRoot(XOR147_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4970);
            	    bitwiseANDExpression148=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression148.getTree());

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
    // JS.g:1244:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR150=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn149 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn151 = null;


        Object XOR150_tree=null;

        try {
            // JS.g:1245:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1245:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4986);
            bitwiseANDExpressionNoIn149=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn149.getTree());
            // JS.g:1245:29: ( XOR bitwiseANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==XOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1245:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR150=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4990); 
            	    XOR150_tree = (Object)adaptor.create(XOR150);
            	    root_0 = (Object)adaptor.becomeRoot(XOR150_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4993);
            	    bitwiseANDExpressionNoIn151=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn151.getTree());

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
    // JS.g:1248:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR153=null;
        bitwiseXORExpression_return bitwiseXORExpression152 = null;

        bitwiseXORExpression_return bitwiseXORExpression154 = null;


        Object OR153_tree=null;

        try {
            // JS.g:1249:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1249:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5008);
            bitwiseXORExpression152=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression152.getTree());
            // JS.g:1249:25: ( OR bitwiseXORExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1249:27: OR bitwiseXORExpression
            	    {
            	    OR153=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression5012); 
            	    OR153_tree = (Object)adaptor.create(OR153);
            	    root_0 = (Object)adaptor.becomeRoot(OR153_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5015);
            	    bitwiseXORExpression154=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression154.getTree());

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
    // JS.g:1252:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR156=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn155 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn157 = null;


        Object OR156_tree=null;

        try {
            // JS.g:1253:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1253:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5030);
            bitwiseXORExpressionNoIn155=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn155.getTree());
            // JS.g:1253:29: ( OR bitwiseXORExpressionNoIn )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==OR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1253:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR156=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn5034); 
            	    OR156_tree = (Object)adaptor.create(OR156);
            	    root_0 = (Object)adaptor.becomeRoot(OR156_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5037);
            	    bitwiseXORExpressionNoIn157=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn157.getTree());

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
    // JS.g:1260:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND159=null;
        bitwiseORExpression_return bitwiseORExpression158 = null;

        bitwiseORExpression_return bitwiseORExpression160 = null;


        Object LAND159_tree=null;

        try {
            // JS.g:1261:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1261:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5056);
            bitwiseORExpression158=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression158.getTree());
            // JS.g:1261:24: ( LAND bitwiseORExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LAND) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1261:26: LAND bitwiseORExpression
            	    {
            	    LAND159=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression5060); 
            	    LAND159_tree = (Object)adaptor.create(LAND159);
            	    root_0 = (Object)adaptor.becomeRoot(LAND159_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5063);
            	    bitwiseORExpression160=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression160.getTree());

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
    // JS.g:1264:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND162=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn161 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn163 = null;


        Object LAND162_tree=null;

        try {
            // JS.g:1265:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1265:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5077);
            bitwiseORExpressionNoIn161=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn161.getTree());
            // JS.g:1265:28: ( LAND bitwiseORExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LAND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JS.g:1265:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND162=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn5081); 
            	    LAND162_tree = (Object)adaptor.create(LAND162);
            	    root_0 = (Object)adaptor.becomeRoot(LAND162_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5084);
            	    bitwiseORExpressionNoIn163=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn163.getTree());

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
    // JS.g:1268:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR165=null;
        logicalANDExpression_return logicalANDExpression164 = null;

        logicalANDExpression_return logicalANDExpression166 = null;


        Object LOR165_tree=null;

        try {
            // JS.g:1269:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1269:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5099);
            logicalANDExpression164=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression164.getTree());
            // JS.g:1269:25: ( LOR logicalANDExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LOR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1269:27: LOR logicalANDExpression
            	    {
            	    LOR165=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression5103); 
            	    LOR165_tree = (Object)adaptor.create(LOR165);
            	    root_0 = (Object)adaptor.becomeRoot(LOR165_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5106);
            	    logicalANDExpression166=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression166.getTree());

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
    // JS.g:1272:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR168=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn167 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn169 = null;


        Object LOR168_tree=null;

        try {
            // JS.g:1273:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1273:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5121);
            logicalANDExpressionNoIn167=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn167.getTree());
            // JS.g:1273:29: ( LOR logicalANDExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LOR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1273:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR168=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn5125); 
            	    LOR168_tree = (Object)adaptor.create(LOR168);
            	    root_0 = (Object)adaptor.becomeRoot(LOR168_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5128);
            	    logicalANDExpressionNoIn169=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn169.getTree());

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
    // JS.g:1280:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE171=null;
        Token COLON173=null;
        logicalORExpression_return logicalORExpression170 = null;

        assignmentExpression_return assignmentExpression172 = null;

        assignmentExpression_return assignmentExpression174 = null;


        Object QUE171_tree=null;
        Object COLON173_tree=null;

        try {
            // JS.g:1281:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1281:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression5147);
            logicalORExpression170=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression170.getTree());
            // JS.g:1281:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // JS.g:1281:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE171=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression5151); 
                    QUE171_tree = (Object)adaptor.create(QUE171);
                    root_0 = (Object)adaptor.becomeRoot(QUE171_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5154);
                    assignmentExpression172=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression172.getTree());
                    COLON173=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression5156); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5159);
                    assignmentExpression174=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression174.getTree());

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
    // JS.g:1284:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE176=null;
        Token COLON178=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn175 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn177 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn179 = null;


        Object QUE176_tree=null;
        Object COLON178_tree=null;

        try {
            // JS.g:1285:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1285:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5173);
            logicalORExpressionNoIn175=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn175.getTree());
            // JS.g:1285:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==QUE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // JS.g:1285:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE176=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn5177); 
                    QUE176_tree = (Object)adaptor.create(QUE176);
                    root_0 = (Object)adaptor.becomeRoot(QUE176_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5180);
                    assignmentExpressionNoIn177=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn177.getTree());
                    COLON178=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn5182); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5185);
                    assignmentExpressionNoIn179=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn179.getTree());

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
    // JS.g:1314:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator180 = null;

        assignmentExpression_return assignmentExpression181 = null;



        
        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1319:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1319:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5213);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1320:2: ({...}? assignmentOperator assignmentExpression )?
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
                    // JS.g:1320:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5220);
                    assignmentOperator180=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator180.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5223);
                    assignmentExpression181=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression181.getTree());

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
    // JS.g:1323:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set182=null;

        Object set182_tree=null;

        try {
            // JS.g:1324:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set182=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set182));
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
    // JS.g:1327:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator183 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn184 = null;



        
        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1332:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1332:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5301);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1333:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
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
                    // JS.g:1333:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5308);
                    assignmentOperator183=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator183.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5311);
                    assignmentExpressionNoIn184=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn184.getTree());

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
    // JS.g:1340:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA185=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA185_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1341:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1341:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5333);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1341:32: ( COMMA exprs+= assignmentExpression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1341:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA185=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5337); 
            	    stream_COMMA.add(COMMA185);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5341);
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
            // 1342:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1342:28: ^( CEXPR ( $exprs)+ )
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
            else // 1343:2: -> $exprs
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
    // JS.g:1346:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA186=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA186_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1347:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1347:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5378);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1347:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // JS.g:1347:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA186=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5382); 
            	    stream_COMMA.add(COMMA186);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5386);
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
            // 1348:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1348:28: ^( CEXPR ( $exprs)+ )
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
            else // 1349:2: -> $exprs
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
    // JS.g:1374:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC187=null;
        Token EOF188=null;
        Token RBRACE189=null;
        Token EOL190=null;
        Token MultiLineComment191=null;

        Object SEMIC187_tree=null;
        Object EOF188_tree=null;
        Object RBRACE189_tree=null;
        Object EOL190_tree=null;
        Object MultiLineComment191_tree=null;

        
        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1382:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
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
                    new NoViableAltException("1374:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // JS.g:1382:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC187=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5437); 
                    SEMIC187_tree = (Object)adaptor.create(SEMIC187);
                    adaptor.addChild(root_0, SEMIC187_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1383:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF188=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5442); 
                    EOF188_tree = (Object)adaptor.create(EOF188);
                    adaptor.addChild(root_0, EOF188_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1384:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE189=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5447); 
                    RBRACE189_tree = (Object)adaptor.create(RBRACE189);
                    adaptor.addChild(root_0, RBRACE189_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1385:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL190=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5454); 
                    EOL190_tree = (Object)adaptor.create(EOL190);
                    adaptor.addChild(root_0, EOL190_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1385:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment191=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5458); 
                    MultiLineComment191_tree = (Object)adaptor.create(MultiLineComment191);
                    adaptor.addChild(root_0, MultiLineComment191_tree);


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
    // JS.g:1393:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block192 = null;

        statementTail_return statementTail193 = null;



        try {
            // JS.g:1398:2: ({...}? block | statementTail )
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
                        new NoViableAltException("1393:1: statement options {k=1; } : ({...}? block | statementTail );", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA51_0>=NULL && LA51_0<=BREAK)||(LA51_0>=CONTINUE && LA51_0<=DO)||(LA51_0>=FOR && LA51_0<=IF)||(LA51_0>=NEW && LA51_0<=VOLATILE)||LA51_0==LPAREN||LA51_0==LBRACK||LA51_0==SEMIC||(LA51_0>=ADD && LA51_0<=SUB)||(LA51_0>=INC && LA51_0<=DEC)||(LA51_0>=NOT && LA51_0<=INV)||LA51_0==AT||(LA51_0>=XMLFragment && LA51_0<=XMLFragmentEnd)||LA51_0==StringLiteral||(LA51_0>=Identifier && LA51_0<=RegularExpressionLiteral)||(LA51_0>=DecimalLiteral && LA51_0<=HexIntegerLiteral)) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1393:1: statement options {k=1; } : ({...}? block | statementTail );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // JS.g:1398:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5487);
                    block192=block();
                    _fsp--;

                    adaptor.addChild(root_0, block192.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1399:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5492);
                    statementTail193=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail193.getTree());

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
    // JS.g:1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement194 = null;

        emptyStatement_return emptyStatement195 = null;

        expressionStatement_return expressionStatement196 = null;

        ifStatement_return ifStatement197 = null;

        iterationStatement_return iterationStatement198 = null;

        continueStatement_return continueStatement199 = null;

        breakStatement_return breakStatement200 = null;

        returnStatement_return returnStatement201 = null;

        withStatement_return withStatement202 = null;

        labelledStatement_return labelledStatement203 = null;

        switchStatement_return switchStatement204 = null;

        throwStatement_return throwStatement205 = null;

        tryStatement_return tryStatement206 = null;

        constStatement_return constStatement207 = null;

        namespaceStatement_return namespaceStatement208 = null;



        try {
            // JS.g:1403:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt52=15;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt52=1;
                }
                break;
            case SEMIC:
                {
                alt52=2;
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
                alt52=3;
                }
                break;
            case WXML:
                {
                int LA52_4 = input.LA(2);

                if ( (LA52_4==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_4==EOF||(LA52_4>=IN && LA52_4<=INSTANCEOF)||(LA52_4>=RBRACE && LA52_4<=LPAREN)||LA52_4==LBRACK||(LA52_4>=DOT && LA52_4<=XOR)||(LA52_4>=LAND && LA52_4<=QUE)||(LA52_4>=ASSIGN && LA52_4<=DIVASS)||(LA52_4>=DOTDOT && LA52_4<=COLONCOLON)||(LA52_4>=EOL && LA52_4<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 4, input);

                    throw nvae;
                }
                }
                break;
            case GET:
                {
                int LA52_5 = input.LA(2);

                if ( (LA52_5==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_5==EOF||(LA52_5>=IN && LA52_5<=INSTANCEOF)||(LA52_5>=RBRACE && LA52_5<=LPAREN)||LA52_5==LBRACK||(LA52_5>=DOT && LA52_5<=XOR)||(LA52_5>=LAND && LA52_5<=QUE)||(LA52_5>=ASSIGN && LA52_5<=DIVASS)||(LA52_5>=DOTDOT && LA52_5<=COLONCOLON)||(LA52_5>=EOL && LA52_5<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 5, input);

                    throw nvae;
                }
                }
                break;
            case SET:
                {
                int LA52_6 = input.LA(2);

                if ( (LA52_6==EOF||(LA52_6>=IN && LA52_6<=INSTANCEOF)||(LA52_6>=RBRACE && LA52_6<=LPAREN)||LA52_6==LBRACK||(LA52_6>=DOT && LA52_6<=XOR)||(LA52_6>=LAND && LA52_6<=QUE)||(LA52_6>=ASSIGN && LA52_6<=DIVASS)||(LA52_6>=DOTDOT && LA52_6<=COLONCOLON)||(LA52_6>=EOL && LA52_6<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_6==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 6, input);

                    throw nvae;
                }
                }
                break;
            case EACH:
                {
                int LA52_7 = input.LA(2);

                if ( (LA52_7==EOF||(LA52_7>=IN && LA52_7<=INSTANCEOF)||(LA52_7>=RBRACE && LA52_7<=LPAREN)||LA52_7==LBRACK||(LA52_7>=DOT && LA52_7<=XOR)||(LA52_7>=LAND && LA52_7<=QUE)||(LA52_7>=ASSIGN && LA52_7<=DIVASS)||(LA52_7>=DOTDOT && LA52_7<=COLONCOLON)||(LA52_7>=EOL && LA52_7<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_7==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 7, input);

                    throw nvae;
                }
                }
                break;
            case NAMESPACE:
                {
                int LA52_8 = input.LA(2);

                if ( (LA52_8==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_8==EOF||(LA52_8>=IN && LA52_8<=INSTANCEOF)||(LA52_8>=RBRACE && LA52_8<=LPAREN)||LA52_8==LBRACK||(LA52_8>=DOT && LA52_8<=XOR)||(LA52_8>=LAND && LA52_8<=QUE)||(LA52_8>=ASSIGN && LA52_8<=DIVASS)||(LA52_8>=DOTDOT && LA52_8<=COLONCOLON)||(LA52_8>=EOL && LA52_8<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 8, input);

                    throw nvae;
                }
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
                int LA52_9 = input.LA(2);

                if ( (LA52_9==COLON) ) {
                    alt52=10;
                }
                else if ( (LA52_9==EOF||(LA52_9>=IN && LA52_9<=INSTANCEOF)||(LA52_9>=RBRACE && LA52_9<=LPAREN)||LA52_9==LBRACK||(LA52_9>=DOT && LA52_9<=XOR)||(LA52_9>=LAND && LA52_9<=QUE)||(LA52_9>=ASSIGN && LA52_9<=DIVASS)||(LA52_9>=DOTDOT && LA52_9<=COLONCOLON)||(LA52_9>=EOL && LA52_9<=MultiLineComment)) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 9, input);

                    throw nvae;
                }
                }
                break;
            case Identifier:
                {
                int LA52_10 = input.LA(2);

                if ( (LA52_10==EOF||(LA52_10>=IN && LA52_10<=INSTANCEOF)||(LA52_10>=RBRACE && LA52_10<=LPAREN)||LA52_10==LBRACK||(LA52_10>=DOT && LA52_10<=XOR)||(LA52_10>=LAND && LA52_10<=QUE)||(LA52_10>=ASSIGN && LA52_10<=DIVASS)||(LA52_10>=DOTDOT && LA52_10<=COLONCOLON)||(LA52_10>=EOL && LA52_10<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_10==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 10, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt52=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt52=5;
                }
                break;
            case CONTINUE:
                {
                alt52=6;
                }
                break;
            case BREAK:
                {
                alt52=7;
                }
                break;
            case RETURN:
                {
                alt52=8;
                }
                break;
            case WITH:
                {
                alt52=9;
                }
                break;
            case SWITCH:
                {
                alt52=11;
                }
                break;
            case THROW:
                {
                alt52=12;
                }
                break;
            case TRY:
                {
                alt52=13;
                }
                break;
            case CONST:
                {
                alt52=14;
                }
                break;
            case DEFAULT:
                {
                alt52=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1402:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // JS.g:1403:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5504);
                    variableStatement194=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement194.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1404:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5509);
                    emptyStatement195=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement195.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1405:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5514);
                    expressionStatement196=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement196.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1406:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5519);
                    ifStatement197=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement197.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1407:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5524);
                    iterationStatement198=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement198.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1408:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5529);
                    continueStatement199=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement199.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1409:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5534);
                    breakStatement200=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement200.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1410:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5539);
                    returnStatement201=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement201.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1411:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5544);
                    withStatement202=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement202.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1412:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5549);
                    labelledStatement203=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement203.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1413:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5554);
                    switchStatement204=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement204.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1414:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5559);
                    throwStatement205=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement205.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1415:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5564);
                    tryStatement206=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement206.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1416:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5569);
                    constStatement207=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement207.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1417:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5574);
                    namespaceStatement208=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement208.getTree());

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
    // JS.g:1422:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE210=null;
        statement_return statement209 = null;


        Object lb_tree=null;
        Object RBRACE210_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1423:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1423:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5589); 
            stream_LBRACE.add(lb);

            // JS.g:1423:14: ( statement )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=NULL && LA53_0<=BREAK)||(LA53_0>=CONTINUE && LA53_0<=DO)||(LA53_0>=FOR && LA53_0<=IF)||(LA53_0>=NEW && LA53_0<=LBRACE)||LA53_0==LPAREN||LA53_0==LBRACK||LA53_0==SEMIC||(LA53_0>=ADD && LA53_0<=SUB)||(LA53_0>=INC && LA53_0<=DEC)||(LA53_0>=NOT && LA53_0<=INV)||LA53_0==AT||(LA53_0>=XMLFragment && LA53_0<=XMLFragmentEnd)||LA53_0==StringLiteral||(LA53_0>=Identifier && LA53_0<=RegularExpressionLiteral)||(LA53_0>=DecimalLiteral && LA53_0<=HexIntegerLiteral)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JS.g:1423:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5591);
            	    statement209=statement();
            	    _fsp--;

            	    stream_statement.add(statement209.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            RBRACE210=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5594); 
            stream_RBRACE.add(RBRACE210);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1424:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1424:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1424:28: ( statement )*
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
    // JS.g:1431:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR211=null;
        Token COMMA213=null;
        variableDeclaration_return variableDeclaration212 = null;

        variableDeclaration_return variableDeclaration214 = null;

        semic_return semic215 = null;


        Object VAR211_tree=null;
        Object COMMA213_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1432:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1432:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR211=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5623); 
            stream_VAR.add(VAR211);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5625);
            variableDeclaration212=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration212.getTree());
            // JS.g:1432:28: ( COMMA variableDeclaration )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // JS.g:1432:30: COMMA variableDeclaration
            	    {
            	    COMMA213=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5629); 
            	    stream_COMMA.add(COMMA213);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5631);
            	    variableDeclaration214=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration214.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5636);
            semic215=semic();
            _fsp--;

            stream_semic.add(semic215.getTree());

            // AST REWRITE
            // elements: VAR, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1433:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1433:5: ^( VAR ( variableDeclaration )+ )
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
    // JS.g:1436:1: typeRef : ( identifier | );
    public final typeRef_return typeRef() throws RecognitionException {
        typeRef_return retval = new typeRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier216 = null;



        try {
            // JS.g:1437:2: ( identifier | )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==EACH||(LA55_0>=GET && LA55_0<=SET)||(LA55_0>=WXML && LA55_0<=CLASS)||(LA55_0>=DEBUGGER && LA55_0<=VOLATILE)||LA55_0==Identifier) ) {
                alt55=1;
            }
            else if ( (LA55_0==EOF||LA55_0==IN||(LA55_0>=LBRACE && LA55_0<=RBRACE)||LA55_0==RPAREN||(LA55_0>=SEMIC && LA55_0<=COMMA)||LA55_0==ASSIGN||(LA55_0>=EOL && LA55_0<=MultiLineComment)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1436:1: typeRef : ( identifier | );", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // JS.g:1437:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_typeRef5659);
                    identifier216=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier216.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1438:4: 
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
    // JS.g:1441:1: variableDeclaration : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON218=null;
        Token ASSIGN220=null;
        identifier_return identifier217 = null;

        typeRef_return typeRef219 = null;

        assignmentExpression_return assignmentExpression221 = null;


        Object COLON218_tree=null;
        Object ASSIGN220_tree=null;

        try {
            // JS.g:1442:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? )
            // JS.g:1442:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5675);
            identifier217=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier217.getTree(), root_0);
            // JS.g:1442:16: ({...}? => COLON typeRef )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COLON) && ( isTypeInformationEnabled() )) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // JS.g:1442:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON218=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclaration5683); 
                    COLON218_tree = (Object)adaptor.create(COLON218);
                    adaptor.addChild(root_0, COLON218_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclaration5685);
                    typeRef219=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef219.getTree());

                    }
                    break;

            }

            // JS.g:1442:69: ( ASSIGN assignmentExpression )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ASSIGN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // JS.g:1442:71: ASSIGN assignmentExpression
                    {
                    ASSIGN220=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5692); 
                    ASSIGN220_tree = (Object)adaptor.create(ASSIGN220);
                    adaptor.addChild(root_0, ASSIGN220_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5694);
                    assignmentExpression221=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression221.getTree());

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
    // JS.g:1445:1: variableDeclarationNoIn : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON223=null;
        Token ASSIGN225=null;
        identifier_return identifier222 = null;

        typeRef_return typeRef224 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn226 = null;


        Object COLON223_tree=null;
        Object ASSIGN225_tree=null;

        try {
            // JS.g:1446:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1446:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5709);
            identifier222=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier222.getTree(), root_0);
            // JS.g:1446:16: ({...}? => COLON typeRef )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==COLON) && ( isTypeInformationEnabled() )) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // JS.g:1446:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclarationNoIn", " isTypeInformationEnabled() ");
                    }
                    COLON223=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclarationNoIn5717); 
                    COLON223_tree = (Object)adaptor.create(COLON223);
                    adaptor.addChild(root_0, COLON223_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclarationNoIn5719);
                    typeRef224=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef224.getTree());

                    }
                    break;

            }

            // JS.g:1446:69: ( ASSIGN assignmentExpressionNoIn )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ASSIGN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // JS.g:1446:71: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN225=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5726); 
                    ASSIGN225_tree = (Object)adaptor.create(ASSIGN225);
                    adaptor.addChild(root_0, ASSIGN225_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5728);
                    assignmentExpressionNoIn226=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn226.getTree());

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
    // JS.g:1449:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST227=null;
        Token COMMA229=null;
        variableDeclaration_return variableDeclaration228 = null;

        variableDeclaration_return variableDeclaration230 = null;

        semic_return semic231 = null;


        Object CONST227_tree=null;
        Object COMMA229_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1450:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1450:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST227=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5743); 
            stream_CONST.add(CONST227);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5745);
            variableDeclaration228=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration228.getTree());
            // JS.g:1450:31: ( COMMA variableDeclaration )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // JS.g:1450:33: COMMA variableDeclaration
            	    {
            	    COMMA229=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5749); 
            	    stream_COMMA.add(COMMA229);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5751);
            	    variableDeclaration230=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration230.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5756);
            semic231=semic();
            _fsp--;

            stream_semic.add(semic231.getTree());

            // AST REWRITE
            // elements: CONST, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1451:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1451:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1458:1: emptyStatement : SEMIC -> EMPTY_STATEMENT[$SEMIC] ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC232=null;

        Object SEMIC232_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");

        try {
            // JS.g:1459:2: ( SEMIC -> EMPTY_STATEMENT[$SEMIC] )
            // JS.g:1459:4: SEMIC
            {
            SEMIC232=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5786); 
            stream_SEMIC.add(SEMIC232);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1459:10: -> EMPTY_STATEMENT[$SEMIC]
            {
                adaptor.addChild(root_0, adaptor.create(EMPTY_STATEMENT, SEMIC232));

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
    // JS.g:1472:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression233 = null;

        semic_return semic234 = null;



        try {
            // JS.g:1473:2: ( expression semic )
            // JS.g:1473:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5809);
            expression233=expression();
            _fsp--;

            adaptor.addChild(root_0, expression233.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5811);
            semic234=semic();
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
    // JS.g:1480:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF235=null;
        Token LPAREN236=null;
        Token RPAREN238=null;
        Token ELSE240=null;
        expression_return expression237 = null;

        statement_return statement239 = null;

        statement_return statement241 = null;


        Object IF235_tree=null;
        Object LPAREN236_tree=null;
        Object RPAREN238_tree=null;
        Object ELSE240_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1482:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1482:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF235=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5829); 
            stream_IF.add(IF235);

            LPAREN236=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5831); 
            stream_LPAREN.add(LPAREN236);

            pushFollow(FOLLOW_expression_in_ifStatement5833);
            expression237=expression();
            _fsp--;

            stream_expression.add(expression237.getTree());
            RPAREN238=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5835); 
            stream_RPAREN.add(RPAREN238);

            pushFollow(FOLLOW_statement_in_ifStatement5837);
            statement239=statement();
            _fsp--;

            stream_statement.add(statement239.getTree());
            // JS.g:1482:42: ({...}? ELSE statement )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ELSE) ) {
                int LA61_1 = input.LA(2);

                if ( ( input.LA(1) == ELSE ) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // JS.g:1482:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE240=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5843); 
                    stream_ELSE.add(ELSE240);

                    pushFollow(FOLLOW_statement_in_ifStatement5845);
                    statement241=statement();
                    _fsp--;

                    stream_statement.add(statement241.getTree());

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
            // 1483:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1483:5: ^( IF expression ( statement )+ )
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
    // JS.g:1490:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement242 = null;

        whileStatement_return whileStatement243 = null;

        forEachStatement_return forEachStatement244 = null;

        forStatement_return forStatement245 = null;



        try {
            // JS.g:1491:2: ( doStatement | whileStatement | forEachStatement | forStatement )
            int alt62=4;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt62=1;
                }
                break;
            case WHILE:
                {
                alt62=2;
                }
                break;
            case FOR:
                {
                int LA62_3 = input.LA(2);

                if ( (LA62_3==EACH) ) {
                    alt62=3;
                }
                else if ( (LA62_3==LPAREN) ) {
                    alt62=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1490:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 62, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1490:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // JS.g:1491:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5878);
                    doStatement242=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement242.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1492:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5883);
                    whileStatement243=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement243.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1493:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5888);
                    forEachStatement244=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement244.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1494:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5893);
                    forStatement245=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement245.getTree());

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
    // JS.g:1497:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO246=null;
        Token WHILE248=null;
        Token LPAREN249=null;
        Token RPAREN251=null;
        statement_return statement247 = null;

        expression_return expression250 = null;

        semic_return semic252 = null;


        Object DO246_tree=null;
        Object WHILE248_tree=null;
        Object LPAREN249_tree=null;
        Object RPAREN251_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1498:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1498:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO246=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5905); 
            stream_DO.add(DO246);

            pushFollow(FOLLOW_statement_in_doStatement5907);
            statement247=statement();
            _fsp--;

            stream_statement.add(statement247.getTree());
            WHILE248=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5909); 
            stream_WHILE.add(WHILE248);

            LPAREN249=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5911); 
            stream_LPAREN.add(LPAREN249);

            pushFollow(FOLLOW_expression_in_doStatement5913);
            expression250=expression();
            _fsp--;

            stream_expression.add(expression250.getTree());
            RPAREN251=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5915); 
            stream_RPAREN.add(RPAREN251);

            pushFollow(FOLLOW_semic_in_doStatement5917);
            semic252=semic();
            _fsp--;

            stream_semic.add(semic252.getTree());

            // AST REWRITE
            // elements: DO, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1499:2: -> ^( DO statement expression )
            {
                // JS.g:1499:5: ^( DO statement expression )
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
    // JS.g:1502:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE253=null;
        Token LPAREN254=null;
        Token RPAREN256=null;
        expression_return expression255 = null;

        statement_return statement257 = null;


        Object WHILE253_tree=null;
        Object LPAREN254_tree=null;
        Object RPAREN256_tree=null;

        try {
            // JS.g:1503:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1503:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE253=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5942); 
            WHILE253_tree = (Object)adaptor.create(WHILE253);
            root_0 = (Object)adaptor.becomeRoot(WHILE253_tree, root_0);

            LPAREN254=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5945); 
            pushFollow(FOLLOW_expression_in_whileStatement5948);
            expression255=expression();
            _fsp--;

            adaptor.addChild(root_0, expression255.getTree());
            RPAREN256=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5950); 
            pushFollow(FOLLOW_statement_in_whileStatement5953);
            statement257=statement();
            _fsp--;

            adaptor.addChild(root_0, statement257.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1548:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH258=null;
        Token LPAREN259=null;
        Token RPAREN261=null;
        forEachControl_return forEachControl260 = null;

        statement_return statement262 = null;


        Object forKeyword_tree=null;
        Object EACH258_tree=null;
        Object LPAREN259_tree=null;
        Object RPAREN261_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1549:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1549:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5970); 
            stream_FOR.add(forKeyword);

            EACH258=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5972); 
            stream_EACH.add(EACH258);

            LPAREN259=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5974); 
            stream_LPAREN.add(LPAREN259);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5976);
            forEachControl260=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl260.getTree());
            RPAREN261=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5978); 
            stream_RPAREN.add(RPAREN261);

            pushFollow(FOLLOW_statement_in_forEachStatement5980);
            statement262=statement();
            _fsp--;

            stream_statement.add(statement262.getTree());

            // AST REWRITE
            // elements: statement, forEachControl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1550:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1550:7: ^( FOREACH[$forKeyword] forEachControl statement )
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
    // JS.g:1553:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar263 = null;

        forControlExpression_return forControlExpression264 = null;



        try {
            // JS.g:1554:3: ( forControlVar | forControlExpression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==VAR) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||(LA63_0>=EACH && LA63_0<=FUNCTION)||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||(LA63_0>=GET && LA63_0<=CLASS)||(LA63_0>=DEBUGGER && LA63_0<=LBRACE)||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||LA63_0==AT||(LA63_0>=XMLFragment && LA63_0<=XMLFragmentEnd)||LA63_0==StringLiteral||(LA63_0>=Identifier && LA63_0<=RegularExpressionLiteral)||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1553:1: forEachControl : ( forControlVar | forControlExpression );", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // JS.g:1554:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl6008);
                    forControlVar263=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar263.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1555:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl6014);
                    forControlExpression264=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression264.getTree());

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
    // JS.g:1558:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR265=null;
        Token LPAREN266=null;
        Token RPAREN268=null;
        forControl_return forControl267 = null;

        statement_return statement269 = null;


        Object FOR265_tree=null;
        Object LPAREN266_tree=null;
        Object RPAREN268_tree=null;

        try {
            // JS.g:1559:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1559:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR265=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement6026); 
            FOR265_tree = (Object)adaptor.create(FOR265);
            root_0 = (Object)adaptor.becomeRoot(FOR265_tree, root_0);

            LPAREN266=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement6029); 
            pushFollow(FOLLOW_forControl_in_forStatement6032);
            forControl267=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl267.getTree());
            RPAREN268=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement6034); 
            pushFollow(FOLLOW_statement_in_forStatement6037);
            statement269=statement();
            _fsp--;

            adaptor.addChild(root_0, statement269.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1562:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar270 = null;

        forControlExpression_return forControlExpression271 = null;

        forControlSemic_return forControlSemic272 = null;



        try {
            // JS.g:1563:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt64=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt64=1;
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
                alt64=2;
                }
                break;
            case SEMIC:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1562:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // JS.g:1563:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl6048);
                    forControlVar270=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar270.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1564:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl6053);
                    forControlExpression271=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression271.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1565:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl6058);
                    forControlSemic272=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic272.getTree());

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
    // JS.g:1568:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR273=null;
        Token IN275=null;
        Token COMMA277=null;
        Token SEMIC279=null;
        Token SEMIC280=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn274 = null;

        expression_return expression276 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn278 = null;


        Object VAR273_tree=null;
        Object IN275_tree=null;
        Object COMMA277_tree=null;
        Object SEMIC279_tree=null;
        Object SEMIC280_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1569:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1569:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR273=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar6069); 
            stream_VAR.add(VAR273);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6071);
            variableDeclarationNoIn274=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn274.getTree());
            // JS.g:1570:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==IN) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=SEMIC && LA68_0<=COMMA)) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1570:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // JS.g:1571:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1571:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1572:4: IN expression
                    {
                    IN275=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar6083); 
                    stream_IN.add(IN275);

                    pushFollow(FOLLOW_expression_in_forControlVar6085);
                    expression276=expression();
                    _fsp--;

                    stream_expression.add(expression276.getTree());

                    // AST REWRITE
                    // elements: expression, VAR, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1573:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1573:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1573:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1573:51: ^( EXPR expression )
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
                    // JS.g:1576:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1576:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1577:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1577:4: ( COMMA variableDeclarationNoIn )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // JS.g:1577:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA277=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar6131); 
                    	    stream_COMMA.add(COMMA277);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6133);
                    	    variableDeclarationNoIn278=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn278.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    SEMIC279=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6138); 
                    stream_SEMIC.add(SEMIC279);

                    // JS.g:1577:48: (ex1= expression )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==DELETE||(LA66_0>=EACH && LA66_0<=FUNCTION)||LA66_0==NEW||LA66_0==THIS||LA66_0==TYPEOF||LA66_0==VOID||(LA66_0>=GET && LA66_0<=CLASS)||(LA66_0>=DEBUGGER && LA66_0<=LBRACE)||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||LA66_0==AT||(LA66_0>=XMLFragment && LA66_0<=XMLFragmentEnd)||LA66_0==StringLiteral||(LA66_0>=Identifier && LA66_0<=RegularExpressionLiteral)||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // JS.g:1577:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6142);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC280=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6145); 
                    stream_SEMIC.add(SEMIC280);

                    // JS.g:1577:70: (ex2= expression )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||(LA67_0>=EACH && LA67_0<=FUNCTION)||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||(LA67_0>=GET && LA67_0<=CLASS)||(LA67_0>=DEBUGGER && LA67_0<=LBRACE)||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||LA67_0==AT||(LA67_0>=XMLFragment && LA67_0<=XMLFragmentEnd)||LA67_0==StringLiteral||(LA67_0>=Identifier && LA67_0<=RegularExpressionLiteral)||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // JS.g:1577:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6149);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: VAR, ex2, variableDeclarationNoIn, ex1
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1578:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1578:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1578:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1578:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1578:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1578:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1578:76: ( $ex2)?
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
    // JS.g:1583:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN281=null;
        Token SEMIC282=null;
        Token SEMIC283=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN281_tree=null;
        Object SEMIC282_tree=null;
        Object SEMIC283_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");
        
        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1588:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1588:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6215);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1589:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==IN) ) {
                alt71=1;
            }
            else if ( (LA71_0==SEMIC) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1589:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1590:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1590:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1591:4: IN ex2= expression
                    {
                    IN281=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression6230); 
                    stream_IN.add(IN281);

                    pushFollow(FOLLOW_expression_in_forControlExpression6234);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

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
                    // 1592:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1592:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1592:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1592:33: ^( EXPR $ex2)
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
                    // JS.g:1595:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1595:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1596:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC282=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6280); 
                    stream_SEMIC.add(SEMIC282);

                    // JS.g:1596:13: (ex2= expression )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==DELETE||(LA69_0>=EACH && LA69_0<=FUNCTION)||LA69_0==NEW||LA69_0==THIS||LA69_0==TYPEOF||LA69_0==VOID||(LA69_0>=GET && LA69_0<=CLASS)||(LA69_0>=DEBUGGER && LA69_0<=LBRACE)||LA69_0==LPAREN||LA69_0==LBRACK||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||LA69_0==AT||(LA69_0>=XMLFragment && LA69_0<=XMLFragmentEnd)||LA69_0==StringLiteral||(LA69_0>=Identifier && LA69_0<=RegularExpressionLiteral)||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // JS.g:1596:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6284);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC283=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6287); 
                    stream_SEMIC.add(SEMIC283);

                    // JS.g:1596:35: (ex3= expression )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=NULL && LA70_0<=FALSE)||LA70_0==DELETE||(LA70_0>=EACH && LA70_0<=FUNCTION)||LA70_0==NEW||LA70_0==THIS||LA70_0==TYPEOF||LA70_0==VOID||(LA70_0>=GET && LA70_0<=CLASS)||(LA70_0>=DEBUGGER && LA70_0<=LBRACE)||LA70_0==LPAREN||LA70_0==LBRACK||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||LA70_0==AT||(LA70_0>=XMLFragment && LA70_0<=XMLFragmentEnd)||LA70_0==StringLiteral||(LA70_0>=Identifier && LA70_0<=RegularExpressionLiteral)||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // JS.g:1596:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6291);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex1, ex3, ex2
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
                    // 1597:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1597:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1597:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1597:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1597:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1597:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1597:57: ( $ex3)?
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
    // JS.g:1602:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC284=null;
        Token SEMIC285=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC284_tree=null;
        Object SEMIC285_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1603:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1603:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC284=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6350); 
            stream_SEMIC.add(SEMIC284);

            // JS.g:1603:13: (ex1= expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=NULL && LA72_0<=FALSE)||LA72_0==DELETE||(LA72_0>=EACH && LA72_0<=FUNCTION)||LA72_0==NEW||LA72_0==THIS||LA72_0==TYPEOF||LA72_0==VOID||(LA72_0>=GET && LA72_0<=CLASS)||(LA72_0>=DEBUGGER && LA72_0<=LBRACE)||LA72_0==LPAREN||LA72_0==LBRACK||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||LA72_0==AT||(LA72_0>=XMLFragment && LA72_0<=XMLFragmentEnd)||LA72_0==StringLiteral||(LA72_0>=Identifier && LA72_0<=RegularExpressionLiteral)||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1603:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6354);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC285=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6357); 
            stream_SEMIC.add(SEMIC285);

            // JS.g:1603:35: (ex2= expression )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=NULL && LA73_0<=FALSE)||LA73_0==DELETE||(LA73_0>=EACH && LA73_0<=FUNCTION)||LA73_0==NEW||LA73_0==THIS||LA73_0==TYPEOF||LA73_0==VOID||(LA73_0>=GET && LA73_0<=CLASS)||(LA73_0>=DEBUGGER && LA73_0<=LBRACE)||LA73_0==LPAREN||LA73_0==LBRACK||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||LA73_0==AT||(LA73_0>=XMLFragment && LA73_0<=XMLFragmentEnd)||LA73_0==StringLiteral||(LA73_0>=Identifier && LA73_0<=RegularExpressionLiteral)||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1603:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6361);
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
            // 1604:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1604:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1604:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1604:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1604:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1604:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1604:50: ( $ex2)?
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
    // JS.g:1616:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE286=null;
        Token Identifier287=null;
        semic_return semic288 = null;


        Object CONTINUE286_tree=null;
        Object Identifier287_tree=null;

        try {
            // JS.g:1617:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1617:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE286=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6415); 
            CONTINUE286_tree = (Object)adaptor.create(CONTINUE286);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE286_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1617:67: ( Identifier )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Identifier) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1617:67: Identifier
                    {
                    Identifier287=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6420); 
                    Identifier287_tree = (Object)adaptor.create(Identifier287);
                    adaptor.addChild(root_0, Identifier287_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6423);
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
    // $ANTLR end continueStatement

    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start breakStatement
    // JS.g:1629:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK289=null;
        Token Identifier290=null;
        semic_return semic291 = null;


        Object BREAK289_tree=null;
        Object Identifier290_tree=null;

        try {
            // JS.g:1630:2: ( BREAK ( Identifier )? semic )
            // JS.g:1630:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK289=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6442); 
            BREAK289_tree = (Object)adaptor.create(BREAK289);
            root_0 = (Object)adaptor.becomeRoot(BREAK289_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1630:64: ( Identifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Identifier) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1630:64: Identifier
                    {
                    Identifier290=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6447); 
                    Identifier290_tree = (Object)adaptor.create(Identifier290);
                    adaptor.addChild(root_0, Identifier290_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6450);
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
    // $ANTLR end breakStatement

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start returnStatement
    // JS.g:1650:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN292=null;
        expression_return expression293 = null;

        semic_return semic294 = null;


        Object RETURN292_tree=null;

        try {
            // JS.g:1651:2: ( RETURN ( expression )? semic )
            // JS.g:1651:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN292=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6469); 
            RETURN292_tree = (Object)adaptor.create(RETURN292);
            root_0 = (Object)adaptor.becomeRoot(RETURN292_tree, root_0);

             promoteEOL(null); 
            // JS.g:1651:34: ( expression )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=NULL && LA76_0<=FALSE)||LA76_0==DELETE||(LA76_0>=EACH && LA76_0<=FUNCTION)||LA76_0==NEW||LA76_0==THIS||LA76_0==TYPEOF||LA76_0==VOID||(LA76_0>=GET && LA76_0<=CLASS)||(LA76_0>=DEBUGGER && LA76_0<=LBRACE)||LA76_0==LPAREN||LA76_0==LBRACK||(LA76_0>=ADD && LA76_0<=SUB)||(LA76_0>=INC && LA76_0<=DEC)||(LA76_0>=NOT && LA76_0<=INV)||LA76_0==AT||(LA76_0>=XMLFragment && LA76_0<=XMLFragmentEnd)||LA76_0==StringLiteral||(LA76_0>=Identifier && LA76_0<=RegularExpressionLiteral)||(LA76_0>=DecimalLiteral && LA76_0<=HexIntegerLiteral)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // JS.g:1651:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6474);
                    expression293=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression293.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6477);
            semic294=semic();
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
    // JS.g:1658:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH295=null;
        Token LPAREN296=null;
        Token RPAREN298=null;
        expression_return expression297 = null;

        statement_return statement299 = null;


        Object WITH295_tree=null;
        Object LPAREN296_tree=null;
        Object RPAREN298_tree=null;

        try {
            // JS.g:1659:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1659:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH295=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6494); 
            WITH295_tree = (Object)adaptor.create(WITH295);
            root_0 = (Object)adaptor.becomeRoot(WITH295_tree, root_0);

            LPAREN296=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6497); 
            pushFollow(FOLLOW_expression_in_withStatement6500);
            expression297=expression();
            _fsp--;

            adaptor.addChild(root_0, expression297.getTree());
            RPAREN298=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6502); 
            pushFollow(FOLLOW_statement_in_withStatement6505);
            statement299=statement();
            _fsp--;

            adaptor.addChild(root_0, statement299.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1666:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH300=null;
        Token LPAREN301=null;
        Token RPAREN303=null;
        Token LBRACE304=null;
        Token RBRACE307=null;
        expression_return expression302 = null;

        defaultClause_return defaultClause305 = null;

        caseClause_return caseClause306 = null;


        Object SWITCH300_tree=null;
        Object LPAREN301_tree=null;
        Object RPAREN303_tree=null;
        Object LBRACE304_tree=null;
        Object RBRACE307_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");
        try {
            // JS.g:1667:2: ( SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) )
            // JS.g:1667:4: SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE
            {
            SWITCH300=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6521); 
            stream_SWITCH.add(SWITCH300);

            LPAREN301=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6523); 
            stream_LPAREN.add(LPAREN301);

            pushFollow(FOLLOW_expression_in_switchStatement6525);
            expression302=expression();
            _fsp--;

            stream_expression.add(expression302.getTree());
            RPAREN303=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6527); 
            stream_RPAREN.add(RPAREN303);

            LBRACE304=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6529); 
            stream_LBRACE.add(LBRACE304);

            // JS.g:1667:43: ( defaultClause | caseClause )*
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DEFAULT) ) {
                    alt77=1;
                }
                else if ( (LA77_0==CASE) ) {
                    alt77=2;
                }


                switch (alt77) {
            	case 1 :
            	    // JS.g:1667:45: defaultClause
            	    {
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6533);
            	    defaultClause305=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause305.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1667:61: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6537);
            	    caseClause306=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause306.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            RBRACE307=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6542); 
            stream_RBRACE.add(RBRACE307);


            // AST REWRITE
            // elements: defaultClause, caseClause, SWITCH, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1668:2: -> ^( SWITCH expression ( defaultClause )* ( caseClause )* )
            {
                // JS.g:1668:5: ^( SWITCH expression ( defaultClause )* ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1668:26: ( defaultClause )*
                while ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1668:41: ( caseClause )*
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
    // JS.g:1671:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE308=null;
        Token COLON310=null;
        expression_return expression309 = null;

        statement_return statement311 = null;


        Object CASE308_tree=null;
        Object COLON310_tree=null;

        try {
            // JS.g:1672:2: ( CASE expression COLON ( statement )* )
            // JS.g:1672:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE308=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6570); 
            CASE308_tree = (Object)adaptor.create(CASE308);
            root_0 = (Object)adaptor.becomeRoot(CASE308_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6573);
            expression309=expression();
            _fsp--;

            adaptor.addChild(root_0, expression309.getTree());
            COLON310=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6575); 
            // JS.g:1672:28: ( statement )*
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
                else if ( ((LA78_0>=NULL && LA78_0<=BREAK)||LA78_0==CONTINUE||(LA78_0>=DELETE && LA78_0<=DO)||(LA78_0>=FOR && LA78_0<=IF)||(LA78_0>=NEW && LA78_0<=LBRACE)||LA78_0==LPAREN||LA78_0==LBRACK||LA78_0==SEMIC||(LA78_0>=ADD && LA78_0<=SUB)||(LA78_0>=INC && LA78_0<=DEC)||(LA78_0>=NOT && LA78_0<=INV)||LA78_0==AT||(LA78_0>=XMLFragment && LA78_0<=XMLFragmentEnd)||LA78_0==StringLiteral||(LA78_0>=Identifier && LA78_0<=RegularExpressionLiteral)||(LA78_0>=DecimalLiteral && LA78_0<=HexIntegerLiteral)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JS.g:1672:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6578);
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
    // $ANTLR end caseClause

    public static class defaultClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start defaultClause
    // JS.g:1675:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT312=null;
        Token COLON313=null;
        statement_return statement314 = null;


        Object DEFAULT312_tree=null;
        Object COLON313_tree=null;

        try {
            // JS.g:1676:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1676:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT312=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6591); 
            DEFAULT312_tree = (Object)adaptor.create(DEFAULT312);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT312_tree, root_0);

            COLON313=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6594); 
            // JS.g:1676:20: ( statement )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==DEFAULT) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==WXML) ) {
                        alt79=1;
                    }


                }
                else if ( ((LA79_0>=NULL && LA79_0<=BREAK)||LA79_0==CONTINUE||(LA79_0>=DELETE && LA79_0<=DO)||(LA79_0>=FOR && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=LBRACE)||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||LA79_0==AT||(LA79_0>=XMLFragment && LA79_0<=XMLFragmentEnd)||LA79_0==StringLiteral||(LA79_0>=Identifier && LA79_0<=RegularExpressionLiteral)||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JS.g:1676:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6597);
            	    statement314=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement314.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
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
    // JS.g:1683:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON316=null;
        identifier_return identifier315 = null;

        statement_return statement317 = null;


        Object COLON316_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1684:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1684:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6614);
            identifier315=identifier();
            _fsp--;

            stream_identifier.add(identifier315.getTree());
            COLON316=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6616); 
            stream_COLON.add(COLON316);

            pushFollow(FOLLOW_statement_in_labelledStatement6618);
            statement317=statement();
            _fsp--;

            stream_statement.add(statement317.getTree());

            // AST REWRITE
            // elements: identifier, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1685:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1685:5: ^( LABELLED identifier statement )
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
    // JS.g:1707:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW318=null;
        expression_return expression319 = null;

        semic_return semic320 = null;


        Object THROW318_tree=null;

        try {
            // JS.g:1708:2: ( THROW expression semic )
            // JS.g:1708:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW318=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6649); 
            THROW318_tree = (Object)adaptor.create(THROW318);
            root_0 = (Object)adaptor.becomeRoot(THROW318_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6654);
            expression319=expression();
            _fsp--;

            adaptor.addChild(root_0, expression319.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6656);
            semic320=semic();
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
    // JS.g:1715:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY321=null;
        block_return block322 = null;

        catchClause_return catchClause323 = null;

        finallyClause_return finallyClause324 = null;

        finallyClause_return finallyClause325 = null;


        Object TRY321_tree=null;

        try {
            // JS.g:1716:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1716:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY321=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6673); 
            TRY321_tree = (Object)adaptor.create(TRY321);
            root_0 = (Object)adaptor.becomeRoot(TRY321_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6676);
            block322=block();
            _fsp--;

            adaptor.addChild(root_0, block322.getTree());
            // JS.g:1716:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==CATCH) ) {
                alt82=1;
            }
            else if ( (LA82_0==FINALLY) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1716:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // JS.g:1716:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1716:17: ( catchClause )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==CATCH) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // JS.g:1716:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6680);
                    	    catchClause323=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause323.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);

                    // JS.g:1716:30: ( finallyClause )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==FINALLY) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // JS.g:1716:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6683);
                            finallyClause324=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause324.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1716:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6688);
                    finallyClause325=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause325.getTree());

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
    // JS.g:1719:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH326=null;
        Token LPAREN327=null;
        Token RPAREN330=null;
        identifier_return identifier328 = null;

        catchFilter_return catchFilter329 = null;

        block_return block331 = null;


        Object CATCH326_tree=null;
        Object LPAREN327_tree=null;
        Object RPAREN330_tree=null;

        try {
            // JS.g:1720:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1720:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH326=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6702); 
            CATCH326_tree = (Object)adaptor.create(CATCH326);
            root_0 = (Object)adaptor.becomeRoot(CATCH326_tree, root_0);

            LPAREN327=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6705); 
            pushFollow(FOLLOW_identifier_in_catchClause6708);
            identifier328=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier328.getTree());
            // JS.g:1720:30: ( catchFilter )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IF) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // JS.g:1720:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6710);
                    catchFilter329=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter329.getTree());

                    }
                    break;

            }

            RPAREN330=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6713); 
            pushFollow(FOLLOW_block_in_catchClause6716);
            block331=block();
            _fsp--;

            adaptor.addChild(root_0, block331.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1723:1: catchFilter : IF expression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF332=null;
        expression_return expression333 = null;


        Object IF332_tree=null;

        try {
            // JS.g:1724:2: ( IF expression )
            // JS.g:1724:4: IF expression
            {
            root_0 = (Object)adaptor.nil();

            IF332=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6727); 
            IF332_tree = (Object)adaptor.create(IF332);
            adaptor.addChild(root_0, IF332_tree);

            pushFollow(FOLLOW_expression_in_catchFilter6729);
            expression333=expression();
            _fsp--;

            adaptor.addChild(root_0, expression333.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1727:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY334=null;
        block_return block335 = null;


        Object FINALLY334_tree=null;

        try {
            // JS.g:1728:2: ( FINALLY block )
            // JS.g:1728:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY334=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6741); 
            FINALLY334_tree = (Object)adaptor.create(FINALLY334);
            root_0 = (Object)adaptor.becomeRoot(FINALLY334_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6744);
            block335=block();
            _fsp--;

            adaptor.addChild(root_0, block335.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1741:1: functionDeclaration : function= FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList ( COLON )? ( typeRef )? functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token function=null;
        Token COLON337=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList336 = null;

        typeRef_return typeRef338 = null;

        functionBody_return functionBody339 = null;


        Object function_tree=null;
        Object COLON337_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1742:2: (function= FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList ( COLON )? ( typeRef )? functionBody ) )
            // JS.g:1742:4: function= FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            function=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6767); 
            stream_FUNCTION.add(function);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6771);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6773);
            formalParameterList336=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList336.getTree());
            // JS.g:1742:58: ({...}? => COLON typeRef )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==COLON) && ( isTypeInformationEnabled() )) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // JS.g:1742:60: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON337=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionDeclaration6780); 
                    stream_COLON.add(COLON337);

                    pushFollow(FOLLOW_typeRef_in_functionDeclaration6782);
                    typeRef338=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef338.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionDeclaration6787);
            functionBody339=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody339.getTree());

            // AST REWRITE
            // elements: typeRef, COLON, functionBody, name, formalParameterList
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1743:2: -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList ( COLON )? ( typeRef )? functionBody )
            {
                // JS.g:1743:5: ^( FUNCTION_DECLARATION[$function] $name formalParameterList ( COLON )? ( typeRef )? functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCTION_DECLARATION, function), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1743:66: ( COLON )?
                if ( stream_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_COLON.next());

                }
                stream_COLON.reset();
                // JS.g:1743:73: ( typeRef )?
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
    // JS.g:1746:1: functionExpression : FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList ( COLON )? ( typeRef )? functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION340=null;
        Token COLON342=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList341 = null;

        typeRef_return typeRef343 = null;

        functionBody_return functionBody344 = null;


        Object FUNCTION340_tree=null;
        Object COLON342_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1747:2: ( FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList ( COLON )? ( typeRef )? functionBody ) )
            // JS.g:1747:4: FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION340=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6821); 
            stream_FUNCTION.add(FUNCTION340);

            // JS.g:1747:17: (name= identifier )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EACH||(LA85_0>=GET && LA85_0<=SET)||(LA85_0>=WXML && LA85_0<=CLASS)||(LA85_0>=DEBUGGER && LA85_0<=VOLATILE)||LA85_0==Identifier) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // JS.g:1747:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6825);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6828);
            formalParameterList341=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList341.getTree());
            // JS.g:1747:50: ({...}? => COLON typeRef )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==COLON) && ( isTypeInformationEnabled() )) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // JS.g:1747:52: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionExpression", " isTypeInformationEnabled() ");
                    }
                    COLON342=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionExpression6835); 
                    stream_COLON.add(COLON342);

                    pushFollow(FOLLOW_typeRef_in_functionExpression6837);
                    typeRef343=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef343.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionExpression6842);
            functionBody344=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody344.getTree());

            // AST REWRITE
            // elements: typeRef, FUNCTION, name, formalParameterList, COLON, functionBody
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1748:2: -> ^( FUNCTION ( $name)? formalParameterList ( COLON )? ( typeRef )? functionBody )
            {
                // JS.g:1748:5: ^( FUNCTION ( $name)? formalParameterList ( COLON )? ( typeRef )? functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1748:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.next());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1748:44: ( COLON )?
                if ( stream_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_COLON.next());

                }
                stream_COLON.reset();
                // JS.g:1748:51: ( typeRef )?
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
    // $ANTLR end functionExpression

    public static class formalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameter
    // JS.g:1751:1: formalParameter : identifier ({...}? => COLON typeRef )? ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON346=null;
        identifier_return identifier345 = null;

        typeRef_return typeRef347 = null;


        Object COLON346_tree=null;

        try {
            // JS.g:1752:2: ( identifier ({...}? => COLON typeRef )? )
            // JS.g:1752:4: identifier ({...}? => COLON typeRef )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameter6876);
            identifier345=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier345.getTree(), root_0);
            // JS.g:1752:16: ({...}? => COLON typeRef )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==COLON) && ( isTypeInformationEnabled() )) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // JS.g:1752:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "formalParameter", " isTypeInformationEnabled() ");
                    }
                    COLON346=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_formalParameter6884); 
                    COLON346_tree = (Object)adaptor.create(COLON346);
                    adaptor.addChild(root_0, COLON346_tree);

                    pushFollow(FOLLOW_typeRef_in_formalParameter6886);
                    typeRef347=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef347.getTree());

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
    // JS.g:1755:1: formalParameterList : LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN348=null;
        Token COMMA350=null;
        Token RPAREN352=null;
        formalParameter_return formalParameter349 = null;

        formalParameter_return formalParameter351 = null;


        Object LPAREN348_tree=null;
        Object COMMA350_tree=null;
        Object RPAREN352_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // JS.g:1756:2: ( LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) )
            // JS.g:1756:4: LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN
            {
            LPAREN348=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6900); 
            stream_LPAREN.add(LPAREN348);

            // JS.g:1756:11: ( formalParameter ( COMMA formalParameter )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==EACH||(LA89_0>=GET && LA89_0<=SET)||(LA89_0>=WXML && LA89_0<=CLASS)||(LA89_0>=DEBUGGER && LA89_0<=VOLATILE)||LA89_0==Identifier) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // JS.g:1756:13: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_formalParameterList6904);
                    formalParameter349=formalParameter();
                    _fsp--;

                    stream_formalParameter.add(formalParameter349.getTree());
                    // JS.g:1756:29: ( COMMA formalParameter )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMA) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // JS.g:1756:31: COMMA formalParameter
                    	    {
                    	    COMMA350=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6908); 
                    	    stream_COMMA.add(COMMA350);

                    	    pushFollow(FOLLOW_formalParameter_in_formalParameterList6910);
                    	    formalParameter351=formalParameter();
                    	    _fsp--;

                    	    stream_formalParameter.add(formalParameter351.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN352=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6918); 
            stream_RPAREN.add(RPAREN352);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1757:2: -> ^( ARGUMENTS ( formalParameter )* )
            {
                // JS.g:1757:5: ^( ARGUMENTS ( formalParameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // JS.g:1757:18: ( formalParameter )*
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
    // JS.g:1760:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE354=null;
        sourceElement_return sourceElement353 = null;


        Object lb_tree=null;
        Object RBRACE354_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
         pushState(JSParserRule.FUNCTION_BODY); 
        try {
            // JS.g:1762:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1762:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6948); 
            stream_LBRACE.add(lb);

            // JS.g:1762:14: ( sourceElement )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=NULL && LA90_0<=BREAK)||(LA90_0>=CONTINUE && LA90_0<=DO)||(LA90_0>=FOR && LA90_0<=IF)||(LA90_0>=NEW && LA90_0<=LBRACE)||LA90_0==LPAREN||LA90_0==LBRACK||LA90_0==SEMIC||(LA90_0>=ADD && LA90_0<=SUB)||(LA90_0>=INC && LA90_0<=DEC)||(LA90_0>=NOT && LA90_0<=INV)||LA90_0==AT||(LA90_0>=XMLFragment && LA90_0<=XMLFragmentEnd)||LA90_0==StringLiteral||(LA90_0>=Identifier && LA90_0<=RegularExpressionLiteral)||(LA90_0>=DecimalLiteral && LA90_0<=HexIntegerLiteral)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // JS.g:1762:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6950);
            	    sourceElement353=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement353.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            RBRACE354=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6953); 
            stream_RBRACE.add(RBRACE354);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1763:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1763:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1763:28: ( sourceElement )*
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
    // JS.g:1772:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN355=null;
        Token RPAREN356=null;
        identifier_return name = null;

        functionBody_return functionBody357 = null;


        Object get_tree=null;
        Object LPAREN355_tree=null;
        Object RPAREN356_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1773:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) )
            // JS.g:1773:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6990); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6994);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN355=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6996); 
            stream_LPAREN.add(LPAREN355);

            RPAREN356=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6998); 
            stream_RPAREN.add(RPAREN356);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration7000);
            functionBody357=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody357.getTree());

            // AST REWRITE
            // elements: identifier, functionBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1774:4: -> ^( GETTER[$get] identifier functionBody )
            {
                // JS.g:1774:7: ^( GETTER[$get] identifier functionBody )
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
    // JS.g:1777:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN358=null;
        Token RPAREN359=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody360 = null;


        Object set_tree=null;
        Object LPAREN358_tree=null;
        Object RPAREN359_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1778:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) )
            // JS.g:1778:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration7031); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7035);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN358=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration7037); 
            stream_LPAREN.add(LPAREN358);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7041);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN359=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration7043); 
            stream_RPAREN.add(RPAREN359);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration7045);
            functionBody360=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody360.getTree());

            // AST REWRITE
            // elements: functionBody, name, param
            // token labels: 
            // rule labels: retval, param, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"token param",param!=null?param.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1779:5: -> ^( SETTER[$set] $name $param functionBody )
            {
                // JS.g:1779:8: ^( SETTER[$set] $name $param functionBody )
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
    // JS.g:1786:1: program : sourceElementSync ( sourceElement sourceElementSync )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF364=null;
        sourceElementSync_return sourceElementSync361 = null;

        sourceElement_return sourceElement362 = null;

        sourceElementSync_return sourceElementSync363 = null;


        Object EOF364_tree=null;

         pushState(JSParserRule.PROGRAM); 
        try {
            // JS.g:1788:2: ( sourceElementSync ( sourceElement sourceElementSync )* EOF )
            // JS.g:1788:4: sourceElementSync ( sourceElement sourceElementSync )* EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sourceElementSync_in_program7086);
            sourceElementSync361=sourceElementSync();
            _fsp--;

            adaptor.addChild(root_0, sourceElementSync361.getTree());
            // JS.g:1788:22: ( sourceElement sourceElementSync )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=NULL && LA91_0<=BREAK)||(LA91_0>=CONTINUE && LA91_0<=DO)||(LA91_0>=FOR && LA91_0<=IF)||(LA91_0>=NEW && LA91_0<=LBRACE)||LA91_0==LPAREN||LA91_0==LBRACK||LA91_0==SEMIC||(LA91_0>=ADD && LA91_0<=SUB)||(LA91_0>=INC && LA91_0<=DEC)||(LA91_0>=NOT && LA91_0<=INV)||LA91_0==AT||(LA91_0>=XMLFragment && LA91_0<=XMLFragmentEnd)||LA91_0==StringLiteral||(LA91_0>=Identifier && LA91_0<=RegularExpressionLiteral)||(LA91_0>=DecimalLiteral && LA91_0<=HexIntegerLiteral)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // JS.g:1788:23: sourceElement sourceElementSync
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program7089);
            	    sourceElement362=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement362.getTree());
            	    pushFollow(FOLLOW_sourceElementSync_in_program7091);
            	    sourceElementSync363=sourceElementSync();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElementSync363.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            EOF364=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program7095); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1791:1: sourceElementSync : ;
    public final sourceElementSync_return sourceElementSync() throws RecognitionException {
        sourceElementSync_return retval = new sourceElementSync_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        
        	syncToSet();

        try {
            // JS.g:1795:2: ()
            // JS.g:1796:3: 
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
    // JS.g:1803:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration365 = null;

        statement_return statement366 = null;



        try {
            // JS.g:1808:2: ({...}? functionDeclaration | statement )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==FUNCTION) ) {
                int LA92_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt92=1;
                }
                else if ( (true) ) {
                    alt92=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1803:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 92, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA92_0>=NULL && LA92_0<=BREAK)||(LA92_0>=CONTINUE && LA92_0<=DO)||(LA92_0>=FOR && LA92_0<=EACH)||LA92_0==IF||(LA92_0>=NEW && LA92_0<=LBRACE)||LA92_0==LPAREN||LA92_0==LBRACK||LA92_0==SEMIC||(LA92_0>=ADD && LA92_0<=SUB)||(LA92_0>=INC && LA92_0<=DEC)||(LA92_0>=NOT && LA92_0<=INV)||LA92_0==AT||(LA92_0>=XMLFragment && LA92_0<=XMLFragmentEnd)||LA92_0==StringLiteral||(LA92_0>=Identifier && LA92_0<=RegularExpressionLiteral)||(LA92_0>=DecimalLiteral && LA92_0<=HexIntegerLiteral)) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1803:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // JS.g:1808:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement7140);
                    functionDeclaration365=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration365.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1809:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement7145);
                    statement366=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement366.getTree());

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
    public static final BitSet FOLLOW_xmlLiteral_in_literal2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_xmlLiteral2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_xmlLiteral2888 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_xmlLiteral2890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_xmlLiteral2892 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_xmlLiteral2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_primaryExpression3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3744 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3773 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC026BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3781 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC026BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3852 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000000005FL,0x0384100000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3860 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000000001FL,0x0384100000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3925 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3927 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_propertyName3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression4007 = new BitSet(new long[]{0xFFFFF7F602460070L,0x03200000000002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_newExpressionTail_in_newExpression4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments4023 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC003BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments4031 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4079 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression4100 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4125 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4129 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4152 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4156 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4181 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4183 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4202 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4204 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_memberExpression_in_newExpressionTail4263 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_newExpressionTail4284 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_newExpressionTail4288 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_newExpressionTail4311 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4315 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_newExpressionTail4340 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4342 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_newExpressionTail4361 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4363 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_newExpressionTail4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4460 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4515 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4597 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4599 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4601 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4603 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_namespaceStatement4605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4639 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4643 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4658 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4680 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4710 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4714 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4729 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4748 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4752 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4779 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4793 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4797 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4820 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4839 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4843 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4862 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4876 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4880 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4899 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4919 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4923 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4926 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4940 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4944 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4947 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4963 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4967 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4970 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4986 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4990 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4993 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5008 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression5012 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5015 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5030 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn5034 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5037 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5056 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression5060 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5063 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5077 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn5081 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5084 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5099 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression5103 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5106 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5121 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn5125 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5128 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression5147 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression5151 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5154 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5156 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5173 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn5177 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5180 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn5182 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5213 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5220 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5301 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5308 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5337 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5378 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5382 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5386 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5589 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_block5591 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5623 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5629 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeRef5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5675 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration5683 = new BitSet(new long[]{0xFFFFF7F600020002L,0x000001000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclaration5685 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5692 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5709 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclarationNoIn5717 = new BitSet(new long[]{0xFFFFF7F600020002L,0x000001000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclarationNoIn5719 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5726 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5743 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5749 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5831 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5835 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5837 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5843 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5905 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5907 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5911 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5945 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5950 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5974 = new BitSet(new long[]{0xFFFFF7FE72461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5978 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement6026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement6029 = new BitSet(new long[]{0xFFFFF7FE72461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement6032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement6034 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar6069 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6071 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar6083 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar6131 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6138 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6145 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6215 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6230 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6280 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6287 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6350 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6357 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0004060000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0004060000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6469 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012FFL,0x038C160000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6497 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6502 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6523 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6529 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6533 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6537 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6570 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6573 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6575 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6578 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6591 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6594 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6597 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6614 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6616 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6649 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000060000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6676 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6680 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6705 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6708 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6727 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_expression_in_catchFilter6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6767 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6773 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionDeclaration6780 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000003FL,0x0004000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionDeclaration6782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6821 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000009FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6828 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionExpression6835 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000003FL,0x0004000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionExpression6837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameter6876 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_formalParameter6884 = new BitSet(new long[]{0xFFFFF7F600020002L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_typeRef_in_formalParameter6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6900 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000011FL,0x0004000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6908 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6948 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6950 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x038C100000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6990 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration7031 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration7037 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0004000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration7043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7086 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_sourceElement_in_program7089 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7091 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x038C100000000000L});
    public static final BitSet FOLLOW_EOF_in_program7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement7145 = new BitSet(new long[]{0x0000000000000002L});

}
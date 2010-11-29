// $ANTLR 3.0.1 JS.g 2010-11-29 15:16:47

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

@SuppressWarnings({"cast","unused","null","rawtypes","unchecked"})
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
                    // elements: AT, identifier
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
                    // elements: AT, MUL
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
            // elements: expression, XMLFragment, XMLFragmentEnd
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
    // JS.g:1077:1: newExpression : NEW newExpressionTail ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW65=null;
        newExpressionTail_return newExpressionTail66 = null;


        Object NEW65_tree=null;

        try {
            // JS.g:1078:2: ( NEW newExpressionTail )
            // JS.g:1078:4: NEW newExpressionTail
            {
            root_0 = (Object)adaptor.nil();

            NEW65=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3998); 
            NEW65_tree = (Object)adaptor.create(NEW65);
            root_0 = (Object)adaptor.becomeRoot(NEW65_tree, root_0);

            pushFollow(FOLLOW_newExpressionTail_in_newExpression4001);
            newExpressionTail66=newExpressionTail();
            _fsp--;

            adaptor.addChild(root_0, newExpressionTail66.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1087:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
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
            // JS.g:1089:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1090:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
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

            // JS.g:1093:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $leftHandSideExpression rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
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
            	    // elements: leftHandSideExpression, arguments
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
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1095:33: -> ^( BYINDEX[$LBRACK] $leftHandSideExpression expression )
            	    {
            	        // JS.g:1095:36: ^( BYINDEX[$LBRACK] $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, LBRACK74), root_1);

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
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4143); 
            	    stream_DOT.add(DOT77);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4145);
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
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4168); 
            	    stream_DOTDOT.add(DOTDOT79);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4170);
            	    rightHandSideExpression80=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression80.getTree());

            	    // AST REWRITE
            	    // elements: rightHandSideExpression, leftHandSideExpression
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
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4189); 
            	    stream_COLONCOLON.add(COLONCOLON81);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4191);
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

    public static class newExpressionTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start newExpressionTail
    // JS.g:1105:1: newExpressionTail : ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? ;
    public final newExpressionTail_return newExpressionTail() throws RecognitionException {
        newExpressionTail_return retval = new newExpressionTail_return();
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

        arguments_return arguments93 = null;


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
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
        try {
            // JS.g:1106:3: ( ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? )
            // JS.g:1107:3: ( memberExpression -> memberExpression ) ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            {
            // JS.g:1107:3: ( memberExpression -> memberExpression )
            // JS.g:1108:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_newExpressionTail4250);
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

            // JS.g:1110:3: ( LBRACK expression RBRACK -> ^( BYINDEX[$LBRACK] $newExpressionTail expression ) | DOT rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT rightHandSideExpression ) | DOTDOT rightHandSideExpression -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression ) | COLONCOLON expression -> ^( LOCALNAME $newExpressionTail expression ) )*
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
            	    match(input,LBRACK,FOLLOW_LBRACK_in_newExpressionTail4271); 
            	    stream_LBRACK.add(LBRACK84);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4273);
            	    expression85=expression();
            	    _fsp--;

            	    stream_expression.add(expression85.getTree());
            	    RBRACK86=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_newExpressionTail4275); 
            	    stream_RBRACK.add(RBRACK86);


            	    // AST REWRITE
            	    // elements: expression, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1111:31: -> ^( BYINDEX[$LBRACK] $newExpressionTail expression )
            	    {
            	        // JS.g:1111:34: ^( BYINDEX[$LBRACK] $newExpressionTail expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, LBRACK84), root_1);

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
            	    match(input,DOT,FOLLOW_DOT_in_newExpressionTail4298); 
            	    stream_DOT.add(DOT87);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4300);
            	    rightHandSideExpression88=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression88.getTree());

            	    // AST REWRITE
            	    // elements: newExpressionTail, DOT, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1112:35: -> ^( BYFIELD $newExpressionTail DOT rightHandSideExpression )
            	    {
            	        // JS.g:1112:38: ^( BYFIELD $newExpressionTail DOT rightHandSideExpression )
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
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_newExpressionTail4323); 
            	    stream_DOTDOT.add(DOTDOT89);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4325);
            	    rightHandSideExpression90=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression90.getTree());

            	    // AST REWRITE
            	    // elements: rightHandSideExpression, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1113:38: -> ^( ALLCHILDREN $newExpressionTail rightHandSideExpression )
            	    {
            	        // JS.g:1113:41: ^( ALLCHILDREN $newExpressionTail rightHandSideExpression )
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
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_newExpressionTail4344); 
            	    stream_COLONCOLON.add(COLONCOLON91);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4346);
            	    expression92=expression();
            	    _fsp--;

            	    stream_expression.add(expression92.getTree());

            	    // AST REWRITE
            	    // elements: newExpressionTail, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1114:29: -> ^( LOCALNAME $newExpressionTail expression )
            	    {
            	        // JS.g:1114:32: ^( LOCALNAME $newExpressionTail expression )
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

            // JS.g:1116:3: ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAREN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JS.g:1117:5: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_newExpressionTail4372);
                    arguments93=arguments();
                    _fsp--;

                    stream_arguments.add(arguments93.getTree());

                    // AST REWRITE
                    // elements: arguments, newExpressionTail
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1117:19: -> ^( CALL $newExpressionTail arguments )
                    {
                        // JS.g:1117:22: ^( CALL $newExpressionTail arguments )
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
    // JS.g:1121:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL97=null;
        parenExpression_return parenExpression94 = null;

        identifier_return identifier95 = null;

        xmlAttribute_return xmlAttribute96 = null;


        Object MUL97_tree=null;

        try {
            // JS.g:1122:3: ( parenExpression | identifier | xmlAttribute | MUL )
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
                    new NoViableAltException("1121:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // JS.g:1122:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4407);
                    parenExpression94=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression94.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1123:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4414);
                    identifier95=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier95.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1124:5: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4420);
                    xmlAttribute96=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute96.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1125:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL97=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4426); 
                    MUL97_tree = (Object)adaptor.create(MUL97);
                    adaptor.addChild(root_0, MUL97_tree);


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
    // JS.g:1138:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression98 = null;

        postfixOperator_return postfixOperator99 = null;



        try {
            // JS.g:1139:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1139:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4443);
            leftHandSideExpression98=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression98.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1139:95: ( postfixOperator )?
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
                    // JS.g:1139:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4449);
                    postfixOperator99=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator99.getTree(), root_0);

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
    // JS.g:1142:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1143:2: (op= INC | op= DEC )
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
                    new NoViableAltException("1142:1: postfixOperator : (op= INC | op= DEC );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // JS.g:1143:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4467); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1144:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4476); 
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
    // JS.g:1151:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression100 = null;

        unaryOperator_return unaryOperator101 = null;

        unaryExpression_return unaryExpression102 = null;



        try {
            // JS.g:1152:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=NULL && LA25_0<=FALSE)||(LA25_0>=EACH && LA25_0<=FUNCTION)||LA25_0==NEW||LA25_0==THIS||(LA25_0>=GET && LA25_0<=SET)||(LA25_0>=WXML && LA25_0<=NAMESPACE)||LA25_0==LBRACE||LA25_0==LPAREN||LA25_0==LBRACK||LA25_0==AT||(LA25_0>=XMLFragment && LA25_0<=XMLFragmentEnd)||LA25_0==StringLiteral||(LA25_0>=Identifier && LA25_0<=RegularExpressionLiteral)||(LA25_0>=DecimalLiteral && LA25_0<=HexIntegerLiteral)) ) {
                alt25=1;
            }
            else if ( (LA25_0==DELETE||LA25_0==TYPEOF||LA25_0==VOID||LA25_0==YIELD||(LA25_0>=ADD && LA25_0<=SUB)||(LA25_0>=INC && LA25_0<=DEC)||(LA25_0>=NOT && LA25_0<=INV)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1151:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // JS.g:1152:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4493);
                    postfixExpression100=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression100.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1153:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4498);
                    unaryOperator101=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator101.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4501);
                    unaryExpression102=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression102.getTree());

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
    // JS.g:1156:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE103=null;
        Token VOID104=null;
        Token TYPEOF105=null;
        Token INC106=null;
        Token DEC107=null;
        Token INV108=null;
        Token NOT109=null;
        Token YIELD110=null;

        Object op_tree=null;
        Object DELETE103_tree=null;
        Object VOID104_tree=null;
        Object TYPEOF105_tree=null;
        Object INC106_tree=null;
        Object DEC107_tree=null;
        Object INV108_tree=null;
        Object NOT109_tree=null;
        Object YIELD110_tree=null;

        try {
            // JS.g:1157:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
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
                    new NoViableAltException("1156:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // JS.g:1157:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE103=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4513); 
                    DELETE103_tree = (Object)adaptor.create(DELETE103);
                    adaptor.addChild(root_0, DELETE103_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1158:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID104=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4518); 
                    VOID104_tree = (Object)adaptor.create(VOID104);
                    adaptor.addChild(root_0, VOID104_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1159:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF105=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4523); 
                    TYPEOF105_tree = (Object)adaptor.create(TYPEOF105);
                    adaptor.addChild(root_0, TYPEOF105_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1160:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC106=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4528); 
                    INC106_tree = (Object)adaptor.create(INC106);
                    adaptor.addChild(root_0, INC106_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1161:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC107=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4533); 
                    DEC107_tree = (Object)adaptor.create(DEC107);
                    adaptor.addChild(root_0, DEC107_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1162:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4540); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1163:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4549); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1164:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV108=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4556); 
                    INV108_tree = (Object)adaptor.create(INV108);
                    adaptor.addChild(root_0, INV108_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1165:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT109=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4561); 
                    NOT109_tree = (Object)adaptor.create(NOT109);
                    adaptor.addChild(root_0, NOT109_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1166:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD110=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4566); 
                    YIELD110_tree = (Object)adaptor.create(YIELD110);
                    adaptor.addChild(root_0, YIELD110_tree);


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
    // JS.g:1171:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT111=null;
        Token WXML112=null;
        Token NAMESPACE113=null;
        Token ASSIGN114=null;
        expression_return expression115 = null;

        semic_return semic116 = null;


        Object DEFAULT111_tree=null;
        Object WXML112_tree=null;
        Object NAMESPACE113_tree=null;
        Object ASSIGN114_tree=null;
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1172:3: ( DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) )
            // JS.g:1172:5: DEFAULT WXML NAMESPACE ASSIGN expression semic
            {
            DEFAULT111=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4580); 
            stream_DEFAULT.add(DEFAULT111);

            WXML112=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4582); 
            stream_WXML.add(WXML112);

            NAMESPACE113=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4584); 
            stream_NAMESPACE.add(NAMESPACE113);

            ASSIGN114=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4586); 
            stream_ASSIGN.add(ASSIGN114);

            pushFollow(FOLLOW_expression_in_namespaceStatement4588);
            expression115=expression();
            _fsp--;

            stream_expression.add(expression115.getTree());
            pushFollow(FOLLOW_semic_in_namespaceStatement4590);
            semic116=semic();
            _fsp--;

            stream_semic.add(semic116.getTree());

            // AST REWRITE
            // elements: ASSIGN, DEFAULT, expression, WXML
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1173:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
            {
                // JS.g:1173:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
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
    // JS.g:1178:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set118=null;
        unaryExpression_return unaryExpression117 = null;

        unaryExpression_return unaryExpression119 = null;


        Object set118_tree=null;

        try {
            // JS.g:1179:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1179:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4622);
            unaryExpression117=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression117.getTree());
            // JS.g:1179:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=MUL && LA27_0<=MOD)||LA27_0==DIV) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1179:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set118=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set118), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4626);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4641);
            	    unaryExpression119=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression119.getTree());

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
    // JS.g:1186:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set121=null;
        multiplicativeExpression_return multiplicativeExpression120 = null;

        multiplicativeExpression_return multiplicativeExpression122 = null;


        Object set121_tree=null;

        try {
            // JS.g:1187:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1187:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4659);
            multiplicativeExpression120=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression120.getTree());
            // JS.g:1187:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=ADD && LA28_0<=SUB)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1187:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set121=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set121), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4663);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4674);
            	    multiplicativeExpression122=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression122.getTree());

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
    // JS.g:1194:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;
        additiveExpression_return additiveExpression123 = null;

        additiveExpression_return additiveExpression125 = null;


        Object set124_tree=null;

        try {
            // JS.g:1195:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1195:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4693);
            additiveExpression123=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression123.getTree());
            // JS.g:1195:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=SHL && LA29_0<=SHU)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1195:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set124=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set124), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4697);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4712);
            	    additiveExpression125=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression125.getTree());

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
    // JS.g:1202:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set127=null;
        shiftExpression_return shiftExpression126 = null;

        shiftExpression_return shiftExpression128 = null;


        Object set127_tree=null;

        try {
            // JS.g:1203:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1203:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4731);
            shiftExpression126=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression126.getTree());
            // JS.g:1203:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
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
            	    // JS.g:1203:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set127=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set127), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4735);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4762);
            	    shiftExpression128=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression128.getTree());

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
    // JS.g:1206:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set130=null;
        shiftExpression_return shiftExpression129 = null;

        shiftExpression_return shiftExpression131 = null;


        Object set130_tree=null;

        try {
            // JS.g:1207:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1207:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4776);
            shiftExpression129=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression129.getTree());
            // JS.g:1207:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==INSTANCEOF||(LA31_0>=LT && LA31_0<=GTE)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1207:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set130=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set130), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4780);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4803);
            	    shiftExpression131=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression131.getTree());

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
    // JS.g:1214:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set133=null;
        relationalExpression_return relationalExpression132 = null;

        relationalExpression_return relationalExpression134 = null;


        Object set133_tree=null;

        try {
            // JS.g:1215:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1215:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4822);
            relationalExpression132=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression132.getTree());
            // JS.g:1215:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=EQ && LA32_0<=NSAME)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1215:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set133=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set133), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4826);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4845);
            	    relationalExpression134=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression134.getTree());

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
    // JS.g:1218:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set136=null;
        relationalExpressionNoIn_return relationalExpressionNoIn135 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn137 = null;


        Object set136_tree=null;

        try {
            // JS.g:1219:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1219:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4859);
            relationalExpressionNoIn135=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn135.getTree());
            // JS.g:1219:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=EQ && LA33_0<=NSAME)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1219:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set136=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set136), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4863);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4882);
            	    relationalExpressionNoIn137=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn137.getTree());

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
    // JS.g:1226:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND139=null;
        equalityExpression_return equalityExpression138 = null;

        equalityExpression_return equalityExpression140 = null;


        Object AND139_tree=null;

        try {
            // JS.g:1227:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1227:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4902);
            equalityExpression138=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression138.getTree());
            // JS.g:1227:23: ( AND equalityExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1227:25: AND equalityExpression
            	    {
            	    AND139=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4906); 
            	    AND139_tree = (Object)adaptor.create(AND139);
            	    root_0 = (Object)adaptor.becomeRoot(AND139_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4909);
            	    equalityExpression140=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression140.getTree());

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
    // JS.g:1230:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND142=null;
        equalityExpressionNoIn_return equalityExpressionNoIn141 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn143 = null;


        Object AND142_tree=null;

        try {
            // JS.g:1231:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1231:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4923);
            equalityExpressionNoIn141=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn141.getTree());
            // JS.g:1231:27: ( AND equalityExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==AND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1231:29: AND equalityExpressionNoIn
            	    {
            	    AND142=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4927); 
            	    AND142_tree = (Object)adaptor.create(AND142);
            	    root_0 = (Object)adaptor.becomeRoot(AND142_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4930);
            	    equalityExpressionNoIn143=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn143.getTree());

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
    // JS.g:1234:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR145=null;
        bitwiseANDExpression_return bitwiseANDExpression144 = null;

        bitwiseANDExpression_return bitwiseANDExpression146 = null;


        Object XOR145_tree=null;

        try {
            // JS.g:1235:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1235:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4946);
            bitwiseANDExpression144=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression144.getTree());
            // JS.g:1235:25: ( XOR bitwiseANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==XOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1235:27: XOR bitwiseANDExpression
            	    {
            	    XOR145=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4950); 
            	    XOR145_tree = (Object)adaptor.create(XOR145);
            	    root_0 = (Object)adaptor.becomeRoot(XOR145_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4953);
            	    bitwiseANDExpression146=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression146.getTree());

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
    // JS.g:1238:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR148=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn147 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn149 = null;


        Object XOR148_tree=null;

        try {
            // JS.g:1239:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1239:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4969);
            bitwiseANDExpressionNoIn147=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn147.getTree());
            // JS.g:1239:29: ( XOR bitwiseANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==XOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1239:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR148=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4973); 
            	    XOR148_tree = (Object)adaptor.create(XOR148);
            	    root_0 = (Object)adaptor.becomeRoot(XOR148_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4976);
            	    bitwiseANDExpressionNoIn149=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn149.getTree());

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
    // JS.g:1242:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR151=null;
        bitwiseXORExpression_return bitwiseXORExpression150 = null;

        bitwiseXORExpression_return bitwiseXORExpression152 = null;


        Object OR151_tree=null;

        try {
            // JS.g:1243:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1243:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4991);
            bitwiseXORExpression150=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression150.getTree());
            // JS.g:1243:25: ( OR bitwiseXORExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1243:27: OR bitwiseXORExpression
            	    {
            	    OR151=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4995); 
            	    OR151_tree = (Object)adaptor.create(OR151);
            	    root_0 = (Object)adaptor.becomeRoot(OR151_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4998);
            	    bitwiseXORExpression152=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression152.getTree());

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
    // JS.g:1246:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR154=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn153 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn155 = null;


        Object OR154_tree=null;

        try {
            // JS.g:1247:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1247:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5013);
            bitwiseXORExpressionNoIn153=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn153.getTree());
            // JS.g:1247:29: ( OR bitwiseXORExpressionNoIn )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==OR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1247:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR154=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn5017); 
            	    OR154_tree = (Object)adaptor.create(OR154);
            	    root_0 = (Object)adaptor.becomeRoot(OR154_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5020);
            	    bitwiseXORExpressionNoIn155=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn155.getTree());

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
    // JS.g:1254:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND157=null;
        bitwiseORExpression_return bitwiseORExpression156 = null;

        bitwiseORExpression_return bitwiseORExpression158 = null;


        Object LAND157_tree=null;

        try {
            // JS.g:1255:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1255:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5039);
            bitwiseORExpression156=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression156.getTree());
            // JS.g:1255:24: ( LAND bitwiseORExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LAND) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1255:26: LAND bitwiseORExpression
            	    {
            	    LAND157=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression5043); 
            	    LAND157_tree = (Object)adaptor.create(LAND157);
            	    root_0 = (Object)adaptor.becomeRoot(LAND157_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5046);
            	    bitwiseORExpression158=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression158.getTree());

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
    // JS.g:1258:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND160=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn159 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn161 = null;


        Object LAND160_tree=null;

        try {
            // JS.g:1259:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1259:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5060);
            bitwiseORExpressionNoIn159=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn159.getTree());
            // JS.g:1259:28: ( LAND bitwiseORExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LAND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JS.g:1259:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND160=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn5064); 
            	    LAND160_tree = (Object)adaptor.create(LAND160);
            	    root_0 = (Object)adaptor.becomeRoot(LAND160_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5067);
            	    bitwiseORExpressionNoIn161=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn161.getTree());

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
    // JS.g:1262:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR163=null;
        logicalANDExpression_return logicalANDExpression162 = null;

        logicalANDExpression_return logicalANDExpression164 = null;


        Object LOR163_tree=null;

        try {
            // JS.g:1263:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1263:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5082);
            logicalANDExpression162=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression162.getTree());
            // JS.g:1263:25: ( LOR logicalANDExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LOR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1263:27: LOR logicalANDExpression
            	    {
            	    LOR163=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression5086); 
            	    LOR163_tree = (Object)adaptor.create(LOR163);
            	    root_0 = (Object)adaptor.becomeRoot(LOR163_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5089);
            	    logicalANDExpression164=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression164.getTree());

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
    // JS.g:1266:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR166=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn165 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn167 = null;


        Object LOR166_tree=null;

        try {
            // JS.g:1267:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1267:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5104);
            logicalANDExpressionNoIn165=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn165.getTree());
            // JS.g:1267:29: ( LOR logicalANDExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LOR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1267:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR166=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn5108); 
            	    LOR166_tree = (Object)adaptor.create(LOR166);
            	    root_0 = (Object)adaptor.becomeRoot(LOR166_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5111);
            	    logicalANDExpressionNoIn167=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn167.getTree());

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
    // JS.g:1274:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE169=null;
        Token COLON171=null;
        logicalORExpression_return logicalORExpression168 = null;

        assignmentExpression_return assignmentExpression170 = null;

        assignmentExpression_return assignmentExpression172 = null;


        Object QUE169_tree=null;
        Object COLON171_tree=null;

        try {
            // JS.g:1275:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1275:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression5130);
            logicalORExpression168=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression168.getTree());
            // JS.g:1275:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // JS.g:1275:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE169=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression5134); 
                    QUE169_tree = (Object)adaptor.create(QUE169);
                    root_0 = (Object)adaptor.becomeRoot(QUE169_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5137);
                    assignmentExpression170=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression170.getTree());
                    COLON171=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression5139); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5142);
                    assignmentExpression172=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression172.getTree());

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
    // JS.g:1278:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE174=null;
        Token COLON176=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn173 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn175 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn177 = null;


        Object QUE174_tree=null;
        Object COLON176_tree=null;

        try {
            // JS.g:1279:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1279:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5156);
            logicalORExpressionNoIn173=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn173.getTree());
            // JS.g:1279:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==QUE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // JS.g:1279:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE174=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn5160); 
                    QUE174_tree = (Object)adaptor.create(QUE174);
                    root_0 = (Object)adaptor.becomeRoot(QUE174_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5163);
                    assignmentExpressionNoIn175=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn175.getTree());
                    COLON176=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn5165); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5168);
                    assignmentExpressionNoIn177=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn177.getTree());

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
    // JS.g:1308:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator178 = null;

        assignmentExpression_return assignmentExpression179 = null;



        
        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1313:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1313:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5196);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1314:2: ({...}? assignmentOperator assignmentExpression )?
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
                    // JS.g:1314:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5203);
                    assignmentOperator178=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator178.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5206);
                    assignmentExpression179=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression179.getTree());

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
    // JS.g:1317:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set180=null;

        Object set180_tree=null;

        try {
            // JS.g:1318:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set180=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set180));
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
    // JS.g:1321:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator181 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn182 = null;



        
        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1326:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1326:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5284);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1327:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
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
                    // JS.g:1327:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5291);
                    assignmentOperator181=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator181.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5294);
                    assignmentExpressionNoIn182=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn182.getTree());

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
    // JS.g:1334:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA183=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA183_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1335:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1335:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5316);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1335:32: ( COMMA exprs+= assignmentExpression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1335:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA183=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5320); 
            	    stream_COMMA.add(COMMA183);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5324);
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
    // $ANTLR end expression

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionNoIn
    // JS.g:1340:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA184=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA184_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1341:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1341:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5361);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1341:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // JS.g:1341:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA184=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5365); 
            	    stream_COMMA.add(COMMA184);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5369);
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
    // $ANTLR end expressionNoIn

    public static class semic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start semic
    // JS.g:1368:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC185=null;
        Token EOF186=null;
        Token RBRACE187=null;
        Token EOL188=null;
        Token MultiLineComment189=null;

        Object SEMIC185_tree=null;
        Object EOF186_tree=null;
        Object RBRACE187_tree=null;
        Object EOL188_tree=null;
        Object MultiLineComment189_tree=null;

        
        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1376:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
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
                    new NoViableAltException("1368:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // JS.g:1376:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC185=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5420); 
                    SEMIC185_tree = (Object)adaptor.create(SEMIC185);
                    adaptor.addChild(root_0, SEMIC185_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1377:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF186=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5425); 
                    EOF186_tree = (Object)adaptor.create(EOF186);
                    adaptor.addChild(root_0, EOF186_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1378:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE187=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5430); 
                    RBRACE187_tree = (Object)adaptor.create(RBRACE187);
                    adaptor.addChild(root_0, RBRACE187_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1379:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL188=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5437); 
                    EOL188_tree = (Object)adaptor.create(EOL188);
                    adaptor.addChild(root_0, EOL188_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1379:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment189=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5441); 
                    MultiLineComment189_tree = (Object)adaptor.create(MultiLineComment189);
                    adaptor.addChild(root_0, MultiLineComment189_tree);


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
    // JS.g:1387:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block190 = null;

        statementTail_return statementTail191 = null;



        try {
            // JS.g:1392:2: ({...}? block | statementTail )
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
                        new NoViableAltException("1387:1: statement options {k=1; } : ({...}? block | statementTail );", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA51_0>=NULL && LA51_0<=BREAK)||(LA51_0>=CONTINUE && LA51_0<=DO)||(LA51_0>=FOR && LA51_0<=IF)||(LA51_0>=NEW && LA51_0<=NAMESPACE)||LA51_0==CONST||LA51_0==LPAREN||LA51_0==LBRACK||LA51_0==SEMIC||(LA51_0>=ADD && LA51_0<=SUB)||(LA51_0>=INC && LA51_0<=DEC)||(LA51_0>=NOT && LA51_0<=INV)||LA51_0==AT||(LA51_0>=XMLFragment && LA51_0<=XMLFragmentEnd)||LA51_0==StringLiteral||(LA51_0>=Identifier && LA51_0<=RegularExpressionLiteral)||(LA51_0>=DecimalLiteral && LA51_0<=HexIntegerLiteral)) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1387:1: statement options {k=1; } : ({...}? block | statementTail );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // JS.g:1392:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5470);
                    block190=block();
                    _fsp--;

                    adaptor.addChild(root_0, block190.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1393:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5475);
                    statementTail191=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail191.getTree());

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
    // JS.g:1396:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement192 = null;

        emptyStatement_return emptyStatement193 = null;

        expressionStatement_return expressionStatement194 = null;

        ifStatement_return ifStatement195 = null;

        iterationStatement_return iterationStatement196 = null;

        continueStatement_return continueStatement197 = null;

        breakStatement_return breakStatement198 = null;

        returnStatement_return returnStatement199 = null;

        withStatement_return withStatement200 = null;

        labelledStatement_return labelledStatement201 = null;

        switchStatement_return switchStatement202 = null;

        throwStatement_return throwStatement203 = null;

        tryStatement_return tryStatement204 = null;

        constStatement_return constStatement205 = null;

        namespaceStatement_return namespaceStatement206 = null;



        try {
            // JS.g:1397:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
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
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                int LA52_4 = input.LA(2);

                if ( (LA52_4==EOF||(LA52_4>=IN && LA52_4<=INSTANCEOF)||(LA52_4>=RBRACE && LA52_4<=LPAREN)||LA52_4==LBRACK||(LA52_4>=DOT && LA52_4<=XOR)||(LA52_4>=LAND && LA52_4<=QUE)||(LA52_4>=ASSIGN && LA52_4<=DIVASS)||(LA52_4>=DOTDOT && LA52_4<=COLONCOLON)||(LA52_4>=EOL && LA52_4<=MultiLineComment)) ) {
                    alt52=3;
                }
                else if ( (LA52_4==COLON) ) {
                    alt52=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1396:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 4, input);

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
                    new NoViableAltException("1396:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // JS.g:1397:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5487);
                    variableStatement192=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement192.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1398:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5492);
                    emptyStatement193=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement193.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1399:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5497);
                    expressionStatement194=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement194.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1400:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5502);
                    ifStatement195=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement195.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1401:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5507);
                    iterationStatement196=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement196.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1402:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5512);
                    continueStatement197=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement197.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1403:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5517);
                    breakStatement198=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement198.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1404:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5522);
                    returnStatement199=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement199.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1405:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5527);
                    withStatement200=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement200.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1406:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5532);
                    labelledStatement201=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement201.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1407:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5537);
                    switchStatement202=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement202.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1408:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5542);
                    throwStatement203=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement203.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1409:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5547);
                    tryStatement204=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement204.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1410:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5552);
                    constStatement205=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement205.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1411:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5557);
                    namespaceStatement206=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement206.getTree());

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
    // JS.g:1416:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE208=null;
        statement_return statement207 = null;


        Object lb_tree=null;
        Object RBRACE208_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1417:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1417:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5572); 
            stream_LBRACE.add(lb);

            // JS.g:1417:14: ( statement )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=NULL && LA53_0<=BREAK)||(LA53_0>=CONTINUE && LA53_0<=DO)||(LA53_0>=FOR && LA53_0<=IF)||(LA53_0>=NEW && LA53_0<=NAMESPACE)||LA53_0==CONST||LA53_0==LBRACE||LA53_0==LPAREN||LA53_0==LBRACK||LA53_0==SEMIC||(LA53_0>=ADD && LA53_0<=SUB)||(LA53_0>=INC && LA53_0<=DEC)||(LA53_0>=NOT && LA53_0<=INV)||LA53_0==AT||(LA53_0>=XMLFragment && LA53_0<=XMLFragmentEnd)||LA53_0==StringLiteral||(LA53_0>=Identifier && LA53_0<=RegularExpressionLiteral)||(LA53_0>=DecimalLiteral && LA53_0<=HexIntegerLiteral)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JS.g:1417:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5574);
            	    statement207=statement();
            	    _fsp--;

            	    stream_statement.add(statement207.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            RBRACE208=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5577); 
            stream_RBRACE.add(RBRACE208);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1418:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1418:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1418:28: ( statement )*
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
    // JS.g:1425:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR209=null;
        Token COMMA211=null;
        variableDeclaration_return variableDeclaration210 = null;

        variableDeclaration_return variableDeclaration212 = null;

        semic_return semic213 = null;


        Object VAR209_tree=null;
        Object COMMA211_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1426:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1426:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR209=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5606); 
            stream_VAR.add(VAR209);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5608);
            variableDeclaration210=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration210.getTree());
            // JS.g:1426:28: ( COMMA variableDeclaration )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // JS.g:1426:30: COMMA variableDeclaration
            	    {
            	    COMMA211=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5612); 
            	    stream_COMMA.add(COMMA211);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5614);
            	    variableDeclaration212=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration212.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5619);
            semic213=semic();
            _fsp--;

            stream_semic.add(semic213.getTree());

            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1427:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1427:5: ^( VAR ( variableDeclaration )+ )
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
    // JS.g:1430:1: typeRef : ( identifier | );
    public final typeRef_return typeRef() throws RecognitionException {
        typeRef_return retval = new typeRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier214 = null;



        try {
            // JS.g:1431:2: ( identifier | )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==EACH||(LA55_0>=GET && LA55_0<=SET)||(LA55_0>=WXML && LA55_0<=NAMESPACE)||LA55_0==Identifier) ) {
                alt55=1;
            }
            else if ( (LA55_0==EOF||LA55_0==IN||(LA55_0>=LBRACE && LA55_0<=RBRACE)||LA55_0==RPAREN||(LA55_0>=SEMIC && LA55_0<=COMMA)||LA55_0==ASSIGN||(LA55_0>=EOL && LA55_0<=MultiLineComment)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1430:1: typeRef : ( identifier | );", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // JS.g:1431:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_typeRef5642);
                    identifier214=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier214.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1432:4: 
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
    // JS.g:1435:1: variableDeclaration : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON216=null;
        Token ASSIGN218=null;
        identifier_return identifier215 = null;

        typeRef_return typeRef217 = null;

        assignmentExpression_return assignmentExpression219 = null;


        Object COLON216_tree=null;
        Object ASSIGN218_tree=null;

        try {
            // JS.g:1436:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? )
            // JS.g:1436:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5658);
            identifier215=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier215.getTree(), root_0);
            // JS.g:1436:16: ({...}? => COLON typeRef )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COLON) && ( isTypeInformationEnabled() )) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // JS.g:1436:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON216=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclaration5666); 
                    COLON216_tree = (Object)adaptor.create(COLON216);
                    adaptor.addChild(root_0, COLON216_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclaration5668);
                    typeRef217=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef217.getTree());

                    }
                    break;

            }

            // JS.g:1436:69: ( ASSIGN assignmentExpression )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ASSIGN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // JS.g:1436:71: ASSIGN assignmentExpression
                    {
                    ASSIGN218=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5675); 
                    ASSIGN218_tree = (Object)adaptor.create(ASSIGN218);
                    adaptor.addChild(root_0, ASSIGN218_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5677);
                    assignmentExpression219=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression219.getTree());

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
    // JS.g:1439:1: variableDeclarationNoIn : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON221=null;
        Token ASSIGN223=null;
        identifier_return identifier220 = null;

        typeRef_return typeRef222 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn224 = null;


        Object COLON221_tree=null;
        Object ASSIGN223_tree=null;

        try {
            // JS.g:1440:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1440:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5692);
            identifier220=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier220.getTree(), root_0);
            // JS.g:1440:16: ({...}? => COLON typeRef )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==COLON) && ( isTypeInformationEnabled() )) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // JS.g:1440:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclarationNoIn", " isTypeInformationEnabled() ");
                    }
                    COLON221=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclarationNoIn5700); 
                    COLON221_tree = (Object)adaptor.create(COLON221);
                    adaptor.addChild(root_0, COLON221_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclarationNoIn5702);
                    typeRef222=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef222.getTree());

                    }
                    break;

            }

            // JS.g:1440:69: ( ASSIGN assignmentExpressionNoIn )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ASSIGN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // JS.g:1440:71: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN223=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5709); 
                    ASSIGN223_tree = (Object)adaptor.create(ASSIGN223);
                    adaptor.addChild(root_0, ASSIGN223_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5711);
                    assignmentExpressionNoIn224=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn224.getTree());

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
    // JS.g:1443:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST225=null;
        Token COMMA227=null;
        variableDeclaration_return variableDeclaration226 = null;

        variableDeclaration_return variableDeclaration228 = null;

        semic_return semic229 = null;


        Object CONST225_tree=null;
        Object COMMA227_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1444:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1444:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST225=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5726); 
            stream_CONST.add(CONST225);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5728);
            variableDeclaration226=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration226.getTree());
            // JS.g:1444:31: ( COMMA variableDeclaration )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // JS.g:1444:33: COMMA variableDeclaration
            	    {
            	    COMMA227=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5732); 
            	    stream_COMMA.add(COMMA227);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5734);
            	    variableDeclaration228=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration228.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5739);
            semic229=semic();
            _fsp--;

            stream_semic.add(semic229.getTree());

            // AST REWRITE
            // elements: CONST, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1445:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1445:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1452:1: emptyStatement : SEMIC -> EMPTY_STATEMENT[$SEMIC] ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC230=null;

        Object SEMIC230_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");

        try {
            // JS.g:1453:2: ( SEMIC -> EMPTY_STATEMENT[$SEMIC] )
            // JS.g:1453:4: SEMIC
            {
            SEMIC230=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5769); 
            stream_SEMIC.add(SEMIC230);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1453:10: -> EMPTY_STATEMENT[$SEMIC]
            {
                adaptor.addChild(root_0, adaptor.create(EMPTY_STATEMENT, SEMIC230));

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
    // JS.g:1466:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression231 = null;

        semic_return semic232 = null;



        try {
            // JS.g:1467:2: ( expression semic )
            // JS.g:1467:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5792);
            expression231=expression();
            _fsp--;

            adaptor.addChild(root_0, expression231.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5794);
            semic232=semic();
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
    // JS.g:1474:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF233=null;
        Token LPAREN234=null;
        Token RPAREN236=null;
        Token ELSE238=null;
        expression_return expression235 = null;

        statement_return statement237 = null;

        statement_return statement239 = null;


        Object IF233_tree=null;
        Object LPAREN234_tree=null;
        Object RPAREN236_tree=null;
        Object ELSE238_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1476:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1476:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF233=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5812); 
            stream_IF.add(IF233);

            LPAREN234=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5814); 
            stream_LPAREN.add(LPAREN234);

            pushFollow(FOLLOW_expression_in_ifStatement5816);
            expression235=expression();
            _fsp--;

            stream_expression.add(expression235.getTree());
            RPAREN236=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5818); 
            stream_RPAREN.add(RPAREN236);

            pushFollow(FOLLOW_statement_in_ifStatement5820);
            statement237=statement();
            _fsp--;

            stream_statement.add(statement237.getTree());
            // JS.g:1476:42: ({...}? ELSE statement )?
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
                    // JS.g:1476:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE238=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5826); 
                    stream_ELSE.add(ELSE238);

                    pushFollow(FOLLOW_statement_in_ifStatement5828);
                    statement239=statement();
                    _fsp--;

                    stream_statement.add(statement239.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expression, statement, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1477:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1477:5: ^( IF expression ( statement )+ )
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
    // JS.g:1484:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement240 = null;

        whileStatement_return whileStatement241 = null;

        forEachStatement_return forEachStatement242 = null;

        forStatement_return forStatement243 = null;



        try {
            // JS.g:1485:2: ( doStatement | whileStatement | forEachStatement | forStatement )
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

                if ( (LA62_3==LPAREN) ) {
                    alt62=4;
                }
                else if ( (LA62_3==EACH) ) {
                    alt62=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1484:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 62, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1484:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // JS.g:1485:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5861);
                    doStatement240=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement240.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1486:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5866);
                    whileStatement241=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement241.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1487:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5871);
                    forEachStatement242=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement242.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1488:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5876);
                    forStatement243=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement243.getTree());

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
    // JS.g:1491:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO244=null;
        Token WHILE246=null;
        Token LPAREN247=null;
        Token RPAREN249=null;
        statement_return statement245 = null;

        expression_return expression248 = null;

        semic_return semic250 = null;


        Object DO244_tree=null;
        Object WHILE246_tree=null;
        Object LPAREN247_tree=null;
        Object RPAREN249_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1492:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1492:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO244=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5888); 
            stream_DO.add(DO244);

            pushFollow(FOLLOW_statement_in_doStatement5890);
            statement245=statement();
            _fsp--;

            stream_statement.add(statement245.getTree());
            WHILE246=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5892); 
            stream_WHILE.add(WHILE246);

            LPAREN247=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5894); 
            stream_LPAREN.add(LPAREN247);

            pushFollow(FOLLOW_expression_in_doStatement5896);
            expression248=expression();
            _fsp--;

            stream_expression.add(expression248.getTree());
            RPAREN249=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5898); 
            stream_RPAREN.add(RPAREN249);

            pushFollow(FOLLOW_semic_in_doStatement5900);
            semic250=semic();
            _fsp--;

            stream_semic.add(semic250.getTree());

            // AST REWRITE
            // elements: expression, DO, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1493:2: -> ^( DO statement expression )
            {
                // JS.g:1493:5: ^( DO statement expression )
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
    // JS.g:1496:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE251=null;
        Token LPAREN252=null;
        Token RPAREN254=null;
        expression_return expression253 = null;

        statement_return statement255 = null;


        Object WHILE251_tree=null;
        Object LPAREN252_tree=null;
        Object RPAREN254_tree=null;

        try {
            // JS.g:1497:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1497:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE251=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5925); 
            WHILE251_tree = (Object)adaptor.create(WHILE251);
            root_0 = (Object)adaptor.becomeRoot(WHILE251_tree, root_0);

            LPAREN252=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5928); 
            pushFollow(FOLLOW_expression_in_whileStatement5931);
            expression253=expression();
            _fsp--;

            adaptor.addChild(root_0, expression253.getTree());
            RPAREN254=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5933); 
            pushFollow(FOLLOW_statement_in_whileStatement5936);
            statement255=statement();
            _fsp--;

            adaptor.addChild(root_0, statement255.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1542:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH256=null;
        Token LPAREN257=null;
        Token RPAREN259=null;
        forEachControl_return forEachControl258 = null;

        statement_return statement260 = null;


        Object forKeyword_tree=null;
        Object EACH256_tree=null;
        Object LPAREN257_tree=null;
        Object RPAREN259_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1543:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1543:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5953); 
            stream_FOR.add(forKeyword);

            EACH256=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5955); 
            stream_EACH.add(EACH256);

            LPAREN257=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5957); 
            stream_LPAREN.add(LPAREN257);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5959);
            forEachControl258=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl258.getTree());
            RPAREN259=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5961); 
            stream_RPAREN.add(RPAREN259);

            pushFollow(FOLLOW_statement_in_forEachStatement5963);
            statement260=statement();
            _fsp--;

            stream_statement.add(statement260.getTree());

            // AST REWRITE
            // elements: forEachControl, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1544:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1544:7: ^( FOREACH[$forKeyword] forEachControl statement )
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
    // JS.g:1547:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar261 = null;

        forControlExpression_return forControlExpression262 = null;



        try {
            // JS.g:1548:3: ( forControlVar | forControlExpression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==VAR) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||(LA63_0>=EACH && LA63_0<=FUNCTION)||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||(LA63_0>=GET && LA63_0<=NAMESPACE)||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||LA63_0==AT||(LA63_0>=XMLFragment && LA63_0<=XMLFragmentEnd)||LA63_0==StringLiteral||(LA63_0>=Identifier && LA63_0<=RegularExpressionLiteral)||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1547:1: forEachControl : ( forControlVar | forControlExpression );", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // JS.g:1548:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5991);
                    forControlVar261=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar261.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1549:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5997);
                    forControlExpression262=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression262.getTree());

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
    // JS.g:1552:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR263=null;
        Token LPAREN264=null;
        Token RPAREN266=null;
        forControl_return forControl265 = null;

        statement_return statement267 = null;


        Object FOR263_tree=null;
        Object LPAREN264_tree=null;
        Object RPAREN266_tree=null;

        try {
            // JS.g:1553:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1553:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR263=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement6009); 
            FOR263_tree = (Object)adaptor.create(FOR263);
            root_0 = (Object)adaptor.becomeRoot(FOR263_tree, root_0);

            LPAREN264=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement6012); 
            pushFollow(FOLLOW_forControl_in_forStatement6015);
            forControl265=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl265.getTree());
            RPAREN266=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement6017); 
            pushFollow(FOLLOW_statement_in_forStatement6020);
            statement267=statement();
            _fsp--;

            adaptor.addChild(root_0, statement267.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1556:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar268 = null;

        forControlExpression_return forControlExpression269 = null;

        forControlSemic_return forControlSemic270 = null;



        try {
            // JS.g:1557:2: ( forControlVar | forControlExpression | forControlSemic )
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
                    new NoViableAltException("1556:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // JS.g:1557:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl6031);
                    forControlVar268=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar268.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1558:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl6036);
                    forControlExpression269=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression269.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1559:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl6041);
                    forControlSemic270=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic270.getTree());

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
    // JS.g:1562:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR271=null;
        Token IN273=null;
        Token COMMA275=null;
        Token SEMIC277=null;
        Token SEMIC278=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn272 = null;

        expression_return expression274 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn276 = null;


        Object VAR271_tree=null;
        Object IN273_tree=null;
        Object COMMA275_tree=null;
        Object SEMIC277_tree=null;
        Object SEMIC278_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1563:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1563:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR271=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar6052); 
            stream_VAR.add(VAR271);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6054);
            variableDeclarationNoIn272=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn272.getTree());
            // JS.g:1564:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
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
                    new NoViableAltException("1564:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // JS.g:1565:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1565:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1566:4: IN expression
                    {
                    IN273=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar6066); 
                    stream_IN.add(IN273);

                    pushFollow(FOLLOW_expression_in_forControlVar6068);
                    expression274=expression();
                    _fsp--;

                    stream_expression.add(expression274.getTree());

                    // AST REWRITE
                    // elements: variableDeclarationNoIn, expression, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1567:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1567:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1567:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1567:51: ^( EXPR expression )
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
                    // JS.g:1570:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1570:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1571:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1571:4: ( COMMA variableDeclarationNoIn )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // JS.g:1571:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA275=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar6114); 
                    	    stream_COMMA.add(COMMA275);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6116);
                    	    variableDeclarationNoIn276=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn276.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    SEMIC277=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6121); 
                    stream_SEMIC.add(SEMIC277);

                    // JS.g:1571:48: (ex1= expression )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==DELETE||(LA66_0>=EACH && LA66_0<=FUNCTION)||LA66_0==NEW||LA66_0==THIS||LA66_0==TYPEOF||LA66_0==VOID||(LA66_0>=GET && LA66_0<=NAMESPACE)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||LA66_0==AT||(LA66_0>=XMLFragment && LA66_0<=XMLFragmentEnd)||LA66_0==StringLiteral||(LA66_0>=Identifier && LA66_0<=RegularExpressionLiteral)||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // JS.g:1571:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6125);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC278=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6128); 
                    stream_SEMIC.add(SEMIC278);

                    // JS.g:1571:70: (ex2= expression )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||(LA67_0>=EACH && LA67_0<=FUNCTION)||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||(LA67_0>=GET && LA67_0<=NAMESPACE)||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||LA67_0==AT||(LA67_0>=XMLFragment && LA67_0<=XMLFragmentEnd)||LA67_0==StringLiteral||(LA67_0>=Identifier && LA67_0<=RegularExpressionLiteral)||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // JS.g:1571:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6132);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex1, ex2, VAR, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1572:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1572:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1572:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1572:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1572:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1572:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1572:76: ( $ex2)?
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
    // JS.g:1577:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN279=null;
        Token SEMIC280=null;
        Token SEMIC281=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN279_tree=null;
        Object SEMIC280_tree=null;
        Object SEMIC281_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");
        
        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1582:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1582:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6198);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1583:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
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
                    new NoViableAltException("1583:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1584:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1584:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1585:4: IN ex2= expression
                    {
                    IN279=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression6213); 
                    stream_IN.add(IN279);

                    pushFollow(FOLLOW_expression_in_forControlExpression6217);
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
                    // 1586:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1586:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1586:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1586:33: ^( EXPR $ex2)
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
                    // JS.g:1589:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1589:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1590:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC280=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6263); 
                    stream_SEMIC.add(SEMIC280);

                    // JS.g:1590:13: (ex2= expression )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==DELETE||(LA69_0>=EACH && LA69_0<=FUNCTION)||LA69_0==NEW||LA69_0==THIS||LA69_0==TYPEOF||LA69_0==VOID||(LA69_0>=GET && LA69_0<=NAMESPACE)||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||LA69_0==AT||(LA69_0>=XMLFragment && LA69_0<=XMLFragmentEnd)||LA69_0==StringLiteral||(LA69_0>=Identifier && LA69_0<=RegularExpressionLiteral)||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // JS.g:1590:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6267);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC281=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6270); 
                    stream_SEMIC.add(SEMIC281);

                    // JS.g:1590:35: (ex3= expression )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=NULL && LA70_0<=FALSE)||LA70_0==DELETE||(LA70_0>=EACH && LA70_0<=FUNCTION)||LA70_0==NEW||LA70_0==THIS||LA70_0==TYPEOF||LA70_0==VOID||(LA70_0>=GET && LA70_0<=NAMESPACE)||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||LA70_0==AT||(LA70_0>=XMLFragment && LA70_0<=XMLFragmentEnd)||LA70_0==StringLiteral||(LA70_0>=Identifier && LA70_0<=RegularExpressionLiteral)||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // JS.g:1590:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6274);
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
                    // 1591:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1591:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1591:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1591:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1591:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1591:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1591:57: ( $ex3)?
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
    // JS.g:1596:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC282=null;
        Token SEMIC283=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC282_tree=null;
        Object SEMIC283_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1597:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1597:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC282=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6333); 
            stream_SEMIC.add(SEMIC282);

            // JS.g:1597:13: (ex1= expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=NULL && LA72_0<=FALSE)||LA72_0==DELETE||(LA72_0>=EACH && LA72_0<=FUNCTION)||LA72_0==NEW||LA72_0==THIS||LA72_0==TYPEOF||LA72_0==VOID||(LA72_0>=GET && LA72_0<=NAMESPACE)||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||LA72_0==AT||(LA72_0>=XMLFragment && LA72_0<=XMLFragmentEnd)||LA72_0==StringLiteral||(LA72_0>=Identifier && LA72_0<=RegularExpressionLiteral)||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1597:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6337);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC283=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6340); 
            stream_SEMIC.add(SEMIC283);

            // JS.g:1597:35: (ex2= expression )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=NULL && LA73_0<=FALSE)||LA73_0==DELETE||(LA73_0>=EACH && LA73_0<=FUNCTION)||LA73_0==NEW||LA73_0==THIS||LA73_0==TYPEOF||LA73_0==VOID||(LA73_0>=GET && LA73_0<=NAMESPACE)||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||LA73_0==AT||(LA73_0>=XMLFragment && LA73_0<=XMLFragmentEnd)||LA73_0==StringLiteral||(LA73_0>=Identifier && LA73_0<=RegularExpressionLiteral)||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1597:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6344);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }


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
            // 1598:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1598:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1598:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1598:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1598:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1598:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1598:50: ( $ex2)?
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
    // JS.g:1610:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE284=null;
        Token Identifier285=null;
        semic_return semic286 = null;


        Object CONTINUE284_tree=null;
        Object Identifier285_tree=null;

        try {
            // JS.g:1611:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1611:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE284=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6398); 
            CONTINUE284_tree = (Object)adaptor.create(CONTINUE284);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE284_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1611:67: ( Identifier )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Identifier) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1611:67: Identifier
                    {
                    Identifier285=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6403); 
                    Identifier285_tree = (Object)adaptor.create(Identifier285);
                    adaptor.addChild(root_0, Identifier285_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6406);
            semic286=semic();
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
    // JS.g:1623:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK287=null;
        Token Identifier288=null;
        semic_return semic289 = null;


        Object BREAK287_tree=null;
        Object Identifier288_tree=null;

        try {
            // JS.g:1624:2: ( BREAK ( Identifier )? semic )
            // JS.g:1624:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK287=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6425); 
            BREAK287_tree = (Object)adaptor.create(BREAK287);
            root_0 = (Object)adaptor.becomeRoot(BREAK287_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1624:64: ( Identifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Identifier) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1624:64: Identifier
                    {
                    Identifier288=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6430); 
                    Identifier288_tree = (Object)adaptor.create(Identifier288);
                    adaptor.addChild(root_0, Identifier288_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6433);
            semic289=semic();
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
    // JS.g:1644:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN290=null;
        expression_return expression291 = null;

        semic_return semic292 = null;


        Object RETURN290_tree=null;

        try {
            // JS.g:1645:2: ( RETURN ( expression )? semic )
            // JS.g:1645:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN290=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6452); 
            RETURN290_tree = (Object)adaptor.create(RETURN290);
            root_0 = (Object)adaptor.becomeRoot(RETURN290_tree, root_0);

             promoteEOL(null); 
            // JS.g:1645:34: ( expression )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=NULL && LA76_0<=FALSE)||LA76_0==DELETE||(LA76_0>=EACH && LA76_0<=FUNCTION)||LA76_0==NEW||LA76_0==THIS||LA76_0==TYPEOF||LA76_0==VOID||(LA76_0>=GET && LA76_0<=NAMESPACE)||LA76_0==LBRACE||LA76_0==LPAREN||LA76_0==LBRACK||(LA76_0>=ADD && LA76_0<=SUB)||(LA76_0>=INC && LA76_0<=DEC)||(LA76_0>=NOT && LA76_0<=INV)||LA76_0==AT||(LA76_0>=XMLFragment && LA76_0<=XMLFragmentEnd)||LA76_0==StringLiteral||(LA76_0>=Identifier && LA76_0<=RegularExpressionLiteral)||(LA76_0>=DecimalLiteral && LA76_0<=HexIntegerLiteral)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // JS.g:1645:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6457);
                    expression291=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression291.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6460);
            semic292=semic();
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
    // JS.g:1652:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH293=null;
        Token LPAREN294=null;
        Token RPAREN296=null;
        expression_return expression295 = null;

        statement_return statement297 = null;


        Object WITH293_tree=null;
        Object LPAREN294_tree=null;
        Object RPAREN296_tree=null;

        try {
            // JS.g:1653:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1653:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH293=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6477); 
            WITH293_tree = (Object)adaptor.create(WITH293);
            root_0 = (Object)adaptor.becomeRoot(WITH293_tree, root_0);

            LPAREN294=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6480); 
            pushFollow(FOLLOW_expression_in_withStatement6483);
            expression295=expression();
            _fsp--;

            adaptor.addChild(root_0, expression295.getTree());
            RPAREN296=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6485); 
            pushFollow(FOLLOW_statement_in_withStatement6488);
            statement297=statement();
            _fsp--;

            adaptor.addChild(root_0, statement297.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1660:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH298=null;
        Token LPAREN299=null;
        Token RPAREN301=null;
        Token LBRACE302=null;
        Token RBRACE305=null;
        expression_return expression300 = null;

        defaultClause_return defaultClause303 = null;

        caseClause_return caseClause304 = null;


        Object SWITCH298_tree=null;
        Object LPAREN299_tree=null;
        Object RPAREN301_tree=null;
        Object LBRACE302_tree=null;
        Object RBRACE305_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");
        try {
            // JS.g:1661:2: ( SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) )
            // JS.g:1661:4: SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE
            {
            SWITCH298=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6504); 
            stream_SWITCH.add(SWITCH298);

            LPAREN299=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6506); 
            stream_LPAREN.add(LPAREN299);

            pushFollow(FOLLOW_expression_in_switchStatement6508);
            expression300=expression();
            _fsp--;

            stream_expression.add(expression300.getTree());
            RPAREN301=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6510); 
            stream_RPAREN.add(RPAREN301);

            LBRACE302=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6512); 
            stream_LBRACE.add(LBRACE302);

            // JS.g:1661:43: ( defaultClause | caseClause )*
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
            	    // JS.g:1661:45: defaultClause
            	    {
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6516);
            	    defaultClause303=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause303.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1661:61: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6520);
            	    caseClause304=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause304.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            RBRACE305=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6525); 
            stream_RBRACE.add(RBRACE305);


            // AST REWRITE
            // elements: expression, caseClause, defaultClause, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1662:2: -> ^( SWITCH expression ( defaultClause )* ( caseClause )* )
            {
                // JS.g:1662:5: ^( SWITCH expression ( defaultClause )* ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1662:26: ( defaultClause )*
                while ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1662:41: ( caseClause )*
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
    // JS.g:1665:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE306=null;
        Token COLON308=null;
        expression_return expression307 = null;

        statement_return statement309 = null;


        Object CASE306_tree=null;
        Object COLON308_tree=null;

        try {
            // JS.g:1666:2: ( CASE expression COLON ( statement )* )
            // JS.g:1666:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE306=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6553); 
            CASE306_tree = (Object)adaptor.create(CASE306);
            root_0 = (Object)adaptor.becomeRoot(CASE306_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6556);
            expression307=expression();
            _fsp--;

            adaptor.addChild(root_0, expression307.getTree());
            COLON308=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6558); 
            // JS.g:1666:28: ( statement )*
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
            	    // JS.g:1666:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6561);
            	    statement309=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement309.getTree());

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
    // JS.g:1669:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT310=null;
        Token COLON311=null;
        statement_return statement312 = null;


        Object DEFAULT310_tree=null;
        Object COLON311_tree=null;

        try {
            // JS.g:1670:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1670:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT310=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6574); 
            DEFAULT310_tree = (Object)adaptor.create(DEFAULT310);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT310_tree, root_0);

            COLON311=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6577); 
            // JS.g:1670:20: ( statement )*
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
                else if ( ((LA79_0>=NULL && LA79_0<=BREAK)||LA79_0==CONTINUE||(LA79_0>=DELETE && LA79_0<=DO)||(LA79_0>=FOR && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=NAMESPACE)||LA79_0==CONST||LA79_0==LBRACE||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||LA79_0==AT||(LA79_0>=XMLFragment && LA79_0<=XMLFragmentEnd)||LA79_0==StringLiteral||(LA79_0>=Identifier && LA79_0<=RegularExpressionLiteral)||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JS.g:1670:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6580);
            	    statement312=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement312.getTree());

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
    // JS.g:1677:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON314=null;
        identifier_return identifier313 = null;

        statement_return statement315 = null;


        Object COLON314_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1678:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1678:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6597);
            identifier313=identifier();
            _fsp--;

            stream_identifier.add(identifier313.getTree());
            COLON314=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6599); 
            stream_COLON.add(COLON314);

            pushFollow(FOLLOW_statement_in_labelledStatement6601);
            statement315=statement();
            _fsp--;

            stream_statement.add(statement315.getTree());

            // AST REWRITE
            // elements: statement, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1679:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1679:5: ^( LABELLED identifier statement )
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
    // JS.g:1701:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW316=null;
        expression_return expression317 = null;

        semic_return semic318 = null;


        Object THROW316_tree=null;

        try {
            // JS.g:1702:2: ( THROW expression semic )
            // JS.g:1702:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW316=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6632); 
            THROW316_tree = (Object)adaptor.create(THROW316);
            root_0 = (Object)adaptor.becomeRoot(THROW316_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6637);
            expression317=expression();
            _fsp--;

            adaptor.addChild(root_0, expression317.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6639);
            semic318=semic();
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
    // JS.g:1709:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY319=null;
        block_return block320 = null;

        catchClause_return catchClause321 = null;

        finallyClause_return finallyClause322 = null;

        finallyClause_return finallyClause323 = null;


        Object TRY319_tree=null;

        try {
            // JS.g:1710:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1710:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY319=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6656); 
            TRY319_tree = (Object)adaptor.create(TRY319);
            root_0 = (Object)adaptor.becomeRoot(TRY319_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6659);
            block320=block();
            _fsp--;

            adaptor.addChild(root_0, block320.getTree());
            // JS.g:1710:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
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
                    new NoViableAltException("1710:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // JS.g:1710:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1710:17: ( catchClause )+
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
                    	    // JS.g:1710:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6663);
                    	    catchClause321=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause321.getTree());

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

                    // JS.g:1710:30: ( finallyClause )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==FINALLY) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // JS.g:1710:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6666);
                            finallyClause322=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause322.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1710:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6671);
                    finallyClause323=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause323.getTree());

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
    // JS.g:1713:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH324=null;
        Token LPAREN325=null;
        Token RPAREN328=null;
        identifier_return identifier326 = null;

        catchFilter_return catchFilter327 = null;

        block_return block329 = null;


        Object CATCH324_tree=null;
        Object LPAREN325_tree=null;
        Object RPAREN328_tree=null;

        try {
            // JS.g:1714:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1714:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH324=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6685); 
            CATCH324_tree = (Object)adaptor.create(CATCH324);
            root_0 = (Object)adaptor.becomeRoot(CATCH324_tree, root_0);

            LPAREN325=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6688); 
            pushFollow(FOLLOW_identifier_in_catchClause6691);
            identifier326=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier326.getTree());
            // JS.g:1714:30: ( catchFilter )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IF) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // JS.g:1714:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6693);
                    catchFilter327=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter327.getTree());

                    }
                    break;

            }

            RPAREN328=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6696); 
            pushFollow(FOLLOW_block_in_catchClause6699);
            block329=block();
            _fsp--;

            adaptor.addChild(root_0, block329.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1717:1: catchFilter : IF expression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF330=null;
        expression_return expression331 = null;


        Object IF330_tree=null;

        try {
            // JS.g:1718:2: ( IF expression )
            // JS.g:1718:4: IF expression
            {
            root_0 = (Object)adaptor.nil();

            IF330=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6710); 
            IF330_tree = (Object)adaptor.create(IF330);
            adaptor.addChild(root_0, IF330_tree);

            pushFollow(FOLLOW_expression_in_catchFilter6712);
            expression331=expression();
            _fsp--;

            adaptor.addChild(root_0, expression331.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1721:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY332=null;
        block_return block333 = null;


        Object FINALLY332_tree=null;

        try {
            // JS.g:1722:2: ( FINALLY block )
            // JS.g:1722:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY332=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6724); 
            FINALLY332_tree = (Object)adaptor.create(FINALLY332);
            root_0 = (Object)adaptor.becomeRoot(FINALLY332_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6727);
            block333=block();
            _fsp--;

            adaptor.addChild(root_0, block333.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1735:1: functionDeclaration : FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION334=null;
        Token COLON336=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList335 = null;

        typeRef_return typeRef337 = null;

        functionBody_return functionBody338 = null;


        Object FUNCTION334_tree=null;
        Object COLON336_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1736:2: ( FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody ) )
            // JS.g:1736:4: FUNCTION name= identifier formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION334=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6748); 
            stream_FUNCTION.add(FUNCTION334);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6752);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6754);
            formalParameterList335=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList335.getTree());
            // JS.g:1736:49: ({...}? => COLON typeRef )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==COLON) && ( isTypeInformationEnabled() )) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // JS.g:1736:51: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON336=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionDeclaration6761); 
                    stream_COLON.add(COLON336);

                    pushFollow(FOLLOW_typeRef_in_functionDeclaration6763);
                    typeRef337=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef337.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionDeclaration6768);
            functionBody338=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody338.getTree());

            // AST REWRITE
            // elements: typeRef, functionBody, formalParameterList, name, COLON, FUNCTION
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1737:2: -> ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody )
            {
                // JS.g:1737:5: ^( FUNCTION $name formalParameterList ( COLON )? ( typeRef )? functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1737:43: ( COLON )?
                if ( stream_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_COLON.next());

                }
                stream_COLON.reset();
                // JS.g:1737:50: ( typeRef )?
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
    // JS.g:1740:1: functionExpression : FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION339=null;
        Token COLON341=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList340 = null;

        typeRef_return typeRef342 = null;

        functionBody_return functionBody343 = null;


        Object FUNCTION339_tree=null;
        Object COLON341_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1741:2: ( FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1741:4: FUNCTION (name= identifier )? formalParameterList ({...}? => COLON typeRef )? functionBody
            {
            FUNCTION339=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6801); 
            stream_FUNCTION.add(FUNCTION339);

            // JS.g:1741:17: (name= identifier )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EACH||(LA85_0>=GET && LA85_0<=SET)||(LA85_0>=WXML && LA85_0<=NAMESPACE)||LA85_0==Identifier) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // JS.g:1741:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6805);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6808);
            formalParameterList340=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList340.getTree());
            // JS.g:1741:50: ({...}? => COLON typeRef )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==COLON) && ( isTypeInformationEnabled() )) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // JS.g:1741:52: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "functionExpression", " isTypeInformationEnabled() ");
                    }
                    COLON341=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_functionExpression6815); 
                    stream_COLON.add(COLON341);

                    pushFollow(FOLLOW_typeRef_in_functionExpression6817);
                    typeRef342=typeRef();
                    _fsp--;

                    stream_typeRef.add(typeRef342.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_functionBody_in_functionExpression6822);
            functionBody343=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody343.getTree());

            // AST REWRITE
            // elements: formalParameterList, FUNCTION, name, functionBody
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1742:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1742:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1742:17: ( $name)?
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
    // JS.g:1745:1: formalParameter : identifier ({...}? => COLON typeRef )? ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON345=null;
        identifier_return identifier344 = null;

        typeRef_return typeRef346 = null;


        Object COLON345_tree=null;

        try {
            // JS.g:1746:2: ( identifier ({...}? => COLON typeRef )? )
            // JS.g:1746:4: identifier ({...}? => COLON typeRef )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameter6850);
            identifier344=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier344.getTree(), root_0);
            // JS.g:1746:16: ({...}? => COLON typeRef )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==COLON) && ( isTypeInformationEnabled() )) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // JS.g:1746:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "formalParameter", " isTypeInformationEnabled() ");
                    }
                    COLON345=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_formalParameter6858); 
                    COLON345_tree = (Object)adaptor.create(COLON345);
                    adaptor.addChild(root_0, COLON345_tree);

                    pushFollow(FOLLOW_typeRef_in_formalParameter6860);
                    typeRef346=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef346.getTree());

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
    // JS.g:1749:1: formalParameterList : LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN347=null;
        Token COMMA349=null;
        Token RPAREN351=null;
        formalParameter_return formalParameter348 = null;

        formalParameter_return formalParameter350 = null;


        Object LPAREN347_tree=null;
        Object COMMA349_tree=null;
        Object RPAREN351_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // JS.g:1750:2: ( LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) )
            // JS.g:1750:4: LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN
            {
            LPAREN347=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6874); 
            stream_LPAREN.add(LPAREN347);

            // JS.g:1750:11: ( formalParameter ( COMMA formalParameter )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==EACH||(LA89_0>=GET && LA89_0<=SET)||(LA89_0>=WXML && LA89_0<=NAMESPACE)||LA89_0==Identifier) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // JS.g:1750:13: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_formalParameterList6878);
                    formalParameter348=formalParameter();
                    _fsp--;

                    stream_formalParameter.add(formalParameter348.getTree());
                    // JS.g:1750:29: ( COMMA formalParameter )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMA) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // JS.g:1750:31: COMMA formalParameter
                    	    {
                    	    COMMA349=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6882); 
                    	    stream_COMMA.add(COMMA349);

                    	    pushFollow(FOLLOW_formalParameter_in_formalParameterList6884);
                    	    formalParameter350=formalParameter();
                    	    _fsp--;

                    	    stream_formalParameter.add(formalParameter350.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN351=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6892); 
            stream_RPAREN.add(RPAREN351);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1751:2: -> ^( ARGUMENTS ( formalParameter )* )
            {
                // JS.g:1751:5: ^( ARGUMENTS ( formalParameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // JS.g:1751:18: ( formalParameter )*
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
    // JS.g:1754:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE353=null;
        sourceElement_return sourceElement352 = null;


        Object lb_tree=null;
        Object RBRACE353_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
         pushState(JSParserRule.FUNCTION_BODY); 
        try {
            // JS.g:1756:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1756:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6922); 
            stream_LBRACE.add(lb);

            // JS.g:1756:14: ( sourceElement )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=NULL && LA90_0<=BREAK)||(LA90_0>=CONTINUE && LA90_0<=DO)||(LA90_0>=FOR && LA90_0<=IF)||(LA90_0>=NEW && LA90_0<=NAMESPACE)||LA90_0==CONST||LA90_0==LBRACE||LA90_0==LPAREN||LA90_0==LBRACK||LA90_0==SEMIC||(LA90_0>=ADD && LA90_0<=SUB)||(LA90_0>=INC && LA90_0<=DEC)||(LA90_0>=NOT && LA90_0<=INV)||LA90_0==AT||(LA90_0>=XMLFragment && LA90_0<=XMLFragmentEnd)||LA90_0==StringLiteral||(LA90_0>=Identifier && LA90_0<=RegularExpressionLiteral)||(LA90_0>=DecimalLiteral && LA90_0<=HexIntegerLiteral)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // JS.g:1756:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6924);
            	    sourceElement352=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement352.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            RBRACE353=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6927); 
            stream_RBRACE.add(RBRACE353);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1757:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1757:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1757:28: ( sourceElement )*
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
    // JS.g:1766:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN354=null;
        Token RPAREN355=null;
        identifier_return name = null;

        functionBody_return functionBody356 = null;


        Object get_tree=null;
        Object LPAREN354_tree=null;
        Object RPAREN355_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1767:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) )
            // JS.g:1767:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6964); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6968);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN354=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6970); 
            stream_LPAREN.add(LPAREN354);

            RPAREN355=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6972); 
            stream_RPAREN.add(RPAREN355);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6974);
            functionBody356=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody356.getTree());

            // AST REWRITE
            // elements: identifier, functionBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1768:4: -> ^( GETTER[$get] identifier functionBody )
            {
                // JS.g:1768:7: ^( GETTER[$get] identifier functionBody )
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
    // JS.g:1771:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN357=null;
        Token RPAREN358=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody359 = null;


        Object set_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN358_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1772:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) )
            // JS.g:1772:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration7005); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7009);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN357=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration7011); 
            stream_LPAREN.add(LPAREN357);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7015);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN358=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration7017); 
            stream_RPAREN.add(RPAREN358);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration7019);
            functionBody359=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody359.getTree());

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
            // 1773:5: -> ^( SETTER[$set] $name $param functionBody )
            {
                // JS.g:1773:8: ^( SETTER[$set] $name $param functionBody )
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
    // JS.g:1780:1: program : sourceElementSync ( sourceElement sourceElementSync )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF363=null;
        sourceElementSync_return sourceElementSync360 = null;

        sourceElement_return sourceElement361 = null;

        sourceElementSync_return sourceElementSync362 = null;


        Object EOF363_tree=null;

         pushState(JSParserRule.PROGRAM); 
        try {
            // JS.g:1782:2: ( sourceElementSync ( sourceElement sourceElementSync )* EOF )
            // JS.g:1782:4: sourceElementSync ( sourceElement sourceElementSync )* EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sourceElementSync_in_program7060);
            sourceElementSync360=sourceElementSync();
            _fsp--;

            adaptor.addChild(root_0, sourceElementSync360.getTree());
            // JS.g:1782:22: ( sourceElement sourceElementSync )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=NULL && LA91_0<=BREAK)||(LA91_0>=CONTINUE && LA91_0<=DO)||(LA91_0>=FOR && LA91_0<=IF)||(LA91_0>=NEW && LA91_0<=NAMESPACE)||LA91_0==CONST||LA91_0==LBRACE||LA91_0==LPAREN||LA91_0==LBRACK||LA91_0==SEMIC||(LA91_0>=ADD && LA91_0<=SUB)||(LA91_0>=INC && LA91_0<=DEC)||(LA91_0>=NOT && LA91_0<=INV)||LA91_0==AT||(LA91_0>=XMLFragment && LA91_0<=XMLFragmentEnd)||LA91_0==StringLiteral||(LA91_0>=Identifier && LA91_0<=RegularExpressionLiteral)||(LA91_0>=DecimalLiteral && LA91_0<=HexIntegerLiteral)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // JS.g:1782:23: sourceElement sourceElementSync
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program7063);
            	    sourceElement361=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement361.getTree());
            	    pushFollow(FOLLOW_sourceElementSync_in_program7065);
            	    sourceElementSync362=sourceElementSync();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElementSync362.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            EOF363=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program7069); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException re) {
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
    // JS.g:1785:1: sourceElementSync : ;
    public final sourceElementSync_return sourceElementSync() throws RecognitionException {
        sourceElementSync_return retval = new sourceElementSync_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        
        	syncToSet();

        try {
            // JS.g:1789:2: ()
            // JS.g:1790:3: 
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
    // JS.g:1797:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration364 = null;

        statement_return statement365 = null;



        try {
            // JS.g:1802:2: ({...}? functionDeclaration | statement )
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
                        new NoViableAltException("1797:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 92, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA92_0>=NULL && LA92_0<=BREAK)||(LA92_0>=CONTINUE && LA92_0<=DO)||(LA92_0>=FOR && LA92_0<=EACH)||LA92_0==IF||(LA92_0>=NEW && LA92_0<=NAMESPACE)||LA92_0==CONST||LA92_0==LBRACE||LA92_0==LPAREN||LA92_0==LBRACK||LA92_0==SEMIC||(LA92_0>=ADD && LA92_0<=SUB)||(LA92_0>=INC && LA92_0<=DEC)||(LA92_0>=NOT && LA92_0<=INV)||LA92_0==AT||(LA92_0>=XMLFragment && LA92_0<=XMLFragmentEnd)||LA92_0==StringLiteral||(LA92_0>=Identifier && LA92_0<=RegularExpressionLiteral)||(LA92_0>=DecimalLiteral && LA92_0<=HexIntegerLiteral)) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1797:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // JS.g:1802:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement7114);
                    functionDeclaration364=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration364.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1803:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement7119);
                    statement365=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement365.getTree());

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
    public static final BitSet FOLLOW_newExpressionTail_in_newExpression4001 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4143 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4145 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4168 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4170 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4189 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4191 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_memberExpression_in_newExpressionTail4250 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_newExpressionTail4271 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_newExpressionTail4275 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_newExpressionTail4298 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4300 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_newExpressionTail4323 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4325 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_newExpressionTail4344 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4346 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_newExpressionTail4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4443 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4498 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4580 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4582 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4584 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4586 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_namespaceStatement4588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4622 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4626 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4641 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4663 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4693 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4697 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4712 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4731 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4735 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4762 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4776 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4780 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4803 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4822 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4826 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4845 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4859 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4863 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4882 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4902 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4906 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4909 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4923 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4927 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4930 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4946 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4950 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4953 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4969 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4973 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4976 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4991 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4995 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4998 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5013 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn5017 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5020 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5039 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression5043 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5046 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5060 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn5064 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5067 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5082 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression5086 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5089 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5104 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn5108 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5111 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression5130 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression5134 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5137 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5139 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5156 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn5160 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5163 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn5165 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5196 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5203 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5284 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5291 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5320 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5365 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5572 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_block5574 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5606 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5612 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeRef5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5658 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration5666 = new BitSet(new long[]{0x0000003600020002L,0x0000010000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclaration5668 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5675 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5692 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclarationNoIn5700 = new BitSet(new long[]{0x0000003600020002L,0x0000010000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclarationNoIn5702 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5709 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5726 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5732 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5814 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5818 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5820 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5826 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5888 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5890 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5894 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5928 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5933 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5953 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5957 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5961 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement6012 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement6015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement6017 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar6052 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6054 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar6066 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar6114 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6121 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6128 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6198 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6213 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6263 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6270 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6333 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6340 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0002030000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0002030000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6452 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012E0L,0x01C60B0000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6480 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6485 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6506 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6512 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6516 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6520 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6553 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6556 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6558 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6561 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6574 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6577 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6580 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6597 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6599 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6632 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000030000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6659 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6663 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6688 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6691 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6710 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_expression_in_catchFilter6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6748 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6754 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionDeclaration6761 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000020L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionDeclaration6763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6801 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000080L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6808 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_COLON_in_functionExpression6815 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000020L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_functionExpression6817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameter6850 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_formalParameter6858 = new BitSet(new long[]{0x0000003600020002L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_typeRef_in_formalParameter6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6874 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000100L,0x0002000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6882 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList6884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6922 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6924 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6964 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration7005 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration7011 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration7017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7060 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_sourceElement_in_program7063 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7065 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x01C6080000000000L});
    public static final BitSet FOLLOW_EOF_in_program7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement7119 = new BitSet(new long[]{0x0000000000000002L});

}
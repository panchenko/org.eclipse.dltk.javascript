// $ANTLR 3.0.1 JS.g 2013-01-09 19:56:02

package org.eclipse.dltk.javascript.parser;

import org.eclipse.dltk.javascript.parser.JavaScriptParser.JSBaseParser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

@SuppressWarnings({"cast","unused","rawtypes","unchecked","null"})
public class JSParser extends JSBaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "AT", "DOTDOT", "COLONCOLON", "XMLFragment", "XMLFragmentEnd", "XMLFragmentError", "CALL_ARGUMENTS", "ARGUMENTS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "FOREACH", "GETTER", "SETTER", "DEFAULT_XML_NAMESPACE", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XmlAttribute", "XML_LITERAL", "EMPTY_STATEMENT", "FUNCTION_DECLARATION", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "UnicodeFormatCategory", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminatorChar", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int PACKAGE=58;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=157;
    public static final int RegularExpressionChar=195;
    public static final int LOCALNAME=130;
    public static final int XMLFragmentEnd=121;
    public static final int MOD=89;
    public static final int SHL=92;
    public static final int CONST=43;
    public static final int DO=13;
    public static final int DQUOTE=154;
    public static final int LineTerminatorChar=168;
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
    public static final int EOL=170;
    public static final int OctalDigit=181;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int GET=33;
    public static final int WhiteSpace=163;
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
    public static final int OctalEscapeSequence=189;
    public static final int RegularExpressionFirstChar=194;
    public static final int TYPEOF=28;
    public static final int GT=79;
    public static final int CALL=131;
    public static final int CharacterEscapeSequence=187;
    public static final int LAND=100;
    public static final int PINC=147;
    public static final int PROTECTED=60;
    public static final int UnicodeFormatCategory=162;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int SUB=87;
    public static final int RegularExpressionLiteral=180;
    public static final int FLOAT=50;
    public static final int DecimalIntegerLiteral=183;
    public static final int HexDigit=174;
    public static final int LPAREN=71;
    public static final int AT=117;
    public static final int IMPLEMENTS=52;
    public static final int YIELD=35;
    public static final int SHRASS=110;
    public static final int PS=167;
    public static final int MultiLineComment=171;
    public static final int ADD=86;
    public static final int ZeroToThree=188;
    public static final int ITEM=140;
    public static final int UnicodeEscapeSequence=191;
    public static final int SHUASS=111;
    public static final int SHORT=62;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=155;
    public static final int SAME=84;
    public static final int COLON=103;
    public static final int StringLiteral=173;
    public static final int XMLFragment=120;
    public static final int PAREXPR=145;
    public static final int ENUM=46;
    public static final int CALL_ARGUMENTS=123;
    public static final int NBSP=160;
    public static final int HexIntegerLiteral=186;
    public static final int SP=159;
    public static final int BLOCK=126;
    public static final int LineTerminator=169;
    public static final int INTERFACE=55;
    public static final int DIV=115;
    public static final int FUNCTION_DECLARATION=152;
    public static final int LONG=56;
    public static final int CR=165;
    public static final int PUBLIC=61;
    public static final int LOR=101;
    public static final int LT=78;
    public static final int WHILE=31;
    public static final int BackslashSequence=193;
    public static final int LS=166;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=41;
    public static final int DecimalDigit=176;
    public static final int BYFIELD=127;
    public static final int BREAK=7;
    public static final int Identifier=179;
    public static final int WXML=36;
    public static final int POS=148;
    public static final int DOUBLE=45;
    public static final int ExponentPart=182;
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
    public static final int IdentifierStartASCII=175;
    public static final int TRY=27;
    public static final int NAMESPACE=37;
    public static final int SHLASS=109;
    public static final int COLONCOLON=119;
    public static final int USP=161;
    public static final int ANDASS=112;
    public static final int EMPTY_STATEMENT=151;
    public static final int IdentifierNameASCIIStart=178;
    public static final int QUE=102;
    public static final int OR=96;
    public static final int SETTER=138;
    public static final int DEBUGGER=44;
    public static final int FOREACH=136;
    public static final int PDEC=146;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=192;
    public static final int THROW=26;
    public static final int MULASS=107;
    public static final int XmlAttribute=149;
    public static final int DEC=91;
    public static final int OctalIntegerLiteral=185;
    public static final int CLASS=42;
    public static final int HexEscapeSequence=190;
    public static final int ORASS=113;
    public static final int NAMEDVALUE=142;
    public static final int SingleLineComment=172;
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
    public static final int IdentifierPart=177;
    public static final int WITH=32;
    public static final int BYTE=40;
    public static final int XOR=97;
    public static final int VOLATILE=68;
    public static final int GETTER=137;
    public static final int NSAME=85;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=129;
    public static final int TAB=156;
    public static final int DecimalLiteral=184;
    public static final int TRUE=5;
    public static final int NEQ=83;
    public static final int FINALLY=15;
    public static final int NEG=143;
    public static final int ASSIGN=104;
    public static final int XML_LITERAL=150;
    public static final int SEMIC=76;
    public static final int EXTENDS=48;
    public static final int BSLASH=153;
    public static final int LF=164;

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
    // JS.g:599:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute );
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
            // JS.g:600:2: ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute )
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
                    new NoViableAltException("599:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | NULL | booleanLiteral | numericLiteral | StringLiteral | xmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:600:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1981);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:601:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1986);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:602:4: XMLFragment
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragment3=(Token)input.LT(1);
                    match(input,XMLFragment,FOLLOW_XMLFragment_in_token1991); 
                    XMLFragment3_tree = (Object)adaptor.create(XMLFragment3);
                    adaptor.addChild(root_0, XMLFragment3_tree);


                    }
                    break;
                case 4 :
                    // JS.g:603:4: XMLFragmentEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragmentEnd4=(Token)input.LT(1);
                    match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_token1996); 
                    XMLFragmentEnd4_tree = (Object)adaptor.create(XMLFragmentEnd4);
                    adaptor.addChild(root_0, XMLFragmentEnd4_tree);


                    }
                    break;
                case 5 :
                    // JS.g:604:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token2001);
                    punctuator5=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator5.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:605:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL6=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_token2006); 
                    NULL6_tree = (Object)adaptor.create(NULL6);
                    adaptor.addChild(root_0, NULL6_tree);


                    }
                    break;
                case 7 :
                    // JS.g:606:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_token2011);
                    booleanLiteral7=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral7.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:607:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token2016);
                    numericLiteral8=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral8.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:608:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral9=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token2021); 
                    StringLiteral9_tree = (Object)adaptor.create(StringLiteral9);
                    adaptor.addChild(root_0, StringLiteral9_tree);


                    }
                    break;
                case 10 :
                    // JS.g:609:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_token2026);
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
    // JS.g:614:1: reservedWord : keyword ;
    public final reservedWord_return reservedWord() throws RecognitionException {
        reservedWord_return retval = new reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        keyword_return keyword11 = null;



        try {
            // JS.g:615:2: ( keyword )
            // JS.g:615:4: keyword
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_keyword_in_reservedWord2039);
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
    // JS.g:622:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // JS.g:623:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
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
    // JS.g:660:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:661:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
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
    // JS.g:733:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier );
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
            // JS.g:734:3: ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier )
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
                    new NoViableAltException("733:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | word= futureReservedWord -> Identifier[word.start] | Identifier );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:734:5: WXML
                    {
                    root_0 = (Object)adaptor.nil();

                    WXML14=(Token)input.LT(1);
                    match(input,WXML,FOLLOW_WXML_in_identifier2493); 
                    WXML14_tree = (Object)adaptor.create(WXML14);
                    adaptor.addChild(root_0, WXML14_tree);


                    }
                    break;
                case 2 :
                    // JS.g:735:5: GET
                    {
                    root_0 = (Object)adaptor.nil();

                    GET15=(Token)input.LT(1);
                    match(input,GET,FOLLOW_GET_in_identifier2499); 
                    GET15_tree = (Object)adaptor.create(GET15);
                    adaptor.addChild(root_0, GET15_tree);


                    }
                    break;
                case 3 :
                    // JS.g:736:5: SET
                    {
                    root_0 = (Object)adaptor.nil();

                    SET16=(Token)input.LT(1);
                    match(input,SET,FOLLOW_SET_in_identifier2505); 
                    SET16_tree = (Object)adaptor.create(SET16);
                    adaptor.addChild(root_0, SET16_tree);


                    }
                    break;
                case 4 :
                    // JS.g:737:5: EACH
                    {
                    root_0 = (Object)adaptor.nil();

                    EACH17=(Token)input.LT(1);
                    match(input,EACH,FOLLOW_EACH_in_identifier2511); 
                    EACH17_tree = (Object)adaptor.create(EACH17);
                    adaptor.addChild(root_0, EACH17_tree);


                    }
                    break;
                case 5 :
                    // JS.g:738:5: NAMESPACE
                    {
                    root_0 = (Object)adaptor.nil();

                    NAMESPACE18=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_identifier2517); 
                    NAMESPACE18_tree = (Object)adaptor.create(NAMESPACE18);
                    adaptor.addChild(root_0, NAMESPACE18_tree);


                    }
                    break;
                case 6 :
                    // JS.g:739:5: word= futureReservedWord
                    {
                    pushFollow(FOLLOW_futureReservedWord_in_identifier2525);
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
                    // 739:68: -> Identifier[word.start]
                    {
                        adaptor.addChild(root_0, adaptor.create(Identifier, word.start));

                    }



                    }
                    break;
                case 7 :
                    // JS.g:740:5: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier19=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_identifier2538); 
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
    // JS.g:743:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) | AT LBRACK expression RBRACK -> ^( XmlAttribute LBRACK expression ) );
    public final xmlAttribute_return xmlAttribute() throws RecognitionException {
        xmlAttribute_return retval = new xmlAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT20=null;
        Token AT22=null;
        Token MUL23=null;
        Token AT24=null;
        Token LBRACK25=null;
        Token RBRACK27=null;
        identifier_return identifier21 = null;

        expression_return expression26 = null;


        Object AT20_tree=null;
        Object AT22_tree=null;
        Object MUL23_tree=null;
        Object AT24_tree=null;
        Object LBRACK25_tree=null;
        Object RBRACK27_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:744:3: ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) | AT LBRACK expression RBRACK -> ^( XmlAttribute LBRACK expression ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==AT) ) {
                switch ( input.LA(2) ) {
                case LBRACK:
                    {
                    alt3=3;
                    }
                    break;
                case MUL:
                    {
                    alt3=2;
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
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("743:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) | AT LBRACK expression RBRACK -> ^( XmlAttribute LBRACK expression ) );", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("743:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) | AT LBRACK expression RBRACK -> ^( XmlAttribute LBRACK expression ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // JS.g:744:5: AT identifier
                    {
                    AT20=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2549); 
                    stream_AT.add(AT20);

                    pushFollow(FOLLOW_identifier_in_xmlAttribute2551);
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
                    // 744:19: -> ^( XmlAttribute AT identifier )
                    {
                        // JS.g:744:22: ^( XmlAttribute AT identifier )
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
                    // JS.g:745:5: AT MUL
                    {
                    AT22=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2567); 
                    stream_AT.add(AT22);

                    MUL23=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_xmlAttribute2569); 
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
                    // 745:12: -> ^( XmlAttribute AT MUL )
                    {
                        // JS.g:745:15: ^( XmlAttribute AT MUL )
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
                case 3 :
                    // JS.g:746:5: AT LBRACK expression RBRACK
                    {
                    AT24=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2585); 
                    stream_AT.add(AT24);

                    LBRACK25=(Token)input.LT(1);
                    match(input,LBRACK,FOLLOW_LBRACK_in_xmlAttribute2587); 
                    stream_LBRACK.add(LBRACK25);

                    pushFollow(FOLLOW_expression_in_xmlAttribute2589);
                    expression26=expression();
                    _fsp--;

                    stream_expression.add(expression26.getTree());
                    RBRACK27=(Token)input.LT(1);
                    match(input,RBRACK,FOLLOW_RBRACK_in_xmlAttribute2591); 
                    stream_RBRACK.add(RBRACK27);


                    // AST REWRITE
                    // elements: expression, LBRACK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 746:33: -> ^( XmlAttribute LBRACK expression )
                    {
                        // JS.g:746:36: ^( XmlAttribute LBRACK expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(XmlAttribute, "XmlAttribute"), root_1);

                        adaptor.addChild(root_1, stream_LBRACK.next());
                        adaptor.addChild(root_1, stream_expression.next());

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

    public static class propertySelector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start propertySelector
    // JS.g:749:1: propertySelector : ( identifier | MUL );
    public final propertySelector_return propertySelector() throws RecognitionException {
        propertySelector_return retval = new propertySelector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL29=null;
        identifier_return identifier28 = null;


        Object MUL29_tree=null;

        try {
            // JS.g:750:2: ( identifier | MUL )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EACH||(LA4_0>=GET && LA4_0<=SET)||(LA4_0>=WXML && LA4_0<=CLASS)||(LA4_0>=DEBUGGER && LA4_0<=VOLATILE)||LA4_0==Identifier) ) {
                alt4=1;
            }
            else if ( (LA4_0==MUL) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("749:1: propertySelector : ( identifier | MUL );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // JS.g:750:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertySelector2613);
                    identifier28=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier28.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:751:4: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL29=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_propertySelector2618); 
                    MUL29_tree = (Object)adaptor.create(MUL29);
                    adaptor.addChild(root_0, MUL29_tree);


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
    // $ANTLR end propertySelector

    public static class punctuator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start punctuator
    // JS.g:758:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // JS.g:759:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set30=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS)||(input.LA(1)>=DOTDOT && input.LA(1)<=COLONCOLON) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set30));
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
    // JS.g:815:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | {...}? => xmlLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL31=null;
        Token StringLiteral34=null;
        Token RegularExpressionLiteral35=null;
        booleanLiteral_return booleanLiteral32 = null;

        numericLiteral_return numericLiteral33 = null;

        xmlLiteral_return xmlLiteral36 = null;


        Object NULL31_tree=null;
        Object StringLiteral34_tree=null;
        Object RegularExpressionLiteral35_tree=null;

        try {
            // JS.g:816:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | {...}? => xmlLiteral )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NULL) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=TRUE && LA5_0<=FALSE)) ) {
                alt5=2;
            }
            else if ( ((LA5_0>=DecimalLiteral && LA5_0<=HexIntegerLiteral)) ) {
                alt5=3;
            }
            else if ( (LA5_0==StringLiteral) ) {
                alt5=4;
            }
            else if ( (LA5_0==RegularExpressionLiteral) ) {
                alt5=5;
            }
            else if ( ((LA5_0>=XMLFragment && LA5_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt5=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("815:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | {...}? => xmlLiteral );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // JS.g:816:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL31=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2893); 
                    NULL31_tree = (Object)adaptor.create(NULL31);
                    adaptor.addChild(root_0, NULL31_tree);


                    }
                    break;
                case 2 :
                    // JS.g:817:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2898);
                    booleanLiteral32=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral32.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:818:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2903);
                    numericLiteral33=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral33.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:819:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral34=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2908); 
                    StringLiteral34_tree = (Object)adaptor.create(StringLiteral34);
                    adaptor.addChild(root_0, StringLiteral34_tree);


                    }
                    break;
                case 5 :
                    // JS.g:820:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral35=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2913); 
                    RegularExpressionLiteral35_tree = (Object)adaptor.create(RegularExpressionLiteral35);
                    adaptor.addChild(root_0, RegularExpressionLiteral35_tree);


                    }
                    break;
                case 6 :
                    // JS.g:821:4: {...}? => xmlLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "literal", " isXmlEnabled() ");
                    }
                    pushFollow(FOLLOW_xmlLiteral_in_literal2921);
                    xmlLiteral36=xmlLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, xmlLiteral36.getTree());

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
    // JS.g:824:1: xmlLiteral : ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) ;
    public final xmlLiteral_return xmlLiteral() throws RecognitionException {
        xmlLiteral_return retval = new xmlLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLFragment37=null;
        Token LBRACE38=null;
        Token RBRACE40=null;
        Token XMLFragmentEnd41=null;
        expression_return expression39 = null;


        Object XMLFragment37_tree=null;
        Object LBRACE38_tree=null;
        Object RBRACE40_tree=null;
        Object XMLFragmentEnd41_tree=null;
        RewriteRuleTokenStream stream_XMLFragment=new RewriteRuleTokenStream(adaptor,"token XMLFragment");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_XMLFragmentEnd=new RewriteRuleTokenStream(adaptor,"token XMLFragmentEnd");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:825:2: ( ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) )
            // JS.g:825:4: ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd
            {
            // JS.g:825:4: ( XMLFragment LBRACE expression RBRACE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==XMLFragment) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // JS.g:826:6: XMLFragment LBRACE expression RBRACE
            	    {
            	    XMLFragment37=(Token)input.LT(1);
            	    match(input,XMLFragment,FOLLOW_XMLFragment_in_xmlLiteral2939); 
            	    stream_XMLFragment.add(XMLFragment37);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_EXPRESSION); 
            	    LBRACE38=(Token)input.LT(1);
            	    match(input,LBRACE,FOLLOW_LBRACE_in_xmlLiteral2956); 
            	    stream_LBRACE.add(LBRACE38);

            	    pushFollow(FOLLOW_expression_in_xmlLiteral2958);
            	    expression39=expression();
            	    _fsp--;

            	    stream_expression.add(expression39.getTree());
            	    RBRACE40=(Token)input.LT(1);
            	    match(input,RBRACE,FOLLOW_RBRACE_in_xmlLiteral2960); 
            	    stream_RBRACE.add(RBRACE40);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_XML); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            XMLFragmentEnd41=(Token)input.LT(1);
            match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_xmlLiteral2976); 
            stream_XMLFragmentEnd.add(XMLFragmentEnd41);


            // AST REWRITE
            // elements: XMLFragment, XMLFragmentEnd, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 831:4: -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
            {
                // JS.g:831:7: ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);

                // JS.g:831:21: ( XMLFragment )*
                while ( stream_XMLFragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_XMLFragment.next());

                }
                stream_XMLFragment.reset();
                // JS.g:831:34: ( expression )*
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
    // JS.g:855:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;

        Object set42_tree=null;

        try {
            // JS.g:856:2: ( TRUE | FALSE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set42=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set42));
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
    // JS.g:902:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set43=null;

        Object set43_tree=null;

        try {
            // JS.g:903:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set43=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set43));
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
    // JS.g:992:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS44=null;
        identifier_return identifier45 = null;

        xmlAttribute_return xmlAttribute46 = null;

        literal_return literal47 = null;

        arrayLiteral_return arrayLiteral48 = null;

        objectLiteral_return objectLiteral49 = null;

        parenExpression_return parenExpression50 = null;


        Object THIS44_tree=null;

        try {
            // JS.g:993:2: ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
            int alt7=7;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==THIS) ) {
                alt7=1;
            }
            else if ( (LA7_0==EACH||(LA7_0>=GET && LA7_0<=SET)||(LA7_0>=WXML && LA7_0<=CLASS)||(LA7_0>=DEBUGGER && LA7_0<=VOLATILE)||LA7_0==Identifier) ) {
                alt7=2;
            }
            else if ( (LA7_0==AT) ) {
                alt7=3;
            }
            else if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==StringLiteral||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                alt7=4;
            }
            else if ( ((LA7_0>=XMLFragment && LA7_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt7=4;
            }
            else if ( (LA7_0==LBRACK) ) {
                alt7=5;
            }
            else if ( (LA7_0==LBRACE) ) {
                alt7=6;
            }
            else if ( (LA7_0==LPAREN) ) {
                alt7=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("992:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // JS.g:993:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS44=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3766); 
                    THIS44_tree = (Object)adaptor.create(THIS44);
                    adaptor.addChild(root_0, THIS44_tree);


                    }
                    break;
                case 2 :
                    // JS.g:994:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3771);
                    identifier45=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier45.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:995:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_primaryExpression3776);
                    xmlAttribute46=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute46.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:996:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3781);
                    literal47=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal47.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:997:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3786);
                    arrayLiteral48=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral48.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:998:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3791);
                    objectLiteral49=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral49.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:999:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3796);
                    parenExpression50=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression50.getTree());

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
    // JS.g:1002:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN ) ;
    public final parenExpression_return parenExpression() throws RecognitionException {
        parenExpression_return retval = new parenExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token RPAREN52=null;
        expression_return expression51 = null;


        Object lpar_tree=null;
        Object RPAREN52_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1003:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN ) )
            // JS.g:1003:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3812); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3814);
            expression51=expression();
            _fsp--;

            stream_expression.add(expression51.getTree());
            RPAREN52=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3816); 
            stream_RPAREN.add(RPAREN52);


            // AST REWRITE
            // elements: RPAREN, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1003:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN )
            {
                // JS.g:1003:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression RPAREN )
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
    // JS.g:1006:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? rb= RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token rb=null;
        Token COMMA54=null;
        arrayItem_return arrayItem53 = null;

        arrayItem_return arrayItem55 = null;


        Object lb_tree=null;
        Object rb_tree=null;
        Object COMMA54_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:1007:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? rb= RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb) )
            // JS.g:1007:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? rb= RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3843); 
            stream_LBRACK.add(lb);

            // JS.g:1007:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=NULL && LA10_0<=FALSE)||LA10_0==EACH||LA10_0==THIS||(LA10_0>=GET && LA10_0<=SET)||(LA10_0>=WXML && LA10_0<=CLASS)||(LA10_0>=DEBUGGER && LA10_0<=VOLATILE)||LA10_0==AT||LA10_0==StringLiteral||(LA10_0>=Identifier && LA10_0<=RegularExpressionLiteral)||(LA10_0>=DecimalLiteral && LA10_0<=HexIntegerLiteral)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=XMLFragment && LA10_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt10=1;
            }
            else if ( (LA10_0==DELETE||LA10_0==FUNCTION||LA10_0==NEW||LA10_0==TYPEOF||LA10_0==VOID||LA10_0==YIELD||LA10_0==LBRACE||LA10_0==LPAREN||LA10_0==LBRACK||LA10_0==COMMA||(LA10_0>=ADD && LA10_0<=SUB)||(LA10_0>=INC && LA10_0<=DEC)||(LA10_0>=NOT && LA10_0<=INV)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RBRACK) ) {
                int LA10_4 = input.LA(2);

                if ( ( input.LA(1) == COMMA ) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1007:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3847);
                    arrayItem53=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem53.getTree());
                    // JS.g:1007:26: ( COMMA ( arrayItem )? )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // JS.g:1007:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA54=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3851); 
                    	    stream_COMMA.add(COMMA54);

                    	    // JS.g:1007:34: ( arrayItem )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( ((LA8_0>=NULL && LA8_0<=FALSE)||LA8_0==EACH||LA8_0==THIS||(LA8_0>=GET && LA8_0<=SET)||(LA8_0>=WXML && LA8_0<=CLASS)||(LA8_0>=DEBUGGER && LA8_0<=VOLATILE)||LA8_0==AT||LA8_0==StringLiteral||(LA8_0>=Identifier && LA8_0<=RegularExpressionLiteral)||(LA8_0>=DecimalLiteral && LA8_0<=HexIntegerLiteral)) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( ((LA8_0>=XMLFragment && LA8_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==DELETE||LA8_0==FUNCTION||LA8_0==NEW||LA8_0==TYPEOF||LA8_0==VOID||LA8_0==YIELD||LA8_0==LBRACE||LA8_0==LPAREN||LA8_0==LBRACK||(LA8_0>=ADD && LA8_0<=SUB)||(LA8_0>=INC && LA8_0<=DEC)||(LA8_0>=NOT && LA8_0<=INV)) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==RBRACK) ) {
                    	        int LA8_4 = input.LA(2);

                    	        if ( ( input.LA(1) == COMMA ) ) {
                    	            alt8=1;
                    	        }
                    	    }
                    	    else if ( (LA8_0==COMMA) ) {
                    	        int LA8_5 = input.LA(2);

                    	        if ( ( input.LA(1) == COMMA ) ) {
                    	            alt8=1;
                    	        }
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // JS.g:1007:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3853);
                    	            arrayItem55=arrayItem();
                    	            _fsp--;

                    	            stream_arrayItem.add(arrayItem55.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            rb=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3864); 
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
            // 1008:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb)
            {
                // JS.g:1008:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* $rb)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:1008:28: ( arrayItem )*
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
    // JS.g:1011:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1012:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:1012:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:1012:4: (expr= assignmentExpression | {...}?)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=NULL && LA11_0<=FALSE)||LA11_0==EACH||LA11_0==THIS||(LA11_0>=GET && LA11_0<=SET)||(LA11_0>=WXML && LA11_0<=CLASS)||(LA11_0>=DEBUGGER && LA11_0<=VOLATILE)||LA11_0==AT||LA11_0==StringLiteral||(LA11_0>=Identifier && LA11_0<=RegularExpressionLiteral)||(LA11_0>=DecimalLiteral && LA11_0<=HexIntegerLiteral)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=XMLFragment && LA11_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt11=1;
            }
            else if ( (LA11_0==DELETE||LA11_0==FUNCTION||LA11_0==NEW||LA11_0==TYPEOF||LA11_0==VOID||LA11_0==YIELD||LA11_0==LBRACE||LA11_0==LPAREN||LA11_0==LBRACK||(LA11_0>=ADD && LA11_0<=SUB)||(LA11_0>=INC && LA11_0<=DEC)||(LA11_0>=NOT && LA11_0<=INV)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RBRACK||LA11_0==COMMA) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1012:4: (expr= assignmentExpression | {...}?)", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // JS.g:1012:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3894);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1012:34: {...}?
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
            // 1013:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1013:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1013:13: ( $expr)?
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
    // JS.g:1016:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA57=null;
        Token COMMA59=null;
        Token RBRACE60=null;
        objectPropertyInitializer_return objectPropertyInitializer56 = null;

        objectPropertyInitializer_return objectPropertyInitializer58 = null;


        Object lb_tree=null;
        Object COMMA57_tree=null;
        Object COMMA59_tree=null;
        Object RBRACE60_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:1017:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* ) )
            // JS.g:1017:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3926); 
            stream_LBRACE.add(lb);

            // JS.g:1017:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EACH||(LA14_0>=GET && LA14_0<=SET)||(LA14_0>=WXML && LA14_0<=CLASS)||(LA14_0>=DEBUGGER && LA14_0<=VOLATILE)||LA14_0==AT||LA14_0==StringLiteral||LA14_0==Identifier||(LA14_0>=DecimalLiteral && LA14_0<=HexIntegerLiteral)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // JS.g:1017:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3930);
                    objectPropertyInitializer56=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer56.getTree());
                    // JS.g:1017:42: ( COMMA objectPropertyInitializer )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==EACH||(LA12_1>=GET && LA12_1<=SET)||(LA12_1>=WXML && LA12_1<=CLASS)||(LA12_1>=DEBUGGER && LA12_1<=VOLATILE)||LA12_1==AT||LA12_1==StringLiteral||LA12_1==Identifier||(LA12_1>=DecimalLiteral && LA12_1<=HexIntegerLiteral)) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // JS.g:1017:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA57=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3934); 
                    	    stream_COMMA.add(COMMA57);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3936);
                    	    objectPropertyInitializer58=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer58.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // JS.g:1017:79: ( COMMA )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==COMMA) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // JS.g:1017:79: COMMA
                            {
                            COMMA59=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3941); 
                            stream_COMMA.add(COMMA59);


                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE60=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3946); 
            stream_RBRACE.add(RBRACE60);


            // AST REWRITE
            // elements: COMMA, objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1018:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
            {
                // JS.g:1018:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ( COMMA )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1018:30: ( objectPropertyInitializer )*
                while ( stream_objectPropertyInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectPropertyInitializer.next());

                }
                stream_objectPropertyInitializer.reset();
                // JS.g:1018:57: ( COMMA )*
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
    // JS.g:1021:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair61 = null;

        getMethodDeclaration_return getMethodDeclaration62 = null;

        setMethodDeclaration_return setMethodDeclaration63 = null;



        try {
            // JS.g:1022:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt15=3;
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
                alt15=1;
                }
                break;
            case GET:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==COLON) ) {
                    alt15=1;
                }
                else if ( (LA15_2==EACH||(LA15_2>=GET && LA15_2<=SET)||(LA15_2>=WXML && LA15_2<=CLASS)||(LA15_2>=DEBUGGER && LA15_2<=VOLATILE)||LA15_2==Identifier) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1021:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case SET:
                {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==COLON) ) {
                    alt15=1;
                }
                else if ( (LA15_3==EACH||(LA15_3>=GET && LA15_3<=SET)||(LA15_3>=WXML && LA15_3<=CLASS)||(LA15_3>=DEBUGGER && LA15_3<=VOLATILE)||LA15_3==Identifier) ) {
                    alt15=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1021:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1021:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // JS.g:1022:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3973);
                    nameValuePair61=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair61.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1023:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3980);
                    getMethodDeclaration62=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration62.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1024:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3986);
                    setMethodDeclaration63=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration63.getTree());

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
    // JS.g:1027:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON65=null;
        propertyName_return propertyName64 = null;

        assignmentExpression_return assignmentExpression66 = null;


        Object COLON65_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1028:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1028:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3999);
            propertyName64=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName64.getTree());
            COLON65=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair4001); 
            stream_COLON.add(COLON65);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair4003);
            assignmentExpression66=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression66.getTree());

            // AST REWRITE
            // elements: propertyName, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1029:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1029:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // JS.g:1032:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral68=null;
        identifier_return identifier67 = null;

        numericLiteral_return numericLiteral69 = null;

        xmlAttribute_return xmlAttribute70 = null;


        Object StringLiteral68_tree=null;

        try {
            // JS.g:1033:2: ( identifier | StringLiteral | numericLiteral | xmlAttribute )
            int alt16=4;
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
                alt16=1;
                }
                break;
            case StringLiteral:
                {
                alt16=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt16=3;
                }
                break;
            case AT:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1032:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // JS.g:1033:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName4027);
                    identifier67=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier67.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1034:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral68=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName4032); 
                    StringLiteral68_tree = (Object)adaptor.create(StringLiteral68);
                    adaptor.addChild(root_0, StringLiteral68_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1035:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName4037);
                    numericLiteral69=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral69.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1036:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_propertyName4042);
                    xmlAttribute70=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute70.getTree());

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
    // JS.g:1048:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression71 = null;

        functionExpression_return functionExpression72 = null;

        newExpression_return newExpression73 = null;



        try {
            // JS.g:1049:2: ( primaryExpression | functionExpression | newExpression )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=NULL && LA17_0<=FALSE)||LA17_0==EACH||LA17_0==THIS||(LA17_0>=GET && LA17_0<=SET)||(LA17_0>=WXML && LA17_0<=CLASS)||(LA17_0>=DEBUGGER && LA17_0<=VOLATILE)||LA17_0==AT||LA17_0==StringLiteral||(LA17_0>=Identifier && LA17_0<=RegularExpressionLiteral)||(LA17_0>=DecimalLiteral && LA17_0<=HexIntegerLiteral)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=XMLFragment && LA17_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt17=1;
            }
            else if ( (LA17_0==LBRACE||LA17_0==LPAREN||LA17_0==LBRACK) ) {
                alt17=1;
            }
            else if ( (LA17_0==FUNCTION) ) {
                alt17=2;
            }
            else if ( (LA17_0==NEW) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1048:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // JS.g:1049:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression4060);
                    primaryExpression71=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression71.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1050:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression4065);
                    functionExpression72=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression72.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1051:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression4070);
                    newExpression73=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression73.getTree());

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
    // JS.g:1054:1: newExpression : NEW newExpressionTail ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW74=null;
        newExpressionTail_return newExpressionTail75 = null;


        Object NEW74_tree=null;

        try {
            // JS.g:1055:2: ( NEW newExpressionTail )
            // JS.g:1055:4: NEW newExpressionTail
            {
            root_0 = (Object)adaptor.nil();

            NEW74=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression4081); 
            NEW74_tree = (Object)adaptor.create(NEW74);
            root_0 = (Object)adaptor.becomeRoot(NEW74_tree, root_0);

            pushFollow(FOLLOW_newExpressionTail_in_newExpression4084);
            newExpressionTail75=newExpressionTail();
            _fsp--;

            adaptor.addChild(root_0, newExpressionTail75.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1059:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN76=null;
        Token COMMA78=null;
        Token RPAREN80=null;
        assignmentExpression_return assignmentExpression77 = null;

        assignmentExpression_return assignmentExpression79 = null;


        Object LPAREN76_tree=null;
        Object COMMA78_tree=null;
        Object RPAREN80_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1060:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( CALL_ARGUMENTS ( assignmentExpression )* ) )
            // JS.g:1060:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN76=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments4097); 
            stream_LPAREN.add(LPAREN76);

            // JS.g:1060:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=NULL && LA19_0<=FALSE)||LA19_0==EACH||LA19_0==THIS||(LA19_0>=GET && LA19_0<=SET)||(LA19_0>=WXML && LA19_0<=CLASS)||(LA19_0>=DEBUGGER && LA19_0<=VOLATILE)||LA19_0==AT||LA19_0==StringLiteral||(LA19_0>=Identifier && LA19_0<=RegularExpressionLiteral)||(LA19_0>=DecimalLiteral && LA19_0<=HexIntegerLiteral)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=XMLFragment && LA19_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt19=1;
            }
            else if ( (LA19_0==DELETE||LA19_0==FUNCTION||LA19_0==NEW||LA19_0==TYPEOF||LA19_0==VOID||LA19_0==YIELD||LA19_0==LBRACE||LA19_0==LPAREN||LA19_0==LBRACK||(LA19_0>=ADD && LA19_0<=SUB)||(LA19_0>=INC && LA19_0<=DEC)||(LA19_0>=NOT && LA19_0<=INV)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // JS.g:1060:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments4101);
                    assignmentExpression77=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression77.getTree());
                    // JS.g:1060:34: ( COMMA assignmentExpression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // JS.g:1060:36: COMMA assignmentExpression
                    	    {
                    	    COMMA78=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments4105); 
                    	    stream_COMMA.add(COMMA78);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments4107);
                    	    assignmentExpression79=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression79.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN80=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments4115); 
            stream_RPAREN.add(RPAREN80);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1061:2: -> ^( CALL_ARGUMENTS ( assignmentExpression )* )
            {
                // JS.g:1061:5: ^( CALL_ARGUMENTS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL_ARGUMENTS, "CALL_ARGUMENTS"), root_1);

                // JS.g:1061:23: ( assignmentExpression )*
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
    // JS.g:1064:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $leftHandSideExpression $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $leftHandSideExpression expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $leftHandSideExpression ( $ps)? ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb1=null;
        Token RBRACK84=null;
        Token DOT85=null;
        Token DOTDOT86=null;
        Token COLONCOLON87=null;
        Token LBRACK88=null;
        Token RBRACK90=null;
        Token COLONCOLON91=null;
        rightHandSideExpression_return r = null;

        rightHandSideExpression2_return r2 = null;

        propertySelector_return ps = null;

        memberExpression_return memberExpression81 = null;

        arguments_return arguments82 = null;

        expression_return expression83 = null;

        expression_return expression89 = null;


        Object lb1_tree=null;
        Object RBRACK84_tree=null;
        Object DOT85_tree=null;
        Object DOTDOT86_tree=null;
        Object COLONCOLON87_tree=null;
        Object LBRACK88_tree=null;
        Object RBRACK90_tree=null;
        Object COLONCOLON91_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_COLONCOLON=new RewriteRuleTokenStream(adaptor,"token COLONCOLON");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_rightHandSideExpression2=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression2");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
        RewriteRuleSubtreeStream stream_propertySelector=new RewriteRuleSubtreeStream(adaptor,"rule propertySelector");
         pushState(JSParserRule.LEFT_HAND_SIDE_EXPRESSION); 
        try {
            // JS.g:1066:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $leftHandSideExpression $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $leftHandSideExpression expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $leftHandSideExpression ( $ps)? ) )* )
            // JS.g:1067:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $leftHandSideExpression $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $leftHandSideExpression expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $leftHandSideExpression ( $ps)? ) )*
            {
            // JS.g:1067:3: ( memberExpression -> memberExpression )
            // JS.g:1068:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4153);
            memberExpression81=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression81.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1068:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1070:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $leftHandSideExpression expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $leftHandSideExpression $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $leftHandSideExpression expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $leftHandSideExpression ( $ps)? ) )*
            loop20:
            do {
                int alt20=7;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LPAREN) ) {
                    alt20=1;
                }
                else if ( (LA20_0==LBRACK) ) {
                    alt20=2;
                }
                else if ( (LA20_0==DOT) ) {
                    alt20=3;
                }
                else if ( (LA20_0==DOTDOT) && ( isXmlEnabled() )) {
                    alt20=4;
                }
                else if ( (LA20_0==COLONCOLON) && ( isXmlEnabled() )) {
                    int LA20_6 = input.LA(2);

                    if ( (LA20_6==LBRACK) && ( isXmlEnabled() )) {
                        alt20=5;
                    }
                    else if ( (LA20_6==EACH||(LA20_6>=GET && LA20_6<=SET)||(LA20_6>=WXML && LA20_6<=CLASS)||(LA20_6>=DEBUGGER && LA20_6<=VOLATILE)||LA20_6==MUL||LA20_6==Identifier) && ( isXmlEnabled() )) {
                        alt20=6;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // JS.g:1071:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression4174);
            	    arguments82=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments82.getTree());

            	    // AST REWRITE
            	    // elements: arguments, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1071:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1071:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1072:7: lb1= LBRACK expression RBRACK
            	    {
            	    lb1=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4201); 
            	    stream_LBRACK.add(lb1);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4203);
            	    expression83=expression();
            	    _fsp--;

            	    stream_expression.add(expression83.getTree());
            	    RBRACK84=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4205); 
            	    stream_RBRACK.add(RBRACK84);


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1072:37: -> ^( BYINDEX[$lb1] $leftHandSideExpression expression )
            	    {
            	        // JS.g:1072:40: ^( BYINDEX[$lb1] $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, lb1), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1073:7: DOT r= rightHandSideExpression
            	    {
            	    DOT85=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4228); 
            	    stream_DOT.add(DOT85);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4232);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, r, DOT
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1073:37: -> ^( BYFIELD $leftHandSideExpression DOT ( $r)? )
            	    {
            	        // JS.g:1073:40: ^( BYFIELD $leftHandSideExpression DOT ( $r)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        // JS.g:1073:79: ( $r)?
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
            	    // JS.g:1074:7: {...}? => DOTDOT r2= rightHandSideExpression2
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "leftHandSideExpression", " isXmlEnabled() ");
            	    }
            	    DOTDOT86=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4260); 
            	    stream_DOTDOT.add(DOTDOT86);

            	    pushFollow(FOLLOW_rightHandSideExpression2_in_leftHandSideExpression4264);
            	    r2=rightHandSideExpression2();
            	    _fsp--;

            	    stream_rightHandSideExpression2.add(r2.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, r2
            	    // token labels: 
            	    // rule labels: retval, r2
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r2=new RewriteRuleSubtreeStream(adaptor,"token r2",r2!=null?r2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1074:64: -> ^( ALLCHILDREN $leftHandSideExpression $r2)
            	    {
            	        // JS.g:1074:67: ^( ALLCHILDREN $leftHandSideExpression $r2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_r2.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 5 :
            	    // JS.g:1075:7: {...}? => COLONCOLON LBRACK expression RBRACK
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "leftHandSideExpression", " isXmlEnabled() ");
            	    }
            	    COLONCOLON87=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4287); 
            	    stream_COLONCOLON.add(COLONCOLON87);

            	    LBRACK88=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4289); 
            	    stream_LBRACK.add(LBRACK88);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4291);
            	    expression89=expression();
            	    _fsp--;

            	    stream_expression.add(expression89.getTree());
            	    RBRACK90=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4293); 
            	    stream_RBRACK.add(RBRACK90);


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1075:65: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1075:68: ^( LOCALNAME $leftHandSideExpression expression )
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
            	case 6 :
            	    // JS.g:1076:7: {...}? => COLONCOLON ps= propertySelector
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "leftHandSideExpression", " isXmlEnabled() ");
            	    }
            	    COLONCOLON91=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4315); 
            	    stream_COLONCOLON.add(COLONCOLON91);

            	    pushFollow(FOLLOW_propertySelector_in_leftHandSideExpression4319);
            	    ps=propertySelector();
            	    _fsp--;

            	    stream_propertySelector.add(ps.getTree());

            	    // AST REWRITE
            	    // elements: ps, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"token ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1076:60: -> ^( LOCALNAME $leftHandSideExpression ( $ps)? )
            	    {
            	        // JS.g:1076:63: ^( LOCALNAME $leftHandSideExpression ( $ps)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(LOCALNAME, "LOCALNAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        // JS.g:1076:99: ( $ps)?
            	        if ( stream_ps.hasNext() ) {
            	            adaptor.addChild(root_1, stream_ps.next());

            	        }
            	        stream_ps.reset();

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
    // JS.g:1083:1: newExpressionTail : ( memberExpression -> memberExpression ) (lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $newExpressionTail $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $newExpressionTail expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $newExpressionTail ( $ps)? ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? ;
    public final newExpressionTail_return newExpressionTail() throws RecognitionException {
        newExpressionTail_return retval = new newExpressionTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb1=null;
        Token RBRACK94=null;
        Token DOT95=null;
        Token DOTDOT96=null;
        Token COLONCOLON97=null;
        Token LBRACK98=null;
        Token RBRACK100=null;
        Token COLONCOLON101=null;
        rightHandSideExpression_return r = null;

        rightHandSideExpression2_return r2 = null;

        propertySelector_return ps = null;

        memberExpression_return memberExpression92 = null;

        expression_return expression93 = null;

        expression_return expression99 = null;

        arguments_return arguments102 = null;


        Object lb1_tree=null;
        Object RBRACK94_tree=null;
        Object DOT95_tree=null;
        Object DOTDOT96_tree=null;
        Object COLONCOLON97_tree=null;
        Object LBRACK98_tree=null;
        Object RBRACK100_tree=null;
        Object COLONCOLON101_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_COLONCOLON=new RewriteRuleTokenStream(adaptor,"token COLONCOLON");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_rightHandSideExpression2=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression2");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
        RewriteRuleSubtreeStream stream_propertySelector=new RewriteRuleSubtreeStream(adaptor,"rule propertySelector");
        try {
            // JS.g:1084:3: ( ( memberExpression -> memberExpression ) (lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $newExpressionTail $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $newExpressionTail expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $newExpressionTail ( $ps)? ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )? )
            // JS.g:1085:3: ( memberExpression -> memberExpression ) (lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $newExpressionTail $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $newExpressionTail expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $newExpressionTail ( $ps)? ) )* ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            {
            // JS.g:1085:3: ( memberExpression -> memberExpression )
            // JS.g:1086:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_newExpressionTail4380);
            memberExpression92=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression92.getTree());

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

            // JS.g:1088:3: (lb1= LBRACK expression RBRACK -> ^( BYINDEX[$lb1] $newExpressionTail expression ) | DOT r= rightHandSideExpression -> ^( BYFIELD $newExpressionTail DOT ( $r)? ) | {...}? => DOTDOT r2= rightHandSideExpression2 -> ^( ALLCHILDREN $newExpressionTail $r2) | {...}? => COLONCOLON LBRACK expression RBRACK -> ^( LOCALNAME $newExpressionTail expression ) | {...}? => COLONCOLON ps= propertySelector -> ^( LOCALNAME $newExpressionTail ( $ps)? ) )*
            loop21:
            do {
                int alt21=6;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==LBRACK) ) {
                    alt21=1;
                }
                else if ( (LA21_0==DOT) ) {
                    alt21=2;
                }
                else if ( (LA21_0==DOTDOT) && ( isXmlEnabled() )) {
                    int LA21_4 = input.LA(2);

                    if ( ( isXmlEnabled() ) ) {
                        alt21=3;
                    }


                }
                else if ( (LA21_0==COLONCOLON) && ( isXmlEnabled() )) {
                    int LA21_5 = input.LA(2);

                    if ( ( isXmlEnabled() ) ) {
                        alt21=4;
                    }
                    else if ( ( isXmlEnabled() ) ) {
                        alt21=5;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // JS.g:1089:5: lb1= LBRACK expression RBRACK
            	    {
            	    lb1=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_newExpressionTail4403); 
            	    stream_LBRACK.add(lb1);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4405);
            	    expression93=expression();
            	    _fsp--;

            	    stream_expression.add(expression93.getTree());
            	    RBRACK94=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_newExpressionTail4407); 
            	    stream_RBRACK.add(RBRACK94);


            	    // AST REWRITE
            	    // elements: expression, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1089:35: -> ^( BYINDEX[$lb1] $newExpressionTail expression )
            	    {
            	        // JS.g:1089:38: ^( BYINDEX[$lb1] $newExpressionTail expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, lb1), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 2 :
            	    // JS.g:1090:7: DOT r= rightHandSideExpression
            	    {
            	    DOT95=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_newExpressionTail4430); 
            	    stream_DOT.add(DOT95);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_newExpressionTail4434);
            	    r=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(r.getTree());

            	    // AST REWRITE
            	    // elements: DOT, r, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval, r
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",r!=null?r.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1090:37: -> ^( BYFIELD $newExpressionTail DOT ( $r)? )
            	    {
            	        // JS.g:1090:40: ^( BYFIELD $newExpressionTail DOT ( $r)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_DOT.next());
            	        // JS.g:1090:74: ( $r)?
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
            	    // JS.g:1091:7: {...}? => DOTDOT r2= rightHandSideExpression2
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "newExpressionTail", " isXmlEnabled() ");
            	    }
            	    DOTDOT96=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_newExpressionTail4462); 
            	    stream_DOTDOT.add(DOTDOT96);

            	    pushFollow(FOLLOW_rightHandSideExpression2_in_newExpressionTail4466);
            	    r2=rightHandSideExpression2();
            	    _fsp--;

            	    stream_rightHandSideExpression2.add(r2.getTree());

            	    // AST REWRITE
            	    // elements: r2, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval, r2
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_r2=new RewriteRuleSubtreeStream(adaptor,"token r2",r2!=null?r2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1091:64: -> ^( ALLCHILDREN $newExpressionTail $r2)
            	    {
            	        // JS.g:1091:67: ^( ALLCHILDREN $newExpressionTail $r2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_r2.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1092:7: {...}? => COLONCOLON LBRACK expression RBRACK
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "newExpressionTail", " isXmlEnabled() ");
            	    }
            	    COLONCOLON97=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_newExpressionTail4489); 
            	    stream_COLONCOLON.add(COLONCOLON97);

            	    LBRACK98=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_newExpressionTail4491); 
            	    stream_LBRACK.add(LBRACK98);

            	    pushFollow(FOLLOW_expression_in_newExpressionTail4493);
            	    expression99=expression();
            	    _fsp--;

            	    stream_expression.add(expression99.getTree());
            	    RBRACK100=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_newExpressionTail4495); 
            	    stream_RBRACK.add(RBRACK100);


            	    // AST REWRITE
            	    // elements: newExpressionTail, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1092:65: -> ^( LOCALNAME $newExpressionTail expression )
            	    {
            	        // JS.g:1092:68: ^( LOCALNAME $newExpressionTail expression )
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
            	case 5 :
            	    // JS.g:1093:7: {...}? => COLONCOLON ps= propertySelector
            	    {
            	    if ( !( isXmlEnabled() ) ) {
            	        throw new FailedPredicateException(input, "newExpressionTail", " isXmlEnabled() ");
            	    }
            	    COLONCOLON101=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_newExpressionTail4517); 
            	    stream_COLONCOLON.add(COLONCOLON101);

            	    pushFollow(FOLLOW_propertySelector_in_newExpressionTail4521);
            	    ps=propertySelector();
            	    _fsp--;

            	    stream_propertySelector.add(ps.getTree());

            	    // AST REWRITE
            	    // elements: ps, newExpressionTail
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"token ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1093:60: -> ^( LOCALNAME $newExpressionTail ( $ps)? )
            	    {
            	        // JS.g:1093:63: ^( LOCALNAME $newExpressionTail ( $ps)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(LOCALNAME, "LOCALNAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        // JS.g:1093:94: ( $ps)?
            	        if ( stream_ps.hasNext() ) {
            	            adaptor.addChild(root_1, stream_ps.next());

            	        }
            	        stream_ps.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // JS.g:1095:3: ( arguments -> ^( CALL $newExpressionTail arguments ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LPAREN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // JS.g:1096:5: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_newExpressionTail4549);
                    arguments102=arguments();
                    _fsp--;

                    stream_arguments.add(arguments102.getTree());

                    // AST REWRITE
                    // elements: newExpressionTail, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1096:19: -> ^( CALL $newExpressionTail arguments )
                    {
                        // JS.g:1096:22: ^( CALL $newExpressionTail arguments )
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
    // JS.g:1100:1: rightHandSideExpression : ( identifier | {...}? => parenExpression | {...}? => xmlAttribute | {...}? => MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL106=null;
        identifier_return identifier103 = null;

        parenExpression_return parenExpression104 = null;

        xmlAttribute_return xmlAttribute105 = null;


        Object MUL106_tree=null;

        try {
            // JS.g:1101:3: ( identifier | {...}? => parenExpression | {...}? => xmlAttribute | {...}? => MUL )
            int alt23=4;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EACH||(LA23_0>=GET && LA23_0<=SET)||(LA23_0>=WXML && LA23_0<=CLASS)||(LA23_0>=DEBUGGER && LA23_0<=VOLATILE)||LA23_0==Identifier) ) {
                alt23=1;
            }
            else if ( (LA23_0==LPAREN) && ( isXmlEnabled() )) {
                alt23=2;
            }
            else if ( (LA23_0==AT) && ( isXmlEnabled() )) {
                alt23=3;
            }
            else if ( (LA23_0==MUL) && ( isXmlEnabled() )) {
                alt23=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1100:1: rightHandSideExpression : ( identifier | {...}? => parenExpression | {...}? => xmlAttribute | {...}? => MUL );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // JS.g:1101:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4584);
                    identifier103=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier103.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1102:5: {...}? => parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "rightHandSideExpression", " isXmlEnabled() ");
                    }
                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4593);
                    parenExpression104=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression104.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1103:5: {...}? => xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "rightHandSideExpression", " isXmlEnabled() ");
                    }
                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4603);
                    xmlAttribute105=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute105.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1104:5: {...}? => MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( isXmlEnabled() ) ) {
                        throw new FailedPredicateException(input, "rightHandSideExpression", " isXmlEnabled() ");
                    }
                    MUL106=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4612); 
                    MUL106_tree = (Object)adaptor.create(MUL106);
                    adaptor.addChild(root_0, MUL106_tree);


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

    public static class rightHandSideExpression2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rightHandSideExpression2
    // JS.g:1107:1: rightHandSideExpression2 : ( identifier | xmlAttribute | MUL );
    public final rightHandSideExpression2_return rightHandSideExpression2() throws RecognitionException {
        rightHandSideExpression2_return retval = new rightHandSideExpression2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL109=null;
        identifier_return identifier107 = null;

        xmlAttribute_return xmlAttribute108 = null;


        Object MUL109_tree=null;

        try {
            // JS.g:1108:3: ( identifier | xmlAttribute | MUL )
            int alt24=3;
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
                alt24=1;
                }
                break;
            case AT:
                {
                alt24=2;
                }
                break;
            case MUL:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1107:1: rightHandSideExpression2 : ( identifier | xmlAttribute | MUL );", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // JS.g:1108:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression24624);
                    identifier107=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier107.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1109:5: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression24630);
                    xmlAttribute108=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute108.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1110:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL109=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression24636); 
                    MUL109_tree = (Object)adaptor.create(MUL109);
                    adaptor.addChild(root_0, MUL109_tree);


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
    // $ANTLR end rightHandSideExpression2

    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfixExpression
    // JS.g:1123:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression110 = null;

        postfixOperator_return postfixOperator111 = null;



        try {
            // JS.g:1124:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1124:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4652);
            leftHandSideExpression110=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression110.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1124:95: ( postfixOperator )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=INC && LA25_0<=DEC)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // JS.g:1124:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4658);
                    postfixOperator111=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator111.getTree(), root_0);

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
    // JS.g:1127:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1128:2: (op= INC | op= DEC )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==INC) ) {
                alt26=1;
            }
            else if ( (LA26_0==DEC) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1127:1: postfixOperator : (op= INC | op= DEC );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // JS.g:1128:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4676); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1129:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4685); 
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
    // JS.g:1136:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression112 = null;

        unaryOperator_return unaryOperator113 = null;

        unaryExpression_return unaryExpression114 = null;



        try {
            // JS.g:1137:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=NULL && LA27_0<=FALSE)||LA27_0==EACH||LA27_0==THIS||(LA27_0>=GET && LA27_0<=SET)||(LA27_0>=WXML && LA27_0<=CLASS)||(LA27_0>=DEBUGGER && LA27_0<=VOLATILE)||LA27_0==AT||LA27_0==StringLiteral||(LA27_0>=Identifier && LA27_0<=RegularExpressionLiteral)||(LA27_0>=DecimalLiteral && LA27_0<=HexIntegerLiteral)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=XMLFragment && LA27_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt27=1;
            }
            else if ( (LA27_0==FUNCTION||LA27_0==NEW||LA27_0==LBRACE||LA27_0==LPAREN||LA27_0==LBRACK) ) {
                alt27=1;
            }
            else if ( (LA27_0==DELETE||LA27_0==TYPEOF||LA27_0==VOID||LA27_0==YIELD||(LA27_0>=ADD && LA27_0<=SUB)||(LA27_0>=INC && LA27_0<=DEC)||(LA27_0>=NOT && LA27_0<=INV)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1136:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // JS.g:1137:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4702);
                    postfixExpression112=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression112.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1138:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4707);
                    unaryOperator113=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator113.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4710);
                    unaryExpression114=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression114.getTree());

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
    // JS.g:1141:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE115=null;
        Token VOID116=null;
        Token TYPEOF117=null;
        Token INC118=null;
        Token DEC119=null;
        Token INV120=null;
        Token NOT121=null;
        Token YIELD122=null;

        Object op_tree=null;
        Object DELETE115_tree=null;
        Object VOID116_tree=null;
        Object TYPEOF117_tree=null;
        Object INC118_tree=null;
        Object DEC119_tree=null;
        Object INV120_tree=null;
        Object NOT121_tree=null;
        Object YIELD122_tree=null;

        try {
            // JS.g:1142:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt28=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt28=1;
                }
                break;
            case VOID:
                {
                alt28=2;
                }
                break;
            case TYPEOF:
                {
                alt28=3;
                }
                break;
            case INC:
                {
                alt28=4;
                }
                break;
            case DEC:
                {
                alt28=5;
                }
                break;
            case ADD:
                {
                alt28=6;
                }
                break;
            case SUB:
                {
                alt28=7;
                }
                break;
            case INV:
                {
                alt28=8;
                }
                break;
            case NOT:
                {
                alt28=9;
                }
                break;
            case YIELD:
                {
                alt28=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1141:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // JS.g:1142:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE115=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4722); 
                    DELETE115_tree = (Object)adaptor.create(DELETE115);
                    adaptor.addChild(root_0, DELETE115_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1143:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID116=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4727); 
                    VOID116_tree = (Object)adaptor.create(VOID116);
                    adaptor.addChild(root_0, VOID116_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1144:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF117=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4732); 
                    TYPEOF117_tree = (Object)adaptor.create(TYPEOF117);
                    adaptor.addChild(root_0, TYPEOF117_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1145:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC118=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4737); 
                    INC118_tree = (Object)adaptor.create(INC118);
                    adaptor.addChild(root_0, INC118_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1146:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC119=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4742); 
                    DEC119_tree = (Object)adaptor.create(DEC119);
                    adaptor.addChild(root_0, DEC119_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1147:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4749); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1148:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4758); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1149:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV120=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4765); 
                    INV120_tree = (Object)adaptor.create(INV120);
                    adaptor.addChild(root_0, INV120_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1150:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT121=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4770); 
                    NOT121_tree = (Object)adaptor.create(NOT121);
                    adaptor.addChild(root_0, NOT121_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1151:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD122=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4775); 
                    YIELD122_tree = (Object)adaptor.create(YIELD122);
                    adaptor.addChild(root_0, YIELD122_tree);


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
    // JS.g:1156:1: namespaceStatement : {...}? => DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT123=null;
        Token WXML124=null;
        Token NAMESPACE125=null;
        Token ASSIGN126=null;
        expression_return expression127 = null;

        semic_return semic128 = null;


        Object DEFAULT123_tree=null;
        Object WXML124_tree=null;
        Object NAMESPACE125_tree=null;
        Object ASSIGN126_tree=null;
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1157:3: ({...}? => DEFAULT WXML NAMESPACE ASSIGN expression semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression ) )
            // JS.g:1157:5: {...}? => DEFAULT WXML NAMESPACE ASSIGN expression semic
            {
            if ( !( isXmlEnabled() ) ) {
                throw new FailedPredicateException(input, "namespaceStatement", " isXmlEnabled() ");
            }
            DEFAULT123=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4792); 
            stream_DEFAULT.add(DEFAULT123);

            WXML124=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4794); 
            stream_WXML.add(WXML124);

            NAMESPACE125=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4796); 
            stream_NAMESPACE.add(NAMESPACE125);

            ASSIGN126=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4798); 
            stream_ASSIGN.add(ASSIGN126);

            pushFollow(FOLLOW_expression_in_namespaceStatement4800);
            expression127=expression();
            _fsp--;

            stream_expression.add(expression127.getTree());
            pushFollow(FOLLOW_semic_in_namespaceStatement4802);
            semic128=semic();
            _fsp--;

            stream_semic.add(semic128.getTree());

            // AST REWRITE
            // elements: WXML, DEFAULT, ASSIGN, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1158:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
            {
                // JS.g:1158:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN expression )
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
    // JS.g:1163:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set130=null;
        unaryExpression_return unaryExpression129 = null;

        unaryExpression_return unaryExpression131 = null;


        Object set130_tree=null;

        try {
            // JS.g:1164:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1164:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4834);
            unaryExpression129=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression129.getTree());
            // JS.g:1164:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=MUL && LA29_0<=MOD)||LA29_0==DIV) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1164:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set130=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set130), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4838);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4853);
            	    unaryExpression131=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression131.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // JS.g:1171:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set133=null;
        multiplicativeExpression_return multiplicativeExpression132 = null;

        multiplicativeExpression_return multiplicativeExpression134 = null;


        Object set133_tree=null;

        try {
            // JS.g:1172:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1172:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4871);
            multiplicativeExpression132=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression132.getTree());
            // JS.g:1172:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=ADD && LA30_0<=SUB)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1172:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set133=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set133), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4875);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4886);
            	    multiplicativeExpression134=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression134.getTree());

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
    // $ANTLR end additiveExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // JS.g:1179:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set136=null;
        additiveExpression_return additiveExpression135 = null;

        additiveExpression_return additiveExpression137 = null;


        Object set136_tree=null;

        try {
            // JS.g:1180:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1180:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4905);
            additiveExpression135=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression135.getTree());
            // JS.g:1180:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=SHL && LA31_0<=SHU)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1180:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set136=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set136), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4909);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4924);
            	    additiveExpression137=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression137.getTree());

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
    // $ANTLR end shiftExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // JS.g:1187:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set139=null;
        shiftExpression_return shiftExpression138 = null;

        shiftExpression_return shiftExpression140 = null;


        Object set139_tree=null;

        try {
            // JS.g:1188:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1188:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4943);
            shiftExpression138=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression138.getTree());
            // JS.g:1188:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=IN && LA32_0<=INSTANCEOF)||(LA32_0>=LT && LA32_0<=GTE)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1188:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set139=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set139), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4947);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4974);
            	    shiftExpression140=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression140.getTree());

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
    // $ANTLR end relationalExpression

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpressionNoIn
    // JS.g:1191:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set142=null;
        shiftExpression_return shiftExpression141 = null;

        shiftExpression_return shiftExpression143 = null;


        Object set142_tree=null;

        try {
            // JS.g:1192:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1192:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4988);
            shiftExpression141=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression141.getTree());
            // JS.g:1192:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==INSTANCEOF||(LA33_0>=LT && LA33_0<=GTE)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1192:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set142=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set142), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4992);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn5015);
            	    shiftExpression143=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression143.getTree());

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
    // $ANTLR end relationalExpressionNoIn

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // JS.g:1199:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        relationalExpression_return relationalExpression144 = null;

        relationalExpression_return relationalExpression146 = null;


        Object set145_tree=null;

        try {
            // JS.g:1200:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1200:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression5034);
            relationalExpression144=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression144.getTree());
            // JS.g:1200:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=EQ && LA34_0<=NSAME)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1200:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set145=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set145), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression5038);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression5057);
            	    relationalExpression146=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression146.getTree());

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
    // $ANTLR end equalityExpression

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpressionNoIn
    // JS.g:1203:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set148=null;
        relationalExpressionNoIn_return relationalExpressionNoIn147 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn149 = null;


        Object set148_tree=null;

        try {
            // JS.g:1204:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1204:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn5071);
            relationalExpressionNoIn147=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn147.getTree());
            // JS.g:1204:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=EQ && LA35_0<=NSAME)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1204:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set148=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set148), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn5075);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn5094);
            	    relationalExpressionNoIn149=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn149.getTree());

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
    // $ANTLR end equalityExpressionNoIn

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpression
    // JS.g:1211:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND151=null;
        equalityExpression_return equalityExpression150 = null;

        equalityExpression_return equalityExpression152 = null;


        Object AND151_tree=null;

        try {
            // JS.g:1212:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1212:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression5114);
            equalityExpression150=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression150.getTree());
            // JS.g:1212:23: ( AND equalityExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==AND) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1212:25: AND equalityExpression
            	    {
            	    AND151=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression5118); 
            	    AND151_tree = (Object)adaptor.create(AND151);
            	    root_0 = (Object)adaptor.becomeRoot(AND151_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression5121);
            	    equalityExpression152=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression152.getTree());

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
    // $ANTLR end bitwiseANDExpression

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpressionNoIn
    // JS.g:1215:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND154=null;
        equalityExpressionNoIn_return equalityExpressionNoIn153 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn155 = null;


        Object AND154_tree=null;

        try {
            // JS.g:1216:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1216:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn5135);
            equalityExpressionNoIn153=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn153.getTree());
            // JS.g:1216:27: ( AND equalityExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AND) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1216:29: AND equalityExpressionNoIn
            	    {
            	    AND154=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn5139); 
            	    AND154_tree = (Object)adaptor.create(AND154);
            	    root_0 = (Object)adaptor.becomeRoot(AND154_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn5142);
            	    equalityExpressionNoIn155=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn155.getTree());

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
    // $ANTLR end bitwiseANDExpressionNoIn

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpression
    // JS.g:1219:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR157=null;
        bitwiseANDExpression_return bitwiseANDExpression156 = null;

        bitwiseANDExpression_return bitwiseANDExpression158 = null;


        Object XOR157_tree=null;

        try {
            // JS.g:1220:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1220:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression5158);
            bitwiseANDExpression156=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression156.getTree());
            // JS.g:1220:25: ( XOR bitwiseANDExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==XOR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1220:27: XOR bitwiseANDExpression
            	    {
            	    XOR157=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression5162); 
            	    XOR157_tree = (Object)adaptor.create(XOR157);
            	    root_0 = (Object)adaptor.becomeRoot(XOR157_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression5165);
            	    bitwiseANDExpression158=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression158.getTree());

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
    // $ANTLR end bitwiseXORExpression

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpressionNoIn
    // JS.g:1223:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR160=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn159 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn161 = null;


        Object XOR160_tree=null;

        try {
            // JS.g:1224:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1224:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5181);
            bitwiseANDExpressionNoIn159=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn159.getTree());
            // JS.g:1224:29: ( XOR bitwiseANDExpressionNoIn )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==XOR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1224:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR160=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn5185); 
            	    XOR160_tree = (Object)adaptor.create(XOR160);
            	    root_0 = (Object)adaptor.becomeRoot(XOR160_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5188);
            	    bitwiseANDExpressionNoIn161=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn161.getTree());

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
    // $ANTLR end bitwiseXORExpressionNoIn

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpression
    // JS.g:1227:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR163=null;
        bitwiseXORExpression_return bitwiseXORExpression162 = null;

        bitwiseXORExpression_return bitwiseXORExpression164 = null;


        Object OR163_tree=null;

        try {
            // JS.g:1228:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1228:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5203);
            bitwiseXORExpression162=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression162.getTree());
            // JS.g:1228:25: ( OR bitwiseXORExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==OR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1228:27: OR bitwiseXORExpression
            	    {
            	    OR163=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression5207); 
            	    OR163_tree = (Object)adaptor.create(OR163);
            	    root_0 = (Object)adaptor.becomeRoot(OR163_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5210);
            	    bitwiseXORExpression164=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression164.getTree());

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
    // $ANTLR end bitwiseORExpression

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpressionNoIn
    // JS.g:1231:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR166=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn165 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn167 = null;


        Object OR166_tree=null;

        try {
            // JS.g:1232:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1232:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5225);
            bitwiseXORExpressionNoIn165=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn165.getTree());
            // JS.g:1232:29: ( OR bitwiseXORExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==OR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JS.g:1232:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR166=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn5229); 
            	    OR166_tree = (Object)adaptor.create(OR166);
            	    root_0 = (Object)adaptor.becomeRoot(OR166_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5232);
            	    bitwiseXORExpressionNoIn167=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn167.getTree());

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
    // $ANTLR end bitwiseORExpressionNoIn

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpression
    // JS.g:1239:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND169=null;
        bitwiseORExpression_return bitwiseORExpression168 = null;

        bitwiseORExpression_return bitwiseORExpression170 = null;


        Object LAND169_tree=null;

        try {
            // JS.g:1240:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1240:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5251);
            bitwiseORExpression168=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression168.getTree());
            // JS.g:1240:24: ( LAND bitwiseORExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LAND) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1240:26: LAND bitwiseORExpression
            	    {
            	    LAND169=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression5255); 
            	    LAND169_tree = (Object)adaptor.create(LAND169);
            	    root_0 = (Object)adaptor.becomeRoot(LAND169_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5258);
            	    bitwiseORExpression170=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression170.getTree());

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
    // $ANTLR end logicalANDExpression

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpressionNoIn
    // JS.g:1243:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND172=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn171 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn173 = null;


        Object LAND172_tree=null;

        try {
            // JS.g:1244:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1244:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5272);
            bitwiseORExpressionNoIn171=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn171.getTree());
            // JS.g:1244:28: ( LAND bitwiseORExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LAND) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1244:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND172=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn5276); 
            	    LAND172_tree = (Object)adaptor.create(LAND172);
            	    root_0 = (Object)adaptor.becomeRoot(LAND172_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5279);
            	    bitwiseORExpressionNoIn173=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn173.getTree());

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
    // $ANTLR end logicalANDExpressionNoIn

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpression
    // JS.g:1247:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR175=null;
        logicalANDExpression_return logicalANDExpression174 = null;

        logicalANDExpression_return logicalANDExpression176 = null;


        Object LOR175_tree=null;

        try {
            // JS.g:1248:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1248:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5294);
            logicalANDExpression174=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression174.getTree());
            // JS.g:1248:25: ( LOR logicalANDExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LOR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // JS.g:1248:27: LOR logicalANDExpression
            	    {
            	    LOR175=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression5298); 
            	    LOR175_tree = (Object)adaptor.create(LOR175);
            	    root_0 = (Object)adaptor.becomeRoot(LOR175_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5301);
            	    logicalANDExpression176=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression176.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // JS.g:1251:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR178=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn177 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn179 = null;


        Object LOR178_tree=null;

        try {
            // JS.g:1252:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1252:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5316);
            logicalANDExpressionNoIn177=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn177.getTree());
            // JS.g:1252:29: ( LOR logicalANDExpressionNoIn )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LOR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // JS.g:1252:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR178=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn5320); 
            	    LOR178_tree = (Object)adaptor.create(LOR178);
            	    root_0 = (Object)adaptor.becomeRoot(LOR178_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5323);
            	    logicalANDExpressionNoIn179=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn179.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // JS.g:1259:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE181=null;
        Token COLON183=null;
        logicalORExpression_return logicalORExpression180 = null;

        assignmentExpression_return assignmentExpression182 = null;

        assignmentExpression_return assignmentExpression184 = null;


        Object QUE181_tree=null;
        Object COLON183_tree=null;

        try {
            // JS.g:1260:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1260:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression5342);
            logicalORExpression180=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression180.getTree());
            // JS.g:1260:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==QUE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // JS.g:1260:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE181=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression5346); 
                    QUE181_tree = (Object)adaptor.create(QUE181);
                    root_0 = (Object)adaptor.becomeRoot(QUE181_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5349);
                    assignmentExpression182=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression182.getTree());
                    COLON183=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression5351); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5354);
                    assignmentExpression184=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression184.getTree());

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
    // JS.g:1263:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE186=null;
        Token COLON188=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn185 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn187 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn189 = null;


        Object QUE186_tree=null;
        Object COLON188_tree=null;

        try {
            // JS.g:1264:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1264:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5368);
            logicalORExpressionNoIn185=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn185.getTree());
            // JS.g:1264:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==QUE) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // JS.g:1264:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE186=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn5372); 
                    QUE186_tree = (Object)adaptor.create(QUE186);
                    root_0 = (Object)adaptor.becomeRoot(QUE186_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5375);
                    assignmentExpressionNoIn187=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn187.getTree());
                    COLON188=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn5377); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5380);
                    assignmentExpressionNoIn189=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn189.getTree());

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
    // JS.g:1293:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator190 = null;

        assignmentExpression_return assignmentExpression191 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1298:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1298:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5408);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1299:2: ({...}? assignmentOperator assignmentExpression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=ASSIGN && LA48_0<=XORASS)||LA48_0==DIVASS) ) {
                int LA48_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // JS.g:1299:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5415);
                    assignmentOperator190=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator190.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5418);
                    assignmentExpression191=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression191.getTree());

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
    // JS.g:1302:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set192=null;

        Object set192_tree=null;

        try {
            // JS.g:1303:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set192=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set192));
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
    // JS.g:1306:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator193 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn194 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1311:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1311:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5496);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1312:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=ASSIGN && LA49_0<=XORASS)||LA49_0==DIVASS) ) {
                int LA49_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // JS.g:1312:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5503);
                    assignmentOperator193=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator193.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5506);
                    assignmentExpressionNoIn194=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn194.getTree());

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
    // JS.g:1319:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA195=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA195_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1320:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1320:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5528);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1320:32: ( COMMA exprs+= assignmentExpression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // JS.g:1320:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA195=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5532); 
            	    stream_COMMA.add(COMMA195);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5536);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop50;
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
            // 1321:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1321:28: ^( CEXPR ( $exprs)+ )
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
            else // 1322:2: -> $exprs
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
    // JS.g:1325:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA196=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA196_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1326:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1326:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5573);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1326:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // JS.g:1326:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA196=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5577); 
            	    stream_COMMA.add(COMMA196);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5581);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop51;
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
            // 1327:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1327:28: ^( CEXPR ( $exprs)+ )
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
            else // 1328:2: -> $exprs
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
    // JS.g:1353:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC197=null;
        Token EOF198=null;
        Token RBRACE199=null;
        Token EOL200=null;
        Token MultiLineComment201=null;

        Object SEMIC197_tree=null;
        Object EOF198_tree=null;
        Object RBRACE199_tree=null;
        Object EOL200_tree=null;
        Object MultiLineComment201_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1361:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt52=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt52=1;
                }
                break;
            case EOF:
                {
                alt52=2;
                }
                break;
            case RBRACE:
                {
                alt52=3;
                }
                break;
            case EOL:
                {
                alt52=4;
                }
                break;
            case MultiLineComment:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1353:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // JS.g:1361:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC197=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5632); 
                    SEMIC197_tree = (Object)adaptor.create(SEMIC197);
                    adaptor.addChild(root_0, SEMIC197_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1362:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF198=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5637); 
                    EOF198_tree = (Object)adaptor.create(EOF198);
                    adaptor.addChild(root_0, EOF198_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1363:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE199=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5642); 
                    RBRACE199_tree = (Object)adaptor.create(RBRACE199);
                    adaptor.addChild(root_0, RBRACE199_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1364:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL200=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5649); 
                    EOL200_tree = (Object)adaptor.create(EOL200);
                    adaptor.addChild(root_0, EOL200_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1364:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment201=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5653); 
                    MultiLineComment201_tree = (Object)adaptor.create(MultiLineComment201);
                    adaptor.addChild(root_0, MultiLineComment201_tree);


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
    // JS.g:1372:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block202 = null;

        statementTail_return statementTail203 = null;



        try {
            // JS.g:1377:2: ({...}? block | statementTail )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==LBRACE) ) {
                int LA53_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1372:1: statement options {k=1; } : ({...}? block | statementTail );", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA53_0>=NULL && LA53_0<=FALSE)||LA53_0==EACH||LA53_0==THIS||LA53_0==VAR||(LA53_0>=GET && LA53_0<=SET)||(LA53_0>=WXML && LA53_0<=CLASS)||(LA53_0>=DEBUGGER && LA53_0<=VOLATILE)||LA53_0==SEMIC||LA53_0==AT||LA53_0==StringLiteral||(LA53_0>=Identifier && LA53_0<=RegularExpressionLiteral)||(LA53_0>=DecimalLiteral && LA53_0<=HexIntegerLiteral)) ) {
                alt53=2;
            }
            else if ( ((LA53_0>=XMLFragment && LA53_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt53=2;
            }
            else if ( (LA53_0==BREAK||LA53_0==CONTINUE||(LA53_0>=DELETE && LA53_0<=DO)||LA53_0==FOR||(LA53_0>=FUNCTION && LA53_0<=IF)||(LA53_0>=NEW && LA53_0<=SWITCH)||(LA53_0>=THROW && LA53_0<=TYPEOF)||(LA53_0>=VOID && LA53_0<=WITH)||LA53_0==YIELD||LA53_0==CONST||LA53_0==LPAREN||LA53_0==LBRACK||(LA53_0>=ADD && LA53_0<=SUB)||(LA53_0>=INC && LA53_0<=DEC)||(LA53_0>=NOT && LA53_0<=INV)) ) {
                alt53=2;
            }
            else if ( (LA53_0==DEFAULT) && ( isXmlEnabled() )) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1372:1: statement options {k=1; } : ({...}? block | statementTail );", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // JS.g:1377:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5682);
                    block202=block();
                    _fsp--;

                    adaptor.addChild(root_0, block202.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1378:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5687);
                    statementTail203=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail203.getTree());

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
    // JS.g:1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement204 = null;

        emptyStatement_return emptyStatement205 = null;

        expressionStatement_return expressionStatement206 = null;

        ifStatement_return ifStatement207 = null;

        iterationStatement_return iterationStatement208 = null;

        continueStatement_return continueStatement209 = null;

        breakStatement_return breakStatement210 = null;

        returnStatement_return returnStatement211 = null;

        withStatement_return withStatement212 = null;

        labelledStatement_return labelledStatement213 = null;

        switchStatement_return switchStatement214 = null;

        throwStatement_return throwStatement215 = null;

        tryStatement_return tryStatement216 = null;

        constStatement_return constStatement217 = null;

        namespaceStatement_return namespaceStatement218 = null;



        try {
            // JS.g:1382:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt54=15;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==VAR) ) {
                alt54=1;
            }
            else if ( (LA54_0==SEMIC) ) {
                alt54=2;
            }
            else if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==THIS||LA54_0==AT||LA54_0==StringLiteral||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)) ) {
                alt54=3;
            }
            else if ( (LA54_0==WXML) ) {
                int LA54_4 = input.LA(2);

                if ( (LA54_4==COLON) ) {
                    alt54=10;
                }
                else if ( (LA54_4==EOF||(LA54_4>=IN && LA54_4<=INSTANCEOF)||(LA54_4>=RBRACE && LA54_4<=LPAREN)||LA54_4==LBRACK||(LA54_4>=DOT && LA54_4<=XOR)||(LA54_4>=LAND && LA54_4<=QUE)||(LA54_4>=ASSIGN && LA54_4<=DIVASS)||(LA54_4>=DOTDOT && LA54_4<=COLONCOLON)||(LA54_4>=EOL && LA54_4<=MultiLineComment)) ) {
                    alt54=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==GET) ) {
                int LA54_5 = input.LA(2);

                if ( (LA54_5==COLON) ) {
                    alt54=10;
                }
                else if ( (LA54_5==EOF||(LA54_5>=IN && LA54_5<=INSTANCEOF)||(LA54_5>=RBRACE && LA54_5<=LPAREN)||LA54_5==LBRACK||(LA54_5>=DOT && LA54_5<=XOR)||(LA54_5>=LAND && LA54_5<=QUE)||(LA54_5>=ASSIGN && LA54_5<=DIVASS)||(LA54_5>=DOTDOT && LA54_5<=COLONCOLON)||(LA54_5>=EOL && LA54_5<=MultiLineComment)) ) {
                    alt54=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 5, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==SET) ) {
                int LA54_6 = input.LA(2);

                if ( (LA54_6==COLON) ) {
                    alt54=10;
                }
                else if ( (LA54_6==EOF||(LA54_6>=IN && LA54_6<=INSTANCEOF)||(LA54_6>=RBRACE && LA54_6<=LPAREN)||LA54_6==LBRACK||(LA54_6>=DOT && LA54_6<=XOR)||(LA54_6>=LAND && LA54_6<=QUE)||(LA54_6>=ASSIGN && LA54_6<=DIVASS)||(LA54_6>=DOTDOT && LA54_6<=COLONCOLON)||(LA54_6>=EOL && LA54_6<=MultiLineComment)) ) {
                    alt54=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 6, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==EACH) ) {
                int LA54_7 = input.LA(2);

                if ( (LA54_7==COLON) ) {
                    alt54=10;
                }
                else if ( (LA54_7==EOF||(LA54_7>=IN && LA54_7<=INSTANCEOF)||(LA54_7>=RBRACE && LA54_7<=LPAREN)||LA54_7==LBRACK||(LA54_7>=DOT && LA54_7<=XOR)||(LA54_7>=LAND && LA54_7<=QUE)||(LA54_7>=ASSIGN && LA54_7<=DIVASS)||(LA54_7>=DOTDOT && LA54_7<=COLONCOLON)||(LA54_7>=EOL && LA54_7<=MultiLineComment)) ) {
                    alt54=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 7, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==NAMESPACE) ) {
                int LA54_8 = input.LA(2);

                if ( (LA54_8==EOF||(LA54_8>=IN && LA54_8<=INSTANCEOF)||(LA54_8>=RBRACE && LA54_8<=LPAREN)||LA54_8==LBRACK||(LA54_8>=DOT && LA54_8<=XOR)||(LA54_8>=LAND && LA54_8<=QUE)||(LA54_8>=ASSIGN && LA54_8<=DIVASS)||(LA54_8>=DOTDOT && LA54_8<=COLONCOLON)||(LA54_8>=EOL && LA54_8<=MultiLineComment)) ) {
                    alt54=3;
                }
                else if ( (LA54_8==COLON) ) {
                    alt54=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 8, input);

                    throw nvae;
                }
            }
            else if ( ((LA54_0>=ABSTRACT && LA54_0<=CLASS)||(LA54_0>=DEBUGGER && LA54_0<=VOLATILE)) ) {
                int LA54_9 = input.LA(2);

                if ( (LA54_9==EOF||(LA54_9>=IN && LA54_9<=INSTANCEOF)||(LA54_9>=RBRACE && LA54_9<=LPAREN)||LA54_9==LBRACK||(LA54_9>=DOT && LA54_9<=XOR)||(LA54_9>=LAND && LA54_9<=QUE)||(LA54_9>=ASSIGN && LA54_9<=DIVASS)||(LA54_9>=DOTDOT && LA54_9<=COLONCOLON)||(LA54_9>=EOL && LA54_9<=MultiLineComment)) ) {
                    alt54=3;
                }
                else if ( (LA54_9==COLON) ) {
                    alt54=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 9, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==Identifier) ) {
                int LA54_10 = input.LA(2);

                if ( (LA54_10==COLON) ) {
                    alt54=10;
                }
                else if ( (LA54_10==EOF||(LA54_10>=IN && LA54_10<=INSTANCEOF)||(LA54_10>=RBRACE && LA54_10<=LPAREN)||LA54_10==LBRACK||(LA54_10>=DOT && LA54_10<=XOR)||(LA54_10>=LAND && LA54_10<=QUE)||(LA54_10>=ASSIGN && LA54_10<=DIVASS)||(LA54_10>=DOTDOT && LA54_10<=COLONCOLON)||(LA54_10>=EOL && LA54_10<=MultiLineComment)) ) {
                    alt54=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 10, input);

                    throw nvae;
                }
            }
            else if ( ((LA54_0>=XMLFragment && LA54_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt54=3;
            }
            else if ( (LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==YIELD||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)) ) {
                alt54=3;
            }
            else if ( (LA54_0==IF) ) {
                alt54=4;
            }
            else if ( (LA54_0==DO||LA54_0==FOR||LA54_0==WHILE) ) {
                alt54=5;
            }
            else if ( (LA54_0==CONTINUE) ) {
                alt54=6;
            }
            else if ( (LA54_0==BREAK) ) {
                alt54=7;
            }
            else if ( (LA54_0==RETURN) ) {
                alt54=8;
            }
            else if ( (LA54_0==WITH) ) {
                alt54=9;
            }
            else if ( (LA54_0==SWITCH) ) {
                alt54=11;
            }
            else if ( (LA54_0==THROW) ) {
                alt54=12;
            }
            else if ( (LA54_0==TRY) ) {
                alt54=13;
            }
            else if ( (LA54_0==CONST) ) {
                alt54=14;
            }
            else if ( (LA54_0==DEFAULT) && ( isXmlEnabled() )) {
                alt54=15;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1381:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // JS.g:1382:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5699);
                    variableStatement204=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement204.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1383:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5704);
                    emptyStatement205=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement205.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1384:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5709);
                    expressionStatement206=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement206.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1385:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5714);
                    ifStatement207=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement207.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1386:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5719);
                    iterationStatement208=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement208.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1387:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5724);
                    continueStatement209=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement209.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1388:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5729);
                    breakStatement210=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement210.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1389:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5734);
                    returnStatement211=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement211.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1390:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5739);
                    withStatement212=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement212.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1391:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5744);
                    labelledStatement213=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement213.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1392:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5749);
                    switchStatement214=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement214.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1393:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5754);
                    throwStatement215=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement215.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1394:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5759);
                    tryStatement216=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement216.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1395:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5764);
                    constStatement217=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement217.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1396:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5769);
                    namespaceStatement218=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement218.getTree());

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
    // JS.g:1401:1: block : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE220=null;
        sourceElement_return sourceElement219 = null;


        Object lb_tree=null;
        Object RBRACE220_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // JS.g:1402:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1402:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5784); 
            stream_LBRACE.add(lb);

            // JS.g:1402:14: ( sourceElement )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=NULL && LA55_0<=FALSE)||(LA55_0>=EACH && LA55_0<=FUNCTION)||LA55_0==THIS||LA55_0==VAR||(LA55_0>=GET && LA55_0<=SET)||(LA55_0>=WXML && LA55_0<=CLASS)||(LA55_0>=DEBUGGER && LA55_0<=LBRACE)||LA55_0==SEMIC||LA55_0==AT||LA55_0==StringLiteral||(LA55_0>=Identifier && LA55_0<=RegularExpressionLiteral)||(LA55_0>=DecimalLiteral && LA55_0<=HexIntegerLiteral)) ) {
                    alt55=1;
                }
                else if ( ((LA55_0>=XMLFragment && LA55_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt55=1;
                }
                else if ( (LA55_0==BREAK||LA55_0==CONTINUE||(LA55_0>=DELETE && LA55_0<=DO)||LA55_0==FOR||LA55_0==IF||(LA55_0>=NEW && LA55_0<=SWITCH)||(LA55_0>=THROW && LA55_0<=TYPEOF)||(LA55_0>=VOID && LA55_0<=WITH)||LA55_0==YIELD||LA55_0==CONST||LA55_0==LPAREN||LA55_0==LBRACK||(LA55_0>=ADD && LA55_0<=SUB)||(LA55_0>=INC && LA55_0<=DEC)||(LA55_0>=NOT && LA55_0<=INV)) ) {
                    alt55=1;
                }
                else if ( (LA55_0==DEFAULT) && ( isXmlEnabled() )) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // JS.g:1402:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_block5786);
            	    sourceElement219=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement219.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            RBRACE220=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5789); 
            stream_RBRACE.add(RBRACE220);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1403:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1403:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1403:28: ( sourceElement )*
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
        }
        return retval;
    }
    // $ANTLR end block

    public static class variableStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableStatement
    // JS.g:1410:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR221=null;
        Token COMMA223=null;
        variableDeclaration_return variableDeclaration222 = null;

        variableDeclaration_return variableDeclaration224 = null;

        semic_return semic225 = null;


        Object VAR221_tree=null;
        Object COMMA223_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1411:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1411:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR221=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5818); 
            stream_VAR.add(VAR221);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5820);
            variableDeclaration222=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration222.getTree());
            // JS.g:1411:28: ( COMMA variableDeclaration )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // JS.g:1411:30: COMMA variableDeclaration
            	    {
            	    COMMA223=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5824); 
            	    stream_COMMA.add(COMMA223);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5826);
            	    variableDeclaration224=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration224.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5831);
            semic225=semic();
            _fsp--;

            stream_semic.add(semic225.getTree());

            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1412:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1412:5: ^( VAR ( variableDeclaration )+ )
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
    // JS.g:1415:1: variableDeclaration : identifier ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN227=null;
        identifier_return identifier226 = null;

        assignmentExpression_return assignmentExpression228 = null;


        Object ASSIGN227_tree=null;

        try {
            // JS.g:1416:2: ( identifier ( ASSIGN assignmentExpression )? )
            // JS.g:1416:4: identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5854);
            identifier226=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier226.getTree(), root_0);
            // JS.g:1416:16: ( ASSIGN assignmentExpression )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ASSIGN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // JS.g:1416:18: ASSIGN assignmentExpression
                    {
                    ASSIGN227=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5859); 
                    ASSIGN227_tree = (Object)adaptor.create(ASSIGN227);
                    adaptor.addChild(root_0, ASSIGN227_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5861);
                    assignmentExpression228=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression228.getTree());

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
    // JS.g:1419:1: variableDeclarationNoIn : identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN230=null;
        identifier_return identifier229 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn231 = null;


        Object ASSIGN230_tree=null;

        try {
            // JS.g:1420:2: ( identifier ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1420:4: identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5876);
            identifier229=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier229.getTree(), root_0);
            // JS.g:1420:16: ( ASSIGN assignmentExpressionNoIn )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ASSIGN) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // JS.g:1420:18: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN230=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5881); 
                    ASSIGN230_tree = (Object)adaptor.create(ASSIGN230);
                    adaptor.addChild(root_0, ASSIGN230_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5883);
                    assignmentExpressionNoIn231=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn231.getTree());

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
    // JS.g:1423:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST232=null;
        Token COMMA234=null;
        variableDeclaration_return variableDeclaration233 = null;

        variableDeclaration_return variableDeclaration235 = null;

        semic_return semic236 = null;


        Object CONST232_tree=null;
        Object COMMA234_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1424:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1424:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST232=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5898); 
            stream_CONST.add(CONST232);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5900);
            variableDeclaration233=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration233.getTree());
            // JS.g:1424:31: ( COMMA variableDeclaration )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==COMMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // JS.g:1424:33: COMMA variableDeclaration
            	    {
            	    COMMA234=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5904); 
            	    stream_COMMA.add(COMMA234);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5906);
            	    variableDeclaration235=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration235.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5911);
            semic236=semic();
            _fsp--;

            stream_semic.add(semic236.getTree());

            // AST REWRITE
            // elements: CONST, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1425:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1425:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1432:1: emptyStatement : SEMIC -> EMPTY_STATEMENT[$SEMIC] ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC237=null;

        Object SEMIC237_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");

        try {
            // JS.g:1433:2: ( SEMIC -> EMPTY_STATEMENT[$SEMIC] )
            // JS.g:1433:4: SEMIC
            {
            SEMIC237=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5941); 
            stream_SEMIC.add(SEMIC237);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1433:10: -> EMPTY_STATEMENT[$SEMIC]
            {
                adaptor.addChild(root_0, adaptor.create(EMPTY_STATEMENT, SEMIC237));

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
    // JS.g:1446:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression238 = null;

        semic_return semic239 = null;



        try {
            // JS.g:1447:2: ( expression semic )
            // JS.g:1447:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5964);
            expression238=expression();
            _fsp--;

            adaptor.addChild(root_0, expression238.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5966);
            semic239=semic();
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
    // JS.g:1454:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF240=null;
        Token LPAREN241=null;
        Token RPAREN243=null;
        Token ELSE245=null;
        expression_return expression242 = null;

        statement_return statement244 = null;

        statement_return statement246 = null;


        Object IF240_tree=null;
        Object LPAREN241_tree=null;
        Object RPAREN243_tree=null;
        Object ELSE245_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1456:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1456:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF240=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5984); 
            stream_IF.add(IF240);

            LPAREN241=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5986); 
            stream_LPAREN.add(LPAREN241);

            pushFollow(FOLLOW_expression_in_ifStatement5988);
            expression242=expression();
            _fsp--;

            stream_expression.add(expression242.getTree());
            RPAREN243=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5990); 
            stream_RPAREN.add(RPAREN243);

            pushFollow(FOLLOW_statement_in_ifStatement5992);
            statement244=statement();
            _fsp--;

            stream_statement.add(statement244.getTree());
            // JS.g:1456:42: ({...}? ELSE statement )?
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
                    // JS.g:1456:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE245=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5998); 
                    stream_ELSE.add(ELSE245);

                    pushFollow(FOLLOW_statement_in_ifStatement6000);
                    statement246=statement();
                    _fsp--;

                    stream_statement.add(statement246.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: statement, IF, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1457:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1457:5: ^( IF expression ( statement )+ )
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
    // JS.g:1464:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement247 = null;

        whileStatement_return whileStatement248 = null;

        forEachStatement_return forEachStatement249 = null;

        forStatement_return forStatement250 = null;



        try {
            // JS.g:1465:2: ( doStatement | whileStatement | forEachStatement | forStatement )
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
                        new NoViableAltException("1464:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 61, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1464:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // JS.g:1465:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement6033);
                    doStatement247=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement247.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1466:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement6038);
                    whileStatement248=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement248.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1467:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement6043);
                    forEachStatement249=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement249.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1468:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement6048);
                    forStatement250=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement250.getTree());

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
    // JS.g:1471:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO251=null;
        Token WHILE253=null;
        Token LPAREN254=null;
        Token RPAREN256=null;
        statement_return statement252 = null;

        expression_return expression255 = null;

        semic_return semic257 = null;


        Object DO251_tree=null;
        Object WHILE253_tree=null;
        Object LPAREN254_tree=null;
        Object RPAREN256_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1472:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1472:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO251=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement6060); 
            stream_DO.add(DO251);

            pushFollow(FOLLOW_statement_in_doStatement6062);
            statement252=statement();
            _fsp--;

            stream_statement.add(statement252.getTree());
            WHILE253=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement6064); 
            stream_WHILE.add(WHILE253);

            LPAREN254=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement6066); 
            stream_LPAREN.add(LPAREN254);

            pushFollow(FOLLOW_expression_in_doStatement6068);
            expression255=expression();
            _fsp--;

            stream_expression.add(expression255.getTree());
            RPAREN256=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement6070); 
            stream_RPAREN.add(RPAREN256);

            pushFollow(FOLLOW_semic_in_doStatement6072);
            semic257=semic();
            _fsp--;

            stream_semic.add(semic257.getTree());

            // AST REWRITE
            // elements: statement, expression, DO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1473:2: -> ^( DO statement expression )
            {
                // JS.g:1473:5: ^( DO statement expression )
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
    // JS.g:1476:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE258=null;
        Token LPAREN259=null;
        Token RPAREN261=null;
        expression_return expression260 = null;

        statement_return statement262 = null;


        Object WHILE258_tree=null;
        Object LPAREN259_tree=null;
        Object RPAREN261_tree=null;

        try {
            // JS.g:1477:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1477:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE258=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement6097); 
            WHILE258_tree = (Object)adaptor.create(WHILE258);
            root_0 = (Object)adaptor.becomeRoot(WHILE258_tree, root_0);

            LPAREN259=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement6100); 
            pushFollow(FOLLOW_expression_in_whileStatement6103);
            expression260=expression();
            _fsp--;

            adaptor.addChild(root_0, expression260.getTree());
            RPAREN261=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement6105); 
            pushFollow(FOLLOW_statement_in_whileStatement6108);
            statement262=statement();
            _fsp--;

            adaptor.addChild(root_0, statement262.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1522:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH263=null;
        Token LPAREN264=null;
        Token RPAREN266=null;
        forEachControl_return forEachControl265 = null;

        statement_return statement267 = null;


        Object forKeyword_tree=null;
        Object EACH263_tree=null;
        Object LPAREN264_tree=null;
        Object RPAREN266_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1523:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1523:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement6125); 
            stream_FOR.add(forKeyword);

            EACH263=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement6127); 
            stream_EACH.add(EACH263);

            LPAREN264=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement6129); 
            stream_LPAREN.add(LPAREN264);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement6131);
            forEachControl265=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl265.getTree());
            RPAREN266=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement6133); 
            stream_RPAREN.add(RPAREN266);

            pushFollow(FOLLOW_statement_in_forEachStatement6135);
            statement267=statement();
            _fsp--;

            stream_statement.add(statement267.getTree());

            // AST REWRITE
            // elements: forEachControl, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1524:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1524:7: ^( FOREACH[$forKeyword] forEachControl statement )
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
    // JS.g:1527:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar268 = null;

        forControlExpression_return forControlExpression269 = null;



        try {
            // JS.g:1528:3: ( forControlVar | forControlExpression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==VAR) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=NULL && LA62_0<=FALSE)||LA62_0==EACH||LA62_0==THIS||(LA62_0>=GET && LA62_0<=SET)||(LA62_0>=WXML && LA62_0<=CLASS)||(LA62_0>=DEBUGGER && LA62_0<=VOLATILE)||LA62_0==AT||LA62_0==StringLiteral||(LA62_0>=Identifier && LA62_0<=RegularExpressionLiteral)||(LA62_0>=DecimalLiteral && LA62_0<=HexIntegerLiteral)) ) {
                alt62=2;
            }
            else if ( ((LA62_0>=XMLFragment && LA62_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt62=2;
            }
            else if ( (LA62_0==DELETE||LA62_0==FUNCTION||LA62_0==NEW||LA62_0==TYPEOF||LA62_0==VOID||LA62_0==YIELD||LA62_0==LBRACE||LA62_0==LPAREN||LA62_0==LBRACK||(LA62_0>=ADD && LA62_0<=SUB)||(LA62_0>=INC && LA62_0<=DEC)||(LA62_0>=NOT && LA62_0<=INV)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1527:1: forEachControl : ( forControlVar | forControlExpression );", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // JS.g:1528:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl6163);
                    forControlVar268=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar268.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1529:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl6169);
                    forControlExpression269=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression269.getTree());

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
    // JS.g:1532:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR270=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        forControl_return forControl272 = null;

        statement_return statement274 = null;


        Object FOR270_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;

        try {
            // JS.g:1533:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1533:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR270=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement6181); 
            FOR270_tree = (Object)adaptor.create(FOR270);
            root_0 = (Object)adaptor.becomeRoot(FOR270_tree, root_0);

            LPAREN271=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement6184); 
            pushFollow(FOLLOW_forControl_in_forStatement6187);
            forControl272=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl272.getTree());
            RPAREN273=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement6189); 
            pushFollow(FOLLOW_statement_in_forStatement6192);
            statement274=statement();
            _fsp--;

            adaptor.addChild(root_0, statement274.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1536:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar275 = null;

        forControlExpression_return forControlExpression276 = null;

        forControlSemic_return forControlSemic277 = null;



        try {
            // JS.g:1537:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==VAR) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==EACH||LA63_0==THIS||(LA63_0>=GET && LA63_0<=SET)||(LA63_0>=WXML && LA63_0<=CLASS)||(LA63_0>=DEBUGGER && LA63_0<=VOLATILE)||LA63_0==AT||LA63_0==StringLiteral||(LA63_0>=Identifier && LA63_0<=RegularExpressionLiteral)||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                alt63=2;
            }
            else if ( ((LA63_0>=XMLFragment && LA63_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt63=2;
            }
            else if ( (LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==YIELD||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)) ) {
                alt63=2;
            }
            else if ( (LA63_0==SEMIC) ) {
                alt63=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1536:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // JS.g:1537:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl6203);
                    forControlVar275=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar275.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1538:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl6208);
                    forControlExpression276=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression276.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1539:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl6213);
                    forControlSemic277=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic277.getTree());

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
    // JS.g:1542:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token semi1=null;
        Token semi2=null;
        Token VAR278=null;
        Token IN280=null;
        Token COMMA282=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn279 = null;

        expression_return expression281 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn283 = null;


        Object semi1_tree=null;
        Object semi2_tree=null;
        Object VAR278_tree=null;
        Object IN280_tree=null;
        Object COMMA282_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1543:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1543:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR278=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar6224); 
            stream_VAR.add(VAR278);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6226);
            variableDeclarationNoIn279=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn279.getTree());
            // JS.g:1544:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) )
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
                    new NoViableAltException("1544:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ) )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // JS.g:1545:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1545:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1546:4: IN expression
                    {
                    IN280=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar6238); 
                    stream_IN.add(IN280);

                    pushFollow(FOLLOW_expression_in_forControlVar6240);
                    expression281=expression();
                    _fsp--;

                    stream_expression.add(expression281.getTree());

                    // AST REWRITE
                    // elements: VAR, expression, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1547:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1547:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1547:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1547:51: ^( EXPR expression )
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
                    // JS.g:1550:3: ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1550:3: ( ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1551:4: ( COMMA variableDeclarationNoIn )* semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )?
                    {
                    // JS.g:1551:4: ( COMMA variableDeclarationNoIn )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==COMMA) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // JS.g:1551:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA282=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar6286); 
                    	    stream_COMMA.add(COMMA282);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6288);
                    	    variableDeclarationNoIn283=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn283.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    semi1=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6295); 
                    stream_SEMIC.add(semi1);

                    // JS.g:1551:54: (ex1= expression )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=NULL && LA65_0<=FALSE)||LA65_0==EACH||LA65_0==THIS||(LA65_0>=GET && LA65_0<=SET)||(LA65_0>=WXML && LA65_0<=CLASS)||(LA65_0>=DEBUGGER && LA65_0<=VOLATILE)||LA65_0==AT||LA65_0==StringLiteral||(LA65_0>=Identifier && LA65_0<=RegularExpressionLiteral)||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                        alt65=1;
                    }
                    else if ( ((LA65_0>=XMLFragment && LA65_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                        alt65=1;
                    }
                    else if ( (LA65_0==DELETE||LA65_0==FUNCTION||LA65_0==NEW||LA65_0==TYPEOF||LA65_0==VOID||LA65_0==YIELD||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // JS.g:1551:54: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6299);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    semi2=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6304); 
                    stream_SEMIC.add(semi2);

                    // JS.g:1551:82: (ex2= expression )?
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
                            // JS.g:1551:82: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6308);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: semi2, ex1, semi1, variableDeclarationNoIn, ex2, VAR
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
                    // 1552:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1552:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1552:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1552:52: ^( $semi1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi1.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1552:64: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1552:72: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1552:80: ^( $semi2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi2.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1552:92: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1552:100: ( $ex2)?
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
    // JS.g:1557:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token semi1=null;
        Token semi2=null;
        Token IN284=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object semi1_tree=null;
        Object semi2_tree=null;
        Object IN284_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1562:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1562:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6388);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1563:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) )
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
                    new NoViableAltException("1563:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) ) )", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // JS.g:1564:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1564:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1565:4: IN ex2= expression
                    {
                    IN284=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression6403); 
                    stream_IN.add(IN284);

                    pushFollow(FOLLOW_expression_in_forControlExpression6407);
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
                    // 1566:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1566:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1566:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1566:33: ^( EXPR $ex2)
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
                    // JS.g:1569:3: (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1569:3: (semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1570:4: semi1= SEMIC (ex2= expression )? semi2= SEMIC (ex3= expression )?
                    {
                    semi1=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6455); 
                    stream_SEMIC.add(semi1);

                    // JS.g:1570:19: (ex2= expression )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=NULL && LA68_0<=FALSE)||LA68_0==EACH||LA68_0==THIS||(LA68_0>=GET && LA68_0<=SET)||(LA68_0>=WXML && LA68_0<=CLASS)||(LA68_0>=DEBUGGER && LA68_0<=VOLATILE)||LA68_0==AT||LA68_0==StringLiteral||(LA68_0>=Identifier && LA68_0<=RegularExpressionLiteral)||(LA68_0>=DecimalLiteral && LA68_0<=HexIntegerLiteral)) ) {
                        alt68=1;
                    }
                    else if ( ((LA68_0>=XMLFragment && LA68_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                        alt68=1;
                    }
                    else if ( (LA68_0==DELETE||LA68_0==FUNCTION||LA68_0==NEW||LA68_0==TYPEOF||LA68_0==VOID||LA68_0==YIELD||LA68_0==LBRACE||LA68_0==LPAREN||LA68_0==LBRACK||(LA68_0>=ADD && LA68_0<=SUB)||(LA68_0>=INC && LA68_0<=DEC)||(LA68_0>=NOT && LA68_0<=INV)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // JS.g:1570:19: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6459);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    semi2=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6464); 
                    stream_SEMIC.add(semi2);

                    // JS.g:1570:47: (ex3= expression )?
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
                            // JS.g:1570:47: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6468);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex2, semi1, ex3, semi2, ex1
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
                    // 1571:4: -> ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1571:7: ^( FORSTEP ^( EXPR $ex1) ^( $semi1) ^( EXPR ( $ex2)? ) ^( $semi2) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1571:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1571:33: ^( $semi1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi1.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1571:45: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1571:53: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1571:61: ^( $semi2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_semi2.next(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1571:73: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1571:81: ( $ex3)?
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
    // JS.g:1576:1: forControlSemic : semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) ;
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
            // JS.g:1577:2: (semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1577:4: semi1= SEMIC (ex1= expression )? semi2= SEMIC (ex2= expression )?
            {
            semi1=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6543); 
            stream_SEMIC.add(semi1);

            // JS.g:1577:19: (ex1= expression )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=NULL && LA71_0<=FALSE)||LA71_0==EACH||LA71_0==THIS||(LA71_0>=GET && LA71_0<=SET)||(LA71_0>=WXML && LA71_0<=CLASS)||(LA71_0>=DEBUGGER && LA71_0<=VOLATILE)||LA71_0==AT||LA71_0==StringLiteral||(LA71_0>=Identifier && LA71_0<=RegularExpressionLiteral)||(LA71_0>=DecimalLiteral && LA71_0<=HexIntegerLiteral)) ) {
                alt71=1;
            }
            else if ( ((LA71_0>=XMLFragment && LA71_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt71=1;
            }
            else if ( (LA71_0==DELETE||LA71_0==FUNCTION||LA71_0==NEW||LA71_0==TYPEOF||LA71_0==VOID||LA71_0==YIELD||LA71_0==LBRACE||LA71_0==LPAREN||LA71_0==LBRACK||(LA71_0>=ADD && LA71_0<=SUB)||(LA71_0>=INC && LA71_0<=DEC)||(LA71_0>=NOT && LA71_0<=INV)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1577:19: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6547);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            semi2=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6552); 
            stream_SEMIC.add(semi2);

            // JS.g:1577:47: (ex2= expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=NULL && LA72_0<=FALSE)||LA72_0==EACH||LA72_0==THIS||(LA72_0>=GET && LA72_0<=SET)||(LA72_0>=WXML && LA72_0<=CLASS)||(LA72_0>=DEBUGGER && LA72_0<=VOLATILE)||LA72_0==AT||LA72_0==StringLiteral||(LA72_0>=Identifier && LA72_0<=RegularExpressionLiteral)||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=XMLFragment && LA72_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt72=1;
            }
            else if ( (LA72_0==DELETE||LA72_0==FUNCTION||LA72_0==NEW||LA72_0==TYPEOF||LA72_0==VOID||LA72_0==YIELD||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1577:47: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6556);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ex1, semi1, ex2, semi2
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
            // 1578:2: -> ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1578:5: ^( FORSTEP ^( EXPR ) ^( $semi1) ^( EXPR ( $ex1)? ) ^( $semi2) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1578:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1578:26: ^( $semi1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_semi1.next(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1578:38: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1578:46: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1578:54: ^( $semi2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_semi2.next(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1578:66: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1578:74: ( $ex2)?
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
    // JS.g:1590:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE285=null;
        Token Identifier286=null;
        semic_return semic287 = null;


        Object CONTINUE285_tree=null;
        Object Identifier286_tree=null;

        try {
            // JS.g:1591:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1591:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE285=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6624); 
            CONTINUE285_tree = (Object)adaptor.create(CONTINUE285);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE285_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1591:67: ( Identifier )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Identifier) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1591:67: Identifier
                    {
                    Identifier286=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6629); 
                    Identifier286_tree = (Object)adaptor.create(Identifier286);
                    adaptor.addChild(root_0, Identifier286_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6632);
            semic287=semic();
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
    // JS.g:1603:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK288=null;
        Token Identifier289=null;
        semic_return semic290 = null;


        Object BREAK288_tree=null;
        Object Identifier289_tree=null;

        try {
            // JS.g:1604:2: ( BREAK ( Identifier )? semic )
            // JS.g:1604:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK288=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6651); 
            BREAK288_tree = (Object)adaptor.create(BREAK288);
            root_0 = (Object)adaptor.becomeRoot(BREAK288_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1604:64: ( Identifier )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Identifier) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1604:64: Identifier
                    {
                    Identifier289=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6656); 
                    Identifier289_tree = (Object)adaptor.create(Identifier289);
                    adaptor.addChild(root_0, Identifier289_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6659);
            semic290=semic();
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
    // JS.g:1624:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN291=null;
        expression_return expression292 = null;

        semic_return semic293 = null;


        Object RETURN291_tree=null;

        try {
            // JS.g:1625:2: ( RETURN ( expression )? semic )
            // JS.g:1625:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN291=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6678); 
            RETURN291_tree = (Object)adaptor.create(RETURN291);
            root_0 = (Object)adaptor.becomeRoot(RETURN291_tree, root_0);

             promoteEOL(null); 
            // JS.g:1625:34: ( expression )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=NULL && LA75_0<=FALSE)||LA75_0==EACH||LA75_0==THIS||(LA75_0>=GET && LA75_0<=SET)||(LA75_0>=WXML && LA75_0<=CLASS)||(LA75_0>=DEBUGGER && LA75_0<=VOLATILE)||LA75_0==AT||LA75_0==StringLiteral||(LA75_0>=Identifier && LA75_0<=RegularExpressionLiteral)||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                alt75=1;
            }
            else if ( ((LA75_0>=XMLFragment && LA75_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt75=1;
            }
            else if ( (LA75_0==DELETE||LA75_0==FUNCTION||LA75_0==NEW||LA75_0==TYPEOF||LA75_0==VOID||LA75_0==YIELD||LA75_0==LBRACE||LA75_0==LPAREN||LA75_0==LBRACK||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1625:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6683);
                    expression292=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression292.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6686);
            semic293=semic();
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
    // JS.g:1632:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH294=null;
        Token LPAREN295=null;
        Token RPAREN297=null;
        expression_return expression296 = null;

        statement_return statement298 = null;


        Object WITH294_tree=null;
        Object LPAREN295_tree=null;
        Object RPAREN297_tree=null;

        try {
            // JS.g:1633:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1633:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH294=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6703); 
            WITH294_tree = (Object)adaptor.create(WITH294);
            root_0 = (Object)adaptor.becomeRoot(WITH294_tree, root_0);

            LPAREN295=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6706); 
            pushFollow(FOLLOW_expression_in_withStatement6709);
            expression296=expression();
            _fsp--;

            adaptor.addChild(root_0, expression296.getTree());
            RPAREN297=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6711); 
            pushFollow(FOLLOW_statement_in_withStatement6714);
            statement298=statement();
            _fsp--;

            adaptor.addChild(root_0, statement298.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1640:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH299=null;
        Token LPAREN300=null;
        Token RPAREN302=null;
        Token LBRACE303=null;
        Token RBRACE306=null;
        expression_return expression301 = null;

        defaultClause_return defaultClause304 = null;

        caseClause_return caseClause305 = null;


        Object SWITCH299_tree=null;
        Object LPAREN300_tree=null;
        Object RPAREN302_tree=null;
        Object LBRACE303_tree=null;
        Object RBRACE306_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");
        try {
            // JS.g:1641:2: ( SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )* ( caseClause )* ) )
            // JS.g:1641:4: SWITCH LPAREN expression RPAREN LBRACE ( defaultClause | caseClause )* RBRACE
            {
            SWITCH299=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6730); 
            stream_SWITCH.add(SWITCH299);

            LPAREN300=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6732); 
            stream_LPAREN.add(LPAREN300);

            pushFollow(FOLLOW_expression_in_switchStatement6734);
            expression301=expression();
            _fsp--;

            stream_expression.add(expression301.getTree());
            RPAREN302=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6736); 
            stream_RPAREN.add(RPAREN302);

            LBRACE303=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6738); 
            stream_LBRACE.add(LBRACE303);

            // JS.g:1641:43: ( defaultClause | caseClause )*
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
            	    // JS.g:1641:45: defaultClause
            	    {
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6742);
            	    defaultClause304=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause304.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1641:61: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6746);
            	    caseClause305=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause305.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            RBRACE306=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6751); 
            stream_RBRACE.add(RBRACE306);


            // AST REWRITE
            // elements: SWITCH, expression, defaultClause, caseClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1642:2: -> ^( SWITCH expression ( defaultClause )* ( caseClause )* )
            {
                // JS.g:1642:5: ^( SWITCH expression ( defaultClause )* ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1642:26: ( defaultClause )*
                while ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1642:41: ( caseClause )*
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
    // JS.g:1645:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE307=null;
        Token COLON309=null;
        expression_return expression308 = null;

        statement_return statement310 = null;


        Object CASE307_tree=null;
        Object COLON309_tree=null;

        try {
            // JS.g:1646:2: ( CASE expression COLON ( statement )* )
            // JS.g:1646:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE307=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6779); 
            CASE307_tree = (Object)adaptor.create(CASE307);
            root_0 = (Object)adaptor.becomeRoot(CASE307_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6782);
            expression308=expression();
            _fsp--;

            adaptor.addChild(root_0, expression308.getTree());
            COLON309=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6784); 
            // JS.g:1646:28: ( statement )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DEFAULT) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==WXML) && ( isXmlEnabled() )) {
                        alt77=1;
                    }


                }
                else if ( ((LA77_0>=NULL && LA77_0<=FALSE)||LA77_0==EACH||LA77_0==THIS||LA77_0==VAR||(LA77_0>=GET && LA77_0<=SET)||(LA77_0>=WXML && LA77_0<=CLASS)||(LA77_0>=DEBUGGER && LA77_0<=LBRACE)||LA77_0==SEMIC||LA77_0==AT||LA77_0==StringLiteral||(LA77_0>=Identifier && LA77_0<=RegularExpressionLiteral)||(LA77_0>=DecimalLiteral && LA77_0<=HexIntegerLiteral)) ) {
                    alt77=1;
                }
                else if ( ((LA77_0>=XMLFragment && LA77_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt77=1;
                }
                else if ( (LA77_0==BREAK||LA77_0==CONTINUE||(LA77_0>=DELETE && LA77_0<=DO)||LA77_0==FOR||(LA77_0>=FUNCTION && LA77_0<=IF)||(LA77_0>=NEW && LA77_0<=SWITCH)||(LA77_0>=THROW && LA77_0<=TYPEOF)||(LA77_0>=VOID && LA77_0<=WITH)||LA77_0==YIELD||LA77_0==CONST||LA77_0==LPAREN||LA77_0==LBRACK||(LA77_0>=ADD && LA77_0<=SUB)||(LA77_0>=INC && LA77_0<=DEC)||(LA77_0>=NOT && LA77_0<=INV)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // JS.g:1646:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6787);
            	    statement310=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement310.getTree());

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
    // JS.g:1649:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT311=null;
        Token COLON312=null;
        statement_return statement313 = null;


        Object DEFAULT311_tree=null;
        Object COLON312_tree=null;

        try {
            // JS.g:1650:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1650:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT311=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6800); 
            DEFAULT311_tree = (Object)adaptor.create(DEFAULT311);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT311_tree, root_0);

            COLON312=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6803); 
            // JS.g:1650:20: ( statement )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==DEFAULT) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==WXML) && ( isXmlEnabled() )) {
                        alt78=1;
                    }


                }
                else if ( ((LA78_0>=NULL && LA78_0<=FALSE)||LA78_0==EACH||LA78_0==THIS||LA78_0==VAR||(LA78_0>=GET && LA78_0<=SET)||(LA78_0>=WXML && LA78_0<=CLASS)||(LA78_0>=DEBUGGER && LA78_0<=LBRACE)||LA78_0==SEMIC||LA78_0==AT||LA78_0==StringLiteral||(LA78_0>=Identifier && LA78_0<=RegularExpressionLiteral)||(LA78_0>=DecimalLiteral && LA78_0<=HexIntegerLiteral)) ) {
                    alt78=1;
                }
                else if ( ((LA78_0>=XMLFragment && LA78_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt78=1;
                }
                else if ( (LA78_0==BREAK||LA78_0==CONTINUE||(LA78_0>=DELETE && LA78_0<=DO)||LA78_0==FOR||(LA78_0>=FUNCTION && LA78_0<=IF)||(LA78_0>=NEW && LA78_0<=SWITCH)||(LA78_0>=THROW && LA78_0<=TYPEOF)||(LA78_0>=VOID && LA78_0<=WITH)||LA78_0==YIELD||LA78_0==CONST||LA78_0==LPAREN||LA78_0==LBRACK||(LA78_0>=ADD && LA78_0<=SUB)||(LA78_0>=INC && LA78_0<=DEC)||(LA78_0>=NOT && LA78_0<=INV)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JS.g:1650:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6806);
            	    statement313=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement313.getTree());

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
    // JS.g:1657:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON315=null;
        identifier_return identifier314 = null;

        statement_return statement316 = null;


        Object COLON315_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1658:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1658:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6823);
            identifier314=identifier();
            _fsp--;

            stream_identifier.add(identifier314.getTree());
            COLON315=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6825); 
            stream_COLON.add(COLON315);

            pushFollow(FOLLOW_statement_in_labelledStatement6827);
            statement316=statement();
            _fsp--;

            stream_statement.add(statement316.getTree());

            // AST REWRITE
            // elements: statement, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1659:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1659:5: ^( LABELLED identifier statement )
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
    // JS.g:1681:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW317=null;
        expression_return expression318 = null;

        semic_return semic319 = null;


        Object THROW317_tree=null;

        try {
            // JS.g:1682:2: ( THROW expression semic )
            // JS.g:1682:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW317=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6858); 
            THROW317_tree = (Object)adaptor.create(THROW317);
            root_0 = (Object)adaptor.becomeRoot(THROW317_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6863);
            expression318=expression();
            _fsp--;

            adaptor.addChild(root_0, expression318.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6865);
            semic319=semic();
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
    // JS.g:1689:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY320=null;
        block_return block321 = null;

        catchClause_return catchClause322 = null;

        finallyClause_return finallyClause323 = null;

        finallyClause_return finallyClause324 = null;


        Object TRY320_tree=null;

        try {
            // JS.g:1690:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1690:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY320=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6882); 
            TRY320_tree = (Object)adaptor.create(TRY320);
            root_0 = (Object)adaptor.becomeRoot(TRY320_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6885);
            block321=block();
            _fsp--;

            adaptor.addChild(root_0, block321.getTree());
            // JS.g:1690:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
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
                    new NoViableAltException("1690:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // JS.g:1690:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1690:17: ( catchClause )+
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
                    	    // JS.g:1690:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6889);
                    	    catchClause322=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause322.getTree());

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

                    // JS.g:1690:30: ( finallyClause )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==FINALLY) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // JS.g:1690:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6892);
                            finallyClause323=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause323.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1690:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6897);
                    finallyClause324=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause324.getTree());

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
    // JS.g:1693:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH325=null;
        Token LPAREN326=null;
        Token RPAREN329=null;
        identifier_return identifier327 = null;

        catchFilter_return catchFilter328 = null;

        block_return block330 = null;


        Object CATCH325_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN329_tree=null;

        try {
            // JS.g:1694:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1694:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH325=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6911); 
            CATCH325_tree = (Object)adaptor.create(CATCH325);
            root_0 = (Object)adaptor.becomeRoot(CATCH325_tree, root_0);

            LPAREN326=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6914); 
            pushFollow(FOLLOW_identifier_in_catchClause6917);
            identifier327=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier327.getTree());
            // JS.g:1694:30: ( catchFilter )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IF) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // JS.g:1694:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6919);
                    catchFilter328=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter328.getTree());

                    }
                    break;

            }

            RPAREN329=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6922); 
            pushFollow(FOLLOW_block_in_catchClause6925);
            block330=block();
            _fsp--;

            adaptor.addChild(root_0, block330.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1697:1: catchFilter : IF expression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF331=null;
        expression_return expression332 = null;


        Object IF331_tree=null;

        try {
            // JS.g:1698:2: ( IF expression )
            // JS.g:1698:4: IF expression
            {
            root_0 = (Object)adaptor.nil();

            IF331=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6936); 
            IF331_tree = (Object)adaptor.create(IF331);
            adaptor.addChild(root_0, IF331_tree);

            pushFollow(FOLLOW_expression_in_catchFilter6938);
            expression332=expression();
            _fsp--;

            adaptor.addChild(root_0, expression332.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1701:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY333=null;
        block_return block334 = null;


        Object FINALLY333_tree=null;

        try {
            // JS.g:1702:2: ( FINALLY block )
            // JS.g:1702:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY333=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6950); 
            FINALLY333_tree = (Object)adaptor.create(FINALLY333);
            root_0 = (Object)adaptor.becomeRoot(FINALLY333_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6953);
            block334=block();
            _fsp--;

            adaptor.addChild(root_0, block334.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1715:1: functionDeclaration : function= FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token function=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList335 = null;

        functionBody_return functionBody336 = null;


        Object function_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1716:2: (function= FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody ) )
            // JS.g:1716:4: function= FUNCTION name= identifier formalParameterList functionBody
            {
            function=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6976); 
            stream_FUNCTION.add(function);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6980);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6982);
            formalParameterList335=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList335.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6984);
            functionBody336=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody336.getTree());

            // AST REWRITE
            // elements: functionBody, name, formalParameterList
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1717:2: -> ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody )
            {
                // JS.g:1717:5: ^( FUNCTION_DECLARATION[$function] $name formalParameterList functionBody )
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
    // JS.g:1720:1: functionExpression : FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION337=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList338 = null;

        functionBody_return functionBody339 = null;


        Object FUNCTION337_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1721:2: ( FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1721:4: FUNCTION (name= identifier )? formalParameterList functionBody
            {
            FUNCTION337=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression7012); 
            stream_FUNCTION.add(FUNCTION337);

            // JS.g:1721:17: (name= identifier )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EACH||(LA83_0>=GET && LA83_0<=SET)||(LA83_0>=WXML && LA83_0<=CLASS)||(LA83_0>=DEBUGGER && LA83_0<=VOLATILE)||LA83_0==Identifier) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // JS.g:1721:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression7016);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression7019);
            formalParameterList338=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList338.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression7021);
            functionBody339=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody339.getTree());

            // AST REWRITE
            // elements: functionBody, formalParameterList, FUNCTION, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1722:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1722:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1722:17: ( $name)?
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
    // JS.g:1725:1: formalParameter : identifier ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier340 = null;



        try {
            // JS.g:1726:2: ( identifier )
            // JS.g:1726:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameter7049);
            identifier340=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier340.getTree(), root_0);

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1729:1: formalParameterList : LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN341=null;
        Token COMMA343=null;
        Token RPAREN345=null;
        formalParameter_return formalParameter342 = null;

        formalParameter_return formalParameter344 = null;


        Object LPAREN341_tree=null;
        Object COMMA343_tree=null;
        Object RPAREN345_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // JS.g:1730:2: ( LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN -> ^( ARGUMENTS ( formalParameter )* ) )
            // JS.g:1730:4: LPAREN ( formalParameter ( COMMA formalParameter )* )? RPAREN
            {
            LPAREN341=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList7061); 
            stream_LPAREN.add(LPAREN341);

            // JS.g:1730:11: ( formalParameter ( COMMA formalParameter )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EACH||(LA85_0>=GET && LA85_0<=SET)||(LA85_0>=WXML && LA85_0<=CLASS)||(LA85_0>=DEBUGGER && LA85_0<=VOLATILE)||LA85_0==Identifier) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // JS.g:1730:13: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_formalParameterList7065);
                    formalParameter342=formalParameter();
                    _fsp--;

                    stream_formalParameter.add(formalParameter342.getTree());
                    // JS.g:1730:29: ( COMMA formalParameter )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==COMMA) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // JS.g:1730:31: COMMA formalParameter
                    	    {
                    	    COMMA343=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList7069); 
                    	    stream_COMMA.add(COMMA343);

                    	    pushFollow(FOLLOW_formalParameter_in_formalParameterList7071);
                    	    formalParameter344=formalParameter();
                    	    _fsp--;

                    	    stream_formalParameter.add(formalParameter344.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN345=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList7079); 
            stream_RPAREN.add(RPAREN345);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1731:2: -> ^( ARGUMENTS ( formalParameter )* )
            {
                // JS.g:1731:5: ^( ARGUMENTS ( formalParameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // JS.g:1731:18: ( formalParameter )*
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
    // JS.g:1734:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE347=null;
        sourceElement_return sourceElement346 = null;


        Object lb_tree=null;
        Object RBRACE347_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
         pushState(JSParserRule.FUNCTION_BODY); 
        try {
            // JS.g:1736:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1736:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody7109); 
            stream_LBRACE.add(lb);

            // JS.g:1736:14: ( sourceElement )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=NULL && LA86_0<=FALSE)||(LA86_0>=EACH && LA86_0<=FUNCTION)||LA86_0==THIS||LA86_0==VAR||(LA86_0>=GET && LA86_0<=SET)||(LA86_0>=WXML && LA86_0<=CLASS)||(LA86_0>=DEBUGGER && LA86_0<=LBRACE)||LA86_0==SEMIC||LA86_0==AT||LA86_0==StringLiteral||(LA86_0>=Identifier && LA86_0<=RegularExpressionLiteral)||(LA86_0>=DecimalLiteral && LA86_0<=HexIntegerLiteral)) ) {
                    alt86=1;
                }
                else if ( ((LA86_0>=XMLFragment && LA86_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt86=1;
                }
                else if ( (LA86_0==BREAK||LA86_0==CONTINUE||(LA86_0>=DELETE && LA86_0<=DO)||LA86_0==FOR||LA86_0==IF||(LA86_0>=NEW && LA86_0<=SWITCH)||(LA86_0>=THROW && LA86_0<=TYPEOF)||(LA86_0>=VOID && LA86_0<=WITH)||LA86_0==YIELD||LA86_0==CONST||LA86_0==LPAREN||LA86_0==LBRACK||(LA86_0>=ADD && LA86_0<=SUB)||(LA86_0>=INC && LA86_0<=DEC)||(LA86_0>=NOT && LA86_0<=INV)) ) {
                    alt86=1;
                }
                else if ( (LA86_0==DEFAULT) && ( isXmlEnabled() )) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // JS.g:1736:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody7111);
            	    sourceElement346=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement346.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            RBRACE347=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody7114); 
            stream_RBRACE.add(RBRACE347);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1737:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1737:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1737:28: ( sourceElement )*
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
    // JS.g:1746:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN348=null;
        Token RPAREN349=null;
        identifier_return name = null;

        functionBody_return functionBody350 = null;


        Object get_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN349_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1747:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier functionBody ) )
            // JS.g:1747:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration7151); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration7155);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN348=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration7157); 
            stream_LPAREN.add(LPAREN348);

            RPAREN349=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration7159); 
            stream_RPAREN.add(RPAREN349);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration7161);
            functionBody350=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody350.getTree());

            // AST REWRITE
            // elements: functionBody, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1748:4: -> ^( GETTER[$get] identifier functionBody )
            {
                // JS.g:1748:7: ^( GETTER[$get] identifier functionBody )
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
    // JS.g:1751:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN351=null;
        Token RPAREN352=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody353 = null;


        Object set_tree=null;
        Object LPAREN351_tree=null;
        Object RPAREN352_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1752:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param functionBody ) )
            // JS.g:1752:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration7192); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7196);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN351=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration7198); 
            stream_LPAREN.add(LPAREN351);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration7202);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN352=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration7204); 
            stream_RPAREN.add(RPAREN352);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration7206);
            functionBody353=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody353.getTree());

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
            // 1753:5: -> ^( SETTER[$set] $name $param functionBody )
            {
                // JS.g:1753:8: ^( SETTER[$set] $name $param functionBody )
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
    // JS.g:1760:1: program : sourceElementSync ( sourceElement sourceElementSync )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF357=null;
        sourceElementSync_return sourceElementSync354 = null;

        sourceElement_return sourceElement355 = null;

        sourceElementSync_return sourceElementSync356 = null;


        Object EOF357_tree=null;

         pushState(JSParserRule.PROGRAM); 
        try {
            // JS.g:1762:2: ( sourceElementSync ( sourceElement sourceElementSync )* EOF )
            // JS.g:1762:4: sourceElementSync ( sourceElement sourceElementSync )* EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sourceElementSync_in_program7247);
            sourceElementSync354=sourceElementSync();
            _fsp--;

            adaptor.addChild(root_0, sourceElementSync354.getTree());
            // JS.g:1762:22: ( sourceElement sourceElementSync )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=NULL && LA87_0<=FALSE)||(LA87_0>=EACH && LA87_0<=FUNCTION)||LA87_0==THIS||LA87_0==VAR||(LA87_0>=GET && LA87_0<=SET)||(LA87_0>=WXML && LA87_0<=CLASS)||(LA87_0>=DEBUGGER && LA87_0<=LBRACE)||LA87_0==SEMIC||LA87_0==AT||LA87_0==StringLiteral||(LA87_0>=Identifier && LA87_0<=RegularExpressionLiteral)||(LA87_0>=DecimalLiteral && LA87_0<=HexIntegerLiteral)) ) {
                    alt87=1;
                }
                else if ( ((LA87_0>=XMLFragment && LA87_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                    alt87=1;
                }
                else if ( (LA87_0==BREAK||LA87_0==CONTINUE||(LA87_0>=DELETE && LA87_0<=DO)||LA87_0==FOR||LA87_0==IF||(LA87_0>=NEW && LA87_0<=SWITCH)||(LA87_0>=THROW && LA87_0<=TYPEOF)||(LA87_0>=VOID && LA87_0<=WITH)||LA87_0==YIELD||LA87_0==CONST||LA87_0==LPAREN||LA87_0==LBRACK||(LA87_0>=ADD && LA87_0<=SUB)||(LA87_0>=INC && LA87_0<=DEC)||(LA87_0>=NOT && LA87_0<=INV)) ) {
                    alt87=1;
                }
                else if ( (LA87_0==DEFAULT) && ( isXmlEnabled() )) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // JS.g:1762:23: sourceElement sourceElementSync
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program7250);
            	    sourceElement355=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement355.getTree());
            	    pushFollow(FOLLOW_sourceElementSync_in_program7252);
            	    sourceElementSync356=sourceElementSync();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElementSync356.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            EOF357=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program7256); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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
    // JS.g:1765:1: sourceElementSync : ;
    public final sourceElementSync_return sourceElementSync() throws RecognitionException {
        sourceElementSync_return retval = new sourceElementSync_return();
        retval.start = input.LT(1);

        Object root_0 = null;


        	syncToSet();

        try {
            // JS.g:1769:2: ()
            // JS.g:1770:3: 
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
    // JS.g:1777:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration358 = null;

        statement_return statement359 = null;



        try {
            // JS.g:1782:2: ({...}? functionDeclaration | statement )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==FUNCTION) ) {
                int LA88_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt88=1;
                }
                else if ( (true) ) {
                    alt88=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1777:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 88, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA88_0>=NULL && LA88_0<=FALSE)||LA88_0==EACH||LA88_0==THIS||LA88_0==VAR||(LA88_0>=GET && LA88_0<=SET)||(LA88_0>=WXML && LA88_0<=CLASS)||(LA88_0>=DEBUGGER && LA88_0<=LBRACE)||LA88_0==SEMIC||LA88_0==AT||LA88_0==StringLiteral||(LA88_0>=Identifier && LA88_0<=RegularExpressionLiteral)||(LA88_0>=DecimalLiteral && LA88_0<=HexIntegerLiteral)) ) {
                alt88=2;
            }
            else if ( ((LA88_0>=XMLFragment && LA88_0<=XMLFragmentEnd)) && ( isXmlEnabled() )) {
                alt88=2;
            }
            else if ( (LA88_0==BREAK||LA88_0==CONTINUE||(LA88_0>=DELETE && LA88_0<=DO)||LA88_0==FOR||LA88_0==IF||(LA88_0>=NEW && LA88_0<=SWITCH)||(LA88_0>=THROW && LA88_0<=TYPEOF)||(LA88_0>=VOID && LA88_0<=WITH)||LA88_0==YIELD||LA88_0==CONST||LA88_0==LPAREN||LA88_0==LBRACK||(LA88_0>=ADD && LA88_0<=SUB)||(LA88_0>=INC && LA88_0<=DEC)||(LA88_0>=NOT && LA88_0<=INV)) ) {
                alt88=2;
            }
            else if ( (LA88_0==DEFAULT) && ( isXmlEnabled() )) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1777:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // JS.g:1782:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement7301);
                    functionDeclaration358=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration358.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1783:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement7306);
                    statement359=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement359.getTree());

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
    // JS.g:1788:1: standaloneExpression : expression EOF ;
    public final standaloneExpression_return standaloneExpression() throws RecognitionException {
        standaloneExpression_return retval = new standaloneExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF361=null;
        expression_return expression360 = null;


        Object EOF361_tree=null;

         pushState(JSParserRule.EXPRESSION); 
        try {
            // JS.g:1790:2: ( expression EOF )
            // JS.g:1790:4: expression EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_standaloneExpression7324);
            expression360=expression();
            _fsp--;

            adaptor.addChild(root_0, expression360.getTree());
            EOF361=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_standaloneExpression7326); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
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


 

    public static final BitSet FOLLOW_reservedWord_in_token1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_token1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_token1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_token2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_token2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_token2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WXML_in_identifier2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_identifier2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_identifier2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EACH_in_identifier2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_identifier2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_identifier2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2549 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_xmlAttribute2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_MUL_in_xmlAttribute2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LBRACK_in_xmlAttribute2587 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_xmlAttribute2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_xmlAttribute2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertySelector2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_propertySelector2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlLiteral_in_literal2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_xmlLiteral2939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_xmlLiteral2956 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_xmlLiteral2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_xmlLiteral2960 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_xmlLiteral2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_primaryExpression3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3812 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3843 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC026BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3851 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC026BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3926 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000000005FL,0x0708200000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3934 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000000001FL,0x0708200000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3999 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair4001 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_propertyName4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression4081 = new BitSet(new long[]{0xFFFFF7F602460070L,0x03200000000002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_newExpressionTail_in_newExpression4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments4097 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC003BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments4105 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4153 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression4174 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4201 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4205 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4228 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0008000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4232 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4260 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression2_in_leftHandSideExpression4264 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4289 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4293 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4315 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000100001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_propertySelector_in_leftHandSideExpression4319 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_memberExpression_in_newExpressionTail4380 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_newExpressionTail4403 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_newExpressionTail4407 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_newExpressionTail4430 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100009FL,0x0008000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_newExpressionTail4434 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_newExpressionTail4462 = new BitSet(new long[]{0xFFFFF7F600020000L,0x002000000100001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression2_in_newExpressionTail4466 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_newExpressionTail4489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LBRACK_in_newExpressionTail4491 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_newExpressionTail4493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_newExpressionTail4495 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_newExpressionTail4517 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000100001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_propertySelector_in_newExpressionTail4521 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_newExpressionTail4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression24624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression24630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression24636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4652 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4707 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4792 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4794 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4796 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4798 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_namespaceStatement4800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4834 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4838 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4853 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4875 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4905 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4909 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4924 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4943 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4947 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4974 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4988 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4992 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn5015 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5034 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression5038 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5057 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn5071 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn5075 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn5094 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression5114 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression5118 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression5121 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn5135 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn5139 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn5142 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression5158 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression5162 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression5165 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5181 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn5185 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn5188 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5203 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression5207 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression5210 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5225 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn5229 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn5232 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5251 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression5255 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5258 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5272 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn5276 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5279 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5294 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression5298 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5301 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5316 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn5320 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5323 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression5342 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression5346 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5349 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5351 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5368 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn5372 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5375 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn5377 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5408 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5415 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5496 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5503 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5532 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5577 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5784 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x0718200000000000L});
    public static final BitSet FOLLOW_sourceElement_in_block5786 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x0718200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5818 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5824 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5854 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5859 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5876 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5881 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5898 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5904 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5986 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5990 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5992 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5998 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement6060 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement6062 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement6064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement6066 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement6068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement6070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement6097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement6100 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement6103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement6105 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement6125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement6127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement6129 = new BitSet(new long[]{0xFFFFF7FE72461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement6131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement6133 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement6181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement6184 = new BitSet(new long[]{0xFFFFF7FE72461070L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement6187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement6189 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar6224 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6226 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar6238 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar6286 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6295 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6304 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6388 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6403 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6455 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6464 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6543 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6552 = new BitSet(new long[]{0xFFFFF7FE52461072L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00080C0000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00080C0000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6678 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC012FFL,0x07182C0000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6706 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6711 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6732 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6738 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6742 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6746 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6779 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6782 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6784 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6787 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6800 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6803 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6806 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF2L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6823 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6825 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6858 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6885 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6889 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6914 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6917 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6936 = new BitSet(new long[]{0xFFFFF7FE52461070L,0x0320000C0CC002BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_expression_in_catchFilter6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6976 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression7012 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000009FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression7016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression7019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameter7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList7061 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000011FL,0x0008000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList7065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList7069 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList7071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody7109 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x0718200000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody7111 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012FFL,0x0718200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration7151 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration7155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration7157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration7159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration7192 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration7198 = new BitSet(new long[]{0xFFFFF7F600020000L,0x000000000000001FL,0x0008000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration7202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration7204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7247 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_sourceElement_in_program7250 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_sourceElementSync_in_program7252 = new BitSet(new long[]{0xFFFFFFFFFFCF3CF0L,0x0320000C0CC012BFL,0x0718200000000000L});
    public static final BitSet FOLLOW_EOF_in_program7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_standaloneExpression7324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_standaloneExpression7326 = new BitSet(new long[]{0x0000000000000002L});

}
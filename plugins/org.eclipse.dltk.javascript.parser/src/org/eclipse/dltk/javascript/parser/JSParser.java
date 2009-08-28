// $ANTLR 3.0.1 JS.g 2009-08-28 15:49:29

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "CDATA", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "XCOPEN", "XCCLOSE", "XLCLOSE", "XRCLOSE", "CDATAOPEN", "XHOPEN", "XHCLOSE", "AT", "DOTDOT", "COLONCOLON", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XML", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "XmlAttribute", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "PropertyIdentifierSymbols", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar", "XMLLiteral"
    };
    public static final int PACKAGE=59;
    public static final int FUNCTION=18;
    public static final int SHR=94;
    public static final int VT=154;
    public static final int RegularExpressionChar=192;
    public static final int CDATA=36;
    public static final int XRCLOSE=121;
    public static final int LOCALNAME=134;
    public static final int MOD=90;
    public static final int SHL=93;
    public static final int CONST=44;
    public static final int XHOPEN=123;
    public static final int DO=13;
    public static final int DQUOTE=151;
    public static final int NOT=99;
    public static final int EOF=-1;
    public static final int CEXPR=136;
    public static final int DIVASS=117;
    public static final int BYINDEX=132;
    public static final int INC=91;
    public static final int RPAREN=73;
    public static final int FINAL=50;
    public static final int FORSTEP=139;
    public static final int IMPORT=54;
    public static final int EOL=165;
    public static final int XLCLOSE=120;
    public static final int PropertyIdentifierSymbols=176;
    public static final int OctalDigit=178;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int ARGS=128;
    public static final int GET=33;
    public static final int WhiteSpace=159;
    public static final int EXPORT=48;
    public static final int EQ=83;
    public static final int GOTO=52;
    public static final int XORASS=115;
    public static final int SHU=95;
    public static final int RBRACK=75;
    public static final int RBRACE=71;
    public static final int STATIC=64;
    public static final int INV=100;
    public static final int ELSE=14;
    public static final int NATIVE=58;
    public static final int INT=55;
    public static final int FF=155;
    public static final int OctalEscapeSequence=186;
    public static final int RegularExpressionFirstChar=191;
    public static final int TYPEOF=28;
    public static final int GT=80;
    public static final int CALL=135;
    public static final int CharacterEscapeSequence=184;
    public static final int LAND=101;
    public static final int XML=149;
    public static final int PINC=147;
    public static final int PROTECTED=61;
    public static final int LBRACK=74;
    public static final int LBRACE=70;
    public static final int SUB=88;
    public static final int RegularExpressionLiteral=177;
    public static final int FLOAT=51;
    public static final int DecimalIntegerLiteral=180;
    public static final int HexDigit=170;
    public static final int LPAREN=72;
    public static final int AT=125;
    public static final int IMPLEMENTS=53;
    public static final int CDATAOPEN=122;
    public static final int YIELD=35;
    public static final int XCCLOSE=119;
    public static final int SHRASS=111;
    public static final int PS=163;
    public static final int MultiLineComment=166;
    public static final int ADD=87;
    public static final int ZeroToThree=185;
    public static final int ITEM=140;
    public static final int XMLLiteral=193;
    public static final int UnicodeEscapeSequence=188;
    public static final int SHUASS=112;
    public static final int SHORT=63;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=152;
    public static final int SAME=85;
    public static final int XHCLOSE=124;
    public static final int COLON=104;
    public static final int StringLiteral=168;
    public static final int PAREXPR=145;
    public static final int ENUM=47;
    public static final int NBSP=157;
    public static final int HexIntegerLiteral=183;
    public static final int SP=156;
    public static final int BLOCK=130;
    public static final int LineTerminator=164;
    public static final int INTERFACE=56;
    public static final int DIV=116;
    public static final int LONG=57;
    public static final int CR=161;
    public static final int PUBLIC=62;
    public static final int LOR=102;
    public static final int LT=79;
    public static final int WHILE=31;
    public static final int BackslashSequence=190;
    public static final int LS=162;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=42;
    public static final int DecimalDigit=172;
    public static final int BYFIELD=131;
    public static final int BREAK=7;
    public static final int Identifier=175;
    public static final int WXML=37;
    public static final int POS=148;
    public static final int DOUBLE=46;
    public static final int ExponentPart=179;
    public static final int VAR=29;
    public static final int VOID=30;
    public static final int SUPER=65;
    public static final int EACH=17;
    public static final int LABELLED=141;
    public static final int ADDASS=106;
    public static final int ARRAY=129;
    public static final int PRIVATE=60;
    public static final int SWITCH=24;
    public static final int NULL=4;
    public static final int THROWS=67;
    public static final int DELETE=12;
    public static final int XCOPEN=118;
    public static final int MUL=89;
    public static final int IdentifierStartASCII=171;
    public static final int TRY=27;
    public static final int NAMESPACE=38;
    public static final int SHLASS=110;
    public static final int COLONCOLON=127;
    public static final int USP=158;
    public static final int ANDASS=113;
    public static final int IdentifierNameASCIIStart=174;
    public static final int QUE=103;
    public static final int OR=97;
    public static final int DEBUGGER=45;
    public static final int PDEC=146;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=189;
    public static final int THROW=26;
    public static final int MULASS=108;
    public static final int XmlAttribute=169;
    public static final int DEC=92;
    public static final int OctalIntegerLiteral=182;
    public static final int CLASS=43;
    public static final int ORASS=114;
    public static final int HexEscapeSequence=187;
    public static final int NAMEDVALUE=142;
    public static final int SingleLineComment=167;
    public static final int GTE=82;
    public static final int FOR=16;
    public static final int DOTDOT=126;
    public static final int ABSTRACT=39;
    public static final int AND=96;
    public static final int LTE=81;
    public static final int IF=19;
    public static final int SUBASS=107;
    public static final int SYNCHRONIZED=66;
    public static final int BOOLEAN=40;
    public static final int EXPR=137;
    public static final int IN=20;
    public static final int CONTINUE=10;
    public static final int OBJECT=144;
    public static final int COMMA=78;
    public static final int TRANSIENT=68;
    public static final int FORITER=138;
    public static final int MODASS=109;
    public static final int DOT=76;
    public static final int IdentifierPart=173;
    public static final int WITH=32;
    public static final int BYTE=41;
    public static final int XOR=98;
    public static final int VOLATILE=69;
    public static final int NSAME=86;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=133;
    public static final int TAB=153;
    public static final int DecimalLiteral=181;
    public static final int TRUE=5;
    public static final int NEQ=84;
    public static final int FINALLY=15;
    public static final int NEG=143;
    public static final int ASSIGN=105;
    public static final int SEMIC=77;
    public static final int EXTENDS=49;
    public static final int BSLASH=150;
    public static final int LF=160;

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
    	
    	cached[0] = new Boolean(result);
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
    			case XML:
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
    // JS.g:602:1: token : ( reservedWord | identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );
    public final token_return token() throws RecognitionException {
        token_return retval = new token_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral5=null;
        Token XmlAttribute6=null;
        reservedWord_return reservedWord1 = null;

        identifier_return identifier2 = null;

        punctuator_return punctuator3 = null;

        numericLiteral_return numericLiteral4 = null;


        Object StringLiteral5_tree=null;
        Object XmlAttribute6_tree=null;

        try {
            // JS.g:603:2: ( reservedWord | identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute )
            int alt1=6;
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
            case XML:
                {
                alt1=1;
                }
                break;
            case WXML:
            case Identifier:
                {
                alt1=2;
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
                alt1=3;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=4;
                }
                break;
            case StringLiteral:
                {
                alt1=5;
                }
                break;
            case XmlAttribute:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("602:1: token : ( reservedWord | identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:603:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1949);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:604:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1954);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:605:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1959);
                    punctuator3=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:606:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1964);
                    numericLiteral4=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:607:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral5=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1969); 
                    StringLiteral5_tree = (Object)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;
                case 6 :
                    // JS.g:608:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute6=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_token1974); 
                    XmlAttribute6_tree = (Object)adaptor.create(XmlAttribute6);
                    adaptor.addChild(root_0, XmlAttribute6_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:614:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final reservedWord_return reservedWord() throws RecognitionException {
        reservedWord_return retval = new reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL9=null;
        keyword_return keyword7 = null;

        futureReservedWord_return futureReservedWord8 = null;

        booleanLiteral_return booleanLiteral10 = null;


        Object NULL9_tree=null;

        try {
            // JS.g:615:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
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
            case NAMESPACE:
            case XML:
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
                    new NoViableAltException("614:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:615:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1989);
                    keyword7=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword7.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:616:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1994);
                    futureReservedWord8=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord8.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:617:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL9=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord1999); 
                    NULL9_tree = (Object)adaptor.create(NULL9);
                    adaptor.addChild(root_0, NULL9_tree);


                    }
                    break;
                case 4 :
                    // JS.g:618:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2004);
                    booleanLiteral10=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:625:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | XML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // JS.g:626:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | XML | YIELD )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=YIELD)||input.LA(1)==NAMESPACE||input.LA(1)==XML ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set11));
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
            reportError(re);
            recover(input,re);
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
    // JS.g:663:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // JS.g:664:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set12));
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
            reportError(re);
            recover(input,re);
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
    // JS.g:737:1: identifier : ( WXML | Identifier );
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:738:3: ( WXML | Identifier )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( input.LA(1)==WXML||input.LA(1)==Identifier ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set13));
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end identifier

    public static class punctuator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start punctuator
    // JS.g:754:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // JS.g:755:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS)||(input.LA(1)>=DOTDOT && input.LA(1)<=COLONCOLON) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set14));
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
            reportError(re);
            recover(input,re);
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
    // JS.g:812:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL15=null;
        Token StringLiteral18=null;
        Token RegularExpressionLiteral19=null;
        booleanLiteral_return booleanLiteral16 = null;

        numericLiteral_return numericLiteral17 = null;


        Object NULL15_tree=null;
        Object StringLiteral18_tree=null;
        Object RegularExpressionLiteral19_tree=null;

        try {
            // JS.g:813:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
            int alt3=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt3=3;
                }
                break;
            case StringLiteral:
                {
                alt3=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("812:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // JS.g:813:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL15=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2775); 
                    NULL15_tree = (Object)adaptor.create(NULL15);
                    adaptor.addChild(root_0, NULL15_tree);


                    }
                    break;
                case 2 :
                    // JS.g:814:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2780);
                    booleanLiteral16=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral16.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:815:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2785);
                    numericLiteral17=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral17.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:816:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral18=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2790); 
                    StringLiteral18_tree = (Object)adaptor.create(StringLiteral18);
                    adaptor.addChild(root_0, StringLiteral18_tree);


                    }
                    break;
                case 5 :
                    // JS.g:817:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral19=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2795); 
                    RegularExpressionLiteral19_tree = (Object)adaptor.create(RegularExpressionLiteral19);
                    adaptor.addChild(root_0, RegularExpressionLiteral19_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start booleanLiteral
    // JS.g:820:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // JS.g:821:2: ( TRUE | FALSE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set20=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set20));
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
            reportError(re);
            recover(input,re);
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
    // JS.g:867:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set21=null;

        Object set21_tree=null;

        try {
            // JS.g:868:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set21=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set21));
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
            reportError(re);
            recover(input,re);
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
    // JS.g:963:1: primaryExpression : ( THIS | identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS22=null;
        Token XmlAttribute24=null;
        identifier_return identifier23 = null;

        literal_return literal25 = null;

        arrayLiteral_return arrayLiteral26 = null;

        objectLiteral_return objectLiteral27 = null;

        parenExpression_return parenExpression28 = null;


        Object THIS22_tree=null;
        Object XmlAttribute24_tree=null;

        try {
            // JS.g:964:2: ( THIS | identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
            int alt4=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
            case WXML:
            case Identifier:
                {
                alt4=2;
                }
                break;
            case XmlAttribute:
                {
                alt4=3;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=4;
                }
                break;
            case LBRACK:
                {
                alt4=5;
                }
                break;
            case LBRACE:
                {
                alt4=6;
                }
                break;
            case LPAREN:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("963:1: primaryExpression : ( THIS | identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:964:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS22=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3424); 
                    THIS22_tree = (Object)adaptor.create(THIS22);
                    adaptor.addChild(root_0, THIS22_tree);


                    }
                    break;
                case 2 :
                    // JS.g:965:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3429);
                    identifier23=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier23.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:966:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute24=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_primaryExpression3434); 
                    XmlAttribute24_tree = (Object)adaptor.create(XmlAttribute24);
                    adaptor.addChild(root_0, XmlAttribute24_tree);


                    }
                    break;
                case 4 :
                    // JS.g:967:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3439);
                    literal25=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal25.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:968:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3444);
                    arrayLiteral26=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral26.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:969:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3449);
                    objectLiteral27=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral27.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:970:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3454);
                    parenExpression28=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:973:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
    public final parenExpression_return parenExpression() throws RecognitionException {
        parenExpression_return retval = new parenExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token RPAREN30=null;
        expression_return expression29 = null;


        Object lpar_tree=null;
        Object RPAREN30_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:974:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:974:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3470); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3472);
            expression29=expression();
            _fsp--;

            stream_expression.add(expression29.getTree());
            RPAREN30=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3474); 
            stream_RPAREN.add(RPAREN30);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 974:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:974:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:977:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA32=null;
        Token RBRACK34=null;
        arrayItem_return arrayItem31 = null;

        arrayItem_return arrayItem33 = null;


        Object lb_tree=null;
        Object COMMA32_tree=null;
        Object RBRACK34_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:978:2: (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:978:4: lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3499); 
            stream_LBRACK.add(lb);

            // JS.g:978:14: ( arrayItem ( COMMA arrayItem )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==DELETE||LA6_0==FUNCTION||LA6_0==NEW||LA6_0==THIS||LA6_0==TYPEOF||LA6_0==VOID||LA6_0==YIELD||LA6_0==WXML||LA6_0==LBRACE||LA6_0==LPAREN||LA6_0==LBRACK||LA6_0==COMMA||(LA6_0>=ADD && LA6_0<=SUB)||(LA6_0>=INC && LA6_0<=DEC)||(LA6_0>=NOT && LA6_0<=INV)||(LA6_0>=StringLiteral && LA6_0<=XmlAttribute)||LA6_0==Identifier||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)||LA6_0==XMLLiteral) ) {
                alt6=1;
            }
            else if ( (LA6_0==RBRACK) ) {
                int LA6_2 = input.LA(2);

                if ( ( input.LA(1) == COMMA ) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // JS.g:978:16: arrayItem ( COMMA arrayItem )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3503);
                    arrayItem31=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem31.getTree());
                    // JS.g:978:26: ( COMMA arrayItem )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // JS.g:978:28: COMMA arrayItem
                    	    {
                    	    COMMA32=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3507); 
                    	    stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3509);
                    	    arrayItem33=arrayItem();
                    	    _fsp--;

                    	    stream_arrayItem.add(arrayItem33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK34=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3517); 
            stream_RBRACK.add(RBRACK34);


            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 979:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:979:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:979:28: ( arrayItem )*
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
            reportError(re);
            recover(input,re);
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
    // JS.g:982:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:983:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:983:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:983:4: (expr= assignmentExpression | {...}?)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==YIELD||LA7_0==WXML||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=StringLiteral && LA7_0<=XmlAttribute)||LA7_0==Identifier||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)||LA7_0==XMLLiteral) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK||LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("983:4: (expr= assignmentExpression | {...}?)", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // JS.g:983:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3545);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:983:34: {...}?
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
            // 984:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:984:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:984:13: ( $expr)?
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
            reportError(re);
            recover(input,re);
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
    // JS.g:987:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA36=null;
        Token RBRACE38=null;
        objectPropertyInitializer_return objectPropertyInitializer35 = null;

        objectPropertyInitializer_return objectPropertyInitializer37 = null;


        Object lb_tree=null;
        Object COMMA36_tree=null;
        Object RBRACE38_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:988:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) )
            // JS.g:988:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3577); 
            stream_LBRACE.add(lb);

            // JS.g:988:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=GET && LA9_0<=SET)||LA9_0==WXML||(LA9_0>=StringLiteral && LA9_0<=XmlAttribute)||LA9_0==Identifier||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // JS.g:988:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )*
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3581);
                    objectPropertyInitializer35=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer35.getTree());
                    // JS.g:988:42: ( COMMA objectPropertyInitializer )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:988:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA36=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3585); 
                    	    stream_COMMA.add(COMMA36);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3587);
                    	    objectPropertyInitializer37=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE38=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3595); 
            stream_RBRACE.add(RBRACE38);


            // AST REWRITE
            // elements: objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 989:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
            {
                // JS.g:989:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:989:30: ( objectPropertyInitializer )*
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
            reportError(re);
            recover(input,re);
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
    // JS.g:992:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair39 = null;

        getMethodDeclaration_return getMethodDeclaration40 = null;

        setMethodDeclaration_return setMethodDeclaration41 = null;



        try {
            // JS.g:993:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt10=3;
            switch ( input.LA(1) ) {
            case WXML:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt10=1;
                }
                break;
            case GET:
                {
                alt10=2;
                }
                break;
            case SET:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("992:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // JS.g:993:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3620);
                    nameValuePair39=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair39.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:994:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3627);
                    getMethodDeclaration40=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration40.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:995:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3633);
                    setMethodDeclaration41=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:998:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON43=null;
        propertyName_return propertyName42 = null;

        assignmentExpression_return assignmentExpression44 = null;


        Object COLON43_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:999:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:999:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3646);
            propertyName42=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName42.getTree());
            COLON43=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3648); 
            stream_COLON.add(COLON43);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3650);
            assignmentExpression44=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression44.getTree());

            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1000:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1000:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1003:1: propertyName : ( identifier | StringLiteral | numericLiteral | XmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral46=null;
        Token XmlAttribute48=null;
        identifier_return identifier45 = null;

        numericLiteral_return numericLiteral47 = null;


        Object StringLiteral46_tree=null;
        Object XmlAttribute48_tree=null;

        try {
            // JS.g:1004:2: ( identifier | StringLiteral | numericLiteral | XmlAttribute )
            int alt11=4;
            switch ( input.LA(1) ) {
            case WXML:
            case Identifier:
                {
                alt11=1;
                }
                break;
            case StringLiteral:
                {
                alt11=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt11=3;
                }
                break;
            case XmlAttribute:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1003:1: propertyName : ( identifier | StringLiteral | numericLiteral | XmlAttribute );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // JS.g:1004:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3674);
                    identifier45=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier45.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1005:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral46=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3679); 
                    StringLiteral46_tree = (Object)adaptor.create(StringLiteral46);
                    adaptor.addChild(root_0, StringLiteral46_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1006:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3684);
                    numericLiteral47=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral47.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1007:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute48=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_propertyName3689); 
                    XmlAttribute48_tree = (Object)adaptor.create(XmlAttribute48);
                    adaptor.addChild(root_0, XmlAttribute48_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1019:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression49 = null;

        functionExpression_return functionExpression50 = null;

        newExpression_return newExpression51 = null;



        try {
            // JS.g:1020:2: ( primaryExpression | functionExpression | newExpression )
            int alt12=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case THIS:
            case WXML:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt12=1;
                }
                break;
            case FUNCTION:
                {
                alt12=2;
                }
                break;
            case NEW:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1019:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // JS.g:1020:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3707);
                    primaryExpression49=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression49.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1021:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3712);
                    functionExpression50=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression50.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1022:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3717);
                    newExpression51=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1025:1: newExpression : NEW memberExpression ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW52=null;
        memberExpression_return memberExpression53 = null;


        Object NEW52_tree=null;

        try {
            // JS.g:1026:2: ( NEW memberExpression )
            // JS.g:1026:4: NEW memberExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW52=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3728); 
            NEW52_tree = (Object)adaptor.create(NEW52);
            root_0 = (Object)adaptor.becomeRoot(NEW52_tree, root_0);

            pushFollow(FOLLOW_memberExpression_in_newExpression3731);
            memberExpression53=memberExpression();
            _fsp--;

            adaptor.addChild(root_0, memberExpression53.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1030:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN54=null;
        Token COMMA56=null;
        Token RPAREN58=null;
        assignmentExpression_return assignmentExpression55 = null;

        assignmentExpression_return assignmentExpression57 = null;


        Object LPAREN54_tree=null;
        Object COMMA56_tree=null;
        Object RPAREN58_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1031:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
            // JS.g:1031:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN54=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3744); 
            stream_LPAREN.add(LPAREN54);

            // JS.g:1031:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=NULL && LA14_0<=FALSE)||LA14_0==DELETE||LA14_0==FUNCTION||LA14_0==NEW||LA14_0==THIS||LA14_0==TYPEOF||LA14_0==VOID||LA14_0==YIELD||LA14_0==WXML||LA14_0==LBRACE||LA14_0==LPAREN||LA14_0==LBRACK||(LA14_0>=ADD && LA14_0<=SUB)||(LA14_0>=INC && LA14_0<=DEC)||(LA14_0>=NOT && LA14_0<=INV)||(LA14_0>=StringLiteral && LA14_0<=XmlAttribute)||LA14_0==Identifier||LA14_0==RegularExpressionLiteral||(LA14_0>=DecimalLiteral && LA14_0<=HexIntegerLiteral)||LA14_0==XMLLiteral) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // JS.g:1031:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3748);
                    assignmentExpression55=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression55.getTree());
                    // JS.g:1031:34: ( COMMA assignmentExpression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // JS.g:1031:36: COMMA assignmentExpression
                    	    {
                    	    COMMA56=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments3752); 
                    	    stream_COMMA.add(COMMA56);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3754);
                    	    assignmentExpression57=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN58=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments3762); 
            stream_RPAREN.add(RPAREN58);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1032:2: -> ^( ARGS ( assignmentExpression )* )
            {
                // JS.g:1032:5: ^( ARGS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1032:13: ( assignmentExpression )*
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1035:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK61=null;
        Token RBRACK63=null;
        Token DOT64=null;
        Token DOTDOT66=null;
        Token COLONCOLON68=null;
        memberExpression_return memberExpression59 = null;

        arguments_return arguments60 = null;

        expression_return expression62 = null;

        rightHandSideExpression_return rightHandSideExpression65 = null;

        expression_return expression67 = null;

        expression_return expression69 = null;


        Object LBRACK61_tree=null;
        Object RBRACK63_tree=null;
        Object DOT64_tree=null;
        Object DOTDOT66_tree=null;
        Object COLONCOLON68_tree=null;
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
            // JS.g:1036:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1037:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1037:3: ( memberExpression -> memberExpression )
            // JS.g:1038:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3795);
            memberExpression59=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression59.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1038:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1040:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            loop15:
            do {
                int alt15=6;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt15=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt15=2;
                    }
                    break;
                case DOT:
                    {
                    alt15=3;
                    }
                    break;
                case DOTDOT:
                    {
                    alt15=4;
                    }
                    break;
                case COLONCOLON:
                    {
                    alt15=5;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // JS.g:1041:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3816);
            	    arguments60=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments60.getTree());

            	    // AST REWRITE
            	    // elements: arguments, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1041:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1041:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1042:7: LBRACK expression RBRACK
            	    {
            	    LBRACK61=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3841); 
            	    stream_LBRACK.add(LBRACK61);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3843);
            	    expression62=expression();
            	    _fsp--;

            	    stream_expression.add(expression62.getTree());
            	    RBRACK63=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3845); 
            	    stream_RBRACK.add(RBRACK63);


            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1042:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // JS.g:1042:36: ^( BYINDEX $leftHandSideExpression expression )
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
            	    // JS.g:1043:7: DOT rightHandSideExpression
            	    {
            	    DOT64=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3867); 
            	    stream_DOT.add(DOT64);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression3869);
            	    rightHandSideExpression65=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression65.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1043:35: -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // JS.g:1043:38: ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_rightHandSideExpression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1044:7: DOTDOT expression
            	    {
            	    DOTDOT66=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression3890); 
            	    stream_DOTDOT.add(DOTDOT66);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3892);
            	    expression67=expression();
            	    _fsp--;

            	    stream_expression.add(expression67.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1044:25: -> ^( ALLCHILDREN $leftHandSideExpression expression )
            	    {
            	        // JS.g:1044:28: ^( ALLCHILDREN $leftHandSideExpression expression )
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
            	    // JS.g:1045:7: COLONCOLON expression
            	    {
            	    COLONCOLON68=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression3911); 
            	    stream_COLONCOLON.add(COLONCOLON68);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3913);
            	    expression69=expression();
            	    _fsp--;

            	    stream_expression.add(expression69.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1045:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1045:32: ^( LOCALNAME $leftHandSideExpression expression )
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
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end leftHandSideExpression

    public static class rightHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rightHandSideExpression
    // JS.g:1049:1: rightHandSideExpression : ( parenExpression | identifier | XmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XmlAttribute72=null;
        Token MUL73=null;
        parenExpression_return parenExpression70 = null;

        identifier_return identifier71 = null;


        Object XmlAttribute72_tree=null;
        Object MUL73_tree=null;

        try {
            // JS.g:1050:3: ( parenExpression | identifier | XmlAttribute | MUL )
            int alt16=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt16=1;
                }
                break;
            case WXML:
            case Identifier:
                {
                alt16=2;
                }
                break;
            case XmlAttribute:
                {
                alt16=3;
                }
                break;
            case MUL:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1049:1: rightHandSideExpression : ( parenExpression | identifier | XmlAttribute | MUL );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // JS.g:1050:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression3942);
                    parenExpression70=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression70.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1051:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression3949);
                    identifier71=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier71.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1052:5: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute72=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_rightHandSideExpression3955); 
                    XmlAttribute72_tree = (Object)adaptor.create(XmlAttribute72);
                    adaptor.addChild(root_0, XmlAttribute72_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1053:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL73=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression3961); 
                    MUL73_tree = (Object)adaptor.create(MUL73);
                    adaptor.addChild(root_0, MUL73_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1086:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression74 = null;

        postfixOperator_return postfixOperator75 = null;



        try {
            // JS.g:1087:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1087:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3999);
            leftHandSideExpression74=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression74.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1087:95: ( postfixOperator )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==INC) ) {
                alt17=1;
            }
            else if ( (LA17_0==DEC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // JS.g:1087:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4005);
                    postfixOperator75=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator75.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1090:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1091:2: (op= INC | op= DEC )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INC) ) {
                alt18=1;
            }
            else if ( (LA18_0==DEC) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1090:1: postfixOperator : (op= INC | op= DEC );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1091:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4023); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1092:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4032); 
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1099:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLLiteral79=null;
        postfixExpression_return postfixExpression76 = null;

        unaryOperator_return unaryOperator77 = null;

        unaryExpression_return unaryExpression78 = null;


        Object XMLLiteral79_tree=null;

        try {
            // JS.g:1100:2: ( postfixExpression | unaryOperator unaryExpression | XMLLiteral )
            int alt19=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case FUNCTION:
            case NEW:
            case THIS:
            case WXML:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt19=1;
                }
                break;
            case DELETE:
            case TYPEOF:
            case VOID:
            case YIELD:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
                {
                alt19=2;
                }
                break;
            case XMLLiteral:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1099:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // JS.g:1100:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4049);
                    postfixExpression76=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression76.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1101:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4054);
                    unaryOperator77=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator77.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4057);
                    unaryExpression78=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression78.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1102:5: XMLLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLLiteral79=(Token)input.LT(1);
                    match(input,XMLLiteral,FOLLOW_XMLLiteral_in_unaryExpression4063); 
                    XMLLiteral79_tree = (Object)adaptor.create(XMLLiteral79);
                    adaptor.addChild(root_0, XMLLiteral79_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1105:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE80=null;
        Token VOID81=null;
        Token TYPEOF82=null;
        Token INC83=null;
        Token DEC84=null;
        Token INV85=null;
        Token NOT86=null;
        Token YIELD87=null;

        Object op_tree=null;
        Object DELETE80_tree=null;
        Object VOID81_tree=null;
        Object TYPEOF82_tree=null;
        Object INC83_tree=null;
        Object DEC84_tree=null;
        Object INV85_tree=null;
        Object NOT86_tree=null;
        Object YIELD87_tree=null;

        try {
            // JS.g:1106:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt20=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt20=1;
                }
                break;
            case VOID:
                {
                alt20=2;
                }
                break;
            case TYPEOF:
                {
                alt20=3;
                }
                break;
            case INC:
                {
                alt20=4;
                }
                break;
            case DEC:
                {
                alt20=5;
                }
                break;
            case ADD:
                {
                alt20=6;
                }
                break;
            case SUB:
                {
                alt20=7;
                }
                break;
            case INV:
                {
                alt20=8;
                }
                break;
            case NOT:
                {
                alt20=9;
                }
                break;
            case YIELD:
                {
                alt20=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1105:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // JS.g:1106:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE80=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4075); 
                    DELETE80_tree = (Object)adaptor.create(DELETE80);
                    adaptor.addChild(root_0, DELETE80_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1107:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID81=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4080); 
                    VOID81_tree = (Object)adaptor.create(VOID81);
                    adaptor.addChild(root_0, VOID81_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1108:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF82=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4085); 
                    TYPEOF82_tree = (Object)adaptor.create(TYPEOF82);
                    adaptor.addChild(root_0, TYPEOF82_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1109:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC83=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4090); 
                    INC83_tree = (Object)adaptor.create(INC83);
                    adaptor.addChild(root_0, INC83_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1110:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC84=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4095); 
                    DEC84_tree = (Object)adaptor.create(DEC84);
                    adaptor.addChild(root_0, DEC84_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1111:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4102); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1112:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4111); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1113:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV85=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4118); 
                    INV85_tree = (Object)adaptor.create(INV85);
                    adaptor.addChild(root_0, INV85_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1114:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT86=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4123); 
                    NOT86_tree = (Object)adaptor.create(NOT86);
                    adaptor.addChild(root_0, NOT86_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1115:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD87=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4128); 
                    YIELD87_tree = (Object)adaptor.create(YIELD87);
                    adaptor.addChild(root_0, YIELD87_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1142:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT88=null;
        Token WXML89=null;
        Token NAMESPACE90=null;
        Token ASSIGN91=null;
        Token StringLiteral92=null;
        semic_return semic93 = null;


        Object DEFAULT88_tree=null;
        Object WXML89_tree=null;
        Object NAMESPACE90_tree=null;
        Object ASSIGN91_tree=null;
        Object StringLiteral92_tree=null;

        try {
            // JS.g:1143:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic )
            // JS.g:1143:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT88=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4164); 
            DEFAULT88_tree = (Object)adaptor.create(DEFAULT88);
            adaptor.addChild(root_0, DEFAULT88_tree);

            WXML89=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4166); 
            WXML89_tree = (Object)adaptor.create(WXML89);
            adaptor.addChild(root_0, WXML89_tree);

            NAMESPACE90=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4168); 
            NAMESPACE90_tree = (Object)adaptor.create(NAMESPACE90);
            root_0 = (Object)adaptor.becomeRoot(NAMESPACE90_tree, root_0);

            ASSIGN91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4171); 
            ASSIGN91_tree = (Object)adaptor.create(ASSIGN91);
            adaptor.addChild(root_0, ASSIGN91_tree);

            StringLiteral92=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4173); 
            StringLiteral92_tree = (Object)adaptor.create(StringLiteral92);
            adaptor.addChild(root_0, StringLiteral92_tree);

            pushFollow(FOLLOW_semic_in_namespaceStatement4175);
            semic93=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1148:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set95=null;
        unaryExpression_return unaryExpression94 = null;

        unaryExpression_return unaryExpression96 = null;


        Object set95_tree=null;

        try {
            // JS.g:1149:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1149:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4190);
            unaryExpression94=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression94.getTree());
            // JS.g:1149:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=MUL && LA21_0<=MOD)||LA21_0==DIV) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // JS.g:1149:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set95=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set95), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4194);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4209);
            	    unaryExpression96=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1156:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;
        multiplicativeExpression_return multiplicativeExpression97 = null;

        multiplicativeExpression_return multiplicativeExpression99 = null;


        Object set98_tree=null;

        try {
            // JS.g:1157:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1157:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4227);
            multiplicativeExpression97=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression97.getTree());
            // JS.g:1157:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=ADD && LA22_0<=SUB)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // JS.g:1157:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set98=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set98), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4231);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4242);
            	    multiplicativeExpression99=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1164:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set101=null;
        additiveExpression_return additiveExpression100 = null;

        additiveExpression_return additiveExpression102 = null;


        Object set101_tree=null;

        try {
            // JS.g:1165:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1165:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4261);
            additiveExpression100=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression100.getTree());
            // JS.g:1165:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=SHL && LA23_0<=SHU)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // JS.g:1165:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set101=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set101), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4265);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4280);
            	    additiveExpression102=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1172:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;
        shiftExpression_return shiftExpression103 = null;

        shiftExpression_return shiftExpression105 = null;


        Object set104_tree=null;

        try {
            // JS.g:1173:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1173:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4299);
            shiftExpression103=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression103.getTree());
            // JS.g:1173:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==INSTANCEOF||(LA24_0>=LT && LA24_0<=GTE)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==IN) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // JS.g:1173:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set104=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set104), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4303);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4330);
            	    shiftExpression105=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression105.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1176:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set107=null;
        shiftExpression_return shiftExpression106 = null;

        shiftExpression_return shiftExpression108 = null;


        Object set107_tree=null;

        try {
            // JS.g:1177:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1177:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4344);
            shiftExpression106=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression106.getTree());
            // JS.g:1177:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==INSTANCEOF||(LA25_0>=LT && LA25_0<=GTE)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JS.g:1177:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set107=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set107), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4348);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4371);
            	    shiftExpression108=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression108.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1184:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set110=null;
        relationalExpression_return relationalExpression109 = null;

        relationalExpression_return relationalExpression111 = null;


        Object set110_tree=null;

        try {
            // JS.g:1185:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1185:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4390);
            relationalExpression109=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression109.getTree());
            // JS.g:1185:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=EQ && LA26_0<=NSAME)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JS.g:1185:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set110=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set110), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4394);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4413);
            	    relationalExpression111=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression111.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1188:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set113=null;
        relationalExpressionNoIn_return relationalExpressionNoIn112 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn114 = null;


        Object set113_tree=null;

        try {
            // JS.g:1189:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1189:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4427);
            relationalExpressionNoIn112=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn112.getTree());
            // JS.g:1189:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=EQ && LA27_0<=NSAME)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1189:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set113=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set113), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4431);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4450);
            	    relationalExpressionNoIn114=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn114.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1196:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND116=null;
        equalityExpression_return equalityExpression115 = null;

        equalityExpression_return equalityExpression117 = null;


        Object AND116_tree=null;

        try {
            // JS.g:1197:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1197:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4470);
            equalityExpression115=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression115.getTree());
            // JS.g:1197:23: ( AND equalityExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1197:25: AND equalityExpression
            	    {
            	    AND116=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4474); 
            	    AND116_tree = (Object)adaptor.create(AND116);
            	    root_0 = (Object)adaptor.becomeRoot(AND116_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4477);
            	    equalityExpression117=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression117.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1200:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND119=null;
        equalityExpressionNoIn_return equalityExpressionNoIn118 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn120 = null;


        Object AND119_tree=null;

        try {
            // JS.g:1201:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1201:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4491);
            equalityExpressionNoIn118=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn118.getTree());
            // JS.g:1201:27: ( AND equalityExpressionNoIn )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1201:29: AND equalityExpressionNoIn
            	    {
            	    AND119=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4495); 
            	    AND119_tree = (Object)adaptor.create(AND119);
            	    root_0 = (Object)adaptor.becomeRoot(AND119_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4498);
            	    equalityExpressionNoIn120=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn120.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1204:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR122=null;
        bitwiseANDExpression_return bitwiseANDExpression121 = null;

        bitwiseANDExpression_return bitwiseANDExpression123 = null;


        Object XOR122_tree=null;

        try {
            // JS.g:1205:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1205:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4514);
            bitwiseANDExpression121=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression121.getTree());
            // JS.g:1205:25: ( XOR bitwiseANDExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==XOR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1205:27: XOR bitwiseANDExpression
            	    {
            	    XOR122=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4518); 
            	    XOR122_tree = (Object)adaptor.create(XOR122);
            	    root_0 = (Object)adaptor.becomeRoot(XOR122_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4521);
            	    bitwiseANDExpression123=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression123.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1208:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR125=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn124 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn126 = null;


        Object XOR125_tree=null;

        try {
            // JS.g:1209:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1209:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4537);
            bitwiseANDExpressionNoIn124=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn124.getTree());
            // JS.g:1209:29: ( XOR bitwiseANDExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==XOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1209:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR125=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4541); 
            	    XOR125_tree = (Object)adaptor.create(XOR125);
            	    root_0 = (Object)adaptor.becomeRoot(XOR125_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4544);
            	    bitwiseANDExpressionNoIn126=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn126.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1212:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR128=null;
        bitwiseXORExpression_return bitwiseXORExpression127 = null;

        bitwiseXORExpression_return bitwiseXORExpression129 = null;


        Object OR128_tree=null;

        try {
            // JS.g:1213:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1213:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4559);
            bitwiseXORExpression127=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression127.getTree());
            // JS.g:1213:25: ( OR bitwiseXORExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1213:27: OR bitwiseXORExpression
            	    {
            	    OR128=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4563); 
            	    OR128_tree = (Object)adaptor.create(OR128);
            	    root_0 = (Object)adaptor.becomeRoot(OR128_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4566);
            	    bitwiseXORExpression129=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression129.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1216:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR131=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn130 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn132 = null;


        Object OR131_tree=null;

        try {
            // JS.g:1217:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1217:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4581);
            bitwiseXORExpressionNoIn130=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn130.getTree());
            // JS.g:1217:29: ( OR bitwiseXORExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==OR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1217:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR131=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4585); 
            	    OR131_tree = (Object)adaptor.create(OR131);
            	    root_0 = (Object)adaptor.becomeRoot(OR131_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4588);
            	    bitwiseXORExpressionNoIn132=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn132.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1224:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND134=null;
        bitwiseORExpression_return bitwiseORExpression133 = null;

        bitwiseORExpression_return bitwiseORExpression135 = null;


        Object LAND134_tree=null;

        try {
            // JS.g:1225:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1225:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4607);
            bitwiseORExpression133=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression133.getTree());
            // JS.g:1225:24: ( LAND bitwiseORExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LAND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1225:26: LAND bitwiseORExpression
            	    {
            	    LAND134=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4611); 
            	    LAND134_tree = (Object)adaptor.create(LAND134);
            	    root_0 = (Object)adaptor.becomeRoot(LAND134_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4614);
            	    bitwiseORExpression135=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression135.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1228:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND137=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn136 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn138 = null;


        Object LAND137_tree=null;

        try {
            // JS.g:1229:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1229:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4628);
            bitwiseORExpressionNoIn136=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn136.getTree());
            // JS.g:1229:28: ( LAND bitwiseORExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LAND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1229:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND137=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4632); 
            	    LAND137_tree = (Object)adaptor.create(LAND137);
            	    root_0 = (Object)adaptor.becomeRoot(LAND137_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4635);
            	    bitwiseORExpressionNoIn138=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn138.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1232:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR140=null;
        logicalANDExpression_return logicalANDExpression139 = null;

        logicalANDExpression_return logicalANDExpression141 = null;


        Object LOR140_tree=null;

        try {
            // JS.g:1233:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1233:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4650);
            logicalANDExpression139=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression139.getTree());
            // JS.g:1233:25: ( LOR logicalANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1233:27: LOR logicalANDExpression
            	    {
            	    LOR140=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4654); 
            	    LOR140_tree = (Object)adaptor.create(LOR140);
            	    root_0 = (Object)adaptor.becomeRoot(LOR140_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4657);
            	    logicalANDExpression141=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression141.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1236:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR143=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn142 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn144 = null;


        Object LOR143_tree=null;

        try {
            // JS.g:1237:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1237:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4672);
            logicalANDExpressionNoIn142=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn142.getTree());
            // JS.g:1237:29: ( LOR logicalANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1237:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR143=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4676); 
            	    LOR143_tree = (Object)adaptor.create(LOR143);
            	    root_0 = (Object)adaptor.becomeRoot(LOR143_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4679);
            	    logicalANDExpressionNoIn144=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn144.getTree());

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1244:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE146=null;
        Token COLON148=null;
        logicalORExpression_return logicalORExpression145 = null;

        assignmentExpression_return assignmentExpression147 = null;

        assignmentExpression_return assignmentExpression149 = null;


        Object QUE146_tree=null;
        Object COLON148_tree=null;

        try {
            // JS.g:1245:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1245:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4698);
            logicalORExpression145=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression145.getTree());
            // JS.g:1245:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==QUE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // JS.g:1245:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE146=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4702); 
                    QUE146_tree = (Object)adaptor.create(QUE146);
                    root_0 = (Object)adaptor.becomeRoot(QUE146_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4705);
                    assignmentExpression147=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression147.getTree());
                    COLON148=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4707); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4710);
                    assignmentExpression149=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression149.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1248:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE151=null;
        Token COLON153=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn150 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn152 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn154 = null;


        Object QUE151_tree=null;
        Object COLON153_tree=null;

        try {
            // JS.g:1249:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1249:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4724);
            logicalORExpressionNoIn150=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn150.getTree());
            // JS.g:1249:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // JS.g:1249:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE151=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4728); 
                    QUE151_tree = (Object)adaptor.create(QUE151);
                    root_0 = (Object)adaptor.becomeRoot(QUE151_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4731);
                    assignmentExpressionNoIn152=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn152.getTree());
                    COLON153=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4733); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4736);
                    assignmentExpressionNoIn154=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn154.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1278:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator155 = null;

        assignmentExpression_return assignmentExpression156 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1283:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1283:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4764);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1284:2: ({...}? assignmentOperator assignmentExpression )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=ASSIGN && LA40_0<=XORASS)||LA40_0==DIVASS) ) {
                int LA40_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // JS.g:1284:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4771);
                    assignmentOperator155=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator155.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4774);
                    assignmentExpression156=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression156.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1287:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set157=null;

        Object set157_tree=null;

        try {
            // JS.g:1288:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set157=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set157));
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1291:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator158 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn159 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1296:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1296:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4852);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1297:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=ASSIGN && LA41_0<=XORASS)||LA41_0==DIVASS) ) {
                int LA41_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // JS.g:1297:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4859);
                    assignmentOperator158=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator158.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4862);
                    assignmentExpressionNoIn159=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn159.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1304:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA160=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA160_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1305:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1305:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4884);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1305:32: ( COMMA exprs+= assignmentExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1305:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA160=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression4888); 
            	    stream_COMMA.add(COMMA160);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression4892);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop42;
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
            // 1306:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1306:28: ^( CEXPR ( $exprs)+ )
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
            else // 1307:2: -> $exprs
            {
                adaptor.addChild(root_0, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1310:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA161=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA161_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1311:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1311:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4929);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1311:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1311:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA161=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4933); 
            	    stream_COMMA.add(COMMA161);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4937);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop43;
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
            // 1312:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1312:28: ^( CEXPR ( $exprs)+ )
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
            else // 1313:2: -> $exprs
            {
                adaptor.addChild(root_0, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1338:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC162=null;
        Token EOF163=null;
        Token RBRACE164=null;
        Token EOL165=null;
        Token MultiLineComment166=null;

        Object SEMIC162_tree=null;
        Object EOF163_tree=null;
        Object RBRACE164_tree=null;
        Object EOL165_tree=null;
        Object MultiLineComment166_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1346:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt44=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt44=1;
                }
                break;
            case EOF:
                {
                alt44=2;
                }
                break;
            case RBRACE:
                {
                alt44=3;
                }
                break;
            case EOL:
                {
                alt44=4;
                }
                break;
            case MultiLineComment:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1338:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // JS.g:1346:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC162=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic4988); 
                    SEMIC162_tree = (Object)adaptor.create(SEMIC162);
                    adaptor.addChild(root_0, SEMIC162_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1347:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF163=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic4993); 
                    EOF163_tree = (Object)adaptor.create(EOF163);
                    adaptor.addChild(root_0, EOF163_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1348:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE164=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic4998); 
                    RBRACE164_tree = (Object)adaptor.create(RBRACE164);
                    adaptor.addChild(root_0, RBRACE164_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1349:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL165=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5005); 
                    EOL165_tree = (Object)adaptor.create(EOL165);
                    adaptor.addChild(root_0, EOL165_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1349:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment166=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5009); 
                    MultiLineComment166_tree = (Object)adaptor.create(MultiLineComment166);
                    adaptor.addChild(root_0, MultiLineComment166_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1357:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block167 = null;

        statementTail_return statementTail168 = null;



        try {
            // JS.g:1362:2: ({...}? block | statementTail )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LBRACE) ) {
                int LA45_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1357:1: statement options {k=1; } : ({...}? block | statementTail );", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA45_0>=NULL && LA45_0<=BREAK)||(LA45_0>=CONTINUE && LA45_0<=DO)||LA45_0==FOR||(LA45_0>=FUNCTION && LA45_0<=IF)||(LA45_0>=NEW && LA45_0<=WITH)||LA45_0==YIELD||LA45_0==WXML||LA45_0==CONST||LA45_0==LPAREN||LA45_0==LBRACK||LA45_0==SEMIC||(LA45_0>=ADD && LA45_0<=SUB)||(LA45_0>=INC && LA45_0<=DEC)||(LA45_0>=NOT && LA45_0<=INV)||(LA45_0>=StringLiteral && LA45_0<=XmlAttribute)||LA45_0==Identifier||LA45_0==RegularExpressionLiteral||(LA45_0>=DecimalLiteral && LA45_0<=HexIntegerLiteral)||LA45_0==XMLLiteral) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1357:1: statement options {k=1; } : ({...}? block | statementTail );", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // JS.g:1362:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5038);
                    block167=block();
                    _fsp--;

                    adaptor.addChild(root_0, block167.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1363:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5043);
                    statementTail168=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail168.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1366:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement169 = null;

        emptyStatement_return emptyStatement170 = null;

        expressionStatement_return expressionStatement171 = null;

        ifStatement_return ifStatement172 = null;

        iterationStatement_return iterationStatement173 = null;

        continueStatement_return continueStatement174 = null;

        breakStatement_return breakStatement175 = null;

        returnStatement_return returnStatement176 = null;

        withStatement_return withStatement177 = null;

        labelledStatement_return labelledStatement178 = null;

        switchStatement_return switchStatement179 = null;

        throwStatement_return throwStatement180 = null;

        tryStatement_return tryStatement181 = null;

        constStatement_return constStatement182 = null;

        namespaceStatement_return namespaceStatement183 = null;



        try {
            // JS.g:1367:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt46=15;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt46=1;
                }
                break;
            case SEMIC:
                {
                alt46=2;
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
            case StringLiteral:
            case XmlAttribute:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
            case XMLLiteral:
                {
                alt46=3;
                }
                break;
            case WXML:
            case Identifier:
                {
                int LA46_4 = input.LA(2);

                if ( (LA46_4==COLON) ) {
                    alt46=10;
                }
                else if ( (LA46_4==EOF||(LA46_4>=IN && LA46_4<=INSTANCEOF)||(LA46_4>=RBRACE && LA46_4<=LPAREN)||LA46_4==LBRACK||(LA46_4>=DOT && LA46_4<=XOR)||(LA46_4>=LAND && LA46_4<=QUE)||(LA46_4>=ASSIGN && LA46_4<=DIVASS)||(LA46_4>=DOTDOT && LA46_4<=COLONCOLON)||(LA46_4>=EOL && LA46_4<=MultiLineComment)) ) {
                    alt46=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1366:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 46, 4, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt46=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt46=5;
                }
                break;
            case CONTINUE:
                {
                alt46=6;
                }
                break;
            case BREAK:
                {
                alt46=7;
                }
                break;
            case RETURN:
                {
                alt46=8;
                }
                break;
            case WITH:
                {
                alt46=9;
                }
                break;
            case SWITCH:
                {
                alt46=11;
                }
                break;
            case THROW:
                {
                alt46=12;
                }
                break;
            case TRY:
                {
                alt46=13;
                }
                break;
            case CONST:
                {
                alt46=14;
                }
                break;
            case DEFAULT:
                {
                alt46=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1366:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // JS.g:1367:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5055);
                    variableStatement169=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement169.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1368:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5060);
                    emptyStatement170=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement170.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1369:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5065);
                    expressionStatement171=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement171.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1370:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5070);
                    ifStatement172=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement172.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1371:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5075);
                    iterationStatement173=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement173.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1372:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5080);
                    continueStatement174=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement174.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1373:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5085);
                    breakStatement175=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement175.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1374:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5090);
                    returnStatement176=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement176.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1375:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5095);
                    withStatement177=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement177.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1376:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5100);
                    labelledStatement178=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement178.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1377:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5105);
                    switchStatement179=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement179.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1378:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5110);
                    throwStatement180=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement180.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1379:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5115);
                    tryStatement181=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement181.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1380:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5120);
                    constStatement182=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement182.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1381:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5125);
                    namespaceStatement183=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement183.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1386:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE185=null;
        statement_return statement184 = null;


        Object lb_tree=null;
        Object RBRACE185_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1387:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1387:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5140); 
            stream_LBRACE.add(lb);

            // JS.g:1387:14: ( statement )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=NULL && LA47_0<=BREAK)||(LA47_0>=CONTINUE && LA47_0<=DO)||LA47_0==FOR||(LA47_0>=FUNCTION && LA47_0<=IF)||(LA47_0>=NEW && LA47_0<=WITH)||LA47_0==YIELD||LA47_0==WXML||LA47_0==CONST||LA47_0==LBRACE||LA47_0==LPAREN||LA47_0==LBRACK||LA47_0==SEMIC||(LA47_0>=ADD && LA47_0<=SUB)||(LA47_0>=INC && LA47_0<=DEC)||(LA47_0>=NOT && LA47_0<=INV)||(LA47_0>=StringLiteral && LA47_0<=XmlAttribute)||LA47_0==Identifier||LA47_0==RegularExpressionLiteral||(LA47_0>=DecimalLiteral && LA47_0<=HexIntegerLiteral)||LA47_0==XMLLiteral) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // JS.g:1387:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5142);
            	    statement184=statement();
            	    _fsp--;

            	    stream_statement.add(statement184.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            RBRACE185=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5145); 
            stream_RBRACE.add(RBRACE185);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1388:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1388:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1388:28: ( statement )*
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1395:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR186=null;
        Token COMMA188=null;
        variableDeclaration_return variableDeclaration187 = null;

        variableDeclaration_return variableDeclaration189 = null;

        semic_return semic190 = null;


        Object VAR186_tree=null;
        Object COMMA188_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1396:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1396:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR186=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5174); 
            stream_VAR.add(VAR186);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5176);
            variableDeclaration187=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration187.getTree());
            // JS.g:1396:28: ( COMMA variableDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1396:30: COMMA variableDeclaration
            	    {
            	    COMMA188=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5180); 
            	    stream_COMMA.add(COMMA188);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5182);
            	    variableDeclaration189=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration189.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5187);
            semic190=semic();
            _fsp--;

            stream_semic.add(semic190.getTree());

            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1397:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1397:5: ^( VAR ( variableDeclaration )+ )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1400:1: variableDeclaration : identifier ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN192=null;
        identifier_return identifier191 = null;

        assignmentExpression_return assignmentExpression193 = null;


        Object ASSIGN192_tree=null;

        try {
            // JS.g:1401:2: ( identifier ( ASSIGN assignmentExpression )? )
            // JS.g:1401:4: identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5210);
            identifier191=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier191.getTree());
            // JS.g:1401:15: ( ASSIGN assignmentExpression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASSIGN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // JS.g:1401:17: ASSIGN assignmentExpression
                    {
                    ASSIGN192=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5214); 
                    ASSIGN192_tree = (Object)adaptor.create(ASSIGN192);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN192_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5217);
                    assignmentExpression193=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression193.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1404:1: variableDeclarationNoIn : identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN195=null;
        identifier_return identifier194 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn196 = null;


        Object ASSIGN195_tree=null;

        try {
            // JS.g:1405:2: ( identifier ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1405:4: identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5232);
            identifier194=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier194.getTree());
            // JS.g:1405:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ASSIGN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // JS.g:1405:17: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN195=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5236); 
                    ASSIGN195_tree = (Object)adaptor.create(ASSIGN195);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN195_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5239);
                    assignmentExpressionNoIn196=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn196.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1408:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST197=null;
        Token COMMA199=null;
        variableDeclaration_return variableDeclaration198 = null;

        variableDeclaration_return variableDeclaration200 = null;

        semic_return semic201 = null;


        Object CONST197_tree=null;
        Object COMMA199_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1409:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1409:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST197=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5254); 
            stream_CONST.add(CONST197);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5256);
            variableDeclaration198=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration198.getTree());
            // JS.g:1409:31: ( COMMA variableDeclaration )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // JS.g:1409:33: COMMA variableDeclaration
            	    {
            	    COMMA199=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5260); 
            	    stream_COMMA.add(COMMA199);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5262);
            	    variableDeclaration200=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration200.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5267);
            semic201=semic();
            _fsp--;

            stream_semic.add(semic201.getTree());

            // AST REWRITE
            // elements: variableDeclaration, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1410:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1410:6: ^( CONST ( variableDeclaration )+ )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1417:1: emptyStatement : SEMIC ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC202=null;

        Object SEMIC202_tree=null;

        try {
            // JS.g:1418:2: ( SEMIC )
            // JS.g:1418:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC202=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5297); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1431:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression203 = null;

        semic_return semic204 = null;



        try {
            // JS.g:1432:2: ( expression semic )
            // JS.g:1432:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5316);
            expression203=expression();
            _fsp--;

            adaptor.addChild(root_0, expression203.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5318);
            semic204=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1439:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF205=null;
        Token LPAREN206=null;
        Token RPAREN208=null;
        Token ELSE210=null;
        expression_return expression207 = null;

        statement_return statement209 = null;

        statement_return statement211 = null;


        Object IF205_tree=null;
        Object LPAREN206_tree=null;
        Object RPAREN208_tree=null;
        Object ELSE210_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1441:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1441:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF205=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5336); 
            stream_IF.add(IF205);

            LPAREN206=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5338); 
            stream_LPAREN.add(LPAREN206);

            pushFollow(FOLLOW_expression_in_ifStatement5340);
            expression207=expression();
            _fsp--;

            stream_expression.add(expression207.getTree());
            RPAREN208=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5342); 
            stream_RPAREN.add(RPAREN208);

            pushFollow(FOLLOW_statement_in_ifStatement5344);
            statement209=statement();
            _fsp--;

            stream_statement.add(statement209.getTree());
            // JS.g:1441:42: ({...}? ELSE statement )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ELSE) ) {
                int LA52_1 = input.LA(2);

                if ( ( input.LA(1) == ELSE ) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // JS.g:1441:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE210=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5350); 
                    stream_ELSE.add(ELSE210);

                    pushFollow(FOLLOW_statement_in_ifStatement5352);
                    statement211=statement();
                    _fsp--;

                    stream_statement.add(statement211.getTree());

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
            // 1442:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1442:5: ^( IF expression ( statement )+ )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1449:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement212 = null;

        whileStatement_return whileStatement213 = null;

        forEachStatement_return forEachStatement214 = null;

        forStatement_return forStatement215 = null;



        try {
            // JS.g:1450:2: ( doStatement | whileStatement | forEachStatement | forStatement )
            int alt53=4;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt53=1;
                }
                break;
            case WHILE:
                {
                alt53=2;
                }
                break;
            case FOR:
                {
                int LA53_3 = input.LA(2);

                if ( (LA53_3==LPAREN) ) {
                    alt53=4;
                }
                else if ( (LA53_3==EACH) ) {
                    alt53=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1449:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 53, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1449:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // JS.g:1450:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5385);
                    doStatement212=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement212.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1451:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5390);
                    whileStatement213=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement213.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1452:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5395);
                    forEachStatement214=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement214.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1453:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5400);
                    forStatement215=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement215.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1456:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO216=null;
        Token WHILE218=null;
        Token LPAREN219=null;
        Token RPAREN221=null;
        statement_return statement217 = null;

        expression_return expression220 = null;

        semic_return semic222 = null;


        Object DO216_tree=null;
        Object WHILE218_tree=null;
        Object LPAREN219_tree=null;
        Object RPAREN221_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1457:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1457:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO216=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5412); 
            stream_DO.add(DO216);

            pushFollow(FOLLOW_statement_in_doStatement5414);
            statement217=statement();
            _fsp--;

            stream_statement.add(statement217.getTree());
            WHILE218=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5416); 
            stream_WHILE.add(WHILE218);

            LPAREN219=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5418); 
            stream_LPAREN.add(LPAREN219);

            pushFollow(FOLLOW_expression_in_doStatement5420);
            expression220=expression();
            _fsp--;

            stream_expression.add(expression220.getTree());
            RPAREN221=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5422); 
            stream_RPAREN.add(RPAREN221);

            pushFollow(FOLLOW_semic_in_doStatement5424);
            semic222=semic();
            _fsp--;

            stream_semic.add(semic222.getTree());

            // AST REWRITE
            // elements: statement, expression, DO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1458:2: -> ^( DO statement expression )
            {
                // JS.g:1458:5: ^( DO statement expression )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1461:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE223=null;
        Token LPAREN224=null;
        Token RPAREN226=null;
        expression_return expression225 = null;

        statement_return statement227 = null;


        Object WHILE223_tree=null;
        Object LPAREN224_tree=null;
        Object RPAREN226_tree=null;

        try {
            // JS.g:1462:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1462:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE223=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5449); 
            WHILE223_tree = (Object)adaptor.create(WHILE223);
            root_0 = (Object)adaptor.becomeRoot(WHILE223_tree, root_0);

            LPAREN224=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5452); 
            pushFollow(FOLLOW_expression_in_whileStatement5455);
            expression225=expression();
            _fsp--;

            adaptor.addChild(root_0, expression225.getTree());
            RPAREN226=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5457); 
            pushFollow(FOLLOW_statement_in_whileStatement5460);
            statement227=statement();
            _fsp--;

            adaptor.addChild(root_0, statement227.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1507:1: forEachStatement : FOR EACH LPAREN forEachControl RPAREN statement ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR228=null;
        Token EACH229=null;
        Token LPAREN230=null;
        Token RPAREN232=null;
        forEachControl_return forEachControl231 = null;

        statement_return statement233 = null;


        Object FOR228_tree=null;
        Object EACH229_tree=null;
        Object LPAREN230_tree=null;
        Object RPAREN232_tree=null;

        try {
            // JS.g:1508:3: ( FOR EACH LPAREN forEachControl RPAREN statement )
            // JS.g:1508:5: FOR EACH LPAREN forEachControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR228=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5475); 
            EACH229=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5478); 
            EACH229_tree = (Object)adaptor.create(EACH229);
            root_0 = (Object)adaptor.becomeRoot(EACH229_tree, root_0);

            LPAREN230=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5481); 
            pushFollow(FOLLOW_forEachControl_in_forEachStatement5484);
            forEachControl231=forEachControl();
            _fsp--;

            adaptor.addChild(root_0, forEachControl231.getTree());
            RPAREN232=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5486); 
            pushFollow(FOLLOW_statement_in_forEachStatement5489);
            statement233=statement();
            _fsp--;

            adaptor.addChild(root_0, statement233.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1511:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar234 = null;

        forControlExpression_return forControlExpression235 = null;



        try {
            // JS.g:1512:3: ( forControlVar | forControlExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==VAR) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==THIS||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==YIELD||LA54_0==WXML||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)||(LA54_0>=StringLiteral && LA54_0<=XmlAttribute)||LA54_0==Identifier||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)||LA54_0==XMLLiteral) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1511:1: forEachControl : ( forControlVar | forControlExpression );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // JS.g:1512:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5502);
                    forControlVar234=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar234.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1513:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5508);
                    forControlExpression235=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression235.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1516:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR236=null;
        Token LPAREN237=null;
        Token RPAREN239=null;
        forControl_return forControl238 = null;

        statement_return statement240 = null;


        Object FOR236_tree=null;
        Object LPAREN237_tree=null;
        Object RPAREN239_tree=null;

        try {
            // JS.g:1517:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1517:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR236=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5520); 
            FOR236_tree = (Object)adaptor.create(FOR236);
            root_0 = (Object)adaptor.becomeRoot(FOR236_tree, root_0);

            LPAREN237=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5523); 
            pushFollow(FOLLOW_forControl_in_forStatement5526);
            forControl238=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl238.getTree());
            RPAREN239=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5528); 
            pushFollow(FOLLOW_statement_in_forStatement5531);
            statement240=statement();
            _fsp--;

            adaptor.addChild(root_0, statement240.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1520:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar241 = null;

        forControlExpression_return forControlExpression242 = null;

        forControlSemic_return forControlSemic243 = null;



        try {
            // JS.g:1521:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt55=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt55=1;
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
            case WXML:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
            case XMLLiteral:
                {
                alt55=2;
                }
                break;
            case SEMIC:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1520:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // JS.g:1521:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5542);
                    forControlVar241=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar241.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1522:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5547);
                    forControlExpression242=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression242.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1523:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5552);
                    forControlSemic243=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic243.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1526:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR244=null;
        Token IN246=null;
        Token COMMA248=null;
        Token SEMIC250=null;
        Token SEMIC251=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn245 = null;

        expression_return expression247 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn249 = null;


        Object VAR244_tree=null;
        Object IN246_tree=null;
        Object COMMA248_tree=null;
        Object SEMIC250_tree=null;
        Object SEMIC251_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1527:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1527:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR244=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar5563); 
            stream_VAR.add(VAR244);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5565);
            variableDeclarationNoIn245=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn245.getTree());
            // JS.g:1528:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IN) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=SEMIC && LA59_0<=COMMA)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1528:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // JS.g:1529:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1529:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1530:4: IN expression
                    {
                    IN246=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar5577); 
                    stream_IN.add(IN246);

                    pushFollow(FOLLOW_expression_in_forControlVar5579);
                    expression247=expression();
                    _fsp--;

                    stream_expression.add(expression247.getTree());

                    // AST REWRITE
                    // elements: VAR, expression, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1531:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1531:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1531:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1531:51: ^( EXPR expression )
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
                    // JS.g:1534:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1534:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1535:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1535:4: ( COMMA variableDeclarationNoIn )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // JS.g:1535:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA248=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5625); 
                    	    stream_COMMA.add(COMMA248);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5627);
                    	    variableDeclarationNoIn249=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn249.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    SEMIC250=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5632); 
                    stream_SEMIC.add(SEMIC250);

                    // JS.g:1535:48: (ex1= expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=NULL && LA57_0<=FALSE)||LA57_0==DELETE||LA57_0==FUNCTION||LA57_0==NEW||LA57_0==THIS||LA57_0==TYPEOF||LA57_0==VOID||LA57_0==YIELD||LA57_0==WXML||LA57_0==LBRACE||LA57_0==LPAREN||LA57_0==LBRACK||(LA57_0>=ADD && LA57_0<=SUB)||(LA57_0>=INC && LA57_0<=DEC)||(LA57_0>=NOT && LA57_0<=INV)||(LA57_0>=StringLiteral && LA57_0<=XmlAttribute)||LA57_0==Identifier||LA57_0==RegularExpressionLiteral||(LA57_0>=DecimalLiteral && LA57_0<=HexIntegerLiteral)||LA57_0==XMLLiteral) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // JS.g:1535:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5636);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC251=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5639); 
                    stream_SEMIC.add(SEMIC251);

                    // JS.g:1535:70: (ex2= expression )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==DELETE||LA58_0==FUNCTION||LA58_0==NEW||LA58_0==THIS||LA58_0==TYPEOF||LA58_0==VOID||LA58_0==YIELD||LA58_0==WXML||LA58_0==LBRACE||LA58_0==LPAREN||LA58_0==LBRACK||(LA58_0>=ADD && LA58_0<=SUB)||(LA58_0>=INC && LA58_0<=DEC)||(LA58_0>=NOT && LA58_0<=INV)||(LA58_0>=StringLiteral && LA58_0<=XmlAttribute)||LA58_0==Identifier||LA58_0==RegularExpressionLiteral||(LA58_0>=DecimalLiteral && LA58_0<=HexIntegerLiteral)||LA58_0==XMLLiteral) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // JS.g:1535:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5643);
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
                    // 1536:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1536:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1536:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1536:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1536:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1536:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1536:76: ( $ex2)?
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1541:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN252=null;
        Token SEMIC253=null;
        Token SEMIC254=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN252_tree=null;
        Object SEMIC253_tree=null;
        Object SEMIC254_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1546:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1546:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5709);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1547:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IN) ) {
                alt62=1;
            }
            else if ( (LA62_0==SEMIC) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1547:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // JS.g:1548:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1548:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1549:4: IN ex2= expression
                    {
                    IN252=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression5724); 
                    stream_IN.add(IN252);

                    pushFollow(FOLLOW_expression_in_forControlExpression5728);
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
                    // 1550:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1550:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1550:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1550:33: ^( EXPR $ex2)
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
                    // JS.g:1553:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1553:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1554:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC253=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5774); 
                    stream_SEMIC.add(SEMIC253);

                    // JS.g:1554:13: (ex2= expression )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==YIELD||LA60_0==WXML||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=StringLiteral && LA60_0<=XmlAttribute)||LA60_0==Identifier||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)||LA60_0==XMLLiteral) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // JS.g:1554:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5778);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC254=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5781); 
                    stream_SEMIC.add(SEMIC254);

                    // JS.g:1554:35: (ex3= expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==YIELD||LA61_0==WXML||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||(LA61_0>=StringLiteral && LA61_0<=XmlAttribute)||LA61_0==Identifier||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)||LA61_0==XMLLiteral) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // JS.g:1554:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5785);
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
                    // 1555:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1555:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1555:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1555:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1555:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1555:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1555:57: ( $ex3)?
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1560:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC255=null;
        Token SEMIC256=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC255_tree=null;
        Object SEMIC256_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1561:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1561:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC255=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5844); 
            stream_SEMIC.add(SEMIC255);

            // JS.g:1561:13: (ex1= expression )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==YIELD||LA63_0==WXML||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||(LA63_0>=StringLiteral && LA63_0<=XmlAttribute)||LA63_0==Identifier||LA63_0==RegularExpressionLiteral||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)||LA63_0==XMLLiteral) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // JS.g:1561:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5848);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC256=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5851); 
            stream_SEMIC.add(SEMIC256);

            // JS.g:1561:35: (ex2= expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||LA64_0==FUNCTION||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||LA64_0==YIELD||LA64_0==WXML||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||(LA64_0>=StringLiteral && LA64_0<=XmlAttribute)||LA64_0==Identifier||LA64_0==RegularExpressionLiteral||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)||LA64_0==XMLLiteral) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // JS.g:1561:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5855);
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
            // 1562:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1562:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1562:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1562:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1562:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1562:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1562:50: ( $ex2)?
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1574:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE257=null;
        Token Identifier258=null;
        semic_return semic259 = null;


        Object CONTINUE257_tree=null;
        Object Identifier258_tree=null;

        try {
            // JS.g:1575:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1575:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE257=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5909); 
            CONTINUE257_tree = (Object)adaptor.create(CONTINUE257);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE257_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1575:67: ( Identifier )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Identifier) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // JS.g:1575:67: Identifier
                    {
                    Identifier258=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement5914); 
                    Identifier258_tree = (Object)adaptor.create(Identifier258);
                    adaptor.addChild(root_0, Identifier258_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement5917);
            semic259=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1587:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK260=null;
        Token Identifier261=null;
        semic_return semic262 = null;


        Object BREAK260_tree=null;
        Object Identifier261_tree=null;

        try {
            // JS.g:1588:2: ( BREAK ( Identifier )? semic )
            // JS.g:1588:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK260=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement5936); 
            BREAK260_tree = (Object)adaptor.create(BREAK260);
            root_0 = (Object)adaptor.becomeRoot(BREAK260_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1588:64: ( Identifier )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Identifier) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // JS.g:1588:64: Identifier
                    {
                    Identifier261=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement5941); 
                    Identifier261_tree = (Object)adaptor.create(Identifier261);
                    adaptor.addChild(root_0, Identifier261_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement5944);
            semic262=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1608:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN263=null;
        expression_return expression264 = null;

        semic_return semic265 = null;


        Object RETURN263_tree=null;

        try {
            // JS.g:1609:2: ( RETURN ( expression )? semic )
            // JS.g:1609:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN263=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement5963); 
            RETURN263_tree = (Object)adaptor.create(RETURN263);
            root_0 = (Object)adaptor.becomeRoot(RETURN263_tree, root_0);

             promoteEOL(null); 
            // JS.g:1609:34: ( expression )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||LA67_0==FUNCTION||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||LA67_0==YIELD||LA67_0==WXML||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||(LA67_0>=StringLiteral && LA67_0<=XmlAttribute)||LA67_0==Identifier||LA67_0==RegularExpressionLiteral||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)||LA67_0==XMLLiteral) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // JS.g:1609:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement5968);
                    expression264=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression264.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement5971);
            semic265=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1616:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH266=null;
        Token LPAREN267=null;
        Token RPAREN269=null;
        expression_return expression268 = null;

        statement_return statement270 = null;


        Object WITH266_tree=null;
        Object LPAREN267_tree=null;
        Object RPAREN269_tree=null;

        try {
            // JS.g:1617:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1617:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH266=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement5988); 
            WITH266_tree = (Object)adaptor.create(WITH266);
            root_0 = (Object)adaptor.becomeRoot(WITH266_tree, root_0);

            LPAREN267=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5991); 
            pushFollow(FOLLOW_expression_in_withStatement5994);
            expression268=expression();
            _fsp--;

            adaptor.addChild(root_0, expression268.getTree());
            RPAREN269=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5996); 
            pushFollow(FOLLOW_statement_in_withStatement5999);
            statement270=statement();
            _fsp--;

            adaptor.addChild(root_0, statement270.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1624:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH271=null;
        Token LPAREN272=null;
        Token RPAREN274=null;
        Token LBRACE275=null;
        Token RBRACE278=null;
        expression_return expression273 = null;

        defaultClause_return defaultClause276 = null;

        caseClause_return caseClause277 = null;


        Object SWITCH271_tree=null;
        Object LPAREN272_tree=null;
        Object RPAREN274_tree=null;
        Object LBRACE275_tree=null;
        Object RBRACE278_tree=null;
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
            // JS.g:1629:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // JS.g:1629:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH271=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6020); 
            stream_SWITCH.add(SWITCH271);

            LPAREN272=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6022); 
            stream_LPAREN.add(LPAREN272);

            pushFollow(FOLLOW_expression_in_switchStatement6024);
            expression273=expression();
            _fsp--;

            stream_expression.add(expression273.getTree());
            RPAREN274=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6026); 
            stream_RPAREN.add(RPAREN274);

            LBRACE275=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6028); 
            stream_LBRACE.add(LBRACE275);

            // JS.g:1629:43: ({...}? => defaultClause | caseClause )*
            loop68:
            do {
                int alt68=3;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==DEFAULT) && ( defaultClauseCount == 0 )) {
                    alt68=1;
                }
                else if ( (LA68_0==CASE) ) {
                    alt68=2;
                }


                switch (alt68) {
            	case 1 :
            	    // JS.g:1629:45: {...}? => defaultClause
            	    {
            	    if ( !( defaultClauseCount == 0 ) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6035);
            	    defaultClause276=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause276.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1629:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6041);
            	    caseClause277=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause277.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            RBRACE278=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6046); 
            stream_RBRACE.add(RBRACE278);


            // AST REWRITE
            // elements: SWITCH, caseClause, defaultClause, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1630:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // JS.g:1630:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1630:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1630:41: ( caseClause )*
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1633:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE279=null;
        Token COLON281=null;
        expression_return expression280 = null;

        statement_return statement282 = null;


        Object CASE279_tree=null;
        Object COLON281_tree=null;

        try {
            // JS.g:1634:2: ( CASE expression COLON ( statement )* )
            // JS.g:1634:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE279=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6074); 
            CASE279_tree = (Object)adaptor.create(CASE279);
            root_0 = (Object)adaptor.becomeRoot(CASE279_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6077);
            expression280=expression();
            _fsp--;

            adaptor.addChild(root_0, expression280.getTree());
            COLON281=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6079); 
            // JS.g:1634:28: ( statement )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==DEFAULT) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==WXML) ) {
                        alt69=1;
                    }


                }
                else if ( ((LA69_0>=NULL && LA69_0<=BREAK)||LA69_0==CONTINUE||(LA69_0>=DELETE && LA69_0<=DO)||LA69_0==FOR||(LA69_0>=FUNCTION && LA69_0<=IF)||(LA69_0>=NEW && LA69_0<=WITH)||LA69_0==YIELD||LA69_0==WXML||LA69_0==CONST||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||LA69_0==SEMIC||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||(LA69_0>=StringLiteral && LA69_0<=XmlAttribute)||LA69_0==Identifier||LA69_0==RegularExpressionLiteral||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)||LA69_0==XMLLiteral) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // JS.g:1634:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6082);
            	    statement282=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement282.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1637:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT283=null;
        Token COLON284=null;
        statement_return statement285 = null;


        Object DEFAULT283_tree=null;
        Object COLON284_tree=null;

        try {
            // JS.g:1638:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1638:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT283=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6095); 
            DEFAULT283_tree = (Object)adaptor.create(DEFAULT283);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT283_tree, root_0);

            COLON284=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6098); 
            // JS.g:1638:20: ( statement )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==DEFAULT) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==WXML) ) {
                        alt70=1;
                    }


                }
                else if ( ((LA70_0>=NULL && LA70_0<=BREAK)||LA70_0==CONTINUE||(LA70_0>=DELETE && LA70_0<=DO)||LA70_0==FOR||(LA70_0>=FUNCTION && LA70_0<=IF)||(LA70_0>=NEW && LA70_0<=WITH)||LA70_0==YIELD||LA70_0==WXML||LA70_0==CONST||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||LA70_0==SEMIC||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||(LA70_0>=StringLiteral && LA70_0<=XmlAttribute)||LA70_0==Identifier||LA70_0==RegularExpressionLiteral||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)||LA70_0==XMLLiteral) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // JS.g:1638:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6101);
            	    statement285=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement285.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1645:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON287=null;
        identifier_return identifier286 = null;

        statement_return statement288 = null;


        Object COLON287_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1646:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1646:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6118);
            identifier286=identifier();
            _fsp--;

            stream_identifier.add(identifier286.getTree());
            COLON287=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6120); 
            stream_COLON.add(COLON287);

            pushFollow(FOLLOW_statement_in_labelledStatement6122);
            statement288=statement();
            _fsp--;

            stream_statement.add(statement288.getTree());

            // AST REWRITE
            // elements: statement, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1647:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1647:5: ^( LABELLED identifier statement )
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
            reportError(re);
            recover(input,re);
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
    // JS.g:1669:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW289=null;
        expression_return expression290 = null;

        semic_return semic291 = null;


        Object THROW289_tree=null;

        try {
            // JS.g:1670:2: ( THROW expression semic )
            // JS.g:1670:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW289=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6153); 
            THROW289_tree = (Object)adaptor.create(THROW289);
            root_0 = (Object)adaptor.becomeRoot(THROW289_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6158);
            expression290=expression();
            _fsp--;

            adaptor.addChild(root_0, expression290.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6160);
            semic291=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1677:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY292=null;
        block_return block293 = null;

        catchClause_return catchClause294 = null;

        finallyClause_return finallyClause295 = null;

        finallyClause_return finallyClause296 = null;


        Object TRY292_tree=null;

        try {
            // JS.g:1678:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1678:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY292=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6177); 
            TRY292_tree = (Object)adaptor.create(TRY292);
            root_0 = (Object)adaptor.becomeRoot(TRY292_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6180);
            block293=block();
            _fsp--;

            adaptor.addChild(root_0, block293.getTree());
            // JS.g:1678:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==CATCH) ) {
                alt73=1;
            }
            else if ( (LA73_0==FINALLY) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1678:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1678:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1678:17: ( catchClause )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==CATCH) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // JS.g:1678:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6184);
                    	    catchClause294=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause294.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // JS.g:1678:30: ( finallyClause )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==FINALLY) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // JS.g:1678:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6187);
                            finallyClause295=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause295.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1678:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6192);
                    finallyClause296=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause296.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1681:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH297=null;
        Token LPAREN298=null;
        Token RPAREN301=null;
        identifier_return identifier299 = null;

        catchFilter_return catchFilter300 = null;

        block_return block302 = null;


        Object CATCH297_tree=null;
        Object LPAREN298_tree=null;
        Object RPAREN301_tree=null;

        try {
            // JS.g:1682:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1682:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH297=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6206); 
            CATCH297_tree = (Object)adaptor.create(CATCH297);
            root_0 = (Object)adaptor.becomeRoot(CATCH297_tree, root_0);

            LPAREN298=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6209); 
            pushFollow(FOLLOW_identifier_in_catchClause6212);
            identifier299=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier299.getTree());
            // JS.g:1682:30: ( catchFilter )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==IF) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1682:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6214);
                    catchFilter300=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter300.getTree());

                    }
                    break;

            }

            RPAREN301=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6217); 
            pushFollow(FOLLOW_block_in_catchClause6220);
            block302=block();
            _fsp--;

            adaptor.addChild(root_0, block302.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1685:1: catchFilter : IF instanceofExpression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF303=null;
        instanceofExpression_return instanceofExpression304 = null;


        Object IF303_tree=null;

        try {
            // JS.g:1686:3: ( IF instanceofExpression )
            // JS.g:1686:5: IF instanceofExpression
            {
            root_0 = (Object)adaptor.nil();

            IF303=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6233); 
            IF303_tree = (Object)adaptor.create(IF303);
            root_0 = (Object)adaptor.becomeRoot(IF303_tree, root_0);

            pushFollow(FOLLOW_instanceofExpression_in_catchFilter6236);
            instanceofExpression304=instanceofExpression();
            _fsp--;

            adaptor.addChild(root_0, instanceofExpression304.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1689:1: instanceofExpression : identifier INSTANCEOF identifier ;
    public final instanceofExpression_return instanceofExpression() throws RecognitionException {
        instanceofExpression_return retval = new instanceofExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF306=null;
        identifier_return identifier305 = null;

        identifier_return identifier307 = null;


        Object INSTANCEOF306_tree=null;

        try {
            // JS.g:1690:3: ( identifier INSTANCEOF identifier )
            // JS.g:1690:5: identifier INSTANCEOF identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_instanceofExpression6251);
            identifier305=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier305.getTree());
            INSTANCEOF306=(Token)input.LT(1);
            match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceofExpression6253); 
            INSTANCEOF306_tree = (Object)adaptor.create(INSTANCEOF306);
            root_0 = (Object)adaptor.becomeRoot(INSTANCEOF306_tree, root_0);

            pushFollow(FOLLOW_identifier_in_instanceofExpression6256);
            identifier307=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier307.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1693:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY308=null;
        block_return block309 = null;


        Object FINALLY308_tree=null;

        try {
            // JS.g:1694:2: ( FINALLY block )
            // JS.g:1694:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY308=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6269); 
            FINALLY308_tree = (Object)adaptor.create(FINALLY308);
            root_0 = (Object)adaptor.becomeRoot(FINALLY308_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6272);
            block309=block();
            _fsp--;

            adaptor.addChild(root_0, block309.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1707:1: functionDeclaration : FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION310=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList311 = null;

        functionBody_return functionBody312 = null;


        Object FUNCTION310_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1708:2: ( FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) )
            // JS.g:1708:4: FUNCTION name= identifier formalParameterList functionBody
            {
            FUNCTION310=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6293); 
            stream_FUNCTION.add(FUNCTION310);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6297);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6299);
            formalParameterList311=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList311.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6301);
            functionBody312=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody312.getTree());

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
            // 1709:2: -> ^( FUNCTION $name formalParameterList functionBody )
            {
                // JS.g:1709:5: ^( FUNCTION $name formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

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
            reportError(re);
            recover(input,re);
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
    // JS.g:1712:1: functionExpression : FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION313=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList314 = null;

        functionBody_return functionBody315 = null;


        Object FUNCTION313_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1713:2: ( FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1713:4: FUNCTION (name= identifier )? formalParameterList functionBody
            {
            FUNCTION313=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6328); 
            stream_FUNCTION.add(FUNCTION313);

            // JS.g:1713:17: (name= identifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==WXML||LA75_0==Identifier) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1713:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6332);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6335);
            formalParameterList314=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList314.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6337);
            functionBody315=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody315.getTree());

            // AST REWRITE
            // elements: formalParameterList, FUNCTION, functionBody, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1714:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1714:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1714:17: ( $name)?
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionExpression

    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameterList
    // JS.g:1717:1: formalParameterList : LPAREN (args+= identifier ( COMMA args+= identifier )* )? RPAREN -> ^( ARGS ( $args)* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN316=null;
        Token COMMA317=null;
        Token RPAREN318=null;
        List list_args=null;
        RuleReturnScope args = null;
        Object LPAREN316_tree=null;
        Object COMMA317_tree=null;
        Object RPAREN318_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1718:2: ( LPAREN (args+= identifier ( COMMA args+= identifier )* )? RPAREN -> ^( ARGS ( $args)* ) )
            // JS.g:1718:4: LPAREN (args+= identifier ( COMMA args+= identifier )* )? RPAREN
            {
            LPAREN316=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6365); 
            stream_LPAREN.add(LPAREN316);

            // JS.g:1718:11: (args+= identifier ( COMMA args+= identifier )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==WXML||LA77_0==Identifier) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // JS.g:1718:13: args+= identifier ( COMMA args+= identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_formalParameterList6371);
                    args=identifier();
                    _fsp--;

                    stream_identifier.add(args.getTree());
                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);

                    // JS.g:1718:30: ( COMMA args+= identifier )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==COMMA) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // JS.g:1718:32: COMMA args+= identifier
                    	    {
                    	    COMMA317=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6375); 
                    	    stream_COMMA.add(COMMA317);

                    	    pushFollow(FOLLOW_identifier_in_formalParameterList6379);
                    	    args=identifier();
                    	    _fsp--;

                    	    stream_identifier.add(args.getTree());
                    	    if (list_args==null) list_args=new ArrayList();
                    	    list_args.add(args);


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN318=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6387); 
            stream_RPAREN.add(RPAREN318);


            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: args
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
            root_0 = (Object)adaptor.nil();
            // 1719:2: -> ^( ARGS ( $args)* )
            {
                // JS.g:1719:5: ^( ARGS ( $args)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1719:13: ( $args)*
                while ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_args.next()).getTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1722:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE320=null;
        sourceElement_return sourceElement319 = null;


        Object lb_tree=null;
        Object RBRACE320_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // JS.g:1723:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1723:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6413); 
            stream_LBRACE.add(lb);

            // JS.g:1723:14: ( sourceElement )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=NULL && LA78_0<=BREAK)||(LA78_0>=CONTINUE && LA78_0<=DO)||LA78_0==FOR||(LA78_0>=FUNCTION && LA78_0<=IF)||(LA78_0>=NEW && LA78_0<=WITH)||LA78_0==YIELD||LA78_0==WXML||LA78_0==CONST||LA78_0==LBRACE||LA78_0==LPAREN||LA78_0==LBRACK||LA78_0==SEMIC||(LA78_0>=ADD && LA78_0<=SUB)||(LA78_0>=INC && LA78_0<=DEC)||(LA78_0>=NOT && LA78_0<=INV)||(LA78_0>=StringLiteral && LA78_0<=XmlAttribute)||LA78_0==Identifier||LA78_0==RegularExpressionLiteral||(LA78_0>=DecimalLiteral && LA78_0<=HexIntegerLiteral)||LA78_0==XMLLiteral) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JS.g:1723:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6415);
            	    sourceElement319=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement319.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            RBRACE320=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6418); 
            stream_RBRACE.add(RBRACE320);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1724:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1724:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1724:28: ( sourceElement )*
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionBody

    public static class getMethodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start getMethodDeclaration
    // JS.g:1732:1: getMethodDeclaration : GET name= identifier LPAREN RPAREN functionBody ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GET321=null;
        Token LPAREN322=null;
        Token RPAREN323=null;
        identifier_return name = null;

        functionBody_return functionBody324 = null;


        Object GET321_tree=null;
        Object LPAREN322_tree=null;
        Object RPAREN323_tree=null;

        try {
            // JS.g:1733:3: ( GET name= identifier LPAREN RPAREN functionBody )
            // JS.g:1733:5: GET name= identifier LPAREN RPAREN functionBody
            {
            root_0 = (Object)adaptor.nil();

            GET321=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6448); 
            GET321_tree = (Object)adaptor.create(GET321);
            root_0 = (Object)adaptor.becomeRoot(GET321_tree, root_0);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6453);
            name=identifier();
            _fsp--;

            adaptor.addChild(root_0, name.getTree());
            LPAREN322=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6455); 
            RPAREN323=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6458); 
            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6461);
            functionBody324=functionBody();
            _fsp--;

            adaptor.addChild(root_0, functionBody324.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1736:1: setMethodDeclaration : SET name= identifier LPAREN identifier RPAREN functionBody ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET325=null;
        Token LPAREN326=null;
        Token RPAREN328=null;
        identifier_return name = null;

        identifier_return identifier327 = null;

        functionBody_return functionBody329 = null;


        Object SET325_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN328_tree=null;

        try {
            // JS.g:1737:3: ( SET name= identifier LPAREN identifier RPAREN functionBody )
            // JS.g:1737:5: SET name= identifier LPAREN identifier RPAREN functionBody
            {
            root_0 = (Object)adaptor.nil();

            SET325=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6476); 
            SET325_tree = (Object)adaptor.create(SET325);
            root_0 = (Object)adaptor.becomeRoot(SET325_tree, root_0);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6481);
            name=identifier();
            _fsp--;

            adaptor.addChild(root_0, name.getTree());
            LPAREN326=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6483); 
            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6486);
            identifier327=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier327.getTree());
            RPAREN328=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6488); 
            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6491);
            functionBody329=functionBody();
            _fsp--;

            adaptor.addChild(root_0, functionBody329.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1744:1: program : ( sourceElement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF331=null;
        sourceElement_return sourceElement330 = null;


        Object EOF331_tree=null;

        try {
            // JS.g:1745:2: ( ( sourceElement )* EOF )
            // JS.g:1745:4: ( sourceElement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // JS.g:1745:4: ( sourceElement )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=NULL && LA79_0<=BREAK)||(LA79_0>=CONTINUE && LA79_0<=DO)||LA79_0==FOR||(LA79_0>=FUNCTION && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=WITH)||LA79_0==YIELD||LA79_0==WXML||LA79_0==CONST||LA79_0==LBRACE||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||(LA79_0>=StringLiteral && LA79_0<=XmlAttribute)||LA79_0==Identifier||LA79_0==RegularExpressionLiteral||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)||LA79_0==XMLLiteral) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JS.g:1745:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6508);
            	    sourceElement330=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement330.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            EOF331=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program6511); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // JS.g:1753:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration332 = null;

        statement_return statement333 = null;



        try {
            // JS.g:1758:2: ({...}? functionDeclaration | statement )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==FUNCTION) ) {
                int LA80_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt80=1;
                }
                else if ( (true) ) {
                    alt80=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1753:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 80, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA80_0>=NULL && LA80_0<=BREAK)||(LA80_0>=CONTINUE && LA80_0<=DO)||LA80_0==FOR||LA80_0==IF||(LA80_0>=NEW && LA80_0<=WITH)||LA80_0==YIELD||LA80_0==WXML||LA80_0==CONST||LA80_0==LBRACE||LA80_0==LPAREN||LA80_0==LBRACK||LA80_0==SEMIC||(LA80_0>=ADD && LA80_0<=SUB)||(LA80_0>=INC && LA80_0<=DEC)||(LA80_0>=NOT && LA80_0<=INV)||(LA80_0>=StringLiteral && LA80_0<=XmlAttribute)||LA80_0==Identifier||LA80_0==RegularExpressionLiteral||(LA80_0>=DecimalLiteral && LA80_0<=HexIntegerLiteral)||LA80_0==XMLLiteral) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1753:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // JS.g:1758:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6540);
                    functionDeclaration332=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration332.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1759:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6545);
                    statement333=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement333.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end sourceElement


 

    public static final BitSet FOLLOW_reservedWord_in_token1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_token1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_primaryExpression3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3470 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parenExpression3472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3499 = new BitSet(new long[]{0x0000002852441070L,0x0000001819804D40L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3507 = new BitSet(new long[]{0x0000002852441070L,0x0000001819804D40L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3577 = new BitSet(new long[]{0x0000002600000000L,0x0000000000000080L,0x00E0830000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3585 = new BitSet(new long[]{0x0000002600000000L,0x0000000000000000L,0x00E0830000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3646 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3648 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_propertyName3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3728 = new BitSet(new long[]{0x0000002002440070L,0x0000000000000540L,0x00E2830000000000L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3744 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800740L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_COMMA_in_arguments3752 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3795 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3816 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3841 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3845 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3867 = new BitSet(new long[]{0x0000002000000000L,0x0000000002000100L,0x0000820000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression3869 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression3890 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3892 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression3911 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3913 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_rightHandSideExpression3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3999 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4054 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLLiteral_in_unaryExpression4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4164 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4166 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4168 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4190 = new BitSet(new long[]{0x0000000000000002L,0x0010000006000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4194 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4209 = new BitSet(new long[]{0x0000000000000002L,0x0010000006000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4227 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4231 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4242 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4261 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4265 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4280 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4299 = new BitSet(new long[]{0x0000000000300002L,0x0000000000078000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4303 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4330 = new BitSet(new long[]{0x0000000000300002L,0x0000000000078000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4344 = new BitSet(new long[]{0x0000000000200002L,0x0000000000078000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4348 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4371 = new BitSet(new long[]{0x0000000000200002L,0x0000000000078000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4394 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4427 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4431 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4470 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4474 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4477 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4491 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4495 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4498 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4514 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4518 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4521 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4537 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4541 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4544 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4559 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4563 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4566 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4581 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4585 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4588 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4607 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4611 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4614 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4628 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4632 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4635 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4650 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4654 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4657 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4672 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4676 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4679 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4698 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4702 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4705 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4707 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4724 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4728 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4731 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4733 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4764 = new BitSet(new long[]{0x0000000000000002L,0x002FFE0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4771 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4852 = new BitSet(new long[]{0x0000000000000002L,0x002FFE0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4859 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4884 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expression4888 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn4933 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMIC_in_semic4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5140 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x00000018198025C0L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block5142 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x00000018198025C0L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_block5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5174 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5180 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5210 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5214 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5232 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5236 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5254 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5260 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5338 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_ifStatement5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5342 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_ifStatement5344 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5350 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_ifStatement5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5412 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_doStatement5414 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5418 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_doStatement5420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5452 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_whileStatement5455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5457 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_whileStatement5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5475 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5481 = new BitSet(new long[]{0x0000002872441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5486 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5523 = new BitSet(new long[]{0x0000002872441070L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forControl_in_forStatement5526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5528 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_forStatement5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5563 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5565 = new BitSet(new long[]{0x0000000000100000L,0x0000000000006000L});
    public static final BitSet FOLLOW_IN_in_forControlVar5577 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlVar5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5625 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5632 = new BitSet(new long[]{0x0000002852441070L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlVar5636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5639 = new BitSet(new long[]{0x0000002852441072L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlVar5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5709 = new BitSet(new long[]{0x0000000000100000L,0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5724 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5774 = new BitSet(new long[]{0x0000002852441070L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5781 = new BitSet(new long[]{0x0000002852441072L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5844 = new BitSet(new long[]{0x0000002852441070L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5851 = new BitSet(new long[]{0x0000002852441072L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000806000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement5914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement5936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000806000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement5941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement5963 = new BitSet(new long[]{0x0000002852441070L,0x00000018198025C0L,0x00E2836000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_returnStatement5968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement5988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement5991 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_withStatement5994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement5996 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_withStatement5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6022 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_switchStatement6024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6028 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6035 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6041 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6074 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_caseClause6077 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6079 = new BitSet(new long[]{0x00001029FFCD3CF2L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_caseClause6082 = new BitSet(new long[]{0x00001029FFCD3CF2L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6095 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6098 = new BitSet(new long[]{0x00001029FFCD3CF2L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_defaultClause6101 = new BitSet(new long[]{0x00001029FFCD3CF2L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6118 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6120 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6153 = new BitSet(new long[]{0x0000002852441070L,0x0000001819800540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_throwStatement6158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_tryStatement6180 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6184 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6209 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6212 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_catchClause6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6233 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_instanceofExpression_in_catchFilter6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6251 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression6253 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_finallyClause6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6293 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6328 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000100L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6365 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameterList6371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6375 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameterList6379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6413 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x00000018198025C0L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6415 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x00000018198025C0L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6448 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6476 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6483 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6508 = new BitSet(new long[]{0x00001029FFCD3CF0L,0x0000001819802540L,0x00E2830000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_program6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6545 = new BitSet(new long[]{0x0000000000000002L});

}
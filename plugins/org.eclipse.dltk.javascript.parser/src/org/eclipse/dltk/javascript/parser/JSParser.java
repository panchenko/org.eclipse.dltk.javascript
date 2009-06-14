// $ANTLR 3.0.1 JS.g 2009-06-14 12:08:47

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "CDATA", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "XCOPEN", "XCCLOSE", "XLCLOSE", "XRCLOSE", "CDATAOPEN", "XHOPEN", "XHCLOSE", "AT", "DOTDOT", "COLONCOLON", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XML", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "Identifier", "StringLiteral", "XmlAttribute", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "PropertyIdentifierSymbols", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar", "XMLLiteral"
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
    public static final int HexDigit=171;
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
    public static final int StringLiteral=169;
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
    public static final int DecimalDigit=173;
    public static final int BYFIELD=131;
    public static final int BREAK=7;
    public static final int Identifier=168;
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
    public static final int IdentifierStartASCII=172;
    public static final int TRY=27;
    public static final int NAMESPACE=38;
    public static final int SHLASS=110;
    public static final int COLONCOLON=127;
    public static final int USP=158;
    public static final int ANDASS=113;
    public static final int IdentifierNameASCIIStart=175;
    public static final int QUE=103;
    public static final int OR=97;
    public static final int DEBUGGER=45;
    public static final int PDEC=146;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=189;
    public static final int THROW=26;
    public static final int MULASS=108;
    public static final int XmlAttribute=170;
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
    public static final int IdentifierPart=174;
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
    // JS.g:583:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );
    public final token_return token() throws RecognitionException {
        token_return retval = new token_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier2=null;
        Token StringLiteral5=null;
        Token XmlAttribute6=null;
        reservedWord_return reservedWord1 = null;

        punctuator_return punctuator3 = null;

        numericLiteral_return numericLiteral4 = null;


        Object Identifier2_tree=null;
        Object StringLiteral5_tree=null;
        Object XmlAttribute6_tree=null;

        try {
            // JS.g:584:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute )
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
                    new NoViableAltException("583:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:584:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1949);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:585:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier2=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_token1954); 
                    Identifier2_tree = (Object)adaptor.create(Identifier2);
                    adaptor.addChild(root_0, Identifier2_tree);


                    }
                    break;
                case 3 :
                    // JS.g:586:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1959);
                    punctuator3=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:587:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1964);
                    numericLiteral4=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:588:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral5=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1969); 
                    StringLiteral5_tree = (Object)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;
                case 6 :
                    // JS.g:589:4: XmlAttribute
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
    // JS.g:595:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
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
            // JS.g:596:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
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
                    new NoViableAltException("595:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:596:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1989);
                    keyword7=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword7.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:597:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1994);
                    futureReservedWord8=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord8.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:598:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL9=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord1999); 
                    NULL9_tree = (Object)adaptor.create(NULL9);
                    adaptor.addChild(root_0, NULL9_tree);


                    }
                    break;
                case 4 :
                    // JS.g:599:4: booleanLiteral
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
    // JS.g:606:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | XML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // JS.g:607:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | XML | YIELD )
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
    // JS.g:644:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // JS.g:645:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
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

    public static class punctuator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start punctuator
    // JS.g:748:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:749:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS)||(input.LA(1)>=DOTDOT && input.LA(1)<=COLONCOLON) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set13));
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
    // JS.g:806:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL14=null;
        Token StringLiteral17=null;
        Token RegularExpressionLiteral18=null;
        booleanLiteral_return booleanLiteral15 = null;

        numericLiteral_return numericLiteral16 = null;


        Object NULL14_tree=null;
        Object StringLiteral17_tree=null;
        Object RegularExpressionLiteral18_tree=null;

        try {
            // JS.g:807:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
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
                    new NoViableAltException("806:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // JS.g:807:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL14=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2778); 
                    NULL14_tree = (Object)adaptor.create(NULL14);
                    adaptor.addChild(root_0, NULL14_tree);


                    }
                    break;
                case 2 :
                    // JS.g:808:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2783);
                    booleanLiteral15=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral15.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:809:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2788);
                    numericLiteral16=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral16.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:810:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral17=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2793); 
                    StringLiteral17_tree = (Object)adaptor.create(StringLiteral17);
                    adaptor.addChild(root_0, StringLiteral17_tree);


                    }
                    break;
                case 5 :
                    // JS.g:811:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral18=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2798); 
                    RegularExpressionLiteral18_tree = (Object)adaptor.create(RegularExpressionLiteral18);
                    adaptor.addChild(root_0, RegularExpressionLiteral18_tree);


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
    // JS.g:814:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // JS.g:815:2: ( TRUE | FALSE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set19));
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
    // JS.g:861:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // JS.g:862:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set20=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set20));
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
    // JS.g:956:1: primaryExpression : ( THIS | Identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS21=null;
        Token Identifier22=null;
        Token XmlAttribute23=null;
        literal_return literal24 = null;

        arrayLiteral_return arrayLiteral25 = null;

        objectLiteral_return objectLiteral26 = null;

        parenExpression_return parenExpression27 = null;


        Object THIS21_tree=null;
        Object Identifier22_tree=null;
        Object XmlAttribute23_tree=null;

        try {
            // JS.g:957:2: ( THIS | Identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
            int alt4=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
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
                    new NoViableAltException("956:1: primaryExpression : ( THIS | Identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:957:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS21=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3421); 
                    THIS21_tree = (Object)adaptor.create(THIS21);
                    adaptor.addChild(root_0, THIS21_tree);


                    }
                    break;
                case 2 :
                    // JS.g:958:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier22=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3426); 
                    Identifier22_tree = (Object)adaptor.create(Identifier22);
                    adaptor.addChild(root_0, Identifier22_tree);


                    }
                    break;
                case 3 :
                    // JS.g:959:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute23=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_primaryExpression3431); 
                    XmlAttribute23_tree = (Object)adaptor.create(XmlAttribute23);
                    adaptor.addChild(root_0, XmlAttribute23_tree);


                    }
                    break;
                case 4 :
                    // JS.g:960:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3436);
                    literal24=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal24.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:961:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3441);
                    arrayLiteral25=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral25.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:962:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3446);
                    objectLiteral26=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral26.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:963:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3451);
                    parenExpression27=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression27.getTree());

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
    // JS.g:966:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
    public final parenExpression_return parenExpression() throws RecognitionException {
        parenExpression_return retval = new parenExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token RPAREN29=null;
        expression_return expression28 = null;


        Object lpar_tree=null;
        Object RPAREN29_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:967:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:967:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3467); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3469);
            expression28=expression();
            _fsp--;

            stream_expression.add(expression28.getTree());
            RPAREN29=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3471); 
            stream_RPAREN.add(RPAREN29);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 967:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:967:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
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
    // JS.g:970:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA31=null;
        Token RBRACK33=null;
        arrayItem_return arrayItem30 = null;

        arrayItem_return arrayItem32 = null;


        Object lb_tree=null;
        Object COMMA31_tree=null;
        Object RBRACK33_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:971:2: (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:971:4: lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3496); 
            stream_LBRACK.add(lb);

            // JS.g:971:14: ( arrayItem ( COMMA arrayItem )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==DELETE||LA6_0==FUNCTION||LA6_0==NEW||LA6_0==THIS||LA6_0==TYPEOF||LA6_0==VOID||LA6_0==YIELD||LA6_0==LBRACE||LA6_0==LPAREN||LA6_0==LBRACK||LA6_0==COMMA||(LA6_0>=ADD && LA6_0<=SUB)||(LA6_0>=INC && LA6_0<=DEC)||(LA6_0>=NOT && LA6_0<=INV)||(LA6_0>=Identifier && LA6_0<=XmlAttribute)||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)||LA6_0==XMLLiteral) ) {
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
                    // JS.g:971:16: arrayItem ( COMMA arrayItem )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3500);
                    arrayItem30=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem30.getTree());
                    // JS.g:971:26: ( COMMA arrayItem )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // JS.g:971:28: COMMA arrayItem
                    	    {
                    	    COMMA31=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3504); 
                    	    stream_COMMA.add(COMMA31);

                    	    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3506);
                    	    arrayItem32=arrayItem();
                    	    _fsp--;

                    	    stream_arrayItem.add(arrayItem32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK33=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3514); 
            stream_RBRACK.add(RBRACK33);


            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 972:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:972:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:972:28: ( arrayItem )*
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
    // JS.g:975:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:976:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:976:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:976:4: (expr= assignmentExpression | {...}?)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==YIELD||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=Identifier && LA7_0<=XmlAttribute)||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)||LA7_0==XMLLiteral) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK||LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("976:4: (expr= assignmentExpression | {...}?)", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // JS.g:976:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3542);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:976:34: {...}?
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
            // 977:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:977:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:977:13: ( $expr)?
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
    // JS.g:980:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA35=null;
        Token RBRACE37=null;
        objectPropertyInitializer_return objectPropertyInitializer34 = null;

        objectPropertyInitializer_return objectPropertyInitializer36 = null;


        Object lb_tree=null;
        Object COMMA35_tree=null;
        Object RBRACE37_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:981:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) )
            // JS.g:981:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3574); 
            stream_LBRACE.add(lb);

            // JS.g:981:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=GET && LA9_0<=SET)||(LA9_0>=Identifier && LA9_0<=XmlAttribute)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // JS.g:981:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )*
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3578);
                    objectPropertyInitializer34=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer34.getTree());
                    // JS.g:981:42: ( COMMA objectPropertyInitializer )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:981:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA35=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3582); 
                    	    stream_COMMA.add(COMMA35);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3584);
                    	    objectPropertyInitializer36=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE37=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3592); 
            stream_RBRACE.add(RBRACE37);


            // AST REWRITE
            // elements: objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 982:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
            {
                // JS.g:982:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:982:30: ( objectPropertyInitializer )*
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
    // JS.g:985:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair38 = null;

        getMethodDeclaration_return getMethodDeclaration39 = null;

        setMethodDeclaration_return setMethodDeclaration40 = null;



        try {
            // JS.g:986:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case StringLiteral:
            case XmlAttribute:
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
                    new NoViableAltException("985:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // JS.g:986:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3617);
                    nameValuePair38=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair38.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:987:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3624);
                    getMethodDeclaration39=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration39.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:988:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3630);
                    setMethodDeclaration40=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration40.getTree());

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
    // JS.g:991:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON42=null;
        propertyName_return propertyName41 = null;

        assignmentExpression_return assignmentExpression43 = null;


        Object COLON42_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:992:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:992:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3643);
            propertyName41=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName41.getTree());
            COLON42=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3645); 
            stream_COLON.add(COLON42);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3647);
            assignmentExpression43=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression43.getTree());

            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 993:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:993:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // JS.g:996:1: propertyName : ( Identifier | StringLiteral | numericLiteral | XmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier44=null;
        Token StringLiteral45=null;
        Token XmlAttribute47=null;
        numericLiteral_return numericLiteral46 = null;


        Object Identifier44_tree=null;
        Object StringLiteral45_tree=null;
        Object XmlAttribute47_tree=null;

        try {
            // JS.g:997:2: ( Identifier | StringLiteral | numericLiteral | XmlAttribute )
            int alt11=4;
            switch ( input.LA(1) ) {
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
                    new NoViableAltException("996:1: propertyName : ( Identifier | StringLiteral | numericLiteral | XmlAttribute );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // JS.g:997:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier44=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_propertyName3671); 
                    Identifier44_tree = (Object)adaptor.create(Identifier44);
                    adaptor.addChild(root_0, Identifier44_tree);


                    }
                    break;
                case 2 :
                    // JS.g:998:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral45=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3676); 
                    StringLiteral45_tree = (Object)adaptor.create(StringLiteral45);
                    adaptor.addChild(root_0, StringLiteral45_tree);


                    }
                    break;
                case 3 :
                    // JS.g:999:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3681);
                    numericLiteral46=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral46.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1000:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute47=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_propertyName3686); 
                    XmlAttribute47_tree = (Object)adaptor.create(XmlAttribute47);
                    adaptor.addChild(root_0, XmlAttribute47_tree);


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
    // JS.g:1012:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression48 = null;

        functionExpression_return functionExpression49 = null;

        newExpression_return newExpression50 = null;



        try {
            // JS.g:1013:2: ( primaryExpression | functionExpression | newExpression )
            int alt12=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case XmlAttribute:
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
                    new NoViableAltException("1012:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // JS.g:1013:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3704);
                    primaryExpression48=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression48.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1014:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3709);
                    functionExpression49=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression49.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1015:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3714);
                    newExpression50=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression50.getTree());

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
    // JS.g:1018:1: newExpression : NEW primaryExpression ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW51=null;
        primaryExpression_return primaryExpression52 = null;


        Object NEW51_tree=null;

        try {
            // JS.g:1019:2: ( NEW primaryExpression )
            // JS.g:1019:4: NEW primaryExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW51=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3725); 
            NEW51_tree = (Object)adaptor.create(NEW51);
            root_0 = (Object)adaptor.becomeRoot(NEW51_tree, root_0);

            pushFollow(FOLLOW_primaryExpression_in_newExpression3728);
            primaryExpression52=primaryExpression();
            _fsp--;

            adaptor.addChild(root_0, primaryExpression52.getTree());

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
    // JS.g:1023:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN53=null;
        Token COMMA55=null;
        Token RPAREN57=null;
        assignmentExpression_return assignmentExpression54 = null;

        assignmentExpression_return assignmentExpression56 = null;


        Object LPAREN53_tree=null;
        Object COMMA55_tree=null;
        Object RPAREN57_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1024:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
            // JS.g:1024:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN53=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3741); 
            stream_LPAREN.add(LPAREN53);

            // JS.g:1024:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=NULL && LA14_0<=FALSE)||LA14_0==DELETE||LA14_0==FUNCTION||LA14_0==NEW||LA14_0==THIS||LA14_0==TYPEOF||LA14_0==VOID||LA14_0==YIELD||LA14_0==LBRACE||LA14_0==LPAREN||LA14_0==LBRACK||(LA14_0>=ADD && LA14_0<=SUB)||(LA14_0>=INC && LA14_0<=DEC)||(LA14_0>=NOT && LA14_0<=INV)||(LA14_0>=Identifier && LA14_0<=XmlAttribute)||LA14_0==RegularExpressionLiteral||(LA14_0>=DecimalLiteral && LA14_0<=HexIntegerLiteral)||LA14_0==XMLLiteral) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // JS.g:1024:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3745);
                    assignmentExpression54=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression54.getTree());
                    // JS.g:1024:34: ( COMMA assignmentExpression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // JS.g:1024:36: COMMA assignmentExpression
                    	    {
                    	    COMMA55=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments3749); 
                    	    stream_COMMA.add(COMMA55);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3751);
                    	    assignmentExpression56=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN57=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments3759); 
            stream_RPAREN.add(RPAREN57);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1025:2: -> ^( ARGS ( assignmentExpression )* )
            {
                // JS.g:1025:5: ^( ARGS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1025:13: ( assignmentExpression )*
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
    // JS.g:1028:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK60=null;
        Token RBRACK62=null;
        Token DOT63=null;
        Token DOTDOT65=null;
        Token COLONCOLON67=null;
        memberExpression_return memberExpression58 = null;

        arguments_return arguments59 = null;

        expression_return expression61 = null;

        rightHandSideExpression_return rightHandSideExpression64 = null;

        expression_return expression66 = null;

        expression_return expression68 = null;


        Object LBRACK60_tree=null;
        Object RBRACK62_tree=null;
        Object DOT63_tree=null;
        Object DOTDOT65_tree=null;
        Object COLONCOLON67_tree=null;
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
            // JS.g:1029:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1030:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1030:3: ( memberExpression -> memberExpression )
            // JS.g:1031:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3792);
            memberExpression58=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression58.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1031:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1033:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
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
            	    // JS.g:1034:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3813);
            	    arguments59=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments59.getTree());

            	    // AST REWRITE
            	    // elements: arguments, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1034:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1034:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1035:7: LBRACK expression RBRACK
            	    {
            	    LBRACK60=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3838); 
            	    stream_LBRACK.add(LBRACK60);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3840);
            	    expression61=expression();
            	    _fsp--;

            	    stream_expression.add(expression61.getTree());
            	    RBRACK62=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3842); 
            	    stream_RBRACK.add(RBRACK62);


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1035:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // JS.g:1035:36: ^( BYINDEX $leftHandSideExpression expression )
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
            	    // JS.g:1036:7: DOT rightHandSideExpression
            	    {
            	    DOT63=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3864); 
            	    stream_DOT.add(DOT63);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression3866);
            	    rightHandSideExpression64=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression64.getTree());

            	    // AST REWRITE
            	    // elements: rightHandSideExpression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1036:35: -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // JS.g:1036:38: ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
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
            	    // JS.g:1037:7: DOTDOT expression
            	    {
            	    DOTDOT65=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression3887); 
            	    stream_DOTDOT.add(DOTDOT65);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3889);
            	    expression66=expression();
            	    _fsp--;

            	    stream_expression.add(expression66.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1037:25: -> ^( ALLCHILDREN $leftHandSideExpression expression )
            	    {
            	        // JS.g:1037:28: ^( ALLCHILDREN $leftHandSideExpression expression )
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
            	    // JS.g:1038:7: COLONCOLON expression
            	    {
            	    COLONCOLON67=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression3908); 
            	    stream_COLONCOLON.add(COLONCOLON67);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3910);
            	    expression68=expression();
            	    _fsp--;

            	    stream_expression.add(expression68.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1038:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1038:32: ^( LOCALNAME $leftHandSideExpression expression )
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
    // JS.g:1042:1: rightHandSideExpression : ( parenExpression | Identifier | XmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier70=null;
        Token XmlAttribute71=null;
        Token MUL72=null;
        parenExpression_return parenExpression69 = null;


        Object Identifier70_tree=null;
        Object XmlAttribute71_tree=null;
        Object MUL72_tree=null;

        try {
            // JS.g:1043:3: ( parenExpression | Identifier | XmlAttribute | MUL )
            int alt16=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt16=1;
                }
                break;
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
                    new NoViableAltException("1042:1: rightHandSideExpression : ( parenExpression | Identifier | XmlAttribute | MUL );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // JS.g:1043:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression3939);
                    parenExpression69=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression69.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1044:5: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier70=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_rightHandSideExpression3946); 
                    Identifier70_tree = (Object)adaptor.create(Identifier70);
                    adaptor.addChild(root_0, Identifier70_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1045:5: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute71=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_rightHandSideExpression3952); 
                    XmlAttribute71_tree = (Object)adaptor.create(XmlAttribute71);
                    adaptor.addChild(root_0, XmlAttribute71_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1046:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL72=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression3958); 
                    MUL72_tree = (Object)adaptor.create(MUL72);
                    adaptor.addChild(root_0, MUL72_tree);


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
    // JS.g:1079:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression73 = null;

        postfixOperator_return postfixOperator74 = null;



        try {
            // JS.g:1080:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1080:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3996);
            leftHandSideExpression73=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression73.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1080:95: ( postfixOperator )?
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
                    // JS.g:1080:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4002);
                    postfixOperator74=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator74.getTree(), root_0);

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
    // JS.g:1083:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1084:2: (op= INC | op= DEC )
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
                    new NoViableAltException("1083:1: postfixOperator : (op= INC | op= DEC );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1084:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4020); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1085:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4029); 
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
    // JS.g:1092:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLLiteral78=null;
        postfixExpression_return postfixExpression75 = null;

        unaryOperator_return unaryOperator76 = null;

        unaryExpression_return unaryExpression77 = null;


        Object XMLLiteral78_tree=null;

        try {
            // JS.g:1093:2: ( postfixExpression | unaryOperator unaryExpression | XMLLiteral )
            int alt19=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case FUNCTION:
            case NEW:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case XmlAttribute:
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
                    new NoViableAltException("1092:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // JS.g:1093:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4046);
                    postfixExpression75=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression75.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1094:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4051);
                    unaryOperator76=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator76.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4054);
                    unaryExpression77=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression77.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1095:5: XMLLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLLiteral78=(Token)input.LT(1);
                    match(input,XMLLiteral,FOLLOW_XMLLiteral_in_unaryExpression4060); 
                    XMLLiteral78_tree = (Object)adaptor.create(XMLLiteral78);
                    adaptor.addChild(root_0, XMLLiteral78_tree);


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
    // JS.g:1098:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE79=null;
        Token VOID80=null;
        Token TYPEOF81=null;
        Token INC82=null;
        Token DEC83=null;
        Token INV84=null;
        Token NOT85=null;
        Token YIELD86=null;

        Object op_tree=null;
        Object DELETE79_tree=null;
        Object VOID80_tree=null;
        Object TYPEOF81_tree=null;
        Object INC82_tree=null;
        Object DEC83_tree=null;
        Object INV84_tree=null;
        Object NOT85_tree=null;
        Object YIELD86_tree=null;

        try {
            // JS.g:1099:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
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
                    new NoViableAltException("1098:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // JS.g:1099:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE79=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4072); 
                    DELETE79_tree = (Object)adaptor.create(DELETE79);
                    adaptor.addChild(root_0, DELETE79_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1100:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID80=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4077); 
                    VOID80_tree = (Object)adaptor.create(VOID80);
                    adaptor.addChild(root_0, VOID80_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1101:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF81=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4082); 
                    TYPEOF81_tree = (Object)adaptor.create(TYPEOF81);
                    adaptor.addChild(root_0, TYPEOF81_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1102:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC82=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4087); 
                    INC82_tree = (Object)adaptor.create(INC82);
                    adaptor.addChild(root_0, INC82_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1103:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC83=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4092); 
                    DEC83_tree = (Object)adaptor.create(DEC83);
                    adaptor.addChild(root_0, DEC83_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1104:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4099); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1105:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4108); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1106:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV84=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4115); 
                    INV84_tree = (Object)adaptor.create(INV84);
                    adaptor.addChild(root_0, INV84_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1107:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT85=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4120); 
                    NOT85_tree = (Object)adaptor.create(NOT85);
                    adaptor.addChild(root_0, NOT85_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1108:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD86=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4125); 
                    YIELD86_tree = (Object)adaptor.create(YIELD86);
                    adaptor.addChild(root_0, YIELD86_tree);


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
    // JS.g:1135:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT87=null;
        Token WXML88=null;
        Token NAMESPACE89=null;
        Token ASSIGN90=null;
        Token StringLiteral91=null;
        semic_return semic92 = null;


        Object DEFAULT87_tree=null;
        Object WXML88_tree=null;
        Object NAMESPACE89_tree=null;
        Object ASSIGN90_tree=null;
        Object StringLiteral91_tree=null;

        try {
            // JS.g:1136:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic )
            // JS.g:1136:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT87=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4161); 
            DEFAULT87_tree = (Object)adaptor.create(DEFAULT87);
            adaptor.addChild(root_0, DEFAULT87_tree);

            WXML88=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4163); 
            WXML88_tree = (Object)adaptor.create(WXML88);
            adaptor.addChild(root_0, WXML88_tree);

            NAMESPACE89=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4165); 
            NAMESPACE89_tree = (Object)adaptor.create(NAMESPACE89);
            root_0 = (Object)adaptor.becomeRoot(NAMESPACE89_tree, root_0);

            ASSIGN90=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4168); 
            ASSIGN90_tree = (Object)adaptor.create(ASSIGN90);
            adaptor.addChild(root_0, ASSIGN90_tree);

            StringLiteral91=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4170); 
            StringLiteral91_tree = (Object)adaptor.create(StringLiteral91);
            adaptor.addChild(root_0, StringLiteral91_tree);

            pushFollow(FOLLOW_semic_in_namespaceStatement4172);
            semic92=semic();
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
    // JS.g:1141:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set94=null;
        unaryExpression_return unaryExpression93 = null;

        unaryExpression_return unaryExpression95 = null;


        Object set94_tree=null;

        try {
            // JS.g:1142:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1142:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4187);
            unaryExpression93=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression93.getTree());
            // JS.g:1142:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=MUL && LA21_0<=MOD)||LA21_0==DIV) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // JS.g:1142:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set94=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set94), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4191);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4206);
            	    unaryExpression95=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression95.getTree());

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
    // JS.g:1149:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set97=null;
        multiplicativeExpression_return multiplicativeExpression96 = null;

        multiplicativeExpression_return multiplicativeExpression98 = null;


        Object set97_tree=null;

        try {
            // JS.g:1150:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1150:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4224);
            multiplicativeExpression96=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression96.getTree());
            // JS.g:1150:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=ADD && LA22_0<=SUB)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // JS.g:1150:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set97=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set97), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4228);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4239);
            	    multiplicativeExpression98=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression98.getTree());

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
    // JS.g:1157:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set100=null;
        additiveExpression_return additiveExpression99 = null;

        additiveExpression_return additiveExpression101 = null;


        Object set100_tree=null;

        try {
            // JS.g:1158:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1158:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4258);
            additiveExpression99=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression99.getTree());
            // JS.g:1158:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=SHL && LA23_0<=SHU)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // JS.g:1158:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set100=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set100), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4262);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4277);
            	    additiveExpression101=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression101.getTree());

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
    // JS.g:1165:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set103=null;
        shiftExpression_return shiftExpression102 = null;

        shiftExpression_return shiftExpression104 = null;


        Object set103_tree=null;

        try {
            // JS.g:1166:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1166:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4296);
            shiftExpression102=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression102.getTree());
            // JS.g:1166:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
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
            	    // JS.g:1166:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set103=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set103), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4300);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4327);
            	    shiftExpression104=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression104.getTree());

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
    // JS.g:1169:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set106=null;
        shiftExpression_return shiftExpression105 = null;

        shiftExpression_return shiftExpression107 = null;


        Object set106_tree=null;

        try {
            // JS.g:1170:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1170:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4341);
            shiftExpression105=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression105.getTree());
            // JS.g:1170:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==INSTANCEOF||(LA25_0>=LT && LA25_0<=GTE)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JS.g:1170:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set106=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set106), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4345);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4368);
            	    shiftExpression107=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression107.getTree());

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
    // JS.g:1177:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set109=null;
        relationalExpression_return relationalExpression108 = null;

        relationalExpression_return relationalExpression110 = null;


        Object set109_tree=null;

        try {
            // JS.g:1178:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1178:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4387);
            relationalExpression108=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression108.getTree());
            // JS.g:1178:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=EQ && LA26_0<=NSAME)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JS.g:1178:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set109=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set109), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4391);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4410);
            	    relationalExpression110=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression110.getTree());

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
    // JS.g:1181:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set112=null;
        relationalExpressionNoIn_return relationalExpressionNoIn111 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn113 = null;


        Object set112_tree=null;

        try {
            // JS.g:1182:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1182:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4424);
            relationalExpressionNoIn111=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn111.getTree());
            // JS.g:1182:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=EQ && LA27_0<=NSAME)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1182:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set112=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set112), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4428);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4447);
            	    relationalExpressionNoIn113=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn113.getTree());

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
    // JS.g:1189:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND115=null;
        equalityExpression_return equalityExpression114 = null;

        equalityExpression_return equalityExpression116 = null;


        Object AND115_tree=null;

        try {
            // JS.g:1190:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1190:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4467);
            equalityExpression114=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression114.getTree());
            // JS.g:1190:23: ( AND equalityExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1190:25: AND equalityExpression
            	    {
            	    AND115=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4471); 
            	    AND115_tree = (Object)adaptor.create(AND115);
            	    root_0 = (Object)adaptor.becomeRoot(AND115_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4474);
            	    equalityExpression116=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression116.getTree());

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
    // JS.g:1193:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND118=null;
        equalityExpressionNoIn_return equalityExpressionNoIn117 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn119 = null;


        Object AND118_tree=null;

        try {
            // JS.g:1194:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1194:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4488);
            equalityExpressionNoIn117=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn117.getTree());
            // JS.g:1194:27: ( AND equalityExpressionNoIn )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1194:29: AND equalityExpressionNoIn
            	    {
            	    AND118=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4492); 
            	    AND118_tree = (Object)adaptor.create(AND118);
            	    root_0 = (Object)adaptor.becomeRoot(AND118_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4495);
            	    equalityExpressionNoIn119=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn119.getTree());

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
    // JS.g:1197:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR121=null;
        bitwiseANDExpression_return bitwiseANDExpression120 = null;

        bitwiseANDExpression_return bitwiseANDExpression122 = null;


        Object XOR121_tree=null;

        try {
            // JS.g:1198:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1198:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4511);
            bitwiseANDExpression120=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression120.getTree());
            // JS.g:1198:25: ( XOR bitwiseANDExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==XOR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1198:27: XOR bitwiseANDExpression
            	    {
            	    XOR121=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4515); 
            	    XOR121_tree = (Object)adaptor.create(XOR121);
            	    root_0 = (Object)adaptor.becomeRoot(XOR121_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4518);
            	    bitwiseANDExpression122=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression122.getTree());

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
    // JS.g:1201:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR124=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn123 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn125 = null;


        Object XOR124_tree=null;

        try {
            // JS.g:1202:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1202:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4534);
            bitwiseANDExpressionNoIn123=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn123.getTree());
            // JS.g:1202:29: ( XOR bitwiseANDExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==XOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1202:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR124=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4538); 
            	    XOR124_tree = (Object)adaptor.create(XOR124);
            	    root_0 = (Object)adaptor.becomeRoot(XOR124_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4541);
            	    bitwiseANDExpressionNoIn125=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn125.getTree());

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
    // JS.g:1205:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR127=null;
        bitwiseXORExpression_return bitwiseXORExpression126 = null;

        bitwiseXORExpression_return bitwiseXORExpression128 = null;


        Object OR127_tree=null;

        try {
            // JS.g:1206:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1206:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4556);
            bitwiseXORExpression126=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression126.getTree());
            // JS.g:1206:25: ( OR bitwiseXORExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1206:27: OR bitwiseXORExpression
            	    {
            	    OR127=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4560); 
            	    OR127_tree = (Object)adaptor.create(OR127);
            	    root_0 = (Object)adaptor.becomeRoot(OR127_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4563);
            	    bitwiseXORExpression128=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression128.getTree());

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
    // JS.g:1209:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR130=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn129 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn131 = null;


        Object OR130_tree=null;

        try {
            // JS.g:1210:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1210:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4578);
            bitwiseXORExpressionNoIn129=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn129.getTree());
            // JS.g:1210:29: ( OR bitwiseXORExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==OR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1210:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR130=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4582); 
            	    OR130_tree = (Object)adaptor.create(OR130);
            	    root_0 = (Object)adaptor.becomeRoot(OR130_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4585);
            	    bitwiseXORExpressionNoIn131=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn131.getTree());

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
    // JS.g:1217:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND133=null;
        bitwiseORExpression_return bitwiseORExpression132 = null;

        bitwiseORExpression_return bitwiseORExpression134 = null;


        Object LAND133_tree=null;

        try {
            // JS.g:1218:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1218:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4604);
            bitwiseORExpression132=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression132.getTree());
            // JS.g:1218:24: ( LAND bitwiseORExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LAND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1218:26: LAND bitwiseORExpression
            	    {
            	    LAND133=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4608); 
            	    LAND133_tree = (Object)adaptor.create(LAND133);
            	    root_0 = (Object)adaptor.becomeRoot(LAND133_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4611);
            	    bitwiseORExpression134=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression134.getTree());

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
    // JS.g:1221:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND136=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn135 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn137 = null;


        Object LAND136_tree=null;

        try {
            // JS.g:1222:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1222:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4625);
            bitwiseORExpressionNoIn135=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn135.getTree());
            // JS.g:1222:28: ( LAND bitwiseORExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LAND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1222:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND136=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4629); 
            	    LAND136_tree = (Object)adaptor.create(LAND136);
            	    root_0 = (Object)adaptor.becomeRoot(LAND136_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4632);
            	    bitwiseORExpressionNoIn137=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn137.getTree());

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
    // JS.g:1225:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR139=null;
        logicalANDExpression_return logicalANDExpression138 = null;

        logicalANDExpression_return logicalANDExpression140 = null;


        Object LOR139_tree=null;

        try {
            // JS.g:1226:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1226:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4647);
            logicalANDExpression138=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression138.getTree());
            // JS.g:1226:25: ( LOR logicalANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1226:27: LOR logicalANDExpression
            	    {
            	    LOR139=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4651); 
            	    LOR139_tree = (Object)adaptor.create(LOR139);
            	    root_0 = (Object)adaptor.becomeRoot(LOR139_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4654);
            	    logicalANDExpression140=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression140.getTree());

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
    // JS.g:1229:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR142=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn141 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn143 = null;


        Object LOR142_tree=null;

        try {
            // JS.g:1230:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1230:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4669);
            logicalANDExpressionNoIn141=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn141.getTree());
            // JS.g:1230:29: ( LOR logicalANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1230:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR142=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4673); 
            	    LOR142_tree = (Object)adaptor.create(LOR142);
            	    root_0 = (Object)adaptor.becomeRoot(LOR142_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4676);
            	    logicalANDExpressionNoIn143=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn143.getTree());

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
    // JS.g:1237:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE145=null;
        Token COLON147=null;
        logicalORExpression_return logicalORExpression144 = null;

        assignmentExpression_return assignmentExpression146 = null;

        assignmentExpression_return assignmentExpression148 = null;


        Object QUE145_tree=null;
        Object COLON147_tree=null;

        try {
            // JS.g:1238:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1238:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4695);
            logicalORExpression144=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression144.getTree());
            // JS.g:1238:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==QUE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // JS.g:1238:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE145=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4699); 
                    QUE145_tree = (Object)adaptor.create(QUE145);
                    root_0 = (Object)adaptor.becomeRoot(QUE145_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4702);
                    assignmentExpression146=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression146.getTree());
                    COLON147=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4704); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4707);
                    assignmentExpression148=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression148.getTree());

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
    // JS.g:1241:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE150=null;
        Token COLON152=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn149 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn151 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn153 = null;


        Object QUE150_tree=null;
        Object COLON152_tree=null;

        try {
            // JS.g:1242:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1242:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4721);
            logicalORExpressionNoIn149=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn149.getTree());
            // JS.g:1242:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // JS.g:1242:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE150=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4725); 
                    QUE150_tree = (Object)adaptor.create(QUE150);
                    root_0 = (Object)adaptor.becomeRoot(QUE150_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4728);
                    assignmentExpressionNoIn151=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn151.getTree());
                    COLON152=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4730); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4733);
                    assignmentExpressionNoIn153=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn153.getTree());

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
    // JS.g:1271:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator154 = null;

        assignmentExpression_return assignmentExpression155 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1276:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1276:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4761);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1277:2: ({...}? assignmentOperator assignmentExpression )?
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
                    // JS.g:1277:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4768);
                    assignmentOperator154=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator154.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4771);
                    assignmentExpression155=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression155.getTree());

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
    // JS.g:1280:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set156=null;

        Object set156_tree=null;

        try {
            // JS.g:1281:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set156=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set156));
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
    // JS.g:1284:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator157 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn158 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1289:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1289:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4849);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1290:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
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
                    // JS.g:1290:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4856);
                    assignmentOperator157=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator157.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4859);
                    assignmentExpressionNoIn158=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn158.getTree());

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
    // JS.g:1297:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA159=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA159_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1298:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1298:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4881);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1298:32: ( COMMA exprs+= assignmentExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JS.g:1298:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA159=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression4885); 
            	    stream_COMMA.add(COMMA159);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression4889);
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
            // 1299:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1299:28: ^( CEXPR ( $exprs)+ )
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
            else // 1300:2: -> $exprs
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
    // JS.g:1303:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA160=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA160_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1304:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1304:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4926);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1304:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1304:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA160=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4930); 
            	    stream_COMMA.add(COMMA160);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4934);
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
            // 1305:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1305:28: ^( CEXPR ( $exprs)+ )
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
            else // 1306:2: -> $exprs
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
    // JS.g:1331:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC161=null;
        Token EOF162=null;
        Token RBRACE163=null;
        Token EOL164=null;
        Token MultiLineComment165=null;

        Object SEMIC161_tree=null;
        Object EOF162_tree=null;
        Object RBRACE163_tree=null;
        Object EOL164_tree=null;
        Object MultiLineComment165_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1339:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
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
                    new NoViableAltException("1331:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // JS.g:1339:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC161=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic4985); 
                    SEMIC161_tree = (Object)adaptor.create(SEMIC161);
                    adaptor.addChild(root_0, SEMIC161_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1340:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF162=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic4990); 
                    EOF162_tree = (Object)adaptor.create(EOF162);
                    adaptor.addChild(root_0, EOF162_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1341:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE163=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic4995); 
                    RBRACE163_tree = (Object)adaptor.create(RBRACE163);
                    adaptor.addChild(root_0, RBRACE163_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1342:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL164=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5002); 
                    EOL164_tree = (Object)adaptor.create(EOL164);
                    adaptor.addChild(root_0, EOL164_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1342:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment165=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5006); 
                    MultiLineComment165_tree = (Object)adaptor.create(MultiLineComment165);
                    adaptor.addChild(root_0, MultiLineComment165_tree);


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
    // JS.g:1350:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block166 = null;

        statementTail_return statementTail167 = null;



        try {
            // JS.g:1355:2: ({...}? block | statementTail )
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
                        new NoViableAltException("1350:1: statement options {k=1; } : ({...}? block | statementTail );", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA45_0>=NULL && LA45_0<=BREAK)||(LA45_0>=CONTINUE && LA45_0<=DO)||LA45_0==FOR||(LA45_0>=FUNCTION && LA45_0<=IF)||(LA45_0>=NEW && LA45_0<=WITH)||LA45_0==YIELD||LA45_0==CONST||LA45_0==LPAREN||LA45_0==LBRACK||LA45_0==SEMIC||(LA45_0>=ADD && LA45_0<=SUB)||(LA45_0>=INC && LA45_0<=DEC)||(LA45_0>=NOT && LA45_0<=INV)||(LA45_0>=Identifier && LA45_0<=XmlAttribute)||LA45_0==RegularExpressionLiteral||(LA45_0>=DecimalLiteral && LA45_0<=HexIntegerLiteral)||LA45_0==XMLLiteral) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1350:1: statement options {k=1; } : ({...}? block | statementTail );", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // JS.g:1355:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5035);
                    block166=block();
                    _fsp--;

                    adaptor.addChild(root_0, block166.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1356:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5040);
                    statementTail167=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail167.getTree());

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
    // JS.g:1359:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement168 = null;

        emptyStatement_return emptyStatement169 = null;

        expressionStatement_return expressionStatement170 = null;

        ifStatement_return ifStatement171 = null;

        iterationStatement_return iterationStatement172 = null;

        continueStatement_return continueStatement173 = null;

        breakStatement_return breakStatement174 = null;

        returnStatement_return returnStatement175 = null;

        withStatement_return withStatement176 = null;

        labelledStatement_return labelledStatement177 = null;

        switchStatement_return switchStatement178 = null;

        throwStatement_return throwStatement179 = null;

        tryStatement_return tryStatement180 = null;

        constStatement_return constStatement181 = null;

        namespaceStatement_return namespaceStatement182 = null;



        try {
            // JS.g:1360:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
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
                        new NoViableAltException("1359:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 46, 4, input);

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
                    new NoViableAltException("1359:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // JS.g:1360:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5052);
                    variableStatement168=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement168.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1361:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5057);
                    emptyStatement169=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement169.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1362:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5062);
                    expressionStatement170=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement170.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1363:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5067);
                    ifStatement171=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement171.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1364:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5072);
                    iterationStatement172=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement172.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1365:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5077);
                    continueStatement173=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement173.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1366:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5082);
                    breakStatement174=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement174.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1367:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5087);
                    returnStatement175=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement175.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1368:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5092);
                    withStatement176=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement176.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1369:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5097);
                    labelledStatement177=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement177.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1370:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5102);
                    switchStatement178=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement178.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1371:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5107);
                    throwStatement179=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement179.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1372:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5112);
                    tryStatement180=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement180.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1373:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5117);
                    constStatement181=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement181.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1374:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5122);
                    namespaceStatement182=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement182.getTree());

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
    // JS.g:1379:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE184=null;
        statement_return statement183 = null;


        Object lb_tree=null;
        Object RBRACE184_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1380:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1380:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5137); 
            stream_LBRACE.add(lb);

            // JS.g:1380:14: ( statement )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=NULL && LA47_0<=BREAK)||(LA47_0>=CONTINUE && LA47_0<=DO)||LA47_0==FOR||(LA47_0>=FUNCTION && LA47_0<=IF)||(LA47_0>=NEW && LA47_0<=WITH)||LA47_0==YIELD||LA47_0==CONST||LA47_0==LBRACE||LA47_0==LPAREN||LA47_0==LBRACK||LA47_0==SEMIC||(LA47_0>=ADD && LA47_0<=SUB)||(LA47_0>=INC && LA47_0<=DEC)||(LA47_0>=NOT && LA47_0<=INV)||(LA47_0>=Identifier && LA47_0<=XmlAttribute)||LA47_0==RegularExpressionLiteral||(LA47_0>=DecimalLiteral && LA47_0<=HexIntegerLiteral)||LA47_0==XMLLiteral) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // JS.g:1380:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5139);
            	    statement183=statement();
            	    _fsp--;

            	    stream_statement.add(statement183.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            RBRACE184=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5142); 
            stream_RBRACE.add(RBRACE184);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1381:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1381:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1381:28: ( statement )*
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
    // JS.g:1388:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR185=null;
        Token COMMA187=null;
        variableDeclaration_return variableDeclaration186 = null;

        variableDeclaration_return variableDeclaration188 = null;

        semic_return semic189 = null;


        Object VAR185_tree=null;
        Object COMMA187_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1389:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1389:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR185=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5171); 
            stream_VAR.add(VAR185);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5173);
            variableDeclaration186=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration186.getTree());
            // JS.g:1389:28: ( COMMA variableDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1389:30: COMMA variableDeclaration
            	    {
            	    COMMA187=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5177); 
            	    stream_COMMA.add(COMMA187);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5179);
            	    variableDeclaration188=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration188.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5184);
            semic189=semic();
            _fsp--;

            stream_semic.add(semic189.getTree());

            // AST REWRITE
            // elements: VAR, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1390:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1390:5: ^( VAR ( variableDeclaration )+ )
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
    // JS.g:1393:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier190=null;
        Token ASSIGN191=null;
        assignmentExpression_return assignmentExpression192 = null;


        Object Identifier190_tree=null;
        Object ASSIGN191_tree=null;

        try {
            // JS.g:1394:2: ( Identifier ( ASSIGN assignmentExpression )? )
            // JS.g:1394:4: Identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            Identifier190=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration5207); 
            Identifier190_tree = (Object)adaptor.create(Identifier190);
            adaptor.addChild(root_0, Identifier190_tree);

            // JS.g:1394:15: ( ASSIGN assignmentExpression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASSIGN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // JS.g:1394:17: ASSIGN assignmentExpression
                    {
                    ASSIGN191=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5211); 
                    ASSIGN191_tree = (Object)adaptor.create(ASSIGN191);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN191_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5214);
                    assignmentExpression192=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression192.getTree());

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
    // JS.g:1397:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier193=null;
        Token ASSIGN194=null;
        assignmentExpressionNoIn_return assignmentExpressionNoIn195 = null;


        Object Identifier193_tree=null;
        Object ASSIGN194_tree=null;

        try {
            // JS.g:1398:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1398:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            Identifier193=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn5229); 
            Identifier193_tree = (Object)adaptor.create(Identifier193);
            adaptor.addChild(root_0, Identifier193_tree);

            // JS.g:1398:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ASSIGN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // JS.g:1398:17: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN194=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5233); 
                    ASSIGN194_tree = (Object)adaptor.create(ASSIGN194);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN194_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5236);
                    assignmentExpressionNoIn195=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn195.getTree());

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
    // JS.g:1401:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST196=null;
        Token COMMA198=null;
        variableDeclaration_return variableDeclaration197 = null;

        variableDeclaration_return variableDeclaration199 = null;

        semic_return semic200 = null;


        Object CONST196_tree=null;
        Object COMMA198_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1402:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1402:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST196=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5251); 
            stream_CONST.add(CONST196);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5253);
            variableDeclaration197=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration197.getTree());
            // JS.g:1402:31: ( COMMA variableDeclaration )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // JS.g:1402:33: COMMA variableDeclaration
            	    {
            	    COMMA198=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5257); 
            	    stream_COMMA.add(COMMA198);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5259);
            	    variableDeclaration199=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration199.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5264);
            semic200=semic();
            _fsp--;

            stream_semic.add(semic200.getTree());

            // AST REWRITE
            // elements: variableDeclaration, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1403:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1403:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1410:1: emptyStatement : SEMIC ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC201=null;

        Object SEMIC201_tree=null;

        try {
            // JS.g:1411:2: ( SEMIC )
            // JS.g:1411:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC201=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5294); 

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
    // JS.g:1424:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression202 = null;

        semic_return semic203 = null;



        try {
            // JS.g:1425:2: ( expression semic )
            // JS.g:1425:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5313);
            expression202=expression();
            _fsp--;

            adaptor.addChild(root_0, expression202.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5315);
            semic203=semic();
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
    // JS.g:1432:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF204=null;
        Token LPAREN205=null;
        Token RPAREN207=null;
        Token ELSE209=null;
        expression_return expression206 = null;

        statement_return statement208 = null;

        statement_return statement210 = null;


        Object IF204_tree=null;
        Object LPAREN205_tree=null;
        Object RPAREN207_tree=null;
        Object ELSE209_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1434:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1434:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF204=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5333); 
            stream_IF.add(IF204);

            LPAREN205=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5335); 
            stream_LPAREN.add(LPAREN205);

            pushFollow(FOLLOW_expression_in_ifStatement5337);
            expression206=expression();
            _fsp--;

            stream_expression.add(expression206.getTree());
            RPAREN207=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5339); 
            stream_RPAREN.add(RPAREN207);

            pushFollow(FOLLOW_statement_in_ifStatement5341);
            statement208=statement();
            _fsp--;

            stream_statement.add(statement208.getTree());
            // JS.g:1434:42: ({...}? ELSE statement )?
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
                    // JS.g:1434:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE209=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5347); 
                    stream_ELSE.add(ELSE209);

                    pushFollow(FOLLOW_statement_in_ifStatement5349);
                    statement210=statement();
                    _fsp--;

                    stream_statement.add(statement210.getTree());

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
            // 1435:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1435:5: ^( IF expression ( statement )+ )
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
    // JS.g:1442:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement211 = null;

        whileStatement_return whileStatement212 = null;

        forEachStatement_return forEachStatement213 = null;

        forStatement_return forStatement214 = null;



        try {
            // JS.g:1443:2: ( doStatement | whileStatement | forEachStatement | forStatement )
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
                        new NoViableAltException("1442:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 53, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1442:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // JS.g:1443:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5382);
                    doStatement211=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement211.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1444:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5387);
                    whileStatement212=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement212.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1445:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5392);
                    forEachStatement213=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement213.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1446:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5397);
                    forStatement214=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement214.getTree());

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
    // JS.g:1449:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO215=null;
        Token WHILE217=null;
        Token LPAREN218=null;
        Token RPAREN220=null;
        statement_return statement216 = null;

        expression_return expression219 = null;

        semic_return semic221 = null;


        Object DO215_tree=null;
        Object WHILE217_tree=null;
        Object LPAREN218_tree=null;
        Object RPAREN220_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1450:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1450:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO215=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5409); 
            stream_DO.add(DO215);

            pushFollow(FOLLOW_statement_in_doStatement5411);
            statement216=statement();
            _fsp--;

            stream_statement.add(statement216.getTree());
            WHILE217=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5413); 
            stream_WHILE.add(WHILE217);

            LPAREN218=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5415); 
            stream_LPAREN.add(LPAREN218);

            pushFollow(FOLLOW_expression_in_doStatement5417);
            expression219=expression();
            _fsp--;

            stream_expression.add(expression219.getTree());
            RPAREN220=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5419); 
            stream_RPAREN.add(RPAREN220);

            pushFollow(FOLLOW_semic_in_doStatement5421);
            semic221=semic();
            _fsp--;

            stream_semic.add(semic221.getTree());

            // AST REWRITE
            // elements: statement, DO, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1451:2: -> ^( DO statement expression )
            {
                // JS.g:1451:5: ^( DO statement expression )
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
    // JS.g:1454:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE222=null;
        Token LPAREN223=null;
        Token RPAREN225=null;
        expression_return expression224 = null;

        statement_return statement226 = null;


        Object WHILE222_tree=null;
        Object LPAREN223_tree=null;
        Object RPAREN225_tree=null;

        try {
            // JS.g:1455:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1455:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE222=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5446); 
            WHILE222_tree = (Object)adaptor.create(WHILE222);
            root_0 = (Object)adaptor.becomeRoot(WHILE222_tree, root_0);

            LPAREN223=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5449); 
            pushFollow(FOLLOW_expression_in_whileStatement5452);
            expression224=expression();
            _fsp--;

            adaptor.addChild(root_0, expression224.getTree());
            RPAREN225=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5454); 
            pushFollow(FOLLOW_statement_in_whileStatement5457);
            statement226=statement();
            _fsp--;

            adaptor.addChild(root_0, statement226.getTree());

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
    // JS.g:1500:1: forEachStatement : FOR EACH LPAREN forEachControl RPAREN statement ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR227=null;
        Token EACH228=null;
        Token LPAREN229=null;
        Token RPAREN231=null;
        forEachControl_return forEachControl230 = null;

        statement_return statement232 = null;


        Object FOR227_tree=null;
        Object EACH228_tree=null;
        Object LPAREN229_tree=null;
        Object RPAREN231_tree=null;

        try {
            // JS.g:1501:3: ( FOR EACH LPAREN forEachControl RPAREN statement )
            // JS.g:1501:5: FOR EACH LPAREN forEachControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR227=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5472); 
            EACH228=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5475); 
            EACH228_tree = (Object)adaptor.create(EACH228);
            root_0 = (Object)adaptor.becomeRoot(EACH228_tree, root_0);

            LPAREN229=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5478); 
            pushFollow(FOLLOW_forEachControl_in_forEachStatement5481);
            forEachControl230=forEachControl();
            _fsp--;

            adaptor.addChild(root_0, forEachControl230.getTree());
            RPAREN231=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5483); 
            pushFollow(FOLLOW_statement_in_forEachStatement5486);
            statement232=statement();
            _fsp--;

            adaptor.addChild(root_0, statement232.getTree());

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
    // JS.g:1504:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar233 = null;

        forControlExpression_return forControlExpression234 = null;



        try {
            // JS.g:1505:3: ( forControlVar | forControlExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==VAR) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==THIS||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==YIELD||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)||(LA54_0>=Identifier && LA54_0<=XmlAttribute)||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)||LA54_0==XMLLiteral) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1504:1: forEachControl : ( forControlVar | forControlExpression );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // JS.g:1505:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5499);
                    forControlVar233=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar233.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1506:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5505);
                    forControlExpression234=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression234.getTree());

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
    // JS.g:1509:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR235=null;
        Token LPAREN236=null;
        Token RPAREN238=null;
        forControl_return forControl237 = null;

        statement_return statement239 = null;


        Object FOR235_tree=null;
        Object LPAREN236_tree=null;
        Object RPAREN238_tree=null;

        try {
            // JS.g:1510:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1510:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR235=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5517); 
            FOR235_tree = (Object)adaptor.create(FOR235);
            root_0 = (Object)adaptor.becomeRoot(FOR235_tree, root_0);

            LPAREN236=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5520); 
            pushFollow(FOLLOW_forControl_in_forStatement5523);
            forControl237=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl237.getTree());
            RPAREN238=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5525); 
            pushFollow(FOLLOW_statement_in_forStatement5528);
            statement239=statement();
            _fsp--;

            adaptor.addChild(root_0, statement239.getTree());

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
    // JS.g:1513:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar240 = null;

        forControlExpression_return forControlExpression241 = null;

        forControlSemic_return forControlSemic242 = null;



        try {
            // JS.g:1514:2: ( forControlVar | forControlExpression | forControlSemic )
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
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case Identifier:
            case StringLiteral:
            case XmlAttribute:
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
                    new NoViableAltException("1513:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // JS.g:1514:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5539);
                    forControlVar240=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar240.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1515:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5544);
                    forControlExpression241=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression241.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1516:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5549);
                    forControlSemic242=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic242.getTree());

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
    // JS.g:1519:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR243=null;
        Token IN245=null;
        Token COMMA247=null;
        Token SEMIC249=null;
        Token SEMIC250=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn244 = null;

        expression_return expression246 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn248 = null;


        Object VAR243_tree=null;
        Object IN245_tree=null;
        Object COMMA247_tree=null;
        Object SEMIC249_tree=null;
        Object SEMIC250_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1520:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1520:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR243=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar5560); 
            stream_VAR.add(VAR243);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5562);
            variableDeclarationNoIn244=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn244.getTree());
            // JS.g:1521:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
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
                    new NoViableAltException("1521:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // JS.g:1522:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1522:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1523:4: IN expression
                    {
                    IN245=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar5574); 
                    stream_IN.add(IN245);

                    pushFollow(FOLLOW_expression_in_forControlVar5576);
                    expression246=expression();
                    _fsp--;

                    stream_expression.add(expression246.getTree());

                    // AST REWRITE
                    // elements: variableDeclarationNoIn, VAR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1524:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1524:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1524:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1524:51: ^( EXPR expression )
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
                    // JS.g:1527:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1527:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1528:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1528:4: ( COMMA variableDeclarationNoIn )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // JS.g:1528:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA247=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5622); 
                    	    stream_COMMA.add(COMMA247);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5624);
                    	    variableDeclarationNoIn248=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn248.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    SEMIC249=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5629); 
                    stream_SEMIC.add(SEMIC249);

                    // JS.g:1528:48: (ex1= expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=NULL && LA57_0<=FALSE)||LA57_0==DELETE||LA57_0==FUNCTION||LA57_0==NEW||LA57_0==THIS||LA57_0==TYPEOF||LA57_0==VOID||LA57_0==YIELD||LA57_0==LBRACE||LA57_0==LPAREN||LA57_0==LBRACK||(LA57_0>=ADD && LA57_0<=SUB)||(LA57_0>=INC && LA57_0<=DEC)||(LA57_0>=NOT && LA57_0<=INV)||(LA57_0>=Identifier && LA57_0<=XmlAttribute)||LA57_0==RegularExpressionLiteral||(LA57_0>=DecimalLiteral && LA57_0<=HexIntegerLiteral)||LA57_0==XMLLiteral) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // JS.g:1528:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5633);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC250=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5636); 
                    stream_SEMIC.add(SEMIC250);

                    // JS.g:1528:70: (ex2= expression )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==DELETE||LA58_0==FUNCTION||LA58_0==NEW||LA58_0==THIS||LA58_0==TYPEOF||LA58_0==VOID||LA58_0==YIELD||LA58_0==LBRACE||LA58_0==LPAREN||LA58_0==LBRACK||(LA58_0>=ADD && LA58_0<=SUB)||(LA58_0>=INC && LA58_0<=DEC)||(LA58_0>=NOT && LA58_0<=INV)||(LA58_0>=Identifier && LA58_0<=XmlAttribute)||LA58_0==RegularExpressionLiteral||(LA58_0>=DecimalLiteral && LA58_0<=HexIntegerLiteral)||LA58_0==XMLLiteral) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // JS.g:1528:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5640);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: variableDeclarationNoIn, ex2, ex1, VAR
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1529:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1529:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1529:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1529:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1529:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1529:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1529:76: ( $ex2)?
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
    // JS.g:1534:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN251=null;
        Token SEMIC252=null;
        Token SEMIC253=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN251_tree=null;
        Object SEMIC252_tree=null;
        Object SEMIC253_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1539:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1539:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5706);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1540:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
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
                    new NoViableAltException("1540:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // JS.g:1541:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1541:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1542:4: IN ex2= expression
                    {
                    IN251=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression5721); 
                    stream_IN.add(IN251);

                    pushFollow(FOLLOW_expression_in_forControlExpression5725);
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
                    // 1543:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1543:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1543:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1543:33: ^( EXPR $ex2)
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
                    // JS.g:1546:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1546:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1547:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC252=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5771); 
                    stream_SEMIC.add(SEMIC252);

                    // JS.g:1547:13: (ex2= expression )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==YIELD||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=Identifier && LA60_0<=XmlAttribute)||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)||LA60_0==XMLLiteral) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // JS.g:1547:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5775);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC253=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5778); 
                    stream_SEMIC.add(SEMIC253);

                    // JS.g:1547:35: (ex3= expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==YIELD||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||(LA61_0>=Identifier && LA61_0<=XmlAttribute)||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)||LA61_0==XMLLiteral) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // JS.g:1547:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5782);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex3, ex1, ex2
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
                    // 1548:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1548:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1548:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1548:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1548:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1548:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1548:57: ( $ex3)?
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
    // JS.g:1553:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC254=null;
        Token SEMIC255=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC254_tree=null;
        Object SEMIC255_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1554:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1554:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC254=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5841); 
            stream_SEMIC.add(SEMIC254);

            // JS.g:1554:13: (ex1= expression )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==YIELD||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||(LA63_0>=Identifier && LA63_0<=XmlAttribute)||LA63_0==RegularExpressionLiteral||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)||LA63_0==XMLLiteral) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // JS.g:1554:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5845);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC255=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5848); 
            stream_SEMIC.add(SEMIC255);

            // JS.g:1554:35: (ex2= expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||LA64_0==FUNCTION||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||LA64_0==YIELD||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||(LA64_0>=Identifier && LA64_0<=XmlAttribute)||LA64_0==RegularExpressionLiteral||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)||LA64_0==XMLLiteral) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // JS.g:1554:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5852);
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
            // 1555:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1555:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1555:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1555:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1555:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1555:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1555:50: ( $ex2)?
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
    // JS.g:1567:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE256=null;
        Token Identifier257=null;
        semic_return semic258 = null;


        Object CONTINUE256_tree=null;
        Object Identifier257_tree=null;

        try {
            // JS.g:1568:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1568:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE256=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5906); 
            CONTINUE256_tree = (Object)adaptor.create(CONTINUE256);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE256_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1568:67: ( Identifier )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Identifier) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // JS.g:1568:67: Identifier
                    {
                    Identifier257=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement5911); 
                    Identifier257_tree = (Object)adaptor.create(Identifier257);
                    adaptor.addChild(root_0, Identifier257_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement5914);
            semic258=semic();
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
    // JS.g:1580:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK259=null;
        Token Identifier260=null;
        semic_return semic261 = null;


        Object BREAK259_tree=null;
        Object Identifier260_tree=null;

        try {
            // JS.g:1581:2: ( BREAK ( Identifier )? semic )
            // JS.g:1581:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK259=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement5933); 
            BREAK259_tree = (Object)adaptor.create(BREAK259);
            root_0 = (Object)adaptor.becomeRoot(BREAK259_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1581:64: ( Identifier )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Identifier) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // JS.g:1581:64: Identifier
                    {
                    Identifier260=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement5938); 
                    Identifier260_tree = (Object)adaptor.create(Identifier260);
                    adaptor.addChild(root_0, Identifier260_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement5941);
            semic261=semic();
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
    // JS.g:1601:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN262=null;
        expression_return expression263 = null;

        semic_return semic264 = null;


        Object RETURN262_tree=null;

        try {
            // JS.g:1602:2: ( RETURN ( expression )? semic )
            // JS.g:1602:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN262=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement5960); 
            RETURN262_tree = (Object)adaptor.create(RETURN262);
            root_0 = (Object)adaptor.becomeRoot(RETURN262_tree, root_0);

             promoteEOL(null); 
            // JS.g:1602:34: ( expression )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||LA67_0==FUNCTION||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||LA67_0==YIELD||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||(LA67_0>=Identifier && LA67_0<=XmlAttribute)||LA67_0==RegularExpressionLiteral||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)||LA67_0==XMLLiteral) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // JS.g:1602:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement5965);
                    expression263=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression263.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement5968);
            semic264=semic();
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
    // JS.g:1609:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH265=null;
        Token LPAREN266=null;
        Token RPAREN268=null;
        expression_return expression267 = null;

        statement_return statement269 = null;


        Object WITH265_tree=null;
        Object LPAREN266_tree=null;
        Object RPAREN268_tree=null;

        try {
            // JS.g:1610:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1610:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH265=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement5985); 
            WITH265_tree = (Object)adaptor.create(WITH265);
            root_0 = (Object)adaptor.becomeRoot(WITH265_tree, root_0);

            LPAREN266=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5988); 
            pushFollow(FOLLOW_expression_in_withStatement5991);
            expression267=expression();
            _fsp--;

            adaptor.addChild(root_0, expression267.getTree());
            RPAREN268=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5993); 
            pushFollow(FOLLOW_statement_in_withStatement5996);
            statement269=statement();
            _fsp--;

            adaptor.addChild(root_0, statement269.getTree());

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
    // JS.g:1617:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH270=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        Token LBRACE274=null;
        Token RBRACE277=null;
        expression_return expression272 = null;

        defaultClause_return defaultClause275 = null;

        caseClause_return caseClause276 = null;


        Object SWITCH270_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;
        Object LBRACE274_tree=null;
        Object RBRACE277_tree=null;
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
            // JS.g:1622:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // JS.g:1622:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH270=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6017); 
            stream_SWITCH.add(SWITCH270);

            LPAREN271=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6019); 
            stream_LPAREN.add(LPAREN271);

            pushFollow(FOLLOW_expression_in_switchStatement6021);
            expression272=expression();
            _fsp--;

            stream_expression.add(expression272.getTree());
            RPAREN273=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6023); 
            stream_RPAREN.add(RPAREN273);

            LBRACE274=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6025); 
            stream_LBRACE.add(LBRACE274);

            // JS.g:1622:43: ({...}? => defaultClause | caseClause )*
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
            	    // JS.g:1622:45: {...}? => defaultClause
            	    {
            	    if ( !( defaultClauseCount == 0 ) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6032);
            	    defaultClause275=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause275.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1622:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6038);
            	    caseClause276=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause276.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            RBRACE277=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6043); 
            stream_RBRACE.add(RBRACE277);


            // AST REWRITE
            // elements: caseClause, defaultClause, expression, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1623:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // JS.g:1623:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1623:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1623:41: ( caseClause )*
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
    // JS.g:1626:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE278=null;
        Token COLON280=null;
        expression_return expression279 = null;

        statement_return statement281 = null;


        Object CASE278_tree=null;
        Object COLON280_tree=null;

        try {
            // JS.g:1627:2: ( CASE expression COLON ( statement )* )
            // JS.g:1627:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE278=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6071); 
            CASE278_tree = (Object)adaptor.create(CASE278);
            root_0 = (Object)adaptor.becomeRoot(CASE278_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6074);
            expression279=expression();
            _fsp--;

            adaptor.addChild(root_0, expression279.getTree());
            COLON280=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6076); 
            // JS.g:1627:28: ( statement )*
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
                else if ( ((LA69_0>=NULL && LA69_0<=BREAK)||LA69_0==CONTINUE||(LA69_0>=DELETE && LA69_0<=DO)||LA69_0==FOR||(LA69_0>=FUNCTION && LA69_0<=IF)||(LA69_0>=NEW && LA69_0<=WITH)||LA69_0==YIELD||LA69_0==CONST||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||LA69_0==SEMIC||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||(LA69_0>=Identifier && LA69_0<=XmlAttribute)||LA69_0==RegularExpressionLiteral||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)||LA69_0==XMLLiteral) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // JS.g:1627:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6079);
            	    statement281=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement281.getTree());

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
    // JS.g:1630:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT282=null;
        Token COLON283=null;
        statement_return statement284 = null;


        Object DEFAULT282_tree=null;
        Object COLON283_tree=null;

        try {
            // JS.g:1631:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1631:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT282=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6092); 
            DEFAULT282_tree = (Object)adaptor.create(DEFAULT282);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT282_tree, root_0);

            COLON283=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6095); 
            // JS.g:1631:20: ( statement )*
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
                else if ( ((LA70_0>=NULL && LA70_0<=BREAK)||LA70_0==CONTINUE||(LA70_0>=DELETE && LA70_0<=DO)||LA70_0==FOR||(LA70_0>=FUNCTION && LA70_0<=IF)||(LA70_0>=NEW && LA70_0<=WITH)||LA70_0==YIELD||LA70_0==CONST||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||LA70_0==SEMIC||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||(LA70_0>=Identifier && LA70_0<=XmlAttribute)||LA70_0==RegularExpressionLiteral||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)||LA70_0==XMLLiteral) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // JS.g:1631:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6098);
            	    statement284=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement284.getTree());

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
    // JS.g:1638:1: labelledStatement : Identifier COLON statement -> ^( LABELLED Identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier285=null;
        Token COLON286=null;
        statement_return statement287 = null;


        Object Identifier285_tree=null;
        Object COLON286_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1639:2: ( Identifier COLON statement -> ^( LABELLED Identifier statement ) )
            // JS.g:1639:4: Identifier COLON statement
            {
            Identifier285=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_labelledStatement6115); 
            stream_Identifier.add(Identifier285);

            COLON286=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6117); 
            stream_COLON.add(COLON286);

            pushFollow(FOLLOW_statement_in_labelledStatement6119);
            statement287=statement();
            _fsp--;

            stream_statement.add(statement287.getTree());

            // AST REWRITE
            // elements: statement, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1640:2: -> ^( LABELLED Identifier statement )
            {
                // JS.g:1640:5: ^( LABELLED Identifier statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(LABELLED, "LABELLED"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
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
    // JS.g:1662:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW288=null;
        expression_return expression289 = null;

        semic_return semic290 = null;


        Object THROW288_tree=null;

        try {
            // JS.g:1663:2: ( THROW expression semic )
            // JS.g:1663:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW288=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6150); 
            THROW288_tree = (Object)adaptor.create(THROW288);
            root_0 = (Object)adaptor.becomeRoot(THROW288_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6155);
            expression289=expression();
            _fsp--;

            adaptor.addChild(root_0, expression289.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6157);
            semic290=semic();
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
    // JS.g:1670:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY291=null;
        block_return block292 = null;

        catchClause_return catchClause293 = null;

        finallyClause_return finallyClause294 = null;

        finallyClause_return finallyClause295 = null;


        Object TRY291_tree=null;

        try {
            // JS.g:1671:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1671:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY291=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6174); 
            TRY291_tree = (Object)adaptor.create(TRY291);
            root_0 = (Object)adaptor.becomeRoot(TRY291_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6177);
            block292=block();
            _fsp--;

            adaptor.addChild(root_0, block292.getTree());
            // JS.g:1671:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
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
                    new NoViableAltException("1671:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // JS.g:1671:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1671:17: ( catchClause )+
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
                    	    // JS.g:1671:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6181);
                    	    catchClause293=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause293.getTree());

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

                    // JS.g:1671:30: ( finallyClause )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==FINALLY) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // JS.g:1671:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6184);
                            finallyClause294=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause294.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1671:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6189);
                    finallyClause295=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause295.getTree());

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
    // JS.g:1674:1: catchClause : CATCH LPAREN Identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH296=null;
        Token LPAREN297=null;
        Token Identifier298=null;
        Token RPAREN300=null;
        catchFilter_return catchFilter299 = null;

        block_return block301 = null;


        Object CATCH296_tree=null;
        Object LPAREN297_tree=null;
        Object Identifier298_tree=null;
        Object RPAREN300_tree=null;

        try {
            // JS.g:1675:2: ( CATCH LPAREN Identifier ( catchFilter )? RPAREN block )
            // JS.g:1675:4: CATCH LPAREN Identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH296=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6203); 
            CATCH296_tree = (Object)adaptor.create(CATCH296);
            root_0 = (Object)adaptor.becomeRoot(CATCH296_tree, root_0);

            LPAREN297=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6206); 
            Identifier298=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_catchClause6209); 
            Identifier298_tree = (Object)adaptor.create(Identifier298);
            adaptor.addChild(root_0, Identifier298_tree);

            // JS.g:1675:30: ( catchFilter )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==IF) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1675:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6211);
                    catchFilter299=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter299.getTree());

                    }
                    break;

            }

            RPAREN300=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6214); 
            pushFollow(FOLLOW_block_in_catchClause6217);
            block301=block();
            _fsp--;

            adaptor.addChild(root_0, block301.getTree());

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
    // JS.g:1678:1: catchFilter : IF instanceofExpression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF302=null;
        instanceofExpression_return instanceofExpression303 = null;


        Object IF302_tree=null;

        try {
            // JS.g:1679:3: ( IF instanceofExpression )
            // JS.g:1679:5: IF instanceofExpression
            {
            root_0 = (Object)adaptor.nil();

            IF302=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6230); 
            IF302_tree = (Object)adaptor.create(IF302);
            root_0 = (Object)adaptor.becomeRoot(IF302_tree, root_0);

            pushFollow(FOLLOW_instanceofExpression_in_catchFilter6233);
            instanceofExpression303=instanceofExpression();
            _fsp--;

            adaptor.addChild(root_0, instanceofExpression303.getTree());

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
    // JS.g:1682:1: instanceofExpression : Identifier INSTANCEOF Identifier ;
    public final instanceofExpression_return instanceofExpression() throws RecognitionException {
        instanceofExpression_return retval = new instanceofExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier304=null;
        Token INSTANCEOF305=null;
        Token Identifier306=null;

        Object Identifier304_tree=null;
        Object INSTANCEOF305_tree=null;
        Object Identifier306_tree=null;

        try {
            // JS.g:1683:3: ( Identifier INSTANCEOF Identifier )
            // JS.g:1683:5: Identifier INSTANCEOF Identifier
            {
            root_0 = (Object)adaptor.nil();

            Identifier304=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_instanceofExpression6248); 
            Identifier304_tree = (Object)adaptor.create(Identifier304);
            adaptor.addChild(root_0, Identifier304_tree);

            INSTANCEOF305=(Token)input.LT(1);
            match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceofExpression6250); 
            INSTANCEOF305_tree = (Object)adaptor.create(INSTANCEOF305);
            root_0 = (Object)adaptor.becomeRoot(INSTANCEOF305_tree, root_0);

            Identifier306=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_instanceofExpression6253); 
            Identifier306_tree = (Object)adaptor.create(Identifier306);
            adaptor.addChild(root_0, Identifier306_tree);


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
    // JS.g:1686:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY307=null;
        block_return block308 = null;


        Object FINALLY307_tree=null;

        try {
            // JS.g:1687:2: ( FINALLY block )
            // JS.g:1687:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY307=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6266); 
            FINALLY307_tree = (Object)adaptor.create(FINALLY307);
            root_0 = (Object)adaptor.becomeRoot(FINALLY307_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6269);
            block308=block();
            _fsp--;

            adaptor.addChild(root_0, block308.getTree());

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
    // JS.g:1700:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token FUNCTION309=null;
        formalParameterList_return formalParameterList310 = null;

        functionBody_return functionBody311 = null;


        Object name_tree=null;
        Object FUNCTION309_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1701:2: ( FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) )
            // JS.g:1701:4: FUNCTION name= Identifier formalParameterList functionBody
            {
            FUNCTION309=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6290); 
            stream_FUNCTION.add(FUNCTION309);

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration6294); 
            stream_Identifier.add(name);

            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6296);
            formalParameterList310=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList310.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6298);
            functionBody311=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody311.getTree());

            // AST REWRITE
            // elements: formalParameterList, FUNCTION, functionBody, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1702:2: -> ^( FUNCTION $name formalParameterList functionBody )
            {
                // JS.g:1702:5: ^( FUNCTION $name formalParameterList functionBody )
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
    // JS.g:1705:1: functionExpression : FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token FUNCTION312=null;
        formalParameterList_return formalParameterList313 = null;

        functionBody_return functionBody314 = null;


        Object name_tree=null;
        Object FUNCTION312_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1706:2: ( FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // JS.g:1706:4: FUNCTION (name= Identifier )? formalParameterList functionBody
            {
            FUNCTION312=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6325); 
            stream_FUNCTION.add(FUNCTION312);

            // JS.g:1706:17: (name= Identifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Identifier) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1706:17: name= Identifier
                    {
                    name=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_functionExpression6329); 
                    stream_Identifier.add(name);


                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6332);
            formalParameterList313=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList313.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6334);
            functionBody314=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody314.getTree());

            // AST REWRITE
            // elements: FUNCTION, name, formalParameterList, functionBody
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1707:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // JS.g:1707:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1707:17: ( $name)?
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
    // JS.g:1710:1: formalParameterList : LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN -> ^( ARGS ( $args)* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN315=null;
        Token COMMA316=null;
        Token RPAREN317=null;
        Token args=null;
        List list_args=null;

        Object LPAREN315_tree=null;
        Object COMMA316_tree=null;
        Object RPAREN317_tree=null;
        Object args_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // JS.g:1711:2: ( LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN -> ^( ARGS ( $args)* ) )
            // JS.g:1711:4: LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN
            {
            LPAREN315=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6362); 
            stream_LPAREN.add(LPAREN315);

            // JS.g:1711:11: (args+= Identifier ( COMMA args+= Identifier )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Identifier) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // JS.g:1711:13: args+= Identifier ( COMMA args+= Identifier )*
                    {
                    args=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList6368); 
                    stream_Identifier.add(args);

                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);

                    // JS.g:1711:30: ( COMMA args+= Identifier )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==COMMA) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // JS.g:1711:32: COMMA args+= Identifier
                    	    {
                    	    COMMA316=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6372); 
                    	    stream_COMMA.add(COMMA316);

                    	    args=(Token)input.LT(1);
                    	    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList6376); 
                    	    stream_Identifier.add(args);

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

            RPAREN317=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6384); 
            stream_RPAREN.add(RPAREN317);


            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: args
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_args=new RewriteRuleTokenStream(adaptor,"token args", list_args);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1712:2: -> ^( ARGS ( $args)* )
            {
                // JS.g:1712:5: ^( ARGS ( $args)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1712:13: ( $args)*
                while ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_args.next());

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
    // JS.g:1715:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE319=null;
        sourceElement_return sourceElement318 = null;


        Object lb_tree=null;
        Object RBRACE319_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // JS.g:1716:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1716:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6410); 
            stream_LBRACE.add(lb);

            // JS.g:1716:14: ( sourceElement )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=NULL && LA78_0<=BREAK)||(LA78_0>=CONTINUE && LA78_0<=DO)||LA78_0==FOR||(LA78_0>=FUNCTION && LA78_0<=IF)||(LA78_0>=NEW && LA78_0<=WITH)||LA78_0==YIELD||LA78_0==CONST||LA78_0==LBRACE||LA78_0==LPAREN||LA78_0==LBRACK||LA78_0==SEMIC||(LA78_0>=ADD && LA78_0<=SUB)||(LA78_0>=INC && LA78_0<=DEC)||(LA78_0>=NOT && LA78_0<=INV)||(LA78_0>=Identifier && LA78_0<=XmlAttribute)||LA78_0==RegularExpressionLiteral||(LA78_0>=DecimalLiteral && LA78_0<=HexIntegerLiteral)||LA78_0==XMLLiteral) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JS.g:1716:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6412);
            	    sourceElement318=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement318.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            RBRACE319=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6415); 
            stream_RBRACE.add(RBRACE319);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1717:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1717:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1717:28: ( sourceElement )*
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
    // JS.g:1725:1: getMethodDeclaration : GET name= Identifier LPAREN RPAREN functionBody ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token GET320=null;
        Token LPAREN321=null;
        Token RPAREN322=null;
        functionBody_return functionBody323 = null;


        Object name_tree=null;
        Object GET320_tree=null;
        Object LPAREN321_tree=null;
        Object RPAREN322_tree=null;

        try {
            // JS.g:1726:3: ( GET name= Identifier LPAREN RPAREN functionBody )
            // JS.g:1726:5: GET name= Identifier LPAREN RPAREN functionBody
            {
            root_0 = (Object)adaptor.nil();

            GET320=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6445); 
            GET320_tree = (Object)adaptor.create(GET320);
            root_0 = (Object)adaptor.becomeRoot(GET320_tree, root_0);

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_getMethodDeclaration6450); 
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);

            LPAREN321=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6452); 
            RPAREN322=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6455); 
            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6458);
            functionBody323=functionBody();
            _fsp--;

            adaptor.addChild(root_0, functionBody323.getTree());

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
    // JS.g:1729:1: setMethodDeclaration : SET name= Identifier LPAREN Identifier RPAREN functionBody ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token SET324=null;
        Token LPAREN325=null;
        Token Identifier326=null;
        Token RPAREN327=null;
        functionBody_return functionBody328 = null;


        Object name_tree=null;
        Object SET324_tree=null;
        Object LPAREN325_tree=null;
        Object Identifier326_tree=null;
        Object RPAREN327_tree=null;

        try {
            // JS.g:1730:3: ( SET name= Identifier LPAREN Identifier RPAREN functionBody )
            // JS.g:1730:5: SET name= Identifier LPAREN Identifier RPAREN functionBody
            {
            root_0 = (Object)adaptor.nil();

            SET324=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6473); 
            SET324_tree = (Object)adaptor.create(SET324);
            root_0 = (Object)adaptor.becomeRoot(SET324_tree, root_0);

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_setMethodDeclaration6478); 
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);

            LPAREN325=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6480); 
            Identifier326=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_setMethodDeclaration6483); 
            Identifier326_tree = (Object)adaptor.create(Identifier326);
            adaptor.addChild(root_0, Identifier326_tree);

            RPAREN327=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6485); 
            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6488);
            functionBody328=functionBody();
            _fsp--;

            adaptor.addChild(root_0, functionBody328.getTree());

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
    // JS.g:1737:1: program : ( sourceElement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF330=null;
        sourceElement_return sourceElement329 = null;


        Object EOF330_tree=null;

        try {
            // JS.g:1738:2: ( ( sourceElement )* EOF )
            // JS.g:1738:4: ( sourceElement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // JS.g:1738:4: ( sourceElement )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=NULL && LA79_0<=BREAK)||(LA79_0>=CONTINUE && LA79_0<=DO)||LA79_0==FOR||(LA79_0>=FUNCTION && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=WITH)||LA79_0==YIELD||LA79_0==CONST||LA79_0==LBRACE||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||(LA79_0>=Identifier && LA79_0<=XmlAttribute)||LA79_0==RegularExpressionLiteral||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)||LA79_0==XMLLiteral) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JS.g:1738:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6505);
            	    sourceElement329=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement329.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            EOF330=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program6508); 

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
    // JS.g:1746:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration331 = null;

        statement_return statement332 = null;



        try {
            // JS.g:1751:2: ({...}? functionDeclaration | statement )
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
                        new NoViableAltException("1746:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 80, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA80_0>=NULL && LA80_0<=BREAK)||(LA80_0>=CONTINUE && LA80_0<=DO)||LA80_0==FOR||LA80_0==IF||(LA80_0>=NEW && LA80_0<=WITH)||LA80_0==YIELD||LA80_0==CONST||LA80_0==LBRACE||LA80_0==LPAREN||LA80_0==LBRACK||LA80_0==SEMIC||(LA80_0>=ADD && LA80_0<=SUB)||(LA80_0>=INC && LA80_0<=DEC)||(LA80_0>=NOT && LA80_0<=INV)||(LA80_0>=Identifier && LA80_0<=XmlAttribute)||LA80_0==RegularExpressionLiteral||(LA80_0>=DecimalLiteral && LA80_0<=HexIntegerLiteral)||LA80_0==XMLLiteral) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1746:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // JS.g:1751:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6537);
                    functionDeclaration331=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration331.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1752:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6542);
                    statement332=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement332.getTree());

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
    public static final BitSet FOLLOW_Identifier_in_token1954 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_primaryExpression3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3467 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parenExpression3469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3496 = new BitSet(new long[]{0x0000000852441070L,0x0000001819804D40L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3504 = new BitSet(new long[]{0x0000000852441070L,0x0000001819804D40L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3574 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000080L,0x00E0070000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3582 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0x00E0070000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3643 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3645 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_propertyName3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_propertyName3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3725 = new BitSet(new long[]{0x0000000002000070L,0x0000000000000540L,0x00E2070000000000L});
    public static final BitSet FOLLOW_primaryExpression_in_newExpression3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3741 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800740L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_COMMA_in_arguments3749 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3792 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3813 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3838 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3842 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000100L,0x0000050000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression3866 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression3887 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3889 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression3908 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3910 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rightHandSideExpression3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_rightHandSideExpression3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3996 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4051 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLLiteral_in_unaryExpression4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4161 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4163 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4165 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4187 = new BitSet(new long[]{0x0000000000000002L,0x0010000006000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4191 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4206 = new BitSet(new long[]{0x0000000000000002L,0x0010000006000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4224 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4228 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4239 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4258 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4262 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4277 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4296 = new BitSet(new long[]{0x0000000000300002L,0x0000000000078000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4300 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4327 = new BitSet(new long[]{0x0000000000300002L,0x0000000000078000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4341 = new BitSet(new long[]{0x0000000000200002L,0x0000000000078000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4345 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4368 = new BitSet(new long[]{0x0000000000200002L,0x0000000000078000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4391 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4428 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4467 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4471 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4474 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4488 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4492 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4495 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4511 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4515 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4518 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4534 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4538 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4541 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4556 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4560 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4563 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4578 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4582 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4585 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4604 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4608 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4611 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4625 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4629 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4632 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4647 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4651 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4654 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4669 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4673 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4676 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4695 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4699 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4702 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4704 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4721 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4725 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4728 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4730 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4761 = new BitSet(new long[]{0x0000000000000002L,0x002FFE0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4768 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4849 = new BitSet(new long[]{0x0000000000000002L,0x002FFE0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4856 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4881 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expression4885 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4926 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn4930 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMIC_in_semic4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5137 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x00000018198025C0L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block5139 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x00000018198025C0L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_block5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration5207 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5211 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn5229 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5233 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5335 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_ifStatement5337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5339 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_ifStatement5341 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5347 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_ifStatement5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5409 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_doStatement5411 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5415 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_doStatement5417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5449 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_whileStatement5452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5454 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_whileStatement5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5472 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5478 = new BitSet(new long[]{0x0000000872441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5483 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5520 = new BitSet(new long[]{0x0000000872441070L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forControl_in_forStatement5523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5525 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_forStatement5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5562 = new BitSet(new long[]{0x0000000000100000L,0x0000000000006000L});
    public static final BitSet FOLLOW_IN_in_forControlVar5574 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlVar5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5629 = new BitSet(new long[]{0x0000000852441070L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlVar5633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5636 = new BitSet(new long[]{0x0000000852441072L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlVar5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5706 = new BitSet(new long[]{0x0000000000100000L,0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5721 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5771 = new BitSet(new long[]{0x0000000852441070L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5778 = new BitSet(new long[]{0x0000000852441072L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5841 = new BitSet(new long[]{0x0000000852441070L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5848 = new BitSet(new long[]{0x0000000852441072L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement5906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000016000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement5911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement5933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000016000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement5960 = new BitSet(new long[]{0x0000000852441070L,0x00000018198025C0L,0x00E2076000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_returnStatement5965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement5985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement5988 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_withStatement5991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement5993 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_withStatement5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6019 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_switchStatement6021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6025 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6032 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6038 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6071 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_caseClause6074 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6076 = new BitSet(new long[]{0x00001009FFCD3CF2L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_caseClause6079 = new BitSet(new long[]{0x00001009FFCD3CF2L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6092 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6095 = new BitSet(new long[]{0x00001009FFCD3CF2L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_defaultClause6098 = new BitSet(new long[]{0x00001009FFCD3CF2L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement6115 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6117 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6150 = new BitSet(new long[]{0x0000000852441070L,0x0000001819800540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_throwStatement6155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x0000006000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_tryStatement6177 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6181 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause6209 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_catchClause6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_instanceofExpression_in_catchFilter6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_instanceofExpression6248 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression6250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_instanceofExpression6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_finallyClause6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration6294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression6329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList6368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList6376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6410 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x00000018198025C0L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6412 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x00000018198025C0L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_getMethodDeclaration6450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_setMethodDeclaration6478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_setMethodDeclaration6483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6505 = new BitSet(new long[]{0x00001009FFCD3CF0L,0x0000001819802540L,0x00E2070000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_program6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6542 = new BitSet(new long[]{0x0000000000000002L});

}
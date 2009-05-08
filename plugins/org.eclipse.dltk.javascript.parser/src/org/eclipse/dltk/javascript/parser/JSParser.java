// $ANTLR 3.0.1 /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g 2009-05-08 16:13:00

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "CDATA", "WXML", "NAMESPACE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "XCOPEN", "XCCLOSE", "XLCLOSE", "XRCLOSE", "CDATAOPEN", "XHOPEN", "XHCLOSE", "AT", "DOTDOT", "COLONCOLON", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XML", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "Identifier", "StringLiteral", "XmlAttribute", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "PropertyIdentifierSymbols", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar", "XMLLiteral"
    };
    public static final int PACKAGE=55;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=153;
    public static final int RegularExpressionChar=191;
    public static final int CDATA=66;
    public static final int XRCLOSE=120;
    public static final int LOCALNAME=133;
    public static final int MOD=89;
    public static final int SHL=92;
    public static final int CONST=40;
    public static final int XHOPEN=122;
    public static final int DO=13;
    public static final int DQUOTE=150;
    public static final int NOT=98;
    public static final int EOF=-1;
    public static final int CEXPR=135;
    public static final int DIVASS=116;
    public static final int BYINDEX=131;
    public static final int INC=90;
    public static final int RPAREN=72;
    public static final int FINAL=46;
    public static final int FORSTEP=138;
    public static final int IMPORT=50;
    public static final int EOL=164;
    public static final int XLCLOSE=119;
    public static final int PropertyIdentifierSymbols=175;
    public static final int OctalDigit=177;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int ARGS=127;
    public static final int GET=33;
    public static final int WhiteSpace=158;
    public static final int EXPORT=44;
    public static final int EQ=82;
    public static final int GOTO=48;
    public static final int XORASS=114;
    public static final int SHU=94;
    public static final int RBRACK=74;
    public static final int RBRACE=70;
    public static final int STATIC=60;
    public static final int INV=99;
    public static final int ELSE=14;
    public static final int NATIVE=54;
    public static final int INT=51;
    public static final int FF=154;
    public static final int OctalEscapeSequence=185;
    public static final int RegularExpressionFirstChar=190;
    public static final int TYPEOF=28;
    public static final int GT=79;
    public static final int CALL=134;
    public static final int CharacterEscapeSequence=183;
    public static final int LAND=100;
    public static final int XML=148;
    public static final int PINC=146;
    public static final int PROTECTED=57;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int SUB=87;
    public static final int RegularExpressionLiteral=176;
    public static final int FLOAT=47;
    public static final int DecimalIntegerLiteral=179;
    public static final int HexDigit=170;
    public static final int LPAREN=71;
    public static final int AT=124;
    public static final int IMPLEMENTS=49;
    public static final int CDATAOPEN=121;
    public static final int XCCLOSE=118;
    public static final int SHRASS=110;
    public static final int PS=162;
    public static final int MultiLineComment=165;
    public static final int ADD=86;
    public static final int ZeroToThree=184;
    public static final int ITEM=139;
    public static final int XMLLiteral=192;
    public static final int UnicodeEscapeSequence=187;
    public static final int SHUASS=111;
    public static final int SHORT=59;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=151;
    public static final int SAME=84;
    public static final int XHCLOSE=123;
    public static final int COLON=103;
    public static final int StringLiteral=168;
    public static final int PAREXPR=144;
    public static final int ENUM=43;
    public static final int NBSP=156;
    public static final int HexIntegerLiteral=182;
    public static final int SP=155;
    public static final int BLOCK=129;
    public static final int LineTerminator=163;
    public static final int INTERFACE=52;
    public static final int DIV=115;
    public static final int LONG=53;
    public static final int CR=160;
    public static final int PUBLIC=58;
    public static final int LOR=101;
    public static final int LT=78;
    public static final int WHILE=31;
    public static final int BackslashSequence=189;
    public static final int LS=161;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=38;
    public static final int DecimalDigit=172;
    public static final int BYFIELD=130;
    public static final int BREAK=7;
    public static final int Identifier=167;
    public static final int WXML=67;
    public static final int POS=147;
    public static final int DOUBLE=42;
    public static final int ExponentPart=178;
    public static final int VAR=29;
    public static final int VOID=30;
    public static final int SUPER=61;
    public static final int EACH=17;
    public static final int LABELLED=140;
    public static final int ADDASS=105;
    public static final int ARRAY=128;
    public static final int PRIVATE=56;
    public static final int SWITCH=24;
    public static final int NULL=4;
    public static final int THROWS=63;
    public static final int DELETE=12;
    public static final int XCOPEN=117;
    public static final int MUL=88;
    public static final int IdentifierStartASCII=171;
    public static final int TRY=27;
    public static final int NAMESPACE=68;
    public static final int SHLASS=109;
    public static final int COLONCOLON=126;
    public static final int USP=157;
    public static final int ANDASS=112;
    public static final int IdentifierNameASCIIStart=174;
    public static final int QUE=102;
    public static final int OR=96;
    public static final int DEBUGGER=41;
    public static final int PDEC=145;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=188;
    public static final int THROW=26;
    public static final int MULASS=107;
    public static final int XmlAttribute=169;
    public static final int DEC=91;
    public static final int OctalIntegerLiteral=181;
    public static final int CLASS=39;
    public static final int ORASS=113;
    public static final int HexEscapeSequence=186;
    public static final int NAMEDVALUE=141;
    public static final int SingleLineComment=166;
    public static final int GTE=81;
    public static final int FOR=16;
    public static final int DOTDOT=125;
    public static final int ABSTRACT=35;
    public static final int AND=95;
    public static final int LTE=80;
    public static final int IF=19;
    public static final int SUBASS=106;
    public static final int SYNCHRONIZED=62;
    public static final int BOOLEAN=36;
    public static final int EXPR=136;
    public static final int IN=20;
    public static final int CONTINUE=10;
    public static final int OBJECT=143;
    public static final int COMMA=77;
    public static final int TRANSIENT=64;
    public static final int FORITER=137;
    public static final int MODASS=108;
    public static final int DOT=75;
    public static final int IdentifierPart=173;
    public static final int WITH=32;
    public static final int BYTE=37;
    public static final int XOR=97;
    public static final int VOLATILE=65;
    public static final int NSAME=85;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=132;
    public static final int TAB=152;
    public static final int DecimalLiteral=180;
    public static final int TRUE=5;
    public static final int NEQ=83;
    public static final int FINALLY=15;
    public static final int NEG=142;
    public static final int ASSIGN=104;
    public static final int SEMIC=76;
    public static final int EXTENDS=45;
    public static final int BSLASH=149;
    public static final int LF=159;

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
    public String getGrammarFileName() { return "/home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g"; }


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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:580:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:581:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute )
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
            case NAMESPACE:
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
                    new NoViableAltException("580:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:581:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1935);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:582:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier2=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_token1940); 
                    Identifier2_tree = (Object)adaptor.create(Identifier2);
                    adaptor.addChild(root_0, Identifier2_tree);


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:583:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1945);
                    punctuator3=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:584:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1950);
                    numericLiteral4=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:585:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral5=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1955); 
                    StringLiteral5_tree = (Object)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;
                case 6 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:586:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute6=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_token1960); 
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:592:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:593:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
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
                    new NoViableAltException("592:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:593:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1975);
                    keyword7=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword7.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:594:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1980);
                    futureReservedWord8=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord8.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:595:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL9=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord1985); 
                    NULL9_tree = (Object)adaptor.create(NULL9);
                    adaptor.addChild(root_0, NULL9_tree);


                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:596:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord1990);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:603:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | XML );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:604:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | XML )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=SET)||input.LA(1)==NAMESPACE||input.LA(1)==XML ) {
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:640:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:641:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:726:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:727:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:784:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:785:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
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
                    new NoViableAltException("784:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:785:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL14=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2738); 
                    NULL14_tree = (Object)adaptor.create(NULL14);
                    adaptor.addChild(root_0, NULL14_tree);


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:786:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2743);
                    booleanLiteral15=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral15.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:787:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2748);
                    numericLiteral16=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral16.getTree());

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:788:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral17=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2753); 
                    StringLiteral17_tree = (Object)adaptor.create(StringLiteral17);
                    adaptor.addChild(root_0, StringLiteral17_tree);


                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:789:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral18=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2758); 
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:792:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:793:2: ( TRUE | FALSE )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:839:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:840:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:928:1: primaryExpression : ( THIS | Identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:929:2: ( THIS | Identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
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
                    new NoViableAltException("928:1: primaryExpression : ( THIS | Identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:929:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS21=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3373); 
                    THIS21_tree = (Object)adaptor.create(THIS21);
                    adaptor.addChild(root_0, THIS21_tree);


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:930:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier22=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3378); 
                    Identifier22_tree = (Object)adaptor.create(Identifier22);
                    adaptor.addChild(root_0, Identifier22_tree);


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:931:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute23=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_primaryExpression3383); 
                    XmlAttribute23_tree = (Object)adaptor.create(XmlAttribute23);
                    adaptor.addChild(root_0, XmlAttribute23_tree);


                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:932:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3388);
                    literal24=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal24.getTree());

                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:933:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3393);
                    arrayLiteral25=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral25.getTree());

                    }
                    break;
                case 6 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:934:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3398);
                    objectLiteral26=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral26.getTree());

                    }
                    break;
                case 7 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:935:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3403);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:938:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:939:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:939:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3419); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3421);
            expression28=expression();
            _fsp--;

            stream_expression.add(expression28.getTree());
            RPAREN29=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3423); 
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
            // 939:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:939:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:942:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:943:2: (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:943:4: lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3448); 
            stream_LBRACK.add(lb);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:943:14: ( arrayItem ( COMMA arrayItem )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==DELETE||LA6_0==FUNCTION||LA6_0==NEW||LA6_0==THIS||LA6_0==TYPEOF||LA6_0==VOID||LA6_0==LBRACE||LA6_0==LPAREN||LA6_0==LBRACK||LA6_0==COMMA||(LA6_0>=ADD && LA6_0<=SUB)||(LA6_0>=INC && LA6_0<=DEC)||(LA6_0>=NOT && LA6_0<=INV)||(LA6_0>=Identifier && LA6_0<=XmlAttribute)||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)||LA6_0==XMLLiteral) ) {
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:943:16: arrayItem ( COMMA arrayItem )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3452);
                    arrayItem30=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem30.getTree());
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:943:26: ( COMMA arrayItem )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:943:28: COMMA arrayItem
                    	    {
                    	    COMMA31=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3456); 
                    	    stream_COMMA.add(COMMA31);

                    	    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3458);
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
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3466); 
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
            // 944:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:944:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:944:28: ( arrayItem )*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:947:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:948:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:948:4: (expr= assignmentExpression | {...}?)
            {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:948:4: (expr= assignmentExpression | {...}?)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=Identifier && LA7_0<=XmlAttribute)||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)||LA7_0==XMLLiteral) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK||LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("948:4: (expr= assignmentExpression | {...}?)", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:948:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3494);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:948:34: {...}?
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
            // 949:2: -> ^( ITEM ( $expr)? )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:949:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:949:13: ( $expr)?
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:952:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) ;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:953:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:953:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3526); 
            stream_LBRACE.add(lb);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:953:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=GET && LA9_0<=SET)||(LA9_0>=Identifier && LA9_0<=XmlAttribute)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:953:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )*
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3530);
                    objectPropertyInitializer34=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer34.getTree());
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:953:42: ( COMMA objectPropertyInitializer )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:953:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA35=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3534); 
                    	    stream_COMMA.add(COMMA35);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3536);
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
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3544); 
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
            // 954:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:954:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:954:30: ( objectPropertyInitializer )*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:957:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair38 = null;

        getMethodDeclaration_return getMethodDeclaration39 = null;

        setMethodDeclaration_return setMethodDeclaration40 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:958:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
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
                    new NoViableAltException("957:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:958:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3569);
                    nameValuePair38=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair38.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:959:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3576);
                    getMethodDeclaration39=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration39.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:960:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3582);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:963:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:964:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:964:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3595);
            propertyName41=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName41.getTree());
            COLON42=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3597); 
            stream_COLON.add(COLON42);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3599);
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
            // 965:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:965:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:968:1: propertyName : ( Identifier | StringLiteral | numericLiteral | XmlAttribute );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:969:2: ( Identifier | StringLiteral | numericLiteral | XmlAttribute )
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
                    new NoViableAltException("968:1: propertyName : ( Identifier | StringLiteral | numericLiteral | XmlAttribute );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:969:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier44=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_propertyName3623); 
                    Identifier44_tree = (Object)adaptor.create(Identifier44);
                    adaptor.addChild(root_0, Identifier44_tree);


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:970:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral45=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3628); 
                    StringLiteral45_tree = (Object)adaptor.create(StringLiteral45);
                    adaptor.addChild(root_0, StringLiteral45_tree);


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:971:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3633);
                    numericLiteral46=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral46.getTree());

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:972:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute47=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_propertyName3638); 
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:984:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression48 = null;

        functionExpression_return functionExpression49 = null;

        newExpression_return newExpression50 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:985:2: ( primaryExpression | functionExpression | newExpression )
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
                    new NoViableAltException("984:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:985:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3656);
                    primaryExpression48=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression48.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:986:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3661);
                    functionExpression49=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression49.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:987:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3666);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:990:1: newExpression : NEW primaryExpression ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW51=null;
        primaryExpression_return primaryExpression52 = null;


        Object NEW51_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:991:2: ( NEW primaryExpression )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:991:4: NEW primaryExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW51=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3677); 
            NEW51_tree = (Object)adaptor.create(NEW51);
            root_0 = (Object)adaptor.becomeRoot(NEW51_tree, root_0);

            pushFollow(FOLLOW_primaryExpression_in_newExpression3680);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:995:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:996:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:996:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN53=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3693); 
            stream_LPAREN.add(LPAREN53);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:996:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=NULL && LA14_0<=FALSE)||LA14_0==DELETE||LA14_0==FUNCTION||LA14_0==NEW||LA14_0==THIS||LA14_0==TYPEOF||LA14_0==VOID||LA14_0==LBRACE||LA14_0==LPAREN||LA14_0==LBRACK||(LA14_0>=ADD && LA14_0<=SUB)||(LA14_0>=INC && LA14_0<=DEC)||(LA14_0>=NOT && LA14_0<=INV)||(LA14_0>=Identifier && LA14_0<=XmlAttribute)||LA14_0==RegularExpressionLiteral||(LA14_0>=DecimalLiteral && LA14_0<=HexIntegerLiteral)||LA14_0==XMLLiteral) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:996:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3697);
                    assignmentExpression54=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression54.getTree());
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:996:34: ( COMMA assignmentExpression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:996:36: COMMA assignmentExpression
                    	    {
                    	    COMMA55=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments3701); 
                    	    stream_COMMA.add(COMMA55);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3703);
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
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments3711); 
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
            // 997:2: -> ^( ARGS ( assignmentExpression )* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:997:5: ^( ARGS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:997:13: ( assignmentExpression )*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1000:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1001:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1002:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1002:3: ( memberExpression -> memberExpression )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1003:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3744);
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
            // 1003:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1005:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1006:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3765);
            	    arguments59=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments59.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1006:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1006:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1007:7: LBRACK expression RBRACK
            	    {
            	    LBRACK60=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3790); 
            	    stream_LBRACK.add(LBRACK60);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3792);
            	    expression61=expression();
            	    _fsp--;

            	    stream_expression.add(expression61.getTree());
            	    RBRACK62=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3794); 
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
            	    // 1007:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1007:36: ^( BYINDEX $leftHandSideExpression expression )
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1008:7: DOT rightHandSideExpression
            	    {
            	    DOT63=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3816); 
            	    stream_DOT.add(DOT63);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression3818);
            	    rightHandSideExpression64=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression64.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1008:35: -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1008:38: ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1009:7: DOTDOT expression
            	    {
            	    DOTDOT65=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression3839); 
            	    stream_DOTDOT.add(DOTDOT65);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3841);
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
            	    // 1009:25: -> ^( ALLCHILDREN $leftHandSideExpression expression )
            	    {
            	        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1009:28: ^( ALLCHILDREN $leftHandSideExpression expression )
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1010:7: COLONCOLON expression
            	    {
            	    COLONCOLON67=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression3860); 
            	    stream_COLONCOLON.add(COLONCOLON67);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3862);
            	    expression68=expression();
            	    _fsp--;

            	    stream_expression.add(expression68.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1010:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1010:32: ^( LOCALNAME $leftHandSideExpression expression )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1014:1: rightHandSideExpression : ( parenExpression | Identifier | XmlAttribute | MUL );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1015:3: ( parenExpression | Identifier | XmlAttribute | MUL )
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
                    new NoViableAltException("1014:1: rightHandSideExpression : ( parenExpression | Identifier | XmlAttribute | MUL );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1015:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression3891);
                    parenExpression69=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression69.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1016:5: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier70=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_rightHandSideExpression3898); 
                    Identifier70_tree = (Object)adaptor.create(Identifier70);
                    adaptor.addChild(root_0, Identifier70_tree);


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1017:5: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute71=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_rightHandSideExpression3904); 
                    XmlAttribute71_tree = (Object)adaptor.create(XmlAttribute71);
                    adaptor.addChild(root_0, XmlAttribute71_tree);


                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1018:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL72=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression3910); 
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1051:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression73 = null;

        postfixOperator_return postfixOperator74 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1052:2: ( leftHandSideExpression ( postfixOperator )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1052:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3948);
            leftHandSideExpression73=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression73.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1052:95: ( postfixOperator )?
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1052:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression3954);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1055:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1056:2: (op= INC | op= DEC )
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
                    new NoViableAltException("1055:1: postfixOperator : (op= INC | op= DEC );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1056:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator3972); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1057:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator3981); 
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1064:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1065:2: ( postfixExpression | unaryOperator unaryExpression | XMLLiteral )
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
                    new NoViableAltException("1064:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1065:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3998);
                    postfixExpression75=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression75.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1066:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4003);
                    unaryOperator76=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator76.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4006);
                    unaryExpression77=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression77.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1067:5: XMLLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLLiteral78=(Token)input.LT(1);
                    match(input,XMLLiteral,FOLLOW_XMLLiteral_in_unaryExpression4012); 
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1070:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT );
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

        Object op_tree=null;
        Object DELETE79_tree=null;
        Object VOID80_tree=null;
        Object TYPEOF81_tree=null;
        Object INC82_tree=null;
        Object DEC83_tree=null;
        Object INV84_tree=null;
        Object NOT85_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1071:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT )
            int alt20=9;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1070:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1071:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE79=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4024); 
                    DELETE79_tree = (Object)adaptor.create(DELETE79);
                    adaptor.addChild(root_0, DELETE79_tree);


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1072:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID80=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4029); 
                    VOID80_tree = (Object)adaptor.create(VOID80);
                    adaptor.addChild(root_0, VOID80_tree);


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1073:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF81=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4034); 
                    TYPEOF81_tree = (Object)adaptor.create(TYPEOF81);
                    adaptor.addChild(root_0, TYPEOF81_tree);


                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1074:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC82=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4039); 
                    INC82_tree = (Object)adaptor.create(INC82);
                    adaptor.addChild(root_0, INC82_tree);


                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1075:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC83=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4044); 
                    DEC83_tree = (Object)adaptor.create(DEC83);
                    adaptor.addChild(root_0, DEC83_tree);


                    }
                    break;
                case 6 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1076:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4051); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1077:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4060); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1078:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV84=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4067); 
                    INV84_tree = (Object)adaptor.create(INV84);
                    adaptor.addChild(root_0, INV84_tree);


                    }
                    break;
                case 9 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1079:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT85=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4072); 
                    NOT85_tree = (Object)adaptor.create(NOT85);
                    adaptor.addChild(root_0, NOT85_tree);


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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1106:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT86=null;
        Token WXML87=null;
        Token NAMESPACE88=null;
        Token ASSIGN89=null;
        Token StringLiteral90=null;
        semic_return semic91 = null;


        Object DEFAULT86_tree=null;
        Object WXML87_tree=null;
        Object NAMESPACE88_tree=null;
        Object ASSIGN89_tree=null;
        Object StringLiteral90_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1107:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1107:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT86=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4108); 
            DEFAULT86_tree = (Object)adaptor.create(DEFAULT86);
            adaptor.addChild(root_0, DEFAULT86_tree);

            WXML87=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4110); 
            WXML87_tree = (Object)adaptor.create(WXML87);
            adaptor.addChild(root_0, WXML87_tree);

            NAMESPACE88=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4112); 
            NAMESPACE88_tree = (Object)adaptor.create(NAMESPACE88);
            root_0 = (Object)adaptor.becomeRoot(NAMESPACE88_tree, root_0);

            ASSIGN89=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4115); 
            ASSIGN89_tree = (Object)adaptor.create(ASSIGN89);
            adaptor.addChild(root_0, ASSIGN89_tree);

            StringLiteral90=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4117); 
            StringLiteral90_tree = (Object)adaptor.create(StringLiteral90);
            adaptor.addChild(root_0, StringLiteral90_tree);

            pushFollow(FOLLOW_semic_in_namespaceStatement4119);
            semic91=semic();
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1112:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set93=null;
        unaryExpression_return unaryExpression92 = null;

        unaryExpression_return unaryExpression94 = null;


        Object set93_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1113:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1113:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4134);
            unaryExpression92=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression92.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1113:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=MUL && LA21_0<=MOD)||LA21_0==DIV) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1113:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set93=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set93), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4138);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4153);
            	    unaryExpression94=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression94.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1120:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set96=null;
        multiplicativeExpression_return multiplicativeExpression95 = null;

        multiplicativeExpression_return multiplicativeExpression97 = null;


        Object set96_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1121:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1121:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4171);
            multiplicativeExpression95=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression95.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1121:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=ADD && LA22_0<=SUB)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1121:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set96=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set96), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4175);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4186);
            	    multiplicativeExpression97=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression97.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1128:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set99=null;
        additiveExpression_return additiveExpression98 = null;

        additiveExpression_return additiveExpression100 = null;


        Object set99_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1129:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1129:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4205);
            additiveExpression98=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression98.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1129:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=SHL && LA23_0<=SHU)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1129:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set99=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set99), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4209);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4224);
            	    additiveExpression100=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression100.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1136:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set102=null;
        shiftExpression_return shiftExpression101 = null;

        shiftExpression_return shiftExpression103 = null;


        Object set102_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1137:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1137:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4243);
            shiftExpression101=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression101.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1137:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1137:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set102=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set102), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4247);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4274);
            	    shiftExpression103=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression103.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1140:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set105=null;
        shiftExpression_return shiftExpression104 = null;

        shiftExpression_return shiftExpression106 = null;


        Object set105_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1141:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1141:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4288);
            shiftExpression104=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression104.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1141:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==INSTANCEOF||(LA25_0>=LT && LA25_0<=GTE)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1141:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set105=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set105), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4292);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4315);
            	    shiftExpression106=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression106.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1148:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set108=null;
        relationalExpression_return relationalExpression107 = null;

        relationalExpression_return relationalExpression109 = null;


        Object set108_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1149:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1149:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4334);
            relationalExpression107=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression107.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1149:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=EQ && LA26_0<=NSAME)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1149:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set108=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set108), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4338);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4357);
            	    relationalExpression109=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression109.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1152:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set111=null;
        relationalExpressionNoIn_return relationalExpressionNoIn110 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn112 = null;


        Object set111_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1153:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1153:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4371);
            relationalExpressionNoIn110=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn110.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1153:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=EQ && LA27_0<=NSAME)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1153:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set111=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set111), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4375);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4394);
            	    relationalExpressionNoIn112=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn112.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1160:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND114=null;
        equalityExpression_return equalityExpression113 = null;

        equalityExpression_return equalityExpression115 = null;


        Object AND114_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1161:2: ( equalityExpression ( AND equalityExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1161:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4414);
            equalityExpression113=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression113.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1161:23: ( AND equalityExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1161:25: AND equalityExpression
            	    {
            	    AND114=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4418); 
            	    AND114_tree = (Object)adaptor.create(AND114);
            	    root_0 = (Object)adaptor.becomeRoot(AND114_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4421);
            	    equalityExpression115=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression115.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1164:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND117=null;
        equalityExpressionNoIn_return equalityExpressionNoIn116 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn118 = null;


        Object AND117_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1165:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1165:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4435);
            equalityExpressionNoIn116=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn116.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1165:27: ( AND equalityExpressionNoIn )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1165:29: AND equalityExpressionNoIn
            	    {
            	    AND117=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4439); 
            	    AND117_tree = (Object)adaptor.create(AND117);
            	    root_0 = (Object)adaptor.becomeRoot(AND117_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4442);
            	    equalityExpressionNoIn118=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn118.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1168:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR120=null;
        bitwiseANDExpression_return bitwiseANDExpression119 = null;

        bitwiseANDExpression_return bitwiseANDExpression121 = null;


        Object XOR120_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1169:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1169:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4458);
            bitwiseANDExpression119=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression119.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1169:25: ( XOR bitwiseANDExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==XOR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1169:27: XOR bitwiseANDExpression
            	    {
            	    XOR120=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4462); 
            	    XOR120_tree = (Object)adaptor.create(XOR120);
            	    root_0 = (Object)adaptor.becomeRoot(XOR120_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4465);
            	    bitwiseANDExpression121=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression121.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1172:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR123=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn122 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn124 = null;


        Object XOR123_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1173:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1173:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4481);
            bitwiseANDExpressionNoIn122=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn122.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1173:29: ( XOR bitwiseANDExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==XOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1173:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR123=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4485); 
            	    XOR123_tree = (Object)adaptor.create(XOR123);
            	    root_0 = (Object)adaptor.becomeRoot(XOR123_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4488);
            	    bitwiseANDExpressionNoIn124=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn124.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1176:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR126=null;
        bitwiseXORExpression_return bitwiseXORExpression125 = null;

        bitwiseXORExpression_return bitwiseXORExpression127 = null;


        Object OR126_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1177:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1177:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4503);
            bitwiseXORExpression125=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression125.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1177:25: ( OR bitwiseXORExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1177:27: OR bitwiseXORExpression
            	    {
            	    OR126=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4507); 
            	    OR126_tree = (Object)adaptor.create(OR126);
            	    root_0 = (Object)adaptor.becomeRoot(OR126_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4510);
            	    bitwiseXORExpression127=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression127.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1180:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR129=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn128 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn130 = null;


        Object OR129_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1181:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1181:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4525);
            bitwiseXORExpressionNoIn128=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn128.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1181:29: ( OR bitwiseXORExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==OR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1181:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR129=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4529); 
            	    OR129_tree = (Object)adaptor.create(OR129);
            	    root_0 = (Object)adaptor.becomeRoot(OR129_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4532);
            	    bitwiseXORExpressionNoIn130=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn130.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1188:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND132=null;
        bitwiseORExpression_return bitwiseORExpression131 = null;

        bitwiseORExpression_return bitwiseORExpression133 = null;


        Object LAND132_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4551);
            bitwiseORExpression131=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression131.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:24: ( LAND bitwiseORExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LAND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:26: LAND bitwiseORExpression
            	    {
            	    LAND132=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4555); 
            	    LAND132_tree = (Object)adaptor.create(LAND132);
            	    root_0 = (Object)adaptor.becomeRoot(LAND132_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4558);
            	    bitwiseORExpression133=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression133.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1192:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND135=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn134 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn136 = null;


        Object LAND135_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4572);
            bitwiseORExpressionNoIn134=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn134.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:28: ( LAND bitwiseORExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LAND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND135=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4576); 
            	    LAND135_tree = (Object)adaptor.create(LAND135);
            	    root_0 = (Object)adaptor.becomeRoot(LAND135_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4579);
            	    bitwiseORExpressionNoIn136=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn136.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1196:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR138=null;
        logicalANDExpression_return logicalANDExpression137 = null;

        logicalANDExpression_return logicalANDExpression139 = null;


        Object LOR138_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1197:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1197:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4594);
            logicalANDExpression137=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression137.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1197:25: ( LOR logicalANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1197:27: LOR logicalANDExpression
            	    {
            	    LOR138=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4598); 
            	    LOR138_tree = (Object)adaptor.create(LOR138);
            	    root_0 = (Object)adaptor.becomeRoot(LOR138_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4601);
            	    logicalANDExpression139=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression139.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1200:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR141=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn140 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn142 = null;


        Object LOR141_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1201:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1201:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4616);
            logicalANDExpressionNoIn140=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn140.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1201:29: ( LOR logicalANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1201:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR141=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4620); 
            	    LOR141_tree = (Object)adaptor.create(LOR141);
            	    root_0 = (Object)adaptor.becomeRoot(LOR141_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4623);
            	    logicalANDExpressionNoIn142=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn142.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1208:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE144=null;
        Token COLON146=null;
        logicalORExpression_return logicalORExpression143 = null;

        assignmentExpression_return assignmentExpression145 = null;

        assignmentExpression_return assignmentExpression147 = null;


        Object QUE144_tree=null;
        Object COLON146_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1209:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1209:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4642);
            logicalORExpression143=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression143.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1209:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==QUE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1209:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE144=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4646); 
                    QUE144_tree = (Object)adaptor.create(QUE144);
                    root_0 = (Object)adaptor.becomeRoot(QUE144_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4649);
                    assignmentExpression145=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression145.getTree());
                    COLON146=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4651); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4654);
                    assignmentExpression147=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression147.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1212:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE149=null;
        Token COLON151=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn148 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn150 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn152 = null;


        Object QUE149_tree=null;
        Object COLON151_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1213:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1213:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4668);
            logicalORExpressionNoIn148=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn148.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1213:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1213:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE149=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4672); 
                    QUE149_tree = (Object)adaptor.create(QUE149);
                    root_0 = (Object)adaptor.becomeRoot(QUE149_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4675);
                    assignmentExpressionNoIn150=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn150.getTree());
                    COLON151=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4677); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4680);
                    assignmentExpressionNoIn152=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn152.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1242:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator153 = null;

        assignmentExpression_return assignmentExpression154 = null;




        	Object[] isLhs = new Object[1];

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1247:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1247:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4708);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1248:2: ({...}? assignmentOperator assignmentExpression )?
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1248:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4715);
                    assignmentOperator153=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator153.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4718);
                    assignmentExpression154=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression154.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1251:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set155=null;

        Object set155_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1252:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set155=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set155));
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1255:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator156 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn157 = null;




        	Object[] isLhs = new Object[1];

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1260:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1260:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4796);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1261:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1261:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4803);
                    assignmentOperator156=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator156.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4806);
                    assignmentExpressionNoIn157=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn157.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1268:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA158=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA158_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1269:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1269:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4828);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1269:32: ( COMMA exprs+= assignmentExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1269:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA158=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression4832); 
            	    stream_COMMA.add(COMMA158);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression4836);
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
            // 1270:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1270:28: ^( CEXPR ( $exprs)+ )
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
            else // 1271:2: -> $exprs
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1274:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA159=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA159_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1275:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1275:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4873);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1275:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1275:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA159=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4877); 
            	    stream_COMMA.add(COMMA159);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4881);
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
            // 1276:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1276:28: ^( CEXPR ( $exprs)+ )
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
            else // 1277:2: -> $exprs
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1302:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC160=null;
        Token EOF161=null;
        Token RBRACE162=null;
        Token EOL163=null;
        Token MultiLineComment164=null;

        Object SEMIC160_tree=null;
        Object EOF161_tree=null;
        Object RBRACE162_tree=null;
        Object EOL163_tree=null;
        Object MultiLineComment164_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1310:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
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
                    new NoViableAltException("1302:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1310:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC160=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic4932); 
                    SEMIC160_tree = (Object)adaptor.create(SEMIC160);
                    adaptor.addChild(root_0, SEMIC160_tree);


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1311:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF161=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic4937); 
                    EOF161_tree = (Object)adaptor.create(EOF161);
                    adaptor.addChild(root_0, EOF161_tree);


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1312:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE162=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic4942); 
                    RBRACE162_tree = (Object)adaptor.create(RBRACE162);
                    adaptor.addChild(root_0, RBRACE162_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1313:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL163=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic4949); 
                    EOL163_tree = (Object)adaptor.create(EOL163);
                    adaptor.addChild(root_0, EOL163_tree);


                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1313:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment164=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic4953); 
                    MultiLineComment164_tree = (Object)adaptor.create(MultiLineComment164);
                    adaptor.addChild(root_0, MultiLineComment164_tree);


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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1321:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block165 = null;

        statementTail_return statementTail166 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1326:2: ({...}? block | statementTail )
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
                        new NoViableAltException("1321:1: statement options {k=1; } : ({...}? block | statementTail );", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA45_0>=NULL && LA45_0<=BREAK)||(LA45_0>=CONTINUE && LA45_0<=DO)||LA45_0==FOR||(LA45_0>=FUNCTION && LA45_0<=IF)||(LA45_0>=NEW && LA45_0<=WITH)||LA45_0==CONST||LA45_0==LPAREN||LA45_0==LBRACK||LA45_0==SEMIC||(LA45_0>=ADD && LA45_0<=SUB)||(LA45_0>=INC && LA45_0<=DEC)||(LA45_0>=NOT && LA45_0<=INV)||(LA45_0>=Identifier && LA45_0<=XmlAttribute)||LA45_0==RegularExpressionLiteral||(LA45_0>=DecimalLiteral && LA45_0<=HexIntegerLiteral)||LA45_0==XMLLiteral) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1321:1: statement options {k=1; } : ({...}? block | statementTail );", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1326:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement4982);
                    block165=block();
                    _fsp--;

                    adaptor.addChild(root_0, block165.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1327:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement4987);
                    statementTail166=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail166.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1330:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement167 = null;

        emptyStatement_return emptyStatement168 = null;

        expressionStatement_return expressionStatement169 = null;

        ifStatement_return ifStatement170 = null;

        iterationStatement_return iterationStatement171 = null;

        continueStatement_return continueStatement172 = null;

        breakStatement_return breakStatement173 = null;

        returnStatement_return returnStatement174 = null;

        withStatement_return withStatement175 = null;

        labelledStatement_return labelledStatement176 = null;

        switchStatement_return switchStatement177 = null;

        throwStatement_return throwStatement178 = null;

        tryStatement_return tryStatement179 = null;

        constStatement_return constStatement180 = null;

        namespaceStatement_return namespaceStatement181 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1331:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
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
                        new NoViableAltException("1330:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 46, 4, input);

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
                    new NoViableAltException("1330:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1331:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail4999);
                    variableStatement167=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement167.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1332:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5004);
                    emptyStatement168=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement168.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1333:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5009);
                    expressionStatement169=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement169.getTree());

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1334:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5014);
                    ifStatement170=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement170.getTree());

                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1335:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5019);
                    iterationStatement171=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement171.getTree());

                    }
                    break;
                case 6 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1336:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5024);
                    continueStatement172=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement172.getTree());

                    }
                    break;
                case 7 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1337:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5029);
                    breakStatement173=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement173.getTree());

                    }
                    break;
                case 8 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1338:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5034);
                    returnStatement174=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement174.getTree());

                    }
                    break;
                case 9 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5039);
                    withStatement175=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement175.getTree());

                    }
                    break;
                case 10 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1340:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5044);
                    labelledStatement176=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement176.getTree());

                    }
                    break;
                case 11 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1341:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5049);
                    switchStatement177=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement177.getTree());

                    }
                    break;
                case 12 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1342:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5054);
                    throwStatement178=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement178.getTree());

                    }
                    break;
                case 13 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1343:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5059);
                    tryStatement179=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement179.getTree());

                    }
                    break;
                case 14 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1344:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5064);
                    constStatement180=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement180.getTree());

                    }
                    break;
                case 15 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5069);
                    namespaceStatement181=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement181.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1350:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE183=null;
        statement_return statement182 = null;


        Object lb_tree=null;
        Object RBRACE183_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1351:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1351:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5084); 
            stream_LBRACE.add(lb);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1351:14: ( statement )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=NULL && LA47_0<=BREAK)||(LA47_0>=CONTINUE && LA47_0<=DO)||LA47_0==FOR||(LA47_0>=FUNCTION && LA47_0<=IF)||(LA47_0>=NEW && LA47_0<=WITH)||LA47_0==CONST||LA47_0==LBRACE||LA47_0==LPAREN||LA47_0==LBRACK||LA47_0==SEMIC||(LA47_0>=ADD && LA47_0<=SUB)||(LA47_0>=INC && LA47_0<=DEC)||(LA47_0>=NOT && LA47_0<=INV)||(LA47_0>=Identifier && LA47_0<=XmlAttribute)||LA47_0==RegularExpressionLiteral||(LA47_0>=DecimalLiteral && LA47_0<=HexIntegerLiteral)||LA47_0==XMLLiteral) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1351:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5086);
            	    statement182=statement();
            	    _fsp--;

            	    stream_statement.add(statement182.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            RBRACE183=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5089); 
            stream_RBRACE.add(RBRACE183);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1352:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1352:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1352:28: ( statement )*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1359:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR184=null;
        Token COMMA186=null;
        variableDeclaration_return variableDeclaration185 = null;

        variableDeclaration_return variableDeclaration187 = null;

        semic_return semic188 = null;


        Object VAR184_tree=null;
        Object COMMA186_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1360:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1360:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR184=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5118); 
            stream_VAR.add(VAR184);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5120);
            variableDeclaration185=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration185.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1360:28: ( COMMA variableDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1360:30: COMMA variableDeclaration
            	    {
            	    COMMA186=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5124); 
            	    stream_COMMA.add(COMMA186);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5126);
            	    variableDeclaration187=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration187.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5131);
            semic188=semic();
            _fsp--;

            stream_semic.add(semic188.getTree());

            // AST REWRITE
            // elements: VAR, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1361:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1361:5: ^( VAR ( variableDeclaration )+ )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1364:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier189=null;
        Token ASSIGN190=null;
        assignmentExpression_return assignmentExpression191 = null;


        Object Identifier189_tree=null;
        Object ASSIGN190_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1365:2: ( Identifier ( ASSIGN assignmentExpression )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1365:4: Identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            Identifier189=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration5154); 
            Identifier189_tree = (Object)adaptor.create(Identifier189);
            adaptor.addChild(root_0, Identifier189_tree);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1365:15: ( ASSIGN assignmentExpression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASSIGN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1365:17: ASSIGN assignmentExpression
                    {
                    ASSIGN190=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5158); 
                    ASSIGN190_tree = (Object)adaptor.create(ASSIGN190);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN190_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5161);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1368:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier192=null;
        Token ASSIGN193=null;
        assignmentExpressionNoIn_return assignmentExpressionNoIn194 = null;


        Object Identifier192_tree=null;
        Object ASSIGN193_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1369:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1369:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            Identifier192=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn5176); 
            Identifier192_tree = (Object)adaptor.create(Identifier192);
            adaptor.addChild(root_0, Identifier192_tree);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1369:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ASSIGN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1369:17: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN193=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5180); 
                    ASSIGN193_tree = (Object)adaptor.create(ASSIGN193);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN193_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5183);
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1372:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST195=null;
        Token COMMA197=null;
        variableDeclaration_return variableDeclaration196 = null;

        variableDeclaration_return variableDeclaration198 = null;

        semic_return semic199 = null;


        Object CONST195_tree=null;
        Object COMMA197_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1373:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1373:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST195=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5198); 
            stream_CONST.add(CONST195);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5200);
            variableDeclaration196=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration196.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1373:31: ( COMMA variableDeclaration )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1373:33: COMMA variableDeclaration
            	    {
            	    COMMA197=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5204); 
            	    stream_COMMA.add(COMMA197);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5206);
            	    variableDeclaration198=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration198.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5211);
            semic199=semic();
            _fsp--;

            stream_semic.add(semic199.getTree());

            // AST REWRITE
            // elements: CONST, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1374:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1374:6: ^( CONST ( variableDeclaration )+ )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1381:1: emptyStatement : SEMIC ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC200=null;

        Object SEMIC200_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1382:2: ( SEMIC )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1382:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC200=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5241); 

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1395:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression201 = null;

        semic_return semic202 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1396:2: ( expression semic )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1396:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5260);
            expression201=expression();
            _fsp--;

            adaptor.addChild(root_0, expression201.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5262);
            semic202=semic();
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1403:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF203=null;
        Token LPAREN204=null;
        Token RPAREN206=null;
        Token ELSE208=null;
        expression_return expression205 = null;

        statement_return statement207 = null;

        statement_return statement209 = null;


        Object IF203_tree=null;
        Object LPAREN204_tree=null;
        Object RPAREN206_tree=null;
        Object ELSE208_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1405:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1405:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF203=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5280); 
            stream_IF.add(IF203);

            LPAREN204=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5282); 
            stream_LPAREN.add(LPAREN204);

            pushFollow(FOLLOW_expression_in_ifStatement5284);
            expression205=expression();
            _fsp--;

            stream_expression.add(expression205.getTree());
            RPAREN206=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5286); 
            stream_RPAREN.add(RPAREN206);

            pushFollow(FOLLOW_statement_in_ifStatement5288);
            statement207=statement();
            _fsp--;

            stream_statement.add(statement207.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1405:42: ({...}? ELSE statement )?
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1405:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE208=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5294); 
                    stream_ELSE.add(ELSE208);

                    pushFollow(FOLLOW_statement_in_ifStatement5296);
                    statement209=statement();
                    _fsp--;

                    stream_statement.add(statement209.getTree());

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
            // 1406:2: -> ^( IF expression ( statement )+ )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1406:5: ^( IF expression ( statement )+ )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1413:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement210 = null;

        whileStatement_return whileStatement211 = null;

        forEachStatement_return forEachStatement212 = null;

        forStatement_return forStatement213 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1414:2: ( doStatement | whileStatement | forEachStatement | forStatement )
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

                if ( (LA53_3==EACH) ) {
                    alt53=3;
                }
                else if ( (LA53_3==LPAREN) ) {
                    alt53=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1413:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 53, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1413:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1414:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5329);
                    doStatement210=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement210.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1415:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5334);
                    whileStatement211=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement211.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1416:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5339);
                    forEachStatement212=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement212.getTree());

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1417:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5344);
                    forStatement213=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement213.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1420:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO214=null;
        Token WHILE216=null;
        Token LPAREN217=null;
        Token RPAREN219=null;
        statement_return statement215 = null;

        expression_return expression218 = null;

        semic_return semic220 = null;


        Object DO214_tree=null;
        Object WHILE216_tree=null;
        Object LPAREN217_tree=null;
        Object RPAREN219_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1421:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1421:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO214=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5356); 
            stream_DO.add(DO214);

            pushFollow(FOLLOW_statement_in_doStatement5358);
            statement215=statement();
            _fsp--;

            stream_statement.add(statement215.getTree());
            WHILE216=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5360); 
            stream_WHILE.add(WHILE216);

            LPAREN217=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5362); 
            stream_LPAREN.add(LPAREN217);

            pushFollow(FOLLOW_expression_in_doStatement5364);
            expression218=expression();
            _fsp--;

            stream_expression.add(expression218.getTree());
            RPAREN219=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5366); 
            stream_RPAREN.add(RPAREN219);

            pushFollow(FOLLOW_semic_in_doStatement5368);
            semic220=semic();
            _fsp--;

            stream_semic.add(semic220.getTree());

            // AST REWRITE
            // elements: expression, statement, DO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1422:2: -> ^( DO statement expression )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1422:5: ^( DO statement expression )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1425:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE221=null;
        Token LPAREN222=null;
        Token RPAREN224=null;
        expression_return expression223 = null;

        statement_return statement225 = null;


        Object WHILE221_tree=null;
        Object LPAREN222_tree=null;
        Object RPAREN224_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1426:2: ( WHILE LPAREN expression RPAREN statement )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1426:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE221=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5393); 
            WHILE221_tree = (Object)adaptor.create(WHILE221);
            root_0 = (Object)adaptor.becomeRoot(WHILE221_tree, root_0);

            LPAREN222=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5396); 
            pushFollow(FOLLOW_expression_in_whileStatement5399);
            expression223=expression();
            _fsp--;

            adaptor.addChild(root_0, expression223.getTree());
            RPAREN224=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5401); 
            pushFollow(FOLLOW_statement_in_whileStatement5404);
            statement225=statement();
            _fsp--;

            adaptor.addChild(root_0, statement225.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1471:1: forEachStatement : FOR EACH LPAREN forEachControl RPAREN statement ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR226=null;
        Token EACH227=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        forEachControl_return forEachControl229 = null;

        statement_return statement231 = null;


        Object FOR226_tree=null;
        Object EACH227_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1472:3: ( FOR EACH LPAREN forEachControl RPAREN statement )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1472:5: FOR EACH LPAREN forEachControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR226=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5419); 
            EACH227=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5422); 
            EACH227_tree = (Object)adaptor.create(EACH227);
            root_0 = (Object)adaptor.becomeRoot(EACH227_tree, root_0);

            LPAREN228=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5425); 
            pushFollow(FOLLOW_forEachControl_in_forEachStatement5428);
            forEachControl229=forEachControl();
            _fsp--;

            adaptor.addChild(root_0, forEachControl229.getTree());
            RPAREN230=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5430); 
            pushFollow(FOLLOW_statement_in_forEachStatement5433);
            statement231=statement();
            _fsp--;

            adaptor.addChild(root_0, statement231.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1475:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar232 = null;

        forControlExpression_return forControlExpression233 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1476:3: ( forControlVar | forControlExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==VAR) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==THIS||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)||(LA54_0>=Identifier && LA54_0<=XmlAttribute)||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)||LA54_0==XMLLiteral) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1475:1: forEachControl : ( forControlVar | forControlExpression );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1476:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5446);
                    forControlVar232=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar232.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1477:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5452);
                    forControlExpression233=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression233.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1480:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR234=null;
        Token LPAREN235=null;
        Token RPAREN237=null;
        forControl_return forControl236 = null;

        statement_return statement238 = null;


        Object FOR234_tree=null;
        Object LPAREN235_tree=null;
        Object RPAREN237_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1481:2: ( FOR LPAREN forControl RPAREN statement )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1481:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR234=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5464); 
            FOR234_tree = (Object)adaptor.create(FOR234);
            root_0 = (Object)adaptor.becomeRoot(FOR234_tree, root_0);

            LPAREN235=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5467); 
            pushFollow(FOLLOW_forControl_in_forStatement5470);
            forControl236=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl236.getTree());
            RPAREN237=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5472); 
            pushFollow(FOLLOW_statement_in_forStatement5475);
            statement238=statement();
            _fsp--;

            adaptor.addChild(root_0, statement238.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1484:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar239 = null;

        forControlExpression_return forControlExpression240 = null;

        forControlSemic_return forControlSemic241 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1485:2: ( forControlVar | forControlExpression | forControlSemic )
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
                    new NoViableAltException("1484:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1485:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5486);
                    forControlVar239=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar239.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1486:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5491);
                    forControlExpression240=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression240.getTree());

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1487:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5496);
                    forControlSemic241=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic241.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1490:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR242=null;
        Token IN244=null;
        Token COMMA246=null;
        Token SEMIC248=null;
        Token SEMIC249=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn243 = null;

        expression_return expression245 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn247 = null;


        Object VAR242_tree=null;
        Object IN244_tree=null;
        Object COMMA246_tree=null;
        Object SEMIC248_tree=null;
        Object SEMIC249_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1491:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1491:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR242=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar5507); 
            stream_VAR.add(VAR242);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5509);
            variableDeclarationNoIn243=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn243.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1492:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
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
                    new NoViableAltException("1492:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1493:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1493:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1494:4: IN expression
                    {
                    IN244=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar5521); 
                    stream_IN.add(IN244);

                    pushFollow(FOLLOW_expression_in_forControlVar5523);
                    expression245=expression();
                    _fsp--;

                    stream_expression.add(expression245.getTree());

                    // AST REWRITE
                    // elements: expression, variableDeclarationNoIn, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1495:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1495:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1495:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1495:51: ^( EXPR expression )
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1498:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1498:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:4: ( COMMA variableDeclarationNoIn )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA246=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5569); 
                    	    stream_COMMA.add(COMMA246);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5571);
                    	    variableDeclarationNoIn247=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn247.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    SEMIC248=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5576); 
                    stream_SEMIC.add(SEMIC248);

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:48: (ex1= expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=NULL && LA57_0<=FALSE)||LA57_0==DELETE||LA57_0==FUNCTION||LA57_0==NEW||LA57_0==THIS||LA57_0==TYPEOF||LA57_0==VOID||LA57_0==LBRACE||LA57_0==LPAREN||LA57_0==LBRACK||(LA57_0>=ADD && LA57_0<=SUB)||(LA57_0>=INC && LA57_0<=DEC)||(LA57_0>=NOT && LA57_0<=INV)||(LA57_0>=Identifier && LA57_0<=XmlAttribute)||LA57_0==RegularExpressionLiteral||(LA57_0>=DecimalLiteral && LA57_0<=HexIntegerLiteral)||LA57_0==XMLLiteral) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5580);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC249=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5583); 
                    stream_SEMIC.add(SEMIC249);

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:70: (ex2= expression )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==DELETE||LA58_0==FUNCTION||LA58_0==NEW||LA58_0==THIS||LA58_0==TYPEOF||LA58_0==VOID||LA58_0==LBRACE||LA58_0==LPAREN||LA58_0==LBRACK||(LA58_0>=ADD && LA58_0<=SUB)||(LA58_0>=INC && LA58_0<=DEC)||(LA58_0>=NOT && LA58_0<=INV)||(LA58_0>=Identifier && LA58_0<=XmlAttribute)||LA58_0==RegularExpressionLiteral||(LA58_0>=DecimalLiteral && LA58_0<=HexIntegerLiteral)||LA58_0==XMLLiteral) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1499:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5587);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: variableDeclarationNoIn, VAR, ex2, ex1
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1500:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1500:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1500:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1500:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1500:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1500:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1500:76: ( $ex2)?
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1505:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN250=null;
        Token SEMIC251=null;
        Token SEMIC252=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN250_tree=null;
        Object SEMIC251_tree=null;
        Object SEMIC252_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1510:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1510:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5653);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1511:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
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
                    new NoViableAltException("1511:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1512:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1512:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1513:4: IN ex2= expression
                    {
                    IN250=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression5668); 
                    stream_IN.add(IN250);

                    pushFollow(FOLLOW_expression_in_forControlExpression5672);
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
                    // 1514:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1514:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1514:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1514:33: ^( EXPR $ex2)
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1517:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1517:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1518:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC251=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5718); 
                    stream_SEMIC.add(SEMIC251);

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1518:13: (ex2= expression )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=Identifier && LA60_0<=XmlAttribute)||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)||LA60_0==XMLLiteral) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1518:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5722);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC252=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5725); 
                    stream_SEMIC.add(SEMIC252);

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1518:35: (ex3= expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||(LA61_0>=Identifier && LA61_0<=XmlAttribute)||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)||LA61_0==XMLLiteral) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1518:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5729);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex2, ex1, ex3
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
                    // 1519:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1519:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1519:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1519:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1519:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1519:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1519:57: ( $ex3)?
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1524:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC253=null;
        Token SEMIC254=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC253_tree=null;
        Object SEMIC254_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1525:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1525:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC253=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5788); 
            stream_SEMIC.add(SEMIC253);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1525:13: (ex1= expression )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||(LA63_0>=Identifier && LA63_0<=XmlAttribute)||LA63_0==RegularExpressionLiteral||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)||LA63_0==XMLLiteral) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1525:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5792);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC254=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5795); 
            stream_SEMIC.add(SEMIC254);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1525:35: (ex2= expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||LA64_0==FUNCTION||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||(LA64_0>=Identifier && LA64_0<=XmlAttribute)||LA64_0==RegularExpressionLiteral||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)||LA64_0==XMLLiteral) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1525:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5799);
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
            // 1526:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1526:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1526:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1526:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1526:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1526:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1526:50: ( $ex2)?
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1538:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE255=null;
        Token Identifier256=null;
        semic_return semic257 = null;


        Object CONTINUE255_tree=null;
        Object Identifier256_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1539:2: ( CONTINUE ( Identifier )? semic )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1539:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE255=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5853); 
            CONTINUE255_tree = (Object)adaptor.create(CONTINUE255);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE255_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1539:67: ( Identifier )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Identifier) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1539:67: Identifier
                    {
                    Identifier256=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement5858); 
                    Identifier256_tree = (Object)adaptor.create(Identifier256);
                    adaptor.addChild(root_0, Identifier256_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement5861);
            semic257=semic();
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1551:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK258=null;
        Token Identifier259=null;
        semic_return semic260 = null;


        Object BREAK258_tree=null;
        Object Identifier259_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1552:2: ( BREAK ( Identifier )? semic )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1552:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK258=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement5880); 
            BREAK258_tree = (Object)adaptor.create(BREAK258);
            root_0 = (Object)adaptor.becomeRoot(BREAK258_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1552:64: ( Identifier )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Identifier) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1552:64: Identifier
                    {
                    Identifier259=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement5885); 
                    Identifier259_tree = (Object)adaptor.create(Identifier259);
                    adaptor.addChild(root_0, Identifier259_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement5888);
            semic260=semic();
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1572:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN261=null;
        expression_return expression262 = null;

        semic_return semic263 = null;


        Object RETURN261_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1573:2: ( RETURN ( expression )? semic )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1573:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN261=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement5907); 
            RETURN261_tree = (Object)adaptor.create(RETURN261);
            root_0 = (Object)adaptor.becomeRoot(RETURN261_tree, root_0);

             promoteEOL(null); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1573:34: ( expression )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||LA67_0==FUNCTION||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||(LA67_0>=Identifier && LA67_0<=XmlAttribute)||LA67_0==RegularExpressionLiteral||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)||LA67_0==XMLLiteral) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1573:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement5912);
                    expression262=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression262.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement5915);
            semic263=semic();
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1580:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH264=null;
        Token LPAREN265=null;
        Token RPAREN267=null;
        expression_return expression266 = null;

        statement_return statement268 = null;


        Object WITH264_tree=null;
        Object LPAREN265_tree=null;
        Object RPAREN267_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1581:2: ( WITH LPAREN expression RPAREN statement )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1581:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH264=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement5932); 
            WITH264_tree = (Object)adaptor.create(WITH264);
            root_0 = (Object)adaptor.becomeRoot(WITH264_tree, root_0);

            LPAREN265=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5935); 
            pushFollow(FOLLOW_expression_in_withStatement5938);
            expression266=expression();
            _fsp--;

            adaptor.addChild(root_0, expression266.getTree());
            RPAREN267=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5940); 
            pushFollow(FOLLOW_statement_in_withStatement5943);
            statement268=statement();
            _fsp--;

            adaptor.addChild(root_0, statement268.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1588:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH269=null;
        Token LPAREN270=null;
        Token RPAREN272=null;
        Token LBRACE273=null;
        Token RBRACE276=null;
        expression_return expression271 = null;

        defaultClause_return defaultClause274 = null;

        caseClause_return caseClause275 = null;


        Object SWITCH269_tree=null;
        Object LPAREN270_tree=null;
        Object RPAREN272_tree=null;
        Object LBRACE273_tree=null;
        Object RBRACE276_tree=null;
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1593:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1593:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH269=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement5964); 
            stream_SWITCH.add(SWITCH269);

            LPAREN270=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement5966); 
            stream_LPAREN.add(LPAREN270);

            pushFollow(FOLLOW_expression_in_switchStatement5968);
            expression271=expression();
            _fsp--;

            stream_expression.add(expression271.getTree());
            RPAREN272=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement5970); 
            stream_RPAREN.add(RPAREN272);

            LBRACE273=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement5972); 
            stream_LBRACE.add(LBRACE273);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1593:43: ({...}? => defaultClause | caseClause )*
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1593:45: {...}? => defaultClause
            	    {
            	    if ( !( defaultClauseCount == 0 ) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement5979);
            	    defaultClause274=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause274.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1593:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement5985);
            	    caseClause275=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause275.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            RBRACE276=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement5990); 
            stream_RBRACE.add(RBRACE276);


            // AST REWRITE
            // elements: defaultClause, expression, caseClause, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1594:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1594:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1594:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1594:41: ( caseClause )*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1597:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE277=null;
        Token COLON279=null;
        expression_return expression278 = null;

        statement_return statement280 = null;


        Object CASE277_tree=null;
        Object COLON279_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1598:2: ( CASE expression COLON ( statement )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1598:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE277=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6018); 
            CASE277_tree = (Object)adaptor.create(CASE277);
            root_0 = (Object)adaptor.becomeRoot(CASE277_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6021);
            expression278=expression();
            _fsp--;

            adaptor.addChild(root_0, expression278.getTree());
            COLON279=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6023); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1598:28: ( statement )*
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
                else if ( ((LA69_0>=NULL && LA69_0<=BREAK)||LA69_0==CONTINUE||(LA69_0>=DELETE && LA69_0<=DO)||LA69_0==FOR||(LA69_0>=FUNCTION && LA69_0<=IF)||(LA69_0>=NEW && LA69_0<=WITH)||LA69_0==CONST||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||LA69_0==SEMIC||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||(LA69_0>=Identifier && LA69_0<=XmlAttribute)||LA69_0==RegularExpressionLiteral||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)||LA69_0==XMLLiteral) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1598:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6026);
            	    statement280=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement280.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1601:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT281=null;
        Token COLON282=null;
        statement_return statement283 = null;


        Object DEFAULT281_tree=null;
        Object COLON282_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1602:2: ( DEFAULT COLON ( statement )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1602:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT281=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6039); 
            DEFAULT281_tree = (Object)adaptor.create(DEFAULT281);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT281_tree, root_0);

            COLON282=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6042); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1602:20: ( statement )*
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
                else if ( ((LA70_0>=NULL && LA70_0<=BREAK)||LA70_0==CONTINUE||(LA70_0>=DELETE && LA70_0<=DO)||LA70_0==FOR||(LA70_0>=FUNCTION && LA70_0<=IF)||(LA70_0>=NEW && LA70_0<=WITH)||LA70_0==CONST||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||LA70_0==SEMIC||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||(LA70_0>=Identifier && LA70_0<=XmlAttribute)||LA70_0==RegularExpressionLiteral||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)||LA70_0==XMLLiteral) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1602:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6045);
            	    statement283=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement283.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1609:1: labelledStatement : Identifier COLON statement -> ^( LABELLED Identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier284=null;
        Token COLON285=null;
        statement_return statement286 = null;


        Object Identifier284_tree=null;
        Object COLON285_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1610:2: ( Identifier COLON statement -> ^( LABELLED Identifier statement ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1610:4: Identifier COLON statement
            {
            Identifier284=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_labelledStatement6062); 
            stream_Identifier.add(Identifier284);

            COLON285=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6064); 
            stream_COLON.add(COLON285);

            pushFollow(FOLLOW_statement_in_labelledStatement6066);
            statement286=statement();
            _fsp--;

            stream_statement.add(statement286.getTree());

            // AST REWRITE
            // elements: statement, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1611:2: -> ^( LABELLED Identifier statement )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1611:5: ^( LABELLED Identifier statement )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1633:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW287=null;
        expression_return expression288 = null;

        semic_return semic289 = null;


        Object THROW287_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1634:2: ( THROW expression semic )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1634:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW287=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6097); 
            THROW287_tree = (Object)adaptor.create(THROW287);
            root_0 = (Object)adaptor.becomeRoot(THROW287_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6102);
            expression288=expression();
            _fsp--;

            adaptor.addChild(root_0, expression288.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6104);
            semic289=semic();
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1641:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY290=null;
        block_return block291 = null;

        catchClause_return catchClause292 = null;

        finallyClause_return finallyClause293 = null;

        finallyClause_return finallyClause294 = null;


        Object TRY290_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY290=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6121); 
            TRY290_tree = (Object)adaptor.create(TRY290);
            root_0 = (Object)adaptor.becomeRoot(TRY290_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6124);
            block291=block();
            _fsp--;

            adaptor.addChild(root_0, block291.getTree());
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
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
                    new NoViableAltException("1642:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:17: ( catchClause )+ ( finallyClause )?
                    {
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:17: ( catchClause )+
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
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6128);
                    	    catchClause292=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause292.getTree());

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

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:30: ( finallyClause )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==FINALLY) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6131);
                            finallyClause293=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause293.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1642:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6136);
                    finallyClause294=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause294.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1645:1: catchClause : CATCH LPAREN Identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH295=null;
        Token LPAREN296=null;
        Token Identifier297=null;
        Token RPAREN299=null;
        catchFilter_return catchFilter298 = null;

        block_return block300 = null;


        Object CATCH295_tree=null;
        Object LPAREN296_tree=null;
        Object Identifier297_tree=null;
        Object RPAREN299_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1646:2: ( CATCH LPAREN Identifier ( catchFilter )? RPAREN block )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1646:4: CATCH LPAREN Identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH295=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6150); 
            CATCH295_tree = (Object)adaptor.create(CATCH295);
            root_0 = (Object)adaptor.becomeRoot(CATCH295_tree, root_0);

            LPAREN296=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6153); 
            Identifier297=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_catchClause6156); 
            Identifier297_tree = (Object)adaptor.create(Identifier297);
            adaptor.addChild(root_0, Identifier297_tree);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1646:30: ( catchFilter )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==IF) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1646:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6158);
                    catchFilter298=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter298.getTree());

                    }
                    break;

            }

            RPAREN299=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6161); 
            pushFollow(FOLLOW_block_in_catchClause6164);
            block300=block();
            _fsp--;

            adaptor.addChild(root_0, block300.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1649:1: catchFilter : IF instanceofExpression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF301=null;
        instanceofExpression_return instanceofExpression302 = null;


        Object IF301_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1650:3: ( IF instanceofExpression )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1650:5: IF instanceofExpression
            {
            root_0 = (Object)adaptor.nil();

            IF301=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6177); 
            IF301_tree = (Object)adaptor.create(IF301);
            root_0 = (Object)adaptor.becomeRoot(IF301_tree, root_0);

            pushFollow(FOLLOW_instanceofExpression_in_catchFilter6180);
            instanceofExpression302=instanceofExpression();
            _fsp--;

            adaptor.addChild(root_0, instanceofExpression302.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1653:1: instanceofExpression : Identifier INSTANCEOF Identifier ;
    public final instanceofExpression_return instanceofExpression() throws RecognitionException {
        instanceofExpression_return retval = new instanceofExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier303=null;
        Token INSTANCEOF304=null;
        Token Identifier305=null;

        Object Identifier303_tree=null;
        Object INSTANCEOF304_tree=null;
        Object Identifier305_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1654:3: ( Identifier INSTANCEOF Identifier )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1654:5: Identifier INSTANCEOF Identifier
            {
            root_0 = (Object)adaptor.nil();

            Identifier303=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_instanceofExpression6195); 
            Identifier303_tree = (Object)adaptor.create(Identifier303);
            adaptor.addChild(root_0, Identifier303_tree);

            INSTANCEOF304=(Token)input.LT(1);
            match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceofExpression6197); 
            INSTANCEOF304_tree = (Object)adaptor.create(INSTANCEOF304);
            root_0 = (Object)adaptor.becomeRoot(INSTANCEOF304_tree, root_0);

            Identifier305=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_instanceofExpression6200); 
            Identifier305_tree = (Object)adaptor.create(Identifier305);
            adaptor.addChild(root_0, Identifier305_tree);


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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1657:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY306=null;
        block_return block307 = null;


        Object FINALLY306_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1658:2: ( FINALLY block )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1658:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY306=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6213); 
            FINALLY306_tree = (Object)adaptor.create(FINALLY306);
            root_0 = (Object)adaptor.becomeRoot(FINALLY306_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6216);
            block307=block();
            _fsp--;

            adaptor.addChild(root_0, block307.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1671:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token FUNCTION308=null;
        formalParameterList_return formalParameterList309 = null;

        functionBody_return functionBody310 = null;


        Object name_tree=null;
        Object FUNCTION308_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1672:2: ( FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1672:4: FUNCTION name= Identifier formalParameterList functionBody
            {
            FUNCTION308=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6237); 
            stream_FUNCTION.add(FUNCTION308);

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration6241); 
            stream_Identifier.add(name);

            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6243);
            formalParameterList309=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList309.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6245);
            functionBody310=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody310.getTree());

            // AST REWRITE
            // elements: FUNCTION, formalParameterList, functionBody, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1673:2: -> ^( FUNCTION $name formalParameterList functionBody )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1673:5: ^( FUNCTION $name formalParameterList functionBody )
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1676:1: functionExpression : FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token FUNCTION311=null;
        formalParameterList_return formalParameterList312 = null;

        functionBody_return functionBody313 = null;


        Object name_tree=null;
        Object FUNCTION311_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1677:2: ( FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1677:4: FUNCTION (name= Identifier )? formalParameterList functionBody
            {
            FUNCTION311=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6272); 
            stream_FUNCTION.add(FUNCTION311);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1677:17: (name= Identifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Identifier) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1677:17: name= Identifier
                    {
                    name=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_functionExpression6276); 
                    stream_Identifier.add(name);


                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6279);
            formalParameterList312=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList312.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6281);
            functionBody313=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody313.getTree());

            // AST REWRITE
            // elements: formalParameterList, name, FUNCTION, functionBody
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1678:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1678:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1678:17: ( $name)?
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1681:1: formalParameterList : LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN -> ^( ARGS ( $args)* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN314=null;
        Token COMMA315=null;
        Token RPAREN316=null;
        Token args=null;
        List list_args=null;

        Object LPAREN314_tree=null;
        Object COMMA315_tree=null;
        Object RPAREN316_tree=null;
        Object args_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1682:2: ( LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN -> ^( ARGS ( $args)* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1682:4: LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN
            {
            LPAREN314=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6309); 
            stream_LPAREN.add(LPAREN314);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1682:11: (args+= Identifier ( COMMA args+= Identifier )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Identifier) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1682:13: args+= Identifier ( COMMA args+= Identifier )*
                    {
                    args=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList6315); 
                    stream_Identifier.add(args);

                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1682:30: ( COMMA args+= Identifier )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==COMMA) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1682:32: COMMA args+= Identifier
                    	    {
                    	    COMMA315=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6319); 
                    	    stream_COMMA.add(COMMA315);

                    	    args=(Token)input.LT(1);
                    	    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList6323); 
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

            RPAREN316=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6331); 
            stream_RPAREN.add(RPAREN316);


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
            // 1683:2: -> ^( ARGS ( $args)* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1683:5: ^( ARGS ( $args)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1683:13: ( $args)*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1686:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE318=null;
        sourceElement_return sourceElement317 = null;


        Object lb_tree=null;
        Object RBRACE318_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1687:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1687:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6357); 
            stream_LBRACE.add(lb);

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1687:14: ( sourceElement )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=NULL && LA78_0<=BREAK)||(LA78_0>=CONTINUE && LA78_0<=DO)||LA78_0==FOR||(LA78_0>=FUNCTION && LA78_0<=IF)||(LA78_0>=NEW && LA78_0<=WITH)||LA78_0==CONST||LA78_0==LBRACE||LA78_0==LPAREN||LA78_0==LBRACK||LA78_0==SEMIC||(LA78_0>=ADD && LA78_0<=SUB)||(LA78_0>=INC && LA78_0<=DEC)||(LA78_0>=NOT && LA78_0<=INV)||(LA78_0>=Identifier && LA78_0<=XmlAttribute)||LA78_0==RegularExpressionLiteral||(LA78_0>=DecimalLiteral && LA78_0<=HexIntegerLiteral)||LA78_0==XMLLiteral) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1687:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6359);
            	    sourceElement317=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement317.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            RBRACE318=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6362); 
            stream_RBRACE.add(RBRACE318);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1688:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1688:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1688:28: ( sourceElement )*
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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1696:1: getMethodDeclaration : GET name= Identifier LPAREN RPAREN functionBody ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token GET319=null;
        Token LPAREN320=null;
        Token RPAREN321=null;
        functionBody_return functionBody322 = null;


        Object name_tree=null;
        Object GET319_tree=null;
        Object LPAREN320_tree=null;
        Object RPAREN321_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1697:3: ( GET name= Identifier LPAREN RPAREN functionBody )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1697:5: GET name= Identifier LPAREN RPAREN functionBody
            {
            root_0 = (Object)adaptor.nil();

            GET319=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6392); 
            GET319_tree = (Object)adaptor.create(GET319);
            root_0 = (Object)adaptor.becomeRoot(GET319_tree, root_0);

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_getMethodDeclaration6397); 
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);

            LPAREN320=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6399); 
            RPAREN321=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6402); 
            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6405);
            functionBody322=functionBody();
            _fsp--;

            adaptor.addChild(root_0, functionBody322.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1700:1: setMethodDeclaration : SET name= Identifier LPAREN Identifier RPAREN functionBody ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token SET323=null;
        Token LPAREN324=null;
        Token Identifier325=null;
        Token RPAREN326=null;
        functionBody_return functionBody327 = null;


        Object name_tree=null;
        Object SET323_tree=null;
        Object LPAREN324_tree=null;
        Object Identifier325_tree=null;
        Object RPAREN326_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1701:3: ( SET name= Identifier LPAREN Identifier RPAREN functionBody )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1701:5: SET name= Identifier LPAREN Identifier RPAREN functionBody
            {
            root_0 = (Object)adaptor.nil();

            SET323=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6420); 
            SET323_tree = (Object)adaptor.create(SET323);
            root_0 = (Object)adaptor.becomeRoot(SET323_tree, root_0);

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_setMethodDeclaration6425); 
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);

            LPAREN324=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6427); 
            Identifier325=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_setMethodDeclaration6430); 
            Identifier325_tree = (Object)adaptor.create(Identifier325);
            adaptor.addChild(root_0, Identifier325_tree);

            RPAREN326=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6432); 
            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6435);
            functionBody327=functionBody();
            _fsp--;

            adaptor.addChild(root_0, functionBody327.getTree());

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1708:1: program : ( sourceElement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF329=null;
        sourceElement_return sourceElement328 = null;


        Object EOF329_tree=null;

        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1709:2: ( ( sourceElement )* EOF )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1709:4: ( sourceElement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1709:4: ( sourceElement )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=NULL && LA79_0<=BREAK)||(LA79_0>=CONTINUE && LA79_0<=DO)||LA79_0==FOR||(LA79_0>=FUNCTION && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=WITH)||LA79_0==CONST||LA79_0==LBRACE||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||(LA79_0>=Identifier && LA79_0<=XmlAttribute)||LA79_0==RegularExpressionLiteral||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)||LA79_0==XMLLiteral) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1709:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6452);
            	    sourceElement328=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement328.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            EOF329=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program6455); 

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
    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1717:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration330 = null;

        statement_return statement331 = null;



        try {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1722:2: ({...}? functionDeclaration | statement )
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
                        new NoViableAltException("1717:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 80, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA80_0>=NULL && LA80_0<=BREAK)||(LA80_0>=CONTINUE && LA80_0<=DO)||LA80_0==FOR||LA80_0==IF||(LA80_0>=NEW && LA80_0<=WITH)||LA80_0==CONST||LA80_0==LBRACE||LA80_0==LPAREN||LA80_0==LBRACK||LA80_0==SEMIC||(LA80_0>=ADD && LA80_0<=SUB)||(LA80_0>=INC && LA80_0<=DEC)||(LA80_0>=NOT && LA80_0<=INV)||(LA80_0>=Identifier && LA80_0<=XmlAttribute)||LA80_0==RegularExpressionLiteral||(LA80_0>=DecimalLiteral && LA80_0<=HexIntegerLiteral)||LA80_0==XMLLiteral) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1717:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1722:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6484);
                    functionDeclaration330=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration330.getTree());

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1723:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6489);
                    statement331=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement331.getTree());

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


 

    public static final BitSet FOLLOW_reservedWord_in_token1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_token1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_token1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_primaryExpression3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3419 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_parenExpression3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3448 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC026A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3456 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC026A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3526 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000040L,0x0070038000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3534 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0x0070038000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3595 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3597 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_propertyName3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_propertyName3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3677 = new BitSet(new long[]{0x0000000002000070L,0x00000000000002A0L,0x0071038000000000L});
    public static final BitSet FOLLOW_primaryExpression_in_newExpression3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3693 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC003A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments3701 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3744 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3765 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3790 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3794 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3816 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000080L,0x0000028000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression3818 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression3839 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3841 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression3860 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3862 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000A80L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rightHandSideExpression3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_rightHandSideExpression3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3948 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4003 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLLiteral_in_unaryExpression4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4112 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4134 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4138 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4153 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4175 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4205 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4209 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4224 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4243 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4247 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4274 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4288 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4292 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4315 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4334 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4338 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4357 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4371 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4375 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4394 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4414 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4418 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4421 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4435 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4439 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4442 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4458 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4462 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4465 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4481 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4485 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4488 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4503 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4507 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4510 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4525 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4529 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4532 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4551 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4555 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4558 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4572 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4576 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4579 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4594 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4598 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4601 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4616 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4620 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4623 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4642 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4646 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4649 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4651 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4668 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4672 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4675 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4677 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4708 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4715 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4796 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4803 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression4832 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn4877 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4881 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5084 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012E0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_block5086 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012E0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_block5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000003000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration5154 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5158 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn5176 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5180 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000003000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5282 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_ifStatement5284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5286 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_ifStatement5288 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5294 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_ifStatement5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5356 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_doStatement5358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5362 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_doStatement5364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5396 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_whileStatement5399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5401 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_whileStatement5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5425 = new BitSet(new long[]{0x0000000072441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5430 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5467 = new BitSet(new long[]{0x0000000072441070L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_forControl_in_forStatement5470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5472 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_forStatement5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5509 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar5521 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlVar5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5576 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlVar5580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5583 = new BitSet(new long[]{0x0000000052441072L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlVar5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5653 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5668 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5718 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5725 = new BitSet(new long[]{0x0000000052441072L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5788 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5795 = new BitSet(new long[]{0x0000000052441072L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement5853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000B000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement5858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement5880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000B000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement5907 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC012E0L,0x007103B000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_returnStatement5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement5932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement5935 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_withStatement5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement5940 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_withStatement5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement5964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement5966 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_switchStatement5968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement5970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement5972 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement5979 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement5985 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6018 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_caseClause6021 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6023 = new BitSet(new long[]{0x00000101FFCD3CF2L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_caseClause6026 = new BitSet(new long[]{0x00000101FFCD3CF2L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6039 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6042 = new BitSet(new long[]{0x00000101FFCD3CF2L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_defaultClause6045 = new BitSet(new long[]{0x00000101FFCD3CF2L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement6062 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6064 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6097 = new BitSet(new long[]{0x0000000052441070L,0x0000000C0CC002A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_throwStatement6102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x0000003000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6124 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6128 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause6156 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_instanceofExpression_in_catchFilter6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_instanceofExpression6195 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression6197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_instanceofExpression6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration6241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression6276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList6315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList6323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6357 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012E0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6359 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012E0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_getMethodDeclaration6397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_setMethodDeclaration6425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_Identifier_in_setMethodDeclaration6430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6452 = new BitSet(new long[]{0x00000101FFCD3CF0L,0x0000000C0CC012A0L,0x0071038000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_program6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6489 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.0.1 JS.g 2010-01-26 13:25:58

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "AT", "DOTDOT", "COLONCOLON", "XMLFragment", "XMLFragmentEnd", "XMLFragmentError", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "FOREACH", "GETTER", "SETTER", "DEFAULT_XML_NAMESPACE", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XmlAttribute", "XML_LITERAL", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminatorChar", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int PACKAGE=58;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=154;
    public static final int RegularExpressionChar=191;
    public static final int LOCALNAME=129;
    public static final int XMLFragmentEnd=121;
    public static final int MOD=89;
    public static final int SHL=92;
    public static final int CONST=43;
    public static final int DO=13;
    public static final int DQUOTE=151;
    public static final int LineTerminatorChar=164;
    public static final int NOT=98;
    public static final int EOF=-1;
    public static final int CEXPR=131;
    public static final int DIVASS=116;
    public static final int BYINDEX=127;
    public static final int INC=90;
    public static final int RPAREN=72;
    public static final int FINAL=49;
    public static final int FORSTEP=134;
    public static final int IMPORT=53;
    public static final int EOL=166;
    public static final int OctalDigit=177;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int ARGS=123;
    public static final int GET=33;
    public static final int WhiteSpace=159;
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
    public static final int DEFAULT_XML_NAMESPACE=138;
    public static final int FF=155;
    public static final int OctalEscapeSequence=185;
    public static final int RegularExpressionFirstChar=190;
    public static final int TYPEOF=28;
    public static final int GT=79;
    public static final int CALL=130;
    public static final int CharacterEscapeSequence=183;
    public static final int LAND=100;
    public static final int PINC=146;
    public static final int PROTECTED=60;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int SUB=87;
    public static final int RegularExpressionLiteral=176;
    public static final int FLOAT=50;
    public static final int DecimalIntegerLiteral=179;
    public static final int HexDigit=170;
    public static final int LPAREN=71;
    public static final int AT=117;
    public static final int IMPLEMENTS=52;
    public static final int YIELD=35;
    public static final int SHRASS=110;
    public static final int PS=163;
    public static final int MultiLineComment=167;
    public static final int ADD=86;
    public static final int ZeroToThree=184;
    public static final int ITEM=139;
    public static final int UnicodeEscapeSequence=187;
    public static final int SHUASS=111;
    public static final int SHORT=62;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=152;
    public static final int SAME=84;
    public static final int COLON=103;
    public static final int StringLiteral=169;
    public static final int XMLFragment=120;
    public static final int PAREXPR=144;
    public static final int ENUM=46;
    public static final int NBSP=157;
    public static final int HexIntegerLiteral=182;
    public static final int SP=156;
    public static final int BLOCK=125;
    public static final int LineTerminator=165;
    public static final int INTERFACE=55;
    public static final int DIV=115;
    public static final int LONG=56;
    public static final int CR=161;
    public static final int PUBLIC=61;
    public static final int LOR=101;
    public static final int LT=78;
    public static final int WHILE=31;
    public static final int BackslashSequence=189;
    public static final int LS=162;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=41;
    public static final int DecimalDigit=172;
    public static final int BYFIELD=126;
    public static final int BREAK=7;
    public static final int Identifier=175;
    public static final int WXML=36;
    public static final int POS=147;
    public static final int DOUBLE=45;
    public static final int ExponentPart=178;
    public static final int VAR=29;
    public static final int VOID=30;
    public static final int SUPER=64;
    public static final int EACH=17;
    public static final int LABELLED=140;
    public static final int ADDASS=105;
    public static final int ARRAY=124;
    public static final int PRIVATE=59;
    public static final int SWITCH=24;
    public static final int NULL=4;
    public static final int THROWS=66;
    public static final int DELETE=12;
    public static final int MUL=88;
    public static final int IdentifierStartASCII=171;
    public static final int TRY=27;
    public static final int NAMESPACE=37;
    public static final int SHLASS=109;
    public static final int COLONCOLON=119;
    public static final int USP=158;
    public static final int ANDASS=112;
    public static final int IdentifierNameASCIIStart=174;
    public static final int QUE=102;
    public static final int OR=96;
    public static final int SETTER=137;
    public static final int DEBUGGER=44;
    public static final int FOREACH=135;
    public static final int PDEC=145;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=188;
    public static final int THROW=26;
    public static final int MULASS=107;
    public static final int XmlAttribute=148;
    public static final int DEC=91;
    public static final int OctalIntegerLiteral=181;
    public static final int CLASS=42;
    public static final int ORASS=113;
    public static final int HexEscapeSequence=186;
    public static final int NAMEDVALUE=141;
    public static final int SingleLineComment=168;
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
    public static final int EXPR=132;
    public static final int IN=20;
    public static final int CONTINUE=10;
    public static final int OBJECT=143;
    public static final int COMMA=77;
    public static final int TRANSIENT=67;
    public static final int FORITER=133;
    public static final int MODASS=108;
    public static final int DOT=75;
    public static final int IdentifierPart=173;
    public static final int WITH=32;
    public static final int BYTE=40;
    public static final int XOR=97;
    public static final int VOLATILE=68;
    public static final int GETTER=136;
    public static final int NSAME=85;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=128;
    public static final int TAB=153;
    public static final int DecimalLiteral=180;
    public static final int TRUE=5;
    public static final int NEQ=83;
    public static final int FINALLY=15;
    public static final int NEG=142;
    public static final int ASSIGN=104;
    public static final int XML_LITERAL=149;
    public static final int SEMIC=76;
    public static final int EXTENDS=48;
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


    private boolean typeInformationEnabled;

    public final boolean isTypeInformationEnabled() {
    	return typeInformationEnabled;
    }

    public void setTypeInformationEnabled(boolean value) {
    	this.typeInformationEnabled = value;
    }

    protected void reportFailure(Throwable t) {
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
    // JS.g:623:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute );
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
            // JS.g:624:2: ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute )
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
                    new NoViableAltException("623:1: token : ( reservedWord | identifier | XMLFragment | XMLFragmentEnd | punctuator | numericLiteral | StringLiteral | xmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:624:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1941);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:625:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token1946);
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
                    match(input,XMLFragment,FOLLOW_XMLFragment_in_token1951); 
                    XMLFragment3_tree = (Object)adaptor.create(XMLFragment3);
                    adaptor.addChild(root_0, XMLFragment3_tree);


                    }
                    break;
                case 4 :
                    // JS.g:627:4: XMLFragmentEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLFragmentEnd4=(Token)input.LT(1);
                    match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_token1956); 
                    XMLFragmentEnd4_tree = (Object)adaptor.create(XMLFragmentEnd4);
                    adaptor.addChild(root_0, XMLFragmentEnd4_tree);


                    }
                    break;
                case 5 :
                    // JS.g:628:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1961);
                    punctuator5=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator5.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:629:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1966);
                    numericLiteral6=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral6.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:630:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral7=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1971); 
                    StringLiteral7_tree = (Object)adaptor.create(StringLiteral7);
                    adaptor.addChild(root_0, StringLiteral7_tree);


                    }
                    break;
                case 8 :
                    // JS.g:631:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_token1976);
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:636:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
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
            // JS.g:637:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
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
                    new NoViableAltException("636:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:637:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1989);
                    keyword9=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword9.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:638:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1994);
                    futureReservedWord10=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord10.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:639:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL11=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord1999); 
                    NULL11_tree = (Object)adaptor.create(NULL11);
                    adaptor.addChild(root_0, NULL11_tree);


                    }
                    break;
                case 4 :
                    // JS.g:640:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2004);
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:647:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:648:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:685:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // JS.g:686:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:759:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | Identifier );
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            // JS.g:760:3: ( WXML | GET | SET | EACH | NAMESPACE | Identifier )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:768:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );
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
            // JS.g:769:3: ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) )
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
                        new NoViableAltException("768:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("768:1: xmlAttribute : ( AT identifier -> ^( XmlAttribute AT identifier ) | AT MUL -> ^( XmlAttribute AT MUL ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // JS.g:769:5: AT identifier
                    {
                    AT16=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2504); 
                    stream_AT.add(AT16);

                    pushFollow(FOLLOW_identifier_in_xmlAttribute2506);
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
                    // 769:19: -> ^( XmlAttribute AT identifier )
                    {
                        // JS.g:769:22: ^( XmlAttribute AT identifier )
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
                    // JS.g:770:5: AT MUL
                    {
                    AT18=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_xmlAttribute2522); 
                    stream_AT.add(AT18);

                    MUL19=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_xmlAttribute2524); 
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
                    // 770:12: -> ^( XmlAttribute AT MUL )
                    {
                        // JS.g:770:15: ^( XmlAttribute AT MUL )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:777:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // JS.g:778:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:834:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );
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
            // JS.g:835:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral )
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
                    new NoViableAltException("834:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral | xmlLiteral );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:835:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL21=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2810); 
                    NULL21_tree = (Object)adaptor.create(NULL21);
                    adaptor.addChild(root_0, NULL21_tree);


                    }
                    break;
                case 2 :
                    // JS.g:836:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2815);
                    booleanLiteral22=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral22.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:837:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2820);
                    numericLiteral23=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral23.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:838:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral24=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2825); 
                    StringLiteral24_tree = (Object)adaptor.create(StringLiteral24);
                    adaptor.addChild(root_0, StringLiteral24_tree);


                    }
                    break;
                case 5 :
                    // JS.g:839:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral25=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2830); 
                    RegularExpressionLiteral25_tree = (Object)adaptor.create(RegularExpressionLiteral25);
                    adaptor.addChild(root_0, RegularExpressionLiteral25_tree);


                    }
                    break;
                case 6 :
                    // JS.g:840:4: xmlLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlLiteral_in_literal2835);
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:843:1: xmlLiteral : ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) ;
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
            // JS.g:844:2: ( ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd ) )
            // JS.g:844:4: ( XMLFragment LBRACE expression RBRACE )* XMLFragmentEnd
            {
            // JS.g:844:4: ( XMLFragment LBRACE expression RBRACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==XMLFragment) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JS.g:845:6: XMLFragment LBRACE expression RBRACE
            	    {
            	    XMLFragment27=(Token)input.LT(1);
            	    match(input,XMLFragment,FOLLOW_XMLFragment_in_xmlLiteral2853); 
            	    stream_XMLFragment.add(XMLFragment27);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_JS); 
            	    LBRACE28=(Token)input.LT(1);
            	    match(input,LBRACE,FOLLOW_LBRACE_in_xmlLiteral2870); 
            	    stream_LBRACE.add(LBRACE28);

            	    pushFollow(FOLLOW_expression_in_xmlLiteral2872);
            	    expression29=expression();
            	    _fsp--;

            	    stream_expression.add(expression29.getTree());
            	    RBRACE30=(Token)input.LT(1);
            	    match(input,RBRACE,FOLLOW_RBRACE_in_xmlLiteral2874); 
            	    stream_RBRACE.add(RBRACE30);

            	     ((JSTokenStream)input).setMode(JSTokenSource.MODE_XML); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            XMLFragmentEnd31=(Token)input.LT(1);
            match(input,XMLFragmentEnd,FOLLOW_XMLFragmentEnd_in_xmlLiteral2890); 
            stream_XMLFragmentEnd.add(XMLFragmentEnd31);


            // AST REWRITE
            // elements: XMLFragment, XMLFragmentEnd, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 850:4: -> ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
            {
                // JS.g:850:7: ^( XML_LITERAL ( XMLFragment )* ( expression )* XMLFragmentEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);

                // JS.g:850:21: ( XMLFragment )*
                while ( stream_XMLFragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_XMLFragment.next());

                }
                stream_XMLFragment.reset();
                // JS.g:850:34: ( expression )*
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:872:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // JS.g:873:2: ( TRUE | FALSE )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:919:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;

        Object set33_tree=null;

        try {
            // JS.g:920:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1009:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
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
            // JS.g:1010:2: ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
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
                    new NoViableAltException("1009:1: primaryExpression : ( THIS | identifier | xmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // JS.g:1010:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS34=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3675); 
                    THIS34_tree = (Object)adaptor.create(THIS34);
                    adaptor.addChild(root_0, THIS34_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1011:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3680);
                    identifier35=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1012:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_primaryExpression3685);
                    xmlAttribute36=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute36.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1013:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3690);
                    literal37=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal37.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1014:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3695);
                    arrayLiteral38=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral38.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1015:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3700);
                    objectLiteral39=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral39.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1016:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3705);
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1019:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
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
            // JS.g:1020:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:1020:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3721); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3723);
            expression41=expression();
            _fsp--;

            stream_expression.add(expression41.getTree());
            RPAREN42=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3725); 
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
            // 1020:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:1020:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
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
    // JS.g:1023:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
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
            // JS.g:1024:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:1024:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3750); 
            stream_LBRACK.add(lb);

            // JS.g:1024:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
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
                    // JS.g:1024:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3754);
                    arrayItem43=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem43.getTree());
                    // JS.g:1024:26: ( COMMA ( arrayItem )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // JS.g:1024:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA44=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3758); 
                    	    stream_COMMA.add(COMMA44);

                    	    // JS.g:1024:34: ( arrayItem )?
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
                    	            // JS.g:1024:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3760);
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
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3769); 
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
            // 1025:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:1025:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:1025:28: ( arrayItem )*
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
    // JS.g:1028:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1029:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:1029:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:1029:4: (expr= assignmentExpression | {...}?)
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
                    new NoViableAltException("1029:4: (expr= assignmentExpression | {...}?)", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1029:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3797);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1029:34: {...}?
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
            // 1030:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1030:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1030:13: ( $expr)?
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
    // JS.g:1033:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA48=null;
        Token RBRACE50=null;
        objectPropertyInitializer_return objectPropertyInitializer47 = null;

        objectPropertyInitializer_return objectPropertyInitializer49 = null;


        Object lb_tree=null;
        Object COMMA48_tree=null;
        Object RBRACE50_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:1034:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) )
            // JS.g:1034:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3829); 
            stream_LBRACE.add(lb);

            // JS.g:1034:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EACH||(LA12_0>=GET && LA12_0<=SET)||(LA12_0>=WXML && LA12_0<=NAMESPACE)||LA12_0==AT||LA12_0==StringLiteral||LA12_0==Identifier||(LA12_0>=DecimalLiteral && LA12_0<=HexIntegerLiteral)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // JS.g:1034:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )*
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3833);
                    objectPropertyInitializer47=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer47.getTree());
                    // JS.g:1034:42: ( COMMA objectPropertyInitializer )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // JS.g:1034:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA48=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3837); 
                    	    stream_COMMA.add(COMMA48);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3839);
                    	    objectPropertyInitializer49=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE50=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3847); 
            stream_RBRACE.add(RBRACE50);


            // AST REWRITE
            // elements: objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1035:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
            {
                // JS.g:1035:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1035:30: ( objectPropertyInitializer )*
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
    // JS.g:1038:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair51 = null;

        getMethodDeclaration_return getMethodDeclaration52 = null;

        setMethodDeclaration_return setMethodDeclaration53 = null;



        try {
            // JS.g:1039:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt13=3;
            switch ( input.LA(1) ) {
            case GET:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==COLON) ) {
                    alt13=1;
                }
                else if ( (LA13_1==EACH||(LA13_1>=GET && LA13_1<=SET)||(LA13_1>=WXML && LA13_1<=NAMESPACE)||LA13_1==Identifier) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1038:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 13, 1, input);

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
                alt13=1;
                }
                break;
            case SET:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==COLON) ) {
                    alt13=1;
                }
                else if ( (LA13_3==EACH||(LA13_3>=GET && LA13_3<=SET)||(LA13_3>=WXML && LA13_3<=NAMESPACE)||LA13_3==Identifier) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1038:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1038:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // JS.g:1039:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3872);
                    nameValuePair51=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair51.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1040:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3879);
                    getMethodDeclaration52=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration52.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1041:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3885);
                    setMethodDeclaration53=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration53.getTree());

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
    // JS.g:1044:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON55=null;
        propertyName_return propertyName54 = null;

        assignmentExpression_return assignmentExpression56 = null;


        Object COLON55_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1045:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1045:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3898);
            propertyName54=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName54.getTree());
            COLON55=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3900); 
            stream_COLON.add(COLON55);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3902);
            assignmentExpression56=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression56.getTree());

            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1046:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1046:5: ^( NAMEDVALUE propertyName assignmentExpression )
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
    // JS.g:1049:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral58=null;
        identifier_return identifier57 = null;

        numericLiteral_return numericLiteral59 = null;

        xmlAttribute_return xmlAttribute60 = null;


        Object StringLiteral58_tree=null;

        try {
            // JS.g:1050:2: ( identifier | StringLiteral | numericLiteral | xmlAttribute )
            int alt14=4;
            switch ( input.LA(1) ) {
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt14=1;
                }
                break;
            case StringLiteral:
                {
                alt14=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt14=3;
                }
                break;
            case AT:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1049:1: propertyName : ( identifier | StringLiteral | numericLiteral | xmlAttribute );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // JS.g:1050:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3926);
                    identifier57=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier57.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1051:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral58=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3931); 
                    StringLiteral58_tree = (Object)adaptor.create(StringLiteral58);
                    adaptor.addChild(root_0, StringLiteral58_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1052:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3936);
                    numericLiteral59=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral59.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1053:4: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_propertyName3941);
                    xmlAttribute60=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute60.getTree());

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
    // JS.g:1065:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression61 = null;

        functionExpression_return functionExpression62 = null;

        newExpression_return newExpression63 = null;



        try {
            // JS.g:1066:2: ( primaryExpression | functionExpression | newExpression )
            int alt15=3;
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
                alt15=1;
                }
                break;
            case FUNCTION:
                {
                alt15=2;
                }
                break;
            case NEW:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // JS.g:1066:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3959);
                    primaryExpression61=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression61.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1067:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3964);
                    functionExpression62=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression62.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1068:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3969);
                    newExpression63=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression63.getTree());

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
    // JS.g:1071:1: newExpression : NEW memberExpression ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW64=null;
        memberExpression_return memberExpression65 = null;


        Object NEW64_tree=null;

        try {
            // JS.g:1072:2: ( NEW memberExpression )
            // JS.g:1072:4: NEW memberExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW64=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3980); 
            NEW64_tree = (Object)adaptor.create(NEW64);
            root_0 = (Object)adaptor.becomeRoot(NEW64_tree, root_0);

            pushFollow(FOLLOW_memberExpression_in_newExpression3983);
            memberExpression65=memberExpression();
            _fsp--;

            adaptor.addChild(root_0, memberExpression65.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1076:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN66=null;
        Token COMMA68=null;
        Token RPAREN70=null;
        assignmentExpression_return assignmentExpression67 = null;

        assignmentExpression_return assignmentExpression69 = null;


        Object LPAREN66_tree=null;
        Object COMMA68_tree=null;
        Object RPAREN70_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1077:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
            // JS.g:1077:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN66=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3996); 
            stream_LPAREN.add(LPAREN66);

            // JS.g:1077:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=NULL && LA17_0<=FALSE)||LA17_0==DELETE||(LA17_0>=EACH && LA17_0<=FUNCTION)||LA17_0==NEW||LA17_0==THIS||LA17_0==TYPEOF||LA17_0==VOID||(LA17_0>=GET && LA17_0<=NAMESPACE)||LA17_0==LBRACE||LA17_0==LPAREN||LA17_0==LBRACK||(LA17_0>=ADD && LA17_0<=SUB)||(LA17_0>=INC && LA17_0<=DEC)||(LA17_0>=NOT && LA17_0<=INV)||LA17_0==AT||(LA17_0>=XMLFragment && LA17_0<=XMLFragmentEnd)||LA17_0==StringLiteral||(LA17_0>=Identifier && LA17_0<=RegularExpressionLiteral)||(LA17_0>=DecimalLiteral && LA17_0<=HexIntegerLiteral)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // JS.g:1077:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments4000);
                    assignmentExpression67=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression67.getTree());
                    // JS.g:1077:34: ( COMMA assignmentExpression )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // JS.g:1077:36: COMMA assignmentExpression
                    	    {
                    	    COMMA68=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments4004); 
                    	    stream_COMMA.add(COMMA68);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments4006);
                    	    assignmentExpression69=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN70=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments4014); 
            stream_RPAREN.add(RPAREN70);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1078:2: -> ^( ARGS ( assignmentExpression )* )
            {
                // JS.g:1078:5: ^( ARGS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1078:13: ( assignmentExpression )*
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
    // JS.g:1081:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK73=null;
        Token RBRACK75=null;
        Token DOT76=null;
        Token DOTDOT78=null;
        Token COLONCOLON80=null;
        memberExpression_return memberExpression71 = null;

        arguments_return arguments72 = null;

        expression_return expression74 = null;

        rightHandSideExpression_return rightHandSideExpression77 = null;

        expression_return expression79 = null;

        expression_return expression81 = null;


        Object LBRACK73_tree=null;
        Object RBRACK75_tree=null;
        Object DOT76_tree=null;
        Object DOTDOT78_tree=null;
        Object COLONCOLON80_tree=null;
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
            // JS.g:1082:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1083:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1083:3: ( memberExpression -> memberExpression )
            // JS.g:1084:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4047);
            memberExpression71=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression71.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1084:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1086:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            loop18:
            do {
                int alt18=6;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt18=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt18=2;
                    }
                    break;
                case DOT:
                    {
                    alt18=3;
                    }
                    break;
                case DOTDOT:
                    {
                    alt18=4;
                    }
                    break;
                case COLONCOLON:
                    {
                    alt18=5;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // JS.g:1087:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression4068);
            	    arguments72=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments72.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1087:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1087:22: ^( CALL $leftHandSideExpression arguments )
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
            	    // JS.g:1088:7: LBRACK expression RBRACK
            	    {
            	    LBRACK73=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4093); 
            	    stream_LBRACK.add(LBRACK73);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4095);
            	    expression74=expression();
            	    _fsp--;

            	    stream_expression.add(expression74.getTree());
            	    RBRACK75=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4097); 
            	    stream_RBRACK.add(RBRACK75);


            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1088:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // JS.g:1088:36: ^( BYINDEX $leftHandSideExpression expression )
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
            	    // JS.g:1089:7: DOT rightHandSideExpression
            	    {
            	    DOT76=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4119); 
            	    stream_DOT.add(DOT76);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression4121);
            	    rightHandSideExpression77=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression77.getTree());

            	    // AST REWRITE
            	    // elements: rightHandSideExpression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1089:35: -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // JS.g:1089:38: ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
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
            	    // JS.g:1090:7: DOTDOT expression
            	    {
            	    DOTDOT78=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression4142); 
            	    stream_DOTDOT.add(DOTDOT78);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4144);
            	    expression79=expression();
            	    _fsp--;

            	    stream_expression.add(expression79.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1090:25: -> ^( ALLCHILDREN $leftHandSideExpression expression )
            	    {
            	        // JS.g:1090:28: ^( ALLCHILDREN $leftHandSideExpression expression )
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
            	    // JS.g:1091:7: COLONCOLON expression
            	    {
            	    COLONCOLON80=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression4163); 
            	    stream_COLONCOLON.add(COLONCOLON80);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4165);
            	    expression81=expression();
            	    _fsp--;

            	    stream_expression.add(expression81.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1091:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1091:32: ^( LOCALNAME $leftHandSideExpression expression )
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
            	    break loop18;
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
        catch (RuntimeException e) {
        	reportFailure(e);
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
    // JS.g:1095:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL85=null;
        parenExpression_return parenExpression82 = null;

        identifier_return identifier83 = null;

        xmlAttribute_return xmlAttribute84 = null;


        Object MUL85_tree=null;

        try {
            // JS.g:1096:3: ( parenExpression | identifier | xmlAttribute | MUL )
            int alt19=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt19=1;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt19=2;
                }
                break;
            case AT:
                {
                alt19=3;
                }
                break;
            case MUL:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1095:1: rightHandSideExpression : ( parenExpression | identifier | xmlAttribute | MUL );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // JS.g:1096:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4194);
                    parenExpression82=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression82.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1097:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4201);
                    identifier83=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier83.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1098:5: xmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_xmlAttribute_in_rightHandSideExpression4207);
                    xmlAttribute84=xmlAttribute();
                    _fsp--;

                    adaptor.addChild(root_0, xmlAttribute84.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1099:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL85=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4213); 
                    MUL85_tree = (Object)adaptor.create(MUL85);
                    adaptor.addChild(root_0, MUL85_tree);


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
    // JS.g:1112:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression86 = null;

        postfixOperator_return postfixOperator87 = null;



        try {
            // JS.g:1113:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1113:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4230);
            leftHandSideExpression86=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression86.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1113:95: ( postfixOperator )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==INC) ) {
                alt20=1;
            }
            else if ( (LA20_0==DEC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // JS.g:1113:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4236);
                    postfixOperator87=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator87.getTree(), root_0);

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
    // JS.g:1116:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1117:2: (op= INC | op= DEC )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INC) ) {
                alt21=1;
            }
            else if ( (LA21_0==DEC) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1116:1: postfixOperator : (op= INC | op= DEC );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // JS.g:1117:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4254); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1118:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4263); 
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
    // JS.g:1125:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        postfixExpression_return postfixExpression88 = null;

        unaryOperator_return unaryOperator89 = null;

        unaryExpression_return unaryExpression90 = null;



        try {
            // JS.g:1126:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=NULL && LA22_0<=FALSE)||(LA22_0>=EACH && LA22_0<=FUNCTION)||LA22_0==NEW||LA22_0==THIS||(LA22_0>=GET && LA22_0<=SET)||(LA22_0>=WXML && LA22_0<=NAMESPACE)||LA22_0==LBRACE||LA22_0==LPAREN||LA22_0==LBRACK||LA22_0==AT||(LA22_0>=XMLFragment && LA22_0<=XMLFragmentEnd)||LA22_0==StringLiteral||(LA22_0>=Identifier && LA22_0<=RegularExpressionLiteral)||(LA22_0>=DecimalLiteral && LA22_0<=HexIntegerLiteral)) ) {
                alt22=1;
            }
            else if ( (LA22_0==DELETE||LA22_0==TYPEOF||LA22_0==VOID||LA22_0==YIELD||(LA22_0>=ADD && LA22_0<=SUB)||(LA22_0>=INC && LA22_0<=DEC)||(LA22_0>=NOT && LA22_0<=INV)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1125:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // JS.g:1126:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4280);
                    postfixExpression88=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression88.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1127:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4285);
                    unaryOperator89=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator89.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4288);
                    unaryExpression90=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression90.getTree());

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
    // JS.g:1130:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE91=null;
        Token VOID92=null;
        Token TYPEOF93=null;
        Token INC94=null;
        Token DEC95=null;
        Token INV96=null;
        Token NOT97=null;
        Token YIELD98=null;

        Object op_tree=null;
        Object DELETE91_tree=null;
        Object VOID92_tree=null;
        Object TYPEOF93_tree=null;
        Object INC94_tree=null;
        Object DEC95_tree=null;
        Object INV96_tree=null;
        Object NOT97_tree=null;
        Object YIELD98_tree=null;

        try {
            // JS.g:1131:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt23=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt23=1;
                }
                break;
            case VOID:
                {
                alt23=2;
                }
                break;
            case TYPEOF:
                {
                alt23=3;
                }
                break;
            case INC:
                {
                alt23=4;
                }
                break;
            case DEC:
                {
                alt23=5;
                }
                break;
            case ADD:
                {
                alt23=6;
                }
                break;
            case SUB:
                {
                alt23=7;
                }
                break;
            case INV:
                {
                alt23=8;
                }
                break;
            case NOT:
                {
                alt23=9;
                }
                break;
            case YIELD:
                {
                alt23=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1130:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // JS.g:1131:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE91=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4300); 
                    DELETE91_tree = (Object)adaptor.create(DELETE91);
                    adaptor.addChild(root_0, DELETE91_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1132:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID92=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4305); 
                    VOID92_tree = (Object)adaptor.create(VOID92);
                    adaptor.addChild(root_0, VOID92_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1133:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF93=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4310); 
                    TYPEOF93_tree = (Object)adaptor.create(TYPEOF93);
                    adaptor.addChild(root_0, TYPEOF93_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1134:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC94=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4315); 
                    INC94_tree = (Object)adaptor.create(INC94);
                    adaptor.addChild(root_0, INC94_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1135:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC95=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4320); 
                    DEC95_tree = (Object)adaptor.create(DEC95);
                    adaptor.addChild(root_0, DEC95_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1136:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4327); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1137:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4336); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1138:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV96=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4343); 
                    INV96_tree = (Object)adaptor.create(INV96);
                    adaptor.addChild(root_0, INV96_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1139:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT97=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4348); 
                    NOT97_tree = (Object)adaptor.create(NOT97);
                    adaptor.addChild(root_0, NOT97_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1140:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD98=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4353); 
                    YIELD98_tree = (Object)adaptor.create(YIELD98);
                    adaptor.addChild(root_0, YIELD98_tree);


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
    // JS.g:1145:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT99=null;
        Token WXML100=null;
        Token NAMESPACE101=null;
        Token ASSIGN102=null;
        Token StringLiteral103=null;
        semic_return semic104 = null;


        Object DEFAULT99_tree=null;
        Object WXML100_tree=null;
        Object NAMESPACE101_tree=null;
        Object ASSIGN102_tree=null;
        Object StringLiteral103_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1146:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) )
            // JS.g:1146:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            DEFAULT99=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4367); 
            stream_DEFAULT.add(DEFAULT99);

            WXML100=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4369); 
            stream_WXML.add(WXML100);

            NAMESPACE101=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4371); 
            stream_NAMESPACE.add(NAMESPACE101);

            ASSIGN102=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4373); 
            stream_ASSIGN.add(ASSIGN102);

            StringLiteral103=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4375); 
            stream_StringLiteral.add(StringLiteral103);

            pushFollow(FOLLOW_semic_in_namespaceStatement4377);
            semic104=semic();
            _fsp--;

            stream_semic.add(semic104.getTree());

            // AST REWRITE
            // elements: ASSIGN, WXML, DEFAULT, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1147:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
            {
                // JS.g:1147:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1152:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set106=null;
        unaryExpression_return unaryExpression105 = null;

        unaryExpression_return unaryExpression107 = null;


        Object set106_tree=null;

        try {
            // JS.g:1153:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1153:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4409);
            unaryExpression105=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression105.getTree());
            // JS.g:1153:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=MUL && LA24_0<=MOD)||LA24_0==DIV) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // JS.g:1153:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set106=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set106), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4413);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4428);
            	    unaryExpression107=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression107.getTree());

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
    // JS.g:1160:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set109=null;
        multiplicativeExpression_return multiplicativeExpression108 = null;

        multiplicativeExpression_return multiplicativeExpression110 = null;


        Object set109_tree=null;

        try {
            // JS.g:1161:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1161:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4446);
            multiplicativeExpression108=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression108.getTree());
            // JS.g:1161:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=ADD && LA25_0<=SUB)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JS.g:1161:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set109=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set109), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4450);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4461);
            	    multiplicativeExpression110=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression110.getTree());

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
    // JS.g:1168:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set112=null;
        additiveExpression_return additiveExpression111 = null;

        additiveExpression_return additiveExpression113 = null;


        Object set112_tree=null;

        try {
            // JS.g:1169:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1169:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4480);
            additiveExpression111=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression111.getTree());
            // JS.g:1169:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=SHL && LA26_0<=SHU)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JS.g:1169:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set112=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set112), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4484);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4499);
            	    additiveExpression113=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression113.getTree());

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
    // JS.g:1176:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set115=null;
        shiftExpression_return shiftExpression114 = null;

        shiftExpression_return shiftExpression116 = null;


        Object set115_tree=null;

        try {
            // JS.g:1177:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1177:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4518);
            shiftExpression114=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression114.getTree());
            // JS.g:1177:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==INSTANCEOF||(LA27_0>=LT && LA27_0<=GTE)) ) {
                    alt27=1;
                }
                else if ( (LA27_0==IN) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1177:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set115=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set115), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4522);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4549);
            	    shiftExpression116=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression116.getTree());

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
    // JS.g:1180:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set118=null;
        shiftExpression_return shiftExpression117 = null;

        shiftExpression_return shiftExpression119 = null;


        Object set118_tree=null;

        try {
            // JS.g:1181:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1181:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4563);
            shiftExpression117=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression117.getTree());
            // JS.g:1181:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==INSTANCEOF||(LA28_0>=LT && LA28_0<=GTE)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1181:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set118=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set118), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4567);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4590);
            	    shiftExpression119=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression119.getTree());

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
    // JS.g:1188:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set121=null;
        relationalExpression_return relationalExpression120 = null;

        relationalExpression_return relationalExpression122 = null;


        Object set121_tree=null;

        try {
            // JS.g:1189:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1189:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4609);
            relationalExpression120=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression120.getTree());
            // JS.g:1189:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=EQ && LA29_0<=NSAME)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1189:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set121=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set121), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4613);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4632);
            	    relationalExpression122=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression122.getTree());

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
    // JS.g:1192:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;
        relationalExpressionNoIn_return relationalExpressionNoIn123 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn125 = null;


        Object set124_tree=null;

        try {
            // JS.g:1193:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1193:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4646);
            relationalExpressionNoIn123=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn123.getTree());
            // JS.g:1193:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=EQ && LA30_0<=NSAME)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1193:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set124=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set124), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4650);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4669);
            	    relationalExpressionNoIn125=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn125.getTree());

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
    // JS.g:1200:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND127=null;
        equalityExpression_return equalityExpression126 = null;

        equalityExpression_return equalityExpression128 = null;


        Object AND127_tree=null;

        try {
            // JS.g:1201:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1201:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4689);
            equalityExpression126=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression126.getTree());
            // JS.g:1201:23: ( AND equalityExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1201:25: AND equalityExpression
            	    {
            	    AND127=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4693); 
            	    AND127_tree = (Object)adaptor.create(AND127);
            	    root_0 = (Object)adaptor.becomeRoot(AND127_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4696);
            	    equalityExpression128=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression128.getTree());

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
    // JS.g:1204:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND130=null;
        equalityExpressionNoIn_return equalityExpressionNoIn129 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn131 = null;


        Object AND130_tree=null;

        try {
            // JS.g:1205:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1205:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4710);
            equalityExpressionNoIn129=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn129.getTree());
            // JS.g:1205:27: ( AND equalityExpressionNoIn )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==AND) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1205:29: AND equalityExpressionNoIn
            	    {
            	    AND130=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4714); 
            	    AND130_tree = (Object)adaptor.create(AND130);
            	    root_0 = (Object)adaptor.becomeRoot(AND130_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4717);
            	    equalityExpressionNoIn131=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn131.getTree());

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
    // JS.g:1208:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR133=null;
        bitwiseANDExpression_return bitwiseANDExpression132 = null;

        bitwiseANDExpression_return bitwiseANDExpression134 = null;


        Object XOR133_tree=null;

        try {
            // JS.g:1209:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1209:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4733);
            bitwiseANDExpression132=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression132.getTree());
            // JS.g:1209:25: ( XOR bitwiseANDExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==XOR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1209:27: XOR bitwiseANDExpression
            	    {
            	    XOR133=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4737); 
            	    XOR133_tree = (Object)adaptor.create(XOR133);
            	    root_0 = (Object)adaptor.becomeRoot(XOR133_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4740);
            	    bitwiseANDExpression134=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression134.getTree());

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
    // JS.g:1212:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR136=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn135 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn137 = null;


        Object XOR136_tree=null;

        try {
            // JS.g:1213:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1213:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4756);
            bitwiseANDExpressionNoIn135=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn135.getTree());
            // JS.g:1213:29: ( XOR bitwiseANDExpressionNoIn )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==XOR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1213:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR136=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4760); 
            	    XOR136_tree = (Object)adaptor.create(XOR136);
            	    root_0 = (Object)adaptor.becomeRoot(XOR136_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4763);
            	    bitwiseANDExpressionNoIn137=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn137.getTree());

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
    // JS.g:1216:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR139=null;
        bitwiseXORExpression_return bitwiseXORExpression138 = null;

        bitwiseXORExpression_return bitwiseXORExpression140 = null;


        Object OR139_tree=null;

        try {
            // JS.g:1217:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1217:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4778);
            bitwiseXORExpression138=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression138.getTree());
            // JS.g:1217:25: ( OR bitwiseXORExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==OR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1217:27: OR bitwiseXORExpression
            	    {
            	    OR139=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4782); 
            	    OR139_tree = (Object)adaptor.create(OR139);
            	    root_0 = (Object)adaptor.becomeRoot(OR139_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4785);
            	    bitwiseXORExpression140=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression140.getTree());

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
    // JS.g:1220:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR142=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn141 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn143 = null;


        Object OR142_tree=null;

        try {
            // JS.g:1221:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1221:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4800);
            bitwiseXORExpressionNoIn141=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn141.getTree());
            // JS.g:1221:29: ( OR bitwiseXORExpressionNoIn )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==OR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1221:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR142=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4804); 
            	    OR142_tree = (Object)adaptor.create(OR142);
            	    root_0 = (Object)adaptor.becomeRoot(OR142_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4807);
            	    bitwiseXORExpressionNoIn143=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn143.getTree());

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
    // JS.g:1228:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND145=null;
        bitwiseORExpression_return bitwiseORExpression144 = null;

        bitwiseORExpression_return bitwiseORExpression146 = null;


        Object LAND145_tree=null;

        try {
            // JS.g:1229:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1229:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4826);
            bitwiseORExpression144=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression144.getTree());
            // JS.g:1229:24: ( LAND bitwiseORExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LAND) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1229:26: LAND bitwiseORExpression
            	    {
            	    LAND145=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4830); 
            	    LAND145_tree = (Object)adaptor.create(LAND145);
            	    root_0 = (Object)adaptor.becomeRoot(LAND145_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4833);
            	    bitwiseORExpression146=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression146.getTree());

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
    // JS.g:1232:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND148=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn147 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn149 = null;


        Object LAND148_tree=null;

        try {
            // JS.g:1233:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1233:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4847);
            bitwiseORExpressionNoIn147=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn147.getTree());
            // JS.g:1233:28: ( LAND bitwiseORExpressionNoIn )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LAND) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1233:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND148=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4851); 
            	    LAND148_tree = (Object)adaptor.create(LAND148);
            	    root_0 = (Object)adaptor.becomeRoot(LAND148_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4854);
            	    bitwiseORExpressionNoIn149=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn149.getTree());

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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1236:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR151=null;
        logicalANDExpression_return logicalANDExpression150 = null;

        logicalANDExpression_return logicalANDExpression152 = null;


        Object LOR151_tree=null;

        try {
            // JS.g:1237:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1237:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4869);
            logicalANDExpression150=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression150.getTree());
            // JS.g:1237:25: ( LOR logicalANDExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LOR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JS.g:1237:27: LOR logicalANDExpression
            	    {
            	    LOR151=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4873); 
            	    LOR151_tree = (Object)adaptor.create(LOR151);
            	    root_0 = (Object)adaptor.becomeRoot(LOR151_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4876);
            	    logicalANDExpression152=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression152.getTree());

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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1240:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR154=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn153 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn155 = null;


        Object LOR154_tree=null;

        try {
            // JS.g:1241:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1241:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4891);
            logicalANDExpressionNoIn153=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn153.getTree());
            // JS.g:1241:29: ( LOR logicalANDExpressionNoIn )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JS.g:1241:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR154=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4895); 
            	    LOR154_tree = (Object)adaptor.create(LOR154);
            	    root_0 = (Object)adaptor.becomeRoot(LOR154_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4898);
            	    logicalANDExpressionNoIn155=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn155.getTree());

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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1248:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE157=null;
        Token COLON159=null;
        logicalORExpression_return logicalORExpression156 = null;

        assignmentExpression_return assignmentExpression158 = null;

        assignmentExpression_return assignmentExpression160 = null;


        Object QUE157_tree=null;
        Object COLON159_tree=null;

        try {
            // JS.g:1249:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1249:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4917);
            logicalORExpression156=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression156.getTree());
            // JS.g:1249:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==QUE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // JS.g:1249:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE157=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4921); 
                    QUE157_tree = (Object)adaptor.create(QUE157);
                    root_0 = (Object)adaptor.becomeRoot(QUE157_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4924);
                    assignmentExpression158=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression158.getTree());
                    COLON159=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4926); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4929);
                    assignmentExpression160=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression160.getTree());

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
    // JS.g:1252:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE162=null;
        Token COLON164=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn161 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn163 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn165 = null;


        Object QUE162_tree=null;
        Object COLON164_tree=null;

        try {
            // JS.g:1253:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1253:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4943);
            logicalORExpressionNoIn161=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn161.getTree());
            // JS.g:1253:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==QUE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // JS.g:1253:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE162=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4947); 
                    QUE162_tree = (Object)adaptor.create(QUE162);
                    root_0 = (Object)adaptor.becomeRoot(QUE162_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4950);
                    assignmentExpressionNoIn163=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn163.getTree());
                    COLON164=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4952); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4955);
                    assignmentExpressionNoIn165=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn165.getTree());

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
    // JS.g:1282:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator166 = null;

        assignmentExpression_return assignmentExpression167 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1287:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1287:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4983);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1288:2: ({...}? assignmentOperator assignmentExpression )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=ASSIGN && LA43_0<=XORASS)||LA43_0==DIVASS) ) {
                int LA43_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // JS.g:1288:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4990);
                    assignmentOperator166=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator166.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4993);
                    assignmentExpression167=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression167.getTree());

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
    // JS.g:1291:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set168=null;

        Object set168_tree=null;

        try {
            // JS.g:1292:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set168=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set168));
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
    // JS.g:1295:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator169 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn170 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1300:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1300:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5071);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1301:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
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
                    // JS.g:1301:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5078);
                    assignmentOperator169=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator169.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5081);
                    assignmentExpressionNoIn170=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn170.getTree());

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
    // JS.g:1308:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA171=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA171_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1309:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1309:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5103);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1309:32: ( COMMA exprs+= assignmentExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // JS.g:1309:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA171=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression5107); 
            	    stream_COMMA.add(COMMA171);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5111);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop45;
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
            // 1310:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1310:28: ^( CEXPR ( $exprs)+ )
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
            else // 1311:2: -> $exprs
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
    // JS.g:1314:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA172=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA172_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1315:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1315:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5148);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1315:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // JS.g:1315:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA172=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5152); 
            	    stream_COMMA.add(COMMA172);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5156);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
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
            // 1316:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1316:28: ^( CEXPR ( $exprs)+ )
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
            else // 1317:2: -> $exprs
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
    // JS.g:1342:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC173=null;
        Token EOF174=null;
        Token RBRACE175=null;
        Token EOL176=null;
        Token MultiLineComment177=null;

        Object SEMIC173_tree=null;
        Object EOF174_tree=null;
        Object RBRACE175_tree=null;
        Object EOL176_tree=null;
        Object MultiLineComment177_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1350:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt47=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt47=1;
                }
                break;
            case EOF:
                {
                alt47=2;
                }
                break;
            case RBRACE:
                {
                alt47=3;
                }
                break;
            case EOL:
                {
                alt47=4;
                }
                break;
            case MultiLineComment:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1342:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // JS.g:1350:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC173=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5207); 
                    SEMIC173_tree = (Object)adaptor.create(SEMIC173);
                    adaptor.addChild(root_0, SEMIC173_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1351:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF174=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5212); 
                    EOF174_tree = (Object)adaptor.create(EOF174);
                    adaptor.addChild(root_0, EOF174_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1352:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE175=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5217); 
                    RBRACE175_tree = (Object)adaptor.create(RBRACE175);
                    adaptor.addChild(root_0, RBRACE175_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1353:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL176=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5224); 
                    EOL176_tree = (Object)adaptor.create(EOL176);
                    adaptor.addChild(root_0, EOL176_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1353:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment177=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5228); 
                    MultiLineComment177_tree = (Object)adaptor.create(MultiLineComment177);
                    adaptor.addChild(root_0, MultiLineComment177_tree);


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
    // JS.g:1361:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block178 = null;

        statementTail_return statementTail179 = null;



        try {
            // JS.g:1366:2: ({...}? block | statementTail )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LBRACE) ) {
                int LA48_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1361:1: statement options {k=1; } : ({...}? block | statementTail );", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA48_0>=NULL && LA48_0<=BREAK)||(LA48_0>=CONTINUE && LA48_0<=DO)||(LA48_0>=FOR && LA48_0<=IF)||(LA48_0>=NEW && LA48_0<=NAMESPACE)||LA48_0==CONST||LA48_0==LPAREN||LA48_0==LBRACK||LA48_0==SEMIC||(LA48_0>=ADD && LA48_0<=SUB)||(LA48_0>=INC && LA48_0<=DEC)||(LA48_0>=NOT && LA48_0<=INV)||LA48_0==AT||(LA48_0>=XMLFragment && LA48_0<=XMLFragmentEnd)||LA48_0==StringLiteral||(LA48_0>=Identifier && LA48_0<=RegularExpressionLiteral)||(LA48_0>=DecimalLiteral && LA48_0<=HexIntegerLiteral)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1361:1: statement options {k=1; } : ({...}? block | statementTail );", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // JS.g:1366:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5257);
                    block178=block();
                    _fsp--;

                    adaptor.addChild(root_0, block178.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1367:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5262);
                    statementTail179=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail179.getTree());

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
    // JS.g:1370:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement180 = null;

        emptyStatement_return emptyStatement181 = null;

        expressionStatement_return expressionStatement182 = null;

        ifStatement_return ifStatement183 = null;

        iterationStatement_return iterationStatement184 = null;

        continueStatement_return continueStatement185 = null;

        breakStatement_return breakStatement186 = null;

        returnStatement_return returnStatement187 = null;

        withStatement_return withStatement188 = null;

        labelledStatement_return labelledStatement189 = null;

        switchStatement_return switchStatement190 = null;

        throwStatement_return throwStatement191 = null;

        tryStatement_return tryStatement192 = null;

        constStatement_return constStatement193 = null;

        namespaceStatement_return namespaceStatement194 = null;



        try {
            // JS.g:1371:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt49=15;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt49=1;
                }
                break;
            case SEMIC:
                {
                alt49=2;
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
                alt49=3;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                int LA49_4 = input.LA(2);

                if ( (LA49_4==COLON) ) {
                    alt49=10;
                }
                else if ( (LA49_4==EOF||(LA49_4>=IN && LA49_4<=INSTANCEOF)||(LA49_4>=RBRACE && LA49_4<=LPAREN)||LA49_4==LBRACK||(LA49_4>=DOT && LA49_4<=XOR)||(LA49_4>=LAND && LA49_4<=QUE)||(LA49_4>=ASSIGN && LA49_4<=DIVASS)||(LA49_4>=DOTDOT && LA49_4<=COLONCOLON)||(LA49_4>=EOL && LA49_4<=MultiLineComment)) ) {
                    alt49=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1370:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 49, 4, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt49=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt49=5;
                }
                break;
            case CONTINUE:
                {
                alt49=6;
                }
                break;
            case BREAK:
                {
                alt49=7;
                }
                break;
            case RETURN:
                {
                alt49=8;
                }
                break;
            case WITH:
                {
                alt49=9;
                }
                break;
            case SWITCH:
                {
                alt49=11;
                }
                break;
            case THROW:
                {
                alt49=12;
                }
                break;
            case TRY:
                {
                alt49=13;
                }
                break;
            case CONST:
                {
                alt49=14;
                }
                break;
            case DEFAULT:
                {
                alt49=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1370:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // JS.g:1371:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5274);
                    variableStatement180=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement180.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1372:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5279);
                    emptyStatement181=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement181.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1373:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5284);
                    expressionStatement182=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement182.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1374:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5289);
                    ifStatement183=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement183.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1375:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5294);
                    iterationStatement184=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement184.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1376:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5299);
                    continueStatement185=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement185.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1377:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5304);
                    breakStatement186=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement186.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1378:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5309);
                    returnStatement187=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement187.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1379:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5314);
                    withStatement188=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement188.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1380:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5319);
                    labelledStatement189=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement189.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1381:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5324);
                    switchStatement190=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement190.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1382:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5329);
                    throwStatement191=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement191.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1383:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5334);
                    tryStatement192=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement192.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1384:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5339);
                    constStatement193=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement193.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1385:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5344);
                    namespaceStatement194=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement194.getTree());

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
    // JS.g:1390:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE196=null;
        statement_return statement195 = null;


        Object lb_tree=null;
        Object RBRACE196_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1391:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1391:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5359); 
            stream_LBRACE.add(lb);

            // JS.g:1391:14: ( statement )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=NULL && LA50_0<=BREAK)||(LA50_0>=CONTINUE && LA50_0<=DO)||(LA50_0>=FOR && LA50_0<=IF)||(LA50_0>=NEW && LA50_0<=NAMESPACE)||LA50_0==CONST||LA50_0==LBRACE||LA50_0==LPAREN||LA50_0==LBRACK||LA50_0==SEMIC||(LA50_0>=ADD && LA50_0<=SUB)||(LA50_0>=INC && LA50_0<=DEC)||(LA50_0>=NOT && LA50_0<=INV)||LA50_0==AT||(LA50_0>=XMLFragment && LA50_0<=XMLFragmentEnd)||LA50_0==StringLiteral||(LA50_0>=Identifier && LA50_0<=RegularExpressionLiteral)||(LA50_0>=DecimalLiteral && LA50_0<=HexIntegerLiteral)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // JS.g:1391:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5361);
            	    statement195=statement();
            	    _fsp--;

            	    stream_statement.add(statement195.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            RBRACE196=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5364); 
            stream_RBRACE.add(RBRACE196);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1392:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1392:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1392:28: ( statement )*
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
    // JS.g:1399:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR197=null;
        Token COMMA199=null;
        variableDeclaration_return variableDeclaration198 = null;

        variableDeclaration_return variableDeclaration200 = null;

        semic_return semic201 = null;


        Object VAR197_tree=null;
        Object COMMA199_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1400:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1400:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR197=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5393); 
            stream_VAR.add(VAR197);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5395);
            variableDeclaration198=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration198.getTree());
            // JS.g:1400:28: ( COMMA variableDeclaration )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // JS.g:1400:30: COMMA variableDeclaration
            	    {
            	    COMMA199=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5399); 
            	    stream_COMMA.add(COMMA199);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5401);
            	    variableDeclaration200=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration200.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5406);
            semic201=semic();
            _fsp--;

            stream_semic.add(semic201.getTree());

            // AST REWRITE
            // elements: VAR, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1401:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1401:5: ^( VAR ( variableDeclaration )+ )
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
    // JS.g:1404:1: typeRef : identifier ;
    public final typeRef_return typeRef() throws RecognitionException {
        typeRef_return retval = new typeRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier202 = null;



        try {
            // JS.g:1405:2: ( identifier )
            // JS.g:1405:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_typeRef5429);
            identifier202=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier202.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1408:1: variableDeclaration : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON204=null;
        Token ASSIGN206=null;
        identifier_return identifier203 = null;

        typeRef_return typeRef205 = null;

        assignmentExpression_return assignmentExpression207 = null;


        Object COLON204_tree=null;
        Object ASSIGN206_tree=null;

        try {
            // JS.g:1409:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )? )
            // JS.g:1409:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5440);
            identifier203=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier203.getTree(), root_0);
            // JS.g:1409:16: ({...}? => COLON typeRef )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COLON) && ( isTypeInformationEnabled() )) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // JS.g:1409:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclaration", " isTypeInformationEnabled() ");
                    }
                    COLON204=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclaration5448); 
                    COLON204_tree = (Object)adaptor.create(COLON204);
                    adaptor.addChild(root_0, COLON204_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclaration5450);
                    typeRef205=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef205.getTree());

                    }
                    break;

            }

            // JS.g:1409:69: ( ASSIGN assignmentExpression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ASSIGN) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // JS.g:1409:71: ASSIGN assignmentExpression
                    {
                    ASSIGN206=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5457); 
                    ASSIGN206_tree = (Object)adaptor.create(ASSIGN206);
                    adaptor.addChild(root_0, ASSIGN206_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5459);
                    assignmentExpression207=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression207.getTree());

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
    // JS.g:1412:1: variableDeclarationNoIn : identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON209=null;
        Token ASSIGN211=null;
        identifier_return identifier208 = null;

        typeRef_return typeRef210 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn212 = null;


        Object COLON209_tree=null;
        Object ASSIGN211_tree=null;

        try {
            // JS.g:1413:2: ( identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1413:4: identifier ({...}? => COLON typeRef )? ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5474);
            identifier208=identifier();
            _fsp--;

            root_0 = (Object)adaptor.becomeRoot(identifier208.getTree(), root_0);
            // JS.g:1413:16: ({...}? => COLON typeRef )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COLON) && ( isTypeInformationEnabled() )) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // JS.g:1413:18: {...}? => COLON typeRef
                    {
                    if ( !( isTypeInformationEnabled() ) ) {
                        throw new FailedPredicateException(input, "variableDeclarationNoIn", " isTypeInformationEnabled() ");
                    }
                    COLON209=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_variableDeclarationNoIn5482); 
                    COLON209_tree = (Object)adaptor.create(COLON209);
                    adaptor.addChild(root_0, COLON209_tree);

                    pushFollow(FOLLOW_typeRef_in_variableDeclarationNoIn5484);
                    typeRef210=typeRef();
                    _fsp--;

                    adaptor.addChild(root_0, typeRef210.getTree());

                    }
                    break;

            }

            // JS.g:1413:69: ( ASSIGN assignmentExpressionNoIn )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ASSIGN) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // JS.g:1413:71: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN211=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5491); 
                    ASSIGN211_tree = (Object)adaptor.create(ASSIGN211);
                    adaptor.addChild(root_0, ASSIGN211_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5493);
                    assignmentExpressionNoIn212=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn212.getTree());

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
    // JS.g:1416:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST213=null;
        Token COMMA215=null;
        variableDeclaration_return variableDeclaration214 = null;

        variableDeclaration_return variableDeclaration216 = null;

        semic_return semic217 = null;


        Object CONST213_tree=null;
        Object COMMA215_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1417:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1417:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST213=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5508); 
            stream_CONST.add(CONST213);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5510);
            variableDeclaration214=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration214.getTree());
            // JS.g:1417:31: ( COMMA variableDeclaration )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // JS.g:1417:33: COMMA variableDeclaration
            	    {
            	    COMMA215=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5514); 
            	    stream_COMMA.add(COMMA215);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5516);
            	    variableDeclaration216=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration216.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5521);
            semic217=semic();
            _fsp--;

            stream_semic.add(semic217.getTree());

            // AST REWRITE
            // elements: CONST, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1418:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1418:6: ^( CONST ( variableDeclaration )+ )
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
    // JS.g:1425:1: emptyStatement : SEMIC ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC218=null;

        Object SEMIC218_tree=null;

        try {
            // JS.g:1426:2: ( SEMIC )
            // JS.g:1426:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC218=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5551); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1439:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression219 = null;

        semic_return semic220 = null;



        try {
            // JS.g:1440:2: ( expression semic )
            // JS.g:1440:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5570);
            expression219=expression();
            _fsp--;

            adaptor.addChild(root_0, expression219.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5572);
            semic220=semic();
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
    // JS.g:1447:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF221=null;
        Token LPAREN222=null;
        Token RPAREN224=null;
        Token ELSE226=null;
        expression_return expression223 = null;

        statement_return statement225 = null;

        statement_return statement227 = null;


        Object IF221_tree=null;
        Object LPAREN222_tree=null;
        Object RPAREN224_tree=null;
        Object ELSE226_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1449:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1449:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF221=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5590); 
            stream_IF.add(IF221);

            LPAREN222=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5592); 
            stream_LPAREN.add(LPAREN222);

            pushFollow(FOLLOW_expression_in_ifStatement5594);
            expression223=expression();
            _fsp--;

            stream_expression.add(expression223.getTree());
            RPAREN224=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5596); 
            stream_RPAREN.add(RPAREN224);

            pushFollow(FOLLOW_statement_in_ifStatement5598);
            statement225=statement();
            _fsp--;

            stream_statement.add(statement225.getTree());
            // JS.g:1449:42: ({...}? ELSE statement )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ELSE) ) {
                int LA57_1 = input.LA(2);

                if ( ( input.LA(1) == ELSE ) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // JS.g:1449:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE226=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5604); 
                    stream_ELSE.add(ELSE226);

                    pushFollow(FOLLOW_statement_in_ifStatement5606);
                    statement227=statement();
                    _fsp--;

                    stream_statement.add(statement227.getTree());

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
            // 1450:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1450:5: ^( IF expression ( statement )+ )
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
    // JS.g:1457:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement228 = null;

        whileStatement_return whileStatement229 = null;

        forEachStatement_return forEachStatement230 = null;

        forStatement_return forStatement231 = null;



        try {
            // JS.g:1458:2: ( doStatement | whileStatement | forEachStatement | forStatement )
            int alt58=4;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt58=1;
                }
                break;
            case WHILE:
                {
                alt58=2;
                }
                break;
            case FOR:
                {
                int LA58_3 = input.LA(2);

                if ( (LA58_3==LPAREN) ) {
                    alt58=4;
                }
                else if ( (LA58_3==EACH) ) {
                    alt58=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1457:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 58, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1457:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // JS.g:1458:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5639);
                    doStatement228=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement228.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1459:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5644);
                    whileStatement229=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement229.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1460:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5649);
                    forEachStatement230=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement230.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1461:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5654);
                    forStatement231=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement231.getTree());

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
    // JS.g:1464:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO232=null;
        Token WHILE234=null;
        Token LPAREN235=null;
        Token RPAREN237=null;
        statement_return statement233 = null;

        expression_return expression236 = null;

        semic_return semic238 = null;


        Object DO232_tree=null;
        Object WHILE234_tree=null;
        Object LPAREN235_tree=null;
        Object RPAREN237_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1465:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1465:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO232=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5666); 
            stream_DO.add(DO232);

            pushFollow(FOLLOW_statement_in_doStatement5668);
            statement233=statement();
            _fsp--;

            stream_statement.add(statement233.getTree());
            WHILE234=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5670); 
            stream_WHILE.add(WHILE234);

            LPAREN235=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5672); 
            stream_LPAREN.add(LPAREN235);

            pushFollow(FOLLOW_expression_in_doStatement5674);
            expression236=expression();
            _fsp--;

            stream_expression.add(expression236.getTree());
            RPAREN237=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5676); 
            stream_RPAREN.add(RPAREN237);

            pushFollow(FOLLOW_semic_in_doStatement5678);
            semic238=semic();
            _fsp--;

            stream_semic.add(semic238.getTree());

            // AST REWRITE
            // elements: expression, DO, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1466:2: -> ^( DO statement expression )
            {
                // JS.g:1466:5: ^( DO statement expression )
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
    // JS.g:1469:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE239=null;
        Token LPAREN240=null;
        Token RPAREN242=null;
        expression_return expression241 = null;

        statement_return statement243 = null;


        Object WHILE239_tree=null;
        Object LPAREN240_tree=null;
        Object RPAREN242_tree=null;

        try {
            // JS.g:1470:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1470:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE239=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5703); 
            WHILE239_tree = (Object)adaptor.create(WHILE239);
            root_0 = (Object)adaptor.becomeRoot(WHILE239_tree, root_0);

            LPAREN240=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5706); 
            pushFollow(FOLLOW_expression_in_whileStatement5709);
            expression241=expression();
            _fsp--;

            adaptor.addChild(root_0, expression241.getTree());
            RPAREN242=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5711); 
            pushFollow(FOLLOW_statement_in_whileStatement5714);
            statement243=statement();
            _fsp--;

            adaptor.addChild(root_0, statement243.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1515:1: forEachStatement : forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token forKeyword=null;
        Token EACH244=null;
        Token LPAREN245=null;
        Token RPAREN247=null;
        forEachControl_return forEachControl246 = null;

        statement_return statement248 = null;


        Object forKeyword_tree=null;
        Object EACH244_tree=null;
        Object LPAREN245_tree=null;
        Object RPAREN247_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1516:3: (forKeyword= FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH[$forKeyword] forEachControl statement ) )
            // JS.g:1516:5: forKeyword= FOR EACH LPAREN forEachControl RPAREN statement
            {
            forKeyword=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5731); 
            stream_FOR.add(forKeyword);

            EACH244=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5733); 
            stream_EACH.add(EACH244);

            LPAREN245=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5735); 
            stream_LPAREN.add(LPAREN245);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5737);
            forEachControl246=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl246.getTree());
            RPAREN247=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5739); 
            stream_RPAREN.add(RPAREN247);

            pushFollow(FOLLOW_statement_in_forEachStatement5741);
            statement248=statement();
            _fsp--;

            stream_statement.add(statement248.getTree());

            // AST REWRITE
            // elements: statement, forEachControl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1517:4: -> ^( FOREACH[$forKeyword] forEachControl statement )
            {
                // JS.g:1517:7: ^( FOREACH[$forKeyword] forEachControl statement )
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1520:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar249 = null;

        forControlExpression_return forControlExpression250 = null;



        try {
            // JS.g:1521:3: ( forControlVar | forControlExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==VAR) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=NULL && LA59_0<=FALSE)||LA59_0==DELETE||(LA59_0>=EACH && LA59_0<=FUNCTION)||LA59_0==NEW||LA59_0==THIS||LA59_0==TYPEOF||LA59_0==VOID||(LA59_0>=GET && LA59_0<=NAMESPACE)||LA59_0==LBRACE||LA59_0==LPAREN||LA59_0==LBRACK||(LA59_0>=ADD && LA59_0<=SUB)||(LA59_0>=INC && LA59_0<=DEC)||(LA59_0>=NOT && LA59_0<=INV)||LA59_0==AT||(LA59_0>=XMLFragment && LA59_0<=XMLFragmentEnd)||LA59_0==StringLiteral||(LA59_0>=Identifier && LA59_0<=RegularExpressionLiteral)||(LA59_0>=DecimalLiteral && LA59_0<=HexIntegerLiteral)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1520:1: forEachControl : ( forControlVar | forControlExpression );", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // JS.g:1521:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5769);
                    forControlVar249=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar249.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1522:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5775);
                    forControlExpression250=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression250.getTree());

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
    // JS.g:1525:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR251=null;
        Token LPAREN252=null;
        Token RPAREN254=null;
        forControl_return forControl253 = null;

        statement_return statement255 = null;


        Object FOR251_tree=null;
        Object LPAREN252_tree=null;
        Object RPAREN254_tree=null;

        try {
            // JS.g:1526:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1526:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR251=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5787); 
            FOR251_tree = (Object)adaptor.create(FOR251);
            root_0 = (Object)adaptor.becomeRoot(FOR251_tree, root_0);

            LPAREN252=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5790); 
            pushFollow(FOLLOW_forControl_in_forStatement5793);
            forControl253=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl253.getTree());
            RPAREN254=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5795); 
            pushFollow(FOLLOW_statement_in_forStatement5798);
            statement255=statement();
            _fsp--;

            adaptor.addChild(root_0, statement255.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1529:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar256 = null;

        forControlExpression_return forControlExpression257 = null;

        forControlSemic_return forControlSemic258 = null;



        try {
            // JS.g:1530:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt60=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt60=1;
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
                alt60=2;
                }
                break;
            case SEMIC:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1529:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // JS.g:1530:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5809);
                    forControlVar256=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar256.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1531:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5814);
                    forControlExpression257=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression257.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1532:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5819);
                    forControlSemic258=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic258.getTree());

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
    // JS.g:1535:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR259=null;
        Token IN261=null;
        Token COMMA263=null;
        Token SEMIC265=null;
        Token SEMIC266=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn260 = null;

        expression_return expression262 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn264 = null;


        Object VAR259_tree=null;
        Object IN261_tree=null;
        Object COMMA263_tree=null;
        Object SEMIC265_tree=null;
        Object SEMIC266_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1536:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1536:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR259=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar5830); 
            stream_VAR.add(VAR259);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5832);
            variableDeclarationNoIn260=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn260.getTree());
            // JS.g:1537:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==IN) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=SEMIC && LA64_0<=COMMA)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1537:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // JS.g:1538:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1538:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1539:4: IN expression
                    {
                    IN261=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar5844); 
                    stream_IN.add(IN261);

                    pushFollow(FOLLOW_expression_in_forControlVar5846);
                    expression262=expression();
                    _fsp--;

                    stream_expression.add(expression262.getTree());

                    // AST REWRITE
                    // elements: VAR, expression, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1540:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1540:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1540:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1540:51: ^( EXPR expression )
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
                    // JS.g:1543:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1543:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1544:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1544:4: ( COMMA variableDeclarationNoIn )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // JS.g:1544:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA263=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5892); 
                    	    stream_COMMA.add(COMMA263);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5894);
                    	    variableDeclarationNoIn264=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn264.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    SEMIC265=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5899); 
                    stream_SEMIC.add(SEMIC265);

                    // JS.g:1544:48: (ex1= expression )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=NULL && LA62_0<=FALSE)||LA62_0==DELETE||(LA62_0>=EACH && LA62_0<=FUNCTION)||LA62_0==NEW||LA62_0==THIS||LA62_0==TYPEOF||LA62_0==VOID||(LA62_0>=GET && LA62_0<=NAMESPACE)||LA62_0==LBRACE||LA62_0==LPAREN||LA62_0==LBRACK||(LA62_0>=ADD && LA62_0<=SUB)||(LA62_0>=INC && LA62_0<=DEC)||(LA62_0>=NOT && LA62_0<=INV)||LA62_0==AT||(LA62_0>=XMLFragment && LA62_0<=XMLFragmentEnd)||LA62_0==StringLiteral||(LA62_0>=Identifier && LA62_0<=RegularExpressionLiteral)||(LA62_0>=DecimalLiteral && LA62_0<=HexIntegerLiteral)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // JS.g:1544:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5903);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC266=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5906); 
                    stream_SEMIC.add(SEMIC266);

                    // JS.g:1544:70: (ex2= expression )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||(LA63_0>=EACH && LA63_0<=FUNCTION)||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||(LA63_0>=GET && LA63_0<=NAMESPACE)||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||LA63_0==AT||(LA63_0>=XMLFragment && LA63_0<=XMLFragmentEnd)||LA63_0==StringLiteral||(LA63_0>=Identifier && LA63_0<=RegularExpressionLiteral)||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // JS.g:1544:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5910);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex1, VAR, ex2, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1545:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1545:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1545:18: ^( VAR ( variableDeclarationNoIn )+ )
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
                        // JS.g:1545:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1545:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1545:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1545:76: ( $ex2)?
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
    // JS.g:1550:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN267=null;
        Token SEMIC268=null;
        Token SEMIC269=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN267_tree=null;
        Object SEMIC268_tree=null;
        Object SEMIC269_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1555:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1555:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5976);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1556:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IN) ) {
                alt67=1;
            }
            else if ( (LA67_0==SEMIC) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1556:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // JS.g:1557:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1557:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1558:4: IN ex2= expression
                    {
                    IN267=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression5991); 
                    stream_IN.add(IN267);

                    pushFollow(FOLLOW_expression_in_forControlExpression5995);
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
                    // 1559:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1559:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1559:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1559:33: ^( EXPR $ex2)
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
                    // JS.g:1562:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1562:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1563:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC268=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6041); 
                    stream_SEMIC.add(SEMIC268);

                    // JS.g:1563:13: (ex2= expression )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=NULL && LA65_0<=FALSE)||LA65_0==DELETE||(LA65_0>=EACH && LA65_0<=FUNCTION)||LA65_0==NEW||LA65_0==THIS||LA65_0==TYPEOF||LA65_0==VOID||(LA65_0>=GET && LA65_0<=NAMESPACE)||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)||LA65_0==AT||(LA65_0>=XMLFragment && LA65_0<=XMLFragmentEnd)||LA65_0==StringLiteral||(LA65_0>=Identifier && LA65_0<=RegularExpressionLiteral)||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // JS.g:1563:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6045);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC269=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6048); 
                    stream_SEMIC.add(SEMIC269);

                    // JS.g:1563:35: (ex3= expression )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==DELETE||(LA66_0>=EACH && LA66_0<=FUNCTION)||LA66_0==NEW||LA66_0==THIS||LA66_0==TYPEOF||LA66_0==VOID||(LA66_0>=GET && LA66_0<=NAMESPACE)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||LA66_0==AT||(LA66_0>=XMLFragment && LA66_0<=XMLFragmentEnd)||LA66_0==StringLiteral||(LA66_0>=Identifier && LA66_0<=RegularExpressionLiteral)||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // JS.g:1563:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6052);
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
                    // 1564:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1564:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1564:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1564:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1564:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1564:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1564:57: ( $ex3)?
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
    // JS.g:1569:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC270=null;
        Token SEMIC271=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC270_tree=null;
        Object SEMIC271_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1570:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1570:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC270=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6111); 
            stream_SEMIC.add(SEMIC270);

            // JS.g:1570:13: (ex1= expression )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=NULL && LA68_0<=FALSE)||LA68_0==DELETE||(LA68_0>=EACH && LA68_0<=FUNCTION)||LA68_0==NEW||LA68_0==THIS||LA68_0==TYPEOF||LA68_0==VOID||(LA68_0>=GET && LA68_0<=NAMESPACE)||LA68_0==LBRACE||LA68_0==LPAREN||LA68_0==LBRACK||(LA68_0>=ADD && LA68_0<=SUB)||(LA68_0>=INC && LA68_0<=DEC)||(LA68_0>=NOT && LA68_0<=INV)||LA68_0==AT||(LA68_0>=XMLFragment && LA68_0<=XMLFragmentEnd)||LA68_0==StringLiteral||(LA68_0>=Identifier && LA68_0<=RegularExpressionLiteral)||(LA68_0>=DecimalLiteral && LA68_0<=HexIntegerLiteral)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // JS.g:1570:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6115);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC271=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6118); 
            stream_SEMIC.add(SEMIC271);

            // JS.g:1570:35: (ex2= expression )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==DELETE||(LA69_0>=EACH && LA69_0<=FUNCTION)||LA69_0==NEW||LA69_0==THIS||LA69_0==TYPEOF||LA69_0==VOID||(LA69_0>=GET && LA69_0<=NAMESPACE)||LA69_0==LBRACE||LA69_0==LPAREN||LA69_0==LBRACK||(LA69_0>=ADD && LA69_0<=SUB)||(LA69_0>=INC && LA69_0<=DEC)||(LA69_0>=NOT && LA69_0<=INV)||LA69_0==AT||(LA69_0>=XMLFragment && LA69_0<=XMLFragmentEnd)||LA69_0==StringLiteral||(LA69_0>=Identifier && LA69_0<=RegularExpressionLiteral)||(LA69_0>=DecimalLiteral && LA69_0<=HexIntegerLiteral)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // JS.g:1570:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6122);
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
            // 1571:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1571:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1571:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1571:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1571:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1571:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1571:50: ( $ex2)?
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
    // JS.g:1583:1: continueStatement : CONTINUE ( Identifier )? semic ;
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
            // JS.g:1584:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1584:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE272=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6176); 
            CONTINUE272_tree = (Object)adaptor.create(CONTINUE272);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE272_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1584:67: ( Identifier )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Identifier) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // JS.g:1584:67: Identifier
                    {
                    Identifier273=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6181); 
                    Identifier273_tree = (Object)adaptor.create(Identifier273);
                    adaptor.addChild(root_0, Identifier273_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6184);
            semic274=semic();
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
    // JS.g:1596:1: breakStatement : BREAK ( Identifier )? semic ;
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
            // JS.g:1597:2: ( BREAK ( Identifier )? semic )
            // JS.g:1597:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK275=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6203); 
            BREAK275_tree = (Object)adaptor.create(BREAK275);
            root_0 = (Object)adaptor.becomeRoot(BREAK275_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1597:64: ( Identifier )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Identifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // JS.g:1597:64: Identifier
                    {
                    Identifier276=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6208); 
                    Identifier276_tree = (Object)adaptor.create(Identifier276);
                    adaptor.addChild(root_0, Identifier276_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6211);
            semic277=semic();
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
    // JS.g:1617:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN278=null;
        expression_return expression279 = null;

        semic_return semic280 = null;


        Object RETURN278_tree=null;

        try {
            // JS.g:1618:2: ( RETURN ( expression )? semic )
            // JS.g:1618:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN278=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6230); 
            RETURN278_tree = (Object)adaptor.create(RETURN278);
            root_0 = (Object)adaptor.becomeRoot(RETURN278_tree, root_0);

             promoteEOL(null); 
            // JS.g:1618:34: ( expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=NULL && LA72_0<=FALSE)||LA72_0==DELETE||(LA72_0>=EACH && LA72_0<=FUNCTION)||LA72_0==NEW||LA72_0==THIS||LA72_0==TYPEOF||LA72_0==VOID||(LA72_0>=GET && LA72_0<=NAMESPACE)||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||LA72_0==AT||(LA72_0>=XMLFragment && LA72_0<=XMLFragmentEnd)||LA72_0==StringLiteral||(LA72_0>=Identifier && LA72_0<=RegularExpressionLiteral)||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // JS.g:1618:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6235);
                    expression279=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression279.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6238);
            semic280=semic();
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
    // JS.g:1625:1: withStatement : WITH LPAREN expression RPAREN statement ;
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
            // JS.g:1626:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1626:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH281=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6255); 
            WITH281_tree = (Object)adaptor.create(WITH281);
            root_0 = (Object)adaptor.becomeRoot(WITH281_tree, root_0);

            LPAREN282=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6258); 
            pushFollow(FOLLOW_expression_in_withStatement6261);
            expression283=expression();
            _fsp--;

            adaptor.addChild(root_0, expression283.getTree());
            RPAREN284=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6263); 
            pushFollow(FOLLOW_statement_in_withStatement6266);
            statement285=statement();
            _fsp--;

            adaptor.addChild(root_0, statement285.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1633:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
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

        	int defaultClauseCount = 0;

        try {
            // JS.g:1638:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // JS.g:1638:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH286=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6287); 
            stream_SWITCH.add(SWITCH286);

            LPAREN287=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6289); 
            stream_LPAREN.add(LPAREN287);

            pushFollow(FOLLOW_expression_in_switchStatement6291);
            expression288=expression();
            _fsp--;

            stream_expression.add(expression288.getTree());
            RPAREN289=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6293); 
            stream_RPAREN.add(RPAREN289);

            LBRACE290=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6295); 
            stream_LBRACE.add(LBRACE290);

            // JS.g:1638:43: ({...}? => defaultClause | caseClause )*
            loop73:
            do {
                int alt73=3;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==DEFAULT) && ( defaultClauseCount == 0 )) {
                    alt73=1;
                }
                else if ( (LA73_0==CASE) ) {
                    alt73=2;
                }


                switch (alt73) {
            	case 1 :
            	    // JS.g:1638:45: {...}? => defaultClause
            	    {
            	    if ( !( defaultClauseCount == 0 ) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6302);
            	    defaultClause291=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause291.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1638:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6308);
            	    caseClause292=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause292.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            RBRACE293=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6313); 
            stream_RBRACE.add(RBRACE293);


            // AST REWRITE
            // elements: expression, caseClause, defaultClause, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1639:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // JS.g:1639:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1639:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1639:41: ( caseClause )*
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
    // JS.g:1642:1: caseClause : CASE expression COLON ( statement )* ;
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
            // JS.g:1643:2: ( CASE expression COLON ( statement )* )
            // JS.g:1643:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE294=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6341); 
            CASE294_tree = (Object)adaptor.create(CASE294);
            root_0 = (Object)adaptor.becomeRoot(CASE294_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6344);
            expression295=expression();
            _fsp--;

            adaptor.addChild(root_0, expression295.getTree());
            COLON296=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6346); 
            // JS.g:1643:28: ( statement )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==DEFAULT) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==WXML) ) {
                        alt74=1;
                    }


                }
                else if ( ((LA74_0>=NULL && LA74_0<=BREAK)||LA74_0==CONTINUE||(LA74_0>=DELETE && LA74_0<=DO)||(LA74_0>=FOR && LA74_0<=IF)||(LA74_0>=NEW && LA74_0<=NAMESPACE)||LA74_0==CONST||LA74_0==LBRACE||LA74_0==LPAREN||LA74_0==LBRACK||LA74_0==SEMIC||(LA74_0>=ADD && LA74_0<=SUB)||(LA74_0>=INC && LA74_0<=DEC)||(LA74_0>=NOT && LA74_0<=INV)||LA74_0==AT||(LA74_0>=XMLFragment && LA74_0<=XMLFragmentEnd)||LA74_0==StringLiteral||(LA74_0>=Identifier && LA74_0<=RegularExpressionLiteral)||(LA74_0>=DecimalLiteral && LA74_0<=HexIntegerLiteral)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // JS.g:1643:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6349);
            	    statement297=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement297.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // JS.g:1646:1: defaultClause : DEFAULT COLON ( statement )* ;
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
            // JS.g:1647:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1647:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT298=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6362); 
            DEFAULT298_tree = (Object)adaptor.create(DEFAULT298);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT298_tree, root_0);

            COLON299=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6365); 
            // JS.g:1647:20: ( statement )*
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
            	    // JS.g:1647:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6368);
            	    statement300=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement300.getTree());

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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1654:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
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
            // JS.g:1655:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1655:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6385);
            identifier301=identifier();
            _fsp--;

            stream_identifier.add(identifier301.getTree());
            COLON302=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6387); 
            stream_COLON.add(COLON302);

            pushFollow(FOLLOW_statement_in_labelledStatement6389);
            statement303=statement();
            _fsp--;

            stream_statement.add(statement303.getTree());

            // AST REWRITE
            // elements: identifier, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1656:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1656:5: ^( LABELLED identifier statement )
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
    // JS.g:1678:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW304=null;
        expression_return expression305 = null;

        semic_return semic306 = null;


        Object THROW304_tree=null;

        try {
            // JS.g:1679:2: ( THROW expression semic )
            // JS.g:1679:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW304=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6420); 
            THROW304_tree = (Object)adaptor.create(THROW304);
            root_0 = (Object)adaptor.becomeRoot(THROW304_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6425);
            expression305=expression();
            _fsp--;

            adaptor.addChild(root_0, expression305.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6427);
            semic306=semic();
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
    // JS.g:1686:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
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
            // JS.g:1687:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1687:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY307=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6444); 
            TRY307_tree = (Object)adaptor.create(TRY307);
            root_0 = (Object)adaptor.becomeRoot(TRY307_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6447);
            block308=block();
            _fsp--;

            adaptor.addChild(root_0, block308.getTree());
            // JS.g:1687:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CATCH) ) {
                alt78=1;
            }
            else if ( (LA78_0==FINALLY) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1687:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // JS.g:1687:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1687:17: ( catchClause )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==CATCH) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // JS.g:1687:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6451);
                    	    catchClause309=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause309.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // JS.g:1687:30: ( finallyClause )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==FINALLY) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // JS.g:1687:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6454);
                            finallyClause310=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause310.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1687:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6459);
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
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1690:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
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
            // JS.g:1691:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1691:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH312=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6473); 
            CATCH312_tree = (Object)adaptor.create(CATCH312);
            root_0 = (Object)adaptor.becomeRoot(CATCH312_tree, root_0);

            LPAREN313=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6476); 
            pushFollow(FOLLOW_identifier_in_catchClause6479);
            identifier314=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier314.getTree());
            // JS.g:1691:30: ( catchFilter )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==IF) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // JS.g:1691:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6481);
                    catchFilter315=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter315.getTree());

                    }
                    break;

            }

            RPAREN316=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6484); 
            pushFollow(FOLLOW_block_in_catchClause6487);
            block317=block();
            _fsp--;

            adaptor.addChild(root_0, block317.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1694:1: catchFilter : IF instanceofExpression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF318=null;
        instanceofExpression_return instanceofExpression319 = null;


        Object IF318_tree=null;

        try {
            // JS.g:1695:3: ( IF instanceofExpression )
            // JS.g:1695:5: IF instanceofExpression
            {
            root_0 = (Object)adaptor.nil();

            IF318=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6500); 
            IF318_tree = (Object)adaptor.create(IF318);
            root_0 = (Object)adaptor.becomeRoot(IF318_tree, root_0);

            pushFollow(FOLLOW_instanceofExpression_in_catchFilter6503);
            instanceofExpression319=instanceofExpression();
            _fsp--;

            adaptor.addChild(root_0, instanceofExpression319.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1698:1: instanceofExpression : identifier INSTANCEOF identifier ;
    public final instanceofExpression_return instanceofExpression() throws RecognitionException {
        instanceofExpression_return retval = new instanceofExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF321=null;
        identifier_return identifier320 = null;

        identifier_return identifier322 = null;


        Object INSTANCEOF321_tree=null;

        try {
            // JS.g:1699:3: ( identifier INSTANCEOF identifier )
            // JS.g:1699:5: identifier INSTANCEOF identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_instanceofExpression6518);
            identifier320=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier320.getTree());
            INSTANCEOF321=(Token)input.LT(1);
            match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceofExpression6520); 
            INSTANCEOF321_tree = (Object)adaptor.create(INSTANCEOF321);
            root_0 = (Object)adaptor.becomeRoot(INSTANCEOF321_tree, root_0);

            pushFollow(FOLLOW_identifier_in_instanceofExpression6523);
            identifier322=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier322.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1702:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY323=null;
        block_return block324 = null;


        Object FINALLY323_tree=null;

        try {
            // JS.g:1703:2: ( FINALLY block )
            // JS.g:1703:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY323=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6536); 
            FINALLY323_tree = (Object)adaptor.create(FINALLY323);
            root_0 = (Object)adaptor.becomeRoot(FINALLY323_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6539);
            block324=block();
            _fsp--;

            adaptor.addChild(root_0, block324.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1716:1: functionDeclaration : FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION325=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList326 = null;

        functionBody_return functionBody327 = null;


        Object FUNCTION325_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1717:2: ( FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) )
            // JS.g:1717:4: FUNCTION name= identifier formalParameterList functionBody
            {
            FUNCTION325=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6560); 
            stream_FUNCTION.add(FUNCTION325);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6564);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6566);
            formalParameterList326=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList326.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6568);
            functionBody327=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody327.getTree());

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
            // 1718:2: -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
            {
                // JS.g:1718:5: ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1718:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.next());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1718:44: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

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
    // JS.g:1721:1: functionExpression : FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION328=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList329 = null;

        functionBody_return functionBody330 = null;


        Object FUNCTION328_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1722:2: ( FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) )
            // JS.g:1722:4: FUNCTION (name= identifier )? formalParameterList functionBody
            {
            FUNCTION328=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6597); 
            stream_FUNCTION.add(FUNCTION328);

            // JS.g:1722:17: (name= identifier )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==EACH||(LA80_0>=GET && LA80_0<=SET)||(LA80_0>=WXML && LA80_0<=NAMESPACE)||LA80_0==Identifier) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // JS.g:1722:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6601);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6604);
            formalParameterList329=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList329.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6606);
            functionBody330=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody330.getTree());

            // AST REWRITE
            // elements: formalParameterList, name, FUNCTION, functionBody
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1723:2: -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
            {
                // JS.g:1723:5: ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1723:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.next());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1723:44: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

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
        catch (RuntimeException e) {
        	reportFailure(e);
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
    // JS.g:1726:1: formalParameterList : LPAREN (args+= identifier ({...}? => COLON typeRef )? ( COMMA args+= identifier ({...}? COLON typeRef )? )* )? RPAREN -> ^( ARGS ( $args)* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN331=null;
        Token COLON332=null;
        Token COMMA334=null;
        Token COLON335=null;
        Token RPAREN337=null;
        List list_args=null;
        typeRef_return typeRef333 = null;

        typeRef_return typeRef336 = null;

        RuleReturnScope args = null;
        Object LPAREN331_tree=null;
        Object COLON332_tree=null;
        Object COMMA334_tree=null;
        Object COLON335_tree=null;
        Object RPAREN337_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeRef=new RewriteRuleSubtreeStream(adaptor,"rule typeRef");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1727:2: ( LPAREN (args+= identifier ({...}? => COLON typeRef )? ( COMMA args+= identifier ({...}? COLON typeRef )? )* )? RPAREN -> ^( ARGS ( $args)* ) )
            // JS.g:1727:4: LPAREN (args+= identifier ({...}? => COLON typeRef )? ( COMMA args+= identifier ({...}? COLON typeRef )? )* )? RPAREN
            {
            LPAREN331=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6635); 
            stream_LPAREN.add(LPAREN331);

            // JS.g:1727:11: (args+= identifier ({...}? => COLON typeRef )? ( COMMA args+= identifier ({...}? COLON typeRef )? )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EACH||(LA84_0>=GET && LA84_0<=SET)||(LA84_0>=WXML && LA84_0<=NAMESPACE)||LA84_0==Identifier) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // JS.g:1727:13: args+= identifier ({...}? => COLON typeRef )? ( COMMA args+= identifier ({...}? COLON typeRef )? )*
                    {
                    pushFollow(FOLLOW_identifier_in_formalParameterList6641);
                    args=identifier();
                    _fsp--;

                    stream_identifier.add(args.getTree());
                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);

                    // JS.g:1727:30: ({...}? => COLON typeRef )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==COLON) && ( isTypeInformationEnabled() )) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // JS.g:1727:32: {...}? => COLON typeRef
                            {
                            if ( !( isTypeInformationEnabled() ) ) {
                                throw new FailedPredicateException(input, "formalParameterList", " isTypeInformationEnabled() ");
                            }
                            COLON332=(Token)input.LT(1);
                            match(input,COLON,FOLLOW_COLON_in_formalParameterList6648); 
                            stream_COLON.add(COLON332);

                            pushFollow(FOLLOW_typeRef_in_formalParameterList6650);
                            typeRef333=typeRef();
                            _fsp--;

                            stream_typeRef.add(typeRef333.getTree());

                            }
                            break;

                    }

                    // JS.g:1727:83: ( COMMA args+= identifier ({...}? COLON typeRef )? )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==COMMA) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // JS.g:1727:85: COMMA args+= identifier ({...}? COLON typeRef )?
                    	    {
                    	    COMMA334=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6657); 
                    	    stream_COMMA.add(COMMA334);

                    	    pushFollow(FOLLOW_identifier_in_formalParameterList6661);
                    	    args=identifier();
                    	    _fsp--;

                    	    stream_identifier.add(args.getTree());
                    	    if (list_args==null) list_args=new ArrayList();
                    	    list_args.add(args);

                    	    // JS.g:1727:108: ({...}? COLON typeRef )?
                    	    int alt82=2;
                    	    int LA82_0 = input.LA(1);

                    	    if ( (LA82_0==COLON) ) {
                    	        alt82=1;
                    	    }
                    	    switch (alt82) {
                    	        case 1 :
                    	            // JS.g:1727:110: {...}? COLON typeRef
                    	            {
                    	            if ( !( isTypeInformationEnabled() ) ) {
                    	                throw new FailedPredicateException(input, "formalParameterList", " isTypeInformationEnabled() ");
                    	            }
                    	            COLON335=(Token)input.LT(1);
                    	            match(input,COLON,FOLLOW_COLON_in_formalParameterList6667); 
                    	            stream_COLON.add(COLON335);

                    	            pushFollow(FOLLOW_typeRef_in_formalParameterList6669);
                    	            typeRef336=typeRef();
                    	            _fsp--;

                    	            stream_typeRef.add(typeRef336.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN337=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6680); 
            stream_RPAREN.add(RPAREN337);


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
            // 1728:2: -> ^( ARGS ( $args)* )
            {
                // JS.g:1728:5: ^( ARGS ( $args)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1728:13: ( $args)*
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
    // JS.g:1731:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE339=null;
        sourceElement_return sourceElement338 = null;


        Object lb_tree=null;
        Object RBRACE339_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // JS.g:1732:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1732:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6706); 
            stream_LBRACE.add(lb);

            // JS.g:1732:14: ( sourceElement )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=NULL && LA85_0<=BREAK)||(LA85_0>=CONTINUE && LA85_0<=DO)||(LA85_0>=FOR && LA85_0<=IF)||(LA85_0>=NEW && LA85_0<=NAMESPACE)||LA85_0==CONST||LA85_0==LBRACE||LA85_0==LPAREN||LA85_0==LBRACK||LA85_0==SEMIC||(LA85_0>=ADD && LA85_0<=SUB)||(LA85_0>=INC && LA85_0<=DEC)||(LA85_0>=NOT && LA85_0<=INV)||LA85_0==AT||(LA85_0>=XMLFragment && LA85_0<=XMLFragmentEnd)||LA85_0==StringLiteral||(LA85_0>=Identifier && LA85_0<=RegularExpressionLiteral)||(LA85_0>=DecimalLiteral && LA85_0<=HexIntegerLiteral)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // JS.g:1732:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6708);
            	    sourceElement338=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement338.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            RBRACE339=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6711); 
            stream_RBRACE.add(RBRACE339);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1733:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1733:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1733:28: ( sourceElement )*
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
        catch (RuntimeException e) {
        	reportFailure(e);
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
    // JS.g:1741:1: getMethodDeclaration : get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier ( functionBody )? ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token get=null;
        Token LPAREN340=null;
        Token RPAREN341=null;
        identifier_return name = null;

        functionBody_return functionBody342 = null;


        Object get_tree=null;
        Object LPAREN340_tree=null;
        Object RPAREN341_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1742:3: (get= GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER[$get] identifier ( functionBody )? ) )
            // JS.g:1742:5: get= GET name= identifier LPAREN RPAREN functionBody
            {
            get=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6743); 
            stream_GET.add(get);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6747);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN340=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6749); 
            stream_LPAREN.add(LPAREN340);

            RPAREN341=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6751); 
            stream_RPAREN.add(RPAREN341);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6753);
            functionBody342=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody342.getTree());

            // AST REWRITE
            // elements: functionBody, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1743:4: -> ^( GETTER[$get] identifier ( functionBody )? )
            {
                // JS.g:1743:7: ^( GETTER[$get] identifier ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(GETTER, get), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                // JS.g:1743:33: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

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
    // JS.g:1746:1: setMethodDeclaration : set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param ( functionBody )? ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set=null;
        Token LPAREN343=null;
        Token RPAREN344=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody345 = null;


        Object set_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN344_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1747:3: (set= SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER[$set] $name $param ( functionBody )? ) )
            // JS.g:1747:5: set= SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            set=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6785); 
            stream_SET.add(set);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6789);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN343=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6791); 
            stream_LPAREN.add(LPAREN343);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6795);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN344=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6797); 
            stream_RPAREN.add(RPAREN344);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6799);
            functionBody345=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody345.getTree());

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
            // 1748:5: -> ^( SETTER[$set] $name $param ( functionBody )? )
            {
                // JS.g:1748:8: ^( SETTER[$set] $name $param ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SETTER, set), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_param.next());
                // JS.g:1748:36: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

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
    // JS.g:1755:1: program : ( sourceElement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF347=null;
        sourceElement_return sourceElement346 = null;


        Object EOF347_tree=null;

        try {
            // JS.g:1756:2: ( ( sourceElement )* EOF )
            // JS.g:1756:4: ( sourceElement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // JS.g:1756:4: ( sourceElement )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=NULL && LA86_0<=BREAK)||(LA86_0>=CONTINUE && LA86_0<=DO)||(LA86_0>=FOR && LA86_0<=IF)||(LA86_0>=NEW && LA86_0<=NAMESPACE)||LA86_0==CONST||LA86_0==LBRACE||LA86_0==LPAREN||LA86_0==LBRACK||LA86_0==SEMIC||(LA86_0>=ADD && LA86_0<=SUB)||(LA86_0>=INC && LA86_0<=DEC)||(LA86_0>=NOT && LA86_0<=INV)||LA86_0==AT||(LA86_0>=XMLFragment && LA86_0<=XMLFragmentEnd)||LA86_0==StringLiteral||(LA86_0>=Identifier && LA86_0<=RegularExpressionLiteral)||(LA86_0>=DecimalLiteral && LA86_0<=HexIntegerLiteral)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // JS.g:1756:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6836);
            	    sourceElement346=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement346.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            EOF347=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program6839); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
        	recover(input,re);
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
    // JS.g:1764:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration348 = null;

        statement_return statement349 = null;



        try {
            // JS.g:1769:2: ({...}? functionDeclaration | statement )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==FUNCTION) ) {
                int LA87_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt87=1;
                }
                else if ( (true) ) {
                    alt87=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1764:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 87, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA87_0>=NULL && LA87_0<=BREAK)||(LA87_0>=CONTINUE && LA87_0<=DO)||(LA87_0>=FOR && LA87_0<=EACH)||LA87_0==IF||(LA87_0>=NEW && LA87_0<=NAMESPACE)||LA87_0==CONST||LA87_0==LBRACE||LA87_0==LPAREN||LA87_0==LBRACK||LA87_0==SEMIC||(LA87_0>=ADD && LA87_0<=SUB)||(LA87_0>=INC && LA87_0<=DEC)||(LA87_0>=NOT && LA87_0<=INV)||LA87_0==AT||(LA87_0>=XMLFragment && LA87_0<=XMLFragmentEnd)||LA87_0==StringLiteral||(LA87_0>=Identifier && LA87_0<=RegularExpressionLiteral)||(LA87_0>=DecimalLiteral && LA87_0<=HexIntegerLiteral)) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1764:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // JS.g:1769:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6868);
                    functionDeclaration348=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration348.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1770:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6873);
                    statement349=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement349.getTree());

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
        catch (RuntimeException e) {
        	reportFailure(e);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end sourceElement


 

    public static final BitSet FOLLOW_reservedWord_in_token1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_token1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_token1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_token1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2504 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_xmlAttribute2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_xmlAttribute2522 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_MUL_in_xmlAttribute2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlLiteral_in_literal2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLFragment_in_xmlLiteral2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_xmlLiteral2870 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_xmlLiteral2872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_xmlLiteral2874 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_XMLFragmentEnd_in_xmlLiteral2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_primaryExpression3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3721 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3750 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC026A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3758 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC026A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3829 = new BitSet(new long[]{0x0000003600020000L,0x0020000000000040L,0x0070820000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3837 = new BitSet(new long[]{0x0000003600020000L,0x0020000000000000L,0x0070820000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3898 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3900 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_propertyName3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3980 = new BitSet(new long[]{0x0000003602460070L,0x03200000000002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3996 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC003A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_arguments4004 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments4006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_arguments4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4047 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression4068 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4093 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4097 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4119 = new BitSet(new long[]{0x0000003600020000L,0x0020000001000080L,0x0000800000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression4121 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression4142 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4144 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression4163 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4165 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000A80L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_rightHandSideExpression4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4230 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4285 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4367 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4369 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4371 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4409 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4413 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4428 = new BitSet(new long[]{0x0000000000000002L,0x0008000003000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4450 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4480 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4484 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4499 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4518 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4522 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4549 = new BitSet(new long[]{0x0000000000300002L,0x000000000003C000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4563 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4567 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4590 = new BitSet(new long[]{0x0000000000200002L,0x000000000003C000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4609 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4613 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4632 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4646 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4650 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4669 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4689 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4693 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4696 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4710 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4714 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4717 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4733 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4737 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4740 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4756 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4760 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4763 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4778 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4782 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4785 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4800 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4804 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4807 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4826 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4830 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4833 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4847 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4851 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4854 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4869 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4873 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4876 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4891 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4895 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4898 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4917 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4921 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4924 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4926 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4943 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4947 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4950 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4952 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4983 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4990 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5071 = new BitSet(new long[]{0x0000000000000002L,0x0017FF0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5078 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expression5107 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5152 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5359 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_block5361 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x0071820000000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5393 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x000000C000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5399 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeRef5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5440 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration5448 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclaration5450 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5457 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5474 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclarationNoIn5482 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_typeRef_in_variableDeclarationNoIn5484 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5491 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5508 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x000000C000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5514 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5592 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5596 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5598 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5604 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5666 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5668 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5672 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5706 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5711 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5735 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5739 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5790 = new BitSet(new long[]{0x0000003E72461070L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement5793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5795 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_forStatement5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5830 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5832 = new BitSet(new long[]{0x0000000000100000L,0x0000000000003000L});
    public static final BitSet FOLLOW_IN_in_forControlVar5844 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5892 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5899 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5906 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5976 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5991 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6041 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6048 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6111 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6118 = new BitSet(new long[]{0x0000003E52461072L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000080C000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000080C000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6230 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC012E0L,0x007182C000000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6258 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6263 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6289 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6295 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6302 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6308 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6341 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6344 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6346 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6349 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6362 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6365 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6368 = new BitSet(new long[]{0x0000083FFFCF3CF2L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6385 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6387 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6420 = new BitSet(new long[]{0x0000003E52461070L,0x0320000C0CC002A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L,0x000000C000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_tryStatement6447 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6451 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6476 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6479 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_catchClause6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6500 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_instanceofExpression_in_catchFilter6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6518 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression6520 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_finallyClause6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6560 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6597 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000080L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6635 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000100L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameterList6641 = new BitSet(new long[]{0x0000000000000000L,0x0000008000002100L});
    public static final BitSet FOLLOW_COLON_in_formalParameterList6648 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_typeRef_in_formalParameterList6650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6657 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameterList6661 = new BitSet(new long[]{0x0000000000000000L,0x0000008000002100L});
    public static final BitSet FOLLOW_COLON_in_formalParameterList6667 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_typeRef_in_formalParameterList6669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6706 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x0071820000000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6708 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012E0L,0x0071820000000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6743 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6785 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6791 = new BitSet(new long[]{0x0000003600020000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6836 = new BitSet(new long[]{0x0000083FFFCF3CF0L,0x0320000C0CC012A0L,0x0071820000000000L});
    public static final BitSet FOLLOW_EOF_in_program6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6873 = new BitSet(new long[]{0x0000000000000002L});

}
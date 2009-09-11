// $ANTLR 3.0.1 JS.g 2009-09-11 10:55:01

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSLexer extends Lexer {
    public static final int PACKAGE=59;
    public static final int FUNCTION=18;
    public static final int SHR=94;
    public static final int VT=158;
    public static final int RegularExpressionChar=197;
    public static final int CDATA=36;
    public static final int LOCALNAME=134;
    public static final int XRCLOSE=121;
    public static final int SHL=93;
    public static final int MOD=90;
    public static final int XHOPEN=123;
    public static final int CONST=44;
    public static final int LineTerminatorChar=168;
    public static final int DQUOTE=155;
    public static final int DO=13;
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
    public static final int EOL=170;
    public static final int XLCLOSE=120;
    public static final int PropertyIdentifierSymbols=181;
    public static final int OctalDigit=183;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int ARGS=128;
    public static final int GET=33;
    public static final int WhiteSpace=163;
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
    public static final int DEFAULT_XML_NAMESPACE=143;
    public static final int FF=159;
    public static final int OctalEscapeSequence=191;
    public static final int RegularExpressionFirstChar=196;
    public static final int TYPEOF=28;
    public static final int GT=80;
    public static final int CALL=135;
    public static final int CharacterEscapeSequence=189;
    public static final int LAND=101;
    public static final int PINC=151;
    public static final int PROTECTED=61;
    public static final int LBRACK=74;
    public static final int LBRACE=70;
    public static final int RegularExpressionLiteral=182;
    public static final int SUB=88;
    public static final int FLOAT=51;
    public static final int DecimalIntegerLiteral=185;
    public static final int HexDigit=175;
    public static final int LPAREN=72;
    public static final int AT=125;
    public static final int IMPLEMENTS=53;
    public static final int CDATAOPEN=122;
    public static final int YIELD=35;
    public static final int XCCLOSE=119;
    public static final int SHRASS=111;
    public static final int PS=167;
    public static final int MultiLineComment=171;
    public static final int ADD=87;
    public static final int ZeroToThree=190;
    public static final int ITEM=144;
    public static final int XMLLiteral=153;
    public static final int UnicodeEscapeSequence=193;
    public static final int SHUASS=112;
    public static final int SET=34;
    public static final int SHORT=63;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=156;
    public static final int Tokens=198;
    public static final int SAME=85;
    public static final int XHCLOSE=124;
    public static final int StringLiteral=173;
    public static final int COLON=104;
    public static final int PAREXPR=149;
    public static final int ENUM=47;
    public static final int HexIntegerLiteral=188;
    public static final int NBSP=161;
    public static final int SP=160;
    public static final int BLOCK=130;
    public static final int LineTerminator=169;
    public static final int INTERFACE=56;
    public static final int DIV=116;
    public static final int LONG=57;
    public static final int CR=165;
    public static final int PUBLIC=62;
    public static final int LOR=102;
    public static final int LT=79;
    public static final int WHILE=31;
    public static final int BackslashSequence=195;
    public static final int LS=166;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=42;
    public static final int DecimalDigit=177;
    public static final int BYFIELD=131;
    public static final int BREAK=7;
    public static final int Identifier=180;
    public static final int WXML=37;
    public static final int POS=152;
    public static final int DOUBLE=46;
    public static final int ExponentPart=184;
    public static final int VAR=29;
    public static final int VOID=30;
    public static final int SUPER=65;
    public static final int EACH=17;
    public static final int LABELLED=145;
    public static final int ADDASS=106;
    public static final int ARRAY=129;
    public static final int PRIVATE=60;
    public static final int SWITCH=24;
    public static final int NULL=4;
    public static final int THROWS=67;
    public static final int DELETE=12;
    public static final int XCOPEN=118;
    public static final int MUL=89;
    public static final int IdentifierStartASCII=176;
    public static final int TRY=27;
    public static final int NAMESPACE=38;
    public static final int SHLASS=110;
    public static final int COLONCOLON=127;
    public static final int USP=162;
    public static final int ANDASS=113;
    public static final int IdentifierNameASCIIStart=179;
    public static final int QUE=103;
    public static final int OR=97;
    public static final int SETTER=142;
    public static final int DEBUGGER=45;
    public static final int FOREACH=140;
    public static final int PDEC=150;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=194;
    public static final int THROW=26;
    public static final int MULASS=108;
    public static final int XmlAttribute=174;
    public static final int DEC=92;
    public static final int OctalIntegerLiteral=187;
    public static final int CLASS=43;
    public static final int HexEscapeSequence=192;
    public static final int ORASS=114;
    public static final int NAMEDVALUE=146;
    public static final int SingleLineComment=172;
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
    public static final int OBJECT=148;
    public static final int COMMA=78;
    public static final int TRANSIENT=68;
    public static final int FORITER=138;
    public static final int MODASS=109;
    public static final int DOT=76;
    public static final int IdentifierPart=178;
    public static final int WITH=32;
    public static final int BYTE=41;
    public static final int XOR=98;
    public static final int VOLATILE=69;
    public static final int GETTER=141;
    public static final int NSAME=86;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=133;
    public static final int TAB=157;
    public static final int DecimalLiteral=186;
    public static final int TRUE=5;
    public static final int NEQ=84;
    public static final int FINALLY=15;
    public static final int NEG=147;
    public static final int ASSIGN=105;
    public static final int SEMIC=77;
    public static final int EXTENDS=49;
    public static final int BSLASH=154;
    public static final int LF=164;
    
    private Token last;
    
    final static boolean isIdentifierKeyword(int token)
    {
    	return token == WXML
    		|| token == GET
      		|| token == SET
      		|| token == EACH
      		|| token == NAMESPACE; 
    }
    
    private final boolean areRegularExpressionsEnabled()
    {
    	if (last == null)
    	{
    		return true;
    	}
    	if (isIdentifierKeyword(last.getType())) {
    		return false; 
    	}
    	switch (last.getType())
    	{
    	// identifier
    		case Identifier:
    		case XmlAttribute:
    	// literals
    		case NULL:
    		case TRUE:
    		case FALSE:
    		case THIS:
    		case OctalIntegerLiteral:
    		case DecimalLiteral:
    		case HexIntegerLiteral:
    		case StringLiteral:
    	// member access ending 
    		case RBRACK:
    	// function call or nested expression ending
    		case RPAREN:
    			return false;
    	// otherwise OK
    		default:
    			return true;
    	}
    }
    /*
    private final boolean areXmlExpressionsEnabled()
    {
      if (last == null)
      {
        return false;
      }
      	if (isIdentifierKeyword(last.getType())) {
    		return false; 
    	}
      switch (last.getType())
      {
      // identifier
        case Identifier:
        case XmlAttribute:
      // literals
        case NULL:
        case TRUE:
        case FALSE:
        case THIS:
        case OctalIntegerLiteral:
        case DecimalLiteral:
        case HexIntegerLiteral:
        case StringLiteral:
      // member access ending 
        case RBRACK:
      // function call or nested expression ending
        case RPAREN:
          return false;
      // otherwise OK
        default:
          return true;
      }
    }
    */
    	
    private final void consumeIdentifierUnicodeStart() throws RecognitionException, NoViableAltException
    {
    	int ch = input.LA(1);
    	if (isIdentifierStartUnicode(ch))
    	{
    		matchAny();
    		do
    		{
    			ch = input.LA(1);
    			if (ch == '$' || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || ch == '\\' || ch == '_' || (ch >= 'a' && ch <= 'z') || isIdentifierPartUnicode(ch))
    			{
    				mIdentifierPart();
    			}
    			else
    			{
    				return;
    			}
    		}
    		while (true);
    	}
    	else
    	{
    		throw new NoViableAltException();
    	}
    }
    	
    private final boolean isIdentifierPartUnicode(int ch)
    {
    	return Character.isJavaIdentifierPart((char)ch);
    }
    	
    private final boolean isIdentifierStartUnicode(int ch)
    {
    	return Character.isJavaIdentifierStart((char)ch);
    }
    
    public Token nextToken()
    {
    	Token result = super.nextToken();
    	if (result.getChannel() == Token.DEFAULT_CHANNEL)
    	{
    		last = result;
    	}
    	return result;		
    }
    
    @Override
    public void emitErrorMessage(String msg) {
    // IGNORE
    }

    public JSLexer() {;} 
    public JSLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "JS.g"; }

    // $ANTLR start NULL
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            // JS.g:142:6: ( 'null' )
            // JS.g:142:8: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NULL

    // $ANTLR start TRUE
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            // JS.g:143:6: ( 'true' )
            // JS.g:143:8: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TRUE

    // $ANTLR start FALSE
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            // JS.g:144:7: ( 'false' )
            // JS.g:144:9: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FALSE

    // $ANTLR start BREAK
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            // JS.g:145:7: ( 'break' )
            // JS.g:145:9: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BREAK

    // $ANTLR start CASE
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            // JS.g:146:6: ( 'case' )
            // JS.g:146:8: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASE

    // $ANTLR start CATCH
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            // JS.g:147:7: ( 'catch' )
            // JS.g:147:9: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CATCH

    // $ANTLR start CONTINUE
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            // JS.g:148:10: ( 'continue' )
            // JS.g:148:12: 'continue'
            {
            match("continue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONTINUE

    // $ANTLR start DEFAULT
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            // JS.g:149:9: ( 'default' )
            // JS.g:149:11: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEFAULT

    // $ANTLR start DELETE
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            // JS.g:150:8: ( 'delete' )
            // JS.g:150:10: 'delete'
            {
            match("delete"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DELETE

    // $ANTLR start DO
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            // JS.g:151:4: ( 'do' )
            // JS.g:151:6: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DO

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // JS.g:152:6: ( 'else' )
            // JS.g:152:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start FINALLY
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            // JS.g:153:9: ( 'finally' )
            // JS.g:153:11: 'finally'
            {
            match("finally"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FINALLY

    // $ANTLR start FOR
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            // JS.g:154:5: ( 'for' )
            // JS.g:154:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOR

    // $ANTLR start EACH
    public final void mEACH() throws RecognitionException {
        try {
            int _type = EACH;
            // JS.g:155:6: ( 'each' )
            // JS.g:155:8: 'each'
            {
            match("each"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EACH

    // $ANTLR start FUNCTION
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            // JS.g:156:10: ( 'function' )
            // JS.g:156:12: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FUNCTION

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // JS.g:157:4: ( 'if' )
            // JS.g:157:6: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start IN
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            // JS.g:158:4: ( 'in' )
            // JS.g:158:6: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IN

    // $ANTLR start INSTANCEOF
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            // JS.g:159:12: ( 'instanceof' )
            // JS.g:159:14: 'instanceof'
            {
            match("instanceof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INSTANCEOF

    // $ANTLR start NEW
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            // JS.g:160:5: ( 'new' )
            // JS.g:160:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEW

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            // JS.g:161:8: ( 'return' )
            // JS.g:161:10: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start SWITCH
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            // JS.g:162:8: ( 'switch' )
            // JS.g:162:10: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SWITCH

    // $ANTLR start THIS
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            // JS.g:163:6: ( 'this' )
            // JS.g:163:8: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THIS

    // $ANTLR start THROW
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            // JS.g:164:7: ( 'throw' )
            // JS.g:164:9: 'throw'
            {
            match("throw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THROW

    // $ANTLR start TRY
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            // JS.g:165:5: ( 'try' )
            // JS.g:165:7: 'try'
            {
            match("try"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TRY

    // $ANTLR start TYPEOF
    public final void mTYPEOF() throws RecognitionException {
        try {
            int _type = TYPEOF;
            // JS.g:166:8: ( 'typeof' )
            // JS.g:166:10: 'typeof'
            {
            match("typeof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPEOF

    // $ANTLR start VAR
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            // JS.g:167:5: ( 'var' )
            // JS.g:167:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VAR

    // $ANTLR start VOID
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            // JS.g:168:6: ( 'void' )
            // JS.g:168:8: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VOID

    // $ANTLR start WHILE
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            // JS.g:169:7: ( 'while' )
            // JS.g:169:9: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHILE

    // $ANTLR start WITH
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            // JS.g:170:6: ( 'with' )
            // JS.g:170:8: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WITH

    // $ANTLR start GET
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            // JS.g:171:5: ( 'get' )
            // JS.g:171:7: 'get'
            {
            match("get"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GET

    // $ANTLR start SET
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            // JS.g:172:5: ( 'set' )
            // JS.g:172:7: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SET

    // $ANTLR start YIELD
    public final void mYIELD() throws RecognitionException {
        try {
            int _type = YIELD;
            // JS.g:173:7: ( 'yield' )
            // JS.g:173:9: 'yield'
            {
            match("yield"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end YIELD

    // $ANTLR start CDATA
    public final void mCDATA() throws RecognitionException {
        try {
            int _type = CDATA;
            // JS.g:174:7: ( 'CDATA' )
            // JS.g:174:9: 'CDATA'
            {
            match("CDATA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CDATA

    // $ANTLR start WXML
    public final void mWXML() throws RecognitionException {
        try {
            int _type = WXML;
            // JS.g:175:6: ( 'xml' )
            // JS.g:175:8: 'xml'
            {
            match("xml"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WXML

    // $ANTLR start NAMESPACE
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            // JS.g:176:11: ( 'namespace' )
            // JS.g:176:13: 'namespace'
            {
            match("namespace"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAMESPACE

    // $ANTLR start ABSTRACT
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            // JS.g:177:10: ( 'abstract' )
            // JS.g:177:12: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ABSTRACT

    // $ANTLR start BOOLEAN
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            // JS.g:178:9: ( 'boolean' )
            // JS.g:178:11: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOOLEAN

    // $ANTLR start BYTE
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            // JS.g:179:6: ( 'byte' )
            // JS.g:179:8: 'byte'
            {
            match("byte"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BYTE

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            // JS.g:180:6: ( 'char' )
            // JS.g:180:8: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    // $ANTLR start CLASS
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            // JS.g:181:7: ( 'class' )
            // JS.g:181:9: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLASS

    // $ANTLR start CONST
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            // JS.g:182:7: ( 'const' )
            // JS.g:182:9: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONST

    // $ANTLR start DEBUGGER
    public final void mDEBUGGER() throws RecognitionException {
        try {
            int _type = DEBUGGER;
            // JS.g:183:10: ( 'debugger' )
            // JS.g:183:12: 'debugger'
            {
            match("debugger"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEBUGGER

    // $ANTLR start DOUBLE
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            // JS.g:184:8: ( 'double' )
            // JS.g:184:10: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE

    // $ANTLR start ENUM
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            // JS.g:185:6: ( 'enum' )
            // JS.g:185:8: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENUM

    // $ANTLR start EXPORT
    public final void mEXPORT() throws RecognitionException {
        try {
            int _type = EXPORT;
            // JS.g:186:8: ( 'export' )
            // JS.g:186:10: 'export'
            {
            match("export"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXPORT

    // $ANTLR start EXTENDS
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            // JS.g:187:9: ( 'extends' )
            // JS.g:187:11: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXTENDS

    // $ANTLR start FINAL
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            // JS.g:188:7: ( 'final' )
            // JS.g:188:9: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FINAL

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // JS.g:189:7: ( 'float' )
            // JS.g:189:9: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start GOTO
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            // JS.g:190:6: ( 'goto' )
            // JS.g:190:8: 'goto'
            {
            match("goto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GOTO

    // $ANTLR start IMPLEMENTS
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            // JS.g:191:12: ( 'implements' )
            // JS.g:191:14: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IMPLEMENTS

    // $ANTLR start IMPORT
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            // JS.g:192:8: ( 'import' )
            // JS.g:192:10: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IMPORT

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // JS.g:193:5: ( 'int' )
            // JS.g:193:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start INTERFACE
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            // JS.g:194:11: ( 'interface' )
            // JS.g:194:13: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTERFACE

    // $ANTLR start LONG
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            // JS.g:195:6: ( 'long' )
            // JS.g:195:8: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LONG

    // $ANTLR start NATIVE
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            // JS.g:196:8: ( 'native' )
            // JS.g:196:10: 'native'
            {
            match("native"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NATIVE

    // $ANTLR start PACKAGE
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            // JS.g:197:9: ( 'package' )
            // JS.g:197:11: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PACKAGE

    // $ANTLR start PRIVATE
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            // JS.g:198:9: ( 'private' )
            // JS.g:198:11: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRIVATE

    // $ANTLR start PROTECTED
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            // JS.g:199:11: ( 'protected' )
            // JS.g:199:13: 'protected'
            {
            match("protected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PROTECTED

    // $ANTLR start PUBLIC
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            // JS.g:200:8: ( 'public' )
            // JS.g:200:10: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PUBLIC

    // $ANTLR start SHORT
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            // JS.g:201:7: ( 'short' )
            // JS.g:201:9: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHORT

    // $ANTLR start STATIC
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            // JS.g:202:8: ( 'static' )
            // JS.g:202:10: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STATIC

    // $ANTLR start SUPER
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            // JS.g:203:7: ( 'super' )
            // JS.g:203:9: 'super'
            {
            match("super"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SUPER

    // $ANTLR start SYNCHRONIZED
    public final void mSYNCHRONIZED() throws RecognitionException {
        try {
            int _type = SYNCHRONIZED;
            // JS.g:204:14: ( 'synchronized' )
            // JS.g:204:16: 'synchronized'
            {
            match("synchronized"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SYNCHRONIZED

    // $ANTLR start THROWS
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            // JS.g:205:8: ( 'throws' )
            // JS.g:205:10: 'throws'
            {
            match("throws"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THROWS

    // $ANTLR start TRANSIENT
    public final void mTRANSIENT() throws RecognitionException {
        try {
            int _type = TRANSIENT;
            // JS.g:206:11: ( 'transient' )
            // JS.g:206:13: 'transient'
            {
            match("transient"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TRANSIENT

    // $ANTLR start VOLATILE
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            // JS.g:207:10: ( 'volatile' )
            // JS.g:207:12: 'volatile'
            {
            match("volatile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VOLATILE

    // $ANTLR start LBRACE
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            // JS.g:208:8: ( '{' )
            // JS.g:208:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRACE

    // $ANTLR start RBRACE
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            // JS.g:209:8: ( '}' )
            // JS.g:209:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRACE

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // JS.g:210:8: ( '(' )
            // JS.g:210:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // JS.g:211:8: ( ')' )
            // JS.g:211:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LBRACK
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            // JS.g:212:8: ( '[' )
            // JS.g:212:10: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRACK

    // $ANTLR start RBRACK
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            // JS.g:213:8: ( ']' )
            // JS.g:213:10: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRACK

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // JS.g:214:5: ( '.' )
            // JS.g:214:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start SEMIC
    public final void mSEMIC() throws RecognitionException {
        try {
            int _type = SEMIC;
            // JS.g:215:7: ( ';' )
            // JS.g:215:9: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMIC

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // JS.g:216:7: ( ',' )
            // JS.g:216:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // JS.g:217:4: ( '<' )
            // JS.g:217:6: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // JS.g:218:4: ( '>' )
            // JS.g:218:6: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start LTE
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            // JS.g:219:5: ( '<=' )
            // JS.g:219:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTE

    // $ANTLR start GTE
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            // JS.g:220:5: ( '>=' )
            // JS.g:220:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTE

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            // JS.g:221:4: ( '==' )
            // JS.g:221:6: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start NEQ
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            // JS.g:222:5: ( '!=' )
            // JS.g:222:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEQ

    // $ANTLR start SAME
    public final void mSAME() throws RecognitionException {
        try {
            int _type = SAME;
            // JS.g:223:6: ( '===' )
            // JS.g:223:8: '==='
            {
            match("==="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SAME

    // $ANTLR start NSAME
    public final void mNSAME() throws RecognitionException {
        try {
            int _type = NSAME;
            // JS.g:224:7: ( '!==' )
            // JS.g:224:9: '!=='
            {
            match("!=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NSAME

    // $ANTLR start ADD
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            // JS.g:225:5: ( '+' )
            // JS.g:225:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ADD

    // $ANTLR start SUB
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            // JS.g:226:5: ( '-' )
            // JS.g:226:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SUB

    // $ANTLR start MUL
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            // JS.g:227:5: ( '*' )
            // JS.g:227:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MUL

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // JS.g:228:5: ( '%' )
            // JS.g:228:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start INC
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            // JS.g:229:5: ( '++' )
            // JS.g:229:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INC

    // $ANTLR start DEC
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            // JS.g:230:5: ( '--' )
            // JS.g:230:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEC

    // $ANTLR start SHL
    public final void mSHL() throws RecognitionException {
        try {
            int _type = SHL;
            // JS.g:231:5: ( '<<' )
            // JS.g:231:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHL

    // $ANTLR start SHR
    public final void mSHR() throws RecognitionException {
        try {
            int _type = SHR;
            // JS.g:232:5: ( '>>' )
            // JS.g:232:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHR

    // $ANTLR start SHU
    public final void mSHU() throws RecognitionException {
        try {
            int _type = SHU;
            // JS.g:233:5: ( '>>>' )
            // JS.g:233:7: '>>>'
            {
            match(">>>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHU

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // JS.g:234:5: ( '&' )
            // JS.g:234:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // JS.g:235:4: ( '|' )
            // JS.g:235:6: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start XOR
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            // JS.g:236:5: ( '^' )
            // JS.g:236:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XOR

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            // JS.g:237:5: ( '!' )
            // JS.g:237:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start INV
    public final void mINV() throws RecognitionException {
        try {
            int _type = INV;
            // JS.g:238:5: ( '~' )
            // JS.g:238:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INV

    // $ANTLR start LAND
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            // JS.g:239:6: ( '&&' )
            // JS.g:239:8: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LAND

    // $ANTLR start LOR
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            // JS.g:240:5: ( '||' )
            // JS.g:240:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOR

    // $ANTLR start QUE
    public final void mQUE() throws RecognitionException {
        try {
            int _type = QUE;
            // JS.g:241:5: ( '?' )
            // JS.g:241:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUE

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // JS.g:242:7: ( ':' )
            // JS.g:242:9: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start ASSIGN
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            // JS.g:243:8: ( '=' )
            // JS.g:243:10: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSIGN

    // $ANTLR start ADDASS
    public final void mADDASS() throws RecognitionException {
        try {
            int _type = ADDASS;
            // JS.g:244:8: ( '+=' )
            // JS.g:244:10: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ADDASS

    // $ANTLR start SUBASS
    public final void mSUBASS() throws RecognitionException {
        try {
            int _type = SUBASS;
            // JS.g:245:8: ( '-=' )
            // JS.g:245:10: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SUBASS

    // $ANTLR start MULASS
    public final void mMULASS() throws RecognitionException {
        try {
            int _type = MULASS;
            // JS.g:246:8: ( '*=' )
            // JS.g:246:10: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULASS

    // $ANTLR start MODASS
    public final void mMODASS() throws RecognitionException {
        try {
            int _type = MODASS;
            // JS.g:247:8: ( '%=' )
            // JS.g:247:10: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MODASS

    // $ANTLR start SHLASS
    public final void mSHLASS() throws RecognitionException {
        try {
            int _type = SHLASS;
            // JS.g:248:8: ( '<<=' )
            // JS.g:248:10: '<<='
            {
            match("<<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHLASS

    // $ANTLR start SHRASS
    public final void mSHRASS() throws RecognitionException {
        try {
            int _type = SHRASS;
            // JS.g:249:8: ( '>>=' )
            // JS.g:249:10: '>>='
            {
            match(">>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHRASS

    // $ANTLR start SHUASS
    public final void mSHUASS() throws RecognitionException {
        try {
            int _type = SHUASS;
            // JS.g:250:8: ( '>>>=' )
            // JS.g:250:10: '>>>='
            {
            match(">>>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHUASS

    // $ANTLR start ANDASS
    public final void mANDASS() throws RecognitionException {
        try {
            int _type = ANDASS;
            // JS.g:251:8: ( '&=' )
            // JS.g:251:10: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANDASS

    // $ANTLR start ORASS
    public final void mORASS() throws RecognitionException {
        try {
            int _type = ORASS;
            // JS.g:252:7: ( '|=' )
            // JS.g:252:9: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORASS

    // $ANTLR start XORASS
    public final void mXORASS() throws RecognitionException {
        try {
            int _type = XORASS;
            // JS.g:253:8: ( '^=' )
            // JS.g:253:10: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XORASS

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // JS.g:254:5: ( '/' )
            // JS.g:254:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start DIVASS
    public final void mDIVASS() throws RecognitionException {
        try {
            int _type = DIVASS;
            // JS.g:255:8: ( '/=' )
            // JS.g:255:10: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVASS

    // $ANTLR start XCOPEN
    public final void mXCOPEN() throws RecognitionException {
        try {
            int _type = XCOPEN;
            // JS.g:256:8: ( '<!--' )
            // JS.g:256:10: '<!--'
            {
            match("<!--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XCOPEN

    // $ANTLR start XCCLOSE
    public final void mXCCLOSE() throws RecognitionException {
        try {
            int _type = XCCLOSE;
            // JS.g:257:9: ( '-->' )
            // JS.g:257:11: '-->'
            {
            match("-->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XCCLOSE

    // $ANTLR start XLCLOSE
    public final void mXLCLOSE() throws RecognitionException {
        try {
            int _type = XLCLOSE;
            // JS.g:258:9: ( '</' )
            // JS.g:258:11: '</'
            {
            match("</"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XLCLOSE

    // $ANTLR start XRCLOSE
    public final void mXRCLOSE() throws RecognitionException {
        try {
            int _type = XRCLOSE;
            // JS.g:259:9: ( '/>' )
            // JS.g:259:11: '/>'
            {
            match("/>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XRCLOSE

    // $ANTLR start CDATAOPEN
    public final void mCDATAOPEN() throws RecognitionException {
        try {
            int _type = CDATAOPEN;
            // JS.g:260:11: ( '<![' )
            // JS.g:260:13: '<!['
            {
            match("<!["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CDATAOPEN

    // $ANTLR start XHOPEN
    public final void mXHOPEN() throws RecognitionException {
        try {
            int _type = XHOPEN;
            // JS.g:261:8: ( '<?' )
            // JS.g:261:10: '<?'
            {
            match("<?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XHOPEN

    // $ANTLR start XHCLOSE
    public final void mXHCLOSE() throws RecognitionException {
        try {
            int _type = XHCLOSE;
            // JS.g:262:9: ( '?>' )
            // JS.g:262:11: '?>'
            {
            match("?>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XHCLOSE

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            // JS.g:263:4: ( '@' )
            // JS.g:263:6: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AT

    // $ANTLR start DOTDOT
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            // JS.g:264:8: ( '..' )
            // JS.g:264:10: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOTDOT

    // $ANTLR start COLONCOLON
    public final void mCOLONCOLON() throws RecognitionException {
        try {
            int _type = COLONCOLON;
            // JS.g:265:12: ( '::' )
            // JS.g:265:14: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLONCOLON

    // $ANTLR start BSLASH
    public final void mBSLASH() throws RecognitionException {
        try {
            // JS.g:511:2: ( '\\\\' )
            // JS.g:511:4: '\\\\'
            {
            match('\\'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end BSLASH

    // $ANTLR start DQUOTE
    public final void mDQUOTE() throws RecognitionException {
        try {
            // JS.g:515:2: ( '\"' )
            // JS.g:515:4: '\"'
            {
            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DQUOTE

    // $ANTLR start SQUOTE
    public final void mSQUOTE() throws RecognitionException {
        try {
            // JS.g:519:2: ( '\\'' )
            // JS.g:519:4: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end SQUOTE

    // $ANTLR start TAB
    public final void mTAB() throws RecognitionException {
        try {
            // JS.g:525:2: ( '\\u0009' )
            // JS.g:525:4: '\\u0009'
            {
            match('\t'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end TAB

    // $ANTLR start VT
    public final void mVT() throws RecognitionException {
        try {
            // JS.g:529:2: ( '\\u000b' )
            // JS.g:529:4: '\\u000b'
            {
            match('\u000B'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end VT

    // $ANTLR start FF
    public final void mFF() throws RecognitionException {
        try {
            // JS.g:533:2: ( '\\u000c' )
            // JS.g:533:4: '\\u000c'
            {
            match('\f'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end FF

    // $ANTLR start SP
    public final void mSP() throws RecognitionException {
        try {
            // JS.g:537:2: ( '\\u0020' )
            // JS.g:537:4: '\\u0020'
            {
            match(' '); 

            }

        }
        finally {
        }
    }
    // $ANTLR end SP

    // $ANTLR start NBSP
    public final void mNBSP() throws RecognitionException {
        try {
            // JS.g:541:2: ( '\\u00a0' )
            // JS.g:541:4: '\\u00a0'
            {
            match('\u00A0'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end NBSP

    // $ANTLR start USP
    public final void mUSP() throws RecognitionException {
        try {
            // JS.g:545:2: ( '\\u1680' | '\\u180E' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u202F' | '\\u205F' | '\\u3000' )
            // JS.g:
            {
            if ( input.LA(1)=='\u1680'||input.LA(1)=='\u180E'||(input.LA(1)>='\u2000' && input.LA(1)<='\u200A')||input.LA(1)=='\u202F'||input.LA(1)=='\u205F'||input.LA(1)=='\u3000' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end USP

    // $ANTLR start WhiteSpace
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            // JS.g:564:2: ( ( TAB | VT | FF | SP | NBSP | USP )+ )
            // JS.g:564:4: ( TAB | VT | FF | SP | NBSP | USP )+
            {
            // JS.g:564:4: ( TAB | VT | FF | SP | NBSP | USP )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||(LA1_0>='\u000B' && LA1_0<='\f')||LA1_0==' '||LA1_0=='\u00A0'||LA1_0=='\u1680'||LA1_0=='\u180E'||(LA1_0>='\u2000' && LA1_0<='\u200A')||LA1_0=='\u202F'||LA1_0=='\u205F'||LA1_0=='\u3000') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // JS.g:
            	    {
            	    if ( input.LA(1)=='\t'||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||input.LA(1)==' '||input.LA(1)=='\u00A0'||input.LA(1)=='\u1680'||input.LA(1)=='\u180E'||(input.LA(1)>='\u2000' && input.LA(1)<='\u200A')||input.LA(1)=='\u202F'||input.LA(1)=='\u205F'||input.LA(1)=='\u3000' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WhiteSpace

    // $ANTLR start LF
    public final void mLF() throws RecognitionException {
        try {
            // JS.g:572:2: ( '\\n' )
            // JS.g:572:4: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end LF

    // $ANTLR start CR
    public final void mCR() throws RecognitionException {
        try {
            // JS.g:576:2: ( '\\r' )
            // JS.g:576:4: '\\r'
            {
            match('\r'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end CR

    // $ANTLR start LS
    public final void mLS() throws RecognitionException {
        try {
            // JS.g:580:2: ( '\\u2028' )
            // JS.g:580:4: '\\u2028'
            {
            match('\u2028'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end LS

    // $ANTLR start PS
    public final void mPS() throws RecognitionException {
        try {
            // JS.g:584:2: ( '\\u2029' )
            // JS.g:584:4: '\\u2029'
            {
            match('\u2029'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end PS

    // $ANTLR start LineTerminatorChar
    public final void mLineTerminatorChar() throws RecognitionException {
        try {
            // JS.g:588:2: ( CR | LF | LS | PS )
            // JS.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r'||(input.LA(1)>='\u2028' && input.LA(1)<='\u2029') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LineTerminatorChar

    // $ANTLR start LineTerminator
    public final void mLineTerminator() throws RecognitionException {
        try {
            // JS.g:592:2: ( ( CR ( LF )? ) | LF | LS | PS )
            int alt3=4;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt3=1;
                }
                break;
            case '\n':
                {
                alt3=2;
                }
                break;
            case '\u2028':
                {
                alt3=3;
                }
                break;
            case '\u2029':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("591:10: fragment LineTerminator : ( ( CR ( LF )? ) | LF | LS | PS );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // JS.g:592:4: ( CR ( LF )? )
                    {
                    // JS.g:592:4: ( CR ( LF )? )
                    // JS.g:592:5: CR ( LF )?
                    {
                    mCR(); 
                    // JS.g:592:8: ( LF )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\n') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // JS.g:592:8: LF
                            {
                            mLF(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // JS.g:592:15: LF
                    {
                    mLF(); 

                    }
                    break;
                case 3 :
                    // JS.g:592:20: LS
                    {
                    mLS(); 

                    }
                    break;
                case 4 :
                    // JS.g:592:25: PS
                    {
                    mPS(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end LineTerminator

    // $ANTLR start EOL
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            // JS.g:596:2: ( ( ( CR ( LF )? ) | LF | LS | PS ) )
            // JS.g:596:4: ( ( CR ( LF )? ) | LF | LS | PS )
            {
            // JS.g:596:4: ( ( CR ( LF )? ) | LF | LS | PS )
            int alt5=4;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt5=1;
                }
                break;
            case '\n':
                {
                alt5=2;
                }
                break;
            case '\u2028':
                {
                alt5=3;
                }
                break;
            case '\u2029':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("596:4: ( ( CR ( LF )? ) | LF | LS | PS )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // JS.g:596:6: ( CR ( LF )? )
                    {
                    // JS.g:596:6: ( CR ( LF )? )
                    // JS.g:596:8: CR ( LF )?
                    {
                    mCR(); 
                    // JS.g:596:11: ( LF )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\n') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // JS.g:596:11: LF
                            {
                            mLF(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // JS.g:596:19: LF
                    {
                    mLF(); 

                    }
                    break;
                case 3 :
                    // JS.g:596:24: LS
                    {
                    mLS(); 

                    }
                    break;
                case 4 :
                    // JS.g:596:29: PS
                    {
                    mPS(); 

                    }
                    break;

            }

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EOL

    // $ANTLR start MultiLineComment
    public final void mMultiLineComment() throws RecognitionException {
        try {
            int _type = MultiLineComment;
            // JS.g:603:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // JS.g:603:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // JS.g:603:9: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFE')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // JS.g:603:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MultiLineComment

    // $ANTLR start SingleLineComment
    public final void mSingleLineComment() throws RecognitionException {
        try {
            int _type = SingleLineComment;
            // JS.g:607:2: ( '//' (~ ( LineTerminatorChar ) )* )
            // JS.g:607:4: '//' (~ ( LineTerminatorChar ) )*
            {
            match("//"); 

            // JS.g:607:9: (~ ( LineTerminatorChar ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u2027')||(LA7_0>='\u202A' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // JS.g:607:11: ~ ( LineTerminatorChar )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SingleLineComment

    // $ANTLR start IdentifierStartASCII
    public final void mIdentifierStartASCII() throws RecognitionException {
        try {
            // JS.g:716:2: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt8=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt8=2;
                }
                break;
            case '$':
                {
                alt8=3;
                }
                break;
            case '_':
                {
                alt8=4;
                }
                break;
            case '\\':
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("715:10: fragment IdentifierStartASCII : ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // JS.g:716:4: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // JS.g:716:15: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // JS.g:717:4: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 4 :
                    // JS.g:718:4: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 5 :
                    // JS.g:719:4: BSLASH 'u' HexDigit HexDigit HexDigit HexDigit
                    {
                    mBSLASH(); 
                    match('u'); 
                    mHexDigit(); 
                    mHexDigit(); 
                    mHexDigit(); 
                    mHexDigit(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end IdentifierStartASCII

    // $ANTLR start IdentifierPart
    public final void mIdentifierPart() throws RecognitionException {
        try {
            // JS.g:727:2: ( DecimalDigit | IdentifierStartASCII | {...}?)
            int alt9=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt9=1;
                }
                break;
            case '$':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt9=2;
                }
                break;
            default:
                alt9=3;}

            switch (alt9) {
                case 1 :
                    // JS.g:727:4: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 2 :
                    // JS.g:728:4: IdentifierStartASCII
                    {
                    mIdentifierStartASCII(); 

                    }
                    break;
                case 3 :
                    // JS.g:729:4: {...}?
                    {
                    if ( !( isIdentifierPartUnicode(input.LA(1)) ) ) {
                        throw new FailedPredicateException(input, "IdentifierPart", " isIdentifierPartUnicode(input.LA(1)) ");
                    }
                     matchAny(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end IdentifierPart

    // $ANTLR start IdentifierNameASCIIStart
    public final void mIdentifierNameASCIIStart() throws RecognitionException {
        try {
            // JS.g:733:2: ( IdentifierStartASCII ( IdentifierPart )* )
            // JS.g:733:4: IdentifierStartASCII ( IdentifierPart )*
            {
            mIdentifierStartASCII(); 
            // JS.g:733:25: ( IdentifierPart )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='\\'||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }
                else if ( ( isIdentifierPartUnicode(input.LA(1)) ) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // JS.g:733:25: IdentifierPart
            	    {
            	    mIdentifierPart(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end IdentifierNameASCIIStart

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // JS.g:746:3: ( IdentifierNameASCIIStart | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='$'||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='\\'||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                alt11=1;
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // JS.g:746:5: IdentifierNameASCIIStart
                    {
                    mIdentifierNameASCIIStart(); 

                    }
                    break;
                case 2 :
                    // JS.g:747:5: 
                    {
                     consumeIdentifierUnicodeStart(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start PropertyIdentifierSymbols
    public final void mPropertyIdentifierSymbols() throws RecognitionException {
        try {
            // JS.g:759:3: ( AT Identifier )
            // JS.g:759:5: AT Identifier
            {
            mAT(); 
            mIdentifier(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end PropertyIdentifierSymbols

    // $ANTLR start XmlAttribute
    public final void mXmlAttribute() throws RecognitionException {
        try {
            int _type = XmlAttribute;
            // JS.g:763:3: ( PropertyIdentifierSymbols )
            // JS.g:763:5: PropertyIdentifierSymbols
            {
            mPropertyIdentifierSymbols(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XmlAttribute

    // $ANTLR start DecimalDigit
    public final void mDecimalDigit() throws RecognitionException {
        try {
            // JS.g:849:2: ( '0' .. '9' )
            // JS.g:849:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DecimalDigit

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // JS.g:853:2: ( DecimalDigit | 'a' .. 'f' | 'A' .. 'F' )
            // JS.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start OctalDigit
    public final void mOctalDigit() throws RecognitionException {
        try {
            // JS.g:857:2: ( '0' .. '7' )
            // JS.g:857:4: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end OctalDigit

    // $ANTLR start ExponentPart
    public final void mExponentPart() throws RecognitionException {
        try {
            // JS.g:861:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+ )
            // JS.g:861:4: ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // JS.g:861:18: ( '+' | '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // JS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // JS.g:861:33: ( DecimalDigit )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // JS.g:861:33: DecimalDigit
            	    {
            	    mDecimalDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end ExponentPart

    // $ANTLR start DecimalIntegerLiteral
    public final void mDecimalIntegerLiteral() throws RecognitionException {
        try {
            // JS.g:865:2: ( '0' | '1' .. '9' ( DecimalDigit )* )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                alt15=1;
            }
            else if ( ((LA15_0>='1' && LA15_0<='9')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("864:10: fragment DecimalIntegerLiteral : ( '0' | '1' .. '9' ( DecimalDigit )* );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // JS.g:865:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // JS.g:866:4: '1' .. '9' ( DecimalDigit )*
                    {
                    matchRange('1','9'); 
                    // JS.g:866:13: ( DecimalDigit )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // JS.g:866:13: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end DecimalIntegerLiteral

    // $ANTLR start DecimalLiteral
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            // JS.g:870:2: ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // JS.g:870:4: DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    match('.'); 
                    // JS.g:870:30: ( DecimalDigit )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // JS.g:870:30: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // JS.g:870:44: ( ExponentPart )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // JS.g:870:44: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:871:4: '.' ( DecimalDigit )+ ( ExponentPart )?
                    {
                    match('.'); 
                    // JS.g:871:8: ( DecimalDigit )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // JS.g:871:8: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // JS.g:871:22: ( ExponentPart )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // JS.g:871:22: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // JS.g:872:4: DecimalIntegerLiteral ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    // JS.g:872:26: ( ExponentPart )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // JS.g:872:26: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DecimalLiteral

    // $ANTLR start OctalIntegerLiteral
    public final void mOctalIntegerLiteral() throws RecognitionException {
        try {
            int _type = OctalIntegerLiteral;
            // JS.g:876:2: ( '0' ( OctalDigit )+ )
            // JS.g:876:4: '0' ( OctalDigit )+
            {
            match('0'); 
            // JS.g:876:8: ( OctalDigit )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='7')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // JS.g:876:8: OctalDigit
            	    {
            	    mOctalDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OctalIntegerLiteral

    // $ANTLR start HexIntegerLiteral
    public final void mHexIntegerLiteral() throws RecognitionException {
        try {
            int _type = HexIntegerLiteral;
            // JS.g:880:2: ( ( '0x' | '0X' ) ( HexDigit )+ )
            // JS.g:880:4: ( '0x' | '0X' ) ( HexDigit )+
            {
            // JS.g:880:4: ( '0x' | '0X' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='0') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='x') ) {
                    alt23=1;
                }
                else if ( (LA23_1=='X') ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("880:4: ( '0x' | '0X' )", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("880:4: ( '0x' | '0X' )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // JS.g:880:6: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // JS.g:880:13: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // JS.g:880:20: ( HexDigit )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='F')||(LA24_0>='a' && LA24_0<='f')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // JS.g:880:20: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HexIntegerLiteral

    // $ANTLR start CharacterEscapeSequence
    public final void mCharacterEscapeSequence() throws RecognitionException {
        try {
            // JS.g:899:2: (~ ( DecimalDigit | 'x' | 'u' | LineTerminatorChar ) )
            // JS.g:899:4: ~ ( DecimalDigit | 'x' | 'u' | LineTerminatorChar )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='w')||(input.LA(1)>='y' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end CharacterEscapeSequence

    // $ANTLR start ZeroToThree
    public final void mZeroToThree() throws RecognitionException {
        try {
            // JS.g:903:2: ( '0' .. '3' )
            // JS.g:903:4: '0' .. '3'
            {
            matchRange('0','3'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end ZeroToThree

    // $ANTLR start OctalEscapeSequence
    public final void mOctalEscapeSequence() throws RecognitionException {
        try {
            // JS.g:907:2: ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit )
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='0' && LA25_0<='3')) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>='0' && LA25_1<='7')) ) {
                    int LA25_4 = input.LA(3);

                    if ( ((LA25_4>='0' && LA25_4<='7')) ) {
                        alt25=4;
                    }
                    else {
                        alt25=2;}
                }
                else {
                    alt25=1;}
            }
            else if ( ((LA25_0>='4' && LA25_0<='7')) ) {
                int LA25_2 = input.LA(2);

                if ( ((LA25_2>='0' && LA25_2<='7')) ) {
                    alt25=3;
                }
                else {
                    alt25=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("906:10: fragment OctalEscapeSequence : ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // JS.g:907:4: OctalDigit
                    {
                    mOctalDigit(); 

                    }
                    break;
                case 2 :
                    // JS.g:908:4: ZeroToThree OctalDigit
                    {
                    mZeroToThree(); 
                    mOctalDigit(); 

                    }
                    break;
                case 3 :
                    // JS.g:909:4: '4' .. '7' OctalDigit
                    {
                    matchRange('4','7'); 
                    mOctalDigit(); 

                    }
                    break;
                case 4 :
                    // JS.g:910:4: ZeroToThree OctalDigit OctalDigit
                    {
                    mZeroToThree(); 
                    mOctalDigit(); 
                    mOctalDigit(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end OctalEscapeSequence

    // $ANTLR start HexEscapeSequence
    public final void mHexEscapeSequence() throws RecognitionException {
        try {
            // JS.g:914:2: ( 'x' HexDigit HexDigit )
            // JS.g:914:4: 'x' HexDigit HexDigit
            {
            match('x'); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end HexEscapeSequence

    // $ANTLR start UnicodeEscapeSequence
    public final void mUnicodeEscapeSequence() throws RecognitionException {
        try {
            // JS.g:918:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // JS.g:918:4: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end UnicodeEscapeSequence

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // JS.g:922:2: ( BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator ) )
            // JS.g:923:2: BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )
            {
            mBSLASH(); 
            // JS.g:924:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )
            int alt26=5;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='/')||(LA26_0>=':' && LA26_0<='t')||(LA26_0>='v' && LA26_0<='w')||(LA26_0>='y' && LA26_0<='\u2027')||(LA26_0>='\u202A' && LA26_0<='\uFFFE')) ) {
                alt26=1;
            }
            else if ( ((LA26_0>='0' && LA26_0<='7')) ) {
                alt26=2;
            }
            else if ( (LA26_0=='x') ) {
                alt26=3;
            }
            else if ( (LA26_0=='u') ) {
                alt26=4;
            }
            else if ( (LA26_0=='\n'||LA26_0=='\r'||(LA26_0>='\u2028' && LA26_0<='\u2029')) ) {
                alt26=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("924:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // JS.g:925:3: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // JS.g:926:5: OctalEscapeSequence
                    {
                    mOctalEscapeSequence(); 

                    }
                    break;
                case 3 :
                    // JS.g:927:5: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 

                    }
                    break;
                case 4 :
                    // JS.g:928:5: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 

                    }
                    break;
                case 5 :
                    // JS.g:929:5: LineTerminator
                    {
                    mLineTerminator(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // JS.g:934:2: ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* DQUOTE )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\'') ) {
                alt29=1;
            }
            else if ( (LA29_0=='\"') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("933:1: StringLiteral : ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* DQUOTE );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // JS.g:934:4: SQUOTE (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* SQUOTE
                    {
                    mSQUOTE(); 
                    // JS.g:934:11: (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\u2027')||(LA27_0>='\u202A' && LA27_0<='\uFFFE')) ) {
                            alt27=1;
                        }
                        else if ( (LA27_0=='\\') ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // JS.g:934:13: ~ ( SQUOTE | BSLASH | LineTerminatorChar )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // JS.g:934:57: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    mSQUOTE(); 

                    }
                    break;
                case 2 :
                    // JS.g:935:4: DQUOTE (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* DQUOTE
                    {
                    mDQUOTE(); 
                    // JS.g:935:11: (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='!')||(LA28_0>='#' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\u2027')||(LA28_0>='\u202A' && LA28_0<='\uFFFE')) ) {
                            alt28=1;
                        }
                        else if ( (LA28_0=='\\') ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // JS.g:935:13: ~ ( DQUOTE | BSLASH | LineTerminatorChar )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // JS.g:935:57: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    mDQUOTE(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start BackslashSequence
    public final void mBackslashSequence() throws RecognitionException {
        try {
            // JS.g:944:2: ( BSLASH ~ ( LineTerminatorChar ) )
            // JS.g:944:4: BSLASH ~ ( LineTerminatorChar )
            {
            mBSLASH(); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end BackslashSequence

    // $ANTLR start RegularExpressionFirstChar
    public final void mRegularExpressionFirstChar() throws RecognitionException {
        try {
            // JS.g:948:2: (~ ( LineTerminatorChar | MUL | BSLASH | DIV ) | BackslashSequence )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='.')||(LA30_0>='0' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\u2027')||(LA30_0>='\u202A' && LA30_0<='\uFFFE')) ) {
                alt30=1;
            }
            else if ( (LA30_0=='\\') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("947:10: fragment RegularExpressionFirstChar : (~ ( LineTerminatorChar | MUL | BSLASH | DIV ) | BackslashSequence );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // JS.g:948:4: ~ ( LineTerminatorChar | MUL | BSLASH | DIV )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // JS.g:949:4: BackslashSequence
                    {
                    mBackslashSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end RegularExpressionFirstChar

    // $ANTLR start RegularExpressionChar
    public final void mRegularExpressionChar() throws RecognitionException {
        try {
            // JS.g:953:2: (~ ( LineTerminatorChar | BSLASH | DIV ) | BackslashSequence )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='.')||(LA31_0>='0' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\u2027')||(LA31_0>='\u202A' && LA31_0<='\uFFFE')) ) {
                alt31=1;
            }
            else if ( (LA31_0=='\\') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("952:10: fragment RegularExpressionChar : (~ ( LineTerminatorChar | BSLASH | DIV ) | BackslashSequence );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // JS.g:953:4: ~ ( LineTerminatorChar | BSLASH | DIV )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // JS.g:954:4: BackslashSequence
                    {
                    mBackslashSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end RegularExpressionChar

    // $ANTLR start RegularExpressionLiteral
    public final void mRegularExpressionLiteral() throws RecognitionException {
        try {
            int _type = RegularExpressionLiteral;
            // JS.g:958:2: ({...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )* )
            // JS.g:958:4: {...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )*
            {
            if ( !( areRegularExpressionsEnabled() ) ) {
                throw new FailedPredicateException(input, "RegularExpressionLiteral", " areRegularExpressionsEnabled() ");
            }
            mDIV(); 
            mRegularExpressionFirstChar(); 
            // JS.g:958:73: ( RegularExpressionChar )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='.')||(LA32_0>='0' && LA32_0<='\u2027')||(LA32_0>='\u202A' && LA32_0<='\uFFFE')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:958:73: RegularExpressionChar
            	    {
            	    mRegularExpressionChar(); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            mDIV(); 
            // JS.g:958:100: ( IdentifierPart )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='$'||(LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='\\'||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')) ) {
                    alt33=1;
                }
                else if ( ( isIdentifierPartUnicode(input.LA(1)) ) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:958:100: IdentifierPart
            	    {
            	    mIdentifierPart(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RegularExpressionLiteral

    public void mTokens() throws RecognitionException {
        // JS.g:1:8: ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | GET | SET | YIELD | CDATA | WXML | NAMESPACE | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | XCOPEN | XCCLOSE | XLCLOSE | XRCLOSE | CDATAOPEN | XHOPEN | XHCLOSE | AT | DOTDOT | COLONCOLON | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | XmlAttribute | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral )
        int alt34=135;
        switch ( input.LA(1) ) {
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA34_146 = input.LA(4);

                    if ( (LA34_146=='e') ) {
                        int LA34_222 = input.LA(5);

                        if ( (LA34_222=='s') ) {
                            int LA34_285 = input.LA(6);

                            if ( (LA34_285=='p') ) {
                                int LA34_338 = input.LA(7);

                                if ( (LA34_338=='a') ) {
                                    int LA34_380 = input.LA(8);

                                    if ( (LA34_380=='c') ) {
                                        int LA34_409 = input.LA(9);

                                        if ( (LA34_409=='e') ) {
                                            int LA34_427 = input.LA(10);

                                            if ( (LA34_427=='$'||(LA34_427>='0' && LA34_427<='9')||(LA34_427>='A' && LA34_427<='Z')||LA34_427=='\\'||LA34_427=='_'||(LA34_427>='a' && LA34_427<='z')) ) {
                                                alt34=129;
                                            }
                                            else {
                                                alt34=35;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 't':
                    {
                    int LA34_147 = input.LA(4);

                    if ( (LA34_147=='i') ) {
                        int LA34_223 = input.LA(5);

                        if ( (LA34_223=='v') ) {
                            int LA34_286 = input.LA(6);

                            if ( (LA34_286=='e') ) {
                                int LA34_339 = input.LA(7);

                                if ( (LA34_339=='$'||(LA34_339>='0' && LA34_339<='9')||(LA34_339>='A' && LA34_339<='Z')||LA34_339=='\\'||LA34_339=='_'||(LA34_339>='a' && LA34_339<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=55;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            case 'u':
                {
                int LA34_52 = input.LA(3);

                if ( (LA34_52=='l') ) {
                    int LA34_148 = input.LA(4);

                    if ( (LA34_148=='l') ) {
                        int LA34_224 = input.LA(5);

                        if ( (LA34_224=='$'||(LA34_224>='0' && LA34_224<='9')||(LA34_224>='A' && LA34_224<='Z')||LA34_224=='\\'||LA34_224=='_'||(LA34_224>='a' && LA34_224<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=1;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'e':
                {
                int LA34_53 = input.LA(3);

                if ( (LA34_53=='w') ) {
                    int LA34_149 = input.LA(4);

                    if ( (LA34_149=='$'||(LA34_149>='0' && LA34_149<='9')||(LA34_149>='A' && LA34_149<='Z')||LA34_149=='\\'||LA34_149=='_'||(LA34_149>='a' && LA34_149<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=19;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA34_150 = input.LA(4);

                    if ( (LA34_150=='s') ) {
                        int LA34_226 = input.LA(5);

                        if ( (LA34_226=='$'||(LA34_226>='0' && LA34_226<='9')||(LA34_226>='A' && LA34_226<='Z')||LA34_226=='\\'||LA34_226=='_'||(LA34_226>='a' && LA34_226<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=22;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'r':
                    {
                    int LA34_151 = input.LA(4);

                    if ( (LA34_151=='o') ) {
                        int LA34_227 = input.LA(5);

                        if ( (LA34_227=='w') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA34_340 = input.LA(7);

                                if ( (LA34_340=='$'||(LA34_340>='0' && LA34_340<='9')||(LA34_340>='A' && LA34_340<='Z')||LA34_340=='\\'||LA34_340=='_'||(LA34_340>='a' && LA34_340<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=64;}
                                }
                                break;
                            case '$':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '\\':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                                {
                                alt34=129;
                                }
                                break;
                            default:
                                alt34=23;}

                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'y':
                    {
                    int LA34_152 = input.LA(4);

                    if ( (LA34_152=='$'||(LA34_152>='0' && LA34_152<='9')||(LA34_152>='A' && LA34_152<='Z')||LA34_152=='\\'||LA34_152=='_'||(LA34_152>='a' && LA34_152<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=24;}
                    }
                    break;
                case 'a':
                    {
                    int LA34_153 = input.LA(4);

                    if ( (LA34_153=='n') ) {
                        int LA34_229 = input.LA(5);

                        if ( (LA34_229=='s') ) {
                            int LA34_290 = input.LA(6);

                            if ( (LA34_290=='i') ) {
                                int LA34_342 = input.LA(7);

                                if ( (LA34_342=='e') ) {
                                    int LA34_383 = input.LA(8);

                                    if ( (LA34_383=='n') ) {
                                        int LA34_410 = input.LA(9);

                                        if ( (LA34_410=='t') ) {
                                            int LA34_428 = input.LA(10);

                                            if ( (LA34_428=='$'||(LA34_428>='0' && LA34_428<='9')||(LA34_428>='A' && LA34_428<='Z')||LA34_428=='\\'||LA34_428=='_'||(LA34_428>='a' && LA34_428<='z')) ) {
                                                alt34=129;
                                            }
                                            else {
                                                alt34=65;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'u':
                    {
                    int LA34_154 = input.LA(4);

                    if ( (LA34_154=='e') ) {
                        int LA34_230 = input.LA(5);

                        if ( (LA34_230=='$'||(LA34_230>='0' && LA34_230<='9')||(LA34_230>='A' && LA34_230<='Z')||LA34_230=='\\'||LA34_230=='_'||(LA34_230>='a' && LA34_230<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=2;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            case 'y':
                {
                int LA34_56 = input.LA(3);

                if ( (LA34_56=='p') ) {
                    int LA34_155 = input.LA(4);

                    if ( (LA34_155=='e') ) {
                        int LA34_231 = input.LA(5);

                        if ( (LA34_231=='o') ) {
                            int LA34_292 = input.LA(6);

                            if ( (LA34_292=='f') ) {
                                int LA34_343 = input.LA(7);

                                if ( (LA34_343=='$'||(LA34_343>='0' && LA34_343<='9')||(LA34_343>='A' && LA34_343<='Z')||LA34_343=='\\'||LA34_343=='_'||(LA34_343>='a' && LA34_343<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=25;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA34_57 = input.LA(3);

                if ( (LA34_57=='n') ) {
                    int LA34_156 = input.LA(4);

                    if ( (LA34_156=='a') ) {
                        int LA34_232 = input.LA(5);

                        if ( (LA34_232=='l') ) {
                            switch ( input.LA(6) ) {
                            case 'l':
                                {
                                int LA34_344 = input.LA(7);

                                if ( (LA34_344=='y') ) {
                                    int LA34_385 = input.LA(8);

                                    if ( (LA34_385=='$'||(LA34_385>='0' && LA34_385<='9')||(LA34_385>='A' && LA34_385<='Z')||LA34_385=='\\'||LA34_385=='_'||(LA34_385>='a' && LA34_385<='z')) ) {
                                        alt34=129;
                                    }
                                    else {
                                        alt34=12;}
                                }
                                else {
                                    alt34=129;}
                                }
                                break;
                            case '$':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '\\':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                                {
                                alt34=129;
                                }
                                break;
                            default:
                                alt34=47;}

                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'l':
                {
                int LA34_58 = input.LA(3);

                if ( (LA34_58=='o') ) {
                    int LA34_157 = input.LA(4);

                    if ( (LA34_157=='a') ) {
                        int LA34_233 = input.LA(5);

                        if ( (LA34_233=='t') ) {
                            int LA34_294 = input.LA(6);

                            if ( (LA34_294=='$'||(LA34_294>='0' && LA34_294<='9')||(LA34_294>='A' && LA34_294<='Z')||LA34_294=='\\'||LA34_294=='_'||(LA34_294>='a' && LA34_294<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=48;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'a':
                {
                int LA34_59 = input.LA(3);

                if ( (LA34_59=='l') ) {
                    int LA34_158 = input.LA(4);

                    if ( (LA34_158=='s') ) {
                        int LA34_234 = input.LA(5);

                        if ( (LA34_234=='e') ) {
                            int LA34_295 = input.LA(6);

                            if ( (LA34_295=='$'||(LA34_295>='0' && LA34_295<='9')||(LA34_295>='A' && LA34_295<='Z')||LA34_295=='\\'||LA34_295=='_'||(LA34_295>='a' && LA34_295<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=3;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'u':
                {
                int LA34_60 = input.LA(3);

                if ( (LA34_60=='n') ) {
                    int LA34_159 = input.LA(4);

                    if ( (LA34_159=='c') ) {
                        int LA34_235 = input.LA(5);

                        if ( (LA34_235=='t') ) {
                            int LA34_296 = input.LA(6);

                            if ( (LA34_296=='i') ) {
                                int LA34_348 = input.LA(7);

                                if ( (LA34_348=='o') ) {
                                    int LA34_386 = input.LA(8);

                                    if ( (LA34_386=='n') ) {
                                        int LA34_412 = input.LA(9);

                                        if ( (LA34_412=='$'||(LA34_412>='0' && LA34_412<='9')||(LA34_412>='A' && LA34_412<='Z')||LA34_412=='\\'||LA34_412=='_'||(LA34_412>='a' && LA34_412<='z')) ) {
                                            alt34=129;
                                        }
                                        else {
                                            alt34=15;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'o':
                {
                int LA34_61 = input.LA(3);

                if ( (LA34_61=='r') ) {
                    int LA34_160 = input.LA(4);

                    if ( (LA34_160=='$'||(LA34_160>='0' && LA34_160<='9')||(LA34_160>='A' && LA34_160<='Z')||LA34_160=='\\'||LA34_160=='_'||(LA34_160>='a' && LA34_160<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=13;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA34_62 = input.LA(3);

                if ( (LA34_62=='o') ) {
                    int LA34_161 = input.LA(4);

                    if ( (LA34_161=='l') ) {
                        int LA34_237 = input.LA(5);

                        if ( (LA34_237=='e') ) {
                            int LA34_297 = input.LA(6);

                            if ( (LA34_297=='a') ) {
                                int LA34_349 = input.LA(7);

                                if ( (LA34_349=='n') ) {
                                    int LA34_387 = input.LA(8);

                                    if ( (LA34_387=='$'||(LA34_387>='0' && LA34_387<='9')||(LA34_387>='A' && LA34_387<='Z')||LA34_387=='\\'||LA34_387=='_'||(LA34_387>='a' && LA34_387<='z')) ) {
                                        alt34=129;
                                    }
                                    else {
                                        alt34=37;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'y':
                {
                int LA34_63 = input.LA(3);

                if ( (LA34_63=='t') ) {
                    int LA34_162 = input.LA(4);

                    if ( (LA34_162=='e') ) {
                        int LA34_238 = input.LA(5);

                        if ( (LA34_238=='$'||(LA34_238>='0' && LA34_238<='9')||(LA34_238>='A' && LA34_238<='Z')||LA34_238=='\\'||LA34_238=='_'||(LA34_238>='a' && LA34_238<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=38;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'r':
                {
                int LA34_64 = input.LA(3);

                if ( (LA34_64=='e') ) {
                    int LA34_163 = input.LA(4);

                    if ( (LA34_163=='a') ) {
                        int LA34_239 = input.LA(5);

                        if ( (LA34_239=='k') ) {
                            int LA34_299 = input.LA(6);

                            if ( (LA34_299=='$'||(LA34_299>='0' && LA34_299<='9')||(LA34_299>='A' && LA34_299<='Z')||LA34_299=='\\'||LA34_299=='_'||(LA34_299>='a' && LA34_299<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=4;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA34_65 = input.LA(3);

                if ( (LA34_65=='n') ) {
                    switch ( input.LA(4) ) {
                    case 's':
                        {
                        int LA34_240 = input.LA(5);

                        if ( (LA34_240=='t') ) {
                            int LA34_300 = input.LA(6);

                            if ( (LA34_300=='$'||(LA34_300>='0' && LA34_300<='9')||(LA34_300>='A' && LA34_300<='Z')||LA34_300=='\\'||LA34_300=='_'||(LA34_300>='a' && LA34_300<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=41;}
                        }
                        else {
                            alt34=129;}
                        }
                        break;
                    case 't':
                        {
                        int LA34_241 = input.LA(5);

                        if ( (LA34_241=='i') ) {
                            int LA34_301 = input.LA(6);

                            if ( (LA34_301=='n') ) {
                                int LA34_352 = input.LA(7);

                                if ( (LA34_352=='u') ) {
                                    int LA34_388 = input.LA(8);

                                    if ( (LA34_388=='e') ) {
                                        int LA34_414 = input.LA(9);

                                        if ( (LA34_414=='$'||(LA34_414>='0' && LA34_414<='9')||(LA34_414>='A' && LA34_414<='Z')||LA34_414=='\\'||LA34_414=='_'||(LA34_414>='a' && LA34_414<='z')) ) {
                                            alt34=129;
                                        }
                                        else {
                                            alt34=7;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                        }
                        break;
                    default:
                        alt34=129;}

                }
                else {
                    alt34=129;}
                }
                break;
            case 'l':
                {
                int LA34_66 = input.LA(3);

                if ( (LA34_66=='a') ) {
                    int LA34_165 = input.LA(4);

                    if ( (LA34_165=='s') ) {
                        int LA34_242 = input.LA(5);

                        if ( (LA34_242=='s') ) {
                            int LA34_302 = input.LA(6);

                            if ( (LA34_302=='$'||(LA34_302>='0' && LA34_302<='9')||(LA34_302>='A' && LA34_302<='Z')||LA34_302=='\\'||LA34_302=='_'||(LA34_302>='a' && LA34_302<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=40;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'h':
                {
                int LA34_67 = input.LA(3);

                if ( (LA34_67=='a') ) {
                    int LA34_166 = input.LA(4);

                    if ( (LA34_166=='r') ) {
                        int LA34_243 = input.LA(5);

                        if ( (LA34_243=='$'||(LA34_243>='0' && LA34_243<='9')||(LA34_243>='A' && LA34_243<='Z')||LA34_243=='\\'||LA34_243=='_'||(LA34_243>='a' && LA34_243<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=39;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA34_167 = input.LA(4);

                    if ( (LA34_167=='c') ) {
                        int LA34_244 = input.LA(5);

                        if ( (LA34_244=='h') ) {
                            int LA34_304 = input.LA(6);

                            if ( (LA34_304=='$'||(LA34_304>='0' && LA34_304<='9')||(LA34_304>='A' && LA34_304<='Z')||LA34_304=='\\'||LA34_304=='_'||(LA34_304>='a' && LA34_304<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=6;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 's':
                    {
                    int LA34_168 = input.LA(4);

                    if ( (LA34_168=='e') ) {
                        int LA34_245 = input.LA(5);

                        if ( (LA34_245=='$'||(LA34_245>='0' && LA34_245<='9')||(LA34_245>='A' && LA34_245<='Z')||LA34_245=='\\'||LA34_245=='_'||(LA34_245>='a' && LA34_245<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=5;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA34_169 = input.LA(4);

                    if ( (LA34_169=='b') ) {
                        int LA34_246 = input.LA(5);

                        if ( (LA34_246=='l') ) {
                            int LA34_306 = input.LA(6);

                            if ( (LA34_306=='e') ) {
                                int LA34_355 = input.LA(7);

                                if ( (LA34_355=='$'||(LA34_355>='0' && LA34_355<='9')||(LA34_355>='A' && LA34_355<='Z')||LA34_355=='\\'||LA34_355=='_'||(LA34_355>='a' && LA34_355<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=43;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case '$':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '\\':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt34=129;
                    }
                    break;
                default:
                    alt34=10;}

                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA34_171 = input.LA(4);

                    if ( (LA34_171=='e') ) {
                        int LA34_247 = input.LA(5);

                        if ( (LA34_247=='t') ) {
                            int LA34_307 = input.LA(6);

                            if ( (LA34_307=='e') ) {
                                int LA34_356 = input.LA(7);

                                if ( (LA34_356=='$'||(LA34_356>='0' && LA34_356<='9')||(LA34_356>='A' && LA34_356<='Z')||LA34_356=='\\'||LA34_356=='_'||(LA34_356>='a' && LA34_356<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=9;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'f':
                    {
                    int LA34_172 = input.LA(4);

                    if ( (LA34_172=='a') ) {
                        int LA34_248 = input.LA(5);

                        if ( (LA34_248=='u') ) {
                            int LA34_308 = input.LA(6);

                            if ( (LA34_308=='l') ) {
                                int LA34_357 = input.LA(7);

                                if ( (LA34_357=='t') ) {
                                    int LA34_391 = input.LA(8);

                                    if ( (LA34_391=='$'||(LA34_391>='0' && LA34_391<='9')||(LA34_391>='A' && LA34_391<='Z')||LA34_391=='\\'||LA34_391=='_'||(LA34_391>='a' && LA34_391<='z')) ) {
                                        alt34=129;
                                    }
                                    else {
                                        alt34=8;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'b':
                    {
                    int LA34_173 = input.LA(4);

                    if ( (LA34_173=='u') ) {
                        int LA34_249 = input.LA(5);

                        if ( (LA34_249=='g') ) {
                            int LA34_309 = input.LA(6);

                            if ( (LA34_309=='g') ) {
                                int LA34_358 = input.LA(7);

                                if ( (LA34_358=='e') ) {
                                    int LA34_392 = input.LA(8);

                                    if ( (LA34_392=='r') ) {
                                        int LA34_416 = input.LA(9);

                                        if ( (LA34_416=='$'||(LA34_416>='0' && LA34_416<='9')||(LA34_416>='A' && LA34_416<='Z')||LA34_416=='\\'||LA34_416=='_'||(LA34_416>='a' && LA34_416<='z')) ) {
                                            alt34=129;
                                        }
                                        else {
                                            alt34=42;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA34_71 = input.LA(3);

                if ( (LA34_71=='u') ) {
                    int LA34_174 = input.LA(4);

                    if ( (LA34_174=='m') ) {
                        int LA34_250 = input.LA(5);

                        if ( (LA34_250=='$'||(LA34_250>='0' && LA34_250<='9')||(LA34_250>='A' && LA34_250<='Z')||LA34_250=='\\'||LA34_250=='_'||(LA34_250>='a' && LA34_250<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=44;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA34_175 = input.LA(4);

                    if ( (LA34_175=='e') ) {
                        int LA34_251 = input.LA(5);

                        if ( (LA34_251=='n') ) {
                            int LA34_311 = input.LA(6);

                            if ( (LA34_311=='d') ) {
                                int LA34_359 = input.LA(7);

                                if ( (LA34_359=='s') ) {
                                    int LA34_393 = input.LA(8);

                                    if ( (LA34_393=='$'||(LA34_393>='0' && LA34_393<='9')||(LA34_393>='A' && LA34_393<='Z')||LA34_393=='\\'||LA34_393=='_'||(LA34_393>='a' && LA34_393<='z')) ) {
                                        alt34=129;
                                    }
                                    else {
                                        alt34=46;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'p':
                    {
                    int LA34_176 = input.LA(4);

                    if ( (LA34_176=='o') ) {
                        int LA34_252 = input.LA(5);

                        if ( (LA34_252=='r') ) {
                            int LA34_312 = input.LA(6);

                            if ( (LA34_312=='t') ) {
                                int LA34_360 = input.LA(7);

                                if ( (LA34_360=='$'||(LA34_360>='0' && LA34_360<='9')||(LA34_360>='A' && LA34_360<='Z')||LA34_360=='\\'||LA34_360=='_'||(LA34_360>='a' && LA34_360<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=45;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            case 'l':
                {
                int LA34_73 = input.LA(3);

                if ( (LA34_73=='s') ) {
                    int LA34_177 = input.LA(4);

                    if ( (LA34_177=='e') ) {
                        int LA34_253 = input.LA(5);

                        if ( (LA34_253=='$'||(LA34_253>='0' && LA34_253<='9')||(LA34_253>='A' && LA34_253<='Z')||LA34_253=='\\'||LA34_253=='_'||(LA34_253>='a' && LA34_253<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=11;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'a':
                {
                int LA34_74 = input.LA(3);

                if ( (LA34_74=='c') ) {
                    int LA34_178 = input.LA(4);

                    if ( (LA34_178=='h') ) {
                        int LA34_254 = input.LA(5);

                        if ( (LA34_254=='$'||(LA34_254>='0' && LA34_254<='9')||(LA34_254>='A' && LA34_254<='Z')||LA34_254=='\\'||LA34_254=='_'||(LA34_254>='a' && LA34_254<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=14;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA34_75 = input.LA(3);

                if ( (LA34_75=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA34_255 = input.LA(5);

                        if ( (LA34_255=='r') ) {
                            int LA34_315 = input.LA(6);

                            if ( (LA34_315=='t') ) {
                                int LA34_361 = input.LA(7);

                                if ( (LA34_361=='$'||(LA34_361>='0' && LA34_361<='9')||(LA34_361>='A' && LA34_361<='Z')||LA34_361=='\\'||LA34_361=='_'||(LA34_361>='a' && LA34_361<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=51;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                        }
                        break;
                    case 'l':
                        {
                        int LA34_256 = input.LA(5);

                        if ( (LA34_256=='e') ) {
                            int LA34_316 = input.LA(6);

                            if ( (LA34_316=='m') ) {
                                int LA34_362 = input.LA(7);

                                if ( (LA34_362=='e') ) {
                                    int LA34_396 = input.LA(8);

                                    if ( (LA34_396=='n') ) {
                                        int LA34_418 = input.LA(9);

                                        if ( (LA34_418=='t') ) {
                                            int LA34_432 = input.LA(10);

                                            if ( (LA34_432=='s') ) {
                                                int LA34_441 = input.LA(11);

                                                if ( (LA34_441=='$'||(LA34_441>='0' && LA34_441<='9')||(LA34_441>='A' && LA34_441<='Z')||LA34_441=='\\'||LA34_441=='_'||(LA34_441>='a' && LA34_441<='z')) ) {
                                                    alt34=129;
                                                }
                                                else {
                                                    alt34=50;}
                                            }
                                            else {
                                                alt34=129;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                        }
                        break;
                    default:
                        alt34=129;}

                }
                else {
                    alt34=129;}
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA34_257 = input.LA(5);

                        if ( (LA34_257=='r') ) {
                            int LA34_317 = input.LA(6);

                            if ( (LA34_317=='f') ) {
                                int LA34_363 = input.LA(7);

                                if ( (LA34_363=='a') ) {
                                    int LA34_397 = input.LA(8);

                                    if ( (LA34_397=='c') ) {
                                        int LA34_419 = input.LA(9);

                                        if ( (LA34_419=='e') ) {
                                            int LA34_433 = input.LA(10);

                                            if ( (LA34_433=='$'||(LA34_433>='0' && LA34_433<='9')||(LA34_433>='A' && LA34_433<='Z')||LA34_433=='\\'||LA34_433=='_'||(LA34_433>='a' && LA34_433<='z')) ) {
                                                alt34=129;
                                            }
                                            else {
                                                alt34=53;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                        }
                        break;
                    case '$':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt34=129;
                        }
                        break;
                    default:
                        alt34=52;}

                    }
                    break;
                case 's':
                    {
                    int LA34_181 = input.LA(4);

                    if ( (LA34_181=='t') ) {
                        int LA34_259 = input.LA(5);

                        if ( (LA34_259=='a') ) {
                            int LA34_318 = input.LA(6);

                            if ( (LA34_318=='n') ) {
                                int LA34_364 = input.LA(7);

                                if ( (LA34_364=='c') ) {
                                    int LA34_398 = input.LA(8);

                                    if ( (LA34_398=='e') ) {
                                        int LA34_420 = input.LA(9);

                                        if ( (LA34_420=='o') ) {
                                            int LA34_434 = input.LA(10);

                                            if ( (LA34_434=='f') ) {
                                                int LA34_443 = input.LA(11);

                                                if ( (LA34_443=='$'||(LA34_443>='0' && LA34_443<='9')||(LA34_443>='A' && LA34_443<='Z')||LA34_443=='\\'||LA34_443=='_'||(LA34_443>='a' && LA34_443<='z')) ) {
                                                    alt34=129;
                                                }
                                                else {
                                                    alt34=18;}
                                            }
                                            else {
                                                alt34=129;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case '$':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '\\':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt34=129;
                    }
                    break;
                default:
                    alt34=17;}

                }
                break;
            case 'f':
                {
                int LA34_77 = input.LA(3);

                if ( (LA34_77=='$'||(LA34_77>='0' && LA34_77<='9')||(LA34_77>='A' && LA34_77<='Z')||LA34_77=='\\'||LA34_77=='_'||(LA34_77>='a' && LA34_77<='z')) ) {
                    alt34=129;
                }
                else {
                    alt34=16;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'r':
            {
            int LA34_9 = input.LA(2);

            if ( (LA34_9=='e') ) {
                int LA34_78 = input.LA(3);

                if ( (LA34_78=='t') ) {
                    int LA34_184 = input.LA(4);

                    if ( (LA34_184=='u') ) {
                        int LA34_260 = input.LA(5);

                        if ( (LA34_260=='r') ) {
                            int LA34_319 = input.LA(6);

                            if ( (LA34_319=='n') ) {
                                int LA34_365 = input.LA(7);

                                if ( (LA34_365=='$'||(LA34_365>='0' && LA34_365<='9')||(LA34_365>='A' && LA34_365<='Z')||LA34_365=='\\'||LA34_365=='_'||(LA34_365>='a' && LA34_365<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=20;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
            }
            else {
                alt34=129;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA34_79 = input.LA(3);

                if ( (LA34_79=='t') ) {
                    int LA34_185 = input.LA(4);

                    if ( (LA34_185=='$'||(LA34_185>='0' && LA34_185<='9')||(LA34_185>='A' && LA34_185<='Z')||LA34_185=='\\'||LA34_185=='_'||(LA34_185>='a' && LA34_185<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=31;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'y':
                {
                int LA34_80 = input.LA(3);

                if ( (LA34_80=='n') ) {
                    int LA34_186 = input.LA(4);

                    if ( (LA34_186=='c') ) {
                        int LA34_262 = input.LA(5);

                        if ( (LA34_262=='h') ) {
                            int LA34_320 = input.LA(6);

                            if ( (LA34_320=='r') ) {
                                int LA34_366 = input.LA(7);

                                if ( (LA34_366=='o') ) {
                                    int LA34_400 = input.LA(8);

                                    if ( (LA34_400=='n') ) {
                                        int LA34_421 = input.LA(9);

                                        if ( (LA34_421=='i') ) {
                                            int LA34_435 = input.LA(10);

                                            if ( (LA34_435=='z') ) {
                                                int LA34_444 = input.LA(11);

                                                if ( (LA34_444=='e') ) {
                                                    int LA34_448 = input.LA(12);

                                                    if ( (LA34_448=='d') ) {
                                                        int LA34_449 = input.LA(13);

                                                        if ( (LA34_449=='$'||(LA34_449>='0' && LA34_449<='9')||(LA34_449>='A' && LA34_449<='Z')||LA34_449=='\\'||LA34_449=='_'||(LA34_449>='a' && LA34_449<='z')) ) {
                                                            alt34=129;
                                                        }
                                                        else {
                                                            alt34=63;}
                                                    }
                                                    else {
                                                        alt34=129;}
                                                }
                                                else {
                                                    alt34=129;}
                                            }
                                            else {
                                                alt34=129;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'u':
                {
                int LA34_81 = input.LA(3);

                if ( (LA34_81=='p') ) {
                    int LA34_187 = input.LA(4);

                    if ( (LA34_187=='e') ) {
                        int LA34_263 = input.LA(5);

                        if ( (LA34_263=='r') ) {
                            int LA34_321 = input.LA(6);

                            if ( (LA34_321=='$'||(LA34_321>='0' && LA34_321<='9')||(LA34_321>='A' && LA34_321<='Z')||LA34_321=='\\'||LA34_321=='_'||(LA34_321>='a' && LA34_321<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=62;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'h':
                {
                int LA34_82 = input.LA(3);

                if ( (LA34_82=='o') ) {
                    int LA34_188 = input.LA(4);

                    if ( (LA34_188=='r') ) {
                        int LA34_264 = input.LA(5);

                        if ( (LA34_264=='t') ) {
                            int LA34_322 = input.LA(6);

                            if ( (LA34_322=='$'||(LA34_322>='0' && LA34_322<='9')||(LA34_322>='A' && LA34_322<='Z')||LA34_322=='\\'||LA34_322=='_'||(LA34_322>='a' && LA34_322<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=60;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 't':
                {
                int LA34_83 = input.LA(3);

                if ( (LA34_83=='a') ) {
                    int LA34_189 = input.LA(4);

                    if ( (LA34_189=='t') ) {
                        int LA34_265 = input.LA(5);

                        if ( (LA34_265=='i') ) {
                            int LA34_323 = input.LA(6);

                            if ( (LA34_323=='c') ) {
                                int LA34_369 = input.LA(7);

                                if ( (LA34_369=='$'||(LA34_369>='0' && LA34_369<='9')||(LA34_369>='A' && LA34_369<='Z')||LA34_369=='\\'||LA34_369=='_'||(LA34_369>='a' && LA34_369<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=61;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'w':
                {
                int LA34_84 = input.LA(3);

                if ( (LA34_84=='i') ) {
                    int LA34_190 = input.LA(4);

                    if ( (LA34_190=='t') ) {
                        int LA34_266 = input.LA(5);

                        if ( (LA34_266=='c') ) {
                            int LA34_324 = input.LA(6);

                            if ( (LA34_324=='h') ) {
                                int LA34_370 = input.LA(7);

                                if ( (LA34_370=='$'||(LA34_370>='0' && LA34_370<='9')||(LA34_370>='A' && LA34_370<='Z')||LA34_370=='\\'||LA34_370=='_'||(LA34_370>='a' && LA34_370<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=21;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'v':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA34_85 = input.LA(3);

                if ( (LA34_85=='r') ) {
                    int LA34_191 = input.LA(4);

                    if ( (LA34_191=='$'||(LA34_191>='0' && LA34_191<='9')||(LA34_191>='A' && LA34_191<='Z')||LA34_191=='\\'||LA34_191=='_'||(LA34_191>='a' && LA34_191<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=26;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA34_192 = input.LA(4);

                    if ( (LA34_192=='d') ) {
                        int LA34_268 = input.LA(5);

                        if ( (LA34_268=='$'||(LA34_268>='0' && LA34_268<='9')||(LA34_268>='A' && LA34_268<='Z')||LA34_268=='\\'||LA34_268=='_'||(LA34_268>='a' && LA34_268<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=27;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'l':
                    {
                    int LA34_193 = input.LA(4);

                    if ( (LA34_193=='a') ) {
                        int LA34_269 = input.LA(5);

                        if ( (LA34_269=='t') ) {
                            int LA34_326 = input.LA(6);

                            if ( (LA34_326=='i') ) {
                                int LA34_371 = input.LA(7);

                                if ( (LA34_371=='l') ) {
                                    int LA34_403 = input.LA(8);

                                    if ( (LA34_403=='e') ) {
                                        int LA34_422 = input.LA(9);

                                        if ( (LA34_422=='$'||(LA34_422>='0' && LA34_422<='9')||(LA34_422>='A' && LA34_422<='Z')||LA34_422=='\\'||LA34_422=='_'||(LA34_422>='a' && LA34_422<='z')) ) {
                                            alt34=129;
                                        }
                                        else {
                                            alt34=66;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA34_87 = input.LA(3);

                if ( (LA34_87=='i') ) {
                    int LA34_194 = input.LA(4);

                    if ( (LA34_194=='l') ) {
                        int LA34_270 = input.LA(5);

                        if ( (LA34_270=='e') ) {
                            int LA34_327 = input.LA(6);

                            if ( (LA34_327=='$'||(LA34_327>='0' && LA34_327<='9')||(LA34_327>='A' && LA34_327<='Z')||LA34_327=='\\'||LA34_327=='_'||(LA34_327>='a' && LA34_327<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=28;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'i':
                {
                int LA34_88 = input.LA(3);

                if ( (LA34_88=='t') ) {
                    int LA34_195 = input.LA(4);

                    if ( (LA34_195=='h') ) {
                        int LA34_271 = input.LA(5);

                        if ( (LA34_271=='$'||(LA34_271>='0' && LA34_271<='9')||(LA34_271>='A' && LA34_271<='Z')||LA34_271=='\\'||LA34_271=='_'||(LA34_271>='a' && LA34_271<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=29;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'g':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA34_89 = input.LA(3);

                if ( (LA34_89=='t') ) {
                    int LA34_196 = input.LA(4);

                    if ( (LA34_196=='o') ) {
                        int LA34_272 = input.LA(5);

                        if ( (LA34_272=='$'||(LA34_272>='0' && LA34_272<='9')||(LA34_272>='A' && LA34_272<='Z')||LA34_272=='\\'||LA34_272=='_'||(LA34_272>='a' && LA34_272<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=49;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'e':
                {
                int LA34_90 = input.LA(3);

                if ( (LA34_90=='t') ) {
                    int LA34_197 = input.LA(4);

                    if ( (LA34_197=='$'||(LA34_197>='0' && LA34_197<='9')||(LA34_197>='A' && LA34_197<='Z')||LA34_197=='\\'||LA34_197=='_'||(LA34_197>='a' && LA34_197<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=30;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case 'y':
            {
            int LA34_14 = input.LA(2);

            if ( (LA34_14=='i') ) {
                int LA34_91 = input.LA(3);

                if ( (LA34_91=='e') ) {
                    int LA34_198 = input.LA(4);

                    if ( (LA34_198=='l') ) {
                        int LA34_274 = input.LA(5);

                        if ( (LA34_274=='d') ) {
                            int LA34_330 = input.LA(6);

                            if ( (LA34_330=='$'||(LA34_330>='0' && LA34_330<='9')||(LA34_330>='A' && LA34_330<='Z')||LA34_330=='\\'||LA34_330=='_'||(LA34_330>='a' && LA34_330<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=32;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
            }
            else {
                alt34=129;}
            }
            break;
        case 'C':
            {
            int LA34_15 = input.LA(2);

            if ( (LA34_15=='D') ) {
                int LA34_92 = input.LA(3);

                if ( (LA34_92=='A') ) {
                    int LA34_199 = input.LA(4);

                    if ( (LA34_199=='T') ) {
                        int LA34_275 = input.LA(5);

                        if ( (LA34_275=='A') ) {
                            int LA34_331 = input.LA(6);

                            if ( (LA34_331=='$'||(LA34_331>='0' && LA34_331<='9')||(LA34_331>='A' && LA34_331<='Z')||LA34_331=='\\'||LA34_331=='_'||(LA34_331>='a' && LA34_331<='z')) ) {
                                alt34=129;
                            }
                            else {
                                alt34=33;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
            }
            else {
                alt34=129;}
            }
            break;
        case 'x':
            {
            int LA34_16 = input.LA(2);

            if ( (LA34_16=='m') ) {
                int LA34_93 = input.LA(3);

                if ( (LA34_93=='l') ) {
                    int LA34_200 = input.LA(4);

                    if ( (LA34_200=='$'||(LA34_200>='0' && LA34_200<='9')||(LA34_200>='A' && LA34_200<='Z')||LA34_200=='\\'||LA34_200=='_'||(LA34_200>='a' && LA34_200<='z')) ) {
                        alt34=129;
                    }
                    else {
                        alt34=34;}
                }
                else {
                    alt34=129;}
            }
            else {
                alt34=129;}
            }
            break;
        case 'a':
            {
            int LA34_17 = input.LA(2);

            if ( (LA34_17=='b') ) {
                int LA34_94 = input.LA(3);

                if ( (LA34_94=='s') ) {
                    int LA34_201 = input.LA(4);

                    if ( (LA34_201=='t') ) {
                        int LA34_277 = input.LA(5);

                        if ( (LA34_277=='r') ) {
                            int LA34_332 = input.LA(6);

                            if ( (LA34_332=='a') ) {
                                int LA34_375 = input.LA(7);

                                if ( (LA34_375=='c') ) {
                                    int LA34_404 = input.LA(8);

                                    if ( (LA34_404=='t') ) {
                                        int LA34_423 = input.LA(9);

                                        if ( (LA34_423=='$'||(LA34_423>='0' && LA34_423<='9')||(LA34_423>='A' && LA34_423<='Z')||LA34_423=='\\'||LA34_423=='_'||(LA34_423>='a' && LA34_423<='z')) ) {
                                            alt34=129;
                                        }
                                        else {
                                            alt34=36;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
            }
            else {
                alt34=129;}
            }
            break;
        case 'l':
            {
            int LA34_18 = input.LA(2);

            if ( (LA34_18=='o') ) {
                int LA34_95 = input.LA(3);

                if ( (LA34_95=='n') ) {
                    int LA34_202 = input.LA(4);

                    if ( (LA34_202=='g') ) {
                        int LA34_278 = input.LA(5);

                        if ( (LA34_278=='$'||(LA34_278>='0' && LA34_278<='9')||(LA34_278>='A' && LA34_278<='Z')||LA34_278=='\\'||LA34_278=='_'||(LA34_278>='a' && LA34_278<='z')) ) {
                            alt34=129;
                        }
                        else {
                            alt34=54;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
            }
            else {
                alt34=129;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA34_96 = input.LA(3);

                if ( (LA34_96=='c') ) {
                    int LA34_203 = input.LA(4);

                    if ( (LA34_203=='k') ) {
                        int LA34_279 = input.LA(5);

                        if ( (LA34_279=='a') ) {
                            int LA34_334 = input.LA(6);

                            if ( (LA34_334=='g') ) {
                                int LA34_376 = input.LA(7);

                                if ( (LA34_376=='e') ) {
                                    int LA34_405 = input.LA(8);

                                    if ( (LA34_405=='$'||(LA34_405>='0' && LA34_405<='9')||(LA34_405>='A' && LA34_405<='Z')||LA34_405=='\\'||LA34_405=='_'||(LA34_405>='a' && LA34_405<='z')) ) {
                                        alt34=129;
                                    }
                                    else {
                                        alt34=56;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA34_204 = input.LA(4);

                    if ( (LA34_204=='v') ) {
                        int LA34_280 = input.LA(5);

                        if ( (LA34_280=='a') ) {
                            int LA34_335 = input.LA(6);

                            if ( (LA34_335=='t') ) {
                                int LA34_377 = input.LA(7);

                                if ( (LA34_377=='e') ) {
                                    int LA34_406 = input.LA(8);

                                    if ( (LA34_406=='$'||(LA34_406>='0' && LA34_406<='9')||(LA34_406>='A' && LA34_406<='Z')||LA34_406=='\\'||LA34_406=='_'||(LA34_406>='a' && LA34_406<='z')) ) {
                                        alt34=129;
                                    }
                                    else {
                                        alt34=57;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                case 'o':
                    {
                    int LA34_205 = input.LA(4);

                    if ( (LA34_205=='t') ) {
                        int LA34_281 = input.LA(5);

                        if ( (LA34_281=='e') ) {
                            int LA34_336 = input.LA(6);

                            if ( (LA34_336=='c') ) {
                                int LA34_378 = input.LA(7);

                                if ( (LA34_378=='t') ) {
                                    int LA34_407 = input.LA(8);

                                    if ( (LA34_407=='e') ) {
                                        int LA34_426 = input.LA(9);

                                        if ( (LA34_426=='d') ) {
                                            int LA34_438 = input.LA(10);

                                            if ( (LA34_438=='$'||(LA34_438>='0' && LA34_438<='9')||(LA34_438>='A' && LA34_438<='Z')||LA34_438=='\\'||LA34_438=='_'||(LA34_438>='a' && LA34_438<='z')) ) {
                                                alt34=129;
                                            }
                                            else {
                                                alt34=58;}
                                        }
                                        else {
                                            alt34=129;}
                                    }
                                    else {
                                        alt34=129;}
                                }
                                else {
                                    alt34=129;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                    }
                    break;
                default:
                    alt34=129;}

                }
                break;
            case 'u':
                {
                int LA34_98 = input.LA(3);

                if ( (LA34_98=='b') ) {
                    int LA34_206 = input.LA(4);

                    if ( (LA34_206=='l') ) {
                        int LA34_282 = input.LA(5);

                        if ( (LA34_282=='i') ) {
                            int LA34_337 = input.LA(6);

                            if ( (LA34_337=='c') ) {
                                int LA34_379 = input.LA(7);

                                if ( (LA34_379=='$'||(LA34_379>='0' && LA34_379<='9')||(LA34_379>='A' && LA34_379<='Z')||LA34_379=='\\'||LA34_379=='_'||(LA34_379>='a' && LA34_379<='z')) ) {
                                    alt34=129;
                                }
                                else {
                                    alt34=59;}
                            }
                            else {
                                alt34=129;}
                        }
                        else {
                            alt34=129;}
                    }
                    else {
                        alt34=129;}
                }
                else {
                    alt34=129;}
                }
                break;
            default:
                alt34=129;}

            }
            break;
        case '{':
            {
            alt34=67;
            }
            break;
        case '}':
            {
            alt34=68;
            }
            break;
        case '(':
            {
            alt34=69;
            }
            break;
        case ')':
            {
            alt34=70;
            }
            break;
        case '[':
            {
            alt34=71;
            }
            break;
        case ']':
            {
            alt34=72;
            }
            break;
        case '.':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt34=123;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt34=131;
                }
                break;
            default:
                alt34=73;}

            }
            break;
        case ';':
            {
            alt34=74;
            }
            break;
        case ',':
            {
            alt34=75;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '<':
                {
                int LA34_101 = input.LA(3);

                if ( (LA34_101=='=') ) {
                    alt34=107;
                }
                else {
                    alt34=90;}
                }
                break;
            case '=':
                {
                alt34=78;
                }
                break;
            case '!':
                {
                int LA34_103 = input.LA(3);

                if ( (LA34_103=='-') ) {
                    alt34=115;
                }
                else if ( (LA34_103=='[') ) {
                    alt34=119;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | GET | SET | YIELD | CDATA | WXML | NAMESPACE | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | XCOPEN | XCCLOSE | XLCLOSE | XRCLOSE | CDATAOPEN | XHOPEN | XHCLOSE | AT | DOTDOT | COLONCOLON | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | XmlAttribute | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral );", 34, 103, input);

                    throw nvae;
                }
                }
                break;
            case '?':
                {
                alt34=120;
                }
                break;
            case '/':
                {
                alt34=117;
                }
                break;
            default:
                alt34=76;}

            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                switch ( input.LA(3) ) {
                case '=':
                    {
                    alt34=108;
                    }
                    break;
                case '>':
                    {
                    int LA34_212 = input.LA(4);

                    if ( (LA34_212=='=') ) {
                        alt34=109;
                    }
                    else {
                        alt34=92;}
                    }
                    break;
                default:
                    alt34=91;}

                }
                break;
            case '=':
                {
                alt34=79;
                }
                break;
            default:
                alt34=77;}

            }
            break;
        case '=':
            {
            int LA34_31 = input.LA(2);

            if ( (LA34_31=='=') ) {
                int LA34_110 = input.LA(3);

                if ( (LA34_110=='=') ) {
                    alt34=82;
                }
                else {
                    alt34=80;}
            }
            else {
                alt34=102;}
            }
            break;
        case '!':
            {
            int LA34_32 = input.LA(2);

            if ( (LA34_32=='=') ) {
                int LA34_112 = input.LA(3);

                if ( (LA34_112=='=') ) {
                    alt34=83;
                }
                else {
                    alt34=81;}
            }
            else {
                alt34=96;}
            }
            break;
        case '+':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt34=103;
                }
                break;
            case '+':
                {
                alt34=88;
                }
                break;
            default:
                alt34=84;}

            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt34=104;
                }
                break;
            case '-':
                {
                int LA34_118 = input.LA(3);

                if ( (LA34_118=='>') ) {
                    alt34=116;
                }
                else {
                    alt34=89;}
                }
                break;
            default:
                alt34=85;}

            }
            break;
        case '*':
            {
            int LA34_35 = input.LA(2);

            if ( (LA34_35=='=') ) {
                alt34=105;
            }
            else {
                alt34=86;}
            }
            break;
        case '%':
            {
            int LA34_36 = input.LA(2);

            if ( (LA34_36=='=') ) {
                alt34=106;
            }
            else {
                alt34=87;}
            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '&':
                {
                alt34=98;
                }
                break;
            case '=':
                {
                alt34=110;
                }
                break;
            default:
                alt34=93;}

            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '|':
                {
                alt34=99;
                }
                break;
            case '=':
                {
                alt34=111;
                }
                break;
            default:
                alt34=94;}

            }
            break;
        case '^':
            {
            int LA34_39 = input.LA(2);

            if ( (LA34_39=='=') ) {
                alt34=112;
            }
            else {
                alt34=95;}
            }
            break;
        case '~':
            {
            alt34=97;
            }
            break;
        case '?':
            {
            int LA34_41 = input.LA(2);

            if ( (LA34_41=='>') ) {
                alt34=121;
            }
            else {
                alt34=100;}
            }
            break;
        case ':':
            {
            int LA34_42 = input.LA(2);

            if ( (LA34_42==':') ) {
                alt34=124;
            }
            else {
                alt34=101;}
            }
            break;
        case '/':
            {
            int LA34_43 = input.LA(2);

            if ( (LA34_43=='=') ) {
                int LA34_136 = input.LA(3);

                if ( ((LA34_136>='\u0000' && LA34_136<='\t')||(LA34_136>='\u000B' && LA34_136<='\f')||(LA34_136>='\u000E' && LA34_136<='\u2027')||(LA34_136>='\u202A' && LA34_136<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt34=135;
                }
                else {
                    alt34=114;}
            }
            else if ( (LA34_43=='*') ) {
                alt34=127;
            }
            else if ( (LA34_43=='/') ) {
                alt34=128;
            }
            else if ( (LA34_43=='>') ) {
                int LA34_139 = input.LA(3);

                if ( ((LA34_139>='\u0000' && LA34_139<='\t')||(LA34_139>='\u000B' && LA34_139<='\f')||(LA34_139>='\u000E' && LA34_139<='\u2027')||(LA34_139>='\u202A' && LA34_139<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt34=135;
                }
                else {
                    alt34=118;}
            }
            else if ( ((LA34_43>='\u0000' && LA34_43<='\t')||(LA34_43>='\u000B' && LA34_43<='\f')||(LA34_43>='\u000E' && LA34_43<=')')||(LA34_43>='+' && LA34_43<='.')||(LA34_43>='0' && LA34_43<='<')||(LA34_43>='?' && LA34_43<='\u2027')||(LA34_43>='\u202A' && LA34_43<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                alt34=135;
            }
            else {
                alt34=113;}
            }
            break;
        case '@':
            {
            int LA34_44 = input.LA(2);

            if ( (LA34_44=='$'||(LA34_44>='A' && LA34_44<='Z')||LA34_44=='\\'||LA34_44=='_'||(LA34_44>='a' && LA34_44<='z')) ) {
                alt34=130;
            }
            else {
                alt34=122;}
            }
            break;
        case '\t':
        case '\u000B':
        case '\f':
        case ' ':
        case '\u00A0':
        case '\u1680':
        case '\u180E':
        case '\u2000':
        case '\u2001':
        case '\u2002':
        case '\u2003':
        case '\u2004':
        case '\u2005':
        case '\u2006':
        case '\u2007':
        case '\u2008':
        case '\u2009':
        case '\u200A':
        case '\u202F':
        case '\u205F':
        case '\u3000':
            {
            alt34=125;
            }
            break;
        case '\n':
        case '\r':
        case '\u2028':
        case '\u2029':
            {
            alt34=126;
            }
            break;
        case '0':
            {
            switch ( input.LA(2) ) {
            case 'X':
            case 'x':
                {
                alt34=133;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt34=132;
                }
                break;
            default:
                alt34=131;}

            }
            break;
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt34=131;
            }
            break;
        case '\"':
        case '\'':
            {
            alt34=134;
            }
            break;
        default:
            alt34=129;}

        switch (alt34) {
            case 1 :
                // JS.g:1:10: NULL
                {
                mNULL(); 

                }
                break;
            case 2 :
                // JS.g:1:15: TRUE
                {
                mTRUE(); 

                }
                break;
            case 3 :
                // JS.g:1:20: FALSE
                {
                mFALSE(); 

                }
                break;
            case 4 :
                // JS.g:1:26: BREAK
                {
                mBREAK(); 

                }
                break;
            case 5 :
                // JS.g:1:32: CASE
                {
                mCASE(); 

                }
                break;
            case 6 :
                // JS.g:1:37: CATCH
                {
                mCATCH(); 

                }
                break;
            case 7 :
                // JS.g:1:43: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 8 :
                // JS.g:1:52: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 9 :
                // JS.g:1:60: DELETE
                {
                mDELETE(); 

                }
                break;
            case 10 :
                // JS.g:1:67: DO
                {
                mDO(); 

                }
                break;
            case 11 :
                // JS.g:1:70: ELSE
                {
                mELSE(); 

                }
                break;
            case 12 :
                // JS.g:1:75: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 13 :
                // JS.g:1:83: FOR
                {
                mFOR(); 

                }
                break;
            case 14 :
                // JS.g:1:87: EACH
                {
                mEACH(); 

                }
                break;
            case 15 :
                // JS.g:1:92: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 16 :
                // JS.g:1:101: IF
                {
                mIF(); 

                }
                break;
            case 17 :
                // JS.g:1:104: IN
                {
                mIN(); 

                }
                break;
            case 18 :
                // JS.g:1:107: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 19 :
                // JS.g:1:118: NEW
                {
                mNEW(); 

                }
                break;
            case 20 :
                // JS.g:1:122: RETURN
                {
                mRETURN(); 

                }
                break;
            case 21 :
                // JS.g:1:129: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 22 :
                // JS.g:1:136: THIS
                {
                mTHIS(); 

                }
                break;
            case 23 :
                // JS.g:1:141: THROW
                {
                mTHROW(); 

                }
                break;
            case 24 :
                // JS.g:1:147: TRY
                {
                mTRY(); 

                }
                break;
            case 25 :
                // JS.g:1:151: TYPEOF
                {
                mTYPEOF(); 

                }
                break;
            case 26 :
                // JS.g:1:158: VAR
                {
                mVAR(); 

                }
                break;
            case 27 :
                // JS.g:1:162: VOID
                {
                mVOID(); 

                }
                break;
            case 28 :
                // JS.g:1:167: WHILE
                {
                mWHILE(); 

                }
                break;
            case 29 :
                // JS.g:1:173: WITH
                {
                mWITH(); 

                }
                break;
            case 30 :
                // JS.g:1:178: GET
                {
                mGET(); 

                }
                break;
            case 31 :
                // JS.g:1:182: SET
                {
                mSET(); 

                }
                break;
            case 32 :
                // JS.g:1:186: YIELD
                {
                mYIELD(); 

                }
                break;
            case 33 :
                // JS.g:1:192: CDATA
                {
                mCDATA(); 

                }
                break;
            case 34 :
                // JS.g:1:198: WXML
                {
                mWXML(); 

                }
                break;
            case 35 :
                // JS.g:1:203: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 36 :
                // JS.g:1:213: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 37 :
                // JS.g:1:222: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 38 :
                // JS.g:1:230: BYTE
                {
                mBYTE(); 

                }
                break;
            case 39 :
                // JS.g:1:235: CHAR
                {
                mCHAR(); 

                }
                break;
            case 40 :
                // JS.g:1:240: CLASS
                {
                mCLASS(); 

                }
                break;
            case 41 :
                // JS.g:1:246: CONST
                {
                mCONST(); 

                }
                break;
            case 42 :
                // JS.g:1:252: DEBUGGER
                {
                mDEBUGGER(); 

                }
                break;
            case 43 :
                // JS.g:1:261: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 44 :
                // JS.g:1:268: ENUM
                {
                mENUM(); 

                }
                break;
            case 45 :
                // JS.g:1:273: EXPORT
                {
                mEXPORT(); 

                }
                break;
            case 46 :
                // JS.g:1:280: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 47 :
                // JS.g:1:288: FINAL
                {
                mFINAL(); 

                }
                break;
            case 48 :
                // JS.g:1:294: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 49 :
                // JS.g:1:300: GOTO
                {
                mGOTO(); 

                }
                break;
            case 50 :
                // JS.g:1:305: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 51 :
                // JS.g:1:316: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 52 :
                // JS.g:1:323: INT
                {
                mINT(); 

                }
                break;
            case 53 :
                // JS.g:1:327: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 54 :
                // JS.g:1:337: LONG
                {
                mLONG(); 

                }
                break;
            case 55 :
                // JS.g:1:342: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 56 :
                // JS.g:1:349: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 57 :
                // JS.g:1:357: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 58 :
                // JS.g:1:365: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 59 :
                // JS.g:1:375: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 60 :
                // JS.g:1:382: SHORT
                {
                mSHORT(); 

                }
                break;
            case 61 :
                // JS.g:1:388: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 62 :
                // JS.g:1:395: SUPER
                {
                mSUPER(); 

                }
                break;
            case 63 :
                // JS.g:1:401: SYNCHRONIZED
                {
                mSYNCHRONIZED(); 

                }
                break;
            case 64 :
                // JS.g:1:414: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 65 :
                // JS.g:1:421: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 66 :
                // JS.g:1:431: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 67 :
                // JS.g:1:440: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 68 :
                // JS.g:1:447: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 69 :
                // JS.g:1:454: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 70 :
                // JS.g:1:461: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 71 :
                // JS.g:1:468: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 72 :
                // JS.g:1:475: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 73 :
                // JS.g:1:482: DOT
                {
                mDOT(); 

                }
                break;
            case 74 :
                // JS.g:1:486: SEMIC
                {
                mSEMIC(); 

                }
                break;
            case 75 :
                // JS.g:1:492: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 76 :
                // JS.g:1:498: LT
                {
                mLT(); 

                }
                break;
            case 77 :
                // JS.g:1:501: GT
                {
                mGT(); 

                }
                break;
            case 78 :
                // JS.g:1:504: LTE
                {
                mLTE(); 

                }
                break;
            case 79 :
                // JS.g:1:508: GTE
                {
                mGTE(); 

                }
                break;
            case 80 :
                // JS.g:1:512: EQ
                {
                mEQ(); 

                }
                break;
            case 81 :
                // JS.g:1:515: NEQ
                {
                mNEQ(); 

                }
                break;
            case 82 :
                // JS.g:1:519: SAME
                {
                mSAME(); 

                }
                break;
            case 83 :
                // JS.g:1:524: NSAME
                {
                mNSAME(); 

                }
                break;
            case 84 :
                // JS.g:1:530: ADD
                {
                mADD(); 

                }
                break;
            case 85 :
                // JS.g:1:534: SUB
                {
                mSUB(); 

                }
                break;
            case 86 :
                // JS.g:1:538: MUL
                {
                mMUL(); 

                }
                break;
            case 87 :
                // JS.g:1:542: MOD
                {
                mMOD(); 

                }
                break;
            case 88 :
                // JS.g:1:546: INC
                {
                mINC(); 

                }
                break;
            case 89 :
                // JS.g:1:550: DEC
                {
                mDEC(); 

                }
                break;
            case 90 :
                // JS.g:1:554: SHL
                {
                mSHL(); 

                }
                break;
            case 91 :
                // JS.g:1:558: SHR
                {
                mSHR(); 

                }
                break;
            case 92 :
                // JS.g:1:562: SHU
                {
                mSHU(); 

                }
                break;
            case 93 :
                // JS.g:1:566: AND
                {
                mAND(); 

                }
                break;
            case 94 :
                // JS.g:1:570: OR
                {
                mOR(); 

                }
                break;
            case 95 :
                // JS.g:1:573: XOR
                {
                mXOR(); 

                }
                break;
            case 96 :
                // JS.g:1:577: NOT
                {
                mNOT(); 

                }
                break;
            case 97 :
                // JS.g:1:581: INV
                {
                mINV(); 

                }
                break;
            case 98 :
                // JS.g:1:585: LAND
                {
                mLAND(); 

                }
                break;
            case 99 :
                // JS.g:1:590: LOR
                {
                mLOR(); 

                }
                break;
            case 100 :
                // JS.g:1:594: QUE
                {
                mQUE(); 

                }
                break;
            case 101 :
                // JS.g:1:598: COLON
                {
                mCOLON(); 

                }
                break;
            case 102 :
                // JS.g:1:604: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 103 :
                // JS.g:1:611: ADDASS
                {
                mADDASS(); 

                }
                break;
            case 104 :
                // JS.g:1:618: SUBASS
                {
                mSUBASS(); 

                }
                break;
            case 105 :
                // JS.g:1:625: MULASS
                {
                mMULASS(); 

                }
                break;
            case 106 :
                // JS.g:1:632: MODASS
                {
                mMODASS(); 

                }
                break;
            case 107 :
                // JS.g:1:639: SHLASS
                {
                mSHLASS(); 

                }
                break;
            case 108 :
                // JS.g:1:646: SHRASS
                {
                mSHRASS(); 

                }
                break;
            case 109 :
                // JS.g:1:653: SHUASS
                {
                mSHUASS(); 

                }
                break;
            case 110 :
                // JS.g:1:660: ANDASS
                {
                mANDASS(); 

                }
                break;
            case 111 :
                // JS.g:1:667: ORASS
                {
                mORASS(); 

                }
                break;
            case 112 :
                // JS.g:1:673: XORASS
                {
                mXORASS(); 

                }
                break;
            case 113 :
                // JS.g:1:680: DIV
                {
                mDIV(); 

                }
                break;
            case 114 :
                // JS.g:1:684: DIVASS
                {
                mDIVASS(); 

                }
                break;
            case 115 :
                // JS.g:1:691: XCOPEN
                {
                mXCOPEN(); 

                }
                break;
            case 116 :
                // JS.g:1:698: XCCLOSE
                {
                mXCCLOSE(); 

                }
                break;
            case 117 :
                // JS.g:1:706: XLCLOSE
                {
                mXLCLOSE(); 

                }
                break;
            case 118 :
                // JS.g:1:714: XRCLOSE
                {
                mXRCLOSE(); 

                }
                break;
            case 119 :
                // JS.g:1:722: CDATAOPEN
                {
                mCDATAOPEN(); 

                }
                break;
            case 120 :
                // JS.g:1:732: XHOPEN
                {
                mXHOPEN(); 

                }
                break;
            case 121 :
                // JS.g:1:739: XHCLOSE
                {
                mXHCLOSE(); 

                }
                break;
            case 122 :
                // JS.g:1:747: AT
                {
                mAT(); 

                }
                break;
            case 123 :
                // JS.g:1:750: DOTDOT
                {
                mDOTDOT(); 

                }
                break;
            case 124 :
                // JS.g:1:757: COLONCOLON
                {
                mCOLONCOLON(); 

                }
                break;
            case 125 :
                // JS.g:1:768: WhiteSpace
                {
                mWhiteSpace(); 

                }
                break;
            case 126 :
                // JS.g:1:779: EOL
                {
                mEOL(); 

                }
                break;
            case 127 :
                // JS.g:1:783: MultiLineComment
                {
                mMultiLineComment(); 

                }
                break;
            case 128 :
                // JS.g:1:800: SingleLineComment
                {
                mSingleLineComment(); 

                }
                break;
            case 129 :
                // JS.g:1:818: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 130 :
                // JS.g:1:829: XmlAttribute
                {
                mXmlAttribute(); 

                }
                break;
            case 131 :
                // JS.g:1:842: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 132 :
                // JS.g:1:857: OctalIntegerLiteral
                {
                mOctalIntegerLiteral(); 

                }
                break;
            case 133 :
                // JS.g:1:877: HexIntegerLiteral
                {
                mHexIntegerLiteral(); 

                }
                break;
            case 134 :
                // JS.g:1:895: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 135 :
                // JS.g:1:909: RegularExpressionLiteral
                {
                mRegularExpressionLiteral(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\2\4\3\uffff\1\4";
    static final String DFA21_eofS =
        "\7\uffff";
    static final String DFA21_minS =
        "\3\56\3\uffff\1\56";
    static final String DFA21_maxS =
        "\1\71\1\56\1\71\3\uffff\1\71";
    static final String DFA21_acceptS =
        "\3\uffff\1\2\1\3\1\1\1\uffff";
    static final String DFA21_specialS =
        "\7\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\5",
            "\1\5\1\uffff\12\6",
            "",
            "",
            "",
            "\1\5\1\uffff\12\6"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "869:1: DecimalLiteral : ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? );";
        }
    }
 

}
// $ANTLR 3.0.1 JS.g 2009-08-28 15:30:49

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSLexer extends Lexer {
    public static final int PACKAGE=59;
    public static final int FUNCTION=18;
    public static final int SHR=94;
    public static final int VT=154;
    public static final int RegularExpressionChar=192;
    public static final int CDATA=36;
    public static final int LOCALNAME=134;
    public static final int XRCLOSE=121;
    public static final int SHL=93;
    public static final int MOD=90;
    public static final int XHOPEN=123;
    public static final int CONST=44;
    public static final int DQUOTE=151;
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
    public static final int XML=149;
    public static final int LAND=101;
    public static final int PINC=147;
    public static final int PROTECTED=61;
    public static final int LBRACK=74;
    public static final int LBRACE=70;
    public static final int RegularExpressionLiteral=177;
    public static final int SUB=88;
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
    public static final int SET=34;
    public static final int SHORT=63;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=152;
    public static final int Tokens=194;
    public static final int SAME=85;
    public static final int XHCLOSE=124;
    public static final int StringLiteral=168;
    public static final int COLON=104;
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

    private Token last;

    final static boolean isIdentifierKeyword(int token)
    {
    	return token == WXML; 
    }

    private final boolean areRegularExpressionsEnabled()
    {
    	if (last == null)
    	{
    		return true;
    	}
    	if (isIdentifierKeyword(last.getType())) {
    		return true; 
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
            // JS.g:138:6: ( 'null' )
            // JS.g:138:8: 'null'
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
            // JS.g:139:6: ( 'true' )
            // JS.g:139:8: 'true'
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
            // JS.g:140:7: ( 'false' )
            // JS.g:140:9: 'false'
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
            // JS.g:141:7: ( 'break' )
            // JS.g:141:9: 'break'
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
            // JS.g:142:6: ( 'case' )
            // JS.g:142:8: 'case'
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
            // JS.g:143:7: ( 'catch' )
            // JS.g:143:9: 'catch'
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
            // JS.g:144:10: ( 'continue' )
            // JS.g:144:12: 'continue'
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
            // JS.g:145:9: ( 'default' )
            // JS.g:145:11: 'default'
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
            // JS.g:146:8: ( 'delete' )
            // JS.g:146:10: 'delete'
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
            // JS.g:147:4: ( 'do' )
            // JS.g:147:6: 'do'
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
            // JS.g:148:6: ( 'else' )
            // JS.g:148:8: 'else'
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
            // JS.g:149:9: ( 'finally' )
            // JS.g:149:11: 'finally'
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
            // JS.g:150:5: ( 'for' )
            // JS.g:150:7: 'for'
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
            // JS.g:151:6: ( 'each' )
            // JS.g:151:8: 'each'
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
            // JS.g:152:10: ( 'function' )
            // JS.g:152:12: 'function'
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
            // JS.g:153:4: ( 'if' )
            // JS.g:153:6: 'if'
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
            // JS.g:154:4: ( 'in' )
            // JS.g:154:6: 'in'
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
            // JS.g:155:12: ( 'instanceof' )
            // JS.g:155:14: 'instanceof'
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
            // JS.g:156:5: ( 'new' )
            // JS.g:156:7: 'new'
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
            // JS.g:157:8: ( 'return' )
            // JS.g:157:10: 'return'
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
            // JS.g:158:8: ( 'switch' )
            // JS.g:158:10: 'switch'
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
            // JS.g:159:6: ( 'this' )
            // JS.g:159:8: 'this'
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
            // JS.g:160:7: ( 'throw' )
            // JS.g:160:9: 'throw'
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
            // JS.g:161:5: ( 'try' )
            // JS.g:161:7: 'try'
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
            // JS.g:162:8: ( 'typeof' )
            // JS.g:162:10: 'typeof'
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
            // JS.g:163:5: ( 'var' )
            // JS.g:163:7: 'var'
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
            // JS.g:164:6: ( 'void' )
            // JS.g:164:8: 'void'
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
            // JS.g:165:7: ( 'while' )
            // JS.g:165:9: 'while'
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
            // JS.g:166:6: ( 'with' )
            // JS.g:166:8: 'with'
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
            // JS.g:167:5: ( 'get' )
            // JS.g:167:7: 'get'
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
            // JS.g:168:5: ( 'set' )
            // JS.g:168:7: 'set'
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
            // JS.g:169:7: ( 'yield' )
            // JS.g:169:9: 'yield'
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
            // JS.g:170:7: ( 'CDATA' )
            // JS.g:170:9: 'CDATA'
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
            // JS.g:171:6: ( 'xml' )
            // JS.g:171:8: 'xml'
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
            // JS.g:172:11: ( 'namespace' )
            // JS.g:172:13: 'namespace'
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
            // JS.g:173:10: ( 'abstract' )
            // JS.g:173:12: 'abstract'
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
            // JS.g:174:9: ( 'boolean' )
            // JS.g:174:11: 'boolean'
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
            // JS.g:175:6: ( 'byte' )
            // JS.g:175:8: 'byte'
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
            // JS.g:176:6: ( 'char' )
            // JS.g:176:8: 'char'
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
            // JS.g:177:7: ( 'class' )
            // JS.g:177:9: 'class'
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
            // JS.g:178:7: ( 'const' )
            // JS.g:178:9: 'const'
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
            // JS.g:179:10: ( 'debugger' )
            // JS.g:179:12: 'debugger'
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
            // JS.g:180:8: ( 'double' )
            // JS.g:180:10: 'double'
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
            // JS.g:181:6: ( 'enum' )
            // JS.g:181:8: 'enum'
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
            // JS.g:182:8: ( 'export' )
            // JS.g:182:10: 'export'
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
            // JS.g:183:9: ( 'extends' )
            // JS.g:183:11: 'extends'
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
            // JS.g:184:7: ( 'final' )
            // JS.g:184:9: 'final'
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
            // JS.g:185:7: ( 'float' )
            // JS.g:185:9: 'float'
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
            // JS.g:186:6: ( 'goto' )
            // JS.g:186:8: 'goto'
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
            // JS.g:187:12: ( 'implements' )
            // JS.g:187:14: 'implements'
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
            // JS.g:188:8: ( 'import' )
            // JS.g:188:10: 'import'
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
            // JS.g:189:5: ( 'int' )
            // JS.g:189:7: 'int'
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
            // JS.g:190:11: ( 'interface' )
            // JS.g:190:13: 'interface'
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
            // JS.g:191:6: ( 'long' )
            // JS.g:191:8: 'long'
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
            // JS.g:192:8: ( 'native' )
            // JS.g:192:10: 'native'
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
            // JS.g:193:9: ( 'package' )
            // JS.g:193:11: 'package'
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
            // JS.g:194:9: ( 'private' )
            // JS.g:194:11: 'private'
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
            // JS.g:195:11: ( 'protected' )
            // JS.g:195:13: 'protected'
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
            // JS.g:196:8: ( 'public' )
            // JS.g:196:10: 'public'
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
            // JS.g:197:7: ( 'short' )
            // JS.g:197:9: 'short'
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
            // JS.g:198:8: ( 'static' )
            // JS.g:198:10: 'static'
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
            // JS.g:199:7: ( 'super' )
            // JS.g:199:9: 'super'
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
            // JS.g:200:14: ( 'synchronized' )
            // JS.g:200:16: 'synchronized'
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
            // JS.g:201:8: ( 'throws' )
            // JS.g:201:10: 'throws'
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
            // JS.g:202:11: ( 'transient' )
            // JS.g:202:13: 'transient'
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
            // JS.g:203:10: ( 'volatile' )
            // JS.g:203:12: 'volatile'
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
            // JS.g:204:8: ( '{' )
            // JS.g:204:10: '{'
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
            // JS.g:205:8: ( '}' )
            // JS.g:205:10: '}'
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
            // JS.g:206:8: ( '(' )
            // JS.g:206:10: '('
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
            // JS.g:207:8: ( ')' )
            // JS.g:207:10: ')'
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
            // JS.g:208:8: ( '[' )
            // JS.g:208:10: '['
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
            // JS.g:209:8: ( ']' )
            // JS.g:209:10: ']'
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
            // JS.g:210:5: ( '.' )
            // JS.g:210:7: '.'
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
            // JS.g:211:7: ( ';' )
            // JS.g:211:9: ';'
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
            // JS.g:212:7: ( ',' )
            // JS.g:212:9: ','
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
            // JS.g:213:4: ( '<' )
            // JS.g:213:6: '<'
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
            // JS.g:214:4: ( '>' )
            // JS.g:214:6: '>'
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
            // JS.g:215:5: ( '<=' )
            // JS.g:215:7: '<='
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
            // JS.g:216:5: ( '>=' )
            // JS.g:216:7: '>='
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
            // JS.g:217:4: ( '==' )
            // JS.g:217:6: '=='
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
            // JS.g:218:5: ( '!=' )
            // JS.g:218:7: '!='
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
            // JS.g:219:6: ( '===' )
            // JS.g:219:8: '==='
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
            // JS.g:220:7: ( '!==' )
            // JS.g:220:9: '!=='
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
            // JS.g:221:5: ( '+' )
            // JS.g:221:7: '+'
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
            // JS.g:222:5: ( '-' )
            // JS.g:222:7: '-'
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
            // JS.g:223:5: ( '*' )
            // JS.g:223:7: '*'
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
            // JS.g:224:5: ( '%' )
            // JS.g:224:7: '%'
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
            // JS.g:225:5: ( '++' )
            // JS.g:225:7: '++'
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
            // JS.g:226:5: ( '--' )
            // JS.g:226:7: '--'
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
            // JS.g:227:5: ( '<<' )
            // JS.g:227:7: '<<'
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
            // JS.g:228:5: ( '>>' )
            // JS.g:228:7: '>>'
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
            // JS.g:229:5: ( '>>>' )
            // JS.g:229:7: '>>>'
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
            // JS.g:230:5: ( '&' )
            // JS.g:230:7: '&'
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
            // JS.g:231:4: ( '|' )
            // JS.g:231:6: '|'
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
            // JS.g:232:5: ( '^' )
            // JS.g:232:7: '^'
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
            // JS.g:233:5: ( '!' )
            // JS.g:233:7: '!'
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
            // JS.g:234:5: ( '~' )
            // JS.g:234:7: '~'
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
            // JS.g:235:6: ( '&&' )
            // JS.g:235:8: '&&'
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
            // JS.g:236:5: ( '||' )
            // JS.g:236:7: '||'
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
            // JS.g:237:5: ( '?' )
            // JS.g:237:7: '?'
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
            // JS.g:238:7: ( ':' )
            // JS.g:238:9: ':'
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
            // JS.g:239:8: ( '=' )
            // JS.g:239:10: '='
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
            // JS.g:240:8: ( '+=' )
            // JS.g:240:10: '+='
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
            // JS.g:241:8: ( '-=' )
            // JS.g:241:10: '-='
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
            // JS.g:242:8: ( '*=' )
            // JS.g:242:10: '*='
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
            // JS.g:243:8: ( '%=' )
            // JS.g:243:10: '%='
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
            // JS.g:244:8: ( '<<=' )
            // JS.g:244:10: '<<='
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
            // JS.g:245:8: ( '>>=' )
            // JS.g:245:10: '>>='
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
            // JS.g:246:8: ( '>>>=' )
            // JS.g:246:10: '>>>='
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
            // JS.g:247:8: ( '&=' )
            // JS.g:247:10: '&='
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
            // JS.g:248:7: ( '|=' )
            // JS.g:248:9: '|='
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
            // JS.g:249:8: ( '^=' )
            // JS.g:249:10: '^='
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
            // JS.g:250:5: ( '/' )
            // JS.g:250:7: '/'
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
            // JS.g:251:8: ( '/=' )
            // JS.g:251:10: '/='
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
            // JS.g:252:8: ( '<!--' )
            // JS.g:252:10: '<!--'
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
            // JS.g:253:9: ( '-->' )
            // JS.g:253:11: '-->'
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
            // JS.g:254:9: ( '</' )
            // JS.g:254:11: '</'
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
            // JS.g:255:9: ( '/>' )
            // JS.g:255:11: '/>'
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
            // JS.g:256:11: ( '<![' )
            // JS.g:256:13: '<!['
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
            // JS.g:257:8: ( '<?' )
            // JS.g:257:10: '<?'
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
            // JS.g:258:9: ( '?>' )
            // JS.g:258:11: '?>'
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
            // JS.g:259:4: ( '@' )
            // JS.g:259:6: '@'
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
            // JS.g:260:8: ( '..' )
            // JS.g:260:10: '..'
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
            // JS.g:261:12: ( '::' )
            // JS.g:261:14: '::'
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
            // JS.g:503:2: ( '\\\\' )
            // JS.g:503:4: '\\\\'
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
            // JS.g:507:2: ( '\"' )
            // JS.g:507:4: '\"'
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
            // JS.g:511:2: ( '\\'' )
            // JS.g:511:4: '\\''
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
            // JS.g:517:2: ( '\\u0009' )
            // JS.g:517:4: '\\u0009'
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
            // JS.g:521:2: ( '\\u000b' )
            // JS.g:521:4: '\\u000b'
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
            // JS.g:525:2: ( '\\u000c' )
            // JS.g:525:4: '\\u000c'
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
            // JS.g:529:2: ( '\\u0020' )
            // JS.g:529:4: '\\u0020'
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
            // JS.g:533:2: ( '\\u00a0' )
            // JS.g:533:4: '\\u00a0'
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
            // JS.g:537:2: ( '\\u1680' | '\\u180E' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u202F' | '\\u205F' | '\\u3000' )
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
            // JS.g:556:2: ( ( TAB | VT | FF | SP | NBSP | USP )+ )
            // JS.g:556:4: ( TAB | VT | FF | SP | NBSP | USP )+
            {
            // JS.g:556:4: ( TAB | VT | FF | SP | NBSP | USP )+
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
            // JS.g:564:2: ( '\\n' )
            // JS.g:564:4: '\\n'
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
            // JS.g:568:2: ( '\\r' )
            // JS.g:568:4: '\\r'
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
            // JS.g:572:2: ( '\\u2028' )
            // JS.g:572:4: '\\u2028'
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
            // JS.g:576:2: ( '\\u2029' )
            // JS.g:576:4: '\\u2029'
            {
            match('\u2029'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end PS

    // $ANTLR start LineTerminator
    public final void mLineTerminator() throws RecognitionException {
        try {
            // JS.g:580:2: ( CR | LF | LS | PS )
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
    // $ANTLR end LineTerminator

    // $ANTLR start EOL
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            // JS.g:584:2: ( ( ( CR ( LF )? ) | LF | LS | PS ) )
            // JS.g:584:4: ( ( CR ( LF )? ) | LF | LS | PS )
            {
            // JS.g:584:4: ( ( CR ( LF )? ) | LF | LS | PS )
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
                    new NoViableAltException("584:4: ( ( CR ( LF )? ) | LF | LS | PS )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // JS.g:584:6: ( CR ( LF )? )
                    {
                    // JS.g:584:6: ( CR ( LF )? )
                    // JS.g:584:8: CR ( LF )?
                    {
                    mCR(); 
                    // JS.g:584:11: ( LF )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\n') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // JS.g:584:11: LF
                            {
                            mLF(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // JS.g:584:19: LF
                    {
                    mLF(); 

                    }
                    break;
                case 3 :
                    // JS.g:584:24: LS
                    {
                    mLS(); 

                    }
                    break;
                case 4 :
                    // JS.g:584:29: PS
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
            // JS.g:591:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // JS.g:591:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // JS.g:591:9: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFE')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // JS.g:591:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // JS.g:595:2: ( '//' (~ ( LineTerminator ) )* )
            // JS.g:595:4: '//' (~ ( LineTerminator ) )*
            {
            match("//"); 

            // JS.g:595:9: (~ ( LineTerminator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u2027')||(LA5_0>='\u202A' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JS.g:595:11: ~ ( LineTerminator )
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
            	    break loop5;
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
            // JS.g:704:2: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit )
            int alt6=5;
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
                alt6=1;
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
                alt6=2;
                }
                break;
            case '$':
                {
                alt6=3;
                }
                break;
            case '_':
                {
                alt6=4;
                }
                break;
            case '\\':
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("703:10: fragment IdentifierStartASCII : ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // JS.g:704:4: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // JS.g:704:15: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // JS.g:705:4: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 4 :
                    // JS.g:706:4: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 5 :
                    // JS.g:707:4: BSLASH 'u' HexDigit HexDigit HexDigit HexDigit
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
            // JS.g:715:2: ( DecimalDigit | IdentifierStartASCII | {...}?)
            int alt7=3;
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
                alt7=1;
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
                alt7=2;
                }
                break;
            default:
                alt7=3;}

            switch (alt7) {
                case 1 :
                    // JS.g:715:4: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 2 :
                    // JS.g:716:4: IdentifierStartASCII
                    {
                    mIdentifierStartASCII(); 

                    }
                    break;
                case 3 :
                    // JS.g:717:4: {...}?
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
            // JS.g:721:2: ( IdentifierStartASCII ( IdentifierPart )* )
            // JS.g:721:4: IdentifierStartASCII ( IdentifierPart )*
            {
            mIdentifierStartASCII(); 
            // JS.g:721:25: ( IdentifierPart )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='$'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='\\'||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }
                else if ( ( isIdentifierPartUnicode(input.LA(1)) ) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // JS.g:721:25: IdentifierPart
            	    {
            	    mIdentifierPart(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // JS.g:734:3: ( IdentifierNameASCIIStart | )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='$'||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='\\'||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            else {
                alt9=2;}
            switch (alt9) {
                case 1 :
                    // JS.g:734:5: IdentifierNameASCIIStart
                    {
                    mIdentifierNameASCIIStart(); 

                    }
                    break;
                case 2 :
                    // JS.g:735:5: 
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
            // JS.g:743:3: ( AT Identifier )
            // JS.g:743:5: AT Identifier
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
            // JS.g:747:3: ( PropertyIdentifierSymbols )
            // JS.g:747:5: PropertyIdentifierSymbols
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
            // JS.g:833:2: ( '0' .. '9' )
            // JS.g:833:4: '0' .. '9'
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
            // JS.g:837:2: ( DecimalDigit | 'a' .. 'f' | 'A' .. 'F' )
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
            // JS.g:841:2: ( '0' .. '7' )
            // JS.g:841:4: '0' .. '7'
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
            // JS.g:845:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+ )
            // JS.g:845:4: ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // JS.g:845:18: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
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

            // JS.g:845:33: ( DecimalDigit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // JS.g:845:33: DecimalDigit
            	    {
            	    mDecimalDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // JS.g:849:2: ( '0' | '1' .. '9' ( DecimalDigit )* )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='0') ) {
                alt13=1;
            }
            else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("848:10: fragment DecimalIntegerLiteral : ( '0' | '1' .. '9' ( DecimalDigit )* );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // JS.g:849:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // JS.g:850:4: '1' .. '9' ( DecimalDigit )*
                    {
                    matchRange('1','9'); 
                    // JS.g:850:13: ( DecimalDigit )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // JS.g:850:13: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
            // JS.g:854:2: ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // JS.g:854:4: DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    match('.'); 
                    // JS.g:854:30: ( DecimalDigit )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // JS.g:854:30: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // JS.g:854:44: ( ExponentPart )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // JS.g:854:44: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:855:4: '.' ( DecimalDigit )+ ( ExponentPart )?
                    {
                    match('.'); 
                    // JS.g:855:8: ( DecimalDigit )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // JS.g:855:8: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // JS.g:855:22: ( ExponentPart )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // JS.g:855:22: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // JS.g:856:4: DecimalIntegerLiteral ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    // JS.g:856:26: ( ExponentPart )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // JS.g:856:26: ExponentPart
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
            // JS.g:860:2: ( '0' ( OctalDigit )+ )
            // JS.g:860:4: '0' ( OctalDigit )+
            {
            match('0'); 
            // JS.g:860:8: ( OctalDigit )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='7')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // JS.g:860:8: OctalDigit
            	    {
            	    mOctalDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // JS.g:864:2: ( ( '0x' | '0X' ) ( HexDigit )+ )
            // JS.g:864:4: ( '0x' | '0X' ) ( HexDigit )+
            {
            // JS.g:864:4: ( '0x' | '0X' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='0') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='X') ) {
                    alt21=2;
                }
                else if ( (LA21_1=='x') ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("864:4: ( '0x' | '0X' )", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("864:4: ( '0x' | '0X' )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // JS.g:864:6: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // JS.g:864:13: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // JS.g:864:20: ( HexDigit )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='F')||(LA22_0>='a' && LA22_0<='f')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // JS.g:864:20: HexDigit
            	    {
            	    mHexDigit(); 

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
    // $ANTLR end HexIntegerLiteral

    // $ANTLR start CharacterEscapeSequence
    public final void mCharacterEscapeSequence() throws RecognitionException {
        try {
            // JS.g:883:2: (~ ( DecimalDigit | 'x' | 'u' | LineTerminator ) )
            // JS.g:883:4: ~ ( DecimalDigit | 'x' | 'u' | LineTerminator )
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
            // JS.g:887:2: ( '0' .. '3' )
            // JS.g:887:4: '0' .. '3'
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
            // JS.g:891:2: ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit )
            int alt23=4;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='0' && LA23_0<='3')) ) {
                int LA23_1 = input.LA(2);

                if ( ((LA23_1>='0' && LA23_1<='7')) ) {
                    int LA23_4 = input.LA(3);

                    if ( ((LA23_4>='0' && LA23_4<='7')) ) {
                        alt23=4;
                    }
                    else {
                        alt23=2;}
                }
                else {
                    alt23=1;}
            }
            else if ( ((LA23_0>='4' && LA23_0<='7')) ) {
                int LA23_2 = input.LA(2);

                if ( ((LA23_2>='0' && LA23_2<='7')) ) {
                    alt23=3;
                }
                else {
                    alt23=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("890:10: fragment OctalEscapeSequence : ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // JS.g:891:4: OctalDigit
                    {
                    mOctalDigit(); 

                    }
                    break;
                case 2 :
                    // JS.g:892:4: ZeroToThree OctalDigit
                    {
                    mZeroToThree(); 
                    mOctalDigit(); 

                    }
                    break;
                case 3 :
                    // JS.g:893:4: '4' .. '7' OctalDigit
                    {
                    matchRange('4','7'); 
                    mOctalDigit(); 

                    }
                    break;
                case 4 :
                    // JS.g:894:4: ZeroToThree OctalDigit OctalDigit
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
            // JS.g:898:2: ( 'x' HexDigit HexDigit )
            // JS.g:898:4: 'x' HexDigit HexDigit
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
            // JS.g:902:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // JS.g:902:4: 'u' HexDigit HexDigit HexDigit HexDigit
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
            // JS.g:906:2: ( BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator ) )
            // JS.g:907:2: BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )
            {
            mBSLASH(); 
            // JS.g:908:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )
            int alt24=5;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='/')||(LA24_0>=':' && LA24_0<='t')||(LA24_0>='v' && LA24_0<='w')||(LA24_0>='y' && LA24_0<='\u2027')||(LA24_0>='\u202A' && LA24_0<='\uFFFE')) ) {
                alt24=1;
            }
            else if ( ((LA24_0>='0' && LA24_0<='7')) ) {
                alt24=2;
            }
            else if ( (LA24_0=='x') ) {
                alt24=3;
            }
            else if ( (LA24_0=='u') ) {
                alt24=4;
            }
            else if ( (LA24_0=='\n'||LA24_0=='\r'||(LA24_0>='\u2028' && LA24_0<='\u2029')) ) {
                alt24=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("908:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // JS.g:909:3: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // JS.g:910:5: OctalEscapeSequence
                    {
                    mOctalEscapeSequence(); 

                    }
                    break;
                case 3 :
                    // JS.g:911:5: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 

                    }
                    break;
                case 4 :
                    // JS.g:912:5: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 

                    }
                    break;
                case 5 :
                    // JS.g:913:5: LineTerminator
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
            // JS.g:918:2: ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\'') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\"') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("917:1: StringLiteral : ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // JS.g:918:4: SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE
                    {
                    mSQUOTE(); 
                    // JS.g:918:11: (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\u2027')||(LA25_0>='\u202A' && LA25_0<='\uFFFE')) ) {
                            alt25=1;
                        }
                        else if ( (LA25_0=='\\') ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // JS.g:918:13: ~ ( SQUOTE | BSLASH | LineTerminator )
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
                    	    // JS.g:918:53: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    mSQUOTE(); 

                    }
                    break;
                case 2 :
                    // JS.g:919:4: DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE
                    {
                    mDQUOTE(); 
                    // JS.g:919:11: (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\u2027')||(LA26_0>='\u202A' && LA26_0<='\uFFFE')) ) {
                            alt26=1;
                        }
                        else if ( (LA26_0=='\\') ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // JS.g:919:13: ~ ( DQUOTE | BSLASH | LineTerminator )
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
                    	    // JS.g:919:53: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
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
            // JS.g:928:2: ( BSLASH ~ ( LineTerminator ) )
            // JS.g:928:4: BSLASH ~ ( LineTerminator )
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
            // JS.g:932:2: (~ ( LineTerminator | MUL | BSLASH | DIV ) | BackslashSequence )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<=')')||(LA28_0>='+' && LA28_0<='.')||(LA28_0>='0' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\u2027')||(LA28_0>='\u202A' && LA28_0<='\uFFFE')) ) {
                alt28=1;
            }
            else if ( (LA28_0=='\\') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("931:10: fragment RegularExpressionFirstChar : (~ ( LineTerminator | MUL | BSLASH | DIV ) | BackslashSequence );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // JS.g:932:4: ~ ( LineTerminator | MUL | BSLASH | DIV )
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
                    // JS.g:933:4: BackslashSequence
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
            // JS.g:937:2: (~ ( LineTerminator | BSLASH | DIV ) | BackslashSequence )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='.')||(LA29_0>='0' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\u2027')||(LA29_0>='\u202A' && LA29_0<='\uFFFE')) ) {
                alt29=1;
            }
            else if ( (LA29_0=='\\') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("936:10: fragment RegularExpressionChar : (~ ( LineTerminator | BSLASH | DIV ) | BackslashSequence );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // JS.g:937:4: ~ ( LineTerminator | BSLASH | DIV )
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
                    // JS.g:938:4: BackslashSequence
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
            // JS.g:942:2: ({...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )* )
            // JS.g:942:4: {...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )*
            {
            if ( !( areRegularExpressionsEnabled() ) ) {
                throw new FailedPredicateException(input, "RegularExpressionLiteral", " areRegularExpressionsEnabled() ");
            }
            mDIV(); 
            mRegularExpressionFirstChar(); 
            // JS.g:942:73: ( RegularExpressionChar )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='.')||(LA30_0>='0' && LA30_0<='\u2027')||(LA30_0>='\u202A' && LA30_0<='\uFFFE')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:942:73: RegularExpressionChar
            	    {
            	    mRegularExpressionChar(); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            mDIV(); 
            // JS.g:942:100: ( IdentifierPart )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='$'||(LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='Z')||LA31_0=='\\'||LA31_0=='_'||(LA31_0>='a' && LA31_0<='z')) ) {
                    alt31=1;
                }
                else if ( ( isIdentifierPartUnicode(input.LA(1)) ) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:942:100: IdentifierPart
            	    {
            	    mIdentifierPart(); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
        int alt32=135;
        switch ( input.LA(1) ) {
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA32_146 = input.LA(4);

                    if ( (LA32_146=='i') ) {
                        int LA32_222 = input.LA(5);

                        if ( (LA32_222=='v') ) {
                            int LA32_285 = input.LA(6);

                            if ( (LA32_285=='e') ) {
                                int LA32_338 = input.LA(7);

                                if ( (LA32_338=='$'||(LA32_338>='0' && LA32_338<='9')||(LA32_338>='A' && LA32_338<='Z')||LA32_338=='\\'||LA32_338=='_'||(LA32_338>='a' && LA32_338<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=55;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'm':
                    {
                    int LA32_147 = input.LA(4);

                    if ( (LA32_147=='e') ) {
                        int LA32_223 = input.LA(5);

                        if ( (LA32_223=='s') ) {
                            int LA32_286 = input.LA(6);

                            if ( (LA32_286=='p') ) {
                                int LA32_339 = input.LA(7);

                                if ( (LA32_339=='a') ) {
                                    int LA32_381 = input.LA(8);

                                    if ( (LA32_381=='c') ) {
                                        int LA32_409 = input.LA(9);

                                        if ( (LA32_409=='e') ) {
                                            int LA32_427 = input.LA(10);

                                            if ( (LA32_427=='$'||(LA32_427>='0' && LA32_427<='9')||(LA32_427>='A' && LA32_427<='Z')||LA32_427=='\\'||LA32_427=='_'||(LA32_427>='a' && LA32_427<='z')) ) {
                                                alt32=129;
                                            }
                                            else {
                                                alt32=35;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            case 'u':
                {
                int LA32_52 = input.LA(3);

                if ( (LA32_52=='l') ) {
                    int LA32_148 = input.LA(4);

                    if ( (LA32_148=='l') ) {
                        int LA32_224 = input.LA(5);

                        if ( (LA32_224=='$'||(LA32_224>='0' && LA32_224<='9')||(LA32_224>='A' && LA32_224<='Z')||LA32_224=='\\'||LA32_224=='_'||(LA32_224>='a' && LA32_224<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=1;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'e':
                {
                int LA32_53 = input.LA(3);

                if ( (LA32_53=='w') ) {
                    int LA32_149 = input.LA(4);

                    if ( (LA32_149=='$'||(LA32_149>='0' && LA32_149<='9')||(LA32_149>='A' && LA32_149<='Z')||LA32_149=='\\'||LA32_149=='_'||(LA32_149>='a' && LA32_149<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=19;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                switch ( input.LA(3) ) {
                case 'r':
                    {
                    int LA32_150 = input.LA(4);

                    if ( (LA32_150=='o') ) {
                        int LA32_226 = input.LA(5);

                        if ( (LA32_226=='w') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA32_340 = input.LA(7);

                                if ( (LA32_340=='$'||(LA32_340>='0' && LA32_340<='9')||(LA32_340>='A' && LA32_340<='Z')||LA32_340=='\\'||LA32_340=='_'||(LA32_340>='a' && LA32_340<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=64;}
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
                                alt32=129;
                                }
                                break;
                            default:
                                alt32=23;}

                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'i':
                    {
                    int LA32_151 = input.LA(4);

                    if ( (LA32_151=='s') ) {
                        int LA32_227 = input.LA(5);

                        if ( (LA32_227=='$'||(LA32_227>='0' && LA32_227<='9')||(LA32_227>='A' && LA32_227<='Z')||LA32_227=='\\'||LA32_227=='_'||(LA32_227>='a' && LA32_227<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=22;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA32_152 = input.LA(4);

                    if ( (LA32_152=='n') ) {
                        int LA32_228 = input.LA(5);

                        if ( (LA32_228=='s') ) {
                            int LA32_290 = input.LA(6);

                            if ( (LA32_290=='i') ) {
                                int LA32_342 = input.LA(7);

                                if ( (LA32_342=='e') ) {
                                    int LA32_383 = input.LA(8);

                                    if ( (LA32_383=='n') ) {
                                        int LA32_410 = input.LA(9);

                                        if ( (LA32_410=='t') ) {
                                            int LA32_428 = input.LA(10);

                                            if ( (LA32_428=='$'||(LA32_428>='0' && LA32_428<='9')||(LA32_428>='A' && LA32_428<='Z')||LA32_428=='\\'||LA32_428=='_'||(LA32_428>='a' && LA32_428<='z')) ) {
                                                alt32=129;
                                            }
                                            else {
                                                alt32=65;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'y':
                    {
                    int LA32_153 = input.LA(4);

                    if ( (LA32_153=='$'||(LA32_153>='0' && LA32_153<='9')||(LA32_153>='A' && LA32_153<='Z')||LA32_153=='\\'||LA32_153=='_'||(LA32_153>='a' && LA32_153<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=24;}
                    }
                    break;
                case 'u':
                    {
                    int LA32_154 = input.LA(4);

                    if ( (LA32_154=='e') ) {
                        int LA32_230 = input.LA(5);

                        if ( (LA32_230=='$'||(LA32_230>='0' && LA32_230<='9')||(LA32_230>='A' && LA32_230<='Z')||LA32_230=='\\'||LA32_230=='_'||(LA32_230>='a' && LA32_230<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=2;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            case 'y':
                {
                int LA32_56 = input.LA(3);

                if ( (LA32_56=='p') ) {
                    int LA32_155 = input.LA(4);

                    if ( (LA32_155=='e') ) {
                        int LA32_231 = input.LA(5);

                        if ( (LA32_231=='o') ) {
                            int LA32_292 = input.LA(6);

                            if ( (LA32_292=='f') ) {
                                int LA32_343 = input.LA(7);

                                if ( (LA32_343=='$'||(LA32_343>='0' && LA32_343<='9')||(LA32_343>='A' && LA32_343<='Z')||LA32_343=='\\'||LA32_343=='_'||(LA32_343>='a' && LA32_343<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=25;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA32_57 = input.LA(3);

                if ( (LA32_57=='o') ) {
                    int LA32_156 = input.LA(4);

                    if ( (LA32_156=='a') ) {
                        int LA32_232 = input.LA(5);

                        if ( (LA32_232=='t') ) {
                            int LA32_293 = input.LA(6);

                            if ( (LA32_293=='$'||(LA32_293>='0' && LA32_293<='9')||(LA32_293>='A' && LA32_293<='Z')||LA32_293=='\\'||LA32_293=='_'||(LA32_293>='a' && LA32_293<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=48;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'i':
                {
                int LA32_58 = input.LA(3);

                if ( (LA32_58=='n') ) {
                    int LA32_157 = input.LA(4);

                    if ( (LA32_157=='a') ) {
                        int LA32_233 = input.LA(5);

                        if ( (LA32_233=='l') ) {
                            switch ( input.LA(6) ) {
                            case 'l':
                                {
                                int LA32_345 = input.LA(7);

                                if ( (LA32_345=='y') ) {
                                    int LA32_385 = input.LA(8);

                                    if ( (LA32_385=='$'||(LA32_385>='0' && LA32_385<='9')||(LA32_385>='A' && LA32_385<='Z')||LA32_385=='\\'||LA32_385=='_'||(LA32_385>='a' && LA32_385<='z')) ) {
                                        alt32=129;
                                    }
                                    else {
                                        alt32=12;}
                                }
                                else {
                                    alt32=129;}
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
                                alt32=129;
                                }
                                break;
                            default:
                                alt32=47;}

                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'o':
                {
                int LA32_59 = input.LA(3);

                if ( (LA32_59=='r') ) {
                    int LA32_158 = input.LA(4);

                    if ( (LA32_158=='$'||(LA32_158>='0' && LA32_158<='9')||(LA32_158>='A' && LA32_158<='Z')||LA32_158=='\\'||LA32_158=='_'||(LA32_158>='a' && LA32_158<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=13;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'a':
                {
                int LA32_60 = input.LA(3);

                if ( (LA32_60=='l') ) {
                    int LA32_159 = input.LA(4);

                    if ( (LA32_159=='s') ) {
                        int LA32_235 = input.LA(5);

                        if ( (LA32_235=='e') ) {
                            int LA32_295 = input.LA(6);

                            if ( (LA32_295=='$'||(LA32_295>='0' && LA32_295<='9')||(LA32_295>='A' && LA32_295<='Z')||LA32_295=='\\'||LA32_295=='_'||(LA32_295>='a' && LA32_295<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=3;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'u':
                {
                int LA32_61 = input.LA(3);

                if ( (LA32_61=='n') ) {
                    int LA32_160 = input.LA(4);

                    if ( (LA32_160=='c') ) {
                        int LA32_236 = input.LA(5);

                        if ( (LA32_236=='t') ) {
                            int LA32_296 = input.LA(6);

                            if ( (LA32_296=='i') ) {
                                int LA32_348 = input.LA(7);

                                if ( (LA32_348=='o') ) {
                                    int LA32_386 = input.LA(8);

                                    if ( (LA32_386=='n') ) {
                                        int LA32_412 = input.LA(9);

                                        if ( (LA32_412=='$'||(LA32_412>='0' && LA32_412<='9')||(LA32_412>='A' && LA32_412<='Z')||LA32_412=='\\'||LA32_412=='_'||(LA32_412>='a' && LA32_412<='z')) ) {
                                            alt32=129;
                                        }
                                        else {
                                            alt32=15;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_62 = input.LA(3);

                if ( (LA32_62=='o') ) {
                    int LA32_161 = input.LA(4);

                    if ( (LA32_161=='l') ) {
                        int LA32_237 = input.LA(5);

                        if ( (LA32_237=='e') ) {
                            int LA32_297 = input.LA(6);

                            if ( (LA32_297=='a') ) {
                                int LA32_349 = input.LA(7);

                                if ( (LA32_349=='n') ) {
                                    int LA32_387 = input.LA(8);

                                    if ( (LA32_387=='$'||(LA32_387>='0' && LA32_387<='9')||(LA32_387>='A' && LA32_387<='Z')||LA32_387=='\\'||LA32_387=='_'||(LA32_387>='a' && LA32_387<='z')) ) {
                                        alt32=129;
                                    }
                                    else {
                                        alt32=37;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'y':
                {
                int LA32_63 = input.LA(3);

                if ( (LA32_63=='t') ) {
                    int LA32_162 = input.LA(4);

                    if ( (LA32_162=='e') ) {
                        int LA32_238 = input.LA(5);

                        if ( (LA32_238=='$'||(LA32_238>='0' && LA32_238<='9')||(LA32_238>='A' && LA32_238<='Z')||LA32_238=='\\'||LA32_238=='_'||(LA32_238>='a' && LA32_238<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=38;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'r':
                {
                int LA32_64 = input.LA(3);

                if ( (LA32_64=='e') ) {
                    int LA32_163 = input.LA(4);

                    if ( (LA32_163=='a') ) {
                        int LA32_239 = input.LA(5);

                        if ( (LA32_239=='k') ) {
                            int LA32_299 = input.LA(6);

                            if ( (LA32_299=='$'||(LA32_299>='0' && LA32_299<='9')||(LA32_299>='A' && LA32_299<='Z')||LA32_299=='\\'||LA32_299=='_'||(LA32_299>='a' && LA32_299<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=4;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_65 = input.LA(3);

                if ( (LA32_65=='n') ) {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA32_240 = input.LA(5);

                        if ( (LA32_240=='i') ) {
                            int LA32_300 = input.LA(6);

                            if ( (LA32_300=='n') ) {
                                int LA32_351 = input.LA(7);

                                if ( (LA32_351=='u') ) {
                                    int LA32_388 = input.LA(8);

                                    if ( (LA32_388=='e') ) {
                                        int LA32_414 = input.LA(9);

                                        if ( (LA32_414=='$'||(LA32_414>='0' && LA32_414<='9')||(LA32_414>='A' && LA32_414<='Z')||LA32_414=='\\'||LA32_414=='_'||(LA32_414>='a' && LA32_414<='z')) ) {
                                            alt32=129;
                                        }
                                        else {
                                            alt32=7;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                        }
                        break;
                    case 's':
                        {
                        int LA32_241 = input.LA(5);

                        if ( (LA32_241=='t') ) {
                            int LA32_301 = input.LA(6);

                            if ( (LA32_301=='$'||(LA32_301>='0' && LA32_301<='9')||(LA32_301>='A' && LA32_301<='Z')||LA32_301=='\\'||LA32_301=='_'||(LA32_301>='a' && LA32_301<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=41;}
                        }
                        else {
                            alt32=129;}
                        }
                        break;
                    default:
                        alt32=129;}

                }
                else {
                    alt32=129;}
                }
                break;
            case 'l':
                {
                int LA32_66 = input.LA(3);

                if ( (LA32_66=='a') ) {
                    int LA32_165 = input.LA(4);

                    if ( (LA32_165=='s') ) {
                        int LA32_242 = input.LA(5);

                        if ( (LA32_242=='s') ) {
                            int LA32_302 = input.LA(6);

                            if ( (LA32_302=='$'||(LA32_302>='0' && LA32_302<='9')||(LA32_302>='A' && LA32_302<='Z')||LA32_302=='\\'||LA32_302=='_'||(LA32_302>='a' && LA32_302<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=40;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'h':
                {
                int LA32_67 = input.LA(3);

                if ( (LA32_67=='a') ) {
                    int LA32_166 = input.LA(4);

                    if ( (LA32_166=='r') ) {
                        int LA32_243 = input.LA(5);

                        if ( (LA32_243=='$'||(LA32_243>='0' && LA32_243<='9')||(LA32_243>='A' && LA32_243<='Z')||LA32_243=='\\'||LA32_243=='_'||(LA32_243>='a' && LA32_243<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=39;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA32_167 = input.LA(4);

                    if ( (LA32_167=='c') ) {
                        int LA32_244 = input.LA(5);

                        if ( (LA32_244=='h') ) {
                            int LA32_304 = input.LA(6);

                            if ( (LA32_304=='$'||(LA32_304>='0' && LA32_304<='9')||(LA32_304>='A' && LA32_304<='Z')||LA32_304=='\\'||LA32_304=='_'||(LA32_304>='a' && LA32_304<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=6;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 's':
                    {
                    int LA32_168 = input.LA(4);

                    if ( (LA32_168=='e') ) {
                        int LA32_245 = input.LA(5);

                        if ( (LA32_245=='$'||(LA32_245>='0' && LA32_245<='9')||(LA32_245>='A' && LA32_245<='Z')||LA32_245=='\\'||LA32_245=='_'||(LA32_245>='a' && LA32_245<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=5;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            default:
                alt32=129;}

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
                    int LA32_169 = input.LA(4);

                    if ( (LA32_169=='b') ) {
                        int LA32_246 = input.LA(5);

                        if ( (LA32_246=='l') ) {
                            int LA32_306 = input.LA(6);

                            if ( (LA32_306=='e') ) {
                                int LA32_355 = input.LA(7);

                                if ( (LA32_355=='$'||(LA32_355>='0' && LA32_355<='9')||(LA32_355>='A' && LA32_355<='Z')||LA32_355=='\\'||LA32_355=='_'||(LA32_355>='a' && LA32_355<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=43;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
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
                    alt32=129;
                    }
                    break;
                default:
                    alt32=10;}

                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'b':
                    {
                    int LA32_171 = input.LA(4);

                    if ( (LA32_171=='u') ) {
                        int LA32_247 = input.LA(5);

                        if ( (LA32_247=='g') ) {
                            int LA32_307 = input.LA(6);

                            if ( (LA32_307=='g') ) {
                                int LA32_356 = input.LA(7);

                                if ( (LA32_356=='e') ) {
                                    int LA32_390 = input.LA(8);

                                    if ( (LA32_390=='r') ) {
                                        int LA32_415 = input.LA(9);

                                        if ( (LA32_415=='$'||(LA32_415>='0' && LA32_415<='9')||(LA32_415>='A' && LA32_415<='Z')||LA32_415=='\\'||LA32_415=='_'||(LA32_415>='a' && LA32_415<='z')) ) {
                                            alt32=129;
                                        }
                                        else {
                                            alt32=42;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'l':
                    {
                    int LA32_172 = input.LA(4);

                    if ( (LA32_172=='e') ) {
                        int LA32_248 = input.LA(5);

                        if ( (LA32_248=='t') ) {
                            int LA32_308 = input.LA(6);

                            if ( (LA32_308=='e') ) {
                                int LA32_357 = input.LA(7);

                                if ( (LA32_357=='$'||(LA32_357>='0' && LA32_357<='9')||(LA32_357>='A' && LA32_357<='Z')||LA32_357=='\\'||LA32_357=='_'||(LA32_357>='a' && LA32_357<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=9;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'f':
                    {
                    int LA32_173 = input.LA(4);

                    if ( (LA32_173=='a') ) {
                        int LA32_249 = input.LA(5);

                        if ( (LA32_249=='u') ) {
                            int LA32_309 = input.LA(6);

                            if ( (LA32_309=='l') ) {
                                int LA32_358 = input.LA(7);

                                if ( (LA32_358=='t') ) {
                                    int LA32_392 = input.LA(8);

                                    if ( (LA32_392=='$'||(LA32_392>='0' && LA32_392<='9')||(LA32_392>='A' && LA32_392<='Z')||LA32_392=='\\'||LA32_392=='_'||(LA32_392>='a' && LA32_392<='z')) ) {
                                        alt32=129;
                                    }
                                    else {
                                        alt32=8;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA32_174 = input.LA(4);

                    if ( (LA32_174=='e') ) {
                        int LA32_250 = input.LA(5);

                        if ( (LA32_250=='n') ) {
                            int LA32_310 = input.LA(6);

                            if ( (LA32_310=='d') ) {
                                int LA32_359 = input.LA(7);

                                if ( (LA32_359=='s') ) {
                                    int LA32_393 = input.LA(8);

                                    if ( (LA32_393=='$'||(LA32_393>='0' && LA32_393<='9')||(LA32_393>='A' && LA32_393<='Z')||LA32_393=='\\'||LA32_393=='_'||(LA32_393>='a' && LA32_393<='z')) ) {
                                        alt32=129;
                                    }
                                    else {
                                        alt32=46;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'p':
                    {
                    int LA32_175 = input.LA(4);

                    if ( (LA32_175=='o') ) {
                        int LA32_251 = input.LA(5);

                        if ( (LA32_251=='r') ) {
                            int LA32_311 = input.LA(6);

                            if ( (LA32_311=='t') ) {
                                int LA32_360 = input.LA(7);

                                if ( (LA32_360=='$'||(LA32_360>='0' && LA32_360<='9')||(LA32_360>='A' && LA32_360<='Z')||LA32_360=='\\'||LA32_360=='_'||(LA32_360>='a' && LA32_360<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=45;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            case 'n':
                {
                int LA32_72 = input.LA(3);

                if ( (LA32_72=='u') ) {
                    int LA32_176 = input.LA(4);

                    if ( (LA32_176=='m') ) {
                        int LA32_252 = input.LA(5);

                        if ( (LA32_252=='$'||(LA32_252>='0' && LA32_252<='9')||(LA32_252>='A' && LA32_252<='Z')||LA32_252=='\\'||LA32_252=='_'||(LA32_252>='a' && LA32_252<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=44;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'a':
                {
                int LA32_73 = input.LA(3);

                if ( (LA32_73=='c') ) {
                    int LA32_177 = input.LA(4);

                    if ( (LA32_177=='h') ) {
                        int LA32_253 = input.LA(5);

                        if ( (LA32_253=='$'||(LA32_253>='0' && LA32_253<='9')||(LA32_253>='A' && LA32_253<='Z')||LA32_253=='\\'||LA32_253=='_'||(LA32_253>='a' && LA32_253<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=14;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'l':
                {
                int LA32_74 = input.LA(3);

                if ( (LA32_74=='s') ) {
                    int LA32_178 = input.LA(4);

                    if ( (LA32_178=='e') ) {
                        int LA32_254 = input.LA(5);

                        if ( (LA32_254=='$'||(LA32_254>='0' && LA32_254<='9')||(LA32_254>='A' && LA32_254<='Z')||LA32_254=='\\'||LA32_254=='_'||(LA32_254>='a' && LA32_254<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=11;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA32_255 = input.LA(5);

                        if ( (LA32_255=='r') ) {
                            int LA32_315 = input.LA(6);

                            if ( (LA32_315=='f') ) {
                                int LA32_361 = input.LA(7);

                                if ( (LA32_361=='a') ) {
                                    int LA32_395 = input.LA(8);

                                    if ( (LA32_395=='c') ) {
                                        int LA32_418 = input.LA(9);

                                        if ( (LA32_418=='e') ) {
                                            int LA32_432 = input.LA(10);

                                            if ( (LA32_432=='$'||(LA32_432>='0' && LA32_432<='9')||(LA32_432>='A' && LA32_432<='Z')||LA32_432=='\\'||LA32_432=='_'||(LA32_432>='a' && LA32_432<='z')) ) {
                                                alt32=129;
                                            }
                                            else {
                                                alt32=53;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
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
                        alt32=129;
                        }
                        break;
                    default:
                        alt32=52;}

                    }
                    break;
                case 's':
                    {
                    int LA32_180 = input.LA(4);

                    if ( (LA32_180=='t') ) {
                        int LA32_257 = input.LA(5);

                        if ( (LA32_257=='a') ) {
                            int LA32_316 = input.LA(6);

                            if ( (LA32_316=='n') ) {
                                int LA32_362 = input.LA(7);

                                if ( (LA32_362=='c') ) {
                                    int LA32_396 = input.LA(8);

                                    if ( (LA32_396=='e') ) {
                                        int LA32_419 = input.LA(9);

                                        if ( (LA32_419=='o') ) {
                                            int LA32_433 = input.LA(10);

                                            if ( (LA32_433=='f') ) {
                                                int LA32_442 = input.LA(11);

                                                if ( (LA32_442=='$'||(LA32_442>='0' && LA32_442<='9')||(LA32_442>='A' && LA32_442<='Z')||LA32_442=='\\'||LA32_442=='_'||(LA32_442>='a' && LA32_442<='z')) ) {
                                                    alt32=129;
                                                }
                                                else {
                                                    alt32=18;}
                                            }
                                            else {
                                                alt32=129;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
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
                    alt32=129;
                    }
                    break;
                default:
                    alt32=17;}

                }
                break;
            case 'm':
                {
                int LA32_76 = input.LA(3);

                if ( (LA32_76=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA32_258 = input.LA(5);

                        if ( (LA32_258=='r') ) {
                            int LA32_317 = input.LA(6);

                            if ( (LA32_317=='t') ) {
                                int LA32_363 = input.LA(7);

                                if ( (LA32_363=='$'||(LA32_363>='0' && LA32_363<='9')||(LA32_363>='A' && LA32_363<='Z')||LA32_363=='\\'||LA32_363=='_'||(LA32_363>='a' && LA32_363<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=51;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                        }
                        break;
                    case 'l':
                        {
                        int LA32_259 = input.LA(5);

                        if ( (LA32_259=='e') ) {
                            int LA32_318 = input.LA(6);

                            if ( (LA32_318=='m') ) {
                                int LA32_364 = input.LA(7);

                                if ( (LA32_364=='e') ) {
                                    int LA32_398 = input.LA(8);

                                    if ( (LA32_398=='n') ) {
                                        int LA32_420 = input.LA(9);

                                        if ( (LA32_420=='t') ) {
                                            int LA32_434 = input.LA(10);

                                            if ( (LA32_434=='s') ) {
                                                int LA32_443 = input.LA(11);

                                                if ( (LA32_443=='$'||(LA32_443>='0' && LA32_443<='9')||(LA32_443>='A' && LA32_443<='Z')||LA32_443=='\\'||LA32_443=='_'||(LA32_443>='a' && LA32_443<='z')) ) {
                                                    alt32=129;
                                                }
                                                else {
                                                    alt32=50;}
                                            }
                                            else {
                                                alt32=129;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                        }
                        break;
                    default:
                        alt32=129;}

                }
                else {
                    alt32=129;}
                }
                break;
            case 'f':
                {
                int LA32_77 = input.LA(3);

                if ( (LA32_77=='$'||(LA32_77>='0' && LA32_77<='9')||(LA32_77>='A' && LA32_77<='Z')||LA32_77=='\\'||LA32_77=='_'||(LA32_77>='a' && LA32_77<='z')) ) {
                    alt32=129;
                }
                else {
                    alt32=16;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'r':
            {
            int LA32_9 = input.LA(2);

            if ( (LA32_9=='e') ) {
                int LA32_78 = input.LA(3);

                if ( (LA32_78=='t') ) {
                    int LA32_184 = input.LA(4);

                    if ( (LA32_184=='u') ) {
                        int LA32_260 = input.LA(5);

                        if ( (LA32_260=='r') ) {
                            int LA32_319 = input.LA(6);

                            if ( (LA32_319=='n') ) {
                                int LA32_365 = input.LA(7);

                                if ( (LA32_365=='$'||(LA32_365>='0' && LA32_365<='9')||(LA32_365>='A' && LA32_365<='Z')||LA32_365=='\\'||LA32_365=='_'||(LA32_365>='a' && LA32_365<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=20;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
            }
            else {
                alt32=129;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA32_79 = input.LA(3);

                if ( (LA32_79=='t') ) {
                    int LA32_185 = input.LA(4);

                    if ( (LA32_185=='$'||(LA32_185>='0' && LA32_185<='9')||(LA32_185>='A' && LA32_185<='Z')||LA32_185=='\\'||LA32_185=='_'||(LA32_185>='a' && LA32_185<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=31;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'h':
                {
                int LA32_80 = input.LA(3);

                if ( (LA32_80=='o') ) {
                    int LA32_186 = input.LA(4);

                    if ( (LA32_186=='r') ) {
                        int LA32_262 = input.LA(5);

                        if ( (LA32_262=='t') ) {
                            int LA32_320 = input.LA(6);

                            if ( (LA32_320=='$'||(LA32_320>='0' && LA32_320<='9')||(LA32_320>='A' && LA32_320<='Z')||LA32_320=='\\'||LA32_320=='_'||(LA32_320>='a' && LA32_320<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=60;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 't':
                {
                int LA32_81 = input.LA(3);

                if ( (LA32_81=='a') ) {
                    int LA32_187 = input.LA(4);

                    if ( (LA32_187=='t') ) {
                        int LA32_263 = input.LA(5);

                        if ( (LA32_263=='i') ) {
                            int LA32_321 = input.LA(6);

                            if ( (LA32_321=='c') ) {
                                int LA32_367 = input.LA(7);

                                if ( (LA32_367=='$'||(LA32_367>='0' && LA32_367<='9')||(LA32_367>='A' && LA32_367<='Z')||LA32_367=='\\'||LA32_367=='_'||(LA32_367>='a' && LA32_367<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=61;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'u':
                {
                int LA32_82 = input.LA(3);

                if ( (LA32_82=='p') ) {
                    int LA32_188 = input.LA(4);

                    if ( (LA32_188=='e') ) {
                        int LA32_264 = input.LA(5);

                        if ( (LA32_264=='r') ) {
                            int LA32_322 = input.LA(6);

                            if ( (LA32_322=='$'||(LA32_322>='0' && LA32_322<='9')||(LA32_322>='A' && LA32_322<='Z')||LA32_322=='\\'||LA32_322=='_'||(LA32_322>='a' && LA32_322<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=62;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'y':
                {
                int LA32_83 = input.LA(3);

                if ( (LA32_83=='n') ) {
                    int LA32_189 = input.LA(4);

                    if ( (LA32_189=='c') ) {
                        int LA32_265 = input.LA(5);

                        if ( (LA32_265=='h') ) {
                            int LA32_323 = input.LA(6);

                            if ( (LA32_323=='r') ) {
                                int LA32_369 = input.LA(7);

                                if ( (LA32_369=='o') ) {
                                    int LA32_401 = input.LA(8);

                                    if ( (LA32_401=='n') ) {
                                        int LA32_421 = input.LA(9);

                                        if ( (LA32_421=='i') ) {
                                            int LA32_435 = input.LA(10);

                                            if ( (LA32_435=='z') ) {
                                                int LA32_444 = input.LA(11);

                                                if ( (LA32_444=='e') ) {
                                                    int LA32_448 = input.LA(12);

                                                    if ( (LA32_448=='d') ) {
                                                        int LA32_449 = input.LA(13);

                                                        if ( (LA32_449=='$'||(LA32_449>='0' && LA32_449<='9')||(LA32_449>='A' && LA32_449<='Z')||LA32_449=='\\'||LA32_449=='_'||(LA32_449>='a' && LA32_449<='z')) ) {
                                                            alt32=129;
                                                        }
                                                        else {
                                                            alt32=63;}
                                                    }
                                                    else {
                                                        alt32=129;}
                                                }
                                                else {
                                                    alt32=129;}
                                            }
                                            else {
                                                alt32=129;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'w':
                {
                int LA32_84 = input.LA(3);

                if ( (LA32_84=='i') ) {
                    int LA32_190 = input.LA(4);

                    if ( (LA32_190=='t') ) {
                        int LA32_266 = input.LA(5);

                        if ( (LA32_266=='c') ) {
                            int LA32_324 = input.LA(6);

                            if ( (LA32_324=='h') ) {
                                int LA32_370 = input.LA(7);

                                if ( (LA32_370=='$'||(LA32_370>='0' && LA32_370<='9')||(LA32_370>='A' && LA32_370<='Z')||LA32_370=='\\'||LA32_370=='_'||(LA32_370>='a' && LA32_370<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=21;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'v':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA32_191 = input.LA(4);

                    if ( (LA32_191=='d') ) {
                        int LA32_267 = input.LA(5);

                        if ( (LA32_267=='$'||(LA32_267>='0' && LA32_267<='9')||(LA32_267>='A' && LA32_267<='Z')||LA32_267=='\\'||LA32_267=='_'||(LA32_267>='a' && LA32_267<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=27;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'l':
                    {
                    int LA32_192 = input.LA(4);

                    if ( (LA32_192=='a') ) {
                        int LA32_268 = input.LA(5);

                        if ( (LA32_268=='t') ) {
                            int LA32_326 = input.LA(6);

                            if ( (LA32_326=='i') ) {
                                int LA32_371 = input.LA(7);

                                if ( (LA32_371=='l') ) {
                                    int LA32_403 = input.LA(8);

                                    if ( (LA32_403=='e') ) {
                                        int LA32_422 = input.LA(9);

                                        if ( (LA32_422=='$'||(LA32_422>='0' && LA32_422<='9')||(LA32_422>='A' && LA32_422<='Z')||LA32_422=='\\'||LA32_422=='_'||(LA32_422>='a' && LA32_422<='z')) ) {
                                            alt32=129;
                                        }
                                        else {
                                            alt32=66;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            case 'a':
                {
                int LA32_86 = input.LA(3);

                if ( (LA32_86=='r') ) {
                    int LA32_193 = input.LA(4);

                    if ( (LA32_193=='$'||(LA32_193>='0' && LA32_193<='9')||(LA32_193>='A' && LA32_193<='Z')||LA32_193=='\\'||LA32_193=='_'||(LA32_193>='a' && LA32_193<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=26;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA32_87 = input.LA(3);

                if ( (LA32_87=='t') ) {
                    int LA32_194 = input.LA(4);

                    if ( (LA32_194=='h') ) {
                        int LA32_270 = input.LA(5);

                        if ( (LA32_270=='$'||(LA32_270>='0' && LA32_270<='9')||(LA32_270>='A' && LA32_270<='Z')||LA32_270=='\\'||LA32_270=='_'||(LA32_270>='a' && LA32_270<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=29;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'h':
                {
                int LA32_88 = input.LA(3);

                if ( (LA32_88=='i') ) {
                    int LA32_195 = input.LA(4);

                    if ( (LA32_195=='l') ) {
                        int LA32_271 = input.LA(5);

                        if ( (LA32_271=='e') ) {
                            int LA32_328 = input.LA(6);

                            if ( (LA32_328=='$'||(LA32_328>='0' && LA32_328<='9')||(LA32_328>='A' && LA32_328<='Z')||LA32_328=='\\'||LA32_328=='_'||(LA32_328>='a' && LA32_328<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=28;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'g':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_89 = input.LA(3);

                if ( (LA32_89=='t') ) {
                    int LA32_196 = input.LA(4);

                    if ( (LA32_196=='o') ) {
                        int LA32_272 = input.LA(5);

                        if ( (LA32_272=='$'||(LA32_272>='0' && LA32_272<='9')||(LA32_272>='A' && LA32_272<='Z')||LA32_272=='\\'||LA32_272=='_'||(LA32_272>='a' && LA32_272<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=49;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'e':
                {
                int LA32_90 = input.LA(3);

                if ( (LA32_90=='t') ) {
                    int LA32_197 = input.LA(4);

                    if ( (LA32_197=='$'||(LA32_197>='0' && LA32_197<='9')||(LA32_197>='A' && LA32_197<='Z')||LA32_197=='\\'||LA32_197=='_'||(LA32_197>='a' && LA32_197<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=30;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case 'y':
            {
            int LA32_14 = input.LA(2);

            if ( (LA32_14=='i') ) {
                int LA32_91 = input.LA(3);

                if ( (LA32_91=='e') ) {
                    int LA32_198 = input.LA(4);

                    if ( (LA32_198=='l') ) {
                        int LA32_274 = input.LA(5);

                        if ( (LA32_274=='d') ) {
                            int LA32_330 = input.LA(6);

                            if ( (LA32_330=='$'||(LA32_330>='0' && LA32_330<='9')||(LA32_330>='A' && LA32_330<='Z')||LA32_330=='\\'||LA32_330=='_'||(LA32_330>='a' && LA32_330<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=32;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
            }
            else {
                alt32=129;}
            }
            break;
        case 'C':
            {
            int LA32_15 = input.LA(2);

            if ( (LA32_15=='D') ) {
                int LA32_92 = input.LA(3);

                if ( (LA32_92=='A') ) {
                    int LA32_199 = input.LA(4);

                    if ( (LA32_199=='T') ) {
                        int LA32_275 = input.LA(5);

                        if ( (LA32_275=='A') ) {
                            int LA32_331 = input.LA(6);

                            if ( (LA32_331=='$'||(LA32_331>='0' && LA32_331<='9')||(LA32_331>='A' && LA32_331<='Z')||LA32_331=='\\'||LA32_331=='_'||(LA32_331>='a' && LA32_331<='z')) ) {
                                alt32=129;
                            }
                            else {
                                alt32=33;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
            }
            else {
                alt32=129;}
            }
            break;
        case 'x':
            {
            int LA32_16 = input.LA(2);

            if ( (LA32_16=='m') ) {
                int LA32_93 = input.LA(3);

                if ( (LA32_93=='l') ) {
                    int LA32_200 = input.LA(4);

                    if ( (LA32_200=='$'||(LA32_200>='0' && LA32_200<='9')||(LA32_200>='A' && LA32_200<='Z')||LA32_200=='\\'||LA32_200=='_'||(LA32_200>='a' && LA32_200<='z')) ) {
                        alt32=129;
                    }
                    else {
                        alt32=34;}
                }
                else {
                    alt32=129;}
            }
            else {
                alt32=129;}
            }
            break;
        case 'a':
            {
            int LA32_17 = input.LA(2);

            if ( (LA32_17=='b') ) {
                int LA32_94 = input.LA(3);

                if ( (LA32_94=='s') ) {
                    int LA32_201 = input.LA(4);

                    if ( (LA32_201=='t') ) {
                        int LA32_277 = input.LA(5);

                        if ( (LA32_277=='r') ) {
                            int LA32_332 = input.LA(6);

                            if ( (LA32_332=='a') ) {
                                int LA32_375 = input.LA(7);

                                if ( (LA32_375=='c') ) {
                                    int LA32_404 = input.LA(8);

                                    if ( (LA32_404=='t') ) {
                                        int LA32_423 = input.LA(9);

                                        if ( (LA32_423=='$'||(LA32_423>='0' && LA32_423<='9')||(LA32_423>='A' && LA32_423<='Z')||LA32_423=='\\'||LA32_423=='_'||(LA32_423>='a' && LA32_423<='z')) ) {
                                            alt32=129;
                                        }
                                        else {
                                            alt32=36;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
            }
            else {
                alt32=129;}
            }
            break;
        case 'l':
            {
            int LA32_18 = input.LA(2);

            if ( (LA32_18=='o') ) {
                int LA32_95 = input.LA(3);

                if ( (LA32_95=='n') ) {
                    int LA32_202 = input.LA(4);

                    if ( (LA32_202=='g') ) {
                        int LA32_278 = input.LA(5);

                        if ( (LA32_278=='$'||(LA32_278>='0' && LA32_278<='9')||(LA32_278>='A' && LA32_278<='Z')||LA32_278=='\\'||LA32_278=='_'||(LA32_278>='a' && LA32_278<='z')) ) {
                            alt32=129;
                        }
                        else {
                            alt32=54;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
            }
            else {
                alt32=129;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA32_96 = input.LA(3);

                if ( (LA32_96=='c') ) {
                    int LA32_203 = input.LA(4);

                    if ( (LA32_203=='k') ) {
                        int LA32_279 = input.LA(5);

                        if ( (LA32_279=='a') ) {
                            int LA32_334 = input.LA(6);

                            if ( (LA32_334=='g') ) {
                                int LA32_376 = input.LA(7);

                                if ( (LA32_376=='e') ) {
                                    int LA32_405 = input.LA(8);

                                    if ( (LA32_405=='$'||(LA32_405>='0' && LA32_405<='9')||(LA32_405>='A' && LA32_405<='Z')||LA32_405=='\\'||LA32_405=='_'||(LA32_405>='a' && LA32_405<='z')) ) {
                                        alt32=129;
                                    }
                                    else {
                                        alt32=56;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA32_204 = input.LA(4);

                    if ( (LA32_204=='v') ) {
                        int LA32_280 = input.LA(5);

                        if ( (LA32_280=='a') ) {
                            int LA32_335 = input.LA(6);

                            if ( (LA32_335=='t') ) {
                                int LA32_377 = input.LA(7);

                                if ( (LA32_377=='e') ) {
                                    int LA32_406 = input.LA(8);

                                    if ( (LA32_406=='$'||(LA32_406>='0' && LA32_406<='9')||(LA32_406>='A' && LA32_406<='Z')||LA32_406=='\\'||LA32_406=='_'||(LA32_406>='a' && LA32_406<='z')) ) {
                                        alt32=129;
                                    }
                                    else {
                                        alt32=57;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                case 'o':
                    {
                    int LA32_205 = input.LA(4);

                    if ( (LA32_205=='t') ) {
                        int LA32_281 = input.LA(5);

                        if ( (LA32_281=='e') ) {
                            int LA32_336 = input.LA(6);

                            if ( (LA32_336=='c') ) {
                                int LA32_378 = input.LA(7);

                                if ( (LA32_378=='t') ) {
                                    int LA32_407 = input.LA(8);

                                    if ( (LA32_407=='e') ) {
                                        int LA32_426 = input.LA(9);

                                        if ( (LA32_426=='d') ) {
                                            int LA32_438 = input.LA(10);

                                            if ( (LA32_438=='$'||(LA32_438>='0' && LA32_438<='9')||(LA32_438>='A' && LA32_438<='Z')||LA32_438=='\\'||LA32_438=='_'||(LA32_438>='a' && LA32_438<='z')) ) {
                                                alt32=129;
                                            }
                                            else {
                                                alt32=58;}
                                        }
                                        else {
                                            alt32=129;}
                                    }
                                    else {
                                        alt32=129;}
                                }
                                else {
                                    alt32=129;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                    }
                    break;
                default:
                    alt32=129;}

                }
                break;
            case 'u':
                {
                int LA32_98 = input.LA(3);

                if ( (LA32_98=='b') ) {
                    int LA32_206 = input.LA(4);

                    if ( (LA32_206=='l') ) {
                        int LA32_282 = input.LA(5);

                        if ( (LA32_282=='i') ) {
                            int LA32_337 = input.LA(6);

                            if ( (LA32_337=='c') ) {
                                int LA32_379 = input.LA(7);

                                if ( (LA32_379=='$'||(LA32_379>='0' && LA32_379<='9')||(LA32_379>='A' && LA32_379<='Z')||LA32_379=='\\'||LA32_379=='_'||(LA32_379>='a' && LA32_379<='z')) ) {
                                    alt32=129;
                                }
                                else {
                                    alt32=59;}
                            }
                            else {
                                alt32=129;}
                        }
                        else {
                            alt32=129;}
                    }
                    else {
                        alt32=129;}
                }
                else {
                    alt32=129;}
                }
                break;
            default:
                alt32=129;}

            }
            break;
        case '{':
            {
            alt32=67;
            }
            break;
        case '}':
            {
            alt32=68;
            }
            break;
        case '(':
            {
            alt32=69;
            }
            break;
        case ')':
            {
            alt32=70;
            }
            break;
        case '[':
            {
            alt32=71;
            }
            break;
        case ']':
            {
            alt32=72;
            }
            break;
        case '.':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt32=123;
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
                alt32=131;
                }
                break;
            default:
                alt32=73;}

            }
            break;
        case ';':
            {
            alt32=74;
            }
            break;
        case ',':
            {
            alt32=75;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=78;
                }
                break;
            case '<':
                {
                int LA32_102 = input.LA(3);

                if ( (LA32_102=='=') ) {
                    alt32=107;
                }
                else {
                    alt32=90;}
                }
                break;
            case '/':
                {
                alt32=117;
                }
                break;
            case '!':
                {
                int LA32_104 = input.LA(3);

                if ( (LA32_104=='-') ) {
                    alt32=115;
                }
                else if ( (LA32_104=='[') ) {
                    alt32=119;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | GET | SET | YIELD | CDATA | WXML | NAMESPACE | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | XCOPEN | XCCLOSE | XLCLOSE | XRCLOSE | CDATAOPEN | XHOPEN | XHCLOSE | AT | DOTDOT | COLONCOLON | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | XmlAttribute | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral );", 32, 104, input);

                    throw nvae;
                }
                }
                break;
            case '?':
                {
                alt32=120;
                }
                break;
            default:
                alt32=76;}

            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=79;
                }
                break;
            case '>':
                {
                switch ( input.LA(3) ) {
                case '=':
                    {
                    alt32=108;
                    }
                    break;
                case '>':
                    {
                    int LA32_212 = input.LA(4);

                    if ( (LA32_212=='=') ) {
                        alt32=109;
                    }
                    else {
                        alt32=92;}
                    }
                    break;
                default:
                    alt32=91;}

                }
                break;
            default:
                alt32=77;}

            }
            break;
        case '=':
            {
            int LA32_31 = input.LA(2);

            if ( (LA32_31=='=') ) {
                int LA32_110 = input.LA(3);

                if ( (LA32_110=='=') ) {
                    alt32=82;
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=102;}
            }
            break;
        case '!':
            {
            int LA32_32 = input.LA(2);

            if ( (LA32_32=='=') ) {
                int LA32_112 = input.LA(3);

                if ( (LA32_112=='=') ) {
                    alt32=83;
                }
                else {
                    alt32=81;}
            }
            else {
                alt32=96;}
            }
            break;
        case '+':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=103;
                }
                break;
            case '+':
                {
                alt32=88;
                }
                break;
            default:
                alt32=84;}

            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=104;
                }
                break;
            case '-':
                {
                int LA32_118 = input.LA(3);

                if ( (LA32_118=='>') ) {
                    alt32=116;
                }
                else {
                    alt32=89;}
                }
                break;
            default:
                alt32=85;}

            }
            break;
        case '*':
            {
            int LA32_35 = input.LA(2);

            if ( (LA32_35=='=') ) {
                alt32=105;
            }
            else {
                alt32=86;}
            }
            break;
        case '%':
            {
            int LA32_36 = input.LA(2);

            if ( (LA32_36=='=') ) {
                alt32=106;
            }
            else {
                alt32=87;}
            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=110;
                }
                break;
            case '&':
                {
                alt32=98;
                }
                break;
            default:
                alt32=93;}

            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=111;
                }
                break;
            case '|':
                {
                alt32=99;
                }
                break;
            default:
                alt32=94;}

            }
            break;
        case '^':
            {
            int LA32_39 = input.LA(2);

            if ( (LA32_39=='=') ) {
                alt32=112;
            }
            else {
                alt32=95;}
            }
            break;
        case '~':
            {
            alt32=97;
            }
            break;
        case '?':
            {
            int LA32_41 = input.LA(2);

            if ( (LA32_41=='>') ) {
                alt32=121;
            }
            else {
                alt32=100;}
            }
            break;
        case ':':
            {
            int LA32_42 = input.LA(2);

            if ( (LA32_42==':') ) {
                alt32=124;
            }
            else {
                alt32=101;}
            }
            break;
        case '/':
            {
            int LA32_43 = input.LA(2);

            if ( (LA32_43=='=') ) {
                int LA32_136 = input.LA(3);

                if ( ((LA32_136>='\u0000' && LA32_136<='\t')||(LA32_136>='\u000B' && LA32_136<='\f')||(LA32_136>='\u000E' && LA32_136<='\u2027')||(LA32_136>='\u202A' && LA32_136<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt32=135;
                }
                else {
                    alt32=114;}
            }
            else if ( (LA32_43=='/') ) {
                alt32=128;
            }
            else if ( (LA32_43=='>') ) {
                int LA32_138 = input.LA(3);

                if ( ((LA32_138>='\u0000' && LA32_138<='\t')||(LA32_138>='\u000B' && LA32_138<='\f')||(LA32_138>='\u000E' && LA32_138<='\u2027')||(LA32_138>='\u202A' && LA32_138<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt32=135;
                }
                else {
                    alt32=118;}
            }
            else if ( (LA32_43=='*') ) {
                alt32=127;
            }
            else if ( ((LA32_43>='\u0000' && LA32_43<='\t')||(LA32_43>='\u000B' && LA32_43<='\f')||(LA32_43>='\u000E' && LA32_43<=')')||(LA32_43>='+' && LA32_43<='.')||(LA32_43>='0' && LA32_43<='<')||(LA32_43>='?' && LA32_43<='\u2027')||(LA32_43>='\u202A' && LA32_43<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                alt32=135;
            }
            else {
                alt32=113;}
            }
            break;
        case '@':
            {
            int LA32_44 = input.LA(2);

            if ( (LA32_44=='$'||(LA32_44>='A' && LA32_44<='Z')||LA32_44=='\\'||LA32_44=='_'||(LA32_44>='a' && LA32_44<='z')) ) {
                alt32=130;
            }
            else {
                alt32=122;}
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
            alt32=125;
            }
            break;
        case '\n':
        case '\r':
        case '\u2028':
        case '\u2029':
            {
            alt32=126;
            }
            break;
        case '0':
            {
            switch ( input.LA(2) ) {
            case 'X':
            case 'x':
                {
                alt32=133;
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
                alt32=132;
                }
                break;
            default:
                alt32=131;}

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
            alt32=131;
            }
            break;
        case '\"':
        case '\'':
            {
            alt32=134;
            }
            break;
        default:
            alt32=129;}

        switch (alt32) {
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


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\2\4\3\uffff\1\4";
    static final String DFA19_eofS =
        "\7\uffff";
    static final String DFA19_minS =
        "\3\56\3\uffff\1\56";
    static final String DFA19_maxS =
        "\1\71\1\56\1\71\3\uffff\1\71";
    static final String DFA19_acceptS =
        "\3\uffff\1\2\1\3\1\1\1\uffff";
    static final String DFA19_specialS =
        "\7\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\5",
            "\1\5\1\uffff\12\6",
            "",
            "",
            "",
            "\1\5\1\uffff\12\6"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "853:1: DecimalLiteral : ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? );";
        }
    }
 

}
// $ANTLR 3.0.1 JS.g 2010-01-26 13:25:59

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSLexer extends Lexer {
    public static final int PACKAGE=58;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=154;
    public static final int RegularExpressionChar=191;
    public static final int LOCALNAME=129;
    public static final int XMLFragmentEnd=121;
    public static final int SHL=92;
    public static final int MOD=89;
    public static final int CONST=43;
    public static final int LineTerminatorChar=164;
    public static final int DQUOTE=151;
    public static final int DO=13;
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
    public static final int RegularExpressionLiteral=176;
    public static final int SUB=87;
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
    public static final int SET=34;
    public static final int SHORT=62;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=152;
    public static final int Tokens=192;
    public static final int SAME=84;
    public static final int StringLiteral=169;
    public static final int COLON=103;
    public static final int XMLFragment=120;
    public static final int PAREXPR=144;
    public static final int ENUM=46;
    public static final int HexIntegerLiteral=182;
    public static final int NBSP=157;
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
    	// XmlAttribute = Identifier or isIdentifierKeyword()
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

    private final boolean isXmlStartEnabled() {
      // TODO
      return areRegularExpressionsEnabled();
    }

    protected void readFirstXml() throws RecognitionException {
    	throw new EarlyExitException(0, input);
    }

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

    private final boolean isUnicodeLetter(int ch) {
    	return Character.isLetter(ch);
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

    @Override
    public void recoverFromMismatchedToken(IntStream input, RecognitionException e, int ttype, BitSet follow) throws RecognitionException {
    	// if next token is what we are looking for then "delete" this token
    	if ( input.LA(2)==ttype ) {
    		reportError(e);
    		beginResync();
    		input.consume(); // simply delete extra token
    		endResync();
    		input.consume(); // move past ttype token as if all were ok
    		return;
    	}
    	if ( !recoverFromMismatchedElement(input,e,follow) ) {
    		throw e;
    	}
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
            // JS.g:136:6: ( 'null' )
            // JS.g:136:8: 'null'
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
            // JS.g:137:6: ( 'true' )
            // JS.g:137:8: 'true'
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
            // JS.g:138:7: ( 'false' )
            // JS.g:138:9: 'false'
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
            // JS.g:139:7: ( 'break' )
            // JS.g:139:9: 'break'
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
            // JS.g:140:6: ( 'case' )
            // JS.g:140:8: 'case'
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
            // JS.g:141:7: ( 'catch' )
            // JS.g:141:9: 'catch'
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
            // JS.g:142:10: ( 'continue' )
            // JS.g:142:12: 'continue'
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
            // JS.g:143:9: ( 'default' )
            // JS.g:143:11: 'default'
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
            // JS.g:144:8: ( 'delete' )
            // JS.g:144:10: 'delete'
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
            // JS.g:145:4: ( 'do' )
            // JS.g:145:6: 'do'
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
            // JS.g:146:6: ( 'else' )
            // JS.g:146:8: 'else'
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
            // JS.g:147:9: ( 'finally' )
            // JS.g:147:11: 'finally'
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
            // JS.g:148:5: ( 'for' )
            // JS.g:148:7: 'for'
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
            // JS.g:149:6: ( 'each' )
            // JS.g:149:8: 'each'
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
            // JS.g:150:10: ( 'function' )
            // JS.g:150:12: 'function'
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
            // JS.g:151:4: ( 'if' )
            // JS.g:151:6: 'if'
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
            // JS.g:152:4: ( 'in' )
            // JS.g:152:6: 'in'
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
            // JS.g:153:12: ( 'instanceof' )
            // JS.g:153:14: 'instanceof'
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
            // JS.g:154:5: ( 'new' )
            // JS.g:154:7: 'new'
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
            // JS.g:155:8: ( 'return' )
            // JS.g:155:10: 'return'
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
            // JS.g:156:8: ( 'switch' )
            // JS.g:156:10: 'switch'
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
            // JS.g:157:6: ( 'this' )
            // JS.g:157:8: 'this'
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
            // JS.g:158:7: ( 'throw' )
            // JS.g:158:9: 'throw'
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
            // JS.g:159:5: ( 'try' )
            // JS.g:159:7: 'try'
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
            // JS.g:160:8: ( 'typeof' )
            // JS.g:160:10: 'typeof'
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
            // JS.g:161:5: ( 'var' )
            // JS.g:161:7: 'var'
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
            // JS.g:162:6: ( 'void' )
            // JS.g:162:8: 'void'
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
            // JS.g:163:7: ( 'while' )
            // JS.g:163:9: 'while'
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
            // JS.g:164:6: ( 'with' )
            // JS.g:164:8: 'with'
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
            // JS.g:165:5: ( 'get' )
            // JS.g:165:7: 'get'
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
            // JS.g:166:5: ( 'set' )
            // JS.g:166:7: 'set'
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
            // JS.g:167:7: ( 'yield' )
            // JS.g:167:9: 'yield'
            {
            match("yield"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end YIELD

    // $ANTLR start WXML
    public final void mWXML() throws RecognitionException {
        try {
            int _type = WXML;
            // JS.g:168:6: ( 'xml' )
            // JS.g:168:8: 'xml'
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
            // JS.g:169:11: ( 'namespace' )
            // JS.g:169:13: 'namespace'
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
            // JS.g:170:10: ( 'abstract' )
            // JS.g:170:12: 'abstract'
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
            // JS.g:171:9: ( 'boolean' )
            // JS.g:171:11: 'boolean'
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
            // JS.g:172:6: ( 'byte' )
            // JS.g:172:8: 'byte'
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
            // JS.g:173:6: ( 'char' )
            // JS.g:173:8: 'char'
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
            // JS.g:174:7: ( 'class' )
            // JS.g:174:9: 'class'
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
            // JS.g:175:7: ( 'const' )
            // JS.g:175:9: 'const'
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
            // JS.g:176:10: ( 'debugger' )
            // JS.g:176:12: 'debugger'
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
            // JS.g:177:8: ( 'double' )
            // JS.g:177:10: 'double'
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
            // JS.g:178:6: ( 'enum' )
            // JS.g:178:8: 'enum'
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
            // JS.g:179:8: ( 'export' )
            // JS.g:179:10: 'export'
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
            // JS.g:180:9: ( 'extends' )
            // JS.g:180:11: 'extends'
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
            // JS.g:181:7: ( 'final' )
            // JS.g:181:9: 'final'
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
            // JS.g:182:7: ( 'float' )
            // JS.g:182:9: 'float'
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
            // JS.g:183:6: ( 'goto' )
            // JS.g:183:8: 'goto'
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
            // JS.g:184:12: ( 'implements' )
            // JS.g:184:14: 'implements'
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
            // JS.g:185:8: ( 'import' )
            // JS.g:185:10: 'import'
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
            // JS.g:186:5: ( 'int' )
            // JS.g:186:7: 'int'
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
            // JS.g:187:11: ( 'interface' )
            // JS.g:187:13: 'interface'
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
            // JS.g:188:6: ( 'long' )
            // JS.g:188:8: 'long'
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
            // JS.g:189:8: ( 'native' )
            // JS.g:189:10: 'native'
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
            // JS.g:190:9: ( 'package' )
            // JS.g:190:11: 'package'
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
            // JS.g:191:9: ( 'private' )
            // JS.g:191:11: 'private'
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
            // JS.g:192:11: ( 'protected' )
            // JS.g:192:13: 'protected'
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
            // JS.g:193:8: ( 'public' )
            // JS.g:193:10: 'public'
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
            // JS.g:194:7: ( 'short' )
            // JS.g:194:9: 'short'
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
            // JS.g:195:8: ( 'static' )
            // JS.g:195:10: 'static'
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
            // JS.g:196:7: ( 'super' )
            // JS.g:196:9: 'super'
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
            // JS.g:197:14: ( 'synchronized' )
            // JS.g:197:16: 'synchronized'
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
            // JS.g:198:8: ( 'throws' )
            // JS.g:198:10: 'throws'
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
            // JS.g:199:11: ( 'transient' )
            // JS.g:199:13: 'transient'
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
            // JS.g:200:10: ( 'volatile' )
            // JS.g:200:12: 'volatile'
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
            // JS.g:201:8: ( '{' )
            // JS.g:201:10: '{'
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
            // JS.g:202:8: ( '}' )
            // JS.g:202:10: '}'
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
            // JS.g:203:8: ( '(' )
            // JS.g:203:10: '('
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
            // JS.g:204:8: ( ')' )
            // JS.g:204:10: ')'
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
            // JS.g:205:8: ( '[' )
            // JS.g:205:10: '['
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
            // JS.g:206:8: ( ']' )
            // JS.g:206:10: ']'
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
            // JS.g:207:5: ( '.' )
            // JS.g:207:7: '.'
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
            // JS.g:208:7: ( ';' )
            // JS.g:208:9: ';'
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
            // JS.g:209:7: ( ',' )
            // JS.g:209:9: ','
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
            // JS.g:210:4: ( '<' )
            // JS.g:210:6: '<'
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
            // JS.g:211:4: ( '>' )
            // JS.g:211:6: '>'
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
            // JS.g:212:5: ( '<=' )
            // JS.g:212:7: '<='
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
            // JS.g:213:5: ( '>=' )
            // JS.g:213:7: '>='
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
            // JS.g:214:4: ( '==' )
            // JS.g:214:6: '=='
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
            // JS.g:215:5: ( '!=' )
            // JS.g:215:7: '!='
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
            // JS.g:216:6: ( '===' )
            // JS.g:216:8: '==='
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
            // JS.g:217:7: ( '!==' )
            // JS.g:217:9: '!=='
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
            // JS.g:218:5: ( '+' )
            // JS.g:218:7: '+'
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
            // JS.g:219:5: ( '-' )
            // JS.g:219:7: '-'
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
            // JS.g:220:5: ( '*' )
            // JS.g:220:7: '*'
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
            // JS.g:221:5: ( '%' )
            // JS.g:221:7: '%'
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
            // JS.g:222:5: ( '++' )
            // JS.g:222:7: '++'
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
            // JS.g:223:5: ( '--' )
            // JS.g:223:7: '--'
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
            // JS.g:224:5: ( '<<' )
            // JS.g:224:7: '<<'
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
            // JS.g:225:5: ( '>>' )
            // JS.g:225:7: '>>'
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
            // JS.g:226:5: ( '>>>' )
            // JS.g:226:7: '>>>'
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
            // JS.g:227:5: ( '&' )
            // JS.g:227:7: '&'
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
            // JS.g:228:4: ( '|' )
            // JS.g:228:6: '|'
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
            // JS.g:229:5: ( '^' )
            // JS.g:229:7: '^'
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
            // JS.g:230:5: ( '!' )
            // JS.g:230:7: '!'
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
            // JS.g:231:5: ( '~' )
            // JS.g:231:7: '~'
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
            // JS.g:232:6: ( '&&' )
            // JS.g:232:8: '&&'
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
            // JS.g:233:5: ( '||' )
            // JS.g:233:7: '||'
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
            // JS.g:234:5: ( '?' )
            // JS.g:234:7: '?'
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
            // JS.g:235:7: ( ':' )
            // JS.g:235:9: ':'
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
            // JS.g:236:8: ( '=' )
            // JS.g:236:10: '='
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
            // JS.g:237:8: ( '+=' )
            // JS.g:237:10: '+='
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
            // JS.g:238:8: ( '-=' )
            // JS.g:238:10: '-='
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
            // JS.g:239:8: ( '*=' )
            // JS.g:239:10: '*='
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
            // JS.g:240:8: ( '%=' )
            // JS.g:240:10: '%='
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
            // JS.g:241:8: ( '<<=' )
            // JS.g:241:10: '<<='
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
            // JS.g:242:8: ( '>>=' )
            // JS.g:242:10: '>>='
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
            // JS.g:243:8: ( '>>>=' )
            // JS.g:243:10: '>>>='
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
            // JS.g:244:8: ( '&=' )
            // JS.g:244:10: '&='
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
            // JS.g:245:7: ( '|=' )
            // JS.g:245:9: '|='
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
            // JS.g:246:8: ( '^=' )
            // JS.g:246:10: '^='
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
            // JS.g:247:5: ( '/' )
            // JS.g:247:7: '/'
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
            // JS.g:248:8: ( '/=' )
            // JS.g:248:10: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVASS

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            // JS.g:249:4: ( '@' )
            // JS.g:249:6: '@'
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
            // JS.g:250:8: ( '..' )
            // JS.g:250:10: '..'
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
            // JS.g:251:12: ( '::' )
            // JS.g:251:14: '::'
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
            // JS.g:520:2: ( '\\\\' )
            // JS.g:520:4: '\\\\'
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
            // JS.g:524:2: ( '\"' )
            // JS.g:524:4: '\"'
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
            // JS.g:528:2: ( '\\'' )
            // JS.g:528:4: '\\''
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
            // JS.g:534:2: ( '\\u0009' )
            // JS.g:534:4: '\\u0009'
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
            // JS.g:538:2: ( '\\u000b' )
            // JS.g:538:4: '\\u000b'
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
            // JS.g:542:2: ( '\\u000c' )
            // JS.g:542:4: '\\u000c'
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
            // JS.g:546:2: ( '\\u0020' )
            // JS.g:546:4: '\\u0020'
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
            // JS.g:550:2: ( '\\u00a0' )
            // JS.g:550:4: '\\u00a0'
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
            // JS.g:554:2: ( '\\u1680' | '\\u180E' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u202F' | '\\u205F' | '\\u3000' )
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
            // JS.g:573:2: ( ( TAB | VT | FF | SP | NBSP | USP )+ )
            // JS.g:573:4: ( TAB | VT | FF | SP | NBSP | USP )+
            {
            // JS.g:573:4: ( TAB | VT | FF | SP | NBSP | USP )+
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
            // JS.g:581:2: ( '\\n' )
            // JS.g:581:4: '\\n'
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
            // JS.g:585:2: ( '\\r' )
            // JS.g:585:4: '\\r'
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
            // JS.g:589:2: ( '\\u2028' )
            // JS.g:589:4: '\\u2028'
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
            // JS.g:593:2: ( '\\u2029' )
            // JS.g:593:4: '\\u2029'
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
            // JS.g:597:2: ( CR | LF | LS | PS )
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
            // JS.g:601:2: ( ( CR ( LF )? ) | LF | LS | PS )
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
                    new NoViableAltException("600:10: fragment LineTerminator : ( ( CR ( LF )? ) | LF | LS | PS );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // JS.g:601:4: ( CR ( LF )? )
                    {
                    // JS.g:601:4: ( CR ( LF )? )
                    // JS.g:601:5: CR ( LF )?
                    {
                    mCR(); 
                    // JS.g:601:8: ( LF )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\n') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // JS.g:601:8: LF
                            {
                            mLF(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // JS.g:601:15: LF
                    {
                    mLF(); 

                    }
                    break;
                case 3 :
                    // JS.g:601:20: LS
                    {
                    mLS(); 

                    }
                    break;
                case 4 :
                    // JS.g:601:25: PS
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
            // JS.g:605:2: ( ( ( CR ( LF )? ) | LF | LS | PS ) )
            // JS.g:605:4: ( ( CR ( LF )? ) | LF | LS | PS )
            {
            // JS.g:605:4: ( ( CR ( LF )? ) | LF | LS | PS )
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
                    new NoViableAltException("605:4: ( ( CR ( LF )? ) | LF | LS | PS )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // JS.g:605:6: ( CR ( LF )? )
                    {
                    // JS.g:605:6: ( CR ( LF )? )
                    // JS.g:605:8: CR ( LF )?
                    {
                    mCR(); 
                    // JS.g:605:11: ( LF )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\n') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // JS.g:605:11: LF
                            {
                            mLF(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // JS.g:605:19: LF
                    {
                    mLF(); 

                    }
                    break;
                case 3 :
                    // JS.g:605:24: LS
                    {
                    mLS(); 

                    }
                    break;
                case 4 :
                    // JS.g:605:29: PS
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
            // JS.g:612:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // JS.g:612:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // JS.g:612:9: ( options {greedy=false; } : . )*
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
            	    // JS.g:612:41: .
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
            // JS.g:616:2: ( '//' (~ ( LineTerminatorChar ) )* )
            // JS.g:616:4: '//' (~ ( LineTerminatorChar ) )*
            {
            match("//"); 

            // JS.g:616:9: (~ ( LineTerminatorChar ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u2027')||(LA7_0>='\u202A' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // JS.g:616:11: ~ ( LineTerminatorChar )
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
            // JS.g:726:2: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit )
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
                    new NoViableAltException("725:10: fragment IdentifierStartASCII : ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // JS.g:726:4: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // JS.g:726:15: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // JS.g:727:4: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 4 :
                    // JS.g:728:4: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 5 :
                    // JS.g:729:4: BSLASH 'u' HexDigit HexDigit HexDigit HexDigit
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
            // JS.g:737:2: ( DecimalDigit | IdentifierStartASCII | {...}?)
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
                    // JS.g:737:4: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 2 :
                    // JS.g:738:4: IdentifierStartASCII
                    {
                    mIdentifierStartASCII(); 

                    }
                    break;
                case 3 :
                    // JS.g:739:4: {...}?
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
            // JS.g:743:2: ( IdentifierStartASCII ( IdentifierPart )* )
            // JS.g:743:4: IdentifierStartASCII ( IdentifierPart )*
            {
            mIdentifierStartASCII(); 
            // JS.g:743:25: ( IdentifierPart )*
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
            	    // JS.g:743:25: IdentifierPart
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
            // JS.g:756:3: ( IdentifierNameASCIIStart | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='$'||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='\\'||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                alt11=1;
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // JS.g:756:5: IdentifierNameASCIIStart
                    {
                    mIdentifierNameASCIIStart(); 

                    }
                    break;
                case 2 :
                    // JS.g:757:5: 
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

    // $ANTLR start XMLFragment
    public final void mXMLFragment() throws RecognitionException {
        try {
            int _type = XMLFragment;
             
            	int marker = input.mark();

            // JS.g:858:5: ( LT ( NOT | QUE | 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' | '{' | {...}?)? {...}?)
            // JS.g:858:7: LT ( NOT | QUE | 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' | '{' | {...}?)? {...}?
            {
            mLT(); 
            // JS.g:858:10: ( NOT | QUE | 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' | '{' | {...}?)?
            int alt12=9;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='!') ) {
                alt12=1;
            }
            else if ( (LA12_0=='?') ) {
                alt12=2;
            }
            else if ( ((LA12_0>='a' && LA12_0<='z')) ) {
                alt12=3;
            }
            else if ( ((LA12_0>='A' && LA12_0<='Z')) ) {
                alt12=4;
            }
            else if ( (LA12_0=='_') ) {
                alt12=5;
            }
            else if ( (LA12_0==':') ) {
                alt12=6;
            }
            else if ( (LA12_0=='{') ) {
                alt12=7;
            }
            else if ( (( Character.isLetter(input.LT(1)) && isXmlStartEnabled() )) ) {
                alt12=8;
            }
            switch (alt12) {
                case 1 :
                    // JS.g:858:12: NOT
                    {
                    mNOT(); 

                    }
                    break;
                case 2 :
                    // JS.g:859:12: QUE
                    {
                    mQUE(); 

                    }
                    break;
                case 3 :
                    // JS.g:860:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 4 :
                    // JS.g:861:12: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 5 :
                    // JS.g:862:12: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 6 :
                    // JS.g:863:12: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 7 :
                    // JS.g:864:12: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 8 :
                    // JS.g:865:12: {...}?
                    {
                    if ( !( Character.isLetter(input.LT(1)) ) ) {
                        throw new FailedPredicateException(input, "XMLFragment", " Character.isLetter(input.LT(1)) ");
                    }

                    }
                    break;

            }

            if ( !( isXmlStartEnabled() ) ) {
                throw new FailedPredicateException(input, "XMLFragment", " isXmlStartEnabled() ");
            }
             
            			input.rewind(marker);
            			readFirstXml(); 
                     

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XMLFragment

    // $ANTLR start DecimalDigit
    public final void mDecimalDigit() throws RecognitionException {
        try {
            // JS.g:885:2: ( '0' .. '9' )
            // JS.g:885:4: '0' .. '9'
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
            // JS.g:889:2: ( DecimalDigit | 'a' .. 'f' | 'A' .. 'F' )
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
            // JS.g:893:2: ( '0' .. '7' )
            // JS.g:893:4: '0' .. '7'
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
            // JS.g:897:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+ )
            // JS.g:897:4: ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // JS.g:897:18: ( '+' | '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='+'||LA13_0=='-') ) {
                alt13=1;
            }
            switch (alt13) {
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

            // JS.g:897:33: ( DecimalDigit )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // JS.g:897:33: DecimalDigit
            	    {
            	    mDecimalDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // JS.g:901:2: ( '0' | '1' .. '9' ( DecimalDigit )* )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='0') ) {
                alt16=1;
            }
            else if ( ((LA16_0>='1' && LA16_0<='9')) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("900:10: fragment DecimalIntegerLiteral : ( '0' | '1' .. '9' ( DecimalDigit )* );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // JS.g:901:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // JS.g:902:4: '1' .. '9' ( DecimalDigit )*
                    {
                    matchRange('1','9'); 
                    // JS.g:902:13: ( DecimalDigit )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // JS.g:902:13: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
            // JS.g:906:2: ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // JS.g:906:4: DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    match('.'); 
                    // JS.g:906:30: ( DecimalDigit )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // JS.g:906:30: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // JS.g:906:44: ( ExponentPart )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // JS.g:906:44: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:907:4: '.' ( DecimalDigit )+ ( ExponentPart )?
                    {
                    match('.'); 
                    // JS.g:907:8: ( DecimalDigit )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // JS.g:907:8: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // JS.g:907:22: ( ExponentPart )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // JS.g:907:22: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // JS.g:908:4: DecimalIntegerLiteral ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    // JS.g:908:26: ( ExponentPart )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // JS.g:908:26: ExponentPart
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
            // JS.g:912:2: ( '0' ( OctalDigit )+ )
            // JS.g:912:4: '0' ( OctalDigit )+
            {
            match('0'); 
            // JS.g:912:8: ( OctalDigit )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='7')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // JS.g:912:8: OctalDigit
            	    {
            	    mOctalDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // JS.g:916:2: ( ( '0x' | '0X' ) ( HexDigit )+ )
            // JS.g:916:4: ( '0x' | '0X' ) ( HexDigit )+
            {
            // JS.g:916:4: ( '0x' | '0X' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='0') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='x') ) {
                    alt24=1;
                }
                else if ( (LA24_1=='X') ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("916:4: ( '0x' | '0X' )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("916:4: ( '0x' | '0X' )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // JS.g:916:6: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // JS.g:916:13: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // JS.g:916:20: ( HexDigit )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='F')||(LA25_0>='a' && LA25_0<='f')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JS.g:916:20: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // JS.g:935:2: (~ ( DecimalDigit | 'x' | 'u' | LineTerminatorChar ) )
            // JS.g:935:4: ~ ( DecimalDigit | 'x' | 'u' | LineTerminatorChar )
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
            // JS.g:939:2: ( '0' .. '3' )
            // JS.g:939:4: '0' .. '3'
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
            // JS.g:943:2: ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit )
            int alt26=4;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>='0' && LA26_0<='3')) ) {
                int LA26_1 = input.LA(2);

                if ( ((LA26_1>='0' && LA26_1<='7')) ) {
                    int LA26_4 = input.LA(3);

                    if ( ((LA26_4>='0' && LA26_4<='7')) ) {
                        alt26=4;
                    }
                    else {
                        alt26=2;}
                }
                else {
                    alt26=1;}
            }
            else if ( ((LA26_0>='4' && LA26_0<='7')) ) {
                int LA26_2 = input.LA(2);

                if ( ((LA26_2>='0' && LA26_2<='7')) ) {
                    alt26=3;
                }
                else {
                    alt26=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("942:10: fragment OctalEscapeSequence : ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // JS.g:943:4: OctalDigit
                    {
                    mOctalDigit(); 

                    }
                    break;
                case 2 :
                    // JS.g:944:4: ZeroToThree OctalDigit
                    {
                    mZeroToThree(); 
                    mOctalDigit(); 

                    }
                    break;
                case 3 :
                    // JS.g:945:4: '4' .. '7' OctalDigit
                    {
                    matchRange('4','7'); 
                    mOctalDigit(); 

                    }
                    break;
                case 4 :
                    // JS.g:946:4: ZeroToThree OctalDigit OctalDigit
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
            // JS.g:950:2: ( 'x' HexDigit HexDigit )
            // JS.g:950:4: 'x' HexDigit HexDigit
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
            // JS.g:954:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // JS.g:954:4: 'u' HexDigit HexDigit HexDigit HexDigit
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
            // JS.g:958:2: ( BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator ) )
            // JS.g:959:2: BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )
            {
            mBSLASH(); 
            // JS.g:960:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )
            int alt27=5;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='/')||(LA27_0>=':' && LA27_0<='t')||(LA27_0>='v' && LA27_0<='w')||(LA27_0>='y' && LA27_0<='\u2027')||(LA27_0>='\u202A' && LA27_0<='\uFFFE')) ) {
                alt27=1;
            }
            else if ( ((LA27_0>='0' && LA27_0<='7')) ) {
                alt27=2;
            }
            else if ( (LA27_0=='x') ) {
                alt27=3;
            }
            else if ( (LA27_0=='u') ) {
                alt27=4;
            }
            else if ( (LA27_0=='\n'||LA27_0=='\r'||(LA27_0>='\u2028' && LA27_0<='\u2029')) ) {
                alt27=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("960:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence | LineTerminator )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // JS.g:961:3: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // JS.g:962:5: OctalEscapeSequence
                    {
                    mOctalEscapeSequence(); 

                    }
                    break;
                case 3 :
                    // JS.g:963:5: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 

                    }
                    break;
                case 4 :
                    // JS.g:964:5: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 

                    }
                    break;
                case 5 :
                    // JS.g:965:5: LineTerminator
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
            // JS.g:970:2: ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* DQUOTE )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\'') ) {
                alt30=1;
            }
            else if ( (LA30_0=='\"') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("969:1: StringLiteral : ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* DQUOTE );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // JS.g:970:4: SQUOTE (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* SQUOTE
                    {
                    mSQUOTE(); 
                    // JS.g:970:11: (~ ( SQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\u2027')||(LA28_0>='\u202A' && LA28_0<='\uFFFE')) ) {
                            alt28=1;
                        }
                        else if ( (LA28_0=='\\') ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // JS.g:970:13: ~ ( SQUOTE | BSLASH | LineTerminatorChar )
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
                    	    // JS.g:970:57: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    mSQUOTE(); 

                    }
                    break;
                case 2 :
                    // JS.g:971:4: DQUOTE (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )* DQUOTE
                    {
                    mDQUOTE(); 
                    // JS.g:971:11: (~ ( DQUOTE | BSLASH | LineTerminatorChar ) | EscapeSequence )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='!')||(LA29_0>='#' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\u2027')||(LA29_0>='\u202A' && LA29_0<='\uFFFE')) ) {
                            alt29=1;
                        }
                        else if ( (LA29_0=='\\') ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // JS.g:971:13: ~ ( DQUOTE | BSLASH | LineTerminatorChar )
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
                    	    // JS.g:971:57: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
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
            // JS.g:980:2: ( BSLASH ~ ( LineTerminatorChar ) )
            // JS.g:980:4: BSLASH ~ ( LineTerminatorChar )
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
            // JS.g:984:2: (~ ( LineTerminatorChar | MUL | BSLASH | DIV ) | BackslashSequence )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<=')')||(LA31_0>='+' && LA31_0<='.')||(LA31_0>='0' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\u2027')||(LA31_0>='\u202A' && LA31_0<='\uFFFE')) ) {
                alt31=1;
            }
            else if ( (LA31_0=='\\') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("983:10: fragment RegularExpressionFirstChar : (~ ( LineTerminatorChar | MUL | BSLASH | DIV ) | BackslashSequence );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // JS.g:984:4: ~ ( LineTerminatorChar | MUL | BSLASH | DIV )
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
                    // JS.g:985:4: BackslashSequence
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
            // JS.g:989:2: (~ ( LineTerminatorChar | BSLASH | DIV ) | BackslashSequence )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='.')||(LA32_0>='0' && LA32_0<='[')||(LA32_0>=']' && LA32_0<='\u2027')||(LA32_0>='\u202A' && LA32_0<='\uFFFE')) ) {
                alt32=1;
            }
            else if ( (LA32_0=='\\') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("988:10: fragment RegularExpressionChar : (~ ( LineTerminatorChar | BSLASH | DIV ) | BackslashSequence );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // JS.g:989:4: ~ ( LineTerminatorChar | BSLASH | DIV )
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
                    // JS.g:990:4: BackslashSequence
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
            // JS.g:994:2: ({...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )* )
            // JS.g:994:4: {...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )*
            {
            if ( !( areRegularExpressionsEnabled() ) ) {
                throw new FailedPredicateException(input, "RegularExpressionLiteral", " areRegularExpressionsEnabled() ");
            }
            mDIV(); 
            mRegularExpressionFirstChar(); 
            // JS.g:994:73: ( RegularExpressionChar )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='.')||(LA33_0>='0' && LA33_0<='\u2027')||(LA33_0>='\u202A' && LA33_0<='\uFFFE')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:994:73: RegularExpressionChar
            	    {
            	    mRegularExpressionChar(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            mDIV(); 
            // JS.g:994:100: ( IdentifierPart )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='$'||(LA34_0>='0' && LA34_0<='9')||(LA34_0>='A' && LA34_0<='Z')||LA34_0=='\\'||LA34_0=='_'||(LA34_0>='a' && LA34_0<='z')) ) {
                    alt34=1;
                }
                else if ( ( isIdentifierPartUnicode(input.LA(1)) ) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:994:100: IdentifierPart
            	    {
            	    mIdentifierPart(); 

            	    }
            	    break;

            	default :
            	    break loop34;
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
        // JS.g:1:8: ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | GET | SET | YIELD | WXML | NAMESPACE | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | AT | DOTDOT | COLONCOLON | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | XMLFragment | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral )
        int alt35=127;
        switch ( input.LA(1) ) {
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA35_137 = input.LA(4);

                    if ( (LA35_137=='e') ) {
                        int LA35_207 = input.LA(5);

                        if ( (LA35_207=='s') ) {
                            int LA35_269 = input.LA(6);

                            if ( (LA35_269=='p') ) {
                                int LA35_321 = input.LA(7);

                                if ( (LA35_321=='a') ) {
                                    int LA35_362 = input.LA(8);

                                    if ( (LA35_362=='c') ) {
                                        int LA35_391 = input.LA(9);

                                        if ( (LA35_391=='e') ) {
                                            int LA35_409 = input.LA(10);

                                            if ( (LA35_409=='$'||(LA35_409>='0' && LA35_409<='9')||(LA35_409>='A' && LA35_409<='Z')||LA35_409=='\\'||LA35_409=='_'||(LA35_409>='a' && LA35_409<='z')) ) {
                                                alt35=121;
                                            }
                                            else {
                                                alt35=34;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 't':
                    {
                    int LA35_138 = input.LA(4);

                    if ( (LA35_138=='i') ) {
                        int LA35_208 = input.LA(5);

                        if ( (LA35_208=='v') ) {
                            int LA35_270 = input.LA(6);

                            if ( (LA35_270=='e') ) {
                                int LA35_322 = input.LA(7);

                                if ( (LA35_322=='$'||(LA35_322>='0' && LA35_322<='9')||(LA35_322>='A' && LA35_322<='Z')||LA35_322=='\\'||LA35_322=='_'||(LA35_322>='a' && LA35_322<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=54;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            case 'u':
                {
                int LA35_51 = input.LA(3);

                if ( (LA35_51=='l') ) {
                    int LA35_139 = input.LA(4);

                    if ( (LA35_139=='l') ) {
                        int LA35_209 = input.LA(5);

                        if ( (LA35_209=='$'||(LA35_209>='0' && LA35_209<='9')||(LA35_209>='A' && LA35_209<='Z')||LA35_209=='\\'||LA35_209=='_'||(LA35_209>='a' && LA35_209<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=1;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'e':
                {
                int LA35_52 = input.LA(3);

                if ( (LA35_52=='w') ) {
                    int LA35_140 = input.LA(4);

                    if ( (LA35_140=='$'||(LA35_140>='0' && LA35_140<='9')||(LA35_140>='A' && LA35_140<='Z')||LA35_140=='\\'||LA35_140=='_'||(LA35_140>='a' && LA35_140<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=19;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

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
                    int LA35_141 = input.LA(4);

                    if ( (LA35_141=='o') ) {
                        int LA35_211 = input.LA(5);

                        if ( (LA35_211=='w') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA35_323 = input.LA(7);

                                if ( (LA35_323=='$'||(LA35_323>='0' && LA35_323<='9')||(LA35_323>='A' && LA35_323<='Z')||LA35_323=='\\'||LA35_323=='_'||(LA35_323>='a' && LA35_323<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=63;}
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
                                alt35=121;
                                }
                                break;
                            default:
                                alt35=23;}

                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'i':
                    {
                    int LA35_142 = input.LA(4);

                    if ( (LA35_142=='s') ) {
                        int LA35_212 = input.LA(5);

                        if ( (LA35_212=='$'||(LA35_212>='0' && LA35_212<='9')||(LA35_212>='A' && LA35_212<='Z')||LA35_212=='\\'||LA35_212=='_'||(LA35_212>='a' && LA35_212<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=22;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA35_143 = input.LA(4);

                    if ( (LA35_143=='e') ) {
                        int LA35_213 = input.LA(5);

                        if ( (LA35_213=='$'||(LA35_213>='0' && LA35_213<='9')||(LA35_213>='A' && LA35_213<='Z')||LA35_213=='\\'||LA35_213=='_'||(LA35_213>='a' && LA35_213<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=2;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'y':
                    {
                    int LA35_144 = input.LA(4);

                    if ( (LA35_144=='$'||(LA35_144>='0' && LA35_144<='9')||(LA35_144>='A' && LA35_144<='Z')||LA35_144=='\\'||LA35_144=='_'||(LA35_144>='a' && LA35_144<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=24;}
                    }
                    break;
                case 'a':
                    {
                    int LA35_145 = input.LA(4);

                    if ( (LA35_145=='n') ) {
                        int LA35_215 = input.LA(5);

                        if ( (LA35_215=='s') ) {
                            int LA35_275 = input.LA(6);

                            if ( (LA35_275=='i') ) {
                                int LA35_325 = input.LA(7);

                                if ( (LA35_325=='e') ) {
                                    int LA35_365 = input.LA(8);

                                    if ( (LA35_365=='n') ) {
                                        int LA35_392 = input.LA(9);

                                        if ( (LA35_392=='t') ) {
                                            int LA35_410 = input.LA(10);

                                            if ( (LA35_410=='$'||(LA35_410>='0' && LA35_410<='9')||(LA35_410>='A' && LA35_410<='Z')||LA35_410=='\\'||LA35_410=='_'||(LA35_410>='a' && LA35_410<='z')) ) {
                                                alt35=121;
                                            }
                                            else {
                                                alt35=64;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            case 'y':
                {
                int LA35_55 = input.LA(3);

                if ( (LA35_55=='p') ) {
                    int LA35_146 = input.LA(4);

                    if ( (LA35_146=='e') ) {
                        int LA35_216 = input.LA(5);

                        if ( (LA35_216=='o') ) {
                            int LA35_276 = input.LA(6);

                            if ( (LA35_276=='f') ) {
                                int LA35_326 = input.LA(7);

                                if ( (LA35_326=='$'||(LA35_326>='0' && LA35_326<='9')||(LA35_326>='A' && LA35_326<='Z')||LA35_326=='\\'||LA35_326=='_'||(LA35_326>='a' && LA35_326<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=25;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA35_56 = input.LA(3);

                if ( (LA35_56=='n') ) {
                    int LA35_147 = input.LA(4);

                    if ( (LA35_147=='a') ) {
                        int LA35_217 = input.LA(5);

                        if ( (LA35_217=='l') ) {
                            switch ( input.LA(6) ) {
                            case 'l':
                                {
                                int LA35_327 = input.LA(7);

                                if ( (LA35_327=='y') ) {
                                    int LA35_367 = input.LA(8);

                                    if ( (LA35_367=='$'||(LA35_367>='0' && LA35_367<='9')||(LA35_367>='A' && LA35_367<='Z')||LA35_367=='\\'||LA35_367=='_'||(LA35_367>='a' && LA35_367<='z')) ) {
                                        alt35=121;
                                    }
                                    else {
                                        alt35=12;}
                                }
                                else {
                                    alt35=121;}
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
                                alt35=121;
                                }
                                break;
                            default:
                                alt35=46;}

                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'l':
                {
                int LA35_57 = input.LA(3);

                if ( (LA35_57=='o') ) {
                    int LA35_148 = input.LA(4);

                    if ( (LA35_148=='a') ) {
                        int LA35_218 = input.LA(5);

                        if ( (LA35_218=='t') ) {
                            int LA35_278 = input.LA(6);

                            if ( (LA35_278=='$'||(LA35_278>='0' && LA35_278<='9')||(LA35_278>='A' && LA35_278<='Z')||LA35_278=='\\'||LA35_278=='_'||(LA35_278>='a' && LA35_278<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=47;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'a':
                {
                int LA35_58 = input.LA(3);

                if ( (LA35_58=='l') ) {
                    int LA35_149 = input.LA(4);

                    if ( (LA35_149=='s') ) {
                        int LA35_219 = input.LA(5);

                        if ( (LA35_219=='e') ) {
                            int LA35_279 = input.LA(6);

                            if ( (LA35_279=='$'||(LA35_279>='0' && LA35_279<='9')||(LA35_279>='A' && LA35_279<='Z')||LA35_279=='\\'||LA35_279=='_'||(LA35_279>='a' && LA35_279<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=3;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'u':
                {
                int LA35_59 = input.LA(3);

                if ( (LA35_59=='n') ) {
                    int LA35_150 = input.LA(4);

                    if ( (LA35_150=='c') ) {
                        int LA35_220 = input.LA(5);

                        if ( (LA35_220=='t') ) {
                            int LA35_280 = input.LA(6);

                            if ( (LA35_280=='i') ) {
                                int LA35_331 = input.LA(7);

                                if ( (LA35_331=='o') ) {
                                    int LA35_368 = input.LA(8);

                                    if ( (LA35_368=='n') ) {
                                        int LA35_394 = input.LA(9);

                                        if ( (LA35_394=='$'||(LA35_394>='0' && LA35_394<='9')||(LA35_394>='A' && LA35_394<='Z')||LA35_394=='\\'||LA35_394=='_'||(LA35_394>='a' && LA35_394<='z')) ) {
                                            alt35=121;
                                        }
                                        else {
                                            alt35=15;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'o':
                {
                int LA35_60 = input.LA(3);

                if ( (LA35_60=='r') ) {
                    int LA35_151 = input.LA(4);

                    if ( (LA35_151=='$'||(LA35_151>='0' && LA35_151<='9')||(LA35_151>='A' && LA35_151<='Z')||LA35_151=='\\'||LA35_151=='_'||(LA35_151>='a' && LA35_151<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=13;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA35_61 = input.LA(3);

                if ( (LA35_61=='o') ) {
                    int LA35_152 = input.LA(4);

                    if ( (LA35_152=='l') ) {
                        int LA35_222 = input.LA(5);

                        if ( (LA35_222=='e') ) {
                            int LA35_281 = input.LA(6);

                            if ( (LA35_281=='a') ) {
                                int LA35_332 = input.LA(7);

                                if ( (LA35_332=='n') ) {
                                    int LA35_369 = input.LA(8);

                                    if ( (LA35_369=='$'||(LA35_369>='0' && LA35_369<='9')||(LA35_369>='A' && LA35_369<='Z')||LA35_369=='\\'||LA35_369=='_'||(LA35_369>='a' && LA35_369<='z')) ) {
                                        alt35=121;
                                    }
                                    else {
                                        alt35=36;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'y':
                {
                int LA35_62 = input.LA(3);

                if ( (LA35_62=='t') ) {
                    int LA35_153 = input.LA(4);

                    if ( (LA35_153=='e') ) {
                        int LA35_223 = input.LA(5);

                        if ( (LA35_223=='$'||(LA35_223>='0' && LA35_223<='9')||(LA35_223>='A' && LA35_223<='Z')||LA35_223=='\\'||LA35_223=='_'||(LA35_223>='a' && LA35_223<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=37;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'r':
                {
                int LA35_63 = input.LA(3);

                if ( (LA35_63=='e') ) {
                    int LA35_154 = input.LA(4);

                    if ( (LA35_154=='a') ) {
                        int LA35_224 = input.LA(5);

                        if ( (LA35_224=='k') ) {
                            int LA35_283 = input.LA(6);

                            if ( (LA35_283=='$'||(LA35_283>='0' && LA35_283<='9')||(LA35_283>='A' && LA35_283<='Z')||LA35_283=='\\'||LA35_283=='_'||(LA35_283>='a' && LA35_283<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=4;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA35_64 = input.LA(3);

                if ( (LA35_64=='a') ) {
                    int LA35_155 = input.LA(4);

                    if ( (LA35_155=='s') ) {
                        int LA35_225 = input.LA(5);

                        if ( (LA35_225=='s') ) {
                            int LA35_284 = input.LA(6);

                            if ( (LA35_284=='$'||(LA35_284>='0' && LA35_284<='9')||(LA35_284>='A' && LA35_284<='Z')||LA35_284=='\\'||LA35_284=='_'||(LA35_284>='a' && LA35_284<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=39;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'o':
                {
                int LA35_65 = input.LA(3);

                if ( (LA35_65=='n') ) {
                    switch ( input.LA(4) ) {
                    case 's':
                        {
                        int LA35_226 = input.LA(5);

                        if ( (LA35_226=='t') ) {
                            int LA35_285 = input.LA(6);

                            if ( (LA35_285=='$'||(LA35_285>='0' && LA35_285<='9')||(LA35_285>='A' && LA35_285<='Z')||LA35_285=='\\'||LA35_285=='_'||(LA35_285>='a' && LA35_285<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=40;}
                        }
                        else {
                            alt35=121;}
                        }
                        break;
                    case 't':
                        {
                        int LA35_227 = input.LA(5);

                        if ( (LA35_227=='i') ) {
                            int LA35_286 = input.LA(6);

                            if ( (LA35_286=='n') ) {
                                int LA35_336 = input.LA(7);

                                if ( (LA35_336=='u') ) {
                                    int LA35_370 = input.LA(8);

                                    if ( (LA35_370=='e') ) {
                                        int LA35_396 = input.LA(9);

                                        if ( (LA35_396=='$'||(LA35_396>='0' && LA35_396<='9')||(LA35_396>='A' && LA35_396<='Z')||LA35_396=='\\'||LA35_396=='_'||(LA35_396>='a' && LA35_396<='z')) ) {
                                            alt35=121;
                                        }
                                        else {
                                            alt35=7;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                        }
                        break;
                    default:
                        alt35=121;}

                }
                else {
                    alt35=121;}
                }
                break;
            case 'h':
                {
                int LA35_66 = input.LA(3);

                if ( (LA35_66=='a') ) {
                    int LA35_157 = input.LA(4);

                    if ( (LA35_157=='r') ) {
                        int LA35_228 = input.LA(5);

                        if ( (LA35_228=='$'||(LA35_228>='0' && LA35_228<='9')||(LA35_228>='A' && LA35_228<='Z')||LA35_228=='\\'||LA35_228=='_'||(LA35_228>='a' && LA35_228<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=38;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA35_158 = input.LA(4);

                    if ( (LA35_158=='c') ) {
                        int LA35_229 = input.LA(5);

                        if ( (LA35_229=='h') ) {
                            int LA35_288 = input.LA(6);

                            if ( (LA35_288=='$'||(LA35_288>='0' && LA35_288<='9')||(LA35_288>='A' && LA35_288<='Z')||LA35_288=='\\'||LA35_288=='_'||(LA35_288>='a' && LA35_288<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=6;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 's':
                    {
                    int LA35_159 = input.LA(4);

                    if ( (LA35_159=='e') ) {
                        int LA35_230 = input.LA(5);

                        if ( (LA35_230=='$'||(LA35_230>='0' && LA35_230<='9')||(LA35_230>='A' && LA35_230<='Z')||LA35_230=='\\'||LA35_230=='_'||(LA35_230>='a' && LA35_230<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=5;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            default:
                alt35=121;}

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
                    int LA35_160 = input.LA(4);

                    if ( (LA35_160=='b') ) {
                        int LA35_231 = input.LA(5);

                        if ( (LA35_231=='l') ) {
                            int LA35_290 = input.LA(6);

                            if ( (LA35_290=='e') ) {
                                int LA35_338 = input.LA(7);

                                if ( (LA35_338=='$'||(LA35_338>='0' && LA35_338<='9')||(LA35_338>='A' && LA35_338<='Z')||LA35_338=='\\'||LA35_338=='_'||(LA35_338>='a' && LA35_338<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=42;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
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
                    alt35=121;
                    }
                    break;
                default:
                    alt35=10;}

                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA35_162 = input.LA(4);

                    if ( (LA35_162=='e') ) {
                        int LA35_232 = input.LA(5);

                        if ( (LA35_232=='t') ) {
                            int LA35_291 = input.LA(6);

                            if ( (LA35_291=='e') ) {
                                int LA35_339 = input.LA(7);

                                if ( (LA35_339=='$'||(LA35_339>='0' && LA35_339<='9')||(LA35_339>='A' && LA35_339<='Z')||LA35_339=='\\'||LA35_339=='_'||(LA35_339>='a' && LA35_339<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=9;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'f':
                    {
                    int LA35_163 = input.LA(4);

                    if ( (LA35_163=='a') ) {
                        int LA35_233 = input.LA(5);

                        if ( (LA35_233=='u') ) {
                            int LA35_292 = input.LA(6);

                            if ( (LA35_292=='l') ) {
                                int LA35_340 = input.LA(7);

                                if ( (LA35_340=='t') ) {
                                    int LA35_373 = input.LA(8);

                                    if ( (LA35_373=='$'||(LA35_373>='0' && LA35_373<='9')||(LA35_373>='A' && LA35_373<='Z')||LA35_373=='\\'||LA35_373=='_'||(LA35_373>='a' && LA35_373<='z')) ) {
                                        alt35=121;
                                    }
                                    else {
                                        alt35=8;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'b':
                    {
                    int LA35_164 = input.LA(4);

                    if ( (LA35_164=='u') ) {
                        int LA35_234 = input.LA(5);

                        if ( (LA35_234=='g') ) {
                            int LA35_293 = input.LA(6);

                            if ( (LA35_293=='g') ) {
                                int LA35_341 = input.LA(7);

                                if ( (LA35_341=='e') ) {
                                    int LA35_374 = input.LA(8);

                                    if ( (LA35_374=='r') ) {
                                        int LA35_398 = input.LA(9);

                                        if ( (LA35_398=='$'||(LA35_398>='0' && LA35_398<='9')||(LA35_398>='A' && LA35_398<='Z')||LA35_398=='\\'||LA35_398=='_'||(LA35_398>='a' && LA35_398<='z')) ) {
                                            alt35=121;
                                        }
                                        else {
                                            alt35=41;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            default:
                alt35=121;}

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
                    int LA35_165 = input.LA(4);

                    if ( (LA35_165=='e') ) {
                        int LA35_235 = input.LA(5);

                        if ( (LA35_235=='n') ) {
                            int LA35_294 = input.LA(6);

                            if ( (LA35_294=='d') ) {
                                int LA35_342 = input.LA(7);

                                if ( (LA35_342=='s') ) {
                                    int LA35_375 = input.LA(8);

                                    if ( (LA35_375=='$'||(LA35_375>='0' && LA35_375<='9')||(LA35_375>='A' && LA35_375<='Z')||LA35_375=='\\'||LA35_375=='_'||(LA35_375>='a' && LA35_375<='z')) ) {
                                        alt35=121;
                                    }
                                    else {
                                        alt35=45;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'p':
                    {
                    int LA35_166 = input.LA(4);

                    if ( (LA35_166=='o') ) {
                        int LA35_236 = input.LA(5);

                        if ( (LA35_236=='r') ) {
                            int LA35_295 = input.LA(6);

                            if ( (LA35_295=='t') ) {
                                int LA35_343 = input.LA(7);

                                if ( (LA35_343=='$'||(LA35_343>='0' && LA35_343<='9')||(LA35_343>='A' && LA35_343<='Z')||LA35_343=='\\'||LA35_343=='_'||(LA35_343>='a' && LA35_343<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=44;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            case 'n':
                {
                int LA35_71 = input.LA(3);

                if ( (LA35_71=='u') ) {
                    int LA35_167 = input.LA(4);

                    if ( (LA35_167=='m') ) {
                        int LA35_237 = input.LA(5);

                        if ( (LA35_237=='$'||(LA35_237>='0' && LA35_237<='9')||(LA35_237>='A' && LA35_237<='Z')||LA35_237=='\\'||LA35_237=='_'||(LA35_237>='a' && LA35_237<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=43;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'a':
                {
                int LA35_72 = input.LA(3);

                if ( (LA35_72=='c') ) {
                    int LA35_168 = input.LA(4);

                    if ( (LA35_168=='h') ) {
                        int LA35_238 = input.LA(5);

                        if ( (LA35_238=='$'||(LA35_238>='0' && LA35_238<='9')||(LA35_238>='A' && LA35_238<='Z')||LA35_238=='\\'||LA35_238=='_'||(LA35_238>='a' && LA35_238<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=14;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'l':
                {
                int LA35_73 = input.LA(3);

                if ( (LA35_73=='s') ) {
                    int LA35_169 = input.LA(4);

                    if ( (LA35_169=='e') ) {
                        int LA35_239 = input.LA(5);

                        if ( (LA35_239=='$'||(LA35_239>='0' && LA35_239<='9')||(LA35_239>='A' && LA35_239<='Z')||LA35_239=='\\'||LA35_239=='_'||(LA35_239>='a' && LA35_239<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=11;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA35_74 = input.LA(3);

                if ( (LA35_74=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA35_240 = input.LA(5);

                        if ( (LA35_240=='r') ) {
                            int LA35_299 = input.LA(6);

                            if ( (LA35_299=='t') ) {
                                int LA35_344 = input.LA(7);

                                if ( (LA35_344=='$'||(LA35_344>='0' && LA35_344<='9')||(LA35_344>='A' && LA35_344<='Z')||LA35_344=='\\'||LA35_344=='_'||(LA35_344>='a' && LA35_344<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=50;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                        }
                        break;
                    case 'l':
                        {
                        int LA35_241 = input.LA(5);

                        if ( (LA35_241=='e') ) {
                            int LA35_300 = input.LA(6);

                            if ( (LA35_300=='m') ) {
                                int LA35_345 = input.LA(7);

                                if ( (LA35_345=='e') ) {
                                    int LA35_378 = input.LA(8);

                                    if ( (LA35_378=='n') ) {
                                        int LA35_400 = input.LA(9);

                                        if ( (LA35_400=='t') ) {
                                            int LA35_414 = input.LA(10);

                                            if ( (LA35_414=='s') ) {
                                                int LA35_423 = input.LA(11);

                                                if ( (LA35_423=='$'||(LA35_423>='0' && LA35_423<='9')||(LA35_423>='A' && LA35_423<='Z')||LA35_423=='\\'||LA35_423=='_'||(LA35_423>='a' && LA35_423<='z')) ) {
                                                    alt35=121;
                                                }
                                                else {
                                                    alt35=49;}
                                            }
                                            else {
                                                alt35=121;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                        }
                        break;
                    default:
                        alt35=121;}

                }
                else {
                    alt35=121;}
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA35_171 = input.LA(4);

                    if ( (LA35_171=='t') ) {
                        int LA35_242 = input.LA(5);

                        if ( (LA35_242=='a') ) {
                            int LA35_301 = input.LA(6);

                            if ( (LA35_301=='n') ) {
                                int LA35_346 = input.LA(7);

                                if ( (LA35_346=='c') ) {
                                    int LA35_379 = input.LA(8);

                                    if ( (LA35_379=='e') ) {
                                        int LA35_401 = input.LA(9);

                                        if ( (LA35_401=='o') ) {
                                            int LA35_415 = input.LA(10);

                                            if ( (LA35_415=='f') ) {
                                                int LA35_424 = input.LA(11);

                                                if ( (LA35_424=='$'||(LA35_424>='0' && LA35_424<='9')||(LA35_424>='A' && LA35_424<='Z')||LA35_424=='\\'||LA35_424=='_'||(LA35_424>='a' && LA35_424<='z')) ) {
                                                    alt35=121;
                                                }
                                                else {
                                                    alt35=18;}
                                            }
                                            else {
                                                alt35=121;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA35_243 = input.LA(5);

                        if ( (LA35_243=='r') ) {
                            int LA35_302 = input.LA(6);

                            if ( (LA35_302=='f') ) {
                                int LA35_347 = input.LA(7);

                                if ( (LA35_347=='a') ) {
                                    int LA35_380 = input.LA(8);

                                    if ( (LA35_380=='c') ) {
                                        int LA35_402 = input.LA(9);

                                        if ( (LA35_402=='e') ) {
                                            int LA35_416 = input.LA(10);

                                            if ( (LA35_416=='$'||(LA35_416>='0' && LA35_416<='9')||(LA35_416>='A' && LA35_416<='Z')||LA35_416=='\\'||LA35_416=='_'||(LA35_416>='a' && LA35_416<='z')) ) {
                                                alt35=121;
                                            }
                                            else {
                                                alt35=52;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
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
                        alt35=121;
                        }
                        break;
                    default:
                        alt35=51;}

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
                    alt35=121;
                    }
                    break;
                default:
                    alt35=17;}

                }
                break;
            case 'f':
                {
                int LA35_76 = input.LA(3);

                if ( (LA35_76=='$'||(LA35_76>='0' && LA35_76<='9')||(LA35_76>='A' && LA35_76<='Z')||LA35_76=='\\'||LA35_76=='_'||(LA35_76>='a' && LA35_76<='z')) ) {
                    alt35=121;
                }
                else {
                    alt35=16;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'r':
            {
            int LA35_9 = input.LA(2);

            if ( (LA35_9=='e') ) {
                int LA35_77 = input.LA(3);

                if ( (LA35_77=='t') ) {
                    int LA35_175 = input.LA(4);

                    if ( (LA35_175=='u') ) {
                        int LA35_245 = input.LA(5);

                        if ( (LA35_245=='r') ) {
                            int LA35_303 = input.LA(6);

                            if ( (LA35_303=='n') ) {
                                int LA35_348 = input.LA(7);

                                if ( (LA35_348=='$'||(LA35_348>='0' && LA35_348<='9')||(LA35_348>='A' && LA35_348<='Z')||LA35_348=='\\'||LA35_348=='_'||(LA35_348>='a' && LA35_348<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=20;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
            }
            else {
                alt35=121;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA35_78 = input.LA(3);

                if ( (LA35_78=='o') ) {
                    int LA35_176 = input.LA(4);

                    if ( (LA35_176=='r') ) {
                        int LA35_246 = input.LA(5);

                        if ( (LA35_246=='t') ) {
                            int LA35_304 = input.LA(6);

                            if ( (LA35_304=='$'||(LA35_304>='0' && LA35_304<='9')||(LA35_304>='A' && LA35_304<='Z')||LA35_304=='\\'||LA35_304=='_'||(LA35_304>='a' && LA35_304<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=59;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 't':
                {
                int LA35_79 = input.LA(3);

                if ( (LA35_79=='a') ) {
                    int LA35_177 = input.LA(4);

                    if ( (LA35_177=='t') ) {
                        int LA35_247 = input.LA(5);

                        if ( (LA35_247=='i') ) {
                            int LA35_305 = input.LA(6);

                            if ( (LA35_305=='c') ) {
                                int LA35_350 = input.LA(7);

                                if ( (LA35_350=='$'||(LA35_350>='0' && LA35_350<='9')||(LA35_350>='A' && LA35_350<='Z')||LA35_350=='\\'||LA35_350=='_'||(LA35_350>='a' && LA35_350<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=60;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'u':
                {
                int LA35_80 = input.LA(3);

                if ( (LA35_80=='p') ) {
                    int LA35_178 = input.LA(4);

                    if ( (LA35_178=='e') ) {
                        int LA35_248 = input.LA(5);

                        if ( (LA35_248=='r') ) {
                            int LA35_306 = input.LA(6);

                            if ( (LA35_306=='$'||(LA35_306>='0' && LA35_306<='9')||(LA35_306>='A' && LA35_306<='Z')||LA35_306=='\\'||LA35_306=='_'||(LA35_306>='a' && LA35_306<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=61;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'y':
                {
                int LA35_81 = input.LA(3);

                if ( (LA35_81=='n') ) {
                    int LA35_179 = input.LA(4);

                    if ( (LA35_179=='c') ) {
                        int LA35_249 = input.LA(5);

                        if ( (LA35_249=='h') ) {
                            int LA35_307 = input.LA(6);

                            if ( (LA35_307=='r') ) {
                                int LA35_352 = input.LA(7);

                                if ( (LA35_352=='o') ) {
                                    int LA35_383 = input.LA(8);

                                    if ( (LA35_383=='n') ) {
                                        int LA35_403 = input.LA(9);

                                        if ( (LA35_403=='i') ) {
                                            int LA35_417 = input.LA(10);

                                            if ( (LA35_417=='z') ) {
                                                int LA35_426 = input.LA(11);

                                                if ( (LA35_426=='e') ) {
                                                    int LA35_430 = input.LA(12);

                                                    if ( (LA35_430=='d') ) {
                                                        int LA35_431 = input.LA(13);

                                                        if ( (LA35_431=='$'||(LA35_431>='0' && LA35_431<='9')||(LA35_431>='A' && LA35_431<='Z')||LA35_431=='\\'||LA35_431=='_'||(LA35_431>='a' && LA35_431<='z')) ) {
                                                            alt35=121;
                                                        }
                                                        else {
                                                            alt35=62;}
                                                    }
                                                    else {
                                                        alt35=121;}
                                                }
                                                else {
                                                    alt35=121;}
                                            }
                                            else {
                                                alt35=121;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'e':
                {
                int LA35_82 = input.LA(3);

                if ( (LA35_82=='t') ) {
                    int LA35_180 = input.LA(4);

                    if ( (LA35_180=='$'||(LA35_180>='0' && LA35_180<='9')||(LA35_180>='A' && LA35_180<='Z')||LA35_180=='\\'||LA35_180=='_'||(LA35_180>='a' && LA35_180<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=31;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'w':
                {
                int LA35_83 = input.LA(3);

                if ( (LA35_83=='i') ) {
                    int LA35_181 = input.LA(4);

                    if ( (LA35_181=='t') ) {
                        int LA35_251 = input.LA(5);

                        if ( (LA35_251=='c') ) {
                            int LA35_308 = input.LA(6);

                            if ( (LA35_308=='h') ) {
                                int LA35_353 = input.LA(7);

                                if ( (LA35_353=='$'||(LA35_353>='0' && LA35_353<='9')||(LA35_353>='A' && LA35_353<='Z')||LA35_353=='\\'||LA35_353=='_'||(LA35_353>='a' && LA35_353<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=21;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

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
                    int LA35_182 = input.LA(4);

                    if ( (LA35_182=='d') ) {
                        int LA35_252 = input.LA(5);

                        if ( (LA35_252=='$'||(LA35_252>='0' && LA35_252<='9')||(LA35_252>='A' && LA35_252<='Z')||LA35_252=='\\'||LA35_252=='_'||(LA35_252>='a' && LA35_252<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=27;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'l':
                    {
                    int LA35_183 = input.LA(4);

                    if ( (LA35_183=='a') ) {
                        int LA35_253 = input.LA(5);

                        if ( (LA35_253=='t') ) {
                            int LA35_310 = input.LA(6);

                            if ( (LA35_310=='i') ) {
                                int LA35_354 = input.LA(7);

                                if ( (LA35_354=='l') ) {
                                    int LA35_385 = input.LA(8);

                                    if ( (LA35_385=='e') ) {
                                        int LA35_404 = input.LA(9);

                                        if ( (LA35_404=='$'||(LA35_404>='0' && LA35_404<='9')||(LA35_404>='A' && LA35_404<='Z')||LA35_404=='\\'||LA35_404=='_'||(LA35_404>='a' && LA35_404<='z')) ) {
                                            alt35=121;
                                        }
                                        else {
                                            alt35=65;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            case 'a':
                {
                int LA35_85 = input.LA(3);

                if ( (LA35_85=='r') ) {
                    int LA35_184 = input.LA(4);

                    if ( (LA35_184=='$'||(LA35_184>='0' && LA35_184<='9')||(LA35_184>='A' && LA35_184<='Z')||LA35_184=='\\'||LA35_184=='_'||(LA35_184>='a' && LA35_184<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=26;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA35_86 = input.LA(3);

                if ( (LA35_86=='i') ) {
                    int LA35_185 = input.LA(4);

                    if ( (LA35_185=='l') ) {
                        int LA35_255 = input.LA(5);

                        if ( (LA35_255=='e') ) {
                            int LA35_311 = input.LA(6);

                            if ( (LA35_311=='$'||(LA35_311>='0' && LA35_311<='9')||(LA35_311>='A' && LA35_311<='Z')||LA35_311=='\\'||LA35_311=='_'||(LA35_311>='a' && LA35_311<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=28;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'i':
                {
                int LA35_87 = input.LA(3);

                if ( (LA35_87=='t') ) {
                    int LA35_186 = input.LA(4);

                    if ( (LA35_186=='h') ) {
                        int LA35_256 = input.LA(5);

                        if ( (LA35_256=='$'||(LA35_256>='0' && LA35_256<='9')||(LA35_256>='A' && LA35_256<='Z')||LA35_256=='\\'||LA35_256=='_'||(LA35_256>='a' && LA35_256<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=29;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'g':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA35_88 = input.LA(3);

                if ( (LA35_88=='t') ) {
                    int LA35_187 = input.LA(4);

                    if ( (LA35_187=='o') ) {
                        int LA35_257 = input.LA(5);

                        if ( (LA35_257=='$'||(LA35_257>='0' && LA35_257<='9')||(LA35_257>='A' && LA35_257<='Z')||LA35_257=='\\'||LA35_257=='_'||(LA35_257>='a' && LA35_257<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=48;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'e':
                {
                int LA35_89 = input.LA(3);

                if ( (LA35_89=='t') ) {
                    int LA35_188 = input.LA(4);

                    if ( (LA35_188=='$'||(LA35_188>='0' && LA35_188<='9')||(LA35_188>='A' && LA35_188<='Z')||LA35_188=='\\'||LA35_188=='_'||(LA35_188>='a' && LA35_188<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=30;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case 'y':
            {
            int LA35_14 = input.LA(2);

            if ( (LA35_14=='i') ) {
                int LA35_90 = input.LA(3);

                if ( (LA35_90=='e') ) {
                    int LA35_189 = input.LA(4);

                    if ( (LA35_189=='l') ) {
                        int LA35_259 = input.LA(5);

                        if ( (LA35_259=='d') ) {
                            int LA35_314 = input.LA(6);

                            if ( (LA35_314=='$'||(LA35_314>='0' && LA35_314<='9')||(LA35_314>='A' && LA35_314<='Z')||LA35_314=='\\'||LA35_314=='_'||(LA35_314>='a' && LA35_314<='z')) ) {
                                alt35=121;
                            }
                            else {
                                alt35=32;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
            }
            else {
                alt35=121;}
            }
            break;
        case 'x':
            {
            int LA35_15 = input.LA(2);

            if ( (LA35_15=='m') ) {
                int LA35_91 = input.LA(3);

                if ( (LA35_91=='l') ) {
                    int LA35_190 = input.LA(4);

                    if ( (LA35_190=='$'||(LA35_190>='0' && LA35_190<='9')||(LA35_190>='A' && LA35_190<='Z')||LA35_190=='\\'||LA35_190=='_'||(LA35_190>='a' && LA35_190<='z')) ) {
                        alt35=121;
                    }
                    else {
                        alt35=33;}
                }
                else {
                    alt35=121;}
            }
            else {
                alt35=121;}
            }
            break;
        case 'a':
            {
            int LA35_16 = input.LA(2);

            if ( (LA35_16=='b') ) {
                int LA35_92 = input.LA(3);

                if ( (LA35_92=='s') ) {
                    int LA35_191 = input.LA(4);

                    if ( (LA35_191=='t') ) {
                        int LA35_261 = input.LA(5);

                        if ( (LA35_261=='r') ) {
                            int LA35_315 = input.LA(6);

                            if ( (LA35_315=='a') ) {
                                int LA35_357 = input.LA(7);

                                if ( (LA35_357=='c') ) {
                                    int LA35_386 = input.LA(8);

                                    if ( (LA35_386=='t') ) {
                                        int LA35_405 = input.LA(9);

                                        if ( (LA35_405=='$'||(LA35_405>='0' && LA35_405<='9')||(LA35_405>='A' && LA35_405<='Z')||LA35_405=='\\'||LA35_405=='_'||(LA35_405>='a' && LA35_405<='z')) ) {
                                            alt35=121;
                                        }
                                        else {
                                            alt35=35;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
            }
            else {
                alt35=121;}
            }
            break;
        case 'l':
            {
            int LA35_17 = input.LA(2);

            if ( (LA35_17=='o') ) {
                int LA35_93 = input.LA(3);

                if ( (LA35_93=='n') ) {
                    int LA35_192 = input.LA(4);

                    if ( (LA35_192=='g') ) {
                        int LA35_262 = input.LA(5);

                        if ( (LA35_262=='$'||(LA35_262>='0' && LA35_262<='9')||(LA35_262>='A' && LA35_262<='Z')||LA35_262=='\\'||LA35_262=='_'||(LA35_262>='a' && LA35_262<='z')) ) {
                            alt35=121;
                        }
                        else {
                            alt35=53;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
            }
            else {
                alt35=121;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA35_94 = input.LA(3);

                if ( (LA35_94=='c') ) {
                    int LA35_193 = input.LA(4);

                    if ( (LA35_193=='k') ) {
                        int LA35_263 = input.LA(5);

                        if ( (LA35_263=='a') ) {
                            int LA35_317 = input.LA(6);

                            if ( (LA35_317=='g') ) {
                                int LA35_358 = input.LA(7);

                                if ( (LA35_358=='e') ) {
                                    int LA35_387 = input.LA(8);

                                    if ( (LA35_387=='$'||(LA35_387>='0' && LA35_387<='9')||(LA35_387>='A' && LA35_387<='Z')||LA35_387=='\\'||LA35_387=='_'||(LA35_387>='a' && LA35_387<='z')) ) {
                                        alt35=121;
                                    }
                                    else {
                                        alt35=55;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA35_194 = input.LA(4);

                    if ( (LA35_194=='v') ) {
                        int LA35_264 = input.LA(5);

                        if ( (LA35_264=='a') ) {
                            int LA35_318 = input.LA(6);

                            if ( (LA35_318=='t') ) {
                                int LA35_359 = input.LA(7);

                                if ( (LA35_359=='e') ) {
                                    int LA35_388 = input.LA(8);

                                    if ( (LA35_388=='$'||(LA35_388>='0' && LA35_388<='9')||(LA35_388>='A' && LA35_388<='Z')||LA35_388=='\\'||LA35_388=='_'||(LA35_388>='a' && LA35_388<='z')) ) {
                                        alt35=121;
                                    }
                                    else {
                                        alt35=56;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                case 'o':
                    {
                    int LA35_195 = input.LA(4);

                    if ( (LA35_195=='t') ) {
                        int LA35_265 = input.LA(5);

                        if ( (LA35_265=='e') ) {
                            int LA35_319 = input.LA(6);

                            if ( (LA35_319=='c') ) {
                                int LA35_360 = input.LA(7);

                                if ( (LA35_360=='t') ) {
                                    int LA35_389 = input.LA(8);

                                    if ( (LA35_389=='e') ) {
                                        int LA35_408 = input.LA(9);

                                        if ( (LA35_408=='d') ) {
                                            int LA35_420 = input.LA(10);

                                            if ( (LA35_420=='$'||(LA35_420>='0' && LA35_420<='9')||(LA35_420>='A' && LA35_420<='Z')||LA35_420=='\\'||LA35_420=='_'||(LA35_420>='a' && LA35_420<='z')) ) {
                                                alt35=121;
                                            }
                                            else {
                                                alt35=57;}
                                        }
                                        else {
                                            alt35=121;}
                                    }
                                    else {
                                        alt35=121;}
                                }
                                else {
                                    alt35=121;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                    }
                    break;
                default:
                    alt35=121;}

                }
                break;
            case 'u':
                {
                int LA35_96 = input.LA(3);

                if ( (LA35_96=='b') ) {
                    int LA35_196 = input.LA(4);

                    if ( (LA35_196=='l') ) {
                        int LA35_266 = input.LA(5);

                        if ( (LA35_266=='i') ) {
                            int LA35_320 = input.LA(6);

                            if ( (LA35_320=='c') ) {
                                int LA35_361 = input.LA(7);

                                if ( (LA35_361=='$'||(LA35_361>='0' && LA35_361<='9')||(LA35_361>='A' && LA35_361<='Z')||LA35_361=='\\'||LA35_361=='_'||(LA35_361>='a' && LA35_361<='z')) ) {
                                    alt35=121;
                                }
                                else {
                                    alt35=58;}
                            }
                            else {
                                alt35=121;}
                        }
                        else {
                            alt35=121;}
                    }
                    else {
                        alt35=121;}
                }
                else {
                    alt35=121;}
                }
                break;
            default:
                alt35=121;}

            }
            break;
        case '{':
            {
            alt35=66;
            }
            break;
        case '}':
            {
            alt35=67;
            }
            break;
        case '(':
            {
            alt35=68;
            }
            break;
        case ')':
            {
            alt35=69;
            }
            break;
        case '[':
            {
            alt35=70;
            }
            break;
        case ']':
            {
            alt35=71;
            }
            break;
        case '.':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt35=115;
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
                alt35=123;
                }
                break;
            default:
                alt35=72;}

            }
            break;
        case ';':
            {
            alt35=73;
            }
            break;
        case ',':
            {
            alt35=74;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt35=77;
                }
                break;
            case '<':
                {
                int LA35_100 = input.LA(3);

                if ( (LA35_100=='=') ) {
                    alt35=106;
                }
                else {
                    alt35=89;}
                }
                break;
            case '!':
            case ':':
            case '?':
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
            case '{':
                {
                alt35=122;
                }
                break;
            default:
                alt35=75;}

            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt35=78;
                }
                break;
            case '>':
                {
                switch ( input.LA(3) ) {
                case '>':
                    {
                    int LA35_199 = input.LA(4);

                    if ( (LA35_199=='=') ) {
                        alt35=108;
                    }
                    else {
                        alt35=91;}
                    }
                    break;
                case '=':
                    {
                    alt35=107;
                    }
                    break;
                default:
                    alt35=90;}

                }
                break;
            default:
                alt35=76;}

            }
            break;
        case '=':
            {
            int LA35_30 = input.LA(2);

            if ( (LA35_30=='=') ) {
                int LA35_106 = input.LA(3);

                if ( (LA35_106=='=') ) {
                    alt35=81;
                }
                else {
                    alt35=79;}
            }
            else {
                alt35=101;}
            }
            break;
        case '!':
            {
            int LA35_31 = input.LA(2);

            if ( (LA35_31=='=') ) {
                int LA35_108 = input.LA(3);

                if ( (LA35_108=='=') ) {
                    alt35=82;
                }
                else {
                    alt35=80;}
            }
            else {
                alt35=95;}
            }
            break;
        case '+':
            {
            switch ( input.LA(2) ) {
            case '+':
                {
                alt35=87;
                }
                break;
            case '=':
                {
                alt35=102;
                }
                break;
            default:
                alt35=83;}

            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt35=88;
                }
                break;
            case '=':
                {
                alt35=103;
                }
                break;
            default:
                alt35=84;}

            }
            break;
        case '*':
            {
            int LA35_34 = input.LA(2);

            if ( (LA35_34=='=') ) {
                alt35=104;
            }
            else {
                alt35=85;}
            }
            break;
        case '%':
            {
            int LA35_35 = input.LA(2);

            if ( (LA35_35=='=') ) {
                alt35=105;
            }
            else {
                alt35=86;}
            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt35=109;
                }
                break;
            case '&':
                {
                alt35=97;
                }
                break;
            default:
                alt35=92;}

            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt35=110;
                }
                break;
            case '|':
                {
                alt35=98;
                }
                break;
            default:
                alt35=93;}

            }
            break;
        case '^':
            {
            int LA35_38 = input.LA(2);

            if ( (LA35_38=='=') ) {
                alt35=111;
            }
            else {
                alt35=94;}
            }
            break;
        case '~':
            {
            alt35=96;
            }
            break;
        case '?':
            {
            alt35=99;
            }
            break;
        case ':':
            {
            int LA35_41 = input.LA(2);

            if ( (LA35_41==':') ) {
                alt35=116;
            }
            else {
                alt35=100;}
            }
            break;
        case '/':
            {
            int LA35_42 = input.LA(2);

            if ( (LA35_42=='=') ) {
                int LA35_130 = input.LA(3);

                if ( ((LA35_130>='\u0000' && LA35_130<='\t')||(LA35_130>='\u000B' && LA35_130<='\f')||(LA35_130>='\u000E' && LA35_130<='\u2027')||(LA35_130>='\u202A' && LA35_130<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt35=127;
                }
                else {
                    alt35=113;}
            }
            else if ( (LA35_42=='*') ) {
                alt35=119;
            }
            else if ( (LA35_42=='/') ) {
                alt35=120;
            }
            else if ( ((LA35_42>='\u0000' && LA35_42<='\t')||(LA35_42>='\u000B' && LA35_42<='\f')||(LA35_42>='\u000E' && LA35_42<=')')||(LA35_42>='+' && LA35_42<='.')||(LA35_42>='0' && LA35_42<='<')||(LA35_42>='>' && LA35_42<='\u2027')||(LA35_42>='\u202A' && LA35_42<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                alt35=127;
            }
            else {
                alt35=112;}
            }
            break;
        case '@':
            {
            alt35=114;
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
            alt35=117;
            }
            break;
        case '\n':
        case '\r':
        case '\u2028':
        case '\u2029':
            {
            alt35=118;
            }
            break;
        case '0':
            {
            switch ( input.LA(2) ) {
            case 'X':
            case 'x':
                {
                alt35=125;
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
                alt35=124;
                }
                break;
            default:
                alt35=123;}

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
            alt35=123;
            }
            break;
        case '\"':
        case '\'':
            {
            alt35=126;
            }
            break;
        default:
            alt35=121;}

        switch (alt35) {
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
                // JS.g:1:192: WXML
                {
                mWXML(); 

                }
                break;
            case 34 :
                // JS.g:1:197: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 35 :
                // JS.g:1:207: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 36 :
                // JS.g:1:216: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 37 :
                // JS.g:1:224: BYTE
                {
                mBYTE(); 

                }
                break;
            case 38 :
                // JS.g:1:229: CHAR
                {
                mCHAR(); 

                }
                break;
            case 39 :
                // JS.g:1:234: CLASS
                {
                mCLASS(); 

                }
                break;
            case 40 :
                // JS.g:1:240: CONST
                {
                mCONST(); 

                }
                break;
            case 41 :
                // JS.g:1:246: DEBUGGER
                {
                mDEBUGGER(); 

                }
                break;
            case 42 :
                // JS.g:1:255: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 43 :
                // JS.g:1:262: ENUM
                {
                mENUM(); 

                }
                break;
            case 44 :
                // JS.g:1:267: EXPORT
                {
                mEXPORT(); 

                }
                break;
            case 45 :
                // JS.g:1:274: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 46 :
                // JS.g:1:282: FINAL
                {
                mFINAL(); 

                }
                break;
            case 47 :
                // JS.g:1:288: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 48 :
                // JS.g:1:294: GOTO
                {
                mGOTO(); 

                }
                break;
            case 49 :
                // JS.g:1:299: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 50 :
                // JS.g:1:310: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 51 :
                // JS.g:1:317: INT
                {
                mINT(); 

                }
                break;
            case 52 :
                // JS.g:1:321: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 53 :
                // JS.g:1:331: LONG
                {
                mLONG(); 

                }
                break;
            case 54 :
                // JS.g:1:336: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 55 :
                // JS.g:1:343: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 56 :
                // JS.g:1:351: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 57 :
                // JS.g:1:359: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 58 :
                // JS.g:1:369: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 59 :
                // JS.g:1:376: SHORT
                {
                mSHORT(); 

                }
                break;
            case 60 :
                // JS.g:1:382: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 61 :
                // JS.g:1:389: SUPER
                {
                mSUPER(); 

                }
                break;
            case 62 :
                // JS.g:1:395: SYNCHRONIZED
                {
                mSYNCHRONIZED(); 

                }
                break;
            case 63 :
                // JS.g:1:408: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 64 :
                // JS.g:1:415: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 65 :
                // JS.g:1:425: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 66 :
                // JS.g:1:434: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 67 :
                // JS.g:1:441: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 68 :
                // JS.g:1:448: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 69 :
                // JS.g:1:455: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 70 :
                // JS.g:1:462: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 71 :
                // JS.g:1:469: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 72 :
                // JS.g:1:476: DOT
                {
                mDOT(); 

                }
                break;
            case 73 :
                // JS.g:1:480: SEMIC
                {
                mSEMIC(); 

                }
                break;
            case 74 :
                // JS.g:1:486: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 75 :
                // JS.g:1:492: LT
                {
                mLT(); 

                }
                break;
            case 76 :
                // JS.g:1:495: GT
                {
                mGT(); 

                }
                break;
            case 77 :
                // JS.g:1:498: LTE
                {
                mLTE(); 

                }
                break;
            case 78 :
                // JS.g:1:502: GTE
                {
                mGTE(); 

                }
                break;
            case 79 :
                // JS.g:1:506: EQ
                {
                mEQ(); 

                }
                break;
            case 80 :
                // JS.g:1:509: NEQ
                {
                mNEQ(); 

                }
                break;
            case 81 :
                // JS.g:1:513: SAME
                {
                mSAME(); 

                }
                break;
            case 82 :
                // JS.g:1:518: NSAME
                {
                mNSAME(); 

                }
                break;
            case 83 :
                // JS.g:1:524: ADD
                {
                mADD(); 

                }
                break;
            case 84 :
                // JS.g:1:528: SUB
                {
                mSUB(); 

                }
                break;
            case 85 :
                // JS.g:1:532: MUL
                {
                mMUL(); 

                }
                break;
            case 86 :
                // JS.g:1:536: MOD
                {
                mMOD(); 

                }
                break;
            case 87 :
                // JS.g:1:540: INC
                {
                mINC(); 

                }
                break;
            case 88 :
                // JS.g:1:544: DEC
                {
                mDEC(); 

                }
                break;
            case 89 :
                // JS.g:1:548: SHL
                {
                mSHL(); 

                }
                break;
            case 90 :
                // JS.g:1:552: SHR
                {
                mSHR(); 

                }
                break;
            case 91 :
                // JS.g:1:556: SHU
                {
                mSHU(); 

                }
                break;
            case 92 :
                // JS.g:1:560: AND
                {
                mAND(); 

                }
                break;
            case 93 :
                // JS.g:1:564: OR
                {
                mOR(); 

                }
                break;
            case 94 :
                // JS.g:1:567: XOR
                {
                mXOR(); 

                }
                break;
            case 95 :
                // JS.g:1:571: NOT
                {
                mNOT(); 

                }
                break;
            case 96 :
                // JS.g:1:575: INV
                {
                mINV(); 

                }
                break;
            case 97 :
                // JS.g:1:579: LAND
                {
                mLAND(); 

                }
                break;
            case 98 :
                // JS.g:1:584: LOR
                {
                mLOR(); 

                }
                break;
            case 99 :
                // JS.g:1:588: QUE
                {
                mQUE(); 

                }
                break;
            case 100 :
                // JS.g:1:592: COLON
                {
                mCOLON(); 

                }
                break;
            case 101 :
                // JS.g:1:598: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 102 :
                // JS.g:1:605: ADDASS
                {
                mADDASS(); 

                }
                break;
            case 103 :
                // JS.g:1:612: SUBASS
                {
                mSUBASS(); 

                }
                break;
            case 104 :
                // JS.g:1:619: MULASS
                {
                mMULASS(); 

                }
                break;
            case 105 :
                // JS.g:1:626: MODASS
                {
                mMODASS(); 

                }
                break;
            case 106 :
                // JS.g:1:633: SHLASS
                {
                mSHLASS(); 

                }
                break;
            case 107 :
                // JS.g:1:640: SHRASS
                {
                mSHRASS(); 

                }
                break;
            case 108 :
                // JS.g:1:647: SHUASS
                {
                mSHUASS(); 

                }
                break;
            case 109 :
                // JS.g:1:654: ANDASS
                {
                mANDASS(); 

                }
                break;
            case 110 :
                // JS.g:1:661: ORASS
                {
                mORASS(); 

                }
                break;
            case 111 :
                // JS.g:1:667: XORASS
                {
                mXORASS(); 

                }
                break;
            case 112 :
                // JS.g:1:674: DIV
                {
                mDIV(); 

                }
                break;
            case 113 :
                // JS.g:1:678: DIVASS
                {
                mDIVASS(); 

                }
                break;
            case 114 :
                // JS.g:1:685: AT
                {
                mAT(); 

                }
                break;
            case 115 :
                // JS.g:1:688: DOTDOT
                {
                mDOTDOT(); 

                }
                break;
            case 116 :
                // JS.g:1:695: COLONCOLON
                {
                mCOLONCOLON(); 

                }
                break;
            case 117 :
                // JS.g:1:706: WhiteSpace
                {
                mWhiteSpace(); 

                }
                break;
            case 118 :
                // JS.g:1:717: EOL
                {
                mEOL(); 

                }
                break;
            case 119 :
                // JS.g:1:721: MultiLineComment
                {
                mMultiLineComment(); 

                }
                break;
            case 120 :
                // JS.g:1:738: SingleLineComment
                {
                mSingleLineComment(); 

                }
                break;
            case 121 :
                // JS.g:1:756: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 122 :
                // JS.g:1:767: XMLFragment
                {
                mXMLFragment(); 

                }
                break;
            case 123 :
                // JS.g:1:779: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 124 :
                // JS.g:1:794: OctalIntegerLiteral
                {
                mOctalIntegerLiteral(); 

                }
                break;
            case 125 :
                // JS.g:1:814: HexIntegerLiteral
                {
                mHexIntegerLiteral(); 

                }
                break;
            case 126 :
                // JS.g:1:832: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 127 :
                // JS.g:1:846: RegularExpressionLiteral
                {
                mRegularExpressionLiteral(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\2\4\3\uffff\1\4";
    static final String DFA22_eofS =
        "\7\uffff";
    static final String DFA22_minS =
        "\3\56\3\uffff\1\56";
    static final String DFA22_maxS =
        "\1\71\1\56\1\71\3\uffff\1\71";
    static final String DFA22_acceptS =
        "\3\uffff\1\2\1\3\1\1\1\uffff";
    static final String DFA22_specialS =
        "\7\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\5",
            "\1\5\1\uffff\12\6",
            "",
            "",
            "",
            "\1\5\1\uffff\12\6"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "905:1: DecimalLiteral : ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? );";
        }
    }
 

}
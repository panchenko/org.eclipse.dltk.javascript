// $ANTLR 3.0.1 /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g 2009-05-08 16:13:00

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSLexer extends Lexer {
    public static final int PACKAGE=55;
    public static final int FUNCTION=18;
    public static final int SHR=93;
    public static final int VT=153;
    public static final int RegularExpressionChar=191;
    public static final int CDATA=66;
    public static final int LOCALNAME=133;
    public static final int XRCLOSE=120;
    public static final int SHL=92;
    public static final int MOD=89;
    public static final int XHOPEN=122;
    public static final int CONST=40;
    public static final int DQUOTE=150;
    public static final int DO=13;
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
    public static final int XML=148;
    public static final int LAND=100;
    public static final int PINC=146;
    public static final int PROTECTED=57;
    public static final int LBRACK=73;
    public static final int LBRACE=69;
    public static final int RegularExpressionLiteral=176;
    public static final int SUB=87;
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
    public static final int SET=34;
    public static final int SHORT=59;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=151;
    public static final int Tokens=193;
    public static final int SAME=84;
    public static final int XHCLOSE=123;
    public static final int StringLiteral=168;
    public static final int COLON=103;
    public static final int PAREXPR=144;
    public static final int ENUM=43;
    public static final int HexIntegerLiteral=182;
    public static final int NBSP=156;
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

    private Token last;

    private final boolean areRegularExpressionsEnabled()
    {
    	if (last == null)
    	{
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
    	return Character.isJavaIdentifierPart(ch);
    }
    	
    private final boolean isIdentifierStartUnicode(int ch)
    {
    	return Character.isJavaIdentifierStart(ch);
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

    public JSLexer() {;} 
    public JSLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g"; }

    // $ANTLR start NULL
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:122:6: ( 'null' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:122:8: 'null'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:123:6: ( 'true' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:123:8: 'true'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:124:7: ( 'false' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:124:9: 'false'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:125:7: ( 'break' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:125:9: 'break'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:126:6: ( 'case' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:126:8: 'case'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:127:7: ( 'catch' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:127:9: 'catch'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:128:10: ( 'continue' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:128:12: 'continue'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:129:9: ( 'default' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:129:11: 'default'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:130:8: ( 'delete' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:130:10: 'delete'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:131:4: ( 'do' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:131:6: 'do'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:132:6: ( 'else' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:132:8: 'else'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:133:9: ( 'finally' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:133:11: 'finally'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:134:5: ( 'for' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:134:7: 'for'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:135:6: ( 'each' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:135:8: 'each'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:136:10: ( 'function' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:136:12: 'function'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:137:4: ( 'if' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:137:6: 'if'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:138:4: ( 'in' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:138:6: 'in'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:139:12: ( 'instanceof' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:139:14: 'instanceof'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:140:5: ( 'new' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:140:7: 'new'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:141:8: ( 'return' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:141:10: 'return'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:142:8: ( 'switch' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:142:10: 'switch'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:143:6: ( 'this' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:143:8: 'this'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:144:7: ( 'throw' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:144:9: 'throw'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:145:5: ( 'try' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:145:7: 'try'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:146:8: ( 'typeof' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:146:10: 'typeof'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:147:5: ( 'var' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:147:7: 'var'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:148:6: ( 'void' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:148:8: 'void'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:149:7: ( 'while' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:149:9: 'while'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:150:6: ( 'with' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:150:8: 'with'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:151:5: ( 'get' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:151:7: 'get'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:152:5: ( 'set' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:152:7: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SET

    // $ANTLR start ABSTRACT
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:153:10: ( 'abstract' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:153:12: 'abstract'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:154:9: ( 'boolean' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:154:11: 'boolean'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:155:6: ( 'byte' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:155:8: 'byte'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:156:6: ( 'char' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:156:8: 'char'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:157:7: ( 'class' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:157:9: 'class'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:158:7: ( 'const' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:158:9: 'const'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:159:10: ( 'debugger' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:159:12: 'debugger'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:160:8: ( 'double' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:160:10: 'double'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:161:6: ( 'enum' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:161:8: 'enum'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:162:8: ( 'export' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:162:10: 'export'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:163:9: ( 'extends' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:163:11: 'extends'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:164:7: ( 'final' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:164:9: 'final'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:165:7: ( 'float' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:165:9: 'float'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:166:6: ( 'goto' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:166:8: 'goto'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:167:12: ( 'implements' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:167:14: 'implements'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:168:8: ( 'import' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:168:10: 'import'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:169:5: ( 'int' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:169:7: 'int'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:170:11: ( 'interface' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:170:13: 'interface'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:171:6: ( 'long' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:171:8: 'long'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:172:8: ( 'native' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:172:10: 'native'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:173:9: ( 'package' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:173:11: 'package'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:174:9: ( 'private' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:174:11: 'private'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:175:11: ( 'protected' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:175:13: 'protected'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:176:8: ( 'public' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:176:10: 'public'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:177:7: ( 'short' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:177:9: 'short'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:178:8: ( 'static' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:178:10: 'static'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:179:7: ( 'super' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:179:9: 'super'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:180:14: ( 'synchronized' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:180:16: 'synchronized'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:181:8: ( 'throws' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:181:10: 'throws'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:182:11: ( 'transient' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:182:13: 'transient'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:183:10: ( 'volatile' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:183:12: 'volatile'
            {
            match("volatile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VOLATILE

    // $ANTLR start CDATA
    public final void mCDATA() throws RecognitionException {
        try {
            int _type = CDATA;
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:184:7: ( 'CDATA' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:184:9: 'CDATA'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:185:6: ( 'xml' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:185:8: 'xml'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:186:11: ( 'namespace' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:186:13: 'namespace'
            {
            match("namespace"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAMESPACE

    // $ANTLR start LBRACE
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:187:8: ( '{' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:187:10: '{'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:188:8: ( '}' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:188:10: '}'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:189:8: ( '(' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:189:10: '('
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:190:8: ( ')' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:190:10: ')'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:191:8: ( '[' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:191:10: '['
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:192:8: ( ']' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:192:10: ']'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:193:5: ( '.' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:193:7: '.'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:194:7: ( ';' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:194:9: ';'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:195:7: ( ',' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:195:9: ','
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:196:4: ( '<' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:196:6: '<'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:197:4: ( '>' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:197:6: '>'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:198:5: ( '<=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:198:7: '<='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:199:5: ( '>=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:199:7: '>='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:200:4: ( '==' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:200:6: '=='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:201:5: ( '!=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:201:7: '!='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:202:6: ( '===' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:202:8: '==='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:203:7: ( '!==' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:203:9: '!=='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:204:5: ( '+' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:204:7: '+'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:205:5: ( '-' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:205:7: '-'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:206:5: ( '*' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:206:7: '*'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:207:5: ( '%' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:207:7: '%'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:208:5: ( '++' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:208:7: '++'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:209:5: ( '--' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:209:7: '--'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:210:5: ( '<<' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:210:7: '<<'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:211:5: ( '>>' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:211:7: '>>'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:212:5: ( '>>>' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:212:7: '>>>'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:213:5: ( '&' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:213:7: '&'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:214:4: ( '|' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:214:6: '|'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:215:5: ( '^' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:215:7: '^'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:216:5: ( '!' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:216:7: '!'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:217:5: ( '~' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:217:7: '~'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:218:6: ( '&&' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:218:8: '&&'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:219:5: ( '||' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:219:7: '||'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:220:5: ( '?' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:220:7: '?'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:221:7: ( ':' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:221:9: ':'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:222:8: ( '=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:222:10: '='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:223:8: ( '+=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:223:10: '+='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:224:8: ( '-=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:224:10: '-='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:225:8: ( '*=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:225:10: '*='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:226:8: ( '%=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:226:10: '%='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:227:8: ( '<<=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:227:10: '<<='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:228:8: ( '>>=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:228:10: '>>='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:229:8: ( '>>>=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:229:10: '>>>='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:230:8: ( '&=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:230:10: '&='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:231:7: ( '|=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:231:9: '|='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:232:8: ( '^=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:232:10: '^='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:233:5: ( '/' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:233:7: '/'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:234:8: ( '/=' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:234:10: '/='
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:235:8: ( '<!--' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:235:10: '<!--'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:236:9: ( '-->' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:236:11: '-->'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:237:9: ( '</' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:237:11: '</'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:238:9: ( '/>' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:238:11: '/>'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:239:11: ( '<![' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:239:13: '<!['
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:240:8: ( '<?' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:240:10: '<?'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:241:9: ( '?>' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:241:11: '?>'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:242:4: ( '@' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:242:6: '@'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:243:8: ( '..' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:243:10: '..'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:244:12: ( '::' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:244:14: '::'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:481:2: ( '\\\\' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:481:4: '\\\\'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:485:2: ( '\"' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:485:4: '\"'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:489:2: ( '\\'' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:489:4: '\\''
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:495:2: ( '\\u0009' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:495:4: '\\u0009'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:499:2: ( '\\u000b' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:499:4: '\\u000b'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:503:2: ( '\\u000c' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:503:4: '\\u000c'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:507:2: ( '\\u0020' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:507:4: '\\u0020'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:511:2: ( '\\u00a0' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:511:4: '\\u00a0'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:515:2: ( '\\u1680' | '\\u180E' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u202F' | '\\u205F' | '\\u3000' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:534:2: ( ( TAB | VT | FF | SP | NBSP | USP )+ )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:534:4: ( TAB | VT | FF | SP | NBSP | USP )+
            {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:534:4: ( TAB | VT | FF | SP | NBSP | USP )+
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:542:2: ( '\\n' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:542:4: '\\n'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:546:2: ( '\\r' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:546:4: '\\r'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:550:2: ( '\\u2028' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:550:4: '\\u2028'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:554:2: ( '\\u2029' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:554:4: '\\u2029'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:558:2: ( CR | LF | LS | PS )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:2: ( ( ( CR ( LF )? ) | LF | LS | PS ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:4: ( ( CR ( LF )? ) | LF | LS | PS )
            {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:4: ( ( CR ( LF )? ) | LF | LS | PS )
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
                    new NoViableAltException("562:4: ( ( CR ( LF )? ) | LF | LS | PS )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:6: ( CR ( LF )? )
                    {
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:6: ( CR ( LF )? )
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:8: CR ( LF )?
                    {
                    mCR(); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:11: ( LF )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\n') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:11: LF
                            {
                            mLF(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:19: LF
                    {
                    mLF(); 

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:24: LS
                    {
                    mLS(); 

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:562:29: PS
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:569:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:569:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:569:9: ( options {greedy=false; } : . )*
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:569:41: .
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:573:2: ( '//' (~ ( LineTerminator ) )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:573:4: '//' (~ ( LineTerminator ) )*
            {
            match("//"); 

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:573:9: (~ ( LineTerminator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u2027')||(LA5_0>='\u202A' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:573:11: ~ ( LineTerminator )
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:681:2: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit )
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
                    new NoViableAltException("680:10: fragment IdentifierStartASCII : ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:681:4: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:681:15: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:682:4: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:683:4: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 5 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:684:4: BSLASH 'u' HexDigit HexDigit HexDigit HexDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:692:2: ( DecimalDigit | IdentifierStartASCII | {...}?)
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:692:4: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:693:4: IdentifierStartASCII
                    {
                    mIdentifierStartASCII(); 

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:694:4: {...}?
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:698:2: ( IdentifierStartASCII ( IdentifierPart )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:698:4: IdentifierStartASCII ( IdentifierPart )*
            {
            mIdentifierStartASCII(); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:698:25: ( IdentifierPart )*
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:698:25: IdentifierPart
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:2: ( IdentifierNameASCIIStart | )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='$'||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='\\'||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            else {
                alt9=2;}
            switch (alt9) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:4: IdentifierNameASCIIStart
                    {
                    mIdentifierNameASCIIStart(); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:711:4: 
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:715:3: ( AT Identifier )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:715:5: AT Identifier
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:719:3: ( PropertyIdentifierSymbols )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:719:5: PropertyIdentifierSymbols
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:805:2: ( '0' .. '9' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:805:4: '0' .. '9'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:809:2: ( DecimalDigit | 'a' .. 'f' | 'A' .. 'F' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:813:2: ( '0' .. '7' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:813:4: '0' .. '7'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+ )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:4: ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:18: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
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

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:33: ( DecimalDigit )+
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:33: DecimalDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:2: ( '0' | '1' .. '9' ( DecimalDigit )* )
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
                    new NoViableAltException("820:10: fragment DecimalIntegerLiteral : ( '0' | '1' .. '9' ( DecimalDigit )* );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:822:4: '1' .. '9' ( DecimalDigit )*
                    {
                    matchRange('1','9'); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:822:13: ( DecimalDigit )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:822:13: DecimalDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:2: ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:4: DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    match('.'); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:30: ( DecimalDigit )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:30: DecimalDigit
                    	    {
                    	    mDecimalDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:44: ( ExponentPart )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:44: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:4: '.' ( DecimalDigit )+ ( ExponentPart )?
                    {
                    match('.'); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:8: ( DecimalDigit )+
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
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:8: DecimalDigit
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

                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:22: ( ExponentPart )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:22: ExponentPart
                            {
                            mExponentPart(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:828:4: DecimalIntegerLiteral ( ExponentPart )?
                    {
                    mDecimalIntegerLiteral(); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:828:26: ( ExponentPart )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:828:26: ExponentPart
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:832:2: ( '0' ( OctalDigit )+ )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:832:4: '0' ( OctalDigit )+
            {
            match('0'); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:832:8: ( OctalDigit )+
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:832:8: OctalDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:2: ( ( '0x' | '0X' ) ( HexDigit )+ )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:4: ( '0x' | '0X' ) ( HexDigit )+
            {
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:4: ( '0x' | '0X' )
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
                        new NoViableAltException("836:4: ( '0x' | '0X' )", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("836:4: ( '0x' | '0X' )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:6: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:13: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:20: ( HexDigit )+
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:20: HexDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:855:2: (~ ( DecimalDigit | 'x' | 'u' | LineTerminator ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:855:4: ~ ( DecimalDigit | 'x' | 'u' | LineTerminator )
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:859:2: ( '0' .. '3' )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:859:4: '0' .. '3'
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:863:2: ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit )
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
                    new NoViableAltException("862:10: fragment OctalEscapeSequence : ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:863:4: OctalDigit
                    {
                    mOctalDigit(); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:864:4: ZeroToThree OctalDigit
                    {
                    mZeroToThree(); 
                    mOctalDigit(); 

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:865:4: '4' .. '7' OctalDigit
                    {
                    matchRange('4','7'); 
                    mOctalDigit(); 

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:866:4: ZeroToThree OctalDigit OctalDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:870:2: ( 'x' HexDigit HexDigit )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:870:4: 'x' HexDigit HexDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:874:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:874:4: 'u' HexDigit HexDigit HexDigit HexDigit
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:878:2: ( BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:879:2: BSLASH ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence )
            {
            mBSLASH(); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:880:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence )
            int alt24=4;
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("880:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:881:3: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:882:5: OctalEscapeSequence
                    {
                    mOctalEscapeSequence(); 

                    }
                    break;
                case 3 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:883:5: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 

                    }
                    break;
                case 4 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:884:5: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 

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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:889:2: ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE )
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
                    new NoViableAltException("888:1: StringLiteral : ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:889:4: SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE
                    {
                    mSQUOTE(); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:889:11: (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )*
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
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:889:13: ~ ( SQUOTE | BSLASH | LineTerminator )
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
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:889:53: EscapeSequence
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:890:4: DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE
                    {
                    mDQUOTE(); 
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:890:11: (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )*
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
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:890:13: ~ ( DQUOTE | BSLASH | LineTerminator )
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
                    	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:890:53: EscapeSequence
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:899:2: ( BSLASH ~ ( LineTerminator ) )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:899:4: BSLASH ~ ( LineTerminator )
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:903:2: (~ ( LineTerminator | MUL | BSLASH | DIV ) | BackslashSequence )
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
                    new NoViableAltException("902:10: fragment RegularExpressionFirstChar : (~ ( LineTerminator | MUL | BSLASH | DIV ) | BackslashSequence );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:903:4: ~ ( LineTerminator | MUL | BSLASH | DIV )
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:904:4: BackslashSequence
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:908:2: (~ ( LineTerminator | BSLASH | DIV ) | BackslashSequence )
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
                    new NoViableAltException("907:10: fragment RegularExpressionChar : (~ ( LineTerminator | BSLASH | DIV ) | BackslashSequence );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:908:4: ~ ( LineTerminator | BSLASH | DIV )
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
                    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:909:4: BackslashSequence
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
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:2: ({...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )* )
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:4: {...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar )* DIV ( IdentifierPart )*
            {
            if ( !( areRegularExpressionsEnabled() ) ) {
                throw new FailedPredicateException(input, "RegularExpressionLiteral", " areRegularExpressionsEnabled() ");
            }
            mDIV(); 
            mRegularExpressionFirstChar(); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:73: ( RegularExpressionChar )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='.')||(LA30_0>='0' && LA30_0<='\u2027')||(LA30_0>='\u202A' && LA30_0<='\uFFFE')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:73: RegularExpressionChar
            	    {
            	    mRegularExpressionChar(); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            mDIV(); 
            // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:100: ( IdentifierPart )*
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
            	    // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:100: IdentifierPart
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
        // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:8: ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | GET | SET | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | CDATA | WXML | NAMESPACE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | XCOPEN | XCCLOSE | XLCLOSE | XRCLOSE | CDATAOPEN | XHOPEN | XHCLOSE | AT | DOTDOT | COLONCOLON | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | XmlAttribute | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral )
        int alt32=134;
        switch ( input.LA(1) ) {
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA32_144 = input.LA(4);

                    if ( (LA32_144=='e') ) {
                        int LA32_219 = input.LA(5);

                        if ( (LA32_219=='s') ) {
                            int LA32_281 = input.LA(6);

                            if ( (LA32_281=='p') ) {
                                int LA32_333 = input.LA(7);

                                if ( (LA32_333=='a') ) {
                                    int LA32_374 = input.LA(8);

                                    if ( (LA32_374=='c') ) {
                                        int LA32_403 = input.LA(9);

                                        if ( (LA32_403=='e') ) {
                                            int LA32_421 = input.LA(10);

                                            if ( (LA32_421=='$'||(LA32_421>='0' && LA32_421<='9')||(LA32_421>='A' && LA32_421<='Z')||LA32_421=='\\'||LA32_421=='_'||(LA32_421>='a' && LA32_421<='z')) ) {
                                                alt32=128;
                                            }
                                            else {
                                                alt32=65;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 't':
                    {
                    int LA32_145 = input.LA(4);

                    if ( (LA32_145=='i') ) {
                        int LA32_220 = input.LA(5);

                        if ( (LA32_220=='v') ) {
                            int LA32_282 = input.LA(6);

                            if ( (LA32_282=='e') ) {
                                int LA32_334 = input.LA(7);

                                if ( (LA32_334=='$'||(LA32_334>='0' && LA32_334<='9')||(LA32_334>='A' && LA32_334<='Z')||LA32_334=='\\'||LA32_334=='_'||(LA32_334>='a' && LA32_334<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=51;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'u':
                {
                int LA32_51 = input.LA(3);

                if ( (LA32_51=='l') ) {
                    int LA32_146 = input.LA(4);

                    if ( (LA32_146=='l') ) {
                        int LA32_221 = input.LA(5);

                        if ( (LA32_221=='$'||(LA32_221>='0' && LA32_221<='9')||(LA32_221>='A' && LA32_221<='Z')||LA32_221=='\\'||LA32_221=='_'||(LA32_221>='a' && LA32_221<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=1;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'e':
                {
                int LA32_52 = input.LA(3);

                if ( (LA32_52=='w') ) {
                    int LA32_147 = input.LA(4);

                    if ( (LA32_147=='$'||(LA32_147>='0' && LA32_147<='9')||(LA32_147>='A' && LA32_147<='Z')||LA32_147=='\\'||LA32_147=='_'||(LA32_147>='a' && LA32_147<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=19;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

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
                    int LA32_148 = input.LA(4);

                    if ( (LA32_148=='o') ) {
                        int LA32_223 = input.LA(5);

                        if ( (LA32_223=='w') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA32_335 = input.LA(7);

                                if ( (LA32_335=='$'||(LA32_335>='0' && LA32_335<='9')||(LA32_335>='A' && LA32_335<='Z')||LA32_335=='\\'||LA32_335=='_'||(LA32_335>='a' && LA32_335<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=60;}
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
                                alt32=128;
                                }
                                break;
                            default:
                                alt32=23;}

                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'i':
                    {
                    int LA32_149 = input.LA(4);

                    if ( (LA32_149=='s') ) {
                        int LA32_224 = input.LA(5);

                        if ( (LA32_224=='$'||(LA32_224>='0' && LA32_224<='9')||(LA32_224>='A' && LA32_224<='Z')||LA32_224=='\\'||LA32_224=='_'||(LA32_224>='a' && LA32_224<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=22;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA32_150 = input.LA(4);

                    if ( (LA32_150=='e') ) {
                        int LA32_225 = input.LA(5);

                        if ( (LA32_225=='$'||(LA32_225>='0' && LA32_225<='9')||(LA32_225>='A' && LA32_225<='Z')||LA32_225=='\\'||LA32_225=='_'||(LA32_225>='a' && LA32_225<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=2;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'y':
                    {
                    int LA32_151 = input.LA(4);

                    if ( (LA32_151=='$'||(LA32_151>='0' && LA32_151<='9')||(LA32_151>='A' && LA32_151<='Z')||LA32_151=='\\'||LA32_151=='_'||(LA32_151>='a' && LA32_151<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=24;}
                    }
                    break;
                case 'a':
                    {
                    int LA32_152 = input.LA(4);

                    if ( (LA32_152=='n') ) {
                        int LA32_227 = input.LA(5);

                        if ( (LA32_227=='s') ) {
                            int LA32_287 = input.LA(6);

                            if ( (LA32_287=='i') ) {
                                int LA32_337 = input.LA(7);

                                if ( (LA32_337=='e') ) {
                                    int LA32_377 = input.LA(8);

                                    if ( (LA32_377=='n') ) {
                                        int LA32_404 = input.LA(9);

                                        if ( (LA32_404=='t') ) {
                                            int LA32_422 = input.LA(10);

                                            if ( (LA32_422=='$'||(LA32_422>='0' && LA32_422<='9')||(LA32_422>='A' && LA32_422<='Z')||LA32_422=='\\'||LA32_422=='_'||(LA32_422>='a' && LA32_422<='z')) ) {
                                                alt32=128;
                                            }
                                            else {
                                                alt32=61;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'y':
                {
                int LA32_55 = input.LA(3);

                if ( (LA32_55=='p') ) {
                    int LA32_153 = input.LA(4);

                    if ( (LA32_153=='e') ) {
                        int LA32_228 = input.LA(5);

                        if ( (LA32_228=='o') ) {
                            int LA32_288 = input.LA(6);

                            if ( (LA32_288=='f') ) {
                                int LA32_338 = input.LA(7);

                                if ( (LA32_338=='$'||(LA32_338>='0' && LA32_338<='9')||(LA32_338>='A' && LA32_338<='Z')||LA32_338=='\\'||LA32_338=='_'||(LA32_338>='a' && LA32_338<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=25;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA32_56 = input.LA(3);

                if ( (LA32_56=='o') ) {
                    int LA32_154 = input.LA(4);

                    if ( (LA32_154=='a') ) {
                        int LA32_229 = input.LA(5);

                        if ( (LA32_229=='t') ) {
                            int LA32_289 = input.LA(6);

                            if ( (LA32_289=='$'||(LA32_289>='0' && LA32_289<='9')||(LA32_289>='A' && LA32_289<='Z')||LA32_289=='\\'||LA32_289=='_'||(LA32_289>='a' && LA32_289<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=44;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'i':
                {
                int LA32_57 = input.LA(3);

                if ( (LA32_57=='n') ) {
                    int LA32_155 = input.LA(4);

                    if ( (LA32_155=='a') ) {
                        int LA32_230 = input.LA(5);

                        if ( (LA32_230=='l') ) {
                            switch ( input.LA(6) ) {
                            case 'l':
                                {
                                int LA32_340 = input.LA(7);

                                if ( (LA32_340=='y') ) {
                                    int LA32_379 = input.LA(8);

                                    if ( (LA32_379=='$'||(LA32_379>='0' && LA32_379<='9')||(LA32_379>='A' && LA32_379<='Z')||LA32_379=='\\'||LA32_379=='_'||(LA32_379>='a' && LA32_379<='z')) ) {
                                        alt32=128;
                                    }
                                    else {
                                        alt32=12;}
                                }
                                else {
                                    alt32=128;}
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
                                alt32=128;
                                }
                                break;
                            default:
                                alt32=43;}

                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'a':
                {
                int LA32_58 = input.LA(3);

                if ( (LA32_58=='l') ) {
                    int LA32_156 = input.LA(4);

                    if ( (LA32_156=='s') ) {
                        int LA32_231 = input.LA(5);

                        if ( (LA32_231=='e') ) {
                            int LA32_291 = input.LA(6);

                            if ( (LA32_291=='$'||(LA32_291>='0' && LA32_291<='9')||(LA32_291>='A' && LA32_291<='Z')||LA32_291=='\\'||LA32_291=='_'||(LA32_291>='a' && LA32_291<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=3;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'u':
                {
                int LA32_59 = input.LA(3);

                if ( (LA32_59=='n') ) {
                    int LA32_157 = input.LA(4);

                    if ( (LA32_157=='c') ) {
                        int LA32_232 = input.LA(5);

                        if ( (LA32_232=='t') ) {
                            int LA32_292 = input.LA(6);

                            if ( (LA32_292=='i') ) {
                                int LA32_343 = input.LA(7);

                                if ( (LA32_343=='o') ) {
                                    int LA32_380 = input.LA(8);

                                    if ( (LA32_380=='n') ) {
                                        int LA32_406 = input.LA(9);

                                        if ( (LA32_406=='$'||(LA32_406>='0' && LA32_406<='9')||(LA32_406>='A' && LA32_406<='Z')||LA32_406=='\\'||LA32_406=='_'||(LA32_406>='a' && LA32_406<='z')) ) {
                                            alt32=128;
                                        }
                                        else {
                                            alt32=15;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'o':
                {
                int LA32_60 = input.LA(3);

                if ( (LA32_60=='r') ) {
                    int LA32_158 = input.LA(4);

                    if ( (LA32_158=='$'||(LA32_158>='0' && LA32_158<='9')||(LA32_158>='A' && LA32_158<='Z')||LA32_158=='\\'||LA32_158=='_'||(LA32_158>='a' && LA32_158<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=13;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_61 = input.LA(3);

                if ( (LA32_61=='o') ) {
                    int LA32_159 = input.LA(4);

                    if ( (LA32_159=='l') ) {
                        int LA32_234 = input.LA(5);

                        if ( (LA32_234=='e') ) {
                            int LA32_293 = input.LA(6);

                            if ( (LA32_293=='a') ) {
                                int LA32_344 = input.LA(7);

                                if ( (LA32_344=='n') ) {
                                    int LA32_381 = input.LA(8);

                                    if ( (LA32_381=='$'||(LA32_381>='0' && LA32_381<='9')||(LA32_381>='A' && LA32_381<='Z')||LA32_381=='\\'||LA32_381=='_'||(LA32_381>='a' && LA32_381<='z')) ) {
                                        alt32=128;
                                    }
                                    else {
                                        alt32=33;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'y':
                {
                int LA32_62 = input.LA(3);

                if ( (LA32_62=='t') ) {
                    int LA32_160 = input.LA(4);

                    if ( (LA32_160=='e') ) {
                        int LA32_235 = input.LA(5);

                        if ( (LA32_235=='$'||(LA32_235>='0' && LA32_235<='9')||(LA32_235>='A' && LA32_235<='Z')||LA32_235=='\\'||LA32_235=='_'||(LA32_235>='a' && LA32_235<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=34;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'r':
                {
                int LA32_63 = input.LA(3);

                if ( (LA32_63=='e') ) {
                    int LA32_161 = input.LA(4);

                    if ( (LA32_161=='a') ) {
                        int LA32_236 = input.LA(5);

                        if ( (LA32_236=='k') ) {
                            int LA32_295 = input.LA(6);

                            if ( (LA32_295=='$'||(LA32_295>='0' && LA32_295<='9')||(LA32_295>='A' && LA32_295<='Z')||LA32_295=='\\'||LA32_295=='_'||(LA32_295>='a' && LA32_295<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=4;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA32_64 = input.LA(3);

                if ( (LA32_64=='a') ) {
                    int LA32_162 = input.LA(4);

                    if ( (LA32_162=='r') ) {
                        int LA32_237 = input.LA(5);

                        if ( (LA32_237=='$'||(LA32_237>='0' && LA32_237<='9')||(LA32_237>='A' && LA32_237<='Z')||LA32_237=='\\'||LA32_237=='_'||(LA32_237>='a' && LA32_237<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=35;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'l':
                {
                int LA32_65 = input.LA(3);

                if ( (LA32_65=='a') ) {
                    int LA32_163 = input.LA(4);

                    if ( (LA32_163=='s') ) {
                        int LA32_238 = input.LA(5);

                        if ( (LA32_238=='s') ) {
                            int LA32_297 = input.LA(6);

                            if ( (LA32_297=='$'||(LA32_297>='0' && LA32_297<='9')||(LA32_297>='A' && LA32_297<='Z')||LA32_297=='\\'||LA32_297=='_'||(LA32_297>='a' && LA32_297<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=36;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'o':
                {
                int LA32_66 = input.LA(3);

                if ( (LA32_66=='n') ) {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA32_239 = input.LA(5);

                        if ( (LA32_239=='i') ) {
                            int LA32_298 = input.LA(6);

                            if ( (LA32_298=='n') ) {
                                int LA32_347 = input.LA(7);

                                if ( (LA32_347=='u') ) {
                                    int LA32_382 = input.LA(8);

                                    if ( (LA32_382=='e') ) {
                                        int LA32_408 = input.LA(9);

                                        if ( (LA32_408=='$'||(LA32_408>='0' && LA32_408<='9')||(LA32_408>='A' && LA32_408<='Z')||LA32_408=='\\'||LA32_408=='_'||(LA32_408>='a' && LA32_408<='z')) ) {
                                            alt32=128;
                                        }
                                        else {
                                            alt32=7;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                        }
                        break;
                    case 's':
                        {
                        int LA32_240 = input.LA(5);

                        if ( (LA32_240=='t') ) {
                            int LA32_299 = input.LA(6);

                            if ( (LA32_299=='$'||(LA32_299>='0' && LA32_299<='9')||(LA32_299>='A' && LA32_299<='Z')||LA32_299=='\\'||LA32_299=='_'||(LA32_299>='a' && LA32_299<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=37;}
                        }
                        else {
                            alt32=128;}
                        }
                        break;
                    default:
                        alt32=128;}

                }
                else {
                    alt32=128;}
                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA32_165 = input.LA(4);

                    if ( (LA32_165=='c') ) {
                        int LA32_241 = input.LA(5);

                        if ( (LA32_241=='h') ) {
                            int LA32_300 = input.LA(6);

                            if ( (LA32_300=='$'||(LA32_300>='0' && LA32_300<='9')||(LA32_300>='A' && LA32_300<='Z')||LA32_300=='\\'||LA32_300=='_'||(LA32_300>='a' && LA32_300<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=6;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 's':
                    {
                    int LA32_166 = input.LA(4);

                    if ( (LA32_166=='e') ) {
                        int LA32_242 = input.LA(5);

                        if ( (LA32_242=='$'||(LA32_242>='0' && LA32_242<='9')||(LA32_242>='A' && LA32_242<='Z')||LA32_242=='\\'||LA32_242=='_'||(LA32_242>='a' && LA32_242<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=5;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'b':
                    {
                    int LA32_167 = input.LA(4);

                    if ( (LA32_167=='u') ) {
                        int LA32_243 = input.LA(5);

                        if ( (LA32_243=='g') ) {
                            int LA32_302 = input.LA(6);

                            if ( (LA32_302=='g') ) {
                                int LA32_350 = input.LA(7);

                                if ( (LA32_350=='e') ) {
                                    int LA32_383 = input.LA(8);

                                    if ( (LA32_383=='r') ) {
                                        int LA32_409 = input.LA(9);

                                        if ( (LA32_409=='$'||(LA32_409>='0' && LA32_409<='9')||(LA32_409>='A' && LA32_409<='Z')||LA32_409=='\\'||LA32_409=='_'||(LA32_409>='a' && LA32_409<='z')) ) {
                                            alt32=128;
                                        }
                                        else {
                                            alt32=38;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'l':
                    {
                    int LA32_168 = input.LA(4);

                    if ( (LA32_168=='e') ) {
                        int LA32_244 = input.LA(5);

                        if ( (LA32_244=='t') ) {
                            int LA32_303 = input.LA(6);

                            if ( (LA32_303=='e') ) {
                                int LA32_351 = input.LA(7);

                                if ( (LA32_351=='$'||(LA32_351>='0' && LA32_351<='9')||(LA32_351>='A' && LA32_351<='Z')||LA32_351=='\\'||LA32_351=='_'||(LA32_351>='a' && LA32_351<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=9;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'f':
                    {
                    int LA32_169 = input.LA(4);

                    if ( (LA32_169=='a') ) {
                        int LA32_245 = input.LA(5);

                        if ( (LA32_245=='u') ) {
                            int LA32_304 = input.LA(6);

                            if ( (LA32_304=='l') ) {
                                int LA32_352 = input.LA(7);

                                if ( (LA32_352=='t') ) {
                                    int LA32_385 = input.LA(8);

                                    if ( (LA32_385=='$'||(LA32_385>='0' && LA32_385<='9')||(LA32_385>='A' && LA32_385<='Z')||LA32_385=='\\'||LA32_385=='_'||(LA32_385>='a' && LA32_385<='z')) ) {
                                        alt32=128;
                                    }
                                    else {
                                        alt32=8;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA32_170 = input.LA(4);

                    if ( (LA32_170=='b') ) {
                        int LA32_246 = input.LA(5);

                        if ( (LA32_246=='l') ) {
                            int LA32_305 = input.LA(6);

                            if ( (LA32_305=='e') ) {
                                int LA32_353 = input.LA(7);

                                if ( (LA32_353=='$'||(LA32_353>='0' && LA32_353<='9')||(LA32_353>='A' && LA32_353<='Z')||LA32_353=='\\'||LA32_353=='_'||(LA32_353>='a' && LA32_353<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=39;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
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
                    alt32=128;
                    }
                    break;
                default:
                    alt32=10;}

                }
                break;
            default:
                alt32=128;}

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
                    int LA32_172 = input.LA(4);

                    if ( (LA32_172=='e') ) {
                        int LA32_247 = input.LA(5);

                        if ( (LA32_247=='n') ) {
                            int LA32_306 = input.LA(6);

                            if ( (LA32_306=='d') ) {
                                int LA32_354 = input.LA(7);

                                if ( (LA32_354=='s') ) {
                                    int LA32_387 = input.LA(8);

                                    if ( (LA32_387=='$'||(LA32_387>='0' && LA32_387<='9')||(LA32_387>='A' && LA32_387<='Z')||LA32_387=='\\'||LA32_387=='_'||(LA32_387>='a' && LA32_387<='z')) ) {
                                        alt32=128;
                                    }
                                    else {
                                        alt32=42;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'p':
                    {
                    int LA32_173 = input.LA(4);

                    if ( (LA32_173=='o') ) {
                        int LA32_248 = input.LA(5);

                        if ( (LA32_248=='r') ) {
                            int LA32_307 = input.LA(6);

                            if ( (LA32_307=='t') ) {
                                int LA32_355 = input.LA(7);

                                if ( (LA32_355=='$'||(LA32_355>='0' && LA32_355<='9')||(LA32_355>='A' && LA32_355<='Z')||LA32_355=='\\'||LA32_355=='_'||(LA32_355>='a' && LA32_355<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=41;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'n':
                {
                int LA32_71 = input.LA(3);

                if ( (LA32_71=='u') ) {
                    int LA32_174 = input.LA(4);

                    if ( (LA32_174=='m') ) {
                        int LA32_249 = input.LA(5);

                        if ( (LA32_249=='$'||(LA32_249>='0' && LA32_249<='9')||(LA32_249>='A' && LA32_249<='Z')||LA32_249=='\\'||LA32_249=='_'||(LA32_249>='a' && LA32_249<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=40;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'a':
                {
                int LA32_72 = input.LA(3);

                if ( (LA32_72=='c') ) {
                    int LA32_175 = input.LA(4);

                    if ( (LA32_175=='h') ) {
                        int LA32_250 = input.LA(5);

                        if ( (LA32_250=='$'||(LA32_250>='0' && LA32_250<='9')||(LA32_250>='A' && LA32_250<='Z')||LA32_250=='\\'||LA32_250=='_'||(LA32_250>='a' && LA32_250<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=14;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'l':
                {
                int LA32_73 = input.LA(3);

                if ( (LA32_73=='s') ) {
                    int LA32_176 = input.LA(4);

                    if ( (LA32_176=='e') ) {
                        int LA32_251 = input.LA(5);

                        if ( (LA32_251=='$'||(LA32_251>='0' && LA32_251<='9')||(LA32_251>='A' && LA32_251<='Z')||LA32_251=='\\'||LA32_251=='_'||(LA32_251>='a' && LA32_251<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=11;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA32_74 = input.LA(3);

                if ( (LA32_74=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA32_252 = input.LA(5);

                        if ( (LA32_252=='r') ) {
                            int LA32_311 = input.LA(6);

                            if ( (LA32_311=='t') ) {
                                int LA32_356 = input.LA(7);

                                if ( (LA32_356=='$'||(LA32_356>='0' && LA32_356<='9')||(LA32_356>='A' && LA32_356<='Z')||LA32_356=='\\'||LA32_356=='_'||(LA32_356>='a' && LA32_356<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=47;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                        }
                        break;
                    case 'l':
                        {
                        int LA32_253 = input.LA(5);

                        if ( (LA32_253=='e') ) {
                            int LA32_312 = input.LA(6);

                            if ( (LA32_312=='m') ) {
                                int LA32_357 = input.LA(7);

                                if ( (LA32_357=='e') ) {
                                    int LA32_390 = input.LA(8);

                                    if ( (LA32_390=='n') ) {
                                        int LA32_412 = input.LA(9);

                                        if ( (LA32_412=='t') ) {
                                            int LA32_426 = input.LA(10);

                                            if ( (LA32_426=='s') ) {
                                                int LA32_435 = input.LA(11);

                                                if ( (LA32_435=='$'||(LA32_435>='0' && LA32_435<='9')||(LA32_435>='A' && LA32_435<='Z')||LA32_435=='\\'||LA32_435=='_'||(LA32_435>='a' && LA32_435<='z')) ) {
                                                    alt32=128;
                                                }
                                                else {
                                                    alt32=46;}
                                            }
                                            else {
                                                alt32=128;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                        }
                        break;
                    default:
                        alt32=128;}

                }
                else {
                    alt32=128;}
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
                        int LA32_254 = input.LA(5);

                        if ( (LA32_254=='r') ) {
                            int LA32_313 = input.LA(6);

                            if ( (LA32_313=='f') ) {
                                int LA32_358 = input.LA(7);

                                if ( (LA32_358=='a') ) {
                                    int LA32_391 = input.LA(8);

                                    if ( (LA32_391=='c') ) {
                                        int LA32_413 = input.LA(9);

                                        if ( (LA32_413=='e') ) {
                                            int LA32_427 = input.LA(10);

                                            if ( (LA32_427=='$'||(LA32_427>='0' && LA32_427<='9')||(LA32_427>='A' && LA32_427<='Z')||LA32_427=='\\'||LA32_427=='_'||(LA32_427>='a' && LA32_427<='z')) ) {
                                                alt32=128;
                                            }
                                            else {
                                                alt32=49;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
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
                        alt32=128;
                        }
                        break;
                    default:
                        alt32=48;}

                    }
                    break;
                case 's':
                    {
                    int LA32_179 = input.LA(4);

                    if ( (LA32_179=='t') ) {
                        int LA32_256 = input.LA(5);

                        if ( (LA32_256=='a') ) {
                            int LA32_314 = input.LA(6);

                            if ( (LA32_314=='n') ) {
                                int LA32_359 = input.LA(7);

                                if ( (LA32_359=='c') ) {
                                    int LA32_392 = input.LA(8);

                                    if ( (LA32_392=='e') ) {
                                        int LA32_414 = input.LA(9);

                                        if ( (LA32_414=='o') ) {
                                            int LA32_428 = input.LA(10);

                                            if ( (LA32_428=='f') ) {
                                                int LA32_437 = input.LA(11);

                                                if ( (LA32_437=='$'||(LA32_437>='0' && LA32_437<='9')||(LA32_437>='A' && LA32_437<='Z')||LA32_437=='\\'||LA32_437=='_'||(LA32_437>='a' && LA32_437<='z')) ) {
                                                    alt32=128;
                                                }
                                                else {
                                                    alt32=18;}
                                            }
                                            else {
                                                alt32=128;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
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
                    alt32=128;
                    }
                    break;
                default:
                    alt32=17;}

                }
                break;
            case 'f':
                {
                int LA32_76 = input.LA(3);

                if ( (LA32_76=='$'||(LA32_76>='0' && LA32_76<='9')||(LA32_76>='A' && LA32_76<='Z')||LA32_76=='\\'||LA32_76=='_'||(LA32_76>='a' && LA32_76<='z')) ) {
                    alt32=128;
                }
                else {
                    alt32=16;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'r':
            {
            int LA32_9 = input.LA(2);

            if ( (LA32_9=='e') ) {
                int LA32_77 = input.LA(3);

                if ( (LA32_77=='t') ) {
                    int LA32_182 = input.LA(4);

                    if ( (LA32_182=='u') ) {
                        int LA32_257 = input.LA(5);

                        if ( (LA32_257=='r') ) {
                            int LA32_315 = input.LA(6);

                            if ( (LA32_315=='n') ) {
                                int LA32_360 = input.LA(7);

                                if ( (LA32_360=='$'||(LA32_360>='0' && LA32_360<='9')||(LA32_360>='A' && LA32_360<='Z')||LA32_360=='\\'||LA32_360=='_'||(LA32_360>='a' && LA32_360<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=20;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
            }
            else {
                alt32=128;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA32_78 = input.LA(3);

                if ( (LA32_78=='t') ) {
                    int LA32_183 = input.LA(4);

                    if ( (LA32_183=='$'||(LA32_183>='0' && LA32_183<='9')||(LA32_183>='A' && LA32_183<='Z')||LA32_183=='\\'||LA32_183=='_'||(LA32_183>='a' && LA32_183<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=31;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'h':
                {
                int LA32_79 = input.LA(3);

                if ( (LA32_79=='o') ) {
                    int LA32_184 = input.LA(4);

                    if ( (LA32_184=='r') ) {
                        int LA32_259 = input.LA(5);

                        if ( (LA32_259=='t') ) {
                            int LA32_316 = input.LA(6);

                            if ( (LA32_316=='$'||(LA32_316>='0' && LA32_316<='9')||(LA32_316>='A' && LA32_316<='Z')||LA32_316=='\\'||LA32_316=='_'||(LA32_316>='a' && LA32_316<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=56;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 't':
                {
                int LA32_80 = input.LA(3);

                if ( (LA32_80=='a') ) {
                    int LA32_185 = input.LA(4);

                    if ( (LA32_185=='t') ) {
                        int LA32_260 = input.LA(5);

                        if ( (LA32_260=='i') ) {
                            int LA32_317 = input.LA(6);

                            if ( (LA32_317=='c') ) {
                                int LA32_362 = input.LA(7);

                                if ( (LA32_362=='$'||(LA32_362>='0' && LA32_362<='9')||(LA32_362>='A' && LA32_362<='Z')||LA32_362=='\\'||LA32_362=='_'||(LA32_362>='a' && LA32_362<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=57;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'u':
                {
                int LA32_81 = input.LA(3);

                if ( (LA32_81=='p') ) {
                    int LA32_186 = input.LA(4);

                    if ( (LA32_186=='e') ) {
                        int LA32_261 = input.LA(5);

                        if ( (LA32_261=='r') ) {
                            int LA32_318 = input.LA(6);

                            if ( (LA32_318=='$'||(LA32_318>='0' && LA32_318<='9')||(LA32_318>='A' && LA32_318<='Z')||LA32_318=='\\'||LA32_318=='_'||(LA32_318>='a' && LA32_318<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=58;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'y':
                {
                int LA32_82 = input.LA(3);

                if ( (LA32_82=='n') ) {
                    int LA32_187 = input.LA(4);

                    if ( (LA32_187=='c') ) {
                        int LA32_262 = input.LA(5);

                        if ( (LA32_262=='h') ) {
                            int LA32_319 = input.LA(6);

                            if ( (LA32_319=='r') ) {
                                int LA32_364 = input.LA(7);

                                if ( (LA32_364=='o') ) {
                                    int LA32_395 = input.LA(8);

                                    if ( (LA32_395=='n') ) {
                                        int LA32_415 = input.LA(9);

                                        if ( (LA32_415=='i') ) {
                                            int LA32_429 = input.LA(10);

                                            if ( (LA32_429=='z') ) {
                                                int LA32_438 = input.LA(11);

                                                if ( (LA32_438=='e') ) {
                                                    int LA32_442 = input.LA(12);

                                                    if ( (LA32_442=='d') ) {
                                                        int LA32_443 = input.LA(13);

                                                        if ( (LA32_443=='$'||(LA32_443>='0' && LA32_443<='9')||(LA32_443>='A' && LA32_443<='Z')||LA32_443=='\\'||LA32_443=='_'||(LA32_443>='a' && LA32_443<='z')) ) {
                                                            alt32=128;
                                                        }
                                                        else {
                                                            alt32=59;}
                                                    }
                                                    else {
                                                        alt32=128;}
                                                }
                                                else {
                                                    alt32=128;}
                                            }
                                            else {
                                                alt32=128;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'w':
                {
                int LA32_83 = input.LA(3);

                if ( (LA32_83=='i') ) {
                    int LA32_188 = input.LA(4);

                    if ( (LA32_188=='t') ) {
                        int LA32_263 = input.LA(5);

                        if ( (LA32_263=='c') ) {
                            int LA32_320 = input.LA(6);

                            if ( (LA32_320=='h') ) {
                                int LA32_365 = input.LA(7);

                                if ( (LA32_365=='$'||(LA32_365>='0' && LA32_365<='9')||(LA32_365>='A' && LA32_365<='Z')||LA32_365=='\\'||LA32_365=='_'||(LA32_365>='a' && LA32_365<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=21;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

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
                    int LA32_189 = input.LA(4);

                    if ( (LA32_189=='d') ) {
                        int LA32_264 = input.LA(5);

                        if ( (LA32_264=='$'||(LA32_264>='0' && LA32_264<='9')||(LA32_264>='A' && LA32_264<='Z')||LA32_264=='\\'||LA32_264=='_'||(LA32_264>='a' && LA32_264<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=27;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'l':
                    {
                    int LA32_190 = input.LA(4);

                    if ( (LA32_190=='a') ) {
                        int LA32_265 = input.LA(5);

                        if ( (LA32_265=='t') ) {
                            int LA32_322 = input.LA(6);

                            if ( (LA32_322=='i') ) {
                                int LA32_366 = input.LA(7);

                                if ( (LA32_366=='l') ) {
                                    int LA32_397 = input.LA(8);

                                    if ( (LA32_397=='e') ) {
                                        int LA32_416 = input.LA(9);

                                        if ( (LA32_416=='$'||(LA32_416>='0' && LA32_416<='9')||(LA32_416>='A' && LA32_416<='Z')||LA32_416=='\\'||LA32_416=='_'||(LA32_416>='a' && LA32_416<='z')) ) {
                                            alt32=128;
                                        }
                                        else {
                                            alt32=62;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'a':
                {
                int LA32_85 = input.LA(3);

                if ( (LA32_85=='r') ) {
                    int LA32_191 = input.LA(4);

                    if ( (LA32_191=='$'||(LA32_191>='0' && LA32_191<='9')||(LA32_191>='A' && LA32_191<='Z')||LA32_191=='\\'||LA32_191=='_'||(LA32_191>='a' && LA32_191<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=26;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA32_86 = input.LA(3);

                if ( (LA32_86=='i') ) {
                    int LA32_192 = input.LA(4);

                    if ( (LA32_192=='l') ) {
                        int LA32_267 = input.LA(5);

                        if ( (LA32_267=='e') ) {
                            int LA32_323 = input.LA(6);

                            if ( (LA32_323=='$'||(LA32_323>='0' && LA32_323<='9')||(LA32_323>='A' && LA32_323<='Z')||LA32_323=='\\'||LA32_323=='_'||(LA32_323>='a' && LA32_323<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=28;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'i':
                {
                int LA32_87 = input.LA(3);

                if ( (LA32_87=='t') ) {
                    int LA32_193 = input.LA(4);

                    if ( (LA32_193=='h') ) {
                        int LA32_268 = input.LA(5);

                        if ( (LA32_268=='$'||(LA32_268>='0' && LA32_268<='9')||(LA32_268>='A' && LA32_268<='Z')||LA32_268=='\\'||LA32_268=='_'||(LA32_268>='a' && LA32_268<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=29;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'g':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_88 = input.LA(3);

                if ( (LA32_88=='t') ) {
                    int LA32_194 = input.LA(4);

                    if ( (LA32_194=='o') ) {
                        int LA32_269 = input.LA(5);

                        if ( (LA32_269=='$'||(LA32_269>='0' && LA32_269<='9')||(LA32_269>='A' && LA32_269<='Z')||LA32_269=='\\'||LA32_269=='_'||(LA32_269>='a' && LA32_269<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=45;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'e':
                {
                int LA32_89 = input.LA(3);

                if ( (LA32_89=='t') ) {
                    int LA32_195 = input.LA(4);

                    if ( (LA32_195=='$'||(LA32_195>='0' && LA32_195<='9')||(LA32_195>='A' && LA32_195<='Z')||LA32_195=='\\'||LA32_195=='_'||(LA32_195>='a' && LA32_195<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=30;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'a':
            {
            int LA32_14 = input.LA(2);

            if ( (LA32_14=='b') ) {
                int LA32_90 = input.LA(3);

                if ( (LA32_90=='s') ) {
                    int LA32_196 = input.LA(4);

                    if ( (LA32_196=='t') ) {
                        int LA32_271 = input.LA(5);

                        if ( (LA32_271=='r') ) {
                            int LA32_326 = input.LA(6);

                            if ( (LA32_326=='a') ) {
                                int LA32_368 = input.LA(7);

                                if ( (LA32_368=='c') ) {
                                    int LA32_398 = input.LA(8);

                                    if ( (LA32_398=='t') ) {
                                        int LA32_417 = input.LA(9);

                                        if ( (LA32_417=='$'||(LA32_417>='0' && LA32_417<='9')||(LA32_417>='A' && LA32_417<='Z')||LA32_417=='\\'||LA32_417=='_'||(LA32_417>='a' && LA32_417<='z')) ) {
                                            alt32=128;
                                        }
                                        else {
                                            alt32=32;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
            }
            else {
                alt32=128;}
            }
            break;
        case 'l':
            {
            int LA32_15 = input.LA(2);

            if ( (LA32_15=='o') ) {
                int LA32_91 = input.LA(3);

                if ( (LA32_91=='n') ) {
                    int LA32_197 = input.LA(4);

                    if ( (LA32_197=='g') ) {
                        int LA32_272 = input.LA(5);

                        if ( (LA32_272=='$'||(LA32_272>='0' && LA32_272<='9')||(LA32_272>='A' && LA32_272<='Z')||LA32_272=='\\'||LA32_272=='_'||(LA32_272>='a' && LA32_272<='z')) ) {
                            alt32=128;
                        }
                        else {
                            alt32=50;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
            }
            else {
                alt32=128;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA32_198 = input.LA(4);

                    if ( (LA32_198=='t') ) {
                        int LA32_273 = input.LA(5);

                        if ( (LA32_273=='e') ) {
                            int LA32_328 = input.LA(6);

                            if ( (LA32_328=='c') ) {
                                int LA32_369 = input.LA(7);

                                if ( (LA32_369=='t') ) {
                                    int LA32_399 = input.LA(8);

                                    if ( (LA32_399=='e') ) {
                                        int LA32_418 = input.LA(9);

                                        if ( (LA32_418=='d') ) {
                                            int LA32_432 = input.LA(10);

                                            if ( (LA32_432=='$'||(LA32_432>='0' && LA32_432<='9')||(LA32_432>='A' && LA32_432<='Z')||LA32_432=='\\'||LA32_432=='_'||(LA32_432>='a' && LA32_432<='z')) ) {
                                                alt32=128;
                                            }
                                            else {
                                                alt32=54;}
                                        }
                                        else {
                                            alt32=128;}
                                    }
                                    else {
                                        alt32=128;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                case 'i':
                    {
                    int LA32_199 = input.LA(4);

                    if ( (LA32_199=='v') ) {
                        int LA32_274 = input.LA(5);

                        if ( (LA32_274=='a') ) {
                            int LA32_329 = input.LA(6);

                            if ( (LA32_329=='t') ) {
                                int LA32_370 = input.LA(7);

                                if ( (LA32_370=='e') ) {
                                    int LA32_400 = input.LA(8);

                                    if ( (LA32_400=='$'||(LA32_400>='0' && LA32_400<='9')||(LA32_400>='A' && LA32_400<='Z')||LA32_400=='\\'||LA32_400=='_'||(LA32_400>='a' && LA32_400<='z')) ) {
                                        alt32=128;
                                    }
                                    else {
                                        alt32=53;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                    }
                    break;
                default:
                    alt32=128;}

                }
                break;
            case 'a':
                {
                int LA32_93 = input.LA(3);

                if ( (LA32_93=='c') ) {
                    int LA32_200 = input.LA(4);

                    if ( (LA32_200=='k') ) {
                        int LA32_275 = input.LA(5);

                        if ( (LA32_275=='a') ) {
                            int LA32_330 = input.LA(6);

                            if ( (LA32_330=='g') ) {
                                int LA32_371 = input.LA(7);

                                if ( (LA32_371=='e') ) {
                                    int LA32_401 = input.LA(8);

                                    if ( (LA32_401=='$'||(LA32_401>='0' && LA32_401<='9')||(LA32_401>='A' && LA32_401<='Z')||LA32_401=='\\'||LA32_401=='_'||(LA32_401>='a' && LA32_401<='z')) ) {
                                        alt32=128;
                                    }
                                    else {
                                        alt32=52;}
                                }
                                else {
                                    alt32=128;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            case 'u':
                {
                int LA32_94 = input.LA(3);

                if ( (LA32_94=='b') ) {
                    int LA32_201 = input.LA(4);

                    if ( (LA32_201=='l') ) {
                        int LA32_276 = input.LA(5);

                        if ( (LA32_276=='i') ) {
                            int LA32_331 = input.LA(6);

                            if ( (LA32_331=='c') ) {
                                int LA32_372 = input.LA(7);

                                if ( (LA32_372=='$'||(LA32_372>='0' && LA32_372<='9')||(LA32_372>='A' && LA32_372<='Z')||LA32_372=='\\'||LA32_372=='_'||(LA32_372>='a' && LA32_372<='z')) ) {
                                    alt32=128;
                                }
                                else {
                                    alt32=55;}
                            }
                            else {
                                alt32=128;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
                }
                break;
            default:
                alt32=128;}

            }
            break;
        case 'C':
            {
            int LA32_17 = input.LA(2);

            if ( (LA32_17=='D') ) {
                int LA32_95 = input.LA(3);

                if ( (LA32_95=='A') ) {
                    int LA32_202 = input.LA(4);

                    if ( (LA32_202=='T') ) {
                        int LA32_277 = input.LA(5);

                        if ( (LA32_277=='A') ) {
                            int LA32_332 = input.LA(6);

                            if ( (LA32_332=='$'||(LA32_332>='0' && LA32_332<='9')||(LA32_332>='A' && LA32_332<='Z')||LA32_332=='\\'||LA32_332=='_'||(LA32_332>='a' && LA32_332<='z')) ) {
                                alt32=128;
                            }
                            else {
                                alt32=63;}
                        }
                        else {
                            alt32=128;}
                    }
                    else {
                        alt32=128;}
                }
                else {
                    alt32=128;}
            }
            else {
                alt32=128;}
            }
            break;
        case 'x':
            {
            int LA32_18 = input.LA(2);

            if ( (LA32_18=='m') ) {
                int LA32_96 = input.LA(3);

                if ( (LA32_96=='l') ) {
                    int LA32_203 = input.LA(4);

                    if ( (LA32_203=='$'||(LA32_203>='0' && LA32_203<='9')||(LA32_203>='A' && LA32_203<='Z')||LA32_203=='\\'||LA32_203=='_'||(LA32_203>='a' && LA32_203<='z')) ) {
                        alt32=128;
                    }
                    else {
                        alt32=64;}
                }
                else {
                    alt32=128;}
            }
            else {
                alt32=128;}
            }
            break;
        case '{':
            {
            alt32=66;
            }
            break;
        case '}':
            {
            alt32=67;
            }
            break;
        case '(':
            {
            alt32=68;
            }
            break;
        case ')':
            {
            alt32=69;
            }
            break;
        case '[':
            {
            alt32=70;
            }
            break;
        case ']':
            {
            alt32=71;
            }
            break;
        case '.':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt32=122;
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
                alt32=130;
                }
                break;
            default:
                alt32=72;}

            }
            break;
        case ';':
            {
            alt32=73;
            }
            break;
        case ',':
            {
            alt32=74;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=77;
                }
                break;
            case '<':
                {
                int LA32_100 = input.LA(3);

                if ( (LA32_100=='=') ) {
                    alt32=106;
                }
                else {
                    alt32=89;}
                }
                break;
            case '?':
                {
                alt32=119;
                }
                break;
            case '!':
                {
                int LA32_102 = input.LA(3);

                if ( (LA32_102=='[') ) {
                    alt32=118;
                }
                else if ( (LA32_102=='-') ) {
                    alt32=114;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | GET | SET | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | CDATA | WXML | NAMESPACE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | XCOPEN | XCCLOSE | XLCLOSE | XRCLOSE | CDATAOPEN | XHOPEN | XHCLOSE | AT | DOTDOT | COLONCOLON | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | XmlAttribute | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral );", 32, 102, input);

                    throw nvae;
                }
                }
                break;
            case '/':
                {
                alt32=116;
                }
                break;
            default:
                alt32=75;}

            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=78;
                }
                break;
            case '>':
                {
                switch ( input.LA(3) ) {
                case '>':
                    {
                    int LA32_208 = input.LA(4);

                    if ( (LA32_208=='=') ) {
                        alt32=108;
                    }
                    else {
                        alt32=91;}
                    }
                    break;
                case '=':
                    {
                    alt32=107;
                    }
                    break;
                default:
                    alt32=90;}

                }
                break;
            default:
                alt32=76;}

            }
            break;
        case '=':
            {
            int LA32_30 = input.LA(2);

            if ( (LA32_30=='=') ) {
                int LA32_108 = input.LA(3);

                if ( (LA32_108=='=') ) {
                    alt32=81;
                }
                else {
                    alt32=79;}
            }
            else {
                alt32=101;}
            }
            break;
        case '!':
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
                alt32=95;}
            }
            break;
        case '+':
            {
            switch ( input.LA(2) ) {
            case '+':
                {
                alt32=87;
                }
                break;
            case '=':
                {
                alt32=102;
                }
                break;
            default:
                alt32=83;}

            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=103;
                }
                break;
            case '-':
                {
                int LA32_116 = input.LA(3);

                if ( (LA32_116=='>') ) {
                    alt32=115;
                }
                else {
                    alt32=88;}
                }
                break;
            default:
                alt32=84;}

            }
            break;
        case '*':
            {
            int LA32_34 = input.LA(2);

            if ( (LA32_34=='=') ) {
                alt32=104;
            }
            else {
                alt32=85;}
            }
            break;
        case '%':
            {
            int LA32_35 = input.LA(2);

            if ( (LA32_35=='=') ) {
                alt32=105;
            }
            else {
                alt32=86;}
            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=109;
                }
                break;
            case '&':
                {
                alt32=97;
                }
                break;
            default:
                alt32=92;}

            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt32=110;
                }
                break;
            case '|':
                {
                alt32=98;
                }
                break;
            default:
                alt32=93;}

            }
            break;
        case '^':
            {
            int LA32_38 = input.LA(2);

            if ( (LA32_38=='=') ) {
                alt32=111;
            }
            else {
                alt32=94;}
            }
            break;
        case '~':
            {
            alt32=96;
            }
            break;
        case '?':
            {
            int LA32_40 = input.LA(2);

            if ( (LA32_40=='>') ) {
                alt32=120;
            }
            else {
                alt32=99;}
            }
            break;
        case ':':
            {
            int LA32_41 = input.LA(2);

            if ( (LA32_41==':') ) {
                alt32=123;
            }
            else {
                alt32=100;}
            }
            break;
        case '/':
            {
            int LA32_42 = input.LA(2);

            if ( (LA32_42=='>') ) {
                int LA32_134 = input.LA(3);

                if ( ((LA32_134>='\u0000' && LA32_134<='\t')||(LA32_134>='\u000B' && LA32_134<='\f')||(LA32_134>='\u000E' && LA32_134<='\u2027')||(LA32_134>='\u202A' && LA32_134<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt32=134;
                }
                else {
                    alt32=117;}
            }
            else if ( (LA32_42=='=') ) {
                int LA32_135 = input.LA(3);

                if ( ((LA32_135>='\u0000' && LA32_135<='\t')||(LA32_135>='\u000B' && LA32_135<='\f')||(LA32_135>='\u000E' && LA32_135<='\u2027')||(LA32_135>='\u202A' && LA32_135<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                    alt32=134;
                }
                else {
                    alt32=113;}
            }
            else if ( (LA32_42=='*') ) {
                alt32=126;
            }
            else if ( (LA32_42=='/') ) {
                alt32=127;
            }
            else if ( ((LA32_42>='\u0000' && LA32_42<='\t')||(LA32_42>='\u000B' && LA32_42<='\f')||(LA32_42>='\u000E' && LA32_42<=')')||(LA32_42>='+' && LA32_42<='.')||(LA32_42>='0' && LA32_42<='<')||(LA32_42>='?' && LA32_42<='\u2027')||(LA32_42>='\u202A' && LA32_42<='\uFFFE')) && ( areRegularExpressionsEnabled() )) {
                alt32=134;
            }
            else {
                alt32=112;}
            }
            break;
        case '@':
            {
            int LA32_43 = input.LA(2);

            if ( (LA32_43=='$'||(LA32_43>='A' && LA32_43<='Z')||LA32_43=='\\'||LA32_43=='_'||(LA32_43>='a' && LA32_43<='z')) ) {
                alt32=129;
            }
            else {
                alt32=121;}
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
            alt32=124;
            }
            break;
        case '\n':
        case '\r':
        case '\u2028':
        case '\u2029':
            {
            alt32=125;
            }
            break;
        case '0':
            {
            switch ( input.LA(2) ) {
            case 'X':
            case 'x':
                {
                alt32=132;
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
                alt32=131;
                }
                break;
            default:
                alt32=130;}

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
            alt32=130;
            }
            break;
        case '\"':
        case '\'':
            {
            alt32=133;
            }
            break;
        default:
            alt32=128;}

        switch (alt32) {
            case 1 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:10: NULL
                {
                mNULL(); 

                }
                break;
            case 2 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:15: TRUE
                {
                mTRUE(); 

                }
                break;
            case 3 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:20: FALSE
                {
                mFALSE(); 

                }
                break;
            case 4 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:26: BREAK
                {
                mBREAK(); 

                }
                break;
            case 5 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:32: CASE
                {
                mCASE(); 

                }
                break;
            case 6 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:37: CATCH
                {
                mCATCH(); 

                }
                break;
            case 7 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:43: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 8 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:52: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 9 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:60: DELETE
                {
                mDELETE(); 

                }
                break;
            case 10 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:67: DO
                {
                mDO(); 

                }
                break;
            case 11 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:70: ELSE
                {
                mELSE(); 

                }
                break;
            case 12 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:75: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 13 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:83: FOR
                {
                mFOR(); 

                }
                break;
            case 14 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:87: EACH
                {
                mEACH(); 

                }
                break;
            case 15 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:92: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 16 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:101: IF
                {
                mIF(); 

                }
                break;
            case 17 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:104: IN
                {
                mIN(); 

                }
                break;
            case 18 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:107: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 19 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:118: NEW
                {
                mNEW(); 

                }
                break;
            case 20 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:122: RETURN
                {
                mRETURN(); 

                }
                break;
            case 21 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:129: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 22 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:136: THIS
                {
                mTHIS(); 

                }
                break;
            case 23 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:141: THROW
                {
                mTHROW(); 

                }
                break;
            case 24 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:147: TRY
                {
                mTRY(); 

                }
                break;
            case 25 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:151: TYPEOF
                {
                mTYPEOF(); 

                }
                break;
            case 26 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:158: VAR
                {
                mVAR(); 

                }
                break;
            case 27 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:162: VOID
                {
                mVOID(); 

                }
                break;
            case 28 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:167: WHILE
                {
                mWHILE(); 

                }
                break;
            case 29 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:173: WITH
                {
                mWITH(); 

                }
                break;
            case 30 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:178: GET
                {
                mGET(); 

                }
                break;
            case 31 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:182: SET
                {
                mSET(); 

                }
                break;
            case 32 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:186: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 33 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:195: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 34 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:203: BYTE
                {
                mBYTE(); 

                }
                break;
            case 35 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:208: CHAR
                {
                mCHAR(); 

                }
                break;
            case 36 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:213: CLASS
                {
                mCLASS(); 

                }
                break;
            case 37 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:219: CONST
                {
                mCONST(); 

                }
                break;
            case 38 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:225: DEBUGGER
                {
                mDEBUGGER(); 

                }
                break;
            case 39 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:234: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 40 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:241: ENUM
                {
                mENUM(); 

                }
                break;
            case 41 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:246: EXPORT
                {
                mEXPORT(); 

                }
                break;
            case 42 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:253: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 43 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:261: FINAL
                {
                mFINAL(); 

                }
                break;
            case 44 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:267: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 45 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:273: GOTO
                {
                mGOTO(); 

                }
                break;
            case 46 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:278: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 47 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:289: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 48 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:296: INT
                {
                mINT(); 

                }
                break;
            case 49 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:300: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 50 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:310: LONG
                {
                mLONG(); 

                }
                break;
            case 51 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:315: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 52 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:322: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 53 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:330: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 54 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:338: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 55 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:348: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 56 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:355: SHORT
                {
                mSHORT(); 

                }
                break;
            case 57 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:361: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 58 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:368: SUPER
                {
                mSUPER(); 

                }
                break;
            case 59 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:374: SYNCHRONIZED
                {
                mSYNCHRONIZED(); 

                }
                break;
            case 60 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:387: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 61 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:394: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 62 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:404: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 63 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:413: CDATA
                {
                mCDATA(); 

                }
                break;
            case 64 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:419: WXML
                {
                mWXML(); 

                }
                break;
            case 65 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:424: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 66 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:434: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 67 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:441: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 68 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:448: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 69 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:455: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 70 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:462: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 71 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:469: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 72 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:476: DOT
                {
                mDOT(); 

                }
                break;
            case 73 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:480: SEMIC
                {
                mSEMIC(); 

                }
                break;
            case 74 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:486: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 75 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:492: LT
                {
                mLT(); 

                }
                break;
            case 76 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:495: GT
                {
                mGT(); 

                }
                break;
            case 77 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:498: LTE
                {
                mLTE(); 

                }
                break;
            case 78 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:502: GTE
                {
                mGTE(); 

                }
                break;
            case 79 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:506: EQ
                {
                mEQ(); 

                }
                break;
            case 80 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:509: NEQ
                {
                mNEQ(); 

                }
                break;
            case 81 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:513: SAME
                {
                mSAME(); 

                }
                break;
            case 82 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:518: NSAME
                {
                mNSAME(); 

                }
                break;
            case 83 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:524: ADD
                {
                mADD(); 

                }
                break;
            case 84 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:528: SUB
                {
                mSUB(); 

                }
                break;
            case 85 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:532: MUL
                {
                mMUL(); 

                }
                break;
            case 86 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:536: MOD
                {
                mMOD(); 

                }
                break;
            case 87 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:540: INC
                {
                mINC(); 

                }
                break;
            case 88 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:544: DEC
                {
                mDEC(); 

                }
                break;
            case 89 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:548: SHL
                {
                mSHL(); 

                }
                break;
            case 90 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:552: SHR
                {
                mSHR(); 

                }
                break;
            case 91 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:556: SHU
                {
                mSHU(); 

                }
                break;
            case 92 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:560: AND
                {
                mAND(); 

                }
                break;
            case 93 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:564: OR
                {
                mOR(); 

                }
                break;
            case 94 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:567: XOR
                {
                mXOR(); 

                }
                break;
            case 95 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:571: NOT
                {
                mNOT(); 

                }
                break;
            case 96 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:575: INV
                {
                mINV(); 

                }
                break;
            case 97 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:579: LAND
                {
                mLAND(); 

                }
                break;
            case 98 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:584: LOR
                {
                mLOR(); 

                }
                break;
            case 99 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:588: QUE
                {
                mQUE(); 

                }
                break;
            case 100 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:592: COLON
                {
                mCOLON(); 

                }
                break;
            case 101 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:598: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 102 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:605: ADDASS
                {
                mADDASS(); 

                }
                break;
            case 103 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:612: SUBASS
                {
                mSUBASS(); 

                }
                break;
            case 104 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:619: MULASS
                {
                mMULASS(); 

                }
                break;
            case 105 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:626: MODASS
                {
                mMODASS(); 

                }
                break;
            case 106 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:633: SHLASS
                {
                mSHLASS(); 

                }
                break;
            case 107 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:640: SHRASS
                {
                mSHRASS(); 

                }
                break;
            case 108 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:647: SHUASS
                {
                mSHUASS(); 

                }
                break;
            case 109 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:654: ANDASS
                {
                mANDASS(); 

                }
                break;
            case 110 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:661: ORASS
                {
                mORASS(); 

                }
                break;
            case 111 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:667: XORASS
                {
                mXORASS(); 

                }
                break;
            case 112 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:674: DIV
                {
                mDIV(); 

                }
                break;
            case 113 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:678: DIVASS
                {
                mDIVASS(); 

                }
                break;
            case 114 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:685: XCOPEN
                {
                mXCOPEN(); 

                }
                break;
            case 115 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:692: XCCLOSE
                {
                mXCCLOSE(); 

                }
                break;
            case 116 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:700: XLCLOSE
                {
                mXLCLOSE(); 

                }
                break;
            case 117 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:708: XRCLOSE
                {
                mXRCLOSE(); 

                }
                break;
            case 118 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:716: CDATAOPEN
                {
                mCDATAOPEN(); 

                }
                break;
            case 119 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:726: XHOPEN
                {
                mXHOPEN(); 

                }
                break;
            case 120 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:733: XHCLOSE
                {
                mXHCLOSE(); 

                }
                break;
            case 121 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:741: AT
                {
                mAT(); 

                }
                break;
            case 122 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:744: DOTDOT
                {
                mDOTDOT(); 

                }
                break;
            case 123 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:751: COLONCOLON
                {
                mCOLONCOLON(); 

                }
                break;
            case 124 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:762: WhiteSpace
                {
                mWhiteSpace(); 

                }
                break;
            case 125 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:773: EOL
                {
                mEOL(); 

                }
                break;
            case 126 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:777: MultiLineComment
                {
                mMultiLineComment(); 

                }
                break;
            case 127 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:794: SingleLineComment
                {
                mSingleLineComment(); 

                }
                break;
            case 128 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:812: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 129 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:823: XmlAttribute
                {
                mXmlAttribute(); 

                }
                break;
            case 130 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:836: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 131 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:851: OctalIntegerLiteral
                {
                mOctalIntegerLiteral(); 

                }
                break;
            case 132 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:871: HexIntegerLiteral
                {
                mHexIntegerLiteral(); 

                }
                break;
            case 133 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:889: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 134 :
                // /home/bell/workspace.js.patch.test/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:903: RegularExpressionLiteral
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
            return "825:1: DecimalLiteral : ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? );";
        }
    }
 

}
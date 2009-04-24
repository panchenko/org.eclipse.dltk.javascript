// $ANTLR 3.0.1 /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g 2009-04-16 12:58:55

package org.eclipse.dltk.javascript.parser;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

public class JSLexer extends Lexer {
	public static final int PACKAGE = 55;
	public static final int FUNCTION = 18;
	public static final int LOR = 98;
	public static final int VT = 137;
	public static final int SHR = 90;
	public static final int RegularExpressionChar = 173;
	public static final int LT = 75;
	public static final int WHILE = 31;
	public static final int MOD = 86;
	public static final int SHL = 89;
	public static final int CONST = 40;
	public static final int BackslashSequence = 171;
	public static final int LS = 145;
	public static final int CASE = 8;
	public static final int CHAR = 38;
	public static final int NEW = 22;
	public static final int DO = 13;
	public static final int DQUOTE = 134;
	public static final int NOT = 95;
	public static final int DecimalDigit = 155;
	public static final int BYFIELD = 117;
	public static final int EOF = -1;
	public static final int BREAK = 7;
	public static final int CEXPR = 120;
	public static final int DIVASS = 113;
	public static final int Identifier = 151;
	public static final int BYINDEX = 118;
	public static final int INC = 87;
	public static final int RPAREN = 69;
	public static final int FINAL = 46;
	public static final int FORSTEP = 123;
	public static final int IMPORT = 50;
	public static final int EOL = 148;
	public static final int POS = 132;
	public static final int OctalDigit = 159;
	public static final int RETURN = 23;
	public static final int THIS = 25;
	public static final int DOUBLE = 42;
	public static final int ARGS = 114;
	public static final int ExponentPart = 160;
	public static final int GET = 33;
	public static final int WhiteSpace = 142;
	public static final int VAR = 29;
	public static final int VOID = 30;
	public static final int EXPORT = 44;
	public static final int LABELLED = 125;
	public static final int EACH = 17;
	public static final int SUPER = 61;
	public static final int GOTO = 48;
	public static final int EQ = 79;
	public static final int XORASS = 111;
	public static final int ADDASS = 102;
	public static final int ARRAY = 115;
	public static final int SHU = 91;
	public static final int RBRACK = 71;
	public static final int RBRACE = 67;
	public static final int PRIVATE = 56;
	public static final int STATIC = 60;
	public static final int INV = 96;
	public static final int SWITCH = 24;
	public static final int NULL = 4;
	public static final int ELSE = 14;
	public static final int NATIVE = 54;
	public static final int THROWS = 63;
	public static final int INT = 51;
	public static final int DELETE = 12;
	public static final int MUL = 85;
	public static final int IdentifierStartASCII = 154;
	public static final int TRY = 27;
	public static final int FF = 138;
	public static final int SHLASS = 106;
	public static final int OctalEscapeSequence = 167;
	public static final int USP = 141;
	public static final int RegularExpressionFirstChar = 172;
	public static final int ANDASS = 109;
	public static final int TYPEOF = 28;
	public static final int IdentifierNameASCIIStart = 157;
	public static final int QUE = 99;
	public static final int OR = 93;
	public static final int DEBUGGER = 41;
	public static final int GT = 76;
	public static final int PDEC = 130;
	public static final int CALL = 119;
	public static final int CharacterEscapeSequence = 165;
	public static final int CATCH = 9;
	public static final int FALSE = 6;
	public static final int EscapeSequence = 170;
	public static final int LAND = 97;
	public static final int THROW = 26;
	public static final int MULASS = 104;
	public static final int PINC = 131;
	public static final int DEC = 88;
	public static final int PROTECTED = 57;
	public static final int OctalIntegerLiteral = 163;
	public static final int CLASS = 39;
	public static final int LBRACK = 70;
	public static final int ORASS = 110;
	public static final int HexEscapeSequence = 168;
	public static final int NAMEDVALUE = 126;
	public static final int SingleLineComment = 150;
	public static final int GTE = 78;
	public static final int LBRACE = 66;
	public static final int FOR = 16;
	public static final int SUB = 84;
	public static final int RegularExpressionLiteral = 158;
	public static final int FLOAT = 47;
	public static final int ABSTRACT = 35;
	public static final int AND = 92;
	public static final int DecimalIntegerLiteral = 161;
	public static final int LTE = 77;
	public static final int HexDigit = 153;
	public static final int LPAREN = 68;
	public static final int IF = 19;
	public static final int SUBASS = 103;
	public static final int SYNCHRONIZED = 62;
	public static final int BOOLEAN = 36;
	public static final int EXPR = 121;
	public static final int IN = 20;
	public static final int IMPLEMENTS = 49;
	public static final int CONTINUE = 10;
	public static final int OBJECT = 128;
	public static final int COMMA = 74;
	public static final int TRANSIENT = 64;
	public static final int FORITER = 122;
	public static final int MODASS = 105;
	public static final int SHRASS = 107;
	public static final int PS = 146;
	public static final int DOT = 72;
	public static final int MultiLineComment = 149;
	public static final int IdentifierPart = 156;
	public static final int WITH = 32;
	public static final int ADD = 83;
	public static final int BYTE = 37;
	public static final int XOR = 94;
	public static final int ZeroToThree = 166;
	public static final int VOLATILE = 65;
	public static final int ITEM = 124;
	public static final int UnicodeEscapeSequence = 169;
	public static final int NSAME = 82;
	public static final int DEFAULT = 11;
	public static final int SHUASS = 108;
	public static final int TAB = 136;
	public static final int SHORT = 59;
	public static final int SET = 34;
	public static final int INSTANCEOF = 21;
	public static final int SQUOTE = 135;
	public static final int Tokens = 174;
	public static final int DecimalLiteral = 162;
	public static final int TRUE = 5;
	public static final int SAME = 81;
	public static final int COLON = 100;
	public static final int StringLiteral = 152;
	public static final int NEQ = 80;
	public static final int PAREXPR = 129;
	public static final int ENUM = 43;
	public static final int FINALLY = 15;
	public static final int NBSP = 140;
	public static final int HexIntegerLiteral = 164;
	public static final int SP = 139;
	public static final int BLOCK = 116;
	public static final int NEG = 127;
	public static final int LineTerminator = 147;
	public static final int ASSIGN = 101;
	public static final int INTERFACE = 52;
	public static final int DIV = 112;
	public static final int SEMIC = 73;
	public static final int LONG = 53;
	public static final int CR = 144;
	public static final int PUBLIC = 58;
	public static final int EXTENDS = 45;
	public static final int BSLASH = 133;
	public static final int LF = 143;

	private Token last;

	private final boolean areRegularExpressionsEnabled() {
		if (last == null) {
			return true;
		}
		switch (last.getType()) {
		// identifier
		case Identifier:
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

	private final void consumeIdentifierUnicodeStart()
			throws RecognitionException, NoViableAltException {
		int ch = input.LA(1);
		if (isIdentifierStartUnicode(ch)) {
			matchAny();
			do {
				ch = input.LA(1);
				if (ch == '$' || (ch >= '0' && ch <= '9')
						|| (ch >= 'A' && ch <= 'Z') || ch == '\\' || ch == '_'
						|| (ch >= 'a' && ch <= 'z')
						|| isIdentifierPartUnicode(ch)) {
					mIdentifierPart();
				} else {
					return;
				}
			} while (true);
		} else {
			throw new NoViableAltException();
		}
	}

	private final boolean isIdentifierPartUnicode(int ch) {
		return Character.isJavaIdentifierPart((char) ch);
	}

	private final boolean isIdentifierStartUnicode(int ch) {
		return Character.isJavaIdentifierStart((char) ch);
	}

	public Token nextToken() {
		Token result = super.nextToken();
		if (result.getChannel() == Token.DEFAULT_CHANNEL) {
			last = result;
		}
		return result;
	}

	public JSLexer() {
		;
	}

	public JSLexer(CharStream input) {
		super(input);
	}

	public String getGrammarFileName() {
		return "/home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g";
	}

	// $ANTLR start NULL
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:89:6:
			// ( 'null' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:89:8:
			// 'null'
			{
				match("null");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NULL

	// $ANTLR start TRUE
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:90:6:
			// ( 'true' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:90:8:
			// 'true'
			{
				match("true");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end TRUE

	// $ANTLR start FALSE
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:91:7:
			// ( 'false' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:91:9:
			// 'false'
			{
				match("false");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end FALSE

	// $ANTLR start BREAK
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:92:7:
			// ( 'break' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:92:9:
			// 'break'
			{
				match("break");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end BREAK

	// $ANTLR start CASE
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:93:6:
			// ( 'case' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:93:8:
			// 'case'
			{
				match("case");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CASE

	// $ANTLR start CATCH
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:94:7:
			// ( 'catch' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:94:9:
			// 'catch'
			{
				match("catch");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CATCH

	// $ANTLR start CONTINUE
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:95:10:
			// ( 'continue' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:95:12:
			// 'continue'
			{
				match("continue");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CONTINUE

	// $ANTLR start DEFAULT
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:96:9:
			// ( 'default' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:96:11:
			// 'default'
			{
				match("default");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DEFAULT

	// $ANTLR start DELETE
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:97:8:
			// ( 'delete' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:97:10:
			// 'delete'
			{
				match("delete");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DELETE

	// $ANTLR start DO
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:98:4:
			// ( 'do' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:98:6:
			// 'do'
			{
				match("do");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DO

	// $ANTLR start ELSE
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:99:6:
			// ( 'else' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:99:8:
			// 'else'
			{
				match("else");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ELSE

	// $ANTLR start FINALLY
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:100:9:
			// ( 'finally' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:100:11:
			// 'finally'
			{
				match("finally");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end FINALLY

	// $ANTLR start FOR
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:101:5:
			// ( 'for' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:101:7:
			// 'for'
			{
				match("for");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end FOR

	// $ANTLR start EACH
	public final void mEACH() throws RecognitionException {
		try {
			int _type = EACH;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:102:6:
			// ( 'each' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:102:8:
			// 'each'
			{
				match("each");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end EACH

	// $ANTLR start FUNCTION
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:103:10:
			// ( 'function' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:103:12:
			// 'function'
			{
				match("function");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end FUNCTION

	// $ANTLR start IF
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:104:4:
			// ( 'if' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:104:6:
			// 'if'
			{
				match("if");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end IF

	// $ANTLR start IN
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:105:4:
			// ( 'in' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:105:6:
			// 'in'
			{
				match("in");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end IN

	// $ANTLR start INSTANCEOF
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:106:12:
			// ( 'instanceof' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:106:14:
			// 'instanceof'
			{
				match("instanceof");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end INSTANCEOF

	// $ANTLR start NEW
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:107:5:
			// ( 'new' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:107:7:
			// 'new'
			{
				match("new");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NEW

	// $ANTLR start RETURN
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:108:8:
			// ( 'return' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:108:10:
			// 'return'
			{
				match("return");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RETURN

	// $ANTLR start SWITCH
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:109:8:
			// ( 'switch' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:109:10:
			// 'switch'
			{
				match("switch");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SWITCH

	// $ANTLR start THIS
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:110:6:
			// ( 'this' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:110:8:
			// 'this'
			{
				match("this");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end THIS

	// $ANTLR start THROW
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:111:7:
			// ( 'throw' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:111:9:
			// 'throw'
			{
				match("throw");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end THROW

	// $ANTLR start TRY
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:112:5:
			// ( 'try' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:112:7:
			// 'try'
			{
				match("try");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end TRY

	// $ANTLR start TYPEOF
	public final void mTYPEOF() throws RecognitionException {
		try {
			int _type = TYPEOF;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:113:8:
			// ( 'typeof' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:113:10:
			// 'typeof'
			{
				match("typeof");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end TYPEOF

	// $ANTLR start VAR
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:114:5:
			// ( 'var' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:114:7:
			// 'var'
			{
				match("var");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end VAR

	// $ANTLR start VOID
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:115:6:
			// ( 'void' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:115:8:
			// 'void'
			{
				match("void");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end VOID

	// $ANTLR start WHILE
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:116:7:
			// ( 'while' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:116:9:
			// 'while'
			{
				match("while");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end WHILE

	// $ANTLR start WITH
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:117:6:
			// ( 'with' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:117:8:
			// 'with'
			{
				match("with");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end WITH

	// $ANTLR start GET
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:118:5:
			// ( 'get' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:118:7:
			// 'get'
			{
				match("get");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end GET

	// $ANTLR start SET
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:119:5:
			// ( 'set' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:119:7:
			// 'set'
			{
				match("set");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SET

	// $ANTLR start ABSTRACT
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:120:10:
			// ( 'abstract' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:120:12:
			// 'abstract'
			{
				match("abstract");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ABSTRACT

	// $ANTLR start BOOLEAN
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:121:9:
			// ( 'boolean' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:121:11:
			// 'boolean'
			{
				match("boolean");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end BOOLEAN

	// $ANTLR start BYTE
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:122:6:
			// ( 'byte' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:122:8:
			// 'byte'
			{
				match("byte");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end BYTE

	// $ANTLR start CHAR
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:123:6:
			// ( 'char' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:123:8:
			// 'char'
			{
				match("char");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CHAR

	// $ANTLR start CLASS
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:124:7:
			// ( 'class' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:124:9:
			// 'class'
			{
				match("class");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CLASS

	// $ANTLR start CONST
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:125:7:
			// ( 'const' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:125:9:
			// 'const'
			{
				match("const");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CONST

	// $ANTLR start DEBUGGER
	public final void mDEBUGGER() throws RecognitionException {
		try {
			int _type = DEBUGGER;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:126:10:
			// ( 'debugger' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:126:12:
			// 'debugger'
			{
				match("debugger");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DEBUGGER

	// $ANTLR start DOUBLE
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:127:8:
			// ( 'double' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:127:10:
			// 'double'
			{
				match("double");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DOUBLE

	// $ANTLR start ENUM
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:128:6:
			// ( 'enum' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:128:8:
			// 'enum'
			{
				match("enum");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ENUM

	// $ANTLR start EXPORT
	public final void mEXPORT() throws RecognitionException {
		try {
			int _type = EXPORT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:129:8:
			// ( 'export' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:129:10:
			// 'export'
			{
				match("export");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end EXPORT

	// $ANTLR start EXTENDS
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:130:9:
			// ( 'extends' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:130:11:
			// 'extends'
			{
				match("extends");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end EXTENDS

	// $ANTLR start FINAL
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:131:7:
			// ( 'final' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:131:9:
			// 'final'
			{
				match("final");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end FINAL

	// $ANTLR start FLOAT
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:132:7:
			// ( 'float' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:132:9:
			// 'float'
			{
				match("float");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end FLOAT

	// $ANTLR start GOTO
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:133:6:
			// ( 'goto' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:133:8:
			// 'goto'
			{
				match("goto");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end GOTO

	// $ANTLR start IMPLEMENTS
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:134:12:
			// ( 'implements' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:134:14:
			// 'implements'
			{
				match("implements");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end IMPLEMENTS

	// $ANTLR start IMPORT
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:135:8:
			// ( 'import' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:135:10:
			// 'import'
			{
				match("import");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end IMPORT

	// $ANTLR start INT
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:136:5:
			// ( 'int' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:136:7:
			// 'int'
			{
				match("int");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end INT

	// $ANTLR start INTERFACE
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:137:11:
			// ( 'interface' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:137:13:
			// 'interface'
			{
				match("interface");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end INTERFACE

	// $ANTLR start LONG
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:138:6:
			// ( 'long' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:138:8:
			// 'long'
			{
				match("long");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LONG

	// $ANTLR start NATIVE
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:139:8:
			// ( 'native' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:139:10:
			// 'native'
			{
				match("native");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NATIVE

	// $ANTLR start PACKAGE
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:140:9:
			// ( 'package' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:140:11:
			// 'package'
			{
				match("package");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end PACKAGE

	// $ANTLR start PRIVATE
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:141:9:
			// ( 'private' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:141:11:
			// 'private'
			{
				match("private");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end PRIVATE

	// $ANTLR start PROTECTED
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:142:11:
			// ( 'protected' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:142:13:
			// 'protected'
			{
				match("protected");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end PROTECTED

	// $ANTLR start PUBLIC
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:143:8:
			// ( 'public' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:143:10:
			// 'public'
			{
				match("public");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end PUBLIC

	// $ANTLR start SHORT
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:144:7:
			// ( 'short' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:144:9:
			// 'short'
			{
				match("short");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHORT

	// $ANTLR start STATIC
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:145:8:
			// ( 'static' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:145:10:
			// 'static'
			{
				match("static");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end STATIC

	// $ANTLR start SUPER
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:146:7:
			// ( 'super' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:146:9:
			// 'super'
			{
				match("super");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SUPER

	// $ANTLR start SYNCHRONIZED
	public final void mSYNCHRONIZED() throws RecognitionException {
		try {
			int _type = SYNCHRONIZED;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:147:14:
			// ( 'synchronized' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:147:16:
			// 'synchronized'
			{
				match("synchronized");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SYNCHRONIZED

	// $ANTLR start THROWS
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:148:8:
			// ( 'throws' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:148:10:
			// 'throws'
			{
				match("throws");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end THROWS

	// $ANTLR start TRANSIENT
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:149:11:
			// ( 'transient' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:149:13:
			// 'transient'
			{
				match("transient");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end TRANSIENT

	// $ANTLR start VOLATILE
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:150:10:
			// ( 'volatile' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:150:12:
			// 'volatile'
			{
				match("volatile");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end VOLATILE

	// $ANTLR start LBRACE
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:151:8:
			// ( '{' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:151:10:
			// '{'
			{
				match('{');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LBRACE

	// $ANTLR start RBRACE
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:152:8:
			// ( '}' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:152:10:
			// '}'
			{
				match('}');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RBRACE

	// $ANTLR start LPAREN
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:153:8:
			// ( '(' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:153:10:
			// '('
			{
				match('(');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LPAREN

	// $ANTLR start RPAREN
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:154:8:
			// ( ')' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:154:10:
			// ')'
			{
				match(')');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RPAREN

	// $ANTLR start LBRACK
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:155:8:
			// ( '[' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:155:10:
			// '['
			{
				match('[');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LBRACK

	// $ANTLR start RBRACK
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:156:8:
			// ( ']' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:156:10:
			// ']'
			{
				match(']');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RBRACK

	// $ANTLR start DOT
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:157:5:
			// ( '.' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:157:7:
			// '.'
			{
				match('.');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DOT

	// $ANTLR start SEMIC
	public final void mSEMIC() throws RecognitionException {
		try {
			int _type = SEMIC;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:158:7:
			// ( ';' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:158:9:
			// ';'
			{
				match(';');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SEMIC

	// $ANTLR start COMMA
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:159:7:
			// ( ',' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:159:9:
			// ','
			{
				match(',');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end COMMA

	// $ANTLR start LT
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:160:4:
			// ( '<' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:160:6:
			// '<'
			{
				match('<');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LT

	// $ANTLR start GT
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:161:4:
			// ( '>' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:161:6:
			// '>'
			{
				match('>');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end GT

	// $ANTLR start LTE
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:162:5:
			// ( '<=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:162:7:
			// '<='
			{
				match("<=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LTE

	// $ANTLR start GTE
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:163:5:
			// ( '>=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:163:7:
			// '>='
			{
				match(">=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end GTE

	// $ANTLR start EQ
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:164:4:
			// ( '==' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:164:6:
			// '=='
			{
				match("==");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end EQ

	// $ANTLR start NEQ
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:165:5:
			// ( '!=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:165:7:
			// '!='
			{
				match("!=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NEQ

	// $ANTLR start SAME
	public final void mSAME() throws RecognitionException {
		try {
			int _type = SAME;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:166:6:
			// ( '===' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:166:8:
			// '==='
			{
				match("===");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SAME

	// $ANTLR start NSAME
	public final void mNSAME() throws RecognitionException {
		try {
			int _type = NSAME;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:167:7:
			// ( '!==' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:167:9:
			// '!=='
			{
				match("!==");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NSAME

	// $ANTLR start ADD
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:168:5:
			// ( '+' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:168:7:
			// '+'
			{
				match('+');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ADD

	// $ANTLR start SUB
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:169:5:
			// ( '-' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:169:7:
			// '-'
			{
				match('-');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SUB

	// $ANTLR start MUL
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:170:5:
			// ( '*' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:170:7:
			// '*'
			{
				match('*');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end MUL

	// $ANTLR start MOD
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:171:5:
			// ( '%' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:171:7:
			// '%'
			{
				match('%');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end MOD

	// $ANTLR start INC
	public final void mINC() throws RecognitionException {
		try {
			int _type = INC;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:172:5:
			// ( '++' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:172:7:
			// '++'
			{
				match("++");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end INC

	// $ANTLR start DEC
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:173:5:
			// ( '--' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:173:7:
			// '--'
			{
				match("--");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DEC

	// $ANTLR start SHL
	public final void mSHL() throws RecognitionException {
		try {
			int _type = SHL;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:174:5:
			// ( '<<' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:174:7:
			// '<<'
			{
				match("<<");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHL

	// $ANTLR start SHR
	public final void mSHR() throws RecognitionException {
		try {
			int _type = SHR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:175:5:
			// ( '>>' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:175:7:
			// '>>'
			{
				match(">>");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHR

	// $ANTLR start SHU
	public final void mSHU() throws RecognitionException {
		try {
			int _type = SHU;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:176:5:
			// ( '>>>' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:176:7:
			// '>>>'
			{
				match(">>>");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHU

	// $ANTLR start AND
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:177:5:
			// ( '&' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:177:7:
			// '&'
			{
				match('&');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end AND

	// $ANTLR start OR
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:178:4:
			// ( '|' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:178:6:
			// '|'
			{
				match('|');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end OR

	// $ANTLR start XOR
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:179:5:
			// ( '^' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:179:7:
			// '^'
			{
				match('^');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end XOR

	// $ANTLR start NOT
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:180:5:
			// ( '!' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:180:7:
			// '!'
			{
				match('!');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NOT

	// $ANTLR start INV
	public final void mINV() throws RecognitionException {
		try {
			int _type = INV;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:181:5:
			// ( '~' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:181:7:
			// '~'
			{
				match('~');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end INV

	// $ANTLR start LAND
	public final void mLAND() throws RecognitionException {
		try {
			int _type = LAND;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:182:6:
			// ( '&&' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:182:8:
			// '&&'
			{
				match("&&");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LAND

	// $ANTLR start LOR
	public final void mLOR() throws RecognitionException {
		try {
			int _type = LOR;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:183:5:
			// ( '||' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:183:7:
			// '||'
			{
				match("||");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LOR

	// $ANTLR start QUE
	public final void mQUE() throws RecognitionException {
		try {
			int _type = QUE;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:184:5:
			// ( '?' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:184:7:
			// '?'
			{
				match('?');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end QUE

	// $ANTLR start COLON
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:185:7:
			// ( ':' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:185:9:
			// ':'
			{
				match(':');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end COLON

	// $ANTLR start ASSIGN
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:186:8:
			// ( '=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:186:10:
			// '='
			{
				match('=');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ASSIGN

	// $ANTLR start ADDASS
	public final void mADDASS() throws RecognitionException {
		try {
			int _type = ADDASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:187:8:
			// ( '+=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:187:10:
			// '+='
			{
				match("+=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ADDASS

	// $ANTLR start SUBASS
	public final void mSUBASS() throws RecognitionException {
		try {
			int _type = SUBASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:188:8:
			// ( '-=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:188:10:
			// '-='
			{
				match("-=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SUBASS

	// $ANTLR start MULASS
	public final void mMULASS() throws RecognitionException {
		try {
			int _type = MULASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:189:8:
			// ( '*=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:189:10:
			// '*='
			{
				match("*=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end MULASS

	// $ANTLR start MODASS
	public final void mMODASS() throws RecognitionException {
		try {
			int _type = MODASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:190:8:
			// ( '%=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:190:10:
			// '%='
			{
				match("%=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end MODASS

	// $ANTLR start SHLASS
	public final void mSHLASS() throws RecognitionException {
		try {
			int _type = SHLASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:191:8:
			// ( '<<=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:191:10:
			// '<<='
			{
				match("<<=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHLASS

	// $ANTLR start SHRASS
	public final void mSHRASS() throws RecognitionException {
		try {
			int _type = SHRASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:192:8:
			// ( '>>=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:192:10:
			// '>>='
			{
				match(">>=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHRASS

	// $ANTLR start SHUASS
	public final void mSHUASS() throws RecognitionException {
		try {
			int _type = SHUASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:193:8:
			// ( '>>>=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:193:10:
			// '>>>='
			{
				match(">>>=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SHUASS

	// $ANTLR start ANDASS
	public final void mANDASS() throws RecognitionException {
		try {
			int _type = ANDASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:194:8:
			// ( '&=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:194:10:
			// '&='
			{
				match("&=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ANDASS

	// $ANTLR start ORASS
	public final void mORASS() throws RecognitionException {
		try {
			int _type = ORASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:195:7:
			// ( '|=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:195:9:
			// '|='
			{
				match("|=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ORASS

	// $ANTLR start XORASS
	public final void mXORASS() throws RecognitionException {
		try {
			int _type = XORASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:196:8:
			// ( '^=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:196:10:
			// '^='
			{
				match("^=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end XORASS

	// $ANTLR start DIV
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:197:5:
			// ( '/' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:197:7:
			// '/'
			{
				match('/');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DIV

	// $ANTLR start DIVASS
	public final void mDIVASS() throws RecognitionException {
		try {
			int _type = DIVASS;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:198:8:
			// ( '/=' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:198:10:
			// '/='
			{
				match("/=");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DIVASS

	// $ANTLR start BSLASH
	public final void mBSLASH() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:380:2:
			// ( '\\\\' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:380:4:
			// '\\\\'
			{
				match('\\');

			}

		} finally {
		}
	}

	// $ANTLR end BSLASH

	// $ANTLR start DQUOTE
	public final void mDQUOTE() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:384:2:
			// ( '\"' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:384:4:
			// '\"'
			{
				match('\"');

			}

		} finally {
		}
	}

	// $ANTLR end DQUOTE

	// $ANTLR start SQUOTE
	public final void mSQUOTE() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:388:2:
			// ( '\\'' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:388:4:
			// '\\''
			{
				match('\'');

			}

		} finally {
		}
	}

	// $ANTLR end SQUOTE

	// $ANTLR start TAB
	public final void mTAB() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:394:2:
			// ( '\ ' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:394:4:
			// '\ '
			{
				match('\t');

			}

		} finally {
		}
	}

	// $ANTLR end TAB

	// $ANTLR start VT
	public final void mVT() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:398:2:
			// ( '\\u000b' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:398:4:
			// '\\u000b'
			{
				match('\u000B');

			}

		} finally {
		}
	}

	// $ANTLR end VT

	// $ANTLR start FF
	public final void mFF() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:402:2:
			// ( '\ ' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:402:4:
			// '\ '
			{
				match('\f');

			}

		} finally {
		}
	}

	// $ANTLR end FF

	// $ANTLR start SP
	public final void mSP() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:406:2:
			// ( '\ ' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:406:4:
			// '\ '
			{
				match(' ');

			}

		} finally {
		}
	}

	// $ANTLR end SP

	// $ANTLR start NBSP
	public final void mNBSP() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:410:2:
			// ( '\\u00a0' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:410:4:
			// '\\u00a0'
			{
				match('\u00A0');

			}

		} finally {
		}
	}

	// $ANTLR end NBSP

	// $ANTLR start USP
	public final void mUSP() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:414:2:
			// ( '\\u1680' | '\\u180E' | '\\u2000' | '\\u2001' | '\\u2002' |
			// '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' |
			// '\\u2008' | '\\u2009' | '\\u200A' | '\\u202F' | '\\u205F' |
			// '\\u3000' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				if (input.LA(1) == '\u1680' || input.LA(1) == '\u180E'
						|| (input.LA(1) >= '\u2000' && input.LA(1) <= '\u200A')
						|| input.LA(1) == '\u202F' || input.LA(1) == '\u205F'
						|| input.LA(1) == '\u3000') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end USP

	// $ANTLR start WhiteSpace
	public final void mWhiteSpace() throws RecognitionException {
		try {
			int _type = WhiteSpace;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:433:2:
			// ( ( TAB | VT | FF | SP | NBSP | USP )+ )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:433:4:
			// ( TAB | VT | FF | SP | NBSP | USP )+
			{
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:433:4:
				// ( TAB | VT | FF | SP | NBSP | USP )+
				int cnt1 = 0;
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == '\t' || (LA1_0 >= '\u000B' && LA1_0 <= '\f')
							|| LA1_0 == ' ' || LA1_0 == '\u00A0'
							|| LA1_0 == '\u1680' || LA1_0 == '\u180E'
							|| (LA1_0 >= '\u2000' && LA1_0 <= '\u200A')
							|| LA1_0 == '\u202F' || LA1_0 == '\u205F' || LA1_0 == '\u3000')) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
					{
						if (input.LA(1) == '\t'
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| input.LA(1) == ' '
								|| input.LA(1) == '\u00A0'
								|| input.LA(1) == '\u1680'
								|| input.LA(1) == '\u180E'
								|| (input.LA(1) >= '\u2000' && input.LA(1) <= '\u200A')
								|| input.LA(1) == '\u202F'
								|| input.LA(1) == '\u205F'
								|| input.LA(1) == '\u3000') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1,
								input);
						throw eee;
					}
					cnt1++;
				} while (true);

				channel = HIDDEN;

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end WhiteSpace

	// $ANTLR start LF
	public final void mLF() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:441:2:
			// ( '\\n' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:441:4:
			// '\\n'
			{
				match('\n');

			}

		} finally {
		}
	}

	// $ANTLR end LF

	// $ANTLR start CR
	public final void mCR() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:445:2:
			// ( '\\r' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:445:4:
			// '\\r'
			{
				match('\r');

			}

		} finally {
		}
	}

	// $ANTLR end CR

	// $ANTLR start LS
	public final void mLS() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:449:2:
			// ( '\\u2028' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:449:4:
			// '\\u2028'
			{
				match('\u2028');

			}

		} finally {
		}
	}

	// $ANTLR end LS

	// $ANTLR start PS
	public final void mPS() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:453:2:
			// ( '\\u2029' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:453:4:
			// '\\u2029'
			{
				match('\u2029');

			}

		} finally {
		}
	}

	// $ANTLR end PS

	// $ANTLR start LineTerminator
	public final void mLineTerminator() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:457:2:
			// ( CR | LF | LS | PS )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				if (input.LA(1) == '\n' || input.LA(1) == '\r'
						|| (input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end LineTerminator

	// $ANTLR start EOL
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:2:
			// ( ( ( CR ( LF )? ) | LF | LS | PS ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:4:
			// ( ( CR ( LF )? ) | LF | LS | PS )
			{
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:4:
				// ( ( CR ( LF )? ) | LF | LS | PS )
				int alt3 = 4;
				switch (input.LA(1)) {
				case '\r': {
					alt3 = 1;
				}
					break;
				case '\n': {
					alt3 = 2;
				}
					break;
				case '\u2028': {
					alt3 = 3;
				}
					break;
				case '\u2029': {
					alt3 = 4;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException(
							"461:4: ( ( CR ( LF )? ) | LF | LS | PS )", 3, 0,
							input);

					throw nvae;
				}

				switch (alt3) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:6:
					// ( CR ( LF )? )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:6:
					// ( CR ( LF )? )
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:8:
					// CR ( LF )?
					{
						mCR();
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:11:
						// ( LF )?
						int alt2 = 2;
						int LA2_0 = input.LA(1);

						if ((LA2_0 == '\n')) {
							alt2 = 1;
						}
						switch (alt2) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:11:
							// LF
						{
							mLF();

						}
							break;

						}

					}

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:19:
					// LF
				{
					mLF();

				}
					break;
				case 3:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:24:
					// LS
				{
					mLS();

				}
					break;
				case 4:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:461:29:
					// PS
				{
					mPS();

				}
					break;

				}

				channel = HIDDEN;

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end EOL

	// $ANTLR start MultiLineComment
	public final void mMultiLineComment() throws RecognitionException {
		try {
			int _type = MultiLineComment;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:468:2:
			// ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:468:4:
			// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:468:9:
				// ( options {greedy=false; } : . )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if ((LA4_0 == '*')) {
						int LA4_1 = input.LA(2);

						if ((LA4_1 == '/')) {
							alt4 = 2;
						} else if (((LA4_1 >= '\u0000' && LA4_1 <= '.') || (LA4_1 >= '0' && LA4_1 <= '\uFFFE'))) {
							alt4 = 1;
						}

					} else if (((LA4_0 >= '\u0000' && LA4_0 <= ')') || (LA4_0 >= '+' && LA4_0 <= '\uFFFE'))) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:468:41:
						// .
					{
						matchAny();

					}
						break;

					default:
						break loop4;
					}
				} while (true);

				match("*/");

				channel = HIDDEN;

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end MultiLineComment

	// $ANTLR start SingleLineComment
	public final void mSingleLineComment() throws RecognitionException {
		try {
			int _type = SingleLineComment;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:472:2:
			// ( '//' (~ ( LineTerminator ) )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:472:4:
			// '//' (~ ( LineTerminator ) )*
			{
				match("//");

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:472:9:
				// (~ ( LineTerminator ) )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if (((LA5_0 >= '\u0000' && LA5_0 <= '\t')
							|| (LA5_0 >= '\u000B' && LA5_0 <= '\f')
							|| (LA5_0 >= '\u000E' && LA5_0 <= '\u2027') || (LA5_0 >= '\u202A' && LA5_0 <= '\uFFFE'))) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:472:11:
						// ~ ( LineTerminator )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\u2027')
								|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop5;
					}
				} while (true);

				channel = HIDDEN;

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SingleLineComment

	// $ANTLR start IdentifierStartASCII
	public final void mIdentifierStartASCII() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:576:2:
			// ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit
			// HexDigit HexDigit HexDigit )
			int alt6 = 5;
			switch (input.LA(1)) {
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
			case 'z': {
				alt6 = 1;
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
			case 'Z': {
				alt6 = 2;
			}
				break;
			case '$': {
				alt6 = 3;
			}
				break;
			case '_': {
				alt6 = 4;
			}
				break;
			case '\\': {
				alt6 = 5;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"575:10: fragment IdentifierStartASCII : ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | BSLASH 'u' HexDigit HexDigit HexDigit HexDigit );",
						6, 0, input);

				throw nvae;
			}

			switch (alt6) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:576:4:
				// 'a' .. 'z'
			{
				matchRange('a', 'z');

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:576:15:
				// 'A' .. 'Z'
			{
				matchRange('A', 'Z');

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:577:4:
				// '$'
			{
				match('$');

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:578:4:
				// '_'
			{
				match('_');

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:579:4:
				// BSLASH 'u' HexDigit HexDigit HexDigit HexDigit
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
		} finally {
		}
	}

	// $ANTLR end IdentifierStartASCII

	// $ANTLR start IdentifierPart
	public final void mIdentifierPart() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:587:2:
			// ( DecimalDigit | IdentifierStartASCII | {...}?)
			int alt7 = 3;
			switch (input.LA(1)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {
				alt7 = 1;
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
			case 'z': {
				alt7 = 2;
			}
				break;
			default:
				alt7 = 3;
			}

			switch (alt7) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:587:4:
				// DecimalDigit
			{
				mDecimalDigit();

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:588:4:
				// IdentifierStartASCII
			{
				mIdentifierStartASCII();

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:589:4:
				// {...}?
			{
				if (!(isIdentifierPartUnicode(input.LA(1)))) {
					throw new FailedPredicateException(input, "IdentifierPart",
							" isIdentifierPartUnicode(input.LA(1)) ");
				}
				matchAny();

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end IdentifierPart

	// $ANTLR start IdentifierNameASCIIStart
	public final void mIdentifierNameASCIIStart() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:593:2:
			// ( IdentifierStartASCII ( IdentifierPart )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:593:4:
			// IdentifierStartASCII ( IdentifierPart )*
			{
				mIdentifierStartASCII();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:593:25:
				// ( IdentifierPart )*
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if ((LA8_0 == '$' || (LA8_0 >= '0' && LA8_0 <= '9')
							|| (LA8_0 >= 'A' && LA8_0 <= 'Z') || LA8_0 == '\\'
							|| LA8_0 == '_' || (LA8_0 >= 'a' && LA8_0 <= 'z'))) {
						alt8 = 1;
					} else if ((isIdentifierPartUnicode(input.LA(1)))) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:593:25:
						// IdentifierPart
					{
						mIdentifierPart();

					}
						break;

					default:
						break loop8;
					}
				} while (true);

			}

		} finally {
		}
	}

	// $ANTLR end IdentifierNameASCIIStart

	// $ANTLR start Identifier
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:605:2:
			// ( IdentifierNameASCIIStart | )
			int alt9 = 2;
			int LA9_0 = input.LA(1);

			if ((LA9_0 == '$' || (LA9_0 >= 'A' && LA9_0 <= 'Z')
					|| LA9_0 == '\\' || LA9_0 == '_' || (LA9_0 >= 'a' && LA9_0 <= 'z'))) {
				alt9 = 1;
			} else {
				alt9 = 2;
			}
			switch (alt9) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:605:4:
				// IdentifierNameASCIIStart
			{
				mIdentifierNameASCIIStart();

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:606:4:
			{
				consumeIdentifierUnicodeStart();

			}
				break;

			}
			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end Identifier

	// $ANTLR start DecimalDigit
	public final void mDecimalDigit() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:689:2:
			// ( '0' .. '9' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:689:4:
			// '0' .. '9'
			{
				matchRange('0', '9');

			}

		} finally {
		}
	}

	// $ANTLR end DecimalDigit

	// $ANTLR start HexDigit
	public final void mHexDigit() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:693:2:
			// ( DecimalDigit | 'a' .. 'f' | 'A' .. 'F' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				if ((input.LA(1) >= '0' && input.LA(1) <= '9')
						|| (input.LA(1) >= 'A' && input.LA(1) <= 'F')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end HexDigit

	// $ANTLR start OctalDigit
	public final void mOctalDigit() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:697:2:
			// ( '0' .. '7' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:697:4:
			// '0' .. '7'
			{
				matchRange('0', '7');

			}

		} finally {
		}
	}

	// $ANTLR end OctalDigit

	// $ANTLR start ExponentPart
	public final void mExponentPart() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:701:2:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+ )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:701:4:
			// ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:701:18:
				// ( '+' | '-' )?
				int alt10 = 2;
				int LA10_0 = input.LA(1);

				if ((LA10_0 == '+' || LA10_0 == '-')) {
					alt10 = 1;
				}
				switch (alt10) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
				{
					if (input.LA(1) == '+' || input.LA(1) == '-') {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}

				}
					break;

				}

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:701:33:
				// ( DecimalDigit )+
				int cnt11 = 0;
				loop11: do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if (((LA11_0 >= '0' && LA11_0 <= '9'))) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:701:33:
						// DecimalDigit
					{
						mDecimalDigit();

					}
						break;

					default:
						if (cnt11 >= 1)
							break loop11;
						EarlyExitException eee = new EarlyExitException(11,
								input);
						throw eee;
					}
					cnt11++;
				} while (true);

			}

		} finally {
		}
	}

	// $ANTLR end ExponentPart

	// $ANTLR start DecimalIntegerLiteral
	public final void mDecimalIntegerLiteral() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:705:2:
			// ( '0' | '1' .. '9' ( DecimalDigit )* )
			int alt13 = 2;
			int LA13_0 = input.LA(1);

			if ((LA13_0 == '0')) {
				alt13 = 1;
			} else if (((LA13_0 >= '1' && LA13_0 <= '9'))) {
				alt13 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"704:10: fragment DecimalIntegerLiteral : ( '0' | '1' .. '9' ( DecimalDigit )* );",
						13, 0, input);

				throw nvae;
			}
			switch (alt13) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:705:4:
				// '0'
			{
				match('0');

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:706:4:
				// '1' .. '9' ( DecimalDigit )*
			{
				matchRange('1', '9');
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:706:13:
				// ( DecimalDigit )*
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if (((LA12_0 >= '0' && LA12_0 <= '9'))) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:706:13:
						// DecimalDigit
					{
						mDecimalDigit();

					}
						break;

					default:
						break loop12;
					}
				} while (true);

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end DecimalIntegerLiteral

	// $ANTLR start DecimalLiteral
	public final void mDecimalLiteral() throws RecognitionException {
		try {
			int _type = DecimalLiteral;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:2:
			// ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? |
			// '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral (
			// ExponentPart )? )
			int alt19 = 3;
			alt19 = dfa19.predict(input);
			switch (alt19) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:4:
				// DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )?
			{
				mDecimalIntegerLiteral();
				match('.');
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:30:
				// ( DecimalDigit )*
				loop14: do {
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if (((LA14_0 >= '0' && LA14_0 <= '9'))) {
						alt14 = 1;
					}

					switch (alt14) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:30:
						// DecimalDigit
					{
						mDecimalDigit();

					}
						break;

					default:
						break loop14;
					}
				} while (true);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:44:
				// ( ExponentPart )?
				int alt15 = 2;
				int LA15_0 = input.LA(1);

				if ((LA15_0 == 'E' || LA15_0 == 'e')) {
					alt15 = 1;
				}
				switch (alt15) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:710:44:
					// ExponentPart
				{
					mExponentPart();

				}
					break;

				}

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:711:4:
				// '.' ( DecimalDigit )+ ( ExponentPart )?
			{
				match('.');
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:711:8:
				// ( DecimalDigit )+
				int cnt16 = 0;
				loop16: do {
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if (((LA16_0 >= '0' && LA16_0 <= '9'))) {
						alt16 = 1;
					}

					switch (alt16) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:711:8:
						// DecimalDigit
					{
						mDecimalDigit();

					}
						break;

					default:
						if (cnt16 >= 1)
							break loop16;
						EarlyExitException eee = new EarlyExitException(16,
								input);
						throw eee;
					}
					cnt16++;
				} while (true);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:711:22:
				// ( ExponentPart )?
				int alt17 = 2;
				int LA17_0 = input.LA(1);

				if ((LA17_0 == 'E' || LA17_0 == 'e')) {
					alt17 = 1;
				}
				switch (alt17) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:711:22:
					// ExponentPart
				{
					mExponentPart();

				}
					break;

				}

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:712:4:
				// DecimalIntegerLiteral ( ExponentPart )?
			{
				mDecimalIntegerLiteral();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:712:26:
				// ( ExponentPart )?
				int alt18 = 2;
				int LA18_0 = input.LA(1);

				if ((LA18_0 == 'E' || LA18_0 == 'e')) {
					alt18 = 1;
				}
				switch (alt18) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:712:26:
					// ExponentPart
				{
					mExponentPart();

				}
					break;

				}

			}
				break;

			}
			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DecimalLiteral

	// $ANTLR start OctalIntegerLiteral
	public final void mOctalIntegerLiteral() throws RecognitionException {
		try {
			int _type = OctalIntegerLiteral;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:716:2:
			// ( '0' ( OctalDigit )+ )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:716:4:
			// '0' ( OctalDigit )+
			{
				match('0');
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:716:8:
				// ( OctalDigit )+
				int cnt20 = 0;
				loop20: do {
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if (((LA20_0 >= '0' && LA20_0 <= '7'))) {
						alt20 = 1;
					}

					switch (alt20) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:716:8:
						// OctalDigit
					{
						mOctalDigit();

					}
						break;

					default:
						if (cnt20 >= 1)
							break loop20;
						EarlyExitException eee = new EarlyExitException(20,
								input);
						throw eee;
					}
					cnt20++;
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end OctalIntegerLiteral

	// $ANTLR start HexIntegerLiteral
	public final void mHexIntegerLiteral() throws RecognitionException {
		try {
			int _type = HexIntegerLiteral;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:2:
			// ( ( '0x' | '0X' ) ( HexDigit )+ )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:4:
			// ( '0x' | '0X' ) ( HexDigit )+
			{
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:4:
				// ( '0x' | '0X' )
				int alt21 = 2;
				int LA21_0 = input.LA(1);

				if ((LA21_0 == '0')) {
					int LA21_1 = input.LA(2);

					if ((LA21_1 == 'x')) {
						alt21 = 1;
					} else if ((LA21_1 == 'X')) {
						alt21 = 2;
					} else {
						NoViableAltException nvae = new NoViableAltException(
								"720:4: ( '0x' | '0X' )", 21, 1, input);

						throw nvae;
					}
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"720:4: ( '0x' | '0X' )", 21, 0, input);

					throw nvae;
				}
				switch (alt21) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:6:
					// '0x'
				{
					match("0x");

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:13:
					// '0X'
				{
					match("0X");

				}
					break;

				}

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:20:
				// ( HexDigit )+
				int cnt22 = 0;
				loop22: do {
					int alt22 = 2;
					int LA22_0 = input.LA(1);

					if (((LA22_0 >= '0' && LA22_0 <= '9')
							|| (LA22_0 >= 'A' && LA22_0 <= 'F') || (LA22_0 >= 'a' && LA22_0 <= 'f'))) {
						alt22 = 1;
					}

					switch (alt22) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:720:20:
						// HexDigit
					{
						mHexDigit();

					}
						break;

					default:
						if (cnt22 >= 1)
							break loop22;
						EarlyExitException eee = new EarlyExitException(22,
								input);
						throw eee;
					}
					cnt22++;
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end HexIntegerLiteral

	// $ANTLR start CharacterEscapeSequence
	public final void mCharacterEscapeSequence() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:739:2:
			// (~ ( DecimalDigit | 'x' | 'u' | LineTerminator ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:739:4:
			// ~ ( DecimalDigit | 'x' | 'u' | LineTerminator )
			{
				if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
						|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
						|| (input.LA(1) >= '\u000E' && input.LA(1) <= '/')
						|| (input.LA(1) >= ':' && input.LA(1) <= 't')
						|| (input.LA(1) >= 'v' && input.LA(1) <= 'w')
						|| (input.LA(1) >= 'y' && input.LA(1) <= '\u2027')
						|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end CharacterEscapeSequence

	// $ANTLR start ZeroToThree
	public final void mZeroToThree() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:743:2:
			// ( '0' .. '3' )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:743:4:
			// '0' .. '3'
			{
				matchRange('0', '3');

			}

		} finally {
		}
	}

	// $ANTLR end ZeroToThree

	// $ANTLR start OctalEscapeSequence
	public final void mOctalEscapeSequence() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:747:2:
			// ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit |
			// ZeroToThree OctalDigit OctalDigit )
			int alt23 = 4;
			int LA23_0 = input.LA(1);

			if (((LA23_0 >= '0' && LA23_0 <= '3'))) {
				int LA23_1 = input.LA(2);

				if (((LA23_1 >= '0' && LA23_1 <= '7'))) {
					int LA23_4 = input.LA(3);

					if (((LA23_4 >= '0' && LA23_4 <= '7'))) {
						alt23 = 4;
					} else {
						alt23 = 2;
					}
				} else {
					alt23 = 1;
				}
			} else if (((LA23_0 >= '4' && LA23_0 <= '7'))) {
				int LA23_2 = input.LA(2);

				if (((LA23_2 >= '0' && LA23_2 <= '7'))) {
					alt23 = 3;
				} else {
					alt23 = 1;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"746:10: fragment OctalEscapeSequence : ( OctalDigit | ZeroToThree OctalDigit | '4' .. '7' OctalDigit | ZeroToThree OctalDigit OctalDigit );",
						23, 0, input);

				throw nvae;
			}
			switch (alt23) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:747:4:
				// OctalDigit
			{
				mOctalDigit();

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:748:4:
				// ZeroToThree OctalDigit
			{
				mZeroToThree();
				mOctalDigit();

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:749:4:
				// '4' .. '7' OctalDigit
			{
				matchRange('4', '7');
				mOctalDigit();

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:750:4:
				// ZeroToThree OctalDigit OctalDigit
			{
				mZeroToThree();
				mOctalDigit();
				mOctalDigit();

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end OctalEscapeSequence

	// $ANTLR start HexEscapeSequence
	public final void mHexEscapeSequence() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:754:2:
			// ( 'x' HexDigit HexDigit )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:754:4:
			// 'x' HexDigit HexDigit
			{
				match('x');
				mHexDigit();
				mHexDigit();

			}

		} finally {
		}
	}

	// $ANTLR end HexEscapeSequence

	// $ANTLR start UnicodeEscapeSequence
	public final void mUnicodeEscapeSequence() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:758:2:
			// ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:758:4:
			// 'u' HexDigit HexDigit HexDigit HexDigit
			{
				match('u');
				mHexDigit();
				mHexDigit();
				mHexDigit();
				mHexDigit();

			}

		} finally {
		}
	}

	// $ANTLR end UnicodeEscapeSequence

	// $ANTLR start EscapeSequence
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:762:2:
			// ( BSLASH ( CharacterEscapeSequence | OctalEscapeSequence |
			// HexEscapeSequence | UnicodeEscapeSequence ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:763:2:
			// BSLASH ( CharacterEscapeSequence | OctalEscapeSequence |
			// HexEscapeSequence | UnicodeEscapeSequence )
			{
				mBSLASH();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:764:2:
				// ( CharacterEscapeSequence | OctalEscapeSequence |
				// HexEscapeSequence | UnicodeEscapeSequence )
				int alt24 = 4;
				int LA24_0 = input.LA(1);

				if (((LA24_0 >= '\u0000' && LA24_0 <= '\t')
						|| (LA24_0 >= '\u000B' && LA24_0 <= '\f')
						|| (LA24_0 >= '\u000E' && LA24_0 <= '/')
						|| (LA24_0 >= ':' && LA24_0 <= 't')
						|| (LA24_0 >= 'v' && LA24_0 <= 'w')
						|| (LA24_0 >= 'y' && LA24_0 <= '\u2027') || (LA24_0 >= '\u202A' && LA24_0 <= '\uFFFE'))) {
					alt24 = 1;
				} else if (((LA24_0 >= '0' && LA24_0 <= '7'))) {
					alt24 = 2;
				} else if ((LA24_0 == 'x')) {
					alt24 = 3;
				} else if ((LA24_0 == 'u')) {
					alt24 = 4;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"764:2: ( CharacterEscapeSequence | OctalEscapeSequence | HexEscapeSequence | UnicodeEscapeSequence )",
							24, 0, input);

					throw nvae;
				}
				switch (alt24) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:765:3:
					// CharacterEscapeSequence
				{
					mCharacterEscapeSequence();

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:766:5:
					// OctalEscapeSequence
				{
					mOctalEscapeSequence();

				}
					break;
				case 3:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:767:5:
					// HexEscapeSequence
				{
					mHexEscapeSequence();

				}
					break;
				case 4:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:768:5:
					// UnicodeEscapeSequence
				{
					mUnicodeEscapeSequence();

				}
					break;

				}

			}

		} finally {
		}
	}

	// $ANTLR end EscapeSequence

	// $ANTLR start StringLiteral
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:773:2:
			// ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence
			// )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) |
			// EscapeSequence )* DQUOTE )
			int alt27 = 2;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == '\'')) {
				alt27 = 1;
			} else if ((LA27_0 == '\"')) {
				alt27 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"772:1: StringLiteral : ( SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE | DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE );",
						27, 0, input);

				throw nvae;
			}
			switch (alt27) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:773:4:
				// SQUOTE (~ ( SQUOTE | BSLASH | LineTerminator ) |
				// EscapeSequence )* SQUOTE
			{
				mSQUOTE();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:773:11:
				// (~ ( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )*
				loop25: do {
					int alt25 = 3;
					int LA25_0 = input.LA(1);

					if (((LA25_0 >= '\u0000' && LA25_0 <= '\t')
							|| (LA25_0 >= '\u000B' && LA25_0 <= '\f')
							|| (LA25_0 >= '\u000E' && LA25_0 <= '&')
							|| (LA25_0 >= '(' && LA25_0 <= '[')
							|| (LA25_0 >= ']' && LA25_0 <= '\u2027') || (LA25_0 >= '\u202A' && LA25_0 <= '\uFFFE'))) {
						alt25 = 1;
					} else if ((LA25_0 == '\\')) {
						alt25 = 2;
					}

					switch (alt25) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:773:13:
						// ~ ( SQUOTE | BSLASH | LineTerminator )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '&')
								|| (input.LA(1) >= '(' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\u2027')
								|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;
					case 2:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:773:53:
						// EscapeSequence
					{
						mEscapeSequence();

					}
						break;

					default:
						break loop25;
					}
				} while (true);

				mSQUOTE();

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:774:4:
				// DQUOTE (~ ( DQUOTE | BSLASH | LineTerminator ) |
				// EscapeSequence )* DQUOTE
			{
				mDQUOTE();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:774:11:
				// (~ ( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )*
				loop26: do {
					int alt26 = 3;
					int LA26_0 = input.LA(1);

					if (((LA26_0 >= '\u0000' && LA26_0 <= '\t')
							|| (LA26_0 >= '\u000B' && LA26_0 <= '\f')
							|| (LA26_0 >= '\u000E' && LA26_0 <= '!')
							|| (LA26_0 >= '#' && LA26_0 <= '[')
							|| (LA26_0 >= ']' && LA26_0 <= '\u2027') || (LA26_0 >= '\u202A' && LA26_0 <= '\uFFFE'))) {
						alt26 = 1;
					} else if ((LA26_0 == '\\')) {
						alt26 = 2;
					}

					switch (alt26) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:774:13:
						// ~ ( DQUOTE | BSLASH | LineTerminator )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '!')
								|| (input.LA(1) >= '#' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\u2027')
								|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;
					case 2:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:774:53:
						// EscapeSequence
					{
						mEscapeSequence();

					}
						break;

					default:
						break loop26;
					}
				} while (true);

				mDQUOTE();

			}
				break;

			}
			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end StringLiteral

	// $ANTLR start BackslashSequence
	public final void mBackslashSequence() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:782:2:
			// ( BSLASH ~ ( LineTerminator ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:782:4:
			// BSLASH ~ ( LineTerminator )
			{
				mBSLASH();
				if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
						|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
						|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\u2027')
						|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end BackslashSequence

	// $ANTLR start RegularExpressionFirstChar
	public final void mRegularExpressionFirstChar() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:786:2:
			// (~ ( LineTerminator | MUL | BSLASH | DIV ) | BackslashSequence )
			int alt28 = 2;
			int LA28_0 = input.LA(1);

			if (((LA28_0 >= '\u0000' && LA28_0 <= '\t')
					|| (LA28_0 >= '\u000B' && LA28_0 <= '\f')
					|| (LA28_0 >= '\u000E' && LA28_0 <= ')')
					|| (LA28_0 >= '+' && LA28_0 <= '.')
					|| (LA28_0 >= '0' && LA28_0 <= '[')
					|| (LA28_0 >= ']' && LA28_0 <= '\u2027') || (LA28_0 >= '\u202A' && LA28_0 <= '\uFFFE'))) {
				alt28 = 1;
			} else if ((LA28_0 == '\\')) {
				alt28 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"785:10: fragment RegularExpressionFirstChar : (~ ( LineTerminator | MUL | BSLASH | DIV ) | BackslashSequence );",
						28, 0, input);

				throw nvae;
			}
			switch (alt28) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:786:4:
				// ~ ( LineTerminator | MUL | BSLASH | DIV )
			{
				if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
						|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
						|| (input.LA(1) >= '\u000E' && input.LA(1) <= ')')
						|| (input.LA(1) >= '+' && input.LA(1) <= '.')
						|| (input.LA(1) >= '0' && input.LA(1) <= '[')
						|| (input.LA(1) >= ']' && input.LA(1) <= '\u2027')
						|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:787:4:
				// BackslashSequence
			{
				mBackslashSequence();

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end RegularExpressionFirstChar

	// $ANTLR start RegularExpressionChar
	public final void mRegularExpressionChar() throws RecognitionException {
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:791:2:
			// (~ ( LineTerminator | BSLASH | DIV ) | BackslashSequence )
			int alt29 = 2;
			int LA29_0 = input.LA(1);

			if (((LA29_0 >= '\u0000' && LA29_0 <= '\t')
					|| (LA29_0 >= '\u000B' && LA29_0 <= '\f')
					|| (LA29_0 >= '\u000E' && LA29_0 <= '.')
					|| (LA29_0 >= '0' && LA29_0 <= '[')
					|| (LA29_0 >= ']' && LA29_0 <= '\u2027') || (LA29_0 >= '\u202A' && LA29_0 <= '\uFFFE'))) {
				alt29 = 1;
			} else if ((LA29_0 == '\\')) {
				alt29 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"790:10: fragment RegularExpressionChar : (~ ( LineTerminator | BSLASH | DIV ) | BackslashSequence );",
						29, 0, input);

				throw nvae;
			}
			switch (alt29) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:791:4:
				// ~ ( LineTerminator | BSLASH | DIV )
			{
				if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
						|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
						|| (input.LA(1) >= '\u000E' && input.LA(1) <= '.')
						|| (input.LA(1) >= '0' && input.LA(1) <= '[')
						|| (input.LA(1) >= ']' && input.LA(1) <= '\u2027')
						|| (input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFE')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:792:4:
				// BackslashSequence
			{
				mBackslashSequence();

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end RegularExpressionChar

	// $ANTLR start RegularExpressionLiteral
	public final void mRegularExpressionLiteral() throws RecognitionException {
		try {
			int _type = RegularExpressionLiteral;
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:796:2:
			// ({...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar
			// )* DIV ( IdentifierPart )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:796:4:
			// {...}? => DIV RegularExpressionFirstChar ( RegularExpressionChar
			// )* DIV ( IdentifierPart )*
			{
				if (!(areRegularExpressionsEnabled())) {
					throw new FailedPredicateException(input,
							"RegularExpressionLiteral",
							" areRegularExpressionsEnabled() ");
				}
				mDIV();
				mRegularExpressionFirstChar();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:796:73:
				// ( RegularExpressionChar )*
				loop30: do {
					int alt30 = 2;
					int LA30_0 = input.LA(1);

					if (((LA30_0 >= '\u0000' && LA30_0 <= '\t')
							|| (LA30_0 >= '\u000B' && LA30_0 <= '\f')
							|| (LA30_0 >= '\u000E' && LA30_0 <= '.')
							|| (LA30_0 >= '0' && LA30_0 <= '\u2027') || (LA30_0 >= '\u202A' && LA30_0 <= '\uFFFE'))) {
						alt30 = 1;
					}

					switch (alt30) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:796:73:
						// RegularExpressionChar
					{
						mRegularExpressionChar();

					}
						break;

					default:
						break loop30;
					}
				} while (true);

				mDIV();
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:796:100:
				// ( IdentifierPart )*
				loop31: do {
					int alt31 = 2;
					int LA31_0 = input.LA(1);

					if ((LA31_0 == '$' || (LA31_0 >= '0' && LA31_0 <= '9')
							|| (LA31_0 >= 'A' && LA31_0 <= 'Z')
							|| LA31_0 == '\\' || LA31_0 == '_' || (LA31_0 >= 'a' && LA31_0 <= 'z'))) {
						alt31 = 1;
					} else if ((isIdentifierPartUnicode(input.LA(1)))) {
						alt31 = 1;
					}

					switch (alt31) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:796:100:
						// IdentifierPart
					{
						mIdentifierPart();

					}
						break;

					default:
						break loop31;
					}
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RegularExpressionLiteral

	public void mTokens() throws RecognitionException {
		// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:8:
		// ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT |
		// DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | IF | IN |
		// INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF |
		// VAR | VOID | WHILE | WITH | GET | SET | ABSTRACT | BOOLEAN | BYTE |
		// CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS |
		// FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG |
		// NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC |
		// SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE |
		// RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT
		// | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD |
		// INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR
		// | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS |
		// SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | WhiteSpace
		// | EOL | MultiLineComment | SingleLineComment | Identifier |
		// DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral |
		// StringLiteral | RegularExpressionLiteral )
		int alt32 = 120;
		switch (input.LA(1)) {
		case 'n': {
			switch (input.LA(2)) {
			case 'a': {
				int LA32_47 = input.LA(3);

				if ((LA32_47 == 't')) {
					int LA32_128 = input.LA(4);

					if ((LA32_128 == 'i')) {
						int LA32_195 = input.LA(5);

						if ((LA32_195 == 'v')) {
							int LA32_254 = input.LA(6);

							if ((LA32_254 == 'e')) {
								int LA32_304 = input.LA(7);

								if ((LA32_304 == '$'
										|| (LA32_304 >= '0' && LA32_304 <= '9')
										|| (LA32_304 >= 'A' && LA32_304 <= 'Z')
										|| LA32_304 == '\\' || LA32_304 == '_' || (LA32_304 >= 'a' && LA32_304 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 51;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'u': {
				int LA32_48 = input.LA(3);

				if ((LA32_48 == 'l')) {
					int LA32_129 = input.LA(4);

					if ((LA32_129 == 'l')) {
						int LA32_196 = input.LA(5);

						if ((LA32_196 == '$'
								|| (LA32_196 >= '0' && LA32_196 <= '9')
								|| (LA32_196 >= 'A' && LA32_196 <= 'Z')
								|| LA32_196 == '\\' || LA32_196 == '_' || (LA32_196 >= 'a' && LA32_196 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 1;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'e': {
				int LA32_49 = input.LA(3);

				if ((LA32_49 == 'w')) {
					int LA32_130 = input.LA(4);

					if ((LA32_130 == '$'
							|| (LA32_130 >= '0' && LA32_130 <= '9')
							|| (LA32_130 >= 'A' && LA32_130 <= 'Z')
							|| LA32_130 == '\\' || LA32_130 == '_' || (LA32_130 >= 'a' && LA32_130 <= 'z'))) {
						alt32 = 115;
					} else {
						alt32 = 19;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 't': {
			switch (input.LA(2)) {
			case 'r': {
				switch (input.LA(3)) {
				case 'u': {
					int LA32_131 = input.LA(4);

					if ((LA32_131 == 'e')) {
						int LA32_198 = input.LA(5);

						if ((LA32_198 == '$'
								|| (LA32_198 >= '0' && LA32_198 <= '9')
								|| (LA32_198 >= 'A' && LA32_198 <= 'Z')
								|| LA32_198 == '\\' || LA32_198 == '_' || (LA32_198 >= 'a' && LA32_198 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 2;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'y': {
					int LA32_132 = input.LA(4);

					if ((LA32_132 == '$'
							|| (LA32_132 >= '0' && LA32_132 <= '9')
							|| (LA32_132 >= 'A' && LA32_132 <= 'Z')
							|| LA32_132 == '\\' || LA32_132 == '_' || (LA32_132 >= 'a' && LA32_132 <= 'z'))) {
						alt32 = 115;
					} else {
						alt32 = 24;
					}
				}
					break;
				case 'a': {
					int LA32_133 = input.LA(4);

					if ((LA32_133 == 'n')) {
						int LA32_200 = input.LA(5);

						if ((LA32_200 == 's')) {
							int LA32_257 = input.LA(6);

							if ((LA32_257 == 'i')) {
								int LA32_305 = input.LA(7);

								if ((LA32_305 == 'e')) {
									int LA32_344 = input.LA(8);

									if ((LA32_344 == 'n')) {
										int LA32_371 = input.LA(9);

										if ((LA32_371 == 't')) {
											int LA32_388 = input.LA(10);

											if ((LA32_388 == '$'
													|| (LA32_388 >= '0' && LA32_388 <= '9')
													|| (LA32_388 >= 'A' && LA32_388 <= 'Z')
													|| LA32_388 == '\\'
													|| LA32_388 == '_' || (LA32_388 >= 'a' && LA32_388 <= 'z'))) {
												alt32 = 115;
											} else {
												alt32 = 61;
											}
										} else {
											alt32 = 115;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'h': {
				switch (input.LA(3)) {
				case 'r': {
					int LA32_134 = input.LA(4);

					if ((LA32_134 == 'o')) {
						int LA32_201 = input.LA(5);

						if ((LA32_201 == 'w')) {
							switch (input.LA(6)) {
							case 's': {
								int LA32_306 = input.LA(7);

								if ((LA32_306 == '$'
										|| (LA32_306 >= '0' && LA32_306 <= '9')
										|| (LA32_306 >= 'A' && LA32_306 <= 'Z')
										|| LA32_306 == '\\' || LA32_306 == '_' || (LA32_306 >= 'a' && LA32_306 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 60;
								}
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
							case 'z': {
								alt32 = 115;
							}
								break;
							default:
								alt32 = 23;
							}

						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'i': {
					int LA32_135 = input.LA(4);

					if ((LA32_135 == 's')) {
						int LA32_202 = input.LA(5);

						if ((LA32_202 == '$'
								|| (LA32_202 >= '0' && LA32_202 <= '9')
								|| (LA32_202 >= 'A' && LA32_202 <= 'Z')
								|| LA32_202 == '\\' || LA32_202 == '_' || (LA32_202 >= 'a' && LA32_202 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 22;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'y': {
				int LA32_52 = input.LA(3);

				if ((LA32_52 == 'p')) {
					int LA32_136 = input.LA(4);

					if ((LA32_136 == 'e')) {
						int LA32_203 = input.LA(5);

						if ((LA32_203 == 'o')) {
							int LA32_260 = input.LA(6);

							if ((LA32_260 == 'f')) {
								int LA32_308 = input.LA(7);

								if ((LA32_308 == '$'
										|| (LA32_308 >= '0' && LA32_308 <= '9')
										|| (LA32_308 >= 'A' && LA32_308 <= 'Z')
										|| LA32_308 == '\\' || LA32_308 == '_' || (LA32_308 >= 'a' && LA32_308 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 25;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'f': {
			switch (input.LA(2)) {
			case 'i': {
				int LA32_53 = input.LA(3);

				if ((LA32_53 == 'n')) {
					int LA32_137 = input.LA(4);

					if ((LA32_137 == 'a')) {
						int LA32_204 = input.LA(5);

						if ((LA32_204 == 'l')) {
							switch (input.LA(6)) {
							case 'l': {
								int LA32_309 = input.LA(7);

								if ((LA32_309 == 'y')) {
									int LA32_347 = input.LA(8);

									if ((LA32_347 == '$'
											|| (LA32_347 >= '0' && LA32_347 <= '9')
											|| (LA32_347 >= 'A' && LA32_347 <= 'Z')
											|| LA32_347 == '\\'
											|| LA32_347 == '_' || (LA32_347 >= 'a' && LA32_347 <= 'z'))) {
										alt32 = 115;
									} else {
										alt32 = 12;
									}
								} else {
									alt32 = 115;
								}
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
							case 'z': {
								alt32 = 115;
							}
								break;
							default:
								alt32 = 43;
							}

						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'l': {
				int LA32_54 = input.LA(3);

				if ((LA32_54 == 'o')) {
					int LA32_138 = input.LA(4);

					if ((LA32_138 == 'a')) {
						int LA32_205 = input.LA(5);

						if ((LA32_205 == 't')) {
							int LA32_262 = input.LA(6);

							if ((LA32_262 == '$'
									|| (LA32_262 >= '0' && LA32_262 <= '9')
									|| (LA32_262 >= 'A' && LA32_262 <= 'Z')
									|| LA32_262 == '\\' || LA32_262 == '_' || (LA32_262 >= 'a' && LA32_262 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 44;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'a': {
				int LA32_55 = input.LA(3);

				if ((LA32_55 == 'l')) {
					int LA32_139 = input.LA(4);

					if ((LA32_139 == 's')) {
						int LA32_206 = input.LA(5);

						if ((LA32_206 == 'e')) {
							int LA32_263 = input.LA(6);

							if ((LA32_263 == '$'
									|| (LA32_263 >= '0' && LA32_263 <= '9')
									|| (LA32_263 >= 'A' && LA32_263 <= 'Z')
									|| LA32_263 == '\\' || LA32_263 == '_' || (LA32_263 >= 'a' && LA32_263 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 3;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'u': {
				int LA32_56 = input.LA(3);

				if ((LA32_56 == 'n')) {
					int LA32_140 = input.LA(4);

					if ((LA32_140 == 'c')) {
						int LA32_207 = input.LA(5);

						if ((LA32_207 == 't')) {
							int LA32_264 = input.LA(6);

							if ((LA32_264 == 'i')) {
								int LA32_313 = input.LA(7);

								if ((LA32_313 == 'o')) {
									int LA32_348 = input.LA(8);

									if ((LA32_348 == 'n')) {
										int LA32_373 = input.LA(9);

										if ((LA32_373 == '$'
												|| (LA32_373 >= '0' && LA32_373 <= '9')
												|| (LA32_373 >= 'A' && LA32_373 <= 'Z')
												|| LA32_373 == '\\'
												|| LA32_373 == '_' || (LA32_373 >= 'a' && LA32_373 <= 'z'))) {
											alt32 = 115;
										} else {
											alt32 = 15;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'o': {
				int LA32_57 = input.LA(3);

				if ((LA32_57 == 'r')) {
					int LA32_141 = input.LA(4);

					if ((LA32_141 == '$'
							|| (LA32_141 >= '0' && LA32_141 <= '9')
							|| (LA32_141 >= 'A' && LA32_141 <= 'Z')
							|| LA32_141 == '\\' || LA32_141 == '_' || (LA32_141 >= 'a' && LA32_141 <= 'z'))) {
						alt32 = 115;
					} else {
						alt32 = 13;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'b': {
			switch (input.LA(2)) {
			case 'r': {
				int LA32_58 = input.LA(3);

				if ((LA32_58 == 'e')) {
					int LA32_142 = input.LA(4);

					if ((LA32_142 == 'a')) {
						int LA32_209 = input.LA(5);

						if ((LA32_209 == 'k')) {
							int LA32_265 = input.LA(6);

							if ((LA32_265 == '$'
									|| (LA32_265 >= '0' && LA32_265 <= '9')
									|| (LA32_265 >= 'A' && LA32_265 <= 'Z')
									|| LA32_265 == '\\' || LA32_265 == '_' || (LA32_265 >= 'a' && LA32_265 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 4;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'y': {
				int LA32_59 = input.LA(3);

				if ((LA32_59 == 't')) {
					int LA32_143 = input.LA(4);

					if ((LA32_143 == 'e')) {
						int LA32_210 = input.LA(5);

						if ((LA32_210 == '$'
								|| (LA32_210 >= '0' && LA32_210 <= '9')
								|| (LA32_210 >= 'A' && LA32_210 <= 'Z')
								|| LA32_210 == '\\' || LA32_210 == '_' || (LA32_210 >= 'a' && LA32_210 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 34;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'o': {
				int LA32_60 = input.LA(3);

				if ((LA32_60 == 'o')) {
					int LA32_144 = input.LA(4);

					if ((LA32_144 == 'l')) {
						int LA32_211 = input.LA(5);

						if ((LA32_211 == 'e')) {
							int LA32_267 = input.LA(6);

							if ((LA32_267 == 'a')) {
								int LA32_315 = input.LA(7);

								if ((LA32_315 == 'n')) {
									int LA32_349 = input.LA(8);

									if ((LA32_349 == '$'
											|| (LA32_349 >= '0' && LA32_349 <= '9')
											|| (LA32_349 >= 'A' && LA32_349 <= 'Z')
											|| LA32_349 == '\\'
											|| LA32_349 == '_' || (LA32_349 >= 'a' && LA32_349 <= 'z'))) {
										alt32 = 115;
									} else {
										alt32 = 33;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'c': {
			switch (input.LA(2)) {
			case 'a': {
				switch (input.LA(3)) {
				case 's': {
					int LA32_145 = input.LA(4);

					if ((LA32_145 == 'e')) {
						int LA32_212 = input.LA(5);

						if ((LA32_212 == '$'
								|| (LA32_212 >= '0' && LA32_212 <= '9')
								|| (LA32_212 >= 'A' && LA32_212 <= 'Z')
								|| LA32_212 == '\\' || LA32_212 == '_' || (LA32_212 >= 'a' && LA32_212 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 5;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 't': {
					int LA32_146 = input.LA(4);

					if ((LA32_146 == 'c')) {
						int LA32_213 = input.LA(5);

						if ((LA32_213 == 'h')) {
							int LA32_269 = input.LA(6);

							if ((LA32_269 == '$'
									|| (LA32_269 >= '0' && LA32_269 <= '9')
									|| (LA32_269 >= 'A' && LA32_269 <= 'Z')
									|| LA32_269 == '\\' || LA32_269 == '_' || (LA32_269 >= 'a' && LA32_269 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 6;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'o': {
				int LA32_62 = input.LA(3);

				if ((LA32_62 == 'n')) {
					switch (input.LA(4)) {
					case 's': {
						int LA32_214 = input.LA(5);

						if ((LA32_214 == 't')) {
							int LA32_270 = input.LA(6);

							if ((LA32_270 == '$'
									|| (LA32_270 >= '0' && LA32_270 <= '9')
									|| (LA32_270 >= 'A' && LA32_270 <= 'Z')
									|| LA32_270 == '\\' || LA32_270 == '_' || (LA32_270 >= 'a' && LA32_270 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 37;
							}
						} else {
							alt32 = 115;
						}
					}
						break;
					case 't': {
						int LA32_215 = input.LA(5);

						if ((LA32_215 == 'i')) {
							int LA32_271 = input.LA(6);

							if ((LA32_271 == 'n')) {
								int LA32_318 = input.LA(7);

								if ((LA32_318 == 'u')) {
									int LA32_350 = input.LA(8);

									if ((LA32_350 == 'e')) {
										int LA32_375 = input.LA(9);

										if ((LA32_375 == '$'
												|| (LA32_375 >= '0' && LA32_375 <= '9')
												|| (LA32_375 >= 'A' && LA32_375 <= 'Z')
												|| LA32_375 == '\\'
												|| LA32_375 == '_' || (LA32_375 >= 'a' && LA32_375 <= 'z'))) {
											alt32 = 115;
										} else {
											alt32 = 7;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					}
						break;
					default:
						alt32 = 115;
					}

				} else {
					alt32 = 115;
				}
			}
				break;
			case 'h': {
				int LA32_63 = input.LA(3);

				if ((LA32_63 == 'a')) {
					int LA32_148 = input.LA(4);

					if ((LA32_148 == 'r')) {
						int LA32_216 = input.LA(5);

						if ((LA32_216 == '$'
								|| (LA32_216 >= '0' && LA32_216 <= '9')
								|| (LA32_216 >= 'A' && LA32_216 <= 'Z')
								|| LA32_216 == '\\' || LA32_216 == '_' || (LA32_216 >= 'a' && LA32_216 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 35;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'l': {
				int LA32_64 = input.LA(3);

				if ((LA32_64 == 'a')) {
					int LA32_149 = input.LA(4);

					if ((LA32_149 == 's')) {
						int LA32_217 = input.LA(5);

						if ((LA32_217 == 's')) {
							int LA32_273 = input.LA(6);

							if ((LA32_273 == '$'
									|| (LA32_273 >= '0' && LA32_273 <= '9')
									|| (LA32_273 >= 'A' && LA32_273 <= 'Z')
									|| LA32_273 == '\\' || LA32_273 == '_' || (LA32_273 >= 'a' && LA32_273 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 36;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'd': {
			switch (input.LA(2)) {
			case 'e': {
				switch (input.LA(3)) {
				case 'b': {
					int LA32_150 = input.LA(4);

					if ((LA32_150 == 'u')) {
						int LA32_218 = input.LA(5);

						if ((LA32_218 == 'g')) {
							int LA32_274 = input.LA(6);

							if ((LA32_274 == 'g')) {
								int LA32_320 = input.LA(7);

								if ((LA32_320 == 'e')) {
									int LA32_351 = input.LA(8);

									if ((LA32_351 == 'r')) {
										int LA32_376 = input.LA(9);

										if ((LA32_376 == '$'
												|| (LA32_376 >= '0' && LA32_376 <= '9')
												|| (LA32_376 >= 'A' && LA32_376 <= 'Z')
												|| LA32_376 == '\\'
												|| LA32_376 == '_' || (LA32_376 >= 'a' && LA32_376 <= 'z'))) {
											alt32 = 115;
										} else {
											alt32 = 38;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'f': {
					int LA32_151 = input.LA(4);

					if ((LA32_151 == 'a')) {
						int LA32_219 = input.LA(5);

						if ((LA32_219 == 'u')) {
							int LA32_275 = input.LA(6);

							if ((LA32_275 == 'l')) {
								int LA32_321 = input.LA(7);

								if ((LA32_321 == 't')) {
									int LA32_352 = input.LA(8);

									if ((LA32_352 == '$'
											|| (LA32_352 >= '0' && LA32_352 <= '9')
											|| (LA32_352 >= 'A' && LA32_352 <= 'Z')
											|| LA32_352 == '\\'
											|| LA32_352 == '_' || (LA32_352 >= 'a' && LA32_352 <= 'z'))) {
										alt32 = 115;
									} else {
										alt32 = 8;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'l': {
					int LA32_152 = input.LA(4);

					if ((LA32_152 == 'e')) {
						int LA32_220 = input.LA(5);

						if ((LA32_220 == 't')) {
							int LA32_276 = input.LA(6);

							if ((LA32_276 == 'e')) {
								int LA32_322 = input.LA(7);

								if ((LA32_322 == '$'
										|| (LA32_322 >= '0' && LA32_322 <= '9')
										|| (LA32_322 >= 'A' && LA32_322 <= 'Z')
										|| LA32_322 == '\\' || LA32_322 == '_' || (LA32_322 >= 'a' && LA32_322 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 9;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'o': {
				switch (input.LA(3)) {
				case 'u': {
					int LA32_153 = input.LA(4);

					if ((LA32_153 == 'b')) {
						int LA32_221 = input.LA(5);

						if ((LA32_221 == 'l')) {
							int LA32_277 = input.LA(6);

							if ((LA32_277 == 'e')) {
								int LA32_323 = input.LA(7);

								if ((LA32_323 == '$'
										|| (LA32_323 >= '0' && LA32_323 <= '9')
										|| (LA32_323 >= 'A' && LA32_323 <= 'Z')
										|| LA32_323 == '\\' || LA32_323 == '_' || (LA32_323 >= 'a' && LA32_323 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 39;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
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
				case 'z': {
					alt32 = 115;
				}
					break;
				default:
					alt32 = 10;
				}

			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'e': {
			switch (input.LA(2)) {
			case 'a': {
				int LA32_67 = input.LA(3);

				if ((LA32_67 == 'c')) {
					int LA32_155 = input.LA(4);

					if ((LA32_155 == 'h')) {
						int LA32_222 = input.LA(5);

						if ((LA32_222 == '$'
								|| (LA32_222 >= '0' && LA32_222 <= '9')
								|| (LA32_222 >= 'A' && LA32_222 <= 'Z')
								|| LA32_222 == '\\' || LA32_222 == '_' || (LA32_222 >= 'a' && LA32_222 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 14;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'l': {
				int LA32_68 = input.LA(3);

				if ((LA32_68 == 's')) {
					int LA32_156 = input.LA(4);

					if ((LA32_156 == 'e')) {
						int LA32_223 = input.LA(5);

						if ((LA32_223 == '$'
								|| (LA32_223 >= '0' && LA32_223 <= '9')
								|| (LA32_223 >= 'A' && LA32_223 <= 'Z')
								|| LA32_223 == '\\' || LA32_223 == '_' || (LA32_223 >= 'a' && LA32_223 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 11;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'x': {
				switch (input.LA(3)) {
				case 't': {
					int LA32_157 = input.LA(4);

					if ((LA32_157 == 'e')) {
						int LA32_224 = input.LA(5);

						if ((LA32_224 == 'n')) {
							int LA32_280 = input.LA(6);

							if ((LA32_280 == 'd')) {
								int LA32_324 = input.LA(7);

								if ((LA32_324 == 's')) {
									int LA32_355 = input.LA(8);

									if ((LA32_355 == '$'
											|| (LA32_355 >= '0' && LA32_355 <= '9')
											|| (LA32_355 >= 'A' && LA32_355 <= 'Z')
											|| LA32_355 == '\\'
											|| LA32_355 == '_' || (LA32_355 >= 'a' && LA32_355 <= 'z'))) {
										alt32 = 115;
									} else {
										alt32 = 42;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'p': {
					int LA32_158 = input.LA(4);

					if ((LA32_158 == 'o')) {
						int LA32_225 = input.LA(5);

						if ((LA32_225 == 'r')) {
							int LA32_281 = input.LA(6);

							if ((LA32_281 == 't')) {
								int LA32_325 = input.LA(7);

								if ((LA32_325 == '$'
										|| (LA32_325 >= '0' && LA32_325 <= '9')
										|| (LA32_325 >= 'A' && LA32_325 <= 'Z')
										|| LA32_325 == '\\' || LA32_325 == '_' || (LA32_325 >= 'a' && LA32_325 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 41;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'n': {
				int LA32_70 = input.LA(3);

				if ((LA32_70 == 'u')) {
					int LA32_159 = input.LA(4);

					if ((LA32_159 == 'm')) {
						int LA32_226 = input.LA(5);

						if ((LA32_226 == '$'
								|| (LA32_226 >= '0' && LA32_226 <= '9')
								|| (LA32_226 >= 'A' && LA32_226 <= 'Z')
								|| LA32_226 == '\\' || LA32_226 == '_' || (LA32_226 >= 'a' && LA32_226 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 40;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'i': {
			switch (input.LA(2)) {
			case 'm': {
				int LA32_71 = input.LA(3);

				if ((LA32_71 == 'p')) {
					switch (input.LA(4)) {
					case 'o': {
						int LA32_227 = input.LA(5);

						if ((LA32_227 == 'r')) {
							int LA32_283 = input.LA(6);

							if ((LA32_283 == 't')) {
								int LA32_326 = input.LA(7);

								if ((LA32_326 == '$'
										|| (LA32_326 >= '0' && LA32_326 <= '9')
										|| (LA32_326 >= 'A' && LA32_326 <= 'Z')
										|| LA32_326 == '\\' || LA32_326 == '_' || (LA32_326 >= 'a' && LA32_326 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 47;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					}
						break;
					case 'l': {
						int LA32_228 = input.LA(5);

						if ((LA32_228 == 'e')) {
							int LA32_284 = input.LA(6);

							if ((LA32_284 == 'm')) {
								int LA32_327 = input.LA(7);

								if ((LA32_327 == 'e')) {
									int LA32_358 = input.LA(8);

									if ((LA32_358 == 'n')) {
										int LA32_379 = input.LA(9);

										if ((LA32_379 == 't')) {
											int LA32_392 = input.LA(10);

											if ((LA32_392 == 's')) {
												int LA32_400 = input.LA(11);

												if ((LA32_400 == '$'
														|| (LA32_400 >= '0' && LA32_400 <= '9')
														|| (LA32_400 >= 'A' && LA32_400 <= 'Z')
														|| LA32_400 == '\\'
														|| LA32_400 == '_' || (LA32_400 >= 'a' && LA32_400 <= 'z'))) {
													alt32 = 115;
												} else {
													alt32 = 46;
												}
											} else {
												alt32 = 115;
											}
										} else {
											alt32 = 115;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					}
						break;
					default:
						alt32 = 115;
					}

				} else {
					alt32 = 115;
				}
			}
				break;
			case 'n': {
				switch (input.LA(3)) {
				case 't': {
					switch (input.LA(4)) {
					case 'e': {
						int LA32_229 = input.LA(5);

						if ((LA32_229 == 'r')) {
							int LA32_285 = input.LA(6);

							if ((LA32_285 == 'f')) {
								int LA32_328 = input.LA(7);

								if ((LA32_328 == 'a')) {
									int LA32_359 = input.LA(8);

									if ((LA32_359 == 'c')) {
										int LA32_380 = input.LA(9);

										if ((LA32_380 == 'e')) {
											int LA32_393 = input.LA(10);

											if ((LA32_393 == '$'
													|| (LA32_393 >= '0' && LA32_393 <= '9')
													|| (LA32_393 >= 'A' && LA32_393 <= 'Z')
													|| LA32_393 == '\\'
													|| LA32_393 == '_' || (LA32_393 >= 'a' && LA32_393 <= 'z'))) {
												alt32 = 115;
											} else {
												alt32 = 49;
											}
										} else {
											alt32 = 115;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
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
					case 'z': {
						alt32 = 115;
					}
						break;
					default:
						alt32 = 48;
					}

				}
					break;
				case 's': {
					int LA32_162 = input.LA(4);

					if ((LA32_162 == 't')) {
						int LA32_231 = input.LA(5);

						if ((LA32_231 == 'a')) {
							int LA32_286 = input.LA(6);

							if ((LA32_286 == 'n')) {
								int LA32_329 = input.LA(7);

								if ((LA32_329 == 'c')) {
									int LA32_360 = input.LA(8);

									if ((LA32_360 == 'e')) {
										int LA32_381 = input.LA(9);

										if ((LA32_381 == 'o')) {
											int LA32_394 = input.LA(10);

											if ((LA32_394 == 'f')) {
												int LA32_402 = input.LA(11);

												if ((LA32_402 == '$'
														|| (LA32_402 >= '0' && LA32_402 <= '9')
														|| (LA32_402 >= 'A' && LA32_402 <= 'Z')
														|| LA32_402 == '\\'
														|| LA32_402 == '_' || (LA32_402 >= 'a' && LA32_402 <= 'z'))) {
													alt32 = 115;
												} else {
													alt32 = 18;
												}
											} else {
												alt32 = 115;
											}
										} else {
											alt32 = 115;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
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
				case 'z': {
					alt32 = 115;
				}
					break;
				default:
					alt32 = 17;
				}

			}
				break;
			case 'f': {
				int LA32_73 = input.LA(3);

				if ((LA32_73 == '$' || (LA32_73 >= '0' && LA32_73 <= '9')
						|| (LA32_73 >= 'A' && LA32_73 <= 'Z')
						|| LA32_73 == '\\' || LA32_73 == '_' || (LA32_73 >= 'a' && LA32_73 <= 'z'))) {
					alt32 = 115;
				} else {
					alt32 = 16;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'r': {
			int LA32_9 = input.LA(2);

			if ((LA32_9 == 'e')) {
				int LA32_74 = input.LA(3);

				if ((LA32_74 == 't')) {
					int LA32_165 = input.LA(4);

					if ((LA32_165 == 'u')) {
						int LA32_232 = input.LA(5);

						if ((LA32_232 == 'r')) {
							int LA32_287 = input.LA(6);

							if ((LA32_287 == 'n')) {
								int LA32_330 = input.LA(7);

								if ((LA32_330 == '$'
										|| (LA32_330 >= '0' && LA32_330 <= '9')
										|| (LA32_330 >= 'A' && LA32_330 <= 'Z')
										|| LA32_330 == '\\' || LA32_330 == '_' || (LA32_330 >= 'a' && LA32_330 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 20;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			} else {
				alt32 = 115;
			}
		}
			break;
		case 's': {
			switch (input.LA(2)) {
			case 'h': {
				int LA32_75 = input.LA(3);

				if ((LA32_75 == 'o')) {
					int LA32_166 = input.LA(4);

					if ((LA32_166 == 'r')) {
						int LA32_233 = input.LA(5);

						if ((LA32_233 == 't')) {
							int LA32_288 = input.LA(6);

							if ((LA32_288 == '$'
									|| (LA32_288 >= '0' && LA32_288 <= '9')
									|| (LA32_288 >= 'A' && LA32_288 <= 'Z')
									|| LA32_288 == '\\' || LA32_288 == '_' || (LA32_288 >= 'a' && LA32_288 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 56;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'y': {
				int LA32_76 = input.LA(3);

				if ((LA32_76 == 'n')) {
					int LA32_167 = input.LA(4);

					if ((LA32_167 == 'c')) {
						int LA32_234 = input.LA(5);

						if ((LA32_234 == 'h')) {
							int LA32_289 = input.LA(6);

							if ((LA32_289 == 'r')) {
								int LA32_332 = input.LA(7);

								if ((LA32_332 == 'o')) {
									int LA32_362 = input.LA(8);

									if ((LA32_362 == 'n')) {
										int LA32_382 = input.LA(9);

										if ((LA32_382 == 'i')) {
											int LA32_395 = input.LA(10);

											if ((LA32_395 == 'z')) {
												int LA32_403 = input.LA(11);

												if ((LA32_403 == 'e')) {
													int LA32_407 = input.LA(12);

													if ((LA32_407 == 'd')) {
														int LA32_408 = input
																.LA(13);

														if ((LA32_408 == '$'
																|| (LA32_408 >= '0' && LA32_408 <= '9')
																|| (LA32_408 >= 'A' && LA32_408 <= 'Z')
																|| LA32_408 == '\\'
																|| LA32_408 == '_' || (LA32_408 >= 'a' && LA32_408 <= 'z'))) {
															alt32 = 115;
														} else {
															alt32 = 59;
														}
													} else {
														alt32 = 115;
													}
												} else {
													alt32 = 115;
												}
											} else {
												alt32 = 115;
											}
										} else {
											alt32 = 115;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'u': {
				int LA32_77 = input.LA(3);

				if ((LA32_77 == 'p')) {
					int LA32_168 = input.LA(4);

					if ((LA32_168 == 'e')) {
						int LA32_235 = input.LA(5);

						if ((LA32_235 == 'r')) {
							int LA32_290 = input.LA(6);

							if ((LA32_290 == '$'
									|| (LA32_290 >= '0' && LA32_290 <= '9')
									|| (LA32_290 >= 'A' && LA32_290 <= 'Z')
									|| LA32_290 == '\\' || LA32_290 == '_' || (LA32_290 >= 'a' && LA32_290 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 58;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 't': {
				int LA32_78 = input.LA(3);

				if ((LA32_78 == 'a')) {
					int LA32_169 = input.LA(4);

					if ((LA32_169 == 't')) {
						int LA32_236 = input.LA(5);

						if ((LA32_236 == 'i')) {
							int LA32_291 = input.LA(6);

							if ((LA32_291 == 'c')) {
								int LA32_334 = input.LA(7);

								if ((LA32_334 == '$'
										|| (LA32_334 >= '0' && LA32_334 <= '9')
										|| (LA32_334 >= 'A' && LA32_334 <= 'Z')
										|| LA32_334 == '\\' || LA32_334 == '_' || (LA32_334 >= 'a' && LA32_334 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 57;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'w': {
				int LA32_79 = input.LA(3);

				if ((LA32_79 == 'i')) {
					int LA32_170 = input.LA(4);

					if ((LA32_170 == 't')) {
						int LA32_237 = input.LA(5);

						if ((LA32_237 == 'c')) {
							int LA32_292 = input.LA(6);

							if ((LA32_292 == 'h')) {
								int LA32_335 = input.LA(7);

								if ((LA32_335 == '$'
										|| (LA32_335 >= '0' && LA32_335 <= '9')
										|| (LA32_335 >= 'A' && LA32_335 <= 'Z')
										|| LA32_335 == '\\' || LA32_335 == '_' || (LA32_335 >= 'a' && LA32_335 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 21;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'e': {
				int LA32_80 = input.LA(3);

				if ((LA32_80 == 't')) {
					int LA32_171 = input.LA(4);

					if ((LA32_171 == '$'
							|| (LA32_171 >= '0' && LA32_171 <= '9')
							|| (LA32_171 >= 'A' && LA32_171 <= 'Z')
							|| LA32_171 == '\\' || LA32_171 == '_' || (LA32_171 >= 'a' && LA32_171 <= 'z'))) {
						alt32 = 115;
					} else {
						alt32 = 31;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'v': {
			switch (input.LA(2)) {
			case 'o': {
				switch (input.LA(3)) {
				case 'i': {
					int LA32_172 = input.LA(4);

					if ((LA32_172 == 'd')) {
						int LA32_239 = input.LA(5);

						if ((LA32_239 == '$'
								|| (LA32_239 >= '0' && LA32_239 <= '9')
								|| (LA32_239 >= 'A' && LA32_239 <= 'Z')
								|| LA32_239 == '\\' || LA32_239 == '_' || (LA32_239 >= 'a' && LA32_239 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 27;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'l': {
					int LA32_173 = input.LA(4);

					if ((LA32_173 == 'a')) {
						int LA32_240 = input.LA(5);

						if ((LA32_240 == 't')) {
							int LA32_294 = input.LA(6);

							if ((LA32_294 == 'i')) {
								int LA32_336 = input.LA(7);

								if ((LA32_336 == 'l')) {
									int LA32_365 = input.LA(8);

									if ((LA32_365 == 'e')) {
										int LA32_383 = input.LA(9);

										if ((LA32_383 == '$'
												|| (LA32_383 >= '0' && LA32_383 <= '9')
												|| (LA32_383 >= 'A' && LA32_383 <= 'Z')
												|| LA32_383 == '\\'
												|| LA32_383 == '_' || (LA32_383 >= 'a' && LA32_383 <= 'z'))) {
											alt32 = 115;
										} else {
											alt32 = 62;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'a': {
				int LA32_82 = input.LA(3);

				if ((LA32_82 == 'r')) {
					int LA32_174 = input.LA(4);

					if ((LA32_174 == '$'
							|| (LA32_174 >= '0' && LA32_174 <= '9')
							|| (LA32_174 >= 'A' && LA32_174 <= 'Z')
							|| LA32_174 == '\\' || LA32_174 == '_' || (LA32_174 >= 'a' && LA32_174 <= 'z'))) {
						alt32 = 115;
					} else {
						alt32 = 26;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'w': {
			switch (input.LA(2)) {
			case 'i': {
				int LA32_83 = input.LA(3);

				if ((LA32_83 == 't')) {
					int LA32_175 = input.LA(4);

					if ((LA32_175 == 'h')) {
						int LA32_242 = input.LA(5);

						if ((LA32_242 == '$'
								|| (LA32_242 >= '0' && LA32_242 <= '9')
								|| (LA32_242 >= 'A' && LA32_242 <= 'Z')
								|| LA32_242 == '\\' || LA32_242 == '_' || (LA32_242 >= 'a' && LA32_242 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 29;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'h': {
				int LA32_84 = input.LA(3);

				if ((LA32_84 == 'i')) {
					int LA32_176 = input.LA(4);

					if ((LA32_176 == 'l')) {
						int LA32_243 = input.LA(5);

						if ((LA32_243 == 'e')) {
							int LA32_296 = input.LA(6);

							if ((LA32_296 == '$'
									|| (LA32_296 >= '0' && LA32_296 <= '9')
									|| (LA32_296 >= 'A' && LA32_296 <= 'Z')
									|| LA32_296 == '\\' || LA32_296 == '_' || (LA32_296 >= 'a' && LA32_296 <= 'z'))) {
								alt32 = 115;
							} else {
								alt32 = 28;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'g': {
			switch (input.LA(2)) {
			case 'o': {
				int LA32_85 = input.LA(3);

				if ((LA32_85 == 't')) {
					int LA32_177 = input.LA(4);

					if ((LA32_177 == 'o')) {
						int LA32_244 = input.LA(5);

						if ((LA32_244 == '$'
								|| (LA32_244 >= '0' && LA32_244 <= '9')
								|| (LA32_244 >= 'A' && LA32_244 <= 'Z')
								|| LA32_244 == '\\' || LA32_244 == '_' || (LA32_244 >= 'a' && LA32_244 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 45;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'e': {
				int LA32_86 = input.LA(3);

				if ((LA32_86 == 't')) {
					int LA32_178 = input.LA(4);

					if ((LA32_178 == '$'
							|| (LA32_178 >= '0' && LA32_178 <= '9')
							|| (LA32_178 >= 'A' && LA32_178 <= 'Z')
							|| LA32_178 == '\\' || LA32_178 == '_' || (LA32_178 >= 'a' && LA32_178 <= 'z'))) {
						alt32 = 115;
					} else {
						alt32 = 30;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case 'a': {
			int LA32_14 = input.LA(2);

			if ((LA32_14 == 'b')) {
				int LA32_87 = input.LA(3);

				if ((LA32_87 == 's')) {
					int LA32_179 = input.LA(4);

					if ((LA32_179 == 't')) {
						int LA32_246 = input.LA(5);

						if ((LA32_246 == 'r')) {
							int LA32_298 = input.LA(6);

							if ((LA32_298 == 'a')) {
								int LA32_338 = input.LA(7);

								if ((LA32_338 == 'c')) {
									int LA32_366 = input.LA(8);

									if ((LA32_366 == 't')) {
										int LA32_384 = input.LA(9);

										if ((LA32_384 == '$'
												|| (LA32_384 >= '0' && LA32_384 <= '9')
												|| (LA32_384 >= 'A' && LA32_384 <= 'Z')
												|| LA32_384 == '\\'
												|| LA32_384 == '_' || (LA32_384 >= 'a' && LA32_384 <= 'z'))) {
											alt32 = 115;
										} else {
											alt32 = 32;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			} else {
				alt32 = 115;
			}
		}
			break;
		case 'l': {
			int LA32_15 = input.LA(2);

			if ((LA32_15 == 'o')) {
				int LA32_88 = input.LA(3);

				if ((LA32_88 == 'n')) {
					int LA32_180 = input.LA(4);

					if ((LA32_180 == 'g')) {
						int LA32_247 = input.LA(5);

						if ((LA32_247 == '$'
								|| (LA32_247 >= '0' && LA32_247 <= '9')
								|| (LA32_247 >= 'A' && LA32_247 <= 'Z')
								|| LA32_247 == '\\' || LA32_247 == '_' || (LA32_247 >= 'a' && LA32_247 <= 'z'))) {
							alt32 = 115;
						} else {
							alt32 = 50;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			} else {
				alt32 = 115;
			}
		}
			break;
		case 'p': {
			switch (input.LA(2)) {
			case 'u': {
				int LA32_89 = input.LA(3);

				if ((LA32_89 == 'b')) {
					int LA32_181 = input.LA(4);

					if ((LA32_181 == 'l')) {
						int LA32_248 = input.LA(5);

						if ((LA32_248 == 'i')) {
							int LA32_300 = input.LA(6);

							if ((LA32_300 == 'c')) {
								int LA32_339 = input.LA(7);

								if ((LA32_339 == '$'
										|| (LA32_339 >= '0' && LA32_339 <= '9')
										|| (LA32_339 >= 'A' && LA32_339 <= 'Z')
										|| LA32_339 == '\\' || LA32_339 == '_' || (LA32_339 >= 'a' && LA32_339 <= 'z'))) {
									alt32 = 115;
								} else {
									alt32 = 55;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			case 'r': {
				switch (input.LA(3)) {
				case 'i': {
					int LA32_182 = input.LA(4);

					if ((LA32_182 == 'v')) {
						int LA32_249 = input.LA(5);

						if ((LA32_249 == 'a')) {
							int LA32_301 = input.LA(6);

							if ((LA32_301 == 't')) {
								int LA32_340 = input.LA(7);

								if ((LA32_340 == 'e')) {
									int LA32_368 = input.LA(8);

									if ((LA32_368 == '$'
											|| (LA32_368 >= '0' && LA32_368 <= '9')
											|| (LA32_368 >= 'A' && LA32_368 <= 'Z')
											|| LA32_368 == '\\'
											|| LA32_368 == '_' || (LA32_368 >= 'a' && LA32_368 <= 'z'))) {
										alt32 = 115;
									} else {
										alt32 = 53;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				case 'o': {
					int LA32_183 = input.LA(4);

					if ((LA32_183 == 't')) {
						int LA32_250 = input.LA(5);

						if ((LA32_250 == 'e')) {
							int LA32_302 = input.LA(6);

							if ((LA32_302 == 'c')) {
								int LA32_341 = input.LA(7);

								if ((LA32_341 == 't')) {
									int LA32_369 = input.LA(8);

									if ((LA32_369 == 'e')) {
										int LA32_386 = input.LA(9);

										if ((LA32_386 == 'd')) {
											int LA32_398 = input.LA(10);

											if ((LA32_398 == '$'
													|| (LA32_398 >= '0' && LA32_398 <= '9')
													|| (LA32_398 >= 'A' && LA32_398 <= 'Z')
													|| LA32_398 == '\\'
													|| LA32_398 == '_' || (LA32_398 >= 'a' && LA32_398 <= 'z'))) {
												alt32 = 115;
											} else {
												alt32 = 54;
											}
										} else {
											alt32 = 115;
										}
									} else {
										alt32 = 115;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				}
					break;
				default:
					alt32 = 115;
				}

			}
				break;
			case 'a': {
				int LA32_91 = input.LA(3);

				if ((LA32_91 == 'c')) {
					int LA32_184 = input.LA(4);

					if ((LA32_184 == 'k')) {
						int LA32_251 = input.LA(5);

						if ((LA32_251 == 'a')) {
							int LA32_303 = input.LA(6);

							if ((LA32_303 == 'g')) {
								int LA32_342 = input.LA(7);

								if ((LA32_342 == 'e')) {
									int LA32_370 = input.LA(8);

									if ((LA32_370 == '$'
											|| (LA32_370 >= '0' && LA32_370 <= '9')
											|| (LA32_370 >= 'A' && LA32_370 <= 'Z')
											|| LA32_370 == '\\'
											|| LA32_370 == '_' || (LA32_370 >= 'a' && LA32_370 <= 'z'))) {
										alt32 = 115;
									} else {
										alt32 = 52;
									}
								} else {
									alt32 = 115;
								}
							} else {
								alt32 = 115;
							}
						} else {
							alt32 = 115;
						}
					} else {
						alt32 = 115;
					}
				} else {
					alt32 = 115;
				}
			}
				break;
			default:
				alt32 = 115;
			}

		}
			break;
		case '{': {
			alt32 = 63;
		}
			break;
		case '}': {
			alt32 = 64;
		}
			break;
		case '(': {
			alt32 = 65;
		}
			break;
		case ')': {
			alt32 = 66;
		}
			break;
		case '[': {
			alt32 = 67;
		}
			break;
		case ']': {
			alt32 = 68;
		}
			break;
		case '.': {
			int LA32_23 = input.LA(2);

			if (((LA32_23 >= '0' && LA32_23 <= '9'))) {
				alt32 = 116;
			} else {
				alt32 = 69;
			}
		}
			break;
		case ';': {
			alt32 = 70;
		}
			break;
		case ',': {
			alt32 = 71;
		}
			break;
		case '<': {
			switch (input.LA(2)) {
			case '<': {
				int LA32_93 = input.LA(3);

				if ((LA32_93 == '=')) {
					alt32 = 103;
				} else {
					alt32 = 86;
				}
			}
				break;
			case '=': {
				alt32 = 74;
			}
				break;
			default:
				alt32 = 72;
			}

		}
			break;
		case '>': {
			switch (input.LA(2)) {
			case '>': {
				switch (input.LA(3)) {
				case '>': {
					int LA32_187 = input.LA(4);

					if ((LA32_187 == '=')) {
						alt32 = 105;
					} else {
						alt32 = 88;
					}
				}
					break;
				case '=': {
					alt32 = 104;
				}
					break;
				default:
					alt32 = 87;
				}

			}
				break;
			case '=': {
				alt32 = 75;
			}
				break;
			default:
				alt32 = 73;
			}

		}
			break;
		case '=': {
			int LA32_28 = input.LA(2);

			if ((LA32_28 == '=')) {
				int LA32_99 = input.LA(3);

				if ((LA32_99 == '=')) {
					alt32 = 78;
				} else {
					alt32 = 76;
				}
			} else {
				alt32 = 98;
			}
		}
			break;
		case '!': {
			int LA32_29 = input.LA(2);

			if ((LA32_29 == '=')) {
				int LA32_101 = input.LA(3);

				if ((LA32_101 == '=')) {
					alt32 = 79;
				} else {
					alt32 = 77;
				}
			} else {
				alt32 = 92;
			}
		}
			break;
		case '+': {
			switch (input.LA(2)) {
			case '=': {
				alt32 = 99;
			}
				break;
			case '+': {
				alt32 = 84;
			}
				break;
			default:
				alt32 = 80;
			}

		}
			break;
		case '-': {
			switch (input.LA(2)) {
			case '=': {
				alt32 = 100;
			}
				break;
			case '-': {
				alt32 = 85;
			}
				break;
			default:
				alt32 = 81;
			}

		}
			break;
		case '*': {
			int LA32_32 = input.LA(2);

			if ((LA32_32 == '=')) {
				alt32 = 101;
			} else {
				alt32 = 82;
			}
		}
			break;
		case '%': {
			int LA32_33 = input.LA(2);

			if ((LA32_33 == '=')) {
				alt32 = 102;
			} else {
				alt32 = 83;
			}
		}
			break;
		case '&': {
			switch (input.LA(2)) {
			case '&': {
				alt32 = 94;
			}
				break;
			case '=': {
				alt32 = 106;
			}
				break;
			default:
				alt32 = 89;
			}

		}
			break;
		case '|': {
			switch (input.LA(2)) {
			case '|': {
				alt32 = 95;
			}
				break;
			case '=': {
				alt32 = 107;
			}
				break;
			default:
				alt32 = 90;
			}

		}
			break;
		case '^': {
			int LA32_36 = input.LA(2);

			if ((LA32_36 == '=')) {
				alt32 = 108;
			} else {
				alt32 = 91;
			}
		}
			break;
		case '~': {
			alt32 = 93;
		}
			break;
		case '?': {
			alt32 = 96;
		}
			break;
		case ':': {
			alt32 = 97;
		}
			break;
		case '/': {
			int LA32_40 = input.LA(2);

			if ((LA32_40 == '/')) {
				alt32 = 114;
			} else if ((LA32_40 == '=')) {
				int LA32_122 = input.LA(3);

				if (((LA32_122 >= '\u0000' && LA32_122 <= '\t')
						|| (LA32_122 >= '\u000B' && LA32_122 <= '\f')
						|| (LA32_122 >= '\u000E' && LA32_122 <= '\u2027') || (LA32_122 >= '\u202A' && LA32_122 <= '\uFFFE'))
						&& (areRegularExpressionsEnabled())) {
					alt32 = 120;
				} else {
					alt32 = 110;
				}
			} else if ((LA32_40 == '*')) {
				alt32 = 113;
			} else if (((LA32_40 >= '\u0000' && LA32_40 <= '\t')
					|| (LA32_40 >= '\u000B' && LA32_40 <= '\f')
					|| (LA32_40 >= '\u000E' && LA32_40 <= ')')
					|| (LA32_40 >= '+' && LA32_40 <= '.')
					|| (LA32_40 >= '0' && LA32_40 <= '<')
					|| (LA32_40 >= '>' && LA32_40 <= '\u2027') || (LA32_40 >= '\u202A' && LA32_40 <= '\uFFFE'))
					&& (areRegularExpressionsEnabled())) {
				alt32 = 120;
			} else {
				alt32 = 109;
			}
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
		case '\u3000': {
			alt32 = 111;
		}
			break;
		case '\n':
		case '\r':
		case '\u2028':
		case '\u2029': {
			alt32 = 112;
		}
			break;
		case '0': {
			switch (input.LA(2)) {
			case 'X':
			case 'x': {
				alt32 = 118;
			}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7': {
				alt32 = 117;
			}
				break;
			default:
				alt32 = 116;
			}

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
		case '9': {
			alt32 = 116;
		}
			break;
		case '\"':
		case '\'': {
			alt32 = 119;
		}
			break;
		default:
			alt32 = 115;
		}

		switch (alt32) {
		case 1:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:10:
			// NULL
		{
			mNULL();

		}
			break;
		case 2:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:15:
			// TRUE
		{
			mTRUE();

		}
			break;
		case 3:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:20:
			// FALSE
		{
			mFALSE();

		}
			break;
		case 4:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:26:
			// BREAK
		{
			mBREAK();

		}
			break;
		case 5:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:32:
			// CASE
		{
			mCASE();

		}
			break;
		case 6:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:37:
			// CATCH
		{
			mCATCH();

		}
			break;
		case 7:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:43:
			// CONTINUE
		{
			mCONTINUE();

		}
			break;
		case 8:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:52:
			// DEFAULT
		{
			mDEFAULT();

		}
			break;
		case 9:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:60:
			// DELETE
		{
			mDELETE();

		}
			break;
		case 10:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:67:
			// DO
		{
			mDO();

		}
			break;
		case 11:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:70:
			// ELSE
		{
			mELSE();

		}
			break;
		case 12:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:75:
			// FINALLY
		{
			mFINALLY();

		}
			break;
		case 13:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:83:
			// FOR
		{
			mFOR();

		}
			break;
		case 14:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:87:
			// EACH
		{
			mEACH();

		}
			break;
		case 15:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:92:
			// FUNCTION
		{
			mFUNCTION();

		}
			break;
		case 16:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:101:
			// IF
		{
			mIF();

		}
			break;
		case 17:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:104:
			// IN
		{
			mIN();

		}
			break;
		case 18:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:107:
			// INSTANCEOF
		{
			mINSTANCEOF();

		}
			break;
		case 19:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:118:
			// NEW
		{
			mNEW();

		}
			break;
		case 20:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:122:
			// RETURN
		{
			mRETURN();

		}
			break;
		case 21:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:129:
			// SWITCH
		{
			mSWITCH();

		}
			break;
		case 22:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:136:
			// THIS
		{
			mTHIS();

		}
			break;
		case 23:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:141:
			// THROW
		{
			mTHROW();

		}
			break;
		case 24:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:147:
			// TRY
		{
			mTRY();

		}
			break;
		case 25:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:151:
			// TYPEOF
		{
			mTYPEOF();

		}
			break;
		case 26:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:158:
			// VAR
		{
			mVAR();

		}
			break;
		case 27:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:162:
			// VOID
		{
			mVOID();

		}
			break;
		case 28:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:167:
			// WHILE
		{
			mWHILE();

		}
			break;
		case 29:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:173:
			// WITH
		{
			mWITH();

		}
			break;
		case 30:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:178:
			// GET
		{
			mGET();

		}
			break;
		case 31:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:182:
			// SET
		{
			mSET();

		}
			break;
		case 32:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:186:
			// ABSTRACT
		{
			mABSTRACT();

		}
			break;
		case 33:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:195:
			// BOOLEAN
		{
			mBOOLEAN();

		}
			break;
		case 34:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:203:
			// BYTE
		{
			mBYTE();

		}
			break;
		case 35:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:208:
			// CHAR
		{
			mCHAR();

		}
			break;
		case 36:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:213:
			// CLASS
		{
			mCLASS();

		}
			break;
		case 37:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:219:
			// CONST
		{
			mCONST();

		}
			break;
		case 38:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:225:
			// DEBUGGER
		{
			mDEBUGGER();

		}
			break;
		case 39:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:234:
			// DOUBLE
		{
			mDOUBLE();

		}
			break;
		case 40:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:241:
			// ENUM
		{
			mENUM();

		}
			break;
		case 41:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:246:
			// EXPORT
		{
			mEXPORT();

		}
			break;
		case 42:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:253:
			// EXTENDS
		{
			mEXTENDS();

		}
			break;
		case 43:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:261:
			// FINAL
		{
			mFINAL();

		}
			break;
		case 44:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:267:
			// FLOAT
		{
			mFLOAT();

		}
			break;
		case 45:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:273:
			// GOTO
		{
			mGOTO();

		}
			break;
		case 46:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:278:
			// IMPLEMENTS
		{
			mIMPLEMENTS();

		}
			break;
		case 47:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:289:
			// IMPORT
		{
			mIMPORT();

		}
			break;
		case 48:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:296:
			// INT
		{
			mINT();

		}
			break;
		case 49:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:300:
			// INTERFACE
		{
			mINTERFACE();

		}
			break;
		case 50:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:310:
			// LONG
		{
			mLONG();

		}
			break;
		case 51:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:315:
			// NATIVE
		{
			mNATIVE();

		}
			break;
		case 52:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:322:
			// PACKAGE
		{
			mPACKAGE();

		}
			break;
		case 53:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:330:
			// PRIVATE
		{
			mPRIVATE();

		}
			break;
		case 54:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:338:
			// PROTECTED
		{
			mPROTECTED();

		}
			break;
		case 55:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:348:
			// PUBLIC
		{
			mPUBLIC();

		}
			break;
		case 56:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:355:
			// SHORT
		{
			mSHORT();

		}
			break;
		case 57:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:361:
			// STATIC
		{
			mSTATIC();

		}
			break;
		case 58:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:368:
			// SUPER
		{
			mSUPER();

		}
			break;
		case 59:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:374:
			// SYNCHRONIZED
		{
			mSYNCHRONIZED();

		}
			break;
		case 60:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:387:
			// THROWS
		{
			mTHROWS();

		}
			break;
		case 61:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:394:
			// TRANSIENT
		{
			mTRANSIENT();

		}
			break;
		case 62:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:404:
			// VOLATILE
		{
			mVOLATILE();

		}
			break;
		case 63:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:413:
			// LBRACE
		{
			mLBRACE();

		}
			break;
		case 64:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:420:
			// RBRACE
		{
			mRBRACE();

		}
			break;
		case 65:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:427:
			// LPAREN
		{
			mLPAREN();

		}
			break;
		case 66:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:434:
			// RPAREN
		{
			mRPAREN();

		}
			break;
		case 67:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:441:
			// LBRACK
		{
			mLBRACK();

		}
			break;
		case 68:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:448:
			// RBRACK
		{
			mRBRACK();

		}
			break;
		case 69:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:455:
			// DOT
		{
			mDOT();

		}
			break;
		case 70:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:459:
			// SEMIC
		{
			mSEMIC();

		}
			break;
		case 71:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:465:
			// COMMA
		{
			mCOMMA();

		}
			break;
		case 72:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:471:
			// LT
		{
			mLT();

		}
			break;
		case 73:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:474:
			// GT
		{
			mGT();

		}
			break;
		case 74:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:477:
			// LTE
		{
			mLTE();

		}
			break;
		case 75:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:481:
			// GTE
		{
			mGTE();

		}
			break;
		case 76:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:485:
			// EQ
		{
			mEQ();

		}
			break;
		case 77:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:488:
			// NEQ
		{
			mNEQ();

		}
			break;
		case 78:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:492:
			// SAME
		{
			mSAME();

		}
			break;
		case 79:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:497:
			// NSAME
		{
			mNSAME();

		}
			break;
		case 80:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:503:
			// ADD
		{
			mADD();

		}
			break;
		case 81:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:507:
			// SUB
		{
			mSUB();

		}
			break;
		case 82:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:511:
			// MUL
		{
			mMUL();

		}
			break;
		case 83:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:515:
			// MOD
		{
			mMOD();

		}
			break;
		case 84:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:519:
			// INC
		{
			mINC();

		}
			break;
		case 85:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:523:
			// DEC
		{
			mDEC();

		}
			break;
		case 86:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:527:
			// SHL
		{
			mSHL();

		}
			break;
		case 87:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:531:
			// SHR
		{
			mSHR();

		}
			break;
		case 88:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:535:
			// SHU
		{
			mSHU();

		}
			break;
		case 89:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:539:
			// AND
		{
			mAND();

		}
			break;
		case 90:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:543:
			// OR
		{
			mOR();

		}
			break;
		case 91:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:546:
			// XOR
		{
			mXOR();

		}
			break;
		case 92:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:550:
			// NOT
		{
			mNOT();

		}
			break;
		case 93:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:554:
			// INV
		{
			mINV();

		}
			break;
		case 94:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:558:
			// LAND
		{
			mLAND();

		}
			break;
		case 95:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:563:
			// LOR
		{
			mLOR();

		}
			break;
		case 96:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:567:
			// QUE
		{
			mQUE();

		}
			break;
		case 97:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:571:
			// COLON
		{
			mCOLON();

		}
			break;
		case 98:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:577:
			// ASSIGN
		{
			mASSIGN();

		}
			break;
		case 99:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:584:
			// ADDASS
		{
			mADDASS();

		}
			break;
		case 100:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:591:
			// SUBASS
		{
			mSUBASS();

		}
			break;
		case 101:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:598:
			// MULASS
		{
			mMULASS();

		}
			break;
		case 102:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:605:
			// MODASS
		{
			mMODASS();

		}
			break;
		case 103:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:612:
			// SHLASS
		{
			mSHLASS();

		}
			break;
		case 104:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:619:
			// SHRASS
		{
			mSHRASS();

		}
			break;
		case 105:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:626:
			// SHUASS
		{
			mSHUASS();

		}
			break;
		case 106:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:633:
			// ANDASS
		{
			mANDASS();

		}
			break;
		case 107:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:640:
			// ORASS
		{
			mORASS();

		}
			break;
		case 108:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:646:
			// XORASS
		{
			mXORASS();

		}
			break;
		case 109:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:653:
			// DIV
		{
			mDIV();

		}
			break;
		case 110:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:657:
			// DIVASS
		{
			mDIVASS();

		}
			break;
		case 111:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:664:
			// WhiteSpace
		{
			mWhiteSpace();

		}
			break;
		case 112:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:675:
			// EOL
		{
			mEOL();

		}
			break;
		case 113:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:679:
			// MultiLineComment
		{
			mMultiLineComment();

		}
			break;
		case 114:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:696:
			// SingleLineComment
		{
			mSingleLineComment();

		}
			break;
		case 115:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:714:
			// Identifier
		{
			mIdentifier();

		}
			break;
		case 116:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:725:
			// DecimalLiteral
		{
			mDecimalLiteral();

		}
			break;
		case 117:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:740:
			// OctalIntegerLiteral
		{
			mOctalIntegerLiteral();

		}
			break;
		case 118:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:760:
			// HexIntegerLiteral
		{
			mHexIntegerLiteral();

		}
			break;
		case 119:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:778:
			// StringLiteral
		{
			mStringLiteral();

		}
			break;
		case 120:
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1:792:
			// RegularExpressionLiteral
		{
			mRegularExpressionLiteral();

		}
			break;

		}

	}

	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA19_eotS = "\1\uffff\2\4\3\uffff\1\4";
	static final String DFA19_eofS = "\7\uffff";
	static final String DFA19_minS = "\3\56\3\uffff\1\56";
	static final String DFA19_maxS = "\1\71\1\56\1\71\3\uffff\1\71";
	static final String DFA19_acceptS = "\3\uffff\1\2\1\3\1\1\1\uffff";
	static final String DFA19_specialS = "\7\uffff}>";
	static final String[] DFA19_transitionS = { "\1\3\1\uffff\1\1\11\2",
			"\1\5", "\1\5\1\uffff\12\6", "", "", "", "\1\5\1\uffff\12\6" };

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA
			.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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
			return "709:1: DecimalLiteral : ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? );";
		}
	}

}
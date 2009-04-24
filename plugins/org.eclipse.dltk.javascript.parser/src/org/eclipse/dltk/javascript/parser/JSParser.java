// $ANTLR 3.0.1 /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g 2009-04-16 12:58:55

package org.eclipse.dltk.javascript.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

public class JSParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK",
			"CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE",
			"FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF",
			"NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR",
			"VOID", "WHILE", "WITH", "GET", "SET", "ABSTRACT", "BOOLEAN",
			"BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM",
			"EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS",
			"IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE",
			"PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER",
			"SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE",
			"RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC",
			"COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME",
			"ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU",
			"AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON",
			"ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS",
			"SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS",
			"ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "CALL", "CEXPR",
			"EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE",
			"NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "BSLASH",
			"DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP",
			"WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL",
			"MultiLineComment", "SingleLineComment", "Identifier",
			"StringLiteral", "HexDigit", "IdentifierStartASCII",
			"DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart",
			"RegularExpressionLiteral", "OctalDigit", "ExponentPart",
			"DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral",
			"HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree",
			"OctalEscapeSequence", "HexEscapeSequence",
			"UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence",
			"RegularExpressionFirstChar", "RegularExpressionChar" };
	public static final int VT = 137;
	public static final int LOR = 98;
	public static final int FUNCTION = 18;
	public static final int PACKAGE = 55;
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
	public static final int DQUOTE = 134;
	public static final int DO = 13;
	public static final int NOT = 95;
	public static final int DecimalDigit = 155;
	public static final int BYFIELD = 117;
	public static final int EOF = -1;
	public static final int CEXPR = 120;
	public static final int BREAK = 7;
	public static final int Identifier = 151;
	public static final int DIVASS = 113;
	public static final int BYINDEX = 118;
	public static final int FORSTEP = 123;
	public static final int FINAL = 46;
	public static final int RPAREN = 69;
	public static final int INC = 87;
	public static final int IMPORT = 50;
	public static final int EOL = 148;
	public static final int POS = 132;
	public static final int OctalDigit = 159;
	public static final int THIS = 25;
	public static final int RETURN = 23;
	public static final int ExponentPart = 160;
	public static final int ARGS = 114;
	public static final int DOUBLE = 42;
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
	public static final int MULASS = 104;
	public static final int THROW = 26;
	public static final int PINC = 131;
	public static final int OctalIntegerLiteral = 163;
	public static final int PROTECTED = 57;
	public static final int DEC = 88;
	public static final int CLASS = 39;
	public static final int LBRACK = 70;
	public static final int HexEscapeSequence = 168;
	public static final int ORASS = 110;
	public static final int SingleLineComment = 150;
	public static final int NAMEDVALUE = 126;
	public static final int LBRACE = 66;
	public static final int GTE = 78;
	public static final int FOR = 16;
	public static final int RegularExpressionLiteral = 158;
	public static final int SUB = 84;
	public static final int FLOAT = 47;
	public static final int ABSTRACT = 35;
	public static final int AND = 92;
	public static final int DecimalIntegerLiteral = 161;
	public static final int HexDigit = 153;
	public static final int LTE = 77;
	public static final int LPAREN = 68;
	public static final int IF = 19;
	public static final int SUBASS = 103;
	public static final int EXPR = 121;
	public static final int BOOLEAN = 36;
	public static final int SYNCHRONIZED = 62;
	public static final int IN = 20;
	public static final int IMPLEMENTS = 49;
	public static final int OBJECT = 128;
	public static final int CONTINUE = 10;
	public static final int COMMA = 74;
	public static final int FORITER = 122;
	public static final int TRANSIENT = 64;
	public static final int SHRASS = 107;
	public static final int MODASS = 105;
	public static final int PS = 146;
	public static final int DOT = 72;
	public static final int IdentifierPart = 156;
	public static final int MultiLineComment = 149;
	public static final int WITH = 32;
	public static final int ADD = 83;
	public static final int BYTE = 37;
	public static final int XOR = 94;
	public static final int ZeroToThree = 166;
	public static final int ITEM = 124;
	public static final int VOLATILE = 65;
	public static final int UnicodeEscapeSequence = 169;
	public static final int SHUASS = 108;
	public static final int DEFAULT = 11;
	public static final int NSAME = 82;
	public static final int TAB = 136;
	public static final int SET = 34;
	public static final int SHORT = 59;
	public static final int INSTANCEOF = 21;
	public static final int SQUOTE = 135;
	public static final int DecimalLiteral = 162;
	public static final int TRUE = 5;
	public static final int SAME = 81;
	public static final int StringLiteral = 152;
	public static final int COLON = 100;
	public static final int PAREXPR = 129;
	public static final int NEQ = 80;
	public static final int ENUM = 43;
	public static final int FINALLY = 15;
	public static final int HexIntegerLiteral = 164;
	public static final int NBSP = 140;
	public static final int SP = 139;
	public static final int BLOCK = 116;
	public static final int LineTerminator = 147;
	public static final int NEG = 127;
	public static final int ASSIGN = 101;
	public static final int INTERFACE = 52;
	public static final int DIV = 112;
	public static final int SEMIC = 73;
	public static final int CR = 144;
	public static final int LONG = 53;
	public static final int EXTENDS = 45;
	public static final int PUBLIC = 58;
	public static final int BSLASH = 133;
	public static final int LF = 143;

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

	public String[] getTokenNames() {
		return tokenNames;
	}

	public String getGrammarFileName() {
		return "/home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g";
	}

	private final boolean isLeftHandSideAssign(RuleReturnScope lhs,
			Object[] cached) {
		if (cached[0] != null) {
			return ((Boolean) cached[0]).booleanValue();
		}

		boolean result;
		if (isLeftHandSideExpression(lhs)) {
			switch (input.LA(1)) {
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
		} else {
			result = false;
		}

		cached[0] = new Boolean(result);
		return result;
	}

	private final static boolean isLeftHandSideExpression(RuleReturnScope lhs) {
		if (lhs.getTree() == null) // e.g. during backtracking
		{
			return true;
		} else {
			switch (((Tree) lhs.getTree()).getType()) {
			// primaryExpression
			case THIS:
			case Identifier:
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

	private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached) {
		if (cached[0] != null) {
			return ((Boolean) cached[0]).booleanValue();
		}

		boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
		cached[0] = new Boolean(result);
		return result;
	}

	private final void promoteEOL(ParserRuleReturnScope rule) {
		// Get current token and its type (the possibly offending token).
		Token lt = input.LT(1);
		int la = lt.getType();

		// We only need to promote an EOL when the current token is offending
		// (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
		// EOL and MultiLineComment are not offending as they're already
		// promoted in a previous call to this method.
		// Promoting an EOL means switching it from off channel to on channel.
		// A MultiLineComment gets promoted when it contains an EOL.
		if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment)) {
			// Start on the possition before the current token and scan
			// backwards off channel tokens until the previous on channel token.
			for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--) {
				lt = input.get(ix);
				if (lt.getChannel() == Token.DEFAULT_CHANNEL) {
					// On channel token found: stop scanning.
					break;
				} else if (lt.getType() == EOL
						|| (lt.getType() == MultiLineComment && lt.getText()
								.matches("/.*\r\n|\r|\n"))) {
					// We found our EOL: promote the token to on channel,
					// position the input on it and reset the rule start.
					lt.setChannel(Token.DEFAULT_CHANNEL);
					input.seek(lt.getTokenIndex());
					if (rule != null) {
						rule.start = lt;
					}
					break;
				}
			}
		}
	}

	public static class token_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start token
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:479:1:
	// token : ( reservedWord | Identifier | punctuator | numericLiteral |
	// StringLiteral );
	public final token_return token() throws RecognitionException {
		token_return retval = new token_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier2 = null;
		Token StringLiteral5 = null;
		reservedWord_return reservedWord1 = null;

		punctuator_return punctuator3 = null;

		numericLiteral_return numericLiteral4 = null;

		Object Identifier2_tree = null;
		Object StringLiteral5_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:480:2:
			// ( reservedWord | Identifier | punctuator | numericLiteral |
			// StringLiteral )
			int alt1 = 5;
			switch (input.LA(1)) {
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
			case VOLATILE: {
				alt1 = 1;
			}
				break;
			case Identifier: {
				alt1 = 2;
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
			case DIVASS: {
				alt1 = 3;
			}
				break;
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt1 = 4;
			}
				break;
			case StringLiteral: {
				alt1 = 5;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"479:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral );",
						1, 0, input);

				throw nvae;
			}

			switch (alt1) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:480:4:
				// reservedWord
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_reservedWord_in_token1777);
				reservedWord1 = reservedWord();
				_fsp--;

				adaptor.addChild(root_0, reservedWord1.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:481:4:
				// Identifier
			{
				root_0 = (Object) adaptor.nil();

				Identifier2 = (Token) input.LT(1);
				match(input, Identifier, FOLLOW_Identifier_in_token1782);
				Identifier2_tree = (Object) adaptor.create(Identifier2);
				adaptor.addChild(root_0, Identifier2_tree);

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:482:4:
				// punctuator
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_punctuator_in_token1787);
				punctuator3 = punctuator();
				_fsp--;

				adaptor.addChild(root_0, punctuator3.getTree());

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:483:4:
				// numericLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_numericLiteral_in_token1792);
				numericLiteral4 = numericLiteral();
				_fsp--;

				adaptor.addChild(root_0, numericLiteral4.getTree());

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:484:4:
				// StringLiteral
			{
				root_0 = (Object) adaptor.nil();

				StringLiteral5 = (Token) input.LT(1);
				match(input, StringLiteral, FOLLOW_StringLiteral_in_token1797);
				StringLiteral5_tree = (Object) adaptor.create(StringLiteral5);
				adaptor.addChild(root_0, StringLiteral5_tree);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end token

	public static class reservedWord_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start reservedWord
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:489:1:
	// reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
	public final reservedWord_return reservedWord() throws RecognitionException {
		reservedWord_return retval = new reservedWord_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NULL8 = null;
		keyword_return keyword6 = null;

		futureReservedWord_return futureReservedWord7 = null;

		booleanLiteral_return booleanLiteral9 = null;

		Object NULL8_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:490:2:
			// ( keyword | futureReservedWord | NULL | booleanLiteral )
			int alt2 = 4;
			switch (input.LA(1)) {
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
			case SET: {
				alt2 = 1;
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
			case VOLATILE: {
				alt2 = 2;
			}
				break;
			case NULL: {
				alt2 = 3;
			}
				break;
			case TRUE:
			case FALSE: {
				alt2 = 4;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"489:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );",
						2, 0, input);

				throw nvae;
			}

			switch (alt2) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:490:4:
				// keyword
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_keyword_in_reservedWord1810);
				keyword6 = keyword();
				_fsp--;

				adaptor.addChild(root_0, keyword6.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:491:4:
				// futureReservedWord
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_futureReservedWord_in_reservedWord1815);
				futureReservedWord7 = futureReservedWord();
				_fsp--;

				adaptor.addChild(root_0, futureReservedWord7.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:492:4:
				// NULL
			{
				root_0 = (Object) adaptor.nil();

				NULL8 = (Token) input.LT(1);
				match(input, NULL, FOLLOW_NULL_in_reservedWord1820);
				NULL8_tree = (Object) adaptor.create(NULL8);
				adaptor.addChild(root_0, NULL8_tree);

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:493:4:
				// booleanLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_booleanLiteral_in_reservedWord1825);
				booleanLiteral9 = booleanLiteral();
				_fsp--;

				adaptor.addChild(root_0, booleanLiteral9.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end reservedWord

	public static class keyword_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start keyword
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:500:1:
	// keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO |
	// ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF
	// | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID |
	// WHILE | WITH );
	public final keyword_return keyword() throws RecognitionException {
		keyword_return retval = new keyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set10 = null;

		// Object set10_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:501:2:
			// ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE
			// | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN |
			// INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF
			// | VAR | VOID | WHILE | WITH )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				root_0 = (Object) adaptor.nil();

				set10 = (Token) input.LT(1);
				if ((input.LA(1) >= BREAK && input.LA(1) <= SET)) {
					input.consume();
					adaptor.addChild(root_0, adaptor.create(set10));
					errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recoverFromMismatchedSet(input, mse, FOLLOW_set_in_keyword0);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end keyword

	public static class futureReservedWord_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start futureReservedWord
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:535:1:
	// futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST |
	// DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO |
	// IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE
	// | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS |
	// TRANSIENT | VOLATILE );
	public final futureReservedWord_return futureReservedWord()
			throws RecognitionException {
		futureReservedWord_return retval = new futureReservedWord_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set11 = null;

		// Object set11_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:536:2:
			// ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER |
			// DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO |
			// IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE |
			// PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER |
			// SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				root_0 = (Object) adaptor.nil();

				set11 = (Token) input.LT(1);
				if ((input.LA(1) >= ABSTRACT && input.LA(1) <= VOLATILE)) {
					input.consume();
					adaptor.addChild(root_0, adaptor.create(set11));
					errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recoverFromMismatchedSet(input, mse,
							FOLLOW_set_in_futureReservedWord0);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end futureReservedWord

	public static class punctuator_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start punctuator
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:613:1:
	// punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT
	// | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD |
	// SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT |
	// INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS |
	// MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV |
	// DIVASS );
	public final punctuator_return punctuator() throws RecognitionException {
		punctuator_return retval = new punctuator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set12 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:614:2:
			// ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT |
			// SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME |
			// ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR |
			// XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS |
			// SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS |
			// ORASS | XORASS | DIV | DIVASS )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				root_0 = (Object) adaptor.nil();

				set12 = (Token) input.LT(1);
				if ((input.LA(1) >= LBRACE && input.LA(1) <= DIVASS)) {
					input.consume();
					adaptor.addChild(root_0, adaptor.create(set12));
					errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recoverFromMismatchedSet(input, mse,
							FOLLOW_set_in_punctuator0);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end punctuator

	public static class literal_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start literal
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:668:1:
	// literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral |
	// RegularExpressionLiteral );
	public final literal_return literal() throws RecognitionException {
		literal_return retval = new literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NULL13 = null;
		Token StringLiteral16 = null;
		Token RegularExpressionLiteral17 = null;
		booleanLiteral_return booleanLiteral14 = null;

		numericLiteral_return numericLiteral15 = null;

		Object NULL13_tree = null;
		Object StringLiteral16_tree = null;
		Object RegularExpressionLiteral17_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:669:2:
			// ( NULL | booleanLiteral | numericLiteral | StringLiteral |
			// RegularExpressionLiteral )
			int alt3 = 5;
			switch (input.LA(1)) {
			case NULL: {
				alt3 = 1;
			}
				break;
			case TRUE:
			case FALSE: {
				alt3 = 2;
			}
				break;
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt3 = 3;
			}
				break;
			case StringLiteral: {
				alt3 = 4;
			}
				break;
			case RegularExpressionLiteral: {
				alt3 = 5;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"668:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );",
						3, 0, input);

				throw nvae;
			}

			switch (alt3) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:669:4:
				// NULL
			{
				root_0 = (Object) adaptor.nil();

				NULL13 = (Token) input.LT(1);
				match(input, NULL, FOLLOW_NULL_in_literal2521);
				NULL13_tree = (Object) adaptor.create(NULL13);
				adaptor.addChild(root_0, NULL13_tree);

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:670:4:
				// booleanLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_booleanLiteral_in_literal2526);
				booleanLiteral14 = booleanLiteral();
				_fsp--;

				adaptor.addChild(root_0, booleanLiteral14.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:671:4:
				// numericLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_numericLiteral_in_literal2531);
				numericLiteral15 = numericLiteral();
				_fsp--;

				adaptor.addChild(root_0, numericLiteral15.getTree());

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:672:4:
				// StringLiteral
			{
				root_0 = (Object) adaptor.nil();

				StringLiteral16 = (Token) input.LT(1);
				match(input, StringLiteral, FOLLOW_StringLiteral_in_literal2536);
				StringLiteral16_tree = (Object) adaptor.create(StringLiteral16);
				adaptor.addChild(root_0, StringLiteral16_tree);

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:673:4:
				// RegularExpressionLiteral
			{
				root_0 = (Object) adaptor.nil();

				RegularExpressionLiteral17 = (Token) input.LT(1);
				match(input, RegularExpressionLiteral,
						FOLLOW_RegularExpressionLiteral_in_literal2541);
				RegularExpressionLiteral17_tree = (Object) adaptor
						.create(RegularExpressionLiteral17);
				adaptor.addChild(root_0, RegularExpressionLiteral17_tree);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end literal

	public static class booleanLiteral_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start booleanLiteral
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:676:1:
	// booleanLiteral : ( TRUE | FALSE );
	public final booleanLiteral_return booleanLiteral()
			throws RecognitionException {
		booleanLiteral_return retval = new booleanLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set18 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:677:2:
			// ( TRUE | FALSE )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				root_0 = (Object) adaptor.nil();

				set18 = (Token) input.LT(1);
				if ((input.LA(1) >= TRUE && input.LA(1) <= FALSE)) {
					input.consume();
					adaptor.addChild(root_0, adaptor.create(set18));
					errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recoverFromMismatchedSet(input, mse,
							FOLLOW_set_in_booleanLiteral0);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end booleanLiteral

	public static class numericLiteral_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start numericLiteral
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:723:1:
	// numericLiteral : ( DecimalLiteral | OctalIntegerLiteral |
	// HexIntegerLiteral );
	public final numericLiteral_return numericLiteral()
			throws RecognitionException {
		numericLiteral_return retval = new numericLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set19 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:724:2:
			// ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				root_0 = (Object) adaptor.nil();

				set19 = (Token) input.LT(1);
				if ((input.LA(1) >= DecimalLiteral && input.LA(1) <= HexIntegerLiteral)) {
					input.consume();
					adaptor.addChild(root_0, adaptor.create(set19));
					errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recoverFromMismatchedSet(input, mse,
							FOLLOW_set_in_numericLiteral0);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end numericLiteral

	public static class primaryExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start primaryExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:811:1:
	// primaryExpression : ( THIS | Identifier | literal | arrayLiteral |
	// objectLiteral | lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar,
	// \"PAREXPR\"] expression ) );
	public final primaryExpression_return primaryExpression()
			throws RecognitionException {
		primaryExpression_return retval = new primaryExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lpar = null;
		Token THIS20 = null;
		Token Identifier21 = null;
		Token RPAREN26 = null;
		literal_return literal22 = null;

		arrayLiteral_return arrayLiteral23 = null;

		objectLiteral_return objectLiteral24 = null;

		expression_return expression25 = null;

		Object lpar_tree = null;
		Object THIS20_tree = null;
		Object Identifier21_tree = null;
		Object RPAREN26_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:812:2:
			// ( THIS | Identifier | literal | arrayLiteral | objectLiteral |
			// lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"]
			// expression ) )
			int alt4 = 6;
			switch (input.LA(1)) {
			case THIS: {
				alt4 = 1;
			}
				break;
			case Identifier: {
				alt4 = 2;
			}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case StringLiteral:
			case RegularExpressionLiteral:
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt4 = 3;
			}
				break;
			case LBRACK: {
				alt4 = 4;
			}
				break;
			case LBRACE: {
				alt4 = 5;
			}
				break;
			case LPAREN: {
				alt4 = 6;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"811:1: primaryExpression : ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) );",
						4, 0, input);

				throw nvae;
			}

			switch (alt4) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:812:4:
				// THIS
			{
				root_0 = (Object) adaptor.nil();

				THIS20 = (Token) input.LT(1);
				match(input, THIS, FOLLOW_THIS_in_primaryExpression3154);
				THIS20_tree = (Object) adaptor.create(THIS20);
				adaptor.addChild(root_0, THIS20_tree);

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:813:4:
				// Identifier
			{
				root_0 = (Object) adaptor.nil();

				Identifier21 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_primaryExpression3159);
				Identifier21_tree = (Object) adaptor.create(Identifier21);
				adaptor.addChild(root_0, Identifier21_tree);

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:814:4:
				// literal
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_literal_in_primaryExpression3164);
				literal22 = literal();
				_fsp--;

				adaptor.addChild(root_0, literal22.getTree());

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:815:4:
				// arrayLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3169);
				arrayLiteral23 = arrayLiteral();
				_fsp--;

				adaptor.addChild(root_0, arrayLiteral23.getTree());

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:816:4:
				// objectLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_objectLiteral_in_primaryExpression3174);
				objectLiteral24 = objectLiteral();
				_fsp--;

				adaptor.addChild(root_0, objectLiteral24.getTree());

			}
				break;
			case 6:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:4:
				// lpar= LPAREN expression RPAREN
			{
				lpar = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_primaryExpression3181);
				stream_LPAREN.add(lpar);

				pushFollow(FOLLOW_expression_in_primaryExpression3183);
				expression25 = expression();
				_fsp--;

				stream_expression.add(expression25.getTree());
				RPAREN26 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_primaryExpression3185);
				stream_RPAREN.add(RPAREN26);

				// AST REWRITE
				// elements: expression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 817:34: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:817:37:
					// ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								PAREXPR, lpar, "PAREXPR"), root_1);

						adaptor.addChild(root_1, stream_expression.next());

						adaptor.addChild(root_0, root_1);
					}

				}

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end primaryExpression

	public static class arrayLiteral_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start arrayLiteral
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:820:1:
	// arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK ->
	// ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
	public final arrayLiteral_return arrayLiteral() throws RecognitionException {
		arrayLiteral_return retval = new arrayLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lb = null;
		Token COMMA28 = null;
		Token RBRACK30 = null;
		arrayItem_return arrayItem27 = null;

		arrayItem_return arrayItem29 = null;

		Object lb_tree = null;
		Object COMMA28_tree = null;
		Object RBRACK30_tree = null;
		RewriteRuleTokenStream stream_RBRACK = new RewriteRuleTokenStream(
				adaptor, "token RBRACK");
		RewriteRuleTokenStream stream_LBRACK = new RewriteRuleTokenStream(
				adaptor, "token LBRACK");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_arrayItem = new RewriteRuleSubtreeStream(
				adaptor, "rule arrayItem");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:2:
			// (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^(
			// ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:4:
			// lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
			{
				lb = (Token) input.LT(1);
				match(input, LBRACK, FOLLOW_LBRACK_in_arrayLiteral3209);
				stream_LBRACK.add(lb);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:14:
				// ( arrayItem ( COMMA arrayItem )* )?
				int alt6 = 2;
				int LA6_0 = input.LA(1);

				if (((LA6_0 >= NULL && LA6_0 <= FALSE) || LA6_0 == DELETE
						|| LA6_0 == FUNCTION || LA6_0 == NEW || LA6_0 == THIS
						|| LA6_0 == TYPEOF || LA6_0 == VOID || LA6_0 == LBRACE
						|| LA6_0 == LPAREN || LA6_0 == LBRACK || LA6_0 == COMMA
						|| (LA6_0 >= ADD && LA6_0 <= SUB)
						|| (LA6_0 >= INC && LA6_0 <= DEC)
						|| (LA6_0 >= NOT && LA6_0 <= INV)
						|| (LA6_0 >= Identifier && LA6_0 <= StringLiteral)
						|| LA6_0 == RegularExpressionLiteral || (LA6_0 >= DecimalLiteral && LA6_0 <= HexIntegerLiteral))) {
					alt6 = 1;
				} else if ((LA6_0 == RBRACK)) {
					int LA6_2 = input.LA(2);

					if ((input.LA(1) == COMMA)) {
						alt6 = 1;
					}
				}
				switch (alt6) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:16:
					// arrayItem ( COMMA arrayItem )*
				{
					pushFollow(FOLLOW_arrayItem_in_arrayLiteral3213);
					arrayItem27 = arrayItem();
					_fsp--;

					stream_arrayItem.add(arrayItem27.getTree());
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:26:
					// ( COMMA arrayItem )*
					loop5: do {
						int alt5 = 2;
						int LA5_0 = input.LA(1);

						if ((LA5_0 == COMMA)) {
							alt5 = 1;
						}

						switch (alt5) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:821:28:
							// COMMA arrayItem
						{
							COMMA28 = (Token) input.LT(1);
							match(input, COMMA,
									FOLLOW_COMMA_in_arrayLiteral3217);
							stream_COMMA.add(COMMA28);

							pushFollow(FOLLOW_arrayItem_in_arrayLiteral3219);
							arrayItem29 = arrayItem();
							_fsp--;

							stream_arrayItem.add(arrayItem29.getTree());

						}
							break;

						default:
							break loop5;
						}
					} while (true);

				}
					break;

				}

				RBRACK30 = (Token) input.LT(1);
				match(input, RBRACK, FOLLOW_RBRACK_in_arrayLiteral3227);
				stream_RBRACK.add(RBRACK30);

				// AST REWRITE
				// elements: arrayItem
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 822:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:822:5:
					// ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								ARRAY, lb, "ARRAY"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:822:28:
						// ( arrayItem )*
						while (stream_arrayItem.hasNext()) {
							adaptor.addChild(root_1, stream_arrayItem.next());

						}
						stream_arrayItem.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end arrayLiteral

	public static class arrayItem_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start arrayItem
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:825:1:
	// arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? )
	// ;
	public final arrayItem_return arrayItem() throws RecognitionException {
		arrayItem_return retval = new arrayItem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		assignmentExpression_return expr = null;

		RewriteRuleSubtreeStream stream_assignmentExpression = new RewriteRuleSubtreeStream(
				adaptor, "rule assignmentExpression");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:2:
			// ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:4:
			// (expr= assignmentExpression | {...}?)
			{
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:4:
				// (expr= assignmentExpression | {...}?)
				int alt7 = 2;
				int LA7_0 = input.LA(1);

				if (((LA7_0 >= NULL && LA7_0 <= FALSE) || LA7_0 == DELETE
						|| LA7_0 == FUNCTION || LA7_0 == NEW || LA7_0 == THIS
						|| LA7_0 == TYPEOF || LA7_0 == VOID || LA7_0 == LBRACE
						|| LA7_0 == LPAREN || LA7_0 == LBRACK
						|| (LA7_0 >= ADD && LA7_0 <= SUB)
						|| (LA7_0 >= INC && LA7_0 <= DEC)
						|| (LA7_0 >= NOT && LA7_0 <= INV)
						|| (LA7_0 >= Identifier && LA7_0 <= StringLiteral)
						|| LA7_0 == RegularExpressionLiteral || (LA7_0 >= DecimalLiteral && LA7_0 <= HexIntegerLiteral))) {
					alt7 = 1;
				} else if ((LA7_0 == RBRACK || LA7_0 == COMMA)) {
					alt7 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"826:4: (expr= assignmentExpression | {...}?)", 7,
							0, input);

					throw nvae;
				}
				switch (alt7) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:6:
					// expr= assignmentExpression
				{
					pushFollow(FOLLOW_assignmentExpression_in_arrayItem3255);
					expr = assignmentExpression();
					_fsp--;

					stream_assignmentExpression.add(expr.getTree());

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:826:34:
					// {...}?
				{
					if (!(input.LA(1) == COMMA)) {
						throw new FailedPredicateException(input, "arrayItem",
								" input.LA(1) == COMMA ");
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
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);
				RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
						adaptor, "token expr", expr != null ? expr.tree : null);

				root_0 = (Object) adaptor.nil();
				// 827:2: -> ^( ITEM ( $expr)? )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:5:
					// ^( ITEM ( $expr)? )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								ITEM, "ITEM"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:827:13:
						// ( $expr)?
						if (stream_expr.hasNext()) {
							adaptor.addChild(root_1, stream_expr.next());

						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end arrayItem

	public static class objectLiteral_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start objectLiteral
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:830:1:
	// objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA
	// objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] (
	// objectPropertyInitializer )* ) ;
	public final objectLiteral_return objectLiteral()
			throws RecognitionException {
		objectLiteral_return retval = new objectLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lb = null;
		Token COMMA32 = null;
		Token RBRACE34 = null;
		objectPropertyInitializer_return objectPropertyInitializer31 = null;

		objectPropertyInitializer_return objectPropertyInitializer33 = null;

		Object lb_tree = null;
		Object COMMA32_tree = null;
		Object RBRACE34_tree = null;
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_objectPropertyInitializer = new RewriteRuleSubtreeStream(
				adaptor, "rule objectPropertyInitializer");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:831:2:
			// (lb= LBRACE ( objectPropertyInitializer ( COMMA
			// objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb,
			// \"OBJECT\"] ( objectPropertyInitializer )* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:831:4:
			// lb= LBRACE ( objectPropertyInitializer ( COMMA
			// objectPropertyInitializer )* )? RBRACE
			{
				lb = (Token) input.LT(1);
				match(input, LBRACE, FOLLOW_LBRACE_in_objectLiteral3287);
				stream_LBRACE.add(lb);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:831:14:
				// ( objectPropertyInitializer ( COMMA objectPropertyInitializer
				// )* )?
				int alt9 = 2;
				int LA9_0 = input.LA(1);

				if (((LA9_0 >= GET && LA9_0 <= SET)
						|| (LA9_0 >= Identifier && LA9_0 <= StringLiteral) || (LA9_0 >= DecimalLiteral && LA9_0 <= HexIntegerLiteral))) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:831:16:
					// objectPropertyInitializer ( COMMA
					// objectPropertyInitializer )*
				{
					pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3291);
					objectPropertyInitializer31 = objectPropertyInitializer();
					_fsp--;

					stream_objectPropertyInitializer
							.add(objectPropertyInitializer31.getTree());
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:831:42:
					// ( COMMA objectPropertyInitializer )*
					loop8: do {
						int alt8 = 2;
						int LA8_0 = input.LA(1);

						if ((LA8_0 == COMMA)) {
							alt8 = 1;
						}

						switch (alt8) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:831:44:
							// COMMA objectPropertyInitializer
						{
							COMMA32 = (Token) input.LT(1);
							match(input, COMMA,
									FOLLOW_COMMA_in_objectLiteral3295);
							stream_COMMA.add(COMMA32);

							pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3297);
							objectPropertyInitializer33 = objectPropertyInitializer();
							_fsp--;

							stream_objectPropertyInitializer
									.add(objectPropertyInitializer33.getTree());

						}
							break;

						default:
							break loop8;
						}
					} while (true);

				}
					break;

				}

				RBRACE34 = (Token) input.LT(1);
				match(input, RBRACE, FOLLOW_RBRACE_in_objectLiteral3305);
				stream_RBRACE.add(RBRACE34);

				// AST REWRITE
				// elements: objectPropertyInitializer
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 832:2: -> ^( OBJECT[$lb, \"OBJECT\"] (
				// objectPropertyInitializer )* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:832:5:
					// ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )*
					// )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								OBJECT, lb, "OBJECT"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:832:30:
						// ( objectPropertyInitializer )*
						while (stream_objectPropertyInitializer.hasNext()) {
							adaptor.addChild(root_1,
									stream_objectPropertyInitializer.next());

						}
						stream_objectPropertyInitializer.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end objectLiteral

	public static class objectPropertyInitializer_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start objectPropertyInitializer
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:835:1:
	// objectPropertyInitializer : ( nameValuePair | getMethodDeclaration |
	// setMethodDeclaration );
	public final objectPropertyInitializer_return objectPropertyInitializer()
			throws RecognitionException {
		objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		nameValuePair_return nameValuePair35 = null;

		getMethodDeclaration_return getMethodDeclaration36 = null;

		setMethodDeclaration_return setMethodDeclaration37 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:3:
			// ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
			int alt10 = 3;
			switch (input.LA(1)) {
			case Identifier:
			case StringLiteral:
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt10 = 1;
			}
				break;
			case GET: {
				alt10 = 2;
			}
				break;
			case SET: {
				alt10 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"835:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );",
						10, 0, input);

				throw nvae;
			}

			switch (alt10) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:836:5:
				// nameValuePair
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3330);
				nameValuePair35 = nameValuePair();
				_fsp--;

				adaptor.addChild(root_0, nameValuePair35.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:837:5:
				// getMethodDeclaration
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3337);
				getMethodDeclaration36 = getMethodDeclaration();
				_fsp--;

				adaptor.addChild(root_0, getMethodDeclaration36.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:838:5:
				// setMethodDeclaration
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3343);
				setMethodDeclaration37 = setMethodDeclaration();
				_fsp--;

				adaptor.addChild(root_0, setMethodDeclaration37.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end objectPropertyInitializer

	public static class nameValuePair_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start nameValuePair
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:841:1:
	// nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE
	// propertyName assignmentExpression ) ;
	public final nameValuePair_return nameValuePair()
			throws RecognitionException {
		nameValuePair_return retval = new nameValuePair_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COLON39 = null;
		propertyName_return propertyName38 = null;

		assignmentExpression_return assignmentExpression40 = null;

		Object COLON39_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				adaptor, "token COLON");
		RewriteRuleSubtreeStream stream_propertyName = new RewriteRuleSubtreeStream(
				adaptor, "rule propertyName");
		RewriteRuleSubtreeStream stream_assignmentExpression = new RewriteRuleSubtreeStream(
				adaptor, "rule assignmentExpression");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:842:2:
			// ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE
			// propertyName assignmentExpression ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:842:4:
			// propertyName COLON assignmentExpression
			{
				pushFollow(FOLLOW_propertyName_in_nameValuePair3356);
				propertyName38 = propertyName();
				_fsp--;

				stream_propertyName.add(propertyName38.getTree());
				COLON39 = (Token) input.LT(1);
				match(input, COLON, FOLLOW_COLON_in_nameValuePair3358);
				stream_COLON.add(COLON39);

				pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3360);
				assignmentExpression40 = assignmentExpression();
				_fsp--;

				stream_assignmentExpression.add(assignmentExpression40
						.getTree());

				// AST REWRITE
				// elements: propertyName, assignmentExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 843:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:843:5:
					// ^( NAMEDVALUE propertyName assignmentExpression )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								NAMEDVALUE, "NAMEDVALUE"), root_1);

						adaptor.addChild(root_1, stream_propertyName.next());
						adaptor.addChild(root_1, stream_assignmentExpression
								.next());

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end nameValuePair

	public static class propertyName_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start propertyName
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:846:1:
	// propertyName : ( Identifier | StringLiteral | numericLiteral );
	public final propertyName_return propertyName() throws RecognitionException {
		propertyName_return retval = new propertyName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier41 = null;
		Token StringLiteral42 = null;
		numericLiteral_return numericLiteral43 = null;

		Object Identifier41_tree = null;
		Object StringLiteral42_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:847:2:
			// ( Identifier | StringLiteral | numericLiteral )
			int alt11 = 3;
			switch (input.LA(1)) {
			case Identifier: {
				alt11 = 1;
			}
				break;
			case StringLiteral: {
				alt11 = 2;
			}
				break;
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt11 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"846:1: propertyName : ( Identifier | StringLiteral | numericLiteral );",
						11, 0, input);

				throw nvae;
			}

			switch (alt11) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:847:4:
				// Identifier
			{
				root_0 = (Object) adaptor.nil();

				Identifier41 = (Token) input.LT(1);
				match(input, Identifier, FOLLOW_Identifier_in_propertyName3384);
				Identifier41_tree = (Object) adaptor.create(Identifier41);
				adaptor.addChild(root_0, Identifier41_tree);

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:848:4:
				// StringLiteral
			{
				root_0 = (Object) adaptor.nil();

				StringLiteral42 = (Token) input.LT(1);
				match(input, StringLiteral,
						FOLLOW_StringLiteral_in_propertyName3389);
				StringLiteral42_tree = (Object) adaptor.create(StringLiteral42);
				adaptor.addChild(root_0, StringLiteral42_tree);

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:849:4:
				// numericLiteral
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_numericLiteral_in_propertyName3394);
				numericLiteral43 = numericLiteral();
				_fsp--;

				adaptor.addChild(root_0, numericLiteral43.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end propertyName

	public static class memberExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start memberExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:861:1:
	// memberExpression : ( primaryExpression | functionExpression |
	// newExpression );
	public final memberExpression_return memberExpression()
			throws RecognitionException {
		memberExpression_return retval = new memberExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		primaryExpression_return primaryExpression44 = null;

		functionExpression_return functionExpression45 = null;

		newExpression_return newExpression46 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:862:2:
			// ( primaryExpression | functionExpression | newExpression )
			int alt12 = 3;
			switch (input.LA(1)) {
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LBRACE:
			case LPAREN:
			case LBRACK:
			case Identifier:
			case StringLiteral:
			case RegularExpressionLiteral:
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt12 = 1;
			}
				break;
			case FUNCTION: {
				alt12 = 2;
			}
				break;
			case NEW: {
				alt12 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"861:1: memberExpression : ( primaryExpression | functionExpression | newExpression );",
						12, 0, input);

				throw nvae;
			}

			switch (alt12) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:862:4:
				// primaryExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_primaryExpression_in_memberExpression3412);
				primaryExpression44 = primaryExpression();
				_fsp--;

				adaptor.addChild(root_0, primaryExpression44.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:863:4:
				// functionExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_functionExpression_in_memberExpression3417);
				functionExpression45 = functionExpression();
				_fsp--;

				adaptor.addChild(root_0, functionExpression45.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:864:4:
				// newExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_newExpression_in_memberExpression3422);
				newExpression46 = newExpression();
				_fsp--;

				adaptor.addChild(root_0, newExpression46.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end memberExpression

	public static class newExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start newExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:867:1:
	// newExpression : NEW primaryExpression ;
	public final newExpression_return newExpression()
			throws RecognitionException {
		newExpression_return retval = new newExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEW47 = null;
		primaryExpression_return primaryExpression48 = null;

		Object NEW47_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:868:2:
			// ( NEW primaryExpression )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:868:4:
			// NEW primaryExpression
			{
				root_0 = (Object) adaptor.nil();

				NEW47 = (Token) input.LT(1);
				match(input, NEW, FOLLOW_NEW_in_newExpression3433);
				NEW47_tree = (Object) adaptor.create(NEW47);
				root_0 = (Object) adaptor.becomeRoot(NEW47_tree, root_0);

				pushFollow(FOLLOW_primaryExpression_in_newExpression3436);
				primaryExpression48 = primaryExpression();
				_fsp--;

				adaptor.addChild(root_0, primaryExpression48.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end newExpression

	public static class arguments_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start arguments
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:872:1:
	// arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )*
	// )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
	public final arguments_return arguments() throws RecognitionException {
		arguments_return retval = new arguments_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN49 = null;
		Token COMMA51 = null;
		Token RPAREN53 = null;
		assignmentExpression_return assignmentExpression50 = null;

		assignmentExpression_return assignmentExpression52 = null;

		Object LPAREN49_tree = null;
		Object COMMA51_tree = null;
		Object RPAREN53_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_assignmentExpression = new RewriteRuleSubtreeStream(
				adaptor, "rule assignmentExpression");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:873:2:
			// ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )*
			// )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:873:4:
			// LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )?
			// RPAREN
			{
				LPAREN49 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_arguments3449);
				stream_LPAREN.add(LPAREN49);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:873:11:
				// ( assignmentExpression ( COMMA assignmentExpression )* )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);

				if (((LA14_0 >= NULL && LA14_0 <= FALSE) || LA14_0 == DELETE
						|| LA14_0 == FUNCTION || LA14_0 == NEW
						|| LA14_0 == THIS || LA14_0 == TYPEOF || LA14_0 == VOID
						|| LA14_0 == LBRACE || LA14_0 == LPAREN
						|| LA14_0 == LBRACK || (LA14_0 >= ADD && LA14_0 <= SUB)
						|| (LA14_0 >= INC && LA14_0 <= DEC)
						|| (LA14_0 >= NOT && LA14_0 <= INV)
						|| (LA14_0 >= Identifier && LA14_0 <= StringLiteral)
						|| LA14_0 == RegularExpressionLiteral || (LA14_0 >= DecimalLiteral && LA14_0 <= HexIntegerLiteral))) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:873:13:
					// assignmentExpression ( COMMA assignmentExpression )*
				{
					pushFollow(FOLLOW_assignmentExpression_in_arguments3453);
					assignmentExpression50 = assignmentExpression();
					_fsp--;

					stream_assignmentExpression.add(assignmentExpression50
							.getTree());
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:873:34:
					// ( COMMA assignmentExpression )*
					loop13: do {
						int alt13 = 2;
						int LA13_0 = input.LA(1);

						if ((LA13_0 == COMMA)) {
							alt13 = 1;
						}

						switch (alt13) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:873:36:
							// COMMA assignmentExpression
						{
							COMMA51 = (Token) input.LT(1);
							match(input, COMMA, FOLLOW_COMMA_in_arguments3457);
							stream_COMMA.add(COMMA51);

							pushFollow(FOLLOW_assignmentExpression_in_arguments3459);
							assignmentExpression52 = assignmentExpression();
							_fsp--;

							stream_assignmentExpression
									.add(assignmentExpression52.getTree());

						}
							break;

						default:
							break loop13;
						}
					} while (true);

				}
					break;

				}

				RPAREN53 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_arguments3467);
				stream_RPAREN.add(RPAREN53);

				// AST REWRITE
				// elements: assignmentExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 874:2: -> ^( ARGS ( assignmentExpression )* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:874:5:
					// ^( ARGS ( assignmentExpression )* )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								ARGS, "ARGS"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:874:13:
						// ( assignmentExpression )*
						while (stream_assignmentExpression.hasNext()) {
							adaptor.addChild(root_1,
									stream_assignmentExpression.next());

						}
						stream_assignmentExpression.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end arguments

	public static class leftHandSideExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start leftHandSideExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:877:1:
	// leftHandSideExpression : ( memberExpression -> memberExpression ) (
	// arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK
	// expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) |
	// DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )* ;
	public final leftHandSideExpression_return leftHandSideExpression()
			throws RecognitionException {
		leftHandSideExpression_return retval = new leftHandSideExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK56 = null;
		Token RBRACK58 = null;
		Token DOT59 = null;
		Token Identifier60 = null;
		memberExpression_return memberExpression54 = null;

		arguments_return arguments55 = null;

		expression_return expression57 = null;

		Object LBRACK56_tree = null;
		Object RBRACK58_tree = null;
		Object DOT59_tree = null;
		Object Identifier60_tree = null;
		RewriteRuleTokenStream stream_RBRACK = new RewriteRuleTokenStream(
				adaptor, "token RBRACK");
		RewriteRuleTokenStream stream_LBRACK = new RewriteRuleTokenStream(
				adaptor, "token LBRACK");
		RewriteRuleTokenStream stream_DOT = new RewriteRuleTokenStream(adaptor,
				"token DOT");
		RewriteRuleTokenStream stream_Identifier = new RewriteRuleTokenStream(
				adaptor, "token Identifier");
		RewriteRuleSubtreeStream stream_memberExpression = new RewriteRuleSubtreeStream(
				adaptor, "rule memberExpression");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_arguments = new RewriteRuleSubtreeStream(
				adaptor, "rule arguments");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:878:2:
			// ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL
			// $leftHandSideExpression arguments ) | LBRACK expression RBRACK ->
			// ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier
			// -> ^( BYFIELD $leftHandSideExpression Identifier ) )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:879:2:
			// ( memberExpression -> memberExpression ) ( arguments -> ^( CALL
			// $leftHandSideExpression arguments ) | LBRACK expression RBRACK ->
			// ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier
			// -> ^( BYFIELD $leftHandSideExpression Identifier ) )*
			{
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:879:2:
				// ( memberExpression -> memberExpression )
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:880:3:
				// memberExpression
				{
					pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3496);
					memberExpression54 = memberExpression();
					_fsp--;

					stream_memberExpression.add(memberExpression54.getTree());

					// AST REWRITE
					// elements: memberExpression
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "token retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 880:22: -> memberExpression
					{
						adaptor
								.addChild(root_0, stream_memberExpression
										.next());

					}

				}

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:882:2:
				// ( arguments -> ^( CALL $leftHandSideExpression arguments ) |
				// LBRACK expression RBRACK -> ^( BYINDEX
				// $leftHandSideExpression expression ) | DOT Identifier -> ^(
				// BYFIELD $leftHandSideExpression Identifier ) )*
				loop15: do {
					int alt15 = 4;
					switch (input.LA(1)) {
					case LPAREN: {
						alt15 = 1;
					}
						break;
					case LBRACK: {
						alt15 = 2;
					}
						break;
					case DOT: {
						alt15 = 3;
					}
						break;

					}

					switch (alt15) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:883:3:
						// arguments
					{
						pushFollow(FOLLOW_arguments_in_leftHandSideExpression3512);
						arguments55 = arguments();
						_fsp--;

						stream_arguments.add(arguments55.getTree());

						// AST REWRITE
						// elements: leftHandSideExpression, arguments
						// token labels:
						// rule labels: retval
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) adaptor.nil();
						// 883:15: -> ^( CALL $leftHandSideExpression arguments
						// )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:883:18:
							// ^( CALL $leftHandSideExpression arguments )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(CALL, "CALL"), root_1);

								adaptor.addChild(root_1, stream_retval.next());
								adaptor.addChild(root_1, stream_arguments
										.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}
						break;
					case 2:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:884:5:
						// LBRACK expression RBRACK
					{
						LBRACK56 = (Token) input.LT(1);
						match(input, LBRACK,
								FOLLOW_LBRACK_in_leftHandSideExpression3533);
						stream_LBRACK.add(LBRACK56);

						pushFollow(FOLLOW_expression_in_leftHandSideExpression3535);
						expression57 = expression();
						_fsp--;

						stream_expression.add(expression57.getTree());
						RBRACK58 = (Token) input.LT(1);
						match(input, RBRACK,
								FOLLOW_RBRACK_in_leftHandSideExpression3537);
						stream_RBRACK.add(RBRACK58);

						// AST REWRITE
						// elements: leftHandSideExpression, expression
						// token labels:
						// rule labels: retval
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) adaptor.nil();
						// 884:30: -> ^( BYINDEX $leftHandSideExpression
						// expression )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:884:33:
							// ^( BYINDEX $leftHandSideExpression expression )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(BYINDEX, "BYINDEX"), root_1);

								adaptor.addChild(root_1, stream_retval.next());
								adaptor.addChild(root_1, stream_expression
										.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}
						break;
					case 3:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:885:5:
						// DOT Identifier
					{
						DOT59 = (Token) input.LT(1);
						match(input, DOT,
								FOLLOW_DOT_in_leftHandSideExpression3556);
						stream_DOT.add(DOT59);

						Identifier60 = (Token) input.LT(1);
						match(input, Identifier,
								FOLLOW_Identifier_in_leftHandSideExpression3558);
						stream_Identifier.add(Identifier60);

						// AST REWRITE
						// elements: Identifier, leftHandSideExpression
						// token labels:
						// rule labels: retval
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) adaptor.nil();
						// 885:20: -> ^( BYFIELD $leftHandSideExpression
						// Identifier )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:885:23:
							// ^( BYFIELD $leftHandSideExpression Identifier )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(BYFIELD, "BYFIELD"), root_1);

								adaptor.addChild(root_1, stream_retval.next());
								adaptor.addChild(root_1, stream_Identifier
										.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}
						break;

					default:
						break loop15;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end leftHandSideExpression

	public static class postfixExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start postfixExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:899:1:
	// postfixExpression : leftHandSideExpression ( postfixOperator )? ;
	public final postfixExpression_return postfixExpression()
			throws RecognitionException {
		postfixExpression_return retval = new postfixExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		leftHandSideExpression_return leftHandSideExpression61 = null;

		postfixOperator_return postfixOperator62 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:900:2:
			// ( leftHandSideExpression ( postfixOperator )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:900:4:
			// leftHandSideExpression ( postfixOperator )?
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3592);
				leftHandSideExpression61 = leftHandSideExpression();
				_fsp--;

				adaptor.addChild(root_0, leftHandSideExpression61.getTree());
				if (input.LA(1) == INC || input.LA(1) == DEC)
					promoteEOL(null);
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:900:95:
				// ( postfixOperator )?
				int alt16 = 2;
				int LA16_0 = input.LA(1);

				if (((LA16_0 >= INC && LA16_0 <= DEC))) {
					alt16 = 1;
				}
				switch (alt16) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:900:97:
					// postfixOperator
				{
					pushFollow(FOLLOW_postfixOperator_in_postfixExpression3598);
					postfixOperator62 = postfixOperator();
					_fsp--;

					root_0 = (Object) adaptor.becomeRoot(postfixOperator62
							.getTree(), root_0);

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end postfixExpression

	public static class postfixOperator_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start postfixOperator
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:903:1:
	// postfixOperator : (op= INC | op= DEC );
	public final postfixOperator_return postfixOperator()
			throws RecognitionException {
		postfixOperator_return retval = new postfixOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op = null;

		Object op_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:904:2:
			// (op= INC | op= DEC )
			int alt17 = 2;
			int LA17_0 = input.LA(1);

			if ((LA17_0 == INC)) {
				alt17 = 1;
			} else if ((LA17_0 == DEC)) {
				alt17 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"903:1: postfixOperator : (op= INC | op= DEC );", 17,
						0, input);

				throw nvae;
			}
			switch (alt17) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:904:4:
				// op= INC
			{
				root_0 = (Object) adaptor.nil();

				op = (Token) input.LT(1);
				match(input, INC, FOLLOW_INC_in_postfixOperator3616);
				op_tree = (Object) adaptor.create(op);
				adaptor.addChild(root_0, op_tree);

				op.setType(PINC);

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:905:4:
				// op= DEC
			{
				root_0 = (Object) adaptor.nil();

				op = (Token) input.LT(1);
				match(input, DEC, FOLLOW_DEC_in_postfixOperator3625);
				op_tree = (Object) adaptor.create(op);
				adaptor.addChild(root_0, op_tree);

				op.setType(PDEC);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end postfixOperator

	public static class unaryExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start unaryExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:912:1:
	// unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
	public final unaryExpression_return unaryExpression()
			throws RecognitionException {
		unaryExpression_return retval = new unaryExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		postfixExpression_return postfixExpression63 = null;

		unaryOperator_return unaryOperator64 = null;

		unaryExpression_return unaryExpression65 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:2:
			// ( postfixExpression | unaryOperator unaryExpression )
			int alt18 = 2;
			int LA18_0 = input.LA(1);

			if (((LA18_0 >= NULL && LA18_0 <= FALSE) || LA18_0 == FUNCTION
					|| LA18_0 == NEW || LA18_0 == THIS || LA18_0 == LBRACE
					|| LA18_0 == LPAREN || LA18_0 == LBRACK
					|| (LA18_0 >= Identifier && LA18_0 <= StringLiteral)
					|| LA18_0 == RegularExpressionLiteral || (LA18_0 >= DecimalLiteral && LA18_0 <= HexIntegerLiteral))) {
				alt18 = 1;
			} else if ((LA18_0 == DELETE || LA18_0 == TYPEOF || LA18_0 == VOID
					|| (LA18_0 >= ADD && LA18_0 <= SUB)
					|| (LA18_0 >= INC && LA18_0 <= DEC) || (LA18_0 >= NOT && LA18_0 <= INV))) {
				alt18 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"912:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );",
						18, 0, input);

				throw nvae;
			}
			switch (alt18) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:913:4:
				// postfixExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_postfixExpression_in_unaryExpression3642);
				postfixExpression63 = postfixExpression();
				_fsp--;

				adaptor.addChild(root_0, postfixExpression63.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:914:4:
				// unaryOperator unaryExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_unaryOperator_in_unaryExpression3647);
				unaryOperator64 = unaryOperator();
				_fsp--;

				root_0 = (Object) adaptor.becomeRoot(unaryOperator64.getTree(),
						root_0);
				pushFollow(FOLLOW_unaryExpression_in_unaryExpression3650);
				unaryExpression65 = unaryExpression();
				_fsp--;

				adaptor.addChild(root_0, unaryExpression65.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end unaryExpression

	public static class unaryOperator_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start unaryOperator
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:917:1:
	// unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB
	// | INV | NOT );
	public final unaryOperator_return unaryOperator()
			throws RecognitionException {
		unaryOperator_return retval = new unaryOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op = null;
		Token DELETE66 = null;
		Token VOID67 = null;
		Token TYPEOF68 = null;
		Token INC69 = null;
		Token DEC70 = null;
		Token INV71 = null;
		Token NOT72 = null;

		Object op_tree = null;
		Object DELETE66_tree = null;
		Object VOID67_tree = null;
		Object TYPEOF68_tree = null;
		Object INC69_tree = null;
		Object DEC70_tree = null;
		Object INV71_tree = null;
		Object NOT72_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:918:2:
			// ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV |
			// NOT )
			int alt19 = 9;
			switch (input.LA(1)) {
			case DELETE: {
				alt19 = 1;
			}
				break;
			case VOID: {
				alt19 = 2;
			}
				break;
			case TYPEOF: {
				alt19 = 3;
			}
				break;
			case INC: {
				alt19 = 4;
			}
				break;
			case DEC: {
				alt19 = 5;
			}
				break;
			case ADD: {
				alt19 = 6;
			}
				break;
			case SUB: {
				alt19 = 7;
			}
				break;
			case INV: {
				alt19 = 8;
			}
				break;
			case NOT: {
				alt19 = 9;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"917:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT );",
						19, 0, input);

				throw nvae;
			}

			switch (alt19) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:918:4:
				// DELETE
			{
				root_0 = (Object) adaptor.nil();

				DELETE66 = (Token) input.LT(1);
				match(input, DELETE, FOLLOW_DELETE_in_unaryOperator3662);
				DELETE66_tree = (Object) adaptor.create(DELETE66);
				adaptor.addChild(root_0, DELETE66_tree);

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:919:4:
				// VOID
			{
				root_0 = (Object) adaptor.nil();

				VOID67 = (Token) input.LT(1);
				match(input, VOID, FOLLOW_VOID_in_unaryOperator3667);
				VOID67_tree = (Object) adaptor.create(VOID67);
				adaptor.addChild(root_0, VOID67_tree);

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:920:4:
				// TYPEOF
			{
				root_0 = (Object) adaptor.nil();

				TYPEOF68 = (Token) input.LT(1);
				match(input, TYPEOF, FOLLOW_TYPEOF_in_unaryOperator3672);
				TYPEOF68_tree = (Object) adaptor.create(TYPEOF68);
				adaptor.addChild(root_0, TYPEOF68_tree);

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:921:4:
				// INC
			{
				root_0 = (Object) adaptor.nil();

				INC69 = (Token) input.LT(1);
				match(input, INC, FOLLOW_INC_in_unaryOperator3677);
				INC69_tree = (Object) adaptor.create(INC69);
				adaptor.addChild(root_0, INC69_tree);

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:922:4:
				// DEC
			{
				root_0 = (Object) adaptor.nil();

				DEC70 = (Token) input.LT(1);
				match(input, DEC, FOLLOW_DEC_in_unaryOperator3682);
				DEC70_tree = (Object) adaptor.create(DEC70);
				adaptor.addChild(root_0, DEC70_tree);

			}
				break;
			case 6:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:923:4:
				// op= ADD
			{
				root_0 = (Object) adaptor.nil();

				op = (Token) input.LT(1);
				match(input, ADD, FOLLOW_ADD_in_unaryOperator3689);
				op_tree = (Object) adaptor.create(op);
				adaptor.addChild(root_0, op_tree);

				op.setType(POS);

			}
				break;
			case 7:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:924:4:
				// op= SUB
			{
				root_0 = (Object) adaptor.nil();

				op = (Token) input.LT(1);
				match(input, SUB, FOLLOW_SUB_in_unaryOperator3698);
				op_tree = (Object) adaptor.create(op);
				adaptor.addChild(root_0, op_tree);

				op.setType(NEG);

			}
				break;
			case 8:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:925:4:
				// INV
			{
				root_0 = (Object) adaptor.nil();

				INV71 = (Token) input.LT(1);
				match(input, INV, FOLLOW_INV_in_unaryOperator3705);
				INV71_tree = (Object) adaptor.create(INV71);
				adaptor.addChild(root_0, INV71_tree);

			}
				break;
			case 9:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:926:4:
				// NOT
			{
				root_0 = (Object) adaptor.nil();

				NOT72 = (Token) input.LT(1);
				match(input, NOT, FOLLOW_NOT_in_unaryOperator3710);
				NOT72_tree = (Object) adaptor.create(NOT72);
				adaptor.addChild(root_0, NOT72_tree);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end unaryOperator

	public static class multiplicativeExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start multiplicativeExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:933:1:
	// multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD )
	// unaryExpression )* ;
	public final multiplicativeExpression_return multiplicativeExpression()
			throws RecognitionException {
		multiplicativeExpression_return retval = new multiplicativeExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set74 = null;
		unaryExpression_return unaryExpression73 = null;

		unaryExpression_return unaryExpression75 = null;

		Object set74_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:934:2:
			// ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:934:4:
			// unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3725);
				unaryExpression73 = unaryExpression();
				_fsp--;

				adaptor.addChild(root_0, unaryExpression73.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:934:20:
				// ( ( MUL | DIV | MOD ) unaryExpression )*
				loop20: do {
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if (((LA20_0 >= MUL && LA20_0 <= MOD) || LA20_0 == DIV)) {
						alt20 = 1;
					}

					switch (alt20) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:934:22:
						// ( MUL | DIV | MOD ) unaryExpression
					{
						set74 = (Token) input.LT(1);
						if ((input.LA(1) >= MUL && input.LA(1) <= MOD)
								|| input.LA(1) == DIV) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set74), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_multiplicativeExpression3729);
							throw mse;
						}

						pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3744);
						unaryExpression75 = unaryExpression();
						_fsp--;

						adaptor.addChild(root_0, unaryExpression75.getTree());

					}
						break;

					default:
						break loop20;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end multiplicativeExpression

	public static class additiveExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start additiveExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:941:1:
	// additiveExpression : multiplicativeExpression ( ( ADD | SUB )
	// multiplicativeExpression )* ;
	public final additiveExpression_return additiveExpression()
			throws RecognitionException {
		additiveExpression_return retval = new additiveExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set77 = null;
		multiplicativeExpression_return multiplicativeExpression76 = null;

		multiplicativeExpression_return multiplicativeExpression78 = null;

		Object set77_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:942:2:
			// ( multiplicativeExpression ( ( ADD | SUB )
			// multiplicativeExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:942:4:
			// multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression
			// )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3762);
				multiplicativeExpression76 = multiplicativeExpression();
				_fsp--;

				adaptor.addChild(root_0, multiplicativeExpression76.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:942:29:
				// ( ( ADD | SUB ) multiplicativeExpression )*
				loop21: do {
					int alt21 = 2;
					int LA21_0 = input.LA(1);

					if (((LA21_0 >= ADD && LA21_0 <= SUB))) {
						alt21 = 1;
					}

					switch (alt21) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:942:31:
						// ( ADD | SUB ) multiplicativeExpression
					{
						set77 = (Token) input.LT(1);
						if ((input.LA(1) >= ADD && input.LA(1) <= SUB)) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set77), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_additiveExpression3766);
							throw mse;
						}

						pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3777);
						multiplicativeExpression78 = multiplicativeExpression();
						_fsp--;

						adaptor.addChild(root_0, multiplicativeExpression78
								.getTree());

					}
						break;

					default:
						break loop21;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end additiveExpression

	public static class shiftExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start shiftExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:949:1:
	// shiftExpression : additiveExpression ( ( SHL | SHR | SHU )
	// additiveExpression )* ;
	public final shiftExpression_return shiftExpression()
			throws RecognitionException {
		shiftExpression_return retval = new shiftExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set80 = null;
		additiveExpression_return additiveExpression79 = null;

		additiveExpression_return additiveExpression81 = null;

		Object set80_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:950:2:
			// ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
			// )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:950:4:
			// additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_additiveExpression_in_shiftExpression3796);
				additiveExpression79 = additiveExpression();
				_fsp--;

				adaptor.addChild(root_0, additiveExpression79.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:950:23:
				// ( ( SHL | SHR | SHU ) additiveExpression )*
				loop22: do {
					int alt22 = 2;
					int LA22_0 = input.LA(1);

					if (((LA22_0 >= SHL && LA22_0 <= SHU))) {
						alt22 = 1;
					}

					switch (alt22) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:950:25:
						// ( SHL | SHR | SHU ) additiveExpression
					{
						set80 = (Token) input.LT(1);
						if ((input.LA(1) >= SHL && input.LA(1) <= SHU)) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set80), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_shiftExpression3800);
							throw mse;
						}

						pushFollow(FOLLOW_additiveExpression_in_shiftExpression3815);
						additiveExpression81 = additiveExpression();
						_fsp--;

						adaptor
								.addChild(root_0, additiveExpression81
										.getTree());

					}
						break;

					default:
						break loop22;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end shiftExpression

	public static class relationalExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start relationalExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:957:1:
	// relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE |
	// INSTANCEOF | IN ) shiftExpression )* ;
	public final relationalExpression_return relationalExpression()
			throws RecognitionException {
		relationalExpression_return retval = new relationalExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set83 = null;
		shiftExpression_return shiftExpression82 = null;

		shiftExpression_return shiftExpression84 = null;

		Object set83_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:958:2:
			// ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN )
			// shiftExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:958:4:
			// shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN )
			// shiftExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_shiftExpression_in_relationalExpression3834);
				shiftExpression82 = shiftExpression();
				_fsp--;

				adaptor.addChild(root_0, shiftExpression82.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:958:20:
				// ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
				// )*
				loop23: do {
					int alt23 = 2;
					int LA23_0 = input.LA(1);

					if (((LA23_0 >= IN && LA23_0 <= INSTANCEOF) || (LA23_0 >= LT && LA23_0 <= GTE))) {
						alt23 = 1;
					}

					switch (alt23) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:958:22:
						// ( LT | GT | LTE | GTE | INSTANCEOF | IN )
						// shiftExpression
					{
						set83 = (Token) input.LT(1);
						if ((input.LA(1) >= IN && input.LA(1) <= INSTANCEOF)
								|| (input.LA(1) >= LT && input.LA(1) <= GTE)) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set83), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_relationalExpression3838);
							throw mse;
						}

						pushFollow(FOLLOW_shiftExpression_in_relationalExpression3865);
						shiftExpression84 = shiftExpression();
						_fsp--;

						adaptor.addChild(root_0, shiftExpression84.getTree());

					}
						break;

					default:
						break loop23;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end relationalExpression

	public static class relationalExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start relationalExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:961:1:
	// relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE |
	// INSTANCEOF ) shiftExpression )* ;
	public final relationalExpressionNoIn_return relationalExpressionNoIn()
			throws RecognitionException {
		relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set86 = null;
		shiftExpression_return shiftExpression85 = null;

		shiftExpression_return shiftExpression87 = null;

		Object set86_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:962:2:
			// ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF )
			// shiftExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:962:4:
			// shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF )
			// shiftExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3879);
				shiftExpression85 = shiftExpression();
				_fsp--;

				adaptor.addChild(root_0, shiftExpression85.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:962:20:
				// ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
				loop24: do {
					int alt24 = 2;
					int LA24_0 = input.LA(1);

					if ((LA24_0 == INSTANCEOF || (LA24_0 >= LT && LA24_0 <= GTE))) {
						alt24 = 1;
					}

					switch (alt24) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:962:22:
						// ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
					{
						set86 = (Token) input.LT(1);
						if (input.LA(1) == INSTANCEOF
								|| (input.LA(1) >= LT && input.LA(1) <= GTE)) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set86), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_relationalExpressionNoIn3883);
							throw mse;
						}

						pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3906);
						shiftExpression87 = shiftExpression();
						_fsp--;

						adaptor.addChild(root_0, shiftExpression87.getTree());

					}
						break;

					default:
						break loop24;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end relationalExpressionNoIn

	public static class equalityExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start equalityExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:969:1:
	// equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME )
	// relationalExpression )* ;
	public final equalityExpression_return equalityExpression()
			throws RecognitionException {
		equalityExpression_return retval = new equalityExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set89 = null;
		relationalExpression_return relationalExpression88 = null;

		relationalExpression_return relationalExpression90 = null;

		Object set89_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:970:2:
			// ( relationalExpression ( ( EQ | NEQ | SAME | NSAME )
			// relationalExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:970:4:
			// relationalExpression ( ( EQ | NEQ | SAME | NSAME )
			// relationalExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_relationalExpression_in_equalityExpression3925);
				relationalExpression88 = relationalExpression();
				_fsp--;

				adaptor.addChild(root_0, relationalExpression88.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:970:25:
				// ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
				loop25: do {
					int alt25 = 2;
					int LA25_0 = input.LA(1);

					if (((LA25_0 >= EQ && LA25_0 <= NSAME))) {
						alt25 = 1;
					}

					switch (alt25) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:970:27:
						// ( EQ | NEQ | SAME | NSAME ) relationalExpression
					{
						set89 = (Token) input.LT(1);
						if ((input.LA(1) >= EQ && input.LA(1) <= NSAME)) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set89), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_equalityExpression3929);
							throw mse;
						}

						pushFollow(FOLLOW_relationalExpression_in_equalityExpression3948);
						relationalExpression90 = relationalExpression();
						_fsp--;

						adaptor.addChild(root_0, relationalExpression90
								.getTree());

					}
						break;

					default:
						break loop25;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end equalityExpression

	public static class equalityExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start equalityExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:973:1:
	// equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME |
	// NSAME ) relationalExpressionNoIn )* ;
	public final equalityExpressionNoIn_return equalityExpressionNoIn()
			throws RecognitionException {
		equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set92 = null;
		relationalExpressionNoIn_return relationalExpressionNoIn91 = null;

		relationalExpressionNoIn_return relationalExpressionNoIn93 = null;

		Object set92_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:974:2:
			// ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME )
			// relationalExpressionNoIn )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:974:4:
			// relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME )
			// relationalExpressionNoIn )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3962);
				relationalExpressionNoIn91 = relationalExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, relationalExpressionNoIn91.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:974:29:
				// ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
				loop26: do {
					int alt26 = 2;
					int LA26_0 = input.LA(1);

					if (((LA26_0 >= EQ && LA26_0 <= NSAME))) {
						alt26 = 1;
					}

					switch (alt26) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:974:31:
						// ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
					{
						set92 = (Token) input.LT(1);
						if ((input.LA(1) >= EQ && input.LA(1) <= NSAME)) {
							input.consume();
							root_0 = (Object) adaptor.becomeRoot(adaptor
									.create(set92), root_0);
							errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recoverFromMismatchedSet(input, mse,
									FOLLOW_set_in_equalityExpressionNoIn3966);
							throw mse;
						}

						pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3985);
						relationalExpressionNoIn93 = relationalExpressionNoIn();
						_fsp--;

						adaptor.addChild(root_0, relationalExpressionNoIn93
								.getTree());

					}
						break;

					default:
						break loop26;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end equalityExpressionNoIn

	public static class bitwiseANDExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start bitwiseANDExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:981:1:
	// bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
	public final bitwiseANDExpression_return bitwiseANDExpression()
			throws RecognitionException {
		bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND95 = null;
		equalityExpression_return equalityExpression94 = null;

		equalityExpression_return equalityExpression96 = null;

		Object AND95_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:982:2:
			// ( equalityExpression ( AND equalityExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:982:4:
			// equalityExpression ( AND equalityExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4005);
				equalityExpression94 = equalityExpression();
				_fsp--;

				adaptor.addChild(root_0, equalityExpression94.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:982:23:
				// ( AND equalityExpression )*
				loop27: do {
					int alt27 = 2;
					int LA27_0 = input.LA(1);

					if ((LA27_0 == AND)) {
						alt27 = 1;
					}

					switch (alt27) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:982:25:
						// AND equalityExpression
					{
						AND95 = (Token) input.LT(1);
						match(input, AND,
								FOLLOW_AND_in_bitwiseANDExpression4009);
						AND95_tree = (Object) adaptor.create(AND95);
						root_0 = (Object) adaptor
								.becomeRoot(AND95_tree, root_0);

						pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4012);
						equalityExpression96 = equalityExpression();
						_fsp--;

						adaptor
								.addChild(root_0, equalityExpression96
										.getTree());

					}
						break;

					default:
						break loop27;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end bitwiseANDExpression

	public static class bitwiseANDExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start bitwiseANDExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:985:1:
	// bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND
	// equalityExpressionNoIn )* ;
	public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn()
			throws RecognitionException {
		bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND98 = null;
		equalityExpressionNoIn_return equalityExpressionNoIn97 = null;

		equalityExpressionNoIn_return equalityExpressionNoIn99 = null;

		Object AND98_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:986:2:
			// ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:986:4:
			// equalityExpressionNoIn ( AND equalityExpressionNoIn )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4026);
				equalityExpressionNoIn97 = equalityExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, equalityExpressionNoIn97.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:986:27:
				// ( AND equalityExpressionNoIn )*
				loop28: do {
					int alt28 = 2;
					int LA28_0 = input.LA(1);

					if ((LA28_0 == AND)) {
						alt28 = 1;
					}

					switch (alt28) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:986:29:
						// AND equalityExpressionNoIn
					{
						AND98 = (Token) input.LT(1);
						match(input, AND,
								FOLLOW_AND_in_bitwiseANDExpressionNoIn4030);
						AND98_tree = (Object) adaptor.create(AND98);
						root_0 = (Object) adaptor
								.becomeRoot(AND98_tree, root_0);

						pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4033);
						equalityExpressionNoIn99 = equalityExpressionNoIn();
						_fsp--;

						adaptor.addChild(root_0, equalityExpressionNoIn99
								.getTree());

					}
						break;

					default:
						break loop28;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end bitwiseANDExpressionNoIn

	public static class bitwiseXORExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start bitwiseXORExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:989:1:
	// bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )*
	// ;
	public final bitwiseXORExpression_return bitwiseXORExpression()
			throws RecognitionException {
		bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token XOR101 = null;
		bitwiseANDExpression_return bitwiseANDExpression100 = null;

		bitwiseANDExpression_return bitwiseANDExpression102 = null;

		Object XOR101_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:990:2:
			// ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:990:4:
			// bitwiseANDExpression ( XOR bitwiseANDExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4049);
				bitwiseANDExpression100 = bitwiseANDExpression();
				_fsp--;

				adaptor.addChild(root_0, bitwiseANDExpression100.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:990:25:
				// ( XOR bitwiseANDExpression )*
				loop29: do {
					int alt29 = 2;
					int LA29_0 = input.LA(1);

					if ((LA29_0 == XOR)) {
						alt29 = 1;
					}

					switch (alt29) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:990:27:
						// XOR bitwiseANDExpression
					{
						XOR101 = (Token) input.LT(1);
						match(input, XOR,
								FOLLOW_XOR_in_bitwiseXORExpression4053);
						XOR101_tree = (Object) adaptor.create(XOR101);
						root_0 = (Object) adaptor.becomeRoot(XOR101_tree,
								root_0);

						pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4056);
						bitwiseANDExpression102 = bitwiseANDExpression();
						_fsp--;

						adaptor.addChild(root_0, bitwiseANDExpression102
								.getTree());

					}
						break;

					default:
						break loop29;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end bitwiseXORExpression

	public static class bitwiseXORExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start bitwiseXORExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:993:1:
	// bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR
	// bitwiseANDExpressionNoIn )* ;
	public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn()
			throws RecognitionException {
		bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token XOR104 = null;
		bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn103 = null;

		bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn105 = null;

		Object XOR104_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:994:2:
			// ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:994:4:
			// bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4072);
				bitwiseANDExpressionNoIn103 = bitwiseANDExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, bitwiseANDExpressionNoIn103.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:994:29:
				// ( XOR bitwiseANDExpressionNoIn )*
				loop30: do {
					int alt30 = 2;
					int LA30_0 = input.LA(1);

					if ((LA30_0 == XOR)) {
						alt30 = 1;
					}

					switch (alt30) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:994:31:
						// XOR bitwiseANDExpressionNoIn
					{
						XOR104 = (Token) input.LT(1);
						match(input, XOR,
								FOLLOW_XOR_in_bitwiseXORExpressionNoIn4076);
						XOR104_tree = (Object) adaptor.create(XOR104);
						root_0 = (Object) adaptor.becomeRoot(XOR104_tree,
								root_0);

						pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4079);
						bitwiseANDExpressionNoIn105 = bitwiseANDExpressionNoIn();
						_fsp--;

						adaptor.addChild(root_0, bitwiseANDExpressionNoIn105
								.getTree());

					}
						break;

					default:
						break loop30;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end bitwiseXORExpressionNoIn

	public static class bitwiseORExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start bitwiseORExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:997:1:
	// bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
	public final bitwiseORExpression_return bitwiseORExpression()
			throws RecognitionException {
		bitwiseORExpression_return retval = new bitwiseORExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR107 = null;
		bitwiseXORExpression_return bitwiseXORExpression106 = null;

		bitwiseXORExpression_return bitwiseXORExpression108 = null;

		Object OR107_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:998:2:
			// ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:998:4:
			// bitwiseXORExpression ( OR bitwiseXORExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4094);
				bitwiseXORExpression106 = bitwiseXORExpression();
				_fsp--;

				adaptor.addChild(root_0, bitwiseXORExpression106.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:998:25:
				// ( OR bitwiseXORExpression )*
				loop31: do {
					int alt31 = 2;
					int LA31_0 = input.LA(1);

					if ((LA31_0 == OR)) {
						alt31 = 1;
					}

					switch (alt31) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:998:27:
						// OR bitwiseXORExpression
					{
						OR107 = (Token) input.LT(1);
						match(input, OR, FOLLOW_OR_in_bitwiseORExpression4098);
						OR107_tree = (Object) adaptor.create(OR107);
						root_0 = (Object) adaptor
								.becomeRoot(OR107_tree, root_0);

						pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4101);
						bitwiseXORExpression108 = bitwiseXORExpression();
						_fsp--;

						adaptor.addChild(root_0, bitwiseXORExpression108
								.getTree());

					}
						break;

					default:
						break loop31;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end bitwiseORExpression

	public static class bitwiseORExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start bitwiseORExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1001:1:
	// bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR
	// bitwiseXORExpressionNoIn )* ;
	public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn()
			throws RecognitionException {
		bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR110 = null;
		bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn109 = null;

		bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn111 = null;

		Object OR110_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1002:2:
			// ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1002:4:
			// bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4116);
				bitwiseXORExpressionNoIn109 = bitwiseXORExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, bitwiseXORExpressionNoIn109.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1002:29:
				// ( OR bitwiseXORExpressionNoIn )*
				loop32: do {
					int alt32 = 2;
					int LA32_0 = input.LA(1);

					if ((LA32_0 == OR)) {
						alt32 = 1;
					}

					switch (alt32) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1002:31:
						// OR bitwiseXORExpressionNoIn
					{
						OR110 = (Token) input.LT(1);
						match(input, OR,
								FOLLOW_OR_in_bitwiseORExpressionNoIn4120);
						OR110_tree = (Object) adaptor.create(OR110);
						root_0 = (Object) adaptor
								.becomeRoot(OR110_tree, root_0);

						pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4123);
						bitwiseXORExpressionNoIn111 = bitwiseXORExpressionNoIn();
						_fsp--;

						adaptor.addChild(root_0, bitwiseXORExpressionNoIn111
								.getTree());

					}
						break;

					default:
						break loop32;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end bitwiseORExpressionNoIn

	public static class logicalANDExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start logicalANDExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1009:1:
	// logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )*
	// ;
	public final logicalANDExpression_return logicalANDExpression()
			throws RecognitionException {
		logicalANDExpression_return retval = new logicalANDExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LAND113 = null;
		bitwiseORExpression_return bitwiseORExpression112 = null;

		bitwiseORExpression_return bitwiseORExpression114 = null;

		Object LAND113_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1010:2:
			// ( bitwiseORExpression ( LAND bitwiseORExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1010:4:
			// bitwiseORExpression ( LAND bitwiseORExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4142);
				bitwiseORExpression112 = bitwiseORExpression();
				_fsp--;

				adaptor.addChild(root_0, bitwiseORExpression112.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1010:24:
				// ( LAND bitwiseORExpression )*
				loop33: do {
					int alt33 = 2;
					int LA33_0 = input.LA(1);

					if ((LA33_0 == LAND)) {
						alt33 = 1;
					}

					switch (alt33) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1010:26:
						// LAND bitwiseORExpression
					{
						LAND113 = (Token) input.LT(1);
						match(input, LAND,
								FOLLOW_LAND_in_logicalANDExpression4146);
						LAND113_tree = (Object) adaptor.create(LAND113);
						root_0 = (Object) adaptor.becomeRoot(LAND113_tree,
								root_0);

						pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4149);
						bitwiseORExpression114 = bitwiseORExpression();
						_fsp--;

						adaptor.addChild(root_0, bitwiseORExpression114
								.getTree());

					}
						break;

					default:
						break loop33;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end logicalANDExpression

	public static class logicalANDExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start logicalANDExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1013:1:
	// logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND
	// bitwiseORExpressionNoIn )* ;
	public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn()
			throws RecognitionException {
		logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LAND116 = null;
		bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn115 = null;

		bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn117 = null;

		Object LAND116_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1014:2:
			// ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1014:4:
			// bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4163);
				bitwiseORExpressionNoIn115 = bitwiseORExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, bitwiseORExpressionNoIn115.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1014:28:
				// ( LAND bitwiseORExpressionNoIn )*
				loop34: do {
					int alt34 = 2;
					int LA34_0 = input.LA(1);

					if ((LA34_0 == LAND)) {
						alt34 = 1;
					}

					switch (alt34) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1014:30:
						// LAND bitwiseORExpressionNoIn
					{
						LAND116 = (Token) input.LT(1);
						match(input, LAND,
								FOLLOW_LAND_in_logicalANDExpressionNoIn4167);
						LAND116_tree = (Object) adaptor.create(LAND116);
						root_0 = (Object) adaptor.becomeRoot(LAND116_tree,
								root_0);

						pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4170);
						bitwiseORExpressionNoIn117 = bitwiseORExpressionNoIn();
						_fsp--;

						adaptor.addChild(root_0, bitwiseORExpressionNoIn117
								.getTree());

					}
						break;

					default:
						break loop34;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end logicalANDExpressionNoIn

	public static class logicalORExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start logicalORExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1017:1:
	// logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )*
	// ;
	public final logicalORExpression_return logicalORExpression()
			throws RecognitionException {
		logicalORExpression_return retval = new logicalORExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOR119 = null;
		logicalANDExpression_return logicalANDExpression118 = null;

		logicalANDExpression_return logicalANDExpression120 = null;

		Object LOR119_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1018:2:
			// ( logicalANDExpression ( LOR logicalANDExpression )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1018:4:
			// logicalANDExpression ( LOR logicalANDExpression )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4185);
				logicalANDExpression118 = logicalANDExpression();
				_fsp--;

				adaptor.addChild(root_0, logicalANDExpression118.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1018:25:
				// ( LOR logicalANDExpression )*
				loop35: do {
					int alt35 = 2;
					int LA35_0 = input.LA(1);

					if ((LA35_0 == LOR)) {
						alt35 = 1;
					}

					switch (alt35) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1018:27:
						// LOR logicalANDExpression
					{
						LOR119 = (Token) input.LT(1);
						match(input, LOR, FOLLOW_LOR_in_logicalORExpression4189);
						LOR119_tree = (Object) adaptor.create(LOR119);
						root_0 = (Object) adaptor.becomeRoot(LOR119_tree,
								root_0);

						pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4192);
						logicalANDExpression120 = logicalANDExpression();
						_fsp--;

						adaptor.addChild(root_0, logicalANDExpression120
								.getTree());

					}
						break;

					default:
						break loop35;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end logicalORExpression

	public static class logicalORExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start logicalORExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1021:1:
	// logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR
	// logicalANDExpressionNoIn )* ;
	public final logicalORExpressionNoIn_return logicalORExpressionNoIn()
			throws RecognitionException {
		logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOR122 = null;
		logicalANDExpressionNoIn_return logicalANDExpressionNoIn121 = null;

		logicalANDExpressionNoIn_return logicalANDExpressionNoIn123 = null;

		Object LOR122_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1022:2:
			// ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1022:4:
			// logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4207);
				logicalANDExpressionNoIn121 = logicalANDExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, logicalANDExpressionNoIn121.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1022:29:
				// ( LOR logicalANDExpressionNoIn )*
				loop36: do {
					int alt36 = 2;
					int LA36_0 = input.LA(1);

					if ((LA36_0 == LOR)) {
						alt36 = 1;
					}

					switch (alt36) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1022:31:
						// LOR logicalANDExpressionNoIn
					{
						LOR122 = (Token) input.LT(1);
						match(input, LOR,
								FOLLOW_LOR_in_logicalORExpressionNoIn4211);
						LOR122_tree = (Object) adaptor.create(LOR122);
						root_0 = (Object) adaptor.becomeRoot(LOR122_tree,
								root_0);

						pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4214);
						logicalANDExpressionNoIn123 = logicalANDExpressionNoIn();
						_fsp--;

						adaptor.addChild(root_0, logicalANDExpressionNoIn123
								.getTree());

					}
						break;

					default:
						break loop36;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end logicalORExpressionNoIn

	public static class conditionalExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start conditionalExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1029:1:
	// conditionalExpression : logicalORExpression ( QUE assignmentExpression
	// COLON assignmentExpression )? ;
	public final conditionalExpression_return conditionalExpression()
			throws RecognitionException {
		conditionalExpression_return retval = new conditionalExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token QUE125 = null;
		Token COLON127 = null;
		logicalORExpression_return logicalORExpression124 = null;

		assignmentExpression_return assignmentExpression126 = null;

		assignmentExpression_return assignmentExpression128 = null;

		Object QUE125_tree = null;
		Object COLON127_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1030:2:
			// ( logicalORExpression ( QUE assignmentExpression COLON
			// assignmentExpression )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1030:4:
			// logicalORExpression ( QUE assignmentExpression COLON
			// assignmentExpression )?
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4233);
				logicalORExpression124 = logicalORExpression();
				_fsp--;

				adaptor.addChild(root_0, logicalORExpression124.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1030:24:
				// ( QUE assignmentExpression COLON assignmentExpression )?
				int alt37 = 2;
				int LA37_0 = input.LA(1);

				if ((LA37_0 == QUE)) {
					alt37 = 1;
				}
				switch (alt37) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1030:26:
					// QUE assignmentExpression COLON assignmentExpression
				{
					QUE125 = (Token) input.LT(1);
					match(input, QUE, FOLLOW_QUE_in_conditionalExpression4237);
					QUE125_tree = (Object) adaptor.create(QUE125);
					root_0 = (Object) adaptor.becomeRoot(QUE125_tree, root_0);

					pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4240);
					assignmentExpression126 = assignmentExpression();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpression126.getTree());
					COLON127 = (Token) input.LT(1);
					match(input, COLON,
							FOLLOW_COLON_in_conditionalExpression4242);
					pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4245);
					assignmentExpression128 = assignmentExpression();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpression128.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end conditionalExpression

	public static class conditionalExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start conditionalExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1033:1:
	// conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE
	// assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
	public final conditionalExpressionNoIn_return conditionalExpressionNoIn()
			throws RecognitionException {
		conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token QUE130 = null;
		Token COLON132 = null;
		logicalORExpressionNoIn_return logicalORExpressionNoIn129 = null;

		assignmentExpressionNoIn_return assignmentExpressionNoIn131 = null;

		assignmentExpressionNoIn_return assignmentExpressionNoIn133 = null;

		Object QUE130_tree = null;
		Object COLON132_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1034:2:
			// ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON
			// assignmentExpressionNoIn )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1034:4:
			// logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON
			// assignmentExpressionNoIn )?
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4259);
				logicalORExpressionNoIn129 = logicalORExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, logicalORExpressionNoIn129.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1034:28:
				// ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
				// )?
				int alt38 = 2;
				int LA38_0 = input.LA(1);

				if ((LA38_0 == QUE)) {
					alt38 = 1;
				}
				switch (alt38) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1034:30:
					// QUE assignmentExpressionNoIn COLON
					// assignmentExpressionNoIn
				{
					QUE130 = (Token) input.LT(1);
					match(input, QUE,
							FOLLOW_QUE_in_conditionalExpressionNoIn4263);
					QUE130_tree = (Object) adaptor.create(QUE130);
					root_0 = (Object) adaptor.becomeRoot(QUE130_tree, root_0);

					pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4266);
					assignmentExpressionNoIn131 = assignmentExpressionNoIn();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpressionNoIn131
							.getTree());
					COLON132 = (Token) input.LT(1);
					match(input, COLON,
							FOLLOW_COLON_in_conditionalExpressionNoIn4268);
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4271);
					assignmentExpressionNoIn133 = assignmentExpressionNoIn();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpressionNoIn133
							.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end conditionalExpressionNoIn

	public static class assignmentExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start assignmentExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1063:1:
	// assignmentExpression : lhs= conditionalExpression ({...}?
	// assignmentOperator assignmentExpression )? ;
	public final assignmentExpression_return assignmentExpression()
			throws RecognitionException {
		assignmentExpression_return retval = new assignmentExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		conditionalExpression_return lhs = null;

		assignmentOperator_return assignmentOperator134 = null;

		assignmentExpression_return assignmentExpression135 = null;

		Object[] isLhs = new Object[1];

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1068:2:
			// (lhs= conditionalExpression ({...}? assignmentOperator
			// assignmentExpression )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1068:4:
			// lhs= conditionalExpression ({...}? assignmentOperator
			// assignmentExpression )?
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4299);
				lhs = conditionalExpression();
				_fsp--;

				adaptor.addChild(root_0, lhs.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1069:2:
				// ({...}? assignmentOperator assignmentExpression )?
				int alt39 = 2;
				int LA39_0 = input.LA(1);

				if (((LA39_0 >= ASSIGN && LA39_0 <= XORASS) || LA39_0 == DIVASS)) {
					int LA39_1 = input.LA(2);

					if ((isLeftHandSideAssign(lhs, isLhs))) {
						alt39 = 1;
					}
				}
				switch (alt39) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1069:4:
					// {...}? assignmentOperator assignmentExpression
				{
					if (!(isLeftHandSideAssign(lhs, isLhs))) {
						throw new FailedPredicateException(input,
								"assignmentExpression",
								" isLeftHandSideAssign(lhs, isLhs) ");
					}
					pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4306);
					assignmentOperator134 = assignmentOperator();
					_fsp--;

					root_0 = (Object) adaptor.becomeRoot(assignmentOperator134
							.getTree(), root_0);
					pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4309);
					assignmentExpression135 = assignmentExpression();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpression135.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end assignmentExpression

	public static class assignmentOperator_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start assignmentOperator
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1072:1:
	// assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS |
	// SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
	public final assignmentOperator_return assignmentOperator()
			throws RecognitionException {
		assignmentOperator_return retval = new assignmentOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set136 = null;

		Object set136_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1073:2:
			// ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS |
			// SHRASS | SHUASS | ANDASS | XORASS | ORASS )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:
			{
				root_0 = (Object) adaptor.nil();

				set136 = (Token) input.LT(1);
				if ((input.LA(1) >= ASSIGN && input.LA(1) <= XORASS)
						|| input.LA(1) == DIVASS) {
					input.consume();
					adaptor.addChild(root_0, adaptor.create(set136));
					errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recoverFromMismatchedSet(input, mse,
							FOLLOW_set_in_assignmentOperator0);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end assignmentOperator

	public static class assignmentExpressionNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start assignmentExpressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1076:1:
	// assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}?
	// assignmentOperator assignmentExpressionNoIn )? ;
	public final assignmentExpressionNoIn_return assignmentExpressionNoIn()
			throws RecognitionException {
		assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		conditionalExpressionNoIn_return lhs = null;

		assignmentOperator_return assignmentOperator137 = null;

		assignmentExpressionNoIn_return assignmentExpressionNoIn138 = null;

		Object[] isLhs = new Object[1];

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1081:2:
			// (lhs= conditionalExpressionNoIn ({...}? assignmentOperator
			// assignmentExpressionNoIn )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1081:4:
			// lhs= conditionalExpressionNoIn ({...}? assignmentOperator
			// assignmentExpressionNoIn )?
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4386);
				lhs = conditionalExpressionNoIn();
				_fsp--;

				adaptor.addChild(root_0, lhs.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1082:2:
				// ({...}? assignmentOperator assignmentExpressionNoIn )?
				int alt40 = 2;
				int LA40_0 = input.LA(1);

				if (((LA40_0 >= ASSIGN && LA40_0 <= XORASS) || LA40_0 == DIVASS)) {
					int LA40_1 = input.LA(2);

					if ((isLeftHandSideAssign(lhs, isLhs))) {
						alt40 = 1;
					}
				}
				switch (alt40) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1082:4:
					// {...}? assignmentOperator assignmentExpressionNoIn
				{
					if (!(isLeftHandSideAssign(lhs, isLhs))) {
						throw new FailedPredicateException(input,
								"assignmentExpressionNoIn",
								" isLeftHandSideAssign(lhs, isLhs) ");
					}
					pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4393);
					assignmentOperator137 = assignmentOperator();
					_fsp--;

					root_0 = (Object) adaptor.becomeRoot(assignmentOperator137
							.getTree(), root_0);
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4396);
					assignmentExpressionNoIn138 = assignmentExpressionNoIn();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpressionNoIn138
							.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end assignmentExpressionNoIn

	public static class expression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start expression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1089:1:
	// expression : exprs+= assignmentExpression ( COMMA exprs+=
	// assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
	// -> $exprs;
	public final expression_return expression() throws RecognitionException {
		expression_return retval = new expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA139 = null;
		List list_exprs = null;
		RuleReturnScope exprs = null;
		Object COMMA139_tree = null;
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_assignmentExpression = new RewriteRuleSubtreeStream(
				adaptor, "rule assignmentExpression");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1090:2:
			// (exprs+= assignmentExpression ( COMMA exprs+=
			// assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR (
			// $exprs)+ ) -> $exprs)
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1090:4:
			// exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression
			// )*
			{
				pushFollow(FOLLOW_assignmentExpression_in_expression4418);
				exprs = assignmentExpression();
				_fsp--;

				stream_assignmentExpression.add(exprs.getTree());
				if (list_exprs == null)
					list_exprs = new ArrayList();
				list_exprs.add(exprs);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1090:32:
				// ( COMMA exprs+= assignmentExpression )*
				loop41: do {
					int alt41 = 2;
					int LA41_0 = input.LA(1);

					if ((LA41_0 == COMMA)) {
						alt41 = 1;
					}

					switch (alt41) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1090:34:
						// COMMA exprs+= assignmentExpression
					{
						COMMA139 = (Token) input.LT(1);
						match(input, COMMA, FOLLOW_COMMA_in_expression4422);
						stream_COMMA.add(COMMA139);

						pushFollow(FOLLOW_assignmentExpression_in_expression4426);
						exprs = assignmentExpression();
						_fsp--;

						stream_assignmentExpression.add(exprs.getTree());
						if (list_exprs == null)
							list_exprs = new ArrayList();
						list_exprs.add(exprs);

					}
						break;

					default:
						break loop41;
					}
				} while (true);

				// AST REWRITE
				// elements: exprs, exprs
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels: exprs
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);
				RewriteRuleSubtreeStream stream_exprs = new RewriteRuleSubtreeStream(
						adaptor, "token exprs", list_exprs);
				root_0 = (Object) adaptor.nil();
				// 1091:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
				if (list_exprs.size() > 1) {
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1091:28:
					// ^( CEXPR ( $exprs)+ )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								CEXPR, "CEXPR"), root_1);

						if (!(stream_exprs.hasNext())) {
							throw new RewriteEarlyExitException();
						}
						while (stream_exprs.hasNext()) {
							adaptor.addChild(root_1,
									((ParserRuleReturnScope) stream_exprs
											.next()).getTree());

						}
						stream_exprs.reset();

						adaptor.addChild(root_0, root_1);
					}

				} else // 1092:2: -> $exprs
				{
					adaptor.addChild(root_0,
							((ParserRuleReturnScope) stream_exprs.next())
									.getTree());

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end expression

	public static class expressionNoIn_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start expressionNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1095:1:
	// expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+=
	// assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+
	// ) -> $exprs;
	public final expressionNoIn_return expressionNoIn()
			throws RecognitionException {
		expressionNoIn_return retval = new expressionNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA140 = null;
		List list_exprs = null;
		RuleReturnScope exprs = null;
		Object COMMA140_tree = null;
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_assignmentExpressionNoIn = new RewriteRuleSubtreeStream(
				adaptor, "rule assignmentExpressionNoIn");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1096:2:
			// (exprs+= assignmentExpressionNoIn ( COMMA exprs+=
			// assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR (
			// $exprs)+ ) -> $exprs)
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1096:4:
			// exprs+= assignmentExpressionNoIn ( COMMA exprs+=
			// assignmentExpressionNoIn )*
			{
				pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4463);
				exprs = assignmentExpressionNoIn();
				_fsp--;

				stream_assignmentExpressionNoIn.add(exprs.getTree());
				if (list_exprs == null)
					list_exprs = new ArrayList();
				list_exprs.add(exprs);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1096:36:
				// ( COMMA exprs+= assignmentExpressionNoIn )*
				loop42: do {
					int alt42 = 2;
					int LA42_0 = input.LA(1);

					if ((LA42_0 == COMMA)) {
						alt42 = 1;
					}

					switch (alt42) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1096:38:
						// COMMA exprs+= assignmentExpressionNoIn
					{
						COMMA140 = (Token) input.LT(1);
						match(input, COMMA, FOLLOW_COMMA_in_expressionNoIn4467);
						stream_COMMA.add(COMMA140);

						pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4471);
						exprs = assignmentExpressionNoIn();
						_fsp--;

						stream_assignmentExpressionNoIn.add(exprs.getTree());
						if (list_exprs == null)
							list_exprs = new ArrayList();
						list_exprs.add(exprs);

					}
						break;

					default:
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
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);
				RewriteRuleSubtreeStream stream_exprs = new RewriteRuleSubtreeStream(
						adaptor, "token exprs", list_exprs);
				root_0 = (Object) adaptor.nil();
				// 1097:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
				if (list_exprs.size() > 1) {
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1097:28:
					// ^( CEXPR ( $exprs)+ )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								CEXPR, "CEXPR"), root_1);

						if (!(stream_exprs.hasNext())) {
							throw new RewriteEarlyExitException();
						}
						while (stream_exprs.hasNext()) {
							adaptor.addChild(root_1,
									((ParserRuleReturnScope) stream_exprs
											.next()).getTree());

						}
						stream_exprs.reset();

						adaptor.addChild(root_0, root_1);
					}

				} else // 1098:2: -> $exprs
				{
					adaptor.addChild(root_0,
							((ParserRuleReturnScope) stream_exprs.next())
									.getTree());

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end expressionNoIn

	public static class semic_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start semic
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1123:1:
	// semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
	public final semic_return semic() throws RecognitionException {
		semic_return retval = new semic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMIC141 = null;
		Token EOF142 = null;
		Token RBRACE143 = null;
		Token EOL144 = null;
		Token MultiLineComment145 = null;

		Object SEMIC141_tree = null;
		Object EOF142_tree = null;
		Object RBRACE143_tree = null;
		Object EOL144_tree = null;
		Object MultiLineComment145_tree = null;

		// Mark current position so we can unconsume a RBRACE.
		int marker = input.mark();
		// Promote EOL if appropriate
		promoteEOL(retval);

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1131:2:
			// ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
			int alt43 = 5;
			switch (input.LA(1)) {
			case SEMIC: {
				alt43 = 1;
			}
				break;
			case EOF: {
				alt43 = 2;
			}
				break;
			case RBRACE: {
				alt43 = 3;
			}
				break;
			case EOL: {
				alt43 = 4;
			}
				break;
			case MultiLineComment: {
				alt43 = 5;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"1123:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );",
						43, 0, input);

				throw nvae;
			}

			switch (alt43) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1131:4:
				// SEMIC
			{
				root_0 = (Object) adaptor.nil();

				SEMIC141 = (Token) input.LT(1);
				match(input, SEMIC, FOLLOW_SEMIC_in_semic4522);
				SEMIC141_tree = (Object) adaptor.create(SEMIC141);
				adaptor.addChild(root_0, SEMIC141_tree);

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1132:4:
				// EOF
			{
				root_0 = (Object) adaptor.nil();

				EOF142 = (Token) input.LT(1);
				match(input, EOF, FOLLOW_EOF_in_semic4527);
				EOF142_tree = (Object) adaptor.create(EOF142);
				adaptor.addChild(root_0, EOF142_tree);

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1133:4:
				// RBRACE
			{
				root_0 = (Object) adaptor.nil();

				RBRACE143 = (Token) input.LT(1);
				match(input, RBRACE, FOLLOW_RBRACE_in_semic4532);
				RBRACE143_tree = (Object) adaptor.create(RBRACE143);
				adaptor.addChild(root_0, RBRACE143_tree);

				input.rewind(marker);

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1134:4:
				// EOL
			{
				root_0 = (Object) adaptor.nil();

				EOL144 = (Token) input.LT(1);
				match(input, EOL, FOLLOW_EOL_in_semic4539);
				EOL144_tree = (Object) adaptor.create(EOL144);
				adaptor.addChild(root_0, EOL144_tree);

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1134:10:
				// MultiLineComment
			{
				root_0 = (Object) adaptor.nil();

				MultiLineComment145 = (Token) input.LT(1);
				match(input, MultiLineComment,
						FOLLOW_MultiLineComment_in_semic4543);
				MultiLineComment145_tree = (Object) adaptor
						.create(MultiLineComment145);
				adaptor.addChild(root_0, MultiLineComment145_tree);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end semic

	public static class statement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start statement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1142:1:
	// statement options {k=1; } : ({...}? block | statementTail );
	public final statement_return statement() throws RecognitionException {
		statement_return retval = new statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		block_return block146 = null;

		statementTail_return statementTail147 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1147:2:
			// ({...}? block | statementTail )
			int alt44 = 2;
			int LA44_0 = input.LA(1);

			if ((LA44_0 == LBRACE)) {
				int LA44_1 = input.LA(2);

				if ((input.LA(1) == LBRACE)) {
					alt44 = 1;
				} else if ((true)) {
					alt44 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1142:1: statement options {k=1; } : ({...}? block | statementTail );",
							44, 1, input);

					throw nvae;
				}
			} else if (((LA44_0 >= NULL && LA44_0 <= BREAK)
					|| LA44_0 == CONTINUE || (LA44_0 >= DELETE && LA44_0 <= DO)
					|| LA44_0 == FOR || (LA44_0 >= FUNCTION && LA44_0 <= IF)
					|| (LA44_0 >= NEW && LA44_0 <= WITH) || LA44_0 == CONST
					|| LA44_0 == LPAREN || LA44_0 == LBRACK || LA44_0 == SEMIC
					|| (LA44_0 >= ADD && LA44_0 <= SUB)
					|| (LA44_0 >= INC && LA44_0 <= DEC)
					|| (LA44_0 >= NOT && LA44_0 <= INV)
					|| (LA44_0 >= Identifier && LA44_0 <= StringLiteral)
					|| LA44_0 == RegularExpressionLiteral || (LA44_0 >= DecimalLiteral && LA44_0 <= HexIntegerLiteral))) {
				alt44 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"1142:1: statement options {k=1; } : ({...}? block | statementTail );",
						44, 0, input);

				throw nvae;
			}
			switch (alt44) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1147:4:
				// {...}? block
			{
				root_0 = (Object) adaptor.nil();

				if (!(input.LA(1) == LBRACE)) {
					throw new FailedPredicateException(input, "statement",
							" input.LA(1) == LBRACE ");
				}
				pushFollow(FOLLOW_block_in_statement4572);
				block146 = block();
				_fsp--;

				adaptor.addChild(root_0, block146.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1148:4:
				// statementTail
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_statementTail_in_statement4577);
				statementTail147 = statementTail();
				_fsp--;

				adaptor.addChild(root_0, statementTail147.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end statement

	public static class statementTail_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start statementTail
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1151:1:
	// statementTail : ( variableStatement | emptyStatement |
	// expressionStatement | ifStatement | iterationStatement |
	// continueStatement | breakStatement | returnStatement | withStatement |
	// labelledStatement | switchStatement | throwStatement | tryStatement |
	// constStatement );
	public final statementTail_return statementTail()
			throws RecognitionException {
		statementTail_return retval = new statementTail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		variableStatement_return variableStatement148 = null;

		emptyStatement_return emptyStatement149 = null;

		expressionStatement_return expressionStatement150 = null;

		ifStatement_return ifStatement151 = null;

		iterationStatement_return iterationStatement152 = null;

		continueStatement_return continueStatement153 = null;

		breakStatement_return breakStatement154 = null;

		returnStatement_return returnStatement155 = null;

		withStatement_return withStatement156 = null;

		labelledStatement_return labelledStatement157 = null;

		switchStatement_return switchStatement158 = null;

		throwStatement_return throwStatement159 = null;

		tryStatement_return tryStatement160 = null;

		constStatement_return constStatement161 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1152:2:
			// ( variableStatement | emptyStatement | expressionStatement |
			// ifStatement | iterationStatement | continueStatement |
			// breakStatement | returnStatement | withStatement |
			// labelledStatement | switchStatement | throwStatement |
			// tryStatement | constStatement )
			int alt45 = 14;
			switch (input.LA(1)) {
			case VAR: {
				alt45 = 1;
			}
				break;
			case SEMIC: {
				alt45 = 2;
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
			case RegularExpressionLiteral:
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt45 = 3;
			}
				break;
			case Identifier: {
				int LA45_4 = input.LA(2);

				if ((LA45_4 == COLON)) {
					alt45 = 10;
				} else if ((LA45_4 == EOF
						|| (LA45_4 >= IN && LA45_4 <= INSTANCEOF)
						|| (LA45_4 >= RBRACE && LA45_4 <= LPAREN)
						|| LA45_4 == LBRACK || (LA45_4 >= DOT && LA45_4 <= XOR)
						|| (LA45_4 >= LAND && LA45_4 <= QUE)
						|| (LA45_4 >= ASSIGN && LA45_4 <= DIVASS) || (LA45_4 >= EOL && LA45_4 <= MultiLineComment))) {
					alt45 = 3;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1151:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement );",
							45, 4, input);

					throw nvae;
				}
			}
				break;
			case IF: {
				alt45 = 4;
			}
				break;
			case DO:
			case FOR:
			case WHILE: {
				alt45 = 5;
			}
				break;
			case CONTINUE: {
				alt45 = 6;
			}
				break;
			case BREAK: {
				alt45 = 7;
			}
				break;
			case RETURN: {
				alt45 = 8;
			}
				break;
			case WITH: {
				alt45 = 9;
			}
				break;
			case SWITCH: {
				alt45 = 11;
			}
				break;
			case THROW: {
				alt45 = 12;
			}
				break;
			case TRY: {
				alt45 = 13;
			}
				break;
			case CONST: {
				alt45 = 14;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"1151:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement );",
						45, 0, input);

				throw nvae;
			}

			switch (alt45) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1152:4:
				// variableStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_variableStatement_in_statementTail4589);
				variableStatement148 = variableStatement();
				_fsp--;

				adaptor.addChild(root_0, variableStatement148.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1153:4:
				// emptyStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_emptyStatement_in_statementTail4594);
				emptyStatement149 = emptyStatement();
				_fsp--;

				adaptor.addChild(root_0, emptyStatement149.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1154:4:
				// expressionStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_expressionStatement_in_statementTail4599);
				expressionStatement150 = expressionStatement();
				_fsp--;

				adaptor.addChild(root_0, expressionStatement150.getTree());

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1155:4:
				// ifStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ifStatement_in_statementTail4604);
				ifStatement151 = ifStatement();
				_fsp--;

				adaptor.addChild(root_0, ifStatement151.getTree());

			}
				break;
			case 5:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1156:4:
				// iterationStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_iterationStatement_in_statementTail4609);
				iterationStatement152 = iterationStatement();
				_fsp--;

				adaptor.addChild(root_0, iterationStatement152.getTree());

			}
				break;
			case 6:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1157:4:
				// continueStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_continueStatement_in_statementTail4614);
				continueStatement153 = continueStatement();
				_fsp--;

				adaptor.addChild(root_0, continueStatement153.getTree());

			}
				break;
			case 7:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1158:4:
				// breakStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_breakStatement_in_statementTail4619);
				breakStatement154 = breakStatement();
				_fsp--;

				adaptor.addChild(root_0, breakStatement154.getTree());

			}
				break;
			case 8:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1159:4:
				// returnStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_returnStatement_in_statementTail4624);
				returnStatement155 = returnStatement();
				_fsp--;

				adaptor.addChild(root_0, returnStatement155.getTree());

			}
				break;
			case 9:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1160:4:
				// withStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_withStatement_in_statementTail4629);
				withStatement156 = withStatement();
				_fsp--;

				adaptor.addChild(root_0, withStatement156.getTree());

			}
				break;
			case 10:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1161:4:
				// labelledStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_labelledStatement_in_statementTail4634);
				labelledStatement157 = labelledStatement();
				_fsp--;

				adaptor.addChild(root_0, labelledStatement157.getTree());

			}
				break;
			case 11:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1162:4:
				// switchStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_switchStatement_in_statementTail4639);
				switchStatement158 = switchStatement();
				_fsp--;

				adaptor.addChild(root_0, switchStatement158.getTree());

			}
				break;
			case 12:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1163:4:
				// throwStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_throwStatement_in_statementTail4644);
				throwStatement159 = throwStatement();
				_fsp--;

				adaptor.addChild(root_0, throwStatement159.getTree());

			}
				break;
			case 13:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1164:4:
				// tryStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_tryStatement_in_statementTail4649);
				tryStatement160 = tryStatement();
				_fsp--;

				adaptor.addChild(root_0, tryStatement160.getTree());

			}
				break;
			case 14:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1165:4:
				// constStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_constStatement_in_statementTail4654);
				constStatement161 = constStatement();
				_fsp--;

				adaptor.addChild(root_0, constStatement161.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end statementTail

	public static class block_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start block
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1170:1:
	// block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] (
	// statement )* ) ;
	public final block_return block() throws RecognitionException {
		block_return retval = new block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lb = null;
		Token RBRACE163 = null;
		statement_return statement162 = null;

		Object lb_tree = null;
		Object RBRACE163_tree = null;
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				adaptor, "rule statement");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1171:2:
			// (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] (
			// statement )* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1171:4:
			// lb= LBRACE ( statement )* RBRACE
			{
				lb = (Token) input.LT(1);
				match(input, LBRACE, FOLLOW_LBRACE_in_block4669);
				stream_LBRACE.add(lb);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1171:14:
				// ( statement )*
				loop46: do {
					int alt46 = 2;
					int LA46_0 = input.LA(1);

					if (((LA46_0 >= NULL && LA46_0 <= BREAK)
							|| LA46_0 == CONTINUE
							|| (LA46_0 >= DELETE && LA46_0 <= DO)
							|| LA46_0 == FOR
							|| (LA46_0 >= FUNCTION && LA46_0 <= IF)
							|| (LA46_0 >= NEW && LA46_0 <= WITH)
							|| LA46_0 == CONST
							|| LA46_0 == LBRACE
							|| LA46_0 == LPAREN
							|| LA46_0 == LBRACK
							|| LA46_0 == SEMIC
							|| (LA46_0 >= ADD && LA46_0 <= SUB)
							|| (LA46_0 >= INC && LA46_0 <= DEC)
							|| (LA46_0 >= NOT && LA46_0 <= INV)
							|| (LA46_0 >= Identifier && LA46_0 <= StringLiteral)
							|| LA46_0 == RegularExpressionLiteral || (LA46_0 >= DecimalLiteral && LA46_0 <= HexIntegerLiteral))) {
						alt46 = 1;
					}

					switch (alt46) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1171:14:
						// statement
					{
						pushFollow(FOLLOW_statement_in_block4671);
						statement162 = statement();
						_fsp--;

						stream_statement.add(statement162.getTree());

					}
						break;

					default:
						break loop46;
					}
				} while (true);

				RBRACE163 = (Token) input.LT(1);
				match(input, RBRACE, FOLLOW_RBRACE_in_block4674);
				stream_RBRACE.add(RBRACE163);

				// AST REWRITE
				// elements: statement
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1172:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1172:5:
					// ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								BLOCK, lb, "BLOCK"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1172:28:
						// ( statement )*
						while (stream_statement.hasNext()) {
							adaptor.addChild(root_1, stream_statement.next());

						}
						stream_statement.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end block

	public static class variableStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start variableStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1179:1:
	// variableStatement : VAR variableDeclaration ( COMMA variableDeclaration
	// )* semic -> ^( VAR ( variableDeclaration )+ ) ;
	public final variableStatement_return variableStatement()
			throws RecognitionException {
		variableStatement_return retval = new variableStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR164 = null;
		Token COMMA166 = null;
		variableDeclaration_return variableDeclaration165 = null;

		variableDeclaration_return variableDeclaration167 = null;

		semic_return semic168 = null;

		Object VAR164_tree = null;
		Object COMMA166_tree = null;
		RewriteRuleTokenStream stream_VAR = new RewriteRuleTokenStream(adaptor,
				"token VAR");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_variableDeclaration = new RewriteRuleSubtreeStream(
				adaptor, "rule variableDeclaration");
		RewriteRuleSubtreeStream stream_semic = new RewriteRuleSubtreeStream(
				adaptor, "rule semic");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1180:2:
			// ( VAR variableDeclaration ( COMMA variableDeclaration )* semic ->
			// ^( VAR ( variableDeclaration )+ ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1180:4:
			// VAR variableDeclaration ( COMMA variableDeclaration )* semic
			{
				VAR164 = (Token) input.LT(1);
				match(input, VAR, FOLLOW_VAR_in_variableStatement4703);
				stream_VAR.add(VAR164);

				pushFollow(FOLLOW_variableDeclaration_in_variableStatement4705);
				variableDeclaration165 = variableDeclaration();
				_fsp--;

				stream_variableDeclaration
						.add(variableDeclaration165.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1180:28:
				// ( COMMA variableDeclaration )*
				loop47: do {
					int alt47 = 2;
					int LA47_0 = input.LA(1);

					if ((LA47_0 == COMMA)) {
						alt47 = 1;
					}

					switch (alt47) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1180:30:
						// COMMA variableDeclaration
					{
						COMMA166 = (Token) input.LT(1);
						match(input, COMMA,
								FOLLOW_COMMA_in_variableStatement4709);
						stream_COMMA.add(COMMA166);

						pushFollow(FOLLOW_variableDeclaration_in_variableStatement4711);
						variableDeclaration167 = variableDeclaration();
						_fsp--;

						stream_variableDeclaration.add(variableDeclaration167
								.getTree());

					}
						break;

					default:
						break loop47;
					}
				} while (true);

				pushFollow(FOLLOW_semic_in_variableStatement4716);
				semic168 = semic();
				_fsp--;

				stream_semic.add(semic168.getTree());

				// AST REWRITE
				// elements: VAR, variableDeclaration
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1181:2: -> ^( VAR ( variableDeclaration )+ )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1181:5:
					// ^( VAR ( variableDeclaration )+ )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_VAR.next(),
								root_1);

						if (!(stream_variableDeclaration.hasNext())) {
							throw new RewriteEarlyExitException();
						}
						while (stream_variableDeclaration.hasNext()) {
							adaptor.addChild(root_1, stream_variableDeclaration
									.next());

						}
						stream_variableDeclaration.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end variableStatement

	public static class variableDeclaration_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start variableDeclaration
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1184:1:
	// variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
	public final variableDeclaration_return variableDeclaration()
			throws RecognitionException {
		variableDeclaration_return retval = new variableDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier169 = null;
		Token ASSIGN170 = null;
		assignmentExpression_return assignmentExpression171 = null;

		Object Identifier169_tree = null;
		Object ASSIGN170_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1185:2:
			// ( Identifier ( ASSIGN assignmentExpression )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1185:4:
			// Identifier ( ASSIGN assignmentExpression )?
			{
				root_0 = (Object) adaptor.nil();

				Identifier169 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_variableDeclaration4739);
				Identifier169_tree = (Object) adaptor.create(Identifier169);
				adaptor.addChild(root_0, Identifier169_tree);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1185:15:
				// ( ASSIGN assignmentExpression )?
				int alt48 = 2;
				int LA48_0 = input.LA(1);

				if ((LA48_0 == ASSIGN)) {
					alt48 = 1;
				}
				switch (alt48) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1185:17:
					// ASSIGN assignmentExpression
				{
					ASSIGN170 = (Token) input.LT(1);
					match(input, ASSIGN,
							FOLLOW_ASSIGN_in_variableDeclaration4743);
					ASSIGN170_tree = (Object) adaptor.create(ASSIGN170);
					root_0 = (Object) adaptor
							.becomeRoot(ASSIGN170_tree, root_0);

					pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration4746);
					assignmentExpression171 = assignmentExpression();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpression171.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end variableDeclaration

	public static class variableDeclarationNoIn_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start variableDeclarationNoIn
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1188:1:
	// variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )?
	// ;
	public final variableDeclarationNoIn_return variableDeclarationNoIn()
			throws RecognitionException {
		variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier172 = null;
		Token ASSIGN173 = null;
		assignmentExpressionNoIn_return assignmentExpressionNoIn174 = null;

		Object Identifier172_tree = null;
		Object ASSIGN173_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:2:
			// ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:4:
			// Identifier ( ASSIGN assignmentExpressionNoIn )?
			{
				root_0 = (Object) adaptor.nil();

				Identifier172 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_variableDeclarationNoIn4761);
				Identifier172_tree = (Object) adaptor.create(Identifier172);
				adaptor.addChild(root_0, Identifier172_tree);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:15:
				// ( ASSIGN assignmentExpressionNoIn )?
				int alt49 = 2;
				int LA49_0 = input.LA(1);

				if ((LA49_0 == ASSIGN)) {
					alt49 = 1;
				}
				switch (alt49) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1189:17:
					// ASSIGN assignmentExpressionNoIn
				{
					ASSIGN173 = (Token) input.LT(1);
					match(input, ASSIGN,
							FOLLOW_ASSIGN_in_variableDeclarationNoIn4765);
					ASSIGN173_tree = (Object) adaptor.create(ASSIGN173);
					root_0 = (Object) adaptor
							.becomeRoot(ASSIGN173_tree, root_0);

					pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4768);
					assignmentExpressionNoIn174 = assignmentExpressionNoIn();
					_fsp--;

					adaptor.addChild(root_0, assignmentExpressionNoIn174
							.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end variableDeclarationNoIn

	public static class constStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start constStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1192:1:
	// constStatement : CONST variableDeclaration ( COMMA variableDeclaration )*
	// semic -> ^( CONST ( variableDeclaration )+ ) ;
	public final constStatement_return constStatement()
			throws RecognitionException {
		constStatement_return retval = new constStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONST175 = null;
		Token COMMA177 = null;
		variableDeclaration_return variableDeclaration176 = null;

		variableDeclaration_return variableDeclaration178 = null;

		semic_return semic179 = null;

		Object CONST175_tree = null;
		Object COMMA177_tree = null;
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_CONST = new RewriteRuleTokenStream(
				adaptor, "token CONST");
		RewriteRuleSubtreeStream stream_variableDeclaration = new RewriteRuleSubtreeStream(
				adaptor, "rule variableDeclaration");
		RewriteRuleSubtreeStream stream_semic = new RewriteRuleSubtreeStream(
				adaptor, "rule semic");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:3:
			// ( CONST variableDeclaration ( COMMA variableDeclaration )* semic
			// -> ^( CONST ( variableDeclaration )+ ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:5:
			// CONST variableDeclaration ( COMMA variableDeclaration )* semic
			{
				CONST175 = (Token) input.LT(1);
				match(input, CONST, FOLLOW_CONST_in_constStatement4783);
				stream_CONST.add(CONST175);

				pushFollow(FOLLOW_variableDeclaration_in_constStatement4785);
				variableDeclaration176 = variableDeclaration();
				_fsp--;

				stream_variableDeclaration
						.add(variableDeclaration176.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:31:
				// ( COMMA variableDeclaration )*
				loop50: do {
					int alt50 = 2;
					int LA50_0 = input.LA(1);

					if ((LA50_0 == COMMA)) {
						alt50 = 1;
					}

					switch (alt50) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1193:33:
						// COMMA variableDeclaration
					{
						COMMA177 = (Token) input.LT(1);
						match(input, COMMA, FOLLOW_COMMA_in_constStatement4789);
						stream_COMMA.add(COMMA177);

						pushFollow(FOLLOW_variableDeclaration_in_constStatement4791);
						variableDeclaration178 = variableDeclaration();
						_fsp--;

						stream_variableDeclaration.add(variableDeclaration178
								.getTree());

					}
						break;

					default:
						break loop50;
					}
				} while (true);

				pushFollow(FOLLOW_semic_in_constStatement4796);
				semic179 = semic();
				_fsp--;

				stream_semic.add(semic179.getTree());

				// AST REWRITE
				// elements: variableDeclaration, CONST
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1194:3: -> ^( CONST ( variableDeclaration )+ )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1194:6:
					// ^( CONST ( variableDeclaration )+ )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_CONST
								.next(), root_1);

						if (!(stream_variableDeclaration.hasNext())) {
							throw new RewriteEarlyExitException();
						}
						while (stream_variableDeclaration.hasNext()) {
							adaptor.addChild(root_1, stream_variableDeclaration
									.next());

						}
						stream_variableDeclaration.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end constStatement

	public static class emptyStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start emptyStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1201:1:
	// emptyStatement : SEMIC ;
	public final emptyStatement_return emptyStatement()
			throws RecognitionException {
		emptyStatement_return retval = new emptyStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMIC180 = null;

		Object SEMIC180_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1202:2:
			// ( SEMIC )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1202:4:
			// SEMIC
			{
				root_0 = (Object) adaptor.nil();

				SEMIC180 = (Token) input.LT(1);
				match(input, SEMIC, FOLLOW_SEMIC_in_emptyStatement4826);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end emptyStatement

	public static class expressionStatement_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start expressionStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1215:1:
	// expressionStatement : expression semic ;
	public final expressionStatement_return expressionStatement()
			throws RecognitionException {
		expressionStatement_return retval = new expressionStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		expression_return expression181 = null;

		semic_return semic182 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1216:2:
			// ( expression semic )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1216:4:
			// expression semic
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_expression_in_expressionStatement4845);
				expression181 = expression();
				_fsp--;

				adaptor.addChild(root_0, expression181.getTree());
				pushFollow(FOLLOW_semic_in_expressionStatement4847);
				semic182 = semic();
				_fsp--;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end expressionStatement

	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start ifStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1223:1:
	// ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE
	// statement )? -> ^( IF expression ( statement )+ ) ;
	public final ifStatement_return ifStatement() throws RecognitionException {
		ifStatement_return retval = new ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF183 = null;
		Token LPAREN184 = null;
		Token RPAREN186 = null;
		Token ELSE188 = null;
		expression_return expression185 = null;

		statement_return statement187 = null;

		statement_return statement189 = null;

		Object IF183_tree = null;
		Object LPAREN184_tree = null;
		Object RPAREN186_tree = null;
		Object ELSE188_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleTokenStream stream_IF = new RewriteRuleTokenStream(adaptor,
				"token IF");
		RewriteRuleTokenStream stream_ELSE = new RewriteRuleTokenStream(
				adaptor, "token ELSE");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				adaptor, "rule statement");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1225:2:
			// ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
			// -> ^( IF expression ( statement )+ ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1225:4:
			// IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
			{
				IF183 = (Token) input.LT(1);
				match(input, IF, FOLLOW_IF_in_ifStatement4865);
				stream_IF.add(IF183);

				LPAREN184 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_ifStatement4867);
				stream_LPAREN.add(LPAREN184);

				pushFollow(FOLLOW_expression_in_ifStatement4869);
				expression185 = expression();
				_fsp--;

				stream_expression.add(expression185.getTree());
				RPAREN186 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_ifStatement4871);
				stream_RPAREN.add(RPAREN186);

				pushFollow(FOLLOW_statement_in_ifStatement4873);
				statement187 = statement();
				_fsp--;

				stream_statement.add(statement187.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1225:42:
				// ({...}? ELSE statement )?
				int alt51 = 2;
				int LA51_0 = input.LA(1);

				if ((LA51_0 == ELSE)) {
					int LA51_1 = input.LA(2);

					if ((input.LA(1) == ELSE)) {
						alt51 = 1;
					}
				}
				switch (alt51) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1225:44:
					// {...}? ELSE statement
				{
					if (!(input.LA(1) == ELSE)) {
						throw new FailedPredicateException(input,
								"ifStatement", " input.LA(1) == ELSE ");
					}
					ELSE188 = (Token) input.LT(1);
					match(input, ELSE, FOLLOW_ELSE_in_ifStatement4879);
					stream_ELSE.add(ELSE188);

					pushFollow(FOLLOW_statement_in_ifStatement4881);
					statement189 = statement();
					_fsp--;

					stream_statement.add(statement189.getTree());

				}
					break;

				}

				// AST REWRITE
				// elements: expression, IF, statement
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1226:2: -> ^( IF expression ( statement )+ )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1226:5:
					// ^( IF expression ( statement )+ )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_IF.next(),
								root_1);

						adaptor.addChild(root_1, stream_expression.next());
						if (!(stream_statement.hasNext())) {
							throw new RewriteEarlyExitException();
						}
						while (stream_statement.hasNext()) {
							adaptor.addChild(root_1, stream_statement.next());

						}
						stream_statement.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end ifStatement

	public static class iterationStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start iterationStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1233:1:
	// iterationStatement : ( doStatement | whileStatement | forEachStatement |
	// forStatement );
	public final iterationStatement_return iterationStatement()
			throws RecognitionException {
		iterationStatement_return retval = new iterationStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		doStatement_return doStatement190 = null;

		whileStatement_return whileStatement191 = null;

		forEachStatement_return forEachStatement192 = null;

		forStatement_return forStatement193 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1234:2:
			// ( doStatement | whileStatement | forEachStatement | forStatement
			// )
			int alt52 = 4;
			switch (input.LA(1)) {
			case DO: {
				alt52 = 1;
			}
				break;
			case WHILE: {
				alt52 = 2;
			}
				break;
			case FOR: {
				int LA52_3 = input.LA(2);

				if ((LA52_3 == EACH)) {
					alt52 = 3;
				} else if ((LA52_3 == LPAREN)) {
					alt52 = 4;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1233:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );",
							52, 3, input);

					throw nvae;
				}
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"1233:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );",
						52, 0, input);

				throw nvae;
			}

			switch (alt52) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1234:4:
				// doStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_doStatement_in_iterationStatement4914);
				doStatement190 = doStatement();
				_fsp--;

				adaptor.addChild(root_0, doStatement190.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1235:4:
				// whileStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_whileStatement_in_iterationStatement4919);
				whileStatement191 = whileStatement();
				_fsp--;

				adaptor.addChild(root_0, whileStatement191.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1236:4:
				// forEachStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forEachStatement_in_iterationStatement4924);
				forEachStatement192 = forEachStatement();
				_fsp--;

				adaptor.addChild(root_0, forEachStatement192.getTree());

			}
				break;
			case 4:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1237:4:
				// forStatement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forStatement_in_iterationStatement4929);
				forStatement193 = forStatement();
				_fsp--;

				adaptor.addChild(root_0, forStatement193.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end iterationStatement

	public static class doStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start doStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1240:1:
	// doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO
	// statement expression ) ;
	public final doStatement_return doStatement() throws RecognitionException {
		doStatement_return retval = new doStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DO194 = null;
		Token WHILE196 = null;
		Token LPAREN197 = null;
		Token RPAREN199 = null;
		statement_return statement195 = null;

		expression_return expression198 = null;

		semic_return semic200 = null;

		Object DO194_tree = null;
		Object WHILE196_tree = null;
		Object LPAREN197_tree = null;
		Object RPAREN199_tree = null;
		RewriteRuleTokenStream stream_DO = new RewriteRuleTokenStream(adaptor,
				"token DO");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_WHILE = new RewriteRuleTokenStream(
				adaptor, "token WHILE");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				adaptor, "rule statement");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_semic = new RewriteRuleSubtreeStream(
				adaptor, "rule semic");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1241:2:
			// ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO
			// statement expression ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1241:4:
			// DO statement WHILE LPAREN expression RPAREN semic
			{
				DO194 = (Token) input.LT(1);
				match(input, DO, FOLLOW_DO_in_doStatement4941);
				stream_DO.add(DO194);

				pushFollow(FOLLOW_statement_in_doStatement4943);
				statement195 = statement();
				_fsp--;

				stream_statement.add(statement195.getTree());
				WHILE196 = (Token) input.LT(1);
				match(input, WHILE, FOLLOW_WHILE_in_doStatement4945);
				stream_WHILE.add(WHILE196);

				LPAREN197 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_doStatement4947);
				stream_LPAREN.add(LPAREN197);

				pushFollow(FOLLOW_expression_in_doStatement4949);
				expression198 = expression();
				_fsp--;

				stream_expression.add(expression198.getTree());
				RPAREN199 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_doStatement4951);
				stream_RPAREN.add(RPAREN199);

				pushFollow(FOLLOW_semic_in_doStatement4953);
				semic200 = semic();
				_fsp--;

				stream_semic.add(semic200.getTree());

				// AST REWRITE
				// elements: statement, DO, expression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1242:2: -> ^( DO statement expression )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1242:5:
					// ^( DO statement expression )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_DO.next(),
								root_1);

						adaptor.addChild(root_1, stream_statement.next());
						adaptor.addChild(root_1, stream_expression.next());

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end doStatement

	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start whileStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1245:1:
	// whileStatement : WHILE LPAREN expression RPAREN statement ;
	public final whileStatement_return whileStatement()
			throws RecognitionException {
		whileStatement_return retval = new whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE201 = null;
		Token LPAREN202 = null;
		Token RPAREN204 = null;
		expression_return expression203 = null;

		statement_return statement205 = null;

		Object WHILE201_tree = null;
		Object LPAREN202_tree = null;
		Object RPAREN204_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1246:2:
			// ( WHILE LPAREN expression RPAREN statement )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1246:4:
			// WHILE LPAREN expression RPAREN statement
			{
				root_0 = (Object) adaptor.nil();

				WHILE201 = (Token) input.LT(1);
				match(input, WHILE, FOLLOW_WHILE_in_whileStatement4978);
				WHILE201_tree = (Object) adaptor.create(WHILE201);
				root_0 = (Object) adaptor.becomeRoot(WHILE201_tree, root_0);

				LPAREN202 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_whileStatement4981);
				pushFollow(FOLLOW_expression_in_whileStatement4984);
				expression203 = expression();
				_fsp--;

				adaptor.addChild(root_0, expression203.getTree());
				RPAREN204 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_whileStatement4986);
				pushFollow(FOLLOW_statement_in_whileStatement4989);
				statement205 = statement();
				_fsp--;

				adaptor.addChild(root_0, statement205.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end whileStatement

	public static class forEachStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forEachStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1291:1:
	// forEachStatement : FOR EACH LPAREN forEachControl RPAREN statement ;
	public final forEachStatement_return forEachStatement()
			throws RecognitionException {
		forEachStatement_return retval = new forEachStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOR206 = null;
		Token EACH207 = null;
		Token LPAREN208 = null;
		Token RPAREN210 = null;
		forEachControl_return forEachControl209 = null;

		statement_return statement211 = null;

		Object FOR206_tree = null;
		Object EACH207_tree = null;
		Object LPAREN208_tree = null;
		Object RPAREN210_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1292:3:
			// ( FOR EACH LPAREN forEachControl RPAREN statement )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1292:5:
			// FOR EACH LPAREN forEachControl RPAREN statement
			{
				root_0 = (Object) adaptor.nil();

				FOR206 = (Token) input.LT(1);
				match(input, FOR, FOLLOW_FOR_in_forEachStatement5004);
				EACH207 = (Token) input.LT(1);
				match(input, EACH, FOLLOW_EACH_in_forEachStatement5007);
				EACH207_tree = (Object) adaptor.create(EACH207);
				root_0 = (Object) adaptor.becomeRoot(EACH207_tree, root_0);

				LPAREN208 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_forEachStatement5010);
				pushFollow(FOLLOW_forEachControl_in_forEachStatement5013);
				forEachControl209 = forEachControl();
				_fsp--;

				adaptor.addChild(root_0, forEachControl209.getTree());
				RPAREN210 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_forEachStatement5015);
				pushFollow(FOLLOW_statement_in_forEachStatement5018);
				statement211 = statement();
				_fsp--;

				adaptor.addChild(root_0, statement211.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forEachStatement

	public static class forEachControl_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forEachControl
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1295:1:
	// forEachControl : ( forControlVar | forControlExpression );
	public final forEachControl_return forEachControl()
			throws RecognitionException {
		forEachControl_return retval = new forEachControl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		forControlVar_return forControlVar212 = null;

		forControlExpression_return forControlExpression213 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1296:3:
			// ( forControlVar | forControlExpression )
			int alt53 = 2;
			int LA53_0 = input.LA(1);

			if ((LA53_0 == VAR)) {
				alt53 = 1;
			} else if (((LA53_0 >= NULL && LA53_0 <= FALSE) || LA53_0 == DELETE
					|| LA53_0 == FUNCTION || LA53_0 == NEW || LA53_0 == THIS
					|| LA53_0 == TYPEOF || LA53_0 == VOID || LA53_0 == LBRACE
					|| LA53_0 == LPAREN || LA53_0 == LBRACK
					|| (LA53_0 >= ADD && LA53_0 <= SUB)
					|| (LA53_0 >= INC && LA53_0 <= DEC)
					|| (LA53_0 >= NOT && LA53_0 <= INV)
					|| (LA53_0 >= Identifier && LA53_0 <= StringLiteral)
					|| LA53_0 == RegularExpressionLiteral || (LA53_0 >= DecimalLiteral && LA53_0 <= HexIntegerLiteral))) {
				alt53 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"1295:1: forEachControl : ( forControlVar | forControlExpression );",
						53, 0, input);

				throw nvae;
			}
			switch (alt53) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1296:5:
				// forControlVar
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forControlVar_in_forEachControl5031);
				forControlVar212 = forControlVar();
				_fsp--;

				adaptor.addChild(root_0, forControlVar212.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1297:5:
				// forControlExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forControlExpression_in_forEachControl5037);
				forControlExpression213 = forControlExpression();
				_fsp--;

				adaptor.addChild(root_0, forControlExpression213.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forEachControl

	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1300:1:
	// forStatement : FOR LPAREN forControl RPAREN statement ;
	public final forStatement_return forStatement() throws RecognitionException {
		forStatement_return retval = new forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOR214 = null;
		Token LPAREN215 = null;
		Token RPAREN217 = null;
		forControl_return forControl216 = null;

		statement_return statement218 = null;

		Object FOR214_tree = null;
		Object LPAREN215_tree = null;
		Object RPAREN217_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1301:2:
			// ( FOR LPAREN forControl RPAREN statement )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1301:4:
			// FOR LPAREN forControl RPAREN statement
			{
				root_0 = (Object) adaptor.nil();

				FOR214 = (Token) input.LT(1);
				match(input, FOR, FOLLOW_FOR_in_forStatement5049);
				FOR214_tree = (Object) adaptor.create(FOR214);
				root_0 = (Object) adaptor.becomeRoot(FOR214_tree, root_0);

				LPAREN215 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_forStatement5052);
				pushFollow(FOLLOW_forControl_in_forStatement5055);
				forControl216 = forControl();
				_fsp--;

				adaptor.addChild(root_0, forControl216.getTree());
				RPAREN217 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_forStatement5057);
				pushFollow(FOLLOW_statement_in_forStatement5060);
				statement218 = statement();
				_fsp--;

				adaptor.addChild(root_0, statement218.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forStatement

	public static class forControl_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forControl
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1304:1:
	// forControl : ( forControlVar | forControlExpression | forControlSemic );
	public final forControl_return forControl() throws RecognitionException {
		forControl_return retval = new forControl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		forControlVar_return forControlVar219 = null;

		forControlExpression_return forControlExpression220 = null;

		forControlSemic_return forControlSemic221 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1305:2:
			// ( forControlVar | forControlExpression | forControlSemic )
			int alt54 = 3;
			switch (input.LA(1)) {
			case VAR: {
				alt54 = 1;
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
			case RegularExpressionLiteral:
			case DecimalLiteral:
			case OctalIntegerLiteral:
			case HexIntegerLiteral: {
				alt54 = 2;
			}
				break;
			case SEMIC: {
				alt54 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException(
						"1304:1: forControl : ( forControlVar | forControlExpression | forControlSemic );",
						54, 0, input);

				throw nvae;
			}

			switch (alt54) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1305:4:
				// forControlVar
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forControlVar_in_forControl5071);
				forControlVar219 = forControlVar();
				_fsp--;

				adaptor.addChild(root_0, forControlVar219.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1306:4:
				// forControlExpression
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forControlExpression_in_forControl5076);
				forControlExpression220 = forControlExpression();
				_fsp--;

				adaptor.addChild(root_0, forControlExpression220.getTree());

			}
				break;
			case 3:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1307:4:
				// forControlSemic
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_forControlSemic_in_forControl5081);
				forControlSemic221 = forControlSemic();
				_fsp--;

				adaptor.addChild(root_0, forControlSemic221.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forControl

	public static class forControlVar_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forControlVar
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1310:1:
	// forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^(
	// FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( (
	// COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2=
	// expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR
	// ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
	public final forControlVar_return forControlVar()
			throws RecognitionException {
		forControlVar_return retval = new forControlVar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR222 = null;
		Token IN224 = null;
		Token COMMA226 = null;
		Token SEMIC228 = null;
		Token SEMIC229 = null;
		expression_return ex1 = null;

		expression_return ex2 = null;

		variableDeclarationNoIn_return variableDeclarationNoIn223 = null;

		expression_return expression225 = null;

		variableDeclarationNoIn_return variableDeclarationNoIn227 = null;

		Object VAR222_tree = null;
		Object IN224_tree = null;
		Object COMMA226_tree = null;
		Object SEMIC228_tree = null;
		Object SEMIC229_tree = null;
		RewriteRuleTokenStream stream_VAR = new RewriteRuleTokenStream(adaptor,
				"token VAR");
		RewriteRuleTokenStream stream_IN = new RewriteRuleTokenStream(adaptor,
				"token IN");
		RewriteRuleTokenStream stream_SEMIC = new RewriteRuleTokenStream(
				adaptor, "token SEMIC");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_variableDeclarationNoIn = new RewriteRuleSubtreeStream(
				adaptor, "rule variableDeclarationNoIn");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1311:2:
			// ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^(
			// VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( (
			// COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC
			// (ex2= expression )? -> ^( FORSTEP ^( VAR (
			// variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)?
			// ) ) ) ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1311:4:
			// VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^(
			// VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( (
			// COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC
			// (ex2= expression )? -> ^( FORSTEP ^( VAR (
			// variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)?
			// ) ) ) )
			{
				VAR222 = (Token) input.LT(1);
				match(input, VAR, FOLLOW_VAR_in_forControlVar5092);
				stream_VAR.add(VAR222);

				pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5094);
				variableDeclarationNoIn223 = variableDeclarationNoIn();
				_fsp--;

				stream_variableDeclarationNoIn.add(variableDeclarationNoIn223
						.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1312:2:
				// ( ( IN expression -> ^( FORITER ^( VAR
				// variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( (
				// COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )?
				// SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR (
				// variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR (
				// $ex2)? ) ) ) )
				int alt58 = 2;
				int LA58_0 = input.LA(1);

				if ((LA58_0 == IN)) {
					alt58 = 1;
				} else if (((LA58_0 >= SEMIC && LA58_0 <= COMMA))) {
					alt58 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1312:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )",
							58, 0, input);

					throw nvae;
				}
				switch (alt58) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1313:3:
					// ( IN expression -> ^( FORITER ^( VAR
					// variableDeclarationNoIn ) ^( EXPR expression ) ) )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1313:3:
					// ( IN expression -> ^( FORITER ^( VAR
					// variableDeclarationNoIn ) ^( EXPR expression ) ) )
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1314:4:
					// IN expression
					{
						IN224 = (Token) input.LT(1);
						match(input, IN, FOLLOW_IN_in_forControlVar5106);
						stream_IN.add(IN224);

						pushFollow(FOLLOW_expression_in_forControlVar5108);
						expression225 = expression();
						_fsp--;

						stream_expression.add(expression225.getTree());

						// AST REWRITE
						// elements: VAR, expression, variableDeclarationNoIn
						// token labels:
						// rule labels: retval
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) adaptor.nil();
						// 1315:4: -> ^( FORITER ^( VAR variableDeclarationNoIn
						// ) ^( EXPR expression ) )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1315:7:
							// ^( FORITER ^( VAR variableDeclarationNoIn ) ^(
							// EXPR expression ) )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(FORITER, "FORITER"), root_1);

								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1315:18:
								// ^( VAR variableDeclarationNoIn )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											stream_VAR.next(), root_2);

									adaptor.addChild(root_2,
											stream_variableDeclarationNoIn
													.next());

									adaptor.addChild(root_1, root_2);
								}
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1315:51:
								// ^( EXPR expression )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									adaptor.addChild(root_2, stream_expression
											.next());

									adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1318:3:
					// ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1=
					// expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^(
					// VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^(
					// EXPR ( $ex2)? ) ) )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1318:3:
					// ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1=
					// expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^(
					// VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^(
					// EXPR ( $ex2)? ) ) )
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:4:
					// ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression
					// )? SEMIC (ex2= expression )?
					{
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:4:
						// ( COMMA variableDeclarationNoIn )*
						loop55: do {
							int alt55 = 2;
							int LA55_0 = input.LA(1);

							if ((LA55_0 == COMMA)) {
								alt55 = 1;
							}

							switch (alt55) {
							case 1:
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:6:
								// COMMA variableDeclarationNoIn
							{
								COMMA226 = (Token) input.LT(1);
								match(input, COMMA,
										FOLLOW_COMMA_in_forControlVar5154);
								stream_COMMA.add(COMMA226);

								pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5156);
								variableDeclarationNoIn227 = variableDeclarationNoIn();
								_fsp--;

								stream_variableDeclarationNoIn
										.add(variableDeclarationNoIn227
												.getTree());

							}
								break;

							default:
								break loop55;
							}
						} while (true);

						SEMIC228 = (Token) input.LT(1);
						match(input, SEMIC, FOLLOW_SEMIC_in_forControlVar5161);
						stream_SEMIC.add(SEMIC228);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:48:
						// (ex1= expression )?
						int alt56 = 2;
						int LA56_0 = input.LA(1);

						if (((LA56_0 >= NULL && LA56_0 <= FALSE)
								|| LA56_0 == DELETE
								|| LA56_0 == FUNCTION
								|| LA56_0 == NEW
								|| LA56_0 == THIS
								|| LA56_0 == TYPEOF
								|| LA56_0 == VOID
								|| LA56_0 == LBRACE
								|| LA56_0 == LPAREN
								|| LA56_0 == LBRACK
								|| (LA56_0 >= ADD && LA56_0 <= SUB)
								|| (LA56_0 >= INC && LA56_0 <= DEC)
								|| (LA56_0 >= NOT && LA56_0 <= INV)
								|| (LA56_0 >= Identifier && LA56_0 <= StringLiteral)
								|| LA56_0 == RegularExpressionLiteral || (LA56_0 >= DecimalLiteral && LA56_0 <= HexIntegerLiteral))) {
							alt56 = 1;
						}
						switch (alt56) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:48:
							// ex1= expression
						{
							pushFollow(FOLLOW_expression_in_forControlVar5165);
							ex1 = expression();
							_fsp--;

							stream_expression.add(ex1.getTree());

						}
							break;

						}

						SEMIC229 = (Token) input.LT(1);
						match(input, SEMIC, FOLLOW_SEMIC_in_forControlVar5168);
						stream_SEMIC.add(SEMIC229);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:70:
						// (ex2= expression )?
						int alt57 = 2;
						int LA57_0 = input.LA(1);

						if (((LA57_0 >= NULL && LA57_0 <= FALSE)
								|| LA57_0 == DELETE
								|| LA57_0 == FUNCTION
								|| LA57_0 == NEW
								|| LA57_0 == THIS
								|| LA57_0 == TYPEOF
								|| LA57_0 == VOID
								|| LA57_0 == LBRACE
								|| LA57_0 == LPAREN
								|| LA57_0 == LBRACK
								|| (LA57_0 >= ADD && LA57_0 <= SUB)
								|| (LA57_0 >= INC && LA57_0 <= DEC)
								|| (LA57_0 >= NOT && LA57_0 <= INV)
								|| (LA57_0 >= Identifier && LA57_0 <= StringLiteral)
								|| LA57_0 == RegularExpressionLiteral || (LA57_0 >= DecimalLiteral && LA57_0 <= HexIntegerLiteral))) {
							alt57 = 1;
						}
						switch (alt57) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1319:70:
							// ex2= expression
						{
							pushFollow(FOLLOW_expression_in_forControlVar5172);
							ex2 = expression();
							_fsp--;

							stream_expression.add(ex2.getTree());

						}
							break;

						}

						// AST REWRITE
						// elements: ex2, variableDeclarationNoIn, VAR, ex1
						// token labels:
						// rule labels: retval, ex2, ex1
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);
						RewriteRuleSubtreeStream stream_ex2 = new RewriteRuleSubtreeStream(
								adaptor, "token ex2", ex2 != null ? ex2.tree
										: null);
						RewriteRuleSubtreeStream stream_ex1 = new RewriteRuleSubtreeStream(
								adaptor, "token ex1", ex1 != null ? ex1.tree
										: null);

						root_0 = (Object) adaptor.nil();
						// 1320:4: -> ^( FORSTEP ^( VAR (
						// variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^(
						// EXPR ( $ex2)? ) )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1320:7:
							// ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ )
							// ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(FORSTEP, "FORSTEP"), root_1);

								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1320:18:
								// ^( VAR ( variableDeclarationNoIn )+ )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											stream_VAR.next(), root_2);

									if (!(stream_variableDeclarationNoIn
											.hasNext())) {
										throw new RewriteEarlyExitException();
									}
									while (stream_variableDeclarationNoIn
											.hasNext()) {
										adaptor.addChild(root_2,
												stream_variableDeclarationNoIn
														.next());

									}
									stream_variableDeclarationNoIn.reset();

									adaptor.addChild(root_1, root_2);
								}
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1320:52:
								// ^( EXPR ( $ex1)? )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1320:60:
									// ( $ex1)?
									if (stream_ex1.hasNext()) {
										adaptor.addChild(root_2, stream_ex1
												.next());

									}
									stream_ex1.reset();

									adaptor.addChild(root_1, root_2);
								}
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1320:68:
								// ^( EXPR ( $ex2)? )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1320:76:
									// ( $ex2)?
									if (stream_ex2.hasNext()) {
										adaptor.addChild(root_2, stream_ex2
												.next());

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

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forControlVar

	public static class forControlExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forControlExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1325:1:
	// forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression
	// -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression
	// )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)?
	// ) ^( EXPR ( $ex3)? ) ) ) ) ;
	public final forControlExpression_return forControlExpression()
			throws RecognitionException {
		forControlExpression_return retval = new forControlExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IN230 = null;
		Token SEMIC231 = null;
		Token SEMIC232 = null;
		expressionNoIn_return ex1 = null;

		expression_return ex2 = null;

		expression_return ex3 = null;

		Object IN230_tree = null;
		Object SEMIC231_tree = null;
		Object SEMIC232_tree = null;
		RewriteRuleTokenStream stream_IN = new RewriteRuleTokenStream(adaptor,
				"token IN");
		RewriteRuleTokenStream stream_SEMIC = new RewriteRuleTokenStream(
				adaptor, "token SEMIC");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_expressionNoIn = new RewriteRuleSubtreeStream(
				adaptor, "rule expressionNoIn");

		Object[] isLhs = new Object[1];

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1330:2:
			// (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER
			// ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )?
			// SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR (
			// $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1330:4:
			// ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^(
			// EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC
			// (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)?
			// ) ^( EXPR ( $ex3)? ) ) ) )
			{
				pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5238);
				ex1 = expressionNoIn();
				_fsp--;

				stream_expressionNoIn.add(ex1.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1331:2:
				// ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^(
				// EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3=
				// expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? )
				// ^( EXPR ( $ex3)? ) ) ) )
				int alt61 = 2;
				int LA61_0 = input.LA(1);

				if ((LA61_0 == IN)) {
					alt61 = 1;
				} else if ((LA61_0 == SEMIC)) {
					alt61 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1331:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )",
							61, 0, input);

					throw nvae;
				}
				switch (alt61) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1332:3:
					// {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1)
					// ^( EXPR $ex2) ) )
				{
					if (!(isLeftHandSideIn(ex1, isLhs))) {
						throw new FailedPredicateException(input,
								"forControlExpression",
								" isLeftHandSideIn(ex1, isLhs) ");
					}
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1332:37:
					// ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR
					// $ex2) ) )
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1333:4:
					// IN ex2= expression
					{
						IN230 = (Token) input.LT(1);
						match(input, IN, FOLLOW_IN_in_forControlExpression5253);
						stream_IN.add(IN230);

						pushFollow(FOLLOW_expression_in_forControlExpression5257);
						ex2 = expression();
						_fsp--;

						stream_expression.add(ex2.getTree());

						// AST REWRITE
						// elements: ex2, ex1
						// token labels:
						// rule labels: retval, ex2, ex1
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);
						RewriteRuleSubtreeStream stream_ex2 = new RewriteRuleSubtreeStream(
								adaptor, "token ex2", ex2 != null ? ex2.tree
										: null);
						RewriteRuleSubtreeStream stream_ex1 = new RewriteRuleSubtreeStream(
								adaptor, "token ex1", ex1 != null ? ex1.tree
										: null);

						root_0 = (Object) adaptor.nil();
						// 1334:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1334:7:
							// ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(FORITER, "FORITER"), root_1);

								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1334:18:
								// ^( EXPR $ex1)
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									adaptor.addChild(root_2, stream_ex1.next());

									adaptor.addChild(root_1, root_2);
								}
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1334:33:
								// ^( EXPR $ex2)
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									adaptor.addChild(root_2, stream_ex2.next());

									adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1337:3:
					// ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ->
					// ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR (
					// $ex3)? ) ) )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1337:3:
					// ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ->
					// ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR (
					// $ex3)? ) ) )
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1338:4:
					// SEMIC (ex2= expression )? SEMIC (ex3= expression )?
					{
						SEMIC231 = (Token) input.LT(1);
						match(input, SEMIC,
								FOLLOW_SEMIC_in_forControlExpression5303);
						stream_SEMIC.add(SEMIC231);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1338:13:
						// (ex2= expression )?
						int alt59 = 2;
						int LA59_0 = input.LA(1);

						if (((LA59_0 >= NULL && LA59_0 <= FALSE)
								|| LA59_0 == DELETE
								|| LA59_0 == FUNCTION
								|| LA59_0 == NEW
								|| LA59_0 == THIS
								|| LA59_0 == TYPEOF
								|| LA59_0 == VOID
								|| LA59_0 == LBRACE
								|| LA59_0 == LPAREN
								|| LA59_0 == LBRACK
								|| (LA59_0 >= ADD && LA59_0 <= SUB)
								|| (LA59_0 >= INC && LA59_0 <= DEC)
								|| (LA59_0 >= NOT && LA59_0 <= INV)
								|| (LA59_0 >= Identifier && LA59_0 <= StringLiteral)
								|| LA59_0 == RegularExpressionLiteral || (LA59_0 >= DecimalLiteral && LA59_0 <= HexIntegerLiteral))) {
							alt59 = 1;
						}
						switch (alt59) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1338:13:
							// ex2= expression
						{
							pushFollow(FOLLOW_expression_in_forControlExpression5307);
							ex2 = expression();
							_fsp--;

							stream_expression.add(ex2.getTree());

						}
							break;

						}

						SEMIC232 = (Token) input.LT(1);
						match(input, SEMIC,
								FOLLOW_SEMIC_in_forControlExpression5310);
						stream_SEMIC.add(SEMIC232);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1338:35:
						// (ex3= expression )?
						int alt60 = 2;
						int LA60_0 = input.LA(1);

						if (((LA60_0 >= NULL && LA60_0 <= FALSE)
								|| LA60_0 == DELETE
								|| LA60_0 == FUNCTION
								|| LA60_0 == NEW
								|| LA60_0 == THIS
								|| LA60_0 == TYPEOF
								|| LA60_0 == VOID
								|| LA60_0 == LBRACE
								|| LA60_0 == LPAREN
								|| LA60_0 == LBRACK
								|| (LA60_0 >= ADD && LA60_0 <= SUB)
								|| (LA60_0 >= INC && LA60_0 <= DEC)
								|| (LA60_0 >= NOT && LA60_0 <= INV)
								|| (LA60_0 >= Identifier && LA60_0 <= StringLiteral)
								|| LA60_0 == RegularExpressionLiteral || (LA60_0 >= DecimalLiteral && LA60_0 <= HexIntegerLiteral))) {
							alt60 = 1;
						}
						switch (alt60) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1338:35:
							// ex3= expression
						{
							pushFollow(FOLLOW_expression_in_forControlExpression5314);
							ex3 = expression();
							_fsp--;

							stream_expression.add(ex3.getTree());

						}
							break;

						}

						// AST REWRITE
						// elements: ex1, ex2, ex3
						// token labels:
						// rule labels: retval, ex3, ex2, ex1
						// token list labels:
						// rule list labels:
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "token retval",
								retval != null ? retval.tree : null);
						RewriteRuleSubtreeStream stream_ex3 = new RewriteRuleSubtreeStream(
								adaptor, "token ex3", ex3 != null ? ex3.tree
										: null);
						RewriteRuleSubtreeStream stream_ex2 = new RewriteRuleSubtreeStream(
								adaptor, "token ex2", ex2 != null ? ex2.tree
										: null);
						RewriteRuleSubtreeStream stream_ex1 = new RewriteRuleSubtreeStream(
								adaptor, "token ex1", ex1 != null ? ex1.tree
										: null);

						root_0 = (Object) adaptor.nil();
						// 1339:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)?
						// ) ^( EXPR ( $ex3)? ) )
						{
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:7:
							// ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^(
							// EXPR ( $ex3)? ) )
							{
								Object root_1 = (Object) adaptor.nil();
								root_1 = (Object) adaptor.becomeRoot(adaptor
										.create(FORSTEP, "FORSTEP"), root_1);

								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:18:
								// ^( EXPR $ex1)
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									adaptor.addChild(root_2, stream_ex1.next());

									adaptor.addChild(root_1, root_2);
								}
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:33:
								// ^( EXPR ( $ex2)? )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:41:
									// ( $ex2)?
									if (stream_ex2.hasNext()) {
										adaptor.addChild(root_2, stream_ex2
												.next());

									}
									stream_ex2.reset();

									adaptor.addChild(root_1, root_2);
								}
								// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:49:
								// ^( EXPR ( $ex3)? )
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											adaptor.create(EXPR, "EXPR"),
											root_2);

									// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1339:57:
									// ( $ex3)?
									if (stream_ex3.hasNext()) {
										adaptor.addChild(root_2, stream_ex3
												.next());

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

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forControlExpression

	public static class forControlSemic_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start forControlSemic
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1344:1:
	// forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? ->
	// ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
	public final forControlSemic_return forControlSemic()
			throws RecognitionException {
		forControlSemic_return retval = new forControlSemic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMIC233 = null;
		Token SEMIC234 = null;
		expression_return ex1 = null;

		expression_return ex2 = null;

		Object SEMIC233_tree = null;
		Object SEMIC234_tree = null;
		RewriteRuleTokenStream stream_SEMIC = new RewriteRuleTokenStream(
				adaptor, "token SEMIC");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:2:
			// ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^(
			// FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:4:
			// SEMIC (ex1= expression )? SEMIC (ex2= expression )?
			{
				SEMIC233 = (Token) input.LT(1);
				match(input, SEMIC, FOLLOW_SEMIC_in_forControlSemic5373);
				stream_SEMIC.add(SEMIC233);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:13:
				// (ex1= expression )?
				int alt62 = 2;
				int LA62_0 = input.LA(1);

				if (((LA62_0 >= NULL && LA62_0 <= FALSE) || LA62_0 == DELETE
						|| LA62_0 == FUNCTION || LA62_0 == NEW
						|| LA62_0 == THIS || LA62_0 == TYPEOF || LA62_0 == VOID
						|| LA62_0 == LBRACE || LA62_0 == LPAREN
						|| LA62_0 == LBRACK || (LA62_0 >= ADD && LA62_0 <= SUB)
						|| (LA62_0 >= INC && LA62_0 <= DEC)
						|| (LA62_0 >= NOT && LA62_0 <= INV)
						|| (LA62_0 >= Identifier && LA62_0 <= StringLiteral)
						|| LA62_0 == RegularExpressionLiteral || (LA62_0 >= DecimalLiteral && LA62_0 <= HexIntegerLiteral))) {
					alt62 = 1;
				}
				switch (alt62) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:13:
					// ex1= expression
				{
					pushFollow(FOLLOW_expression_in_forControlSemic5377);
					ex1 = expression();
					_fsp--;

					stream_expression.add(ex1.getTree());

				}
					break;

				}

				SEMIC234 = (Token) input.LT(1);
				match(input, SEMIC, FOLLOW_SEMIC_in_forControlSemic5380);
				stream_SEMIC.add(SEMIC234);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:35:
				// (ex2= expression )?
				int alt63 = 2;
				int LA63_0 = input.LA(1);

				if (((LA63_0 >= NULL && LA63_0 <= FALSE) || LA63_0 == DELETE
						|| LA63_0 == FUNCTION || LA63_0 == NEW
						|| LA63_0 == THIS || LA63_0 == TYPEOF || LA63_0 == VOID
						|| LA63_0 == LBRACE || LA63_0 == LPAREN
						|| LA63_0 == LBRACK || (LA63_0 >= ADD && LA63_0 <= SUB)
						|| (LA63_0 >= INC && LA63_0 <= DEC)
						|| (LA63_0 >= NOT && LA63_0 <= INV)
						|| (LA63_0 >= Identifier && LA63_0 <= StringLiteral)
						|| LA63_0 == RegularExpressionLiteral || (LA63_0 >= DecimalLiteral && LA63_0 <= HexIntegerLiteral))) {
					alt63 = 1;
				}
				switch (alt63) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1345:35:
					// ex2= expression
				{
					pushFollow(FOLLOW_expression_in_forControlSemic5384);
					ex2 = expression();
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
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);
				RewriteRuleSubtreeStream stream_ex2 = new RewriteRuleSubtreeStream(
						adaptor, "token ex2", ex2 != null ? ex2.tree : null);
				RewriteRuleSubtreeStream stream_ex1 = new RewriteRuleSubtreeStream(
						adaptor, "token ex1", ex1 != null ? ex1.tree : null);

				root_0 = (Object) adaptor.nil();
				// 1346:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR (
				// $ex2)? ) )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1346:5:
					// ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)?
					// ) )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								FORSTEP, "FORSTEP"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1346:16:
						// ^( EXPR )
						{
							Object root_2 = (Object) adaptor.nil();
							root_2 = (Object) adaptor.becomeRoot(adaptor
									.create(EXPR, "EXPR"), root_2);

							adaptor.addChild(root_1, root_2);
						}
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1346:26:
						// ^( EXPR ( $ex1)? )
						{
							Object root_2 = (Object) adaptor.nil();
							root_2 = (Object) adaptor.becomeRoot(adaptor
									.create(EXPR, "EXPR"), root_2);

							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1346:34:
							// ( $ex1)?
							if (stream_ex1.hasNext()) {
								adaptor.addChild(root_2, stream_ex1.next());

							}
							stream_ex1.reset();

							adaptor.addChild(root_1, root_2);
						}
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1346:42:
						// ^( EXPR ( $ex2)? )
						{
							Object root_2 = (Object) adaptor.nil();
							root_2 = (Object) adaptor.becomeRoot(adaptor
									.create(EXPR, "EXPR"), root_2);

							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1346:50:
							// ( $ex2)?
							if (stream_ex2.hasNext()) {
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

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end forControlSemic

	public static class continueStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start continueStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1358:1:
	// continueStatement : CONTINUE ( Identifier )? semic ;
	public final continueStatement_return continueStatement()
			throws RecognitionException {
		continueStatement_return retval = new continueStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONTINUE235 = null;
		Token Identifier236 = null;
		semic_return semic237 = null;

		Object CONTINUE235_tree = null;
		Object Identifier236_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1359:2:
			// ( CONTINUE ( Identifier )? semic )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1359:4:
			// CONTINUE ( Identifier )? semic
			{
				root_0 = (Object) adaptor.nil();

				CONTINUE235 = (Token) input.LT(1);
				match(input, CONTINUE, FOLLOW_CONTINUE_in_continueStatement5438);
				CONTINUE235_tree = (Object) adaptor.create(CONTINUE235);
				root_0 = (Object) adaptor.becomeRoot(CONTINUE235_tree, root_0);

				if (input.LA(1) == Identifier)
					promoteEOL(null);
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1359:67:
				// ( Identifier )?
				int alt64 = 2;
				int LA64_0 = input.LA(1);

				if ((LA64_0 == Identifier)) {
					alt64 = 1;
				}
				switch (alt64) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1359:67:
					// Identifier
				{
					Identifier236 = (Token) input.LT(1);
					match(input, Identifier,
							FOLLOW_Identifier_in_continueStatement5443);
					Identifier236_tree = (Object) adaptor.create(Identifier236);
					adaptor.addChild(root_0, Identifier236_tree);

				}
					break;

				}

				pushFollow(FOLLOW_semic_in_continueStatement5446);
				semic237 = semic();
				_fsp--;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end continueStatement

	public static class breakStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start breakStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1371:1:
	// breakStatement : BREAK ( Identifier )? semic ;
	public final breakStatement_return breakStatement()
			throws RecognitionException {
		breakStatement_return retval = new breakStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BREAK238 = null;
		Token Identifier239 = null;
		semic_return semic240 = null;

		Object BREAK238_tree = null;
		Object Identifier239_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1372:2:
			// ( BREAK ( Identifier )? semic )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1372:4:
			// BREAK ( Identifier )? semic
			{
				root_0 = (Object) adaptor.nil();

				BREAK238 = (Token) input.LT(1);
				match(input, BREAK, FOLLOW_BREAK_in_breakStatement5465);
				BREAK238_tree = (Object) adaptor.create(BREAK238);
				root_0 = (Object) adaptor.becomeRoot(BREAK238_tree, root_0);

				if (input.LA(1) == Identifier)
					promoteEOL(null);
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1372:64:
				// ( Identifier )?
				int alt65 = 2;
				int LA65_0 = input.LA(1);

				if ((LA65_0 == Identifier)) {
					alt65 = 1;
				}
				switch (alt65) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1372:64:
					// Identifier
				{
					Identifier239 = (Token) input.LT(1);
					match(input, Identifier,
							FOLLOW_Identifier_in_breakStatement5470);
					Identifier239_tree = (Object) adaptor.create(Identifier239);
					adaptor.addChild(root_0, Identifier239_tree);

				}
					break;

				}

				pushFollow(FOLLOW_semic_in_breakStatement5473);
				semic240 = semic();
				_fsp--;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end breakStatement

	public static class returnStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start returnStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1392:1:
	// returnStatement : RETURN ( expression )? semic ;
	public final returnStatement_return returnStatement()
			throws RecognitionException {
		returnStatement_return retval = new returnStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN241 = null;
		expression_return expression242 = null;

		semic_return semic243 = null;

		Object RETURN241_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1393:2:
			// ( RETURN ( expression )? semic )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1393:4:
			// RETURN ( expression )? semic
			{
				root_0 = (Object) adaptor.nil();

				RETURN241 = (Token) input.LT(1);
				match(input, RETURN, FOLLOW_RETURN_in_returnStatement5492);
				RETURN241_tree = (Object) adaptor.create(RETURN241);
				root_0 = (Object) adaptor.becomeRoot(RETURN241_tree, root_0);

				promoteEOL(null);
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1393:34:
				// ( expression )?
				int alt66 = 2;
				int LA66_0 = input.LA(1);

				if (((LA66_0 >= NULL && LA66_0 <= FALSE) || LA66_0 == DELETE
						|| LA66_0 == FUNCTION || LA66_0 == NEW
						|| LA66_0 == THIS || LA66_0 == TYPEOF || LA66_0 == VOID
						|| LA66_0 == LBRACE || LA66_0 == LPAREN
						|| LA66_0 == LBRACK || (LA66_0 >= ADD && LA66_0 <= SUB)
						|| (LA66_0 >= INC && LA66_0 <= DEC)
						|| (LA66_0 >= NOT && LA66_0 <= INV)
						|| (LA66_0 >= Identifier && LA66_0 <= StringLiteral)
						|| LA66_0 == RegularExpressionLiteral || (LA66_0 >= DecimalLiteral && LA66_0 <= HexIntegerLiteral))) {
					alt66 = 1;
				}
				switch (alt66) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1393:34:
					// expression
				{
					pushFollow(FOLLOW_expression_in_returnStatement5497);
					expression242 = expression();
					_fsp--;

					adaptor.addChild(root_0, expression242.getTree());

				}
					break;

				}

				pushFollow(FOLLOW_semic_in_returnStatement5500);
				semic243 = semic();
				_fsp--;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end returnStatement

	public static class withStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start withStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1400:1:
	// withStatement : WITH LPAREN expression RPAREN statement ;
	public final withStatement_return withStatement()
			throws RecognitionException {
		withStatement_return retval = new withStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WITH244 = null;
		Token LPAREN245 = null;
		Token RPAREN247 = null;
		expression_return expression246 = null;

		statement_return statement248 = null;

		Object WITH244_tree = null;
		Object LPAREN245_tree = null;
		Object RPAREN247_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1401:2:
			// ( WITH LPAREN expression RPAREN statement )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1401:4:
			// WITH LPAREN expression RPAREN statement
			{
				root_0 = (Object) adaptor.nil();

				WITH244 = (Token) input.LT(1);
				match(input, WITH, FOLLOW_WITH_in_withStatement5517);
				WITH244_tree = (Object) adaptor.create(WITH244);
				root_0 = (Object) adaptor.becomeRoot(WITH244_tree, root_0);

				LPAREN245 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_withStatement5520);
				pushFollow(FOLLOW_expression_in_withStatement5523);
				expression246 = expression();
				_fsp--;

				adaptor.addChild(root_0, expression246.getTree());
				RPAREN247 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_withStatement5525);
				pushFollow(FOLLOW_statement_in_withStatement5528);
				statement248 = statement();
				_fsp--;

				adaptor.addChild(root_0, statement248.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end withStatement

	public static class switchStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start switchStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1408:1:
	// switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? =>
	// defaultClause | caseClause )* RBRACE -> ^( SWITCH expression (
	// defaultClause )? ( caseClause )* ) ;
	public final switchStatement_return switchStatement()
			throws RecognitionException {
		switchStatement_return retval = new switchStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SWITCH249 = null;
		Token LPAREN250 = null;
		Token RPAREN252 = null;
		Token LBRACE253 = null;
		Token RBRACE256 = null;
		expression_return expression251 = null;

		defaultClause_return defaultClause254 = null;

		caseClause_return caseClause255 = null;

		Object SWITCH249_tree = null;
		Object LPAREN250_tree = null;
		Object RPAREN252_tree = null;
		Object LBRACE253_tree = null;
		Object RBRACE256_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_SWITCH = new RewriteRuleTokenStream(
				adaptor, "token SWITCH");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_caseClause = new RewriteRuleSubtreeStream(
				adaptor, "rule caseClause");
		RewriteRuleSubtreeStream stream_defaultClause = new RewriteRuleSubtreeStream(
				adaptor, "rule defaultClause");

		int defaultClauseCount = 0;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1413:2:
			// ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause
			// | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )?
			// ( caseClause )* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1413:4:
			// SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause |
			// caseClause )* RBRACE
			{
				SWITCH249 = (Token) input.LT(1);
				match(input, SWITCH, FOLLOW_SWITCH_in_switchStatement5549);
				stream_SWITCH.add(SWITCH249);

				LPAREN250 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_switchStatement5551);
				stream_LPAREN.add(LPAREN250);

				pushFollow(FOLLOW_expression_in_switchStatement5553);
				expression251 = expression();
				_fsp--;

				stream_expression.add(expression251.getTree());
				RPAREN252 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_switchStatement5555);
				stream_RPAREN.add(RPAREN252);

				LBRACE253 = (Token) input.LT(1);
				match(input, LBRACE, FOLLOW_LBRACE_in_switchStatement5557);
				stream_LBRACE.add(LBRACE253);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1413:43:
				// ({...}? => defaultClause | caseClause )*
				loop67: do {
					int alt67 = 3;
					int LA67_0 = input.LA(1);

					if ((LA67_0 == DEFAULT) && (defaultClauseCount == 0)) {
						alt67 = 1;
					} else if ((LA67_0 == CASE)) {
						alt67 = 2;
					}

					switch (alt67) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1413:45:
						// {...}? => defaultClause
					{
						if (!(defaultClauseCount == 0)) {
							throw new FailedPredicateException(input,
									"switchStatement",
									" defaultClauseCount == 0 ");
						}
						pushFollow(FOLLOW_defaultClause_in_switchStatement5564);
						defaultClause254 = defaultClause();
						_fsp--;

						stream_defaultClause.add(defaultClause254.getTree());
						defaultClauseCount++;

					}
						break;
					case 2:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1413:118:
						// caseClause
					{
						pushFollow(FOLLOW_caseClause_in_switchStatement5570);
						caseClause255 = caseClause();
						_fsp--;

						stream_caseClause.add(caseClause255.getTree());

					}
						break;

					default:
						break loop67;
					}
				} while (true);

				RBRACE256 = (Token) input.LT(1);
				match(input, RBRACE, FOLLOW_RBRACE_in_switchStatement5575);
				stream_RBRACE.add(RBRACE256);

				// AST REWRITE
				// elements: expression, caseClause, SWITCH, defaultClause
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1414:2: -> ^( SWITCH expression ( defaultClause )? (
				// caseClause )* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1414:5:
					// ^( SWITCH expression ( defaultClause )? ( caseClause )* )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_SWITCH
								.next(), root_1);

						adaptor.addChild(root_1, stream_expression.next());
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1414:26:
						// ( defaultClause )?
						if (stream_defaultClause.hasNext()) {
							adaptor.addChild(root_1, stream_defaultClause
									.next());

						}
						stream_defaultClause.reset();
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1414:41:
						// ( caseClause )*
						while (stream_caseClause.hasNext()) {
							adaptor.addChild(root_1, stream_caseClause.next());

						}
						stream_caseClause.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end switchStatement

	public static class caseClause_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start caseClause
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1417:1:
	// caseClause : CASE expression COLON ( statement )* ;
	public final caseClause_return caseClause() throws RecognitionException {
		caseClause_return retval = new caseClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CASE257 = null;
		Token COLON259 = null;
		expression_return expression258 = null;

		statement_return statement260 = null;

		Object CASE257_tree = null;
		Object COLON259_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1418:2:
			// ( CASE expression COLON ( statement )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1418:4:
			// CASE expression COLON ( statement )*
			{
				root_0 = (Object) adaptor.nil();

				CASE257 = (Token) input.LT(1);
				match(input, CASE, FOLLOW_CASE_in_caseClause5603);
				CASE257_tree = (Object) adaptor.create(CASE257);
				root_0 = (Object) adaptor.becomeRoot(CASE257_tree, root_0);

				pushFollow(FOLLOW_expression_in_caseClause5606);
				expression258 = expression();
				_fsp--;

				adaptor.addChild(root_0, expression258.getTree());
				COLON259 = (Token) input.LT(1);
				match(input, COLON, FOLLOW_COLON_in_caseClause5608);
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1418:28:
				// ( statement )*
				loop68: do {
					int alt68 = 2;
					int LA68_0 = input.LA(1);

					if (((LA68_0 >= NULL && LA68_0 <= BREAK)
							|| LA68_0 == CONTINUE
							|| (LA68_0 >= DELETE && LA68_0 <= DO)
							|| LA68_0 == FOR
							|| (LA68_0 >= FUNCTION && LA68_0 <= IF)
							|| (LA68_0 >= NEW && LA68_0 <= WITH)
							|| LA68_0 == CONST
							|| LA68_0 == LBRACE
							|| LA68_0 == LPAREN
							|| LA68_0 == LBRACK
							|| LA68_0 == SEMIC
							|| (LA68_0 >= ADD && LA68_0 <= SUB)
							|| (LA68_0 >= INC && LA68_0 <= DEC)
							|| (LA68_0 >= NOT && LA68_0 <= INV)
							|| (LA68_0 >= Identifier && LA68_0 <= StringLiteral)
							|| LA68_0 == RegularExpressionLiteral || (LA68_0 >= DecimalLiteral && LA68_0 <= HexIntegerLiteral))) {
						alt68 = 1;
					}

					switch (alt68) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1418:28:
						// statement
					{
						pushFollow(FOLLOW_statement_in_caseClause5611);
						statement260 = statement();
						_fsp--;

						adaptor.addChild(root_0, statement260.getTree());

					}
						break;

					default:
						break loop68;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end caseClause

	public static class defaultClause_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start defaultClause
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1421:1:
	// defaultClause : DEFAULT COLON ( statement )* ;
	public final defaultClause_return defaultClause()
			throws RecognitionException {
		defaultClause_return retval = new defaultClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DEFAULT261 = null;
		Token COLON262 = null;
		statement_return statement263 = null;

		Object DEFAULT261_tree = null;
		Object COLON262_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1422:2:
			// ( DEFAULT COLON ( statement )* )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1422:4:
			// DEFAULT COLON ( statement )*
			{
				root_0 = (Object) adaptor.nil();

				DEFAULT261 = (Token) input.LT(1);
				match(input, DEFAULT, FOLLOW_DEFAULT_in_defaultClause5624);
				DEFAULT261_tree = (Object) adaptor.create(DEFAULT261);
				root_0 = (Object) adaptor.becomeRoot(DEFAULT261_tree, root_0);

				COLON262 = (Token) input.LT(1);
				match(input, COLON, FOLLOW_COLON_in_defaultClause5627);
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1422:20:
				// ( statement )*
				loop69: do {
					int alt69 = 2;
					int LA69_0 = input.LA(1);

					if (((LA69_0 >= NULL && LA69_0 <= BREAK)
							|| LA69_0 == CONTINUE
							|| (LA69_0 >= DELETE && LA69_0 <= DO)
							|| LA69_0 == FOR
							|| (LA69_0 >= FUNCTION && LA69_0 <= IF)
							|| (LA69_0 >= NEW && LA69_0 <= WITH)
							|| LA69_0 == CONST
							|| LA69_0 == LBRACE
							|| LA69_0 == LPAREN
							|| LA69_0 == LBRACK
							|| LA69_0 == SEMIC
							|| (LA69_0 >= ADD && LA69_0 <= SUB)
							|| (LA69_0 >= INC && LA69_0 <= DEC)
							|| (LA69_0 >= NOT && LA69_0 <= INV)
							|| (LA69_0 >= Identifier && LA69_0 <= StringLiteral)
							|| LA69_0 == RegularExpressionLiteral || (LA69_0 >= DecimalLiteral && LA69_0 <= HexIntegerLiteral))) {
						alt69 = 1;
					}

					switch (alt69) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1422:20:
						// statement
					{
						pushFollow(FOLLOW_statement_in_defaultClause5630);
						statement263 = statement();
						_fsp--;

						adaptor.addChild(root_0, statement263.getTree());

					}
						break;

					default:
						break loop69;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end defaultClause

	public static class labelledStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start labelledStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1429:1:
	// labelledStatement : Identifier COLON statement -> ^( LABELLED Identifier
	// statement ) ;
	public final labelledStatement_return labelledStatement()
			throws RecognitionException {
		labelledStatement_return retval = new labelledStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier264 = null;
		Token COLON265 = null;
		statement_return statement266 = null;

		Object Identifier264_tree = null;
		Object COLON265_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				adaptor, "token COLON");
		RewriteRuleTokenStream stream_Identifier = new RewriteRuleTokenStream(
				adaptor, "token Identifier");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				adaptor, "rule statement");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1430:2:
			// ( Identifier COLON statement -> ^( LABELLED Identifier statement
			// ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1430:4:
			// Identifier COLON statement
			{
				Identifier264 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_labelledStatement5647);
				stream_Identifier.add(Identifier264);

				COLON265 = (Token) input.LT(1);
				match(input, COLON, FOLLOW_COLON_in_labelledStatement5649);
				stream_COLON.add(COLON265);

				pushFollow(FOLLOW_statement_in_labelledStatement5651);
				statement266 = statement();
				_fsp--;

				stream_statement.add(statement266.getTree());

				// AST REWRITE
				// elements: statement, Identifier
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1431:2: -> ^( LABELLED Identifier statement )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1431:5:
					// ^( LABELLED Identifier statement )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								LABELLED, "LABELLED"), root_1);

						adaptor.addChild(root_1, stream_Identifier.next());
						adaptor.addChild(root_1, stream_statement.next());

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end labelledStatement

	public static class throwStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start throwStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1453:1:
	// throwStatement : THROW expression semic ;
	public final throwStatement_return throwStatement()
			throws RecognitionException {
		throwStatement_return retval = new throwStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token THROW267 = null;
		expression_return expression268 = null;

		semic_return semic269 = null;

		Object THROW267_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1454:2:
			// ( THROW expression semic )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1454:4:
			// THROW expression semic
			{
				root_0 = (Object) adaptor.nil();

				THROW267 = (Token) input.LT(1);
				match(input, THROW, FOLLOW_THROW_in_throwStatement5682);
				THROW267_tree = (Object) adaptor.create(THROW267);
				root_0 = (Object) adaptor.becomeRoot(THROW267_tree, root_0);

				promoteEOL(null);
				pushFollow(FOLLOW_expression_in_throwStatement5687);
				expression268 = expression();
				_fsp--;

				adaptor.addChild(root_0, expression268.getTree());
				pushFollow(FOLLOW_semic_in_throwStatement5689);
				semic269 = semic();
				_fsp--;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end throwStatement

	public static class tryStatement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start tryStatement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1461:1:
	// tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? |
	// finallyClause ) ;
	public final tryStatement_return tryStatement() throws RecognitionException {
		tryStatement_return retval = new tryStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRY270 = null;
		block_return block271 = null;

		catchClause_return catchClause272 = null;

		finallyClause_return finallyClause273 = null;

		finallyClause_return finallyClause274 = null;

		Object TRY270_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:2:
			// ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause
			// ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:4:
			// TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
			{
				root_0 = (Object) adaptor.nil();

				TRY270 = (Token) input.LT(1);
				match(input, TRY, FOLLOW_TRY_in_tryStatement5706);
				TRY270_tree = (Object) adaptor.create(TRY270);
				root_0 = (Object) adaptor.becomeRoot(TRY270_tree, root_0);

				pushFollow(FOLLOW_block_in_tryStatement5709);
				block271 = block();
				_fsp--;

				adaptor.addChild(root_0, block271.getTree());
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:15:
				// ( ( catchClause )+ ( finallyClause )? | finallyClause )
				int alt72 = 2;
				int LA72_0 = input.LA(1);

				if ((LA72_0 == CATCH)) {
					alt72 = 1;
				} else if ((LA72_0 == FINALLY)) {
					alt72 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1462:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )",
							72, 0, input);

					throw nvae;
				}
				switch (alt72) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:17:
					// ( catchClause )+ ( finallyClause )?
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:17:
					// ( catchClause )+
					int cnt70 = 0;
					loop70: do {
						int alt70 = 2;
						int LA70_0 = input.LA(1);

						if ((LA70_0 == CATCH)) {
							alt70 = 1;
						}

						switch (alt70) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:17:
							// catchClause
						{
							pushFollow(FOLLOW_catchClause_in_tryStatement5713);
							catchClause272 = catchClause();
							_fsp--;

							adaptor.addChild(root_0, catchClause272.getTree());

						}
							break;

						default:
							if (cnt70 >= 1)
								break loop70;
							EarlyExitException eee = new EarlyExitException(70,
									input);
							throw eee;
						}
						cnt70++;
					} while (true);

					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:30:
					// ( finallyClause )?
					int alt71 = 2;
					int LA71_0 = input.LA(1);

					if ((LA71_0 == FINALLY)) {
						alt71 = 1;
					}
					switch (alt71) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:30:
						// finallyClause
					{
						pushFollow(FOLLOW_finallyClause_in_tryStatement5716);
						finallyClause273 = finallyClause();
						_fsp--;

						adaptor.addChild(root_0, finallyClause273.getTree());

					}
						break;

					}

				}
					break;
				case 2:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1462:47:
					// finallyClause
				{
					pushFollow(FOLLOW_finallyClause_in_tryStatement5721);
					finallyClause274 = finallyClause();
					_fsp--;

					adaptor.addChild(root_0, finallyClause274.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end tryStatement

	public static class catchClause_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start catchClause
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1465:1:
	// catchClause : CATCH LPAREN Identifier ( catchFilter )? RPAREN block ;
	public final catchClause_return catchClause() throws RecognitionException {
		catchClause_return retval = new catchClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CATCH275 = null;
		Token LPAREN276 = null;
		Token Identifier277 = null;
		Token RPAREN279 = null;
		catchFilter_return catchFilter278 = null;

		block_return block280 = null;

		Object CATCH275_tree = null;
		Object LPAREN276_tree = null;
		Object Identifier277_tree = null;
		Object RPAREN279_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1466:2:
			// ( CATCH LPAREN Identifier ( catchFilter )? RPAREN block )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1466:4:
			// CATCH LPAREN Identifier ( catchFilter )? RPAREN block
			{
				root_0 = (Object) adaptor.nil();

				CATCH275 = (Token) input.LT(1);
				match(input, CATCH, FOLLOW_CATCH_in_catchClause5735);
				CATCH275_tree = (Object) adaptor.create(CATCH275);
				root_0 = (Object) adaptor.becomeRoot(CATCH275_tree, root_0);

				LPAREN276 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_catchClause5738);
				Identifier277 = (Token) input.LT(1);
				match(input, Identifier, FOLLOW_Identifier_in_catchClause5741);
				Identifier277_tree = (Object) adaptor.create(Identifier277);
				adaptor.addChild(root_0, Identifier277_tree);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1466:30:
				// ( catchFilter )?
				int alt73 = 2;
				int LA73_0 = input.LA(1);

				if ((LA73_0 == IF)) {
					alt73 = 1;
				}
				switch (alt73) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1466:30:
					// catchFilter
				{
					pushFollow(FOLLOW_catchFilter_in_catchClause5743);
					catchFilter278 = catchFilter();
					_fsp--;

					adaptor.addChild(root_0, catchFilter278.getTree());

				}
					break;

				}

				RPAREN279 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_catchClause5746);
				pushFollow(FOLLOW_block_in_catchClause5749);
				block280 = block();
				_fsp--;

				adaptor.addChild(root_0, block280.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end catchClause

	public static class catchFilter_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start catchFilter
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1469:1:
	// catchFilter : IF instanceofExpression ;
	public final catchFilter_return catchFilter() throws RecognitionException {
		catchFilter_return retval = new catchFilter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF281 = null;
		instanceofExpression_return instanceofExpression282 = null;

		Object IF281_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1470:3:
			// ( IF instanceofExpression )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1470:5:
			// IF instanceofExpression
			{
				root_0 = (Object) adaptor.nil();

				IF281 = (Token) input.LT(1);
				match(input, IF, FOLLOW_IF_in_catchFilter5762);
				IF281_tree = (Object) adaptor.create(IF281);
				root_0 = (Object) adaptor.becomeRoot(IF281_tree, root_0);

				pushFollow(FOLLOW_instanceofExpression_in_catchFilter5765);
				instanceofExpression282 = instanceofExpression();
				_fsp--;

				adaptor.addChild(root_0, instanceofExpression282.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end catchFilter

	public static class instanceofExpression_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start instanceofExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1473:1:
	// instanceofExpression : Identifier INSTANCEOF Identifier ;
	public final instanceofExpression_return instanceofExpression()
			throws RecognitionException {
		instanceofExpression_return retval = new instanceofExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier283 = null;
		Token INSTANCEOF284 = null;
		Token Identifier285 = null;

		Object Identifier283_tree = null;
		Object INSTANCEOF284_tree = null;
		Object Identifier285_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1474:3:
			// ( Identifier INSTANCEOF Identifier )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1474:5:
			// Identifier INSTANCEOF Identifier
			{
				root_0 = (Object) adaptor.nil();

				Identifier283 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_instanceofExpression5780);
				Identifier283_tree = (Object) adaptor.create(Identifier283);
				adaptor.addChild(root_0, Identifier283_tree);

				INSTANCEOF284 = (Token) input.LT(1);
				match(input, INSTANCEOF,
						FOLLOW_INSTANCEOF_in_instanceofExpression5782);
				INSTANCEOF284_tree = (Object) adaptor.create(INSTANCEOF284);
				root_0 = (Object) adaptor
						.becomeRoot(INSTANCEOF284_tree, root_0);

				Identifier285 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_instanceofExpression5785);
				Identifier285_tree = (Object) adaptor.create(Identifier285);
				adaptor.addChild(root_0, Identifier285_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end instanceofExpression

	public static class finallyClause_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start finallyClause
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1477:1:
	// finallyClause : FINALLY block ;
	public final finallyClause_return finallyClause()
			throws RecognitionException {
		finallyClause_return retval = new finallyClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FINALLY286 = null;
		block_return block287 = null;

		Object FINALLY286_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1478:2:
			// ( FINALLY block )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1478:4:
			// FINALLY block
			{
				root_0 = (Object) adaptor.nil();

				FINALLY286 = (Token) input.LT(1);
				match(input, FINALLY, FOLLOW_FINALLY_in_finallyClause5798);
				FINALLY286_tree = (Object) adaptor.create(FINALLY286);
				root_0 = (Object) adaptor.becomeRoot(FINALLY286_tree, root_0);

				pushFollow(FOLLOW_block_in_finallyClause5801);
				block287 = block();
				_fsp--;

				adaptor.addChild(root_0, block287.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end finallyClause

	public static class functionDeclaration_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start functionDeclaration
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1491:1:
	// functionDeclaration : FUNCTION name= Identifier formalParameterList
	// functionBody -> ^( FUNCTION $name formalParameterList functionBody ) ;
	public final functionDeclaration_return functionDeclaration()
			throws RecognitionException {
		functionDeclaration_return retval = new functionDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name = null;
		Token FUNCTION288 = null;
		formalParameterList_return formalParameterList289 = null;

		functionBody_return functionBody290 = null;

		Object name_tree = null;
		Object FUNCTION288_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_Identifier = new RewriteRuleTokenStream(
				adaptor, "token Identifier");
		RewriteRuleSubtreeStream stream_functionBody = new RewriteRuleSubtreeStream(
				adaptor, "rule functionBody");
		RewriteRuleSubtreeStream stream_formalParameterList = new RewriteRuleSubtreeStream(
				adaptor, "rule formalParameterList");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1492:2:
			// ( FUNCTION name= Identifier formalParameterList functionBody ->
			// ^( FUNCTION $name formalParameterList functionBody ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1492:4:
			// FUNCTION name= Identifier formalParameterList functionBody
			{
				FUNCTION288 = (Token) input.LT(1);
				match(input, FUNCTION,
						FOLLOW_FUNCTION_in_functionDeclaration5822);
				stream_FUNCTION.add(FUNCTION288);

				name = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_functionDeclaration5826);
				stream_Identifier.add(name);

				pushFollow(FOLLOW_formalParameterList_in_functionDeclaration5828);
				formalParameterList289 = formalParameterList();
				_fsp--;

				stream_formalParameterList
						.add(formalParameterList289.getTree());
				pushFollow(FOLLOW_functionBody_in_functionDeclaration5830);
				functionBody290 = functionBody();
				_fsp--;

				stream_functionBody.add(functionBody290.getTree());

				// AST REWRITE
				// elements: name, functionBody, formalParameterList, FUNCTION
				// token labels: name
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleTokenStream stream_name = new RewriteRuleTokenStream(
						adaptor, "token name", name);
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1493:2: -> ^( FUNCTION $name formalParameterList functionBody
				// )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1493:5:
					// ^( FUNCTION $name formalParameterList functionBody )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_FUNCTION
								.next(), root_1);

						adaptor.addChild(root_1, stream_name.next());
						adaptor.addChild(root_1, stream_formalParameterList
								.next());
						adaptor.addChild(root_1, stream_functionBody.next());

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end functionDeclaration

	public static class functionExpression_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start functionExpression
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1496:1:
	// functionExpression : FUNCTION (name= Identifier )? formalParameterList
	// functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody )
	// ;
	public final functionExpression_return functionExpression()
			throws RecognitionException {
		functionExpression_return retval = new functionExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name = null;
		Token FUNCTION291 = null;
		formalParameterList_return formalParameterList292 = null;

		functionBody_return functionBody293 = null;

		Object name_tree = null;
		Object FUNCTION291_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_Identifier = new RewriteRuleTokenStream(
				adaptor, "token Identifier");
		RewriteRuleSubtreeStream stream_functionBody = new RewriteRuleSubtreeStream(
				adaptor, "rule functionBody");
		RewriteRuleSubtreeStream stream_formalParameterList = new RewriteRuleSubtreeStream(
				adaptor, "rule formalParameterList");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1497:2:
			// ( FUNCTION (name= Identifier )? formalParameterList functionBody
			// -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1497:4:
			// FUNCTION (name= Identifier )? formalParameterList functionBody
			{
				FUNCTION291 = (Token) input.LT(1);
				match(input, FUNCTION,
						FOLLOW_FUNCTION_in_functionExpression5857);
				stream_FUNCTION.add(FUNCTION291);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1497:17:
				// (name= Identifier )?
				int alt74 = 2;
				int LA74_0 = input.LA(1);

				if ((LA74_0 == Identifier)) {
					alt74 = 1;
				}
				switch (alt74) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1497:17:
					// name= Identifier
				{
					name = (Token) input.LT(1);
					match(input, Identifier,
							FOLLOW_Identifier_in_functionExpression5861);
					stream_Identifier.add(name);

				}
					break;

				}

				pushFollow(FOLLOW_formalParameterList_in_functionExpression5864);
				formalParameterList292 = formalParameterList();
				_fsp--;

				stream_formalParameterList
						.add(formalParameterList292.getTree());
				pushFollow(FOLLOW_functionBody_in_functionExpression5866);
				functionBody293 = functionBody();
				_fsp--;

				stream_functionBody.add(functionBody293.getTree());

				// AST REWRITE
				// elements: FUNCTION, functionBody, name, formalParameterList
				// token labels: name
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleTokenStream stream_name = new RewriteRuleTokenStream(
						adaptor, "token name", name);
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1498:2: -> ^( FUNCTION ( $name)? formalParameterList
				// functionBody )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1498:5:
					// ^( FUNCTION ( $name)? formalParameterList functionBody )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_FUNCTION
								.next(), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1498:17:
						// ( $name)?
						if (stream_name.hasNext()) {
							adaptor.addChild(root_1, stream_name.next());

						}
						stream_name.reset();
						adaptor.addChild(root_1, stream_formalParameterList
								.next());
						adaptor.addChild(root_1, stream_functionBody.next());

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end functionExpression

	public static class formalParameterList_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start formalParameterList
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1501:1:
	// formalParameterList : LPAREN (args+= Identifier ( COMMA args+= Identifier
	// )* )? RPAREN -> ^( ARGS ( $args)* ) ;
	public final formalParameterList_return formalParameterList()
			throws RecognitionException {
		formalParameterList_return retval = new formalParameterList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN294 = null;
		Token COMMA295 = null;
		Token RPAREN296 = null;
		Token args = null;
		List list_args = null;

		Object LPAREN294_tree = null;
		Object COMMA295_tree = null;
		Object RPAREN296_tree = null;
		Object args_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_Identifier = new RewriteRuleTokenStream(
				adaptor, "token Identifier");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1502:2:
			// ( LPAREN (args+= Identifier ( COMMA args+= Identifier )* )?
			// RPAREN -> ^( ARGS ( $args)* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1502:4:
			// LPAREN (args+= Identifier ( COMMA args+= Identifier )* )? RPAREN
			{
				LPAREN294 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_formalParameterList5894);
				stream_LPAREN.add(LPAREN294);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1502:11:
				// (args+= Identifier ( COMMA args+= Identifier )* )?
				int alt76 = 2;
				int LA76_0 = input.LA(1);

				if ((LA76_0 == Identifier)) {
					alt76 = 1;
				}
				switch (alt76) {
				case 1:
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1502:13:
					// args+= Identifier ( COMMA args+= Identifier )*
				{
					args = (Token) input.LT(1);
					match(input, Identifier,
							FOLLOW_Identifier_in_formalParameterList5900);
					stream_Identifier.add(args);

					if (list_args == null)
						list_args = new ArrayList();
					list_args.add(args);

					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1502:30:
					// ( COMMA args+= Identifier )*
					loop75: do {
						int alt75 = 2;
						int LA75_0 = input.LA(1);

						if ((LA75_0 == COMMA)) {
							alt75 = 1;
						}

						switch (alt75) {
						case 1:
							// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1502:32:
							// COMMA args+= Identifier
						{
							COMMA295 = (Token) input.LT(1);
							match(input, COMMA,
									FOLLOW_COMMA_in_formalParameterList5904);
							stream_COMMA.add(COMMA295);

							args = (Token) input.LT(1);
							match(input, Identifier,
									FOLLOW_Identifier_in_formalParameterList5908);
							stream_Identifier.add(args);

							if (list_args == null)
								list_args = new ArrayList();
							list_args.add(args);

						}
							break;

						default:
							break loop75;
						}
					} while (true);

				}
					break;

				}

				RPAREN296 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_formalParameterList5916);
				stream_RPAREN.add(RPAREN296);

				// AST REWRITE
				// elements: args
				// token labels:
				// rule labels: retval
				// token list labels: args
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleTokenStream stream_args = new RewriteRuleTokenStream(
						adaptor, "token args", list_args);
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1503:2: -> ^( ARGS ( $args)* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1503:5:
					// ^( ARGS ( $args)* )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								ARGS, "ARGS"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1503:13:
						// ( $args)*
						while (stream_args.hasNext()) {
							adaptor.addChild(root_1, stream_args.next());

						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end formalParameterList

	public static class functionBody_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start functionBody
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1506:1:
	// functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb,
	// \"BLOCK\"] ( sourceElement )* ) ;
	public final functionBody_return functionBody() throws RecognitionException {
		functionBody_return retval = new functionBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lb = null;
		Token RBRACE298 = null;
		sourceElement_return sourceElement297 = null;

		Object lb_tree = null;
		Object RBRACE298_tree = null;
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_sourceElement = new RewriteRuleSubtreeStream(
				adaptor, "rule sourceElement");
		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1507:2:
			// (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"]
			// ( sourceElement )* ) )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1507:4:
			// lb= LBRACE ( sourceElement )* RBRACE
			{
				lb = (Token) input.LT(1);
				match(input, LBRACE, FOLLOW_LBRACE_in_functionBody5942);
				stream_LBRACE.add(lb);

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1507:14:
				// ( sourceElement )*
				loop77: do {
					int alt77 = 2;
					int LA77_0 = input.LA(1);

					if (((LA77_0 >= NULL && LA77_0 <= BREAK)
							|| LA77_0 == CONTINUE
							|| (LA77_0 >= DELETE && LA77_0 <= DO)
							|| LA77_0 == FOR
							|| (LA77_0 >= FUNCTION && LA77_0 <= IF)
							|| (LA77_0 >= NEW && LA77_0 <= WITH)
							|| LA77_0 == CONST
							|| LA77_0 == LBRACE
							|| LA77_0 == LPAREN
							|| LA77_0 == LBRACK
							|| LA77_0 == SEMIC
							|| (LA77_0 >= ADD && LA77_0 <= SUB)
							|| (LA77_0 >= INC && LA77_0 <= DEC)
							|| (LA77_0 >= NOT && LA77_0 <= INV)
							|| (LA77_0 >= Identifier && LA77_0 <= StringLiteral)
							|| LA77_0 == RegularExpressionLiteral || (LA77_0 >= DecimalLiteral && LA77_0 <= HexIntegerLiteral))) {
						alt77 = 1;
					}

					switch (alt77) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1507:14:
						// sourceElement
					{
						pushFollow(FOLLOW_sourceElement_in_functionBody5944);
						sourceElement297 = sourceElement();
						_fsp--;

						stream_sourceElement.add(sourceElement297.getTree());

					}
						break;

					default:
						break loop77;
					}
				} while (true);

				RBRACE298 = (Token) input.LT(1);
				match(input, RBRACE, FOLLOW_RBRACE_in_functionBody5947);
				stream_RBRACE.add(RBRACE298);

				// AST REWRITE
				// elements: sourceElement
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "token retval", retval != null ? retval.tree
								: null);

				root_0 = (Object) adaptor.nil();
				// 1508:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
				{
					// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1508:5:
					// ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(adaptor.create(
								BLOCK, lb, "BLOCK"), root_1);

						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1508:28:
						// ( sourceElement )*
						while (stream_sourceElement.hasNext()) {
							adaptor.addChild(root_1, stream_sourceElement
									.next());

						}
						stream_sourceElement.reset();

						adaptor.addChild(root_0, root_1);
					}

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end functionBody

	public static class getMethodDeclaration_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start getMethodDeclaration
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1516:1:
	// getMethodDeclaration : GET name= Identifier LPAREN RPAREN functionBody ;
	public final getMethodDeclaration_return getMethodDeclaration()
			throws RecognitionException {
		getMethodDeclaration_return retval = new getMethodDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name = null;
		Token GET299 = null;
		Token LPAREN300 = null;
		Token RPAREN301 = null;
		functionBody_return functionBody302 = null;

		Object name_tree = null;
		Object GET299_tree = null;
		Object LPAREN300_tree = null;
		Object RPAREN301_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1517:3:
			// ( GET name= Identifier LPAREN RPAREN functionBody )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1517:5:
			// GET name= Identifier LPAREN RPAREN functionBody
			{
				root_0 = (Object) adaptor.nil();

				GET299 = (Token) input.LT(1);
				match(input, GET, FOLLOW_GET_in_getMethodDeclaration5977);
				GET299_tree = (Object) adaptor.create(GET299);
				root_0 = (Object) adaptor.becomeRoot(GET299_tree, root_0);

				name = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_getMethodDeclaration5982);
				name_tree = (Object) adaptor.create(name);
				adaptor.addChild(root_0, name_tree);

				LPAREN300 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_getMethodDeclaration5984);
				RPAREN301 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_getMethodDeclaration5987);
				pushFollow(FOLLOW_functionBody_in_getMethodDeclaration5990);
				functionBody302 = functionBody();
				_fsp--;

				adaptor.addChild(root_0, functionBody302.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end getMethodDeclaration

	public static class setMethodDeclaration_return extends
			ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start setMethodDeclaration
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1520:1:
	// setMethodDeclaration : SET name= Identifier LPAREN Identifier RPAREN
	// functionBody ;
	public final setMethodDeclaration_return setMethodDeclaration()
			throws RecognitionException {
		setMethodDeclaration_return retval = new setMethodDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name = null;
		Token SET303 = null;
		Token LPAREN304 = null;
		Token Identifier305 = null;
		Token RPAREN306 = null;
		functionBody_return functionBody307 = null;

		Object name_tree = null;
		Object SET303_tree = null;
		Object LPAREN304_tree = null;
		Object Identifier305_tree = null;
		Object RPAREN306_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1521:3:
			// ( SET name= Identifier LPAREN Identifier RPAREN functionBody )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1521:5:
			// SET name= Identifier LPAREN Identifier RPAREN functionBody
			{
				root_0 = (Object) adaptor.nil();

				SET303 = (Token) input.LT(1);
				match(input, SET, FOLLOW_SET_in_setMethodDeclaration6005);
				SET303_tree = (Object) adaptor.create(SET303);
				root_0 = (Object) adaptor.becomeRoot(SET303_tree, root_0);

				name = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_setMethodDeclaration6010);
				name_tree = (Object) adaptor.create(name);
				adaptor.addChild(root_0, name_tree);

				LPAREN304 = (Token) input.LT(1);
				match(input, LPAREN, FOLLOW_LPAREN_in_setMethodDeclaration6012);
				Identifier305 = (Token) input.LT(1);
				match(input, Identifier,
						FOLLOW_Identifier_in_setMethodDeclaration6015);
				Identifier305_tree = (Object) adaptor.create(Identifier305);
				adaptor.addChild(root_0, Identifier305_tree);

				RPAREN306 = (Token) input.LT(1);
				match(input, RPAREN, FOLLOW_RPAREN_in_setMethodDeclaration6017);
				pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6020);
				functionBody307 = functionBody();
				_fsp--;

				adaptor.addChild(root_0, functionBody307.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end setMethodDeclaration

	public static class program_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start program
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1528:1:
	// program : ( sourceElement )* EOF ;
	public final program_return program() throws RecognitionException {
		program_return retval = new program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF309 = null;
		sourceElement_return sourceElement308 = null;

		Object EOF309_tree = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1529:2:
			// ( ( sourceElement )* EOF )
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1529:4:
			// ( sourceElement )* EOF
			{
				root_0 = (Object) adaptor.nil();

				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1529:4:
				// ( sourceElement )*
				loop78: do {
					int alt78 = 2;
					int LA78_0 = input.LA(1);

					if (((LA78_0 >= NULL && LA78_0 <= BREAK)
							|| LA78_0 == CONTINUE
							|| (LA78_0 >= DELETE && LA78_0 <= DO)
							|| LA78_0 == FOR
							|| (LA78_0 >= FUNCTION && LA78_0 <= IF)
							|| (LA78_0 >= NEW && LA78_0 <= WITH)
							|| LA78_0 == CONST
							|| LA78_0 == LBRACE
							|| LA78_0 == LPAREN
							|| LA78_0 == LBRACK
							|| LA78_0 == SEMIC
							|| (LA78_0 >= ADD && LA78_0 <= SUB)
							|| (LA78_0 >= INC && LA78_0 <= DEC)
							|| (LA78_0 >= NOT && LA78_0 <= INV)
							|| (LA78_0 >= Identifier && LA78_0 <= StringLiteral)
							|| LA78_0 == RegularExpressionLiteral || (LA78_0 >= DecimalLiteral && LA78_0 <= HexIntegerLiteral))) {
						alt78 = 1;
					}

					switch (alt78) {
					case 1:
						// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1529:4:
						// sourceElement
					{
						pushFollow(FOLLOW_sourceElement_in_program6037);
						sourceElement308 = sourceElement();
						_fsp--;

						adaptor.addChild(root_0, sourceElement308.getTree());

					}
						break;

					default:
						break loop78;
					}
				} while (true);

				EOF309 = (Token) input.LT(1);
				match(input, EOF, FOLLOW_EOF_in_program6040);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end program

	public static class sourceElement_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start sourceElement
	// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1537:1:
	// sourceElement options {k=1; } : ({...}? functionDeclaration | statement
	// );
	public final sourceElement_return sourceElement()
			throws RecognitionException {
		sourceElement_return retval = new sourceElement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		functionDeclaration_return functionDeclaration310 = null;

		statement_return statement311 = null;

		try {
			// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1542:2:
			// ({...}? functionDeclaration | statement )
			int alt79 = 2;
			int LA79_0 = input.LA(1);

			if ((LA79_0 == FUNCTION)) {
				int LA79_1 = input.LA(2);

				if ((input.LA(1) == FUNCTION)) {
					alt79 = 1;
				} else if ((true)) {
					alt79 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1537:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );",
							79, 1, input);

					throw nvae;
				}
			} else if (((LA79_0 >= NULL && LA79_0 <= BREAK)
					|| LA79_0 == CONTINUE || (LA79_0 >= DELETE && LA79_0 <= DO)
					|| LA79_0 == FOR || LA79_0 == IF
					|| (LA79_0 >= NEW && LA79_0 <= WITH) || LA79_0 == CONST
					|| LA79_0 == LBRACE || LA79_0 == LPAREN || LA79_0 == LBRACK
					|| LA79_0 == SEMIC || (LA79_0 >= ADD && LA79_0 <= SUB)
					|| (LA79_0 >= INC && LA79_0 <= DEC)
					|| (LA79_0 >= NOT && LA79_0 <= INV)
					|| (LA79_0 >= Identifier && LA79_0 <= StringLiteral)
					|| LA79_0 == RegularExpressionLiteral || (LA79_0 >= DecimalLiteral && LA79_0 <= HexIntegerLiteral))) {
				alt79 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"1537:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );",
						79, 0, input);

				throw nvae;
			}
			switch (alt79) {
			case 1:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1542:4:
				// {...}? functionDeclaration
			{
				root_0 = (Object) adaptor.nil();

				if (!(input.LA(1) == FUNCTION)) {
					throw new FailedPredicateException(input, "sourceElement",
							" input.LA(1) == FUNCTION ");
				}
				pushFollow(FOLLOW_functionDeclaration_in_sourceElement6069);
				functionDeclaration310 = functionDeclaration();
				_fsp--;

				adaptor.addChild(root_0, functionDeclaration310.getTree());

			}
				break;
			case 2:
				// /home/bell/workspace.js/org.eclipse.dltk.javascript.formatter/src/org/eclipse/dltk/javascript/parser/JS.g:1543:4:
				// statement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_statement_in_sourceElement6074);
				statement311 = statement();
				_fsp--;

				adaptor.addChild(root_0, statement311.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return retval;
	}

	// $ANTLR end sourceElement

	public static final BitSet FOLLOW_reservedWord_in_token1777 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_token1782 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_punctuator_in_token1787 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_numericLiteral_in_token1792 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_token1797 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_keyword_in_reservedWord1810 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1815 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NULL_in_reservedWord1820 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_booleanLiteral_in_reservedWord1825 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NULL_in_literal2521 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_booleanLiteral_in_literal2526 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_numericLiteral_in_literal2531 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_literal2536 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2541 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_THIS_in_primaryExpression3154 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_primaryExpression3159 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_literal_in_primaryExpression3164 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3169 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3174 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression3181 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_primaryExpression3183 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression3185 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3209 = new BitSet(
			new long[] { 0x0000000052441070L, 0x00000001819804D4L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3213 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000480L });
	public static final BitSet FOLLOW_COMMA_in_arrayLiteral3217 = new BitSet(
			new long[] { 0x0000000052441070L, 0x00000001819804D4L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3219 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000480L });
	public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3227 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3255 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_objectLiteral3287 = new BitSet(
			new long[] { 0x0000000600000000L, 0x0000000000000008L,
					0x0000001C01800000L });
	public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3291 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000408L });
	public static final BitSet FOLLOW_COMMA_in_objectLiteral3295 = new BitSet(
			new long[] { 0x0000000600000000L, 0x0000000000000000L,
					0x0000001C01800000L });
	public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3297 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000408L });
	public static final BitSet FOLLOW_RBRACE_in_objectLiteral3305 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3330 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3337 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3343 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyName_in_nameValuePair3356 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001000000000L });
	public static final BitSet FOLLOW_COLON_in_nameValuePair3358 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3360 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_propertyName3384 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_propertyName3389 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_numericLiteral_in_propertyName3394 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_primaryExpression_in_memberExpression3412 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_functionExpression_in_memberExpression3417 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_newExpression_in_memberExpression3422 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NEW_in_newExpression3433 = new BitSet(
			new long[] { 0x0000000002000070L, 0x0000000000000054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_primaryExpression_in_newExpression3436 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_arguments3449 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980074L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_arguments3453 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000420L });
	public static final BitSet FOLLOW_COMMA_in_arguments3457 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_arguments3459 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000420L });
	public static final BitSet FOLLOW_RPAREN_in_arguments3467 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3496 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000150L });
	public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3512 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000150L });
	public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3533 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_leftHandSideExpression3535 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000080L });
	public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3537 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000150L });
	public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3556 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression3558 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000150L });
	public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3592 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000001800000L });
	public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3598 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INC_in_postfixOperator3616 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEC_in_postfixOperator3625 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3642 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryOperator_in_unaryExpression3647 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3650 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DELETE_in_unaryOperator3662 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_VOID_in_unaryOperator3667 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TYPEOF_in_unaryOperator3672 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INC_in_unaryOperator3677 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEC_in_unaryOperator3682 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ADD_in_unaryOperator3689 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SUB_in_unaryOperator3698 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INV_in_unaryOperator3705 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NOT_in_unaryOperator3710 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3725 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0001000000600000L });
	public static final BitSet FOLLOW_set_in_multiplicativeExpression3729 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3744 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0001000000600000L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3762 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000180000L });
	public static final BitSet FOLLOW_set_in_additiveExpression3766 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3777 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000180000L });
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3796 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000E000000L });
	public static final BitSet FOLLOW_set_in_shiftExpression3800 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3815 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000E000000L });
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3834 = new BitSet(
			new long[] { 0x0000000000300002L, 0x0000000000007800L });
	public static final BitSet FOLLOW_set_in_relationalExpression3838 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3865 = new BitSet(
			new long[] { 0x0000000000300002L, 0x0000000000007800L });
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3879 = new BitSet(
			new long[] { 0x0000000000200002L, 0x0000000000007800L });
	public static final BitSet FOLLOW_set_in_relationalExpressionNoIn3883 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3906 = new BitSet(
			new long[] { 0x0000000000200002L, 0x0000000000007800L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3925 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000078000L });
	public static final BitSet FOLLOW_set_in_equalityExpression3929 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3948 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000078000L });
	public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3962 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000078000L });
	public static final BitSet FOLLOW_set_in_equalityExpressionNoIn3966 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3985 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000078000L });
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4005 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000010000000L });
	public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4009 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4012 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000010000000L });
	public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4026 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000010000000L });
	public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4030 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4033 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000010000000L });
	public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4049 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000040000000L });
	public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4053 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4056 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000040000000L });
	public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4072 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000040000000L });
	public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4076 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4079 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000040000000L });
	public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4094 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000020000000L });
	public static final BitSet FOLLOW_OR_in_bitwiseORExpression4098 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4101 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000020000000L });
	public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4116 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000020000000L });
	public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4120 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4123 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000020000000L });
	public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4142 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000200000000L });
	public static final BitSet FOLLOW_LAND_in_logicalANDExpression4146 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4149 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000200000000L });
	public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4163 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000200000000L });
	public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4167 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4170 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000200000000L });
	public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4185 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000400000000L });
	public static final BitSet FOLLOW_LOR_in_logicalORExpression4189 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4192 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000400000000L });
	public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4207 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000400000000L });
	public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4211 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4214 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000400000000L });
	public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4233 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000800000000L });
	public static final BitSet FOLLOW_QUE_in_conditionalExpression4237 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4240 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001000000000L });
	public static final BitSet FOLLOW_COLON_in_conditionalExpression4242 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4245 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4259 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000800000000L });
	public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4263 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4266 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001000000000L });
	public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4268 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4271 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4299 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0002FFE000000000L });
	public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4306 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4309 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4386 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0002FFE000000000L });
	public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4393 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4396 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assignmentExpression_in_expression4418 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000400L });
	public static final BitSet FOLLOW_COMMA_in_expression4422 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_expression4426 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000400L });
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4463 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000400L });
	public static final BitSet FOLLOW_COMMA_in_expressionNoIn4467 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4471 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMIC_in_semic4522 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EOF_in_semic4527 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RBRACE_in_semic4532 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EOL_in_semic4539 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MultiLineComment_in_semic4543 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_block_in_statement4572 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_statementTail_in_statement4577 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_variableStatement_in_statementTail4589 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_emptyStatement_in_statementTail4594 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expressionStatement_in_statementTail4599 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ifStatement_in_statementTail4604 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_iterationStatement_in_statementTail4609 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_continueStatement_in_statementTail4614 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_breakStatement_in_statementTail4619 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_returnStatement_in_statementTail4624 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_withStatement_in_statementTail4629 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_labelledStatement_in_statementTail4634 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_switchStatement_in_statementTail4639 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_throwStatement_in_statementTail4644 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_tryStatement_in_statementTail4649 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_constStatement_in_statementTail4654 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_block4669 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x000000018198025CL,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_block4671 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x000000018198025CL,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_RBRACE_in_block4674 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_VAR_in_variableStatement4703 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4705 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000608L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_COMMA_in_variableStatement4709 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4711 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000608L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_variableStatement4716 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_variableDeclaration4739 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000002000000000L });
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration4743 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration4746 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn4761 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000002000000000L });
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn4765 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4768 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONST_in_constStatement4783 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_variableDeclaration_in_constStatement4785 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000608L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_COMMA_in_constStatement4789 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_variableDeclaration_in_constStatement4791 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000608L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_constStatement4796 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMIC_in_emptyStatement4826 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_expressionStatement4845 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_expressionStatement4847 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IF_in_ifStatement4865 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_ifStatement4867 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_ifStatement4869 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_ifStatement4871 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_ifStatement4873 = new BitSet(
			new long[] { 0x0000000000004002L });
	public static final BitSet FOLLOW_ELSE_in_ifStatement4879 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_ifStatement4881 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_doStatement_in_iterationStatement4914 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_whileStatement_in_iterationStatement4919 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forEachStatement_in_iterationStatement4924 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forStatement_in_iterationStatement4929 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DO_in_doStatement4941 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_doStatement4943 = new BitSet(
			new long[] { 0x0000000080000000L });
	public static final BitSet FOLLOW_WHILE_in_doStatement4945 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_doStatement4947 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_doStatement4949 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_doStatement4951 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_doStatement4953 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WHILE_in_whileStatement4978 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_whileStatement4981 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_whileStatement4984 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_whileStatement4986 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_whileStatement4989 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FOR_in_forEachStatement5004 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_EACH_in_forEachStatement5007 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_forEachStatement5010 = new BitSet(
			new long[] { 0x0000000072441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_forEachControl_in_forEachStatement5013 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_forEachStatement5015 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_forEachStatement5018 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forControlVar_in_forEachControl5031 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forControlExpression_in_forEachControl5037 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FOR_in_forStatement5049 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_forStatement5052 = new BitSet(
			new long[] { 0x0000000072441070L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_forControl_in_forStatement5055 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_forStatement5057 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_forStatement5060 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forControlVar_in_forControl5071 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forControlExpression_in_forControl5076 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_forControlSemic_in_forControl5081 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_VAR_in_forControlVar5092 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5094 = new BitSet(
			new long[] { 0x0000000000100000L, 0x0000000000000600L });
	public static final BitSet FOLLOW_IN_in_forControlVar5106 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlVar5108 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COMMA_in_forControlVar5154 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5156 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000600L });
	public static final BitSet FOLLOW_SEMIC_in_forControlVar5161 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlVar5165 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000200L });
	public static final BitSet FOLLOW_SEMIC_in_forControlVar5168 = new BitSet(
			new long[] { 0x0000000052441072L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlVar5172 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5238 = new BitSet(
			new long[] { 0x0000000000100000L, 0x0000000000000200L });
	public static final BitSet FOLLOW_IN_in_forControlExpression5253 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlExpression5257 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMIC_in_forControlExpression5303 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlExpression5307 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000200L });
	public static final BitSet FOLLOW_SEMIC_in_forControlExpression5310 = new BitSet(
			new long[] { 0x0000000052441072L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlExpression5314 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMIC_in_forControlSemic5373 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlSemic5377 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000200L });
	public static final BitSet FOLLOW_SEMIC_in_forControlSemic5380 = new BitSet(
			new long[] { 0x0000000052441072L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_forControlSemic5384 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONTINUE_in_continueStatement5438 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000B00000L });
	public static final BitSet FOLLOW_Identifier_in_continueStatement5443 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_continueStatement5446 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BREAK_in_breakStatement5465 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000B00000L });
	public static final BitSet FOLLOW_Identifier_in_breakStatement5470 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_breakStatement5473 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RETURN_in_returnStatement5492 = new BitSet(
			new long[] { 0x0000000052441070L, 0x000000018198025CL,
					0x0000001C41B00000L });
	public static final BitSet FOLLOW_expression_in_returnStatement5497 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_returnStatement5500 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WITH_in_withStatement5517 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_withStatement5520 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_withStatement5523 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_withStatement5525 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_withStatement5528 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SWITCH_in_switchStatement5549 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_switchStatement5551 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_switchStatement5553 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_switchStatement5555 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_LBRACE_in_switchStatement5557 = new BitSet(
			new long[] { 0x0000000000000900L, 0x0000000000000008L });
	public static final BitSet FOLLOW_defaultClause_in_switchStatement5564 = new BitSet(
			new long[] { 0x0000000000000900L, 0x0000000000000008L });
	public static final BitSet FOLLOW_caseClause_in_switchStatement5570 = new BitSet(
			new long[] { 0x0000000000000900L, 0x0000000000000008L });
	public static final BitSet FOLLOW_RBRACE_in_switchStatement5575 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CASE_in_caseClause5603 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_caseClause5606 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001000000000L });
	public static final BitSet FOLLOW_COLON_in_caseClause5608 = new BitSet(
			new long[] { 0x00000101FFCD34F2L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_caseClause5611 = new BitSet(
			new long[] { 0x00000101FFCD34F2L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_DEFAULT_in_defaultClause5624 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001000000000L });
	public static final BitSet FOLLOW_COLON_in_defaultClause5627 = new BitSet(
			new long[] { 0x00000101FFCD34F2L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_defaultClause5630 = new BitSet(
			new long[] { 0x00000101FFCD34F2L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_Identifier_in_labelledStatement5647 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001000000000L });
	public static final BitSet FOLLOW_COLON_in_labelledStatement5649 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_statement_in_labelledStatement5651 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_THROW_in_throwStatement5682 = new BitSet(
			new long[] { 0x0000000052441070L, 0x0000000181980054L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_expression_in_throwStatement5687 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000208L,
					0x0000000000300000L });
	public static final BitSet FOLLOW_semic_in_throwStatement5689 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRY_in_tryStatement5706 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_block_in_tryStatement5709 = new BitSet(
			new long[] { 0x0000000000008200L });
	public static final BitSet FOLLOW_catchClause_in_tryStatement5713 = new BitSet(
			new long[] { 0x0000000000008202L });
	public static final BitSet FOLLOW_finallyClause_in_tryStatement5716 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_finallyClause_in_tryStatement5721 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CATCH_in_catchClause5735 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_catchClause5738 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_catchClause5741 = new BitSet(
			new long[] { 0x0000000000080000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_catchFilter_in_catchClause5743 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_catchClause5746 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_block_in_catchClause5749 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IF_in_catchFilter5762 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_instanceofExpression_in_catchFilter5765 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_instanceofExpression5780 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression5782 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_instanceofExpression5785 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FINALLY_in_finallyClause5798 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_block_in_finallyClause5801 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration5822 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration5826 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration5828 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_functionBody_in_functionDeclaration5830 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_functionExpression5857 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_functionExpression5861 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_formalParameterList_in_functionExpression5864 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_functionBody_in_functionExpression5866 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_formalParameterList5894 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_formalParameterList5900 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000420L });
	public static final BitSet FOLLOW_COMMA_in_formalParameterList5904 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_formalParameterList5908 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000420L });
	public static final BitSet FOLLOW_RPAREN_in_formalParameterList5916 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_functionBody5942 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x000000018198025CL,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_sourceElement_in_functionBody5944 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x000000018198025CL,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_RBRACE_in_functionBody5947 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GET_in_getMethodDeclaration5977 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_getMethodDeclaration5982 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration5984 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration5987 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration5990 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SET_in_setMethodDeclaration6005 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_setMethodDeclaration6010 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6012 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000000L,
					0x0000000000800000L });
	public static final BitSet FOLLOW_Identifier_in_setMethodDeclaration6015 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6017 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6020 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_sourceElement_in_program6037 = new BitSet(
			new long[] { 0x00000101FFCD34F0L, 0x0000000181980254L,
					0x0000001C41800000L });
	public static final BitSet FOLLOW_EOF_in_program6040 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6069 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_statement_in_sourceElement6074 = new BitSet(
			new long[] { 0x0000000000000002L });

}
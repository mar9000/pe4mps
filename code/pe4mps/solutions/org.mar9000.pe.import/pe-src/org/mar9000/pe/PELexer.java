// Generated from PELexer.g4 by ANTLR 4.5
package org.mar9000.pe;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR_END=1, LINE_COMMENT=2, BLOCK_COMMENT=3, BLANKS=4, LANGUAGE=5, 
		USES=6, EXTENSION=7, FOR=8, ENUM=9, KEYWORDS=10, FRAGMENT=11, PRIMITIVE=12, 
		DATATYPE=13, COLON=14, SEMICOLON=15, COMMA=16, EQUAL=17, DOT=18, PIPE=19, 
		QUESTION=20, STAR=21, PLUS=22, MINUS=23, REGEXPNOT=24, SLASH=25, BACK_SLASH=26, 
		LPAREN=27, RPAREN=28, LSBRACKET=29, RSBRACKET=30, POUND=31, LT=32, GT=33, 
		UNDERSCORE=34, Identifier=35, ExtensionName=36, StringLiteral=37, EscapeSequence=38, 
		NumericLiteral=39, OTHER=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GRAMMAR_END", "LINE_COMMENT", "BLOCK_COMMENT", "BLANKS", "LANGUAGE", 
		"USES", "EXTENSION", "FOR", "ENUM", "KEYWORDS", "FRAGMENT", "PRIMITIVE", 
		"DATATYPE", "COLON", "SEMICOLON", "COMMA", "EQUAL", "DOT", "PIPE", "QUESTION", 
		"STAR", "PLUS", "MINUS", "REGEXPNOT", "SLASH", "BACK_SLASH", "LPAREN", 
		"RPAREN", "LSBRACKET", "RSBRACKET", "POUND", "LT", "GT", "UNDERSCORE", 
		"Identifier", "ExtensionName", "Letter", "Digit", "LetterOrDigit", "StringLiteral", 
		"EscapeSequence", "NumericLiteral", "OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'language'", "'uses'", "'extension'", "'for'", 
		"'enum'", "'keywords'", "'fragment'", "'primitive'", "'datatype'", "':'", 
		"';'", "','", "'='", "'.'", "'|'", "'?'", "'*'", "'+'", "'-'", "'^'", 
		"'/'", "'\\'", "'('", "')'", "'['", "']'", "'#'", "'<'", "'>'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAMMAR_END", "LINE_COMMENT", "BLOCK_COMMENT", "BLANKS", "LANGUAGE", 
		"USES", "EXTENSION", "FOR", "ENUM", "KEYWORDS", "FRAGMENT", "PRIMITIVE", 
		"DATATYPE", "COLON", "SEMICOLON", "COMMA", "EQUAL", "DOT", "PIPE", "QUESTION", 
		"STAR", "PLUS", "MINUS", "REGEXPNOT", "SLASH", "BACK_SLASH", "LPAREN", 
		"RPAREN", "LSBRACKET", "RSBRACKET", "POUND", "LT", "GT", "UNDERSCORE", 
		"Identifier", "ExtensionName", "StringLiteral", "EscapeSequence", "NumericLiteral", 
		"OTHER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PELexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4v\n\4\f\4\16"+
		"\4y\13\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\u0081\n\5\r\5\16\5\u0082\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\7$\u00f9\n$\f$\16$\u00fc\13$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3)\7)\u010c\n)\f)\16)\u010f\13)\3)\3)\3*\3*\3*\3+\6+\u0117"+
		"\n+\r+\16+\u0118\3,\3,\4`w\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\'S(U)W*\3\2\b\4"+
		"\2\f\f\17\17\5\2\13\f\17\17\"\"\6\2&&C\\aac|\3\2\62;\7\2&&\62;C\\aac|"+
		"\4\2))^^\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\3Y\3\2\2\2\5g\3\2\2\2\7q\3\2\2\2\t\u0080\3\2\2\2\13\u0086\3\2\2\2\r"+
		"\u008f\3\2\2\2\17\u0094\3\2\2\2\21\u009e\3\2\2\2\23\u00a2\3\2\2\2\25\u00a7"+
		"\3\2\2\2\27\u00b0\3\2\2\2\31\u00b9\3\2\2\2\33\u00c3\3\2\2\2\35\u00cc\3"+
		"\2\2\2\37\u00ce\3\2\2\2!\u00d0\3\2\2\2#\u00d2\3\2\2\2%\u00d4\3\2\2\2\'"+
		"\u00d6\3\2\2\2)\u00d8\3\2\2\2+\u00da\3\2\2\2-\u00dc\3\2\2\2/\u00de\3\2"+
		"\2\2\61\u00e0\3\2\2\2\63\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2"+
		"\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00ee\3\2\2\2A\u00f0"+
		"\3\2\2\2C\u00f2\3\2\2\2E\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00fd\3\2\2\2K"+
		"\u0102\3\2\2\2M\u0104\3\2\2\2O\u0106\3\2\2\2Q\u0108\3\2\2\2S\u0112\3\2"+
		"\2\2U\u0116\3\2\2\2W\u011a\3\2\2\2YZ\7\61\2\2Z[\7\61\2\2[\\\7\61\2\2\\"+
		"`\3\2\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2cd\7\2\2\3de\3\2\2\2ef\b\2\2\2f\4\3\2\2\2gh\5\63\32\2hl\5\63"+
		"\32\2ik\n\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3"+
		"\2\2\2op\b\3\3\2p\6\3\2\2\2qr\7\61\2\2rs\7,\2\2sw\3\2\2\2tv\13\2\2\2u"+
		"t\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7,\2\2{"+
		"|\7\61\2\2|}\3\2\2\2}~\b\4\3\2~\b\3\2\2\2\177\u0081\t\3\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\5\2\2\u0085\n\3\2\2\2\u0086\u0087\7n\2\2"+
		"\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089\u008a\7i\2\2\u008a\u008b"+
		"\7w\2\2\u008b\u008c\7c\2\2\u008c\u008d\7i\2\2\u008d\u008e\7g\2\2\u008e"+
		"\f\3\2\2\2\u008f\u0090\7w\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7u\2\2\u0093\16\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7z\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7u\2\2"+
		"\u009a\u009b\7k\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\20\3\2"+
		"\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\22"+
		"\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00a6\7o\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7m\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7{\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad\u00ae\7f\2\2\u00ae\u00af\7u\2\2\u00af\26\3\2\2\2\u00b0\u00b1\7"+
		"h\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5"+
		"\7o\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8"+
		"\30\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7o\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7x\2\2\u00c1\u00c2\7g\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7"+
		"f\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\7v\2\2\u00c8\u00c9\7{\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\34\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd\36\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf"+
		" \3\2\2\2\u00d0\u00d1\7.\2\2\u00d1\"\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3"+
		"$\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7~\2\2\u00d7"+
		"(\3\2\2\2\u00d8\u00d9\7A\2\2\u00d9*\3\2\2\2\u00da\u00db\7,\2\2\u00db,"+
		"\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd.\3\2\2\2\u00de\u00df\7/\2\2\u00df\60"+
		"\3\2\2\2\u00e0\u00e1\7`\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3"+
		"\64\3\2\2\2\u00e4\u00e5\7^\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7"+
		"8\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb<"+
		"\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef@\3"+
		"\2\2\2\u00f0\u00f1\7>\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3D\3\2"+
		"\2\2\u00f4\u00f5\7a\2\2\u00f5F\3\2\2\2\u00f6\u00fa\5K&\2\u00f7\u00f9\5"+
		"O(\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fbH\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe"+
		"\u00ff\7\60\2\2\u00ff\u0100\5G$\2\u0100\u0101\7)\2\2\u0101J\3\2\2\2\u0102"+
		"\u0103\t\4\2\2\u0103L\3\2\2\2\u0104\u0105\t\5\2\2\u0105N\3\2\2\2\u0106"+
		"\u0107\t\6\2\2\u0107P\3\2\2\2\u0108\u010d\7)\2\2\u0109\u010c\5S*\2\u010a"+
		"\u010c\n\7\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7)\2\2\u0111R\3\2\2\2\u0112\u0113\7^\2\2\u0113"+
		"\u0114\t\7\2\2\u0114T\3\2\2\2\u0115\u0117\5M\'\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119V\3\2\2\2"+
		"\u011a\u011b\13\2\2\2\u011bX\3\2\2\2\13\2`lw\u0082\u00fa\u010b\u010d\u0118"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
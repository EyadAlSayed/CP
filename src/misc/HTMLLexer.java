package misc;// Generated from D:/Compiler/project this year/Compiler/Grammar\HTMLLexer.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, TAG_CLOSE=12, 
		TAG_SLASH_CLOSE=13, TAG_SLASH=14, NGFOR=15, ID=16, IN=17, QOUTE=18, TAG_NAME=19, 
		TAG_EQUALS=20, TAG_WHITESPACE=21, SCRIPT_BODY=22, SCRIPT_SHORT_BODY=23, 
		STYLE_BODY=24, STYLE_SHORT_BODY=25, ATTVALUE_VALUE=26, ATTRIBUTE=27;
	public static final int
		TAG=1, SCRIPT=2, STYLE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "SCRIPT", "STYLE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "NGFOR", "ID", "IN", "QOUTE", "TAG_NAME", 
			"TAG_EQUALS", "TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", 
			"TAG_NameStartChar", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", 
			"HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			"'>'", "'/>'", "'/'", "'ngfor'", "'x'", "'in'", "'\"'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "NGFOR", "ID", "IN", "QOUTE", 
			"TAG_NAME", "TAG_EQUALS", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
			"STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u018d\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3e"+
		"\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4t\n\4\f"+
		"\4\16\4w\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\u0086\n\5\f\5\16\5\u0089\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0093"+
		"\n\6\f\6\16\6\u0096\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u009e\n\7\f\7\16"+
		"\7\u00a1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a9\n\7\f\7\16\7\u00ac\13"+
		"\7\3\7\3\7\5\7\u00b0\n\7\3\b\3\b\5\b\u00b4\n\b\3\b\6\b\u00b7\n\b\r\b\16"+
		"\b\u00b8\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7"+
		"\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d5\n\n\f"+
		"\n\16\n\u00d8\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00e3\n"+
		"\f\r\f\16\f\u00e4\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\7\24\u0101\n\24\f\24\16\24\u0104\13\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0114\n\31\3\32\5\32"+
		"\u0117\n\32\3\33\7\33\u011a\n\33\f\33\16\33\u011d\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\7\34\u012c\n\34\f\34"+
		"\16\34\u012f\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\7\35\u0138\n\35"+
		"\f\35\16\35\u013b\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\7\36\u0149\n\36\f\36\16\36\u014c\13\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\7\37\u0155\n\37\f\37\16\37\u0158\13\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \5 \u0161\n \3!\6!\u0164\n!\r!\16!\u0165\3!\5!\u0169\n!\3"+
		"\"\5\"\u016c\n\"\3#\3#\6#\u0170\n#\r#\16#\u0171\3$\6$\u0175\n$\r$\16$"+
		"\u0176\3$\5$\u017a\n$\3%\3%\7%\u017e\n%\f%\16%\u0181\13%\3%\3%\3&\3&\7"+
		"&\u0187\n&\f&\16&\u018a\13&\3&\3&\17Xfu\u0087\u0094\u009f\u00aa\u00c5"+
		"\u00d6\u011b\u012d\u0139\u014a\2\'\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n"+
		"\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\2\62"+
		"\2\64\2\66\28\30:\31<\32>\33@\34B\35D\2F\2H\2J\2L\2N\2\6\2\3\4\5\r\4\2"+
		"\13\13\"\"\3\2>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2"+
		"\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\t\2%%-=??AAC\\aac|\4\2$$>>\4\2))"+
		">>\2\u01a1\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2"+
		"\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2"+
		"\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2"+
		"\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\48\3\2\2\2\4"+
		":\3\2\2\2\5<\3\2\2\2\5>\3\2\2\2\5@\3\2\2\2\5B\3\2\2\2\6P\3\2\2\2\b_\3"+
		"\2\2\2\nl\3\2\2\2\fz\3\2\2\2\16\u008e\3\2\2\2\20\u00af\3\2\2\2\22\u00b6"+
		"\3\2\2\2\24\u00ba\3\2\2\2\26\u00cc\3\2\2\2\30\u00dd\3\2\2\2\32\u00e2\3"+
		"\2\2\2\34\u00e6\3\2\2\2\36\u00ea\3\2\2\2 \u00ef\3\2\2\2\"\u00f1\3\2\2"+
		"\2$\u00f7\3\2\2\2&\u00f9\3\2\2\2(\u00fc\3\2\2\2*\u00fe\3\2\2\2,\u0105"+
		"\3\2\2\2.\u0107\3\2\2\2\60\u010b\3\2\2\2\62\u010d\3\2\2\2\64\u0113\3\2"+
		"\2\2\66\u0116\3\2\2\28\u011b\3\2\2\2:\u012d\3\2\2\2<\u0139\3\2\2\2>\u014a"+
		"\3\2\2\2@\u0156\3\2\2\2B\u0160\3\2\2\2D\u0163\3\2\2\2F\u016b\3\2\2\2H"+
		"\u016d\3\2\2\2J\u0174\3\2\2\2L\u017b\3\2\2\2N\u0184\3\2\2\2PQ\7>\2\2Q"+
		"R\7#\2\2RS\7/\2\2ST\7/\2\2TX\3\2\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY"+
		"\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7/\2\2\\]\7/\2\2]^\7@\2\2^\7"+
		"\3\2\2\2_`\7>\2\2`a\7#\2\2ab\7]\2\2bf\3\2\2\2ce\13\2\2\2dc\3\2\2\2eh\3"+
		"\2\2\2fg\3\2\2\2fd\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7_\2\2jk\7@\2\2k\t\3"+
		"\2\2\2lm\7>\2\2mn\7A\2\2no\7z\2\2op\7o\2\2pq\7n\2\2qu\3\2\2\2rt\13\2\2"+
		"\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7@\2"+
		"\2y\13\3\2\2\2z{\7>\2\2{|\7#\2\2|}\7]\2\2}~\7E\2\2~\177\7F\2\2\177\u0080"+
		"\7C\2\2\u0080\u0081\7V\2\2\u0081\u0082\7C\2\2\u0082\u0083\7]\2\2\u0083"+
		"\u0087\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7_\2\2\u008b\u008c\7_\2\2\u008c\u008d\7@\2"+
		"\2\u008d\r\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7#\2\2\u0090\u0094\3"+
		"\2\2\2\u0091\u0093\13\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7@\2\2\u0098\17\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b"+
		"\7A\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7A\2\2\u00a3\u00b0\7@\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae"+
		"\u00b0\7@\2\2\u00af\u0099\3\2\2\2\u00af\u00a4\3\2\2\2\u00b0\21\3\2\2\2"+
		"\u00b1\u00b7\t\2\2\2\u00b2\u00b4\7\17\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\f\2\2\u00b6\u00b1\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\23\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd"+
		"\7e\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\b\t\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7{\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\b\n\3\2\u00dc\27\3\2\2\2\u00dd\u00de\7>\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\b\13\4\2\u00e0\31\3\2\2\2\u00e1\u00e3\n\3\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\b\r\5\2\u00e9\35\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7@\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\b\16\5\2\u00ee\37\3\2\2\2\u00ef\u00f0\7\61"+
		"\2\2\u00f0!\3\2\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4"+
		"\7h\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7t\2\2\u00f6#\3\2\2\2\u00f7\u00f8"+
		"\7z\2\2\u00f8%\3\2\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\'\3"+
		"\2\2\2\u00fc\u00fd\7$\2\2\u00fd)\3\2\2\2\u00fe\u0102\5\66\32\2\u00ff\u0101"+
		"\5\64\31\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103+\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7"+
		"?\2\2\u0106-\3\2\2\2\u0107\u0108\t\4\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\b\26\6\2\u010a/\3\2\2\2\u010b\u010c\t\5\2\2\u010c\61\3\2\2\2\u010d\u010e"+
		"\t\6\2\2\u010e\63\3\2\2\2\u010f\u0114\5\66\32\2\u0110\u0114\t\7\2\2\u0111"+
		"\u0114\5\62\30\2\u0112\u0114\t\b\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\65\3\2\2\2\u0115"+
		"\u0117\t\t\2\2\u0116\u0115\3\2\2\2\u0117\67\3\2\2\2\u0118\u011a\13\2\2"+
		"\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7>\2\2\u011f"+
		"\u0120\7\61\2\2\u0120\u0121\7u\2\2\u0121\u0122\7e\2\2\u0122\u0123\7t\2"+
		"\2\u0123\u0124\7k\2\2\u0124\u0125\7r\2\2\u0125\u0126\7v\2\2\u0126\u0127"+
		"\7@\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\33\5\2\u01299\3\2\2\2\u012a"+
		"\u012c\13\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0131\7>\2\2\u0131\u0132\7\61\2\2\u0132\u0133\7@\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\b\34\5\2\u0135;\3\2\2\2\u0136\u0138\13\2\2\2\u0137\u0136"+
		"\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7>\2\2\u013d\u013e\7\61"+
		"\2\2\u013e\u013f\7u\2\2\u013f\u0140\7v\2\2\u0140\u0141\7{\2\2\u0141\u0142"+
		"\7n\2\2\u0142\u0143\7g\2\2\u0143\u0144\7@\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\b\35\5\2\u0146=\3\2\2\2\u0147\u0149\13\2\2\2\u0148\u0147\3\2\2"+
		"\2\u0149\u014c\3\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7>\2\2\u014e\u014f\7\61\2\2\u014f"+
		"\u0150\7@\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\36\5\2\u0152?\3\2\2\2"+
		"\u0153\u0155\7\"\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015a\5B \2\u015aA\3\2\2\2\u015b\u0161\5L%\2\u015c\u0161\5N&\2\u015d"+
		"\u0161\5D!\2\u015e\u0161\5H#\2\u015f\u0161\5J$\2\u0160\u015b\3\2\2\2\u0160"+
		"\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2"+
		"\2\2\u0161C\3\2\2\2\u0162\u0164\5F\"\2\u0163\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0169\7\"\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169E\3\2\2\2"+
		"\u016a\u016c\t\n\2\2\u016b\u016a\3\2\2\2\u016cG\3\2\2\2\u016d\u016f\7"+
		"%\2\2\u016e\u0170\t\5\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172I\3\2\2\2\u0173\u0175\t\6\2\2"+
		"\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u017a\7\'\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017aK\3\2\2\2\u017b\u017f\7$\2\2\u017c\u017e\n\13\2\2"+
		"\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7$\2\2\u0183"+
		"M\3\2\2\2\u0184\u0188\7)\2\2\u0185\u0187\n\f\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7)\2\2\u018cO\3\2\2\2%\2\3\4\5Xf"+
		"u\u0087\u0094\u009f\u00aa\u00af\u00b3\u00b6\u00b8\u00c5\u00d6\u00e4\u0102"+
		"\u0113\u0116\u011b\u012d\u0139\u014a\u0156\u0160\u0165\u0168\u016b\u0171"+
		"\u0176\u0179\u017f\u0188\7\7\4\2\7\5\2\7\3\2\6\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
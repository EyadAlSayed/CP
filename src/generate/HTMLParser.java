// Generated from D:/My compiler project/CP/src\HTMLParser.g4 by ANTLR 4.9.2
package generate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, TAG_OPEN_INPUT=11, 
		HTML_TEXT=12, TAG_OPEN_MUSTACH=13, NGFOR=14, NGSHOW=15, NGHIDE=16, NGIF=17, 
		TYPE=18, NG_MODEL=19, TAG_CLOSE=20, TAG_SLASH_CLOSE=21, TAG_SLASH=22, 
		TAG_EQUALS=23, TAG_NAME_INPUT_END=24, TAG_NAME=25, TAG_WHITESPACE=26, 
		TAG_NG_FOR=27, TAG_NG_SHOW=28, TAG_NG_HIDE=29, TAG_NG_IF=30, TAG_EVENT=31, 
		TAG_SQ_BRACKET=32, TAG_CARLE_BRACKET=33, VAR=34, SCRIPT_CLOSE=35, STYLE_BODY=36, 
		STYLE_SHORT_BODY=37, ATTVALUE_VALUE=38, ATTRIBUTE=39, IN=40, SPACE=41, 
		EQUALS=42, SEM_COLON=43, SINGLE_QUOTE=44, NG_FOR_CLOSE=45, NG_FOR_VALUE=46, 
		DOT=47, LOG_OP=48, NG_SHOW_CLOSE=49, NG_HIDE_CLOSE=50, NG_IF_CLOSE=51, 
		TAG_NAME_INPUT_BEGIN=52, TAG_CLOSE_INPUT=53, TAG_SLASH_CLOSE_INPUT=54, 
		TYPE_EQUALS=55, NG_MODEL_EQUALS=56, TYPE_VALUE=57, TYPE_ATTRIBUTE=58, 
		MODEL_VALUE=59, MODEL_ATTRIBUTE=60, VAR_VARIABLE=61, VAR_EQUALS=62, VAR_VARIABLE_VALUE=63, 
		COMMA=64, CLOSE_SQ_BRACKET_C=65, CLOSE_SQ_BRACKET=66, SQ_BRACKET_VALUE=67, 
		SQ_BRACKET_ATT=68, PIP=69, CLOSE_CARLE_BRAKET=70, CARLE_BRAKET_VALUE=71, 
		MUSTACH_CLOSE=72, MUSTACH_VALUE=73, EVENT_CLOSE=74, EVENT_ATTRIBUTE=75;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_htmlData = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_ng_for = 7, RULE_ng_hide = 8, RULE_ng_if = 9, RULE_ng_show = 10, 
		RULE_event = 11, RULE_mustach_open = 12, RULE_mustach_body = 13, RULE_htmlChardata = 14, 
		RULE_htmlMisc = 15, RULE_htmlComment = 16, RULE_script = 17, RULE_style = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlData", 
			"htmlContent", "htmlAttribute", "ng_for", "ng_hide", "ng_if", "ng_show", 
			"event", "mustach_open", "mustach_body", "htmlChardata", "htmlMisc", 
			"htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			null, null, null, null, null, null, null, null, "'>'", "'/>'", "'/'", 
			"'='", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "' '", null, "';'", null, null, null, 
			"'.'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "TAG_OPEN_INPUT", 
			"HTML_TEXT", "TAG_OPEN_MUSTACH", "NGFOR", "NGSHOW", "NGHIDE", "NGIF", 
			"TYPE", "NG_MODEL", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME_INPUT_END", "TAG_NAME", "TAG_WHITESPACE", "TAG_NG_FOR", "TAG_NG_SHOW", 
			"TAG_NG_HIDE", "TAG_NG_IF", "TAG_EVENT", "TAG_SQ_BRACKET", "TAG_CARLE_BRACKET", 
			"VAR", "SCRIPT_CLOSE", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", 
			"ATTRIBUTE", "IN", "SPACE", "EQUALS", "SEM_COLON", "SINGLE_QUOTE", "NG_FOR_CLOSE", 
			"NG_FOR_VALUE", "DOT", "LOG_OP", "NG_SHOW_CLOSE", "NG_HIDE_CLOSE", "NG_IF_CLOSE", 
			"TAG_NAME_INPUT_BEGIN", "TAG_CLOSE_INPUT", "TAG_SLASH_CLOSE_INPUT", "TYPE_EQUALS", 
			"NG_MODEL_EQUALS", "TYPE_VALUE", "TYPE_ATTRIBUTE", "MODEL_VALUE", "MODEL_ATTRIBUTE", 
			"VAR_VARIABLE", "VAR_EQUALS", "VAR_VARIABLE_VALUE", "COMMA", "CLOSE_SQ_BRACKET_C", 
			"CLOSE_SQ_BRACKET", "SQ_BRACKET_VALUE", "SQ_BRACKET_ATT", "PIP", "CLOSE_CARLE_BRAKET", 
			"CARLE_BRAKET_VALUE", "MUSTACH_CLOSE", "MUSTACH_VALUE", "EVENT_CLOSE", 
			"EVENT_ATTRIBUTE"
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

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(HTMLParser.XML, 0); }
		public TerminalNode DTD() { return getToken(HTMLParser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(44);
				match(XML);
				}
			}

			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(53);
				match(DTD);
				}
			}

			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN) | (1L << TAG_OPEN_INPUT) | (1L << TAG_OPEN_MUSTACH))) != 0)) {
				{
				{
				setState(62);
				htmlElements();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					htmlMisc();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(76);
			htmlElement();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					htmlMisc();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_INPUT() { return getToken(HTMLParser.TAG_OPEN_INPUT, 0); }
		public TerminalNode TAG_SLASH_CLOSE_INPUT() { return getToken(HTMLParser.TAG_SLASH_CLOSE_INPUT, 0); }
		public List<TerminalNode> TYPE_EQUALS() { return getTokens(HTMLParser.TYPE_EQUALS); }
		public TerminalNode TYPE_EQUALS(int i) {
			return getToken(HTMLParser.TYPE_EQUALS, i);
		}
		public List<TerminalNode> TYPE_VALUE() { return getTokens(HTMLParser.TYPE_VALUE); }
		public TerminalNode TYPE_VALUE(int i) {
			return getToken(HTMLParser.TYPE_VALUE, i);
		}
		public List<TerminalNode> NG_MODEL_EQUALS() { return getTokens(HTMLParser.NG_MODEL_EQUALS); }
		public TerminalNode NG_MODEL_EQUALS(int i) {
			return getToken(HTMLParser.NG_MODEL_EQUALS, i);
		}
		public List<TerminalNode> MODEL_VALUE() { return getTokens(HTMLParser.MODEL_VALUE); }
		public TerminalNode MODEL_VALUE(int i) {
			return getToken(HTMLParser.MODEL_VALUE, i);
		}
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public Mustach_openContext mustach_open() {
			return getRuleContext(Mustach_openContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(TAG_OPEN_INPUT);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					match(TYPE_EQUALS);
					setState(85);
					match(TYPE_VALUE);
					setState(86);
					match(NG_MODEL_EQUALS);
					setState(87);
					match(MODEL_VALUE);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TYPE_EQUALS );
				setState(92);
				match(TAG_SLASH_CLOSE_INPUT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(TAG_OPEN);
				setState(94);
				match(TAG_NAME);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_NAME) | (1L << TAG_NG_FOR) | (1L << TAG_NG_SHOW) | (1L << TAG_NG_HIDE) | (1L << TAG_NG_IF) | (1L << TAG_EVENT) | (1L << TYPE_EQUALS) | (1L << NG_MODEL_EQUALS))) != 0)) {
					{
					{
					setState(95);
					htmlAttribute();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(101);
					match(TAG_CLOSE);
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(102);
						htmlContent();
						setState(103);
						match(TAG_OPEN);
						setState(104);
						match(TAG_SLASH);
						setState(105);
						match(TAG_NAME);
						setState(106);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(110);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(SCRIPTLET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				mustach_open();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				script();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				style();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlDataContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode CDATA() { return getToken(HTMLParser.CDATA, 0); }
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlAttributeContext htmlAttribute() {
			return getRuleContext(HtmlAttributeContext.class,0);
		}
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public HtmlDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDataContext htmlData() throws RecognitionException {
		HtmlDataContext _localctx = new HtmlDataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPTLET:
			case SEA_WS:
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
			case TAG_OPEN_INPUT:
			case TAG_OPEN_MUSTACH:
				{
				setState(119);
				htmlElement();
				}
				break;
			case CDATA:
				{
				setState(120);
				match(CDATA);
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				{
				setState(121);
				htmlComment();
				}
				break;
			case TAG_NAME:
			case TAG_NG_FOR:
			case TAG_NG_SHOW:
			case TAG_NG_HIDE:
			case TAG_NG_IF:
			case TAG_EVENT:
			case TYPE_EQUALS:
			case NG_MODEL_EQUALS:
				{
				setState(122);
				htmlAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(125);
				htmlChardata();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public List<HtmlDataContext> htmlData() {
			return getRuleContexts(HtmlDataContext.class);
		}
		public HtmlDataContext htmlData(int i) {
			return getRuleContext(HtmlDataContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				htmlChardata();
				}
				break;
			}
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					htmlData();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NG_FOR() { return getToken(HTMLParser.TAG_NG_FOR, 0); }
		public TerminalNode NG_FOR_CLOSE() { return getToken(HTMLParser.NG_FOR_CLOSE, 0); }
		public TerminalNode TAG_NG_SHOW() { return getToken(HTMLParser.TAG_NG_SHOW, 0); }
		public Ng_showContext ng_show() {
			return getRuleContext(Ng_showContext.class,0);
		}
		public TerminalNode TAG_NG_IF() { return getToken(HTMLParser.TAG_NG_IF, 0); }
		public Ng_ifContext ng_if() {
			return getRuleContext(Ng_ifContext.class,0);
		}
		public TerminalNode TAG_NG_HIDE() { return getToken(HTMLParser.TAG_NG_HIDE, 0); }
		public Ng_hideContext ng_hide() {
			return getRuleContext(Ng_hideContext.class,0);
		}
		public TerminalNode TAG_EVENT() { return getToken(HTMLParser.TAG_EVENT, 0); }
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public Ng_forContext ng_for() {
			return getRuleContext(Ng_forContext.class,0);
		}
		public TerminalNode TYPE_EQUALS() { return getToken(HTMLParser.TYPE_EQUALS, 0); }
		public TerminalNode TYPE_VALUE() { return getToken(HTMLParser.TYPE_VALUE, 0); }
		public TerminalNode NG_MODEL_EQUALS() { return getToken(HTMLParser.NG_MODEL_EQUALS, 0); }
		public TerminalNode MODEL_VALUE() { return getToken(HTMLParser.MODEL_VALUE, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(TAG_NG_FOR);
				setState(138);
				match(NG_FOR_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(TAG_NG_SHOW);
				setState(140);
				ng_show();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(TAG_NG_IF);
				setState(142);
				ng_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(TAG_NG_HIDE);
				setState(144);
				ng_hide();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(TAG_EVENT);
				setState(146);
				event();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(TAG_NAME);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(148);
					match(TAG_NG_FOR);
					setState(149);
					ng_for();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(TAG_NAME);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(153);
					match(TAG_NG_HIDE);
					setState(154);
					ng_hide();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				match(TAG_NAME);
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(158);
					match(TAG_NG_IF);
					setState(159);
					ng_if();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				match(TAG_NAME);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(163);
					match(TAG_NG_IF);
					setState(164);
					ng_show();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				match(TYPE_EQUALS);
				setState(168);
				match(TYPE_VALUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(169);
				match(NG_MODEL_EQUALS);
				setState(170);
				match(MODEL_VALUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				match(TAG_NAME);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(172);
					match(TAG_EQUALS);
					setState(173);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_forContext extends ParserRuleContext {
		public TerminalNode NG_FOR_CLOSE() { return getToken(HTMLParser.NG_FOR_CLOSE, 0); }
		public Ng_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_forContext ng_for() throws RecognitionException {
		Ng_forContext _localctx = new Ng_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ng_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(NG_FOR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_hideContext extends ParserRuleContext {
		public TerminalNode NG_HIDE_CLOSE() { return getToken(HTMLParser.NG_HIDE_CLOSE, 0); }
		public Ng_hideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_hide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_hide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_hide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_hide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_hideContext ng_hide() throws RecognitionException {
		Ng_hideContext _localctx = new Ng_hideContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ng_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(NG_HIDE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_ifContext extends ParserRuleContext {
		public TerminalNode NG_IF_CLOSE() { return getToken(HTMLParser.NG_IF_CLOSE, 0); }
		public Ng_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_ifContext ng_if() throws RecognitionException {
		Ng_ifContext _localctx = new Ng_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ng_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(NG_IF_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_showContext extends ParserRuleContext {
		public TerminalNode NG_SHOW_CLOSE() { return getToken(HTMLParser.NG_SHOW_CLOSE, 0); }
		public Ng_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_show(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_show(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_showContext ng_show() throws RecognitionException {
		Ng_showContext _localctx = new Ng_showContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ng_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(NG_SHOW_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public TerminalNode EVENT_CLOSE() { return getToken(HTMLParser.EVENT_CLOSE, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(EVENT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mustach_openContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_MUSTACH() { return getToken(HTMLParser.TAG_OPEN_MUSTACH, 0); }
		public Mustach_bodyContext mustach_body() {
			return getRuleContext(Mustach_bodyContext.class,0);
		}
		public TerminalNode MUSTACH_CLOSE() { return getToken(HTMLParser.MUSTACH_CLOSE, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(HTMLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HTMLParser.SEA_WS, i);
		}
		public Mustach_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustach_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMustach_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMustach_open(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMustach_open(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mustach_openContext mustach_open() throws RecognitionException {
		Mustach_openContext _localctx = new Mustach_openContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mustach_open);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(188);
				match(SEA_WS);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(TAG_OPEN_MUSTACH);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(195);
				match(SEA_WS);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			mustach_body();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(202);
				match(SEA_WS);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(MUSTACH_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mustach_bodyContext extends ParserRuleContext {
		public TerminalNode MUSTACH_VALUE() { return getToken(HTMLParser.MUSTACH_VALUE, 0); }
		public Mustach_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustach_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMustach_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMustach_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMustach_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mustach_bodyContext mustach_body() throws RecognitionException {
		Mustach_bodyContext _localctx = new Mustach_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mustach_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(MUSTACH_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_htmlMisc);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(HTMLParser.SCRIPT_CLOSE, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(HTMLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HTMLParser.SEA_WS, i);
		}
		public List<TerminalNode> VAR() { return getTokens(HTMLParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(HTMLParser.VAR, i);
		}
		public List<TerminalNode> VAR_VARIABLE() { return getTokens(HTMLParser.VAR_VARIABLE); }
		public TerminalNode VAR_VARIABLE(int i) {
			return getToken(HTMLParser.VAR_VARIABLE, i);
		}
		public List<TerminalNode> VAR_EQUALS() { return getTokens(HTMLParser.VAR_EQUALS); }
		public TerminalNode VAR_EQUALS(int i) {
			return getToken(HTMLParser.VAR_EQUALS, i);
		}
		public List<TerminalNode> VAR_VARIABLE_VALUE() { return getTokens(HTMLParser.VAR_VARIABLE_VALUE); }
		public TerminalNode VAR_VARIABLE_VALUE(int i) {
			return getToken(HTMLParser.VAR_VARIABLE_VALUE, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(220);
				match(SEA_WS);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(SCRIPT_OPEN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(227);
				match(VAR);
				setState(228);
				match(VAR_VARIABLE);
				setState(229);
				match(VAR_EQUALS);
				setState(230);
				match(VAR_VARIABLE_VALUE);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(SCRIPT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HTMLParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(HTMLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(HTMLParser.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(STYLE_OPEN);
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\5\2\60\n\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\5\29\n\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4"+
		"\7\4Q\n\4\f\4\16\4T\13\4\3\5\3\5\3\5\3\5\3\5\6\5[\n\5\r\5\16\5\\\3\5\3"+
		"\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n"+
		"\5\3\5\5\5r\n\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\3\6\5\6~\n\6\3\6"+
		"\5\6\u0081\n\6\3\7\5\7\u0084\n\7\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\b"+
		"\3\b\3\b\5\b\u009e\n\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\b\3\b\3\b\5\b\u00a8"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b1\n\b\5\b\u00b3\n\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\7\16\u00c0\n\16\f\16\16\16\u00c3"+
		"\13\16\3\16\3\16\7\16\u00c7\n\16\f\16\16\16\u00ca\13\16\3\16\3\16\7\16"+
		"\u00ce\n\16\f\16\16\16\u00d1\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\5\21\u00db\n\21\3\22\3\22\3\23\7\23\u00e0\n\23\f\23\16\23\u00e3"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\6\3\2\b\t\4\2\t\t\16\16\3\2\3\4\3\2&\'\2\u010d\2+\3\2\2"+
		"\2\4F\3\2\2\2\6K\3\2\2\2\bw\3\2\2\2\n}\3\2\2\2\f\u0083\3\2\2\2\16\u00b2"+
		"\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba\3"+
		"\2\2\2\30\u00bc\3\2\2\2\32\u00c1\3\2\2\2\34\u00d4\3\2\2\2\36\u00d6\3\2"+
		"\2\2 \u00da\3\2\2\2\"\u00dc\3\2\2\2$\u00e1\3\2\2\2&\u00f0\3\2\2\2(*\5"+
		"\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.\60"+
		"\7\5\2\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61\63\5\4\3\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\679\7\7\2\28\67\3\2\2\289\3\2\2\29=\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5\6\4\2A@\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2FG\t\2\2\2G\5\3\2\2\2HJ\5"+
		" \21\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NR\5"+
		"\b\5\2OQ\5 \21\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR"+
		"\3\2\2\2UZ\7\r\2\2VW\79\2\2WX\7;\2\2XY\7:\2\2Y[\7=\2\2ZV\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^x\78\2\2_`\7\f\2\2`d\7\33\2\2a"+
		"c\5\16\b\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eq\3\2\2\2fd\3\2\2\2"+
		"gn\7\26\2\2hi\5\f\7\2ij\7\f\2\2jk\7\30\2\2kl\7\33\2\2lm\7\26\2\2mo\3\2"+
		"\2\2nh\3\2\2\2no\3\2\2\2or\3\2\2\2pr\7\27\2\2qg\3\2\2\2qp\3\2\2\2rx\3"+
		"\2\2\2sx\7\b\2\2tx\5\32\16\2ux\5$\23\2vx\5&\24\2wU\3\2\2\2w_\3\2\2\2w"+
		"s\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\t\3\2\2\2y~\5\b\5\2z~\7\6\2\2"+
		"{~\5\"\22\2|~\5\16\b\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0080"+
		"\3\2\2\2\177\u0081\5\36\20\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\13\3\2\2\2\u0082\u0084\5\36\20\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0088\3\2\2\2\u0085\u0087\5\n\6\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\u008c\7\35\2\2\u008c\u00b3\7/\2\2\u008d\u008e"+
		"\7\36\2\2\u008e\u00b3\5\26\f\2\u008f\u0090\7 \2\2\u0090\u00b3\5\24\13"+
		"\2\u0091\u0092\7\37\2\2\u0092\u00b3\5\22\n\2\u0093\u0094\7!\2\2\u0094"+
		"\u00b3\5\30\r\2\u0095\u0098\7\33\2\2\u0096\u0097\7\35\2\2\u0097\u0099"+
		"\5\20\t\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00b3\3\2\2\2"+
		"\u009a\u009d\7\33\2\2\u009b\u009c\7\37\2\2\u009c\u009e\5\22\n\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00b3\3\2\2\2\u009f\u00a2\7\33"+
		"\2\2\u00a0\u00a1\7 \2\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00b3\3\2\2\2\u00a4\u00a7\7\33\2\2\u00a5\u00a6\7"+
		" \2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00b3\3\2\2\2\u00a9\u00aa\79\2\2\u00aa\u00b3\7;\2\2\u00ab\u00ac\7:\2"+
		"\2\u00ac\u00b3\7=\2\2\u00ad\u00b0\7\33\2\2\u00ae\u00af\7\31\2\2\u00af"+
		"\u00b1\7(\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u008b\3\2\2\2\u00b2\u008d\3\2\2\2\u00b2\u008f\3\2\2\2\u00b2"+
		"\u0091\3\2\2\2\u00b2\u0093\3\2\2\2\u00b2\u0095\3\2\2\2\u00b2\u009a\3\2"+
		"\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2"+
		"\u00ab\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7/\2\2"+
		"\u00b5\21\3\2\2\2\u00b6\u00b7\7\64\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\7"+
		"\65\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\7\63\2\2\u00bb\27\3\2\2\2\u00bc\u00bd"+
		"\7L\2\2\u00bd\31\3\2\2\2\u00be\u00c0\7\t\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\7\17\2\2\u00c5\u00c7\7\t\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\5\34\17\2\u00cc"+
		"\u00ce\7\t\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7J\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\7K\2\2\u00d5\35\3\2\2\2\u00d6"+
		"\u00d7\t\3\2\2\u00d7\37\3\2\2\2\u00d8\u00db\5\"\22\2\u00d9\u00db\7\t\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db!\3\2\2\2\u00dc\u00dd"+
		"\t\4\2\2\u00dd#\3\2\2\2\u00de\u00e0\7\t\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00eb\7\n\2\2\u00e5\u00e6\7$\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7\u00e8\7@\2\2\u00e8\u00ea\7A\2\2\u00e9\u00e5\3\2\2"+
		"\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef%\3\2\2\2\u00f0\u00f1"+
		"\7\13\2\2\u00f1\u00f2\t\5\2\2\u00f2\'\3\2\2\2\37+/\648=CKR\\dnqw}\u0080"+
		"\u0083\u0088\u0098\u009d\u00a2\u00a7\u00b0\u00b2\u00c1\u00c8\u00cf\u00da"+
		"\u00e1\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
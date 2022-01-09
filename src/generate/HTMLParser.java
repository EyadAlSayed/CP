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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, MODEL_VARIABLE=11, 
		TAG_OPEN_INPUT=12, HTML_TEXT=13, TAG_OPEN_MUSTACH=14, NGFOR=15, NGSHOW=16, 
		NGHIDE=17, NGIF=18, TYPE=19, NG_MODEL=20, TAG_CLOSE=21, TAG_SLASH_CLOSE=22, 
		TAG_SLASH=23, TAG_EQUALS=24, TAG_NAME_INPUT_END=25, TAG_NAME=26, TAG_WHITESPACE=27, 
		TAG_NG_FOR=28, TAG_NG_SHOW=29, TAG_NG_HIDE=30, TAG_NG_IF=31, TAG_EVENT=32, 
		TAG_SQ_BRACKET=33, TAG_CARLE_BRACKET=34, VAR=35, SCRIPT_CLOSE=36, STYLE_BODY=37, 
		STYLE_SHORT_BODY=38, ATTVALUE_VALUE=39, ATTRIBUTE=40, IN=41, SPACE=42, 
		EQUALS=43, SEM_COLON=44, SINGLE_QUOTE=45, NG_FOR_CLOSE=46, NG_FOR_VALUE=47, 
		DOT=48, LOG_OP=49, NG_SHOW_CLOSE=50, NG_HIDE_CLOSE=51, NG_IF_CLOSE=52, 
		TAG_NAME_INPUT_BEGIN=53, TAG_CLOSE_INPUT=54, TAG_SLASH_CLOSE_INPUT=55, 
		TYPE_EQUALS=56, NG_MODEL_EQUALS=57, TYPE_VALUE=58, TYPE_ATTRIBUTE=59, 
		MODEL_VALUE=60, MODEL_ATTRIBUTE=61, VAR_VARIABLE=62, VAR_EQUALS=63, VAR_OBJ=64, 
		VAR_VARIABLE_VALUE=65, MY_FORMATER_NAME=66, FUNCTION_SPLITER=67, FUNCTION_INDICATOR=68, 
		FUNCTION_NAME=69, MY_FORMATER=70, FORMATER_TYPE=71, DATE_FORMAT=72, COMMA=73, 
		CLOSE_SQ_BRACKET_C=74, CLOSE_SQ_BRACKET=75, SQ_BRACKET_VALUE=76, SQ_BRACKET_ATT=77, 
		PIP=78, CLOSE_CARLE_BRAKET=79, CARLE_BRAKET_VALUE=80, MUSTACH_CLOSE=81, 
		MUSTACH_VALUE=82, EVENT_CLOSE=83, EVENT_ATTRIBUTE=84, SEA_W=85, TAG_OPEN_B=86, 
		B_CLOSE=87, B_ATTRIBUTE=88;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_htmlData = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_ng_for = 7, RULE_ng_hide = 8, RULE_ng_if = 9, RULE_ng_show = 10, 
		RULE_model_variable = 11, RULE_event = 12, RULE_mustach_open = 13, RULE_mustach_body = 14, 
		RULE_open_b = 15, RULE_b_attribute = 16, RULE_htmlChardata = 17, RULE_htmlMisc = 18, 
		RULE_htmlComment = 19, RULE_script = 20, RULE_style = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlData", 
			"htmlContent", "htmlAttribute", "ng_for", "ng_hide", "ng_if", "ng_show", 
			"model_variable", "event", "mustach_open", "mustach_body", "open_b", 
			"b_attribute", "htmlChardata", "htmlMisc", "htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			null, null, null, null, null, null, null, null, null, "'>'", "'/>'", 
			"'/'", "'='", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "' '", null, "';'", null, null, 
			null, "'.'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'myFormater'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "MODEL_VARIABLE", 
			"TAG_OPEN_INPUT", "HTML_TEXT", "TAG_OPEN_MUSTACH", "NGFOR", "NGSHOW", 
			"NGHIDE", "NGIF", "TYPE", "NG_MODEL", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME_INPUT_END", "TAG_NAME", "TAG_WHITESPACE", 
			"TAG_NG_FOR", "TAG_NG_SHOW", "TAG_NG_HIDE", "TAG_NG_IF", "TAG_EVENT", 
			"TAG_SQ_BRACKET", "TAG_CARLE_BRACKET", "VAR", "SCRIPT_CLOSE", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "IN", "SPACE", "EQUALS", 
			"SEM_COLON", "SINGLE_QUOTE", "NG_FOR_CLOSE", "NG_FOR_VALUE", "DOT", "LOG_OP", 
			"NG_SHOW_CLOSE", "NG_HIDE_CLOSE", "NG_IF_CLOSE", "TAG_NAME_INPUT_BEGIN", 
			"TAG_CLOSE_INPUT", "TAG_SLASH_CLOSE_INPUT", "TYPE_EQUALS", "NG_MODEL_EQUALS", 
			"TYPE_VALUE", "TYPE_ATTRIBUTE", "MODEL_VALUE", "MODEL_ATTRIBUTE", "VAR_VARIABLE", 
			"VAR_EQUALS", "VAR_OBJ", "VAR_VARIABLE_VALUE", "MY_FORMATER_NAME", "FUNCTION_SPLITER", 
			"FUNCTION_INDICATOR", "FUNCTION_NAME", "MY_FORMATER", "FORMATER_TYPE", 
			"DATE_FORMAT", "COMMA", "CLOSE_SQ_BRACKET_C", "CLOSE_SQ_BRACKET", "SQ_BRACKET_VALUE", 
			"SQ_BRACKET_ATT", "PIP", "CLOSE_CARLE_BRAKET", "CARLE_BRAKET_VALUE", 
			"MUSTACH_CLOSE", "MUSTACH_VALUE", "EVENT_CLOSE", "EVENT_ATTRIBUTE", "SEA_W", 
			"TAG_OPEN_B", "B_CLOSE", "B_ATTRIBUTE"
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
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(50);
				match(XML);
				}
			}

			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(59);
				match(DTD);
				}
			}

			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN) | (1L << TAG_OPEN_INPUT) | (1L << TAG_OPEN_MUSTACH))) != 0)) {
				{
				{
				setState(68);
				htmlElements();
				}
				}
				setState(73);
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
			setState(74);
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
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					htmlMisc();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(82);
			htmlElement();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					htmlMisc();
					}
					} 
				}
				setState(88);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(TAG_OPEN_INPUT);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(TYPE_EQUALS);
					setState(91);
					match(TYPE_VALUE);
					setState(92);
					match(NG_MODEL_EQUALS);
					setState(93);
					match(MODEL_VALUE);
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TYPE_EQUALS );
				setState(98);
				match(TAG_SLASH_CLOSE_INPUT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(TAG_OPEN);
				setState(100);
				match(TAG_NAME);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_NAME) | (1L << TAG_NG_FOR) | (1L << TAG_NG_SHOW) | (1L << TAG_NG_HIDE) | (1L << TAG_NG_IF) | (1L << TAG_EVENT) | (1L << TYPE_EQUALS) | (1L << NG_MODEL_EQUALS))) != 0)) {
					{
					{
					setState(101);
					htmlAttribute();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(107);
					match(TAG_CLOSE);
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(108);
						htmlContent();
						setState(109);
						match(TAG_OPEN);
						setState(110);
						match(TAG_SLASH);
						setState(111);
						match(TAG_NAME);
						setState(112);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(116);
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
				setState(119);
				match(SCRIPTLET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				mustach_open();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				script();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
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
			setState(129);
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
				setState(125);
				htmlElement();
				}
				break;
			case CDATA:
				{
				setState(126);
				match(CDATA);
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				{
				setState(127);
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
				setState(128);
				htmlAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(131);
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
		public Model_variableContext model_variable() {
			return getRuleContext(Model_variableContext.class,0);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(HTMLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HTMLParser.SEA_WS, i);
		}
		public TerminalNode FUNCTION_INDICATOR() { return getToken(HTMLParser.FUNCTION_INDICATOR, 0); }
		public TerminalNode FUNCTION_NAME() { return getToken(HTMLParser.FUNCTION_NAME, 0); }
		public Open_bContext open_b() {
			return getRuleContext(Open_bContext.class,0);
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
		int _la;
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(134);
					htmlChardata();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						htmlData();
						}
						} 
					}
					setState(142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(143);
					match(SEA_WS);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				model_variable();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION_INDICATOR) {
					{
					setState(150);
					match(FUNCTION_INDICATOR);
					setState(151);
					match(FUNCTION_NAME);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(154);
					match(SEA_WS);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				open_b();
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(TAG_NG_FOR);
				setState(164);
				match(NG_FOR_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(TAG_NG_SHOW);
				setState(166);
				ng_show();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(TAG_NG_IF);
				setState(168);
				ng_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(TAG_NG_HIDE);
				setState(170);
				ng_hide();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(TAG_EVENT);
				setState(172);
				event();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(TAG_NAME);
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(174);
					match(TAG_NG_FOR);
					setState(175);
					ng_for();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				match(TAG_NAME);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(179);
					match(TAG_NG_HIDE);
					setState(180);
					ng_hide();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				match(TAG_NAME);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(184);
					match(TAG_NG_IF);
					setState(185);
					ng_if();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				match(TAG_NAME);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(189);
					match(TAG_NG_IF);
					setState(190);
					ng_show();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				match(TYPE_EQUALS);
				setState(194);
				match(TYPE_VALUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(195);
				match(NG_MODEL_EQUALS);
				setState(196);
				match(MODEL_VALUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(197);
				match(TAG_NAME);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(198);
					match(TAG_EQUALS);
					setState(199);
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
			setState(204);
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
			setState(206);
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
			setState(208);
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
			setState(210);
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

	public static class Model_variableContext extends ParserRuleContext {
		public TerminalNode MODEL_VARIABLE() { return getToken(HTMLParser.MODEL_VARIABLE, 0); }
		public Model_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterModel_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitModel_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitModel_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_variableContext model_variable() throws RecognitionException {
		Model_variableContext _localctx = new Model_variableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_model_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(MODEL_VARIABLE);
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
		enterRule(_localctx, 24, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 26, RULE_mustach_open);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(216);
				match(SEA_WS);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(TAG_OPEN_MUSTACH);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(223);
				match(SEA_WS);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			mustach_body();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(230);
				match(SEA_WS);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
		enterRule(_localctx, 28, RULE_mustach_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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

	public static class Open_bContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_B() { return getToken(HTMLParser.TAG_OPEN_B, 0); }
		public B_attributeContext b_attribute() {
			return getRuleContext(B_attributeContext.class,0);
		}
		public TerminalNode B_CLOSE() { return getToken(HTMLParser.B_CLOSE, 0); }
		public List<TerminalNode> SEA_W() { return getTokens(HTMLParser.SEA_W); }
		public TerminalNode SEA_W(int i) {
			return getToken(HTMLParser.SEA_W, i);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(HTMLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HTMLParser.SEA_WS, i);
		}
		public Open_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOpen_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOpen_b(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOpen_b(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_bContext open_b() throws RecognitionException {
		Open_bContext _localctx = new Open_bContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_open_b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_W) {
				{
				{
				setState(240);
				match(SEA_W);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(TAG_OPEN_B);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(247);
				match(SEA_WS);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			b_attribute();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(254);
				match(SEA_WS);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(B_CLOSE);
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

	public static class B_attributeContext extends ParserRuleContext {
		public TerminalNode B_ATTRIBUTE() { return getToken(HTMLParser.B_ATTRIBUTE, 0); }
		public B_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterB_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitB_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitB_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_attributeContext b_attribute() throws RecognitionException {
		B_attributeContext _localctx = new B_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_b_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(B_ATTRIBUTE);
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
		enterRule(_localctx, 34, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 36, RULE_htmlMisc);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
		enterRule(_localctx, 38, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		public List<TerminalNode> VAR_OBJ() { return getTokens(HTMLParser.VAR_OBJ); }
		public TerminalNode VAR_OBJ(int i) {
			return getToken(HTMLParser.VAR_OBJ, i);
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
		enterRule(_localctx, 40, RULE_script);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(272);
					match(SEA_WS);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(SCRIPT_OPEN);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(279);
					match(VAR);
					setState(280);
					match(VAR_VARIABLE);
					setState(281);
					match(VAR_EQUALS);
					setState(282);
					match(VAR_VARIABLE_VALUE);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(SCRIPT_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(289);
					match(SEA_WS);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(SCRIPT_OPEN);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(296);
					match(VAR);
					setState(297);
					match(VAR_OBJ);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(SCRIPT_CLOSE);
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
		enterRule(_localctx, 42, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(STYLE_OPEN);
			setState(307);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\5\2\66\n\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\5\2?\n\2"+
		"\3\2\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\4\7"+
		"\4P\n\4\f\4\16\4S\13\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\6\5a\n\5\r\5\16\5b\3\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5u\n\5\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\5\5~\n\5"+
		"\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\6\5\6\u0087\n\6\3\7\5\7\u008a\n\7\3\7"+
		"\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\7\7\u0093\n\7\f\7\16\7\u0096\13"+
		"\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7"+
		"\5\7\u00a4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00b3\n\b\3\b\3\b\3\b\5\b\u00b8\n\b\3\b\3\b\3\b\5\b\u00bd\n\b\3\b\3\b"+
		"\3\b\5\b\u00c2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cb\n\b\5\b\u00cd"+
		"\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\7\17\u00dc"+
		"\n\17\f\17\16\17\u00df\13\17\3\17\3\17\7\17\u00e3\n\17\f\17\16\17\u00e6"+
		"\13\17\3\17\3\17\7\17\u00ea\n\17\f\17\16\17\u00ed\13\17\3\17\3\17\3\20"+
		"\3\20\3\21\7\21\u00f4\n\21\f\21\16\21\u00f7\13\21\3\21\3\21\7\21\u00fb"+
		"\n\21\f\21\16\21\u00fe\13\21\3\21\3\21\7\21\u0102\n\21\f\21\16\21\u0105"+
		"\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u010f\n\24\3\25\3"+
		"\25\3\26\7\26\u0114\n\26\f\26\16\26\u0117\13\26\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u011e\n\26\f\26\16\26\u0121\13\26\3\26\3\26\7\26\u0125\n\26\f"+
		"\26\16\26\u0128\13\26\3\26\3\26\3\26\7\26\u012d\n\26\f\26\16\26\u0130"+
		"\13\26\3\26\5\26\u0133\n\26\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\b\t\4\2\t\t\17\17\3\2\3\4\3\2"+
		"\'(\2\u0159\2\61\3\2\2\2\4L\3\2\2\2\6Q\3\2\2\2\b}\3\2\2\2\n\u0083\3\2"+
		"\2\2\f\u00a3\3\2\2\2\16\u00cc\3\2\2\2\20\u00ce\3\2\2\2\22\u00d0\3\2\2"+
		"\2\24\u00d2\3\2\2\2\26\u00d4\3\2\2\2\30\u00d6\3\2\2\2\32\u00d8\3\2\2\2"+
		"\34\u00dd\3\2\2\2\36\u00f0\3\2\2\2 \u00f5\3\2\2\2\"\u0108\3\2\2\2$\u010a"+
		"\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2*\u0132\3\2\2\2,\u0134\3\2\2\2."+
		"\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\64\66\7\5\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66:\3\2"+
		"\2\2\679\5\4\3\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<"+
		":\3\2\2\2=?\7\7\2\2>=\3\2\2\2>?\3\2\2\2?C\3\2\2\2@B\5\4\3\2A@\3\2\2\2"+
		"BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5\6\4\2GF\3\2\2\2"+
		"HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KI\3\2\2\2LM\t\2\2\2M\5\3\2\2"+
		"\2NP\5&\24\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2"+
		"\2TX\5\b\5\2UW\5&\24\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\7\3\2"+
		"\2\2ZX\3\2\2\2[`\7\16\2\2\\]\7:\2\2]^\7<\2\2^_\7;\2\2_a\7>\2\2`\\\3\2"+
		"\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2d~\79\2\2ef\7\f\2\2fj\7\34"+
		"\2\2gi\5\16\b\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kw\3\2\2\2lj\3"+
		"\2\2\2mt\7\27\2\2no\5\f\7\2op\7\f\2\2pq\7\31\2\2qr\7\34\2\2rs\7\27\2\2"+
		"su\3\2\2\2tn\3\2\2\2tu\3\2\2\2ux\3\2\2\2vx\7\30\2\2wm\3\2\2\2wv\3\2\2"+
		"\2x~\3\2\2\2y~\7\b\2\2z~\5\34\17\2{~\5*\26\2|~\5,\27\2}[\3\2\2\2}e\3\2"+
		"\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\t\3\2\2\2\177\u0084\5\b"+
		"\5\2\u0080\u0084\7\6\2\2\u0081\u0084\5(\25\2\u0082\u0084\5\16\b\2\u0083"+
		"\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\u0086\3\2\2\2\u0085\u0087\5$\23\2\u0086\u0085\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\13\3\2\2\2\u0088\u008a\5$\23\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u008d\5\n\6\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u00a4\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7\t\2\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\5\30\r\2\u0098\u0099\7"+
		"F\2\2\u0099\u009b\7G\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00a4\3\2\2\2\u009c\u009e\7\t\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a4\5 \21\2\u00a3\u0089\3\2\2\2\u00a3\u0094\3\2"+
		"\2\2\u00a3\u009f\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00cd"+
		"\7\60\2\2\u00a7\u00a8\7\37\2\2\u00a8\u00cd\5\26\f\2\u00a9\u00aa\7!\2\2"+
		"\u00aa\u00cd\5\24\13\2\u00ab\u00ac\7 \2\2\u00ac\u00cd\5\22\n\2\u00ad\u00ae"+
		"\7\"\2\2\u00ae\u00cd\5\32\16\2\u00af\u00b2\7\34\2\2\u00b0\u00b1\7\36\2"+
		"\2\u00b1\u00b3\5\20\t\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00cd\3\2\2\2\u00b4\u00b7\7\34\2\2\u00b5\u00b6\7 \2\2\u00b6\u00b8\5\22"+
		"\n\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00cd\3\2\2\2\u00b9"+
		"\u00bc\7\34\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00cd\3\2\2\2\u00be\u00c1\7\34\2\2\u00bf"+
		"\u00c0\7!\2\2\u00c0\u00c2\5\26\f\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00cd\3\2\2\2\u00c3\u00c4\7:\2\2\u00c4\u00cd\7<\2\2\u00c5\u00c6"+
		"\7;\2\2\u00c6\u00cd\7>\2\2\u00c7\u00ca\7\34\2\2\u00c8\u00c9\7\32\2\2\u00c9"+
		"\u00cb\7)\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00a5\3\2\2\2\u00cc\u00a7\3\2\2\2\u00cc\u00a9\3\2\2\2\u00cc"+
		"\u00ab\3\2\2\2\u00cc\u00ad\3\2\2\2\u00cc\u00af\3\2\2\2\u00cc\u00b4\3\2"+
		"\2\2\u00cc\u00b9\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc"+
		"\u00c5\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\17\3\2\2\2\u00ce\u00cf\7\60\2"+
		"\2\u00cf\21\3\2\2\2\u00d0\u00d1\7\65\2\2\u00d1\23\3\2\2\2\u00d2\u00d3"+
		"\7\66\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\7\64\2\2\u00d5\27\3\2\2\2\u00d6"+
		"\u00d7\7\r\2\2\u00d7\31\3\2\2\2\u00d8\u00d9\7U\2\2\u00d9\33\3\2\2\2\u00da"+
		"\u00dc\7\t\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e4\7\20\2\2\u00e1\u00e3\7\t\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00eb\5\36\20\2\u00e8\u00ea\7\t\2\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7S\2\2\u00ef\35\3\2\2\2"+
		"\u00f0\u00f1\7T\2\2\u00f1\37\3\2\2\2\u00f2\u00f4\7W\2\2\u00f3\u00f2\3"+
		"\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fc\7X\2\2\u00f9\u00fb\7\t"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0103\5\""+
		"\22\2\u0100\u0102\7\t\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0107\7Y\2\2\u0107!\3\2\2\2\u0108\u0109\7Z\2\2\u0109#\3\2\2"+
		"\2\u010a\u010b\t\3\2\2\u010b%\3\2\2\2\u010c\u010f\5(\25\2\u010d\u010f"+
		"\7\t\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\'\3\2\2\2\u0110"+
		"\u0111\t\4\2\2\u0111)\3\2\2\2\u0112\u0114\7\t\2\2\u0113\u0112\3\2\2\2"+
		"\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011f\7\n\2\2\u0119\u011a\7%\2\2\u011a"+
		"\u011b\7@\2\2\u011b\u011c\7A\2\2\u011c\u011e\7C\2\2\u011d\u0119\3\2\2"+
		"\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0133\7&\2\2\u0123\u0125\7\t\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012e\7\n\2\2\u012a"+
		"\u012b\7%\2\2\u012b\u012d\7B\2\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2"+
		"\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0131\u0133\7&\2\2\u0132\u0115\3\2\2\2\u0132\u0126\3\2\2\2\u0133"+
		"+\3\2\2\2\u0134\u0135\7\13\2\2\u0135\u0136\t\5\2\2\u0136-\3\2\2\2)\61"+
		"\65:>CIQXbjtw}\u0083\u0086\u0089\u008e\u0094\u009a\u009f\u00a3\u00b2\u00b7"+
		"\u00bc\u00c1\u00ca\u00cc\u00dd\u00e4\u00eb\u00f5\u00fc\u0103\u010e\u0115"+
		"\u011f\u0126\u012e\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from D:/My compiler project/CP/src\HTMLParser.g4 by ANTLR 4.9.2
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
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, TAG_OPEN_INPUT=11, 
		HTML_TEXT=12, TAG_OPEN_MUSTACH=13, NGFOR=14, TYPE=15, NG_MODEL=16, TAG_CLOSE=17, 
		TAG_SLASH_CLOSE=18, TAG_SLASH=19, TAG_EQUALS=20, TAG_NAME_INPUT_END=21, 
		TAG_NAME=22, TAG_WHITESPACE=23, TAG_NG_FOR=24, TAG_SQ_BRACKET=25, TAG_CARLE_BRACKET=26, 
		VAR=27, SCRIPT_CLOSE=28, STYLE_BODY=29, STYLE_SHORT_BODY=30, ATTVALUE_VALUE=31, 
		ATTRIBUTE=32, IN=33, SPACE=34, EQUALS=35, SEM_COLON=36, SINGLE_QUOTE=37, 
		NG_FOR_VALUE=38, NG_FOR_ATTRIBUTE=39, TAG_NAME_INPUT_BEGIN=40, TAG_CLOSE_INPUT=41, 
		TAG_SLASH_CLOSE_INPUT=42, TYPE_EQUALS=43, NG_MODEL_EQUALS=44, TYPE_VALUE=45, 
		TYPE_ATTRIBUTE=46, MODEL_VALUE=47, MODEL_ATTRIBUTE=48, VAR_VARIABLE=49, 
		VAR_EQUALS=50, VAR_VARIABLE_VALUE=51, COMMA=52, CLOSE_SQ_BRACKET=53, SQ_BRACKET_ATTRIBUTE=54, 
		PIP=55, CLOSE_CARLE_BRAKET=56, CARLE_BRAKET_VALUE=57, MUSTACH_CLOSE=58, 
		MUSTACH_ATTRIBUTE=59, TAG_NG_ATTRIBUTE=60, NG_VALUE=61, NGSWITCH=62, NGCASE=63, 
		NGSHOW=64, NGHIDE=65, NGIF=66;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_htmlData = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_ng_for_value = 7, RULE_ng_for = 8, RULE_ng_switch = 9, RULE_ng_case = 10, 
		RULE_ng_show = 11, RULE_ng_hide = 12, RULE_ng_if = 13, RULE_type = 14, 
		RULE_model = 15, RULE_ng_for_attribute = 16, RULE_mustach_open = 17, RULE_mustach_body = 18, 
		RULE_htmlChardata = 19, RULE_htmlMisc = 20, RULE_htmlComment = 21, RULE_script = 22, 
		RULE_style = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlData", 
			"htmlContent", "htmlAttribute", "ng_for_value", "ng_for", "ng_switch", 
			"ng_case", "ng_show", "ng_hide", "ng_if", "type", "model", "ng_for_attribute", 
			"mustach_open", "mustach_body", "htmlChardata", "htmlMisc", "htmlComment", 
			"script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			null, null, null, null, null, "'>'", "'/>'", "'/'", "'='", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "' '", 
			null, "';'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "TAG_OPEN_INPUT", 
			"HTML_TEXT", "TAG_OPEN_MUSTACH", "NGFOR", "TYPE", "NG_MODEL", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME_INPUT_END", "TAG_NAME", 
			"TAG_WHITESPACE", "TAG_NG_FOR", "TAG_SQ_BRACKET", "TAG_CARLE_BRACKET", 
			"VAR", "SCRIPT_CLOSE", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", 
			"ATTRIBUTE", "IN", "SPACE", "EQUALS", "SEM_COLON", "SINGLE_QUOTE", "NG_FOR_VALUE", 
			"NG_FOR_ATTRIBUTE", "TAG_NAME_INPUT_BEGIN", "TAG_CLOSE_INPUT", "TAG_SLASH_CLOSE_INPUT", 
			"TYPE_EQUALS", "NG_MODEL_EQUALS", "TYPE_VALUE", "TYPE_ATTRIBUTE", "MODEL_VALUE", 
			"MODEL_ATTRIBUTE", "VAR_VARIABLE", "VAR_EQUALS", "VAR_VARIABLE_VALUE", 
			"COMMA", "CLOSE_SQ_BRACKET", "SQ_BRACKET_ATTRIBUTE", "PIP", "CLOSE_CARLE_BRAKET", 
			"CARLE_BRAKET_VALUE", "MUSTACH_CLOSE", "MUSTACH_ATTRIBUTE", "TAG_NG_ATTRIBUTE", 
			"NG_VALUE", "NGSWITCH", "NGCASE", "NGSHOW", "NGHIDE", "NGIF"
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
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(54);
				match(XML);
				}
			}

			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(63);
				match(DTD);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN) | (1L << TAG_OPEN_INPUT) | (1L << TAG_OPEN_MUSTACH))) != 0)) {
				{
				{
				setState(72);
				htmlElements();
				}
				}
				setState(77);
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
			setState(78);
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
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					htmlMisc();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(86);
			htmlElement();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					htmlMisc();
					}
					} 
				}
				setState(92);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(TAG_OPEN_INPUT);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					match(TYPE_EQUALS);
					setState(95);
					match(TYPE_VALUE);
					setState(96);
					match(NG_MODEL_EQUALS);
					setState(97);
					match(MODEL_VALUE);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TYPE_EQUALS );
				setState(102);
				match(TAG_SLASH_CLOSE_INPUT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(TAG_OPEN);
				setState(104);
				match(TAG_NAME);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_NAME) | (1L << TAG_NG_FOR) | (1L << TYPE_EQUALS) | (1L << NG_MODEL_EQUALS))) != 0)) {
					{
					{
					setState(105);
					htmlAttribute();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(111);
					match(TAG_CLOSE);
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(112);
						htmlContent();
						setState(113);
						match(TAG_OPEN);
						setState(114);
						match(TAG_SLASH);
						setState(115);
						match(TAG_NAME);
						setState(116);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(120);
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
				setState(123);
				match(SCRIPTLET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				mustach_open();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				script();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
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
			setState(133);
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
				setState(129);
				htmlElement();
				}
				break;
			case CDATA:
				{
				setState(130);
				match(CDATA);
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				{
				setState(131);
				htmlComment();
				}
				break;
			case TAG_NAME:
			case TAG_NG_FOR:
			case TYPE_EQUALS:
			case NG_MODEL_EQUALS:
				{
				setState(132);
				htmlAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(135);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(138);
				htmlChardata();
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					htmlData();
					}
					} 
				}
				setState(146);
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
		public Ng_for_valueContext ng_for_value() {
			return getRuleContext(Ng_for_valueContext.class,0);
		}
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public TerminalNode TYPE_EQUALS() { return getToken(HTMLParser.TYPE_EQUALS, 0); }
		public TerminalNode TYPE_VALUE() { return getToken(HTMLParser.TYPE_VALUE, 0); }
		public TerminalNode NG_MODEL_EQUALS() { return getToken(HTMLParser.NG_MODEL_EQUALS, 0); }
		public TerminalNode MODEL_VALUE() { return getToken(HTMLParser.MODEL_VALUE, 0); }
		public TerminalNode TAG_NG_ATTRIBUTE() { return getToken(HTMLParser.TAG_NG_ATTRIBUTE, 0); }
		public TerminalNode NG_VALUE() { return getToken(HTMLParser.NG_VALUE, 0); }
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(TAG_NG_FOR);
				setState(148);
				ng_for_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(TAG_NAME);
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(150);
					match(TAG_NG_FOR);
					setState(151);
					ng_for_value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(TYPE_EQUALS);
				setState(155);
				match(TYPE_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(NG_MODEL_EQUALS);
				setState(157);
				match(MODEL_VALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(TAG_NAME);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_NG_ATTRIBUTE) {
					{
					setState(159);
					match(TAG_NG_ATTRIBUTE);
					setState(160);
					match(NG_VALUE);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(TAG_NAME);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(164);
					match(TAG_EQUALS);
					setState(165);
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

	public static class Ng_for_valueContext extends ParserRuleContext {
		public TerminalNode NG_FOR_VALUE() { return getToken(HTMLParser.NG_FOR_VALUE, 0); }
		public Ng_for_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_for_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_for_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_for_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_for_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_for_valueContext ng_for_value() throws RecognitionException {
		Ng_for_valueContext _localctx = new Ng_for_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ng_for_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(NG_FOR_VALUE);
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
		public TerminalNode NGFOR() { return getToken(HTMLParser.NGFOR, 0); }
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
		enterRule(_localctx, 16, RULE_ng_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NGFOR);
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

	public static class Ng_switchContext extends ParserRuleContext {
		public TerminalNode NGSWITCH() { return getToken(HTMLParser.NGSWITCH, 0); }
		public Ng_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_switchContext ng_switch() throws RecognitionException {
		Ng_switchContext _localctx = new Ng_switchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ng_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(NGSWITCH);
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

	public static class Ng_caseContext extends ParserRuleContext {
		public TerminalNode NGCASE() { return getToken(HTMLParser.NGCASE, 0); }
		public Ng_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_caseContext ng_case() throws RecognitionException {
		Ng_caseContext _localctx = new Ng_caseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ng_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NGCASE);
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
		public TerminalNode NGSHOW() { return getToken(HTMLParser.NGSHOW, 0); }
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
		enterRule(_localctx, 22, RULE_ng_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(NGSHOW);
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
		public TerminalNode NGHIDE() { return getToken(HTMLParser.NGHIDE, 0); }
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
		enterRule(_localctx, 24, RULE_ng_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(NGHIDE);
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
		public TerminalNode NGIF() { return getToken(HTMLParser.NGIF, 0); }
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
		enterRule(_localctx, 26, RULE_ng_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(NGIF);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HTMLParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(TYPE);
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

	public static class ModelContext extends ParserRuleContext {
		public TerminalNode NG_MODEL() { return getToken(HTMLParser.NG_MODEL, 0); }
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(NG_MODEL);
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

	public static class Ng_for_attributeContext extends ParserRuleContext {
		public TerminalNode NG_FOR_ATTRIBUTE() { return getToken(HTMLParser.NG_FOR_ATTRIBUTE, 0); }
		public Ng_for_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_for_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_for_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_for_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_for_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_for_attributeContext ng_for_attribute() throws RecognitionException {
		Ng_for_attributeContext _localctx = new Ng_for_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ng_for_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(NG_FOR_ATTRIBUTE);
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
		enterRule(_localctx, 34, RULE_mustach_open);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(190);
				match(SEA_WS);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(TAG_OPEN_MUSTACH);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(197);
				match(SEA_WS);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			mustach_body();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(204);
				match(SEA_WS);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
		public TerminalNode MUSTACH_ATTRIBUTE() { return getToken(HTMLParser.MUSTACH_ATTRIBUTE, 0); }
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
		enterRule(_localctx, 36, RULE_mustach_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(MUSTACH_ATTRIBUTE);
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
		enterRule(_localctx, 38, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 40, RULE_htmlMisc);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
		enterRule(_localctx, 42, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 44, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(222);
				match(SEA_WS);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(SCRIPT_OPEN);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(229);
				match(VAR);
				setState(230);
				match(VAR_VARIABLE);
				setState(231);
				match(VAR_EQUALS);
				setState(232);
				match(VAR_VARIABLE_VALUE);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
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
		enterRule(_localctx, 46, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(STYLE_OPEN);
			setState(241);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\5\2:\n\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\5\2C\n\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13"+
		"\2\3\3\3\3\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\6\5e\n\5\r\5\16\5f\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16"+
		"\5p\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\5\5\5|\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0082\n\5\3\6\3\6\3\6\3\6\5\6\u0088\n\6\3\6\5\6\u008b\n\6\3\7"+
		"\5\7\u008e\n\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u009b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3\b"+
		"\5\b\u00a9\n\b\5\b\u00ab\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\7\23\u00c2\n\23"+
		"\f\23\16\23\u00c5\13\23\3\23\3\23\7\23\u00c9\n\23\f\23\16\23\u00cc\13"+
		"\23\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3\13\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\5\26\u00dd\n\26\3\27\3\27\3\30\7\30\u00e2\n\30"+
		"\f\30\16\30\u00e5\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u00ec\n\30\f\30"+
		"\16\30\u00ef\13\30\3\30\3\30\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\b\t\4\2\t\t\16\16\3\2\3\4"+
		"\3\2\37 \2\u0102\2\65\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2\b\u0081\3\2\2\2\n"+
		"\u0087\3\2\2\2\f\u008d\3\2\2\2\16\u00aa\3\2\2\2\20\u00ac\3\2\2\2\22\u00ae"+
		"\3\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3"+
		"\2\2\2\34\u00b8\3\2\2\2\36\u00ba\3\2\2\2 \u00bc\3\2\2\2\"\u00be\3\2\2"+
		"\2$\u00c3\3\2\2\2&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00dc\3\2\2\2,\u00de"+
		"\3\2\2\2.\u00e3\3\2\2\2\60\u00f2\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28:\7"+
		"\5\2\298\3\2\2\29:\3\2\2\2:>\3\2\2\2;=\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2AC\7\7\2\2BA\3\2\2\2BC\3\2\2\2CG\3"+
		"\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3"+
		"\2\2\2JL\5\6\4\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OM"+
		"\3\2\2\2PQ\t\2\2\2Q\5\3\2\2\2RT\5*\26\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\\\5\b\5\2Y[\5*\26\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^\\\3\2\2\2_d\7\r\2\2`a\7-\2\2ab\7"+
		"/\2\2bc\7.\2\2ce\7\61\2\2d`\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3"+
		"\2\2\2h\u0082\7,\2\2ij\7\f\2\2jn\7\30\2\2km\5\16\b\2lk\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2o{\3\2\2\2pn\3\2\2\2qx\7\23\2\2rs\5\f\7\2st\7\f"+
		"\2\2tu\7\25\2\2uv\7\30\2\2vw\7\23\2\2wy\3\2\2\2xr\3\2\2\2xy\3\2\2\2y|"+
		"\3\2\2\2z|\7\24\2\2{q\3\2\2\2{z\3\2\2\2|\u0082\3\2\2\2}\u0082\7\b\2\2"+
		"~\u0082\5$\23\2\177\u0082\5.\30\2\u0080\u0082\5\60\31\2\u0081_\3\2\2\2"+
		"\u0081i\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\t\3\2\2\2\u0083\u0088\5\b\5\2\u0084\u0088\7\6\2\2"+
		"\u0085\u0088\5,\27\2\u0086\u0088\5\16\b\2\u0087\u0083\3\2\2\2\u0087\u0084"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u008b\5(\25\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2"+
		"\2\u008c\u008e\5(\25\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092"+
		"\3\2\2\2\u008f\u0091\5\n\6\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0095\u0096\7\32\2\2\u0096\u00ab\5\20\t\2\u0097\u009a\7\30\2\2\u0098"+
		"\u0099\7\32\2\2\u0099\u009b\5\20\t\2\u009a\u0098\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u00ab\3\2\2\2\u009c\u009d\7-\2\2\u009d\u00ab\7/\2\2\u009e"+
		"\u009f\7.\2\2\u009f\u00ab\7\61\2\2\u00a0\u00a3\7\30\2\2\u00a1\u00a2\7"+
		">\2\2\u00a2\u00a4\7?\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00ab\3\2\2\2\u00a5\u00a8\7\30\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a9\7"+
		"!\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u0095\3\2\2\2\u00aa\u0097\3\2\2\2\u00aa\u009c\3\2\2\2\u00aa\u009e\3\2"+
		"\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a5\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00ad"+
		"\7(\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7\20\2\2\u00af\23\3\2\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7A\2\2\u00b3\27\3\2\2\2\u00b4\u00b5"+
		"\7B\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7C\2\2\u00b7\33\3\2\2\2\u00b8\u00b9"+
		"\7D\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\37\3\2\2\2\u00bc\u00bd"+
		"\7\22\2\2\u00bd!\3\2\2\2\u00be\u00bf\7)\2\2\u00bf#\3\2\2\2\u00c0\u00c2"+
		"\7\t\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\7\17"+
		"\2\2\u00c7\u00c9\7\t\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00d1\5&\24\2\u00ce\u00d0\7\t\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7<\2\2\u00d5%\3\2\2\2\u00d6\u00d7"+
		"\7=\2\2\u00d7\'\3\2\2\2\u00d8\u00d9\t\3\2\2\u00d9)\3\2\2\2\u00da\u00dd"+
		"\5,\27\2\u00db\u00dd\7\t\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"+\3\2\2\2\u00de\u00df\t\4\2\2\u00df-\3\2\2\2\u00e0\u00e2\7\t\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ed\7\n\2\2\u00e7"+
		"\u00e8\7\35\2\2\u00e8\u00e9\7\63\2\2\u00e9\u00ea\7\64\2\2\u00ea\u00ec"+
		"\7\65\2\2\u00eb\u00e7\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1"+
		"\7\36\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\t\5\2\2\u00f4"+
		"\61\3\2\2\2\35\659>BGMU\\fnx{\u0081\u0087\u008a\u008d\u0092\u009a\u00a3"+
		"\u00a8\u00aa\u00c3\u00ca\u00d1\u00dc\u00e3\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
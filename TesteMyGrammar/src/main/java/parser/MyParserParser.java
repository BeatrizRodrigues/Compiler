package parser;// Generated from MyParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, SCAN=2, FUNC=3, IF=4, ELSE=5, FOR=6, WHILE=7, BOOL=8, TYPE=9, 
		MATH=10, FLOOR=11, CEIL=12, SQRT=13, POT=14, FMAX=15, FMIN=16, RINT=17, 
		PONT=18, OPEN=19, CLOSE=20, OPENB=21, CLOSEB=22, SUM=23, SUB=24, MULT=25, 
		DIV=26, MOD=27, COMA=28, EOL=29, EQUAL=30, DEQUAL=31, DSUM=32, DSUB=33, 
		BIGGER=34, SMALLER=35, BEQUAL=36, SMEQUAL=37, NEQUAL=38, AND=39, OR=40, 
		STR=41, NUM=42, VAR=43, COMMENT=44, LINE_COMMENT=45, WS=46;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_code = 2, RULE_element = 3, RULE_output = 4, 
		RULE_show = 5, RULE_follow = 6, RULE_equals = 7, RULE_cont = 8, RULE_expr = 9, 
		RULE_rest = 10, RULE_fact = 11, RULE_more = 12, RULE_term = 13, RULE_uif = 14, 
		RULE_condition = 15, RULE_comp = 16, RULE_other = 17, RULE_uelse = 18, 
		RULE_uwhile = 19, RULE_ufor = 20, RULE_decl = 21, RULE_incr = 22, RULE_function = 23, 
		RULE_par = 24, RULE_cfunction = 25, RULE_cpar = 26, RULE_input = 27, RULE_umath = 28, 
		RULE_mathpar = 29, RULE_floor = 30, RULE_ceil = 31, RULE_sqrt = 32, RULE_pot = 33, 
		RULE_fmax = 34, RULE_fmin = 35, RULE_rint = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "code", "element", "output", "show", "follow", "equals", 
			"cont", "expr", "rest", "fact", "more", "term", "uif", "condition", "comp", 
			"other", "uelse", "uwhile", "ufor", "decl", "incr", "function", "par", 
			"cfunction", "cpar", "input", "umath", "mathpar", "floor", "ceil", "sqrt", 
			"pot", "fmax", "fmin", "rint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'scan'", "'func'", "'if'", "'else'", "'for'", "'while'", 
			null, null, "'math'", "'floor'", "'ceil'", "'sqrt'", "'pot'", "'fmax'", 
			"'fmin'", "'rint'", "'.'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "','", "';'", "'='", "'=='", "'+='", "'-='", "'>'", 
			"'<'", "'>='", "'<='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "SCAN", "FUNC", "IF", "ELSE", "FOR", "WHILE", "BOOL", 
			"TYPE", "MATH", "FLOOR", "CEIL", "SQRT", "POT", "FMAX", "FMIN", "RINT", 
			"PONT", "OPEN", "CLOSE", "OPENB", "CLOSEB", "SUM", "SUB", "MULT", "DIV", 
			"MOD", "COMA", "EOL", "EQUAL", "DEQUAL", "DSUM", "DSUB", "BIGGER", "SMALLER", 
			"BEQUAL", "SMEQUAL", "NEQUAL", "AND", "OR", "STR", "NUM", "VAR", "COMMENT", 
			"LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			code();
			setState(75);
			match(EOL);
			setState(76);
			line();
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

	public static class LineContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyParserParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case IF:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				prog();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(EOF);
				}
				break;
			case CLOSEB:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class CodeContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public UifContext uif() {
			return getRuleContext(UifContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				element();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				output();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				uif();
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyParserParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(TYPE);
			setState(89);
			match(VAR);
			setState(90);
			equals();
			setState(91);
			expr();
			setState(92);
			cont();
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MyParserParser.PRINT, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PRINT);
			setState(95);
			match(OPEN);
			setState(96);
			show();
			setState(97);
			match(CLOSE);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
		public FollowContext follow() {
			return getRuleContext(FollowContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_show);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(STR);
				setState(100);
				follow();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(VAR);
				setState(102);
				follow();
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

	public static class FollowContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MyParserParser.SUM, 0); }
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
		public FollowContext follow() {
			return getRuleContext(FollowContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public FollowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_follow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFollow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFollow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFollow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FollowContext follow() throws RecognitionException {
		FollowContext _localctx = new FollowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_follow);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(SUM);
				setState(106);
				match(STR);
				setState(107);
				follow();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(SUM);
				setState(109);
				match(VAR);
				setState(110);
				follow();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MyParserParser.EQUAL, 0); }
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_equals);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(EQUAL);
				}
				break;
			case SCAN:
			case FUNC:
			case BOOL:
			case MATH:
			case OPEN:
			case CLOSEB:
			case COMA:
			case EOL:
			case STR:
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ContContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(MyParserParser.COMA, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ContContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContContext cont() throws RecognitionException {
		ContContext _localctx = new ContContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cont);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(COMA);
				setState(119);
				element();
				}
				break;
			case CLOSEB:
			case EOL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAN:
			case FUNC:
			case BOOL:
			case MATH:
			case OPEN:
			case STR:
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				fact();
				setState(124);
				rest();
				}
				break;
			case CLOSE:
			case CLOSEB:
			case COMA:
			case EOL:
			case DEQUAL:
			case BIGGER:
			case SMALLER:
			case BEQUAL:
			case SMEQUAL:
			case NEQUAL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RestContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MyParserParser.SUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(MyParserParser.SUB, 0); }
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rest);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(SUM);
				setState(130);
				expr();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(SUB);
				setState(132);
				expr();
				}
				break;
			case CLOSE:
			case CLOSEB:
			case COMA:
			case EOL:
			case DEQUAL:
			case BIGGER:
			case SMALLER:
			case BEQUAL:
			case SMEQUAL:
			case NEQUAL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FactContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			term();
			setState(137);
			more();
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

	public static class MoreContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(MyParserParser.MULT, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode DIV() { return getToken(MyParserParser.DIV, 0); }
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_more);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(MULT);
				setState(140);
				fact();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(DIV);
				setState(142);
				fact();
				}
				break;
			case CLOSE:
			case CLOSEB:
			case SUM:
			case SUB:
			case COMA:
			case EOL:
			case DEQUAL:
			case BIGGER:
			case SMALLER:
			case BEQUAL:
			case SMEQUAL:
			case NEQUAL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public TerminalNode NUM() { return getToken(MyParserParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(MyParserParser.BOOL, 0); }
		public CfunctionContext cfunction() {
			return getRuleContext(CfunctionContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public UmathContext umath() {
			return getRuleContext(UmathContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(OPEN);
				setState(147);
				expr();
				setState(148);
				match(CLOSE);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(NUM);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(VAR);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(BOOL);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				cfunction();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				input();
				}
				break;
			case MATH:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				umath();
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

	public static class UifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyParserParser.IF, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public TerminalNode OPENB() { return getToken(MyParserParser.OPENB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(MyParserParser.CLOSEB, 0); }
		public UifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitUif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UifContext uif() throws RecognitionException {
		UifContext _localctx = new UifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_uif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(IF);
			setState(160);
			match(OPEN);
			setState(161);
			condition();
			setState(162);
			match(CLOSE);
			setState(163);
			match(OPENB);
			setState(164);
			prog();
			setState(165);
			match(CLOSEB);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expr();
			setState(168);
			comp();
			setState(169);
			expr();
			setState(170);
			other();
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode DEQUAL() { return getToken(MyParserParser.DEQUAL, 0); }
		public TerminalNode BIGGER() { return getToken(MyParserParser.BIGGER, 0); }
		public TerminalNode SMALLER() { return getToken(MyParserParser.SMALLER, 0); }
		public TerminalNode BEQUAL() { return getToken(MyParserParser.BEQUAL, 0); }
		public TerminalNode SMEQUAL() { return getToken(MyParserParser.SMEQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(MyParserParser.NEQUAL, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEQUAL) | (1L << BIGGER) | (1L << SMALLER) | (1L << BEQUAL) | (1L << SMEQUAL) | (1L << NEQUAL))) != 0)) ) {
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

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MyParserParser.AND, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OR() { return getToken(MyParserParser.OR, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_other);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(AND);
				setState(175);
				condition();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(OR);
				setState(177);
				condition();
				}
				break;
			case CLOSE:
			case EOL:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class UelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MyParserParser.ELSE, 0); }
		public TerminalNode OPENB() { return getToken(MyParserParser.OPENB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(MyParserParser.CLOSEB, 0); }
		public UelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitUelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UelseContext uelse() throws RecognitionException {
		UelseContext _localctx = new UelseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_uelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ELSE);
			setState(182);
			match(OPENB);
			setState(183);
			prog();
			setState(184);
			match(CLOSEB);
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

	public static class UwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyParserParser.WHILE, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public TerminalNode OPENB() { return getToken(MyParserParser.OPENB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(MyParserParser.CLOSEB, 0); }
		public UwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitUwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UwhileContext uwhile() throws RecognitionException {
		UwhileContext _localctx = new UwhileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_uwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			match(OPEN);
			setState(188);
			condition();
			setState(189);
			match(CLOSE);
			setState(190);
			match(OPENB);
			setState(191);
			prog();
			setState(192);
			match(CLOSEB);
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

	public static class UforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyParserParser.FOR, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(MyParserParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MyParserParser.EOL, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public IncrContext incr() {
			return getRuleContext(IncrContext.class,0);
		}
		public UforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ufor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitUfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UforContext ufor() throws RecognitionException {
		UforContext _localctx = new UforContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ufor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FOR);
			setState(195);
			match(OPEN);
			setState(196);
			decl();
			setState(197);
			match(EOL);
			setState(198);
			condition();
			setState(199);
			match(EOL);
			setState(200);
			match(VAR);
			setState(201);
			incr();
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyParserParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(MyParserParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TYPE);
			setState(204);
			match(VAR);
			setState(205);
			match(EQUAL);
			setState(206);
			expr();
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

	public static class IncrContext extends ParserRuleContext {
		public TerminalNode DSUM() { return getToken(MyParserParser.DSUM, 0); }
		public TerminalNode DSUB() { return getToken(MyParserParser.DSUB, 0); }
		public IncrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitIncr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrContext incr() throws RecognitionException {
		IncrContext _localctx = new IncrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_incr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==DSUM || _la==DSUB) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyParserParser.TYPE, 0); }
		public TerminalNode FUNC() { return getToken(MyParserParser.FUNC, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public TerminalNode OPENB() { return getToken(MyParserParser.OPENB, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(MyParserParser.CLOSEB, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TYPE);
			setState(211);
			match(FUNC);
			setState(212);
			match(OPEN);
			setState(213);
			par();
			setState(214);
			match(CLOSE);
			setState(215);
			match(OPENB);
			setState(216);
			code();
			setState(217);
			match(CLOSEB);
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

	public static class ParContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyParserParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public TerminalNode COMA() { return getToken(MyParserParser.COMA, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_par);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(TYPE);
				setState(220);
				match(VAR);
				setState(221);
				match(COMA);
				setState(222);
				par();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(TYPE);
				setState(224);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class CfunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MyParserParser.FUNC, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public CparContext cpar() {
			return getRuleContext(CparContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public CfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitCfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CfunctionContext cfunction() throws RecognitionException {
		CfunctionContext _localctx = new CfunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(FUNC);
			setState(229);
			match(OPEN);
			setState(230);
			cpar();
			setState(231);
			match(CLOSE);
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

	public static class CparContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public TerminalNode COMA() { return getToken(MyParserParser.COMA, 0); }
		public CparContext cpar() {
			return getRuleContext(CparContext.class,0);
		}
		public CparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitCpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparContext cpar() throws RecognitionException {
		CparContext _localctx = new CparContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cpar);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(VAR);
				setState(234);
				match(COMA);
				setState(235);
				cpar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(VAR);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(MyParserParser.SCAN, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode TYPE() { return getToken(MyParserParser.TYPE, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(SCAN);
			setState(240);
			match(OPEN);
			setState(241);
			match(TYPE);
			setState(242);
			match(CLOSE);
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

	public static class UmathContext extends ParserRuleContext {
		public TerminalNode MATH() { return getToken(MyParserParser.MATH, 0); }
		public TerminalNode PONT() { return getToken(MyParserParser.PONT, 0); }
		public MathparContext mathpar() {
			return getRuleContext(MathparContext.class,0);
		}
		public UmathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_umath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUmath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUmath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitUmath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UmathContext umath() throws RecognitionException {
		UmathContext _localctx = new UmathContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_umath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(MATH);
			setState(245);
			match(PONT);
			setState(246);
			mathpar();
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

	public static class MathparContext extends ParserRuleContext {
		public FloorContext floor() {
			return getRuleContext(FloorContext.class,0);
		}
		public CeilContext ceil() {
			return getRuleContext(CeilContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public PotContext pot() {
			return getRuleContext(PotContext.class,0);
		}
		public FmaxContext fmax() {
			return getRuleContext(FmaxContext.class,0);
		}
		public FminContext fmin() {
			return getRuleContext(FminContext.class,0);
		}
		public RintContext rint() {
			return getRuleContext(RintContext.class,0);
		}
		public MathparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMathpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMathpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitMathpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathparContext mathpar() throws RecognitionException {
		MathparContext _localctx = new MathparContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mathpar);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				floor();
				}
				break;
			case CEIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				ceil();
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				sqrt();
				}
				break;
			case POT:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				pot();
				}
				break;
			case FMAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				fmax();
				}
				break;
			case FMIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				fmin();
				}
				break;
			case RINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				rint();
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

	public static class FloorContext extends ParserRuleContext {
		public TerminalNode FLOOR() { return getToken(MyParserParser.FLOOR, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public FloorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFloor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFloor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloorContext floor() throws RecognitionException {
		FloorContext _localctx = new FloorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_floor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(FLOOR);
			setState(258);
			match(OPEN);
			setState(259);
			match(CLOSE);
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

	public static class CeilContext extends ParserRuleContext {
		public TerminalNode CEIL() { return getToken(MyParserParser.CEIL, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public CeilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ceil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCeil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCeil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitCeil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CeilContext ceil() throws RecognitionException {
		CeilContext _localctx = new CeilContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ceil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(CEIL);
			setState(262);
			match(OPEN);
			setState(263);
			match(CLOSE);
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

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(MyParserParser.SQRT, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(SQRT);
			setState(266);
			match(OPEN);
			setState(267);
			match(CLOSE);
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

	public static class PotContext extends ParserRuleContext {
		public TerminalNode POT() { return getToken(MyParserParser.POT, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public List<TerminalNode> NUM() { return getTokens(MyParserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyParserParser.NUM, i);
		}
		public TerminalNode COMA() { return getToken(MyParserParser.COMA, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public PotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitPot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotContext pot() throws RecognitionException {
		PotContext _localctx = new PotContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(POT);
			setState(270);
			match(OPEN);
			setState(271);
			match(NUM);
			setState(272);
			match(COMA);
			setState(273);
			match(NUM);
			setState(274);
			match(CLOSE);
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

	public static class FmaxContext extends ParserRuleContext {
		public TerminalNode FMAX() { return getToken(MyParserParser.FMAX, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public List<TerminalNode> NUM() { return getTokens(MyParserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyParserParser.NUM, i);
		}
		public TerminalNode COMA() { return getToken(MyParserParser.COMA, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public FmaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fmax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFmax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFmax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFmax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FmaxContext fmax() throws RecognitionException {
		FmaxContext _localctx = new FmaxContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fmax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(FMAX);
			setState(277);
			match(OPEN);
			setState(278);
			match(NUM);
			setState(279);
			match(COMA);
			setState(280);
			match(NUM);
			setState(281);
			match(CLOSE);
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

	public static class FminContext extends ParserRuleContext {
		public TerminalNode FMIN() { return getToken(MyParserParser.FMIN, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public List<TerminalNode> NUM() { return getTokens(MyParserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyParserParser.NUM, i);
		}
		public TerminalNode COMA() { return getToken(MyParserParser.COMA, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public FminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fmin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFmin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFmin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFmin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FminContext fmin() throws RecognitionException {
		FminContext _localctx = new FminContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fmin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(FMIN);
			setState(284);
			match(OPEN);
			setState(285);
			match(NUM);
			setState(286);
			match(COMA);
			setState(287);
			match(NUM);
			setState(288);
			match(CLOSE);
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

	public static class RintContext extends ParserRuleContext {
		public TerminalNode RINT() { return getToken(MyParserParser.RINT, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public RintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterRint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitRint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitRint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RintContext rint() throws RecognitionException {
		RintContext _localctx = new RintContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(RINT);
			setState(291);
			match(OPEN);
			setState(292);
			match(CLOSE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3T\n"+
		"\3\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\t\3\t\5"+
		"\tw\n\t\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\5\13\u0082\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0093\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00a0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b6\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00e5\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00f0"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0102\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJ\2\4\4\2!!$(\3\2\"#\2\u0123\2L\3\2\2\2\4S\3\2\2\2\6X\3"+
		"\2\2\2\bZ\3\2\2\2\n`\3\2\2\2\fi\3\2\2\2\16r\3\2\2\2\20v\3\2\2\2\22{\3"+
		"\2\2\2\24\u0081\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u0092\3\2"+
		"\2\2\34\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a9\3\2\2\2\"\u00ae\3\2\2\2"+
		"$\u00b5\3\2\2\2&\u00b7\3\2\2\2(\u00bc\3\2\2\2*\u00c4\3\2\2\2,\u00cd\3"+
		"\2\2\2.\u00d2\3\2\2\2\60\u00d4\3\2\2\2\62\u00e4\3\2\2\2\64\u00e6\3\2\2"+
		"\2\66\u00ef\3\2\2\28\u00f1\3\2\2\2:\u00f6\3\2\2\2<\u0101\3\2\2\2>\u0103"+
		"\3\2\2\2@\u0107\3\2\2\2B\u010b\3\2\2\2D\u010f\3\2\2\2F\u0116\3\2\2\2H"+
		"\u011d\3\2\2\2J\u0124\3\2\2\2LM\5\6\4\2MN\7\37\2\2NO\5\4\3\2O\3\3\2\2"+
		"\2PT\5\2\2\2QT\7\2\2\3RT\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\5\3\2"+
		"\2\2UY\5\b\5\2VY\5\n\6\2WY\5\36\20\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\7"+
		"\3\2\2\2Z[\7\13\2\2[\\\7-\2\2\\]\5\20\t\2]^\5\24\13\2^_\5\22\n\2_\t\3"+
		"\2\2\2`a\7\3\2\2ab\7\25\2\2bc\5\f\7\2cd\7\26\2\2d\13\3\2\2\2ef\7+\2\2"+
		"fj\5\16\b\2gh\7-\2\2hj\5\16\b\2ie\3\2\2\2ig\3\2\2\2j\r\3\2\2\2kl\7\31"+
		"\2\2lm\7+\2\2ms\5\16\b\2no\7\31\2\2op\7-\2\2ps\5\16\b\2qs\3\2\2\2rk\3"+
		"\2\2\2rn\3\2\2\2rq\3\2\2\2s\17\3\2\2\2tw\7 \2\2uw\3\2\2\2vt\3\2\2\2vu"+
		"\3\2\2\2w\21\3\2\2\2xy\7\36\2\2y|\5\b\5\2z|\3\2\2\2{x\3\2\2\2{z\3\2\2"+
		"\2|\23\3\2\2\2}~\5\30\r\2~\177\5\26\f\2\177\u0082\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082\25\3\2\2\2\u0083\u0084"+
		"\7\31\2\2\u0084\u0089\5\24\13\2\u0085\u0086\7\32\2\2\u0086\u0089\5\24"+
		"\13\2\u0087\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b\5\34\17\2\u008b\u008c\5\32"+
		"\16\2\u008c\31\3\2\2\2\u008d\u008e\7\33\2\2\u008e\u0093\5\30\r\2\u008f"+
		"\u0090\7\34\2\2\u0090\u0093\5\30\r\2\u0091\u0093\3\2\2\2\u0092\u008d\3"+
		"\2\2\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093\33\3\2\2\2\u0094"+
		"\u0095\7\25\2\2\u0095\u0096\5\24\13\2\u0096\u0097\7\26\2\2\u0097\u00a0"+
		"\3\2\2\2\u0098\u00a0\7,\2\2\u0099\u00a0\7-\2\2\u009a\u00a0\7+\2\2\u009b"+
		"\u00a0\7\n\2\2\u009c\u00a0\5\64\33\2\u009d\u00a0\58\35\2\u009e\u00a0\5"+
		":\36\2\u009f\u0094\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f"+
		"\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3"+
		"\7\25\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\7\27\2"+
		"\2\u00a6\u00a7\5\2\2\2\u00a7\u00a8\7\30\2\2\u00a8\37\3\2\2\2\u00a9\u00aa"+
		"\5\24\13\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\5$\23"+
		"\2\u00ad!\3\2\2\2\u00ae\u00af\t\2\2\2\u00af#\3\2\2\2\u00b0\u00b1\7)\2"+
		"\2\u00b1\u00b6\5 \21\2\u00b2\u00b3\7*\2\2\u00b3\u00b6\5 \21\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"%\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5\2\2\2"+
		"\u00ba\u00bb\7\30\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be"+
		"\7\25\2\2\u00be\u00bf\5 \21\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\7\27\2"+
		"\2\u00c1\u00c2\5\2\2\2\u00c2\u00c3\7\30\2\2\u00c3)\3\2\2\2\u00c4\u00c5"+
		"\7\b\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\5,\27\2\u00c7\u00c8\7\37\2\2"+
		"\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc"+
		"\5.\30\2\u00cc+\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf\7-\2\2\u00cf"+
		"\u00d0\7 \2\2\u00d0\u00d1\5\24\13\2\u00d1-\3\2\2\2\u00d2\u00d3\t\3\2\2"+
		"\u00d3/\3\2\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\7"+
		"\25\2\2\u00d7\u00d8\5\62\32\2\u00d8\u00d9\7\26\2\2\u00d9\u00da\7\27\2"+
		"\2\u00da\u00db\5\6\4\2\u00db\u00dc\7\30\2\2\u00dc\61\3\2\2\2\u00dd\u00de"+
		"\7\13\2\2\u00de\u00df\7-\2\2\u00df\u00e0\7\36\2\2\u00e0\u00e5\5\62\32"+
		"\2\u00e1\u00e2\7\13\2\2\u00e2\u00e5\7-\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00dd"+
		"\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\63\3\2\2\2\u00e6"+
		"\u00e7\7\5\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea"+
		"\7\26\2\2\u00ea\65\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\7\36\2\2\u00ed"+
		"\u00f0\5\66\34\2\u00ee\u00f0\7-\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ee\3"+
		"\2\2\2\u00f0\67\3\2\2\2\u00f1\u00f2\7\4\2\2\u00f2\u00f3\7\25\2\2\u00f3"+
		"\u00f4\7\13\2\2\u00f4\u00f5\7\26\2\2\u00f59\3\2\2\2\u00f6\u00f7\7\f\2"+
		"\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\5<\37\2\u00f9;\3\2\2\2\u00fa\u0102"+
		"\5> \2\u00fb\u0102\5@!\2\u00fc\u0102\5B\"\2\u00fd\u0102\5D#\2\u00fe\u0102"+
		"\5F$\2\u00ff\u0102\5H%\2\u0100\u0102\5J&\2\u0101\u00fa\3\2\2\2\u0101\u00fb"+
		"\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102=\3\2\2\2\u0103\u0104\7\r\2\2"+
		"\u0104\u0105\7\25\2\2\u0105\u0106\7\26\2\2\u0106?\3\2\2\2\u0107\u0108"+
		"\7\16\2\2\u0108\u0109\7\25\2\2\u0109\u010a\7\26\2\2\u010aA\3\2\2\2\u010b"+
		"\u010c\7\17\2\2\u010c\u010d\7\25\2\2\u010d\u010e\7\26\2\2\u010eC\3\2\2"+
		"\2\u010f\u0110\7\20\2\2\u0110\u0111\7\25\2\2\u0111\u0112\7,\2\2\u0112"+
		"\u0113\7\36\2\2\u0113\u0114\7,\2\2\u0114\u0115\7\26\2\2\u0115E\3\2\2\2"+
		"\u0116\u0117\7\21\2\2\u0117\u0118\7\25\2\2\u0118\u0119\7,\2\2\u0119\u011a"+
		"\7\36\2\2\u011a\u011b\7,\2\2\u011b\u011c\7\26\2\2\u011cG\3\2\2\2\u011d"+
		"\u011e\7\22\2\2\u011e\u011f\7\25\2\2\u011f\u0120\7,\2\2\u0120\u0121\7"+
		"\36\2\2\u0121\u0122\7,\2\2\u0122\u0123\7\26\2\2\u0123I\3\2\2\2\u0124\u0125"+
		"\7\23\2\2\u0125\u0126\7\25\2\2\u0126\u0127\7\26\2\2\u0127K\3\2\2\2\20"+
		"SXirv{\u0081\u0088\u0092\u009f\u00b5\u00e4\u00ef\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
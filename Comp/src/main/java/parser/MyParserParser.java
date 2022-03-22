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
		T__0=1, RUN=2, PRINT=3, SCAN=4, IF=5, ELSE=6, FOR=7, WHILE=8, INSERT=9, 
		GLB=10, RETURN=11, TRUE=12, FALSE=13, TYPE=14, OPEN=15, CLOSE=16, OPENB=17, 
		CLOSEB=18, SUM=19, SUB=20, MULT=21, DIV=22, MOD=23, COMA=24, EOL=25, EQUAL=26, 
		DEQUAL=27, DSUM=28, DSUB=29, BIGGER=30, SMALLER=31, BEQUAL=32, SMEQUAL=33, 
		NEQUAL=34, AND=35, OR=36, STR=37, NUM=38, ID=39, COMMENT=40, LINE_COMMENT=41, 
		WS=42;
	public static final int
		RULE_prog = 0, RULE_insert = 1, RULE_global = 2, RULE_run = 3, RULE_block = 4, 
		RULE_line = 5, RULE_var = 6, RULE_atr = 7, RULE_output = 8, RULE_outprint = 9, 
		RULE_expr = 10, RULE_fact = 11, RULE_term = 12, RULE_uif = 13, RULE_condition = 14, 
		RULE_comp = 15, RULE_uwhile = 16, RULE_ufor = 17, RULE_incr = 18, RULE_function = 19, 
		RULE_par = 20, RULE_cfunction = 21, RULE_cpar = 22, RULE_rtrn = 23, RULE_input = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "insert", "global", "run", "block", "line", "var", "atr", "output", 
			"outprint", "expr", "fact", "term", "uif", "condition", "comp", "uwhile", 
			"ufor", "incr", "function", "par", "cfunction", "cpar", "rtrn", "input"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'main'", "'print'", "'scan'", "'if'", "'else'", "'for'", 
			"'while'", "'insert'", "'global'", "'return'", "'true'", "'false'", null, 
			"'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "','", 
			"';'", "'='", "'=='", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'!='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "RUN", "PRINT", "SCAN", "IF", "ELSE", "FOR", "WHILE", "INSERT", 
			"GLB", "RETURN", "TRUE", "FALSE", "TYPE", "OPEN", "CLOSE", "OPENB", "CLOSEB", 
			"SUM", "SUB", "MULT", "DIV", "MOD", "COMA", "EOL", "EQUAL", "DEQUAL", 
			"DSUM", "DSUB", "BIGGER", "SMALLER", "BEQUAL", "SMEQUAL", "NEQUAL", "AND", 
			"OR", "STR", "NUM", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(50);
				insert();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLB) {
				{
				setState(53);
				global();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(56);
				function();
				}
			}

			setState(59);
			run();
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

	public static class InsertContext extends ParserRuleContext {
		public List<TerminalNode> INSERT() { return getTokens(MyParserParser.INSERT); }
		public TerminalNode INSERT(int i) {
			return getToken(MyParserParser.INSERT, i);
		}
		public List<TerminalNode> STR() { return getTokens(MyParserParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(MyParserParser.STR, i);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(INSERT);
				setState(62);
				match(STR);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INSERT );
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLB() { return getToken(MyParserParser.GLB, 0); }
		public TerminalNode OPENB() { return getToken(MyParserParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(MyParserParser.CLOSEB, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(GLB);
			setState(68);
			match(OPENB);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				var();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(74);
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

	public static class RunContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(MyParserParser.RUN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_run);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(RUN);
			setState(77);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPENB() { return getToken(MyParserParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(MyParserParser.CLOSEB, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(OPENB);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				line();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << TYPE) | (1L << OPEN) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0) );
			setState(85);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineatrContext extends LineContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public LineatrContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLineatr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLineatr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLineatr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineoutContext extends LineContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public LineoutContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLineout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLineout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLineout(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinewhileContext extends LineContext {
		public UwhileContext uwhile() {
			return getRuleContext(UwhileContext.class,0);
		}
		public LinewhileContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLinewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLinewhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLinewhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DelcContext extends LineContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DelcContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDelc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDelc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitDelc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineretContext extends LineContext {
		public RtrnContext rtrn() {
			return getRuleContext(RtrnContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public LineretContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLineret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLineret(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLineret(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineifContext extends LineContext {
		public UifContext uif() {
			return getRuleContext(UifContext.class,0);
		}
		public LineifContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLineif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLineif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLineif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinecfuncContext extends LineContext {
		public CfunctionContext cfunction() {
			return getRuleContext(CfunctionContext.class,0);
		}
		public LinecfuncContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLinecfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLinecfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLinecfunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineexprContext extends LineContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public LineexprContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLineexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLineexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLineexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineinpContext extends LineContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public LineinpContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLineinp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLineinp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLineinp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineforContext extends LineContext {
		public UforContext ufor() {
			return getRuleContext(UforContext.class,0);
		}
		public LineforContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLinefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLinefor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitLinefor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DelcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				var();
				}
				break;
			case 2:
				_localctx = new LineatrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				atr();
				setState(89);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new LineinpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				input();
				setState(92);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new LineoutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				output();
				setState(95);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new LineexprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				expr();
				setState(98);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new LineifContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				uif();
				}
				break;
			case 7:
				_localctx = new LinewhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				uwhile();
				}
				break;
			case 8:
				_localctx = new LineforContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				ufor();
				}
				break;
			case 9:
				_localctx = new LineretContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				rtrn();
				setState(104);
				match(EOL);
				}
				break;
			case 10:
				_localctx = new LinecfuncContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				cfunction();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyParserParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(MyParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyParserParser.ID, i);
		}
		public TerminalNode EOL() { return getToken(MyParserParser.EOL, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(MyParserParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(MyParserParser.EQUAL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MyParserParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParserParser.COMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(TYPE);
			setState(110);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(111);
				match(EQUAL);
				setState(112);
				expr();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(115);
				match(COMA);
				setState(116);
				match(ID);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(117);
					match(EQUAL);
					setState(118);
					expr();
					}
				}

				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(EOL);
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

	public static class AtrContext extends ParserRuleContext {
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	 
		public AtrContext() { }
		public void copyFrom(AtrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtrexprContext extends AtrContext {
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MyParserParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrexprContext(AtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAtrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAtrexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitAtrexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtrstrContext extends AtrContext {
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MyParserParser.EQUAL, 0); }
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
		public AtrstrContext(AtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAtrstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAtrstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitAtrstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atr);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AtrexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(ID);
				setState(129);
				match(EQUAL);
				setState(130);
				expr();
				}
				break;
			case 2:
				_localctx = new AtrstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(ID);
				setState(132);
				match(EQUAL);
				setState(133);
				match(STR);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MyParserParser.PRINT, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public OutprintContext outprint() {
			return getRuleContext(OutprintContext.class,0);
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
		enterRule(_localctx, 16, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PRINT);
			setState(137);
			match(OPEN);
			setState(138);
			outprint();
			setState(139);
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

	public static class OutprintContext extends ParserRuleContext {
		public OutprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outprint; }
	 
		public OutprintContext() { }
		public void copyFrom(OutprintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintidContext extends OutprintContext {
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public PrintidContext(OutprintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrintid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrintid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitPrintid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintexprContext extends OutprintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintexprContext(OutprintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrintexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrintexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitPrintexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintstrContext extends OutprintContext {
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
		public PrintstrContext(OutprintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrintstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrintstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitPrintstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutprintContext outprint() throws RecognitionException {
		OutprintContext _localctx = new OutprintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_outprint);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrintstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(STR);
				}
				break;
			case 2:
				_localctx = new PrintidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(ID);
				}
				break;
			case 3:
				_localctx = new PrintexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprsubContext extends ExprContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode SUB() { return getToken(MyParserParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitExprsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprfactContext extends ExprContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprfactContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprfact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprfact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitExprfact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprsumContext extends ExprContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode SUM() { return getToken(MyParserParser.SUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprsum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprsum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitExprsum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ExprsumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				fact();
				setState(147);
				match(SUM);
				setState(148);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprsubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				fact();
				setState(151);
				match(SUB);
				setState(152);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprfactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				fact();
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

	public static class FactContext extends ParserRuleContext {
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FacttermContext extends FactContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FacttermContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFactterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFactterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFactterm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactmultContext extends FactContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULT() { return getToken(MyParserParser.MULT, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FactmultContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFactmult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFactmult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFactmult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactmodContext extends FactContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MOD() { return getToken(MyParserParser.MOD, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FactmodContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFactmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFactmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFactmod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactdivContext extends FactContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(MyParserParser.DIV, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FactdivContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFactdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFactdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitFactdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fact);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FactmultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				term();
				setState(158);
				match(MULT);
				setState(159);
				fact();
				}
				break;
			case 2:
				_localctx = new FactdivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				term();
				setState(162);
				match(DIV);
				setState(163);
				fact();
				}
				break;
			case 3:
				_localctx = new FactmodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				term();
				setState(166);
				match(MOD);
				setState(167);
				fact();
				}
				break;
			case 4:
				_localctx = new FacttermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermparexprContext extends TermContext {
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public TermparexprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTermparexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTermparexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitTermparexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermidContext extends TermContext {
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TermidContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTermid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTermid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitTermid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermstrContext extends TermContext {
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
		public TermstrContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTermstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTermstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitTermstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermnumContext extends TermContext {
		public TerminalNode NUM() { return getToken(MyParserParser.NUM, 0); }
		public TermnumContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTermnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTermnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitTermnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				_localctx = new TermparexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(OPEN);
				setState(173);
				expr();
				setState(174);
				match(CLOSE);
				}
				break;
			case NUM:
				_localctx = new TermnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new TermidContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(ID);
				}
				break;
			case STR:
				_localctx = new TermstrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(STR);
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
		public UifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uif; }
	 
		public UifContext() { }
		public void copyFrom(UifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IflineContext extends UifContext {
		public TerminalNode IF() { return getToken(MyParserParser.IF, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IflineContext(UifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitIfline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IflineelseContext extends UifContext {
		public TerminalNode IF() { return getToken(MyParserParser.IF, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyParserParser.ELSE, 0); }
		public IflineelseContext(UifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIflineelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIflineelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitIflineelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UifContext uif() throws RecognitionException {
		UifContext _localctx = new UifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_uif);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IflineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(IF);
				setState(182);
				match(OPEN);
				setState(183);
				condition();
				setState(184);
				match(CLOSE);
				setState(185);
				block();
				}
				break;
			case 2:
				_localctx = new IflineelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(IF);
				setState(188);
				match(OPEN);
				setState(189);
				condition();
				setState(190);
				match(CLOSE);
				setState(191);
				block();
				setState(192);
				match(ELSE);
				setState(193);
				block();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValtrueContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(MyParserParser.TRUE, 0); }
		public ValtrueContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterValtrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitValtrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitValtrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolexprContext extends ConditionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public BoolexprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValfalseContext extends ConditionContext {
		public TerminalNode FALSE() { return getToken(MyParserParser.FALSE, 0); }
		public ValfalseContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterValfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitValfalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitValfalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new ValtrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new ValfalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(FALSE);
				}
				break;
			case OPEN:
			case STR:
			case NUM:
			case ID:
				_localctx = new BoolexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				term();
				setState(200);
				comp();
				setState(201);
				term();
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
		enterRule(_localctx, 30, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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

	public static class UwhileContext extends ParserRuleContext {
		public UwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uwhile; }
	 
		public UwhileContext() { }
		public void copyFrom(UwhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhilelineContext extends UwhileContext {
		public TerminalNode WHILE() { return getToken(MyParserParser.WHILE, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilelineContext(UwhileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterWhileline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitWhileline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitWhileline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UwhileContext uwhile() throws RecognitionException {
		UwhileContext _localctx = new UwhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_uwhile);
		try {
			_localctx = new WhilelineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(WHILE);
			setState(208);
			match(OPEN);
			setState(209);
			condition();
			setState(210);
			match(CLOSE);
			setState(211);
			block();
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
		public UforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ufor; }
	 
		public UforContext() { }
		public void copyFrom(UforContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForlineContext extends UforContext {
		public TerminalNode FOR() { return getToken(MyParserParser.FOR, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(MyParserParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MyParserParser.EOL, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public IncrContext incr() {
			return getRuleContext(IncrContext.class,0);
		}
		public TerminalNode NUM() { return getToken(MyParserParser.NUM, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForlineContext(UforContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterForline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitForline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitForline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UforContext ufor() throws RecognitionException {
		UforContext _localctx = new UforContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ufor);
		try {
			_localctx = new ForlineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FOR);
			setState(214);
			match(OPEN);
			setState(215);
			atr();
			setState(216);
			match(EOL);
			setState(217);
			condition();
			setState(218);
			match(EOL);
			setState(219);
			match(ID);
			setState(220);
			incr();
			setState(221);
			match(NUM);
			setState(222);
			match(CLOSE);
			setState(223);
			block();
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
		enterRule(_localctx, 36, RULE_incr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(TYPE);
			setState(228);
			match(ID);
			setState(229);
			match(OPEN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(230);
				par();
				}
			}

			setState(233);
			match(CLOSE);
			setState(234);
			block();
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
		public List<TerminalNode> TYPE() { return getTokens(MyParserParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(MyParserParser.TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(MyParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyParserParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(MyParserParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParserParser.COMA, i);
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
		enterRule(_localctx, 40, RULE_par);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(TYPE);
					setState(237);
					match(ID);
					setState(238);
					match(COMA);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(244);
			match(TYPE);
			setState(245);
			match(ID);
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
		public List<TerminalNode> ID() { return getTokens(MyParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyParserParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(MyParserParser.EQUAL, 0); }
		public TerminalNode OPEN() { return getToken(MyParserParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(MyParserParser.CLOSE, 0); }
		public List<CparContext> cpar() {
			return getRuleContexts(CparContext.class);
		}
		public CparContext cpar(int i) {
			return getRuleContext(CparContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MyParserParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParserParser.COMA, i);
		}
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
		enterRule(_localctx, 42, RULE_cfunction);
		int _la;
		try {
			int _alt;
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(ID);
				setState(248);
				match(EQUAL);
				setState(249);
				match(ID);
				setState(250);
				match(OPEN);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(251);
							cpar();
							setState(252);
							match(COMA);
							}
							} 
						}
						setState(258);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(259);
					cpar();
					}
				}

				setState(262);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ID);
				setState(264);
				match(OPEN);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(265);
							cpar();
							setState(266);
							match(COMA);
							}
							} 
						}
						setState(272);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(273);
					cpar();
					}
				}

				setState(276);
				match(CLOSE);
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

	public static class CparContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode NUM() { return getToken(MyParserParser.NUM, 0); }
		public TerminalNode STR() { return getToken(MyParserParser.STR, 0); }
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
		enterRule(_localctx, 44, RULE_cpar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << NUM) | (1L << ID))) != 0)) ) {
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

	public static class RtrnContext extends ParserRuleContext {
		public RtrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtrn; }
	 
		public RtrnContext() { }
		public void copyFrom(RtrnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnlineContext extends RtrnContext {
		public TerminalNode RETURN() { return getToken(MyParserParser.RETURN, 0); }
		public ReturnlineContext(RtrnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterReturnline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitReturnline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor) return ((MyParserVisitor<? extends T>)visitor).visitReturnline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RtrnContext rtrn() throws RecognitionException {
		RtrnContext _localctx = new RtrnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rtrn);
		try {
			_localctx = new ReturnlineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(RETURN);
			setState(282);
			match(T__0);
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
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
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
		enterRule(_localctx, 48, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SCAN);
			setState(285);
			match(OPEN);
			setState(286);
			match(ID);
			setState(287);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\3\3\3\6"+
		"\3B\n\3\r\3\16\3C\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\6\6T\n\6\r\6\16\6U\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b"+
		"\5\bt\n\b\3\b\3\b\3\b\3\b\5\bz\n\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009e\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c6\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ce\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u00ea\n\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\7\26\u00f2\n\26\f\26\16\26\u00f5\13\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0101\n\27\f\27\16\27\u0104\13\27\3\27\5\27"+
		"\u0107\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u010f\n\27\f\27\16\27\u0112"+
		"\13\27\3\27\5\27\u0115\n\27\3\27\5\27\u0118\n\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\2\5\4\2\35\35 $\3\2\36\37\3\2\')\2\u0131\2\65"+
		"\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nQ\3\2\2\2\fm\3\2\2\2\16o\3"+
		"\2\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u0092\3\2\2\2\26\u009d\3\2"+
		"\2\2\30\u00ac\3\2\2\2\32\u00b5\3\2\2\2\34\u00c5\3\2\2\2\36\u00cd\3\2\2"+
		"\2 \u00cf\3\2\2\2\"\u00d1\3\2\2\2$\u00d7\3\2\2\2&\u00e3\3\2\2\2(\u00e5"+
		"\3\2\2\2*\u00f3\3\2\2\2,\u0117\3\2\2\2.\u0119\3\2\2\2\60\u011b\3\2\2\2"+
		"\62\u011e\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2"+
		"\2\679\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5(\25\2;:\3\2\2\2;<\3"+
		"\2\2\2<=\3\2\2\2=>\5\b\5\2>\3\3\2\2\2?@\7\13\2\2@B\7\'\2\2A?\3\2\2\2B"+
		"C\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7\f\2\2FH\7\23\2\2GI\5\16\b"+
		"\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\24\2\2M\7\3\2"+
		"\2\2NO\7\4\2\2OP\5\n\6\2P\t\3\2\2\2QS\7\23\2\2RT\5\f\7\2SR\3\2\2\2TU\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\24\2\2X\13\3\2\2\2Yn\5\16\b\2"+
		"Z[\5\20\t\2[\\\7\33\2\2\\n\3\2\2\2]^\5\62\32\2^_\7\33\2\2_n\3\2\2\2`a"+
		"\5\22\n\2ab\7\33\2\2bn\3\2\2\2cd\5\26\f\2de\7\33\2\2en\3\2\2\2fn\5\34"+
		"\17\2gn\5\"\22\2hn\5$\23\2ij\5\60\31\2jk\7\33\2\2kn\3\2\2\2ln\5,\27\2"+
		"mY\3\2\2\2mZ\3\2\2\2m]\3\2\2\2m`\3\2\2\2mc\3\2\2\2mf\3\2\2\2mg\3\2\2\2"+
		"mh\3\2\2\2mi\3\2\2\2ml\3\2\2\2n\r\3\2\2\2op\7\20\2\2ps\7)\2\2qr\7\34\2"+
		"\2rt\5\26\f\2sq\3\2\2\2st\3\2\2\2t}\3\2\2\2uv\7\32\2\2vy\7)\2\2wx\7\34"+
		"\2\2xz\5\26\f\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}"+
		"{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\33\2\2\u0081"+
		"\17\3\2\2\2\u0082\u0083\7)\2\2\u0083\u0084\7\34\2\2\u0084\u0089\5\26\f"+
		"\2\u0085\u0086\7)\2\2\u0086\u0087\7\34\2\2\u0087\u0089\7\'\2\2\u0088\u0082"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b\7\5\2\2\u008b"+
		"\u008c\7\21\2\2\u008c\u008d\5\24\13\2\u008d\u008e\7\22\2\2\u008e\23\3"+
		"\2\2\2\u008f\u0093\7\'\2\2\u0090\u0093\7)\2\2\u0091\u0093\5\26\f\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\25\3\2\2"+
		"\2\u0094\u0095\5\30\r\2\u0095\u0096\7\25\2\2\u0096\u0097\5\26\f\2\u0097"+
		"\u009e\3\2\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7\26\2\2\u009a\u009b\5"+
		"\26\f\2\u009b\u009e\3\2\2\2\u009c\u009e\5\30\r\2\u009d\u0094\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\5\32\16"+
		"\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00ad\3\2\2\2\u00a3"+
		"\u00a4\5\32\16\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00ad"+
		"\3\2\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\5\30\r"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\5\32\16\2\u00ac\u009f\3\2\2\2\u00ac"+
		"\u00a3\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\31\3\2\2"+
		"\2\u00ae\u00af\7\21\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\22\2\2\u00b1"+
		"\u00b6\3\2\2\2\u00b2\u00b6\7(\2\2\u00b3\u00b6\7)\2\2\u00b4\u00b6\7\'\2"+
		"\2\u00b5\u00ae\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\7\21\2\2\u00b9"+
		"\u00ba\5\36\20\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5\n\6\2\u00bc\u00c6"+
		"\3\2\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf\7\21\2\2\u00bf\u00c0\5\36\20"+
		"\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\7\b\2\2\u00c3"+
		"\u00c4\5\n\6\2\u00c4\u00c6\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00bd\3\2"+
		"\2\2\u00c6\35\3\2\2\2\u00c7\u00ce\7\16\2\2\u00c8\u00ce\7\17\2\2\u00c9"+
		"\u00ca\5\32\16\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\5\32\16\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce"+
		"\37\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2"+
		"\u00d3\7\21\2\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\7\22\2\2\u00d5\u00d6"+
		"\5\n\6\2\u00d6#\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\7\21\2\2\u00d9"+
		"\u00da\5\20\t\2\u00da\u00db\7\33\2\2\u00db\u00dc\5\36\20\2\u00dc\u00dd"+
		"\7\33\2\2\u00dd\u00de\7)\2\2\u00de\u00df\5&\24\2\u00df\u00e0\7(\2\2\u00e0"+
		"\u00e1\7\22\2\2\u00e1\u00e2\5\n\6\2\u00e2%\3\2\2\2\u00e3\u00e4\t\3\2\2"+
		"\u00e4\'\3\2\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e9\7"+
		"\21\2\2\u00e8\u00ea\5*\26\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\5\n\6\2\u00ed)\3\2\2\2"+
		"\u00ee\u00ef\7\20\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f2\7\32\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8\7"+
		")\2\2\u00f8+\3\2\2\2\u00f9\u00fa\7)\2\2\u00fa\u00fb\7\34\2\2\u00fb\u00fc"+
		"\7)\2\2\u00fc\u0106\7\21\2\2\u00fd\u00fe\5.\30\2\u00fe\u00ff\7\32\2\2"+
		"\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0107\5.\30\2\u0106\u0102\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0118\7\22\2\2\u0109\u010a\7)\2\2\u010a\u0114\7\21\2\2\u010b"+
		"\u010c\5.\30\2\u010c\u010d\7\32\2\2\u010d\u010f\3\2\2\2\u010e\u010b\3"+
		"\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5.\30\2\u0114\u0110\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\7\22\2\2\u0117"+
		"\u00f9\3\2\2\2\u0117\u0109\3\2\2\2\u0118-\3\2\2\2\u0119\u011a\t\4\2\2"+
		"\u011a/\3\2\2\2\u011b\u011c\7\r\2\2\u011c\u011d\7\3\2\2\u011d\61\3\2\2"+
		"\2\u011e\u011f\7\6\2\2\u011f\u0120\7\21\2\2\u0120\u0121\7)\2\2\u0121\u0122"+
		"\7\22\2\2\u0122\63\3\2\2\2\32\658;CJUmsy}\u0088\u0092\u009d\u00ac\u00b5"+
		"\u00c5\u00cd\u00e9\u00f3\u0102\u0106\u0110\u0114\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
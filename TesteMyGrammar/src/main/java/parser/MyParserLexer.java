package parser;// Generated from MyParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParserLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "SCAN", "FUNC", "IF", "ELSE", "FOR", "WHILE", "BOOL", "TYPE", 
			"MATH", "FLOOR", "CEIL", "SQRT", "POT", "FMAX", "FMIN", "RINT", "PONT", 
			"OPEN", "CLOSE", "OPENB", "CLOSEB", "SUM", "SUB", "MULT", "DIV", "MOD", 
			"COMA", "EOL", "EQUAL", "DEQUAL", "DSUM", "DSUB", "BIGGER", "SMALLER", 
			"BEQUAL", "SMEQUAL", "NEQUAL", "AND", "OR", "STR", "NUM", "VAR", "COMMENT", 
			"LINE_COMMENT", "WS"
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


	public MyParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0143\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\7*\u0106\n*\f*\16*\u0109\13*\3*\3"+
		"*\3+\5+\u010e\n+\3+\6+\u0111\n+\r+\16+\u0112\3+\3+\6+\u0117\n+\r+\16+"+
		"\u0118\5+\u011b\n+\3,\3,\7,\u011f\n,\f,\16,\u0122\13,\3-\3-\3-\3-\7-\u0128"+
		"\n-\f-\16-\u012b\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0136\n.\f.\16.\u0139"+
		"\13.\3.\3.\3/\6/\u013e\n/\r/\16/\u013f\3/\3/\3\u0129\2\60\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\4\2C\\c|\7\2\"\"\62;C\\aac|\4\2--//\3"+
		"\2\62;\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0150\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5e\3\2\2\2\7"+
		"j\3\2\2\2\to\3\2\2\2\13r\3\2\2\2\rw\3\2\2\2\17{\3\2\2\2\21\u008a\3\2\2"+
		"\2\23\u00a2\3\2\2\2\25\u00a4\3\2\2\2\27\u00a9\3\2\2\2\31\u00af\3\2\2\2"+
		"\33\u00b4\3\2\2\2\35\u00b9\3\2\2\2\37\u00bd\3\2\2\2!\u00c2\3\2\2\2#\u00c7"+
		"\3\2\2\2%\u00cc\3\2\2\2\'\u00ce\3\2\2\2)\u00d0\3\2\2\2+\u00d2\3\2\2\2"+
		"-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2\63\u00da\3\2\2\2\65\u00dc"+
		"\3\2\2\2\67\u00de\3\2\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00e4\3\2\2\2"+
		"?\u00e6\3\2\2\2A\u00e9\3\2\2\2C\u00ec\3\2\2\2E\u00ef\3\2\2\2G\u00f1\3"+
		"\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2\2\2M\u00f9\3\2\2\2O\u00fc\3\2\2\2Q\u00ff"+
		"\3\2\2\2S\u0102\3\2\2\2U\u010d\3\2\2\2W\u011c\3\2\2\2Y\u0123\3\2\2\2["+
		"\u0131\3\2\2\2]\u013d\3\2\2\2_`\7r\2\2`a\7t\2\2ab\7k\2\2bc\7p\2\2cd\7"+
		"v\2\2d\4\3\2\2\2ef\7u\2\2fg\7e\2\2gh\7c\2\2hi\7p\2\2i\6\3\2\2\2jk\7h\2"+
		"\2kl\7w\2\2lm\7p\2\2mn\7e\2\2n\b\3\2\2\2op\7k\2\2pq\7h\2\2q\n\3\2\2\2"+
		"rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\f\3\2\2\2wx\7h\2\2xy\7q\2\2yz\7"+
		"t\2\2z\16\3\2\2\2{|\7y\2\2|}\7j\2\2}~\7k\2\2~\177\7n\2\2\177\u0080\7g"+
		"\2\2\u0080\20\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u008b\7g\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008b\7g\2\2\u008a\u0081\3\2\2"+
		"\2\u008a\u0085\3\2\2\2\u008b\22\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u00a3\7v\2\2\u008f\u0090\7h\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7c\2\2\u0093\u00a3\7v\2\2\u0094\u0095\7d\2\2"+
		"\u0095\u0096\7q\2\2\u0096\u0097\7q\2\2\u0097\u0098\7n\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7c\2\2\u009a\u00a3\7p\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a3\7i\2\2\u00a1\u00a3\3\2\2\2\u00a2\u008c\3\2\2\2\u00a2\u008f"+
		"\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\24\3\2\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7j\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2"+
		"\u00b3\32\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7s\2\2\u00b6\u00b7\7"+
		"t\2\2\u00b7\u00b8\7v\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7v\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf"+
		"\7o\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7z\2\2\u00c1 \3\2\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\"\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb$\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd&\3\2\2\2\u00ce"+
		"\u00cf\7*\2\2\u00cf(\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1*\3\2\2\2\u00d2\u00d3"+
		"\7}\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7\177\2\2\u00d5.\3\2\2\2\u00d6\u00d7"+
		"\7-\2\2\u00d7\60\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\62\3\2\2\2\u00da\u00db"+
		"\7,\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\66\3\2\2\2\u00de\u00df"+
		"\7\'\2\2\u00df8\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1:\3\2\2\2\u00e2\u00e3"+
		"\7=\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7"+
		"?\2\2\u00e7\u00e8\7?\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea\u00eb"+
		"\7?\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\7?\2\2\u00eeD\3"+
		"\2\2\2\u00ef\u00f0\7@\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2H\3\2"+
		"\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\7?\2\2\u00f5J\3\2\2\2\u00f6\u00f7"+
		"\7>\2\2\u00f7\u00f8\7?\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb"+
		"\7?\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\u00fe\7(\2\2\u00feP\3"+
		"\2\2\2\u00ff\u0100\7~\2\2\u0100\u0101\7~\2\2\u0101R\3\2\2\2\u0102\u0103"+
		"\7$\2\2\u0103\u0107\t\2\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7$\2\2\u010bT\3\2\2\2\u010c\u010e"+
		"\t\4\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u0111\t\5\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u011a\3\2\2\2\u0114\u0116\7\60\2\2\u0115"+
		"\u0117\t\5\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0114\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011bV\3\2\2\2\u011c\u0120\t\2\2\2\u011d\u011f\t\6\2\2"+
		"\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121X\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\61\2\2\u0124"+
		"\u0125\7,\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7,\2\2\u012d\u012e\7\61"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b-\2\2\u0130Z\3\2\2\2\u0131\u0132"+
		"\7\61\2\2\u0132\u0133\7\61\2\2\u0133\u0137\3\2\2\2\u0134\u0136\n\7\2\2"+
		"\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b.\2\2\u013b"+
		"\\\3\2\2\2\u013c\u013e\t\b\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\b/\2\2\u0142^\3\2\2\2\16\2\u008a\u00a2\u0107\u010d\u0112\u0118\u011a"+
		"\u0120\u0129\u0137\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
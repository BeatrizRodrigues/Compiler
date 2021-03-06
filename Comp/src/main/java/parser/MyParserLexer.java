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
		T__0=1, RUN=2, PRINT=3, SCAN=4, IF=5, ELSE=6, FOR=7, WHILE=8, INSERT=9, 
		GLB=10, RETURN=11, TRUE=12, FALSE=13, TYPE=14, OPEN=15, CLOSE=16, OPENB=17, 
		CLOSEB=18, SUM=19, SUB=20, MULT=21, DIV=22, MOD=23, COMA=24, EOL=25, EQUAL=26, 
		DEQUAL=27, DSUM=28, DSUB=29, BIGGER=30, SMALLER=31, BEQUAL=32, SMEQUAL=33, 
		NEQUAL=34, AND=35, OR=36, STR=37, NUM=38, ID=39, COMMENT=40, LINE_COMMENT=41, 
		WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "RUN", "PRINT", "SCAN", "IF", "ELSE", "FOR", "WHILE", "INSERT", 
			"GLB", "RETURN", "TRUE", "FALSE", "TYPE", "OPEN", "CLOSE", "OPENB", "CLOSEB", 
			"SUM", "SUB", "MULT", "DIV", "MOD", "COMA", "EOL", "EQUAL", "DEQUAL", 
			"DSUM", "DSUB", "BIGGER", "SMALLER", "BEQUAL", "SMEQUAL", "NEQUAL", "AND", 
			"OR", "STR", "NUM", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\7&\u00e9\n&\f&\16&\u00ec\13&\3&\3&\3\'\5\'\u00f1\n\'\3\'\6"+
		"\'\u00f4\n\'\r\'\16\'\u00f5\3(\3(\7(\u00fa\n(\f(\16(\u00fd\13(\3)\3)\3"+
		")\3)\7)\u0103\n)\f)\16)\u0106\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u0111"+
		"\n*\f*\16*\u0114\13*\3*\3*\3+\6+\u0119\n+\r+\16+\u011a\3+\3+\3\u0104\2"+
		",\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\t\b\2\"\"\60\60\62<C\\aac|\4\2--//\3"+
		"\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0127"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7^\3\2\2\2\td\3\2\2\2\13i\3\2\2\2\rl\3"+
		"\2\2\2\17q\3\2\2\2\21u\3\2\2\2\23{\3\2\2\2\25\u0082\3\2\2\2\27\u0089\3"+
		"\2\2\2\31\u0090\3\2\2\2\33\u0095\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2"+
		"\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc"+
		"\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2"+
		"\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cd\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2\2\2A\u00d7\3\2\2\2C\u00da\3\2\2\2E"+
		"\u00dd\3\2\2\2G\u00e0\3\2\2\2I\u00e3\3\2\2\2K\u00e6\3\2\2\2M\u00f0\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00fe\3\2\2\2S\u010c\3\2\2\2U\u0118\3\2\2\2WX\7\62"+
		"\2\2X\4\3\2\2\2YZ\7o\2\2Z[\7c\2\2[\\\7k\2\2\\]\7p\2\2]\6\3\2\2\2^_\7r"+
		"\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bc\7v\2\2c\b\3\2\2\2de\7u\2\2ef\7e\2\2"+
		"fg\7c\2\2gh\7p\2\2h\n\3\2\2\2ij\7k\2\2jk\7h\2\2k\f\3\2\2\2lm\7g\2\2mn"+
		"\7n\2\2no\7u\2\2op\7g\2\2p\16\3\2\2\2qr\7h\2\2rs\7q\2\2st\7t\2\2t\20\3"+
		"\2\2\2uv\7y\2\2vw\7j\2\2wx\7k\2\2xy\7n\2\2yz\7g\2\2z\22\3\2\2\2{|\7k\2"+
		"\2|}\7p\2\2}~\7u\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\u0081\7v\2\2\u0081"+
		"\24\3\2\2\2\u0082\u0083\7i\2\2\u0083\u0084\7n\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0086\7d\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088\26\3\2\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7v\2\2\u008c\u008d\7w\2\2"+
		"\u008d\u008e\7t\2\2\u008e\u008f\7p\2\2\u008f\30\3\2\2\2\u0090\u0091\7"+
		"v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\32"+
		"\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\34\3\2\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u00b1\7v\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7n\2\2"+
		"\u00a0\u00a1\7q\2\2\u00a1\u00a2\7c\2\2\u00a2\u00b1\7v\2\2\u00a3\u00a4"+
		"\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00b1\7p\2\2\u00aa\u00ab\7u\2\2"+
		"\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b1\7i\2\2\u00b0\u009b\3\2\2\2\u00b0\u009e\3\2\2\2\u00b0"+
		"\u00a3\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7*\2\2"+
		"\u00b3 \3\2\2\2\u00b4\u00b5\7+\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7}\2\2"+
		"\u00b7$\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7-\2"+
		"\2\u00bb(\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd*\3\2\2\2\u00be\u00bf\7,\2\2"+
		"\u00bf,\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7\'\2"+
		"\2\u00c3\60\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7"+
		"=\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\66\3\2\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\u00cc\7?\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\7?\2\2\u00d2<\3"+
		"\2\2\2\u00d3\u00d4\7@\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6@\3\2"+
		"\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9\7?\2\2\u00d9B\3\2\2\2\u00da\u00db"+
		"\7>\2\2\u00db\u00dc\7?\2\2\u00dcD\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df"+
		"\7?\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2\7(\2\2\u00e2H\3"+
		"\2\2\2\u00e3\u00e4\7~\2\2\u00e4\u00e5\7~\2\2\u00e5J\3\2\2\2\u00e6\u00ea"+
		"\7$\2\2\u00e7\u00e9\t\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ee\7$\2\2\u00eeL\3\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\t\4\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6N\3\2\2\2\u00f7\u00fb\t\5\2\2\u00f8\u00fa\t\6\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"P\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7,\2\2"+
		"\u0100\u0104\3\2\2\2\u0101\u0103\13\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7,\2\2\u0108\u0109\7\61\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\b)\2\2\u010bR\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e"+
		"\7\61\2\2\u010e\u0112\3\2\2\2\u010f\u0111\n\7\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b*\2\2\u0116T\3\2\2\2\u0117\u0119"+
		"\t\b\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b+\2\2\u011dV\3\2\2\2\13"+
		"\2\u00b0\u00ea\u00f0\u00f5\u00fb\u0104\u0112\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
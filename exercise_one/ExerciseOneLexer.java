// Generated from ExerciseOne.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExerciseOneLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FRENTE=1, ESQUERDA=2, DIREITA=3, TRAS=4, ENTAO=5, APOS=6, LPAR=7, RPAR=8, 
		INT=9, NEWLINE=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FRENTE", "ESQUERDA", "DIREITA", "TRAS", "ENTAO", "APOS", "LPAR", "RPAR", 
		"INT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FRENTE'", "'ESQUERDA'", "'DIREITA'", "'TRAS'", "'ENTAO'", "'APOS'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FRENTE", "ESQUERDA", "DIREITA", "TRAS", "ENTAO", "APOS", "LPAR", 
		"RPAR", "INT", "NEWLINE", "WS"
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


	public ExerciseOneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExerciseOne.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rV\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nG\n\n\r\n\16\n"+
		"H\3\13\5\13L\n\13\3\13\3\13\3\f\6\fQ\n\f\r\f\16\fR\3\f\3\f\2\2\r\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\4\3\2\62;\4\2\13\13"+
		"\"\"X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\3\31\3\2\2\2\5 \3\2\2\2\7)\3\2\2\2\t\61\3\2\2\2\13\66\3\2\2\2\r<"+
		"\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23F\3\2\2\2\25K\3\2\2\2\27P\3\2\2\2\31"+
		"\32\7H\2\2\32\33\7T\2\2\33\34\7G\2\2\34\35\7P\2\2\35\36\7V\2\2\36\37\7"+
		"G\2\2\37\4\3\2\2\2 !\7G\2\2!\"\7U\2\2\"#\7S\2\2#$\7W\2\2$%\7G\2\2%&\7"+
		"T\2\2&\'\7F\2\2\'(\7C\2\2(\6\3\2\2\2)*\7F\2\2*+\7K\2\2+,\7T\2\2,-\7G\2"+
		"\2-.\7K\2\2./\7V\2\2/\60\7C\2\2\60\b\3\2\2\2\61\62\7V\2\2\62\63\7T\2\2"+
		"\63\64\7C\2\2\64\65\7U\2\2\65\n\3\2\2\2\66\67\7G\2\2\678\7P\2\289\7V\2"+
		"\29:\7C\2\2:;\7Q\2\2;\f\3\2\2\2<=\7C\2\2=>\7R\2\2>?\7Q\2\2?@\7U\2\2@\16"+
		"\3\2\2\2AB\7*\2\2B\20\3\2\2\2CD\7+\2\2D\22\3\2\2\2EG\t\2\2\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\24\3\2\2\2JL\7\17\2\2KJ\3\2\2\2KL\3\2"+
		"\2\2LM\3\2\2\2MN\7\f\2\2N\26\3\2\2\2OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\f\2\2U\30\3\2\2\2\6\2HKR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
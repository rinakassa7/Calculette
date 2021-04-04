// Generated from CalculetteSuite.g4 by ANTLR 4.9

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteSuiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TYPE=32, IDENTIFIANT=33, NEWLINE=34, WS=35, ENTIER=36, FLOAT=37, UNMATCH=38;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_assignation = 3, 
		RULE_instruction = 4, RULE_condition = 5, RULE_expression = 6, RULE_bloc = 7, 
		RULE_branchement = 8, RULE_fonction = 9, RULE_params = 10, RULE_args = 11, 
		RULE_finInstruction = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "assignation", "instruction", "condition", 
			"expression", "bloc", "branchement", "fonction", "params", "args", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'write'", "'('", "')'", "'read'", "'while'", "'for'", "';'", 
			"'repeat'", "'until'", "'return'", "'!'", "'&&'", "'||'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'true'", "'false'", "'*'", "'/'", "'+'", 
			"'-'", "'{'", "'}'", "'if'", "'else'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TYPE", "IDENTIFIANT", 
			"NEWLINE", "WS", "ENTIER", "FLOAT", "UNMATCH"
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
	public String getGrammarFileName() { return "CalculetteSuite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	   
	    private TablesSymboles tablesSymboles = new TablesSymboles();
	    private int _cur_label = 1;
	    /** générateur de nom d'étiquettes pour les boucles */
	    private String getNewLabel() { return "B" +(_cur_label++); }
	    private String evalexpr (String op) {
		            if ( op.equals("*") ){
		                return  "  MUL\n";
		            } else if ( op.equals("/") ){
		                return  "  DIV\n";
		            } else if ( op.equals("+") ){
		                return  "  ADD\n";
		            }else if ( op.equals("-") ){
		                return  "  SUB\n";
		            }else if ( op.equals("==") ){
		                return  "  EQUAL\n";
		            }else if ( op.equals("!=") || op.equals("<>") ){
		                return  "  NEQ\n";
		            }else if ( op.equals("<") ){
		                return  "  INF\n";
		            }else if ( op.equals("<=") ){
		                return  "  INFEQ\n";
		            }else if ( op.equals(">") ){
		                return  "  SUP\n";
		            }else if ( op.equals(">=") ){
		                return  "  SUPEQ\n";
		            }else {
		            System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
		            throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
		                }
	            }
	    private String evalexprF (String op) {

		            if ( op.equals("*") ){
		                return  "  FMUL\n";
		            } else if ( op.equals("/") ){
		                return  "  FDIV\n";
		            } else if ( op.equals("+") ){
		                return  "  FADD\n";
		            }else if ( op.equals("-") ){
		                return  "  FSUB\n";
		            }else if ( op.equals("==") ){
		                return  "  FEQUAL\n";
		            }else if ( op.equals("!=") || op.equals("<>") ){
		                return  "  FNEQ\n";
		            }else if ( op.equals("<") ){
		                return  "  FINF\n";
		            }else if ( op.equals("<=") ){
		                return  "  FINFEQ\n";
		            }else if ( op.equals(">") ){
		                return  "  FSUP\n";
		            }else if ( op.equals(">=") ){
		                return  "  FSUPEQ\n";
		            }else {
		            System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
		            throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
		                }
					
		        }
			
	public CalculetteSuiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteSuiteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			calcul();
			setState(27);
			match(EOF);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public FonctionContext fonction;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteSuiteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteSuiteParser.NEWLINE, i);
		}
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(29);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 _localctx.code += "  JUMP Main\n"; 
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					match(NEWLINE);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(44);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(NEWLINE);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL Main\n"; 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << ENTIER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(59);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public InstructionContext instruction;
		public TerminalNode TYPE() { return getToken(CalculetteSuiteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteSuiteParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(70);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(71);
				finInstruction();
				  
				             tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); 
				             if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("float")){
				                ((DeclContext)_localctx).code = "  PUSHF 0.0\n";
				             }else if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){
				                ((DeclContext)_localctx).code =  "  PUSHI 0\n";
				             }
				         
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(75);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(76);
				match(T__0);
				setState(77);
				((DeclContext)_localctx).instruction = instruction();

				            //int x = 3
				             tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				             ((DeclContext)_localctx).code =  ((DeclContext)_localctx).instruction.code ;

				          
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteSuiteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(83);
			match(T__0);
			setState(84);
			((AssignationContext)_localctx).expression = expression(0);

			            AdresseType at = tablesSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
			            if (at.type.equals("float")){ 
			                if(at.adresse < 0){ 
			                    //STOREL stocke a la table locale expression.code    
			                    ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code+"  STOREL "+(at.adresse+1)+"\n"+"  STOREL "+ at.adresse +"\n";
			                        }else{
			                            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code+"  STOREG "+(at.adresse+1)+"\n" + "  STOREG "+ at.adresse +"\n";
			                        }
			            }else if (at.type.equals("int")){
			                if(at.adresse < 0){
			                    ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code+ "  STOREL "+ at.adresse +"\n";
			                }else{
			                    ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code+"  STOREG "+ at.adresse +"\n";
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public AssignationContext assignation;
		public Token IDENTIFIANT;
		public ConditionContext condition;
		public InstructionContext instruction;
		public AssignationContext init;
		public AssignationContext incr;
		public BlocContext bloc;
		public BranchementContext branchement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteSuiteParser.IDENTIFIANT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public BranchementContext branchement() {
			return getRuleContext(BranchementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((InstructionContext)_localctx).expression = expression(0);
				setState(88);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((InstructionContext)_localctx).assignation = assignation();
				setState(92);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__1);
				setState(96);
				match(T__2);
				setState(97);
				((InstructionContext)_localctx).expression = expression(0);
				setState(98);
				match(T__3);
				setState(99);
				finInstruction();
				  
				            if(((InstructionContext)_localctx).expression.type.equals("int")){
				                ((InstructionContext)_localctx).code =   ((InstructionContext)_localctx).expression.code + "  WRITE\n" + "  POP\n";
				            }else if(((InstructionContext)_localctx).expression.type.equals("float")){
				                ((InstructionContext)_localctx).code =   ((InstructionContext)_localctx).expression.code + "  WRITEF\n" + "  POP\n" +"  POP\n";
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__4);
				setState(103);
				match(T__2);
				setState(104);
				((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(105);
				match(T__3);
				setState(106);
				finInstruction();
				   
				            AdresseType at = tablesSymboles.getAdresseType((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null)); 
				            if(at.type.equals("int")){
				                 ((InstructionContext)_localctx).code =  "  READ \n" + "  STOREG " + at.adresse+"\n"; 
				            }else if(at.type.equals("float")){
				                ((InstructionContext)_localctx).code =  "  READF \n" + "  STOREG " + (at.adresse+1)+"\n" + "  STOREG "+ at.adresse +"\n";
				        }
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__5);
				setState(110);
				match(T__2);
				setState(111);
				((InstructionContext)_localctx).condition = condition(0);
				setState(112);
				match(T__3);
				setState(113);
				((InstructionContext)_localctx).instruction = instruction();

				              String debutWhile=getNewLabel();
				              String finWhile=getNewLabel();
				              ((InstructionContext)_localctx).code =  "LABEL "
				              +debutWhile + "\n" 
				              + ((InstructionContext)_localctx).condition.code 
				              +"  JUMPF " 
				              +finWhile + "\n" 
				              + ((InstructionContext)_localctx).instruction.code 
				              +"  JUMP "
				              +debutWhile + "\n " 
				              +"LABEL " 
				              + finWhile 
				              + "\n";
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(T__6);
				setState(117);
				match(T__2);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIANT) {
					{
					setState(118);
					((InstructionContext)_localctx).init = assignation();
					}
				}

				setState(121);
				match(T__7);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << FLOAT))) != 0)) {
					{
					setState(122);
					((InstructionContext)_localctx).condition = condition(0);
					}
				}

				setState(125);
				match(T__7);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIANT) {
					{
					setState(126);
					((InstructionContext)_localctx).incr = assignation();
					}
				}

				setState(129);
				match(T__3);
				setState(130);
				((InstructionContext)_localctx).instruction = instruction();

				            String startLabel=getNewLabel();
				            String endLabel=getNewLabel();
				            ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).init.code 
				            +"LABEL "+startLabel+"\n"
				            +((InstructionContext)_localctx).condition.code
				            +"  JUMPF " + endLabel +"\n"
				            +((InstructionContext)_localctx).instruction.code 
				            +((InstructionContext)_localctx).incr.code
				            +"  JUMP "+startLabel+"\n"
				            +"LABEL "+endLabel+"\n";
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(T__8);
				setState(134);
				((InstructionContext)_localctx).instruction = instruction();
				setState(135);
				match(T__9);
				setState(136);
				match(T__2);
				setState(137);
				((InstructionContext)_localctx).condition = condition(0);
				setState(138);
				match(T__3);

				            String labelRepeat=getNewLabel();
				            ((InstructionContext)_localctx).code = "LABEL "+labelRepeat+"\n"
				            +((InstructionContext)_localctx).instruction.code
				            +((InstructionContext)_localctx).condition.code 
				            +"  JUMPF "+labelRepeat+"\n";
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				((InstructionContext)_localctx).bloc = bloc();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				((InstructionContext)_localctx).branchement = branchement();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchement.code;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(147);
				match(T__10);
				setState(148);
				((InstructionContext)_localctx).expression = expression(0);
				setState(149);
				finInstruction();

				            AdresseType at = tablesSymboles.getAdresseType("return");
				                ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).expression.code;
				                if(((InstructionContext)_localctx).expression.type.equals("float")){
				                    _localctx.code +="  STOREL "+(at.adresse+1) +"\n" + "  STOREL "+(at.adresse) +"\n" + "  RETURN \n" + "  RETURN \n";
				                }else if(((InstructionContext)_localctx).expression.type.equals("int")) {
				                    _localctx.code +="  STOREL "+(at.adresse) +"\n" + "  RETURN \n";
				                }
				        
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(152);
				finInstruction();
				 ((InstructionContext)_localctx).code = ""; 
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
		public String code;
		public ConditionContext c1;
		public ConditionContext c3;
		public ConditionContext c;
		public ExpressionContext f;
		public Token op3;
		public ExpressionContext g;
		public ConditionContext c2;
		public ConditionContext c4;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(158);
				match(T__11);
				setState(159);
				((ConditionContext)_localctx).c = condition(6);

				        ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c.code + "  PUSHI 0\n" + "  EQUAL\n";
				        
				}
				break;
			case T__2:
			case T__25:
			case IDENTIFIANT:
			case ENTIER:
			case FLOAT:
				{
				setState(162);
				((ConditionContext)_localctx).f = expression(0);
				setState(163);
				((ConditionContext)_localctx).op3 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
					((ConditionContext)_localctx).op3 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				((ConditionContext)_localctx).g = expression(0);
				 
				        if(((ConditionContext)_localctx).f.type.equals("int") && ((ConditionContext)_localctx).g.type.equals("int") ){
				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).f.code + ((ConditionContext)_localctx).g.code + evalexpr(((ConditionContext)_localctx).op3.getText()); 
				        }else if(((ConditionContext)_localctx).f.type.equals("float") && ((ConditionContext)_localctx).g.type.equals("float") ){
				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).f.code + ((ConditionContext)_localctx).g.code + evalexprF(((ConditionContext)_localctx).op3.getText()); 
				        } 
				    
				}
				break;
			case T__20:
				{
				setState(167);
				match(T__20);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case T__21:
				{
				setState(169);
				match(T__21);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c1 = _prevctx;
						_localctx.c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(174);
						match(T__12);
						setState(175);
						((ConditionContext)_localctx).c2 = condition(6);
						 
						                  //((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c1.code + ((ConditionContext)_localctx).c2.code + "  MUL\n";
						                  
						                  /* amélioration de la conjonction */
						                  String labelElse = getNewLabel();
						                  String labelFin = getNewLabel();

						                  ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c1.code + "  PUSHI 0\n" + "  EQUAL \n" + 
						                  "  JUMPF " + labelElse +"\n" 
						                  +  "  PUSHI 0\n" 
						                  + "  JUMP " + labelFin +"\n"
						                  + "  LABEL " + labelElse +"\n" + ((ConditionContext)_localctx).c2.code 
						                  + "  LABEL " + labelFin + "\n" ;
						                  
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c3 = _prevctx;
						_localctx.c3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(T__13);
						setState(180);
						((ConditionContext)_localctx).c4 = condition(5);
						 
						                  //((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c3.code + ((ConditionContext)_localctx).c4.code + "ADD\n" + "PUSHI 0\n" + "NEQ\n"; 
						                  
						                  /* amélioration de la disjonction */
						                  String labelFin = getNewLabel();
						                  String labelElse = getNewLabel();
						                  
						                  ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c3.code 
						                  + "  JUMPF " + labelElse +"\n" 
						                  + "  PUSHI 1\n" 
						                  + "  JUMP " + labelFin +"\n" 
						                  + "  LABEL " + labelElse +"\n" 
						                  + ((ConditionContext)_localctx).c4.code 
						                  + "  LABEL " + labelFin +"\n";
						                  
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public String type;
		public ExpressionContext a;
		public ExpressionContext c;
		public ExpressionContext e;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public ArgsContext args;
		public Token FLOAT;
		public Token op;
		public ExpressionContext b;
		public Token op1;
		public ExpressionContext d;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteSuiteParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteSuiteParser.IDENTIFIANT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(CalculetteSuiteParser.FLOAT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(189);
				match(T__2);
				setState(190);
				((ExpressionContext)_localctx).e = expression(0);
				setState(191);
				match(T__3);
				((ExpressionContext)_localctx).code = ((ExpressionContext)_localctx).e.code; ((ExpressionContext)_localctx).type = ((ExpressionContext)_localctx).e.type; 
				}
				break;
			case 2:
				{
				setState(194);
				match(T__25);
				setState(195);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "  PUSHI -"+ (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n"; 
				            ((ExpressionContext)_localctx).type = "int";
				    
				}
				break;
			case 3:
				{
				setState(197);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				  
				        AdresseType at = tablesSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExpressionContext)_localctx).type =  at.type;
				        if(at.type.equals("int")){
				            if(at.adresse < 0){
				                ((ExpressionContext)_localctx).code =  "  PUSHL " + (at.adresse) + "\n";
				            }else{
				                ((ExpressionContext)_localctx).code =  "  PUSHG " + at.adresse + "\n";
				            }
				        }else if( at.type.equals("float")){
				           if(at.adresse < 0){
				                ((ExpressionContext)_localctx).code =  "  PUSHL " + (at.adresse) + "\n" +"  PUSHL " + (at.adresse+1)+"\n";
				            }else{
				                ((ExpressionContext)_localctx).code =  "  PUSHG "+ at.adresse + "\n" + "  PUSHG "+ (at.adresse+1)+"\n";
				            } 
				        }
				    
				}
				break;
			case 4:
				{
				setState(199);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(200);
				match(T__2);
				setState(201);
				((ExpressionContext)_localctx).args = args();
				setState(202);
				match(T__3);
				  
				        ((ExpressionContext)_localctx).type =  tablesSymboles.getFunction((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        if(_localctx.type.equals("int")){
				            ((ExpressionContext)_localctx).code =  "  PUSHI 0 \n";
				        }else if(_localctx.type.equals("float")){
				            ((ExpressionContext)_localctx).code = "  PUSHF 0.0 \n";
				        }
				        _localctx.code += ((ExpressionContext)_localctx).args.code +"\n"  + "CALL " + (((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null) + "\n";
				 
				        for (int i=0; i<((ExpressionContext)_localctx).args.size; i++){
				            _localctx.code += "  POP \n";
				        }
				    
				}
				break;
			case 5:
				{
				setState(205);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);
				((ExpressionContext)_localctx).code =  "  PUSHI "+ ((ExpressionContext)_localctx).ENTIER.getText()+"\n"; 
				            ((ExpressionContext)_localctx).type = "int";
				}
				break;
			case 6:
				{
				setState(207);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				 ((ExpressionContext)_localctx).code =  "  PUSHF "+ (((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null)+"\n"; 
				                ((ExpressionContext)_localctx).type = "float";
				}
				break;
			case 7:
				{
				setState(209);
				match(T__25);
				setState(210);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				 ((ExpressionContext)_localctx).code =  "  PUSHF -"+ (((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null)+"\n"; ((ExpressionContext)_localctx).type = "float";
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(215);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						((ExpressionContext)_localctx).b = expression(9);

						                  if(((ExpressionContext)_localctx).a.type.equals("int") && (((ExpressionContext)_localctx).b.type.equals("int"))){
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code  + ((ExpressionContext)_localctx).b.code +  evalexpr(((ExpressionContext)_localctx).op.getText());
						                      ((ExpressionContext)_localctx).type =  "int";
						                  }else if(((ExpressionContext)_localctx).a.type.equals("float") && ((ExpressionContext)_localctx).b.type.equals("float")){
						                      ((ExpressionContext)_localctx).type =  "float";
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code  + ((ExpressionContext)_localctx).b.code +  evalexprF(((ExpressionContext)_localctx).op.getText());
						                  }
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(220);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						((ExpressionContext)_localctx).d = expression(8);

						                  if( (((ExpressionContext)_localctx).c.type.equals("int")) && (((ExpressionContext)_localctx).d.type.equals("int"))){
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code  + ((ExpressionContext)_localctx).d.code + evalexpr(((ExpressionContext)_localctx).op1.getText());
						                      ((ExpressionContext)_localctx).type =  "int";
						                  }else if(((ExpressionContext)_localctx).c.type.equals("float") && ((ExpressionContext)_localctx).d.type.equals("float")){
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code  + ((ExpressionContext)_localctx).d.code + evalexprF(((ExpressionContext)_localctx).op1.getText());
						                      ((ExpressionContext)_localctx).type =  "float"; 
						                  }
						              
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteSuiteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteSuiteParser.NEWLINE, i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__26);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << ENTIER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(230);
				((BlocContext)_localctx).instruction = instruction();
				_localctx.code+=((BlocContext)_localctx).instruction.code;
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(T__27);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					match(NEWLINE);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class BranchementContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext blocthen;
		public InstructionContext blocelse;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteSuiteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteSuiteParser.NEWLINE, i);
		}
		public BranchementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterBranchement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitBranchement(this);
		}
	}

	public final BranchementContext branchement() throws RecognitionException {
		BranchementContext _localctx = new BranchementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_branchement);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__28);
				setState(246);
				match(T__2);
				setState(247);
				((BranchementContext)_localctx).condition = condition(0);
				setState(248);
				match(T__3);
				setState(249);
				((BranchementContext)_localctx).blocthen = instruction();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(250);
					match(NEWLINE);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(T__29);
				setState(257);
				((BranchementContext)_localctx).blocelse = instruction();

				            String si = getNewLabel();
				            String sinon = getNewLabel();
				            
				            ((BranchementContext)_localctx).code = ((BranchementContext)_localctx).condition.code 
				            +"  JUMPF " +sinon + "\n "
				            +((BranchementContext)_localctx).blocthen.code
				            +"  JUMP "+si + "\n"
				            +"LABEL "+sinon + "\n"
				            +((BranchementContext)_localctx).blocelse.code
				            +"LABEL "+si
				            + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__28);
				setState(261);
				match(T__2);
				setState(262);
				((BranchementContext)_localctx).condition = condition(0);
				setState(263);
				match(T__3);
				setState(264);
				((BranchementContext)_localctx).blocthen = instruction();

				            String labelFin = getNewLabel();
				            
				            ((BranchementContext)_localctx).code = ((BranchementContext)_localctx).condition.code
				            +"  JUMPF " + labelFin + "\n "
				            +((BranchementContext)_localctx).blocthen.code
				            +"LABEL "+ labelFin + "\n";
				        
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public BlocContext bloc;
		public TerminalNode TYPE() { return getToken(CalculetteSuiteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteSuiteParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fonction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			 
			            tablesSymboles.newTableLocale();
			            // code java pour gérer la déclaration de "la variable" de retour de la fonction
			            tablesSymboles.putVar("return", (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));

			        
			setState(271);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(272);
			match(T__2);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(273);
				params();
				}
			}

			setState(276);
			match(T__3);
			 
			            //Déclarer la nouvelle fonction 
			            tablesSymboles.newFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			            ((FonctionContext)_localctx).code = "LABEL  " + (((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null) +"\n";
			        
			setState(278);
			((FonctionContext)_localctx).bloc = bloc();

			            // corps de la fonction
			            _localctx.code += ((FonctionContext)_localctx).bloc.code + "RETURN \n";
			            tablesSymboles.dropTableLocale();
			        
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

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalculetteSuiteParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculetteSuiteParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculetteSuiteParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculetteSuiteParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(282);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			 
			            // code java gérant la déclaration de "la variable" de retour de la fonction
			            // stocker l'identifiant ainsi son type dans la table Locale  
			            tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
			        
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(284);
				match(T__30);
				setState(285);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(286);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 
				                // code java gérant une variable locale (argi)
				                tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
				            
				}
				}
				setState(292);
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

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__25) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << FLOAT))) != 0)) {
				{
				setState(293);
				((ArgsContext)_localctx).expression = expression(0);
				 
				        // code java pour première expression pour arg
				            _localctx.code+=((ArgsContext)_localctx).expression.code;
				            _localctx.size += AdresseType.getSize(((ArgsContext)_localctx).expression.type); 
				    
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30) {
					{
					{
					setState(295);
					match(T__30);
					setState(296);
					((ArgsContext)_localctx).expression = expression(0);
					 
					        // code java pour expression suivante pour arg
					            _localctx.code+=((ArgsContext)_localctx).expression.code;
					            _localctx.size += AdresseType.getSize(((ArgsContext)_localctx).expression.type);
					     
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteSuiteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteSuiteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteSuiteListener ) ((CalculetteSuiteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(306);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16"+
		"\3\65\13\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\3\3\3\7\3A\n\3\f\3\16"+
		"\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6z\n\6\3\6\3\6\5\6~\n\6\3\6\3\6\5\6\u0082\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d7"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e3\n\b\f\b\16\b\u00e6"+
		"\13\b\3\t\3\t\3\t\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\t\3\t\7\t\u00f3"+
		"\n\t\f\t\16\t\u00f6\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00fe\n\n\f\n\16"+
		"\n\u0101\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010e\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13\u0115\n\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0123\n\f\f\f\16\f\u0126\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r\5\r\u0133\n\r\3\16\6"+
		"\16\u0136\n\16\r\16\16\16\u0137\3\16\2\4\f\16\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\6\3\2\21\26\3\2\31\32\3\2\33\34\4\2\n\n$$\2\u0155\2\34"+
		"\3\2\2\2\4$\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\n\u009d\3\2\2\2\f\u00ad\3\2"+
		"\2\2\16\u00d6\3\2\2\2\20\u00e7\3\2\2\2\22\u010d\3\2\2\2\24\u010f\3\2\2"+
		"\2\26\u011b\3\2\2\2\30\u0132\3\2\2\2\32\u0135\3\2\2\2\34\35\5\4\3\2\35"+
		"\36\7\2\2\3\36\3\3\2\2\2\37 \5\6\4\2 !\b\3\1\2!#\3\2\2\2\"\37\3\2\2\2"+
		"#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'+\b\3\1\2(*\7$\2"+
		"\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\63\3\2\2\2-+\3\2\2\2./\5\24"+
		"\13\2/\60\b\3\1\2\60\62\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\7$\2\2\67\66\3\2\2\28;"+
		"\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<B\b\3\1\2=>\5\n\6\2"+
		">?\b\3\1\2?A\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
		"DB\3\2\2\2EF\b\3\1\2F\5\3\2\2\2GH\7\"\2\2HI\7#\2\2IJ\5\32\16\2JK\b\4\1"+
		"\2KS\3\2\2\2LM\7\"\2\2MN\7#\2\2NO\7\3\2\2OP\5\n\6\2PQ\b\4\1\2QS\3\2\2"+
		"\2RG\3\2\2\2RL\3\2\2\2S\7\3\2\2\2TU\7#\2\2UV\7\3\2\2VW\5\16\b\2WX\b\5"+
		"\1\2X\t\3\2\2\2YZ\5\16\b\2Z[\5\32\16\2[\\\b\6\1\2\\\u009e\3\2\2\2]^\5"+
		"\b\5\2^_\5\32\16\2_`\b\6\1\2`\u009e\3\2\2\2ab\7\4\2\2bc\7\5\2\2cd\5\16"+
		"\b\2de\7\6\2\2ef\5\32\16\2fg\b\6\1\2g\u009e\3\2\2\2hi\7\7\2\2ij\7\5\2"+
		"\2jk\7#\2\2kl\7\6\2\2lm\5\32\16\2mn\b\6\1\2n\u009e\3\2\2\2op\7\b\2\2p"+
		"q\7\5\2\2qr\5\f\7\2rs\7\6\2\2st\5\n\6\2tu\b\6\1\2u\u009e\3\2\2\2vw\7\t"+
		"\2\2wy\7\5\2\2xz\5\b\5\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7\n\2\2|~\5\f"+
		"\7\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\7\n\2\2\u0080\u0082\5"+
		"\b\5\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7\6\2\2\u0084\u0085\5\n\6\2\u0085\u0086\b\6\1\2\u0086\u009e\3\2"+
		"\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\7\5\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7\6\2\2\u008d\u008e\b\6"+
		"\1\2\u008e\u009e\3\2\2\2\u008f\u0090\5\20\t\2\u0090\u0091\b\6\1\2\u0091"+
		"\u009e\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u0094\b\6\1\2\u0094\u009e\3"+
		"\2\2\2\u0095\u0096\7\r\2\2\u0096\u0097\5\16\b\2\u0097\u0098\5\32\16\2"+
		"\u0098\u0099\b\6\1\2\u0099\u009e\3\2\2\2\u009a\u009b\5\32\16\2\u009b\u009c"+
		"\b\6\1\2\u009c\u009e\3\2\2\2\u009dY\3\2\2\2\u009d]\3\2\2\2\u009da\3\2"+
		"\2\2\u009dh\3\2\2\2\u009do\3\2\2\2\u009dv\3\2\2\2\u009d\u0087\3\2\2\2"+
		"\u009d\u008f\3\2\2\2\u009d\u0092\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u009a"+
		"\3\2\2\2\u009e\13\3\2\2\2\u009f\u00a0\b\7\1\2\u00a0\u00a1\7\16\2\2\u00a1"+
		"\u00a2\5\f\7\b\u00a2\u00a3\b\7\1\2\u00a3\u00ae\3\2\2\2\u00a4\u00a5\5\16"+
		"\b\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\b\7\1\2\u00a8"+
		"\u00ae\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ae\b\7\1\2\u00ab\u00ac\7"+
		"\30\2\2\u00ac\u00ae\b\7\1\2\u00ad\u009f\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00bb\3\2\2\2\u00af\u00b0\f\7"+
		"\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\5\f\7\b\u00b2\u00b3\b\7\1\2\u00b3"+
		"\u00ba\3\2\2\2\u00b4\u00b5\f\6\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\5"+
		"\f\7\7\u00b7\u00b8\b\7\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\b\1\2\u00bf\u00c0"+
		"\7\5\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\b\b\1\2"+
		"\u00c3\u00d7\3\2\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\7&\2\2\u00c6\u00d7"+
		"\b\b\1\2\u00c7\u00c8\7#\2\2\u00c8\u00d7\b\b\1\2\u00c9\u00ca\7#\2\2\u00ca"+
		"\u00cb\7\5\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\b"+
		"\b\1\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7&\2\2\u00d0\u00d7\b\b\1\2\u00d1"+
		"\u00d2\7\'\2\2\u00d2\u00d7\b\b\1\2\u00d3\u00d4\7\34\2\2\u00d4\u00d5\7"+
		"\'\2\2\u00d5\u00d7\b\b\1\2\u00d6\u00be\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6"+
		"\u00c7\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d1\3\2"+
		"\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00e4\3\2\2\2\u00d8\u00d9\f\n\2\2\u00d9"+
		"\u00da\t\3\2\2\u00da\u00db\5\16\b\13\u00db\u00dc\b\b\1\2\u00dc\u00e3\3"+
		"\2\2\2\u00dd\u00de\f\t\2\2\u00de\u00df\t\4\2\2\u00df\u00e0\5\16\b\n\u00e0"+
		"\u00e1\b\b\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00dd\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\17\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ed\7\35\2\2\u00e8\u00e9\5\n\6"+
		"\2\u00e9\u00ea\b\t\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f4\7\36\2\2\u00f1\u00f3\7$\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\21\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\37\2\2\u00f8\u00f9\7\5\2"+
		"\2\u00f9\u00fa\5\f\7\2\u00fa\u00fb\7\6\2\2\u00fb\u00ff\5\n\6\2\u00fc\u00fe"+
		"\7$\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7 "+
		"\2\2\u0103\u0104\5\n\6\2\u0104\u0105\b\n\1\2\u0105\u010e\3\2\2\2\u0106"+
		"\u0107\7\37\2\2\u0107\u0108\7\5\2\2\u0108\u0109\5\f\7\2\u0109\u010a\7"+
		"\6\2\2\u010a\u010b\5\n\6\2\u010b\u010c\b\n\1\2\u010c\u010e\3\2\2\2\u010d"+
		"\u00f7\3\2\2\2\u010d\u0106\3\2\2\2\u010e\23\3\2\2\2\u010f\u0110\7\"\2"+
		"\2\u0110\u0111\b\13\1\2\u0111\u0112\7#\2\2\u0112\u0114\7\5\2\2\u0113\u0115"+
		"\5\26\f\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116\u0117\7\6\2\2\u0117\u0118\b\13\1\2\u0118\u0119\5\20\t\2\u0119\u011a"+
		"\b\13\1\2\u011a\25\3\2\2\2\u011b\u011c\7\"\2\2\u011c\u011d\7#\2\2\u011d"+
		"\u0124\b\f\1\2\u011e\u011f\7!\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7#\2"+
		"\2\u0121\u0123\b\f\1\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\27\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\5\16\b\2\u0128\u012f\b\r\1\2\u0129\u012a\7!\2\2\u012a\u012b\5\16"+
		"\b\2\u012b\u012c\b\r\1\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0127\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\31\3\2\2\2\u0134\u0136\t\5\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2"+
		"\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\33\3\2\2\2\33$+\639B"+
		"Ry}\u0081\u009d\u00ad\u00b9\u00bb\u00d6\u00e2\u00e4\u00ed\u00f4\u00ff"+
		"\u010d\u0114\u0124\u012f\u0132\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
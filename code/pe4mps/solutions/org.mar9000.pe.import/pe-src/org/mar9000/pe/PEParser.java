// Generated from PEParser.g4 by ANTLR 4.5
package org.mar9000.pe;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR_END=1, LINE_COMMENT=2, BLOCK_COMMENT=3, BLANKS=4, LANGUAGE=5, 
		USES=6, EXTENSION=7, FOR=8, ENUM=9, KEYWORDS=10, FRAGMENT=11, PRIMITIVE=12, 
		DATATYPE=13, COLON=14, SEMICOLON=15, COMMA=16, EQUAL=17, DOT=18, PIPE=19, 
		QUESTION=20, STAR=21, PLUS=22, MINUS=23, REGEXPNOT=24, SLASH=25, BACK_SLASH=26, 
		LPAREN=27, RPAREN=28, LSBRACKET=29, RSBRACKET=30, POUND=31, LT=32, GT=33, 
		UNDERSCORE=34, Identifier=35, ExtensionName=36, StringLiteral=37, EscapeSequence=38, 
		NumericLiteral=39, OTHER=40;
	public static final int
		RULE_language = 0, RULE_qualifiedName = 1, RULE_extension = 2, RULE_declaration = 3, 
		RULE_nodeType = 4, RULE_subnodesList = 5, RULE_labeledNodeTypeContent = 6, 
		RULE_nodeTypeContent = 7, RULE_element = 8, RULE_elemenType = 9, RULE_declarationName = 10, 
		RULE_anonymousEnumType = 11, RULE_elementCardinality = 12, RULE_group = 13, 
		RULE_multipleSubtype = 14, RULE_elementAttributes = 15, RULE_elementAttribute = 16, 
		RULE_primitiveType = 17, RULE_builtinType = 18, RULE_enumType = 19, RULE_enumItem = 20, 
		RULE_datatypeDecl = 21, RULE_datatypeName = 22, RULE_keywordsDecl = 23, 
		RULE_keyword = 24, RULE_keywordName = 25, RULE_fragmentDecl = 26, RULE_fragmentName = 27, 
		RULE_constrainedString = 28, RULE_fragmentAlt = 29, RULE_fragmentElement = 30, 
		RULE_fragmentBlock = 31, RULE_fragmentAtom = 32, RULE_charSet = 33, RULE_ebnfSuffix = 34, 
		RULE_literal = 35, RULE_staticContent = 36;
	public static final String[] ruleNames = {
		"language", "qualifiedName", "extension", "declaration", "nodeType", "subnodesList", 
		"labeledNodeTypeContent", "nodeTypeContent", "element", "elemenType", 
		"declarationName", "anonymousEnumType", "elementCardinality", "group", 
		"multipleSubtype", "elementAttributes", "elementAttribute", "primitiveType", 
		"builtinType", "enumType", "enumItem", "datatypeDecl", "datatypeName", 
		"keywordsDecl", "keyword", "keywordName", "fragmentDecl", "fragmentName", 
		"constrainedString", "fragmentAlt", "fragmentElement", "fragmentBlock", 
		"fragmentAtom", "charSet", "ebnfSuffix", "literal", "staticContent"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'language'", "'uses'", "'extension'", "'for'", 
		"'enum'", "'keywords'", "'fragment'", "'primitive'", "'datatype'", "':'", 
		"';'", "','", "'='", "'.'", "'|'", "'?'", "'*'", "'+'", "'-'", "'^'", 
		"'/'", "'\\'", "'('", "')'", "'['", "']'", "'#'", "'<'", "'>'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAMMAR_END", "LINE_COMMENT", "BLOCK_COMMENT", "BLANKS", "LANGUAGE", 
		"USES", "EXTENSION", "FOR", "ENUM", "KEYWORDS", "FRAGMENT", "PRIMITIVE", 
		"DATATYPE", "COLON", "SEMICOLON", "COMMA", "EQUAL", "DOT", "PIPE", "QUESTION", 
		"STAR", "PLUS", "MINUS", "REGEXPNOT", "SLASH", "BACK_SLASH", "LPAREN", 
		"RPAREN", "LSBRACKET", "RSBRACKET", "POUND", "LT", "GT", "UNDERSCORE", 
		"Identifier", "ExtensionName", "StringLiteral", "EscapeSequence", "NumericLiteral", 
		"OTHER"
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

	@Override
	public String getGrammarFileName() { return "PEParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LanguageContext extends ParserRuleContext {
		public QualifiedNameContext name;
		public ExtensionContext extension;
		public List<ExtensionContext> extensions = new ArrayList<ExtensionContext>();
		public DeclarationContext declaration;
		public List<DeclarationContext> declarations = new ArrayList<DeclarationContext>();
		public TerminalNode LANGUAGE() { return getToken(PEParser.LANGUAGE, 0); }
		public TerminalNode USES() { return getToken(PEParser.USES, 0); }
		public TerminalNode SEMICOLON() { return getToken(PEParser.SEMICOLON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ExtensionContext> extension() {
			return getRuleContexts(ExtensionContext.class);
		}
		public ExtensionContext extension(int i) {
			return getRuleContext(ExtensionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_language);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LANGUAGE);
			setState(75);
			((LanguageContext)_localctx).name = qualifiedName();
			setState(76);
			match(USES);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				((LanguageContext)_localctx).extension = extension();
				((LanguageContext)_localctx).extensions.add(((LanguageContext)_localctx).extension);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXTENSION );
			setState(82);
			match(SEMICOLON);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				((LanguageContext)_localctx).declaration = declaration();
				((LanguageContext)_localctx).declarations.add(((LanguageContext)_localctx).declaration);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << KEYWORDS) | (1L << FRAGMENT) | (1L << PRIMITIVE) | (1L << DATATYPE) | (1L << Identifier))) != 0) );
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PEParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PEParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PEParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PEParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Identifier);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(89);
				match(DOT);
				setState(90);
				match(Identifier);
				}
				}
				setState(95);
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

	public static class ExtensionContext extends ParserRuleContext {
		public Token extensionName;
		public Token Identifier;
		public List<Token> rootNodes = new ArrayList<Token>();
		public TerminalNode EXTENSION() { return getToken(PEParser.EXTENSION, 0); }
		public TerminalNode FOR() { return getToken(PEParser.FOR, 0); }
		public TerminalNode ExtensionName() { return getToken(PEParser.ExtensionName, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PEParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PEParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PEParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PEParser.COMMA, i);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(EXTENSION);
			setState(97);
			((ExtensionContext)_localctx).extensionName = match(ExtensionName);
			setState(98);
			match(FOR);
			setState(99);
			((ExtensionContext)_localctx).Identifier = match(Identifier);
			((ExtensionContext)_localctx).rootNodes.add(((ExtensionContext)_localctx).Identifier);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				((ExtensionContext)_localctx).Identifier = match(Identifier);
				((ExtensionContext)_localctx).rootNodes.add(((ExtensionContext)_localctx).Identifier);
				}
				}
				setState(106);
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

	public static class DeclarationContext extends ParserRuleContext {
		public NodeTypeContext nodeType() {
			return getRuleContext(NodeTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public KeywordsDeclContext keywordsDecl() {
			return getRuleContext(KeywordsDeclContext.class,0);
		}
		public FragmentDeclContext fragmentDecl() {
			return getRuleContext(FragmentDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				nodeType();
				}
				break;
			case ENUM:
			case PRIMITIVE:
			case DATATYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				primitiveType();
				}
				break;
			case KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				keywordsDecl();
				}
				break;
			case FRAGMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				fragmentDecl();
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

	public static class NodeTypeContext extends ParserRuleContext {
		public Token name;
		public TerminalNode COLON() { return getToken(PEParser.COLON, 0); }
		public SubnodesListContext subnodesList() {
			return getRuleContext(SubnodesListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PEParser.SEMICOLON, 0); }
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public NodeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterNodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitNodeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitNodeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeTypeContext nodeType() throws RecognitionException {
		NodeTypeContext _localctx = new NodeTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nodeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((NodeTypeContext)_localctx).name = match(Identifier);
			setState(114);
			match(COLON);
			setState(115);
			subnodesList();
			setState(116);
			match(SEMICOLON);
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

	public static class SubnodesListContext extends ParserRuleContext {
		public LabeledNodeTypeContentContext labeledNodeTypeContent;
		public List<LabeledNodeTypeContentContext> subnodes = new ArrayList<LabeledNodeTypeContentContext>();
		public List<LabeledNodeTypeContentContext> labeledNodeTypeContent() {
			return getRuleContexts(LabeledNodeTypeContentContext.class);
		}
		public LabeledNodeTypeContentContext labeledNodeTypeContent(int i) {
			return getRuleContext(LabeledNodeTypeContentContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PEParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PEParser.PIPE, i);
		}
		public SubnodesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnodesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterSubnodesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitSubnodesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitSubnodesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubnodesListContext subnodesList() throws RecognitionException {
		SubnodesListContext _localctx = new SubnodesListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subnodesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((SubnodesListContext)_localctx).labeledNodeTypeContent = labeledNodeTypeContent();
			((SubnodesListContext)_localctx).subnodes.add(((SubnodesListContext)_localctx).labeledNodeTypeContent);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(119);
				match(PIPE);
				setState(120);
				((SubnodesListContext)_localctx).labeledNodeTypeContent = labeledNodeTypeContent();
				((SubnodesListContext)_localctx).subnodes.add(((SubnodesListContext)_localctx).labeledNodeTypeContent);
				}
				}
				setState(125);
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

	public static class LabeledNodeTypeContentContext extends ParserRuleContext {
		public Token name;
		public NodeTypeContentContext nodeTypeContent() {
			return getRuleContext(NodeTypeContentContext.class,0);
		}
		public TerminalNode POUND() { return getToken(PEParser.POUND, 0); }
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public LabeledNodeTypeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledNodeTypeContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterLabeledNodeTypeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitLabeledNodeTypeContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitLabeledNodeTypeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledNodeTypeContentContext labeledNodeTypeContent() throws RecognitionException {
		LabeledNodeTypeContentContext _localctx = new LabeledNodeTypeContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_labeledNodeTypeContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			nodeTypeContent();
			setState(129);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(127);
				match(POUND);
				setState(128);
				((LabeledNodeTypeContentContext)_localctx).name = match(Identifier);
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

	public static class NodeTypeContentContext extends ParserRuleContext {
		public ElementContext element;
		public List<ElementContext> elements = new ArrayList<ElementContext>();
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public NodeTypeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeTypeContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterNodeTypeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitNodeTypeContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitNodeTypeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeTypeContentContext nodeTypeContent() throws RecognitionException {
		NodeTypeContentContext _localctx = new NodeTypeContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nodeTypeContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				((NodeTypeContentContext)_localctx).element = element();
				((NodeTypeContentContext)_localctx).elements.add(((NodeTypeContentContext)_localctx).element);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LT) | (1L << Identifier) | (1L << StringLiteral) | (1L << NumericLiteral))) != 0) );
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
		public Token name;
		public ElementCardinalityContext cardinality;
		public ElemenTypeContext elemenType() {
			return getRuleContext(ElemenTypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PEParser.EQUAL, 0); }
		public ElementCardinalityContext elementCardinality() {
			return getRuleContext(ElementCardinalityContext.class,0);
		}
		public ElementAttributesContext elementAttributes() {
			return getRuleContext(ElementAttributesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(141);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(136);
					elementAttributes();
					}
					break;
				case Identifier:
					{
					setState(137);
					((ElementContext)_localctx).name = match(Identifier);
					setState(139);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(138);
						elementAttributes();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143);
				match(EQUAL);
				}
				break;
			}
			setState(146);
			elemenType();
			setState(148);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
				{
				setState(147);
				((ElementContext)_localctx).cardinality = elementCardinality();
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

	public static class ElemenTypeContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public AnonymousEnumTypeContext anonymousEnumType() {
			return getRuleContext(AnonymousEnumTypeContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public MultipleSubtypeContext multipleSubtype() {
			return getRuleContext(MultipleSubtypeContext.class,0);
		}
		public ElemenTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemenType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterElemenType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitElemenType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitElemenType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemenTypeContext elemenType() throws RecognitionException {
		ElemenTypeContext _localctx = new ElemenTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elemenType);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				declarationName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				anonymousEnumType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				group();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				multipleSubtype();
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

	public static class DeclarationNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public DeclarationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterDeclarationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitDeclarationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitDeclarationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationNameContext declarationName() throws RecognitionException {
		DeclarationNameContext _localctx = new DeclarationNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Identifier);
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

	public static class AnonymousEnumTypeContext extends ParserRuleContext {
		public EnumItemContext enumItem;
		public List<EnumItemContext> values = new ArrayList<EnumItemContext>();
		public TerminalNode LPAREN() { return getToken(PEParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PEParser.RPAREN, 0); }
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PEParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PEParser.PIPE, i);
		}
		public AnonymousEnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousEnumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterAnonymousEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitAnonymousEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitAnonymousEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousEnumTypeContext anonymousEnumType() throws RecognitionException {
		AnonymousEnumTypeContext _localctx = new AnonymousEnumTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_anonymousEnumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LPAREN);
			setState(160);
			((AnonymousEnumTypeContext)_localctx).enumItem = enumItem();
			((AnonymousEnumTypeContext)_localctx).values.add(((AnonymousEnumTypeContext)_localctx).enumItem);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(PIPE);
				setState(162);
				((AnonymousEnumTypeContext)_localctx).enumItem = enumItem();
				((AnonymousEnumTypeContext)_localctx).values.add(((AnonymousEnumTypeContext)_localctx).enumItem);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE );
			setState(167);
			match(RPAREN);
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

	public static class ElementCardinalityContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(PEParser.QUESTION, 0); }
		public TerminalNode STAR() { return getToken(PEParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(PEParser.PLUS, 0); }
		public ElementCardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterElementCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitElementCardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitElementCardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCardinalityContext elementCardinality() throws RecognitionException {
		ElementCardinalityContext _localctx = new ElementCardinalityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementCardinality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class GroupContext extends ParserRuleContext {
		public ElementContext element;
		public List<ElementContext> elements = new ArrayList<ElementContext>();
		public TerminalNode LPAREN() { return getToken(PEParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PEParser.RPAREN, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LPAREN);
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				((GroupContext)_localctx).element = element();
				((GroupContext)_localctx).elements.add(((GroupContext)_localctx).element);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LT) | (1L << Identifier) | (1L << StringLiteral) | (1L << NumericLiteral))) != 0) );
			setState(177);
			match(RPAREN);
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

	public static class MultipleSubtypeContext extends ParserRuleContext {
		public DeclarationNameContext declarationName;
		public List<DeclarationNameContext> subtypes = new ArrayList<DeclarationNameContext>();
		public TerminalNode LPAREN() { return getToken(PEParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PEParser.RPAREN, 0); }
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PEParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PEParser.PIPE, i);
		}
		public MultipleSubtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleSubtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterMultipleSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitMultipleSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitMultipleSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleSubtypeContext multipleSubtype() throws RecognitionException {
		MultipleSubtypeContext _localctx = new MultipleSubtypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multipleSubtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LPAREN);
			setState(180);
			((MultipleSubtypeContext)_localctx).declarationName = declarationName();
			((MultipleSubtypeContext)_localctx).subtypes.add(((MultipleSubtypeContext)_localctx).declarationName);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(PIPE);
				setState(182);
				((MultipleSubtypeContext)_localctx).declarationName = declarationName();
				((MultipleSubtypeContext)_localctx).subtypes.add(((MultipleSubtypeContext)_localctx).declarationName);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE );
			setState(187);
			match(RPAREN);
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

	public static class ElementAttributesContext extends ParserRuleContext {
		public ElementAttributeContext elementAttribute;
		public List<ElementAttributeContext> attributes = new ArrayList<ElementAttributeContext>();
		public TerminalNode LT() { return getToken(PEParser.LT, 0); }
		public TerminalNode GT() { return getToken(PEParser.GT, 0); }
		public List<ElementAttributeContext> elementAttribute() {
			return getRuleContexts(ElementAttributeContext.class);
		}
		public ElementAttributeContext elementAttribute(int i) {
			return getRuleContext(ElementAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PEParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PEParser.COMMA, i);
		}
		public ElementAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterElementAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitElementAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitElementAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributesContext elementAttributes() throws RecognitionException {
		ElementAttributesContext _localctx = new ElementAttributesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elementAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LT);
			setState(190);
			((ElementAttributesContext)_localctx).elementAttribute = elementAttribute();
			((ElementAttributesContext)_localctx).attributes.add(((ElementAttributesContext)_localctx).elementAttribute);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				((ElementAttributesContext)_localctx).elementAttribute = elementAttribute();
				((ElementAttributesContext)_localctx).attributes.add(((ElementAttributesContext)_localctx).elementAttribute);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(GT);
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

	public static class ElementAttributeContext extends ParserRuleContext {
		public StaticContentContext value;
		public Token name;
		public StaticContentContext staticContent;
		public List<StaticContentContext> parameters = new ArrayList<StaticContentContext>();
		public List<StaticContentContext> staticContent() {
			return getRuleContexts(StaticContentContext.class);
		}
		public StaticContentContext staticContent(int i) {
			return getRuleContext(StaticContentContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public TerminalNode EQUAL() { return getToken(PEParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(PEParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PEParser.RPAREN, 0); }
		public ElementAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterElementAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitElementAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitElementAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeContext elementAttribute() throws RecognitionException {
		ElementAttributeContext _localctx = new ElementAttributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementAttribute);
		int _la;
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((ElementAttributeContext)_localctx).value = staticContent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((ElementAttributeContext)_localctx).name = match(Identifier);
				setState(220);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(202);
					match(EQUAL);
					setState(203);
					((ElementAttributeContext)_localctx).value = staticContent();
					}
					break;
				case LPAREN:
					{
					setState(204);
					match(LPAREN);
					setState(206);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << StringLiteral) | (1L << NumericLiteral))) != 0)) {
						{
						setState(205);
						((ElementAttributeContext)_localctx).staticContent = staticContent();
						((ElementAttributeContext)_localctx).parameters.add(((ElementAttributeContext)_localctx).staticContent);
						}
					}

					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(208);
						match(COMMA);
						setState(209);
						((ElementAttributeContext)_localctx).staticContent = staticContent();
						((ElementAttributeContext)_localctx).parameters.add(((ElementAttributeContext)_localctx).staticContent);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(215);
					match(RPAREN);
					setState(218);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(216);
						match(EQUAL);
						setState(217);
						((ElementAttributeContext)_localctx).value = staticContent();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public DatatypeDeclContext datatypeDecl() {
			return getRuleContext(DatatypeDeclContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primitiveType);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case PRIMITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				builtinType();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				enumType();
				}
				break;
			case DATATYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				datatypeDecl();
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

	public static class BuiltinTypeContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PRIMITIVE() { return getToken(PEParser.PRIMITIVE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PEParser.SEMICOLON, 0); }
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public BuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitBuiltinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitBuiltinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinTypeContext builtinType() throws RecognitionException {
		BuiltinTypeContext _localctx = new BuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_builtinType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(PRIMITIVE);
			setState(230);
			((BuiltinTypeContext)_localctx).name = match(Identifier);
			setState(231);
			match(SEMICOLON);
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

	public static class EnumTypeContext extends ParserRuleContext {
		public Token name;
		public EnumItemContext enumItem;
		public List<EnumItemContext> values = new ArrayList<EnumItemContext>();
		public TerminalNode ENUM() { return getToken(PEParser.ENUM, 0); }
		public TerminalNode COLON() { return getToken(PEParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(PEParser.SEMICOLON, 0); }
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PEParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PEParser.PIPE, i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ENUM);
			setState(234);
			((EnumTypeContext)_localctx).name = match(Identifier);
			setState(235);
			match(COLON);
			setState(236);
			((EnumTypeContext)_localctx).enumItem = enumItem();
			((EnumTypeContext)_localctx).values.add(((EnumTypeContext)_localctx).enumItem);
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				match(PIPE);
				setState(238);
				((EnumTypeContext)_localctx).enumItem = enumItem();
				((EnumTypeContext)_localctx).values.add(((EnumTypeContext)_localctx).enumItem);
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE );
			setState(243);
			match(SEMICOLON);
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

	public static class EnumItemContext extends ParserRuleContext {
		public Token key;
		public StaticContentContext value;
		public TerminalNode EQUAL() { return getToken(PEParser.EQUAL, 0); }
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public StaticContentContext staticContent() {
			return getRuleContext(StaticContentContext.class,0);
		}
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((EnumItemContext)_localctx).key = match(Identifier);
			setState(246);
			match(EQUAL);
			setState(247);
			((EnumItemContext)_localctx).value = staticContent();
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

	public static class DatatypeDeclContext extends ParserRuleContext {
		public DatatypeNameContext name;
		public TerminalNode DATATYPE() { return getToken(PEParser.DATATYPE, 0); }
		public TerminalNode COLON() { return getToken(PEParser.COLON, 0); }
		public ConstrainedStringContext constrainedString() {
			return getRuleContext(ConstrainedStringContext.class,0);
		}
		public DatatypeNameContext datatypeName() {
			return getRuleContext(DatatypeNameContext.class,0);
		}
		public DatatypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterDatatypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitDatatypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitDatatypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeDeclContext datatypeDecl() throws RecognitionException {
		DatatypeDeclContext _localctx = new DatatypeDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datatypeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(DATATYPE);
			setState(250);
			((DatatypeDeclContext)_localctx).name = datatypeName();
			setState(251);
			match(COLON);
			setState(252);
			constrainedString();
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

	public static class DatatypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public DatatypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterDatatypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitDatatypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitDatatypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeNameContext datatypeName() throws RecognitionException {
		DatatypeNameContext _localctx = new DatatypeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_datatypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(Identifier);
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

	public static class KeywordsDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode KEYWORDS() { return getToken(PEParser.KEYWORDS, 0); }
		public TerminalNode COLON() { return getToken(PEParser.COLON, 0); }
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PEParser.SEMICOLON, 0); }
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PEParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PEParser.COMMA, i);
		}
		public KeywordsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterKeywordsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitKeywordsDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitKeywordsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsDeclContext keywordsDecl() throws RecognitionException {
		KeywordsDeclContext _localctx = new KeywordsDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_keywordsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(KEYWORDS);
			setState(257);
			((KeywordsDeclContext)_localctx).name = match(Identifier);
			setState(258);
			match(COLON);
			setState(259);
			keyword();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				keyword();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(SEMICOLON);
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

	public static class KeywordContext extends ParserRuleContext {
		public KeywordNameContext name;
		public LiteralContext value;
		public TerminalNode EQUAL() { return getToken(PEParser.EQUAL, 0); }
		public KeywordNameContext keywordName() {
			return getRuleContext(KeywordNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((KeywordContext)_localctx).name = keywordName();
			setState(270);
			match(EQUAL);
			setState(271);
			((KeywordContext)_localctx).value = literal();
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

	public static class KeywordNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public KeywordNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterKeywordName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitKeywordName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitKeywordName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordNameContext keywordName() throws RecognitionException {
		KeywordNameContext _localctx = new KeywordNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_keywordName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(Identifier);
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

	public static class FragmentDeclContext extends ParserRuleContext {
		public TerminalNode FRAGMENT() { return getToken(PEParser.FRAGMENT, 0); }
		public FragmentNameContext fragmentName() {
			return getRuleContext(FragmentNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PEParser.COLON, 0); }
		public ConstrainedStringContext constrainedString() {
			return getRuleContext(ConstrainedStringContext.class,0);
		}
		public FragmentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterFragmentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitFragmentDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitFragmentDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentDeclContext fragmentDecl() throws RecognitionException {
		FragmentDeclContext _localctx = new FragmentDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fragmentDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FRAGMENT);
			setState(276);
			fragmentName();
			setState(277);
			match(COLON);
			setState(278);
			constrainedString();
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

	public static class FragmentNameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Identifier() { return getToken(PEParser.Identifier, 0); }
		public FragmentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterFragmentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitFragmentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitFragmentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentNameContext fragmentName() throws RecognitionException {
		FragmentNameContext _localctx = new FragmentNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fragmentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((FragmentNameContext)_localctx).name = match(Identifier);
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

	public static class ConstrainedStringContext extends ParserRuleContext {
		public FragmentAltContext fragmentAlt;
		public List<FragmentAltContext> alternatives = new ArrayList<FragmentAltContext>();
		public TerminalNode SEMICOLON() { return getToken(PEParser.SEMICOLON, 0); }
		public List<FragmentAltContext> fragmentAlt() {
			return getRuleContexts(FragmentAltContext.class);
		}
		public FragmentAltContext fragmentAlt(int i) {
			return getRuleContext(FragmentAltContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PEParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PEParser.PIPE, i);
		}
		public ConstrainedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrainedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterConstrainedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitConstrainedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitConstrainedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrainedStringContext constrainedString() throws RecognitionException {
		ConstrainedStringContext _localctx = new ConstrainedStringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constrainedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((ConstrainedStringContext)_localctx).fragmentAlt = fragmentAlt();
			((ConstrainedStringContext)_localctx).alternatives.add(((ConstrainedStringContext)_localctx).fragmentAlt);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(283);
				match(PIPE);
				setState(284);
				((ConstrainedStringContext)_localctx).fragmentAlt = fragmentAlt();
				((ConstrainedStringContext)_localctx).alternatives.add(((ConstrainedStringContext)_localctx).fragmentAlt);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(SEMICOLON);
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

	public static class FragmentAltContext extends ParserRuleContext {
		public FragmentElementContext fragmentElement;
		public List<FragmentElementContext> elements = new ArrayList<FragmentElementContext>();
		public List<FragmentElementContext> fragmentElement() {
			return getRuleContexts(FragmentElementContext.class);
		}
		public FragmentElementContext fragmentElement(int i) {
			return getRuleContext(FragmentElementContext.class,i);
		}
		public FragmentAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterFragmentAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitFragmentAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitFragmentAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentAltContext fragmentAlt() throws RecognitionException {
		FragmentAltContext _localctx = new FragmentAltContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fragmentAlt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << LPAREN) | (1L << LSBRACKET) | (1L << Identifier) | (1L << StringLiteral) | (1L << NumericLiteral))) != 0)) {
				{
				{
				setState(292);
				((FragmentAltContext)_localctx).fragmentElement = fragmentElement();
				((FragmentAltContext)_localctx).elements.add(((FragmentAltContext)_localctx).fragmentElement);
				}
				}
				setState(297);
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

	public static class FragmentElementContext extends ParserRuleContext {
		public FragmentAtomContext fragmentAtom() {
			return getRuleContext(FragmentAtomContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public FragmentBlockContext fragmentBlock() {
			return getRuleContext(FragmentBlockContext.class,0);
		}
		public FragmentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterFragmentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitFragmentElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitFragmentElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentElementContext fragmentElement() throws RecognitionException {
		FragmentElementContext _localctx = new FragmentElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fragmentElement);
		int _la;
		try {
			setState(306);
			switch (_input.LA(1)) {
			case DOT:
			case LSBRACKET:
			case Identifier:
			case StringLiteral:
			case NumericLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				fragmentAtom();
				setState(300);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(299);
					ebnfSuffix();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				fragmentBlock();
				setState(304);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(303);
					ebnfSuffix();
					}
				}

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

	public static class FragmentBlockContext extends ParserRuleContext {
		public FragmentAltContext fragmentAlt;
		public List<FragmentAltContext> alternatives = new ArrayList<FragmentAltContext>();
		public TerminalNode LPAREN() { return getToken(PEParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PEParser.RPAREN, 0); }
		public List<FragmentAltContext> fragmentAlt() {
			return getRuleContexts(FragmentAltContext.class);
		}
		public FragmentAltContext fragmentAlt(int i) {
			return getRuleContext(FragmentAltContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PEParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PEParser.PIPE, i);
		}
		public FragmentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterFragmentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitFragmentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitFragmentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentBlockContext fragmentBlock() throws RecognitionException {
		FragmentBlockContext _localctx = new FragmentBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fragmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(LPAREN);
			setState(309);
			((FragmentBlockContext)_localctx).fragmentAlt = fragmentAlt();
			((FragmentBlockContext)_localctx).alternatives.add(((FragmentBlockContext)_localctx).fragmentAlt);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(310);
				match(PIPE);
				setState(311);
				((FragmentBlockContext)_localctx).fragmentAlt = fragmentAlt();
				((FragmentBlockContext)_localctx).alternatives.add(((FragmentBlockContext)_localctx).fragmentAlt);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(RPAREN);
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

	public static class FragmentAtomContext extends ParserRuleContext {
		public StaticContentContext staticContent() {
			return getRuleContext(StaticContentContext.class,0);
		}
		public DatatypeNameContext datatypeName() {
			return getRuleContext(DatatypeNameContext.class,0);
		}
		public CharSetContext charSet() {
			return getRuleContext(CharSetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PEParser.DOT, 0); }
		public FragmentAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterFragmentAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitFragmentAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitFragmentAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentAtomContext fragmentAtom() throws RecognitionException {
		FragmentAtomContext _localctx = new FragmentAtomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fragmentAtom);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				staticContent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				datatypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				charSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(DOT);
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

	public static class CharSetContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(PEParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(PEParser.RSBRACKET, 0); }
		public CharSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterCharSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitCharSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitCharSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharSetContext charSet() throws RecognitionException {
		CharSetContext _localctx = new CharSetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_charSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(LSBRACKET);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(329);
				switch (_input.LA(1)) {
				case GRAMMAR_END:
				case LINE_COMMENT:
				case BLOCK_COMMENT:
				case BLANKS:
				case LANGUAGE:
				case USES:
				case EXTENSION:
				case FOR:
				case ENUM:
				case KEYWORDS:
				case FRAGMENT:
				case PRIMITIVE:
				case DATATYPE:
				case COLON:
				case SEMICOLON:
				case COMMA:
				case EQUAL:
				case DOT:
				case PIPE:
				case QUESTION:
				case STAR:
				case PLUS:
				case MINUS:
				case REGEXPNOT:
				case SLASH:
				case LPAREN:
				case RPAREN:
				case LSBRACKET:
				case POUND:
				case LT:
				case GT:
				case UNDERSCORE:
				case Identifier:
				case ExtensionName:
				case StringLiteral:
				case EscapeSequence:
				case NumericLiteral:
				case OTHER:
					{
					setState(326);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==BACK_SLASH || _la==RSBRACKET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case BACK_SLASH:
					{
					setState(327);
					match(BACK_SLASH);
					setState(328);
					matchWildcard();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAMMAR_END) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT) | (1L << BLANKS) | (1L << LANGUAGE) | (1L << USES) | (1L << EXTENSION) | (1L << FOR) | (1L << ENUM) | (1L << KEYWORDS) | (1L << FRAGMENT) | (1L << PRIMITIVE) | (1L << DATATYPE) | (1L << COLON) | (1L << SEMICOLON) | (1L << COMMA) | (1L << EQUAL) | (1L << DOT) | (1L << PIPE) | (1L << QUESTION) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << REGEXPNOT) | (1L << SLASH) | (1L << BACK_SLASH) | (1L << LPAREN) | (1L << RPAREN) | (1L << LSBRACKET) | (1L << POUND) | (1L << LT) | (1L << GT) | (1L << UNDERSCORE) | (1L << Identifier) | (1L << ExtensionName) | (1L << StringLiteral) | (1L << EscapeSequence) | (1L << NumericLiteral) | (1L << OTHER))) != 0) );
			setState(333);
			match(RSBRACKET);
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

	public static class EbnfSuffixContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(PEParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(PEParser.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(PEParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(PEParser.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterEbnfSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitEbnfSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitEbnfSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ebnfSuffix);
		int _la;
		try {
			setState(347);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(QUESTION);
				setState(337);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(336);
					match(QUESTION);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(STAR);
				setState(341);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(340);
					match(QUESTION);
					}
				}

				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(PLUS);
				setState(345);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(344);
					match(QUESTION);
					}
				}

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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(PEParser.StringLiteral, 0); }
		public TerminalNode NumericLiteral() { return getToken(PEParser.NumericLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==NumericLiteral) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StaticContentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public KeywordNameContext keywordName() {
			return getRuleContext(KeywordNameContext.class,0);
		}
		public StaticContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).enterStaticContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PEParserListener ) ((PEParserListener)listener).exitStaticContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PEParserVisitor ) return ((PEParserVisitor<? extends T>)visitor).visitStaticContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticContentContext staticContent() throws RecognitionException {
		StaticContentContext _localctx = new StaticContentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_staticContent);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case StringLiteral:
			case NumericLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				keywordName();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\6\2Q\n\2\r\2\16\2"+
		"R\3\2\3\2\6\2W\n\2\r\2\16\2X\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\5\3\5\3\5\3\5\5\5r\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\b\3\b\3\b"+
		"\5\b\u0084\n\b\3\t\6\t\u0087\n\t\r\t\16\t\u0088\3\n\3\n\3\n\5\n\u008e"+
		"\n\n\5\n\u0090\n\n\3\n\5\n\u0093\n\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u00a6\n\r\r"+
		"\r\16\r\u00a7\3\r\3\r\3\16\3\16\3\17\3\17\6\17\u00b0\n\17\r\17\16\17\u00b1"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\6\20\u00ba\n\20\r\20\16\20\u00bb\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d1\n\22\3\22\3\22\7\22\u00d5"+
		"\n\22\f\22\16\22\u00d8\13\22\3\22\3\22\3\22\5\22\u00dd\n\22\5\22\u00df"+
		"\n\22\5\22\u00e1\n\22\3\23\3\23\3\23\5\23\u00e6\n\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00f2\n\25\r\25\16\25\u00f3\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0109\n\31\f\31\16\31\u010c\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\7\36\u0120\n\36\f\36\16\36\u0123\13\36\3\36\3\36\3\37\7\37"+
		"\u0128\n\37\f\37\16\37\u012b\13\37\3 \3 \5 \u012f\n \3 \3 \5 \u0133\n"+
		" \5 \u0135\n \3!\3!\3!\3!\7!\u013b\n!\f!\16!\u013e\13!\3!\3!\3\"\3\"\3"+
		"\"\3\"\5\"\u0146\n\"\3#\3#\3#\3#\6#\u014c\n#\r#\16#\u014d\3#\3#\3$\3$"+
		"\5$\u0154\n$\3$\3$\5$\u0158\n$\3$\3$\5$\u015c\n$\5$\u015e\n$\3%\3%\3&"+
		"\3&\5&\u0164\n&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJ\2\5\3\2\26\30\4\2\34\34  \4\2\'\'))\u0170\2"+
		"L\3\2\2\2\4Z\3\2\2\2\6b\3\2\2\2\bq\3\2\2\2\ns\3\2\2\2\fx\3\2\2\2\16\u0080"+
		"\3\2\2\2\20\u0086\3\2\2\2\22\u0092\3\2\2\2\24\u009d\3\2\2\2\26\u009f\3"+
		"\2\2\2\30\u00a1\3\2\2\2\32\u00ab\3\2\2\2\34\u00ad\3\2\2\2\36\u00b5\3\2"+
		"\2\2 \u00bf\3\2\2\2\"\u00e0\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00eb"+
		"\3\2\2\2*\u00f7\3\2\2\2,\u00fb\3\2\2\2.\u0100\3\2\2\2\60\u0102\3\2\2\2"+
		"\62\u010f\3\2\2\2\64\u0113\3\2\2\2\66\u0115\3\2\2\28\u011a\3\2\2\2:\u011c"+
		"\3\2\2\2<\u0129\3\2\2\2>\u0134\3\2\2\2@\u0136\3\2\2\2B\u0145\3\2\2\2D"+
		"\u0147\3\2\2\2F\u015d\3\2\2\2H\u015f\3\2\2\2J\u0163\3\2\2\2LM\7\7\2\2"+
		"MN\5\4\3\2NP\7\b\2\2OQ\5\6\4\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"ST\3\2\2\2TV\7\21\2\2UW\5\b\5\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y\3\3\2\2\2Z_\7%\2\2[\\\7\24\2\2\\^\7%\2\2][\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`\5\3\2\2\2a_\3\2\2\2bc\7\t\2\2cd\7&\2\2de\7\n\2\2ej\7%"+
		"\2\2fg\7\22\2\2gi\7%\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\7\3"+
		"\2\2\2lj\3\2\2\2mr\5\n\6\2nr\5$\23\2or\5\60\31\2pr\5\66\34\2qm\3\2\2\2"+
		"qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\t\3\2\2\2st\7%\2\2tu\7\20\2\2uv\5\f\7"+
		"\2vw\7\21\2\2w\13\3\2\2\2x}\5\16\b\2yz\7\25\2\2z|\5\16\b\2{y\3\2\2\2|"+
		"\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\r\3\2\2\2\177}\3\2\2\2\u0080\u0083\5"+
		"\20\t\2\u0081\u0082\7!\2\2\u0082\u0084\7%\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\17\3\2\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\21"+
		"\3\2\2\2\u008a\u0090\5 \21\2\u008b\u008d\7%\2\2\u008c\u008e\5 \21\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008a\3\2"+
		"\2\2\u008f\u008b\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\23\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\5\24"+
		"\13\2\u0095\u0097\5\32\16\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\23\3\2\2\2\u0098\u009e\5H%\2\u0099\u009e\5\26\f\2\u009a\u009e\5\30\r"+
		"\2\u009b\u009e\5\34\17\2\u009c\u009e\5\36\20\2\u009d\u0098\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\25\3\2\2\2\u009f\u00a0\7%\2\2\u00a0\27\3\2\2\2\u00a1\u00a2"+
		"\7\35\2\2\u00a2\u00a5\5*\26\2\u00a3\u00a4\7\25\2\2\u00a4\u00a6\5*\26\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\36\2\2\u00aa\31\3\2\2\2\u00ab"+
		"\u00ac\t\2\2\2\u00ac\33\3\2\2\2\u00ad\u00af\7\35\2\2\u00ae\u00b0\5\22"+
		"\n\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\36\2\2\u00b4\35\3\2\2"+
		"\2\u00b5\u00b6\7\35\2\2\u00b6\u00b9\5\26\f\2\u00b7\u00b8\7\25\2\2\u00b8"+
		"\u00ba\5\26\f\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\36\2\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c5\5\"\22\2\u00c1\u00c2\7\22"+
		"\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7#\2\2\u00c9!\3\2\2\2\u00ca\u00e1\5J&\2\u00cb\u00de\7"+
		"%\2\2\u00cc\u00cd\7\23\2\2\u00cd\u00df\5J&\2\u00ce\u00d0\7\35\2\2\u00cf"+
		"\u00d1\5J&\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d6\3\2\2"+
		"\2\u00d2\u00d3\7\22\2\2\u00d3\u00d5\5J&\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00dc\7\36\2\2\u00da\u00db\7\23\2\2\u00db\u00dd\5"+
		"J&\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00cc\3\2\2\2\u00de\u00ce\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00ca\3\2"+
		"\2\2\u00e0\u00cb\3\2\2\2\u00e1#\3\2\2\2\u00e2\u00e6\5&\24\2\u00e3\u00e6"+
		"\5(\25\2\u00e4\u00e6\5,\27\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7\16\2\2\u00e8\u00e9\7%\2\2"+
		"\u00e9\u00ea\7\21\2\2\u00ea\'\3\2\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed"+
		"\7%\2\2\u00ed\u00ee\7\20\2\2\u00ee\u00f1\5*\26\2\u00ef\u00f0\7\25\2\2"+
		"\u00f0\u00f2\5*\26\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\21\2\2"+
		"\u00f6)\3\2\2\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\5"+
		"J&\2\u00fa+\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc\u00fd\5.\30\2\u00fd\u00fe"+
		"\7\20\2\2\u00fe\u00ff\5:\36\2\u00ff-\3\2\2\2\u0100\u0101\7%\2\2\u0101"+
		"/\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\7%\2\2\u0104\u0105\7\20\2\2"+
		"\u0105\u010a\5\62\32\2\u0106\u0107\7\22\2\2\u0107\u0109\5\62\32\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\21\2\2\u010e"+
		"\61\3\2\2\2\u010f\u0110\5\64\33\2\u0110\u0111\7\23\2\2\u0111\u0112\5H"+
		"%\2\u0112\63\3\2\2\2\u0113\u0114\7%\2\2\u0114\65\3\2\2\2\u0115\u0116\7"+
		"\r\2\2\u0116\u0117\58\35\2\u0117\u0118\7\20\2\2\u0118\u0119\5:\36\2\u0119"+
		"\67\3\2\2\2\u011a\u011b\7%\2\2\u011b9\3\2\2\2\u011c\u0121\5<\37\2\u011d"+
		"\u011e\7\25\2\2\u011e\u0120\5<\37\2\u011f\u011d\3\2\2\2\u0120\u0123\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\7\21\2\2\u0125;\3\2\2\2\u0126\u0128\5> \2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a=\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\5B\"\2\u012d\u012f"+
		"\5F$\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0135\3\2\2\2\u0130"+
		"\u0132\5@!\2\u0131\u0133\5F$\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0135\3\2\2\2\u0134\u012c\3\2\2\2\u0134\u0130\3\2\2\2\u0135?\3"+
		"\2\2\2\u0136\u0137\7\35\2\2\u0137\u013c\5<\37\2\u0138\u0139\7\25\2\2\u0139"+
		"\u013b\5<\37\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\7\36\2\2\u0140A\3\2\2\2\u0141\u0146\5J&\2\u0142\u0146\5.\30\2\u0143"+
		"\u0146\5D#\2\u0144\u0146\7\24\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146C\3\2\2\2\u0147\u014b"+
		"\7\37\2\2\u0148\u014c\n\3\2\2\u0149\u014a\7\34\2\2\u014a\u014c\13\2\2"+
		"\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7 \2\2\u0150"+
		"E\3\2\2\2\u0151\u0153\7\26\2\2\u0152\u0154\7\26\2\2\u0153\u0152\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u015e\3\2\2\2\u0155\u0157\7\27\2\2\u0156"+
		"\u0158\7\26\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015e\3"+
		"\2\2\2\u0159\u015b\7\30\2\2\u015a\u015c\7\26\2\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u0151\3\2\2\2\u015d\u0155\3\2"+
		"\2\2\u015d\u0159\3\2\2\2\u015eG\3\2\2\2\u015f\u0160\t\4\2\2\u0160I\3\2"+
		"\2\2\u0161\u0164\5H%\2\u0162\u0164\5\64\33\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164K\3\2\2\2)RX_jq}\u0083\u0088\u008d\u008f\u0092\u0096"+
		"\u009d\u00a7\u00b1\u00bb\u00c5\u00d0\u00d6\u00dc\u00de\u00e0\u00e5\u00f3"+
		"\u010a\u0121\u0129\u012e\u0132\u0134\u013c\u0145\u014b\u014d\u0153\u0157"+
		"\u015b\u015d\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
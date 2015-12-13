// Generated from PEParser.g4 by ANTLR 4.5
package org.mar9000.pe;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PEParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PEParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(PEParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(PEParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension(PEParser.ExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PEParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#nodeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeType(PEParser.NodeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#subnodesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnodesList(PEParser.SubnodesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#labeledNodeTypeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledNodeTypeContent(PEParser.LabeledNodeTypeContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#nodeTypeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeTypeContent(PEParser.NodeTypeContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PEParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#elemenType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemenType(PEParser.ElemenTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#declarationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationName(PEParser.DeclarationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#anonymousEnumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousEnumType(PEParser.AnonymousEnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#elementCardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCardinality(PEParser.ElementCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(PEParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#multipleSubtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleSubtype(PEParser.MultipleSubtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#elementAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributes(PEParser.ElementAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#elementAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttribute(PEParser.ElementAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PEParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#builtinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinType(PEParser.BuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(PEParser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#enumItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumItem(PEParser.EnumItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#datatypeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeDecl(PEParser.DatatypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#datatypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeName(PEParser.DatatypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#keywordsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsDecl(PEParser.KeywordsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(PEParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#keywordName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordName(PEParser.KeywordNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#fragmentDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentDecl(PEParser.FragmentDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#fragmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentName(PEParser.FragmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#constrainedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrainedString(PEParser.ConstrainedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#fragmentAlt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentAlt(PEParser.FragmentAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#fragmentElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentElement(PEParser.FragmentElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#fragmentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentBlock(PEParser.FragmentBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#fragmentAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentAtom(PEParser.FragmentAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#charSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSet(PEParser.CharSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#ebnfSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbnfSuffix(PEParser.EbnfSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PEParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PEParser#staticContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticContent(PEParser.StaticContentContext ctx);
}
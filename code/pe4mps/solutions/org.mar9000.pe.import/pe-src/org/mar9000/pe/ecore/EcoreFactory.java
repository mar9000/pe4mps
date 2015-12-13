/**
 */
package org.mar9000.pe.ecore;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface EcoreFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreFactory INSTANCE = org.mar9000.pe.ecore.impl.EcoreFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>PE Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Language</em>'.
	 * @generated
	 */
	PELanguage createPELanguage();

	/**
	 * Returns a new object of class '<em>PE Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Extension</em>'.
	 * @generated
	 */
	PEExtension createPEExtension();

	/**
	 * Returns a new object of class '<em>PE Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Node Type</em>'.
	 * @generated
	 */
	PENodeType createPENodeType();

	/**
	 * Returns a new object of class '<em>PE Element Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Element Attribute</em>'.
	 * @generated
	 */
	PEElementAttribute createPEElementAttribute();

	/**
	 * Returns a new object of class '<em>PE Flag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Flag</em>'.
	 * @generated
	 */
	PEFlag createPEFlag();

	/**
	 * Returns a new object of class '<em>PE Enum Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Enum Node</em>'.
	 * @generated
	 */
	PEEnumNode createPEEnumNode();

	/**
	 * Returns a new object of class '<em>PE Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Enum Value</em>'.
	 * @generated
	 */
	PEEnumValue createPEEnumValue();

	/**
	 * Returns a new object of class '<em>PE Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Primitive Type</em>'.
	 * @generated
	 */
	PEPrimitiveType createPEPrimitiveType();

	/**
	 * Returns a new object of class '<em>PE Keywords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Keywords</em>'.
	 * @generated
	 */
	PEKeywords createPEKeywords();

	/**
	 * Returns a new object of class '<em>PE Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Keyword</em>'.
	 * @generated
	 */
	PEKeyword createPEKeyword();

	/**
	 * Returns a new object of class '<em>PE Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Data Type</em>'.
	 * @generated
	 */
	PEDataType createPEDataType();

	/**
	 * Returns a new object of class '<em>PE Builtin Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Builtin Type</em>'.
	 * @generated
	 */
	PEBuiltinType createPEBuiltinType();

	/**
	 * Returns a new object of class '<em>PE Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Property</em>'.
	 * @generated
	 */
	PEProperty createPEProperty();

	/**
	 * Returns a new object of class '<em>PE Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Constant</em>'.
	 * @generated
	 */
	PEConstant createPEConstant();

	/**
	 * Returns a new object of class '<em>PE Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Group</em>'.
	 * @generated
	 */
	PEGroup createPEGroup();

	/**
	 * Returns a new object of class '<em>PE Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Child</em>'.
	 * @generated
	 */
	PEChild createPEChild();

	/**
	 * Returns a new object of class '<em>PE Child Editor Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE Child Editor Projection</em>'.
	 * @generated
	 */
	PEChildEditorProjection createPEChildEditorProjection();

	/**
	 * Returns a new object of class '<em>PE List Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PE List Projection</em>'.
	 * @generated
	 */
	PEListProjection createPEListProjection();

} //EcoreFactory

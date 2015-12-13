/**
 */
package org.mar9000.pe.ecore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.mar9000.pe.ecore.EcoreFactory;
import org.mar9000.pe.ecore.PEBuiltinType;
import org.mar9000.pe.ecore.PEChild;
import org.mar9000.pe.ecore.PEChildEditorProjection;
import org.mar9000.pe.ecore.PEConstant;
import org.mar9000.pe.ecore.PEDataType;
import org.mar9000.pe.ecore.PEDeclaration;
import org.mar9000.pe.ecore.PEElement;
import org.mar9000.pe.ecore.PEElementAttribute;
import org.mar9000.pe.ecore.PEElementCardinality;
import org.mar9000.pe.ecore.PEEnumNode;
import org.mar9000.pe.ecore.PEEnumValue;
import org.mar9000.pe.ecore.PEExtension;
import org.mar9000.pe.ecore.PEFlag;
import org.mar9000.pe.ecore.PEGroup;
import org.mar9000.pe.ecore.PEKeyword;
import org.mar9000.pe.ecore.PEKeywords;
import org.mar9000.pe.ecore.PELanguage;
import org.mar9000.pe.ecore.PEListProjection;
import org.mar9000.pe.ecore.PENodeType;
import org.mar9000.pe.ecore.PEPrimitiveType;
import org.mar9000.pe.ecore.PEProjection;
import org.mar9000.pe.ecore.PEProperty;
import org.mar9000.pe.ecore.PESingleCellProjection;
import org.mar9000.symboltable.Symbol;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mar9000.pe.ecore.EcoreFactory
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "packageURI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "packagePrefix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcorePackageImpl eINSTANCE = org.mar9000.pe.ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PELanguageImpl <em>PE Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PELanguageImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPELanguage()
	 * @generated
	 */
	public static final int PE_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LANGUAGE__EXTENSIONS = 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LANGUAGE__DECLARATIONS = 2;

	/**
	 * The number of structural features of the '<em>PE Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LANGUAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PE Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEExtensionImpl <em>PE Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEExtensionImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEExtension()
	 * @generated
	 */
	public static final int PE_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_EXTENSION__EXTENSION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Root Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_EXTENSION__ROOT_NODES = 1;

	/**
	 * The number of structural features of the '<em>PE Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_EXTENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PE Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEDeclarationImpl <em>PE Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEDeclarationImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEDeclaration()
	 * @generated
	 */
	public static final int PE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>PE Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PE Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PENodeTypeImpl <em>PE Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PENodeTypeImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPENodeType()
	 * @generated
	 */
	public static final int PE_NODE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_NODE_TYPE__NAME = PE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_NODE_TYPE__ELEMENTS = PE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_NODE_TYPE__SUPER_NODE_TYPES = PE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_NODE_TYPE__ROOT = PE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PE Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_NODE_TYPE_FEATURE_COUNT = PE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PE Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_NODE_TYPE_OPERATION_COUNT = PE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEElementImpl <em>PE Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEElementImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEElement()
	 * @generated
	 */
	public static final int PE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT__CARDINALITY = 2;

	/**
	 * The number of structural features of the '<em>PE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEElementAttributeImpl <em>PE Element Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEElementAttributeImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEElementAttribute()
	 * @generated
	 */
	public static final int PE_ELEMENT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_ATTRIBUTE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>PE Element Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PE Element Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ELEMENT_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEFlagImpl <em>PE Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEFlagImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEFlag()
	 * @generated
	 */
	public static final int PE_FLAG = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_FLAG__NAME = PE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_FLAG__ATTRIBUTES = PE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_FLAG__CARDINALITY = PE_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_FLAG__KEYWORD = PE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PE Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_FLAG_FEATURE_COUNT = PE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PE Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_FLAG_OPERATION_COUNT = PE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEEnumNodeImpl <em>PE Enum Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEEnumNodeImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEEnumNode()
	 * @generated
	 */
	public static final int PE_ENUM_NODE = 7;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEEnumValueImpl <em>PE Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEEnumValueImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEEnumValue()
	 * @generated
	 */
	public static final int PE_ENUM_VALUE = 8;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEPrimitiveTypeImpl <em>PE Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEPrimitiveTypeImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEPrimitiveType()
	 * @generated
	 */
	public static final int PE_PRIMITIVE_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEKeywordsImpl <em>PE Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEKeywordsImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEKeywords()
	 * @generated
	 */
	public static final int PE_KEYWORDS = 10;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEKeywordImpl <em>PE Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEKeywordImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEKeyword()
	 * @generated
	 */
	public static final int PE_KEYWORD = 11;

	/**
	 * The meta object id for the '{@link org.mar9000.symboltable.Symbol <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.symboltable.Symbol
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getSymbol()
	 * @generated
	 */
	public static final int SYMBOL = 13;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYMBOL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_NODE__NAME = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_NODE__VALUES = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PE Enum Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_NODE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PE Enum Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_NODE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>PE Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PE Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PRIMITIVE_TYPE__NAME = PE_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>PE Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PRIMITIVE_TYPE_FEATURE_COUNT = PE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PE Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PRIMITIVE_TYPE_OPERATION_COUNT = PE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORDS__NAME = PE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORDS__KEYWORDS = PE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PE Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORDS_FEATURE_COUNT = PE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PE Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORDS_OPERATION_COUNT = PE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORD__NAME = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORD__VALUE = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PE Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORD_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PE Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_KEYWORD_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEDataTypeImpl <em>PE Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEDataTypeImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEDataType()
	 * @generated
	 */
	public static final int PE_DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DATA_TYPE__NAME = PE_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DATA_TYPE__VALUE = PE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PE Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DATA_TYPE_FEATURE_COUNT = PE_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PE Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_DATA_TYPE_OPERATION_COUNT = PE_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEBuiltinTypeImpl <em>PE Builtin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEBuiltinTypeImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEBuiltinType()
	 * @generated
	 */
	public static final int PE_BUILTIN_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_BUILTIN_TYPE__NAME = PE_PRIMITIVE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>PE Builtin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_BUILTIN_TYPE_FEATURE_COUNT = PE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PE Builtin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_BUILTIN_TYPE_OPERATION_COUNT = PE_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEPropertyImpl <em>PE Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEPropertyImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEProperty()
	 * @generated
	 */
	public static final int PE_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY__NAME = PE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY__ATTRIBUTES = PE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY__CARDINALITY = PE_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY__PRIMITIVE_TYPE = PE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY__MANDATORY = PE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PE Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY_FEATURE_COUNT = PE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PE Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROPERTY_OPERATION_COUNT = PE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEConstantImpl <em>PE Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEConstantImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEConstant()
	 * @generated
	 */
	public static final int PE_CONSTANT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CONSTANT__NAME = PE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CONSTANT__ATTRIBUTES = PE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CONSTANT__CARDINALITY = PE_ELEMENT__CARDINALITY;

	/**
	 * The number of structural features of the '<em>PE Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CONSTANT_FEATURE_COUNT = PE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PE Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CONSTANT_OPERATION_COUNT = PE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEGroupImpl <em>PE Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEGroupImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEGroup()
	 * @generated
	 */
	public static final int PE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_GROUP__NAME = PE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_GROUP__ATTRIBUTES = PE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_GROUP__CARDINALITY = PE_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_GROUP__ELEMENTS = PE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PE Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_GROUP_FEATURE_COUNT = PE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PE Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_GROUP_OPERATION_COUNT = PE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEChildImpl <em>PE Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEChildImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEChild()
	 * @generated
	 */
	public static final int PE_CHILD = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD__NAME = PE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD__ATTRIBUTES = PE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD__CARDINALITY = PE_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD__NODE_TYPE = PE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PE Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_FEATURE_COUNT = PE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PE Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_OPERATION_COUNT = PE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEProjectionImpl <em>PE Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEProjectionImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEProjection()
	 * @generated
	 */
	public static final int PE_PROJECTION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROJECTION__NAME = PE_ELEMENT_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROJECTION__VALUE = PE_ELEMENT_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROJECTION__PARAMETERS = PE_ELEMENT_ATTRIBUTE__PARAMETERS;

	/**
	 * The number of structural features of the '<em>PE Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROJECTION_FEATURE_COUNT = PE_ELEMENT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PE Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_PROJECTION_OPERATION_COUNT = PE_ELEMENT_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PESingleCellProjectionImpl <em>PE Single Cell Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PESingleCellProjectionImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPESingleCellProjection()
	 * @generated
	 */
	public static final int PE_SINGLE_CELL_PROJECTION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_SINGLE_CELL_PROJECTION__NAME = PE_PROJECTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_SINGLE_CELL_PROJECTION__VALUE = PE_PROJECTION__VALUE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_SINGLE_CELL_PROJECTION__PARAMETERS = PE_PROJECTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>PE Single Cell Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_SINGLE_CELL_PROJECTION_FEATURE_COUNT = PE_PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PE Single Cell Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_SINGLE_CELL_PROJECTION_OPERATION_COUNT = PE_PROJECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEChildEditorProjectionImpl <em>PE Child Editor Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEChildEditorProjectionImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEChildEditorProjection()
	 * @generated
	 */
	public static final int PE_CHILD_EDITOR_PROJECTION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_EDITOR_PROJECTION__NAME = PE_SINGLE_CELL_PROJECTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_EDITOR_PROJECTION__VALUE = PE_SINGLE_CELL_PROJECTION__VALUE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_EDITOR_PROJECTION__PARAMETERS = PE_SINGLE_CELL_PROJECTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>PE Child Editor Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_EDITOR_PROJECTION_FEATURE_COUNT = PE_SINGLE_CELL_PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PE Child Editor Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_CHILD_EDITOR_PROJECTION_OPERATION_COUNT = PE_SINGLE_CELL_PROJECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.impl.PEListProjectionImpl <em>PE List Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.impl.PEListProjectionImpl
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEListProjection()
	 * @generated
	 */
	public static final int PE_LIST_PROJECTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__NAME = PE_PROJECTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__VALUE = PE_PROJECTION__VALUE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__PARAMETERS = PE_PROJECTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__PREFIX = PE_PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__SUFFIX = PE_PROJECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__SEPARATOR = PE_PROJECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION__LAYOUT = PE_PROJECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PE List Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION_FEATURE_COUNT = PE_PROJECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>PE List Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PE_LIST_PROJECTION_OPERATION_COUNT = PE_PROJECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mar9000.pe.ecore.PEElementCardinality <em>PE Element Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mar9000.pe.ecore.PEElementCardinality
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEElementCardinality()
	 * @generated
	 */
	public static final int PE_ELEMENT_CARDINALITY = 23;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peElementAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peEnumNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peEnumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pePrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peKeywordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peBuiltinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peSingleCellProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peChildEditorProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peListProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum peElementCardinalityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, ((EFactory)EcoreFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcorePackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackageImpl init() {
		if (isInited) return (EcorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(EcorePackageImpl.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackageImpl.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PELanguage <em>PE Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Language</em>'.
	 * @see org.mar9000.pe.ecore.PELanguage
	 * @generated
	 */
	public EClass getPELanguage() {
		return peLanguageEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PELanguage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mar9000.pe.ecore.PELanguage#getName()
	 * @see #getPELanguage()
	 * @generated
	 */
	public EAttribute getPELanguage_Name() {
		return (EAttribute)peLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PELanguage#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.mar9000.pe.ecore.PELanguage#getExtensions()
	 * @see #getPELanguage()
	 * @generated
	 */
	public EReference getPELanguage_Extensions() {
		return (EReference)peLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PELanguage#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.mar9000.pe.ecore.PELanguage#getDeclarations()
	 * @see #getPELanguage()
	 * @generated
	 */
	public EReference getPELanguage_Declarations() {
		return (EReference)peLanguageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEExtension <em>PE Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Extension</em>'.
	 * @see org.mar9000.pe.ecore.PEExtension
	 * @generated
	 */
	public EClass getPEExtension() {
		return peExtensionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEExtension#getExtensionName <em>Extension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Name</em>'.
	 * @see org.mar9000.pe.ecore.PEExtension#getExtensionName()
	 * @see #getPEExtension()
	 * @generated
	 */
	public EAttribute getPEExtension_ExtensionName() {
		return (EAttribute)peExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.mar9000.pe.ecore.PEExtension#getRootNodes <em>Root Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Nodes</em>'.
	 * @see org.mar9000.pe.ecore.PEExtension#getRootNodes()
	 * @see #getPEExtension()
	 * @generated
	 */
	public EReference getPEExtension_RootNodes() {
		return (EReference)peExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEDeclaration <em>PE Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Declaration</em>'.
	 * @see org.mar9000.pe.ecore.PEDeclaration
	 * @generated
	 */
	public EClass getPEDeclaration() {
		return peDeclarationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mar9000.pe.ecore.PEDeclaration#getName()
	 * @see #getPEDeclaration()
	 * @generated
	 */
	public EAttribute getPEDeclaration_Name() {
		return (EAttribute)peDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PENodeType <em>PE Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Node Type</em>'.
	 * @see org.mar9000.pe.ecore.PENodeType
	 * @generated
	 */
	public EClass getPENodeType() {
		return peNodeTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PENodeType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.mar9000.pe.ecore.PENodeType#getElements()
	 * @see #getPENodeType()
	 * @generated
	 */
	public EReference getPENodeType_Elements() {
		return (EReference)peNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.mar9000.pe.ecore.PENodeType#getSuperNodeTypes <em>Super Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Node Types</em>'.
	 * @see org.mar9000.pe.ecore.PENodeType#getSuperNodeTypes()
	 * @see #getPENodeType()
	 * @generated
	 */
	public EReference getPENodeType_SuperNodeTypes() {
		return (EReference)peNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PENodeType#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.mar9000.pe.ecore.PENodeType#isRoot()
	 * @see #getPENodeType()
	 * @generated
	 */
	public EAttribute getPENodeType_Root() {
		return (EAttribute)peNodeTypeEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEElement <em>PE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Element</em>'.
	 * @see org.mar9000.pe.ecore.PEElement
	 * @generated
	 */
	public EClass getPEElement() {
		return peElementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mar9000.pe.ecore.PEElement#getName()
	 * @see #getPEElement()
	 * @generated
	 */
	public EAttribute getPEElement_Name() {
		return (EAttribute)peElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PEElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.mar9000.pe.ecore.PEElement#getAttributes()
	 * @see #getPEElement()
	 * @generated
	 */
	public EReference getPEElement_Attributes() {
		return (EReference)peElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEElement#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.mar9000.pe.ecore.PEElement#getCardinality()
	 * @see #getPEElement()
	 * @generated
	 */
	public EAttribute getPEElement_Cardinality() {
		return (EAttribute)peElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEElementAttribute <em>PE Element Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Element Attribute</em>'.
	 * @see org.mar9000.pe.ecore.PEElementAttribute
	 * @generated
	 */
	public EClass getPEElementAttribute() {
		return peElementAttributeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEElementAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mar9000.pe.ecore.PEElementAttribute#getName()
	 * @see #getPEElementAttribute()
	 * @generated
	 */
	public EAttribute getPEElementAttribute_Name() {
		return (EAttribute)peElementAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEElementAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mar9000.pe.ecore.PEElementAttribute#getValue()
	 * @see #getPEElementAttribute()
	 * @generated
	 */
	public EAttribute getPEElementAttribute_Value() {
		return (EAttribute)peElementAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.mar9000.pe.ecore.PEElementAttribute#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.mar9000.pe.ecore.PEElementAttribute#getParameters()
	 * @see #getPEElementAttribute()
	 * @generated
	 */
	public EAttribute getPEElementAttribute_Parameters() {
		return (EAttribute)peElementAttributeEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEFlag <em>PE Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Flag</em>'.
	 * @see org.mar9000.pe.ecore.PEFlag
	 * @generated
	 */
	public EClass getPEFlag() {
		return peFlagEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEFlag#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.mar9000.pe.ecore.PEFlag#getKeyword()
	 * @see #getPEFlag()
	 * @generated
	 */
	public EAttribute getPEFlag_Keyword() {
		return (EAttribute)peFlagEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEEnumNode <em>PE Enum Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Enum Node</em>'.
	 * @see org.mar9000.pe.ecore.PEEnumNode
	 * @generated
	 */
	public EClass getPEEnumNode() {
		return peEnumNodeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PEEnumNode#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.mar9000.pe.ecore.PEEnumNode#getValues()
	 * @see #getPEEnumNode()
	 * @generated
	 */
	public EReference getPEEnumNode_Values() {
		return (EReference)peEnumNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEEnumValue <em>PE Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Enum Value</em>'.
	 * @see org.mar9000.pe.ecore.PEEnumValue
	 * @generated
	 */
	public EClass getPEEnumValue() {
		return peEnumValueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEEnumValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.mar9000.pe.ecore.PEEnumValue#getKey()
	 * @see #getPEEnumValue()
	 * @generated
	 */
	public EAttribute getPEEnumValue_Key() {
		return (EAttribute)peEnumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEEnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mar9000.pe.ecore.PEEnumValue#getValue()
	 * @see #getPEEnumValue()
	 * @generated
	 */
	public EAttribute getPEEnumValue_Value() {
		return (EAttribute)peEnumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEPrimitiveType <em>PE Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Primitive Type</em>'.
	 * @see org.mar9000.pe.ecore.PEPrimitiveType
	 * @generated
	 */
	public EClass getPEPrimitiveType() {
		return pePrimitiveTypeEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEKeywords <em>PE Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Keywords</em>'.
	 * @see org.mar9000.pe.ecore.PEKeywords
	 * @generated
	 */
	public EClass getPEKeywords() {
		return peKeywordsEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PEKeywords#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see org.mar9000.pe.ecore.PEKeywords#getKeywords()
	 * @see #getPEKeywords()
	 * @generated
	 */
	public EReference getPEKeywords_Keywords() {
		return (EReference)peKeywordsEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEKeyword <em>PE Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Keyword</em>'.
	 * @see org.mar9000.pe.ecore.PEKeyword
	 * @generated
	 */
	public EClass getPEKeyword() {
		return peKeywordEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEKeyword#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mar9000.pe.ecore.PEKeyword#getValue()
	 * @see #getPEKeyword()
	 * @generated
	 */
	public EAttribute getPEKeyword_Value() {
		return (EAttribute)peKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEDataType <em>PE Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Data Type</em>'.
	 * @see org.mar9000.pe.ecore.PEDataType
	 * @generated
	 */
	public EClass getPEDataType() {
		return peDataTypeEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEDataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mar9000.pe.ecore.PEDataType#getValue()
	 * @see #getPEDataType()
	 * @generated
	 */
	public EAttribute getPEDataType_Value() {
		return (EAttribute)peDataTypeEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.symboltable.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see org.mar9000.symboltable.Symbol
	 * @generated
	 */
	public EClass getSymbol() {
		return symbolEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEBuiltinType <em>PE Builtin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Builtin Type</em>'.
	 * @see org.mar9000.pe.ecore.PEBuiltinType
	 * @generated
	 */
	public EClass getPEBuiltinType() {
		return peBuiltinTypeEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEProperty <em>PE Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Property</em>'.
	 * @see org.mar9000.pe.ecore.PEProperty
	 * @generated
	 */
	public EClass getPEProperty() {
		return pePropertyEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.mar9000.pe.ecore.PEProperty#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Type</em>'.
	 * @see org.mar9000.pe.ecore.PEProperty#getPrimitiveType()
	 * @see #getPEProperty()
	 * @generated
	 */
	public EReference getPEProperty_PrimitiveType() {
		return (EReference)pePropertyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEProperty#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.mar9000.pe.ecore.PEProperty#isMandatory()
	 * @see #getPEProperty()
	 * @generated
	 */
	public EAttribute getPEProperty_Mandatory() {
		return (EAttribute)pePropertyEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEConstant <em>PE Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Constant</em>'.
	 * @see org.mar9000.pe.ecore.PEConstant
	 * @generated
	 */
	public EClass getPEConstant() {
		return peConstantEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEGroup <em>PE Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Group</em>'.
	 * @see org.mar9000.pe.ecore.PEGroup
	 * @generated
	 */
	public EClass getPEGroup() {
		return peGroupEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.mar9000.pe.ecore.PEGroup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.mar9000.pe.ecore.PEGroup#getElements()
	 * @see #getPEGroup()
	 * @generated
	 */
	public EReference getPEGroup_Elements() {
		return (EReference)peGroupEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEChild <em>PE Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Child</em>'.
	 * @see org.mar9000.pe.ecore.PEChild
	 * @generated
	 */
	public EClass getPEChild() {
		return peChildEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.mar9000.pe.ecore.PEChild#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Type</em>'.
	 * @see org.mar9000.pe.ecore.PEChild#getNodeType()
	 * @see #getPEChild()
	 * @generated
	 */
	public EReference getPEChild_NodeType() {
		return (EReference)peChildEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEProjection <em>PE Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Projection</em>'.
	 * @see org.mar9000.pe.ecore.PEProjection
	 * @generated
	 */
	public EClass getPEProjection() {
		return peProjectionEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PESingleCellProjection <em>PE Single Cell Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Single Cell Projection</em>'.
	 * @see org.mar9000.pe.ecore.PESingleCellProjection
	 * @generated
	 */
	public EClass getPESingleCellProjection() {
		return peSingleCellProjectionEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEChildEditorProjection <em>PE Child Editor Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE Child Editor Projection</em>'.
	 * @see org.mar9000.pe.ecore.PEChildEditorProjection
	 * @generated
	 */
	public EClass getPEChildEditorProjection() {
		return peChildEditorProjectionEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.mar9000.pe.ecore.PEListProjection <em>PE List Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PE List Projection</em>'.
	 * @see org.mar9000.pe.ecore.PEListProjection
	 * @generated
	 */
	public EClass getPEListProjection() {
		return peListProjectionEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEListProjection#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.mar9000.pe.ecore.PEListProjection#getPrefix()
	 * @see #getPEListProjection()
	 * @generated
	 */
	public EAttribute getPEListProjection_Prefix() {
		return (EAttribute)peListProjectionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEListProjection#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.mar9000.pe.ecore.PEListProjection#getSuffix()
	 * @see #getPEListProjection()
	 * @generated
	 */
	public EAttribute getPEListProjection_Suffix() {
		return (EAttribute)peListProjectionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEListProjection#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see org.mar9000.pe.ecore.PEListProjection#getSeparator()
	 * @see #getPEListProjection()
	 * @generated
	 */
	public EAttribute getPEListProjection_Separator() {
		return (EAttribute)peListProjectionEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.mar9000.pe.ecore.PEListProjection#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see org.mar9000.pe.ecore.PEListProjection#getLayout()
	 * @see #getPEListProjection()
	 * @generated
	 */
	public EAttribute getPEListProjection_Layout() {
		return (EAttribute)peListProjectionEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for enum '{@link org.mar9000.pe.ecore.PEElementCardinality <em>PE Element Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PE Element Cardinality</em>'.
	 * @see org.mar9000.pe.ecore.PEElementCardinality
	 * @generated
	 */
	public EEnum getPEElementCardinality() {
		return peElementCardinalityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		peLanguageEClass = createEClass(PE_LANGUAGE);
		createEAttribute(peLanguageEClass, PE_LANGUAGE__NAME);
		createEReference(peLanguageEClass, PE_LANGUAGE__EXTENSIONS);
		createEReference(peLanguageEClass, PE_LANGUAGE__DECLARATIONS);

		peExtensionEClass = createEClass(PE_EXTENSION);
		createEAttribute(peExtensionEClass, PE_EXTENSION__EXTENSION_NAME);
		createEReference(peExtensionEClass, PE_EXTENSION__ROOT_NODES);

		peDeclarationEClass = createEClass(PE_DECLARATION);
		createEAttribute(peDeclarationEClass, PE_DECLARATION__NAME);

		peNodeTypeEClass = createEClass(PE_NODE_TYPE);
		createEReference(peNodeTypeEClass, PE_NODE_TYPE__ELEMENTS);
		createEReference(peNodeTypeEClass, PE_NODE_TYPE__SUPER_NODE_TYPES);
		createEAttribute(peNodeTypeEClass, PE_NODE_TYPE__ROOT);

		peElementEClass = createEClass(PE_ELEMENT);
		createEAttribute(peElementEClass, PE_ELEMENT__NAME);
		createEReference(peElementEClass, PE_ELEMENT__ATTRIBUTES);
		createEAttribute(peElementEClass, PE_ELEMENT__CARDINALITY);

		peElementAttributeEClass = createEClass(PE_ELEMENT_ATTRIBUTE);
		createEAttribute(peElementAttributeEClass, PE_ELEMENT_ATTRIBUTE__NAME);
		createEAttribute(peElementAttributeEClass, PE_ELEMENT_ATTRIBUTE__VALUE);
		createEAttribute(peElementAttributeEClass, PE_ELEMENT_ATTRIBUTE__PARAMETERS);

		peFlagEClass = createEClass(PE_FLAG);
		createEAttribute(peFlagEClass, PE_FLAG__KEYWORD);

		peEnumNodeEClass = createEClass(PE_ENUM_NODE);
		createEReference(peEnumNodeEClass, PE_ENUM_NODE__VALUES);

		peEnumValueEClass = createEClass(PE_ENUM_VALUE);
		createEAttribute(peEnumValueEClass, PE_ENUM_VALUE__KEY);
		createEAttribute(peEnumValueEClass, PE_ENUM_VALUE__VALUE);

		pePrimitiveTypeEClass = createEClass(PE_PRIMITIVE_TYPE);

		peKeywordsEClass = createEClass(PE_KEYWORDS);
		createEReference(peKeywordsEClass, PE_KEYWORDS__KEYWORDS);

		peKeywordEClass = createEClass(PE_KEYWORD);
		createEAttribute(peKeywordEClass, PE_KEYWORD__VALUE);

		peDataTypeEClass = createEClass(PE_DATA_TYPE);
		createEAttribute(peDataTypeEClass, PE_DATA_TYPE__VALUE);

		symbolEClass = createEClass(SYMBOL);

		peBuiltinTypeEClass = createEClass(PE_BUILTIN_TYPE);

		pePropertyEClass = createEClass(PE_PROPERTY);
		createEReference(pePropertyEClass, PE_PROPERTY__PRIMITIVE_TYPE);
		createEAttribute(pePropertyEClass, PE_PROPERTY__MANDATORY);

		peConstantEClass = createEClass(PE_CONSTANT);

		peGroupEClass = createEClass(PE_GROUP);
		createEReference(peGroupEClass, PE_GROUP__ELEMENTS);

		peChildEClass = createEClass(PE_CHILD);
		createEReference(peChildEClass, PE_CHILD__NODE_TYPE);

		peProjectionEClass = createEClass(PE_PROJECTION);

		peSingleCellProjectionEClass = createEClass(PE_SINGLE_CELL_PROJECTION);

		peChildEditorProjectionEClass = createEClass(PE_CHILD_EDITOR_PROJECTION);

		peListProjectionEClass = createEClass(PE_LIST_PROJECTION);
		createEAttribute(peListProjectionEClass, PE_LIST_PROJECTION__PREFIX);
		createEAttribute(peListProjectionEClass, PE_LIST_PROJECTION__SUFFIX);
		createEAttribute(peListProjectionEClass, PE_LIST_PROJECTION__SEPARATOR);
		createEAttribute(peListProjectionEClass, PE_LIST_PROJECTION__LAYOUT);

		// Create enums
		peElementCardinalityEEnum = createEEnum(PE_ELEMENT_CARDINALITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		peNodeTypeEClass.getESuperTypes().add(this.getPEDeclaration());
		peNodeTypeEClass.getESuperTypes().add(this.getSymbol());
		peFlagEClass.getESuperTypes().add(this.getPEElement());
		peEnumNodeEClass.getESuperTypes().add(this.getSymbol());
		peEnumNodeEClass.getESuperTypes().add(this.getPEPrimitiveType());
		pePrimitiveTypeEClass.getESuperTypes().add(this.getPEDeclaration());
		peKeywordsEClass.getESuperTypes().add(this.getPEDeclaration());
		peKeywordEClass.getESuperTypes().add(this.getSymbol());
		peKeywordEClass.getESuperTypes().add(this.getPEDeclaration());
		peDataTypeEClass.getESuperTypes().add(this.getPEPrimitiveType());
		peDataTypeEClass.getESuperTypes().add(this.getSymbol());
		peBuiltinTypeEClass.getESuperTypes().add(this.getPEPrimitiveType());
		peBuiltinTypeEClass.getESuperTypes().add(this.getSymbol());
		pePropertyEClass.getESuperTypes().add(this.getPEElement());
		peConstantEClass.getESuperTypes().add(this.getPEElement());
		peGroupEClass.getESuperTypes().add(this.getPEElement());
		peChildEClass.getESuperTypes().add(this.getPEElement());
		peProjectionEClass.getESuperTypes().add(this.getPEElementAttribute());
		peSingleCellProjectionEClass.getESuperTypes().add(this.getPEProjection());
		peChildEditorProjectionEClass.getESuperTypes().add(this.getPESingleCellProjection());
		peListProjectionEClass.getESuperTypes().add(this.getPEProjection());

		// Initialize classes, features, and operations; add parameters
		initEClass(peLanguageEClass, PELanguage.class, "PELanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPELanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, PELanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPELanguage_Extensions(), this.getPEExtension(), null, "extensions", null, 1, -1, PELanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPELanguage_Declarations(), this.getPEDeclaration(), null, "declarations", null, 0, -1, PELanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peExtensionEClass, PEExtension.class, "PEExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEExtension_ExtensionName(), ecorePackage.getEString(), "extensionName", null, 0, 1, PEExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEExtension_RootNodes(), this.getPENodeType(), null, "rootNodes", null, 1, -1, PEExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peDeclarationEClass, PEDeclaration.class, "PEDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PEDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peNodeTypeEClass, PENodeType.class, "PENodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPENodeType_Elements(), this.getPEElement(), null, "elements", null, 0, -1, PENodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPENodeType_SuperNodeTypes(), this.getPENodeType(), null, "superNodeTypes", null, 0, -1, PENodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPENodeType_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, PENodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peElementEClass, PEElement.class, "PEElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PEElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEElement_Attributes(), this.getPEElementAttribute(), null, "attributes", null, 0, -1, PEElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEElement_Cardinality(), this.getPEElementCardinality(), "cardinality", "1", 0, 1, PEElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peElementAttributeEClass, PEElementAttribute.class, "PEElementAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEElementAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, PEElementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEElementAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, PEElementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEElementAttribute_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, PEElementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peFlagEClass, PEFlag.class, "PEFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEFlag_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, PEFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peEnumNodeEClass, PEEnumNode.class, "PEEnumNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPEEnumNode_Values(), this.getPEEnumValue(), null, "values", null, 1, -1, PEEnumNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peEnumValueEClass, PEEnumValue.class, "PEEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEEnumValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, PEEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEEnumValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, PEEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pePrimitiveTypeEClass, PEPrimitiveType.class, "PEPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peKeywordsEClass, PEKeywords.class, "PEKeywords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPEKeywords_Keywords(), this.getPEKeyword(), null, "keywords", null, 1, -1, PEKeywords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peKeywordEClass, PEKeyword.class, "PEKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEKeyword_Value(), ecorePackage.getEString(), "value", null, 0, 1, PEKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peDataTypeEClass, PEDataType.class, "PEDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEDataType_Value(), ecorePackage.getEString(), "value", null, 0, 1, PEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolEClass, Symbol.class, "Symbol", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(peBuiltinTypeEClass, PEBuiltinType.class, "PEBuiltinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pePropertyEClass, PEProperty.class, "PEProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPEProperty_PrimitiveType(), this.getPEPrimitiveType(), null, "primitiveType", null, 0, 1, PEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEProperty_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, PEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peConstantEClass, PEConstant.class, "PEConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peGroupEClass, PEGroup.class, "PEGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPEGroup_Elements(), this.getPEElement(), null, "elements", null, 1, -1, PEGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peChildEClass, PEChild.class, "PEChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPEChild_NodeType(), this.getPENodeType(), null, "nodeType", null, 1, 1, PEChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peProjectionEClass, PEProjection.class, "PEProjection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peSingleCellProjectionEClass, PESingleCellProjection.class, "PESingleCellProjection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peChildEditorProjectionEClass, PEChildEditorProjection.class, "PEChildEditorProjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peListProjectionEClass, PEListProjection.class, "PEListProjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEListProjection_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, PEListProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEListProjection_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, PEListProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEListProjection_Separator(), ecorePackage.getEString(), "separator", null, 0, 1, PEListProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEListProjection_Layout(), ecorePackage.getEString(), "layout", null, 0, 1, PEListProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(peElementCardinalityEEnum, PEElementCardinality.class, "PEElementCardinality");
		addEEnumLiteral(peElementCardinalityEEnum, PEElementCardinality.OPTIONAL);
		addEEnumLiteral(peElementCardinalityEEnum, PEElementCardinality.ARRAY);
		addEEnumLiteral(peElementCardinalityEEnum, PEElementCardinality.MANDATORY);
		addEEnumLiteral(peElementCardinalityEEnum, PEElementCardinality.NON_EMPTY_ARRAY);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PELanguageImpl <em>PE Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PELanguageImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPELanguage()
		 * @generated
		 */
		public static final EClass PE_LANGUAGE = eINSTANCE.getPELanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_LANGUAGE__NAME = eINSTANCE.getPELanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_LANGUAGE__EXTENSIONS = eINSTANCE.getPELanguage_Extensions();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_LANGUAGE__DECLARATIONS = eINSTANCE.getPELanguage_Declarations();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEExtensionImpl <em>PE Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEExtensionImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEExtension()
		 * @generated
		 */
		public static final EClass PE_EXTENSION = eINSTANCE.getPEExtension();

		/**
		 * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_EXTENSION__EXTENSION_NAME = eINSTANCE.getPEExtension_ExtensionName();

		/**
		 * The meta object literal for the '<em><b>Root Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_EXTENSION__ROOT_NODES = eINSTANCE.getPEExtension_RootNodes();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEDeclarationImpl <em>PE Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEDeclarationImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEDeclaration()
		 * @generated
		 */
		public static final EClass PE_DECLARATION = eINSTANCE.getPEDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_DECLARATION__NAME = eINSTANCE.getPEDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PENodeTypeImpl <em>PE Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PENodeTypeImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPENodeType()
		 * @generated
		 */
		public static final EClass PE_NODE_TYPE = eINSTANCE.getPENodeType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_NODE_TYPE__ELEMENTS = eINSTANCE.getPENodeType_Elements();

		/**
		 * The meta object literal for the '<em><b>Super Node Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_NODE_TYPE__SUPER_NODE_TYPES = eINSTANCE.getPENodeType_SuperNodeTypes();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_NODE_TYPE__ROOT = eINSTANCE.getPENodeType_Root();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEElementImpl <em>PE Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEElementImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEElement()
		 * @generated
		 */
		public static final EClass PE_ELEMENT = eINSTANCE.getPEElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ELEMENT__NAME = eINSTANCE.getPEElement_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_ELEMENT__ATTRIBUTES = eINSTANCE.getPEElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ELEMENT__CARDINALITY = eINSTANCE.getPEElement_Cardinality();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEElementAttributeImpl <em>PE Element Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEElementAttributeImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEElementAttribute()
		 * @generated
		 */
		public static final EClass PE_ELEMENT_ATTRIBUTE = eINSTANCE.getPEElementAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ELEMENT_ATTRIBUTE__NAME = eINSTANCE.getPEElementAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ELEMENT_ATTRIBUTE__VALUE = eINSTANCE.getPEElementAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ELEMENT_ATTRIBUTE__PARAMETERS = eINSTANCE.getPEElementAttribute_Parameters();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEFlagImpl <em>PE Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEFlagImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEFlag()
		 * @generated
		 */
		public static final EClass PE_FLAG = eINSTANCE.getPEFlag();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_FLAG__KEYWORD = eINSTANCE.getPEFlag_Keyword();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEEnumNodeImpl <em>PE Enum Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEEnumNodeImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEEnumNode()
		 * @generated
		 */
		public static final EClass PE_ENUM_NODE = eINSTANCE.getPEEnumNode();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_ENUM_NODE__VALUES = eINSTANCE.getPEEnumNode_Values();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEEnumValueImpl <em>PE Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEEnumValueImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEEnumValue()
		 * @generated
		 */
		public static final EClass PE_ENUM_VALUE = eINSTANCE.getPEEnumValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ENUM_VALUE__KEY = eINSTANCE.getPEEnumValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_ENUM_VALUE__VALUE = eINSTANCE.getPEEnumValue_Value();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEPrimitiveTypeImpl <em>PE Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEPrimitiveTypeImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEPrimitiveType()
		 * @generated
		 */
		public static final EClass PE_PRIMITIVE_TYPE = eINSTANCE.getPEPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEKeywordsImpl <em>PE Keywords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEKeywordsImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEKeywords()
		 * @generated
		 */
		public static final EClass PE_KEYWORDS = eINSTANCE.getPEKeywords();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_KEYWORDS__KEYWORDS = eINSTANCE.getPEKeywords_Keywords();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEKeywordImpl <em>PE Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEKeywordImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEKeyword()
		 * @generated
		 */
		public static final EClass PE_KEYWORD = eINSTANCE.getPEKeyword();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_KEYWORD__VALUE = eINSTANCE.getPEKeyword_Value();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEDataTypeImpl <em>PE Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEDataTypeImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEDataType()
		 * @generated
		 */
		public static final EClass PE_DATA_TYPE = eINSTANCE.getPEDataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_DATA_TYPE__VALUE = eINSTANCE.getPEDataType_Value();

		/**
		 * The meta object literal for the '{@link org.mar9000.symboltable.Symbol <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.symboltable.Symbol
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getSymbol()
		 * @generated
		 */
		public static final EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEBuiltinTypeImpl <em>PE Builtin Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEBuiltinTypeImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEBuiltinType()
		 * @generated
		 */
		public static final EClass PE_BUILTIN_TYPE = eINSTANCE.getPEBuiltinType();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEPropertyImpl <em>PE Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEPropertyImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEProperty()
		 * @generated
		 */
		public static final EClass PE_PROPERTY = eINSTANCE.getPEProperty();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_PROPERTY__PRIMITIVE_TYPE = eINSTANCE.getPEProperty_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_PROPERTY__MANDATORY = eINSTANCE.getPEProperty_Mandatory();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEConstantImpl <em>PE Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEConstantImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEConstant()
		 * @generated
		 */
		public static final EClass PE_CONSTANT = eINSTANCE.getPEConstant();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEGroupImpl <em>PE Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEGroupImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEGroup()
		 * @generated
		 */
		public static final EClass PE_GROUP = eINSTANCE.getPEGroup();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_GROUP__ELEMENTS = eINSTANCE.getPEGroup_Elements();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEChildImpl <em>PE Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEChildImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEChild()
		 * @generated
		 */
		public static final EClass PE_CHILD = eINSTANCE.getPEChild();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PE_CHILD__NODE_TYPE = eINSTANCE.getPEChild_NodeType();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEProjectionImpl <em>PE Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEProjectionImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEProjection()
		 * @generated
		 */
		public static final EClass PE_PROJECTION = eINSTANCE.getPEProjection();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PESingleCellProjectionImpl <em>PE Single Cell Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PESingleCellProjectionImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPESingleCellProjection()
		 * @generated
		 */
		public static final EClass PE_SINGLE_CELL_PROJECTION = eINSTANCE.getPESingleCellProjection();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEChildEditorProjectionImpl <em>PE Child Editor Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEChildEditorProjectionImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEChildEditorProjection()
		 * @generated
		 */
		public static final EClass PE_CHILD_EDITOR_PROJECTION = eINSTANCE.getPEChildEditorProjection();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.impl.PEListProjectionImpl <em>PE List Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.impl.PEListProjectionImpl
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEListProjection()
		 * @generated
		 */
		public static final EClass PE_LIST_PROJECTION = eINSTANCE.getPEListProjection();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_LIST_PROJECTION__PREFIX = eINSTANCE.getPEListProjection_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_LIST_PROJECTION__SUFFIX = eINSTANCE.getPEListProjection_Suffix();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_LIST_PROJECTION__SEPARATOR = eINSTANCE.getPEListProjection_Separator();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PE_LIST_PROJECTION__LAYOUT = eINSTANCE.getPEListProjection_Layout();

		/**
		 * The meta object literal for the '{@link org.mar9000.pe.ecore.PEElementCardinality <em>PE Element Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mar9000.pe.ecore.PEElementCardinality
		 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl#getPEElementCardinality()
		 * @generated
		 */
		public static final EEnum PE_ELEMENT_CARDINALITY = eINSTANCE.getPEElementCardinality();

	}

} //EcorePackageImpl

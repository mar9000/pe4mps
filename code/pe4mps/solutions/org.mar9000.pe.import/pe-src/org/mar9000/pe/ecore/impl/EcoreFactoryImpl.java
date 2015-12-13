/**
 */
package org.mar9000.pe.ecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mar9000.pe.ecore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcoreFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreFactoryImpl init() {
		try {
			EcoreFactoryImpl theEcoreFactory = (EcoreFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(EcorePackageImpl.eNS_URI);
			if (theEcoreFactory != null) {
				return theEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcorePackageImpl.PE_LANGUAGE: return (EObject)createPELanguage();
			case EcorePackageImpl.PE_EXTENSION: return (EObject)createPEExtension();
			case EcorePackageImpl.PE_NODE_TYPE: return (EObject)createPENodeType();
			case EcorePackageImpl.PE_ELEMENT_ATTRIBUTE: return (EObject)createPEElementAttribute();
			case EcorePackageImpl.PE_FLAG: return (EObject)createPEFlag();
			case EcorePackageImpl.PE_ENUM_NODE: return (EObject)createPEEnumNode();
			case EcorePackageImpl.PE_ENUM_VALUE: return (EObject)createPEEnumValue();
			case EcorePackageImpl.PE_PRIMITIVE_TYPE: return (EObject)createPEPrimitiveType();
			case EcorePackageImpl.PE_KEYWORDS: return (EObject)createPEKeywords();
			case EcorePackageImpl.PE_KEYWORD: return (EObject)createPEKeyword();
			case EcorePackageImpl.PE_DATA_TYPE: return (EObject)createPEDataType();
			case EcorePackageImpl.PE_BUILTIN_TYPE: return (EObject)createPEBuiltinType();
			case EcorePackageImpl.PE_PROPERTY: return (EObject)createPEProperty();
			case EcorePackageImpl.PE_CONSTANT: return (EObject)createPEConstant();
			case EcorePackageImpl.PE_GROUP: return (EObject)createPEGroup();
			case EcorePackageImpl.PE_CHILD: return (EObject)createPEChild();
			case EcorePackageImpl.PE_CHILD_EDITOR_PROJECTION: return (EObject)createPEChildEditorProjection();
			case EcorePackageImpl.PE_LIST_PROJECTION: return (EObject)createPEListProjection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EcorePackageImpl.PE_ELEMENT_CARDINALITY:
				return createPEElementCardinalityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EcorePackageImpl.PE_ELEMENT_CARDINALITY:
				return convertPEElementCardinalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PELanguage createPELanguage() {
		PELanguageImpl peLanguage = new PELanguageImpl();
		return peLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEExtension createPEExtension() {
		PEExtensionImpl peExtension = new PEExtensionImpl();
		return peExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PENodeType createPENodeType() {
		PENodeTypeImpl peNodeType = new PENodeTypeImpl();
		return peNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEElementAttribute createPEElementAttribute() {
		PEElementAttributeImpl peElementAttribute = new PEElementAttributeImpl();
		return peElementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEFlag createPEFlag() {
		PEFlagImpl peFlag = new PEFlagImpl();
		return peFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEEnumNode createPEEnumNode() {
		PEEnumNodeImpl peEnumNode = new PEEnumNodeImpl();
		return peEnumNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEEnumValue createPEEnumValue() {
		PEEnumValueImpl peEnumValue = new PEEnumValueImpl();
		return peEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEPrimitiveType createPEPrimitiveType() {
		PEPrimitiveTypeImpl pePrimitiveType = new PEPrimitiveTypeImpl();
		return pePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEKeywords createPEKeywords() {
		PEKeywordsImpl peKeywords = new PEKeywordsImpl();
		return peKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEKeyword createPEKeyword() {
		PEKeywordImpl peKeyword = new PEKeywordImpl();
		return peKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEDataType createPEDataType() {
		PEDataTypeImpl peDataType = new PEDataTypeImpl();
		return peDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEBuiltinType createPEBuiltinType() {
		PEBuiltinTypeImpl peBuiltinType = new PEBuiltinTypeImpl();
		return peBuiltinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEProperty createPEProperty() {
		PEPropertyImpl peProperty = new PEPropertyImpl();
		return peProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEConstant createPEConstant() {
		PEConstantImpl peConstant = new PEConstantImpl();
		return peConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEGroup createPEGroup() {
		PEGroupImpl peGroup = new PEGroupImpl();
		return peGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEChild createPEChild() {
		PEChildImpl peChild = new PEChildImpl();
		return peChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEChildEditorProjection createPEChildEditorProjection() {
		PEChildEditorProjectionImpl peChildEditorProjection = new PEChildEditorProjectionImpl();
		return peChildEditorProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEListProjection createPEListProjection() {
		PEListProjectionImpl peListProjection = new PEListProjectionImpl();
		return peListProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEElementCardinality createPEElementCardinalityFromString(EDataType eDataType, String initialValue) {
		PEElementCardinality result = PEElementCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPEElementCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorePackageImpl getEcorePackage() {
		return (EcorePackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorePackageImpl getPackage() {
		return EcorePackageImpl.eINSTANCE;
	}

} //EcoreFactoryImpl

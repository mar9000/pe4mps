/**
 */
package org.mar9000.pe.ecore.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.mar9000.pe.ecore.*;
import org.mar9000.pe.ecore.impl.EcorePackageImpl;
import org.mar9000.symboltable.Symbol;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl
 * @generated
 */
public class EcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcorePackageImpl modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcorePackageImpl.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreSwitch<Adapter> modelSwitch =
		new EcoreSwitch<Adapter>() {
			@Override
			public Adapter casePELanguage(PELanguage object) {
				return createPELanguageAdapter();
			}
			@Override
			public Adapter casePEExtension(PEExtension object) {
				return createPEExtensionAdapter();
			}
			@Override
			public Adapter casePEDeclaration(PEDeclaration object) {
				return createPEDeclarationAdapter();
			}
			@Override
			public Adapter casePENodeType(PENodeType object) {
				return createPENodeTypeAdapter();
			}
			@Override
			public Adapter casePEElement(PEElement object) {
				return createPEElementAdapter();
			}
			@Override
			public Adapter casePEElementAttribute(PEElementAttribute object) {
				return createPEElementAttributeAdapter();
			}
			@Override
			public Adapter casePEFlag(PEFlag object) {
				return createPEFlagAdapter();
			}
			@Override
			public Adapter casePEEnumNode(PEEnumNode object) {
				return createPEEnumNodeAdapter();
			}
			@Override
			public Adapter casePEEnumValue(PEEnumValue object) {
				return createPEEnumValueAdapter();
			}
			@Override
			public Adapter casePEPrimitiveType(PEPrimitiveType object) {
				return createPEPrimitiveTypeAdapter();
			}
			@Override
			public Adapter casePEKeywords(PEKeywords object) {
				return createPEKeywordsAdapter();
			}
			@Override
			public Adapter casePEKeyword(PEKeyword object) {
				return createPEKeywordAdapter();
			}
			@Override
			public Adapter casePEDataType(PEDataType object) {
				return createPEDataTypeAdapter();
			}
			@Override
			public Adapter caseSymbol(Symbol object) {
				return createSymbolAdapter();
			}
			@Override
			public Adapter casePEBuiltinType(PEBuiltinType object) {
				return createPEBuiltinTypeAdapter();
			}
			@Override
			public Adapter casePEProperty(PEProperty object) {
				return createPEPropertyAdapter();
			}
			@Override
			public Adapter casePEConstant(PEConstant object) {
				return createPEConstantAdapter();
			}
			@Override
			public Adapter casePEGroup(PEGroup object) {
				return createPEGroupAdapter();
			}
			@Override
			public Adapter casePEChild(PEChild object) {
				return createPEChildAdapter();
			}
			@Override
			public Adapter casePEProjection(PEProjection object) {
				return createPEProjectionAdapter();
			}
			@Override
			public Adapter casePESingleCellProjection(PESingleCellProjection object) {
				return createPESingleCellProjectionAdapter();
			}
			@Override
			public Adapter casePEChildEditorProjection(PEChildEditorProjection object) {
				return createPEChildEditorProjectionAdapter();
			}
			@Override
			public Adapter casePEListProjection(PEListProjection object) {
				return createPEListProjectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PELanguage <em>PE Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PELanguage
	 * @generated
	 */
	public Adapter createPELanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEExtension <em>PE Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEExtension
	 * @generated
	 */
	public Adapter createPEExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEDeclaration <em>PE Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEDeclaration
	 * @generated
	 */
	public Adapter createPEDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PENodeType <em>PE Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PENodeType
	 * @generated
	 */
	public Adapter createPENodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEElement <em>PE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEElement
	 * @generated
	 */
	public Adapter createPEElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEElementAttribute <em>PE Element Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEElementAttribute
	 * @generated
	 */
	public Adapter createPEElementAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEFlag <em>PE Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEFlag
	 * @generated
	 */
	public Adapter createPEFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEEnumNode <em>PE Enum Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEEnumNode
	 * @generated
	 */
	public Adapter createPEEnumNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEEnumValue <em>PE Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEEnumValue
	 * @generated
	 */
	public Adapter createPEEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEPrimitiveType <em>PE Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEPrimitiveType
	 * @generated
	 */
	public Adapter createPEPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEKeywords <em>PE Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEKeywords
	 * @generated
	 */
	public Adapter createPEKeywordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEKeyword <em>PE Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEKeyword
	 * @generated
	 */
	public Adapter createPEKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEDataType <em>PE Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEDataType
	 * @generated
	 */
	public Adapter createPEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.symboltable.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.symboltable.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEBuiltinType <em>PE Builtin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEBuiltinType
	 * @generated
	 */
	public Adapter createPEBuiltinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEProperty <em>PE Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEProperty
	 * @generated
	 */
	public Adapter createPEPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEConstant <em>PE Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEConstant
	 * @generated
	 */
	public Adapter createPEConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEGroup <em>PE Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEGroup
	 * @generated
	 */
	public Adapter createPEGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEChild <em>PE Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEChild
	 * @generated
	 */
	public Adapter createPEChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEProjection <em>PE Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEProjection
	 * @generated
	 */
	public Adapter createPEProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PESingleCellProjection <em>PE Single Cell Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PESingleCellProjection
	 * @generated
	 */
	public Adapter createPESingleCellProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEChildEditorProjection <em>PE Child Editor Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEChildEditorProjection
	 * @generated
	 */
	public Adapter createPEChildEditorProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mar9000.pe.ecore.PEListProjection <em>PE List Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mar9000.pe.ecore.PEListProjection
	 * @generated
	 */
	public Adapter createPEListProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcoreAdapterFactory

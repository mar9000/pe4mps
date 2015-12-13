/**
 */
package org.mar9000.pe.ecore.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.mar9000.pe.ecore.*;
import org.mar9000.pe.ecore.impl.EcorePackageImpl;
import org.mar9000.symboltable.Symbol;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mar9000.pe.ecore.impl.EcorePackageImpl
 * @generated
 */
public class EcoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcorePackageImpl modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = EcorePackageImpl.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcorePackageImpl.PE_LANGUAGE: {
				PELanguage peLanguage = (PELanguage)theEObject;
				T result = casePELanguage(peLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_EXTENSION: {
				PEExtension peExtension = (PEExtension)theEObject;
				T result = casePEExtension(peExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_DECLARATION: {
				PEDeclaration peDeclaration = (PEDeclaration)theEObject;
				T result = casePEDeclaration(peDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_NODE_TYPE: {
				PENodeType peNodeType = (PENodeType)theEObject;
				T result = casePENodeType(peNodeType);
				if (result == null) result = casePEDeclaration(peNodeType);
				if (result == null) result = caseSymbol(peNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_ELEMENT: {
				PEElement peElement = (PEElement)theEObject;
				T result = casePEElement(peElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_ELEMENT_ATTRIBUTE: {
				PEElementAttribute peElementAttribute = (PEElementAttribute)theEObject;
				T result = casePEElementAttribute(peElementAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_FLAG: {
				PEFlag peFlag = (PEFlag)theEObject;
				T result = casePEFlag(peFlag);
				if (result == null) result = casePEElement(peFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_ENUM_NODE: {
				PEEnumNode peEnumNode = (PEEnumNode)theEObject;
				T result = casePEEnumNode(peEnumNode);
				if (result == null) result = caseSymbol(peEnumNode);
				if (result == null) result = casePEPrimitiveType(peEnumNode);
				if (result == null) result = casePEDeclaration(peEnumNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_ENUM_VALUE: {
				PEEnumValue peEnumValue = (PEEnumValue)theEObject;
				T result = casePEEnumValue(peEnumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_PRIMITIVE_TYPE: {
				PEPrimitiveType pePrimitiveType = (PEPrimitiveType)theEObject;
				T result = casePEPrimitiveType(pePrimitiveType);
				if (result == null) result = casePEDeclaration(pePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_KEYWORDS: {
				PEKeywords peKeywords = (PEKeywords)theEObject;
				T result = casePEKeywords(peKeywords);
				if (result == null) result = casePEDeclaration(peKeywords);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_KEYWORD: {
				PEKeyword peKeyword = (PEKeyword)theEObject;
				T result = casePEKeyword(peKeyword);
				if (result == null) result = caseSymbol(peKeyword);
				if (result == null) result = casePEDeclaration(peKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_DATA_TYPE: {
				PEDataType peDataType = (PEDataType)theEObject;
				T result = casePEDataType(peDataType);
				if (result == null) result = casePEPrimitiveType(peDataType);
				if (result == null) result = caseSymbol(peDataType);
				if (result == null) result = casePEDeclaration(peDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.SYMBOL: {
				Symbol symbol = (Symbol)theEObject;
				T result = caseSymbol(symbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_BUILTIN_TYPE: {
				PEBuiltinType peBuiltinType = (PEBuiltinType)theEObject;
				T result = casePEBuiltinType(peBuiltinType);
				if (result == null) result = casePEPrimitiveType(peBuiltinType);
				if (result == null) result = caseSymbol(peBuiltinType);
				if (result == null) result = casePEDeclaration(peBuiltinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_PROPERTY: {
				PEProperty peProperty = (PEProperty)theEObject;
				T result = casePEProperty(peProperty);
				if (result == null) result = casePEElement(peProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_CONSTANT: {
				PEConstant peConstant = (PEConstant)theEObject;
				T result = casePEConstant(peConstant);
				if (result == null) result = casePEElement(peConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_GROUP: {
				PEGroup peGroup = (PEGroup)theEObject;
				T result = casePEGroup(peGroup);
				if (result == null) result = casePEElement(peGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_CHILD: {
				PEChild peChild = (PEChild)theEObject;
				T result = casePEChild(peChild);
				if (result == null) result = casePEElement(peChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_PROJECTION: {
				PEProjection peProjection = (PEProjection)theEObject;
				T result = casePEProjection(peProjection);
				if (result == null) result = casePEElementAttribute(peProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_SINGLE_CELL_PROJECTION: {
				PESingleCellProjection peSingleCellProjection = (PESingleCellProjection)theEObject;
				T result = casePESingleCellProjection(peSingleCellProjection);
				if (result == null) result = casePEProjection(peSingleCellProjection);
				if (result == null) result = casePEElementAttribute(peSingleCellProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_CHILD_EDITOR_PROJECTION: {
				PEChildEditorProjection peChildEditorProjection = (PEChildEditorProjection)theEObject;
				T result = casePEChildEditorProjection(peChildEditorProjection);
				if (result == null) result = casePESingleCellProjection(peChildEditorProjection);
				if (result == null) result = casePEProjection(peChildEditorProjection);
				if (result == null) result = casePEElementAttribute(peChildEditorProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.PE_LIST_PROJECTION: {
				PEListProjection peListProjection = (PEListProjection)theEObject;
				T result = casePEListProjection(peListProjection);
				if (result == null) result = casePEProjection(peListProjection);
				if (result == null) result = casePEElementAttribute(peListProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePELanguage(PELanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEExtension(PEExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEDeclaration(PEDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePENodeType(PENodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEElement(PEElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Element Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Element Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEElementAttribute(PEElementAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEFlag(PEFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Enum Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Enum Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEEnumNode(PEEnumNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEEnumValue(PEEnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEPrimitiveType(PEPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Keywords</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Keywords</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEKeywords(PEKeywords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEKeyword(PEKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEDataType(PEDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Builtin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Builtin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEBuiltinType(PEBuiltinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEProperty(PEProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEConstant(PEConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEGroup(PEGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEChild(PEChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEProjection(PEProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Single Cell Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Single Cell Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePESingleCellProjection(PESingleCellProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE Child Editor Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE Child Editor Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEChildEditorProjection(PEChildEditorProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PE List Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PE List Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEListProjection(PEListProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EcoreSwitch

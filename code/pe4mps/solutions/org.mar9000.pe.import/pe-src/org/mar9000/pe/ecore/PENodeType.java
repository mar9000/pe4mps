/**
 */
package org.mar9000.pe.ecore;

import java.util.List;
import org.mar9000.symboltable.Symbol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PE Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.PENodeType#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.PENodeType#getSuperNodeTypes <em>Super Node Types</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.PENodeType#isRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface PENodeType extends PEDeclaration, Symbol {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mar9000.pe.ecore.PEElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @generated
	 */
	List<PEElement> getElements();

	/**
	 * Returns the value of the '<em><b>Super Node Types</b></em>' reference list.
	 * The list contents are of type {@link org.mar9000.pe.ecore.PENodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Node Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Node Types</em>' reference list.
	 * @generated
	 */
	List<PENodeType> getSuperNodeTypes();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link org.mar9000.pe.ecore.PENodeType#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

} // PENodeType

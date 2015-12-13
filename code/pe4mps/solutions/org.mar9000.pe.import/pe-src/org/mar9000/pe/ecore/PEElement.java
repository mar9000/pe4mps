/**
 */
package org.mar9000.pe.ecore;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PE Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.PEElement#getName <em>Name</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.PEElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.PEElement#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface PEElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mar9000.pe.ecore.PEElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.mar9000.pe.ecore.PEElementAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @generated
	 */
	List<PEElementAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link org.mar9000.pe.ecore.PEElementCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.mar9000.pe.ecore.PEElementCardinality
	 * @see #setCardinality(PEElementCardinality)
	 * @generated
	 */
	PEElementCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.mar9000.pe.ecore.PEElement#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.mar9000.pe.ecore.PEElementCardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(PEElementCardinality value);

} // PEElement

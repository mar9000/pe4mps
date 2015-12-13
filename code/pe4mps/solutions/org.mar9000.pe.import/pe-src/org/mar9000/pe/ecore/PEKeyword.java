/**
 */
package org.mar9000.pe.ecore;

import org.mar9000.symboltable.Symbol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PE Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.PEKeyword#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface PEKeyword extends Symbol, PEDeclaration {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.mar9000.pe.ecore.PEKeyword#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PEKeyword

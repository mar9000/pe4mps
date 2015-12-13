/**
 */
package org.mar9000.pe.ecore;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PE Keywords</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.PEKeywords#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface PEKeywords extends PEDeclaration {
	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link org.mar9000.pe.ecore.PEKeyword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @generated
	 */
	List<PEKeyword> getKeywords();

} // PEKeywords

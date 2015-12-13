/**
 */
package org.mar9000.pe.ecore;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PE Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.PEExtension#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.PEExtension#getRootNodes <em>Root Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface PEExtension {
	/**
	 * Returns the value of the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Name</em>' attribute.
	 * @see #setExtensionName(String)
	 * @generated
	 */
	String getExtensionName();

	/**
	 * Sets the value of the '{@link org.mar9000.pe.ecore.PEExtension#getExtensionName <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Name</em>' attribute.
	 * @see #getExtensionName()
	 * @generated
	 */
	void setExtensionName(String value);

	/**
	 * Returns the value of the '<em><b>Root Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.mar9000.pe.ecore.PENodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Nodes</em>' reference list.
	 * @generated
	 */
	List<PENodeType> getRootNodes();

} // PEExtension

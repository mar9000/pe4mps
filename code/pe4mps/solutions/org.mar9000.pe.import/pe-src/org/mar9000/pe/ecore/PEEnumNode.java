/**
 */
package org.mar9000.pe.ecore;

import java.util.List;
import org.mar9000.symboltable.Symbol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PE Enum Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.PEEnumNode#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface PEEnumNode extends Symbol, PEPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.mar9000.pe.ecore.PEEnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @generated
	 */
	List<PEEnumValue> getValues();

} // PEEnumNode

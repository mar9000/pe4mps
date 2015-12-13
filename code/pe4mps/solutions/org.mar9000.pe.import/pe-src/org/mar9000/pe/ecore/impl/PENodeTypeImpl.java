/**
 */
package org.mar9000.pe.ecore.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mar9000.pe.ecore.PEElement;
import org.mar9000.pe.ecore.PENodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PE Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.impl.PENodeTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.impl.PENodeTypeImpl#getSuperNodeTypes <em>Super Node Types</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.impl.PENodeTypeImpl#isRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PENodeTypeImpl extends PEDeclarationImpl implements PENodeType {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PEElement> elements;

	/**
	 * The cached value of the '{@link #getSuperNodeTypes() <em>Super Node Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperNodeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PENodeType> superNodeTypes;

	/**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean root = ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PENodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.PE_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PEElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<PEElement>(PEElement.class, this, EcorePackageImpl.PE_NODE_TYPE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PENodeType> getSuperNodeTypes() {
		if (superNodeTypes == null) {
			superNodeTypes = new EObjectResolvingEList<PENodeType>(PENodeType.class, this, EcorePackageImpl.PE_NODE_TYPE__SUPER_NODE_TYPES);
		}
		return superNodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(boolean newRoot) {
		boolean oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackageImpl.PE_NODE_TYPE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.PE_NODE_TYPE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.PE_NODE_TYPE__ELEMENTS:
				return getElements();
			case EcorePackageImpl.PE_NODE_TYPE__SUPER_NODE_TYPES:
				return getSuperNodeTypes();
			case EcorePackageImpl.PE_NODE_TYPE__ROOT:
				return isRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.PE_NODE_TYPE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends PEElement>)newValue);
				return;
			case EcorePackageImpl.PE_NODE_TYPE__SUPER_NODE_TYPES:
				getSuperNodeTypes().clear();
				getSuperNodeTypes().addAll((Collection<? extends PENodeType>)newValue);
				return;
			case EcorePackageImpl.PE_NODE_TYPE__ROOT:
				setRoot((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackageImpl.PE_NODE_TYPE__ELEMENTS:
				getElements().clear();
				return;
			case EcorePackageImpl.PE_NODE_TYPE__SUPER_NODE_TYPES:
				getSuperNodeTypes().clear();
				return;
			case EcorePackageImpl.PE_NODE_TYPE__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorePackageImpl.PE_NODE_TYPE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EcorePackageImpl.PE_NODE_TYPE__SUPER_NODE_TYPES:
				return superNodeTypes != null && !superNodeTypes.isEmpty();
			case EcorePackageImpl.PE_NODE_TYPE__ROOT:
				return root != ROOT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (root: ");
		result.append(root);
		result.append(')');
		return result.toString();
	}

} //PENodeTypeImpl

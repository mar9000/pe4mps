/**
 */
package org.mar9000.pe.ecore.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.mar9000.pe.ecore.PEExtension;
import org.mar9000.pe.ecore.PENodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PE Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mar9000.pe.ecore.impl.PEExtensionImpl#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link org.mar9000.pe.ecore.impl.PEExtensionImpl#getRootNodes <em>Root Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PEExtensionImpl extends MinimalEObjectImpl.Container implements PEExtension {
	/**
	 * The default value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected String extensionName = EXTENSION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootNodes() <em>Root Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<PENodeType> rootNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PEExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.PE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionName() {
		return extensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionName(String newExtensionName) {
		String oldExtensionName = extensionName;
		extensionName = newExtensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackageImpl.PE_EXTENSION__EXTENSION_NAME, oldExtensionName, extensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PENodeType> getRootNodes() {
		if (rootNodes == null) {
			rootNodes = new EObjectResolvingEList<PENodeType>(PENodeType.class, this, EcorePackageImpl.PE_EXTENSION__ROOT_NODES);
		}
		return rootNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.PE_EXTENSION__EXTENSION_NAME:
				return getExtensionName();
			case EcorePackageImpl.PE_EXTENSION__ROOT_NODES:
				return getRootNodes();
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
			case EcorePackageImpl.PE_EXTENSION__EXTENSION_NAME:
				setExtensionName((String)newValue);
				return;
			case EcorePackageImpl.PE_EXTENSION__ROOT_NODES:
				getRootNodes().clear();
				getRootNodes().addAll((Collection<? extends PENodeType>)newValue);
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
			case EcorePackageImpl.PE_EXTENSION__EXTENSION_NAME:
				setExtensionName(EXTENSION_NAME_EDEFAULT);
				return;
			case EcorePackageImpl.PE_EXTENSION__ROOT_NODES:
				getRootNodes().clear();
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
			case EcorePackageImpl.PE_EXTENSION__EXTENSION_NAME:
				return EXTENSION_NAME_EDEFAULT == null ? extensionName != null : !EXTENSION_NAME_EDEFAULT.equals(extensionName);
			case EcorePackageImpl.PE_EXTENSION__ROOT_NODES:
				return rootNodes != null && !rootNodes.isEmpty();
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
		result.append(" (extensionName: ");
		result.append(extensionName);
		result.append(')');
		return result.toString();
	}

} //PEExtensionImpl

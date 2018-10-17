package com.bst.pmgr.entities;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * com.brainspeedtech.pmgr.entities. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects
 * back and forth from their String (XML) representation. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EntitiesModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EntitiesModelPackage.IDENTIFIABLE_CLASSIFIER_ID:
			return createIdentifiable();
		case EntitiesModelPackage.ACTIVITY_CLASSIFIER_ID:
			return createActivity();
		case EntitiesModelPackage.TOOL_CLASSIFIER_ID:
			return createTool();
		case EntitiesModelPackage.WORK_CLASSIFIER_ID:
			return createWork();
		case EntitiesModelPackage.AUDITABLE_CLASSIFIER_ID:
			return createAuditable();
		case EntitiesModelPackage.DOCUMENT_CLASSIFIER_ID:
			return createDocument();
		case EntitiesModelPackage.SECTION_CLASSIFIER_ID:
			return createSection();
		case EntitiesModelPackage.PMGRPERSON_CLASSIFIER_ID:
			return createPmgrPerson();
		case EntitiesModelPackage.PROCESS_CLASSIFIER_ID:
			return createProcess();
		case EntitiesModelPackage.PROCESSGROUP_CLASSIFIER_ID:
			return createProcessGroup();
		default:
			throw new IllegalArgumentException(
					"The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> ModelObject<T> createModelObject(EClass eClass, T adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case EntitiesModelPackage.IDENTIFIABLE_CLASSIFIER_ID:
			modelObject = new IdentifiableModelObject();
			break;
		case EntitiesModelPackage.ACTIVITY_CLASSIFIER_ID:
			modelObject = new ActivityModelObject();
			break;
		case EntitiesModelPackage.TOOL_CLASSIFIER_ID:
			modelObject = new ToolModelObject();
			break;
		case EntitiesModelPackage.WORK_CLASSIFIER_ID:
			modelObject = new WorkModelObject();
			break;
		case EntitiesModelPackage.AUDITABLE_CLASSIFIER_ID:
			modelObject = new AuditableModelObject();
			break;
		case EntitiesModelPackage.DOCUMENT_CLASSIFIER_ID:
			modelObject = new DocumentModelObject();
			break;
		case EntitiesModelPackage.SECTION_CLASSIFIER_ID:
			modelObject = new SectionModelObject();
			break;
		case EntitiesModelPackage.PMGRPERSON_CLASSIFIER_ID:
			modelObject = new PmgrPersonModelObject();
			break;
		case EntitiesModelPackage.PROCESS_CLASSIFIER_ID:
			modelObject = new ProcessModelObject();
			break;
		case EntitiesModelPackage.PROCESSGROUP_CLASSIFIER_ID:
			modelObject = new ProcessGroupModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return (ModelObject<T>) modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 *
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException(
				"The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If
	 * the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException(
				"The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Identifiable
	 * @generated
	 */
	public Identifiable createIdentifiable() {
		return new Identifiable();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Activity
	 * @generated
	 */
	public Activity createActivity() {
		return new Activity();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Tool
	 * @generated
	 */
	public Tool createTool() {
		return new Tool();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Work
	 * @generated
	 */
	public Work createWork() {
		return new Work();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Auditable
	 * @generated
	 */
	public Auditable createAuditable() {
		return new Auditable();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Document
	 * @generated
	 */
	public Document createDocument() {
		return new Document();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Section
	 * @generated
	 */
	public Section createSection() {
		return new Section();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass PmgrPerson
	 * @generated
	 */
	public PmgrPerson createPmgrPerson() {
		return new PmgrPerson();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Process
	 * @generated
	 */
	public Process createProcess() {
		return new Process();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass ProcessGroup
	 * @generated
	 */
	public ProcessGroup createProcessGroup() {
		return new ProcessGroup();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Identifiable</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class IdentifiableModelObject<E extends Identifiable> extends AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getIdentifiableEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Identifiable.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.IDENTIFIABLE_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.IDENTIFIABLE_NAME_FEATURE_ID:
				return getTarget().getName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.IDENTIFIABLE_ID_FEATURE_ID:
				getTarget().setId((Long) value);
				return;
			case EntitiesModelPackage.IDENTIFIABLE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Activity</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ActivityModelObject<E extends Activity> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getActivityEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Activity.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.ACTIVITY_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.ACTIVITY_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.ACTIVITY_TOOLS_FEATURE_ID:
				return getTarget().getTools();
			case EntitiesModelPackage.ACTIVITY_WORK_FEATURE_ID:
				return getTarget().getWork();
			case EntitiesModelPackage.ACTIVITY_METANAME_FEATURE_ID:
				return getTarget().getMetaName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.ACTIVITY_TOOLS_FEATURE_ID:
				getTarget().setTools((List<Tool>) value);
				return;
			case EntitiesModelPackage.ACTIVITY_WORK_FEATURE_ID:
				getTarget().setWork((Work) value);
				return;
			case EntitiesModelPackage.ACTIVITY_METANAME_FEATURE_ID:
				getTarget().setMetaName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.ACTIVITY_TOOLS_FEATURE_ID:
				return getTarget().addToTools((Tool) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.ACTIVITY_TOOLS_FEATURE_ID:
				return getTarget().removeFromTools((Tool) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Tool</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ToolModelObject<E extends Tool> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getToolEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Tool.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.TOOL_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.TOOL_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.TOOL_ACTIVITY_FEATURE_ID:
				return getTarget().getActivity();
			case EntitiesModelPackage.TOOL_WORK_FEATURE_ID:
				return getTarget().getWork();
			case EntitiesModelPackage.TOOL_METANAME_FEATURE_ID:
				return getTarget().getMetaName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.TOOL_ACTIVITY_FEATURE_ID:
				getTarget().setActivity((Activity) value);
				return;
			case EntitiesModelPackage.TOOL_WORK_FEATURE_ID:
				getTarget().setWork((Work) value);
				return;
			case EntitiesModelPackage.TOOL_METANAME_FEATURE_ID:
				getTarget().setMetaName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Work</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class WorkModelObject<E extends Work> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getWorkEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Work.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.WORK_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.WORK_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.WORK_TOOLS_FEATURE_ID:
				return getTarget().getTools();
			case EntitiesModelPackage.WORK_ACTIVITIES_FEATURE_ID:
				return getTarget().getActivities();
			case EntitiesModelPackage.WORK_PROCESSES_FEATURE_ID:
				return getTarget().getProcesses();
			case EntitiesModelPackage.WORK_DOCUMENTS_FEATURE_ID:
				return getTarget().getDocuments();
			case EntitiesModelPackage.WORK_PROCESSGROUPS_FEATURE_ID:
				return getTarget().getProcessGroups();
			case EntitiesModelPackage.WORK_PERSON_FEATURE_ID:
				return getTarget().getPerson();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.WORK_TOOLS_FEATURE_ID:
				getTarget().setTools((List<Tool>) value);
				return;
			case EntitiesModelPackage.WORK_ACTIVITIES_FEATURE_ID:
				getTarget().setActivities((List<Activity>) value);
				return;
			case EntitiesModelPackage.WORK_PROCESSES_FEATURE_ID:
				getTarget().setProcesses((List<Process>) value);
				return;
			case EntitiesModelPackage.WORK_DOCUMENTS_FEATURE_ID:
				getTarget().setDocuments((List<Document>) value);
				return;
			case EntitiesModelPackage.WORK_PROCESSGROUPS_FEATURE_ID:
				getTarget().setProcessGroups((List<ProcessGroup>) value);
				return;
			case EntitiesModelPackage.WORK_PERSON_FEATURE_ID:
				getTarget().setPerson((PmgrPerson) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.WORK_TOOLS_FEATURE_ID:
				return getTarget().addToTools((Tool) value);

			case EntitiesModelPackage.WORK_ACTIVITIES_FEATURE_ID:
				return getTarget().addToActivities((Activity) value);

			case EntitiesModelPackage.WORK_PROCESSES_FEATURE_ID:
				return getTarget().addToProcesses((Process) value);

			case EntitiesModelPackage.WORK_DOCUMENTS_FEATURE_ID:
				return getTarget().addToDocuments((Document) value);

			case EntitiesModelPackage.WORK_PROCESSGROUPS_FEATURE_ID:
				return getTarget().addToProcessGroups((ProcessGroup) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.WORK_TOOLS_FEATURE_ID:
				return getTarget().removeFromTools((Tool) value);

			case EntitiesModelPackage.WORK_ACTIVITIES_FEATURE_ID:
				return getTarget().removeFromActivities((Activity) value);

			case EntitiesModelPackage.WORK_PROCESSES_FEATURE_ID:
				return getTarget().removeFromProcesses((Process) value);

			case EntitiesModelPackage.WORK_DOCUMENTS_FEATURE_ID:
				return getTarget().removeFromDocuments((Document) value);

			case EntitiesModelPackage.WORK_PROCESSGROUPS_FEATURE_ID:
				return getTarget().removeFromProcessGroups((ProcessGroup) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Auditable</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class AuditableModelObject<E extends Auditable> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getAuditableEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Auditable.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.AUDITABLE_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.AUDITABLE_NAME_FEATURE_ID:
				return getTarget().getName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Document</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class DocumentModelObject<E extends Document> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getDocumentEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Document.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.DOCUMENT_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.DOCUMENT_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.DOCUMENT_WORK_FEATURE_ID:
				return getTarget().getWork();
			case EntitiesModelPackage.DOCUMENT_SECTIONS_FEATURE_ID:
				return getTarget().getSections();
			case EntitiesModelPackage.DOCUMENT_TOPLEVELSECTIONS_FEATURE_ID:
				return getTarget().getTopLevelSections();
			case EntitiesModelPackage.DOCUMENT_METANAME_FEATURE_ID:
				return getTarget().getMetaName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.DOCUMENT_WORK_FEATURE_ID:
				getTarget().setWork((Work) value);
				return;
			case EntitiesModelPackage.DOCUMENT_SECTIONS_FEATURE_ID:
				getTarget().setSections((List<Section>) value);
				return;
			case EntitiesModelPackage.DOCUMENT_TOPLEVELSECTIONS_FEATURE_ID:
				getTarget().setTopLevelSections((List<Section>) value);
				return;
			case EntitiesModelPackage.DOCUMENT_METANAME_FEATURE_ID:
				getTarget().setMetaName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.DOCUMENT_SECTIONS_FEATURE_ID:
				return getTarget().addToSections((Section) value);

			case EntitiesModelPackage.DOCUMENT_TOPLEVELSECTIONS_FEATURE_ID:
				return getTarget().addToTopLevelSections((Section) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.DOCUMENT_SECTIONS_FEATURE_ID:
				return getTarget().removeFromSections((Section) value);

			case EntitiesModelPackage.DOCUMENT_TOPLEVELSECTIONS_FEATURE_ID:
				return getTarget().removeFromTopLevelSections((Section) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Section</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class SectionModelObject<E extends Section> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getSectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Section.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.SECTION_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.SECTION_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.SECTION_DOCUMENT_FEATURE_ID:
				return getTarget().getDocument();
			case EntitiesModelPackage.SECTION_PARENTSECTION_FEATURE_ID:
				return getTarget().getParentSection();
			case EntitiesModelPackage.SECTION_CHILDSECTIONS_FEATURE_ID:
				return getTarget().getChildSections();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.SECTION_DOCUMENT_FEATURE_ID:
				getTarget().setDocument((Document) value);
				return;
			case EntitiesModelPackage.SECTION_PARENTSECTION_FEATURE_ID:
				getTarget().setParentSection((Section) value);
				return;
			case EntitiesModelPackage.SECTION_CHILDSECTIONS_FEATURE_ID:
				getTarget().setChildSections((List<Section>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.SECTION_CHILDSECTIONS_FEATURE_ID:
				return getTarget().addToChildSections((Section) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.SECTION_CHILDSECTIONS_FEATURE_ID:
				return getTarget().removeFromChildSections((Section) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>PmgrPerson</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class PmgrPersonModelObject<E extends PmgrPerson> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getPmgrPersonEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return PmgrPerson.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.PMGRPERSON_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.PMGRPERSON_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.PMGRPERSON_WORKS_FEATURE_ID:
				return getTarget().getWorks();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.PMGRPERSON_WORKS_FEATURE_ID:
				getTarget().setWorks((List<Work>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.PMGRPERSON_WORKS_FEATURE_ID:
				return getTarget().addToWorks((Work) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case EntitiesModelPackage.PMGRPERSON_WORKS_FEATURE_ID:
				return getTarget().removeFromWorks((Work) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Process</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ProcessModelObject<E extends Process> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getProcessEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Process.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.PROCESS_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.PROCESS_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.PROCESS_WORK_FEATURE_ID:
				return getTarget().getWork();
			case EntitiesModelPackage.PROCESS_METANAME_FEATURE_ID:
				return getTarget().getMetaName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.PROCESS_WORK_FEATURE_ID:
				getTarget().setWork((Work) value);
				return;
			case EntitiesModelPackage.PROCESS_METANAME_FEATURE_ID:
				getTarget().setMetaName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ProcessGroup</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ProcessGroupModelObject<E extends ProcessGroup> extends IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return EntitiesModelPackage.INSTANCE.getProcessGroupEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return EntitiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return ProcessGroup.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.PROCESSGROUP_ID_FEATURE_ID:
				return getTarget().getId();
			case EntitiesModelPackage.PROCESSGROUP_NAME_FEATURE_ID:
				return getTarget().getName();
			case EntitiesModelPackage.PROCESSGROUP_WORK_FEATURE_ID:
				return getTarget().getWork();
			case EntitiesModelPackage.PROCESSGROUP_METANAME_FEATURE_ID:
				return getTarget().getMetaName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case EntitiesModelPackage.PROCESSGROUP_WORK_FEATURE_ID:
				getTarget().setWork((Work) value);
				return;
			case EntitiesModelPackage.PROCESSGROUP_METANAME_FEATURE_ID:
				getTarget().setMetaName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}
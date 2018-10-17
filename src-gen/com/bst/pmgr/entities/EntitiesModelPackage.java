package com.bst.pmgr.entities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>entities</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EntitiesModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.brainspeedtech.com/pmgr/entities";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final EntitiesModelFactory MODELFACTORY = new EntitiesModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLE_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLE_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLE_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIVITY_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIVITY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIVITY_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIVITY_TOOLS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIVITY_WORK_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIVITY_METANAME_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOOL_CLASSIFIER_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOOL_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOOL_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOOL_ACTIVITY_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOOL_WORK_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOOL_METANAME_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_CLASSIFIER_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_TOOLS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_ACTIVITIES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_PROCESSES_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_DOCUMENTS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_PROCESSGROUPS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WORK_PERSON_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUDITABLE_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUDITABLE_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUDITABLE_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_WORK_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_SECTIONS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_TOPLEVELSECTIONS_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_METANAME_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SECTION_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SECTION_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SECTION_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SECTION_DOCUMENT_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SECTION_PARENTSECTION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SECTION_CHILDSECTIONS_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PMGRPERSON_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PMGRPERSON_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PMGRPERSON_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PMGRPERSON_WORKS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESS_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESS_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESS_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESS_WORK_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESS_METANAME_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESSGROUP_CLASSIFIER_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESSGROUP_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESSGROUP_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESSGROUP_WORK_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROCESSGROUP_METANAME_FEATURE_ID = 3;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final EntitiesModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static EntitiesModelPackage initialize() {

		if (isInitialized) {
			return (EntitiesModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
		}

		final EntitiesModelPackage modelPackage = new EntitiesModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Identifiable.class, modelPackage.getIdentifiableEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Activity.class, modelPackage.getActivityEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Tool.class, modelPackage.getToolEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Work.class, modelPackage.getWorkEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Auditable.class, modelPackage.getAuditableEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Document.class, modelPackage.getDocumentEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Section.class, modelPackage.getSectionEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(PmgrPerson.class, modelPackage.getPmgrPersonEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Process.class, modelPackage.getProcessEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(ProcessGroup.class, modelPackage.getProcessGroupEClass(),
				modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return the {@link EntitiesModelFactory} instance.
	 * @generated
	 */
	@Override
	public EntitiesModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "entities.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Identifiable</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Identifiable</b></em>'
	 * @generated
	 */
	public EClass getIdentifiableEClass() {
		return (EClass) getEPackage().getEClassifiers().get(IDENTIFIABLE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Identifiable.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Identifiable.id</b></em>'.
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute) getIdentifiableEClass().getEAllStructuralFeatures().get(IDENTIFIABLE_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Identifiable.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Identifiable.name</b></em>'.
	 * @generated
	 */
	public EAttribute getIdentifiable_Name() {
		return (EAttribute) getIdentifiableEClass().getEAllStructuralFeatures().get(IDENTIFIABLE_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Activity</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Activity</b></em>'
	 * @generated
	 */
	public EClass getActivityEClass() {
		return (EClass) getEPackage().getEClassifiers().get(ACTIVITY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Activity.tools</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Activity.tools</b></em>'.
	 * @generated
	 */
	public EReference getActivity_Tools() {
		return (EReference) getActivityEClass().getEAllStructuralFeatures().get(ACTIVITY_TOOLS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Activity.work</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Activity.work</b></em>'.
	 * @generated
	 */
	public EReference getActivity_Work() {
		return (EReference) getActivityEClass().getEAllStructuralFeatures().get(ACTIVITY_WORK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Activity.metaName</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Activity.metaName</b></em>'.
	 * @generated
	 */
	public EAttribute getActivity_MetaName() {
		return (EAttribute) getActivityEClass().getEAllStructuralFeatures().get(ACTIVITY_METANAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Tool</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Tool</b></em>'
	 * @generated
	 */
	public EClass getToolEClass() {
		return (EClass) getEPackage().getEClassifiers().get(TOOL_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Tool.activity</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Tool.activity</b></em>'.
	 * @generated
	 */
	public EReference getTool_Activity() {
		return (EReference) getToolEClass().getEAllStructuralFeatures().get(TOOL_ACTIVITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Tool.work</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Tool.work</b></em>'.
	 * @generated
	 */
	public EReference getTool_Work() {
		return (EReference) getToolEClass().getEAllStructuralFeatures().get(TOOL_WORK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Tool.metaName</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Tool.metaName</b></em>'.
	 * @generated
	 */
	public EAttribute getTool_MetaName() {
		return (EAttribute) getToolEClass().getEAllStructuralFeatures().get(TOOL_METANAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Work</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Work</b></em>'
	 * @generated
	 */
	public EClass getWorkEClass() {
		return (EClass) getEPackage().getEClassifiers().get(WORK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Work.tools</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Work.tools</b></em>'.
	 * @generated
	 */
	public EReference getWork_Tools() {
		return (EReference) getWorkEClass().getEAllStructuralFeatures().get(WORK_TOOLS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Work.activities</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Work.activities</b></em>'.
	 * @generated
	 */
	public EReference getWork_Activities() {
		return (EReference) getWorkEClass().getEAllStructuralFeatures().get(WORK_ACTIVITIES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Work.processes</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Work.processes</b></em>'.
	 * @generated
	 */
	public EReference getWork_Processes() {
		return (EReference) getWorkEClass().getEAllStructuralFeatures().get(WORK_PROCESSES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Work.documents</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Work.documents</b></em>'.
	 * @generated
	 */
	public EReference getWork_Documents() {
		return (EReference) getWorkEClass().getEAllStructuralFeatures().get(WORK_DOCUMENTS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Work.processGroups</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Work.processGroups</b></em>'.
	 * @generated
	 */
	public EReference getWork_ProcessGroups() {
		return (EReference) getWorkEClass().getEAllStructuralFeatures().get(WORK_PROCESSGROUPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Work.person</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Work.person</b></em>'.
	 * @generated
	 */
	public EReference getWork_Person() {
		return (EReference) getWorkEClass().getEAllStructuralFeatures().get(WORK_PERSON_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Auditable</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Auditable</b></em>'
	 * @generated
	 */
	public EClass getAuditableEClass() {
		return (EClass) getEPackage().getEClassifiers().get(AUDITABLE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Document</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Document</b></em>'
	 * @generated
	 */
	public EClass getDocumentEClass() {
		return (EClass) getEPackage().getEClassifiers().get(DOCUMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Document.work</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Document.work</b></em>'.
	 * @generated
	 */
	public EReference getDocument_Work() {
		return (EReference) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_WORK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Document.sections</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Document.sections</b></em>'.
	 * @generated
	 */
	public EReference getDocument_Sections() {
		return (EReference) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_SECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature}
	 * '<em><b>Document.topLevelSections</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Document.topLevelSections</b></em>'.
	 * @generated
	 */
	public EReference getDocument_TopLevelSections() {
		return (EReference) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_TOPLEVELSECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Document.metaName</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Document.metaName</b></em>'.
	 * @generated
	 */
	public EAttribute getDocument_MetaName() {
		return (EAttribute) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_METANAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Section</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Section</b></em>'
	 * @generated
	 */
	public EClass getSectionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(SECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Section.document</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Section.document</b></em>'.
	 * @generated
	 */
	public EReference getSection_Document() {
		return (EReference) getSectionEClass().getEAllStructuralFeatures().get(SECTION_DOCUMENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature}
	 * '<em><b>Section.parentSection</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Section.parentSection</b></em>'.
	 * @generated
	 */
	public EReference getSection_ParentSection() {
		return (EReference) getSectionEClass().getEAllStructuralFeatures().get(SECTION_PARENTSECTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature}
	 * '<em><b>Section.childSections</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Section.childSections</b></em>'.
	 * @generated
	 */
	public EReference getSection_ChildSections() {
		return (EReference) getSectionEClass().getEAllStructuralFeatures().get(SECTION_CHILDSECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PmgrPerson</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>PmgrPerson</b></em>'
	 * @generated
	 */
	public EClass getPmgrPersonEClass() {
		return (EClass) getEPackage().getEClassifiers().get(PMGRPERSON_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>PmgrPerson.works</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>PmgrPerson.works</b></em>'.
	 * @generated
	 */
	public EReference getPmgrPerson_Works() {
		return (EReference) getPmgrPersonEClass().getEAllStructuralFeatures().get(PMGRPERSON_WORKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Process</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Process</b></em>'
	 * @generated
	 */
	public EClass getProcessEClass() {
		return (EClass) getEPackage().getEClassifiers().get(PROCESS_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Process.work</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Process.work</b></em>'.
	 * @generated
	 */
	public EReference getProcess_Work() {
		return (EReference) getProcessEClass().getEAllStructuralFeatures().get(PROCESS_WORK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Process.metaName</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>Process.metaName</b></em>'.
	 * @generated
	 */
	public EAttribute getProcess_MetaName() {
		return (EAttribute) getProcessEClass().getEAllStructuralFeatures().get(PROCESS_METANAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ProcessGroup</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ProcessGroup</b></em>'
	 * @generated
	 */
	public EClass getProcessGroupEClass() {
		return (EClass) getEPackage().getEClassifiers().get(PROCESSGROUP_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ProcessGroup.work</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>ProcessGroup.work</b></em>'.
	 * @generated
	 */
	public EReference getProcessGroup_Work() {
		return (EReference) getProcessGroupEClass().getEAllStructuralFeatures().get(PROCESSGROUP_WORK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature}
	 * '<em><b>ProcessGroup.metaName</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}:
	 *         '<em><b>ProcessGroup.metaName</b></em>'.
	 * @generated
	 */
	public EAttribute getProcessGroup_MetaName() {
		return (EAttribute) getProcessGroupEClass().getEAllStructuralFeatures().get(PROCESSGROUP_METANAME_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case IDENTIFIABLE_CLASSIFIER_ID:
			return Identifiable.class;
		case ACTIVITY_CLASSIFIER_ID:
			return Activity.class;
		case TOOL_CLASSIFIER_ID:
			return Tool.class;
		case WORK_CLASSIFIER_ID:
			return Work.class;
		case AUDITABLE_CLASSIFIER_ID:
			return Auditable.class;
		case DOCUMENT_CLASSIFIER_ID:
			return Document.class;
		case SECTION_CLASSIFIER_ID:
			return Section.class;
		case PMGRPERSON_CLASSIFIER_ID:
			return PmgrPerson.class;
		case PROCESS_CLASSIFIER_ID:
			return Process.class;
		case PROCESSGROUP_CLASSIFIER_ID:
			return ProcessGroup.class;
		default:
			throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
		}
	}
}

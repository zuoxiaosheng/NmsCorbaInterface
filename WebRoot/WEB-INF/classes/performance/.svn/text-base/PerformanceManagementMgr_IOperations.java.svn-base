package performance;


/**
 * Generated from IDL interface "PerformanceManagementMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public interface PerformanceManagementMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void setPMCollectionPlan(performance.PMCollectionPlan_T[] pmCollectionPlan, org.omg.CORBA.IntHolder pmCollectionPlanID) throws globaldefs.ProcessingFailureException;
	void changePMCollectionPlan(int pmCollectionPlanID, performance.PMCollectionPlan_T[] pmCollectionPlan) throws globaldefs.ProcessingFailureException;
	void queryPMCollectionPlan(int pmCollectionPlanID, performance.PMCollectionPlanList_THolder pmCollectionPlan) throws globaldefs.ProcessingFailureException;
	void getAllPMCollectionPlan(performance.PMTaskList_THolder pmTaskList) throws globaldefs.ProcessingFailureException;
	void clearPMCollectionPlan(int pmCollectionPlanID) throws globaldefs.ProcessingFailureException;
	void getTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, performance.TCAParameters_THolder tcaParameter) throws globaldefs.ProcessingFailureException;
	void setTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, performance.TCAParameters_THolder tcaParameters) throws globaldefs.ProcessingFailureException;
	void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;
	void disablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void enablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void clearPMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void getAllPMPs(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException;
	void getTPHistoryPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;
	void clearSpecificPMData(performance.PMTPParamSelect_T[] pmTPParamSelectList, performance.PMTPParamSelectList_THolder failedTPParamSelectList) throws globaldefs.ProcessingFailureException;
	void getAllCurrentPMDataByCond(performance.PMTPParamSelect_T[] pmTPParamSelectList, int how_many, performance.PMData_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;
	void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, performance.PMTPParamSelect_T[] pmTPParamSelectList, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws globaldefs.ProcessingFailureException;
}

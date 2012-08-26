package performance;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PerformanceManagementMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public class PerformanceManagementMgr_IPOATie
	extends PerformanceManagementMgr_IPOA
{
	private PerformanceManagementMgr_IOperations _delegate;

	private POA _poa;
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public performance.PerformanceManagementMgr_I _this()
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
	}
	public PerformanceManagementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void getAllPMPs(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
	}

	public void enablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllPMCollectionPlan(performance.PMTaskList_THolder pmTaskList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPMCollectionPlan(pmTaskList);
	}

	public void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void queryPMCollectionPlan(int pmCollectionPlanID, performance.PMCollectionPlanList_THolder pmCollectionPlan) throws globaldefs.ProcessingFailureException
	{
_delegate.queryPMCollectionPlan(pmCollectionPlanID,pmCollectionPlan);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setPMCollectionPlan(performance.PMCollectionPlan_T[] pmCollectionPlan, org.omg.CORBA.IntHolder pmCollectionPlanID) throws globaldefs.ProcessingFailureException
	{
_delegate.setPMCollectionPlan(pmCollectionPlan,pmCollectionPlanID);
	}

	public void clearPMCollectionPlan(int pmCollectionPlanID) throws globaldefs.ProcessingFailureException
	{
_delegate.clearPMCollectionPlan(pmCollectionPlanID);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, performance.TCAParameters_THolder tcaParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void getAllCurrentPMDataByCond(performance.PMTPParamSelect_T[] pmTPParamSelectList, int how_many, performance.PMData_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMDataByCond(pmTPParamSelectList,how_many,pmDataList,pmIt);
	}

	public void disablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void getTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, performance.TCAParameters_THolder tcaParameter) throws globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void changePMCollectionPlan(int pmCollectionPlanID, performance.PMCollectionPlan_T[] pmCollectionPlan) throws globaldefs.ProcessingFailureException
	{
_delegate.changePMCollectionPlan(pmCollectionPlanID,pmCollectionPlan);
	}

	public void clearSpecificPMData(performance.PMTPParamSelect_T[] pmTPParamSelectList, performance.PMTPParamSelectList_THolder failedTPParamSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearSpecificPMData(pmTPParamSelectList,failedTPParamSelectList);
	}

	public void getTPHistoryPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void clearPMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, performance.PMTPParamSelect_T[] pmTPParamSelectList, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPParamSelectList,startTime,endTime,forceUpload);
	}

}

package multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "MultiLayerSubnetworkMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public class MultiLayerSubnetworkMgr_IPOATie
	extends MultiLayerSubnetworkMgr_IPOA
{
	private MultiLayerSubnetworkMgr_IOperations _delegate;

	private POA _poa;
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
	}
	public MultiLayerSubnetworkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiLayerSubnetworkMgr_IOperations delegate)
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
	public void getIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
	}

	public void setRoutesAdminState(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, subnetworkConnection.SNCState_THolder sncState) throws globaldefs.ProcessingFailureException
	{
_delegate.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
	}

	public void addConnections(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder connectionList, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
	}

	public void getAllTopologicalLinks(globaldefs.NameAndStringValue_T[] subnetName, topologicalLink.TopologicalLinkList_THolder topoList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,topoList);
	}

	public void getAllSubordinateRAidsWithConnection(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
	}

	public void createAndActivateSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,theSNC,errorReason);
	}

	public void deleteSNC(globaldefs.NameAndStringValue_T[] sncName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName);
	}

	public void activateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,theSNC,errorReason);
	}

	public void modifySNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,tpsToModify,newSNC,errorReason);
	}

	public void establishCall(callSNC.CallCreateData_T callCreateData, subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, subnetworkConnection.TPDataList_THolder tpsToModify, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections, subnetworkConnection.SNCCreateDataList_THolder connectionsNotCreated, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnections,connectionsNotCreated,partialSNCs,callErrorReason);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void deactivateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,theSNC,errorReason);
	}

	public void createSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,theSNC,errorReason);
	}

	public void getAllCallIdsWithTP(globaldefs.NameAndStringValue_T[] tPName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithTP(tPName,callIdList);
	}

	public void addRoute(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteCreateData_T createRoute, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
	}

	public void getAllSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getAllSubordinateMLSNs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws globaldefs.ProcessingFailureException
	{
_delegate.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
	}

	public void getAllCallIdsWithSNPPOrTNAName(globaldefs.NameAndStringValue_T SNPPOrTNAName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithSNPPOrTNAName(SNPPOrTNAName,callIdList);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] tPName, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void setSRG(java.lang.String srgId, int setOrRelase, globaldefs.NameAndStringValue_T[][] objectNames) throws globaldefs.ProcessingFailureException
	{
_delegate.setSRG(srgId,setOrRelase,objectNames);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void modifyDiversityAndCorouting(globaldefs.NameAndStringValue_T[] callName, callSNC.Diversity_T callDiversity, callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,callAndTopLevelConnections);
	}

	public void deactivateAndDeleteSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,theSNC,errorReason);
	}

	public void removeRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
	}

	public void getBackupRoutes(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.RouteList_THolder routeList) throws globaldefs.ProcessingFailureException
	{
_delegate.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
	}

	public void modifyCall(globaldefs.NameAndStringValue_T[] callName, callSNC.CallModifyData_T callModifyData, callSNC.Call_THolder modifiedCall) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyCall(callName,callModifyData,modifiedCall);
	}

	public void getAllTPPools(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void switchRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void releaseCall(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
	}

	public void removeConnections(globaldefs.NameAndStringValue_T[] callName, globaldefs.NameAndStringValue_T[][] connectionNamesList, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
	}

	public void getCallAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] callName, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setIntendedRoute(sncName,routeId,additionalInfo);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void getAllCallsAndTopLevelConnections(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void getMultiLayerSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void getCall(globaldefs.NameAndStringValue_T[] callName, callSNC.Call_THolder theCall) throws globaldefs.ProcessingFailureException
	{
_delegate.getCall(callName,theCall);
	}

	public void getCallAndTopLevelConnections(globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
	}

	public void getAllCallsAndTopLevelConnectionsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

}

package multiLayerSubnetwork;


/**
 * Generated from IDL interface "MultiLayerSubnetworkMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public interface MultiLayerSubnetworkMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTopologicalLinks(globaldefs.NameAndStringValue_T[] subnetName, topologicalLink.TopologicalLinkList_THolder topoList) throws globaldefs.ProcessingFailureException;
	void getMultiLayerSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException;
	void getAllSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;
	void getSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException;
	void createSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void activateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void createAndActivateSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteSNC(globaldefs.NameAndStringValue_T[] sncName) throws globaldefs.ProcessingFailureException;
	void deactivateAndDeleteSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllTPPools(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException;
	void modifySNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllCallsAndTopLevelConnections(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException;
	void getAllCallsAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException;
	void getAllCallsAndTopLevelConnectionsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException;
	void getAllCallsAndTopLevelConnectionsAndSNCsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException;
	void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] tPName, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException;
	void getAllCallIdsWithTP(globaldefs.NameAndStringValue_T[] tPName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException;
	void getAllCallIdsWithSNPPOrTNAName(globaldefs.NameAndStringValue_T SNPPOrTNAName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException;
	void getCallAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] callName, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws globaldefs.ProcessingFailureException;
	void establishCall(callSNC.CallCreateData_T callCreateData, subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, subnetworkConnection.TPDataList_THolder tpsToModify, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections, subnetworkConnection.SNCCreateDataList_THolder connectionsNotCreated, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws globaldefs.ProcessingFailureException;
	void modifyCall(globaldefs.NameAndStringValue_T[] callName, callSNC.CallModifyData_T callModifyData, callSNC.Call_THolder modifiedCall) throws globaldefs.ProcessingFailureException;
	void releaseCall(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getCall(globaldefs.NameAndStringValue_T[] callName, callSNC.Call_THolder theCall) throws globaldefs.ProcessingFailureException;
	void addConnections(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder connectionList, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void removeConnections(globaldefs.NameAndStringValue_T[] callName, globaldefs.NameAndStringValue_T[][] connectionNamesList, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getConnectionsAndRouteDetails(java.lang.String callID, globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws globaldefs.ProcessingFailureException;
	void modifyDiversityAndCorouting(globaldefs.NameAndStringValue_T[] callName, callSNC.Diversity_T callDiversity, callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException;
	void getBackupRoutes(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.RouteList_THolder routeList) throws globaldefs.ProcessingFailureException;
	void switchRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void addRoute(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteCreateData_T createRoute, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void removeRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void setIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void getIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException;
	void setRoutesAdminState(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, subnetworkConnection.SNCState_THolder sncState) throws globaldefs.ProcessingFailureException;
	void getAllSubordinateRAidsWithConnection(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws globaldefs.ProcessingFailureException;
	void getCallAndTopLevelConnections(globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException;
	void getAllSubordinateMLSNs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws globaldefs.ProcessingFailureException;
	void setSRG(java.lang.String srgId, int setOrRelase, globaldefs.NameAndStringValue_T[][] objectNames) throws globaldefs.ProcessingFailureException;
}

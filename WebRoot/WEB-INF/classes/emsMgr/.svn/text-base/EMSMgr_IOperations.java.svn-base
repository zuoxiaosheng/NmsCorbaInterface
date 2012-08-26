package emsMgr;


/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public interface EMSMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(multiLayerSubnetwork.SubnetworkList_THolder sList) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(topologicalLink.TopologicalLinkList_THolder topoList) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(globaldefs.NameAndStringValue_T[] name, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException;
	void createVLAN(java.lang.String vlanID, java.lang.String userLabel, emsMgr.LogicalPort_T[] logicalPortList, emsMgr.VLAN_THolder vlan) throws globaldefs.ProcessingFailureException;
	void deleteVLAN(globaldefs.NameAndStringValue_T[] vlanName) throws globaldefs.ProcessingFailureException;
	void getVLANs(globaldefs.NameAndStringValue_T[][] vlanNameList, emsMgr.VLANList_THolder vlanList) throws globaldefs.ProcessingFailureException;
	void createEthernetService(emsMgr.EthernetServiceCreateData_T createData, emsMgr.EthernetService_THolder ethernetService) throws globaldefs.ProcessingFailureException;
	void deleteEthernetService(globaldefs.NameAndStringValue_T[] ethernetServiceName) throws globaldefs.ProcessingFailureException;
	void getEthernetServices(globaldefs.NameAndStringValue_T[][] serviceNameList, emsMgr.EthernetServiceList_THolder serviceList) throws globaldefs.ProcessingFailureException;
	void getRPRNodesStatus(globaldefs.NameAndStringValue_T[][] nodeNameList, emsMgr.RPRNodeStatusList_THolder rprnodeStatusList) throws globaldefs.ProcessingFailureException;
	void createVB(java.lang.String userLabel, java.lang.String vbID, java.lang.String cID, emsMgr.LogicalPort_T[] logicalPortList, emsMgr.VB_THolder vb) throws globaldefs.ProcessingFailureException;
	void deleteVB(globaldefs.NameAndStringValue_T[] vbName) throws globaldefs.ProcessingFailureException;
	void getVBs(globaldefs.NameAndStringValue_T[][] vbNameList, emsMgr.VBList_THolder vbList) throws globaldefs.ProcessingFailureException;
	void clearAlarms(notifications.AlarmOrTCAIdentifier_T[] clearedAlarmIDList, java.lang.String clearState, java.lang.String clearUser, java.lang.String clearTime, notifications.AlarmAndTCAIDList_THolder failedClearAlarmIDList) throws globaldefs.ProcessingFailureException;
	void acknowledgeAlarms(notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws globaldefs.ProcessingFailureException;
	void unacknowledgeAlarms(notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws globaldefs.ProcessingFailureException;
	void createASAP(aSAP.ASAPCreateModifyData_T newASAPCreateData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void deleteASAP(globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void assignASAP(globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void deassignASAP(globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void modifyASAP(globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAPCreateModifyData_T aSAPModifyData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void getAllASAPs(int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException;
	void getAllASAPNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getASAP(globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAP_THolder anASAP) throws globaldefs.ProcessingFailureException;
	void getASAPbyResource(globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException;
	void getASAPAssociatedResourceNames(globaldefs.NameAndStringValue_T[] aSAPName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTopologicalSubnetworksByLayer(int nLayer, multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws globaldefs.ProcessingFailureException;
	void getTopologicalSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.TopologicalSubnetwork_THolder topoSubnetwork) throws globaldefs.ProcessingFailureException;
}

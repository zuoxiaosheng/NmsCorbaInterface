package managedElementManager;


/**
 * Generated from IDL interface "ManagedElementMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:00
 */

public interface ManagedElementMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(managedElement.ManagedElementList_THolder meList) throws globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getAllPTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getManagedElement(globaldefs.NameAndStringValue_T[] managedElementName, managedElement.ManagedElement_THolder me) throws globaldefs.ProcessingFailureException;
	void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder crossConnections, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException;
	void setCrossConnections(subnetworkConnection.CrossConnect_T[] add, subnetworkConnection.CrossConnect_T[] remove, subnetworkConnection.CrossConnectList_THolder addSuccess, subnetworkConnection.CrossConnectList_THolder removeSuccess) throws globaldefs.ProcessingFailureException;
	void activateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedList, subnetworkConnection.CrossConnectList_THolder failedList) throws globaldefs.ProcessingFailureException;
	void deactivateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedList, subnetworkConnection.CrossConnectList_THolder failedList) throws globaldefs.ProcessingFailureException;
	void createCrossConnections(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] add, subnetworkConnection.CrossConnectList_THolder addSuccess) throws globaldefs.ProcessingFailureException;
	void deleteCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedList, subnetworkConnection.CrossConnectList_THolder failedList) throws globaldefs.ProcessingFailureException;
	void getCrossConnection(globaldefs.NameAndStringValue_T[] ccName, subnetworkConnection.CrossConnect_THolder crossConnection) throws globaldefs.ProcessingFailureException;
	void getMEconfigData(globaldefs.NameAndStringValue_T[] name, java.lang.String[] configDataTypes, managedElementManager.MEConfigData_THolder meConfigDatas) throws globaldefs.ProcessingFailureException;
	void setTPData(subnetworkConnection.TPData_T tpInfo, terminationPoint.TerminationPoint_THolder modifiedTP) throws globaldefs.ProcessingFailureException;
	void getContainedCurrentTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPoint_THolder tp) throws globaldefs.ProcessingFailureException;
	void getContainedPotentialTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedPotentialTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getContainedInUseTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedInUseTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getMECoordinates(globaldefs.NameAndStringValue_T[][] meNameList, managedElement.MECoordinateList_THolder meCoordList) throws globaldefs.ProcessingFailureException;
	void getMEClockCoordinates(globaldefs.NameAndStringValue_T[][] meNameList, managedElement.MECoordinateList_THolder meCoordList) throws globaldefs.ProcessingFailureException;
}

package equipment;


/**
 * Generated from IDL interface "EquipmentInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public interface EquipmentInventoryMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getContainedEquipment(globaldefs.NameAndStringValue_T[] equipmentHolderName, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException;
	void getAllEquipment(globaldefs.NameAndStringValue_T[] meName, equipment.EquipmentOrHolderList_THolder eqList) throws globaldefs.ProcessingFailureException;
	void getAllEquipmentNames(globaldefs.NameAndStringValue_T[] meName, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getAllSupportedPTPs(globaldefs.NameAndStringValue_T[] equipmentName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getEquipmentVersion(globaldefs.NameAndStringValue_T[][] objNameList, globaldefs.NameAndNVSList_THolder objVersionList) throws globaldefs.ProcessingFailureException;
}

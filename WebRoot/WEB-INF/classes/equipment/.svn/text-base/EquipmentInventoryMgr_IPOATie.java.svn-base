package equipment;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EquipmentInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public class EquipmentInventoryMgr_IPOATie
	extends EquipmentInventoryMgr_IPOA
{
	private EquipmentInventoryMgr_IOperations _delegate;

	private POA _poa;
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public equipment.EquipmentInventoryMgr_I _this()
	{
		return equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object());
	}
	public equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public EquipmentInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentInventoryMgr_IOperations delegate)
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
	public void getAllSupportedPTPs(globaldefs.NameAndStringValue_T[] equipmentName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPs(equipmentName,tpList);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getContainedEquipment(globaldefs.NameAndStringValue_T[] equipmentHolderName, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedEquipment(equipmentHolderName,equipmentOrHolderList);
	}

	public void getAllEquipment(globaldefs.NameAndStringValue_T[] meName, equipment.EquipmentOrHolderList_THolder eqList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipment(meName,eqList);
	}

	public void getAllEquipmentNames(globaldefs.NameAndStringValue_T[] meName, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentNames(meName,nameList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getEquipmentVersion(globaldefs.NameAndStringValue_T[][] objNameList, globaldefs.NameAndNVSList_THolder objVersionList) throws globaldefs.ProcessingFailureException
	{
_delegate.getEquipmentVersion(objNameList,objVersionList);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}

package emsMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransmissionSystemMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public class TransmissionSystemMgr_IPOATie
	extends TransmissionSystemMgr_IPOA
{
	private TransmissionSystemMgr_IOperations _delegate;

	private POA _poa;
	public TransmissionSystemMgr_IPOATie(TransmissionSystemMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionSystemMgr_IPOATie(TransmissionSystemMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsMgr.TransmissionSystemMgr_I _this()
	{
		return emsMgr.TransmissionSystemMgr_IHelper.narrow(_this_object());
	}
	public emsMgr.TransmissionSystemMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return emsMgr.TransmissionSystemMgr_IHelper.narrow(_this_object(orb));
	}
	public TransmissionSystemMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionSystemMgr_IOperations delegate)
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
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getTransmissionSytems(globaldefs.NameAndStringValue_T[][] nameList, emsMgr.TransmissionSystemList_THolder transmissionSystemList) throws globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionSytems(nameList,transmissionSystemList);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

}

package common;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Common_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:51
 */

public class Common_IPOATie
	extends Common_IPOA
{
	private Common_IOperations _delegate;

	private POA _poa;
	public Common_IPOATie(Common_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Common_IPOATie(Common_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public common.Common_I _this()
	{
		return common.Common_IHelper.narrow(_this_object());
	}
	public common.Common_I _this(org.omg.CORBA.ORB orb)
	{
		return common.Common_IHelper.narrow(_this_object(orb));
	}
	public Common_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Common_IOperations delegate)
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
	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

}

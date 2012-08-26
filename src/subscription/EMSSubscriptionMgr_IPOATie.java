package subscription;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EMSSubscriptionMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:51:58
 */

public class EMSSubscriptionMgr_IPOATie
	extends EMSSubscriptionMgr_IPOA
{
	private EMSSubscriptionMgr_IOperations _delegate;

	private POA _poa;
	public EMSSubscriptionMgr_IPOATie(EMSSubscriptionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSSubscriptionMgr_IPOATie(EMSSubscriptionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public subscription.EMSSubscriptionMgr_I _this()
	{
		return subscription.EMSSubscriptionMgr_IHelper.narrow(_this_object());
	}
	public subscription.EMSSubscriptionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return subscription.EMSSubscriptionMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSSubscriptionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSSubscriptionMgr_IOperations delegate)
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

	public boolean suspendSubscription(int subscriptionId) throws globaldefs.ProcessingFailureException
	{
		return _delegate.suspendSubscription(subscriptionId);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public boolean resumeSubscription(int subscriptionId) throws globaldefs.ProcessingFailureException
	{
		return _delegate.resumeSubscription(subscriptionId);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public boolean unsubscribe(int subscriptionId) throws globaldefs.ProcessingFailureException
	{
		return _delegate.unsubscribe(subscriptionId);
	}

}

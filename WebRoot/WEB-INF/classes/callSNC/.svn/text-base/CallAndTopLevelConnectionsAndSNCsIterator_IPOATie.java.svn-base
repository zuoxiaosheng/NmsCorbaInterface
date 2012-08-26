package callSNC;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CallAndTopLevelConnectionsAndSNCsIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public class CallAndTopLevelConnectionsAndSNCsIterator_IPOATie
	extends CallAndTopLevelConnectionsAndSNCsIterator_IPOA
{
	private CallAndTopLevelConnectionsAndSNCsIterator_IOperations _delegate;

	private POA _poa;
	public CallAndTopLevelConnectionsAndSNCsIterator_IPOATie(CallAndTopLevelConnectionsAndSNCsIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CallAndTopLevelConnectionsAndSNCsIterator_IPOATie(CallAndTopLevelConnectionsAndSNCsIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I _this()
	{
		return callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.narrow(_this_object());
	}
	public callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.narrow(_this_object(orb));
	}
	public CallAndTopLevelConnectionsAndSNCsIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CallAndTopLevelConnectionsAndSNCsIterator_IOperations delegate)
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
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,callAndTopLevelConnectionsAndSNCsList);
	}

}

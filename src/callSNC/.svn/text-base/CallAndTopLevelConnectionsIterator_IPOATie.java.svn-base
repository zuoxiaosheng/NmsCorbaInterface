package callSNC;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CallAndTopLevelConnectionsIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public class CallAndTopLevelConnectionsIterator_IPOATie
	extends CallAndTopLevelConnectionsIterator_IPOA
{
	private CallAndTopLevelConnectionsIterator_IOperations _delegate;

	private POA _poa;
	public CallAndTopLevelConnectionsIterator_IPOATie(CallAndTopLevelConnectionsIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CallAndTopLevelConnectionsIterator_IPOATie(CallAndTopLevelConnectionsIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public callSNC.CallAndTopLevelConnectionsIterator_I _this()
	{
		return callSNC.CallAndTopLevelConnectionsIterator_IHelper.narrow(_this_object());
	}
	public callSNC.CallAndTopLevelConnectionsIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return callSNC.CallAndTopLevelConnectionsIterator_IHelper.narrow(_this_object(orb));
	}
	public CallAndTopLevelConnectionsIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CallAndTopLevelConnectionsIterator_IOperations delegate)
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

	public boolean next_n(int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,callAndTopLevelConnectionsList);
	}

}

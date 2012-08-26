package session;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Session_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:36:29
 */

public class Session_IPOATie
	extends Session_IPOA
{
	private Session_IOperations _delegate;

	private POA _poa;
	public Session_IPOATie(Session_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Session_IPOATie(Session_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public session.Session_I _this()
	{
		return session.Session_IHelper.narrow(_this_object());
	}
	public session.Session_I _this(org.omg.CORBA.ORB orb)
	{
		return session.Session_IHelper.narrow(_this_object(orb));
	}
	public Session_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Session_IOperations delegate)
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
	public session.Session_I associatedSession()
	{
		return _delegate.associatedSession();
	}

	public void endSession(int sessionID)
	{
_delegate.endSession(sessionID);
	}

	public void ping()
	{
_delegate.ping();
	}

}

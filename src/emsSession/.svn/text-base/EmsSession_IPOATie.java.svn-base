package emsSession;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EmsSession_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:07
 */

public class EmsSession_IPOATie
	extends EmsSession_IPOA
{
	private EmsSession_IOperations _delegate;

	private POA _poa;
	public EmsSession_IPOATie(EmsSession_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSession_IPOATie(EmsSession_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsSession.EmsSession_I _this()
	{
		return emsSession.EmsSession_IHelper.narrow(_this_object());
	}
	public emsSession.EmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		return emsSession.EmsSession_IHelper.narrow(_this_object(orb));
	}
	public EmsSession_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSession_IOperations delegate)
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

	public void getManager(java.lang.String managerName, common.Common_IHolder managerInterface) throws globaldefs.ProcessingFailureException
	{
_delegate.getManager(managerName,managerInterface);
	}

	public void getSupportedManagers(emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws globaldefs.ProcessingFailureException
	{
_delegate.getSupportedManagers(supportedManagerList);
	}

}

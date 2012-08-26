package emsSessionFactory;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EmsSessionFactory_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:08
 */

public class EmsSessionFactory_IPOATie
	extends EmsSessionFactory_IPOA
{
	private EmsSessionFactory_IOperations _delegate;

	private POA _poa;
	public EmsSessionFactory_IPOATie(EmsSessionFactory_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSessionFactory_IPOATie(EmsSessionFactory_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsSessionFactory.EmsSessionFactory_I _this()
	{
		return emsSessionFactory.EmsSessionFactory_IHelper.narrow(_this_object());
	}
	public emsSessionFactory.EmsSessionFactory_I _this(org.omg.CORBA.ORB orb)
	{
		return emsSessionFactory.EmsSessionFactory_IHelper.narrow(_this_object(orb));
	}
	public EmsSessionFactory_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSessionFactory_IOperations delegate)
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
	public void getEmsSession(java.lang.String user, java.lang.String password, nmsSession.NmsSession_I client, emsSession.EmsSession_IHolder emsSessionInterface) throws globaldefs.ProcessingFailureException
	{
_delegate.getEmsSession(user,password,client,emsSessionInterface);
	}

}

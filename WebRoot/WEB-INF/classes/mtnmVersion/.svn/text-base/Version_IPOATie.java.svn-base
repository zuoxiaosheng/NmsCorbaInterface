package mtnmVersion;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Version_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:36:23
 */

public class Version_IPOATie
	extends Version_IPOA
{
	private Version_IOperations _delegate;

	private POA _poa;
	public Version_IPOATie(Version_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Version_IPOATie(Version_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnmVersion.Version_I _this()
	{
		return mtnmVersion.Version_IHelper.narrow(_this_object());
	}
	public mtnmVersion.Version_I _this(org.omg.CORBA.ORB orb)
	{
		return mtnmVersion.Version_IHelper.narrow(_this_object(orb));
	}
	public Version_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Version_IOperations delegate)
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
	public java.lang.String getVersion()
	{
		return _delegate.getVersion();
	}

}

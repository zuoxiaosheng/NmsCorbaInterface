package equipment;
/**
 * Generated from IDL enum "ServiceState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class ServiceState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ServiceState_T value;

	public ServiceState_THolder ()
	{
	}
	public ServiceState_THolder (final ServiceState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceState_THelper.write (out,value);
	}
}

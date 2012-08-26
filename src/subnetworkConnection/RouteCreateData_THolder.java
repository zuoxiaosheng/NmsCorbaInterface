package subnetworkConnection;

/**
 * Generated from IDL struct "RouteCreateData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class RouteCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteCreateData_T value;

	public RouteCreateData_THolder ()
	{
	}
	public RouteCreateData_THolder(final subnetworkConnection.RouteCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.RouteCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.RouteCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.RouteCreateData_THelper.write(_out, value);
	}
}

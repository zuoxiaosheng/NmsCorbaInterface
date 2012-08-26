package subnetworkConnection;

/**
 * Generated from IDL struct "RouteDescriptor_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class RouteDescriptor_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteDescriptor_T value;

	public RouteDescriptor_THolder ()
	{
	}
	public RouteDescriptor_THolder(final subnetworkConnection.RouteDescriptor_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.RouteDescriptor_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.RouteDescriptor_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.RouteDescriptor_THelper.write(_out, value);
	}
}

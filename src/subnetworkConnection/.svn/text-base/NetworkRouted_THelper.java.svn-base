package subnetworkConnection;
/**
 * Generated from IDL enum "NetworkRouted_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class NetworkRouted_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(subnetworkConnection.NetworkRouted_THelper.id(),"NetworkRouted_T",new String[]{"NR_NA","NR_NO","NR_YES"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.NetworkRouted_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.NetworkRouted_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/NetworkRouted_T:1.0";
	}
	public static NetworkRouted_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return NetworkRouted_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final NetworkRouted_T s)
	{
		out.write_long(s.value());
	}
}

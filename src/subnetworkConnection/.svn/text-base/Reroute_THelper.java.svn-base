package subnetworkConnection;
/**
 * Generated from IDL enum "Reroute_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class Reroute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(subnetworkConnection.Reroute_THelper.id(),"Reroute_T",new String[]{"RR_NA","RR_NO","RR_YES"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.Reroute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.Reroute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/Reroute_T:1.0";
	}
	public static Reroute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return Reroute_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final Reroute_T s)
	{
		out.write_long(s.value());
	}
}

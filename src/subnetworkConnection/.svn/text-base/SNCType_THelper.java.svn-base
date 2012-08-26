package subnetworkConnection;
/**
 * Generated from IDL enum "SNCType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class SNCType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(subnetworkConnection.SNCType_THelper.id(),"SNCType_T",new String[]{"ST_SIMPLE","ST_ADD_DROP_A","ST_ADD_DROP_Z","ST_INTERCONNECT","ST_DOUBLE_INTERCONNECT","ST_DOUBLE_ADD_DROP","ST_OPEN_ADD_DROP","ST_EXPLICIT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.SNCType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.SNCType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SNCType_T:1.0";
	}
	public static SNCType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SNCType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SNCType_T s)
	{
		out.write_long(s.value());
	}
}

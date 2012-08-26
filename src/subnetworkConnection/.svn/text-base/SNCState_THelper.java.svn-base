package subnetworkConnection;
/**
 * Generated from IDL enum "SNCState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class SNCState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(subnetworkConnection.SNCState_THelper.id(),"SNCState_T",new String[]{"SNCS_NONEXISTENT","SNCS_PENDING","SNCS_ACTIVE","SNCS_PARTIAL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.SNCState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.SNCState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SNCState_T:1.0";
	}
	public static SNCState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SNCState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SNCState_T s)
	{
		out.write_long(s.value());
	}
}

package terminationPoint;
/**
 * Generated from IDL enum "TPConnectionState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TPConnectionState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(terminationPoint.TPConnectionState_THelper.id(),"TPConnectionState_T",new String[]{"TPCS_NA","TPCS_SOURCE_CONNECTED","TPCS_SINK_CONNECTED","TPCS_BI_CONNECTED","TPCS_NOT_CONNECTED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.TPConnectionState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.TPConnectionState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TPConnectionState_T:1.0";
	}
	public static TPConnectionState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return TPConnectionState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TPConnectionState_T s)
	{
		out.write_long(s.value());
	}
}

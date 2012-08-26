package subnetworkConnection;
/**
 * Generated from IDL enum "ProtectionEffort_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class ProtectionEffort_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(subnetworkConnection.ProtectionEffort_THelper.id(),"ProtectionEffort_T",new String[]{"EFFORT_WHATEVER","EFFORT_SAME_OR_BETTER","EFFORT_SAME_OR_WORSE","EFFORT_SAME"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.ProtectionEffort_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.ProtectionEffort_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/ProtectionEffort_T:1.0";
	}
	public static ProtectionEffort_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionEffort_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionEffort_T s)
	{
		out.write_long(s.value());
	}
}

package equipment;
/**
 * Generated from IDL enum "HolderState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class HolderState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(equipment.HolderState_THelper.id(),"HolderState_T",new String[]{"EMPTY","INSTALLED_AND_EXPECTED","EXPECTED_AND_NOT_INSTALLED","INSTALLED_AND_NOT_EXPECTED","MISMATCH_OF_INSTALLED_AND_EXPECTED","UNAVAILABLE","UNKNOWN"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.HolderState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.HolderState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/HolderState_T:1.0";
	}
	public static HolderState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HolderState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HolderState_T s)
	{
		out.write_long(s.value());
	}
}

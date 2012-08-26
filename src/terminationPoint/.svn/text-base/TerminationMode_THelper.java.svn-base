package terminationPoint;
/**
 * Generated from IDL enum "TerminationMode_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TerminationMode_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(terminationPoint.TerminationMode_THelper.id(),"TerminationMode_T",new String[]{"TM_NA","TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING","TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.TerminationMode_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.TerminationMode_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TerminationMode_T:1.0";
	}
	public static TerminationMode_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return TerminationMode_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TerminationMode_T s)
	{
		out.write_long(s.value());
	}
}

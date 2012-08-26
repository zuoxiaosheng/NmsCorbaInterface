package globaldefs;
/**
 * Generated from IDL enum "ExceptionType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class ExceptionType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(globaldefs.ExceptionType_THelper.id(),"ExceptionType_T",new String[]{"EXCPT_NOT_IMPLEMENTED","EXCPT_INTERNAL_ERROR","EXCPT_INVALID_INPUT","EXCPT_OBJECT_IN_USE","EXCPT_TP_INVALID_ENDPOINT","EXCPT_ENTITY_NOT_FOUND","EXCPT_TIMESLOT_IN_USE","EXCPT_PROTECTION_EFFORT_NOT_MET","EXCPT_NOT_IN_VALID_STATE","EXCPT_UNABLE_TO_COMPLY","EXCPT_NE_COMM_LOSS","EXCPT_CAPACITY_EXCEEDED","EXCPT_ACCESS_DENIED","EXCPT_TOO_MANY_OPEN_ITERATORS","EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS","EXCPT_USERLABEL_IN_USE","EXCPT_SUBSCRIBERID_INVALID","EXCPT_OBJECT_NOT_EXIST"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final globaldefs.ExceptionType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static globaldefs.ExceptionType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/ExceptionType_T:1.0";
	}
	public static ExceptionType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ExceptionType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ExceptionType_T s)
	{
		out.write_long(s.value());
	}
}

package globaldefs;


/**
 * Generated from IDL struct "Duration_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class Duration_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(globaldefs.Duration_THelper.id(),"Duration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("fromTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("toTime", globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final globaldefs.Duration_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static globaldefs.Duration_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/Duration_T:1.0";
	}
	public static globaldefs.Duration_T read (final org.omg.CORBA.portable.InputStream in)
	{
		globaldefs.Duration_T result = new globaldefs.Duration_T();
		result.fromTime=in.read_string();
		result.toTime=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final globaldefs.Duration_T s)
	{
		out.write_string(s.fromTime);
		out.write_string(s.toTime);
	}
}

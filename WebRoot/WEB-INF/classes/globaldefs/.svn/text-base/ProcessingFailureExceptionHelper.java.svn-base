package globaldefs;


/**
 * Generated from IDL exception "ProcessingFailureException".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class ProcessingFailureExceptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(globaldefs.ProcessingFailureExceptionHelper.id(),"ProcessingFailureException",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("exceptionType", globaldefs.ExceptionType_THelper.type(), null),new org.omg.CORBA.StructMember("errorReason", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final globaldefs.ProcessingFailureException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static globaldefs.ProcessingFailureException extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0";
	}
	public static globaldefs.ProcessingFailureException read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		globaldefs.ExceptionType_T x0;
		x0=globaldefs.ExceptionType_THelper.read(in);
		java.lang.String x1;
		x1=in.read_string();
		final globaldefs.ProcessingFailureException result = new globaldefs.ProcessingFailureException(id, x0, x1);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final globaldefs.ProcessingFailureException s)
	{
		out.write_string(id());
		globaldefs.ExceptionType_THelper.write(out,s.exceptionType);
		out.write_string(s.errorReason);
	}
}

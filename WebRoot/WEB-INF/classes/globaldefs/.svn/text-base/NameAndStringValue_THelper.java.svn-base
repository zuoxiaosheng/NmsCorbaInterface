package globaldefs;


/**
 * Generated from IDL struct "NameAndStringValue_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class NameAndStringValue_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final globaldefs.NameAndStringValue_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static globaldefs.NameAndStringValue_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/NameAndStringValue_T:1.0";
	}
	public static globaldefs.NameAndStringValue_T read (final org.omg.CORBA.portable.InputStream in)
	{
		globaldefs.NameAndStringValue_T result = new globaldefs.NameAndStringValue_T();
		result.name=in.read_string();
		result.value=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final globaldefs.NameAndStringValue_T s)
	{
		out.write_string(s.name);
		out.write_string(s.value);
	}
}

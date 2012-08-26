package notifications;


/**
 * Generated from IDL struct "NameAndAnyValue_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class NameAndAnyValue_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(notifications.NameAndAnyValue_THelper.id(),"NameAndAnyValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.NameAndAnyValue_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.NameAndAnyValue_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/NameAndAnyValue_T:1.0";
	}
	public static notifications.NameAndAnyValue_T read (final org.omg.CORBA.portable.InputStream in)
	{
		notifications.NameAndAnyValue_T result = new notifications.NameAndAnyValue_T();
		result.name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final notifications.NameAndAnyValue_T s)
	{
		out.write_string(s.name);
		out.write_any(s.value);
	}
}

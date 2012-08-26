package managedElement;


/**
 * Generated from IDL struct "IPAddr_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class IPAddr_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElement.IPAddr_THelper.id(),"IPAddr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("a", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("b", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("c", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("d", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.IPAddr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.IPAddr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/IPAddr_T:1.0";
	}
	public static managedElement.IPAddr_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElement.IPAddr_T result = new managedElement.IPAddr_T();
		result.a=in.read_long();
		result.b=in.read_long();
		result.c=in.read_long();
		result.d=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElement.IPAddr_T s)
	{
		out.write_long(s.a);
		out.write_long(s.b);
		out.write_long(s.c);
		out.write_long(s.d);
	}
}

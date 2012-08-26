package managedElement;


/**
 * Generated from IDL struct "NetAddress_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class NetAddress_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElement.NetAddress_THelper.id(),"NetAddress_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ipAddr", managedElement.IPAddr_THelper.type(), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.NetAddress_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.NetAddress_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/NetAddress_T:1.0";
	}
	public static managedElement.NetAddress_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElement.NetAddress_T result = new managedElement.NetAddress_T();
		result.ipAddr=managedElement.IPAddr_THelper.read(in);
		result.port=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElement.NetAddress_T s)
	{
		managedElement.IPAddr_THelper.write(out,s.ipAddr);
		out.write_long(s.port);
	}
}

package managedElement;


/**
 * Generated from IDL struct "TCInfo_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class TCInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElement.TCInfo_THelper.id(),"TCInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tclNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("tcCapability", managedElement.TCCapability_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.TCInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.TCInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/TCInfo_T:1.0";
	}
	public static managedElement.TCInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElement.TCInfo_T result = new managedElement.TCInfo_T();
		result.tclNumber=in.read_long();
		result.tcCapability=managedElement.TCCapability_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElement.TCInfo_T s)
	{
		out.write_long(s.tclNumber);
		managedElement.TCCapability_THelper.write(out,s.tcCapability);
	}
}

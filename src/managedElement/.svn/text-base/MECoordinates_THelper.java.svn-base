package managedElement;


/**
 * Generated from IDL struct "MECoordinates_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class MECoordinates_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElement.MECoordinates_THelper.id(),"MECoordinates_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("coordinate", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("relativeCoordinate", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.MECoordinates_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.MECoordinates_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/MECoordinates_T:1.0";
	}
	public static managedElement.MECoordinates_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElement.MECoordinates_T result = new managedElement.MECoordinates_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.coordinate=in.read_string();
		result.relativeCoordinate=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElement.MECoordinates_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.coordinate);
		out.write_string(s.relativeCoordinate);
	}
}

package subnetworkConnection;


/**
 * Generated from IDL struct "CrossConnect_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class CrossConnect_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(subnetworkConnection.CrossConnect_THelper.id(),"CrossConnect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("ccType", subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("aEndNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEndNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.CrossConnect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.CrossConnect_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CrossConnect_T:1.0";
	}
	public static subnetworkConnection.CrossConnect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		subnetworkConnection.CrossConnect_T result = new subnetworkConnection.CrossConnect_T();
		result.active=in.read_boolean();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.ccType=subnetworkConnection.SNCType_THelper.read(in);
		result.aEndNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.zEndNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final subnetworkConnection.CrossConnect_T s)
	{
		out.write_boolean(s.active);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		subnetworkConnection.SNCType_THelper.write(out,s.ccType);
		globaldefs.NamingAttributesList_THelper.write(out,s.aEndNameList);
		globaldefs.NamingAttributesList_THelper.write(out,s.zEndNameList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

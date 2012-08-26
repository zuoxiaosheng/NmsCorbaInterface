package equipment;


/**
 * Generated from IDL struct "Equipment_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class Equipment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.Equipment_THelper.id(),"Equipment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hardwareVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("softwareVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hasProtection", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("serviceState", equipment.ServiceState_THelper.type(), null),new org.omg.CORBA.StructMember("expectedBoardType", equipment.EquipmentObjectType_THelper.type(), null),new org.omg.CORBA.StructMember("installedBoardType", equipment.EquipmentObjectType_THelper.type(), null),new org.omg.CORBA.StructMember("ptpList", terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.Equipment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.Equipment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/Equipment_T:1.0";
	}
	public static equipment.Equipment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.Equipment_T result = new equipment.Equipment_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.hardwareVersion=in.read_string();
		result.softwareVersion=in.read_string();
		result.hasProtection=in.read_boolean();
		result.serviceState=equipment.ServiceState_THelper.read(in);
		result.expectedBoardType=in.read_string();
		result.installedBoardType=in.read_string();
		result.ptpList = terminationPoint.TerminationPointList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.Equipment_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.hardwareVersion);
		out.write_string(s.softwareVersion);
		out.write_boolean(s.hasProtection);
		equipment.ServiceState_THelper.write(out,s.serviceState);
		out.write_string(s.expectedBoardType);
		out.write_string(s.installedBoardType);
		terminationPoint.TerminationPointList_THelper.write(out,s.ptpList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

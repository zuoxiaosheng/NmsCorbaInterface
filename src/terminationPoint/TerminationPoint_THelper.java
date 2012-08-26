package terminationPoint;


/**
 * Generated from IDL struct "TerminationPoint_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TerminationPoint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(terminationPoint.TerminationPoint_THelper.id(),"TerminationPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", terminationPoint.TPType_THelper.type(), null),new org.omg.CORBA.StructMember("connectionState", terminationPoint.TPConnectionState_THelper.type(), null),new org.omg.CORBA.StructMember("tpMappingMode", terminationPoint.TerminationMode_THelper.type(), null),new org.omg.CORBA.StructMember("direction", terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("tpProtectionAssociation", terminationPoint.TPProtectionAssociation_THelper.type(), null),new org.omg.CORBA.StructMember("edgePoint", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("includeTPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", notifications.NVList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.TerminationPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.TerminationPoint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TerminationPoint_T:1.0";
	}
	public static terminationPoint.TerminationPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		terminationPoint.TerminationPoint_T result = new terminationPoint.TerminationPoint_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.owner=in.read_string();
		result.type=terminationPoint.TPType_THelper.read(in);
		result.connectionState=terminationPoint.TPConnectionState_THelper.read(in);
		result.tpMappingMode=terminationPoint.TerminationMode_THelper.read(in);
		result.direction=terminationPoint.Directionality_THelper.read(in);
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.tpProtectionAssociation=terminationPoint.TPProtectionAssociation_THelper.read(in);
		result.edgePoint=in.read_boolean();
		result.includeTPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = notifications.NVList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final terminationPoint.TerminationPoint_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.owner);
		terminationPoint.TPType_THelper.write(out,s.type);
		terminationPoint.TPConnectionState_THelper.write(out,s.connectionState);
		terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		terminationPoint.Directionality_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		terminationPoint.TPProtectionAssociation_THelper.write(out,s.tpProtectionAssociation);
		out.write_boolean(s.edgePoint);
		globaldefs.NamingAttributesList_THelper.write(out,s.includeTPList);
		notifications.NVList_THelper.write(out,s.additionalInfo);
	}
}

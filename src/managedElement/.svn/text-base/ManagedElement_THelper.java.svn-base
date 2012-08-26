package managedElement;


/**
 * Generated from IDL struct "ManagedElement_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class ManagedElement_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElement.ManagedElement_THelper.id(),"ManagedElement_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hardwareVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("softwareVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("productName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("meType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("communicationState", managedElement.CommunicationState_THelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("connectionRates", transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("vendorName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("operationalStatus", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("netAddress", managedElement.NetAddress_THelper.type(), null),new org.omg.CORBA.StructMember("alarmStatus", alarmMgr.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("descriptionInfo", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.ManagedElement_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.ManagedElement_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/ManagedElement_T:1.0";
	}
	public static managedElement.ManagedElement_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElement.ManagedElement_T result = new managedElement.ManagedElement_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.location=in.read_string();
		result.hardwareVersion=in.read_string();
		result.softwareVersion=in.read_string();
		result.productName=in.read_string();
		result.meType=in.read_string();
		result.communicationState=managedElement.CommunicationState_THelper.read(in);
		result.nativeEMSName=in.read_string();
		result.connectionRates = transmissionParameters.LayerRateList_THelper.read(in);
		result.vendorName=in.read_string();
		result.operationalStatus=in.read_string();
		result.netAddress=managedElement.NetAddress_THelper.read(in);
		result.alarmStatus=alarmMgr.PerceivedSeverity_THelper.read(in);
		result.descriptionInfo=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElement.ManagedElement_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.location);
		out.write_string(s.hardwareVersion);
		out.write_string(s.softwareVersion);
		out.write_string(s.productName);
		out.write_string(s.meType);
		managedElement.CommunicationState_THelper.write(out,s.communicationState);
		out.write_string(s.nativeEMSName);
		transmissionParameters.LayerRateList_THelper.write(out,s.connectionRates);
		out.write_string(s.vendorName);
		out.write_string(s.operationalStatus);
		managedElement.NetAddress_THelper.write(out,s.netAddress);
		alarmMgr.PerceivedSeverity_THelper.write(out,s.alarmStatus);
		out.write_string(s.descriptionInfo);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

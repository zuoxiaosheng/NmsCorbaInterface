package emsMgr;


/**
 * Generated from IDL struct "EMS_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EMS_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.EMS_THelper.id(),"EMS_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("netAddress", managedElement.NetAddress_THelper.type(), null),new org.omg.CORBA.StructMember("alarmState", alarmMgr.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.EMS_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.EMS_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EMS_T:1.0";
	}
	public static emsMgr.EMS_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.EMS_T result = new emsMgr.EMS_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.location=in.read_string();
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.emsVersion=in.read_string();
		result.emsType=in.read_string();
		result.vendorName=in.read_string();
		result.netAddress=managedElement.NetAddress_THelper.read(in);
		result.alarmState=alarmMgr.PerceivedSeverity_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.EMS_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.location);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.emsVersion);
		out.write_string(s.emsType);
		out.write_string(s.vendorName);
		managedElement.NetAddress_THelper.write(out,s.netAddress);
		alarmMgr.PerceivedSeverity_THelper.write(out,s.alarmState);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

package emsMgr;


/**
 * Generated from IDL struct "TransmissionSystem_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class TransmissionSystem_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.TransmissionSystem_THelper.id(),"TransmissionSystem_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("workReceiveRouteList", emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("workSendRouteList", emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionReceiveRouteList", emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionworkSendRouteList", emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("capacity", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("includingTSList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.TransmissionSystem_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.TransmissionSystem_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/TransmissionSystem_T:1.0";
	}
	public static emsMgr.TransmissionSystem_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.TransmissionSystem_T result = new emsMgr.TransmissionSystem_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.vendorName=in.read_string();
		result.protectionType=in.read_string();
		result.workReceiveRouteList = emsMgr.TransmissionRouteList_THelper.read(in);
		result.workSendRouteList = emsMgr.TransmissionRouteList_THelper.read(in);
		result.protectionReceiveRouteList = emsMgr.TransmissionRouteList_THelper.read(in);
		result.protectionworkSendRouteList = emsMgr.TransmissionRouteList_THelper.read(in);
		result.capacity=in.read_string();
		result.includingTSList = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.TransmissionSystem_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.vendorName);
		out.write_string(s.protectionType);
		emsMgr.TransmissionRouteList_THelper.write(out,s.workReceiveRouteList);
		emsMgr.TransmissionRouteList_THelper.write(out,s.workSendRouteList);
		emsMgr.TransmissionRouteList_THelper.write(out,s.protectionReceiveRouteList);
		emsMgr.TransmissionRouteList_THelper.write(out,s.protectionworkSendRouteList);
		out.write_string(s.capacity);
		globaldefs.NamingAttributesList_THelper.write(out,s.includingTSList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

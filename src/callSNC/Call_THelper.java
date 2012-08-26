package callSNC;


/**
 * Generated from IDL struct "Call_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class Call_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.Call_THelper.id(),"Call_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("callName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("callId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("callState", callSNC.CallState_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", callSNC.CallEnd_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", callSNC.CallEnd_THelper.type(), null),new org.omg.CORBA.StructMember("callParameters", callSNC.CallParameterProfile_THelper.type(), null),new org.omg.CORBA.StructMember("callDiversity", callSNC.Diversity_THelper.type(), null),new org.omg.CORBA.StructMember("diversitySynthesis", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("linkDiversityViolations", callSNC.DiversityInfo_THelper.type(), null),new org.omg.CORBA.StructMember("nodeDiversityViolations", callSNC.DiversityInfo_THelper.type(), null),new org.omg.CORBA.StructMember("linkPartialDiversityList", callSNC.DiversityInfoList_THelper.type(), null),new org.omg.CORBA.StructMember("nodePartialDiversityList", callSNC.DiversityInfoList_THelper.type(), null),new org.omg.CORBA.StructMember("callAdditionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.Call_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.Call_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/Call_T:1.0";
	}
	public static callSNC.Call_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.Call_T result = new callSNC.Call_T();
		result.callName = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.nativeEMSName=in.read_string();
		result.callId=in.read_string();
		result.callState=in.read_string();
		result.aEnd=callSNC.CallEnd_THelper.read(in);
		result.zEnd=callSNC.CallEnd_THelper.read(in);
		result.callParameters=callSNC.CallParameterProfile_THelper.read(in);
		result.callDiversity=callSNC.Diversity_THelper.read(in);
		result.diversitySynthesis=in.read_string();
		result.linkDiversityViolations=callSNC.DiversityInfo_THelper.read(in);
		result.nodeDiversityViolations=callSNC.DiversityInfo_THelper.read(in);
		result.linkPartialDiversityList = callSNC.DiversityInfoList_THelper.read(in);
		result.nodePartialDiversityList = callSNC.DiversityInfoList_THelper.read(in);
		result.callAdditionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.Call_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.callName);
		out.write_string(s.userLabel);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		out.write_string(s.nativeEMSName);
		out.write_string(s.callId);
		out.write_string(s.callState);
		callSNC.CallEnd_THelper.write(out,s.aEnd);
		callSNC.CallEnd_THelper.write(out,s.zEnd);
		callSNC.CallParameterProfile_THelper.write(out,s.callParameters);
		callSNC.Diversity_THelper.write(out,s.callDiversity);
		out.write_string(s.diversitySynthesis);
		callSNC.DiversityInfo_THelper.write(out,s.linkDiversityViolations);
		callSNC.DiversityInfo_THelper.write(out,s.nodeDiversityViolations);
		callSNC.DiversityInfoList_THelper.write(out,s.linkPartialDiversityList);
		callSNC.DiversityInfoList_THelper.write(out,s.nodePartialDiversityList);
		globaldefs.NVSList_THelper.write(out,s.callAdditionalInfo);
	}
}

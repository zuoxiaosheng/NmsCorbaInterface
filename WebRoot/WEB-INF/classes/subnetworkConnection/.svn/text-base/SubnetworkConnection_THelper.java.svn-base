package subnetworkConnection;


/**
 * Generated from IDL struct "SubnetworkConnection_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class SubnetworkConnection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(subnetworkConnection.SubnetworkConnection_THelper.id(),"SubnetworkConnection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sncState", subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("staticProtectionLevel", subnetworkConnection.StaticProtectionLevel_THelper.type(), null),new org.omg.CORBA.StructMember("sncType", subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.SubnetworkConnection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.SubnetworkConnection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SubnetworkConnection_T:1.0";
	}
	public static subnetworkConnection.SubnetworkConnection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		subnetworkConnection.SubnetworkConnection_T result = new subnetworkConnection.SubnetworkConnection_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.sncState=subnetworkConnection.SNCState_THelper.read(in);
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.staticProtectionLevel=subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.sncType=subnetworkConnection.SNCType_THelper.read(in);
		result.aEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.rerouteAllowed=subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=subnetworkConnection.NetworkRouted_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final subnetworkConnection.SubnetworkConnection_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		subnetworkConnection.SNCState_THelper.write(out,s.sncState);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

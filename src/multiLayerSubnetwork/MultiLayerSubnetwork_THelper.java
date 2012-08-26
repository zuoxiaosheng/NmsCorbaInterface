package multiLayerSubnetwork;


/**
 * Generated from IDL struct "MultiLayerSubnetwork_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class MultiLayerSubnetwork_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(multiLayerSubnetwork.MultiLayerSubnetwork_THelper.id(),"MultiLayerSubnetwork_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("subnetworkType", multiLayerSubnetwork.Topology_THelper.type(), null),new org.omg.CORBA.StructMember("supportedRates", transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final multiLayerSubnetwork.MultiLayerSubnetwork_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static multiLayerSubnetwork.MultiLayerSubnetwork_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetwork_T:1.0";
	}
	public static multiLayerSubnetwork.MultiLayerSubnetwork_T read (final org.omg.CORBA.portable.InputStream in)
	{
		multiLayerSubnetwork.MultiLayerSubnetwork_T result = new multiLayerSubnetwork.MultiLayerSubnetwork_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.subnetworkType=multiLayerSubnetwork.Topology_THelper.read(in);
		result.supportedRates = transmissionParameters.LayerRateList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final multiLayerSubnetwork.MultiLayerSubnetwork_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		multiLayerSubnetwork.Topology_THelper.write(out,s.subnetworkType);
		transmissionParameters.LayerRateList_THelper.write(out,s.supportedRates);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

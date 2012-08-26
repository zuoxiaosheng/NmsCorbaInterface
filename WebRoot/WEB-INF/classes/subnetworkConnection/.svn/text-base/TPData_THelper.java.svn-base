package subnetworkConnection;


/**
 * Generated from IDL struct "TPData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class TPData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(subnetworkConnection.TPData_THelper.id(),"TPData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("tpMappingMode", terminationPoint.TerminationMode_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("ingressTrafficDescriptorName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("egressTrafficDescriptorName", globaldefs.NamingAttributes_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.TPData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.TPData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/TPData_T:1.0";
	}
	public static subnetworkConnection.TPData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		subnetworkConnection.TPData_T result = new subnetworkConnection.TPData_T();
		result.tpName = globaldefs.NVSList_THelper.read(in);
		result.tpMappingMode=terminationPoint.TerminationMode_THelper.read(in);
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.ingressTrafficDescriptorName = globaldefs.NVSList_THelper.read(in);
		result.egressTrafficDescriptorName = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final subnetworkConnection.TPData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.tpName);
		terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		globaldefs.NVSList_THelper.write(out,s.ingressTrafficDescriptorName);
		globaldefs.NVSList_THelper.write(out,s.egressTrafficDescriptorName);
	}
}

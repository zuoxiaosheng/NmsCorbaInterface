package emsMgr;


/**
 * Generated from IDL struct "EthernetServiceCreateData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EthernetServiceCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.EthernetServiceCreateData_THelper.id(),"EthernetServiceCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serviceType", emsMgr.EthernetServiceType_THelper.type(), null),new org.omg.CORBA.StructMember("sourceTPList", terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("sinkTPList", terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("sourceVBNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("sinkVBNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.EthernetServiceCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.EthernetServiceCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EthernetServiceCreateData_T:1.0";
	}
	public static emsMgr.EthernetServiceCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.EthernetServiceCreateData_T result = new emsMgr.EthernetServiceCreateData_T();
		result.serviceType=emsMgr.EthernetServiceType_THelper.read(in);
		result.sourceTPList = terminationPoint.TerminationPointList_THelper.read(in);
		result.sinkTPList = terminationPoint.TerminationPointList_THelper.read(in);
		result.sourceVBNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.sinkVBNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.EthernetServiceCreateData_T s)
	{
		emsMgr.EthernetServiceType_THelper.write(out,s.serviceType);
		terminationPoint.TerminationPointList_THelper.write(out,s.sourceTPList);
		terminationPoint.TerminationPointList_THelper.write(out,s.sinkTPList);
		globaldefs.NamingAttributesList_THelper.write(out,s.sourceVBNameList);
		globaldefs.NamingAttributesList_THelper.write(out,s.sinkVBNameList);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

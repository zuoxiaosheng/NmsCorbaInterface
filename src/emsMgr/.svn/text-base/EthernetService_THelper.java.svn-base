package emsMgr;


/**
 * Generated from IDL struct "EthernetService_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EthernetService_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.EthernetService_THelper.id(),"EthernetService_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("serviceType", emsMgr.EthernetServiceType_THelper.type(), null),new org.omg.CORBA.StructMember("sourceTPList", terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("sinkTPList", terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("sourceVBNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("sinkVBNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.EthernetService_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.EthernetService_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EthernetService_T:1.0";
	}
	public static emsMgr.EthernetService_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.EthernetService_T result = new emsMgr.EthernetService_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.serviceType=emsMgr.EthernetServiceType_THelper.read(in);
		result.sourceTPList = terminationPoint.TerminationPointList_THelper.read(in);
		result.sinkTPList = terminationPoint.TerminationPointList_THelper.read(in);
		result.sourceVBNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.sinkVBNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.EthernetService_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		emsMgr.EthernetServiceType_THelper.write(out,s.serviceType);
		terminationPoint.TerminationPointList_THelper.write(out,s.sourceTPList);
		terminationPoint.TerminationPointList_THelper.write(out,s.sinkTPList);
		globaldefs.NamingAttributesList_THelper.write(out,s.sourceVBNameList);
		globaldefs.NamingAttributesList_THelper.write(out,s.sinkVBNameList);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

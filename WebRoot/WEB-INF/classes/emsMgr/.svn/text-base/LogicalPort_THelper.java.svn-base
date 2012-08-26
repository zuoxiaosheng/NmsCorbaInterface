package emsMgr;


/**
 * Generated from IDL struct "LogicalPort_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class LogicalPort_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.LogicalPort_THelper.id(),"LogicalPort_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedTPs", terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("parameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.LogicalPort_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.LogicalPort_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/LogicalPort_T:1.0";
	}
	public static emsMgr.LogicalPort_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.LogicalPort_T result = new emsMgr.LogicalPort_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.containedTPs = terminationPoint.TerminationPointList_THelper.read(in);
		result.parameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.LogicalPort_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		terminationPoint.TerminationPointList_THelper.write(out,s.containedTPs);
		globaldefs.NVSList_THelper.write(out,s.parameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

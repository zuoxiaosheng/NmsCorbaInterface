package topologicalLink;


/**
 * Generated from IDL struct "TopologicalLink_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:24
 */

public final class TopologicalLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(topologicalLink.TopologicalLink_THelper.id(),"TopologicalLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("aEndTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zEndTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final topologicalLink.TopologicalLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static topologicalLink.TopologicalLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/topologicalLink/TopologicalLink_T:1.0";
	}
	public static topologicalLink.TopologicalLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		topologicalLink.TopologicalLink_T result = new topologicalLink.TopologicalLink_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.aEndTP = globaldefs.NVSList_THelper.read(in);
		result.zEndTP = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final topologicalLink.TopologicalLink_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		globaldefs.NVSList_THelper.write(out,s.aEndTP);
		globaldefs.NVSList_THelper.write(out,s.zEndTP);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

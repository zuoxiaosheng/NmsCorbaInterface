package callSNC;


/**
 * Generated from IDL struct "Diversity_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class Diversity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.Diversity_THelper.id(),"Diversity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("coroutingLevelOfEffort", callSNC.LevelOfEffort_THelper.type(), null),new org.omg.CORBA.StructMember("nodeDiversityLevelOfEffort", callSNC.LevelOfEffort_THelper.type(), null),new org.omg.CORBA.StructMember("linkDiversityLevelOfEffort", callSNC.LevelOfEffort_THelper.type(), null),new org.omg.CORBA.StructMember("nodeSRGType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("linkSRGType", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.Diversity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.Diversity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/Diversity_T:1.0";
	}
	public static callSNC.Diversity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.Diversity_T result = new callSNC.Diversity_T();
		result.coroutingLevelOfEffort=in.read_string();
		result.nodeDiversityLevelOfEffort=in.read_string();
		result.linkDiversityLevelOfEffort=in.read_string();
		result.nodeSRGType=in.read_string();
		result.linkSRGType=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.Diversity_T s)
	{
		out.write_string(s.coroutingLevelOfEffort);
		out.write_string(s.nodeDiversityLevelOfEffort);
		out.write_string(s.linkDiversityLevelOfEffort);
		out.write_string(s.nodeSRGType);
		out.write_string(s.linkSRGType);
	}
}

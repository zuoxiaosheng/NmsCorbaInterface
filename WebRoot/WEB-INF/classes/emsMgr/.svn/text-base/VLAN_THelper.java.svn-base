package emsMgr;


/**
 * Generated from IDL struct "VLAN_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class VLAN_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.VLAN_THelper.id(),"VLAN_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vlanID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("lps", emsMgr.LogicalPortList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.VLAN_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.VLAN_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/VLAN_T:1.0";
	}
	public static emsMgr.VLAN_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.VLAN_T result = new emsMgr.VLAN_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.vlanID=in.read_string();
		result.lps = emsMgr.LogicalPortList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.VLAN_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.vlanID);
		emsMgr.LogicalPortList_THelper.write(out,s.lps);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

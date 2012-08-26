package callSNC;


/**
 * Generated from IDL struct "ConnectionAndSupportingSNCs_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class ConnectionAndSupportingSNCs_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.ConnectionAndSupportingSNCs_THelper.id(),"ConnectionAndSupportingSNCs_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("topLevelConnection", subnetworkConnection.SubnetworkConnection_THelper.type(), null),new org.omg.CORBA.StructMember("sNCList", subnetworkConnection.SubnetworkConnectionList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.ConnectionAndSupportingSNCs_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.ConnectionAndSupportingSNCs_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/ConnectionAndSupportingSNCs_T:1.0";
	}
	public static callSNC.ConnectionAndSupportingSNCs_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.ConnectionAndSupportingSNCs_T result = new callSNC.ConnectionAndSupportingSNCs_T();
		result.topLevelConnection=subnetworkConnection.SubnetworkConnection_THelper.read(in);
		result.sNCList = subnetworkConnection.SubnetworkConnectionList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.ConnectionAndSupportingSNCs_T s)
	{
		subnetworkConnection.SubnetworkConnection_THelper.write(out,s.topLevelConnection);
		subnetworkConnection.SubnetworkConnectionList_THelper.write(out,s.sNCList);
	}
}

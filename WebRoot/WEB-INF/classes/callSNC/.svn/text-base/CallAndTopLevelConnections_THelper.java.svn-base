package callSNC;


/**
 * Generated from IDL struct "CallAndTopLevelConnections_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallAndTopLevelConnections_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.CallAndTopLevelConnections_THelper.id(),"CallAndTopLevelConnections_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("theCall", callSNC.Call_THelper.type(), null),new org.omg.CORBA.StructMember("topLevelConnectionsList", subnetworkConnection.SubnetworkConnectionList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.CallAndTopLevelConnections_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.CallAndTopLevelConnections_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnections_T:1.0";
	}
	public static callSNC.CallAndTopLevelConnections_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.CallAndTopLevelConnections_T result = new callSNC.CallAndTopLevelConnections_T();
		result.theCall=callSNC.Call_THelper.read(in);
		result.topLevelConnectionsList = subnetworkConnection.SubnetworkConnectionList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.CallAndTopLevelConnections_T s)
	{
		callSNC.Call_THelper.write(out,s.theCall);
		subnetworkConnection.SubnetworkConnectionList_THelper.write(out,s.topLevelConnectionsList);
	}
}

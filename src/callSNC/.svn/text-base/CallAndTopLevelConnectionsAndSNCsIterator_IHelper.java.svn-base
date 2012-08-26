package callSNC;


/**
 * Generated from IDL interface "CallAndTopLevelConnectionsAndSNCsIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallAndTopLevelConnectionsAndSNCsIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I s)
	{
			any.insert_Object(s);
	}
	public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnectionsAndSNCsIterator_I:1.0", "CallAndTopLevelConnectionsAndSNCsIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnectionsAndSNCsIterator_I:1.0";
	}
	public static CallAndTopLevelConnectionsAndSNCsIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I s)
	{
		_out.write_Object(s);
	}
	public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)
		{
			return (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnectionsAndSNCsIterator_I:1.0"))
		{
			callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub stub;
			stub = new callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)
		{
			return (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)obj;
		}
		else
		{
			callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub stub;
			stub = new callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

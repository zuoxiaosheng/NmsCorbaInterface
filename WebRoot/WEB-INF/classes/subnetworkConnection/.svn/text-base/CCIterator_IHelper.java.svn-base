package subnetworkConnection;


/**
 * Generated from IDL interface "CCIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class CCIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.CCIterator_I s)
	{
			any.insert_Object(s);
	}
	public static subnetworkConnection.CCIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/subnetworkConnection/CCIterator_I:1.0", "CCIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CCIterator_I:1.0";
	}
	public static CCIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(subnetworkConnection._CCIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final subnetworkConnection.CCIterator_I s)
	{
		_out.write_Object(s);
	}
	public static subnetworkConnection.CCIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof subnetworkConnection.CCIterator_I)
		{
			return (subnetworkConnection.CCIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/subnetworkConnection/CCIterator_I:1.0"))
		{
			subnetworkConnection._CCIterator_IStub stub;
			stub = new subnetworkConnection._CCIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static subnetworkConnection.CCIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof subnetworkConnection.CCIterator_I)
		{
			return (subnetworkConnection.CCIterator_I)obj;
		}
		else
		{
			subnetworkConnection._CCIterator_IStub stub;
			stub = new subnetworkConnection._CCIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package subscription;


/**
 * Generated from IDL interface "EMSSubscriptionMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:51:58
 */

public final class EMSSubscriptionMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final subscription.EMSSubscriptionMgr_I s)
	{
			any.insert_Object(s);
	}
	public static subscription.EMSSubscriptionMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/subscription/EMSSubscriptionMgr_I:1.0", "EMSSubscriptionMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subscription/EMSSubscriptionMgr_I:1.0";
	}
	public static EMSSubscriptionMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(subscription._EMSSubscriptionMgr_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final subscription.EMSSubscriptionMgr_I s)
	{
		_out.write_Object(s);
	}
	public static subscription.EMSSubscriptionMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof subscription.EMSSubscriptionMgr_I)
		{
			return (subscription.EMSSubscriptionMgr_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/subscription/EMSSubscriptionMgr_I:1.0"))
		{
			subscription._EMSSubscriptionMgr_IStub stub;
			stub = new subscription._EMSSubscriptionMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static subscription.EMSSubscriptionMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof subscription.EMSSubscriptionMgr_I)
		{
			return (subscription.EMSSubscriptionMgr_I)obj;
		}
		else
		{
			subscription._EMSSubscriptionMgr_IStub stub;
			stub = new subscription._EMSSubscriptionMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

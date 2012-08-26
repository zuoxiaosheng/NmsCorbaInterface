package emsMgr;


/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EMSMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final emsMgr.EMSMgr_I s)
	{
			any.insert_Object(s);
	}
	public static emsMgr.EMSMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0", "EMSMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0";
	}
	public static EMSMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(emsMgr._EMSMgr_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final emsMgr.EMSMgr_I s)
	{
		_out.write_Object(s);
	}
	public static emsMgr.EMSMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof emsMgr.EMSMgr_I)
		{
			return (emsMgr.EMSMgr_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0"))
		{
			emsMgr._EMSMgr_IStub stub;
			stub = new emsMgr._EMSMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static emsMgr.EMSMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof emsMgr.EMSMgr_I)
		{
			return (emsMgr.EMSMgr_I)obj;
		}
		else
		{
			emsMgr._EMSMgr_IStub stub;
			stub = new emsMgr._EMSMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

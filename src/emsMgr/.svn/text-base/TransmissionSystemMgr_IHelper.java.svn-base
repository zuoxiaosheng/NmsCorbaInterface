package emsMgr;


/**
 * Generated from IDL interface "TransmissionSystemMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class TransmissionSystemMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final emsMgr.TransmissionSystemMgr_I s)
	{
			any.insert_Object(s);
	}
	public static emsMgr.TransmissionSystemMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/emsMgr/TransmissionSystemMgr_I:1.0", "TransmissionSystemMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/TransmissionSystemMgr_I:1.0";
	}
	public static TransmissionSystemMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(emsMgr._TransmissionSystemMgr_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final emsMgr.TransmissionSystemMgr_I s)
	{
		_out.write_Object(s);
	}
	public static emsMgr.TransmissionSystemMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof emsMgr.TransmissionSystemMgr_I)
		{
			return (emsMgr.TransmissionSystemMgr_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/emsMgr/TransmissionSystemMgr_I:1.0"))
		{
			emsMgr._TransmissionSystemMgr_IStub stub;
			stub = new emsMgr._TransmissionSystemMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static emsMgr.TransmissionSystemMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof emsMgr.TransmissionSystemMgr_I)
		{
			return (emsMgr.TransmissionSystemMgr_I)obj;
		}
		else
		{
			emsMgr._TransmissionSystemMgr_IStub stub;
			stub = new emsMgr._TransmissionSystemMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package common;


/**
 * Generated from IDL interface "Common_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:51
 */

public final class Common_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final common.Common_I s)
	{
			any.insert_Object(s);
	}
	public static common.Common_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/common/Common_I:1.0", "Common_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/common/Common_I:1.0";
	}
	public static Common_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(common._Common_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final common.Common_I s)
	{
		_out.write_Object(s);
	}
	public static common.Common_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof common.Common_I)
		{
			return (common.Common_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/common/Common_I:1.0"))
		{
			common._Common_IStub stub;
			stub = new common._Common_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static common.Common_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof common.Common_I)
		{
			return (common.Common_I)obj;
		}
		else
		{
			common._Common_IStub stub;
			stub = new common._Common_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

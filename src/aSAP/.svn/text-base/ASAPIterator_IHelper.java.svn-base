package aSAP;


/**
 * Generated from IDL interface "ASAPIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:48
 */

public final class ASAPIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final aSAP.ASAPIterator_I s)
	{
			any.insert_Object(s);
	}
	public static aSAP.ASAPIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/aSAP/ASAPIterator_I:1.0", "ASAPIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/ASAPIterator_I:1.0";
	}
	public static ASAPIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(aSAP._ASAPIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final aSAP.ASAPIterator_I s)
	{
		_out.write_Object(s);
	}
	public static aSAP.ASAPIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof aSAP.ASAPIterator_I)
		{
			return (aSAP.ASAPIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/aSAP/ASAPIterator_I:1.0"))
		{
			aSAP._ASAPIterator_IStub stub;
			stub = new aSAP._ASAPIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static aSAP.ASAPIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof aSAP.ASAPIterator_I)
		{
			return (aSAP.ASAPIterator_I)obj;
		}
		else
		{
			aSAP._ASAPIterator_IStub stub;
			stub = new aSAP._ASAPIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

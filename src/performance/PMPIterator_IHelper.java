package performance;


/**
 * Generated from IDL interface "PMPIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMPIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final performance.PMPIterator_I s)
	{
			any.insert_Object(s);
	}
	public static performance.PMPIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/performance/PMPIterator_I:1.0", "PMPIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMPIterator_I:1.0";
	}
	public static PMPIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(performance._PMPIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final performance.PMPIterator_I s)
	{
		_out.write_Object(s);
	}
	public static performance.PMPIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof performance.PMPIterator_I)
		{
			return (performance.PMPIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/performance/PMPIterator_I:1.0"))
		{
			performance._PMPIterator_IStub stub;
			stub = new performance._PMPIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static performance.PMPIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof performance.PMPIterator_I)
		{
			return (performance.PMPIterator_I)obj;
		}
		else
		{
			performance._PMPIterator_IStub stub;
			stub = new performance._PMPIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
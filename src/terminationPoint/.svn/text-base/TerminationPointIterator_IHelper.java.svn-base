package terminationPoint;


/**
 * Generated from IDL interface "TerminationPointIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TerminationPointIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.TerminationPointIterator_I s)
	{
			any.insert_Object(s);
	}
	public static terminationPoint.TerminationPointIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/terminationPoint/TerminationPointIterator_I:1.0", "TerminationPointIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TerminationPointIterator_I:1.0";
	}
	public static TerminationPointIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(terminationPoint._TerminationPointIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final terminationPoint.TerminationPointIterator_I s)
	{
		_out.write_Object(s);
	}
	public static terminationPoint.TerminationPointIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof terminationPoint.TerminationPointIterator_I)
		{
			return (terminationPoint.TerminationPointIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/terminationPoint/TerminationPointIterator_I:1.0"))
		{
			terminationPoint._TerminationPointIterator_IStub stub;
			stub = new terminationPoint._TerminationPointIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static terminationPoint.TerminationPointIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof terminationPoint.TerminationPointIterator_I)
		{
			return (terminationPoint.TerminationPointIterator_I)obj;
		}
		else
		{
			terminationPoint._TerminationPointIterator_IStub stub;
			stub = new terminationPoint._TerminationPointIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

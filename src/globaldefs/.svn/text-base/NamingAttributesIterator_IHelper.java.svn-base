package globaldefs;


/**
 * Generated from IDL interface "NamingAttributesIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class NamingAttributesIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final globaldefs.NamingAttributesIterator_I s)
	{
			any.insert_Object(s);
	}
	public static globaldefs.NamingAttributesIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/globaldefs/NamingAttributesIterator_I:1.0", "NamingAttributesIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/NamingAttributesIterator_I:1.0";
	}
	public static NamingAttributesIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(globaldefs._NamingAttributesIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final globaldefs.NamingAttributesIterator_I s)
	{
		_out.write_Object(s);
	}
	public static globaldefs.NamingAttributesIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof globaldefs.NamingAttributesIterator_I)
		{
			return (globaldefs.NamingAttributesIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/globaldefs/NamingAttributesIterator_I:1.0"))
		{
			globaldefs._NamingAttributesIterator_IStub stub;
			stub = new globaldefs._NamingAttributesIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static globaldefs.NamingAttributesIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof globaldefs.NamingAttributesIterator_I)
		{
			return (globaldefs.NamingAttributesIterator_I)obj;
		}
		else
		{
			globaldefs._NamingAttributesIterator_IStub stub;
			stub = new globaldefs._NamingAttributesIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package topologicalLink;


/**
 * Generated from IDL interface "TopologicalLinkIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:24
 */

public final class TopologicalLinkIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final topologicalLink.TopologicalLinkIterator_I s)
	{
			any.insert_Object(s);
	}
	public static topologicalLink.TopologicalLinkIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/topologicalLink/TopologicalLinkIterator_I:1.0", "TopologicalLinkIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/topologicalLink/TopologicalLinkIterator_I:1.0";
	}
	public static TopologicalLinkIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(topologicalLink._TopologicalLinkIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final topologicalLink.TopologicalLinkIterator_I s)
	{
		_out.write_Object(s);
	}
	public static topologicalLink.TopologicalLinkIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof topologicalLink.TopologicalLinkIterator_I)
		{
			return (topologicalLink.TopologicalLinkIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/topologicalLink/TopologicalLinkIterator_I:1.0"))
		{
			topologicalLink._TopologicalLinkIterator_IStub stub;
			stub = new topologicalLink._TopologicalLinkIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static topologicalLink.TopologicalLinkIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof topologicalLink.TopologicalLinkIterator_I)
		{
			return (topologicalLink.TopologicalLinkIterator_I)obj;
		}
		else
		{
			topologicalLink._TopologicalLinkIterator_IStub stub;
			stub = new topologicalLink._TopologicalLinkIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

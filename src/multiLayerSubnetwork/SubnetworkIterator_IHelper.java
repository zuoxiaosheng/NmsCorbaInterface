package multiLayerSubnetwork;


/**
 * Generated from IDL interface "SubnetworkIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class SubnetworkIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final multiLayerSubnetwork.SubnetworkIterator_I s)
	{
			any.insert_Object(s);
	}
	public static multiLayerSubnetwork.SubnetworkIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/multiLayerSubnetwork/SubnetworkIterator_I:1.0", "SubnetworkIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/SubnetworkIterator_I:1.0";
	}
	public static SubnetworkIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(multiLayerSubnetwork._SubnetworkIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final multiLayerSubnetwork.SubnetworkIterator_I s)
	{
		_out.write_Object(s);
	}
	public static multiLayerSubnetwork.SubnetworkIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof multiLayerSubnetwork.SubnetworkIterator_I)
		{
			return (multiLayerSubnetwork.SubnetworkIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/multiLayerSubnetwork/SubnetworkIterator_I:1.0"))
		{
			multiLayerSubnetwork._SubnetworkIterator_IStub stub;
			stub = new multiLayerSubnetwork._SubnetworkIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static multiLayerSubnetwork.SubnetworkIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof multiLayerSubnetwork.SubnetworkIterator_I)
		{
			return (multiLayerSubnetwork.SubnetworkIterator_I)obj;
		}
		else
		{
			multiLayerSubnetwork._SubnetworkIterator_IStub stub;
			stub = new multiLayerSubnetwork._SubnetworkIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

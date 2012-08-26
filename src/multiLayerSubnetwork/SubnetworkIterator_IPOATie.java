package multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SubnetworkIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public class SubnetworkIterator_IPOATie
	extends SubnetworkIterator_IPOA
{
	private SubnetworkIterator_IOperations _delegate;

	private POA _poa;
	public SubnetworkIterator_IPOATie(SubnetworkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SubnetworkIterator_IPOATie(SubnetworkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public multiLayerSubnetwork.SubnetworkIterator_I _this()
	{
		return multiLayerSubnetwork.SubnetworkIterator_IHelper.narrow(_this_object());
	}
	public multiLayerSubnetwork.SubnetworkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return multiLayerSubnetwork.SubnetworkIterator_IHelper.narrow(_this_object(orb));
	}
	public SubnetworkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SubnetworkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, multiLayerSubnetwork.SubnetworkList_THolder subnetworkList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,subnetworkList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}

package topologicalLink;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TopologicalLinkIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:24
 */

public class TopologicalLinkIterator_IPOATie
	extends TopologicalLinkIterator_IPOA
{
	private TopologicalLinkIterator_IOperations _delegate;

	private POA _poa;
	public TopologicalLinkIterator_IPOATie(TopologicalLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TopologicalLinkIterator_IPOATie(TopologicalLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public topologicalLink.TopologicalLinkIterator_I _this()
	{
		return topologicalLink.TopologicalLinkIterator_IHelper.narrow(_this_object());
	}
	public topologicalLink.TopologicalLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return topologicalLink.TopologicalLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public TopologicalLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopologicalLinkIterator_IOperations delegate)
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

	public boolean next_n(int how_many, topologicalLink.TopologicalLinkList_THolder topoLinkList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,topoLinkList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}

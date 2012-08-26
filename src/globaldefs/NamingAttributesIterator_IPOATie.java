package globaldefs;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "NamingAttributesIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public class NamingAttributesIterator_IPOATie
	extends NamingAttributesIterator_IPOA
{
	private NamingAttributesIterator_IOperations _delegate;

	private POA _poa;
	public NamingAttributesIterator_IPOATie(NamingAttributesIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public NamingAttributesIterator_IPOATie(NamingAttributesIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public globaldefs.NamingAttributesIterator_I _this()
	{
		return globaldefs.NamingAttributesIterator_IHelper.narrow(_this_object());
	}
	public globaldefs.NamingAttributesIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return globaldefs.NamingAttributesIterator_IHelper.narrow(_this_object(orb));
	}
	public NamingAttributesIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NamingAttributesIterator_IOperations delegate)
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

	public boolean next_n(int how_many, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,nameList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}

package subnetworkConnection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CCIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public class CCIterator_IPOATie
	extends CCIterator_IPOA
{
	private CCIterator_IOperations _delegate;

	private POA _poa;
	public CCIterator_IPOATie(CCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CCIterator_IPOATie(CCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public subnetworkConnection.CCIterator_I _this()
	{
		return subnetworkConnection.CCIterator_IHelper.narrow(_this_object());
	}
	public subnetworkConnection.CCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return subnetworkConnection.CCIterator_IHelper.narrow(_this_object(orb));
	}
	public CCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CCIterator_IOperations delegate)
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

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, subnetworkConnection.CrossConnectList_THolder ccList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,ccList);
	}

}

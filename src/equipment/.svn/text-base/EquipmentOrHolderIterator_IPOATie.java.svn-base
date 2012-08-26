package equipment;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EquipmentOrHolderIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public class EquipmentOrHolderIterator_IPOATie
	extends EquipmentOrHolderIterator_IPOA
{
	private EquipmentOrHolderIterator_IOperations _delegate;

	private POA _poa;
	public EquipmentOrHolderIterator_IPOATie(EquipmentOrHolderIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentOrHolderIterator_IPOATie(EquipmentOrHolderIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public equipment.EquipmentOrHolderIterator_I _this()
	{
		return equipment.EquipmentOrHolderIterator_IHelper.narrow(_this_object());
	}
	public equipment.EquipmentOrHolderIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return equipment.EquipmentOrHolderIterator_IHelper.narrow(_this_object(orb));
	}
	public EquipmentOrHolderIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentOrHolderIterator_IOperations delegate)
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

	public boolean next_n(int how_many, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,equipmentOrHolderList);
	}

}

package alarmMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AlarmDataIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public class AlarmDataIterator_IPOATie
	extends AlarmDataIterator_IPOA
{
	private AlarmDataIterator_IOperations _delegate;

	private POA _poa;
	public AlarmDataIterator_IPOATie(AlarmDataIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmDataIterator_IPOATie(AlarmDataIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public alarmMgr.AlarmDataIterator_I _this()
	{
		return alarmMgr.AlarmDataIterator_IHelper.narrow(_this_object());
	}
	public alarmMgr.AlarmDataIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return alarmMgr.AlarmDataIterator_IHelper.narrow(_this_object(orb));
	}
	public AlarmDataIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmDataIterator_IOperations delegate)
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

	public boolean next_n(int how_many, alarmMgr.AlarmDataList_THolder alarmDataList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,alarmDataList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}

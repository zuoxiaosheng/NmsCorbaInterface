package alarmMgr;

/**
 * Generated from IDL interface "AlarmDataIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class AlarmDataIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public AlarmDataIterator_I value;
	public AlarmDataIterator_IHolder()
	{
	}
	public AlarmDataIterator_IHolder (final AlarmDataIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AlarmDataIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmDataIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AlarmDataIterator_IHelper.write (_out,value);
	}
}

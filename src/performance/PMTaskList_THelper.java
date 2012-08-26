package performance;

/**
 * Generated from IDL alias "PMTaskList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMTaskList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, performance.PMTask_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static performance.PMTask_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(performance.PMTaskList_THelper.id(), "PMTaskList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, performance.PMTask_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMTaskList_T:1.0";
	}
	public static performance.PMTask_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		performance.PMTask_T[] _result;
		int _l_result10 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result10 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result10);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new performance.PMTask_T[_l_result10];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=performance.PMTask_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, performance.PMTask_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			performance.PMTask_THelper.write(_out,_s[i]);
		}

	}
}

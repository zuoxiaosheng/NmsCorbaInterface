package alarmMgr;

/**
 * Generated from IDL alias "PerceivedSeverityList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class PerceivedSeverityList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, alarmMgr.PerceivedSeverity_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static alarmMgr.PerceivedSeverity_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(alarmMgr.PerceivedSeverityList_THelper.id(), "PerceivedSeverityList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, alarmMgr.PerceivedSeverity_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/PerceivedSeverityList_T:1.0";
	}
	public static alarmMgr.PerceivedSeverity_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		alarmMgr.PerceivedSeverity_T[] _result;
		int _l_result1 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result1 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result1);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new alarmMgr.PerceivedSeverity_T[_l_result1];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=alarmMgr.PerceivedSeverity_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, alarmMgr.PerceivedSeverity_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			alarmMgr.PerceivedSeverity_THelper.write(_out,_s[i]);
		}

	}
}

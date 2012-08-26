package callSNC;

/**
 * Generated from IDL alias "SNCAndRouteList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class SNCAndRouteList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, callSNC.SNCAndRoute_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static callSNC.SNCAndRoute_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(callSNC.SNCAndRouteList_THelper.id(), "SNCAndRouteList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, callSNC.SNCAndRoute_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/SNCAndRouteList_T:1.0";
	}
	public static callSNC.SNCAndRoute_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		callSNC.SNCAndRoute_T[] _result;
		int _l_result7 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result7 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result7);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new callSNC.SNCAndRoute_T[_l_result7];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=callSNC.SNCAndRoute_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, callSNC.SNCAndRoute_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			callSNC.SNCAndRoute_THelper.write(_out,_s[i]);
		}

	}
}

package emsMgr;

/**
 * Generated from IDL alias "TransmissionSystemList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class TransmissionSystemList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, emsMgr.TransmissionSystem_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static emsMgr.TransmissionSystem_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(emsMgr.TransmissionSystemList_THelper.id(), "TransmissionSystemList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, emsMgr.TransmissionSystem_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/TransmissionSystemList_T:1.0";
	}
	public static emsMgr.TransmissionSystem_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		emsMgr.TransmissionSystem_T[] _result;
		int _l_result6 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result6 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result6);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new emsMgr.TransmissionSystem_T[_l_result6];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=emsMgr.TransmissionSystem_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, emsMgr.TransmissionSystem_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			emsMgr.TransmissionSystem_THelper.write(_out,_s[i]);
		}

	}
}

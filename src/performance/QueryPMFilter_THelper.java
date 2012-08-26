package performance;


/**
 * Generated from IDL struct "QueryPMFilter_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class QueryPMFilter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.QueryPMFilter_THelper.id(),"QueryPMFilter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmSourceSelect", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pmParameterSelect", performance.PMParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("pmGranularitySelect", performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("layerRateList", transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("pMLocationList", performance.PMLocationList_THelper.type(), null),new org.omg.CORBA.StructMember("raiseTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("clearTime", globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.QueryPMFilter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.QueryPMFilter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/QueryPMFilter_T:1.0";
	}
	public static performance.QueryPMFilter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.QueryPMFilter_T result = new performance.QueryPMFilter_T();
		result.pmSourceSelect = globaldefs.NamingAttributesList_THelper.read(in);
		result.pmParameterSelect = performance.PMParameterList_THelper.read(in);
		result.pmGranularitySelect=in.read_string();
		result.layerRateList = transmissionParameters.LayerRateList_THelper.read(in);
		result.pMLocationList = performance.PMLocationList_THelper.read(in);
		result.raiseTime=in.read_string();
		result.clearTime=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.QueryPMFilter_T s)
	{
		globaldefs.NamingAttributesList_THelper.write(out,s.pmSourceSelect);
		performance.PMParameterList_THelper.write(out,s.pmParameterSelect);
		out.write_string(s.pmGranularitySelect);
		transmissionParameters.LayerRateList_THelper.write(out,s.layerRateList);
		performance.PMLocationList_THelper.write(out,s.pMLocationList);
		out.write_string(s.raiseTime);
		out.write_string(s.clearTime);
	}
}

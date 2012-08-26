package performance;


/**
 * Generated from IDL struct "PMTPSelect_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMTPSelect_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.PMTPSelect_THelper.id(),"PMTPSelect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRateList", transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("pMLocationList", performance.PMLocationList_THelper.type(), null),new org.omg.CORBA.StructMember("granularityList", performance.GranularityList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMTPSelect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMTPSelect_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMTPSelect_T:1.0";
	}
	public static performance.PMTPSelect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.PMTPSelect_T result = new performance.PMTPSelect_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.layerRateList = transmissionParameters.LayerRateList_THelper.read(in);
		result.pMLocationList = performance.PMLocationList_THelper.read(in);
		result.granularityList = performance.GranularityList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.PMTPSelect_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		transmissionParameters.LayerRateList_THelper.write(out,s.layerRateList);
		performance.PMLocationList_THelper.write(out,s.pMLocationList);
		performance.GranularityList_THelper.write(out,s.granularityList);
	}
}

package performance;


/**
 * Generated from IDL struct "PMTask_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.PMTask_THelper.id(),"PMTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("taskName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("pmCollectionPlanList", performance.PMCollectionPlanList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMTask_T:1.0";
	}
	public static performance.PMTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.PMTask_T result = new performance.PMTask_T();
		result.taskName = globaldefs.NVSList_THelper.read(in);
		result.pmCollectionPlanList = performance.PMCollectionPlanList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.PMTask_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.taskName);
		performance.PMCollectionPlanList_THelper.write(out,s.pmCollectionPlanList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}

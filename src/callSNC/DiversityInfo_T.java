package callSNC;

/**
 * Generated from IDL struct "DiversityInfo_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class DiversityInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public DiversityInfo_T(){}
	public java.lang.String sRGType = "";
	public callSNC.SharedResource_T[] sharedResourceList;
	public DiversityInfo_T(java.lang.String sRGType, callSNC.SharedResource_T[] sharedResourceList)
	{
		this.sRGType = sRGType;
		this.sharedResourceList = sharedResourceList;
	}
}

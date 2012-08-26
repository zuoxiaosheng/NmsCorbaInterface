package emsMgr;

/**
 * Generated from IDL struct "VB_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class VB_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VB_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String vbID = "";
	public java.lang.String cID = "";
	public java.lang.String userLabel = "";
	public emsMgr.LogicalPort_T[] lps;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public VB_T(globaldefs.NameAndStringValue_T[] name, java.lang.String vbID, java.lang.String cID, java.lang.String userLabel, emsMgr.LogicalPort_T[] lps, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.vbID = vbID;
		this.cID = cID;
		this.userLabel = userLabel;
		this.lps = lps;
		this.additionalInfo = additionalInfo;
	}
}

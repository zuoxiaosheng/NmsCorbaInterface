package callSNC;

/**
 * Generated from IDL struct "Diversity_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class Diversity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Diversity_T(){}
	public java.lang.String coroutingLevelOfEffort;
	public java.lang.String nodeDiversityLevelOfEffort;
	public java.lang.String linkDiversityLevelOfEffort;
	public java.lang.String nodeSRGType = "";
	public java.lang.String linkSRGType = "";
	public Diversity_T(java.lang.String coroutingLevelOfEffort, java.lang.String nodeDiversityLevelOfEffort, java.lang.String linkDiversityLevelOfEffort, java.lang.String nodeSRGType, java.lang.String linkSRGType)
	{
		this.coroutingLevelOfEffort = coroutingLevelOfEffort;
		this.nodeDiversityLevelOfEffort = nodeDiversityLevelOfEffort;
		this.linkDiversityLevelOfEffort = linkDiversityLevelOfEffort;
		this.nodeSRGType = nodeSRGType;
		this.linkSRGType = linkSRGType;
	}
}

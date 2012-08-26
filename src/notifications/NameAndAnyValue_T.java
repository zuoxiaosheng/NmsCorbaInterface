package notifications;

/**
 * Generated from IDL struct "NameAndAnyValue_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class NameAndAnyValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameAndAnyValue_T(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public NameAndAnyValue_T(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}

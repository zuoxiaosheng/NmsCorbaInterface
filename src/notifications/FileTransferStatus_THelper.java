package notifications;
/**
 * Generated from IDL enum "FileTransferStatus_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class FileTransferStatus_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(notifications.FileTransferStatus_THelper.id(),"FileTransferStatus_T",new String[]{"FT_IN_PROGRESS","FT_FAILED","FT_COMPLETED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.FileTransferStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.FileTransferStatus_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/FileTransferStatus_T:1.0";
	}
	public static FileTransferStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return FileTransferStatus_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final FileTransferStatus_T s)
	{
		out.write_long(s.value());
	}
}

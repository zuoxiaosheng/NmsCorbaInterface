package emsSessionFactory;


/**
 * Generated from IDL interface "EmsSessionFactory_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:08
 */

public class _EmsSessionFactory_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements emsSessionFactory.EmsSessionFactory_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/emsSessionFactory/EmsSessionFactory_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = emsSessionFactory.EmsSessionFactory_IOperations.class;
	public void getEmsSession(java.lang.String user, java.lang.String password, nmsSession.NmsSession_I client, emsSession.EmsSession_IHolder emsSessionInterface) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getEmsSession", true);
				_os.write_string(user);
				_os.write_string(password);
				nmsSession.NmsSession_IHelper.write(_os,client);
				_is = _invoke(_os);
				emsSessionInterface.value = emsSession.EmsSession_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
					{
						throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEmsSession", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EmsSessionFactory_IOperations _localServant = (EmsSessionFactory_IOperations)_so.servant;
			try
			{
				_localServant.getEmsSession(user,password,client,emsSessionInterface);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}

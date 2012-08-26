package managedElementManager;


/**
 * Generated from IDL interface "ManagedElementMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:00
 */

public class _ManagedElementMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements managedElementManager.ManagedElementMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = managedElementManager.ManagedElementMgr_IOperations.class;
	public void getContainedCurrentTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getContainedCurrentTPs", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = terminationPoint.TerminationPointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedCurrentTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createCrossConnections(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] add, subnetworkConnection.CrossConnectList_THolder addSuccess) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "createCrossConnections", true);
				globaldefs.NVSList_THelper.write(_os,meName);
				subnetworkConnection.CrossConnectList_THelper.write(_os,add);
				_is = _invoke(_os);
				addSuccess.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.createCrossConnections(meName,add,addSuccess);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElements(managedElement.ManagedElementList_THolder meList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllManagedElements", true);
				_is = _invoke(_os);
				meList.value = managedElement.ManagedElementList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllManagedElements", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllManagedElements(meList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedInUseTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getContainedInUseTPNames", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedInUseTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getContainedInUseTPNames(tpName,layerRateList,nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setUserLabel", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setAdditionalInfo", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.setAdditionalInfo(objectName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedList, subnetworkConnection.CrossConnectList_THolder failedList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "deleteCrossConnections", true);
				subnetworkConnection.CrossConnectList_THelper.write(_os,ccList);
				_is = _invoke(_os);
				successedList.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
				failedList.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.deleteCrossConnections(ccList,successedList,failedList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedPotentialTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getContainedPotentialTPs", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = terminationPoint.TerminationPointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedPotentialTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedInUseTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getContainedInUseTPs", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = terminationPoint.TerminationPointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedInUseTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setLocation", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(location);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setLocation", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.setLocation(objectName,location);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setTPData(subnetworkConnection.TPData_T tpInfo, terminationPoint.TerminationPoint_THolder modifiedTP) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setTPData", true);
				subnetworkConnection.TPData_THelper.write(_os,tpInfo);
				_is = _invoke(_os);
				modifiedTP.value = terminationPoint.TerminationPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTPData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.setTPData(tpInfo,modifiedTP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder crossConnections, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCrossConnections", true);
				globaldefs.NVSList_THelper.write(_os,managedElementName);
				transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				crossConnections.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
				ccIt.value = subnetworkConnection.CCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCrossConnections(managedElementName,connectionRateList,how_many,crossConnections,ccIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPoint_THolder tp) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getTP", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				tp.value = terminationPoint.TerminationPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getTP(tpName,tp);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = common.CapabilityList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedPotentialTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getContainedPotentialTPNames", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedPotentialTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getContainedPotentialTPNames(tpName,layerRateList,nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setNativeEMSName", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMECoordinates(globaldefs.NameAndStringValue_T[][] meNameList, managedElement.MECoordinateList_THolder meCoordList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getMECoordinates", true);
				globaldefs.NamingAttributesList_THelper.write(_os,meNameList);
				_is = _invoke(_os);
				meCoordList.value = managedElement.MECoordinateList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMECoordinates", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getMECoordinates(meNameList,meCoordList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElementNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllManagedElementNames", true);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllManagedElementNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllManagedElementNames(nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getContainedCurrentTPNames", true);
				globaldefs.NVSList_THelper.write(_os,tpName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedCurrentTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getContainedCurrentTPNames(tpName,layerRateList,nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMEconfigData(globaldefs.NameAndStringValue_T[] name, java.lang.String[] configDataTypes, managedElementManager.MEConfigData_THolder meConfigDatas) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getMEconfigData", true);
				globaldefs.NVSList_THelper.write(_os,name);
				globaldefs.StringList_THelper.write(_os,configDataTypes);
				_is = _invoke(_os);
				meConfigDatas.value = managedElementManager.MEConfigData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEconfigData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getMEconfigData(name,configDataTypes,meConfigDatas);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCrossConnection(globaldefs.NameAndStringValue_T[] ccName, subnetworkConnection.CrossConnect_THolder crossConnection) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getCrossConnection", true);
				globaldefs.NVSList_THelper.write(_os,ccName);
				_is = _invoke(_os);
				crossConnection.value = subnetworkConnection.CrossConnect_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCrossConnection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getCrossConnection(ccName,crossConnection);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setCrossConnections(subnetworkConnection.CrossConnect_T[] add, subnetworkConnection.CrossConnect_T[] remove, subnetworkConnection.CrossConnectList_THolder addSuccess, subnetworkConnection.CrossConnectList_THolder removeSuccess) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setCrossConnections", true);
				subnetworkConnection.CrossConnectList_THelper.write(_os,add);
				subnetworkConnection.CrossConnectList_THelper.write(_os,remove);
				_is = _invoke(_os);
				addSuccess.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
				removeSuccess.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.setCrossConnections(add,remove,addSuccess,removeSuccess);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedList, subnetworkConnection.CrossConnectList_THolder failedList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "deactivateCrossConnections", true);
				subnetworkConnection.CrossConnectList_THelper.write(_os,ccList);
				_is = _invoke(_os);
				successedList.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
				failedList.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.deactivateCrossConnections(ccList,successedList,failedList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllPTPs", true);
				globaldefs.NVSList_THelper.write(_os,managedElementName);
				transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
				transmissionParameters.LayerRateList_THelper.write(_os,connectionLayerRateList);
				_is = _invoke(_os);
				tpList.value = terminationPoint.TerminationPointList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,tpList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMEClockCoordinates(globaldefs.NameAndStringValue_T[][] meNameList, managedElement.MECoordinateList_THolder meCoordList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getMEClockCoordinates", true);
				globaldefs.NamingAttributesList_THelper.write(_os,meNameList);
				_is = _invoke(_os);
				meCoordList.value = managedElement.MECoordinateList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEClockCoordinates", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getMEClockCoordinates(meNameList,meCoordList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getManagedElement(globaldefs.NameAndStringValue_T[] managedElementName, managedElement.ManagedElement_THolder me) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getManagedElement", true);
				globaldefs.NVSList_THelper.write(_os,managedElementName);
				_is = _invoke(_os);
				me.value = managedElement.ManagedElement_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getManagedElement", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.getManagedElement(managedElementName,me);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedList, subnetworkConnection.CrossConnectList_THolder failedList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "activateCrossConnections", true);
				subnetworkConnection.CrossConnectList_THelper.write(_os,ccList);
				_is = _invoke(_os);
				successedList.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
				failedList.value = subnetworkConnection.CrossConnectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
				_localServant.activateCrossConnections(ccList,successedList,failedList);
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

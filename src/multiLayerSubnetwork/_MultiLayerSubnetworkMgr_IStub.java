package multiLayerSubnetwork;


/**
 * Generated from IDL interface "MultiLayerSubnetworkMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public class _MultiLayerSubnetworkMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements multiLayerSubnetwork.MultiLayerSubnetworkMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations.class;
	public void getIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getIntendedRoute", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = globaldefs.NVSList_THelper.read(_is);
				route.value = subnetworkConnection.Route_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIntendedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setRoutesAdminState(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, subnetworkConnection.SNCState_THolder sncState) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setRoutesAdminState", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				subnetworkConnection.RouteNameAndAdminStateList_THelper.write(_os,routeNameAndAdminStateList.value);
				_is = _invoke(_os);
				routeNameAndAdminStateList.value = subnetworkConnection.RouteNameAndAdminStateList_THelper.read(_is);
				sncState.value = subnetworkConnection.SNCState_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setRoutesAdminState", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addConnections(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder connectionList, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "addConnections", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				subnetworkConnection.SNCCreateDataList_THelper.write(_os,connectionsToAdd);
				_os.write_boolean(connectionRouteReArrangementAllowed);
				subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = subnetworkConnection.TPDataList_THelper.read(_is);
				connectionList.value = subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				partialSNCs.value = subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinks(globaldefs.NameAndStringValue_T[] subnetName, topologicalLink.TopologicalLinkList_THolder topoList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllTopologicalLinks", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				topoList.value = topologicalLink.TopologicalLinkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllTopologicalLinks(subnetName,topoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubordinateRAidsWithConnection(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllSubordinateRAidsWithConnection", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				globaldefs.NVSList_THelper.write(_os,connection);
				_os.write_string(routeType);
				_is = _invoke(_os);
				routePerRouteType.value = multiLayerSubnetwork.RoutePerRouteType_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubordinateRAidsWithConnection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createAndActivateSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "createAndActivateSNC", true);
				subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAndActivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.createAndActivateSNC(createData,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteSNC(globaldefs.NameAndStringValue_T[] sncName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "deleteSNC", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.deleteSNC(sncName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "activateSNC", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.activateSNC(sncName,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifySNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "modifySNC", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				subnetworkConnection.SNCModifyData_THelper.write(_os,SNCModifyData);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				subnetworkConnection.ProtectionEffort_THelper.write(_os,tolerableImpactEffort);
				subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = subnetworkConnection.TPDataList_THelper.read(_is);
				newSNC.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifySNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,tpsToModify,newSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void establishCall(callSNC.CallCreateData_T callCreateData, subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, subnetworkConnection.TPDataList_THolder tpsToModify, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections, subnetworkConnection.SNCCreateDataList_THolder connectionsNotCreated, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "establishCall", true);
				callSNC.CallCreateData_THelper.write(_os,callCreateData);
				subnetworkConnection.SNCCreateDataList_THelper.write(_os,connectionCreateDataList);
				_os.write_string(routeGroupsNumber);
				subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = subnetworkConnection.TPDataList_THelper.read(_is);
				callAndTopLevelConnections.value = callSNC.CallAndTopLevelConnections_THelper.read(_is);
				connectionsNotCreated.value = subnetworkConnection.SNCCreateDataList_THelper.read(_is);
				partialSNCs.value = subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				callErrorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "establishCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnections,connectionsNotCreated,partialSNCs,callErrorReason);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void getSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getSNC", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				snc.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getSNC(sncName,snc);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "deactivateSNC", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.deactivateSNC(sncName,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "createSNC", true);
				subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.createSNC(createData,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallIdsWithTP(globaldefs.NameAndStringValue_T[] tPName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallIdsWithTP", true);
				globaldefs.NVSList_THelper.write(_os,tPName);
				_is = _invoke(_os);
				callIdList.value = callSNC.CallIdList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallIdsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallIdsWithTP(tPName,callIdList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addRoute(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteCreateData_T createRoute, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "addRoute", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				subnetworkConnection.RouteCreateData_THelper.write(_os,createRoute);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				_is = _invoke(_os);
				theRoute.value = subnetworkConnection.RouteDescriptor_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllSubnetworkConnections", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = subnetworkConnection.SNCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getRoute", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				route.value = subnetworkConnection.Route_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getRoute(sncName,includeHigherOrderCCs,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubordinateMLSNs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllSubordinateMLSNs", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				subordinateMLSNsList.value = multiLayerSubnetwork.SubnetworkList_THelper.read(_is);
				subnetIt.value = multiLayerSubnetwork.SubnetworkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubordinateMLSNs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getConnectionsAndRouteDetails", true);
				_os.write_string(callID);
				globaldefs.NVSList_THelper.write(_os,mLRAName);
				_os.write_string(sNPOrSNPPID);
				_os.write_boolean(mLSNPPLinkRequested);
				_os.write_string(routeType);
				_is = _invoke(_os);
				connectionAndRouteList.value = callSNC.SNCAndRouteList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getConnectionsAndRouteDetails", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallIdsWithSNPPOrTNAName(globaldefs.NameAndStringValue_T SNPPOrTNAName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallIdsWithSNPPOrTNAName", true);
				globaldefs.NameAndStringValue_THelper.write(_os,SNPPOrTNAName);
				_is = _invoke(_os);
				callIdList.value = callSNC.CallIdList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallIdsWithSNPPOrTNAName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallIdsWithSNPPOrTNAName(SNPPOrTNAName,callIdList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] tPName, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				globaldefs.NVSList_THelper.write(_os,tPName);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setSRG(java.lang.String srgId, int setOrRelase, globaldefs.NameAndStringValue_T[][] objectNames) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setSRG", true);
				_os.write_string(srgId);
				_os.write_long(setOrRelase);
				globaldefs.NamingAttributesList_THelper.write(_os,objectNames);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setSRG", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.setSRG(srgId,setOrRelase,objectNames);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void modifyDiversityAndCorouting(globaldefs.NameAndStringValue_T[] callName, callSNC.Diversity_T callDiversity, callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "modifyDiversityAndCorouting", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				callSNC.Diversity_THelper.write(_os,callDiversity);
				callSNC.RouteGroupInfoList_THelper.write(_os,routeGroupInfoList);
				_os.write_boolean(connectionRouteReArrangementAllowed);
				_os.write_string(routeGroupsNumber);
				_is = _invoke(_os);
				callAndTopLevelConnections.value = callSNC.CallAndTopLevelConnections_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyDiversityAndCorouting", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,callAndTopLevelConnections);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateAndDeleteSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "deactivateAndDeleteSNC", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateAndDeleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.deactivateAndDeleteSNC(sncName,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void removeRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "removeRoute", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getBackupRoutes(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.RouteList_THolder routeList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getBackupRoutes", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				_os.write_boolean(includeHigherOrderCCs);
				globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = globaldefs.NVSList_THelper.read(_is);
				routeList.value = subnetworkConnection.RouteList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getBackupRoutes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyCall(globaldefs.NameAndStringValue_T[] callName, callSNC.CallModifyData_T callModifyData, callSNC.Call_THolder modifiedCall) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "modifyCall", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				callSNC.CallModifyData_THelper.write(_os,callModifyData);
				_is = _invoke(_os);
				modifiedCall.value = callSNC.Call_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.modifyCall(callName,callModifyData,modifiedCall);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTPPools(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllTPPools", true);
				globaldefs.NVSList_THelper.write(_os,subnetworkName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTPPools", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void switchRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "switchRoute", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				tpsToModify.value = subnetworkConnection.TPDataList_THelper.read(_is);
				additionalInfo.value = globaldefs.NVSList_THelper.read(_is);
				sncState.value = subnetworkConnection.SNCState_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "switchRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void releaseCall(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "releaseCall", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = subnetworkConnection.TPDataList_THelper.read(_is);
				remainingSNCs.value = subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "releaseCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void removeConnections(globaldefs.NameAndStringValue_T[] callName, globaldefs.NameAndStringValue_T[][] connectionNamesList, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "removeConnections", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				globaldefs.NamingAttributesList_THelper.write(_os,connectionNamesList);
				subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = subnetworkConnection.TPDataList_THelper.read(_is);
				sNCsNotDeleted.value = subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCallAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] callName, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getCallAndTopLevelConnectionsAndSNCs", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCs.value = callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCallAndTopLevelConnectionsAndSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void setIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "setIntendedRoute", true);
				globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setIntendedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.setIntendedRoute(sncName,routeId,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallsAndTopLevelConnectionsAndSNCs", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnections(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallsAndTopLevelConnections", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsList.value = callSNC.CallAndTopLevelConnectionsList_THelper.read(_is);
				callAndTopLevelConnectionsIt.value = callSNC.CallAndTopLevelConnectionsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMultiLayerSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getMultiLayerSubnetwork", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				subnetwork.value = multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMultiLayerSubnetwork", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getMultiLayerSubnetwork(subnetName,subnetwork);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCall(globaldefs.NameAndStringValue_T[] callName, callSNC.Call_THolder theCall) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getCall", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				_is = _invoke(_os);
				theCall.value = callSNC.Call_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getCall(callName,theCall);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCallAndTopLevelConnections(globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getCallAndTopLevelConnections", true);
				globaldefs.NVSList_THelper.write(_os,callName);
				_os.write_string(callId);
				_is = _invoke(_os);
				callAndTopLevelConnections.value = callSNC.CallAndTopLevelConnections_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCallAndTopLevelConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "getAllCallsAndTopLevelConnectionsWithME", true);
				globaldefs.NVSList_THelper.write(_os,subnetName);
				globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsList.value = callSNC.CallAndTopLevelConnectionsList_THelper.read(_is);
				callAndTopLevelConnectionsIt.value = callSNC.CallAndTopLevelConnectionsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
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

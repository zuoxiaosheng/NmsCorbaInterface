package com.jexchen.blazeds;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jexchen.utils.OpenDao;

public class VildateLogin {
	private List TopoInforArray;
	//GUIµÇÂ¼
	public boolean LoginDemo(String uname, String passwd) {
		boolean loginResult = false;
		OpenDao open = new OpenDao();  
		if (null != uname && "" != passwd) {
			 String sql = "select * from login_user where username='" + uname
			 + "' and password='" + passwd + "'";
			 ResultSet rs =null; 
			 rs=open.doQuery(sql);
			 if (rs != null) {
			 	try {
			 		while (rs.next()) {
			 			loginResult = true;
			 			System.out.println(loginResult);
			 			}
			 		}
			 	catch (SQLException e) {  
			 		e.printStackTrace();  
			 		return loginResult ;
			 		}
			 	}
			 }
		System.out.println(loginResult);
		return loginResult;
		}
	//GUIÏÔÊ¾ÍØÆË
	public List GetTopoInfor(String uname){	
		TopoInforArray=new ArrayList();
		OpenDao open = new OpenDao();  
		String sql="select * from tedentry where username='" + uname+"'";	 
		System.out.println(sql);
		if(null!=uname){ 		
			ResultSet myResultSet =null; 
			myResultSet=open.doQuery(sql);
			try{
				while(myResultSet.next()){
					Map NodeInfor=new HashMap();
					NodeInfor.put("teRouterId", myResultSet.getObject("teRouterId"));
					NodeInfor.put("teLinkStateId", myResultSet.getObject("teLinkStateId"));
					NodeInfor.put("teAreaId", myResultSet.getObject("teAreaId"));
					NodeInfor.put("teLinkIdAddr", myResultSet.getObject("teLinkIdAddr"));
					NodeInfor.put("teRemoteId", myResultSet.getObject("teRemoteId"));
					NodeInfor.put("teLocalId", myResultSet.getObject("teLocalId"));
					TopoInforArray.add(NodeInfor);
		 			}
		 		}
			catch (SQLException e) {  
				e.printStackTrace();  
				return null ;
				}
			return TopoInforArray;
			}
		return TopoInforArray;
		}
	}

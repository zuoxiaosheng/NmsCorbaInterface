package com.jexchen.utils;
import java.sql.*;

public class OpenDao {
	public static Connection conn = null;
	//连接数据库
	public Connection initDB() {
		String url = "jdbc:MySQL://localhost:3306/test";
		String user = "root";
		String password = "123456";
		
		try {			
			Class.forName("com.mysql.jdbc.Driver");//加载JDBC驱动程序 
			conn = DriverManager.getConnection(url,user,password);//连接MySQL数据库
			}
		catch (ClassNotFoundException e) {
			System.out.println("找不到驱动类");
			}
		catch (SQLException e) {
			System.out.println("连接MySQL数据库失败");
			}
		return conn;
		}
	//查询数据库
	public ResultSet doQuery(String sql) {
		initDB();
		try{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);			
			return rs;
			}
		catch (SQLException e) {
			System.out.println("查询数据库失败");
			}
		return null;
		}
	//更新数据库
	public boolean doUpdate(String sql) {
		initDB();
		try{
			Statement stmt = conn.createStatement();
			int rc = stmt.executeUpdate(sql);			
			if(rc != 0)
				return true;
			}
		catch (SQLException e) {
			System.out.println("更新数据库失败");
			}
		return false;
		}
	}

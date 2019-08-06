package com.internousdev.webproj3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	//JDBC Driver name
	private static String driverName = "com.mysql.jdbc.Driver";

	//DB CONNECT URL
	private static String url ="jdbc:mysql://localhost.testdb33";

	//DB CONNECT USER NAME
	private static String user="root";

	//DB CONNECT PASSWORD
	private static String passeord ="mysql";

	public Connection getConnection(){
		Connection con =null;
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,passeord);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
		e.printStackTrace();
	}
		return con;
	}
}

package com.internousdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/*drivername*/
	private static String driverName ="com.mysql.jdbc.Driver";

	/*database connect url*/
	private static String url ="jdbc:mysql://localhost/testdb44";

	/*DB connect user name*/
	private static String user ="root";

	/*DB con pass*/
	private static String password="mysql";

	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}

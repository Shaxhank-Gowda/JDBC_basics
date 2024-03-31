package extendsMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnectorExtends {
	
	static Connection connection;
	 static String path="jdbc:mysql://localhost:3306";
	 static String user="root";
	 static String password="root";
	 
		public static Connection getMyConnection (String schema) throws SQLException,ClassNotFoundException{
		
		if(schema!=null) {
		schema="/"+schema;
		}
		else {
			schema="";
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection( path + schema , user , password);
		System.out.println("Connection Established");	
		return connection;
	}
	
}

package objectMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnector {
	
	static Connection connection;
	 String path="jdbc:mysql://localhost:3306";
	 String user="root";
	 String password="root";
	 
	MyConnector(String schema) throws SQLException,ClassNotFoundException{
		
		if(schema!=null) {
		schema="/"+schema;
		}
		else {
			schema="";
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection( path + schema , user , password);
		System.out.println("Connection Established");	
	}
	
	public Connection getConnection(){
		return connection;
	}
	
	public static void setConnection(Connection connection) {
		MyConnector.connection = connection;
	}

}

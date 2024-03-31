package objectMethod;

import java.sql.Connection;
import java.sql.Statement;

public class CreateSchema  {
	public static void main(String[] args ) throws Exception {
		MyConnector connector= new MyConnector(null);
		
		Connection connection = connector.getConnection();
		
		Statement statement=connection.createStatement();
		statement.execute("create  database JDBCpractise");
		System.out.println("scchema created");
	}
}

package extendsMethod;

import java.sql.Statement;

public class CreateSchema extends MyConnectorExtends {
	public static void main (String[] args ) throws Exception {
		connection=getMyConnection(null);
		Statement statement=connection.createStatement();
		statement.execute("create  database JDBCpractise2");
		System.out.println("schema created");
	}
}

package objectMethod;

import java.sql.SQLException;
import java.sql.Statement;

public class insertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Statement statement= new MyConnector("JDBCpractise").getConnection().createStatement();
		statement.execute("INSERT INTO `newtable`"
				+ "(`reg`,`name`)"
				+ "VALUES (2, 'Fku');");
		System.out.println("values Inserted");

	}

}

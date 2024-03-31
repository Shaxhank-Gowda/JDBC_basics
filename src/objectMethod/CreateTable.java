package objectMethod;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MyConnector connector= new MyConnector("JDBCpractise");
		
		Connection connection = connector.getConnection();
		
		Statement statement=connection.createStatement();
		statement.execute("CREATE TABLE `newtable` ("
				+ "  `reg` INT NOT NULL,"
				+ "  `name` VARCHAR(45) NULL,"
				+ "  PRIMARY KEY (`reg`));");
		System.out.println("table created");
	}

}

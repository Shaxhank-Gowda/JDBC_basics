package extendsMethod;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable extends MyConnectorExtends {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Statement statement=getMyConnection("JDBCpractise2").createStatement();
		statement.execute("CREATE TABLE `newtable` ("
				+ "  `reg` INT NOT NULL,"
				+ "  `name` VARCHAR(45) NULL,"
				+ "  PRIMARY KEY (`reg`));");
		System.out.println("table created");
	}

}

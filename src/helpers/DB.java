package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	private String usr="postgres";
	private String pwd="12345678";
	private String url="jdbc:postgresql://localhost:5432/Proyecto_1";
	String drive="org.postgresql.Driver";
	String sql=null;
	Connection connection = null;
	
	void star(String name) {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, usr, pwd);
			Statement stmt= connection.prepareStatement("INSERT INTO account value (?,?,?,?,?,?)");
			
			//stmt.setString()
			
		}catch (ClassNotFoundException | SQLException ex) {
		    System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		}
	}
}

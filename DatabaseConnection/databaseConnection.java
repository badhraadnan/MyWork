package DatabaseConnection;
import java.sql.*;
import javax.sql.*;

public class databaseConnection {
	

	public static final String username="root";
	public static final  String password="Adnan";
	public static final  String url = "jdbc:mysql://localhost:3306/Bank";
	public static Connection getConnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection(url,username,password);
			System.out.println("connection Successfull");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cn;
	}
}

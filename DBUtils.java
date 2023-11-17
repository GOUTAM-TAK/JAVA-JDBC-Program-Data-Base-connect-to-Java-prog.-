package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection cn;

	public static Connection openConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(url, "root", "16earee025");
		return cn;
	}

	public static void closeConnection() throws SQLException {
		if (cn != null)
			cn.close();
	}
}

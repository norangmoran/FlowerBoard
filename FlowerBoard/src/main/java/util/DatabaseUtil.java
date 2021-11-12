package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() { 
	//getConnection함수를 다른 라이브러리에서 쉽게 사용하도록 static추가
		try {
			String dbURL = "jdbc:mysql://localhost:3306/flowerboard";
			String dbID = "root";
			String dbPW = "";
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPW);
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
}

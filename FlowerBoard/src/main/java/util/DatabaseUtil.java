package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() { 
	//getConnection�Լ��� �ٸ� ���̺귯������ ���� ����ϵ��� static�߰�
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

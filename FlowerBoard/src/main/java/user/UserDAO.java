package user;
import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {
	public int join(String userID, String userPW) {
		String SQL = "INSERT INTO USER VALUES(?,?)";
		try {
			Connection conn = DatabaseUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPW);
			return pstmt.executeUpdate();
			//executeUpdate()는 INSERT된 데이터의 갯수를 뜻함. 즉 함수타입이 int임
		} catch (Exception e) {e.printStackTrace();}
		return -1;
	}
}

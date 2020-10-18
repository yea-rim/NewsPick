package ytn;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ytn_eco_insert {

	public void insertQuery(String  Y_name) {
		DBconnect conn = new DBconnect();
		PreparedStatement pstmt = null;

		try {
			// Insert문 ?부분은 아래의 입력값이 자동으로 변환이 됩니다.
			String sql = " INSERT INTO ytneconomy (Y_reportname) VALUES (?) ";
			pstmt = conn.prepareStatement(sql);

			int index = 1;

			pstmt.setString(index++, Y_name);
		

			// SQL실행
			int count = pstmt.executeUpdate();

			if (count == 0) {
				System.out.println("데이터값에 이상이 있습니다.");
			} else {
				System.out.println("데이터 Insert 성공!");
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

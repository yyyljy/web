package dbSetup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class csvToDb {
	public static void main(String[] args) {
		csvToDb obj =new csvToDb();
		Scanner key = new Scanner(System.in);
		System.out.println("*****게시글 등록******");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		obj.insert();
	}
	public void insert() {/*
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.61:1521:xe";
		String user = "leggo";
		String password = "leggo";
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into tb_parking_basic values(?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, "PARKING_CODE");
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			ptmt.setString(4, id);
			ptmt.setString(5, title);
			ptmt.setString(6, content);
			ptmt.setString(7, id);
			ptmt.setString(8, title);
			ptmt.setString(9, content);
			ptmt.setString(10, content);
			ptmt.setString(11, id);
			ptmt.setString(12, title);
			ptmt.setString(13, content);
			ptmt.setString(14, id);
			ptmt.setString(15, title);
			ptmt.setString(16, content);
			ptmt.setString(17, id);
			ptmt.setString(18, title);
			ptmt.setString(19, content);
			ptmt.setString(20, content);
			ptmt.setString(21, id);
			ptmt.setString(22, title);
			ptmt.setString(23, content);
			ptmt.setString(24, id);
			ptmt.setString(25, title);
			ptmt.setString(26, content);
			ptmt.setString(27, id);
			ptmt.setString(28, title);
			ptmt.setString(29, content);
			ptmt.setString(30, content);
			ptmt.setString(31, id);
			ptmt.setString(32, title);
			ptmt.setString(33, content);
			ptmt.setString(34, id);
			ptmt.setString(35, title);
			ptmt.setString(36, content);
			ptmt.setString(37, id);
			ptmt.setString(38, title);
			ptmt.setString(39, content);
			ptmt.setString(40, content);
			ptmt.setString(41, content);
			ptmt.setString(42, content);
			ptmt.setString(43, content);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공");

		}catch(ClassNotFoundException e) {
			System.out.println("드라이버연결 실패!!");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ptmt!=null)ptmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}*/
	}
	
}

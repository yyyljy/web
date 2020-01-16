package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS에 접근하는 중복된 작업을 정의할 클래스
public class DBUtil {
	//드라이버로딩은 클래스가 로딩될때 같이 로딩되도록 처리
	//==>static{}안에 명령문은 클래스가 로딩될때 한번만 실행되는 코드
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//2. 커넥션하기 
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	//3. 자원반납 - ResultSet, statement, Connection객체 사용을 해제
	//			-> 각각 해제하는 메소드를 만들어도 됨.
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(con!=null)con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

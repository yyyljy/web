package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;
import jdbc.member.exam.MemberDTO;

public class DeptDAOImpl implements DeptDAO{
	//전체목록 출력
	public ArrayList<DeptDTO> getDeptList(){
		ArrayList<DeptDTO> deptArr = new ArrayList<DeptDTO>();
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		DeptDTO dept = null;
		String sql = "select * from mydept";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				dept = new DeptDTO(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5));
				deptArr.add(dept);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
		return deptArr;
	}
	
	//부서등록
	public int insert(DeptDTO dept) {
		System.out.println("dao");
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		//DeptDTO(String deptNo, String deptName, String loc, String tel, String mgr)
		String sql = "insert into mydept values(?,?,?,?,?)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
		return result;
	}
	
	//부서삭제
	public int delete(String deptno) {
		int result = 0;
		Connection con = null;
		PreparedStatement ptmt = null;
		//DeptDTO(String deptNo, String deptName, String loc, String tel, String mgr)
		String sql = "delete mydept where deptNo = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
		return result;
	}
}

package jdbc.member.exam;
import java.util.Date;
public class MemberDTO {
/*	
 *	ID
	PASS
	NAME
	ADDR
	DEPTNO
	HIREDATE
	POINT
*/
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String deptno;
	private Date hiredate;
	private int point;
	
	public MemberDTO() {
		super();
	}
	//insert
	public MemberDTO(String id, String pass, String name, String addr, String deptno) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
	}
	//update
	public MemberDTO(String id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}
	//delete
	public MemberDTO(String id) {
		super();
		this.id = id;
	}
	//select
	public MemberDTO(String id, String pass, String name, String addr, String deptno, Date hiredate, int point) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
		this.hiredate = hiredate;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", deptno=" + deptno
				+ ", hiredate=" + hiredate + ", point=" + point + "]";
	}
	
	
}

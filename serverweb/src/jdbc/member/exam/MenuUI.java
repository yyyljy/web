package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//입사일 : 오늘 날짜, point : 1000
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String name = key.next();
		System.out.print("성명:");
		String pass = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("부서번호:");
		String deptno = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		MemberDTO user = new MemberDTO(id,name,pass,addr,deptno);
		int result = dao.insert(user);
		if(result > 0) {
			System.out.println("사원 등록 완료");
		}else {
			System.out.println("사원 등록 실패");
		}
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		MemberDTO user = new MemberDTO(id,addr);
		int result = dao.update(id, addr);
		if(result > 0) {
			System.out.println("주소 정보 변경 완료");
		}else {
			System.out.println("주소 정보 변경 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		MemberDTO user = new MemberDTO(id);
		int result = dao.delete(id);
		if(result > 0) {
			System.out.println("사원 삭제 완료");
		}else {
			System.out.println("사원 삭제 실패");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		System.out.println("ID\t이름\t부서번호\t주소");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getDeptno()+"\t"+member.getAddr());
		}
	}
	public void selectMenu(){
		System.out.println("*******사원조회********");
		System.out.println("ID\t이름\t부서번호\t주소");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getDeptno()+"\t"+member.getAddr());
		}
	}
	public void loginMenu() {
		Scanner key = new Scanner(System.in);
		System.out.println("*******로그인********");
		System.out.print("ID:");
		String id = key.next();
		System.out.print("Password:");
		String pass = key.next();
		MemberDTO member = dao.login(id, pass);
		if(member == null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
			System.out.println(member.getName()+"님 환영합니다.");
			//System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getDeptno()+"\t"+member.getAddr());
		}
	}
}



















package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//�Ի��� : ���� ��¥, point : 1000
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String name = key.next();
		System.out.print("����:");
		String pass = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id,name,pass,addr,deptno);
		int result = dao.insert(user);
		if(result > 0) {
			System.out.println("��� ��� �Ϸ�");
		}else {
			System.out.println("��� ��� ����");
		}
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id,addr);
		int result = dao.update(id, addr);
		if(result > 0) {
			System.out.println("�ּ� ���� ���� �Ϸ�");
		}else {
			System.out.println("�ּ� ���� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id);
		int result = dao.delete(id);
		if(result > 0) {
			System.out.println("��� ���� �Ϸ�");
		}else {
			System.out.println("��� ���� ����");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		System.out.println("ID\t�̸�\t�μ���ȣ\t�ּ�");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getDeptno()+"\t"+member.getAddr());
		}
	}
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		System.out.println("ID\t�̸�\t�μ���ȣ\t�ּ�");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getDeptno()+"\t"+member.getAddr());
		}
	}
	public void loginMenu() {
		Scanner key = new Scanner(System.in);
		System.out.println("*******�α���********");
		System.out.print("ID:");
		String id = key.next();
		System.out.print("Password:");
		String pass = key.next();
		MemberDTO member = dao.login(id, pass);
		if(member == null) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
			System.out.println(member.getName()+"�� ȯ���մϴ�.");
			//System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getDeptno()+"\t"+member.getAddr());
		}
	}
}



















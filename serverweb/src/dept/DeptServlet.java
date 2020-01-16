package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		System.out.println("�μ���ȣ:"+deptNo);
		System.out.println("�μ���:"+deptName);
		System.out.println("��ġ:"+loc);
		System.out.println("��ȭ��ȣ:"+tel);
		System.out.println("�Ŵ���:"+mgr);
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.insert(dept);
		System.out.println(result+"�� �� ���� �Ϸ�");
		pw.write(result+"�� �� ���� �Ϸ�");
	}
}

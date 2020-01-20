package dept;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptread", urlPatterns = { "/dept/read.do" })
public class ReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. ��û��������
		//	- Ŭ���̾�Ʈ�� ���� ���±׿� �Է��� ������ �ʿ信 ���ؼ� �ѱ� �Ķ���� ����
		//	- �⺻������ ��� POST��Ŀ����� ����, get ���
		//		server.xml ����
		request.setCharacterEncoding("euc-kr");//POST��Ŀ����� �����
		response.setContentType("text/html;charset=euc-kr");
		String deptNo = request.getParameter("deptNo");
		DeptDAO dao = new DeptDAOImpl();
		DeptDTO dept = dao.read(deptNo);
		request.setAttribute("dept", dept);
		System.out.println("�ѱ۵�����:"+request.getParameter("info"));
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
	}

}

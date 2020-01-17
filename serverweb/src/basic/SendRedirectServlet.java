package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDAO;
import dept.DeptDAOImpl;
import dept.DeptDTO;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>sendRedirectȭ��</h1>");
		
		//1. ������ �����ϱ�
		DeptDTO dept = new DeptDTO("001", "�����", "", "", "");
		request.setAttribute("mydata", dept);
		System.out.println("SendRedirectServlet����Ϸ�");
		
		//2. ��û������
		response.sendRedirect("/serverweb/jspbasic/subPage.jsp");
		
	}
}
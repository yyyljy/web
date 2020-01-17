package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String deptno = request.getParameter("deptno");
		PrintWriter pw = response.getWriter();
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.delete(deptno);
		
		//3. 응답화면 요청 재지정
		response.sendRedirect("/serverweb/dept/list.do");
	}

}

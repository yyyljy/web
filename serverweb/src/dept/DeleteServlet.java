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
		
		response.sendRedirect("/serverweb/dept/list.do");
		/*String resulttxt = result+"개 행 삭제";
		System.out.println(resulttxt);
		pw.write("<html><body>");
		pw.write(resulttxt);
		pw.write("<a href='/serverweb/dept/list.do'>목록보기</a></body></html>");*/
	}

}

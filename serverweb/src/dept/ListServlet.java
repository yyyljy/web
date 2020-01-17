package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		DeptDAO dao = new DeptDAOImpl();
		DeptDTO dto = null;
		ArrayList<DeptDTO> dtoArr = dao.getDeptList();
		request.setAttribute("deptArr", dtoArr);
		RequestDispatcher rd = request.getRequestDispatcher("/list.jsp");
		rd.forward(request, response);
		/*pw.write("<html>");
		pw.write("<body>");
		pw.write("<table border= 'solid 1px black'><th>�μ��ڵ�</th>\r\n" + 
				"		<th>�μ���</th>\r\n" + 
				"		<th>�μ���ġ</th>\r\n" + 
				"		<th>��ȭ��ȣ</th>\r\n" + 
				"		<th>������</th>" +
				"		<th>����</th>");
		int size = dtoArr.size();
		for(int i=0;i<size;i++) {
			dto = dtoArr.get(i);
			pw.write("<tr>");
			pw.write("<td>"+dto.getDeptNo()+"</td>");
			pw.write("<td>"+dto.getDeptName()+"</td>");
			pw.write("<td>"+dto.getLoc()+"</td>");
			pw.write("<td>"+dto.getTel()+"</td>");
			pw.write("<td>"+dto.getMgr()+"</td>");
			pw.write("<td><a href='/serverweb/dept/delete.do?deptno="+dto.getDeptNo()+"&info=test'>����</a></td>");
			pw.write("</tr>");
		}
		pw.write("</table></body></html>");*/
	}
}

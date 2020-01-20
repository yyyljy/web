package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memlogin", urlPatterns = { "/member/login.do" })
public class MemberLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		MemberDAO dao = new MemberDAO();
		MemberDTO member = dao.login(id, pass);
		if(member == null) {
			System.out.println("없는 아이디");
		}else {
			System.out.println("로그인 ㄱㄱ");
		}
	}
}

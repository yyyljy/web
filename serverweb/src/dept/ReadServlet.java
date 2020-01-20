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
		//1. 요청정보추출
		//	- 클라이언트가 직접 폼태그에 입력한 데이터 필요에 의해서 넘긴 파라미터 추출
		//	- 기본설정인 경우 POST방식에서만 적용, get 방식
		//		server.xml 수정
		request.setCharacterEncoding("euc-kr");//POST방식에서만 적용됨
		response.setContentType("text/html;charset=euc-kr");
		String deptNo = request.getParameter("deptNo");
		DeptDAO dao = new DeptDAOImpl();
		DeptDTO dept = dao.read(deptNo);
		request.setAttribute("dept", dept);
		System.out.println("한글데이터:"+request.getParameter("info"));
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
	}

}

package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calc", urlPatterns = { "/calc.do" })
public class CalcServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String method = request.getParameter("method");
		PrintWriter pw = response.getWriter();
		double result = 0;
		
		//2.비지니스 로직 호출
		CalcLogic logic = new CalcLogic();
		result = logic.calc(num1, method, num2);
		
		//3.응답 화면 생성
		String resultStr = "num1의 "+num1+"과 num2의 "+num2+"을 연산한 결과는 " + result+"입니다.";
		System.out.println(resultStr);
		pw.write(resultStr);
	}
}

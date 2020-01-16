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
		
		//2.�����Ͻ� ���� ȣ��
		CalcLogic logic = new CalcLogic();
		result = logic.calc(num1, method, num2);
		
		//3.���� ȭ�� ����
		String resultStr = "num1�� "+num1+"�� num2�� "+num2+"�� ������ ����� " + result+"�Դϴ�.";
		System.out.println(resultStr);
		pw.write(resultStr);
	}
}

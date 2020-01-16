package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		String[] item = req.getParameterValues("item");
		String userId =req.getParameter("userId");
		String userName =req.getParameter("userName");
		String passwd =req.getParameter("passwd");
		String gender =req.getParameter("gender");
		String job =req.getParameter("job");
	}
}

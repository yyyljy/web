package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTest extends HttpServlet{
	public LifeCycleTest() {
		System.out.println("���� ��ü ����...");
	}
	public void init() {
		System.out.println("���� ��ü�� �ʱ�ȭ init()");
	}
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		System.out.println("Ŭ���̾�Ʈ�� ��û ó�� service()"+req.getMethod());
		if(req.getMethod().equals("GET")){
			doGet(req,res);
		}else if(req.getMethod().equals("POST")){
			doPost(req,res);
		}else {
			System.out.println("����");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet..");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost..");
	}
	public void destroy() {
		System.out.println("���� ��ü �Ҹ� ....destroy()");
	}
	
	
}

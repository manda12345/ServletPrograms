package com.bridgeit1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("jsp/txt");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		if(userPass.equals("servlet"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else
		{
			pw.println("Sorry Wrong password....");
			RequestDispatcher rd=request.getRequestDispatcher("/index2.html");  
			rd.include(request,response);  
		}
	}
}

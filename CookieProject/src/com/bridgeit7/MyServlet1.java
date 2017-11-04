package com.bridgeit7;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class MyServlet1 extends HttpServlet {
	
	protected void init(HttpServletRequest request,HttpServletResponse response){
		System.out.println("instantion done");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
	          response.setContentType("text/html");
	          PrintWriter pwriter = response.getWriter();

	          String name = request.getParameter("userName");
	          String password = request.getParameter("userPassword");
	          pwriter.print("Hello "+ name);
	          pwriter.print("Your Password is: "+password);

	          //Creating two cookies
	          Cookie cookie1=new Cookie("userName",name);
	          Cookie cookie2=new Cookie("userPassword",password);

	          //Adding the cookies to response header
	          response.addCookie(cookie1);
	          response.addCookie(cookie2);
	          pwriter.print("<br><a href='MyServlet2'>View Details</a>");
	          pwriter.close();
	   }catch(Exception exp){
	       System.out.println(exp);
	    }
	}

}

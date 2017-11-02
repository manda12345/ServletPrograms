package com.bridgeit16;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
//@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      response.setContentType("text/html");   
	      PrintWriter printWriter = response.getWriter();   
	      printWriter.print("<html><body>");   
	      printWriter.print("<h3>Hello Servlet</h3>");   
	      printWriter.print("</body></html>"); 
	}

}

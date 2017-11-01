package com.bridgeit8;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			response.setContentType("text/html");  
			PrintWriter printWriter = response.getWriter();  

			String name=request.getParameter("userName");  
			printWriter.print("Welcome "+name);  

			printWriter.print("<form action='SecondServlet'>");  
			printWriter.print("<input type='hidden' name='uname' value='"+name+"'>");  
			printWriter.print("<input type='submit' value='go'>");  
			printWriter.print("</form>");  
			printWriter.close();  

		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}



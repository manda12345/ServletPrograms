package com.bridgeit9;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  try{  
		        response.setContentType("text/html");  
		        PrintWriter printWriter = response.getWriter();  
		          
		        HttpSession session=request.getSession(false);  
		        String name=(String)session.getAttribute("uname");  
		        printWriter.print("Hello "+ name);  
		        printWriter.close();  
		                }catch(Exception e){
		                	System.out.println(e);
		                	}  
		    }  
		      
	}



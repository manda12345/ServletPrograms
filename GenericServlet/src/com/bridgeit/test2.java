package com.bridgeit;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class test2 extends GenericServlet {

	public void service(ServletRequest request,ServletResponse response)  
			throws IOException,ServletException{  
		response.setContentType("text/html");  

		PrintWriter printWriter=response.getWriter();  
		printWriter.print("<html><body>");  
		printWriter.print("<b>hello generic servlet</b>");  
		printWriter.print("</body></html>");  

	}  
}

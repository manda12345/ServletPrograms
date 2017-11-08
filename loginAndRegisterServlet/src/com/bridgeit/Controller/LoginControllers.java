package com.bridgeit.Controller;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.Model.LoginBean;
import com.bridgeit.service.ServiceClass;

@WebServlet("/LoginControllers")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResultSet resultSet = null;
	String dataEmailId = null;
	String dataPassword = null;
	ServletRequest session;
	ServiceClass serviceClass=new ServiceClass();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String inputemailId = request.getParameter("emailId");
		String inputPassword = request.getParameter("password");
		System.out.println(inputemailId +"  "+inputPassword);
		LoginBean loginBean=new LoginBean();
		loginBean.setEmailId(inputemailId);
		loginBean.setPassword(inputPassword);
		resultSet=serviceClass.check(loginBean);
		try {
			if (resultSet.next()) {
				response.sendRedirect("Home.jsp");
			} else {
				response.sendRedirect("Error.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}




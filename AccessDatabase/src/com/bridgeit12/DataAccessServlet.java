package com.bridgeit12;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DataAccessServlet extends HttpServlet {
	Connection connection=null;
	PreparedStatement preparedStatement=null;

	String query="insert into MySchema.Employee values(?,?,?,?)";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String EmployeeName=request.getParameter("EmployeeName");
		System.out.println("EmployeeName"+EmployeeName);
		int EmployeecId=Integer.parseInt(request.getParameter("EmployeecId"));
		Double EmployeeSalary=Double.parseDouble(request.getParameter("EmployeeSalary"));
		String MobileNumber=request.getParameter("MobileNumber");

		PrintWriter printWriter=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","ninja");
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,"EmployeeName");
			preparedStatement.setInt(2, EmployeecId);
			preparedStatement.setDouble(3, EmployeeSalary);
			preparedStatement.setString(4, "MobileNumber");

			int a=preparedStatement.executeUpdate();
			printWriter.println("<html>"
					+ "<body>"
					+ "<h1>welcome...</h1><br>"+EmployeeName+"\t"+EmployeecId+"\t"+EmployeeSalary+"\t"+MobileNumber+"</br>"
					+ "</body>"
					+ "</html>");;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

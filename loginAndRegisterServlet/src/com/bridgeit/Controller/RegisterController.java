package com.bridgeit.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bridgeit.Model.RegisterBean;
import com.bridgeit.service.ServiceClass;
@SuppressWarnings("serial")
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String name=request.getParameter("UserName");
		String EmailId=request.getParameter("EmailId");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		String mobileNumber=request.getParameter("MobileNumber");
		RegisterBean bean = new RegisterBean();
		bean.setUserName(name);
		bean.setEmailId(EmailId);
		bean.setPassword(password);
		bean.setConfirmPassword(confirmPassword);
		bean.setMobileNumber(mobileNumber);
		ValidationController validationController=new ValidationController();
		validationController.vaildationMethod(bean, session);
		ServiceClass serviceClass= new ServiceClass();
		int status=serviceClass.checkStatus(bean);  
		if(status>0){ 
			response.sendRedirect("login.jsp");
		}
		else 
		{
			System.out.println("no");
		}
		
	}
}

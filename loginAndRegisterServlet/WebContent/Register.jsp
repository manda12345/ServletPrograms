<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="index.jsp"%>
	<h3>Sign Up</h3>
	<form action="RegisterServlet" method="post">
		<table border="0">
			<tr>
				<td>Enter User Name</td>
				<td><input type="text" name="UserName"></td>
			</tr>

			<tr>
				<td>Enter Email Id</td>
				<td><input type="text" name="EmailId"></td>
			</tr>


			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password"></td>
			</tr>


			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmPassword"></td>
			</tr>

			<tr>
				<td>Enter MobileNumber</td>
				<td><input type="text" name="MobileNumber"></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
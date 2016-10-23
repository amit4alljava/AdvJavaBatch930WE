<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="custom.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int counter; // Member Variable of a class %>
<% // this code will go inside the service
counter++;
%>
<% Date date = new Date();
DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
String formattedDate = df.format(date);
%>
Formatted Date is <%=formattedDate %><br>
Current Date is <%=date %>
<br>
<h1>Hit Count is <%=counter %></h1>
<%
// Login Check Code
String userid = request.getParameter("userid");
String password = request.getParameter("pwd");
if(userid!=null && password!=null){
	if(userid.trim().length()>0 && password.trim().length()>0){
if(userid.equals(password)){
	response.sendRedirect("welcome.jsp");
}
else{
	%>
	<h2 class="error">Invalid Userid or Password</h2>
<%	
}
}
}
%>
<form action='login.jsp' method='post'>
<table>
<tr>
<td><label>Userid</label></td>
<td><input type='text' name='userid' placeholder='Type Userid Here'/></td>
</tr>
<tr>
<td><label>Password</label></td>
<td><input type='password' name='pwd' placeholder='Type Password Here'/></td>
</tr>
<tr>
<td><button type='submit'>Login</button></td>
<td><button type='reset'>Reset</button></td>
</tr>
</table>
</form>
</body>
</html>
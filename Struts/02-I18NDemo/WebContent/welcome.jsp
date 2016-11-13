<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:if test="user.userid.equalsIgnoreCase('amit')">
	<h1>Welcome <s:property value="user.userid"/> </h1>
</s:if>
<s:elseif test="user.userid=='ram'">
	<h1>Hello <s:property value="user.userid"/> </h1>
</s:elseif>
 <s:else>
<h1>Hi <s:property value="user.userid"/> </h1>
</s:else>

<h2>Iterator Example</h2>
<table border="1">
<tr>
<th>S.no</th>
<th>Userid</th>
<th>EmailId</th>
<th>Address</th>
</tr>
<s:iterator value="userList" status="x">
<%-- <s:set name="result" value="%{x.count %2==0}"/>
Set result is <s:property value="%{#result}"/>
<s:if test="%{#result==true}">
<tr style="background-color: cyan;">
</s:if>
<s:else>
<tr style="background-color: red;">
</s:else> --%>
<td>${x.count}</td>

<td><s:property value="userid"/>  </td>
<td><s:property value="emailId"/>  </td>
<td><s:property value="address"/>  </td>
</tr>
</s:iterator>
</table>
 </body>
</html>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    %>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="title"/> </title>
</head>
<body>
Change Language &nbsp;&nbsp;
<s:a href="langAc.action?request_locale=en_US">English</s:a>
<s:a href="langAc.action?request_locale=hi_IN">हिंदी</s:a>
<s:a href="langAc.action?request_locale=it_IT">italiano</s:a>
<br>
<s:text name="message"/>
<br>
<s:property value="messagetxt"/>
</body>
</html>
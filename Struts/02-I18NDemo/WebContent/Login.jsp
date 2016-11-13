<%@page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

<title><s:text name="login.heading"/></title>
</head>
<body>

<s:form action="login" method="post"> 

<s:textfield key="login.userid" name="user.userid" maxlength="25" tabindex="1"/>

<s:password key="login.pwd" name="user.password" maxlength="25" tabindex="2" />
<s:submit key="login.submit" />
<s:reset  />
</s:form>
</body>
</html>
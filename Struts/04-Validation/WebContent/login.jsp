<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <style>
   .errorMessage{
  color:red;
  font-style: italic;
  } 
  
</style> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="loginform.titlebar"/></title>
</head>
<body>
<s:form method="post" action="loginAction">
<s:textfield name="userid" key="lbl.userid"  />
<s:textfield name="name" key="loginform.txtname" />


<s:submit  key="loginform.btsubmit"/>
<s:reset/>

</s:form>
</body>
</html>
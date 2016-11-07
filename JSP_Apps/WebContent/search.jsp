<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="tcs" tagdir="/WEB-INF/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Screen</title>
<tcs:head/>
</head>
<body>
<tcs:calendar fieldname="doj" month="true" year="true" noOfmonth="2"/>
<tcs:date country="IN" lang="hi"/>
<form action="SearchController" method="get">
<input type="text" placeholder="Type Name to Search" name="personname">
<button type='submit'>Search</button>
</form>
<c:if test="${persondata.size() gt 0 }">
<fieldset><legend>Search Result</legend>
<table border="1">
<tr><th>Id</th><th>Name</th></tr>
<c:forEach var="object" items="${persondata}">
<tr>
<td>
${object.id}
</td>
<td>
${object.name}
</td>
</tr>
</c:forEach>
</table>
</fieldset>
</c:if>
<c:if test="${persondata.size() eq 0 }">
<h1>No Record Found</h1>
</c:if>
</body>
</html>
<%@tag import="com.srivastava.tags.DateTag"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="lang" type="java.lang.String" required="true" %>
<%@attribute name="country" type="java.lang.String" required="true" %>

<h2 style="color:red"><%=DateTag.printDate(lang, country) %></h2>

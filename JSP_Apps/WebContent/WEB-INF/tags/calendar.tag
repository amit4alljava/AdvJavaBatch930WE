<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="fieldname" type="java.lang.String" required="true" %>
<%@attribute name="year" type="java.lang.Boolean" required="true" %>
<%@attribute name="month" type="java.lang.Boolean" required="true" %>
<%@attribute name="noOfmonth" type="java.lang.Integer" required="true" %>
<input type="text" id="${fieldname}">
<script>
  $( function() {
    $( "#${fieldname}" ).datepicker({
        changeMonth: ${month},
        changeYear: ${year},
        numberOfMonths: ${noOfmonth}
      });
    } );
  </script>

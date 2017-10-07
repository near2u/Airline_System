<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<td><form:label path="department">Department</form:label></td>
				${test}
				
					<form:select path="airport" class="form-control"> 
					  <form:option value="-" label="--Please Select"/>
  						<form:options items="${test}"  itemValue="code" itemLabel="code" class="form-control"/> 
					</form:select>
					 <select>
					
					</select> 
					
</body>
</html>
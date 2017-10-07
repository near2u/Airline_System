
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details</title>
<style type="text/css">
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<script type="text/javascript">

alert('Flight fare is $'+${fare});
</script>



</head>
<body>
	<%@ include file="Header.jsp"%>
	<div class="container">

		<h4>Flight Details</h4>
		<br>
		<form class="form-inline" method="post" action="getFare">
			<div class="row">
				<div class="col-md-12">

					<div class="col-md-1">Departure</div>
					<div class="col-md-4">
						<select style="width: 250px" name="deptCode">
							<c:forEach var="teamMember" items="${test}">
								<option value="${teamMember.code}" class="form-control" /> ${teamMember.airport}
					</c:forEach>
						</select>
					</div>




					<div class="col-md-1">Destination</div>
					<div class="col-md-4">
						<select style="width: 250px" name="destCode">
							<c:forEach var="teamMember" items="${test}">
								<option value="${teamMember.code}" class="form-control" /> ${teamMember.airport}
					</c:forEach>
						</select>
					</div>

					<button type="submit" class="btn btn-primary" id="searchflights"
						data-toggle="tooltip" data-placement="bottom"
						title="Tooltip on bottom">Search Details</button>
				</div>
		</form>

		<datalist id="airportlist" name="flightlist"> </datalist>
	</div>
	</div>
	<div class="row"></div>




	<br>


</body>
</html>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link href="<c:url value="/resources/temp/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/temp/animate.css" />" rel="stylesheet">
      <link href="<c:url value="/resources/temp/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="//resources/temp/CustomStyle.css" />" rel="stylesheet">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script src="<c:url value="/resources/temp/MyScript.js" />"></script>
<style>
body:before {
	content: "";
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	background-image: url(/resource/temp/pagebackground.jpg);
	opacity: 0.2;
	z-index: -1;
}

</style>

</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="collapse navbar-collapse" id="navbardiv">
			<ul class="nav navbar-nav" id="myTab">
				<li><a href="index.jsp">Home</a></li>
				
								
			</ul>

			<div class="navbar-header navbar-right">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbardiv">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand navbar-right" href="index.jsp">Airline Management
					System</a>
			</div>
		</div>
	</div>
	</nav>
	<br><br><br><br>
</body>
</html>
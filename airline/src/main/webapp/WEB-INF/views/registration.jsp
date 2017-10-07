<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en-US">
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html">
  <title>Airline Reservation System: Registration Form</title>
  <meta name="author" content="Jake Rocheleau">
  <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/css/switchery.min.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/switchery.min.js" />"></script>
    
  <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <!-- <link rel="stylesheet" type="text/css" media="all" href="/resources/css/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="/resources/css/switchery.min.css">
  <script type="text/javascript" src="/resources/js/switchery.min.js"></script> -->
</head>

<body>
  <div id="wrapper">
  
  <h1>Register Here</h1>
  		<h2 style="color: green">${message}</h2>
  <form action="register" method="post">
  <div class="col-2">
    <label>
     First Name
      <input placeholder="What is your first name?" id="name" name="firstName" tabindex="1" required>
    </label>
  </div>
  <div class="col-2">
    <label>
      Last Name
      <input placeholder="What is your first name?" id="company" name="lastName" tabindex="2" required>
    </label>
  </div>
  <div class="col-2">
    <label>
     User Name
      <input placeholder="What is your User name?" id="name" name="userName" tabindex="1" required>
    </label>
  </div>
  <div class="col-2">
    <label>
      Password
      <input placeholder="What is your password?" id="company" name="password" tabindex="2" required>
    </label>
  </div>
  <div class="col-2">
    <label>
      Phone Number
      <input placeholder="What is the best # to reach you?" id="phone" name="contact" tabindex="3" required>
    </label>
  </div>
  <div class="col-2">
    <label>
      Email
      <input placeholder="What is your e-mail address?" id="email" name="email" tabindex="4" required>
    </label>
  </div>
  <%-- <div class="col-3">
    <label>
      Availability
      <select tabindex="5">
        <option>5-15 hrs per week</option>
        <option>15-30 hrs per week</option>
        <option>30-40 hrs per week</option>
      </select>
    </label>
  </div>
  
  <div class="col-4">
    <label>
      Skills
      <input placeholder="List a few of your primary skills" id="skills" name="skills" tabindex="6">
    </label>
  </div>
  <div class="col-4">
    <label>
      Yrs Experience
      <input placeholder="How many years of experience?" id="experience" name="experience" tabindex="7">
    </label>
  </div>
  <div class="col-4">
    <label>Contact References?</label>
    <center style="position:relative; margin-bottom:8px;"><input type="checkbox" class="js-switch"></center>
  </div>
  <div class="col-4 switch">
    <label>E-mail Updates?</label>
    <center style="position:relative;margin-bottom:8px;"><input type="checkbox" class="js-switch"></center>
  </div> --%>
  
  <div class="col-submit">
    <input type="submit" class="submitbtn" value="Submit Form">
    
  </div>
  
  </form>
  You want to login <a href="login">Click here</a>
  </div>
<script type="text/javascript">
var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));

elems.forEach(function(html) {
  var switchery = new Switchery(html);
});
</script>
</body>
</html>
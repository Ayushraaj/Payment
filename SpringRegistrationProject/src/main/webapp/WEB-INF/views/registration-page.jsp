<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>

<h4>Fill the below form to do registration</h4>

<form action="registredDetails" method="post">

<input type="text" name="fullName" placeholder="Full Name" required="required">
<input type="text" name="email" placeholder="Email" required="required"> 
<input type="text" name="mobileNumber" placeholder="Mobile Number" required="required">
<input type="text" name="password" placeholder="Password" required="required">
<input type="text" name="conformPassword" placeholder="Conform Password" required="required">
<input type="submit" value="Create Account">



</form>

</body>
</html>
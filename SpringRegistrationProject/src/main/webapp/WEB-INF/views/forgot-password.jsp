<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body>

<h2>Reset Password</h2>

<form action="resetPassword" method="post">

    <input type="text"
           name="email"
           placeholder="Enter Email" required="required">

    <input type="password"
           name="password"
           placeholder="New Password" required="required">

    <input type="password"
           name="conformPassword"
           placeholder="Confirm Password" required="required">

    <input type="submit"
           value="Reset Password">

</form>

</body>
</html>
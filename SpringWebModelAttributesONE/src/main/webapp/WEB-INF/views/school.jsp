<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>School Information Form</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#667eea,#764ba2);
}

.container{
    width:450px;
    background:white;
    padding:40px;
    border-radius:20px;
    box-shadow:0 15px 35px rgba(0,0,0,0.25);
}

h1{
    text-align:center;
    color:#333;
    margin-bottom:10px;
}

p{
    text-align:center;
    color:gray;
    margin-bottom:25px;
}

.input-group{
    margin-bottom:18px;
}

input[type="text"]{
    width:100%;
    padding:14px;
    border:2px solid #ddd;
    border-radius:10px;
    font-size:16px;
    transition:0.3s;
}

input[type="text"]:focus{
    border-color:#667eea;
    outline:none;
    box-shadow:0 0 10px rgba(102,126,234,0.3);
}

input[type="submit"]{
    width:100%;
    padding:14px;
    border:none;
    border-radius:10px;
    background:#667eea;
    color:white;
    font-size:18px;
    font-weight:bold;
    cursor:pointer;
    transition:0.3s;
}

input[type="submit"]:hover{
    background:#5563d6;
    transform:translateY(-2px);
}

.school-icon{
    text-align:center;
    font-size:50px;
    margin-bottom:10px;
}

</style>

</head>
<body>

<div class="container">

    <div class="school-icon">🏫</div>

    <h1>School Information</h1>
    <p>Fill in the details below</p>

    <form action="info" method="post">

        <div class="input-group">
            <input type="text" name="schoolName"
                   placeholder="Enter School Name" required>
        </div>

        <div class="input-group">
            <input type="text" name="city"
                   placeholder="Enter City" required>
        </div>

        <div class="input-group">
            <input type="text" name="state"
                   placeholder="Enter State" required>
        </div>

        <div class="input-group">
            <input type="text" name="country"
                   placeholder="Enter Country" required>
        </div>

        <input type="submit" value="Submit Information">

    </form>

</div>

</body>
</html>
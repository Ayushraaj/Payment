<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>School Details</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#667eea,#764ba2);
}

.card{
    width:500px;
    background:white;
    padding:35px;
    border-radius:20px;
    box-shadow:0 15px 35px rgba(0,0,0,0.2);
    transition:0.3s;
}

.card:hover{
    transform:translateY(-5px);
}

.heading{
    text-align:center;
    color:#4a4a4a;
    margin-bottom:25px;
    font-size:30px;
}

.info{
    margin:15px 0;
    padding:15px;
    background:#f5f7fa;
    border-left:5px solid #667eea;
    border-radius:10px;
    font-size:18px;
}

.label{
    font-weight:bold;
    color:#333;
}

.value{
    color:#667eea;
    font-weight:600;
}
</style>

</head>
<body>

<div class="card">

    <h1 class="heading">🏫 School Information</h1>

    <div class="info">
        <span class="label">School Name :</span>
        <span class="value">${sName}</span>
    </div>

    <div class="info">
        <span class="label">City :</span>
        <span class="value">${cName}</span>
    </div>

    <div class="info">
        <span class="label">State :</span>
        <span class="value">${s1Name}</span>
    </div>

    <div class="info">
        <span class="label">Country :</span>
        <span class="value">${c1Name}</span>
    </div>

</div>

</body>
</html>
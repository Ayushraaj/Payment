<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Google Product Details</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        background:#f8f9fa;
        display:flex;
        justify-content:center;
        align-items:center;
        height:100vh;
    }

    .container{
        width:500px;
        background:white;
        padding:30px;
        border-radius:15px;
        box-shadow:0 4px 15px rgba(0,0,0,0.15);
        text-align:center;
    }

    .google-logo{
        font-size:40px;
        font-weight:bold;
        margin-bottom:20px;
    }

    .blue{ color:#4285F4; }
    .red{ color:#EA4335; }
    .yellow{ color:#FBBC05; }
    .green{ color:#34A853; }

    h2{
        color:#202124;
        margin-bottom:25px;
    }

    .detail{
        background:#f1f3f4;
        padding:15px;
        margin:10px 0;
        border-radius:10px;
        text-align:left;
        font-size:18px;
    }

    .label{
        font-weight:bold;
        color:#1a73e8;
    }

    .footer{
        margin-top:20px;
        color:gray;
        font-size:14px;
    }
</style>

</head>
<body>

<div class="container">

    <div class="google-logo">
        <span class="yellow">A</span>
        <span class="yellow">m</span>
        <span class="yellow">a</span>
        <span class="yellow">z</span>
        <span class="yellow">o</span>
        <span class="yellow">n</span>
    </div>

    <h2>Product Information</h2>

    <div class="detail">
        <span class="label">Product Name:</span>
        ${productName}
    </div>

    <div class="detail">
        <span class="label">Product Price:</span>
        ₹${productPrice}
    </div>

    <div class="detail">
        <span class="label">Product Quantity:</span>
        ${productQuantity}
    </div>

    <div class="footer">
        Powered by Amazon Product Search
    </div>

</div>

</body>
</html>
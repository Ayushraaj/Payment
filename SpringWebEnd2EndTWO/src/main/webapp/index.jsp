<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Product Entry</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        background:#eaeded;
        display:flex;
        justify-content:center;
        align-items:center;
        height:100vh;
    }

    .container{
        background:white;
        width:450px;
        padding:30px;
        border-radius:12px;
        box-shadow:0 4px 15px rgba(0,0,0,0.2);
    }

    .amazon-logo{
        text-align:center;
        font-size:40px;
        font-weight:bold;
        color:#FBBC05;
        margin-bottom:10px;
    }

    .amazon-smile{
        color:#ff9900;
    }

    h2{
        text-align:center;
        color:#232f3e;
        margin-bottom:25px;
    }

    input[type="text"]{
        width:100%;
        padding:12px;
        margin:10px 0;
        border:1px solid #ccc;
        border-radius:8px;
        font-size:16px;
    }

    input[type="text"]:focus{
        outline:none;
        border-color:#ff9900;
        box-shadow:0 0 5px rgba(255,153,0,0.5);
    }

    input[type="submit"]{
        width:100%;
        padding:12px;
        background:#ffd814;
        border:none;
        border-radius:8px;
        font-size:18px;
        cursor:pointer;
        margin-top:15px;
        font-weight:bold;
    }

    input[type="submit"]:hover{
        background:#f7ca00;
    }
    

    .footer{
        text-align:center;
        margin-top:15px;
        color:gray;
        font-size:13px;
    }
</style>

</head>

<body>

<div class="container">

    <div class="amazon-logo">
        <span class="yellow">A</span>
        <span class="yellow">m</span>
        <span class="yellow">a</span>
        <span class="yellow">z</span>
        <span class="yellow">o</span>
        <span class="yellow">n</span>
    </div>

    <h2>Hey There Bonjour !!!</h2>

    <form action="amazonInfo" method="post">

        <input type="text"
               name="productName"
               placeholder="Enter Product Name">

        <input type="text"
               name="price"
               placeholder="Enter Product Price">

        <input type="text"
               name="quantity"
               placeholder="Enter Product Quantity">

        <input type="submit"
               value="Submit Karo">

    </form>

    <div class="footer">
        Amazon Product Management Portal
    </div>

</div>

</body>
</html>
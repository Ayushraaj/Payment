<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Product</title>

<style>

    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background: linear-gradient(-45deg,
                #ff6b6b,
                #4ecdc4,
                #45b7d1,
                #6c5ce7);
        background-size:400% 400%;
        animation: gradientBG 10s ease infinite;
    }

    @keyframes gradientBG{
        0%{
            background-position:0% 50%;
        }
        50%{
            background-position:100% 50%;
        }
        100%{
            background-position:0% 50%;
        }
    }

    .container{
        width:400px;
        padding:40px;
        background:rgba(255,255,255,0.15);
        backdrop-filter: blur(12px);
        border-radius:20px;
        text-align:center;
        box-shadow:0 8px 32px rgba(0,0,0,0.3);

        animation: fadeIn 1.5s ease;
    }

    @keyframes fadeIn{
        from{
            opacity:0;
            transform:translateY(-30px);
        }
        to{
            opacity:1;
            transform:translateY(0);
        }
    }

    h1{
        color:white;
        margin-bottom:25px;
        text-shadow:2px 2px 5px black;
    }

    input[type="text"]{
        width:100%;
        padding:12px;
        border:none;
        border-radius:10px;
        margin-bottom:20px;
        font-size:16px;
        outline:none;

        transition:0.4s;
    }

    input[type="text"]:focus{
        transform:scale(1.05);
        box-shadow:0 0 15px #fff;
    }

    input[type="submit"]{
        width:100%;
        padding:12px;
        border:none;
        border-radius:10px;
        font-size:18px;
        font-weight:bold;
        cursor:pointer;

        background:#ffffff;
        color:#333;

        transition:0.4s;
    }

    input[type="submit"]:hover{
        background:#222;
        color:white;
        transform:translateY(-4px);
        box-shadow:0 8px 20px rgba(0,0,0,0.4);
    }

    .icon{
        font-size:60px;
        margin-bottom:15px;

        animation:bounce 2s infinite;
    }

    @keyframes bounce{
        0%,100%{
            transform:translateY(0);
        }
        50%{
            transform:translateY(-10px);
        }
    }

</style>

</head>
<body>

<div class="container">

    <div class="icon">🛒</div>

    <h1>Product Search</h1>

    <form action="searchProduct" method="get">

        <input type="text"
               name="find"
               placeholder="Enter Product Name">

        <input type="submit"
               value="🔍 Search Now">

    </form>

</div>

</body>
</html>
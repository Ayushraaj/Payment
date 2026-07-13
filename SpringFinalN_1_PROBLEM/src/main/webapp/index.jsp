<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category & Products</title>

<style>
*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:Arial, sans-serif;
}

body{
	background:#f4f6f9;
	padding:30px;
}

.container{
	width:900px;
	margin:auto;
	background:white;
	padding:30px;
	border-radius:10px;
	box-shadow:0 0 10px rgba(0,0,0,.2);
}

h1{
	text-align:center;
	margin-bottom:25px;
	color:#0d6efd;
}

.section{
	margin-bottom:25px;
}

.row{
	display:flex;
	gap:20px;
	margin-bottom:15px;
}

.col{
	flex:1;
}

label{
	display:block;
	font-weight:bold;
	margin-bottom:5px;
}

input{
	width:100%;
	padding:10px;
	border:1px solid #ccc;
	border-radius:5px;
}

.product-card{
	border:1px solid #ddd;
	padding:20px;
	margin-bottom:20px;
	border-radius:8px;
	background:#fafafa;
}

.product-card h3{
	margin-bottom:15px;
	color:#0d6efd;
}

.btn{
	padding:12px 20px;
	border:none;
	border-radius:5px;
	cursor:pointer;
	font-size:16px;
}

.addBtn{
	background:#28a745;
	color:white;
	margin-bottom:20px;
}

.addBtn:hover{
	background:#218838;
}

.saveBtn{
	width:100%;
	background:#0d6efd;
	color:white;
	font-size:18px;
}

.saveBtn:hover{
	background:#084298;
}
</style>

</head>
<body>

<div class="container">

<h1>Category & Products</h1>

<form action="saveProduct" method="post">

	<div class="section">

		<div class="row">

			<div class="col">
				<label>Category Name</label>
				<input type="text" name="categoryName" required>
			</div>

			<div class="col">
				<label>Status</label>
				<input type="text" name="status" value="Active">
			</div>

		</div>

	</div>

	<h2>Products</h2>

	<div id="productsContainer">

		<!-- First Product -->

		<div class="product-card">

			<h3>Product 1</h3>

			<div class="row">

				<div class="col">
					<label>Product Name</label>
					<input type="text" name="productRequests[0].productName">
				</div>

				<div class="col">
					<label>Description</label>
					<input type="text" name="productRequests[0].description">
				</div>

			</div>

			<div class="row">

				<div class="col">
					<label>Price</label>
					<input type="number" step="0.01"
						name="productRequests[0].price">
				</div>

				<div class="col">
					<label>Quantity</label>
					<input type="number"
						name="productRequests[0].quantity">
				</div>

			</div>

		</div>

	</div>

	<button type="button" class="btn addBtn" onclick="addProduct()">
		Add Product
	</button>

	<button type="submit" class="btn saveBtn">
		Save Category & Products
	</button>

</form>


</div>

<a href="getAll">get all Products</a>

<script>

let productIndex = 1;

function addProduct(){

	let html = `
	
	<div class="product-card">

		<h3>Product ${productIndex+1}</h3>

		<div class="row">

			<div class="col">
				<label>Product Name</label>
				<input type="text" name="productRequests[${productIndex}].productName">
			</div>

			<div class="col">
				<label>Description</label>
				<input type="text" name="productRequests[${productIndex}].description">
			</div>

		</div>

		<div class="row">

			<div class="col">
				<label>Price</label>
				<input type="number" step="0.01"
					name="productRequests[${productIndex}].price">
			</div>

			<div class="col">
				<label>Quantity</label>
				<input type="number"
					name="productRequests[${productIndex}].quantity">
			</div>

		</div>

	</div>
	
	`;

	document.getElementById("productsContainer").insertAdjacentHTML("beforeend", html);

	productIndex++;
}

</script>

</body>
</html>
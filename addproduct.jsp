<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title></title>
</head>
<body class="mt-5" style="background-image: url('<c:url value="/resources/image/fidth.jpg ba" ></c:url>');">
   	<div class="container" style="margin-top: 100px">


		<div class="container mt-5"
			style=" width: 600px; height: 500px; padding-top: 30px; border-radius: 20px; background-image: linear-gradient(#E9967A,  #a1988b); opacity: 0.94">
			<h1 class="text-center">Fill the product details</h1>
			<form class="container " action="handle" method="post"
				style="width: 500px; padding-top: 10px">
				<div class="form-group">
					<label for="exampleInputEmail1">Product Name</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Product Name"
						name="name">

				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">Description</label>
					<textarea class="form-control" id="exampleFormControlTextarea1"
						rows="3" name="description"></textarea>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Product Price</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder=" Product price"
						name="price">

				</div>
				<div class="container text-center">
					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
			</form>
		</div>


	</div>






</body>
</html>
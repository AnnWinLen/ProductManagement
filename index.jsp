<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>Insert title here</title>
</head>
<body style="background-image: url('<c:url value="/resources/image/sisxth.jpg"></c:url>');">
 

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3" style="color: black;">welcome To Product App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr >
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products }" var="p">
							<tr class="bg-light">
								<th scope="row">TNXs${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td class="font-weight-bold">&#x20B9; ${p.price }</td>
								<td><a href="delete/${p.id}" style="font-size: 30px"><i
										class="fa-solid fa-trash-can" style="color: red;"></i></a>
										 <a href="update/${p.id}" style="font-size: 30px"><i class="fa-solid fa-pencil "
										style="color: blue;"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="addproduct" class="btn btn-outline-success">Add
						product</a>
				</div>

			</div>
		</div>
	</div>

</body>
</html>
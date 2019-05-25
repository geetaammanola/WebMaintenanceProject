<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Resolve Data</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script>
	function success() {
		alert("Data Is Submitted Successfully");
	}
</script>

</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate"); // http 1.1  & +
		// response.setHeader("Pragma","no-cache");  // older http 1.0
		// response.setHeader("Expires","0");  //for proxy server (0 means time here minute or second)
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>

	<nav class="navbar navbar-dark bg-primary">
		<a class="navbar-brand"><strong
			style="font-size: 26px; color: #fff">Maintenance Solution </strong></a>
		<form class="form-inline" action="logout">
			<button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Logout</button>
		</form>
	</nav>

	<%@ include file="subMenu.jsp"%>
	<div class="container">
		<h1 align="center">Order Resolve Records</h1>
		<hr>
		<br>

		<div class="row">

			<div class="col-lg-12 ">
				<table border=1 cellspacing="0" width="100%">
					<thead align="center">
						<tr>
							<th>Complain ResolveId</th>
							<th>Date</th>
							<th>Engineer Name</th>
							<th>Client MobileNo</th>
							<th>Solution Description</th>
							<th>Part Changed</th>
							<th>Total Charges</th>


							<th colspan=2>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ComplainResolve}" var="resolve">
							<tr>
								<td><c:out value="${resolve.resolveid}" /></td>
								<td><c:out value="${resolve.date}" /></td>
								<td><c:out value="${resolve.engineerName}" /></td>
								<td><c:out value="${resolve.clientMobileNo}" /></td>
								<td><c:out value="${resolve.solution}" /></td>
								<td><c:out value="${resolve.part}" /></td>
								<td><c:out value="${resolve.charges}" /></td>


								<td class="text-center"><a class='btn btn-info btn-xs'
									href="ComplainResolveController?action=edit&resolveid=<c:out value="${resolve.resolveid}"/>"><span
										class="glyphicon glyphicon-edit"></span> Edit</a> <a
									href="ComplainResolveController?action=delete&resolveid=<c:out value="${resolve.resolveid }"/>"
									class="btn btn-danger btn-xs"><span
										class="glyphicon glyphicon-remove"></span> Del</a></td>


							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>


</body>
</html>
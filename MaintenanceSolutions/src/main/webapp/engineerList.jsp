<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Engineer List</title>

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
		<h1 align="center">Engineer List</h1>
		<hr>
		<br>

		<div class="row">

			<div class="col-lg-12 ">
				<table border=1 cellspacing="0" width="100%">
					<thead align="center">
						<tr>
							<th>EngineerId</th>
							<th>Name</th>
							<th>Email Id</th>
							<th>MobileNo</th>
							<th>Address</th>
							<th colspan=2>Action</th>
						</tr>
					</thead>
					<tbody align="center">
						<c:forEach items="${engineers}" var="engineer">
							<tr>
								<td><c:out value="${engineer.engineerId}" /></td>
								<td><c:out value="${engineer.name}" /></td>
								<td><c:out value="${engineer.email}" /></td>
								<td><c:out value="${engineer.mobileNo}" /></td>
								<td><c:out value="${engineer.address}" /></td>




								<td class="text-center"><a class='btn btn-info btn-xs'
									href="EngineerController?action=edit&engineerId=<c:out value="${engineer.engineerId}"/>"><span
										class="glyphicon glyphicon-edit"></span> Edit</a> <a
									href="EngineerController?action=delete&engineerId=<c:out value="${engineer.engineerId }"/>"
									class="btn btn-danger btn-xs"><span
										class="glyphicon glyphicon-remove"></span> Del</a></td>



							</tr>
						</c:forEach>
					</tbody>
				</table>
				<p>
					<a href="EngineerController?action=insert">Add Engineer</a>
				</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Client Site Record</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<link type="text/css"
	href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />

<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
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
<br>

	<div class="container">
		<h1 align="center">Add Problem Resolved Record</h1>
		<hr>
		<br>

		<div class="row">

			<div class="col-lg-12 ">


				<form method="post" action="ComplainResolveController" role="form">

					<div class="messages"></div>

					<div class="controls">

						<div class="row">
							


							<div class="col-md-6">


								<div class="form-group">
									<label for="Date" class="col-sm-3 control-label">Date</label> <input
										type="text" id="text" name="date" class="form-control"
										 value="<c:out value="${ComplainResolve.date}" />"
										placeholder="Please enter Date" required="required"
										data-error="Date is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>
							
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Engineer Name</label> <input id="form_name"
										type="text" name="engineerName" class="form-control"
										 value="<c:out value="${ComplainResolve.engineerName}" />"
										placeholder="Please enter Client Name " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>


							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Client's Mobile No.</label> <input id="form_name"
										type="text" name="clientMobileNo" class="form-control"
										 value="<c:out value="${ComplainResolve.clientMobileNo}" />"
										placeholder="Please enter Client Name " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Solution Description</label> <input
										id="form_name" type="text" name="solution" class="form-control"
										 value="<c:out value="${ComplainResolve.solution}" />"
										placeholder="Please enter Email " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Parts Change</label> <input
										id="form_name" type="text" name="part" class="form-control"
										 value="<c:out value="${ComplainResolve.part}" />"
										placeholder="Please enter Mobile No " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Total charges</label> <input
										id="form_name" type="text" name="charges" class="form-control"
										 value="<c:out value="${ComplainResolve.charges}" />"
										placeholder="Please enter Mobile No " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>

						



						</div>
						<div class="row"></div>

					</div>



					<div class="row">

						<div class="col-md-12">

							<input type="submit" class="btn btn-primary pull-right"
								onclick="success()" value="Submit">
						</div>
					</div>
				</form>
			</div>




		</div>

	</div>


</body>
<script
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js'></script>
<script
	src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js'></script>

</html>
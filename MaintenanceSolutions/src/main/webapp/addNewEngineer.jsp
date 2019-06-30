<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Engineer</title>

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
		<h1 align="center">Add New Engineer</h1>
		<hr>
		<br>



		<div class="row">

			<div class="col-lg-12 ">


				<form method="post" action="EngineerController" role="form">

					<div class="messages"></div>

					<div class="controls">

						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Engineer Id </label> <input id="name"
										type="text" name="engineerId" class="form-control"
										placeholder="Please enter Client Name " readonly="readonly"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>


							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Engineer Name </label> <input id="name"
										type="text" name="name" class="form-control"
										placeholder="Please enter Client Name " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>



							<div class="col-md-6">
								<div class="form-group">
									<label for="form_email">Engineer Email Id </label> <input
										id="email" type="email" name="email" class="form-control"
										placeholder="Please enter Enginer Name " required="required"
										data-error="Engineer Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label for="form_lastname">Mobile No. </label> <input
										id="form_lastname" type="text" name="mobileNo"
										class="form-control"
										placeholder="Enter Parts Replacement Name" required="required"
										data-error="Parts Replacement is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>



							<div class="col-md-6">
								<div class="form-group">
									<label for="form_phone">Address</label> <input id="form_phone"
										type="tel" name="address" class="form-control"
										placeholder="Please enter Address Of Client"
										required="required" data-error="Address is required.">
									<div class="help-block with-errors"></div>

								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<input type="submit" class="btn btn-primary pull-left"
								onclick="success()" value="Submit">
						</div>
					</div>
				</form>
			</div>
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
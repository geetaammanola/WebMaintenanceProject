<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Complain Record</title>

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

	<script>
		$(function() {
			$('input[name=date]').datepicker();
		});
	</script>
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
		<h1 align="center">Add New Complain</h1>
		<hr>
		<br>

		<div class="row">

			<div class="col-lg-12 ">


				<form method="post" action="NewComplainController" role="form">

					<div class="messages"></div>

					<div class="controls">

						<div class="row">

							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Complain Id </label> <input id="name"
										type="text" name="complainId" class="form-control"
										placeholder=" Complain Id " readonly="readonly"
										data-error="Complain Id is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>


							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Complainer Name </label> <input
										id="form_name" type="text" name="complainer"
										class="form-control" placeholder="Please enter Client Name "
										required="required" data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>



							<div class="col-md-6">
								<div class="form-group">
									<label for="Date" class="col-sm-3 control-label">RefrigeratorType</label>

									<select id="type" name="fridgeType" class="form-control"
										name="fridgeType" required="required">
										<option value="SingleDoor">Single Door</option>
										<option value="DoubleDoor">Double Door</option>
										<option value="ThreeDoor">Three Door</option>
										<option value="FourDoor">Four Door</option>
										<option value="FrenchDoor">French Door</option>
										<option value="Side-by-side Door">Side-by-side Door</option>
										<option value="BottomMount">Bottom Mount</option>


									</select>

								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="form_lastname">Issue </label> <input
										id="form_lastname" type="text" name="issue"
										class="form-control" placeholder="Issue Of Client"
										required="required" data-error="Issue is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Email Id </label> <input id="form_name"
										type="text" name="email" class="form-control"
										placeholder="Please enter Email " required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Mobile No. </label> <input
										id="form_name" type="text" name="mobileNo"
										class="form-control" placeholder="Please enter Mobile No "
										required="required" data-error="Client Name is required.">
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


							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Prefered Appointment Date </label> <input
										id="form_name" type="text" name="appDate" class="form-control"
										placeholder="Please enter date" required="required"
										data-error="Client Name is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="Date" class="col-sm-6 control-label">preferred
										Appointment Slots</label> <select id="subject" name="appSlot"
										class="form-control" name="aslot" required="required">
										<option value="8 AM - 12 PM">8 AM to 12 PM</option>
										<option value="12 PM - 5 PM">12 PM to 5PM</option>
										<option value="5 PM - 10 PM">5 PM to 10 PM</option>
									</select>

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
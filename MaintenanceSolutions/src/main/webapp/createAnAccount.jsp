<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Maintenance Solution - Login</title>


<!-- Custom CSS file  -->
<link href="./assets/mycss.css" rel="stylesheet">

<!-- Jquery file  -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-7">
				<div class="panel panel-default">
					<div class="panel-heading">
						<span class="glyphicon glyphicon-lock"></span> Create An Account
					</div>
					<div class="panel-body">
						<form class="form-horizontal" action="login" role="form" method="get">


							<div class="form-group">
								<label for="name" class="col-sm-3 control-label">User
									Name</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="name" name="name"
										placeholder="Enter First Name" required>
								</div>
							</div>




							<div class="form-group">
								<label for="phoneNumber" class="col-sm-3 control-label">Mobile
									Number </label>
								<div class="col-sm-9">
									<input type="MobileNumber" id="MobileNumber" name="mobileNo"
										placeholder=" Your Mobile number" class="form-control">

								</div>
							</div>

							<div class="form-group">
								<label for="email" class="col-sm-3 control-label">E-Mail</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="email" name="email"
										placeholder="Enter Email Or UserName" required>
								</div>
							</div>

							<div class="form-group">
								<label for="address" class="col-sm-3 control-label">Address</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="address"
										name="address" placeholder="Enter Email Or UserName" required>
								</div>
							</div>

							<div class="form-group">
								<label for="nopend" class="col-sm-3 control-label">
									Password</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="password"
										name="password" placeholder="Password" required>
								</div>
							</div>
							<div class="form-group">
								<label for="nopend" class="col-sm-3 control-label">
									Confirm Password</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="password"
										placeholder=" Confirm Password" required>
								</div>
							</div>

							<div class="form-group last">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-primary btn-sm">
										Login</button>

								</div>
							</div>
						</form>
					</div>
					<div class="panel-footer">
						Already Have Account <a href="login.jsp"> Login </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
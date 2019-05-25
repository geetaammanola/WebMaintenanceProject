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
						<span class="glyphicon glyphicon-lock"></span> Login
					</div>
					<div class="panel-body">
						<form class="form-horizontal" role="form" action="login"
							method="post">
							<div class="form-group">
								<label for="nokp" class="col-sm-3 control-label">UserName</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" name="username"
										id="username" placeholder="Email Or UserName" required>
								</div>
							</div>
							<div class="form-group">
								<label for="nopend" class="col-sm-3 control-label">
									Password</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" name="password"
										id="password" placeholder="Password" required>
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
						Not Have An Account? <a href="createAnAccount.jsp">Create
							Account </a>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
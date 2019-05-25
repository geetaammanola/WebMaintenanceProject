<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>



<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.nav, .nav ul {
	margin: 0px;
	padding: 0px;
	list-style: none outside none;
	height: 30px;
}

.nav li {
	float: left;
	width: 150px;
	position: relative;
	height: 50px;
	background: #008ae6;
	display: block;
	box-shadow: 10px 0px 10px 0px;
	margin-left: 2px;
}

.nav a {
	text-decoration: none;
	height: 50px;
	display: block;
	text-align: center;
	color: white;
	padding-top: 10px;
}

.sub {
	left: -9999px;
	position: absolute;
	top: -9999px;
	z-index: 2;
}

.nav li:hover .sub {
	visibility: visible;
}

.nav {
	font-family: Calibri;
	font-size: 20px;
	height: 50px;
	font-weight: bold;
	margin: 40px auto;
	text-shadow: 0 -1px 3px #ffcc00;
	border-radius: 4px;
}

.nav li:first-child {
	border-left: 0 none;
	margin-left: 5px;
}

.nav li a {
	color: White;
	display: block;
	line-height: 24px;
	text-decoration: none;
}

@
keyframes ss { 0% {
	transform: scale(1);
}

30%
{
transform


:scale


(1
.3


);
}
100%
{
transform


:scale(1)


;
}
}
.nav li>a:hover {
	animation: ss 0.7s linear infinite forwards;
}

.nav li:hover>a {
	z-index: 4;
}

.nav li:hover .sub {
	left: 0;
	top: 50px;
	width: 150px;
}

.nav ul li {
	background: none repeat scroll 0 0 #ff6565;
	box-shadow: 5px 5px 5px rgb(0, 0, 0, 0.5);
	opacity: 0.3;
	width: 100%;
}

.nav li:hover ul li {
	animation: ss1 0.3s linear 1 forwards;
}

@
keyframes ss1 { 0% {
	margin-left: 300px;
	top: 900px;
	transform: rotate(90deg);
}

100%
{
margin-left

 

:


0
px
;top


:


0
px
;transform


:rotate(360deg)


;
opacity


:


1;
}
}
.nav li:hover ul li:nth-child(3) {
	animation-delay: 0;
}

.nav li:hover ul li:nth-child(2) {
	animation-delay: 0.1s;
}

.nav li:hover ul li:nth-child(1) {
	animation-delay: 0.2s;
}
</style>

</head>
<body>

	<div class="container">
		<div class="row">
			<div>
				<ul class="nav">
					<li><a href="addNewComplain.jsp">Add Complain</a></li>
                   <li><a href="complainList.jsp">View Complains</a></li>
					<li><a href="addNewProduct.jsp">Add Product</a></li>
					<li><a href="productList.jsp">View Products</a></li>
					<li><a href="addNewEngineer.jsp">Add Engineer</a></li>
					<li><a href="engineerList.jsp">View Engineers</a></li>
					<li><a href="listClientResolvedData.jsp">Resolve List</a></li>

				</ul>
			</div>
		</div>
	</div>

</body>
</html>
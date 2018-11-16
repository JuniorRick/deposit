<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Log In</title>
<style>
html, body {
	margin: 0;
	padding: 0;
}

.centered {
	height: 400px;
	width: 400px;
	margin: 10% auto;

}


</style>
</head>
<body>

		<div class="centered">
		
			<div class="bg-light p-4 rounded clearfix">
			
				<c:if test="${param.error != null }">
					<p class="text-danger  d-inline text-center">Invalid credentials</p>
				</c:if>
	
				<c:if test="${param.logout != null }">
					<p class="text-success  d-inline text-center">You have been
						logged out</p>
				</c:if>
				<form:form
					action="${pageContext.request.contextPath}/authenticateTheUser"
					class="form-signin" method="POST">

					<h1 class="h3 mt-3 mb-3 font-weight-normal text-center">Please sign in</h1>
					<label class="sr-only">Username</label>
					<input type="text" name="username" class="form-control mb-2"
						placeholder="Username" required autofocus>
					<label for="inputPassword" class="sr-only">Password</label>
					<input type="password" name="password" id="inputPassword"
						class="form-control" placeholder="Password" required>

					<button class="btn btn-lg btn-primary float-right  mt-3" type="submit">Sign
						in</button>
				</form:form>
			</div>
		</div>

</body>
</html>
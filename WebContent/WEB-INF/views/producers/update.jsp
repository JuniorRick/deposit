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
<title>Insert title here</title>
</head>
<body>

	<div class="container p-2">

		<h2 class="text-center">Update Producer</h2>

		<form:form action="store" modelAttribute="producer" method="POST">
			<!-- Modal body -->

			<form:hidden path="id" />  

			<div class="modal-body">
				<label for="producerInput">Producer</label>
				<form:input path="name" class="form-control" id="producerInput"
					placeholder="Producer name" />
			</div>

			<!-- Modal footer -->
			<div class="modal-footer">

				<a href="list" class="btn btn-secondary">Back</a> <input
					type="submit" class="btn btn-primary" value="Save changes">
			</div>
		</form:form>
	</div>

</body>
</html>
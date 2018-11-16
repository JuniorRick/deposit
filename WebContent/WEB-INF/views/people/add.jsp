<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Reagents</title>
<jsp:include page="/WEB-INF/views/layouts/header.jsp" />
</head>
<body>

	<!-- Navigation menu -->
	<jsp:include page="/WEB-INF/views/layouts/nav.jsp" />

	<div class="container form-container">

		<h2 class="text-center mt-5">Add new Person</h2>

		<form:form action="store" modelAttribute="person" method="POST">
			<!-- Modal body -->


			<div class="modal-body">
				<label for="producerInput">Person</label>
				<form:input path="name" class="form-control"
					placeholder="Person name" />
			</div>
			
<%-- 			<form:hidden path="created_at" />
			<form:hidden path="updated_at" /> --%>

			<!-- Modal footer -->
			<div class="modal-footer">

				<a href="list" class="btn btn-secondary">Back</a> <input
					type="submit" class="btn btn-primary" value="Save">
			</div>
		</form:form>
	</div>

	<!-- Page Footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />
	
</body>
</html>
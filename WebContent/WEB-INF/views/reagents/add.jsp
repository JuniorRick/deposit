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

		<h2 class="text-center mt-5">Add new Reagent</h2>

		<form:form action="store" modelAttribute="reagent" method="POST">
			<!-- Modal body -->


			<div class="modal-body">
				<label>Barcode</label>
				<form:input path="code" class="form-control"
					placeholder="Reagent name" />
				<label>Name</label>
				<form:input path="name" class="form-control" placeholder="barcode" />
				<label>Producer</label>
				<form:select path="producer" class="form-control">
					<form:option value="NONE" label="-- Select producer --">
					</form:option>
					<form:options items="${producers}" itemValue="id" itemLabel="name" />
				</form:select>
				<label>Invoice date</label>
				<input type="date" id="receive_date" class="form-control" name="receive_date" />
				
				<label>Lot</label>
				<form:input path="lot" class="form-control"
					placeholder="Lot" />
				<label>Ref</label>
				<form:input path="ref" class="form-control"
					placeholder="Ref" />
				<label>Quantity</label>
				<form:input path="quantity" class="form-control"
					placeholder="Quantity" />
				<label>Expire date</label>
				<input type="date" id="expire" class="form-control" name="expire" />	
				
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
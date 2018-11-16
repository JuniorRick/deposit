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


	<div class="container pt-5">
		<div class="col ">
			<div class="row mb-2">
				<a href="add" type="button" class="btn btn-primary">Add new
					Reagent</a>
			</div>
			<div class="row">
				<table class="table table-striped table-hover table-sm">
					<thead class="thead-dark text-nowrap border border-light">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Barcode</th>
							<th scope="col">Name</th>
							<th scope="col">Producer</th>
							<th scope="col">Receive date</th>
							<th scope="col">Lot</th>
							<th scope="col">Ref</th>
							<th scope="col">Quantity</th>
							<th scope="col">Expire date</th>
							<th scope="col">Is handed</th>
							<th scope="col" colspan="3">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="reagent" items="${reagents}" varStatus="loop">

							<c:url var="update" value="/reagent/update">
								<c:param name="Id" value="${reagent.id}" />
							</c:url>

							<c:url var="delete" value="/reagent/delete">
								<c:param name="Id" value="${reagent.id}" />
							</c:url>

							<tr>
								<th scope="row">${loop.index + 1}</th>
								<td>${reagent.code}</td>
								<td>${reagent.name}</td>
								<td>${reagent.producer.name}</td>
								<td>${reagent.receive_date}</td>
								<td>${reagent.lot}</td>
								<td>${reagent.ref}</td>
								<td>${reagent.quantity}</td>
								<td>${reagent.expire}</td>
								<td>${reagent.handed}</td>

								<td><a href="${update}" class="btn btn-warning btn-sm">Edit</a>
								</td>
								<td>
									<button class="btn btn-primary btn-sm">Clone</button>
								</td>
								<td>
									<button class="btn btn-danger btn-sm" data-toggle="modal"
										data-target="#confirmModal${reagent.id}">Delete</button>
								</td>

							</tr>

							<div class="modal fade" id="confirmModal${reagent.id}">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel">Modal
												title</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body">
											Delete <span class="text-danger font-weight-bold">${reagent.name}</span>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-secondary"
												data-dismiss="modal">Cancel</button>
											<a href="${delete}" class="btn btn-danger">Confirm</a>
										</div>
									</div>
								</div>
							</div>

						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>
	</div>

	<!-- Page Footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />



</body>
</html>
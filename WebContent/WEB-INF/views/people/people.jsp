<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/layouts/header.jsp" />
<title>People</title>
</head>
<body>

	<!-- Navigation menu -->
	<jsp:include page="/WEB-INF/views/layouts/nav.jsp" />


	<div class="container pt-5">
		<div class="col mx-auto" style="max-width: 600px">
			<div class="row mb-2">
				<a href="add" type="button" class="btn btn-primary">Add new
					person</a>

			</div>
			<div class="row">
				<table class="table table-striped table-hover table-sm table-responsive">
					<caption>List of people</caption>
					<thead class="thead-dark text-nowrap border border-light">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Name</th>
							<th scope="col" colspan="2">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="person" items="${people}" varStatus="loop">

							<c:url var="update" value="/person/update">
								<c:param name="Id" value="${person.id}" />
							</c:url>

							<c:url var="delete" value="/person/delete">
								<c:param name="Id" value="${person.id}" />
							</c:url>

							<tr>
								<th scope="row">${loop.index + 1}</th>
								<td>${person.name}</td>
								<td><a href="${update}" class="btn btn-warning btn-sm">Edit</a>
								</td>
								<td>
									<button class="btn btn-danger btn-sm" data-toggle="modal"
										data-target="#confirmModal${person.id}">Delete</button>
								</td>
							</tr>


							<div class="modal fade" id="confirmModal${person.id}">
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
											Delete <span class="text-danger font-weight-bold">${person.name}</span>
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

	<!--  Page footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />

</body>
</html>

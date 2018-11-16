<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<title>Releases</title>
<jsp:include page="/WEB-INF/views/layouts/header.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/layouts/nav.jsp" />

	<div class="container pt-5">
		<div class="mx-auto">
			<table class="table table-striped table-hover table-sm">
				<thead class="thead-dark text-nowrap border border-light">
					<tr>
						<th scope="col">#</th>
						<th scope="col">Barcode</th>
						<th scope="col">Name</th>
						<th scope="col">Producer</th>
						<th scope="col">Person</th>
						<th scope="col">Receive date</th>
						<th scope="col">Lot</th>
						<th scope="col">Ref</th>
						<th scope="col">Initial Quantity</th>
						<th scope="col">Active Quantity</th>
						<th scope="col">Expire date</th>
						<th scope="col">State</th>
						<th scope="col" colspan="3">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="release" items="${releases}" varStatus="loop">

						<c:url var="update" value="/release/update">
							<c:param name="Id" value="${release.id}" />
						</c:url>

						<c:url var="delete" value="/release/delete">
							<c:param name="Id" value="${release.id}" />
						</c:url>

						<tr>
							<th scope="row">${loop.index + 1}</th>
							<td>${release.reagent.code}</td>
							<td>${release.reagent.name}</td>
							<td>${release.reagent.producer.name}</td>
							<td>${release.person.name}</td>
							<td>${release.handed_date}</td>
							<td>${release.reagent.lot}</td>
							<td>${release.reagent.ref}</td>
							<td>${release.reagent.quantity}</td>
							<td>${release.order_quantity}</td>
							<td>${release.reagent.expire}</td>
							<td>${release.state}</td>

							<td><a href="${update}" class="btn btn-warning btn-sm">Edit</a>
							</td>
							<td>
								<button class="btn btn-primary btn-sm">Clone</button>
							</td>
							<td>
								<button class="btn btn-danger btn-sm" data-toggle="modal"
									data-target="#confirmModal${release.id}">Delete</button>
							</td>

						</tr>

						<div class="modal fade" id="confirmModal${release.id}">
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
										Delete <span class="text-danger font-weight-bold">${release.reagent.name}</span>
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

	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />

</body>
</html>
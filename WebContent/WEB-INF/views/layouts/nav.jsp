<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark"
	style="background-color: #e3f2fd;">
	<a class="navbar-brand" href="#">
	<img src="${pageContext.request.contextPath}/resources/images/crdm.jpeg" 
	style="	width: 40px; height: auto;"alt="" />
	</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarColor03" aria-controls="navbarColor03"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarColor03">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/">Home <span
					class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/reagent/list">Reagents</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/release/list">Laboratory</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/release/new">New
					Release</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> More ... </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item"
						href="${pageContext.request.contextPath}/producer/list">Producers</a>
					<a class="dropdown-item"
						href="${pageContext.request.contextPath}/person/list">People</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Settings</a>
				</div></li>

		</ul>

		<form class="form-inline ">
			<input class="form-control mr-sm-2" placeholder="Search"
				aria-label="Search" type="search">
			<button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
		</form>

	</div>
</nav>


<style>
.navbar {
	padding-left: 10% !important;
	padding-right: 10% !important;
}
</style>
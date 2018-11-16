<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Reagents</title>
<style>
.nav-left {
	min-width: 200px;
	height: 100vh;
	background-color: #fff;
	position: absolute;
	top: 0;
	left: 0;
	padding-top: 80px;
	padding-left: 15px;
}
</style>
<jsp:include page="/WEB-INF/views/layouts/header.jsp" />
</head>
<body>

	<!-- Navigation menu -->
	<jsp:include page="/WEB-INF/views/layouts/nav.jsp" />


	<div class="nav-left">
		<h4>
			<security:authentication property="principal.username" />
		</h4>

		<form:form action="${pageContext.request.contextPath}/logout"
			method="POST">
			<input type="submit" class="btn button-primary" value="Logout" />
		</form:form>
	</div>




	<!-- Page Footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />

</body>
</html>
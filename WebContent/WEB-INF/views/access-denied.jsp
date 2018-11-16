<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<div class="denied">
	 	<img src="${pageContext.request.contextPath}/resources/images/Access-Denied.jpg" alt="" />
	</div>
</body>

<style>
	html, body {
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	}
	.denied img{
		height:100vh;
		display: block;
	}

</style>

</html>
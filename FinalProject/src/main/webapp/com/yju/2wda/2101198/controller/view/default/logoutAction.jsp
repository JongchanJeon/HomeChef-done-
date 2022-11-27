<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.PrintWriter" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Chef(홈 셰프)</title>
</head>
<body>
	<%
		session.invalidate();
	%>
	
	<script>
	alert("로그아웃이 되었습니다.")
		location.href = "../../../../../../../index.jsp";
	</script>
</body>
</html>
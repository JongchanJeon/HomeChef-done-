<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%@page import="javax.naming.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>DBCP 연결 테스트 - with MariaDB</h1>
<hr>
<%
	Connection con = null;

	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc_mariadb");
		con = ds. getConnection();
		
		out.println("<h3>DB 연결 성공 !!!");
	}catch(Exception e){
		out.println("<h3>DB 연결 실패!!!");
		e.printStackTrace();
	}finally {
		if (con!=null)
			con.close();
	}
%>
</body>
</html>
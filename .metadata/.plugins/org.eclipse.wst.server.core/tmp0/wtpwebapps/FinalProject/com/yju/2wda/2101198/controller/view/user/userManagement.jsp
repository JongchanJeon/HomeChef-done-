<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="FinalProject.model.DTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈 셰프 관리자 모드!</title>
</head>
<body>
<h1>유저 관리 페이지</h1>
<%
	ArrayList<DTO> userList = (ArrayList<DTO>) session.getAttribute("usersManagement");
%>
<table border ="2">
	<thead>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>전화번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>타입</th>
			<th>포인트</th>
		</tr>
		<%
			for(int i = 0 ; i < userList.size(); i++) {
			%>
			<tr>
				<th><%=userList.get(i).getUser_id() %></th>
				<th><%=userList.get(i).getUser_pw() %></th>
				<th><%=userList.get(i).getUser_number() %></th>
				<th><%=userList.get(i).getUser_name() %></th>
				<th><%=userList.get(i).getUser_address() %></th>
				<th><%=userList.get(i).getType() %></th>
				<th><%=userList.get(i).getPoint() %></th>
			</tr>
		<%
			}
		%>
</table>

</body>
</html>
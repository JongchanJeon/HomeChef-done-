<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="FinalProject.model.productDTO" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <title>Home Chef(홈 셰프)</title>
    <style>
        .item {
            margin: auto;
            text-align: center;
            height: 200px;
            width: 1000px;

        }
        .container {
            display: flex;
            padding : 15px;
        }
        .card{
            margin : 10px;
        }
        	#search {
		width : 700px;
		padding : 20px;
	}
	#searchbtn {
		width : 100px;
	}
	#navbar {
		width : 500px;
	}
	#center {
		width : 900px;
		margin : 0 auto;
  		text-align : center;
	}
	#login {
		float:right; 
		padding-top: 50px;
        padding-right: 300px;
        padding-bottom: 30px;

	}
	.card-text {
	 	overflow : hidden; 
	}
    </style>
</head>
<body>
<%@ include file ="../default/header.jsp" %>
<%
	ArrayList<productDTO> productsList = (ArrayList<productDTO>) session.getAttribute("Products");
%>
<div>
<div class = "item">
	<%for(int i = 0; i < productsList.size(); i++){ 
		if(i % 3 == 0){
	%>
    <div class = "container">
    <%} %>
    <span class="card" style="width: 18rem;">
        <img src="/FinalProject/com/yju/2wda/2101198/controller/image/<%=productsList.get(i).getProduct_filesystemName()%>" class="card-img-sop" width="285px" height="250px">
        <span class="card-body">
          <h5 class="card-title"><%=productsList.get(i).getProduct_name() %></h5>
          <p class="card-text"><%=productsList.get(i).getProduct_description() %></p>
          <p class ="card-text">가격 : <%=productsList.get(i).getProduct_price() %>원</p>
          <a href="/FinalProject/com/yju/2wda/2101198/controller/view/product/showProduct.jsp?id=<%=productsList.get(i).getProduct_id() %>" class="btn btn-primary">구매하기</a>
        </span>
    </span>
    <%if(i % 3 == 2){%>
    </div>
    
    <%}
    }
	%>
	</div>

<!-- footer 삭제함 위치 애매하게 출력됨  -->
<!--  include file ="/com/yju/2wda/2101198/controller/view/default/footer.jsp" %> -->
</div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>
</html>
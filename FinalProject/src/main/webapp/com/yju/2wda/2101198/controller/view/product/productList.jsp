<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            padding : 50px;
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
    </style>
</head>
<body>
<%@ include file ="../default/header.jsp" %>
<div class = "item">
    <div class = "container">
    <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-sop" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
      <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-top" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
    <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-top" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
    <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-sop" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
    <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-sop" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
    <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-sop" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
    <span class="card" style="width: 18rem;">
        <img src="../../image/food1.jpg" class="card-img-sop" alt="...">
        <span class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </span>
    </span>
    
</div>
<%@ include file ="/com/yju/2wda/2101198/controller/view/default/footer.jsp" %>
</div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>
</html>
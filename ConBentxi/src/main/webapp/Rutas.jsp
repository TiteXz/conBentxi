<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body {
	background-color: #eee;
}

.menu a:hover {
	background-color: #0062ff;
	box-shadow: 0 0 0 5px #1f75ff5f;
	color: #fff;
}

.menu {
	width: 100%;
	height: 75px;
	background-color: rgba(255, 255, 255, 0.911);
	position: fixed;
	box-shadow: 4px 0px 4px 0;
	z-index: 100;
	padding-top: 25px;
}

#a1, #a2, #a3 {
    margin: 10px 0 0 25px;
  }

#login {
	margin-left: 50px;
	border: 2px solid black;
	padding: 5px;
	border-radius: 10px;
	margin-top: 15px;
}

.card {
	display: inline-flex;
	margin-left: 100px;
	margin-bottom: 70px;
	border: 1px solid #555555;
}

.info {
	background-color: white;
	height: 400px;
	border-radius: 10px;
	position: absolute;
	margin-left: 1500px;
	margin-top: -542px;
	padding: 10px;
	border: 1px solid #555555;
}

/* Input container */
.input-container {
	position: relative;
	margin: 20px;
}

/* Input field */
.input-field {
	background:
		url(https://cdn0.iconfinder.com/data/icons/slim-square-icons-basics/100/basics-19-32.png)
		no-repeat 0px 5px;
	background-size: 24px;
	display: block;
	width: 500px;
	padding: 10px;
	padding-left: 30px;
	font-size: 16px;
	border: none;
	border-bottom: 2px solid #ccc;
	outline: none;
	background-color: transparent;
}

/* Input label */
.input-label {
	position: absolute;
	top: 0;
	left: 0;
	font-size: 16px;
	color: rgba(204, 204, 204, 0);
	pointer-events: none;
	transition: all 0.3s ease;
}

/* Input highlight */
.input-highlight {
	position: absolute;
	bottom: 0;
	left: 0;
	height: 2px;
	width: 0;
	background-color: #007bff;
	transition: all 0.3s ease;
}

/* Input field:focus styles */
.input-field:focus+.input-label {
	top: -20px;
	font-size: 12px;
	color: #007bff;
}

.input-field:focus+.input-label+.input-highlight {
	width: 500px;
}

.footer {
	position: relative;
	width: 100%;
	background: #3586ff;
	min-height: 100px;
	padding: 20px 50px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	margin-top: 125px;
}

.social-icon, #menu {
	position: relative;
	display: flex;
	justify-content: center;
	align-items: center;
	margin: 10px 0;
	flex-wrap: wrap;
}

.social-icon__item, .menu__item {
	list-style: none;
}

.social-icon__link {
	font-size: 2rem;
	color: #fff;
	margin: 0 10px;
	display: inline-block;
	transition: 0.5s;
}

.social-icon__link:hover {
	transform: translateY(-10px);
}

.menu__link {
	font-size: 1.2rem;
	color: #fff;
	margin: 0 10px;
	display: inline-block;
	transition: 0.5s;
	text-decoration: none;
	opacity: 0.75;
	font-weight: 300;
}

.menu__link:hover {
	opacity: 1;
}

.footer p {
	color: #fff;
	margin: 15px 0 10px 0;
	font-size: 1rem;
	font-weight: 300;
}

.wave {
	position: absolute;
	top: -100px;
	left: 0;
	width: 100%;
	height: 100px;
	background: url("https://i.ibb.co/wQZVxxk/wave.png");
	background-size: 1000px 100px;
}

.wave#wave1 {
	z-index: 1000;
	opacity: 1;
	bottom: 0;
	animation: animateWaves 4s linear infinite;
}

.wave#wave2 {
	z-index: 999;
	opacity: 0.5;
	bottom: 10px;
	animation: animate 4s linear infinite !important;
}

.wave#wave3 {
	z-index: 1000;
	opacity: 0.2;
	bottom: 15px;
	animation: animateWaves 3s linear infinite;
}

.wave#wave4 {
	z-index: 999;
	opacity: 0.7;
	bottom: 20px;
	animation: animate 3s linear infinite;
}

@
keyframes animateWaves { 0% {
	background-position-x: 1000px;
}

100


%
{
background-positon-x


:


0px
;


}
}
@
keyframes animate { 0% {
	background-position-x: -1000px;
}

100


%
{
background-positon-x


:


0px
;


}
}
.open-hide {
	background-color: #0586ff;
	color: white;
	text-decoration: none;
	padding: 5px;
	border-radius: 10px;
	height: 35px;
	width: 70px;
	display: block;
	border-radius: 10px;
}

.open-hide:hover {
	cursor: pointer;
	color: white;
}

.scene {
	width: 10em;
	justify-content: center;
	align-items: center;
}

.cube {
	color: #ccc;
	cursor: pointer;
	transition: all 0.85s cubic-bezier(.17, .67, .14, .93);
	transform-style: preserve-3d;
	transform-origin: 100% 50%;
	width: 90px;
	height: 45px;
}

.cube:hover {
	transform: rotateX(-90deg);
}

.side {
	box-sizing: border-box;
	position: absolute;
	display: inline-block;
	height: 4em;
	width: 10em;
	text-align: center;
	text-transform: uppercase;
	padding-top: 1.5em;
	width: 80px;
	height: 35px;
	padding: 5px;
	border-radius: 10px;
}

.top {
	background: #0586ff;
	color: white;
	transform: rotateX(90deg) translate3d(0, 0, 2em);
}

.top a {
	text-decoration: none;
	color: white;
}

.front {
	background: #0586ff;
	color: white;
	transform: translate3d(0, 0, 2em);
}

@media only screen and (min-width: 1501px) {

	.card {
		width: 50%;
		height: 35%;
		display: inline-flex;
		margin: 5% 0 0 10%;
	}
	.info {
		display: inline-block;
		height: 35%;
		width: 30%;
		margin: 5% 0 10% 65%;
	}
	.card-img-top {
		height: 70%;
	}
}

@media only screen and ((min-width: 1201px) and (max-width:1500px)) {
	
	.card {
		width: 50%;
		height: 35%;
		display: inline-flex;
		margin: 5% 0 0 10%;
	}
	.info {
		display: inline-block;
		height: 35%;
		width: 30%;
		margin: 5% 0 10% 65%;
	}
	.card-img-top {
		height: 70%;
	}
}

@media only screen and ((min-width: 992px) and (max-width: 1200px)) {
	
	.card {
		width: 40%;
		height: 35%;
		display: inline-flex;
		margin: 5% 0 0 10%;
	}
	.info {
		display: inline-block;
		height: 35%;
		width: 40%;
		margin: 5% 0 10% 55%;
	}
	.card-img-top {
		height: 70%;
	}
}

@media only screen and (min-width: 768px) and (max-width: 991px) {
	
	.card {
		width: 40%;
		height: 35%;
		display: inline-flex;
		margin: 5% 0 0 10%;
	}
	.info {
		display: inline-block;
		height: 35%;
		width: 40%;
		margin: 5% 0 10% 55%;
	}
}

/* Estilos para pantallas pequeñas */
@media screen and (max-width: 767px) {
	
	#login {
		margin-left: 25px;
	}
	.card {
		width: 80%;
		height: 35%;
		display: inline-block;
		margin: 5% 0 0 10%;
	}
	.info {
		display: inline-block;
		height: 35%;
		width: 80%;
		margin: 0 0 10% 10%;
		position: relative;
	}
	.input-field {
		width: 95%;
	}
	.input-highlight {
		position: absolute;
		bottom: 0;
		left: 0;
		height: 2px;
		width: 0;
		background-color: #007bff;
		transition: all 0.3s ease;
	}
	.input-field:focus+.input-label+.input-highlight {
		width: 95%;
	}
}
</style>

<body>
	<div class="menu">
		<a id="a1" href="Home.jsp">HOME</a> <a id="a2" href="Cruceros.jsp">CRUCEROS</a>
		<a id="a3" href="Rutas.jsp">RUTAS</a> <a id="login" href=FormLogin.jsp>LOG
			IN</a>
	</div>

	<br>
	<br>
	<br>
	<br>
	<br>

	<form method="GET" action="BuscadorDestino">
		<div class="input-container">
			<input name="destino" id="destino" placeholder="Busca tu Destino" class="input-field" type="text"> 
			<label for="input-field" class="input-label">Busca tu Destino</label>
			<span class="input-highlight"></span>
		</div>
	</form>

	<br>
	<br>
	<br>

	<div class="info">
		<img class="card-img-top"
			src="https://www.crucerosmediterraneo.com/descubre/wp-content/uploads/Como-son-los-camarotes-de-un-crucero-1024x687.jpg"
			alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">399.99</h5>
			<p class="card-text">Suit barata.</p>
		</div>
	</div>


	<c:forEach items="${rutas}" var="ruta">
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Destino ${ruta.destino}</h5>
				<h6 class="card-subtitle mb-2 text-muted">Origen ${ruta.origen}</h6>
				<p class="card-text">El crucero es el Royal Mary el viaje es de
					10 días.</p>
				<div class="scene">
					<div class="cube">
						<span class="side top"><a href="ReservarRuta.jsp">Reservar</a></span>
						<span class="side front">${ruta.precio}</span>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>




	<footer class="footer">
		<div class="waves">
			<div class="wave" id="wave1"></div>
			<div class="wave" id="wave2"></div>
			<div class="wave" id="wave3"></div>
			<div class="wave" id="wave4"></div>
		</div>
		<ul class="social-icon">
			<li class="social-icon__item"><a class="social-icon__link"
				href="#"> <ion-icon name="logo-facebook"></ion-icon>
			</a></li>
			<li class="social-icon__item"><a class="social-icon__link"
				href="#"> <ion-icon name="logo-twitter"></ion-icon>
			</a></li>
			<li class="social-icon__item"><a class="social-icon__link"
				href="#"> <ion-icon name="logo-linkedin"></ion-icon>
			</a></li>
			<li class="social-icon__item"><a class="social-icon__link"
				href="#"> <ion-icon name="logo-instagram"></ion-icon>
			</a></li>
		</ul>
		<ul id="menu">
			<li class="menu__item"><a class="menu__link" href="#">Home</a></li>
			<li class="menu__item"><a class="menu__link" href="#">About</a></li>
			<li class="menu__item"><a class="menu__link" href="#">Services</a></li>
			<li class="menu__item"><a class="menu__link" href="#">Team</a></li>
			<li class="menu__item"><a class="menu__link" href="#">Contact</a></li>

		</ul>
		<p>&copy;2023 Iker Beñat | All Rights Reserved</p>
	</footer>
	<script type="module"
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</body>
</html>
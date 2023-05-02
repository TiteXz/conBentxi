<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<style>
#datosCliente {
	width: 400px;
	padding: 5% 0% 0% 5%;
	display: inline-flex;
}

#datosReserva {
	width: 200px;
	padding: 5% 0% 0% 0%;
	padding-top: -100px;
	display: inline-flex;
}

section {
	background-color: #eee;
	width: 50%;
	padding-bottom: 5%;
	margin-left: 22%;
	border-radius: 10px;
	margin-top: 200px;
	margin-bottom: 100px;
}

.card {
	height: 300px;
	width: 200px;
	margin: 3% 0 0 0;
	position: absolute;
	display: inline-flex;
}

.menu a {
	opacity: 0.8;
	text-decoration: none;
	color: black;
}

.menu a:hover {
	opacity: 1;
	color: rgb(0, 81, 255);
	transition: ease .15s;
}

.menu {
	width: 100%;
	height: 75px;
	background-color: rgba(255, 255, 255, 0.911);
	position: fixed;
	margin-top: -200px;
	box-shadow: 4px 0px 4px 0;
	padding-top: 25px;
	z-index: 100;
}

#a1 {
	margin-left: 1450px;
}

#a2 {
	margin-left: 50px;
}

#a3 {
	margin-left: 50px;
}

#login {
	margin-left: 50px;
	border: 2px solid black;
	padding: 5px;
	border-radius: 10px;
}

#logo img {
	height: 80px;
	width: 110px;
	position: absolute;
	margin-top: -30px;
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
0px;
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
0px;
}
}
</style>

<body>
	<div class="progress">
		<div class="progress-bar progress-bar-striped progress-bar-animated"
			role="progressbar" aria-valuenow="84" aria-valuemin="0"
			aria-valuemax="100" style="width: 84%"></div>
	</div>

	<br>
	<br>
	<br>

	<a id="trabajar">Vamos manos a la obra!!</a>

	<a class="open-hide1">Crear</a>

	<ul class="menuRayas1">
		<li><a href="AinadirActi.jsp">actividad</a></li>
		<li><a href="AinadirCrucero.jsp">cruceros</a></li>
		<li><a href="AinadirEmple.jsp">empleados</a></li>
		<li><a href="AinadirHabita.jsp">habitaciones</a></li>
		<li><a href="AinadirParada.jsp">paradas</a></li>
		<li><a href="AinadirPuerto.jsp">puertos</a></li>
		<li><a href="AinadirRuta.jsp">rutas</a></li>

	</ul>

	<a class="open-hide2">Visualizar</a>

	<ul class="menuRayas">
		<li><a href="VisualizarActi.jsp">actividad</a></li>
		<li><a href="VisualizarCrucero.jsp">cruceros</a></li>
		<li><a href="VisualizarEmple.jsp">empleados</a></li>
		<li><a href="VisualizarHabita.jsp">habitaciones</a></li>
		<li><a href="VisualizarParada.jsp">paradas</a></li>
		<li><a href="VisualizarPuerto.jsp">puertos</a></li>
		<li><a href="VerRutas">rutas</a></li>

	</ul>


</body>
</html>
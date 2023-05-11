<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Empleado</title>
</head>

<style>
#logout {
    width:60px;
    padding: 10px;
    background-color: #216eff;
    border-radius: 10px;
}

#logout a{
    color: #fff;
    text-decoration: none;
}

#logout a:hover{
    color: black;
    text-decoration: none;
}

#logout:hover{
    background-color: #216fffc5;
}

#tituloEmpleado{
	font-family: 'Courier New';
	text-transform: uppercase;
	margin-top: 100px;
	margin-left:22%;
	position: absolute;
	font-size: 40px;
}

#menu {
	list-style: none;
	float:left;
	position: ;
}

#menu li a {
	position: relative;
	font-weight: bold;
	color: rgb(0, 183, 255);
	text-decoration: none;
}
#menu li a:after {
	position: absolute;
	bottom: 7px;
	left: 0px;
	width: 100%;
	height: 4px;
	background-color: rgb(32, 32, 226);
	content: "";
	opacity: 0;
	transition: opacity 0.3s ease 0s, transform 0.3s ease 0s;
	transform: translateY(20px);
}

#menu li a:hover:after {
	opacity: 1;
	transform: translateY(15px)
}

input {
	border-radius: 10px;
	padding: 4px;
}

#LogIn {
	margin-left: 55px;
}

#formulario {
	background-color: rgb(209, 208, 208);
	width: 400px;
	height: 600px;
	margin-top: 10%;
	border-radius: 10px;
	display: inline-flex;
}

#formulario:hover {
	background-color: rgba(209, 208, 208, 0.363);
}

form {
	margin-left: 32%;
	padding-top: 15%;
}

#formulario2 {
	background-color: rgb(209, 208, 208);
	width: 850px;
	height: 600px;
	margin-top: 7.2%;
	margin-left: -300px;
	border-radius: 10px;
	display: inline-flex;
}

img {
	width: 770px;
	height: 520px;
	padding-left: 40px;
	padding-top: 40px;
	border-radius: 100px;
}

nav ul {
	display: flex;
	justify-content: space-evenly;
	list-style: none;
}

.menu li {
	list-style: none;
	padding: 0.6em 1em;
	background-color: #fff;
}

.menu li a {
	text-decoration: none;
	color: #333;
}

.menu li a:hover {
	color: rgb(32, 32, 226);
}


@media only screen and (min-width: 1501px) {
#tituloEmpleado{
    margin: 0 0 0 45%;
    position: absolute;
}

#formulario{
    margin: 10% 0 0 -20%;
}

#menu li a{
    margin-left: -40px;
}

}

@media only screen and ((min-width: 1201px) and (max-width:1500px)) {
#tituloEmpleado{
    margin: 0 0 0 40%;
    position: absolute;
}

#formulario{
    width: 100%;
    padding: 2% 45% 20% 10%;
    margin: 0 0 0 -40%;
}

#formulario2{
    width: 108%;
    margin: 0 0 0 -7%;
    height: 634px;
}

img{
    width: 600px;
    height: 550px;
    border-radius: 0px;
}

#menu li a{
    margin-left: -40px;
}

}

@media only screen and ((min-width: 992px) and (max-width: 1200px)){
#tituloEmpleado{
    margin: 0 0 0 40%;
    position: absolute;
}


#formulario{
    width: 80%;
    padding: 2% 55% 20% 0%;
    margin: 0 0 0 -31%;
}

#formulario2{
    width: 110%;
    margin: 0 0 0 -12%;
    height: 634px;
}

img{
    width: 500px;
    height: 500px;
    border-radius: 0%;
}

#menu li a{
    margin-left: -40px;
}


}

@media only screen and (min-width: 768px) and (max-width: 991px) {
#tituloEmpleado{
    margin: 0 0 0 40%;
    position: absolute;
}

#formulario{
    width: 60%;
    padding: 2% 65% 20% 0%;
    margin: 0 0 0 -30%;
}

#formulario2{
    width: 110%;
    margin: 0 0 0 -8%;
    height: 634px;
}

img{
    width: 450px;
    height: 450px;
    border-radius: 0%;
}

#menu li a{
    margin-left: -40px;
}

}

/* Estilos para pantallas pequeñas */
@media screen and (max-width: 767px) and (min-width: 501px){

#tituloEmpleado{
    margin: 0 0 0 27%;
    position: absolute;
}

#formulario{
    width: 80%;
    padding: 2% 55% 20% 0;
    margin: 30% 5% 0 0%;
}

#formulario2{
    width: 0px;
    margin: 50% 0 0 -60%;
    position:absolute;
    opacity: 0;
}

img{
    width: 200px;
    height: 200px;
    border-radius: 10px;
    opacity: 0;
}

#menu li a{
    margin-left: -40px;
}

}
@media screen and (max-width: 500px){

#tituloEmpleado{
    margin: 0 0 0 30%;
    position: absolute;
}

#formulario{
    width: 80%;
    padding: 2% 65% 20% 0%;
    margin: 30% 5% 0 0%;
}

#formulario2{
    width: 0px;
    margin: 50% 0 0 -60%;
    position:absolute;
    opacity: 0;
}

img{
    width: 200px;
    height: 200px;
    border-radius: 10px;
    opacity: 0;
}

#menu li a{
    margin-left: -40px;
}

}

</style>


<body>

	<P id="tituloEmpleado">empleados</P>

	<div id="logout"> <a href="AbrirLogin">Log out</a></div>

	<ul id="menu">
		<li><a href="Bienvenido.jsp" title="VISTAS">VISTAS </a></li>
	</ul>

	<br>
	<br>
	<br>

	<nav>
		<ul>
			<li><a>
					<div id="formulario">
						<form method="POST" action="InsertarEmpleado">
							<label><input required="required" type="text" id="nombre" name="nombre"
								placeholder="nombre" /></label> <br> <br> <label><input
								required="required" type="text" id="apellido" name="apellido" placeholder="apellido" /></label>
							<br> <br> <label><input required="required" type="text"
								id="trabajo" name="trabajo" placeholder="trabajo" /></label> <br>
							<br> <label><input required="required" type="number" id="id_crucero"
								name="id_crucero" placeholder="id_crucero" /></label> <br> <br>
							<label><input required="required" type="text" id="usuario"
								name="usuario" placeholder="usuario" /></label> <br> <br>
							<label><input required="required" type="password" id="password"
								name="password" placeholder="password" /></label> <br> <br>
							<input id="LogIn" type="submit" value="CREAR" />
						</form>
					</div>
			</a></li>
			<li><a>
					<div id="formulario2">
						<img
							src="https://static.vecteezy.com/system/resources/previews/008/070/292/original/blue-boat-logo-symbol-illustration-free-vector.jpg"
							alt="">
					</div>
			</a></li>
		</ul>

</body>
</html>
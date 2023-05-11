<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar habitacion</title>
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

#tituloHabitacion {
	font-family: 'Courier New';
	text-transform: uppercase;
	margin-left: 835px;
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

.open-hide {
	background-color: #fff;
	color: yellow;
	width: 35px;
	height: 35px;
	display: block;
	background-image:
		url(https://cdn-icons-png.flaticon.com/512/54/54206.png);
	/*https://s3-us-west-2.amazonaws.com/s.cdpn.io/6001/menu.png*/
	background-repeat: no-repeat;
	background-position: center center;
	background-size: 25px;
	text-indent: -9999em;
	margin-top: -840px;
	border-radius: 10px;
}

.open-hide:hover {
	cursor: pointer;
}

.menu {
	height: 0;
	-webkit-transition: all 0.2s ease;
	-moz-transition: all 0.2s ease;
	-o-transition: all 0.2s ease;
	transition: all 0.2s ease;
	width: 10em;
	overflow: hidden;
	margin-top: 0;
	padding: 0;
	box-sizing: border-box;
}

.menu:hover {
	height: 320px;
	padding-top: 1em;
}

.open-hide:hover+.menu {
	height: 320px;
	padding-top: 1em;
}

@media only screen and (min-width: 1501px) {
#tituloHabitacion{
    margin: 0% 0 0 45%;
    position: absolute;
}

}

@media only screen and ((min-width: 1201px) and (max-width:1500px)) {
#tituloHabitacion{
    margin:% 0 0 40%;
    position: absolute;
}

#formulario{
    width: 100%;
    padding: 2% 25% 20% 10%;
    margin: 0 0 0 -30%;
}

#formulario2{
    width: 108%;
    margin: 0 0 0 -7%;
    height: 668px;
}

img{
    width: 600px;
    height: 600px;
    border-radius: 0px;
}

}

@media only screen and ((min-width: 992px) and (max-width: 1200px)){
#tituloHabitacion{
    margin:0% 0 0 40%;
    position: absolute;
}

#formulario{
    width: 80%;
    padding: 2% 25% 20% 0%;
    margin: 0 0 0 -20%;
}

#formulario2{
    width: 110%;
    margin: 0 0 0 -12%;
    height: 668px;
}

img{
    width: 500px;
    height: 500px;
    border-radius: 0%;
}


}

@media only screen and (min-width: 768px) and (max-width: 991px) {
#tituloHabitacion{
    margin:0% 0 0 40%;
    position: absolute;
}

#formulario{
    width: 60%;
    padding: 2% 25% 20% 0%;
    margin: 0 0 0 -10%;
}

#formulario2{
    width: 110%;
    margin: 0 0 0 -12%;
    height: 668px;
}

img{
    width: 450px;
    height: 450px;
    border-radius: 0%;
}

}

/* Estilos para pantallas pequeñas */
@media screen and (max-width: 767px) and (min-width: 501px){

#tituloHabitacion{
    margin:0% 0 0 35%;
    position: absolute;
}
#formulario{
    width: 80%;
    padding: 2% 20% 20% 0%;
    margin: 0 0 0 10%;
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

}
@media screen and (max-width: 500px){

#tituloHabitacion{
    margin:0% 0 0 28%;
    position: absolute;
}

#formulario{
    width: 80%;
    padding: 2% 20% 20% 0%;
    margin: 0 5% 0 0%;
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

}

</style>


<body>

	<P id="tituloHabitacion">habitaciones</P>

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
						<form method="POST" action="ModificarHabitacion">
							<label>Num habitacion: <input readonly type="number" id="numero_habitacion" name="numero_habitacion" value="${habitacion.numero_habitacion}" /></label>
							<br>
							<br> 
							<label>Descripcion: <input type="text" id="descripcion" name="descripcion" value="${habitacion.descripcion}" /></label> 
							<br>
							<br> 
							<label>Precio: <input type="text" id="precio" name="precio" value="${habitacion.precio}"/></label>
							<br>
							<br> 
							<label>Id crucero:<input readonly type="number" id="id_crucero" name="id_crucero" value="${habitacion.id_crucero}"/></label> <br>
							<br> 
							<label>Dni cliente: <input type="text" id="dni_cliente" name="dni_cliente" value="${habitacion.dni_cliente}" /></label>
							<br>
							<br>
							<label>Id empleado: <input type="number" id="id_empleado" name="id_empleado" value="${habitacion.id_empleado}" /></label>
							<br>
							<br> 
							<label>Imagen: <input type="text" id="imagen" name="imagen" value="${habitacion.imagen}"/></label>
							<input id="LogIn" type="submit" value="MODIFICAR" />
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
	</nav>

</body>
</html>
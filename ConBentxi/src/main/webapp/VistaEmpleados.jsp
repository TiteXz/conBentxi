<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empleados</title>
</head>

<style>
h1 {
	font-family: 'Amarante', Tahoma, sans-serif;
	font-weight: bold;
	font-size: 3.6em;
	line-height: 1.7em;
	margin-bottom: 10px;
	text-align: center;
}

#keywords {
	margin: 0 auto;
	font-size: 1.2em;
	margin-bottom: 15px;
}

#keywords thead {
	cursor: pointer;
	background: #c9dff0;
}

#keywords thead tr th {
	font-weight: bold;
	padding: 12px 30px;
	padding-left: 42px;
}

#keywords thead tr th span {
	padding-right: 20px;
	background-repeat: no-repeat;
	background-position: 100% 100%;
}

#keywords thead tr th.headerSortUp, #keywords thead tr th.headerSortDown
	{
	background: #acc8dd;
}

#keywords tbody tr {
	color: #555;
}

#keywords tbody tr td {
	text-align: center;
	padding: 15px 10px;
}

a {
	text-decoration: none;
	color: #555;
}

a:hover {
	color: lightblue;
}

#menu {
	display: inline-flex;
	list-style: none;
	margin-left: 38%;
	margin-bottom: 100px;
}

#menu li a {
	position: relative;
	font-weight: bold;
	color: rgb(0, 183, 255);
	margin: 0px 60px;
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

.menuRayas li {
	list-style: none;
	padding: 0.6em 1em;
	background-color: #fff;
}

.menuRayas li a {
	text-decoration: none;
	color: #333;
}

.menuRayas li a:hover {
	color: rgb(32, 32, 226);
}

.open-hide {
	background-color: white;
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
	margin-top: -650px;
	border-radius: 10px;
}

.open-hide:hover {
	cursor: pointer;
}

.menuRayas {
	height: 0px;
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

.menuRayas:hover {
	height: 320px;
	padding-top: 1em;
}

.open-hide:hover+.menuRayas {
	height: 320px;
	padding-top: 1em;
}
</style>

<body>

	<div id="wrapper">

		<div id="logout"> <a href="AbrirLogin">Log out</a></div>

		<ul id="menu">
			<li><a href="AinadirEmple.jsp" title="CREAR">CREAR</a></li>
			<li><a href="Bienvenido.jsp" title="VISTAS">VISTAS</a></li>
		</ul>

		<h1>Empleados</h1>

		<table id="keywords" cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<th><span>id_empleado</span></th>
					<th><span>nombre</span></th>
					<th><span>apellido</span></th>
					<th><span>trabajo</span></th>
					<th><span>id_empleado</span></th>
					<th><span>usuario</span></th>
					<th><span>password</span></th>
					<th><span></span></th>
					<th><span></span></th>
				</tr>
			</thead>
			<tbody>
	  <c:forEach items="${empleados}" var="empleados">
	    <tr>
	      <th scope="row">${empleados.id_empleado}</th>
	      <td>${empleados.nombre}</td>
	      <td>${empleados.apellido}</td>
	      <td>${empleados.trabajo}</td>
	      <td>${empleados.id_crucero}</td>
	      <td>${empleados.usuario}</td>
	      <td>${empleados.password}</td>
	      <td><a class= "eliminar" href="EliminarEmpleado?id_empleado=${empleados.id_empleado}">Eliminar </a> </td>
	      <td><a class= "modificar" href="FormularioEmpleado?id_empleado=${empleados.id_empleado}">Modificar </a> </td>
	    </tr>
	  </c:forEach>
  </tbody>
		</table>
	</div>

	<a class="open-hide">Menu</a>

	<ul class="menuRayas">
		<li><a href="VisualizarActi.jsp">actividad</a></li>
		<li><a href="VisualizarCrucero.jsp">cruceros</a></li>
		<li><a href="VisualizarEmple.jsp">empleados</a></li>
		<li><a href="VisualizarHabita.jsp">habitaciones</a></li>
		<li><a href="VisualizarParada.jsp">paradas</a></li>
		<li><a href="VisualizarPuerto.jsp">puertos</a></li>
		<li><a href="VisualizarRuta.jsp">rutas</a></li>

	</ul>

</body>
</html>
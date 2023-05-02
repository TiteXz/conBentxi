<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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


		<ul id="menu">
			<li><a href="Crear.html" title="CREAR">CREAR</a></li>
			<li><a href="Visualizar.html" title="VISUALIZAR">VISUALIZAR
			</a></li>
		</ul>

		<h1>Actividades</h1>

		<table id="keywords" cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<th><span>id_actividad</span></th>
					<th><span>Nombre</span></th>
					<th><span>Fecha_inicio</span></th>
					<th><span>Fecha_fin</span></th>
					<th><span>Descripción</span></th>
					<th><span>id_empleado</span></th>
					<th><span></span></th>
					<th><span></span></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="linea">15</td>
					<td>02/04/23</td>
					<td>12/05/23</td>
					<td>Alicante</td>
					<td>Grecia</td>
					<td>339.99</td>
					<td><a href="">modificar</a></td>
					<td><a href="">eliminar</a></td>
				</tr>
				<tr>
					<td class="linea">11</td>
					<td>03/04/23</td>
					<td>16/05/23</td>
					<td>Valencia</td>
					<td>Malta</td>
					<td>439.99</td>
				</tr>
				<tr>
					<td class="linea">04</td>
					<td>02/05/23</td>
					<td>12/06/23</td>
					<td>Alicante</td>
					<td>Baleares</td>
					<td>209.99</td>
				</tr>
				<tr>
					<td class="linea">19</td>
					<td>15/04/23</td>
					<td>26/05/23</td>
					<td>Alicante</td>
					<td>Canarias</td>
					<td>137.99</td>
				</tr>
				<tr>
					<td class="linea">01</td>
					<td>02/04/23</td>
					<td>12/05/23</td>
					<td>Alicante</td>
					<td>Sicilia</td>
					<td>271.98</td>
				</tr>
				<tr>
					<td class="linea">24</td>
					<td>02/04/23</td>
					<td>12/05/23</td>
					<td>Valencia</td>
					<td>Córcega</td>
					<td>389.99</td>
				</tr>
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
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

body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-image: url(imgs/beach-sea-water-ocean-person-texture-63881-pxhere.com.jpg);
}

#logout {
    float: left; 
    margin: -9% 0 0 10px;
    position: absolute;
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



#botones {
    display: grid;
    grid-template-columns: repeat(2, 1fr); /* Two columns */
    grid-gap: 20px;
    justify-content: center;
    align-items: center;
    padding: 20px;
    text-align: center;
    margin-top: 10%;
}

button {
    display: block;
    margin: 10px;
    padding: 15px;
    min-width: 150px;
    font-size: 16px;
    font-weight: bold;
    color: #fff;
    background-color: #216eff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: 0.3s ease;
}

button a{
    color: #fff;
    text-decoration: none;
}

button a:hover{
    color: black;
    text-decoration: none;
}

button:hover {
    background-color: #216fffc5;
}


@media only screen and (max-width: 768px) {
    button {
        min-width: 100px;
    }

    #botones {
        grid-template-columns: repeat(1, 1fr); /* One column */
    }
}

@media only screen and (max-width: 480px) {
    button {
        min-width: 80px;
        font-size: 14px;
    }
}


</style>

<body>
	<div id="logout"> <a href="AbrirLogin">Log out</a></div>

<div id="botones">
<button>
  <a href="VerActividades">ACTIVIDADES</a> 
</button>

<button>
  <a href="VerClientes">CLIENTES</a> 
</button>

<button>
  <a href="VerCruceros">CRUCEROS</a>
</button>

<button>
  <a href="VerEmpleados">EMPLEADOS</a> 
</button>

<button>
 <a href="VerRutas">RUTAS</a> 
</button>

<button>
  <a href="VerReservas">RESERVAS</a> 
</button>

<button>
  <a href="VerHabitaciones">HABITACIONES</a> 
</button>

<button>
  <a href="VerParadas"> PARADAS</a>
</button>

<button>
  <a href="VerEstacionamientos">ESTACIONAMIENTOS</a> 
</button>

<button>
 <a href="VerRutasParadas"> RUTAS_PARADAS</a>
</button>

<button>
  <a href="VerCrucerosActividades">CRUCEROS_ACTIVIDADES</a> 
</button>

<button>
  <a href="VerInscripciones">INSCRIPCIONES</a> 
</button>

<button>
  <a href="VerPuertos">PUERTOS</a>
</button>

</div>

</body>
</html>
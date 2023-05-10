<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>

<style>

#datos{
width: 80%;
margin: 25% 0 0 10%;
padding-top: 15%;
padding-bottom: 15%;
background-color: #e7e7e7;
border-radius: 10px;
}


#datosCliente{
  margin-left: 5%;
  margin-bottom: 5%;
  width: 70%;
}

#datosReserva{
  margin-left: 5%;
  width: 70%;
  margin-bottom: 10%;
}

.card{
  margin: 0 0 0 10%;
  width: 80%;
}

.hide-text{
opacity: 0;
transition: ease 0.3s;
}

.hide-text:hover{
opacity: 1;
transform: scaleY(120%);
}

.menu a:hover {
  background-color: #0062ff;
  box-shadow: 0 0 0 5px #1f75ff5f;
  color: #fff;
}

.menu {
  margin-top: -25%;
  width: 100%;
  height: 75px;
  background-color: rgba(255, 255, 255, 0.911);
  position: fixed;
  box-shadow: 4px 0px 4px 0;
  z-index: 100;
  padding-top: 25px;
}

.menu a {
  text-decoration: none;
  color: black;
  opacity: 0.8;
  border: 2px solid rgba(0, 0, 0, 0);
  padding: 5px;
  border-radius: 10px;
  transition: .3s;
}

#a1, #a2, #a3 {
  margin: 10px 0 0 25px;
}

#login {
  border: 2px solid black;
  padding: 5px;
  border-radius: 10px;
  margin: -7px 10px 0 0;
  float: right;
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
  
  .social-icon,
  #menu {
    position: relative;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 10px 0;
    flex-wrap: wrap;
  }
  
  .social-icon__item,
  .menu__item {
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
  
  @keyframes animateWaves {
    0% {
      background-position-x: 1000px;
    }
    100% {
      background-positon-x: 0px;
    }
  }
  
  @keyframes animate {
    0% {
      background-position-x: -1000px;
    }
    100% {
      background-positon-x: 0px;
    }
  }

  @media only screen and (min-width: 1501px) {

    #datos{
      display: flex;
      width: 60%;
      margin:10% 0 0 20%;
      padding-top: 5%;
      padding-bottom: 5%;
    }

    #datosReserva{
      width: 30%;
    }

    #datosCliente{
      width: 30%;
    }
    .menu{
      margin: -10% 0 0 0;
    }
      #datosReserva{
    display: inline-block;
    margin: 0 0 0 0;
    }
    
    .card{
      display:inline-flex;
      margin: 0 5% 0 0;
      width: 40%;
    }

}

@media only screen and ((min-width: 1201px) and (max-width:1500px)) {
  #datos{
    display: flex;
    margin-top: 15%;
    padding-top: 5%;
    padding-bottom: 5%;
  }

  .menu{
    margin-top: -15%;
  }
    #datosReserva{
  display: inline-block;
  width: 30%;
  margin: 0 0 0 0;
  }
  
  #datosCliente{
    display: inline-block;
    width: 30%;
    margin: 0 0 0 5%;
    }
  
  .card{
    display:inline-flex;
    margin: 0 5% 0 -5%;
    width: 40%;
  }

}

@media only screen and ((min-width: 992px) and (max-width: 1200px)) {
 
  #datos{
    display: flex;
    margin-top: 15%;
    padding-top: 5%;
    padding-bottom: 5%;
  }

  .menu{
    margin-top: -15%;
  }
    #datosReserva{
  display: inline-block;
  width: 30%;
  margin: 0 0 0 0;
  }
  
  #datosCliente{
    display: inline-block;
    width: 30%;
    margin: 0 0 0 5%;
    }
  
  .card{
    display:inline-flex;
    margin: 0 5% 0 -5%;
    width: 40%;
  }
}

@media only screen and (min-width: 768px) and (max-width: 991px) {

  #datos{
    display: flex;
    margin-top: 15%;
    padding-top: 5%;
    padding-bottom: 5%;
  }

  .menu{
    margin-top: -15%;
  }
    #datosReserva{
  display: inline-block;
  width: 30%;
  margin: 0 0 0 0;
  }
  
  #datosCliente{
    display: inline-block;
    width: 30%;
    margin: 0 0 0 5%;
    }
  
  .card{
    display:inline-flex;
    margin: 0 5% 0 -5%;
    width: 40%;
  }
  
}

/* Estilos para pantallas pequeñas */
@media screen and (max-width: 767px) {
  #a1 {
    margin-left: 25px;
  }

  #a2 {
    margin-left: 25px;
  }

  #a3 {
    margin-left: 25px;
  }

  #login {
    margin-left: 25px;
  }

  

}
</style>

<body>

<div class="menu">
        <a id="a1" href="Home">HOME</a>
        <a id="a2" href="Cruceros.jsp">CRUCEROS</a>
        <a id="a3" href="BuscadorDestino?destino=todas">RUTAS</a>
        <a id="login" href="FormLogin.jsp">LOG IN</a>
    </div>

    <section id="datos">
        <div id="datosCliente">
            <form method="get" action="HacerReserva">
                <div class="form-group col-md-6">
                    <label for="inputDni">Dni</label>
                    <input type="text" class="form-control" id="dniCliente" placeholder="12345678A">
                </div>

                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="inputNombre">Nombre</label>
                        <input type="text" class="form-control" id="nombreCliente" placeholder="Nombre">
                    </div>
                    <div class="form-group col-md-10">
                        <label for="inputApellidos">Apellidos</label>
                        <input type="text" class="form-control" id="apellidosCliente" placeholder="Apellidos">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-10">
                        <label for="inputTarjeta">Tarjeta de credito</label>
                        <input type="text" class="form-control" id="inputTarjeta">
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="mas18">
                        <label class="form-check-label" for="gridCheck">
                            +18
                        </label>
                    </div>
                </div>
                <br>
                <button type="submit" class="btn btn-primary">Reservar</button>
            </form>
        </div>

       <div id="datosReserva">
    
        <form>
            <fieldset>
                <div class="form-group col-md-7">
                    <label for="inputDni">Destino</label>
                    <input readonly type="text" class="form-control" id="Destino_ruta" placeholder="${ruta.destino}">
                </div>

                <div class="form-row">
                    <div class="form-group col-md-7">
                        <label for="inputNombre">Origen</label>
                        <input readonly type="text" class="form-control" id="Origen_ruta" placeholder="${ruta.origen}">
                    </div>
                </div>
                <div class="form-group col-md-7">
                	<label for="inputApellidos">Crucero</label>
                    <input readonly type="text" class="form-control" id="NombreCrucero" placeholder="${crucero.nombre}">
                </div>

                <div class="form-group col-md-7">
                    <label for="inputState">Habitacion</label>
                    <select id="inputState" class="form-control">
                        <c:forEach items="${habitaciones}" var="habitacion">
                            <option>${habitacion.precio}</option>
                        </c:forEach>
                    </select>
                </div>
            </fieldset>
        </form>
    
</div>


        <div class="card" style="width: 18rem;">
            <img class="card-img-top"
                src="https://www.crucerosmediterraneo.com/descubre/wp-content/uploads/Como-son-los-camarotes-de-un-crucero-1024x687.jpg"
                alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">399.99</h5>
                <p class="card-text">Suit barata.
                    <p class="hide-text">Es la suit más barata pero es exquisita,
                        ya que solo ofrecemos habitaciones de calidad.
                    </p>
                </p>
            </div>
        </div>

    </section>

    <br><br><br>
    
    <footer class="footer">
        <div class="waves">
          <div class="wave" id="wave1"></div>
          <div class="wave" id="wave2"></div>
          <div class="wave" id="wave3"></div>
          <div class="wave" id="wave4"></div>
        </div>
        <ul class="social-icon">
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <ion-icon name="logo-facebook"></ion-icon>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <ion-icon name="logo-twitter"></ion-icon>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <ion-icon name="logo-linkedin"></ion-icon>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <ion-icon name="logo-instagram"></ion-icon>
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
      <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
      <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>


</body>
</html>
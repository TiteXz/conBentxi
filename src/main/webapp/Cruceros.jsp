<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>

.card-img-overlay{
opacity: 0;
}

.card-img-overlay:hover{
opacity: 1;
background: rgba(0, 195, 255, 0.87);
transition: ease .5s;
cursor:grab;
}

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

.card {
    height: 451px;
    width: 600px;
    margin-left: 225px;
}


#row {
    display: inline-flex;
}

.card-text{
    margin: 40% 0 0 10%;
    color: black;
    font-family: 'Courier new';
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

h2{
    font-family: 'Courier new';
    text-align: center;
    font-size: 40px;
}

@media only screen and (min-width: 1501px) {

    .card{
        width: 20%;
        height: 15%;
        display: inline-flex;
        margin: 5% 0 0 20%;
    }

    #row{
        display: inline-flex;
    }

}

@media only screen and ((min-width: 1201px) and (max-width:1500px)) {

    .card{
        width: 35%;
        height: 25%;
        display: inline-flex;
        margin: 5% 0 0 10%;
    }

    #row{
        display: inline-flex;
    }

}

@media only screen and ((min-width: 992px) and (max-width: 1200px)) {

    .card{
        width: 35%;
        height: 25%;
        display: inline-flex;
        margin: 5% 0 0 10%;
    }

    #row{
        display: inline-flex;
    }


}

@media only screen and (min-width: 768px) and (max-width: 991px) {

    .card{
        width: 42%;
        height: 45%;
        display: inline-flex;
        margin: 5% 0 0 5%;
    }

    #row{
        display: inline-flex;
    }
}

/* Estilos para pantallas pequeñas */
@media screen and (max-width: 767px) {
    
    #login {
        margin-left: 25px;
    }

    .card{
        width: 80%;
        height: 35%;
        display: inline-block;
        margin: 5% 0 0 10%;
    }

    #row{
        display: inline-block;
    }


}

</style>

<body>

<body>

    <div class="menu">
        <a id="a1" href="Home">HOME</a>
        <a id="a2" href="VerCrucerosClientes">CRUCEROS</a>
        <a id="a3" href="BuscadorDestino?destino=todas">RUTAS</a>
        <a id="login" href="FormLogin.jsp">LOG IN</a>
    </div>

    <br><br><br><br><br>

    
    <video width="100%" height="auto" autoplay loop muted>
        <source src="imgs/Conoce MSC Seashore.mp4" type="video/mp4">
    </video>

    <br><br><br><br><br><br>

    <h2>Selecciona tu crucero</h2>

    <br><br><br><br><br><br>
    
    
    <c:forEach items="${cruceros}" var="crucero">
    
        <div class="card bg-dark text-white">
           <img src="${crucero.imagen}"
                class="card-img" >
                <a href="BuscadorId?id_ruta=${crucero.id_ruta}"><div class="card-img-overlay">
                <h4 class="card-text">${crucero.nombre}</h4>
            </div></a>
        </div>
 </c:forEach>

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
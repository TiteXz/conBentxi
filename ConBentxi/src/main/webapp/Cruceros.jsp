<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>

body {
    background-color: #eee;
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
    box-shadow: 4px 0px 4px 0;
    z-index: 100;
    padding-top: 25px;
}

.menu a {
    text-decoration: none;
    color: black;
    opacity: 0.8;
}

#a1 {
    margin-left: 1450px;
    margin-top: 15px;
}

#a2 {
    margin-left: 50px;
    margin-top: 15px;
}

#a3 {
    margin-left: 50px;
    margin-top: 15px;
}

#login {
    margin-left: 50px;
    border: 2px solid black;
    padding: 5px;
    border-radius: 10px;
    margin-top: 15px;
}

.card {
    height: 451px;
    width: 600px;
    margin-left: 225px;
}

#row {
    display: inline-flex;
}

.card-img-overlay{
	opacity:0;
}

.card-img-overlay:hover{
	opacity:1;
	background-color:rgba(0, 102, 255, 0.329);
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

</style>

<body>

<div class="menu">
        <a id="a1" href="Home.jsp">HOME</a>
        <a id="a2" href="Cruceros.jsp">CRUCEROS</a>
        <a id="a3" href="Rutas.jsp">RUTAS</a>
        <a id="login" href="FormLogin.jsp">LOG IN</a>
    </div>

    <br><br><br><br><br>

    <div id="row">
        <div class="card bg-dark text-white">
            <img src="https://www.disfrutandosingluten.es/wp-content/uploads/2020/02/Un-crucero-en-familia.jpg"
                class="card-img" alt="...">
            <div class="card-img-overlay">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
                    content. This content is a little bit longer.</p>
                <p class="card-text">Last updated 3 mins ago</p>
                <a href="#" class="btn btn-primary">Ver Rutas</a>
            </div>
        </div>

        <div class="card bg-dark text-white">
            <img src="https://www.valemany.com/blog/wp-content/uploads/theworld.jpg" class="card-img" alt="">
            <div class="card-img-overlay">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
                    content. This content is a little bit longer.</p>
                <p class="card-text">Last updated 3 mins ago</p>
                <a href="#" class="btn btn-primary">Ver Rutas</a>
            </div>
        </div>
    </div>

    <br><br><br>

    <div id="row">
        <div class="card bg-dark text-white">
            <img src="https://www.porttarragona.cat/images/Port_Ciutat/Ciutat_creuers/cruceros2.jpg" class="card-img"
                alt="...">
            <div class="card-img-overlay">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
                    content. This content is a little bit longer.</p>
                <p class="card-text">Last updated 3 mins ago</p>
                <a href="#" class="btn btn-primary">Ver Rutas</a>
            </div>
        </div>

        <div class="card bg-dark text-white">
            <img src="https://www.thenewbarcelonapost.com/wp-content/uploads/2021/06/MSC-grandiosa-1-1170x877.jpg"
                class="card-img" alt="...">
            <div class="card-img-overlay">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
                    content. This content is a little bit longer.</p>
                <p class="card-text">Last updated 3 mins ago</p>
                <a href="#" class="btn btn-primary">Ver Rutas</a>
            </div>
        </div>
    </div>

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
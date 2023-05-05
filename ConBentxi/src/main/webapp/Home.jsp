<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<title>Home</title>
</head>

<style>

body {
    background-color: #eee;
}


section {
    display: flex;
    width: 80%;
    height: 630px;
    margin-left: 200px;
    border-radius: 10px;
    margin-top: 200px;
    z-index: 50;
}

section img {
    width: 0px;
    flex-grow: 1;
    object-fit: cover;
    opacity: .8;
    transition: 1.5s ease;
    filter: grayscale(100%);
}

section img:hover {
    cursor: crosshair;
    width: 500px;
    opacity: 1;
    filter: contrast(140%);
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
    padding-top: 25px;
    margin-top: -200px;
    z-index: 100;
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

#parte2 {
    height: 600px;
    width: 100%;
    background-color: #2289ff;
    background-image: url(imgs/beach-sea-water-ocean-person-texture-63881-pxhere.com.jpg);
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    height: 600px;
}

#texto {
    text-align: justify;
    padding: 5% 0 5% 10%;
    display: inline-flex;
    float: left;
    width: 60%;
    color: white;
}

#imgAbajo {
    height: 300px;
    width: 450px;
    display: inline-flex;
    margin: 5% 10% 0 0;
    float: right;
    border-radius: 500px;
}

#parte1 {
    background-color: #2289ff;
    width: 100%;
    height: 600px;
    margin: 200px 0 0 0;
    border-radius: 0%;
    background-image: url(imgs/beach-sea-water-ocean-person-texture-63881-pxhere.com.jpg);
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    height: 600px;
    color: white;
}

#cuerpo {
    width: 60%;
    height: 600px;
    display: flex;
    text-align: justify;
    margin: -10% 0 0 30%;
}

#imgArriba {
    height: 250px;
    width: 350px;
    margin: 10% 0 0 10%;
    display: inline-flex;
    border-radius: 500px;
}



@media only screen and (min-width: 1501px) {

    #parte1 {
        width: 100%;
    }

    #parte2 {
        width: 100%;
    }

    #cuerpo {
        width: 50%;
        display: inline-flex;
        text-align: justify;
        margin: -20% 10% 0 5%;
        float: right;
    }

    #texto {
        width: 50%;
        display: inline-flex;
        text-align: justify;
        margin: 0% 0 0 5%;
        float: left;
    }

    #imgArriba {
        width: 25%;
        display: inline-flex;
        margin: 7% 0% 10% 5%;

    }

    #imgAbajo {
        width: 25%;
        display: inline-flex;
        margin: 5% 10% 0 0;
    }

    #parte1 {
        height: 500px;
    }

    #parte2 {
        height: 800px;
    }

    section {
        margin: 100px 0 25px 10%;
        width: 80%;
    }

    section img:hover {
        width: 70%;
    }

}

@media only screen and ((min-width: 1201px) and (max-width:1500px)) {

    #parte1 {
        width: 100%;
    }

    #parte2 {
        width: 100%;
    }

    #cuerpo {
        width: 50%;
        display: inline-flex;
        text-align: justify;
        margin: -28% 10% 0 5%;
        float: right;
    }

    #texto {
        width: 50%;
        display: inline-flex;
        text-align: justify;
        margin: 0% 0 0 5%;
        float: left;
    }

    #imgArriba {
        width: 25%;
        display: inline-flex;
        margin: 10% 0% 10% 5%;

    }

    #imgAbajo {
        width: 25%;
        display: inline-flex;
        margin: 5% 10% 0 0;
    }

    #parte1 {
        height: 500px;
    }

    #parte2 {
        height: 800px;
    }

    section {
        margin: 100px 0 25px 10%;
        width: 80%;
    }

    section img:hover {
        width: 70%;
    }

}

@media only screen and ((min-width: 992px) and (max-width: 1200px)) {

    #parte1 {
        width: 100%;
    }

    #parte2 {
        width: 100%;
    }

    #cuerpo {
        width: 80%;
        display: inline-flex;
        text-align: justify;
        margin-left: 10%;
    }

    #texto {
        width: 80%;
        display: inline-flex;
        text-align: justify;
        margin: 10% 0 0 5%;
    }

    #imgArriba {
        width: 50%;
        display: inline-flex;
        margin: 10% 0% 10% 25%;

    }

    #imgAbajo {
        width: 60%;
        display: inline-flex;
        margin: 5% 20% 0 0;
    }

    #parte1 {
        height: 800px;
    }

    #parte2 {
        height: 1200px;
    }

    section {
        margin: 100px 0 25px 10%;
        width: 80%;
    }

    section img:hover {
        width: 100%;
    }

}

@media only screen and (min-width: 768px) and (max-width: 991px) {

    #parte1 {
        width: 100%;
        height: 700px;
    }

    #parte2 {
        width: 100%;
        height: 1200px;
    }

    #cuerpo {
        width: 80%;
        display: inline-block;
        text-align: justify;
        margin-left: 10%;
    }

    #texto {
        width: 80%;
        display: inline-block;
        text-align: justify;
        margin: 10% 0 0 5%;
    }

    #imgArriba {
        width: 50%;
        display: inline-block;
        margin: 10% 0% 20% 25%;

    }

    #imgAbajo {
        width: 60%;
        display: inline-block;
        margin: 10% 20% 0 0;
    }

    section {
        margin: 100px 0 25px 10%;
        width: 80%;
    }

    section img:hover {
        width: 100%;
    }

}

/* Estilos para pantallas pequeñas */
@media screen and (max-width: 767px) {

    #login {
        margin-left: 25px;
    }

    #parte1 {
        width: 100%;
    }

    #parte2 {
        width: 100%;
    }

    #cuerpo {
        width: 80%;
        display: inline-block;
        text-align: justify;
        margin-left: 10%;
    }

    #texto {
        width: 80%;
        display: inline-block;
        text-align: justify;
        margin: 10% 0 0 5%;
    }

    #imgArriba {
        width: 80%;
        display: inline-block;
        margin: 10% 0% 20% 10%;

    }

    #imgAbajo {
        width: 80%;
        display: inline-block;
    }

    #parte1 {
        height: 800px;
    }

    #parte2 {
        height: 1700px;
    }

    section {
        margin: 100px 0 25px 0;
        width: 100%;
    }

    section img:hover {
        width: 100%;
    }

}

</style>

<body>


	 <div class="menu">
    <a id="a1" href="Home.jsp">HOME</a>
    <a id="a2" href="VerCrucerosClientes">CRUCEROS</a>
    <a id="a3" href="Rutas.jsp">RUTAS</a>
    <a id="login" href="LogIn.jsp">LOG IN</a>
  </div>

  <div id="parte1">
    <div>
      <img id="imgArriba"
        src="https://p4.wallpaperbetter.com/wallpaper/141/908/896/cruise-ship-4k-new-image-wallpaper-preview.jpg"
        alt="">
    </div>
    <div id="cuerpo">
      <p>3z Team es una empresa de cruceros que ofrece una experiencia única e inolvidable para sus clientes. Con una
        amplia variedad de destinos exóticos y emocionantes, 3z Team es la opción perfecta para aquellos que buscan una
        aventura en alta mar.

        El equipo de 3z Team está formado por expertos en la industria de los cruceros, que trabajan incansablemente
        para asegurar que sus clientes disfruten de un servicio excepcional y una atención personalizada. Desde el
        momento en que se aborda uno de sus lujosos barcos hasta el momento en que se baja en el puerto de destino, los
        pasajeros son mimados con una amplia gama de opciones de entretenimiento, actividades y deliciosos menús.</p>
    </div>
  </div>

  <section>
    <img src="https://www.disfrutandosingluten.es/wp-content/uploads/2020/02/Un-crucero-en-familia.jpg" alt="">
    <img src="https://www.valemany.com/blog/wp-content/uploads/theworld.jpg" alt="">
    <img src="https://www.porttarragona.cat/images/Port_Ciutat/Ciutat_creuers/cruceros2.jpg" alt="">
    <img src="https://www.thenewbarcelonapost.com/wp-content/uploads/2021/06/MSC-grandiosa-1-1170x877.jpg" alt="">
    <img src="https://www.puertoalicante.com/wp-content/uploads/2021/12/MSC-Orchestra_Aerial_lr.jpg" alt="">
    <img
      src=https://images.ecestaticos.com/Dd6LyKj46ZKKd8JWEHrwtb_yQoI=/0x0:2000x1325/1200x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2Fcd0%2F997%2Fb0d%2Fcd0997b0db47bb07a3b32b6230d25bce.jpg
      alt="">
  </section>

  <br><br><br>


  <div id="parte2">
    <div id="texto">
      <a>Mi nombre es Iker Zamorano y soy el fundador de 3z Team, una empresa de cruceros líder en la industria del
        turismo. Permítanme compartirles la historia de cómo fundé esta empresa.

        Comencé mi carrera en el sector turístico como agente de viajes y trabajé en varias empresas de la industria
        antes de darme cuenta de que había una oportunidad de hacer algo diferente y especial. Me di cuenta de que
        muchos de los cruceros existentes en el mercado no ofrecían la experiencia única que muchos turistas buscaban.

        Con mi visión clara de lo que quería ofrecer, fundé 3z Team con el objetivo de proporcionar una experiencia de
        crucero inolvidable y única. Desde el principio, nos enfocamos en brindar un servicio de alta calidad a nuestros
        clientes, ofreciendo itinerarios personalizados, instalaciones modernas y una atención excepcional al cliente.

        A medida que la empresa crecía, me aseguré de mantener los valores que habían sido fundamentales desde el
        inicio: la pasión por el servicio al cliente, la innovación constante y el compromiso con la excelencia en todo
        lo que hacemos. Como resultado, hoy en día, 3z Team es una empresa de cruceros respetada y admirada en todo el
        mundo.

        Estoy orgulloso de lo que hemos logrado hasta ahora y no puedo esperar para ver lo que nos depara el futuro.
        Continuaremos trabajando para ofrecer la mejor experiencia de crucero posible y seguir siendo líderes en la
        industria del turismo. Gracias por su apoyo continuo. ¡Nos vemos en el mar!
    </div>
    <div>
      <img id="imgAbajo"
        src="https://images.pexels.com/photos/69122/ferry-boat-ferry-ship-boat-69122.jpeg?cs=srgb&dl=pexels-pixabay-69122.jpg&fm=jpg"
        alt="">
    </div>
  </div>

  <br><br><br>




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
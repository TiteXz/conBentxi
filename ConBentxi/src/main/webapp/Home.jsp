<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>Home</title>
</head>

<style>

body {
    background-color: #eee;
}


section {
    display: flex;
    width: 1500px;
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
    transition: 2s ease;
    filter: grayscale(100%);
}

section img:hover {
    cursor: crosshair;
    width: 500px;
    opacity: 1;
    filter: contrast(140%);
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

.footer {
    position: relative;
    width: 100%;
    background: #3586ff;/*cambiar*/
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

#texto {
    text-align: center;
}

#texto a {
    justify-content: center;
}

</style>

<body>


        <div class="menu">
            <a id="a1" href="Home.jsp">HOME</a>
            <a id="a2" href="Cruceros.jsp">CRUCEROS</a>
            <a id="a3" href="Rutas.jsp">RUTAS</a>
            <a id="login" href="FormLogin.jsp">LOG IN</a>
        </div>


    <section>
        <img src="https://www.disfrutandosingluten.es/wp-content/uploads/2020/02/Un-crucero-en-familia.jpg" alt="">
        <img src="https://www.valemany.com/blog/wp-content/uploads/theworld.jpg" alt="">
        <img src="https://www.porttarragona.cat/images/Port_Ciutat/Ciutat_creuers/cruceros2.jpg" alt="">
        <img src="https://www.thenewbarcelonapost.com/wp-content/uploads/2021/06/MSC-grandiosa-1-1170x877.jpg" alt="">
        <img src="https://www.puertoalicante.com/wp-content/uploads/2021/12/MSC-Orchestra_Aerial_lr.jpg" alt="">
        <img src=https://images.ecestaticos.com/Dd6LyKj46ZKKd8JWEHrwtb_yQoI=/0x0:2000x1325/1200x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2Fcd0%2F997%2Fb0d%2Fcd0997b0db47bb07a3b32b6230d25bce.jpg
            alt="">
    </section>

<br><br><br>

<div id="texto">
<a>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Veritatis, maiores porro aliquam autem dignissimos necessitatibus cum, enim assumenda cumque nihil rerum in voluptatem sunt tenetur impedit vitae ipsa quia consectetur.
Nisi harum provident placeat animi veritatis atque eveniet deleniti quia neque cupiditate, quaerat culpa architecto. Alias doloribus laudantium et eum? Hic explicabo, itaque nihil iste nisi porro quis quibusdam facere?
Est beatae, expedita nulla qui maiores, dolores debitis totam ad similique molestiae, neque possimus libero deleniti distinctio temporibus sapiente nihil quas. Magni quibusdam asperiores adipisci, sunt minus voluptatum consectetur repudiandae!
Voluptate tempore ipsum officia nam, nisi voluptates vero minima consequuntur saepe totam nobis nemo suscipit. Quae nostrum veniam qui. Aspernatur, natus iste. Minima quae facilis dolorum cum laudantium accusamus ipsam.
Enim similique cumque pariatur culpa expedita assumenda, maiores amet ad suscipit! Explicabo alias provident, culpa nesciunt odio consequuntur suscipit, expedita quisquam nihil asperiores numquam soluta totam sequi minus, at aperiam.
Perferendis eveniet corrupti dolore deserunt molestias, facere laborum? Nihil debitis animi quo nemo, natus porro eum culpa ipsum commodi magni esse, non, aperiam eligendi. Accusamus veniam velit quo iste possimus.
Nisi, laudantium ea. Sunt assumenda vero suscipit sapiente quisquam, nam eos, corrupti molestiae dignissimos quod ipsam maxime consequatur voluptate eaque expedita, qui numquam reprehenderit cumque quis delectus adipisci quasi! Ea?
Commodi sapiente, at alias vitae delectus molestiae minima impedit quis perspiciatis consequuntur a ea repudiandae consequatur sint necessitatibus similique unde natus illum aliquid deleniti ex? Eum hic nihil fugit temporibus!
Repudiandae repellat veritatis itaque culpa at. Unde ex est voluptatum maxime assumenda cupiditate, officia neque nulla deserunt pariatur officiis, modi libero, maiores beatae magnam recusandae dicta autem necessitatibus itaque nisi?
Fugiat sed voluptate voluptatibus iusto similique tenetur! Ex dolorum autem doloremque minima ipsum provident? Voluptates mollitia, doloribus adipisci, odio quos dolorum, dolor accusantium repudiandae eveniet laudantium minima fugit est! Consequuntur.
Amet autem velit, impedit eius odit consequatur, libero optio nemo blanditiis sequi deserunt recusandae dolorum. Exercitationem nobis, quibusdam distinctio, ea aliquid porro voluptatibus, unde nesciunt accusamus molestias optio explicabo voluptatem?
Enim debitis, nulla dolor praesentium tempore voluptates. Quos consequatur ratione, accusantium laboriosam est necessitatibus debitis magnam tenetur, numquam quidem id! Vitae facere porro tempore a aspernatur sapiente dignissimos doloribus sit?
Eveniet aliquam ipsa explicabo repellendus alias cumque labore consequuntur fugit veritatis dicta corporis inventore odio illo quaerat facere, tempora doloribus tempore iste temporibus ducimus quod eligendi id perferendis? Vero, omnis.
Architecto nihil eum illum recusandae consectetur deserunt doloribus ut neque quia quo eos accusamus inventore pariatur rerum totam, expedita nisi aperiam doloremque, rem odio provident ullam laboriosam! Optio, quis provident.
Consequatur ut quo quos fugit eaque sunt, iure fuga dicta, consequuntur labore at id quia harum earum. Vitae incidunt laboriosam recusandae expedita, nostrum soluta, unde, nihil temporibus iure eveniet quae.
Minima aperiam unde, praesentium in autem hic amet provident eveniet. Odio, rem aperiam? Sint expedita minus porro, libero pariatur voluptates mollitia aliquid explicabo modi asperiores fuga dignissimos ipsa dolorum deserunt.
Optio facere tempore culpa deserunt magni maxime eveniet veritatis incidunt itaque nemo iure at, expedita quasi tempora vitae quae corporis. Laudantium eius a nobis saepe molestias qui explicabo voluptatem corrupti.
Amet, eum aperiam consequatur minima aut omnis deleniti placeat nulla repellendus sed fugit exercitationem fugiat sit accusantium totam soluta necessitatibus blanditiis nihil facere autem itaque rerum perferendis! Et, ex hic.
Dolor quisquam vitae nobis neque amet. Quisquam, quibusdam adipisci illum eveniet explicabo alias culpa suscipit debitis iure aliquam nulla tempora veritatis in fuga nisi aperiam saepe tempore omnis eligendi quod.
Itaque placeat ratione harum sunt voluptas, dolore quos odit quis nulla, doloribus dolor, atque nisi? Vitae ea aliquam consequuntur hic voluptatum fuga quas, perspiciatis, nobis laborum et iure, aliquid suscipit.</a>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

<style> 

section{
    display: flex;
    width: 1200px;
    height: 630px;
}

section img{
    width: 0px;
    flex-grow: 1;
    object-fit: cover;
    opacity: .8;
    transition: 3s ease;
}

section img:hover{
    cursor: crosshair;
    width: 300px;
    opacity: 1;
    filter: contrast(140%);
}
</style>

</head>

<body>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Capitan</th>
      <th scope="col">Categoria</th>
      <th scope="col">Id_ruta</th>
    </tr>
  </thead>
  
  <tbody>
  <c:forEach items="${cruceros}" var="crucero">
    <tr>
      <th scope="row">${crucero.id_crucero}</th>
      <td>${crucero.nombre}</td>
      <td>${crucero.capitan}</td>
      <td>${crucero.categoria}</td>
      <td>${crucero.ruta}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<section>
<img src="https://www.disfrutandosingluten.es/wp-content/uploads/2020/02/Un-crucero-en-familia.jpg" alt="">
<img src="https://www.valemany.com/blog/wp-content/uploads/theworld.jpg" alt="">
<img src="https://www.porttarragona.cat/images/Port_Ciutat/Ciutat_creuers/cruceros2.jpg" alt="">
<img src="https://www.thenewbarcelonapost.com/wp-content/uploads/2021/06/MSC-grandiosa-1-1170x877.jpg" alt="">
<img src="https://www.puertoalicante.com/wp-content/uploads/2021/12/MSC-Orchestra_Aerial_lr.jpg" alt="">
</section>


</body>
</html>
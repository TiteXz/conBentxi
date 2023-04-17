<%@ page import= "clases.Crucero" %>
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
    width: 1500px;
    height: 630px;
    margin-left:200px;
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
    width: 500px;
    opacity: 1;
    filter: contrast(140%);
}
a{
opacity:0.8;
}
a:hover{
opacity:1;
}
</style>

</head>

<body>

<c:forEach items="${cruceros}" var="crucero">
<section>
<img src="https://www.disfrutandosingluten.es/wp-content/uploads/2020/02/Un-crucero-en-familia.jpg" alt="">
<img src="https://www.valemany.com/blog/wp-content/uploads/theworld.jpg" alt="">
<img src="https://www.porttarragona.cat/images/Port_Ciutat/Ciutat_creuers/cruceros2.jpg" alt="">
<img src="https://www.thenewbarcelonapost.com/wp-content/uploads/2021/06/MSC-grandiosa-1-1170x877.jpg" alt="">
<img src="https://www.puertoalicante.com/wp-content/uploads/2021/12/MSC-Orchestra_Aerial_lr.jpg" alt="">
<img src=https://images.ecestaticos.com/Dd6LyKj46ZKKd8JWEHrwtb_yQoI=/0x0:2000x1325/1200x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2Fcd0%2F997%2Fb0d%2Fcd0997b0db47bb07a3b32b6230d25bce.jpg alt="">

 		<a>${crucero.id_crucero}</a>
      	<a>${crucero.nombre}</a>
		<a>${crucero.capitan}</a>
     	<a>${crucero.categoria}</a>
      	<a>${crucero.id_ruta}</a>

</section>
</c:forEach>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../navbar.jsp" %>
<title>Liste classe</title>
</head>
<body class="bg-warning text-dark">
<p> </p>
<div class="row justify-content-center">
<div class="card bg-light mb-12 text-center" >
 <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom Classe</th>
      <th scope="col">Nombre d'élève</th>
      <th scope="col">Modifier</th>
      <th scope="col">Supprimer</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>CP</td>
      <td>23</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>CM1</td>
      <td>33</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>

  </tbody>
</table>
<button href="#" type="button" class="btn btn-info">Créer une classe <img src="https://img.icons8.com/fluent-systems-filled/24/000000/plus.png"/></button>
</div>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../navbar.jsp" %>

<meta charset="UTF-8">
<title>Liste Eleve</title>
</head>
<body class="bg-warning text-dark">
<div class="row justify-content-center">
<div class="card bg-light mb-12 text-center" >
 <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      <th scope="col">Modifier</th>
      <th scope="col">Supprimer</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Dupont</td>
      <td>Tom</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Toto</td>
      <td>Clara</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>

  </tbody>
</table>
<button href="#" type="button" class="btn btn-info">Créer un élève <img src="https://img.icons8.com/fluent-systems-filled/24/000000/plus.png"/></button>
</div>
</div>

</body>
</html>
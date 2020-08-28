<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../navbar.jsp" %>
<title>Liste Personne</title>
</head>
<body class="bg-warning text-dark">
<p> </p>
<div class="row justify-content-center">
<div class="card bg-light mb-12 text-center" >
<button  onclick="window.location.href='AjoutClasse'" type="button" class="btn btn-info">Créer une personne <img src="https://img.icons8.com/fluent-systems-filled/24/000000/plus.png"/></button>

 <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Classe</th>
      <th scope="col">Consulter</th>      
      <th scope="col">Modifier</th>
      <th scope="col">Supprimer</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>toto</td>
      <td>titi</td>
      <td>CP</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/ios-glyphs/30/000000/quill-pen.png"/></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>TUTU</td>
      <td>titi</td>
      <td>CM1</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
            <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/ios-glyphs/30/000000/quill-pen.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>

  </tbody>
</table>
</div>
</div>

</body>
</html>
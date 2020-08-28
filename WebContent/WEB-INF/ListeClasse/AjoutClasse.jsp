<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../navbar.jsp" %>

<meta charset="ISO-8859-1">
<title>Ajout Classe</title>
</head>
<body class="bg-warning text-dark">
<br/>
<div class="row justify-content-center">
<div class="card bg-light mb-12  px-md-5 py-md-5" >
<div><h2>Ajout Classe</h2>
</div>
<br/>
<hr>

<form action="AjoutClasse" method="post">
  <div class="row justify-content-center">
    <div class="col">
        <label for="txtNomClasse">Nom de la classe :</label>
      <input id="txtNomClasse" name="txtNomClasse" type="text" class="form-control" placeholder="Nom de la classe">
      <br/>
    </div>
  </div>
  <div class="row justify-content-center">
    <div class="col">
    <div class="text-center">
    
      <button onclick="window.location.href='ListeClasse'" type="button" class="btn btn-outline-warning">Annuler</button>
    
  <button type="submit" class="btn btn-primary">Enregistrer</button> 
     </div></div>
    
  </div>
  <br/>
   <%
String  resultatPost = (String) request.getAttribute( "resultatPost" );
%>
<%= resultatPost %>
</form>
</div>
</div>

</body>
</html>
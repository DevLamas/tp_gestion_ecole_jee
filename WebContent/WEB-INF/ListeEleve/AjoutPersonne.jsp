<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../navbar.jsp" %>

<meta charset="ISO-8859-1">
<title>Ajout Personne</title>
</head>
<body class="bg-warning text-dark">
<br/>
<div class="row justify-content-center">
<div class="card bg-light mb-12  px-md-5 py-md-5" >
<div><h2>Ajout Personne</h2>
</div>
<br/>
<hr>

<form>
  <div class="row justify-content-center">
    <div class="col">
        <label for="NomClasse">Nom :</label>
      <input id="Nom"  type="text" class="form-control" placeholder="Nom">
      <br/>
      <label for="NomClasse">Prénom :</label>
      <input id="Prenom"  type="text" class="form-control" placeholder="Prénom">
      <br/>
      <label for="NomClasse">Email :</label>
      <input id="Email"  type="text" class="form-control" placeholder="Email">
      <br/>
      <label for="NomClasse">Mot de passe :</label>
      <input id="Mdp"  type="text" class="form-control" placeholder="Mot de passe">
      <br/>
    </div>
    
  </div>
  <div class="row justify-content-center">
    <div class="col">
    <div class="text-center">
    
      <button onclick="window.location.href='ListeClasse'" type="button" class="btn btn-outline-warning">Annuler</button>
    
  <button type="submit" class="btn btn-primary">Enregistrer</button>    </div></div>
  </div>
</form>
</div>
</div>

</body>
</html>
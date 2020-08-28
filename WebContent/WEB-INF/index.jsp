<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../WEB-INF/navbar.jsp" %>
<meta charset="UTF-8">
<title>Acceuil</title>
</head>
<body class="bg-warning text-dark">
<div class="container h-100">
    <div class="row align-self-center mt-5">
        <button onclick="window.location.href='ListeEleve'" type="button" class="btn btn-secondary mr-5">Liste des élèves</button>
        <button onclick="window.location.href='ListeProfesseur'" type="button" class="btn btn-secondary mr-5">Liste des professeurs</button>
        <button onclick="window.location.href='ListePersonne'" type="button" class="btn btn-secondary mr-5">Liste des personnes</button>
		<button onclick="window.location.href='AjoutPersonne'" type="button" class="btn btn-info">Créer une personne</button>
    </div>
</div>
<div class="container h-150">
    <div class="row align-self-center mt-5">
        <button onclick="window.location.href='ListeStatus'" type="button" class="btn btn-secondary mr-5">Liste des status</button>
		<button onclick="window.location.href='AjoutStatus'" type="button" class="btn btn-info">Créer un status</button>
    </div>
</div>
<div class="container h-200">
    <div class="row align-self-center mt-5">
        <button onclick="window.location.href='ListeClasse'" type="button" class="btn btn-secondary mr-5">Liste des classe</button>
		<button onclick="window.location.href='AjoutClasse'" type="button" class="btn btn-info">Créer une classe</button>
    </div>
</div>
<div class="container h-250">
    <div class="row align-self-center mt-5">
        <button href="#" type="button" class="btn btn-secondary mr-5">Liste des matériels</button>
		<button href="#" type="button" class="btn btn-info">Créer un matériel</button>
    </div>
</div>
<div class="container h-300">
    <div class="row align-self-center mt-5">
        <button href="#" type="button" class="btn btn-secondary mr-5">Liste des cours</button>
		<button href="#" type="button" class="btn btn-info">Créer un cour</button>
    </div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../navbar.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.project.beans.Classe" %>
<%@ page import="com.project.repository.ClasseRepository" %>
<title>Liste classe</title>
</head>
<body class="bg-warning text-dark">
 <br/>
<div class="row justify-content-center">
<div class="card bg-light mb-12 text-center" >
<button  onclick="window.location.href='AjoutClasse'" type="button" class="btn btn-info">Créer une classe <img src="https://img.icons8.com/fluent-systems-filled/24/000000/plus.png"/></button>

 <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom Classe</th>
      <th scope="col">Nombre d'élève</th>
      <th scope="col">Consulter</th>      
      <th scope="col">Modifier</th>
      <th scope="col">Supprimer</th>
      
    </tr>
  </thead>
  <tbody>
  <%
try{
ArrayList<Classe> listeclasses = new ArrayList();
listeclasses = (ArrayList<Classe>) request.getAttribute( "listeClasses" );
for( Classe i : listeclasses ){
	

%>
 <tr>
      <th scope="row"><%= i.getId() %></th>
      <td><%= i.getDesignation() %></td>
      <td>x</td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/visible.png"/></button></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/ios-glyphs/30/000000/quill-pen.png"/></td>
      <td><button class="btn btn-outline-dark" type="submit"><img src="https://img.icons8.com/material-sharp/24/000000/delete-forever.png"/></button></td>
      
    </tr>
<%
}}
catch(Exception e)
{
	System.out.println("erreur:"+e);
}
%>
  

  </tbody>
</table>
</div>
</div>

</body>
</html>
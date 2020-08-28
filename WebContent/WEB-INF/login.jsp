<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body class="bg-warning text-dark">
<div style="margin-left:600px; margin-right:600px; margin-top:150px">
	<form method="post" action="login">
	  <div class="form-group">
	    <label for="txtLogin">Login :</label>
	    <input type="email" class="form-control" name='txtLogin' value='${login}' autofocus>
	  </div>
	  <div class="form-group">
	    <label for="txtPassword">Password</label>
	    <input type="password" class="form-control" name='txtPassword' value='${password}'>
	  </div>
	  <button type="submit" class="btn btn-primary">Connection</button>
	</form>
</div>
</body>
</html>
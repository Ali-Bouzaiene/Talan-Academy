<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<%@ include file="header.jsp" %>
<c:choose>
<c:when test="${ resultat==true }">Bienvenu</c:when>
<c:when test="${ resultat==false }"> Verifier votre mdp/mail</c:when>
<c:otherwise></c:otherwise>
</c:choose>
	<form class="container col-lg-4" method="post" action="signIn">
    <div class="mb-3">
        <label for="exampleInputEmail" class="form-label">E-mail</label>
        <input type="email" class="form-control" name="email" id="exampleInputEmail">
    </div>
    <div class="mb-3">
        <label for="exampleInputPwd" class="form-label">Password</label>
        <input type="password" class="form-control" name="password" id="exampleInputPwd">
    </div>  
    <input type="submit" class="form-control" id="submit">
</form>

</body>
</html>
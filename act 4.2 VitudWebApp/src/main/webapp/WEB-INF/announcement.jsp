<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Déposer une annonce</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
  <%@ include file="header.jsp" %>
	<div class="container-xl">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Title</label>
		  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="title">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlTextarea1" class="form-label">Description</label>
		  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
		</div>
		<select class="form-select" aria-label="Default select example">
		  <option selected>Select category</option>
		  <option value="1">category 1</option>
		  <option value="2">category 2</option>
		  <option value="3">category 3</option>
		</select>

		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Price</label>
		  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="price">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">localisation </label>
		  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="localisation ">
		</div>
			<button type="submit" class="btn btn-primary">Submit</button>
	</div>
</body>
</html>
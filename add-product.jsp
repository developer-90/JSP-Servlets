<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add</title>
</head>
<body>
	<form method="post" action="Datos">
	  <label for="product-id">ID del producto:</label>
	  <input type="text" id="product-id" name="product-id"><br>
	
	  <label for="product-name">Nombre del producto:</label>
	  <input type="text" id="product-name" name="product-name"><br>
	
	  <label for="product-units">Unidades:</label>
	  <input type="number" id="product-units" name="product-units"><br>
	
	  <label for="product-price">Precio:</label>
	  <input type="number" id="product-price" name="product-price"><br>
	  
	  <input type="submit" value="Guardar">
	</form>
</body>
</html>
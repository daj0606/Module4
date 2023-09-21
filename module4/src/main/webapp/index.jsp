<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Or Subtract From Total</title>
</head>
<body>
	<h1>Addition</h1>
	<form action="addToTotal" method="post">
		<h4>Enter numbers to add: </h4>
		<input type="text" name="additionNum1" size="15"> +
		<input type="text" name="additionNum2" size="15"> 
		<input type="submit" value="Addition Number" />
	</form>
	
	<h1>Subtraction</h1>
	<form action="subtractFromTotal" method="post">
		<h4>Enter number to subtract: </h4>
		<input type="text" name="subtractionNum1" size="15"> +
		<input type="text" name="subtractionNum2" size="15"> 
		<input type="submit" value="Subbtraction Number" />
	</form>
	
</body>
</html>
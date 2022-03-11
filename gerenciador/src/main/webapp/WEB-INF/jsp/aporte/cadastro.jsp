<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Cadastro de Aporte</title>
</head>
<body>
	<div class="container">
		<h2>Cadastro de Aporte</h2>
		<form action="/aporte/incluir" method="post">
			<div class="form-group">
				<label for="dt">Data Limite da Meta:</label> 
				<input type="date"
					class="form-control" id="dt" placeholder="Data Limite da Meta"
					name="dt">
			</div>
			
			<div class="form-group">
				<label for="aporte">Valor do Aporte:</label> 
				<input type="number" min="1" step="any" 
					class="form-control" id="aporte" 
					placeholder="Rendimento Anual" 
					name="aporte"/>
			</div>
			
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
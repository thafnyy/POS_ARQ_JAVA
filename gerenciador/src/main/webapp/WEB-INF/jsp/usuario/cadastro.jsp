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
<title>Cadastro de Usu�rio</title>
</head>
<body>
	<div class="container">
		<h2>Cadastro de Usu�rio</h2>
		<form action="/usuario/incluir" method="post">
			<div class="form-group">
				<label for="nome">Nome:</label> 
					<input type="text"
					class="form-control" id="nome" placeholder="Digite seu nome"
					name="nome">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> 
					<input type="email"
					class="form-control" id="email" placeholder="Digite seu email"
					name="email">
			</div>
			<div class="form-group">
				<label for="idade">Senha:</label> 
					<input type="number"
					class="form-control" id="idade" placeholder="Digite sua idade"
					name="senha">
			</div>
			
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
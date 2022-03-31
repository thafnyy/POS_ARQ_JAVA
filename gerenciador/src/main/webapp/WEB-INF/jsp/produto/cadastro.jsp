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
<title>Cadastro de Produto</title>
</head>
<body>
	<div class="container">
		<h2>Cadastro de Produto</h2>
		<form action="/produto/incluir" method="post">
			
			<%@include file="../includes/meta.jsp" %>
		
			<div class="form-group">
				<label for="tipoProduto">Tipo do Produto:</label> 
				<select class="form-control"
					id="tipoProduto" name="tipoProduto">
					<option>Eletrônico</option>
					<option>Imóvel</option>
					<option>Eletrodoméstico</option>
					<option>Carro</option>
					<option>Outros</option>
				</select>
			</div>
			<div class="form-group">
				<label for="marca">Marca:</label> 
				<input type="text"
					class="form-control" id="marca" placeholder="Marca do produto" 
					name="marca" value="${objeto.marca}">
			</div>
			<div class="checkbox">
				<label for="entrada"> <input type="checkbox" name="entrada">
					Apenas valor de entrada
				</label>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
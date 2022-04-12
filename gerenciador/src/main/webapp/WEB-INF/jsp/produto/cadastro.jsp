<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Cadastro de Produto</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/includes/menu.jsp" />

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
			<button type="submit" class="btn btn-outline-dark">Cadastrar</button>
		</form>
	</div>
</body>
</html>
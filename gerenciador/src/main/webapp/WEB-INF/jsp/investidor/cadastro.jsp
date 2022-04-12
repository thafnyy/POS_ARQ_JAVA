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
<title>Cadastro de Investidor</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/includes/menu.jsp" />

	<div class="container">
		<h2>Cadastro de Investidor</h2>
		<form action="/investidor/incluir" method="post">
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
				<label for="idade">Idade:</label> 
					<input type="number"
					class="form-control" id="idade" placeholder="Digite sua idade"
					name="idade">
			</div>
			
			<button type="submit" class="btn btn-outline-dark">Cadastrar</button>
		</form>
	</div>
</body>
</html>
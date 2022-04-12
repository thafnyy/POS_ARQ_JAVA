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

<title>Cadastro de Aporte</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/includes/menu.jsp" />

	<div class="container">
		<h2>Cadastro de Aporte</h2>
		<form action="/aporte/incluir" method="post">
			<div class="form-group">
				<label for="aporte">Valor do Aporte:</label> 
				<input type="number" min="1" step="any" 
					class="form-control" id="aporte" 
					placeholder="Rendimento Anual" 
					name="valorAporte" value="${objeto.valorAporte}"/>
			</div>
			
			<button type="submit" class="btn btn-outline-dark">Cadastrar</button>
		</form>
	</div>
</body>
</html>
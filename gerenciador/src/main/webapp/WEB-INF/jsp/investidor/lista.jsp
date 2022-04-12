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
		<form action="/investidor" method="get">
			<button type="submit" class="btn btn-outline-dark">Novo Investidor</button>
		</form>

		<br/>
		<c:if test="${empty lista}">
			Não existem investidores cadastrados. 
		</c:if>
		<c:if test="${not empty lista}">
			<p>Listagem de Investidores (${lista.size()})</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Usuário Root</th>
						<th>Nome</th>
						<th>Email</th>
						<th>Idade</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="l" items="${lista}">
					<tr>
						<td>${l.id}</td>
						<td>${l.usuario.nome}</td>
						<td>${l.nome}</td>
						<td>${l.email}</td>
						<td>${l.idade}</td>
						<td><a href="/investidor/${l.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
					
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>
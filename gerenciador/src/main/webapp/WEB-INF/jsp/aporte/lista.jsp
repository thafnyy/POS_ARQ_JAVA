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
		<form action="/aporte" method="get">
			<button type="submit" class="btn btn-outline-dark">Novo Aporte</button>
		</form>

		<br/>
		<c:if test="${empty lista}">
			Não existem aportes cadastrados. 
		</c:if>
		<c:if test="${not empty lista}">
			<p>Listagem de Aportes (${lista.size()})</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Data do Aporte</th>
						<th>Valor do Aporte</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="l" items="${lista}">
					<tr>
						<td>${l.id}</td>
						<td>${l.data}</td>
						<td>${l.valorAporte}</td>
						<td><a href="/aporte/${l.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
					
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>
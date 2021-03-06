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

<title>Listagem de Usu?rios</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/includes/menu.jsp" />

	<div class="container">
		<h2>Usu?rios</h2>
		

		<br/>
		<c:if test="${empty lista}">
			N?o existem usu?rios cadastrados. 
		</c:if>
		<c:if test="${not empty lista}">
			<p>Listagem de Usu?rios (${lista.size()})</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>Email</th>
						<th>Administrador</th>
						<th>Investidores</th>
						<th>Metas</th>
						<th>Aportes</th>
						<c:if test="${usuario.admin}">
							<th></th>
						</c:if>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="l" items="${lista}">
					<tr>
						<td>${l.id}</td>
						<td>${l.nome}</td>
						<td>${l.email}</td>
						<td>${l.admin}</td>
						<td>${l.investidores.size()}</td>
						<td>${l.metas.size()}</td>
						<td>${l.aportes.size()}</td>
						<c:if test="${usuario.admin}">
							<td><a href="/usuario/${l.id}/excluir">excluir</a></td>
						</c:if>
					</tr>
				</c:forEach>
					
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>
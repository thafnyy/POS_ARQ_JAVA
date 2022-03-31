<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Cadastro de Produto</title>
</head>
<body>
	<div class="container">
		<h2>Cadastro de Produto</h2>
		<form action="/produto" method="get">
			<button type="submit" class="btn btn-default">Novo Produto</button>
		</form>

		<br/>
		<c:if test="${empty lista}">
			Não existem produtos cadastradss. 
		</c:if>
		<c:if test="${not empty lista}">
			<p>Listagem de Produtos (${lista.size()})</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Local do Investimento</th>
						<th>Tipo do Produto</th>
						<th>Marca</th>
						<th>Valor de Entrada</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="l" items="${lista}">
					<tr>
						<td>${l.id}</td>
						<td>${l.nome}</td>
						<td>${l.valor}</td>
						<td>${l.localDoInvestimento}</td>
						<td>${l.tipoProduto}</td>
						<td>${l.marca}</td>
						<td>${l.entrada}</td>
						<td><a href="/produto/${l.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
					
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>
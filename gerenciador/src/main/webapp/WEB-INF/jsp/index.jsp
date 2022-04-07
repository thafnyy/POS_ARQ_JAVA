<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<title>Gerenciamento de Metas!</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Gerenciador de Metas</a>
		</div>
		<ul class="navbar-nav">
			<c:if test="${not empty usuario}">
				<li class="nav-item"><a class="nav-link" href="/investidores">Investidores</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/viagens">Viagem</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/produtos">Produto</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/poupancas">Poupança</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/aportes">Aportes</a>
				</li>
			</c:if>
			
			<c:if test="${empty usuario}">
				<li class="nav-item"><a class="nav-link" href="/usuario">Cadastrar</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/login">Login</a>
				</li>
			</c:if>
			<c:if test="${not empty usuario}">
				<li class="nav-item"><a class="nav-link" href="#">Sair, ${usuario.nome}</a>
				</li>
			</c:if>
		</ul>
		
	</nav>

	<div class="jumbotron" style="text-align: center; padding: 10px;">
		<h1 class="display-4">Gerenciador de Metas</h1>
		<p class="lead">
			<b>${usuario.nome}</b>, cadastre suas metas e veja elas saírem do
			papel.
		</p>
		<hr class="my-4">
	</div>
	<div style="padding: 10px">

		<a href="/investidores" class="btn btn-outline-dark" role="button">Cadastro
			de Investidor</a>

		<hr class="my-4">

		<p class="lead">Cadastre as metas de acordo com o tipo</p>
		<div class="btn-group">
			<a href="/viagens" class="btn btn-outline-dark" role="button">Viagem</a>
			<a href="/produtos" class="btn btn-outline-dark" role="button">Produto</a>
			<a href="/poupancas" class="btn btn-outline-dark" role="button">Poupança</a>
		</div>

		<hr class="my-4">
		<a href="/aportes" class="btn btn-outline-dark" role="button">Cadastro
			de Aportes</a>

	</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</html>
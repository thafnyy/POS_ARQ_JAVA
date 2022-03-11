<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Gerenciamento de Metas!</title>
</head>
<body>
	<div class="jumbotron" style="text-align: center; padding: 10px;">
		<h1 class="display-4">Gerenciador de Metas</h1>
		<p class="lead">Cadastre suas metas e veja elas sairem do papel.</p>
		<hr class="my-4">
	</div>
	<div style="padding:10px">
	
		<a href="/investidor" class="btn btn-outline-dark" role="button">Cadastro de Investidor</a>
		
		<hr class="my-4">
		
		<p class="lead">Cadastre as metas de acordo com o tipo</p>
		<div class="btn-group">
			<a href="/viagem" class="btn btn-outline-dark" role="button">Viagem</a>
			<a href="/produto" class="btn btn-outline-dark" role="button">Produto</a>
			<a href="/poupanca" class="btn btn-outline-dark" role="button">Poupança</a>
		</div>
		
		<hr class="my-4">
		<a href="/aporte" class="btn btn-outline-dark" role="button">Cadastro de Aportes</a>
		
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
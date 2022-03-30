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
<title>Cadastro de Viagem</title>
</head>
<body>
	<div class="container">
		<h2>Cadastro de Viagem</h2>
		<form action="/viagem/incluir" method="post">
			<div class="form-group">
				<label for="nome"nome"">Nome:</label> 
					<input type="text" required="required" 
					class="form-control" id="nome" placeholder="Entre com o nome"
					name="nome" value="${viagem.nome }">
			</div>
			<div class="form-group">
				<label for="valor">Valor:</label> 
					<input type="number" step=".01" required="required" 
					class="form-control" id="valor" placeholder="Valor"
					name="valor" value="${viagem.valor }">
			</div>
			<div class="form-group">
				<label for="localDoInvestimento">Local do Investimento:</label> 
					<input type="text" required="required" 
					class="form-control" id="localDoInvestimento" placeholder="Local do Investimento. ex: itau, xp"
					name="localDoInvestimento" value="${viagem.localDoInvestimento }">
			</div>
			<div class="form-group">
				<label for="acomp">Qtd Acompanhamentes:</label> 
					<input type="number" required="required" 
					class="form-control" id="acomp" placeholder="Entre Qtd Acomp"
					name="qtdAcompanhantes" value="${viagem.qtdAcompanhantes }">
			</div>
			<div class="form-group">
				<label for="dt">Data da Viagem:</label> <input type="date"
					required="required" class="form-control" id="dt" placeholder="Data da Viagem"
					name="strDataViagem">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" name="internacional" value="true">
					Viagem Internacional</label>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
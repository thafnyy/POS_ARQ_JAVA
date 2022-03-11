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
		<h2>Cadastro de Poupança</h2>
		<form action="/poupanca/incluir" method="post">
			<div class="form-group">
				<label for="rendimento">Percentual Rendimento Anual:</label> 
				<input type="number" min="1" step="any" 
					class="form-control" id="rendimento" 
					placeholder="Rendimento Anual" 
					name="rendimento"/>
			</div>
			
			<div class="form-group">
				<label for="prazo">Prazo do Investimento:</label> 
				<select class="form-control"
					id="prazo">
					<option>Curto</option>
					<option>Médio</option>
					<option>Longo</option>
				</select>
			</div>
			<div class="checkbox">
				<label for="liquidez"> 
				<input type="checkbox" name="liquidez">
					Necessita de Liquidez Diaria
				</label>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
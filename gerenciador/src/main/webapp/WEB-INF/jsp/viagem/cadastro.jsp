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
		
			<%@include file="../includes/meta.jsp" %>
			
			<div class="form-group">
				<label for="acomp">Qtd Acompanhamentes:</label> 
					<input type="number" required="required" 
					class="form-control" id="acomp" placeholder="Entre Qtd Acomp"
					name="qtdAcompanhantes" value="${objeto.qtdAcompanhantes }">
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
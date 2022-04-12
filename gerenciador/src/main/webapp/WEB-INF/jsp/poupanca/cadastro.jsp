<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>Cadastro de Viagem</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/includes/menu.jsp" />

	<div class="container">
		<h2>Cadastro de Poupança</h2>
		<form action="/poupanca/incluir" method="post">
			
			<%@include file="../includes/meta.jsp" %>
			
			<div class="form-group">
				<label for="rendimento">Percentual Rendimento Anual:</label> 
				<input type="number" min="1" step="any" required="required"
					class="form-control" id="rendimento" 
					placeholder="Rendimento Anual" 
					name="pctRendaAnual" value="${objeto.pctRendaAnual }"/>
			</div>
			
			<div class="form-group">
				<label for="prazo">Prazo do Investimento:</label> 
				<select class="form-control"
					id="prazo" name="prazo" >
					<option>Curto</option>
					<option>Médio</option>
					<option>Longo</option>
				</select>
			</div>
			<div class="checkbox">
				<label for="liquidez"> 
				<input type="checkbox" name="liquidezDiaria" value="true">
					Necessita de Liquidez Diária
				</label>
			</div>
			<button type="submit" class="btn btn-outline-dark">Cadastrar</button>
		</form>
	</div>
</body>
</html>
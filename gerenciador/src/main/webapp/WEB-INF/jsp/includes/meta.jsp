<div class="form-group">
	<label for="nome"nome"">Nome:</label> <input type="text"
		required="required" class="form-control" id="nome"
		placeholder="Entre com o nome" name="nome" value="${objeto.nome }">
</div>
<div class="form-group">
	<label for="valor">Valor:</label> <input type="number" step=".01"
		required="required" class="form-control" id="valor"
		placeholder="Valor" name="valor" value="${objeto.valor }">
</div>
<div class="form-group">
	<label for="localDoInvestimento">Local do Investimento:</label> <input
		type="text" required="required" class="form-control"
		id="localDoInvestimento"
		placeholder="Local do Investimento. ex: itau, xp"
		name="localDoInvestimento" value="${objeto.localDoInvestimento }">
</div>
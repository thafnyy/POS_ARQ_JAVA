<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav
	class="navbar navbar-dark bg-dark navbar-expand-md bg-faded justify-content-center">
	<a href="#" class="navbar-brand d-flex w-50 mr-auto">Gerenciador de
		Metas</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsingNavbar3">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="navbar-collapse collapse w-100" id="collapsingNavbar3">
		<ul class="navbar-nav w-100 justify-content-center">
			<c:if test="${not empty usuario}">
				<li class="nav-item"><a class="nav-link" href="/investidores">Investidor</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/viagens">Viagem</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/produtos">Produto</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/poupancas">Poupança</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/aportes">Aporte</a>
				</li>
			</c:if>
		</ul>
		<ul class="nav navbar-nav ml-auto w-100 justify-content-end">
			<c:if test="${empty usuario}">
				<li class="nav-item"><a class="nav-link" href="/usuario">Cadastrar</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/login">Login</a>
				</li>
			</c:if>
			<c:if test="${not empty usuario}">
				<li class="nav-item"><a class="nav-link" href="/logout">Sair,
						${usuario.nome}</a></li>
			</c:if>
		</ul>
	</div>
</nav>
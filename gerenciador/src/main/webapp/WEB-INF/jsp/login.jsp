<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<title>Login - Gerenciamento de Metas</title>
</head>
<style>
	body{background: #eee }
	html,body{
	    position: relative;
	    height: 100%;
	}
	
	.login {	
	    background-color: #2cb0b8;
	    border-color: #14acb5;
	}
	
	.login:hover {
		background-color: #2cb0b8c9;
	}
	
	.login-container{
	    position: relative;
	    width: 300px;
	    margin: 80px auto;
	    padding: 20px 40px 40px;
	    text-align: center;
	    background: #fff;
	    border: 1px solid #ccc;
	}
	
	#output{
	    position: absolute;
	    width: 300px;
	    top: -75px;
	    left: 0;
	    color: #fff;
	}
	
	#output.alert-success{
	    background: rgb(25, 204, 25);
	}
	
	#output.alert-danger{
	    background: rgb(228, 105, 105);
	}
	
	.avatar{
	    width: 100px;
	    height: 100px;
	    margin: 10px auto 30px;
	    border-radius: 100%;
	    border: 2px solid #aaa;
	    background-size: cover;
	    background: url(data:image/png;base64,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);
	    background-repeat: no-repeat;
	    background-size: 86px;
	    background-position: center;
	}
	
	.form-box input{
	    width: 100%;
	    padding: 10px;
	    text-align: center;
	    height:40px;
	    border: 1px solid #ccc;;
	    background: #fafafa;
	    transition:0.2s ease-in-out;
	
	}
	
	.form-box input:focus{
	    outline: 0;
	    background: #eee;
	}
	
	.form-box input[type="text"]{
	    border-radius: 5px 5px 0 0;
	    text-transform: lowercase;
	}
	
	.form-box input[type="password"]{
	    border-radius: 0 0 5px 5px;
	    border-top: 0;
	}
	
	.form-box button.login{
	    margin-top:15px;
	    padding: 10px 20px;
	}
	
</style>
<body>
	<div class="container">
		<div class="login-container">
				<c:if test="${not empty message}">
	            	<div id="output" class="alert-danger">Atenção: ${message}</div>
	            </c:if>
	            <div class="avatar"></div>
	            <div class="form-box">
	                <form action="/login" method="POST">
	                    <input required="required" name="email" type="email" placeholder="email" value="thafny@outlook.com">
	                    <input required="required" name="senha" type="password" placeholder="senha" value="123456">
	                    <button class="btn btn-info btn-block login" type="submit">Login</button>
	                </form>
	            </div>
	        </div>
	        
	</div>
</body>
</html>
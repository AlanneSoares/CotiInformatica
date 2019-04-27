<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<title>Detail | Usuário</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h2>Detalhe do Usuário</h2>
		</div>
		
		<%@page import="entity.*, controller.*, java.util.*" %>
		
		<%
		try {
			Usuario resposta = (Usuario) request.getAttribute("usuario");
					
			if (resposta == null) {
				throw new Exception("Error");	
			}
			
		} catch(Exception ex) {
			request.setAttribute("msg", "Error, Acesso Inválido!");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		%>
		
		<table class="table">
		<thead class="bg-dark text-white">
			<tr>
				<td>ID</td>
				<td>Nome</td>
				<td>Senha</td>
				<td>E-mail</td>
				<td>Foto</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${usuario.codigo}</td>
				<td>${usuario.nome}</td>
				<td>${usuario.email}</td>
				<td>${usuario.foto}</td>
				<td><img src="${usuario.foto}" width="100px" class="border border-dark"></td>
			</tr>
		</tbody>
		</table>
	</div>
</body>
</html>
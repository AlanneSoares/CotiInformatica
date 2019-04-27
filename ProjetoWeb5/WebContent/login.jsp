<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<title>Coti | Login</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron"> <!-- header css -->
			<h2>Login</h2>
		</div>
		
		<!--  -->
		<form method="post" action="Controller">
			<div class="form-group">
				<label for="email">Email</label>
				<!-- required obrigatório
					form-control: formato bootstrap para campo input
					for: para apontar o cursor e indicar para o campo
					for necessita de input com id
				 -->
				<input type="email" name="email" id="email" required="required" class="form-control" />
			</div>
			
			<div class="form-group">
				<label for="senha">Senha</label>
				<input type="password" name="senha" id="senha" required="required" class="form-control" />
			</div>
			
			<button type="submit" class="btn btn-primary">Enviar</button>
		</form>
	</div>
</body>
</html>
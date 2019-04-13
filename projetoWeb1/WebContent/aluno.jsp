<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <f:view> -->

<form method="post" action="ControllerAluno">
	
	<h2>Formulário Aluno</h2>

	Nome:
	<br/> 
	<input type="text" name="nome" />
	<br/>
	E-mail:
	<br/>
	<input type="email" name="email" id="nome" value="" size="30" />
	<hr/>
	<h2>Disciplina</h2>
	
	Disciplina:
	<br/>
	<input type="text" name="disciplinaa" id="disciplina" value="" size="50" />
	<br/>
	Nota 1:
	<br/>
	<input type="number" step="0.1" name="nota1a" id="nota1a" value="" size="10" />
	<br/>
	Nota 2:
	<br/>
	<input type="number" step="0.1" name="nota2a" id="nota1a" value="" size="10" />
	<br/>
	<br/>
	Disciplina:
	<br/>
	<input type="text" name="disciplinab" id="disciplinab" value="" size="50" />
	<br/>
	Nota 1:
	<br/>	
	<input type="text" step="0.1" name="nota1b" id="nota1b" value="" size="10" /> 
	
	<br/>
	
	Nota 2:
	<br/>	
	<input type="text" step="0.1" name="nota2b" id="nota1b" value="" size="10" />
	<br/>
	<br/>
	<button type="submit" >Enviar dados</button>
	<br/>
	${resposta}
</form>

<!-- </f:view> -->
</body>
</html>
<%@page import="modelo.consultoriaFinanceira" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração Dados da Empresa</title>
</head>
<body>

	<h1>Alteração Dados da Empresa</h1>
	
	<form action="chamadaservlet" method="post">
	Nome Empresa: <input type="text" name="txtnomeEmpresa" value="${consultoriafinanceira.nomeEmpresa}" readonly><br><br>
	Clientes Ativos: <input type="text" name="txtclientesAtivos" value="${consultoriafinanceira.clientesAtivos}"><br><br>
	Media Retorno Investimento: <input type="text" name="txtmediaRetornoInvestimento" value="${consultoriafinanceira.mediaRetornoInvestimento}"><br><br>
	Honorarios:<input type="text" name="txthonorarios" value="${consultoriafinanceira.honorarios}"><br><br>
	Comissoes:<input type="text" name="txtcomissoes" value="${consultoriafinanceira.comissoes}"><br><br>
	Retainers:<input type="text" name="txtretainers" value="${consultoriafinanceira.retainers}"><br><br>
	Salarios Funcionarios:<input type="text" name="txtsalariosFuncionarios" value="${consultoriafinanceira.salariosFuncionarios}" ><br><br>
	<input type="hidden" name="acao" value="altera">
	<input type="submit" value="alterar">
	</form>
	
</body>
</html>



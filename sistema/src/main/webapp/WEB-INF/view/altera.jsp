<%@page import="modelo.consultoriaFinanceira" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração Dados da Empresa</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }
    h1 {
        color: black;
        margin-bottom: 20px;
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
    }
    .container {
        width: 90%;
        max-width: 500px;
        margin: 20px auto;
        padding: 20px;
        background: rgba(255, 255, 255, 0.9);
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
        border-radius: 12px;
    }
    form {
        display: flex;
        flex-direction: column;
    }
    label {
        margin-bottom: 10px;
        color: #333;
    }
    input[type="text"] {
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 16px;
    }
    input[type="submit"] {
        background: linear-gradient(120deg, #ff6f61 0%, #d6336c 100%);
        color: white;
        border: none;
        padding: 12px;
        font-size: 16px;
        cursor: pointer;
        border-radius: 24px;
        transition: background 0.3s ease, transform 0.3s ease;
    }
    input[type="submit"]:hover {
        background: linear-gradient(120deg, #d6336c 0%, #ff6f61 100%);
        transform: scale(1.05);
    }
</style>
</head>
<body>

    <div class="container">
        <h1>Alteração Dados da Empresa</h1>
        
        <form action="chamadaservlet" method="post">
            <label for="txtnomeEmpresa">Nome Empresa:</label>
            <input type="text" id="txtnomeEmpresa" name="txtnomeEmpresa" value="${consultoriafinanceira.nomeEmpresa}" readonly>

            <label for="txtclientesAtivos">Clientes Ativos:</label>
            <input type="text" id="txtclientesAtivos" name="txtclientesAtivos" value="${consultoriafinanceira.clientesAtivos}">

            <label for="txtmediaRetornoInvestimento">Media Retorno Investimento:</label>
            <input type="text" id="txtmediaRetornoInvestimento" name="txtmediaRetornoInvestimento" value="${consultoriafinanceira.mediaRetornoInvestimento}">

            <label for="txthonorarios">Honorarios:</label>
            <input type="text" id="txthonorarios" name="txthonorarios" value="${consultoriafinanceira.honorarios}">

            <label for="txtcomissoes">Comissoes:</label>
            <input type="text" id="txtcomissoes" name="txtcomissoes" value="${consultoriafinanceira.comissoes}">

            <label for="txtretainers">Retainers:</label>
            <input type="text" id="txtretainers" name="txtretainers" value="${consultoriafinanceira.retainers}">

            <label for="txtsalariosFuncionarios">Salarios Funcionarios:</label>
            <input type="text" id="txtsalariosFuncionarios" name="txtsalariosFuncionarios" value="${consultoriafinanceira.salariosFuncionarios}">
            
            <input type="hidden" name="acao" value="altera">
            <input type="submit" value="Alterar">
        </form>
    </div>
    
</body>
</html>



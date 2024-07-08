<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Todas as Empresas</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    h1 {
        color: black;
        margin-top: 40px;
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
    }
    .container {
        width: 90%;
        margin: 20px auto;
        padding: 20px;
        background: rgba(255, 255, 255, 0.9);
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
        border-radius: 12px;
    }
    a button {
        background: linear-gradient(120deg, #ff6f61 0%, #d6336c 100%);
        color: white;
        border: none;
        padding: 12px 24px;
        font-size: 16px;
        margin: 10px 2px;
        cursor: pointer;
        border-radius: 24px;
        transition: background 0.3s ease, transform 0.3s ease;
    }
    a button:hover {
        background: linear-gradient(120deg, #d6336c 0%, #ff6f61 100%);
        transform: scale(1.05);
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin: 20px 0;
        font-size: 16px;
        background: white;
        border-radius: 8px;
        overflow: hidden;
        box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2);
    }
    th, td {
        padding: 16px;
        text-align: left;
    }
    th {
        background: linear-gradient(120deg, #ff6f61 0%, #d6336c 100%);
        color: white;
    }
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
    tr:hover {
        background-color: #e9e9e9;
        cursor: pointer;
    }
    .action-links a {
        color: #d6336c;
        text-decoration: none;
        margin: 0 5px;
        font-weight: bold;
    }
    .action-links a:hover {
        color: #ff6f61;
        text-decoration: underline;
    }
    .no-data {
        text-align: center;
        color: #666;
        font-size: 18px;
        margin-top: 20px;
    }
</style>
</head>
<body>

    <div class="container">
        <h1>Mostrar Todas as Empresas</h1>
        
        <a href="http://localhost:8080/sistema/chamadaservlet?acao=Cadastro">
            <button>Cadastrar Empresa</button>
        </a>
        
        <c:if test="${not empty consultoria}">
            <table>
                <thead>
                    <tr>
                        <th>Nome Empresa</th>
                        <th>Clientes Ativos</th>
                        <th>Média Retorno Investimento</th>
                        <th>Honorários</th>
                        <th>Comissões</th>
                        <th>Retainers</th>
                        <th>Salários Funcionários</th>
                        <th colspan="2">Ação</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="consultoriafinanceira" items="${consultoria}">
                        <tr>
                            <td>${consultoriafinanceira.nomeEmpresa}</td>
                            <td>${consultoriafinanceira.clientesAtivos}</td>
                            <td>${consultoriafinanceira.mediaRetornoInvestimento}</td>
                            <td>${consultoriafinanceira.honorarios}</td>
                            <td>${consultoriafinanceira.comissoes}</td>
                            <td>${consultoriafinanceira.retainers}</td>
                            <td>${consultoriafinanceira.salariosFuncionarios}</td>
                            <td class="action-links">
                                <a href="chamadaservlet?acao=altera&nomeEmpresa=${consultoriafinanceira.nomeEmpresa}">ALTERAR</a>
                            </td>
                            <td class="action-links">
                                <a href="chamadaservlet?acao=exclui&nomeEmpresa=${consultoriafinanceira.nomeEmpresa}">EXCLUIR</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${empty consultoria}">
            <h1 class="no-data">Nenhuma Empresa Cadastrada!</h1>
        </c:if>
    </div>
    
</body>
</html>



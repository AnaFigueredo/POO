
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Conta Poupança</title>
</head>
<body>
    <h1>Conta Poupança</h1>

    <h2>Dados da Conta</h2>
    <p>Cliente: ${conta.cliente}</p>
    <p>Número da Conta: ${conta.numConta}</p>
    <p>Saldo: ${conta.saldo}</p>

    <h2>Operações</h2>
    <form action="contaPoupancaServlet" method="post">
        <label for="valorSaque">Valor para Saque:</label>
        <input type="number" id="valorSaque" name="valorSaque" min="0" required>
        <button type="submit">Sacar</button>
    </form>

    <form action="contaPoupancaServlet" method="post">
        <label for="valorDeposito">Valor para Depósito:</label>
        <input type="number" id="valorDeposito" name="valorDeposito" min="0" required>
        <button type="submit">Depositar</button>
    </form>

    <form action="contaPoupancaServlet" method="post">
        <button type="submit" name="calcularRendimento">Calcular Rendimento</button>
    </form>

    <p>Saldo com Rendimento: ${conta.saldoRendimento}</p>

    <a href="../index.jsp">Voltar</a>
</body>
</html>

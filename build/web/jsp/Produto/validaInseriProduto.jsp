<%-- 
    Document   : validaInseriProduto
    Created on : 30/03/2016, 14:16:53
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatec.jdbc.modelo.Produto" %>
<%@page import="br.com.fatec.jdbc.dao.ProdutoDAO" %>

<%
    String nome = request.getParameter("NOME");
    String preco = request.getParameter("PRECO");
    Produto u1 = new Produto();
    u1.setNome(nome);
    u1.setPreco(preco);
    ProdutoDAO dao = new ProdutoDAO();
    dao.inseri(u1);
%>

<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERIR PRODUTO</title>
    </head>
    <body>
        <h1>Nome : <%=nome%></h1> <br>
        <h1>Preço : <%=preco%></h1> <br>
    </body>
</html>

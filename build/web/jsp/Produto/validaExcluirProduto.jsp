<%-- 
    Document   : validaExcluirProduto
    Created on : 30/03/2016, 14:35:35
    Author     : Lucas
--%>
<%@page import="br.com.fatec.jdbc.modelo.Produto" %>
<%@page import="br.com.fatec.jdbc.dao.ProdutoDAO" %>

<%
    String codigo = request.getParameter("CODIGO");
    Produto u1 = new Produto();
    u1.setCodigo(Integer.parseInt(codigo));
    ProdutoDAO dao = new ProdutoDAO();
    dao.exclui(u1) ;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../../inc/materalizeWeb.inc" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR PRODUTO</title>
    </head>
    <body>
        <h1>Produto excluido</h1>
    </body>
</html>

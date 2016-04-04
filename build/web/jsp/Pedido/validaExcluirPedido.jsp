<%-- 
    Document   : validaExcluirPedido
    Created on : 30/03/2016, 17:19:00
    Author     : Lucas
--%>

<%@page import="br.com.fatec.jdbc.modelo.Pedido" %>
<%@page import="br.com.fatec.jdbc.dao.PedidoDAO" %>

<%
    String codigo_pedido = request.getParameter("CODIGO_PEDIDO");
    Pedido u1 = new Pedido();
    u1.setCodigo_pedido(Integer.parseInt(codigo_pedido));
    PedidoDAO dao = new PedidoDAO();
    dao.exclui(u1) ;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR PEDIDO</title>
    </head>
    <body>
        <h1>Pedido excluido</h1>
    </body>
</html>

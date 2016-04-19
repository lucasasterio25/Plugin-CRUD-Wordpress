<%-- 
    Document   : validaInseriPedido
    Created on : 30/03/2016, 17:17:31
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatec.jdbc.modelo.Pedido" %>
<%@page import="br.com.fatec.jdbc.dao.PedidoDAO" %>

<%
    String data = request.getParameter("DATA");
    String valor = request.getParameter("VALOR");

    Pedido u1 = new Pedido();
    u1.setData(data);
    u1.setValor(Integer.parseInt(valor));

    PedidoDAO dao = new PedidoDAO();
    dao.inseri(u1);
%>

<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERIR PEDIDO</title>
    </head>
    <body>
        <h1>data : <%=data%></h1> <br>
        <h1>valor : <%=valor%></h1> <br>

    </body>
</html>

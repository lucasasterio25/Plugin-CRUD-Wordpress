<%-- 
    Document   : validaAlteraPedido
    Created on : 30/03/2016, 17:18:28
    Author     : Lucas
--%>
<%@page import="br.com.fatec.jdbc.modelo.Pedido" %>
<%@page import="br.com.fatec.jdbc.dao.PedidoDAO" %>

<%
    String codigo_pedido = request.getParameter("CODIGO_PEDIDO");
    String valor = request.getParameter("VALOR");
    String data = request.getParameter("DATA");

    Pedido u1 = new Pedido();
    u1.setCodigo_pedido(Integer.parseInt(codigo_pedido));
    u1.setValor(Integer.parseInt(valor));
    u1.setData(data);

    PedidoDAO dao = new PedidoDAO();
    dao.altera(u1);
%>

<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALTERAR PEDIDO</title>
    </head>
    <body>
        <h1>codigo_pedido : <%=codigo_pedido%></h1> <br>
        <h1>valor : <%=valor%></h1> <br>
        <h1>data : <%=data%></h1> <br>

    </body>
</html>
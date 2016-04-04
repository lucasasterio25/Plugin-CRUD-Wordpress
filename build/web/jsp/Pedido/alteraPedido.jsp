<%-- 
    Document   : alteraPedido
    Created on : 30/03/2016, 17:18:10
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR PEDIDO</title>
    <body>
        <h1>Alterar Pedido</h1>
        <form name="validaAlteraPedido" action="validaAlteraPedido.jsp" method="POST">
            Codigo_pedido: <input type="text" name="CODIGO_PEDIDO" value="">  <br>
            Valor: <input type="text" name="VALOR" value="">  <br>
            Data: <input type="text" name="DATA" value="">  <br>
            Id_produto: <input type="text" name="ID_PRODUTO" value="">  <br>  
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

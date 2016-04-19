<%-- 
    Document   : inseriPedido
    Created on : 30/03/2016, 17:17:13
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR PEDIDO</title>
    <body>
        <h1>Alterar Pedido</h1>
        <form name="validaInseriPedido" action="validaInseriPedido.jsp" method="POST">
            Data: <input type="text" name="DATA" value="">  <br>
            Valor: <input type="text" name="VALOR" value="">  <br>

            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

<%-- 
    Document   : excluirPedido
    Created on : 30/03/2016, 17:18:43
    Author     : Lucas
--%>

<!DOCTYPE html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>EXCLUIR PEDIDO</title>
    <body>
        <h1>Excluir PEDIDO</h1>
        <form name="validaExcluirPedido" action="validaExcluirPedido.jsp" method="POST">
            Codigo_pedido: <input type="text" name="CODIGO_PEDIDO" value="">  <br>
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

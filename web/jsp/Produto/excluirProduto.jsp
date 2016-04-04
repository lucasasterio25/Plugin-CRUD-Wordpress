<%-- 
    Document   : excluirProduto
    Created on : 30/03/2016, 14:35:20
    Author     : Lucas
--%>

<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>EXCLUIR PRODUTO</title>
    <body>
        <h1>Excluir PRODUTO</h1>
        <form name="validaExcluirProduto" action="validaExcluirProduto.jsp" method="POST">
            Codigo: <input type="text" name="CODIGO" value="">  <br>
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

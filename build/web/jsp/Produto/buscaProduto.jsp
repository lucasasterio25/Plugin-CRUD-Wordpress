<%-- 
    Document   : buscaProduto
    Created on : 31/03/2016, 13:34:47
    Author     : Lucas
--%>

<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>BUSCAR NOME DE PRODUTO</title>
    <body>
        <h1>Buscar PRODUTO</h1>
        <form name="validaBuscaProduto" action="validaBuscaProduto.jsp" method="POST">
            Nome: <input type="text" name="NOME" value="">  <br>
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

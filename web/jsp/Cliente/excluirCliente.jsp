<%-- 
    Document   : excluirAdm
    Created on : 30/03/2016, 09:08:57
    Author     : Lucas
--%>

<!DOCTYPE html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>EXCLUIR CLIENTE</title>
    <body>
        <h1>Excluir Cliente</h1>
        <form name="validainseri" action="validaExcluirCliente.jsp" method="POST">
            Login: <input type="text" name="LOGIN" value="">  <br>
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

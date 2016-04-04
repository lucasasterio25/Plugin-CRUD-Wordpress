<%-- 
    Document   : alteraAdm
    Created on : 30/03/2016, 08:56:57
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR CLIENTE</title>
    <body>
        <h1>Alterar Cliente</h1>
        <form name="validaAlteraCliente" action="validaAlteraCliente.jsp" method="POST">
            Login: <input type="text" name="LOGIN" value="">  <br>
            Senha: <input type="text" name="SENHA" value="">  <br>
            Endereço: <input type="text" name="ENDERECO" value="">  <br>
            E-mail: <input type="text" name="EMAIL" value="">  <br>    
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

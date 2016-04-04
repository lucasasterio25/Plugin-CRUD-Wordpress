<%-- 
    Document   : inseriAdm
    Created on : 29/03/2016, 20:29:09
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR ADM</title>
    <body>
        <h1>Inseri ADM</h1>
        <form name="validainseriAdm" action="validainseriAdm.jsp" method="POST">
            Login: <input type="text" name="LOGIN" value="">  <br>
            Senha: <input type="text" name="SENHA" value="">  <br>
            Endereço: <input type="text" name="ENDERECO" value="">  <br>
            E-mail: <input type="text" name="EMAIL" value="">  <br>    
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

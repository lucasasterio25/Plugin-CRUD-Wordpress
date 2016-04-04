<%-- 
    Document   : alteraProduto
    Created on : 30/03/2016, 14:27:30
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR PRODUTO</title>
    <body>
        <h1>Alterar Produto</h1>
        <form name="validaAlteraProduto" action="validaAlteraProduto.jsp" method="POST">
            Codigo: <input type="text" name="CODIGO" value="">  <br> 
            Nome: <input type="text" name="NOME" value="">  <br>
            Preço: <input type="text" name="PRECO" value="">  <br>    
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>

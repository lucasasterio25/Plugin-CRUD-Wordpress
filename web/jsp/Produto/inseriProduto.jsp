<%-- 
    Document   : inseriProduto
    Created on : 30/03/2016, 14:16:38
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR PRODUTO</title>
    <body>
        <h1>Inserir PRODUTO</h1>
        <form name="validaInseriProduto" action="validaInseriProduto.jsp" method="POST">
            Nome: <input type="text" name="NOME" value="">  <br>
            Preço: <input type="number" name="PRECO" value="">  <br>
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>
<%-- 
    Document   : validaExcluirAdm
    Created on : 30/03/2016, 12:06:37
    Author     : Lucas
--%>
<%@page import="br.com.fatec.jdbc.modelo.Cliente" %>
<%@page import="br.com.fatec.jdbc.dao.ClienteDAO" %>

<%
    String login = request.getParameter("LOGIN");
    Cliente u1 = new Cliente();
    u1.setLogin(login);
    ClienteDAO dao = new ClienteDAO();
    dao.exclui(u1) ;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR CLIENTE</title>
    </head>
    <body>
        <h1>Cliente excluido</h1>
    </body>
</html>

<%-- 
    Document   : validaExcluirAdm
    Created on : 30/03/2016, 12:06:37
    Author     : Lucas
--%>
<%@page import="br.com.fatec.jdbc.modelo.Adm" %>
<%@page import="br.com.fatec.jdbc.dao.AdmDAO" %>

<%
    String login = request.getParameter("LOGIN");
    Adm u1 = new Adm();
    u1.setLogin(login);
    AdmDAO dao = new AdmDAO();
    dao.exclui(u1) ;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR ADM</title>
    </head>
    <body>
        <h1>Adm excluido</h1>
    </body>
</html>

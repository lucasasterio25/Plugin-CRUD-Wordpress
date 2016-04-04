<%-- 
    Document   : menu
    Created on : 03/04/2016, 15:01:41
    Author     : Lucas
--%>
<%@page import="br.com.fatec.jdbc.modelo.Cliente" %>
<%@page import="br.com.fatec.jdbc.dao.ClienteDAO" %>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");

    Cliente u1 = new Cliente();
    Cliente u2 = new Cliente();

    u2.setLogin(login);
    u2.setSenha(senha);
    
    ClienteDAO dao = new ClienteDAO();

    u2 = dao.validaLogin(u1);

    session.setAttribute("Logado", u2);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <a href="../usuario/listaProdutos.jsp"> Consultar produtos </a>
    </body>
</html>

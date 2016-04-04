<%-- 
    Document   : validaAlteraCliente
    Created on : 30/03/2016, 08:57:35
    Author     : Lucas
--%>
<%@page import="br.com.fatec.jdbc.modelo.Cliente" %>
<%@page import="br.com.fatec.jdbc.dao.ClienteDAO" %>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String endereco = request.getParameter("ENDERECO");
    String email = request.getParameter("EMAIL");
    Cliente u1 = new Cliente();
    u1.setLogin(login);
    u1.setSenha(senha);
    u1.setEndereco(endereco);
    u1.setEmail(email);
    ClienteDAO dao = new ClienteDAO();
    dao.altera(u1);
%>

<html>
    <head>
        <%@include file="../../inc/materalizeWeb.inc" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALTERAR CLIENTE</title>
    </head>
    <body>
       <h1>Login : <%=login%></h1> <br>
        <h1>Senha : <%=senha%></h1> <br>
        <h1>Endereço : <%=endereco%></h1> <br>
        <h1>E-mail : <%=email%></h1> <br>
    </body>
</html>

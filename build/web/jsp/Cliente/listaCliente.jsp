<%-- 
    Document   : listaAdm
    Created on : 30/03/2016, 09:12:45
    Author     : Lucas
--%>
<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Cliente" %>
<%@page import="br.com.fatec.jdbc.dao.ClienteDAO" %>
<!DOCTYPE html>
<%

    ClienteDAO dao = new ClienteDAO();
    List<Cliente> adms = dao.lista() ;
    
%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA CLIENTE</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Login">Login</th>
                  <th data-field="Senha">Senha</th>
                  <th data-field="Endereco">Endereco</th>
                  <th data-field="Email">Email</th>
              </tr>
            </thead>
            <tbody>
            <% for (Cliente us : adms) { %>
                    <tr>
                        <td><%=us.getLogin()%></td>
                        <td><%=us.getSenha()%></td>
                        <td><%=us.getEndereco()%></td>
                        <td><%=us.getEmail()%></td>
                       
                    </tr>
            <% } %>
            </tbody>
        </table>
    </body>
</html>

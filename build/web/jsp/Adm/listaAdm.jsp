<%-- 
    Document   : listaAdm
    Created on : 30/03/2016, 09:12:45
    Author     : Lucas
--%>
<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Adm" %>
<%@page import="br.com.fatec.jdbc.dao.AdmDAO" %>
<!DOCTYPE html>
<%

    AdmDAO dao = new AdmDAO();
    List<Adm> adms = dao.lista() ;
    
%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA ADM</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Login">Login</th>
                  <th data-field="Senha">Senha</th>
                  <th data-field="Endereco">Endereço</th>
                  <th data-field="Email">Email</th>
              </tr>
            </thead>
            <tbody>
            <% for (Adm us : adms) { %>
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

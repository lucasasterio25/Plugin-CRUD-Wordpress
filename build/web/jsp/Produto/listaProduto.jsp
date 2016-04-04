<%-- 
    Document   : listaProduto
    Created on : 30/03/2016, 14:39:50
    Author     : Lucas
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Produto" %>
<%@page import="br.com.fatec.jdbc.dao.ProdutoDAO" %>
<!DOCTYPE html>
<%
    ProdutoDAO dao = new ProdutoDAO();
    List<Produto> adms = dao.lista() ;
  
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA PRODUTO</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Preco">Preco</th>
                  <th data-field="Codigo">Codigo</th>
              </tr>
            </thead>
            <tbody>
            <% for (Produto us : adms) { %>
                    <tr>
                        <td><%=us.getNome()%></td>
                        <td><%=us.getPreco()%></td>
                        <td><%=us.getCodigo()%></td>
                    </tr>
            <% } %>
            </tbody>
        </table>
    </body>
</html>

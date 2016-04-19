<%-- 
    Document   : validaBuscaProduto
    Created on : 31/03/2016, 13:40:41
    Author     : Lucas
--%>
<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Produto" %>
<%@page import="br.com.fatec.jdbc.dao.ProdutoDAO" %>

<%
    String nome = request.getParameter("NOME");
    Produto u1 = new Produto();
    u1.setNome(nome);
    ProdutoDAO dao = new ProdutoDAO();
    dao.busca(u1);
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>PRODUTO</title>
    <body>
        <h2>Produtos pesquisados:</h2>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Preco">Preco</th>
                  <th data-field="Codigo">Codigo</th>
              </tr>
            </thead>
            <tbody>

                    <tr>
                        <td><%=u1.getNome()%></td>
                        <td><%=u1.getPreco()%></td>
                        <td><%=u1.getCodigo()%></td>
                    </tr>
            </tbody>
        </table>
    </body>
</html>

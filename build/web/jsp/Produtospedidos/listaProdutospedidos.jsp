
<%-- 
    Document   : listaAdm
    Created on : 30/03/2016, 09:12:45
    Author     : Lucas
--%>
<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Produtospedidos" %>
<%@page import="br.com.fatec.jdbc.dao.ProdutospedidosDAO" %>
<%@page import="br.com.fatec.jdbc.modelo.Produto" %>
<%@page import="br.com.fatec.jdbc.dao.ProdutoDAO" %>
<%@page import="br.com.fatec.jdbc.modelo.Pedido" %>
<%@page import="br.com.fatec.jdbc.dao.PedidoDAO" %>

<!DOCTYPE html>
<%
    ProdutospedidosDAO dao = new ProdutospedidosDAO();
    List<Produtospedidos> adms = dao.lista() ;
%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Codigo_produtos">Codigo produtos</th>
                  <th data-field="Codigo_pedidos">Codigo pedidos</th>
                  
                  <th data-field="Codigo">Codigo do produto</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Preco">Preco</th>
                  
                  
                  
                  <th data-field="Codigo_pedido">Codigo do pedido</th>
                  <th data-field="Data">Data</th>
                  <th data-field="Valor">Valor</th>

              </tr>
            </thead>
            <tbody>
            <% for (Produtospedidos us : adms) { %>
                    <tr>
                        <td><%=us.getCodigo_produtos()%></td>
                        <td><%=us.getCodigo_pedidos()%></td>
                        
                        <%
                        ProdutoDAO dao1 = new ProdutoDAO();
                        Produto p1 = new Produto();
                        p1.setCodigo(us.getCodigo_produtos());
                        dao1.busca2(p1);

                        PedidoDAO dao2 = new PedidoDAO();
                        Pedido c1 = new Pedido();
                        c1.setCodigo_pedido(us.getCodigo_pedidos());
                        dao2.busca2(c1);
                        %>

                        <td><%=p1.getCodigo()%></td>
                        <td><%=p1.getNome()%></td>
                        <td><%=p1.getPreco()%></td>
                        
                                  
                        <td><%=c1.getCodigo_pedido()%></td>
                        <td><%=c1.getData()%></td>
                        <td><%=c1.getValor()%></td>
                   
                    </tr>
            <% } %>
            </tbody>
        </table>
    </body>
</html>

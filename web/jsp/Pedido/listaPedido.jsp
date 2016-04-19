<%-- 
    Document   : listaPedido
    Created on : 30/03/2016, 17:17:52
    Author     : Lucas
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Pedido" %>
<%@page import="br.com.fatec.jdbc.dao.PedidoDAO" %>
<!DOCTYPE html>
<%

    PedidoDAO dao = new PedidoDAO();
    List<Pedido> adms = dao.lista() ;
    
%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA PEDIDO</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Codigo_pedido">Codigo_pedido</th>
                  <th data-field="Data">Data</th>
                  <th data-field="Valor">Valor</th>

              </tr>
            </thead>
            <tbody>
            <% for (Pedido us : adms) { %>
                    <tr>
                        <td><%=us.getCodigo_pedido()%></td>
                        <td><%=us.getData()%></td>
                        <td><%=us.getValor()%></td>

                       
                    </tr>
            <% } %>
            </tbody>
        </table>
    </body>
</html>

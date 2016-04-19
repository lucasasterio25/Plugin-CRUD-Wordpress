
<%@page import="br.com.fatec.jdbc.modelo.Adm" %>
<%@page import="br.com.fatec.jdbc.dao.AdmDAO" %>
<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");

    Adm u1 = new Adm();
    u1.setLogin(login);
    u1.setSenha(senha);

    AdmDAO dao = new AdmDAO();

    boolean u2 = dao.validaLogin(u1);
    
  
    session.setAttribute("UsuarioLogado", u2);
    
    %>
    
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>SISTEMA DE PIZZAS</title>
    <body>
        <% if (u2 = true) { %>
        
            <!-- Dropdown2 Trigger -->
            <a class='dropdown-button btn' data-beloworigin="true" href="../Adm/Menu.jsp" data-activates='dropdown2'>Manter Administrador</a>          
                <ul id='dropdown2' class='dropdown-content'>
  
                </ul>
            
             <a class='dropdown-button btn' data-beloworigin="true" href="../Produto/Menu.jsp" data-activates='dropdown2'>Manter Produto</a>          
                <ul id='dropdown2' class='dropdown-content'>

                </ul>
             
             <a class='dropdown-button btn' data-beloworigin="true" href="../Cliente/Menu.jsp" data-activates='dropdown2'>Manter Cliente</a>          
                <ul id='dropdown2' class='dropdown-content'>
  
                </ul>
             
             <a class='dropdown-button btn' data-beloworigin="true" href="../Pedido/Menu.jsp" data-activates='dropdown2'>Manter Pedido</a>          
                <ul id='dropdown2' class='dropdown-content'>
                </ul>
             
             <a class='dropdown-button btn' data-beloworigin="true" href="../Produto/buscaProduto.jsp" data-activates='dropdown2'>Buscar nome de Produto</a>          
                <ul id='dropdown2' class='dropdown-content'>
                </ul>
             
             <a class='dropdown-button btn' data-beloworigin="true" href="../Produtospedidos/listaProdutospedidos.jsp" data-activates='dropdown2'>Listar produtos pedidos</a>          
                <ul id='dropdown2' class='dropdown-content'>
                </ul>
     
        
        
        
        <% } else { %>
             <h1>USUÁRIO INVÁLIDO</h1>
        <% } %>
        
            
      
             
    </body>
</html>
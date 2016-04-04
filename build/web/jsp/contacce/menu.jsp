<%@page import="br.com.fatec.jdbc.modelo.Adm" %>
<%@page import="br.com.fatec.jdbc.dao.AdmDAO" %>
<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");

 
    Adm u2 = new Adm();

    u2.setLogin(login);
    u2.setSenha(senha);

    AdmDAO dao = new AdmDAO();

    u2 = dao.validaLogin(u2);

    session.setAttribute("AdmLogado", u2);
%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>SISTEMA DE PIZZAS</title>
    <body>
        
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
             
             
    </body>
</html>

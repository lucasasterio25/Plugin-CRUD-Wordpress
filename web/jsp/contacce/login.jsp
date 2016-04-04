<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LOGIN</title>
    <body>
        <div class="container"/>
            <h1>LOGIN</h1>
            <form name="login" action="menu.jsp" method="POST">
                <table>
                    <tr>
                        <td>    
                            Login:
                        </td>    
                        <td>
                            <input required title="Apenas letras e números" pattern="[a-zA-Z0-9]+" type="text" name="LOGIN" value="" > 
                        </td>    
                    </tr>
                    <tr>
                        <td>    
                            Senha:
                        </td>    
                        <td>
                            <input required title="Apenas letras e números" pattern="[a-zA-Z0-9]+" type="password" name="SENHA" value="" >                        </td>    
                    </tr>
                </table>
                <input type="submit" name="Enviar" value="Enviar"/>  <br>
                <a href="../Adm/alteraAdm.jsp"> Recuperar senha </a> <br>
                <a href="../Adm/inseriAdm.jsp"> Criar conta </a>
                
            </form>
        </div>
    </body>
</html>
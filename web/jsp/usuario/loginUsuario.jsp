<%-- 
    Document   : loginUsuario
    Created on : 03/04/2016, 14:58:58
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LOGIN</title>
    <body>
        <div class="container"/>
            <h1>LOGIN</h1>
            <form name="login" action="menuUsuario.jsp" method="POST">
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
                
            </form>
        </div>
    </body>
</html>
package org.apache.jsp.jsp.contacce;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatec.jdbc.modelo.Adm;
import br.com.fatec.jdbc.dao.AdmDAO;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/contacce/../../inc/materalizeWeb.inc");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");

    Adm u1 = new Adm();
    u1.setLogin(login);
    u1.setSenha(senha);

    AdmDAO dao = new AdmDAO();

    boolean u2 = dao.validaLogin(u1);
    
  
    session.setAttribute("UsuarioLogado", u2);
    
    
      out.write("\n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("    ");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Compiled and minified CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.css\">\r\n");
      out.write("    <!-- Compiled and minified JavaScript -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.2.2.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\n");
      out.write("    <title>SISTEMA DE PIZZAS</title>\n");
      out.write("    <body>\n");
      out.write("        ");
 if (u2 = true) { 
      out.write("\n");
      out.write("        \n");
      out.write("            <!-- Dropdown2 Trigger -->\n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href=\"../Adm/Menu.jsp\" data-activates='dropdown2'>Manter Administrador</a>          \n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("  \n");
      out.write("                </ul>\n");
      out.write("            \n");
      out.write("             <a class='dropdown-button btn' data-beloworigin=\"true\" href=\"../Produto/Menu.jsp\" data-activates='dropdown2'>Manter Produto</a>          \n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("             \n");
      out.write("             <a class='dropdown-button btn' data-beloworigin=\"true\" href=\"../Cliente/Menu.jsp\" data-activates='dropdown2'>Manter Cliente</a>          \n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("  \n");
      out.write("                </ul>\n");
      out.write("             \n");
      out.write("             <a class='dropdown-button btn' data-beloworigin=\"true\" href=\"../Pedido/Menu.jsp\" data-activates='dropdown2'>Manter Pedido</a>          \n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("                </ul>\n");
      out.write("             \n");
      out.write("             <a class='dropdown-button btn' data-beloworigin=\"true\" href=\"../Produto/buscaProduto.jsp\" data-activates='dropdown2'>Buscar nome de Produto</a>          \n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("                </ul>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("             <h1>USUÁRIO INVÁLIDO</h1>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("      \n");
      out.write("             \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

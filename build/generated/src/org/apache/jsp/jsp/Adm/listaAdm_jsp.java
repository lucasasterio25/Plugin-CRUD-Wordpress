package org.apache.jsp.jsp.Adm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import br.com.fatec.jdbc.modelo.Adm;
import br.com.fatec.jdbc.dao.AdmDAO;

public final class listaAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/Adm/../../inc/materalizeWeb.inc");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


    Adm usu = (Adm) session.getAttribute("UsuarioLogado");
    AdmDAO dao = new AdmDAO();
    List<Adm> adms = dao.lista() ;
    

      out.write("\n");
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
      out.write("    <title>LISTA ADM</title>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"striped responsive-table\">\n");
      out.write("            <thead>\n");
      out.write("              <tr>\n");
      out.write("                  <th data-field=\"Login\">Login</th>\n");
      out.write("                  <th data-field=\"Senha\">Senha</th>\n");
      out.write("                  <th data-field=\"Endereco\">Endereço</th>\n");
      out.write("                  <th data-field=\"Email\">Email</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            ");
 for (Adm us : adms) { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(us.getLogin());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(us.getSenha());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(us.getEndereco());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(us.getEmail());
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

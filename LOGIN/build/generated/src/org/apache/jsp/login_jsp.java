package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    response.setContentType("text/html;charset=UTF-8");
    request.setCharacterEncoding("utf-8");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>CodePen - Material Compact Login Animation</title>\n");
      out.write("        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>\n");
      out.write("        <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900&amp;subset=latin,latin-ext'><link rel=\"stylesheet\" href=\"./assets/Css/login.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- partial:index.partial.html -->\n");
      out.write("        <form action=\"login1\" method=\"post\">\n");
      out.write("            <div class=\"materialContainer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("\n");
      out.write("                    <div class=\"title\">LOGIN</div>\n");
      out.write("\n");
      out.write("                    <div class=\"input\">\n");
      out.write("                        <label for=\"name\">Username</label>\n");
      out.write("                        <input type=\"text\" name=\"name\" id=\"name\">\n");
      out.write("                        <span class=\"spin\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input\">\n");
      out.write("                        <label for=\"pass\">Password</label>\n");
      out.write("                        <input type=\"password\" name=\"pass\" id=\"pass\">\n");
      out.write("                        <span class=\"spin\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"button login\">\n");
      out.write("                        <button><span>GO</span> <i class=\"fa fa-check\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <a href=\"\" class=\"pass-forgot\">Forgot your password?</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <div class=\"overbox\">\n");
      out.write("                <div class=\"material-button alt-2\"><span class=\"shape\"></span></div>\n");
      out.write("\n");
      out.write("                <div class=\"title\">REGISTER</div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"regname\">Username</label>\n");
      out.write("                    <input type=\"text\" name=\"regname\" id=\"regname\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"regpass\">Password</label>\n");
      out.write("                    <input type=\"password\" name=\"regpass\" id=\"regpass\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"reregpass\">Repeat Password</label>\n");
      out.write("                    <input type=\"password\" name=\"reregpass\" id=\"reregpass\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"button\">\n");
      out.write("                    <button><span>NEXT</span></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <!-- partial -->\n");
      out.write("    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script><script  src=\"./assets/js/loginJS.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

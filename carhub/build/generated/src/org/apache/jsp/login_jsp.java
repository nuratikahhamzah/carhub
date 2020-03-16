package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/_head.jsp");
    _jspx_dependants.add("/_navbarcustomer.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<!------------------- Script ------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  \n");
      out.write("<!--image logo-->    \n");
      out.write("<link rel=\"icon\" href=\"img/mlogoo.png\">\n");
      out.write("\n");
      out.write("<!--opensource css--> \n");
      out.write("<link rel=\"stylesheet\" href=\"https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"https://getbootstrap.com/docs/4.1/examples/album/album.css\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!--style.css--> \n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" >");
      out.write("\n");
      out.write("<!------------------- ------ ------------------->\n");
      out.write("<title>CH - Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!----------------- Navigation ----------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-light bg-light sticky-top\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><img src=\"images/logo.png\" alt=\"boo\" width=\"150px\"></a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\"><a class=\"nav-link\" href=\"1homecust.php\"><i class=\"fas fa-home\"></i> Home</a></li>\n");
      out.write("      <li class=\"nav-item\"><a class=\"nav-link\" href=\"3carlistcust.php\"><i class=\"fas fa-car\"></i> Car</a></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("      <li class=\"nav-item\"><a class=\"nav-link\" href=\"5login.php\"><i class=\"fas fa-sign-in-alt\"></i> Log In</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("<!----------------- ---------- ----------------->\n");
      out.write("\n");
      out.write("<!------------------- Coding ------------------->\n");
      out.write("<form action=\"custLogin\" class=\"form-signin\" method=\"POST\">\n");
      out.write("      <h1 class=\"h3 mb-3 font-weight-normal\">Please sign in</h1><hr>\n");
      out.write("      <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\" required autofocus >\n");
      out.write("      <br>\n");
      out.write("      <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required><br>\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\"  name=\"submit\">Sign in</button>\n");
      out.write("      <br>\n");
      out.write("     \n");
      out.write("  <div class=\"col-12\">\n");
      out.write("    <hr>\n");
      out.write("     <p class=\"lead\"> Dont have an account? <a href=\"5register.php\">Register</a> Here!</p>\n");
      out.write("    <hr>\n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted\">&copy; 2017-2018 CarHub Company</p>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

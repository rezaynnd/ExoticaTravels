package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Templates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>\n");
      out.write("    <tr>\n");
      out.write("        <td bgcolor='#000080' align center='center'>\n");
      out.write("            <font style='font-family: Arial Rounded MT Bold, Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>\n");
      out.write("        </td>\n");
      out.write("        <td bgcolor='#000080' align='left' width='150'>\n");
      out.write("            <img src='Images/ikon.jpg' width='200' height='120' align='right'/>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("<table bgcolor=\"white\" border=\"0\" align=\"top\" width=\"100%\" style=\"height:470px\">\n");
      out.write("    <tr>\n");
      out.write("        <td style=\"width: 216px;\" colspan=\"1\" rowspan=\"4\"><img id=\"imgchng\" style=\"width: 215px; height: 560px;\" alt=\"\" src=\"Images/alam.jpg\"></td>\n");
      out.write("        </tr>\n");
      out.write("</table>\n");
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

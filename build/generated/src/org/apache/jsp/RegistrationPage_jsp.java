package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_password_property_nobody.release();
    _jspx_tagPool_html_text_property_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("            <td valign=\"top\">\n");
      out.write("                ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                </body>            \n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/RegistrationAction");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <table cellspacing='10' align='center'>\n");
        out.write("                        <tr>\n");
        out.write("                            <td><font color='darkblue' size='+2'>New User Registration Form\n");
        out.write("                                </tr>\n");
        out.write("                                </td>\n");
        out.write("                                </table>\n");
        out.write("                        <table cellspacing='10' align='center'border='2' bordercolor='black'>\n");
        out.write("                        <tr><td bordercolor='white'>User Name:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'>Address:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'>State:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'>Country:<td COLSPAN='2' bordercolor='white'>");
        if (_jspx_meth_html_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <tr><td bordercolor='white'></br>\n");
        out.write("                        <tr><td bordercolor='white'><input type='Submit'value='Submit'>\n");
        out.write("                                <td bordercolor='white'><input type='RESET' text='Reset'>\n");
        out.write("                    </table>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("username");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("userid");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setProperty("password");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_1 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_1.setPageContext(_jspx_page_context);
    _jspx_th_html_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_1.setProperty("reenterpassword");
    int _jspx_eval_html_password_1 = _jspx_th_html_password_1.doStartTag();
    if (_jspx_th_html_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_1);
      return true;
    }
    _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setProperty("address");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setProperty("state");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_4.setProperty("country");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-09-30 04:49:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("		<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("		<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
String id =""; 
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/top.jsp", out, false);
      out.write("	\r\n");
      out.write("	<form name=\"login_frm\" action=\"/serverweb/member/login.do\" method=\"post\">\r\n");
      out.write("		<table cellpadding=\"0\" cellspacing=5 width=\"815\" bgcolor=#f3f3f3\r\n");
      out.write("			border=0>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td bgcolor=#ffffff height=100% align=center valign=top>\r\n");
      out.write("					<table cellpadding=0 cellspacing=0 border=0 width=710>\r\n");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>\r\n");
      out.write("								<table cellpadding=\"0\" cellspacing=0 width=\"100%\"\r\n");
      out.write("									bgcolor=#f7f7f7 border=0>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td bgcolor=#ffffff align=center>\r\n");
      out.write("\r\n");
      out.write("											<table cellpadding=\"0\" cellspacing=\"0\" border=0 align=center\r\n");
      out.write("												width=678>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<td align=center width=353>\r\n");
      out.write("\r\n");
      out.write("														<table cellpadding=\"0\" cellspacing=\"0\" border=0 width=353>\r\n");
      out.write("															<tr>\r\n");
      out.write("																<td>\r\n");
      out.write("																	<table cellpadding=\"0\" cellspacing=\"0\" border=0>\r\n");
      out.write("\r\n");
      out.write("																		<tr>\r\n");
      out.write("																			<td colspan=3><img\r\n");
      out.write("																				src=\"/serverweb/images/page_login.gif\"></td>\r\n");
      out.write("																		</tr>\r\n");
      out.write("																		<tr>\r\n");
      out.write("																			<td height=25></td>\r\n");
      out.write("																		</tr>\r\n");
      out.write("																		<tr>\r\n");
      out.write("																			<td background=\"/serverweb/images/inputBg.gif\"><img\r\n");
      out.write("																				src=\"/serverweb/images/login_id.gif\"></td>\r\n");
      out.write("																			<td background=\"/serverweb/images/inputBg.gif\"><input\r\n");
      out.write("																				type=\"text\" name=\"id\" size=\"15\" class=\"grayinput\"\r\n");
      out.write("																				tabindex=1 style=\"width: 156;\"\r\n");
      out.write("																				 value=\"");
      out.print( id);
      out.write("\"></td>\r\n");
      out.write("																			<td rowspan=3 style=\"padding-left: 10\" valign=bottom>\r\n");
      out.write("																			<input\r\n");
      out.write("																				type='image' src=\"/serverweb/images/btn_login.gif\"\r\n");
      out.write("																				border=\"0\" tabindex=3></td>\r\n");
      out.write("																		</tr>\r\n");
      out.write("																		<tr>\r\n");
      out.write("																			<td height=10></td>\r\n");
      out.write("																		</tr>\r\n");
      out.write("																		<tr>\r\n");
      out.write("																			<td background=\"/serverweb/images/inputBg.gif\"><img\r\n");
      out.write("																				src=\"/serverweb/images/login_pass.gif\"></td>\r\n");
      out.write("																			<td background=\"/serverweb/images/inputBg.gif\"><input\r\n");
      out.write("																				type=\"password\" name=\"pass\" size=\"15\"\r\n");
      out.write("																				class=\"grayinput\" tabindex='2' style='width: 156;'>\r\n");
      out.write("																			</td>\r\n");
      out.write("																		</tr>\r\n");
      out.write("																		<tr>\r\n");
      out.write("																			<td colspan=3 align=right\r\n");
      out.write("																				style=\"padding-right: 9; padding-top: 12\"><span\r\n");
      out.write("																				style=\"display: inline\"><label\r\n");
      out.write("																					for=\"member_id_save\"><input type=\"checkbox\"\r\n");
      out.write("																						name=\"member_id_save\" id=\"member_id_save\"\r\n");
      out.write("																						value=\"T\" ");
if(id.length()!=0) 
      out.print( "checked" );
      out.write(" />아이디저장</label> </span></td>\r\n");
      out.write("																		</tr>\r\n");
      out.write("																	</table>\r\n");
      out.write("																</td>\r\n");
      out.write("															</tr>\r\n");
      out.write("															<tr>\r\n");
      out.write("																<td colspan=3></td>\r\n");
      out.write("															</tr>\r\n");
      out.write("\r\n");
      out.write("														</table>\r\n");
      out.write("\r\n");
      out.write("													</td>\r\n");
      out.write("\r\n");
      out.write("													<td style=\"padding-left: 60; padding-top: 60\"></td>\r\n");
      out.write("												</tr>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<td colspan=3 style=\"padding-top: 20\" style=padding-left:40></td>\r\n");
      out.write("												</tr>\r\n");
      out.write("											</table>\r\n");
      out.write("\r\n");
      out.write("										</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</table>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td height=30></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td height=49></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</table>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

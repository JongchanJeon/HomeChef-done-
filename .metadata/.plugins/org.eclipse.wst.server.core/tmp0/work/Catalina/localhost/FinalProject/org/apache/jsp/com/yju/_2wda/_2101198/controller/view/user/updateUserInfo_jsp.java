/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-12-04 09:37:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.com.yju._2wda._2101198.controller.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateUserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Insert title here</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("    <style>\r\n");
      out.write("        form {\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            height: 200px;\r\n");
      out.write("            width: 700px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #flexCheckDefault {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <form  method =\"post\" action=\"/FinalProject/userUpdate.be\">\r\n");
      out.write("        <img src=\"../src/main/webapp/com/yju/2wda/2101198/controller/image/homecheflogo.png\" alt=\"이미지 로고 없음\" height=\"200px\" width=\"200px\"\r\n");
      out.write("            onclick=\"location='/FinalProject/index.jsp'\">\r\n");
      out.write("        <br />\r\n");
      out.write("        <h3>회원 정보 수정</h3>\r\n");
      out.write("        <br />\r\n");
      out.write("        <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">아이디</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"아이디를 입력하세요.\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\" value = ");
      out.print(session.getAttribute("login_id") );
      out.write(" name = \"user_id\" readonly>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">비밀번호</span>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" placeholder=\"비밀번호를 입력하세요.\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\" value = ");
      out.print(session.getAttribute("loginUser_pw"));
      out.write(" name = \"user_pw\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">전화번호</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"전화번호를 입력하세요.\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\" value = ");
      out.print(session.getAttribute("loginUser_number"));
      out.write(" name = \"user_number\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">닉네임</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"닉네임을 입력하세요.\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\" value = ");
      out.print(session.getAttribute("loginUser_name"));
      out.write(" name = \"user_name\" readonly>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">주소</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"주소를 입력하세요.\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\" value = ");
      out.print(session.getAttribute("loginUser_address"));
      out.write(" name = \"user_address\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br />\r\n");
      out.write("\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">회원수정</button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

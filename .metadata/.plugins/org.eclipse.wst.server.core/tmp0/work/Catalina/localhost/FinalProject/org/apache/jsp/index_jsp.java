/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-11-22 04:26:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/./com/yju/2wda/2101198/controller/view/default/header.jsp", Long.valueOf(1669091212155L));
    _jspx_dependants.put("/./com/yju/2wda/2101198/controller/view/default/footer.jsp", Long.valueOf(1669090806829L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Home Chef(홈 셰프)</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write("	img {\r\n");
      out.write("		float:left;\r\n");
      out.write("	}\r\n");
      out.write("	#carouselExampleInterval {\r\n");
      out.write("		width : 900px;\r\n");
      out.write("		padding : 70px;\r\n");
      out.write("  		text-align : center;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Home Chef header</title>\r\n");
      out.write("<style>\r\n");
      out.write("	#search {\r\n");
      out.write("		width : 700px;\r\n");
      out.write("		padding : 20px;\r\n");
      out.write("	}\r\n");
      out.write("	#searchbtn {\r\n");
      out.write("		width : 100px;\r\n");
      out.write("	}\r\n");
      out.write("	#navbar {\r\n");
      out.write("		width : 500px;\r\n");
      out.write("	}\r\n");
      out.write("	#center {\r\n");
      out.write("		width : 900px;\r\n");
      out.write("		margin : 0 auto;\r\n");
      out.write("  		text-align : center;\r\n");
      out.write("	}\r\n");
      out.write("	#login {\r\n");
      out.write("		float:right; \r\n");
      out.write("		padding-top: 50px;\r\n");
      out.write("        padding-right: 300px;\r\n");
      out.write("        padding-bottom: 30px;\r\n");
      out.write("\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 로그인 회원가입 페이지 -->\r\n");
      out.write("<div id =\"login\" class=\"btn-group\" role=\"group\" aria-label=\"Basic outlined example\">\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-outline-primary\">로그인</button>\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-outline-primary\">회원가입</button>\r\n");
      out.write("</div><br/><br/><br/><br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 로고, 상품검색, 네비게이션 바-->\r\n");
      out.write("<div id =\"center\">\r\n");
      out.write("<img src=\"./com/yju/2wda/2101198/controller/image/homecheflogo.png\" class=\"img-thumbnail\" alt=\"...\" height=\"150px\" width =\"150px\">\r\n");
      out.write("	<form  class=\"d-flex\" role=\"search\">\r\n");
      out.write("        <input id = \"search\" class=\"form-control me-2\" type=\"search\" placeholder=\"상품 검색 : \" aria-label=\"Search\" >\r\n");
      out.write("        <button id = \"searchbtn\" class=\"btn btn-outline-success\" type=\"submit\">검색</button>\r\n");
      out.write("    </form><br/>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Home Chef</a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarText\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">메인</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">출장 요리구매</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <span class=\"navbar-text\">\r\n");
      out.write("        2101198_WD2A\r\n");
      out.write("      </span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write(" <center>\r\n");
      out.write("<div id=\"carouselExampleInterval\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\" data-bs-interval=\"10000\">\r\n");
      out.write("      <img src=\"./com/yju/2wda/2101198/controller/image/food1.jpg\" class=\"d-block w-100\"  height=\"500px\" width =\"1300px\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\" data-bs-interval=\"2000\">\r\n");
      out.write("      <img src=\"./com/yju/2wda/2101198/controller/image/food2.jpg\" class=\"d-block w-100\"  height=\"500px\" width =\"1300px\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"./com/yju/2wda/2101198/controller/image/food3.jpg\" class=\"d-block w-100\"  height=\"500px\" width =\"1800px\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleInterval\" data-bs-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"visually-hidden\">이전</span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleInterval\" data-bs-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"visually-hidden\">다음</span>\r\n");
      out.write("  </button>\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("<br/>\r\n");
      out.write("<hr/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("/*푸터입니당*/\r\n");
      out.write("    .footer {\r\n");
      out.write("        background: #fff; width: 100%; position: relative; min-width: 1200px;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link {\r\n");
      out.write("        border-bottom:1px solid #eee; border-top:1px solid #e6e6e6;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link .link_wrap ul {\r\n");
      out.write("        width: 1200px; margin: 0 auto; display: inline-block; float: left;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link .link_wrap ul li {\r\n");
      out.write("        display: inline-block; vertical-align: middle; border-left: 1px solid #c3c3c3; margin: 0 0px 0 -1px;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link .link_wrap ul li:first-child {\r\n");
      out.write("        border-left:0;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link .link_wrap ul li:nth-child(2) {\r\n");
      out.write("        border-left:0;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link .link_wrap ul li a {\r\n");
      out.write("        display:block; font-size:10pt; padding:0 5px; letter-spacing: -1px;\r\n");
      out.write("    }\r\n");
      out.write("    .area_link .link_wrap ul li a:hover {\r\n");
      out.write("        text-decoration:underline\r\n");
      out.write("    }\r\n");
      out.write("    .area_txt {\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    .area_info {\r\n");
      out.write("        text-align: center; padding: 20px 0px; font-size: 12px; color: #888; line-height: 19px; letter-spacing: -1px;\r\n");
      out.write("    }\r\n");
      out.write("    .link_wrap {\r\n");
      out.write("        width: 1100px; margin: 0 auto; padding: 11px 0px; text-align: center; display: table;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <div class=\"footer\"  style=\"display:;\">\r\n");
      out.write("        <div class=\"area_link\">\r\n");
      out.write("            <div class=\"link_wrap\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <li><a href=\"/board/lists/44\">업무제휴문의</a></li>\r\n");
      out.write("                    <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("                    <li><a href=\"#\">이용안내</a></li>\r\n");
      out.write("                    <li><a href=\"#\">개인정보취급방침</a></li>\r\n");
      out.write("                    <li><a href=\"http://m.gosutop.com\">모바일버전보기(BETA)</a></li>\r\n");
      out.write("                 </ul>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"area_info\">\r\n");
      out.write("본 사이트에 표시된 데이터는 항상 실시간 업데이트되거나 정확한 것은 아니라는 것을 알려드립니다. <br>\r\n");
      out.write("모든 CFD(주가, 지수, 선물) 및 암호화폐는 외환 가격 거래소가 아니라 시장 형성자(market maker)가 제공하므로 가격은 정확하지 않거나 실제 시장과 다를 수 있습니다. <br>\r\n");
      out.write("또한 GrowYourInsight가 제공하는 CFD(주가,지수,선물) 및 암호화폐 프로그램 가격은 지시적이며 거래를 목적으로 사용하기에는 적합하지 않다는 것을 의미합니다.<br />\r\n");
      out.write("따라서 당사는 이 결과로 발생한 손실에 대해서는 책임지지 않습니다.<br />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("문의: ethereummom@gmail.com 전화: 010-xxxx-xxxx <br />\r\n");
      out.write("Copyrightⓒ 이더맘, All Right Reserved.\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\r\n");
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

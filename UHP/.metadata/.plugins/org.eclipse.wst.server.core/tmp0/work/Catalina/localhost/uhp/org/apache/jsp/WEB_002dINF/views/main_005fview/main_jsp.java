/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-02-02 03:44:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main_005fview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write('\r');
      out.write('\n');

String page_num=request.getParameter("page_num");



      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("	<script src=\"resources/JSs/ajax/ajax.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	window.onload=ajaxLoad('board_kit?&page_num=null&post_board_name=ALL&search_mode=post_title&search_str=&main=main','#board_kit_container');\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("		function get_board_kit(page_num,post_board_name,search_mode,search_str){\r\n");
      out.write("			$.ajax({ \r\n");
      out.write("			type: 'get' , \r\n");
      out.write("			url: 'board_kit?page_num='+page_num+'&post_board_name='+post_board_name+'&search_mode='+search_mode+'&search_str='+search_str+'&main=main' , \r\n");
      out.write("			success: function(data) { \r\n");
      out.write("				$(\"#board_kit_container\").html(data); \r\n");
      out.write("				} \r\n");
      out.write("			}); \r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("	</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- top bar  -->\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script><script src=\"resources/JSs/bar_js/get_top_bar.js\"></script><div id=\"top_bar\" ></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"context_main\" style=\"margin: auto; width: 1260px;\" >\r\n");
      out.write("<!-- left bar -->\r\n");
      out.write("	<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script><script src=\"resources/JSs/bar_js/get_left_bar.js\"></script><div id=\"left_bar\" ></div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("<div class=\"context_container\" >\r\n");
      out.write("<!-- \r\n");
      out.write(" context-container은 bar들이 자리를 차지고하고 남은 공간.즉 페이지의 내용이 들어갈 공간이다.\r\n");
      out.write(" bar를 참조하는 페이지라면 꼭 내용을 class=\"context-container\"로 설정한 div안에 담아준다.\r\n");
      out.write("  추가적인 스타일은 left_bar.css에 정의 되어있다. \r\n");
      out.write("  크롬 화면창 크기가 작아질 때 float:left인 div가 내려가는 현상은 min-width 속성값을 조정하여 내용이 짤려 내려가지 않도록 하면 된다.\r\n");
      out.write(" -->\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<div id=\"board_kit_container\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
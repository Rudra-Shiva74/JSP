/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.11
 * Generated at: 2023-08-24 11:03:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- <div style=\"font-size: 40px;\">\r\n");
      out.write("        <i class=\"fa-solid fa-heart like\" style=\"color: red; display: none;\"></i>\r\n");
      out.write("        <i class=\"fa-regular fa-heart dishlike\" style=\"color: red;\"></i> -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"../Project/About.jpeg \" class=\"img-fluid\" alt=\"...\"\r\n");
      out.write("			style=\"height: 11rem;\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("			<p class=\"card-text\">Some quick example text to build on the card\r\n");
      out.write("				title and make up the bulk of the card's content.</p>\r\n");
      out.write("			<div class=\"d-flex justify-content-between m-0 p-0\">\r\n");
      out.write("				<p class=\"m-0 p-0 likep\">12</p>\r\n");
      out.write("				<p class=\"m-0 p-0 comment\">12</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"d-flex justify-content-between\">\r\n");
      out.write("\r\n");
      out.write("				<form action=\"Check\" method=\"post\" id=\"formlike\">\r\n");
      out.write("					<input type=\"hidden\" name=\"like\" id=\"likecount\"\r\n");
      out.write("						class=\"d-block m-0 p-0 border border-light\" readonly>\r\n");
      out.write("					<button type=\"submit\"\r\n");
      out.write("						class=\"m-0 p-0 btn btn-light bg-light border border-light\">\r\n");
      out.write("						<i class=\"fa-solid fa-heart like\"\r\n");
      out.write("							style=\"color: red; display: none;\"></i> <i\r\n");
      out.write("							class=\"fa-regular fa-heart dishlike\" style=\"color: red;\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("				</form>\r\n");
      out.write("\r\n");
      out.write("				<button class=\"btn btn-outline-primary\">Read More..</button>\r\n");
      out.write("\r\n");
      out.write("				<form action=\"\" method=\"post\" id=\"formcomment\">\r\n");
      out.write("					<button type=\"submit\"\r\n");
      out.write("						class=\"m-0 p-0 btn btn-light bg-light border border-light\">\r\n");
      out.write("						<input type=\"hidden\" name=\"\" id=\"\" value=\"1\"\r\n");
      out.write("							class=\"d-block m-0 p-0 border border-light\" readonly> <i\r\n");
      out.write("							class=\"fa-solid fa-comment\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\"\r\n");
      out.write("	integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(() => {\r\n");
      out.write("        $('#formlike').on(\"submit\", function (e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            console.log(\"hhhh\");\r\n");
      out.write("            let form = new FormData(this);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"Check\",\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                data: form,\r\n");
      out.write("                success: function (data, textStatus, jqxhr) {\r\n");
      out.write("                    console.log(\"done\");\r\n");
      out.write("                },\r\n");
      out.write("                error: function (jqxhr, textStatus, errorThrown) {\r\n");
      out.write("                    console.log(\"not done\");\r\n");
      out.write("                }, processData: false,\r\n");
      out.write("                contentType: false\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("        });$(\".dishlike\").on(\"click\", function () {\r\n");
      out.write("            $(\".like\").show();\r\n");
      out.write("            $(this).hide();\r\n");
      out.write("            let val = parseInt($(\".likep\").text()) + 1;\r\n");
      out.write("            $(\".likep\").text(val);\r\n");
      out.write("            $(\"#likecount\").val(val);\r\n");
      out.write("            // console.log($(\"#likecount\").val());\r\n");
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("        $(\".like\").on(\"click\", function () {\r\n");
      out.write("            $(this).hide();\r\n");
      out.write("            $(\".dishlike\").show();\r\n");
      out.write("            let val = parseInt($(\".likep\").text()) - 1;\r\n");
      out.write("            $(\".likep\").text(val);\r\n");
      out.write("            // console.log(val);\r\n");
      out.write("            $(\"#likecount\").val(val);\r\n");
      out.write("            // console.log($(\"#likecount\").val());\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
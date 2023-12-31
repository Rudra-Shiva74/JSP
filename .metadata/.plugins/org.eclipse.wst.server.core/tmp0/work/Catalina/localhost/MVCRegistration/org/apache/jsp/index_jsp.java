/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.11
 * Generated at: 2023-08-22 17:42:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>MVC and MySQL</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-primary\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("				<form action=\"RegisterServlet\" method=\"post\" id=\"form\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-header bg-dark text-white\">\r\n");
      out.write("							<h3>Java Registration application using MVC and MySQL</h3>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card-body bg-secondary\">\r\n");
      out.write("							<div class=\"form-group mb-3\">\r\n");
      out.write("								<input type=\"text\" name=\"fullname\"\r\n");
      out.write("									placeholder=\"Enter your fullname\" class=\"form-control\"\r\n");
      out.write("									autocomplete=\"off\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group mb-3\">\r\n");
      out.write("								<input type=\"email\" name=\"email\" placeholder=\"Enter your email\"\r\n");
      out.write("									class=\"form-control\" autocomplete=\"off\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group mb-3\">\r\n");
      out.write("								<input type=\"text\" name=\"username\"\r\n");
      out.write("									placeholder=\"Enter your usernmae\" class=\"form-control\"\r\n");
      out.write("									autocomplete=\"off\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group mb-3\">\r\n");
      out.write("								<input type=\"password\" name=\"password\"\r\n");
      out.write("									placeholder=\"Enter your password\" class=\"form-control\"\r\n");
      out.write("									autocomplete=\"off\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group mb-3\">\r\n");
      out.write("								<input type=\"password\" name=\"conpassword\"\r\n");
      out.write("									placeholder=\"Enter your confirm password\" class=\"form-control\"\r\n");
      out.write("									autocomplete=\"off\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card-footer text-center bg-dark text-white\">\r\n");
      out.write("							<button type=\"submit\" name=\"submit\" value=\"submit\"\r\n");
      out.write("								class=\"btn btn-outline-light\">Submit</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	function validate() {\r\n");
      out.write("		var fullname = document.form.fullname.value;\r\n");
      out.write("		var email = document.form.email.value;\r\n");
      out.write("		var username = document.form.username.value;\r\n");
      out.write("		var password = document.form.password.value;\r\n");
      out.write("		var conpassword = document.form.conpassword.value;\r\n");
      out.write("\r\n");
      out.write("		if (fullname == null || fullname == \"\") {\r\n");
      out.write("			alert(\"Full Name can't be blank\");\r\n");
      out.write("			return false;\r\n");
      out.write("		} else if (email == null || email == \"\") {\r\n");
      out.write("			alert(\"Email can't be blank\");\r\n");
      out.write("			return false;\r\n");
      out.write("		} else if (username == null || username == \"\") {\r\n");
      out.write("			alert(\"Username can't be blank\");\r\n");
      out.write("			return false;\r\n");
      out.write("		} else if (password.length < 6) {\r\n");
      out.write("			alert(\"Password must be at least 6 characters long.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\"\r\n");
      out.write("	integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(()=>{\r\n");
      out.write("		console.log(\"Hele\");\r\n");
      out.write("		$(\"#form\").on(\"submit\",function(event){\r\n");
      out.write("			event.preventDefault();\r\n");
      out.write("			let form=new FormData(this);\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url:\"RegisterServlet\",\r\n");
      out.write("				type:\"POST\",\r\n");
      out.write("				data:form,\r\n");
      out.write("				success:function(data,textstatus,jqxhr)\r\n");
      out.write("				{\r\n");
      out.write("					if(data.trim()==='DONE')\r\n");
      out.write("						{\r\n");
      out.write("						swal({\r\n");
      out.write("							  title: \"Done\",\r\n");
      out.write("							  text: \"You Register Successfully!\",\r\n");
      out.write("							  icon: \"success\",\r\n");
      out.write("							  button: \"Login\",\r\n");
      out.write("							}).then((value) => {\r\n");
      out.write("								  window.location=\"login.jsp\";\r\n");
      out.write("							});\r\n");
      out.write("						}\r\n");
      out.write("					else\r\n");
      out.write("						{\r\n");
      out.write("						swal({\r\n");
      out.write("							  title: \"Sorry\",\r\n");
      out.write("							  text: data,\r\n");
      out.write("							  icon: \"error\",\r\n");
      out.write("							  button: \"OK\",\r\n");
      out.write("							}).then((value) => {\r\n");
      out.write("								  window.location=\"index.jsp\";\r\n");
      out.write("							});\r\n");
      out.write("						}\r\n");
      out.write("					\r\n");
      out.write("				},\r\n");
      out.write("				error:function(jqxhr,textstatus,error)\r\n");
      out.write("				{\r\n");
      out.write("					console.log(\"error\");\r\n");
      out.write("				},\r\n");
      out.write("				processData:false,\r\n");
      out.write("				contentType:false\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
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

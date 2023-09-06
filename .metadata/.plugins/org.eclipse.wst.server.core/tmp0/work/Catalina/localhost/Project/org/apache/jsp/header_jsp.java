/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.11
 * Generated at: 2023-08-24 16:31:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.tech.blog.entity.User;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.tech.blog.entity.User");
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
      			"errorpage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

User user = (User) session.getAttribute("user");
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

      out.write("\r\n");
      out.write("<!-- This is navbar -->\r\n");
      out.write("<nav class=\"navbar sticky-top bg-primary navbar-expand-lg\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<a class=\"navbar-brand text-light fw-bold\" href=\"./\"><i\r\n");
      out.write("			class=\"fa-sharp fa-solid fa-microchip\"></i> TechBlog</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a\r\n");
      out.write("					class=\"nav-link active text-light fw-bold\" aria-current=\"page\"\r\n");
      out.write("					href=\"./\">Home</a></li>\r\n");
      out.write("				<!-- <li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle text-light fw-bold\" href=\"#\"\r\n");
      out.write("					role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("						Categories </a>\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a class=\"dropdown-item \" href=\"#\">Programing\r\n");
      out.write("								Language</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Project\r\n");
      out.write("								implementation</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item \" href=\"#\">Data Strucutre</a></li>\r\n");
      out.write("					</ul></li> -->\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light fw-bold\"\r\n");
      out.write("					href=\"post.jsp\" aria-disabled=\"true\"><i\r\n");
      out.write("						class=\"fa-solid fa-signs-post fa-shake\"></i> Post List</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light fw-bold\"\r\n");
      out.write("					href=\"about.jsp\" aria-disabled=\"true\"><i\r\n");
      out.write("						class=\"fa-solid fa-address-card\"></i> About</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light fw-bold\"\r\n");
      out.write("					aria-disabled=\"true\" href=\"contactus.jsp\"><i\r\n");
      out.write("						class=\"fa-sharp fa-regular fa-id-badge\"></i> Contact us</a></li>\r\n");
      out.write("				");

				if (user == null) {
				
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light fw-bold\"\r\n");
      out.write("					aria-disabled=\"true\" href=\"login.jsp\"><i\r\n");
      out.write("						class=\"fa-solid fa-user fa-bounce\"></i> Login</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light fw-bold\"\r\n");
      out.write("					aria-disabled=\"true\" href=\"register.jsp\"><i\r\n");
      out.write("						class=\"fa-solid fa-right-to-bracket\"></i> Signup</a></li>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			");

			if (user == null) {
			
      out.write("\r\n");
      out.write("			<form class=\"d-flex\" role=\"search\">\r\n");
      out.write("				<input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\"\r\n");
      out.write("					aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			");

			} else {
			
      out.write("\r\n");
      out.write("			<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><button\r\n");
      out.write("						class=\"nav-link text-light fw-bold\" aria-disabled=\"true\"\r\n");
      out.write("						data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\r\n");
      out.write("						<i class=\"fa-solid fa-user fa-bounce\"></i>\r\n");
      out.write("						");
      out.print(user.getName());
      out.write("</button></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light fw-bold\"\r\n");
      out.write("					aria-disabled=\"true\" href=\"Logout\"><i\r\n");
      out.write("						class=\"fa-solid fa-right-to-bracket\"></i> Logout</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");

if (user != null) {

      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\r\n");
      out.write("	aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\">\r\n");
      out.write("		<div class=\"modal-content Abhi\">\r\n");
      out.write("			<div class=\"modal-header bg-primary text-light\">\r\n");
      out.write("				<h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">TechBlog</h1>\r\n");
      out.write("				<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\"></button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-body\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"col-12 col-lg-12 col-md-12 d-flex justify-content-center\"\r\n");
      out.write("							style=\"height: 100px;\">\r\n");
      out.write("\r\n");
      out.write("							<img src=\"images/");
      out.print(user.getImage());
      out.write("\" alt=\"\" class=\"img-fluid\"\r\n");
      out.write("								style=\"border-radius: 50%; width: 100px\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"col-12 col-lg-12 col-md-12 d-flex justify-content-center\">\r\n");
      out.write("							<h5>");
      out.print(user.getName());
      out.write("</h5>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<table class=\"table\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">Email</th>\r\n");
      out.write("									<td>");
      out.print(user.getName());
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">Gender</th>\r\n");
      out.write("									<td>");
      out.print(user.getGender());
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">Joining Date</th>\r\n");
      out.write("									<td>");
      out.print(user.getDatetime());
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					<h4>About :</h4>\r\n");
      out.write("					<p>");
      out.print(user.getAbout());
      out.write("</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-footer\">\r\n");
      out.write("				<button type=\"button\"\r\n");
      out.write("					class=\"btn btn-primary text-light fw-bold Abhishek\">Edit</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"modal-content Tiwari\" style=\"display: none;\">\r\n");
      out.write("			<div class=\"modal-header bg-primary text-light\">\r\n");
      out.write("				<h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">TechBlog</h1>\r\n");
      out.write("				<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\"></button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<form action=\"Profilupdate\" method=\"post\" id=\"form\"\r\n");
      out.write("				enctype=\"multipart/form-data\">\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<div class=\"container-fluid\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div\r\n");
      out.write("								class=\"col-12 col-lg-12 col-md-12 d-flex justify-content-center\"\r\n");
      out.write("								style=\"height: 100px;\">\r\n");
      out.write("								<img src=\"images/");
      out.print(user.getImage());
      out.write("\" alt=\"\" class=\"img-fluid\"\r\n");
      out.write("									style=\"border-radius: 50%; width: 100px\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div\r\n");
      out.write("								class=\"col-12 col-lg-12 col-md-12 d-flex justify-content-center\">\r\n");
      out.write("								<h5>");
      out.print(user.getName());
      out.write("</h5>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"mb-3 row\">\r\n");
      out.write("						<label for=\"Name\" class=\"col-sm-2 col-form-label\">Username</label>\r\n");
      out.write("						<div class=\"col-sm-10\">\r\n");
      out.write("							<input type=\"text\" class=\"form-control\" name=\"name\"\r\n");
      out.write("								value=\"");
      out.print(user.getName());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"mb-3 row\">\r\n");
      out.write("						<label for=\"Name\" class=\"col-sm-2 col-form-label\">Gender</label>\r\n");
      out.write("						<div class=\"col-sm-10\">\r\n");
      out.write("							<input type=\"text\" class=\"form-control\" name=\"gender\"\r\n");
      out.write("								value=\"");
      out.print(user.getGender());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"mb-3 row\">\r\n");
      out.write("						<label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Password</label>\r\n");
      out.write("						<div class=\"col-sm-10\">\r\n");
      out.write("							<input type=\"password\" class=\"form-control\" id=\"inputPassword\"\r\n");
      out.write("								value=\"");
      out.print(user.getPassword());
      out.write("\" name=\"password\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"mb-3\">\r\n");
      out.write("						<label for=\"exampleFormControlTextarea1\" class=\"form-label\">About:</label>\r\n");
      out.write("						<textarea class=\"form-control\" id=\"exampleFormControlTextarea1\"\r\n");
      out.write("							rows=\"3\" name=\"about\">");
      out.print(user.getAbout());
      out.write("</textarea>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mb-3\">\r\n");
      out.write("						<label class=\"input-group-text\" for=\"inputGroupFile01\">New\r\n");
      out.write("							Profile Pic</label> <input type=\"file\" class=\"form-control\"\r\n");
      out.write("							id=\"inputGroupFile01\" name=\"img\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");

}

      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- This is jquery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\"\r\n");
      out.write("	integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(()=>{\r\n");
      out.write("	console.log(\"Abhishek Tiwari\");\r\n");
      out.write("	$(\"#form\").on(\"submit\",function(e)\r\n");
      out.write("	{\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		let form =new FormData(this);\r\n");
      out.write("		console.log(form);\r\n");
      out.write("		console.log(\"Hello\");\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url:\"Profilupdate\",\r\n");
      out.write("			type:\"POST\",\r\n");
      out.write("			data:form,\r\n");
      out.write("			success:function(data,textStatus,jqXHR)\r\n");
      out.write("			{\r\n");
      out.write("				if(data.trim()==='DONE')\r\n");
      out.write("					{\r\n");
      out.write("					swal({\r\n");
      out.write("						  title: \"Done\",\r\n");
      out.write("						  text: \"Update Successfully!\",\r\n");
      out.write("						  icon: \"success\",\r\n");
      out.write("						  button: \"OK\",\r\n");
      out.write("						})\r\n");
      out.write("						\r\n");
      out.write("					.then((value) => {\r\n");
      out.write("					  window.location=\"index\";\r\n");
      out.write("					});\r\n");
      out.write("					}\r\n");
      out.write("				else{\r\n");
      out.write("					swal({\r\n");
      out.write("						  title: \"Sorry\",\r\n");
      out.write("						  text: data.trim(),\r\n");
      out.write("						  icon: \"error\",\r\n");
      out.write("						  button: \"Try Again\",\r\n");
      out.write("						})\r\n");
      out.write("		            .then((value) => {\r\n");
      out.write("		            window.location = \"index\";\r\n");
      out.write("		        });\r\n");
      out.write("				}\r\n");
      out.write("			},\r\n");
      out.write("			error:function(jqXHR,textStatus,errorThrown)\r\n");
      out.write("			{\r\n");
      out.write("				console.log(\"Not Done\");\r\n");
      out.write("			},\r\n");
      out.write("			processData:false,\r\n");
      out.write("			contentType:false\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("    $('.Abhishek').click(function () {\r\n");
      out.write("        $(\".Abhi\").hide();\r\n");
      out.write("        $(\".Tiwari\").show();\r\n");
      out.write("    })\r\n");
      out.write("    $(\".btn-close\").click(()=>{\r\n");
      out.write("    	$(\".Abhi\").show();\r\n");
      out.write("        $(\".Tiwari\").hide();\r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("</script>");
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
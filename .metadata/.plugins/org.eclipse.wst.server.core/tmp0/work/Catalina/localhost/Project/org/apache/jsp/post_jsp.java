/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.11
 * Generated at: 2023-08-28 17:21:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.tech.blog.entity.User;
import com.tech.blog.entity.SharePost;
import java.util.List;
import com.tech.blog.helper.DBConnection;
import com.tech.blog.dao.UserDao;

public final class post_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1692212954890L));
    _jspx_dependants.put("jar:file:/D:/Software%20Technology/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602854172000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.tech.blog.dao.UserDao");
    _jspx_imports_classes.add("com.tech.blog.entity.SharePost");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.tech.blog.entity.User");
    _jspx_imports_classes.add("com.tech.blog.helper.DBConnection");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row g-3\">\r\n");
      out.write("\r\n");
      out.write("	");
      //  c:catch
      org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_c_005fcatch_005f0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
      boolean _jspx_th_c_005fcatch_005f0_reused = false;
      try {
        _jspx_th_c_005fcatch_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fcatch_005f0.setParent(null);
        // /post.jsp(11,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fcatch_005f0.setVar("exception");
        int[] _jspx_push_body_count_c_005fcatch_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fcatch_005f0 = _jspx_th_c_005fcatch_005f0.doStartTag();
          if (_jspx_eval_c_005fcatch_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("		");

		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		UserDao user = new UserDao(DBConnection.createConnection());
		User useruser = (User) session.getAttribute("user");
		List<SharePost> AllPost = null;
		String cname = (String) request.getParameter("cid");
		//out.print(cname);
		if (cname.equals("All")) {
			AllPost = user.getallpost();
		} else {
			AllPost = user.getpostbyname(cname);
		}
		for (SharePost p : AllPost) {
		
              out.write("\r\n");
              out.write("		<div class=\"col-lg-4 col-md-6 d-flex justify-content-center pb-3 abhi\">\r\n");
              out.write("			");

			int likes = user.getlikeBypostId(p.getPostid());
			
              out.write("\r\n");
              out.write("			<div class=\"card bg\" style=\"width: 18rem;\">\r\n");
              out.write("				<div class=\"d-flex justify-content-start mb-4 mt-3 ms-2\"\r\n");
              out.write("					style=\"height: 40px;\">\r\n");
              out.write("					<img src=\"images/");
              out.print(p.getUserimg());
              out.write("\" class=\"img-fluid\" alt=\"\"\r\n");
              out.write("						style=\"width: 40px; border-radius: 50%;\">\r\n");
              out.write("					<p class=\"ms-2 fw-bold\">\r\n");
              out.write("						");
              out.print(p.getUsername());
              out.write("\r\n");
              out.write("						Posted <br> <span class=\"text-light\">");
              out.print(p.getRegisterdate());
              out.write("</span>\r\n");
              out.write("					</p>\r\n");
              out.write("				</div>\r\n");
              out.write("				<img src=\"post/");
              out.print(p.getImage());
              out.write("\" class=\"card-img-top img-thumbnail\"\r\n");
              out.write("					style=\"height: 12rem;\" alt=\"IMG\">\r\n");
              out.write("				<div class=\"card-body bg\">\r\n");
              out.write("					<b class=\"card-text text-light\">");
              out.print(p.getTittle());
              out.write("</b>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("					<div class=\"d-flex justify-content-center mt-2\">\r\n");
              out.write("						");

						if (useruser != null) {
						
              out.write("\r\n");
              out.write("						");
              out.write("\r\n");
              out.write("						");

						boolean done = user.likedbyuser(p.getPostid(), useruser.getEmail());
						
              out.write("\r\n");
              out.write("						<button type=\"button\" class=\"btn  btn-outline-light me-2 like\"\r\n");
              out.write("							");
if (done) {
              out.write(" style=\"display: none;\" ");
}
              out.write(">\r\n");
              out.write("							<i class=\"fa-solid fa-thumbs-up fa-shake\"></i> <span\r\n");
              out.write("								class=\"likep\"> ");
              out.print(likes);
              out.write("</span>\r\n");
              out.write("						</button>\r\n");
              out.write("						<button type=\"button\"\r\n");
              out.write("							class=\"btn  btn-outline-light me-2  dishlike\" ");
if (!done) {
              out.write("\r\n");
              out.write("							style=\"display: none;\" ");
}
              out.write("\r\n");
              out.write("							onclick=\"func(");
              out.print(p.getPostid());
              out.write(',');
              out.write('\'');
              out.print(useruser.getEmail());
              out.write("')\">\r\n");
              out.write("							<i class=\"fa-regular fa-thumbs-up\"></i> <span class=\"likep\">\r\n");
              out.write("								");
              out.print(likes);
              out.write("\r\n");
              out.write("							</span>\r\n");
              out.write("						</button>\r\n");
              out.write("						");

						} else {
						
              out.write("\r\n");
              out.write("						<button type=\"button\" class=\"btn  btn-outline-light me-2\">\r\n");
              out.write("							<i class=\"fa-regular fa-thumbs-up\"></i> <span\r\n");
              out.write("								class=\"likep\"> ");
              out.print(likes);
              out.write("\r\n");
              out.write("							</span>\r\n");
              out.write("						</button>\r\n");
              out.write("						");

						}
						
              out.write("\r\n");
              out.write("						<a class=\"btn  btn-outline-light me-2 ms-2\"\r\n");
              out.write("							href=\"postdetails.jsp?postid=");
              out.print(p.getPostid());
              out.write("\"> <i\r\n");
              out.write("							class=\"fa-solid fa-eye fa-bounce\"></i>\r\n");
              out.write("						</a>\r\n");
              out.write("					</div>\r\n");
              out.write("				</div>\r\n");
              out.write("			</div>\r\n");
              out.write("\r\n");
              out.write("			");
              out.write("\r\n");
              out.write("		</div>\r\n");
              out.write("		");

		}
		if (AllPost.size() == 0) {
		
              out.write("\r\n");
              out.write("		<div class=\"alert alert-info alert-dismissible fade show\" role=\"alert\">\r\n");
              out.write("			<strong>Sorry!</strong> There Are No Posts Related To This Topic\r\n");
              out.write("			Here.\r\n");
              out.write("			<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\"\r\n");
              out.write("				aria-label=\"Close\"></button>\r\n");
              out.write("		</div>\r\n");
              out.write("		");

		}
		
              out.write("\r\n");
              out.write("\r\n");
              out.write("	");
              int evalDoAfterBody = _jspx_th_c_005fcatch_005f0.doAfterBody();
              if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fcatch_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fcatch_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fcatch_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fcatch_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar.reuse(_jspx_th_c_005fcatch_005f0);
        _jspx_th_c_005fcatch_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fcatch_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fcatch_005f0_reused);
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /post.jsp(114,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${exception!=null}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("		");

		response.sendRedirect("./");
		
            out.write('\r');
            out.write('\n');
            out.write('	');
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\"\r\n");
      out.write("	integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function func(postid,userid)\r\n");
      out.write("{\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url:\"like\",\r\n");
      out.write("		type:\"POST\",\r\n");
      out.write("		data:{postid:postid,userid:userid},\r\n");
      out.write("		success:function(data,textStatus,jqxhr)\r\n");
      out.write("		{\r\n");
      out.write("			console.log(data);\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("let like = Array.from(document.getElementsByClassName(\"like\"));\r\n");
      out.write("let dishlike = Array.from(document.getElementsByClassName(\"dishlike\"));\r\n");
      out.write("let likep = Array.from(document.getElementsByClassName(\"likep\"));\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("dishlike.forEach((Element, index, arr) => {\r\n");
      out.write("    Element.addEventListener(\"click\", () => {\r\n");
      out.write("        let likec = parseInt(likep[index].textContent) + 1;\r\n");
      out.write("        likep[index].innerHTML = likec;\r\n");
      out.write("        Element.style.display = \"none\";\r\n");
      out.write("        like[index].style.display = \"block\";\r\n");
      out.write("    })\r\n");
      out.write("})\r\n");
      out.write("\r\n");
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
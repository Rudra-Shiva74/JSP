<%@page import="com.tech.blog.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.tech.blog.entity.SharePost"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.helper.DBConnection"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row g-3">

	<c:catch var="exception">
		<%
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
		%>
		<div class="col-lg-4 col-md-6 d-flex justify-content-center pb-3 abhi">
			<%
			int likes = user.getlikeBypostId(p.getPostid());
			%>
			<div class="card bg" style="width: 18rem;">
				<div class="d-flex justify-content-start mb-4 mt-3 ms-2"
					style="height: 40px;">
					<img src="images/<%=p.getUserimg()%>" class="img-fluid" alt=""
						style="width: 40px; border-radius: 50%;">
					<p class="ms-2 fw-bold">
						<%=p.getUsername()%>
						Posted <br> <span class="text-light"><%=p.getRegisterdate()%></span>
					</p>
				</div>
				<img src="post/<%=p.getImage()%>" class="card-img-top img-thumbnail"
					style="height: 12rem;" alt="IMG">
				<div class="card-body bg">
					<b class="card-text text-light"><%=p.getTittle()%></b>


					<div class="d-flex justify-content-center mt-2">
						<%
						if (useruser != null) {
						%>
						<%-- 	<button class="btn  btn-outline-light me-2"
							onclick="func(<%=p.getPostid()%>,'<%=useruser.getEmail()%>')">
							<i class="fa-regular fa-thumbs-up fa-shake"></i><span id="like">
								12</span>
						</button> --%>
						<%
						boolean done = user.likedbyuser(p.getPostid(), useruser.getEmail());
						%>
						<button type="button" class="btn  btn-outline-light me-2 like"
							<%if (done) {%> style="display: none;" <%}%>>
							<i class="fa-solid fa-thumbs-up fa-shake"></i> <span
								class="likep"> <%=likes%></span>
						</button>
						<button type="button"
							class="btn  btn-outline-light me-2  dishlike" <%if (!done) {%>
							style="display: none;" <%}%>
							onclick="func(<%=p.getPostid()%>,'<%=useruser.getEmail()%>')">
							<i class="fa-regular fa-thumbs-up"></i> <span class="likep">
								<%=likes%>
							</span>
						</button>
						<%
						} else {
						%>
						<button type="button" class="btn  btn-outline-light me-2">
							<i class="fa-regular fa-thumbs-up"></i> <span
								class="likep"> <%=likes%>
							</span>
						</button>
						<%
						}
						%>
						<a class="btn  btn-outline-light me-2 ms-2"
							href="postdetails.jsp?postid=<%=p.getPostid()%>"> <i
							class="fa-solid fa-eye fa-bounce"></i>
						</a>
					</div>
				</div>
			</div>

			<%-- <div class="card" style="width: 18rem;">
				<img src="post/<%=p.getImage()%>" class="img-fluid"
					style="height: 12rem;">
				<div class="card-body bg text-light">
					<b class="card-title"><%=p.getTittle()%></b>
					<p class="card-text"><%=p.getContent()%></p>
				</div>
			</div> --%>
		</div>
		<%
		}
		if (AllPost.size() == 0) {
		%>
		<div class="alert alert-info alert-dismissible fade show" role="alert">
			<strong>Sorry!</strong> There Are No Posts Related To This Topic
			Here.
			<button type="button" class="btn-close" data-bs-dismiss="alert"
				aria-label="Close"></button>
		</div>
		<%
		}
		%>

	</c:catch>
	<c:if test="${exception!=null}">
		<%
		response.sendRedirect("./");
		%>
	</c:if>
</div>

<script src="https://code.jquery.com/jquery-3.7.0.min.js"
	integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
	crossorigin="anonymous"></script>


<script>
function func(postid,userid)
{
	$.ajax({
		url:"like",
		type:"POST",
		data:{postid:postid,userid:userid},
		success:function(data,textStatus,jqxhr)
		{
			console.log(data);
		}
	})
	}
	
	
	
	
let like = Array.from(document.getElementsByClassName("like"));
let dishlike = Array.from(document.getElementsByClassName("dishlike"));
let likep = Array.from(document.getElementsByClassName("likep"));


dishlike.forEach((Element, index, arr) => {
    Element.addEventListener("click", () => {
        let likec = parseInt(likep[index].textContent) + 1;
        likep[index].innerHTML = likec;
        Element.style.display = "none";
        like[index].style.display = "block";
    })
})

</script>
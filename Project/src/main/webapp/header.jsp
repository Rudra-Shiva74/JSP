<%@page import="com.tech.blog.entity.AdminBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entity.Category"%>
<%@page import="com.tech.blog.helper.DBConnection"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="errorpage.jsp"%>
<%@page import="com.tech.blog.entity.User"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<style>
.background {
	background: #00FFFF;
}

.bg {
	background: #FF69B4;
}

.bg-color {
	background: #FF69B4;
}
</style>
<%@page errorPage="errorpage.jsp"%>
<%
User user = (User) session.getAttribute("user");
AdminBean admin = (AdminBean) session.getAttribute("admin");
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>


<!-- This is navbar -->
<nav class="navbar background sticky-top navbar-expand-lg">
	<div class="container-fluid">
		<a class="navbar-brand text-dark fw-bold" href="./"><i
			class="fa-solid fa-user-ninja fa-flip"></i> Let's Talk</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a
					class="nav-link active text-dark fw-bold" aria-current="page"
					href="./">Home</a></li>


				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle text-dark fw-bold" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Topic </a>
					<ul class="dropdown-menu">
						<li><button class="dropdown-item" onclick="getPost('All')">All
								Programing</button></li>
						<%
						UserDao userDao = new UserDao(DBConnection.createConnection());
						ArrayList<Category> list = userDao.getCategories();
						for (Category c : list) {
						%>
						<li><button class="dropdown-item" id="<%=c.getCid()%>"
								onclick="getPost('<%=c.getName()%>')"><%=c.getName()%></button></li>
						<%
						}
						%>
					</ul></li>
				<%
				if (admin == null) {
				%>
				<li class="nav-item"><a class="nav-link text-dark fw-bold"
					href="about.jsp" aria-disabled="true"><i
						class="fa-solid fa-address-card"></i> About</a></li>

				<li class="nav-item"><a class="nav-link text-dark fw-bold"
					aria-disabled="true" href="contactus.jsp"><i
						class="fa-sharp fa-regular fa-id-badge"></i> Contact Us</a></li>
				<%
				}
				if (user != null) {
				%>
				<li class="nav-item">
					<%-- <button class="nav-link text-dark fw-bold" aria-disabled="true"
						data-bs-toggle="modal" data-bs-target="#exampleModal">
						<i class="fa-solid fa-user fa-bounce"></i>
						<%=user.getName()%>
					</button> --%>
					<button class="nav-link text-dark fw-bold" aria-disabled="true"
						data-bs-toggle="modal" data-bs-target="#exampleModal">
						<img src="images/<%=user.getImage()%>" class="img-fluid" alt=""
							style="width: 30px; height: 30px; border-radius: 50%;">
					</button>

				</li>
				<li class="nav-item"><a class="nav-link text-dark fw-bold"
					aria-disabled="true" href="Logout"><i
						class="fa-solid fa-right-to-bracket"></i> Logout</a></li>
				<%
				}
				if (admin != null) {
				%>
				<li class="nav-item">
					<button class="nav-link text-dark fw-bold" aria-disabled="true"
						data-bs-toggle="modal" data-bs-target="#AdminModal">

						<i class="fa-solid fa-user-shield fa-bounce"></i> Admin
					</button>
				</li>
				<li class="nav-item"><a class="nav-link text-dark fw-bold"
					aria-disabled="true" href="Logout"><i
						class="fa-solid fa-right-to-bracket"></i> Logout</a></li>
				<%
				}
				if (user == null && admin == null) {
				%>
				<li class="nav-item"><a class="nav-link text-dark fw-bold"
					aria-disabled="true" href="login.jsp"><i
						class="fa-solid fa-user fa-bounce"></i> Login</a></li>
				<li class="nav-item"><a class="nav-link text-dark fw-bold"
					aria-disabled="true" href="register.jsp"><i
						class="fa-solid fa-right-to-bracket"></i> Signup</a></li>
				<%
				}
				%>
			</ul>
			<form class="d-flex" role="search">
				<input class="form-control me-2" type="search"
					placeholder="Search Your Topic" aria-label="Search">
			</form>
		</div>
	</div>
</nav>



<!-- This is the popup for website -->
<%
if (user != null) {
%>
<div class="modal fade" id="exampleModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content Abhi">
			<div class="modal-header bg-color text-light">
				<h1 class="modal-title fs-5" id="exampleModalLabel">TechBlog</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<div class="container-fluid">
					<div class="row">
						<div
							class="col-12 col-lg-12 col-md-12 d-flex justify-content-center"
							style="height: 100px;">

							<img src="images/<%=user.getImage()%>" alt="" class="img-fluid"
								style="border-radius: 50%; width: 100px">
						</div>
						<div
							class="col-12 col-lg-12 col-md-12 d-flex justify-content-center">
							<h5><%=user.getName()%></h5>
						</div>
					</div>
					<div>
						<table class="table">
							<tbody>

								<tr>
									<th scope="col">Email</th>
									<td><%=user.getName()%></td>
								</tr>
								<tr>
									<th scope="col">Gender</th>
									<td><%=user.getGender()%></td>
								</tr>
								<tr>
									<th scope="col">Joining Date</th>
									<td><%=user.getDatetime()%></td>
								</tr>
							</tbody>
						</table>
					</div>
					<h4>About :</h4>
					<p><%=user.getAbout()%></p>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button"
					class="btn bg-color text-light fw-bold Abhishek">Edit</button>
			</div>
		</div>
		<div class="modal-content Tiwari" style="display: none;">
			<div class="modal-header bg-color text-light">
				<h1 class="modal-title fs-5" id="exampleModalLabel">TechBlog</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<form action="Profilupdate" method="post" id="form"
				enctype="multipart/form-data">
				<div class="modal-body">
					<div class="container-fluid">
						<div class="row">
							<div
								class="col-12 col-lg-12 col-md-12 d-flex justify-content-center"
								style="height: 100px;">
								<img src="images/<%=user.getImage()%>" alt="" class="img-fluid"
									style="border-radius: 50%; width: 100px">
							</div>
							<div
								class="col-12 col-lg-12 col-md-12 d-flex justify-content-center">
								<h5><%=user.getName()%></h5>
							</div>
						</div>
					</div>
					<div class="mb-3 row">
						<label for="Name" class="col-sm-2 col-form-label">Username</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name"
								value="<%=user.getName()%>">
						</div>
					</div>
					<div class="mb-3 row">
						<label for="Name" class="col-sm-2 col-form-label">Gender</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="gender"
								value="<%=user.getGender()%>">
						</div>
					</div>
					<div class="mb-3 row">
						<label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPassword"
								value="<%=user.getPassword()%>" name="password">
						</div>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlTextarea1" class="form-label">About:</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3" name="about"><%=user.getAbout()%></textarea>
					</div>
					<div class="input-group mb-3">
						<label class="input-group-text" for="inputGroupFile01">New
							Profile Pic</label> <input type="file" class="form-control"
							id="inputGroupFile01" name="img">
					</div>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn bg-color">Save changes</button>
				</div>
			</form>
		</div>
	</div>
</div>
<%
}
if (admin != null) {
%>
<div class="modal fade" id="AdminModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content Abhi">
			<div class="modal-header bg-color text-light">
				<h1 class="modal-title fs-5" id="exampleModalLabel">TechBlog</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<div class="container-fluid">
					<div class="row">
						<div
							class="col-12 col-lg-12 col-md-12 d-flex justify-content-center"
							style="height: 100px;">

							<img src="images/<%=admin.getAdminemail()%>" alt=""
								class="img-fluid" style="border-radius: 50%; width: 100px">
						</div>
						<div
							class="col-12 col-lg-12 col-md-12 d-flex justify-content-center">
							<h5><%=admin.getAdminname()%></h5>
						</div>
					</div>
					<div>
						<table class="table">
							<tbody>

								<tr>
									<th scope="col">Adminid</th>
									<td><%=admin.getAdminemail()%></td>
								</tr>
								<tr>
									<th scope="col">Gender</th>
									<td><%=admin.getAdminid()%></td>
								</tr>
								<tr>
									<th scope="col">Joining Date</th>
									<td><%=admin.getAdminname()%></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button"
					class="btn bg-color text-light fw-bold Abhishek">Edit</button>
			</div>
		</div>
		<div class="modal-content Tiwari" style="display: none;">
			<div class="modal-header bg-color text-light">
				<h1 class="modal-title fs-5" id="exampleModalLabel">TechBlog</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<form action="Profilupdate" method="post" id="form"
				enctype="multipart/form-data">
				<div class="modal-body">
					<div class="container-fluid">
						<div class="row">
							<div
								class="col-12 col-lg-12 col-md-12 d-flex justify-content-center"
								style="height: 100px;">
								<img src="images/<%=admin.getAdminname()%>" alt=""
									class="img-fluid" style="border-radius: 50%; width: 100px">
							</div>
							<div
								class="col-12 col-lg-12 col-md-12 d-flex justify-content-center">
								<h5><%=admin.getAdminname()%></h5>
							</div>
						</div>
					</div>
					<div class="mb-3 row">
						<label for="Name" class="col-sm-2 col-form-label">Admin
							Name</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name"
								value="<%=admin.getAdminname()%>">
						</div>
					</div>
					<div class="mb-3 row">
						<label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPassword"
								value="<%=admin.getAdminname()%>" name="password">
						</div>
					</div>
					<div class="input-group mb-3">
						<label class="input-group-text" for="inputGroupFile01">New
							Profile Pic</label> <input type="file" class="form-control"
							id="inputGroupFile01" name="img">
					</div>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn bg-color">Save changes</button>
				</div>
			</form>
		</div>
	</div>
</div>
<%
}
%>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>

<!-- This is jquery -->
<script src="https://code.jquery.com/jquery-3.7.0.min.js"
	integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
	crossorigin="anonymous"></script>

<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<!-- This is jquery code -->
<script>
$(()=>{
	
	
	console.log("Abhishek Tiwari");
	$("#form").on("submit",function(e)
	{
		e.preventDefault();
		let form =new FormData(this);
		console.log(form);
		console.log("Hello");
		$.ajax({
			url:"Profilupdate",
			type:"POST",
			data:form,
			success:function(data,textStatus,jqXHR)
			{
				if(data.trim()==='DONE')
					{
					swal({
						  title: "Done",
						  text: "Update Successfully!",
						  icon: "success",
						  button: "OK",
						})
						
					.then((value) => {
					  window.location="index";
					});
					}
				else{
					swal({
						  title: "Sorry",
						  text: data.trim(),
						  icon: "error",
						  button: "Try Again",
						})
		            .then((value) => {
		            window.location = "index";
		        });
				}
			},
			error:function(jqXHR,textStatus,errorThrown)
			{
				console.log("Not Done");
			},
			processData:false,
			contentType:false
		});
	});

    $('.Abhishek').click(function () {
        $(".Abhi").hide();
        $(".Tiwari").show();
    })
    $(".btn-close").click(()=>{
    	$(".Abhi").show();
        $(".Tiwari").hide();
    })
    
});

</script>
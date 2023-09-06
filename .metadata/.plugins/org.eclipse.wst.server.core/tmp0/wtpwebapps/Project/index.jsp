<%@page import="com.tech.blog.entity.SharePost"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entity.Category"%>
<%@page import="com.tech.blog.helper.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Let's Talk</title>

</head>
<body>
	<!-- Navabr -->
	<%@ include file="header.jsp"%>

	<!-- This is the home section -->
	<%-- <section class="bg-color pb-5 pt-5 text-light" id="HOME">
		<div class="container pt-lg-4">
			<div class="d-flex justify-content-center">
				<div class="row">
					<div class="col-lg-12 mt-lg-5 mx-lg-5 px-lg-5 pt-lg-5">
						<h1>Welcome to Techblog</h1>
					</div>
					<div class="col-lg-12  mx-lg-5 px-lg-5">
						<p>A programming language is a system of notation for writing
							computer programs. Most programming languages are text-based
							formal languages, but they may also be graphical. They are a kind
							of computer language.</p>
					</div>
					<div class="col-lg-12 mx-lg-5 px-lg-5">
						<a class="btn btn-outline-light me-3" onclick="#home"> <i
							class="fa-regular fa-circle-play fa-beat"></i> Start! it's Free
						</a>
						<%
						if (user == null) {
						%>
						<button class="btn btn-outline-light"
							onclick="location='login.jsp'">
							<i class="fa-solid fa-user fa-bounce"></i> Login
						</button>
						<%
						} else {
						%>
						<button class="btn btn-outline-light" data-bs-toggle="modal"
							data-bs-target="#Post">
							<i class="fa-solid fa-signs-post fa-shake"></i> Post
						</button>
						<%
						}
						%>
					</div>
				</div>
			</div>
		</div>
	</section> --%>


	<!-- This is home page of web -->
	<section class="bg-color pb-5 pt-5  text-light" id="HOME">
		<div class="container">
			<div class="row mt-4">
				<div class="col-lg-6 mt-lg-5 pt-lg-5">
					<h1>
						Let's Talk About The<span class="text-dark fw-bold">
							Programming</span>
					</h1>
					<p>A programming language is a system of notation for writing
						computer programs. Most programming languages are text-based
						formal languages, but they may also be graphical. They are a kind
						of computer language.</p>
					<div class="mb-3">
						<%
						if (user == null && admin == null) {
						%>
						<a class="btn btn-outline-light me-3" href="register.jsp"> <i
							class="fa-regular fa-circle-play fa-beat"></i> Start! it's Free
						</a>
						<button class="btn btn-outline-light"
							onclick="location='login.jsp'">
							<i class="fa-solid fa-user fa-bounce"></i> Login
						</button>
						<%
						}
						if (user != null) {
						%>
						<a class="btn btn-outline-light me-3" href="details.jsp"> <i
							class="fa-solid fa-clock-rotate-left fa-beat-fade"></i> Post
							Details
						</a>
						<button class="btn btn-outline-light" data-bs-toggle="modal"
							data-bs-target="#Post">
							<i class="fa-solid fa-signs-post fa-shake"></i> Post
						</button>
						<%
						}
						if (admin != null) {
						%><button class="btn btn-outline-light me-3"
							data-bs-toggle="modal" data-bs-target="#Delete">
							<i class="fa-solid fa-trash-can fa-shake"></i> Delete Topic
						</button>
						<button class="btn btn-outline-light" data-bs-toggle="modal"
							data-bs-target="#Topic">
							<i class="fa-solid fa-plus fa-flip"></i> Add Topic
						</button>
						<%
						}
						%>
					</div>
				</div>
				<div class="col-lg-6 d-flex justify-content-center">
					<img src="images/Programing.png" alt="" class="img-fluid">
				</div>
			</div>
		</div>
	</section>

	<!-- This is the all post -->



	<!-- This is all the post -->
	<section id="home" class="background">
		<div class="container pt-3 pb-3 d-flex justify-content-center">
			<h1 id="progrmas">View Post</h1>
		</div>


		<div class="container-fluid text-center" id="loader">
			<i class="fa-solid fa-arrows-rotate fa-spin fa-2xl"></i>
			<p>Loading.....</p>
		</div>
		<div class="container-fluid" id="post-container"></div>



	</section>





	<!-- THis is popups for share the post -->
	<section>
		<div class="modal fade" id="Post" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header bg-color text-light">
						<h1 class="modal-title fs-5" id="exampleModalLabel">Share
							Your Knowladge</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<form action="PostShare" method="post" id="post"
						enctype="multipart/form-data">
						<div class="modal-body">
							<div class="mb-3">
								<select class="form-select form-select-sm" name="cid"
									aria-label="Small select example" id="select">
									<option selected disabled>Selcet Your Category..</option>
									<%
									for (Category c : list) {
									%>
									<option value="<%=c.getCid()%>">
										<%=c.getName()%>
									</option>
									<%
									}
									%>
								</select> <input type="hidden" name="categori" id="categori">
							</div>
							<div class="mb-3">
								<input type="text" class="form-control" name="tittle"
									id="exampleFormControlInput1" placeholder="Enter Your Tittle"
									required>
							</div>
							<div class="mb-3">
								<textarea class="form-control" id="exampleFormControlTextarea1"
									name="content" rows="3" placeholder="Enter Your Content"></textarea>
							</div>
							<div class="mb-3">
								<textarea class="form-control" id="exampleFormControlTextarea1"
									name="program" rows="3"
									placeholder="Enter Your Program (if any)"></textarea>
							</div>
							<p class="mb-1">Select Your Post Pic..</p>
							<div class="input-group mb-3">
								<input type="file" class="form-control" id="inputGroupFile01"
									name="img">
							</div>
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn bg-color text-dark">POST</button>
						</div>
					</form>
				</div>
			</div>
		</div>


		<div class="modal fade" id="Topic" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header bg-color text-light">
						<h1 class="modal-title fs-5" id="exampleModalLabel">Add Your
							Topic</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<form action="AddTopic" method="post" id="AddTopic"
						enctype="multipart/form-data">
						<div class="modal-body">
							<div class="mb-3">
								<input type="text" class="form-control" name="category"
									id="exampleFormControlInput1" placeholder="Enter Your Category"
									required>
							</div>
							<div class="mb-3">
								<textarea class="form-control" id="exampleFormControlTextarea1"
									maxlength="250" name="desc" rows="3"
									placeholder="Add Some Description"></textarea>
							</div>
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn bg-color text-dark">Add</button>
						</div>
					</form>
				</div>
			</div>
		</div>



		<div class="modal fade" id="Delete" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header bg-color text-light">
						<h1 class="modal-title fs-5" id="exampleModalLabel">Delete
							Your Topic</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<form action="DeleteTopic" method="post" id="DeleteTopic"
						enctype="multipart/form-data">
						<div class="modal-body">
							<div class="mb-3">
								<input type="text" class="form-control" name="category"
									id="exampleFormControlInput1" placeholder="Enter Your Topic"
									required>
							</div>
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn bg-color text-dark">Delete</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>


	<%@include file="footer.jsp"%>
</body>
<!-- This is my all js code -->
<script>
$(()=>{	
	
	$(document).ready(function () {
	    $("#select").on("change", function () {
	        var selectedText = $(this).find("option:selected").text();

	        $("#categori").val(selectedText);
	    });
	});

	
	console.log("This is for post the information of program");
	$("#post").on("submit",function(e){
		e.preventDefault();
		let form=new FormData(this);
		$.ajax({
			url:"PostShare",
			type:"POST",
			data:form,
			success:function(data,textStatus,jqXHR)
			{
				if(data.trim()==='DONE')
				{
				swal({
					  title: "Done",
					  text: "Post Successfully!",
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
			error:function(jqxhr,textStatus,errorThrown)
			{
				console.log("not");
			},
			processData:false,
			contentType:false
		})
	})
	
	
	$("#AddTopic").on("submit",function(e){
		e.preventDefault();
		let form=new FormData(this);
		$.ajax({
			url:"AddTopic",
			type:"POST",
			data:form,
			success:function(data,textStatus,jqXHR)
			{
				if(data.trim()==='DONE')
				{
				swal({
					  title: "Done",
					  text: "Added Successfully!",
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
			error:function(jqxhr,textStatus,errorThrown)
			{
				console.log("not");
			},
			processData:false,
			contentType:false
		})
	})
	
	$("#DeleteTopic").on("submit",function(e){
		e.preventDefault();
		let form=new FormData(this);
		swal({
	        title: "Are you sure?",
	        text: "Once deleted, You Will Not Be Able To Recover This Topic!",
	        icon: "warning",
	        buttons: true,
	        dangerMode: true,
	    })
	        .then((willDelete) => {
	            if (willDelete) {
	            	$.ajax({
	        			url:"DeleteTopic",
	        			type:"POST",
	        			data:form,
	        			success:function(data,textStatus,jqXHR)
	        			{
	        				if(data.trim()==='DONE')
	        				{
	        				swal({
	        					  title: "Done",
	        					  text: "Delete Successfully!",
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
	        			error:function(jqxhr,textStatus,errorThrown)
	        			{
	        				console.log("not");
	        			},
	        			processData:false,
	        			contentType:false
	        		})
	                swal("Poof! Your imaginary file has been deleted!", {
	                    icon: "success",
	                });
	            } else {
	                swal("Your Topic is safe!",{
	                	 icon: "success",
	                }).then((value) => {
        	            window.location = "index";
        	        });
	            }
	        });
		
	})
	
	
})

console.log("This is request to fetch data dynamically");
function getPost(catid){
$.ajax({
	url:"post.jsp",
	data:{cid:catid},
	success:function(data,textStatus, jqxhr){
		$("#post-container").html(data);
		$("#loader").hide();
	}
})}
getPost('All');


console.log("This is for When i click the dwopdown according to that my header show");
let btntag = Array.from(document.getElementsByClassName("dropdown-item"));
let h1tag = document.getElementById("progrmas");
btntag.forEach(function (element, index, btntag) {
    element.addEventListener("click", function () {
        // console.log(element.textContent);
        let str = element.textContent;
        console.log(str);
        h1tag.textContent = str;
    })
})

console.log("This is for search the special program");
let inputTag = document.getElementsByTagName("input")[0];

    inputTag.addEventListener("input", () => {
        let inputTagVal = inputTag.value.toLowerCase().trim();
        let colClass = Array.from(document.getElementsByClassName("abhi"));
        colClass.forEach(function (element) {
            let h5Tag = element.getElementsByTagName("b")[0].textContent.toLowerCase();
            if (h5Tag.includes(inputTagVal)) {
                element.classList.remove("d-none");
            } else {
                element.classList.add("d-none");
            }
        });
    });
</script>

</html>
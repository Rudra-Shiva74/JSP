<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MVC and MySQL</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body class="bg-primary">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form action="RegisterServlet" method="post" id="form">
					<div class="card">
						<div class="card-header bg-dark text-white">
							<h3>Java Registration application using MVC and MySQL</h3>
						</div>
						<div class="card-body bg-secondary">
							<div class="form-group mb-3">
								<input type="text" name="fullname"
									placeholder="Enter your fullname" class="form-control"
									autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="email" name="email" placeholder="Enter your email"
									class="form-control" autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="text" name="username"
									placeholder="Enter your usernmae" class="form-control"
									autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="password" name="password"
									placeholder="Enter your password" class="form-control"
									autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="password" name="conpassword"
									placeholder="Enter your confirm password" class="form-control"
									autocomplete="off" required>
							</div>
						</div>
						<div class="card-footer text-center bg-dark text-white">
							<button type="submit" name="submit" value="submit"
								class="btn btn-outline-light">Submit</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>
<script>
	function validate() {
		var fullname = document.form.fullname.value;
		var email = document.form.email.value;
		var username = document.form.username.value;
		var password = document.form.password.value;
		var conpassword = document.form.conpassword.value;

		if (fullname == null || fullname == "") {
			alert("Full Name can't be blank");
			return false;
		} else if (email == null || email == "") {
			alert("Email can't be blank");
			return false;
		} else if (username == null || username == "") {
			alert("Username can't be blank");
			return false;
		} else if (password.length < 6) {
			alert("Password must be at least 6 characters long.");
			return false;
		}
	}
</script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<script src="https://code.jquery.com/jquery-3.7.0.min.js"
	integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
	crossorigin="anonymous"></script>
<script>
	$(()=>{
		console.log("Hele");
		$("#form").on("submit",function(event){
			event.preventDefault();
			let form=new FormData(this);
			$.ajax({
				url:"RegisterServlet",
				type:"POST",
				data:form,
				success:function(data,textstatus,jqxhr)
				{
					if(data.trim()==='DONE')
						{
						swal({
							  title: "Done",
							  text: "You Register Successfully!",
							  icon: "success",
							  button: "Login",
							}).then((value) => {
								  window.location="login.jsp";
							});
						}
					else
						{
						swal({
							  title: "Sorry",
							  text: data,
							  icon: "error",
							  button: "OK",
							}).then((value) => {
								  window.location="index.jsp";
							});
						}
					
				},
				error:function(jqxhr,textstatus,error)
				{
					console.log("error");
				},
				processData:false,
				contentType:false
			})
		})
	})
	
</script>
</html>
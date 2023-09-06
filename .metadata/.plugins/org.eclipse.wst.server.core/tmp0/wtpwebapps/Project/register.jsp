<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Signup</title>

</head>
<body>
	<%@ include file="header.jsp"%>
	<section class="bg-color second   pt-5 pb-5">
		<div class="container  pt-3 pb-3 d-flex justify-content-center">
			<div class="card" style="width: 22rem;">
				<div
					class="border border-light d-flex justify-content-center pb-3 pt-3 background"
					style="font-size: 100px;">
					<i class="fa-solid fa-user-plus text-dark"></i>
				</div>
				<form action="Registration" method="post" id="form">
					<div class="m-3">
						<input type="text" class="form-control" id="inputPassword"
							name="name" placeholder="Enter Your name" required
							autocomplete="off">
					</div>
					<div class="m-3">
						<input type="email" class="form-control" id="inputPassword"
							name="email" placeholder="Enter Your Email" required
							autocomplete="off">
					</div>
					<div class="m-3">
						<input type="password" class="form-control" id="pass"
							name="password" placeholder="Enter Your password"
							autocomplete="off" required>
					</div>
					<div class="m-3">
						<input type="password" class="form-control" id="cpass"
							placeholder="Enter Your confirm password" autocomplete="off"
							name="cpassword" required>
					</div>
					<div class="m-3">
						<select class="form-select form-select-sm" name="gender"
							aria-label="Small select example">
							<option selected disabled>Select gender</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
						</select>
					</div>
					<div class="m-3">
						<textarea name="about" class="form-control" id=""
							placeholder="Enter Something about yourself" maxlength="255"
							required></textarea>
					</div>
					<div class="m-3">
						<div class="form-check">
							<input class="form-check-input border border-dark"
								type="checkbox" value="check" name="box" required
								id="flexCheckDefault"> <label class="form-check-label"
								for="flexCheckDefault">Agree Terms And Condition </label>
						</div>
					</div>
					<div class="m-3">
						<div class="text-center h1" id="loader" style="display: none">
							<i class="fa-solid fa-arrows-rotate fa-spin"></i>
							<h5>Please Wait..</h5>
						</div>
						<div class="d-flex justify-content-center">
							<button type="submit" class="btn btn-outline-dark">Submit</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</body>
<script>

	$(()=>{
		$('#form').on("submit",function(event){
			event.preventDefault();
			$('button').hide();
			$('#loader').show();
			
			
			let form =new FormData(this);
			console.log(form);
			
			$.ajax({
				url:'Registration',
				type:'POST',
				data:form,
				success:function(data, textStatus, jqXHR)
				{
					if(data.trim()==='DONE')
					{
						swal({
							  title: "Done",
							  text: "Registration Successfully!",
							  icon: "success",
							  button: "Login",
							})
							
						.then((value) => {
						  window.location="login.jsp";
						});
						$('button').show();
						$('#loader').hide();
						}
					else{
						swal({
							  title: "Sorry",
							  text: data.trim(),
							  icon: "error",
							  button: "Try Again",
							})
			            .then((value) => {
			            window.location = "register.jsp";
			        });
						$('#loader').hide();
					}
				},
				error:function(jqXHR,textStatus,errorThrown)
				{
					$('button').show();
					$('#loader').hide();
				},
				processData:false,
				contentType:false
				
			});
		});
	});
	
</script>
</html>
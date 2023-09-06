<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

</head>

<body>
	<!-- <div style="font-size: 40px;">
        <i class="fa-solid fa-heart like" style="color: red; display: none;"></i>
        <i class="fa-regular fa-heart dishlike" style="color: red;"></i> -->
	</div>
	<div class="card" style="width: 18rem;">
		<img src="../Project/About.jpeg " class="img-fluid" alt="..."
			style="height: 11rem;">
		<div class="card-body">
			<h5 class="card-title">Card title</h5>
			<p class="card-text">Some quick example text to build on the card
				title and make up the bulk of the card's content.</p>
			<div class="d-flex justify-content-between m-0 p-0">
				<p class="m-0 p-0 likep">12</p>
				<p class="m-0 p-0 comment">12</p>
			</div>
			<div class="d-flex justify-content-between">

				<form action="Check" method="post" id="formlike">
					<input type="hidden" name="like" id="likecount"
						class="d-block m-0 p-0 border border-light" readonly>
					<button type="submit"
						class="m-0 p-0 btn btn-light bg-light border border-light">
						<i class="fa-solid fa-heart like"
							style="color: red; display: none;"></i> <i
							class="fa-regular fa-heart dishlike" style="color: red;"></i>
					</button>
				</form>

				<button class="btn btn-outline-primary">Read More..</button>

				<form action="" method="post" id="formcomment">
					<button type="submit"
						class="m-0 p-0 btn btn-light bg-light border border-light">
						<input type="hidden" name="" id="" value="1"
							class="d-block m-0 p-0 border border-light" readonly> <i
							class="fa-solid fa-comment"></i>
					</button>
				</form>
			</div>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.7.0.min.js"
	integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>
<script>
    $(() => {
        $('#formlike').on("submit", function (e) {
            e.preventDefault();
            console.log("hhhh");
            let form = new FormData(this);
            $.ajax({
                url: "Check",
                type: "POST",
                data: form,
                success: function (data, textStatus, jqxhr) {
                    console.log("done");
                },
                error: function (jqxhr, textStatus, errorThrown) {
                    console.log("not done");
                }, processData: false,
                contentType: false
            })

        });$(".dishlike").on("click", function () {
            $(".like").show();
            $(this).hide();
            let val = parseInt($(".likep").text()) + 1;
            $(".likep").text(val);
            $("#likecount").val(val);
            // console.log($("#likecount").val());

        })
        $(".like").on("click", function () {
            $(this).hide();
            $(".dishlike").show();
            let val = parseInt($(".likep").text()) - 1;
            $(".likep").text(val);
            // console.log(val);
            $("#likecount").val(val);
            // console.log($("#likecount").val());
        })
    })
</script>

</html>
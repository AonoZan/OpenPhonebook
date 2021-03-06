<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="head.jsp"%>
</head>
<body>
	<div class="site-wrapper">
		<div class="site-wrapper-inner">
			<div class="cover-container">
				<%@ include file="header.jsp"%>

				<div class="inner cover ">
					<div class="container-fluid">
						<div class="row-fluid">
							<div class="col-lg-8 col-lg-offset-2">
								<h1>Register new account.</h1>
								<hr>
								<form method="post" action="register">
									<div class="input-group">
										<span class="input-group-addon" id="name">Name</span> <input
											type="text" class="form-control"
											required
											name="name"
											placeholder="enter your name" aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="city">Password</span> <input
											type="text" class="form-control"
											required
											name="password"
											placeholder="enter your city" aria-describedby="basic-addon1">
									</div>
									<br>
									<button type="submit" class="btn btn-lg btn-default">Register</button>
								</form>
							</div>
						</div>
					</div>
				</div>

				<%@ include file="footer.jsp"%>
			</div>
		</div>
	</div>

	<%@ include file="foot.jsp"%>
</body>

</html>
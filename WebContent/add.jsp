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
				<%@ include file="user-header.jsp"%>

				<div class="inner cover ">
					<div class="container-fluid">
						<div class="row-fluid">
							<div class="col-lg-8 col-lg-offset-2">
								<h1>Add new contact.</h1>
								<hr>
								<form>
									<div class="input-group">
										<span class="input-group-addon" id="name">Name</span> <input
											type="text" class="form-control"
											placeholder="enter contact name"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="last-name">Last
											name</span> <input type="text" class="form-control"
											placeholder="enter contact last name"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="email">Email</span> <input
											type="text" class="form-control"
											placeholder="enter contact email"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="email-repeat">Repeat
											email</span> <input type="text" class="form-control"
											placeholder="please repeat email"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="phone">Phone</span> <input
											type="text" class="form-control"
											placeholder="enter contact phone number"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="city">City</span> <input
											type="text" class="form-control"
											placeholder="enter contact city"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<button type="submit" class="btn btn-lg btn-default">Add
										contact</button>
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
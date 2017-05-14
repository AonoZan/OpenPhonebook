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
								<form method="post" action="add">
									<div class="input-group">
										<span class="input-group-addon" id="name">Name</span> <input
											required
											name="name"
											type="text" class="form-control"
											placeholder="enter contact name"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="phone">Phone</span> <input
											required
											name="phone"
											type="tel"
											pattern="^(\(?\d{2}\)?)([ -/])(\d{3})([ .-])(\d{3})(\d{1})*$"
											maxlength="11"
											class="form-control"
											placeholder="eg. 66/555-555(5)"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="email">Email</span> <input
											name="email"
											type="email" class="form-control"
											placeholder="enter contact email"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="dob">Date of birth</span> <input
											name="dob"
											type="date" class="form-control"
											placeholder="enter contact date of birth"
											aria-describedby="basic-addon1">
									</div>
									<br>
									<div class="input-group">
										<span class="input-group-addon" id="note">Note</span> <textarea
											name="note"
											type="textarea" class="form-control"
											placeholder="enter notes for contact"
											aria-describedby="basic-addon1"></textarea>
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
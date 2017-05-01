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

				<div class="inner cover">
					<h1>Contact list.</h1>
					<hr>
					<ul class="list-group">
						<li class="list-group-item">
							<div class="col-xs-4">
								<img src="library/avatars/default.png"
									class="img-circle img-responsive avatar" alt="Default avatar">
							</div>

							<div class="col-xs-8 text-left">
								<h4 class="list-group-item-heading">Sample Contact One</h4>
								<br>
								<p class="list-group-item-text">
									<strong>Phone:</strong> <span>+387 / 66 387-456</span><br>
									<strong>Email:</strong> <span>contactOne@email.com</span><br>
									<strong>City:</strong> <span>Doboj</span><br>
								</p>
							</div>
							<div class="clearfix"></div>
						</li>
						<li class="list-group-item">
							<div class="col-xs-4">
								<img src="library/avatars/default.png"
									class="img-circle img-responsive avatar" alt="Default avatar">
							</div>

							<div class="col-xs-8 text-left">
								<h4 class="list-group-item-heading">Sample Contact Two</h4>
								<br>
								<p class="list-group-item-text">
									<strong>Phone:</strong> <span>+387 / 66 879-754</span><br>
									<strong>Email:</strong> <span>contactTwo@email.com</span><br>
									<strong>City:</strong> <span>Derventa</span><br>
								</p>
							</div>
							<div class="clearfix"></div>
						</li>
						<li class="list-group-item">
							<div class="col-xs-4">
								<img src="library/avatars/default.png"
									class="img-circle img-responsive avatar" alt="Default avatar">
							</div>

							<div class="col-xs-8 text-left">
								<h4 class="list-group-item-heading">Sample Contact Three</h4>
								<br>
								<p class="list-group-item-text">
									<strong>Phone:</strong> <span>+387 / 66 004-782</span><br>
									<strong>Email:</strong> <span>contactThree@email.com</span><br>
									<strong>City:</strong> <span>Gračanica</span><br>
								</p>
							</div>
							<div class="clearfix"></div>
						</li>

					</ul>
				</div>

				<%@ include file="footer.jsp"%>
			</div>
		</div>
	</div>

	<%@ include file="foot.jsp"%>
</body>

</html>
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

				<div class="inner cover">
					<h1 class="cover-heading">Welcome to open phonebook.</h1>
					<p class="lead">
						Please <a href="login">login</a> or <a href="register">register</a>
						to continue.
					</p>
				</div>

				<%@ include file="footer.jsp"%>
			</div>
		</div>
	</div>

	<%@ include file="foot.jsp"%>
</body>

</html>
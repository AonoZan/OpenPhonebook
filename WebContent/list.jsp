<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						<c:forEach var="contact" items="${contactList}">
						<li class="list-group-item">
							<div class="col-xs-4">
								<img src="library/avatars/default.png"
									class="img-circle img-responsive avatar" alt="Default avatar">
							</div>

							<div class="col-xs-8 text-left">
								<h4 class="list-group-item-heading"><c:out value="${contact.name}" /> </h4>
								<br>
								<p class="list-group-item-text">
									<strong>Date of Birth:</strong> <span><c:out value="${contact.dob}" /></span><br>
									<strong>Phone:</strong> <span><c:out value="${contact.phone}" /></span><br>
									<strong>Email:</strong> <span><c:out value="${contact.email}" /></span><br>
									<strong>Note:</strong> <span><c:out value="${contact.note}" /></span><br>
								</p>
							</div>
							<div class="clearfix"></div>
						</li>
						</c:forEach>
					</ul>
				</div>

				<%@ include file="footer.jsp"%>
			</div>
		</div>
	</div>

	<%@ include file="foot.jsp"%>
</body>

</html>
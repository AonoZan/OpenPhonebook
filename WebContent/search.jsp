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
					<div class="container-fluid">
						<div class="row-fluid">
							<div class="col-lg-8 col-lg-offset-2">
								<h1>Search your contacts.</h1>
								<hr>
								<form>
									<div class="input-group">
										<input type="text" class="form-control"
											placeholder="enter search term"
											aria-describedby="search-term"> <span
											class="input-group-btn" id="search-term">
											<button class="btn btn-secondary" type="button">Search</button>
										</span>
									</div>
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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
				<div class="masthead clearfix">
					<div class="inner">
						<h3 class="masthead-brand">Open Phonebook</h3>
						<nav>
							<ul class="nav masthead-nav">
								<li class="${'/index.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="home">Home</a></li>
								<li class="${'/login.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="login">Log in</a></li>
								<li class="${'/register.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="register">Register</a></li>
							</ul>
						</nav>
					</div>
				</div>
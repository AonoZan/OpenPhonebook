<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
				<div class="masthead clearfix">
					<div class="inner">
						<h3 class="masthead-brand">Open Phonebook</h3>
						<nav>
							<ul class="nav masthead-nav">
								<li class="${'/search.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="search">Search</a></li>
								<li class="${'/add.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="add">Add Contact</a></li>
								<li class="${'/list.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="list">List Contacts</a></li>
							</ul>
						</nav>
					</div>
				</div>
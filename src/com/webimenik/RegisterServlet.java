package com.webimenik;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webimenik.bo.UserBOImplementation;
import com.webimenik.dao.user.IWritableUser;
import com.webimenik.dao.user.WriteUser;
import com.webimenik.dto.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(name != null & password != null) {
			IWritableUser userWriter = new WriteUser();
			UserBOImplementation bo = new UserBOImplementation();
			bo.setUserWriter(userWriter);
			
			User user = new User(name, password);
			bo.addUser(user);
			
			String link = "/login.jsp";
			RequestDispatcher view = request.getRequestDispatcher(link);
			view.forward(request, response);
			
		}
		
		String link = "/register.jsp";
		RequestDispatcher view = request.getRequestDispatcher(link);
		view.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
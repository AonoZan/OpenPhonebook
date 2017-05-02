package com.webimenik;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webimenik.bo.UserBOImplementation;
import com.webimenik.dao.user.IReadableUser;
import com.webimenik.dao.user.ReadUser;
import com.webimenik.dto.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(name != null & password != null) {
			IReadableUser userReader = new ReadUser();
			UserBOImplementation bo = new UserBOImplementation();
			bo.setUserReader(userReader);
			
			User user = new User(name, password);
			int ID = bo.userID(user);
			
			if(ID != 0) {
				user.setID(ID);
				HttpSession session = request.getSession();
				session.setAttribute("userID", ID);
				
				String link = "/search.jsp";
				RequestDispatcher view = request.getRequestDispatcher(link);
				view.forward(request, response);
			}
			
		}
		
		String link = "/login.jsp";
		RequestDispatcher view = request.getRequestDispatcher(link);
		view.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
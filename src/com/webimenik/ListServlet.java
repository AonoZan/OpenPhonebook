package com.webimenik;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webimenik.bo.ContactBOImplementation;
import com.webimenik.dao.contact.ContactReader;
import com.webimenik.dao.contact.IReadableContact;
import com.webimenik.dto.Contact;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IReadableContact reader = new ContactReader();
		ContactBOImplementation bo = new ContactBOImplementation();
		bo.setContactReader(reader);
		
		HttpSession session = request.getSession();
		int ID = Integer.parseInt((session.getAttribute("userID").toString()));
		
		ArrayList<Contact> contactList = bo.getContacts(ID);
		String link = "/list.jsp";
		RequestDispatcher view = request.getRequestDispatcher(link);
		request.setAttribute("contactList", contactList);
		view.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
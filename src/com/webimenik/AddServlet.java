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
import com.webimenik.dao.contact.ContactWriter;
import com.webimenik.dao.contact.IWritableContact;
import com.webimenik.dto.Contact;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String note = request.getParameter("note");
		
		if (name != null & phone != null) {
			HttpSession session = request.getSession();
			int ID = Integer.parseInt((session.getAttribute("userID").toString()));
			
			Contact contact = new Contact(ID, name);
			contact.setDob(dob);
			contact.setPhone(phone);
			contact.setEmail(email);
			contact.setNote(note);
			ArrayList<Contact> contactList = new ArrayList<>();
			contactList.add(contact);
			
			IWritableContact contactWriter = new ContactWriter();
			ContactBOImplementation bo = new ContactBOImplementation();
			bo.setContactWriter(contactWriter);
			bo.addContact(contact);
			
			String link = "/list.jsp";
			RequestDispatcher view = request.getRequestDispatcher(link);
			request.setAttribute("contactList", contactList);
			view.forward(request, response);
		} else {
			String link = "/add.jsp";
			RequestDispatcher view = request.getRequestDispatcher(link);
			view.forward(request, response);
		}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
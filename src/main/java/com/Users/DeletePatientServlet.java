package com.Users;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeletePatientServlet")
public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean isTrue;
		isTrue = UsersDBUtil.deletePatient(id);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("PatientSignup.jsp");
			dis.forward(request, response);
			
		}
		else {
			List<Users> userDetails = UsersDBUtil.getUsersDetails(id);
			request.setAttribute("userDetails", userDetails);
			RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
			dis.forward(request, response);
		}
	
	}

}

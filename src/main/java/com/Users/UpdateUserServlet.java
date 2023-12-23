package com.Users;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		boolean isTrue;
		isTrue = UsersDBUtil.UpdateUser(id, name, address, email, phone, gender, age, username, password);

		if(isTrue == true) {
			List<Users> userDetails = UsersDBUtil.getUsersDetails(id);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
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

package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Users.Users;
import com.Users.UsersDBUtil;


@WebServlet("/AdminUserUpdate")
public class AdminUserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");

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
			out.println("<script type='text/javascript'>");
			out.println("alert('User Update  successfully');");
			out.println("location='FindUsers.jsp'");
			out.println("</script>");
			
		}
		else {
			List<Users> userDetails = UsersDBUtil.getUsersDetails(id);
			request.setAttribute("userDetails", userDetails);
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}

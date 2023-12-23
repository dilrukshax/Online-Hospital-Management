package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddUsersServlet")
public class AddUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String username = request.getParameter("UID");
		String password = request.getParameter("PID");
		String usertype = request.getParameter("usertype");

		boolean isTrue;

		isTrue = AdminDBUtil.AddUsers(name, address,email, phone, gender, age, username, password, usertype);

		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('User Add Successfull');");
			out.println("location='AddUsers.jsp'");
			out.println("</script>");
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}

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


@WebServlet("/AdminDeleteUser")
public class AdminDeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
String id = request.getParameter("id");
		
		boolean isTrue;
		isTrue = UsersDBUtil.deletePatient(id);
		
		if(isTrue == true) {						
			out.println("<script type='text/javascript'>");
			out.println("alert('User Deleted Successfully');");
			out.println("location='FindUsers.jsp'");
			out.println("</script>");					
		}
		else {
			List<Users> userDetails = UsersDBUtil.getUsersDetails(id);
			request.setAttribute("userDetails", userDetails);
			RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
			dis.forward(request, response);
		}
	}

}

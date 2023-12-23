






















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



@WebServlet("/FindUsersServlet")
public class FindUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out = response.getWriter();
    response.setContentType("text/html");

    String username = request.getParameter("FUserName");
    boolean isTrue;

		try {
			isTrue = AdminDBUtil.findUser(username);

			if (isTrue == true) {
				List<Users> userDetails = UsersDBUtil.getUsers(username);
				request.setAttribute("userAdminDetails", userDetails);
				RequestDispatcher dis = request.getRequestDispatcher("FindUsers.jsp");
				dis.forward(request, response);
			} else {
				out.println("<script type='text/javascript'>");
				out.println("alert('You cannot Find');");
				out.println("location='FindUsers.jsp'");
				out.println("</script>");
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
		
		
		
				
	}

}

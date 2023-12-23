package com.Users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out = response.getWriter();
    response.setContentType("text/html");

    String username = request.getParameter("UID");
    String password = request.getParameter("PID");
    boolean isTrue;

		try {
			isTrue = UsersDBUtil.validate(username, password);

			if (isTrue) {
				List<Users> userDetails = UsersDBUtil.getUsers(username);
				request.setAttribute("userDetails", userDetails);

				HttpSession session = request.getSession();
				session.setAttribute("userDetails", userDetails);
				RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");

				if (userDetails.get(0).getusertype()==0){//admin
					dis = request.getRequestDispatcher("Home.jsp");
					

				}else if (userDetails.get(0).getusertype()==1){
					dis = request.getRequestDispatcher("Home.jsp");
					

				}else if (userDetails.get(0).getusertype()==2){
					dis = request.getRequestDispatcher("Home.jsp");
					

				}else if (userDetails.get(0).getusertype()==3){
					dis = request.getRequestDispatcher("Home.jsp");
					

				}else if (userDetails.get(0).getusertype()==4){
					dis = request.getRequestDispatcher("Home.jsp");
				}
					dis.forward(request, response);
				


				

				
				
			} else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Your username or password is incorrect');");
				out.println("location='UsersLogin.jsp'");
				out.println("</script>");
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}

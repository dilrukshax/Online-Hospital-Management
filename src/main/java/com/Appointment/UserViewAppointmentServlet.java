package com.Appointment;

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
import com.Users.Users;

@WebServlet("/UserViewAppointmentServlet")
public class UserViewAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<Users> usersList = (List<Users>) session.getAttribute("userDetails");
		Users users = null;
		if (usersList != null && !usersList.isEmpty()) {
			users = usersList.get(0); // Assuming you want the first user if there are multiple users in the list
		}
		if (users != null) {

			int uid = users.getId();

			try {
				List<Appointment> appointmentList = AppointmentDBUtil.getAppointment(uid);

				boolean isTrue = appointmentList.isEmpty();

				if (isTrue == false) {
					request.setAttribute("appointmentList", appointmentList);
					RequestDispatcher dis = request.getRequestDispatcher("UserViewAppointment.jsp");
					dis.forward(request, response);
				} else {
					out.println("<script type='text/javascript'>");
					out.println("alert('Appointment Not Available');");
					out.println("location='index.jsp'");
					out.println("</script>");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

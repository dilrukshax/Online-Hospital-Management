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

import com.Users.Users;


@WebServlet("/GetDoctorsServlet")
public class GetDoctorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
		try {
			
				List<Users> DoctorDetails = AppointmentDBUtil.getDoctor();
				
				boolean isTrue = DoctorDetails.isEmpty();
				
				if(isTrue == false) {
					request.setAttribute("DoctorDetails", DoctorDetails);
					RequestDispatcher dis = request.getRequestDispatcher("AddAppointment.jsp");
					dis.forward(request, response);					
				}
				else {
					out.println("<script type='text/javascript'>");
					out.println("alert('Doctors are Not Available');");
					out.println("location='UsersLogin.jsp'");
					out.println("</script>");
				}
				
	
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}

}

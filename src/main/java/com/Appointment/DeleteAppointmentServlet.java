package com.Appointment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteAppointmentServlet")
public class DeleteAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");

		String idappointment = request.getParameter("idappointment");

		boolean isTrue;

		isTrue = AppointmentDBUtil.deleteappointment(idappointment);

		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Appointment Deleted Successfully');");
			out.println("location='UserViewAppointment'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Appointment Not Deleted Successfully');");
			out.println("location='UserViewAppointment'");
			out.println("</script>");
		}

	}

}

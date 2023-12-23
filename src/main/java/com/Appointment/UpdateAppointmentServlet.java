package com.Appointment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateAppointmentServlet")
public class UpdateAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");

		String idappointment = request.getParameter("idappointment");
		String patientid = request.getParameter("patientid");
		String patientname = request.getParameter("patientname");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String description = request.getParameter("description");
		String doctorid = request.getParameter("doctorid");
		String doctorname = request.getParameter("doctorname");
		
		boolean isTrue;

		isTrue = AppointmentDBUtil.updateappointment(idappointment, patientid, patientname, date, time, description, doctorid, doctorname);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Appointment Updated Successfully');");
			out.println("location='UserViewAppointment'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Appointment Not Updated Successfully');");
			out.println("location='UserViewAppointment'");
			out.println("</script>");
		}
		
	}

}

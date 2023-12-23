package com.Appointment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/AddAppointmentServlet")
public class AddAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		int patientid = Integer.parseInt(request.getParameter("patientid"));
		String patientname = request.getParameter("patientname");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String description = request.getParameter("description");
		int doctorid = Integer.parseInt(request.getParameter("doctorid"));
		String doctorname = request.getParameter("doctorname");

		boolean isTrue;

		isTrue = AppointmentDBUtil.insertAppointment(patientid, patientname, date, time, description, doctorid, doctorname);	

		if(isTrue == true) {

			out.println("<script type='text/javascript'>");
			out.println("alert('Appointment Added Successfully');");
			out.println("location='AddAppointment'");
			out.println("</script>");
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}		
	}


}



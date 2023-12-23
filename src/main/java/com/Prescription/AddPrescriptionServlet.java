package com.Prescription;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddPrescriptionServlet")
public class AddPrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html");

		String pdate = request.getParameter("pdate");
		String Diagnostics = request.getParameter("Diagnostics");
		String pmedicine = request.getParameter("pmedicine");
		String pdescription = request.getParameter("pdescription");
		String pdoctorname = request.getParameter("pdoctorname");
		int pdoctorid = Integer.parseInt(request.getParameter("pdoctorid")); // convert String to int
		String ppatientname = request.getParameter("ppatientname");
		int ppatientid = Integer.parseInt(request.getParameter("ppatientid").replace(" ", ""));  // convert String to int


		boolean isTrue;

		isTrue = PrescriptionDBUtil.insertPrescription(pdate, Diagnostics, pmedicine, pdescription, pdoctorname, pdoctorid, ppatientname, ppatientid);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Prescription Add Successfull');");
			out.println("location='AddPrescription.jsp'");
			out.println("</script>");
		}else {
			response.sendRedirect("unsuccess.jsp");
		}


	}

}

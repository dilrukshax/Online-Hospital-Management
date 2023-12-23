package com.Prescription;

import java.io.IOException;
import java.io.PrintWriter;
// import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/UpdatePrescriptionServlet")
public class UpdatePrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");


		String pid = request.getParameter("pid");
		String pdate = request.getParameter("pdate");
		String Diagnostics = request.getParameter("diagnostics");
		String medicine = request.getParameter("pmedicine");
		String description = request.getParameter("pdescription");
		String doctorname = request.getParameter("pdoctorname");
		String doctorid = request.getParameter("pdoctorid");
		String patientname = request.getParameter("ppatientname");
		String patientid = request.getParameter("ppatientid");
		
		System.out.println(pdate+Diagnostics+medicine+description+doctorname+doctorid+patientname+patientid);


		boolean isTrue;
		isTrue = PrescriptionDBUtil.UpdatePrescription(pid, pdate, Diagnostics, medicine, description, doctorname, doctorid, patientname, patientid);

		if(isTrue == true) {
//			List<Prescription> prescriptionList = PrescriptionDBUtil.getPrescription(patientid);
//			request.setAttribute("prescriptionList", prescriptionList);
			out.println("<script type='text/javascript'>");
			out.println("alert('prescription Update  successfully');");
			out.println("location='ViewPrescriptionServlet'");
			out.println("</script>");
			
		}
		else {
			// List<Prescription> prescriptionList = PrescriptionDBUtil.getPrescription(patientid);
			// request.setAttribute("prescriptionList", prescriptionList);
			out.println("<script type='text/javascript'>");
			out.println("alert('Error prescription Update  ');");
			out.println("location='ViewPrescriptionServlet'");
			out.println("</script>");
		}
	}

}

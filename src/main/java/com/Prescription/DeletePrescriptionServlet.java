package com.Prescription;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/DeletePrescriptionServlet")
public class DeletePrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");

		String id = request.getParameter("pid");

		boolean isTrue;
		isTrue = PrescriptionDBUtil.deletePrescription(id);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Prescription deleted successfully');");
			out.println("location='ViewPrescriptionServlet'");
			out.println("</script>");
		}else {
			List<Prescription> prescriptionDetails = PrescriptionDBUtil.getPrescription(id);
			request.setAttribute("prescriptionDetails", prescriptionDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Prescription.jsp");
			dis.forward(request, response);
		}
		
	
	}

}

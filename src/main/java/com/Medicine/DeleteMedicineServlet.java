package com.Medicine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteMedicineServlet")
public class DeleteMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
		
		String medicineID = request.getParameter("medicineId");
		boolean isTrue;
		
		isTrue = MedicineDBUtil.deleteMedicine(medicineID);
		
		if(isTrue == true) {
		
			out.println("<script type='text/javascript'>");
			out.println("alert('Medicine Deleted Successfully');");
			out.println("location='FindMedicine.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Error in Deleting Medicine');");
			out.println("location='DeleteMedicine.jsp'");
			out.println("</script>");
		}
		
	}

}

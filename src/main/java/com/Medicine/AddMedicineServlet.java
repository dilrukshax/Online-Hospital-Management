package com.Medicine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddMedicineServlet")
public class AddMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html");		
		
		String medicineName = request.getParameter("medicineName");
		String medicineType = request.getParameter("medicineType");
		String medicineDescription = request.getParameter("medicineDescription");
		String medicinePrice = request.getParameter("medicinePrice");
		String medicineQuantity = request.getParameter("medicineQuantity");
		String medicineExpiryDate = request.getParameter("medicineExpiryDate");
		String medicineManufacturingDate = request.getParameter("medicineManufacturingDate");
		String medicineCompany = request.getParameter("medicineCompany");
		
		boolean isTrue;
		
		isTrue = MedicineDBUtil.insertMedicine( medicineName, medicineType, medicineDescription, medicinePrice, medicineQuantity, medicineExpiryDate, medicineManufacturingDate, medicineCompany);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Medicine Added Successfully');");
			out.println("location='AddMedicine.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Error Occured While Adding Medicine');");
			out.println("location='AddMedicine.jsp'");
			out.println("</script>");
		}
		
	}

}

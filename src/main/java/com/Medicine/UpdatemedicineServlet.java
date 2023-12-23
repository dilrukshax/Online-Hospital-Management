package com.Medicine;

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
import com.Users.UsersDBUtil;


@WebServlet("/UpdatemedicineServlet")
public class UpdatemedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
		
		String medicineId = request.getParameter("medicineId");
		String medicineName = request.getParameter("medicineName");
		String medicineType = request.getParameter("medicineType");
		String medicineDescription = request.getParameter("medicineDescription");
		String medicinePrice = request.getParameter("medicinePrice");
		String medicineQuantity = request.getParameter("medicineQuantity");
		String medicineExpiryDate = request.getParameter("medicineExpiryDate");
		String medicineManufacturingDate = request.getParameter("medicineManufacturingDate");
		String medicineCompany = request.getParameter("medicineCompany");
		
		boolean isTrue;
		
		isTrue = MedicineDBUtil.updateMedicine(medicineId, medicineName, medicineType, medicineDescription, medicinePrice, medicineQuantity, medicineExpiryDate, medicineManufacturingDate, medicineCompany);
		if(isTrue == true) {
			List<Medicines> medicineDetails = MedicineDBUtil.getMedicineDetails(medicineId);
			request.setAttribute("medicineDetails", medicineDetails);
			out.println("<script type='text/javascript'>");
			out.println("alert('Successfully Updated the Medicine Details!');");
			out.println("location='FindMedicine.jsp'");
			out.println("</script>");
			
		}
		else {
			List<Users> userDetails = UsersDBUtil.getUsersDetails(medicineId);
			request.setAttribute("userDetails", userDetails);
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}

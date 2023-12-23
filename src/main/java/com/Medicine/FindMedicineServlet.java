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



@WebServlet("/FindMedicineServlet")
public class FindMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    response.setContentType("text/html");

    String Medicinename = request.getParameter("Medicinename");
    boolean isTrue;

		try {
			isTrue = MedicineDBUtil.findMedicine(Medicinename);

			if (isTrue == true) {
				List<Medicines> medicinesDetails = MedicineDBUtil.getMedicineDetails(Medicinename);
				request.setAttribute("medicinesDetails", medicinesDetails);
				RequestDispatcher dis = request.getRequestDispatcher("FindMedicine.jsp");
				dis.forward(request, response);
				System.out.println("Success");
			} else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Your Medicine Name is Wrong');");
				out.println("location='FindMedicine.jsp'");
				out.println("</script>");
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
	}

}

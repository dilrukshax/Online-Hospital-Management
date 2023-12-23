package com.Prescription;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Users.Users;



@WebServlet("/ViewPrescriptionServlet")
public class ViewPrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<Users> usersList = (List<Users>) session.getAttribute("userDetails");
		Users users = null;
				if (usersList != null && !usersList.isEmpty()) {
					users = usersList.get(0); // Assuming you want the first user if there are multiple users in the list
				}
				if (users != null) {
					int pdoctorid = users.getId();
					try {
						List<Prescription> prescriptionList = PrescriptionDBUtil.getPrescription(String.valueOf(pdoctorid));
						request.setAttribute("prescriptionList", prescriptionList);
						RequestDispatcher dis = request.getRequestDispatcher("ViewPrescription.jsp");
						dis.forward(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}		
				}
			}
		}

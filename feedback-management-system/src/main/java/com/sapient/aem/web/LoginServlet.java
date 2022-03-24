package com.sapient.aem.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.aem.exception.CredentialException;
import com.sapient.aem.model.Role;
import com.sapient.aem.model.User;
import com.sapient.aem.service.UserService;
import com.sapient.aem.service.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService= new UserServiceImpl();
	
	User user = new User();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		try {
			String username =request.getParameter("username");
			String password = request.getParameter("password");
			
			String role= request.getParameter("role");
			Role myRole=null;
			if(role.equals("TRAINEE")) {
				myRole= Role.TRAINEE;
				
			}else if(role.equals("TRAINER")) {
				myRole=Role.TRAINER;
			}else if(role.equals("TRAINING")) {
				myRole=Role.TRAINING;
			}else {
				myRole=null;
			}
			user.setUserName(username);
			user.setPassword(password);
			
			try {
				if(userService.isValidUser(username, password, myRole)) {
					HttpSession session= request.getSession();
					session.setAttribute("username", username);
					session.setAttribute("role", role);
					if(role.equals("TRAINEE")) {
						request.getRequestDispatcher("WEB-INF/views/admin-dashboard.jsp")
														.forward(request, response);
					}else if(role.equals("TRAINER")) {
						request.getRequestDispatcher("WEB-INF/views/trainer-dashboard.jsp")
						.forward(request, response);
					}else if(role.equals("TRAINING")) {
						request.getRequestDispatcher("WEB-INF/views/student-dashboard.jsp")
						.forward(request, response);
					}else {
						out.println("<html><body><h2>"+"Invalid Role"+"</h2></body></html>");
					}
				
				
				}else {
					out.println("<html><body><h2>"+"Invalid Credentials. Login Again"+"</h2></body></html>");
				
					request.getRequestDispatcher("login.html").include(request, response);
					
				}
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}catch(CredentialException e) {
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

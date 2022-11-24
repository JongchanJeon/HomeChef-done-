package FinalProject.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import FinalProject.model.*;
public class Controller extends HttpServlet implements Servlet {
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String actionType = request.getParameter("actionType");
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


}

package com.mvc.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MVCDemoServlets")
public class MVCDemoServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MVCDemoServlets() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	List<StudentInfo> students= StudentUtil.getStudents();
	request.setAttribute("list_student",students);
	RequestDispatcher dispatcher = request.getRequestDispatcher("view_student_two.jsp");
	dispatcher.forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}

package com.hilaryd.servletandjspprojectlearn.mvcmodel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletDemo", value = "/ServletDemo")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentDateUtilList = StudentDateUtil.getStudent();
        request.setAttribute("Student_list", studentDateUtilList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view_students.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

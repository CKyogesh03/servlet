package servlet_context_attribute_operations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get_attribute")
public class GetAttribute extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context = getServletContext();

        Object o=context.getAttribute("std");
        Object o1=context.getAttribute("std1");
        Object o2=context.getAttribute("std2");

        Student s= (Student)o;
        Student s1= (Student)o;
        Student s2= (Student)o;
        resp.getWriter().print("<h1>"+s +s1 +" "+ s2+"</h1>");
    }
}

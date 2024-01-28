package servlet_context_attribute_operations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/set_attribute")
public class SetAttribute extends HttpServlet {
    //must call this class to add the attributes to the servlet context. then only we can access or remove the attributes.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Student s= new Student(1,"Marudhappan",22,100);
        Student s1= new Student(2,"balaji",24,100);
        Student s3= new Student(3,"yogesh",23,80);


        ServletContext context = getServletContext();

        context.setAttribute("std", s);
        context.setAttribute("std1", s1);
        context.setAttribute("std2", s3);


        resp.getWriter().write("<h1> Attributes Added </h1>");
    }

}

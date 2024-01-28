package webxml_servletcontext_servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context_config_eg1")
public class Servlet1 extends HttpServlet {
    //refer web.xml file for the configuration informations about context and config
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out=res.getWriter();

        //servlet context
        ServletContext context =getServletContext(); //method inherited from GenericServlet class
        String college =context.getInitParameter("college");
        out.print("<h1>college:" +college+"</h1>");

        //pending // trying new thing //add and access context attribute using method
        context.setInitParameter("location","chennai");
        String location=context.getInitParameter("location");
        out.print("<h1>location:" +location+"</h1>");

        //servlet config
        ServletConfig config =getServletConfig();
        String name =config.getInitParameter("name");
        out.print("<h1>student name:" +name+"</h1>");
    }
}
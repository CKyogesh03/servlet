package create_servlet_3ways;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/genericServlet")
public class Way2 extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        PrintWriter	out=servletResponse.getWriter();
//
//        String id 	=servletRequest.getParameter("id");
//        String name = servletRequest.getParameter("name");
//
//        String html = "<head>"
//                +"<body>"
//                +	"<h1> Id : "+ id+ "</h1>"
//                +	"<h1> Name : "+ name+ "</h1>"
//                +	"</body>"
//                + "</html>";
//
//        out.print(html);
        PrintWriter out=res.getWriter();
        String html="<html> <body><h1>servlet created using GenericServlet class</h1></body></html>";
        out.print(html);
    }
}

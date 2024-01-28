package create_servlet_3ways;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/httpServlet")
public class Way3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException {

        PrintWriter out=resp.getWriter();
        out.print("<h1> post method created using HttpServlet class</h1>");
    }


    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException {

        PrintWriter out=resp.getWriter();
        out.print("<h1> Get method created using HttpServlet class </h1>");
    }
}

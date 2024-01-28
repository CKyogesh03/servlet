package static_dynamic_servlet.dynamic_servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/currentDateTime")
public class dynamic_stateful extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {

        LocalDateTime dt= LocalDateTime.now();
        PrintWriter p=res.getWriter();

        String html= "<html>" + "<body>" +
                "<h1>"+dt.toString()
                + "</h1>"+ "</body>" + "</html>";
        p.print(html);
    }
}
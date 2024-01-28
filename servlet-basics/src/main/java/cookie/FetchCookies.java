package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/fetchcookies")
public class FetchCookies extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
            Cookie arr[] = req.getCookies();

            for(Cookie c:arr){
                String name=c.getName();
            }
            res.getWriter().print("<h1>cookies saved</h1>");
        }
}
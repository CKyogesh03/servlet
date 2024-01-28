package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addcookies")
public class NonPersistenceCookie extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res){

    }
}

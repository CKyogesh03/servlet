package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savecookies")
public class PersistenceCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        Cookie c1=new Cookie("food","biryani");
        Cookie c2=new Cookie("rice","black");
        res.addCookie(c1);
        res.addCookie(c2);
    }
}

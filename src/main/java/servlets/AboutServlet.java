package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bittercode.model.UserRole;
import com.bittercode.util.StoreUtil;

// Http Servlet extended class for showing the about information
public class AboutServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        
        // If the store is logged in as customer or seller show about info
        if (StoreUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("CustomerHome.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "about");

            // Add PNG image and HTML content from about.html
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang='en'>");
            pw.println("<head>");
            pw.println("    <meta charset='UTF-8'>");
            pw.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            pw.println("    <title>About Us</title>");
            pw.println("    <style>");
            pw.println("        * { margin: 0; padding: 0; box-sizing: border-box; }");
            pw.println("        body { font-family: Arial, sans-serif; background-color: #f0f0f0;");
            pw.println("            display: flex; justify-content: center; align-items: center; height: 100vh; }");
            pw.println("        .container { display: flex; justify-content: center; align-items: center;");
            pw.println("            width: 100%; height: 100%; }");
            pw.println("        .image-container { background-color: #fff; padding: 20px;");
            pw.println("            border-radius: 15px; box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);");
            pw.println("            transition: transform 0.3s ease; text-align: center; }");
            pw.println("        .image-container:hover { transform: scale(1.05); }");
            pw.println("        .image-container img { width: 300px; height: auto; border-radius: 10px; }");
            pw.println("    </style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("    <div class='container'>");
            pw.println("        <div class='image-container'>");
            pw.println("            <img src='favicons/img.png' alt='About Us Image'>");
            pw.println("        </div>");
            pw.println("    </div>");
            pw.println("</body>");
            pw.println("</html>");

        } else if (StoreUtil.isLoggedIn(UserRole.SELLER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("SellerHome.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "about");

            // Add PNG image and HTML content from about.html
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang='en'>");
            pw.println("<head>");
            pw.println("    <meta charset='UTF-8'>");
            pw.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            pw.println("    <title>About Us</title>");
            pw.println("    <style>");
            pw.println("        * { margin: 0; padding: 0; box-sizing: border-box; }");
            pw.println("        body { font-family: Arial, sans-serif; background-color: #f0f0f0;");
            pw.println("            display: flex; justify-content: center; align-items: center; height: 100vh; }");
            pw.println("        .container { display: flex; justify-content: center; align-items: center;");
            pw.println("            width: 100%; height: 100%; }");
            pw.println("        .image-container { background-color: #fff; padding: 20px;");
            pw.println("            border-radius: 15px; box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);");
            pw.println("            transition: transform 0.3s ease; text-align: center; }");
            pw.println("        .image-container:hover { transform: scale(1.05); }");
            pw.println("        .image-container img { width: 300px; height: auto; border-radius: 10px; }");
            pw.println("    </style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("    <div class='container'>");
            pw.println("        <div class='image-container'>");
            pw.println("            <img src='favicons/img.png' alt='About Us Image'>");
            pw.println("        </div>");
            pw.println("    </div>");
            pw.println("</body>");
            pw.println("</html>");

        } else {
            // If the user is not logged in, ask to login first
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, res);
            pw.println("<table class='tab'><tr><td>Please Login First to Continue!!</td></tr></table>");
        }
    }
}

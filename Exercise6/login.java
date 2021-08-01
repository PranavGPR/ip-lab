import java.sql.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class login extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println(
                "<html><head><style>body {background-color: aquamarine;}input {padding: 5px;border-radius: 5%;}</style><body>");
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/PKsLR7vkAi", "PKsLR7vkAi",
                    "1LxIcfiEUr");
            Statement stmt = con.createStatement();
            String sqlstmt = "select id,pwd from login";
            ResultSet rs = stmt.executeQuery(sqlstmt);
            int flag = 0;
            while (rs.next()) {
                if (id.equals(rs.getString(1)) && pwd.equals(rs.getString(2))) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                pw.println("<br><br>SORRY INVALID ID TRY AGAIN ID<br><br>");
                pw.println("<a href=\"login.html\">press LOGIN to RETRY</a>");
            } else {
                pw.println("<br><br>VALID LOGIN ID<br><br>");
                pw.println("<h3><ul>");
                pw.println("<li><a href=\"profile.html\"><fontcolor=\"black\">USER PROFILE</font> </a></li><br><br>");
                pw.println("<li><a href=\"catalog.html\"><fontcolor=\"black\">BOOKS CATALOG</font></a></li><br><br>");
                pw.println(
                        "<li><a href=\"order.html\"><fontcolor=\"black\">ORDER CONFIRMATION</font> </a></li></ul><br><br>");
            }
            pw.println("</body></html>");
        } catch (Exception e) {
            resp.sendError(500, e.toString());
        }
    }
}
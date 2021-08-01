import java.sql.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class catalog extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println(
                "<html><head><style>body {background-color: aquamarine;}input {padding: 5px;border-radius: 5%;}</style><body>");
        String title = req.getParameter("title");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/PKsLR7vkAi", "PKsLR7vkAi",
                    "1LxIcfiEUr");
            Statement stmt = con.createStatement();
            String sqlstmt = "select * from Book_Info where title=\'" + title + "\'";
            ResultSet rs = stmt.executeQuery(sqlstmt);
            int flag = 0;
            while (rs.next()) {
                pw.println("<div align=\"center\">");
                pw.println("ISBN:" + rs.getString(1) + "<br>");
                pw.println("TITLE:" + rs.getString(2) + "<br>");
                pw.println("AUTHOR :" + rs.getString(3) + "<br>");
                pw.println("COUNTRY :" + rs.getString(4) + "<br>");
                pw.println("COVER :" + rs.getString(5) + "<br>");
                pw.println("PRICE:" + rs.getString(6) + "<br>");
                pw.println("</div>");
                flag = 1;
            }
            if (flag == 0) {
                pw.println("<br><br>SORRY INVALID TITLE TRY AGAIN <br><br>");
                pw.println("<a href=\"catalog.html\">press HERE to RETRY</a>");
            }
            pw.println("</body></html>");
        } catch (Exception e) {
            resp.sendError(500, e.toString());
        }
    }
}
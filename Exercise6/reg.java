import java.sql.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class reg extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        pw.println(
                "<html><head><style>body {background-color: aquamarine;}input {padding: 5px;border-radius: 5%;}</style><body>");
        String name = req.getParameter("name");
        String addr = req.getParameter("addr");
        String phno = req.getParameter("phno");
        String id1 = req.getParameter("id");
        String pwd1 = req.getParameter("pwd");
        int no = Integer.parseInt(phno);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/PKsLR7vkAi", "PKsLR7vkAi",
                    "1LxIcfiEUr");
            Statement stmt = con.createStatement();
            String sqlstmt = "select id,pwd from login";
            ResultSet rs = stmt.executeQuery(sqlstmt);
            int flag = 0;
            while (rs.next()) {
                if (id1.equals(rs.getString(1)) && pwd1.equals(rs.getString(2))) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                pw.println("<br><br>SORRY INVALID ID ALREADY EXITS TRY AGAIN WITH NEW ID<br><br>");
                pw.println("<a href=\"reg.html\">press REGISTER to RETRY</a>");
            } else {
                Statement stmt1 = con.createStatement();
                stmt1.executeUpdate("insert into login(id, pwd, name, addr, phno) values('" + id1 + "','" + pwd1 + "','"
                        + name + "','" + addr + "','" + no + "');");
                pw.println("<br><br>YOUR DETAILS ARE ENTERED<br><br>");
                pw.println("<a href=\"login.html\">press LOGIN to login</a>");
            }
            pw.println("</body></html>");
        } catch (Exception e) {
            resp.sendError(500, e.toString());
        }
    }
}
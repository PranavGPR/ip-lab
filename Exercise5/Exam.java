import java.sql.*;
import java.io.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;;
public class Exam extends HttpServlet
{
    public Exam(){

    }
    private static final long serialVersionUID = 102831973239L;

    String Seat_no,Name,ans1,ans2,ans3,ans4,ans5;
    int Total=0;
    Connection connect;
    Statement stmt =null;
    ResultSet rs=null;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try
        {
            String url="jdbc:mysql://localhost:3306/exam";
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection(url,"root","Santhosh@22");
        }
        catch(ClassNotFoundException cnfex)
        {
            cnfex.printStackTrace();
        }
        catch(SQLException sqlex)
        {
            sqlex.printStackTrace();
        }
        catch(Exception excp)
        {
            excp.printStackTrace();
        }
        Seat_no=request.getParameter("Seat_no");
        Name=request.getParameter("Name");
        ans1=request.getParameter("group1");
        ans2=request.getParameter("group2");
        ans3=request.getParameter("group3");
        ans4=request.getParameter("group4");
        ans5=request.getParameter("group5");
        if(ans1.equals("True")){
            Total+=2;
        }
        if(ans2.equals("False")){
            Total+=2;
        }
        if(ans3.equals("True")){
            Total+=2;
        }
        if(ans4.equals("True")){
            Total+=2;
        }
        if(ans5.equals("False")){
            Total+=2;
        }
        response.setContentType("text/html");
        try
        {
            Statement stmt=connect.createStatement();
            int result=stmt.executeUpdate("INSERT into StudentTable (Seat_no, Name, Total) VALUES ( "+ Seat_no +", '"+ Name +"', "+ Total +" );");
            stmt.close();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        
        }
        
        
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body bgcolor=yellow>");
        out.println("<h1> Your response has been Submitted! </h1>\n");
        out.println("<br><br>");
        out.println("<b>"+"The Student MarkSheet is as follows");
        out.println("<table border=5>");
        try
        {
            Statement stmt=connect.createStatement();
            String query="SELECT * FROM StudentTable";
            rs=stmt.executeQuery(query);
            out.println("<th>"+"Seat_no"+"</th>");
            out.println("<th>"+"Name"+"</th>");
            out.println("<th>"+"Marks"+"</th>");
            while(rs.next())
            {
                out.println("<tr>");
                out.println("<td>"+rs.getInt(1)+"</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getInt(3)+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }
        catch(SQLException ex)
        {}
        finally
        {
            try
            {
                if(rs!=null)
                rs.close();
                if(stmt!=null)
                stmt.close();
                if(connect!=null)
                connect.close();
            }catch(SQLException e)
            {

            }
        }
        out.println("<center>");
        out.println("<h1>Thanks!</h1>\n");
        out.println("</center>");
        out.println("</body></html>");
    }
}
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
  
public class FirstServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        //creating form that have invisible textfield  
        out.print("<form action='servlet2'>");  
        out.print("<input type='hidden' name='hiddenfield' value='"+n+"'>");  
        out.print("<input type='submit' value='Submit'>");  
        out.print("</form>");  
        out.close(); 
 
                }catch(Exception e){System.out.println(e);}  
    }  
  
}  

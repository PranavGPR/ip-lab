import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*; 
public class SecondServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //Getting the value from the hidden field  
        String n=request.getParameter("hiddenfield");  
        out.print("Hello "+n);  
  
        out.close();  
                }catch(Exception e){System.out.println(e);}  
    }  
}

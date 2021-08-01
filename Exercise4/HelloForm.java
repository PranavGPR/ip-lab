import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloForm extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Using GET Method to Read Form Data";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		String htmlString = "<html><head><title>" + title + "</title></head><body bgcolor=\"#f0f0f0\"><h1 align=\"center\">"
				+ title + "</h1><div style=\"text-align:center; font-size: 22px;\"><b>First Name</b> : "
				+ request.getParameter("first_name") + "<br /><b>Last Name</b> : " + request.getParameter("last_name")
				+ "</div></body></html>";

		out.println(docType + htmlString);
	}
}
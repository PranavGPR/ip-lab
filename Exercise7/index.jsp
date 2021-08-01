<html>
  <head>
    <title>Include</title>
  </head>


  <body bgcolor=Coral>
    <%@ include file="header.html" %>
   
    <form action="controller.jsp">
      <table border="0" style="font-family: verdana; font-size:10pt;">
        <tr>
          <td>Student Information:</td>
          <td><input type="radio" name="Info" value="S" checked/></td>
        </tr>
	<tr>
          <td>Book Information:</td>
          <td><input type="radio" name="Info" value="B" /></td>
        </tr>
        <tr>
	  <td></td>
	  <td></td>
	</tr>
	<tr>
	  <td></td>
	  <td></td>
	</tr>
	<tr>
	  <td></td>
	  <td></td>
	</tr>
      </table>
      <input type="submit" value="Get_Info"/>      
    </form>
    <jsp:include page="footer.jsp"/>
  </body>
</html>

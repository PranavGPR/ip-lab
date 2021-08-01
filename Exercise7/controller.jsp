<%
  String type = request.getParameter("Info");
  if(type.equals("S")) {
%>
<jsp:forward page="/Student.jsp"/>
<% 
  } else {
%>
 <jsp:forward page="/Catalogue.jsp"/>
<%
  }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 

<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 

<html> 
<head> 
<title>Connection with mysql database</title> 
<style>
            table,th,
            td {
                border: 1px solid black;
                border-collapse: collapse;
            }
        </style>
</head> 
<body>
<%@ include file="header.html" %>
<h1>STUDENT INFORMATION </h1>
<% 
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://remotemysql.com/PKsLR7vkAi", "PKsLR7vkAi", "1LxIcfiEUr");
//here employee is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from Student_Info");  

%>
<form ACTION="SController.jsp"> 
<table>
<tr>	<th><%out.println("RegNo");%></th>
	<th><%out.println("Name");%></th>
	<th><%out.println("Dept");%></th>
	<th><%out.println("Year");%></th>
	<th><%out.println("Section");%></th>
        <th><%out.println("Batch");%></th>
<tr>
<%while(rs.next()){ %>
<tr>
    <td><%out.println(rs.getInt(1));%></td>
    <td><%out.println(rs.getString(2));%></td>
    <td><%out.println(rs.getString(3));%></td>
    <td><%out.println(rs.getString(4));%></td>
    <td><%out.println(rs.getString(5));%></td>
    <td><%out.println(rs.getInt(6));%></td>
</tr>
<%	}			  
}catch(Exception e){ out.println(e); }
%>
</table>
<br/>

<input type=button value="Back" onClick="history.back()">
</form>
<jsp:include page="footer.jsp"/>
</body>
 
</html>

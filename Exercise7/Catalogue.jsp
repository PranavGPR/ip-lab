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
<h1>Book Catalogue </h1>
<% 
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/PKsLR7vkAi", "PKsLR7vkAi", "1LxIcfiEUr");
//here employee is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from Book_Info");  

%>
<table>
<tr>	<th><%out.println("Title");%></th>
	<th><%out.println("Author");%></th>
	<th><%out.println("Country");%></th>
	<th><%out.println("Cover");%></th>
	<th><%out.println("Cost");%></th>
<tr>
<%while(rs.next()){ %>
<tr>
    <td><%out.println(rs.getString(2));%></td>
    <td width="32%"><%out.println(rs.getString(3));%></td>
    <td><%out.println(rs.getString(4));%></td>
    <td width="30%"><%out.println(rs.getString(5));%></td>
    <td><%out.println(rs.getInt(6));%></td>
</tr>
<%	}			  
}catch(Exception e){ out.println(e); }

%>
</table>
<form>
<input type=button value="Back" onClick="history.back()">
</form>
<jsp:include page="footer.jsp"/>
</body> 
</html>

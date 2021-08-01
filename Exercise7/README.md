# Exercise 7

## Procedure

1. Install MySQL in your local machine if you don't have it.
2. Go to the directory where Tomcat is installed (Default directory will be C:/Program Files/Apache Software Foundation/Tomcat 10.0/) and open the webapps folder.
3. Make a folder (For example: ex7) inside the <strong>webapps</strong> folder.
4. Copy the HTML files provided in this repository and paste it inside the new folder (For example: ex7) created by you.
5. Create a folder named <strong>WEB-INF</strong> (with same spelling) inside the newly created folder (For example: ex6) and create two folders inside WEB-INF named <strong>lib, classes</strong>.
6. Create a file named <strong>web.xml</strong> also inside <strong>WEB-INF</strong> folder.
7. Copy the .jar file provided in this repository and paste it in the <strong>lib</strong> folder inside the WEB-INF folder.
8. Open MySQL Workbench and create a connection on localhost and remember the username and password (Default username is root).
9. After creating the connection, create the database and the tables needed for the experiment to run.
10. Open student.jsp and catalogue.jsp files and change the connection details like connection_url, hostname and password (connection_url is jdbc:mysql://localhost:3306, username is root. Password will be the one you provided on the MySQL Workbench for the connection).
11. After completing the previous step, go to Tomcat 10.0/bin and open Tomcat10.exe file to start the server.
12. Open your preferred browser and go to the url http://localhost:8080/ex7/index.jsp (Here ex7 is the folder name I used as example. You have to replace it with the folder name you used).

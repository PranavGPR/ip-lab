# Exercise 6

## Procedure

1. Install Tomcat server into your local machine. [Click here to download it for Windows.]("https://tomcat.apache.org/download-10.cgi#10.0.8")
2. Install MySQL in your local machine if you don't have it. [Click here to download it.]("https://dev.mysql.com/downloads/mysql/)
3. After installation, go to the installed directory (Default directory will be C:/Program Files/Apache Software Foundation/Tomcat 10.0/) and open the <strong>webapps</strong> folder.
4. Make a folder (For example: ex6) inside the <strong>webapps</strong> folder.
5. Copy the HTML files provided in this repository and paste it inside the new folder (For example: ex6) created by you.
6. Create a folder named <strong>WEB-INF</strong> (with same spelling) inside the newly created folder (For example: ex6) and create two folders inside WEB-INF named <strong>lib</strong>, <strong>classes</strong>.
7. Create a file named <strong>web.xml</strong> also inside <strong>WEB-INF</strong> folder.
8. Paste the contents provided in lib, classes folders and web.xml file into the folder you have created in <strong>webapps</strong> folder (For example: ex6).
9. Open MySQL Workbench and create a connection on localhost and remember the username and password (Default username is root).
10. After creating the connection, create the database and the tables needed for the experiment to run.
11. Open each .java files and change the connection details like connection_url, hostname and password (connection_url is jdbc:mysql://localhost:3306, username is root. Password will be the one you provided on the MySQL Workbench for the connection).
12. After completing the previous step, go to <strong>Tomcat 10.0/bin</strong> and open <strong>Tomcat10.exe</strong> file to start the server.
13. Open your preferred browser and go to the url http://localhost:8080/ex6/main.html (Here <strong>ex6</strong> is the folder name I used as example. You have to replace it with the folder name you used).

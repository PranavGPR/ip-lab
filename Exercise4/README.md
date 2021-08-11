# Exercise 4

Write programs in Java using Servlets:
i. To invoke servlets from HTML forms
ii. Session tracking using hidden form fields and Session tracking for a hit count

## Procedure

1. Install Tomcat server into your local machine.
2. Install MySQL in your local machine if you don't have it.
3. After installation, go to the installed directory (Default directory will be C:/Program Files/Apache Software Foundation/Tomcat 10.0/) and open the <strong>webapps</strong> folder.
4. Make a folder (For example: Exercise4) inside the <strong>webapps</strong> folder.
5. Copy the HTML files provided in this repository and paste it inside the new folder (For example: Exercise4) created by you.
6. Create a folder named <strong>WEB-INF</strong> (with same spelling) inside the newly created folder (For example: Exercise4) and create two folders inside WEB-INF named <strong>lib</strong>, <strong>classes</strong>.
7. Create a file named <strong>web.xml</strong> also inside <strong>WEB-INF</strong> folder.
8. Paste the contents provided in lib, classes folders and web.xml file into the folder you have created in <strong>webapps</strong> folder (For example: Exercise4).
9. After completing the previous step, go to <strong>Tomcat 10.0/bin</strong> and open <strong>Tomcat10.exe</strong> file to start the server.
10. Open your preferred browser and go to the url http://localhost:8080/Exercise4/index.html (Here <strong>Exercise4</strong> is the folder name I used as example. You have to replace it with the folder name you used).

<strong>NOTE: For building class files and moving it to WEB-INF/classes folder, you can use the below command:</strong>

```shell
javac -cp ./lib/* ./*.java -d ./WEB-INF/classes/
```

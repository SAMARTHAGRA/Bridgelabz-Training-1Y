RouteTrackerSystem MySQL JDBC setup

1. Open MySQL Workbench.
2. Open database.sql and run it.
3. Download MySQL Connector/J from Oracle:
   https://dev.mysql.com/downloads/connector/j/

   On the download page:
   - Select Platform Independent.
   - Download the ZIP Archive.
   - If it asks for login, click "No thanks, just start my download."
   - Extract the ZIP.
   - Find the file named like mysql-connector-j-9.x.x.jar.

4. Copy that connector jar into this folder:
   RouteTrackerSystem-mysql/lib/

   Example jar name:
   mysql-connector-j-9.6.0.jar

5. Run compile.bat.
6. Run run.bat.

The program connects to:
localhost:3306
database: route_tracker_system

It asks for the MySQL username and password when the program starts.

IntelliJ setup:
1. File > Project Structure.
2. Modules > Dependencies.
3. Click +.
4. Choose JARs or Directories.
5. Select the mysql-connector-j jar from the lib folder.
6. Apply, then run Main.java.

Common errors:

ClassNotFoundException: com.mysql.cj.jdbc.Driver
The connector jar is missing from the classpath.

Unknown database 'route_tracker_system'
Run database.sql in MySQL Workbench first.

Access denied for user 'root'
The username or password is wrong.

Communications link failure
MySQL Server is not running, or it is not on localhost:3306.

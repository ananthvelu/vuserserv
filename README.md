vuserserv
=========

Get the source code :

1. git clone https://github.com/ananthvelu/vuserserv.git 

2. Modify any code,

3. run code using this command from project home directory:

a. mvn package (you need to install maven and set the M2_HOME directory in your PATH environment). 

b. 

Command to run the service :

java -jar target/dependency/jetty-runner.jar projects/app/vuser-war/target/vuserserv.war

you need to set environmental variable PORT = some port 

CSH shell :
   	
	setenv PORT 5000
or 

bash :

	export PORT=5000

go to browser, execute localhost:5000

Jetty is a light weight container which run your code. meaning this is the server doing http GET and POST,PUT, DELETE, etc..


to push the code, do this

1. git add file name

2. git commit -m "brief abt the change"

3. git pull --rebase

4. git push origin develop

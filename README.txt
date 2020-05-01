This project is designed to be run on apache tomcat servers in eclipse. Using any other IDE or server technology will not garantee a succesfull program

After downloading the program, to finish installation, you will need to edit some things for the program to run on your pc.

first go to <location you have downloaded the project to>\SemesterProject\src\main\webapp\resources\uploads. Copy the address to this location and move to step 2

step 2, go to SemesterProject/src/java/SemesterProject/SemesterProject/Controller and open up the getUploadDirectory.java in a text editor
to =>
String uploadDirectory = "<location you have downloaded the project to>\SemesterProject\src\main\webapp\resources\uploads";

save the file and after that the program should work

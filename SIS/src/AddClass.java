import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;

public class AddClass {

public static void runAdd() throws IOException
{
System.out.println("\nWould you like to \n  (1) Add a new student to the database.\n  (2) Delete a student from the database.");
Scanner userInput = new Scanner(System.in);
int userChoice = userInput.nextInt();
if(userChoice ==  1)
{
addStudent();
}
else if(userChoice == 2)
{
deleteStudent();
}
else
{
System.out.println("Sorry, you selected a choice not on our list. We will re-direct you to select again.");
runAdd();
}
}


public static void addStudent() throws IOException
{
StudentList.fileRead();

Scanner studentFile = new Scanner(new File("studentData.txt"));

Scanner input = new Scanner(System.in);

System.out.println("Enter the student details");
//firstname
System.out.print("First Name");
String firstName = input.next();
//lastname
System.out.print("Last  Name");
String lastName = input.next();
//gpa

System.out.print("GPA");
double gpa = input.nextDouble();


//System.out.print("GPA");
//double gpa = input.nextDouble();

//alg grade
System.out.print("Algebra Grade");
int algGrade = input.nextInt();
//eng grade
System.out.print("English Grade");
int engGrade = input.nextInt();
//chem grade
System.out.print("Chemistry Grade");
int chemGrade = input.nextInt();




///this calculates the gpa so the person doesn't have to put it in above.
// double gpa = StudentList.gpa(algGrade, engGrade, chemGrade);

//adding the new student
Student newStudent = new Student(firstName, lastName, gpa, algGrade, engGrade, chemGrade);
StudentList.getStudents().add(newStudent);

System.out.print("The new student has been added. We will reroute you to the main menu.");
SISrunner.mainMenu();
}
public static  void deleteStudent() throws IOException
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the student you want to delete");
int index = input.nextInt();




///this checks to see if the student index is valid and cam be removed

if(index >=0 && index <StudentList.students.size())
{
StudentList.students.remove(index);
System.out.println("Deleted student. We will reroute you to the main menu.");
SISrunner.mainMenu();
}
else
{
System.out.println("Not a valid student. We will reroute you to the main menu.");
SISrunner.mainMenu();
}
}


}
	
	

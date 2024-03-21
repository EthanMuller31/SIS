import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;

public class AddClass {

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
			double gpa = StudentList.calculateGPA(algGrade, engGrade, chemGrade);

		//adding the new student 
		Student newStudent = new Student(firstName, lastName, gpa, algGrade, engGrade, chemGrade);
		StudentList.getStudents().add(newStudent);
			
		System.out.print("added");
			}
		public static  void deleteStudent()
		{ 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the student you want to delete");
			int index = input.nextInt();

			if(index >=0 && index <StudentList.students.size())
			{
				StudentList.students.remove(index);
				System.out.println("deleted student");
			}
			else
			{
				System.out.println("not valid student");
			}
		}
			
		public static void readFile()
		{
			
		}
		}
	
	

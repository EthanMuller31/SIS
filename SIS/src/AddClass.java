import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AddClass {
	
	private ArrayList<Student>students;
	private static final String FILE_NAME = "studentData.txt";
	
	public AddClass(ArrayList<Student> students)
	{
		this.students = students;
	}
	
	public void addStudent() 
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student details");
		//firstname
		System.out.print("First Name");
		String firstName = scanner.next();
		//lastname
		System.out.print("Last  Name");
		String lastName = scanner.next();
		//gpa
		System.out.print("GPA");
		double gpa = scanner.nextDouble();
		//alg grade
		System.out.print("Algebra Grade");
		int algGrade = scanner.nextInt();
		//eng grade
		System.out.print("English Grade");
		int engGrade = scanner.nextInt();
		//chem grade
		System.out.print("Chemistry Grade");
		int chemGrade = scanner.nextInt();

		//adding the new student 
		Student newStudent = new Student(firstName, lastName, gpa, algGrade, engGrade, chemGrade);
		students.add(newStudent);
		System.out.print("added")
			}
		public void deleteStudent()
		{ 
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the student you want to delete");
			int index = scanner.nextInt();

			if(index >=0 && index <students.size())
			{
				students.remove(index);
				System.out.println("deleted student");
			}
			else
			{
				System.out.println("not valid student");
			}
		}
			
		public void readFile()
		{
			
		}
		}
	
	

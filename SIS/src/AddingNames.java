import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AddingNames {
	
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
			studentList.fillArray();
			chooseAdd();

	}
	
	public static void chooseAdd() {
		System.out.println("Would you like to 1) add a student or 2) delete a student?");
		int userChoice  = userInput.nextInt();
		
		if(userChoice == 1)
			{
				System.out.println("What is the first and last name of the student you would like to add?");
				String newName = userInput.nextLine();
				String newLast = userInput.nextLine();
				
				Student newStudent = new Student(newName, newLast);
			     insertStudentInOrder(newName, StudentList.students);
			}
		for (int i = 0; i < StudentList.students.size(); i++) {
	          Student runner = Times.time.get(i);
	            System.out.println((i + 1) + ")" + runner.getName() + " ~ " + runner.getTime());
	        }
	
	
	
	}

}

import java.util.Scanner;

public class AddingNames {
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	
	public static void chooseAdd() {
		System.out.println("Would you like to 1) add a student or 2) delete a student?");
		int userChoice  = userInput.nextInt();
		
		if(userChoice == 1)
			{
				System.out.println("What is the first and last name of the student you would like to add?");
				String newName = userInput.nextLine();
				String newLast = userInput.nextLine();
				
				Student newStudent = new Student(newName, newLast, userChoice, userChoice, userChoice, userChoice);
			     insertStudentInOrder(newName, StudentList.students);
			}
			
	
	
	}

}

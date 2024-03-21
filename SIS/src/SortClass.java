import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortClass
{
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	static int sortPick;
	
	public static void main(String[] args)
	{
		displaySortMenu();

	}
	
	static void displaySortMenu()
		{
			System.out.println("How Would you like to sort it?");
			System.out.println("Type (1) for by last name");
			System.out.println("Type (2) for by GPA");
			System.out.println("Type (3) for by class period");
			System.out.println("Type (4) to return to the main menu");
			
			
			Scanner userInput = new Scanner(System.in);
			int userChoice = userInput.nextInt();	
			
			if(userChoice == 1) {
				Collections.sort(StudentList.students, new NameSorter());
			}
			else if(userChoice == 2) {
				Collections.sort(StudentList.students, new GPASorter());
			} else if (userChoice == 3) {
				System.out.println("Enter the class period number (1) (2) or (3):");
				int periodNumber = userInput.nextInt();
				if(periodNumber < 1 || periodNumber > 3) {
					System.out.println("Invalid period number. Type (1) (2) or (3):");
					periodNumber = userInput.nextInt();
				}

				Collections.sort(StudentList.students, new PeriodSorter(periodNumber));
			} else {
				SISrunner.mainMenu();
			}
			SISrunner.displayData();
		}

}


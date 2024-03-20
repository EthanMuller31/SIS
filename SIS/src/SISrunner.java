import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SISrunner
	{

		public static void mainMenu()
			{
			System.out.println("Welcome to the Student Data Base! Would you like to \n  (1) Add or delete a student.\n  (2) Change a student's schedule or grade.\n  (3) Re-sort the student database.");
			Scanner userInput = new Scanner(System.in);
			
			int userChoice = userInput.nextInt();
			
			if(userChoice == 1)
			{
				runAdd();
			}
			else if(userChoice == 2)
			{
				chooseChange();
			}
			else if(userChoice == 3)
			{
				displaySortMenu();
			}
			else
			{
			System.out.println("Sorry, you selected a choice not on our list. We will re-direct you to select again.");
			mainMenu();
			}
			
			}

	}

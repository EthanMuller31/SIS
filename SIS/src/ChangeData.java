import java.util.Scanner;
import java.util.ArrayList;

public class ChangeData {
	public static void chooseChange()
{
		System.out.println("Would you like to \n  (1) Change a student's grade.");
		Scanner userInput = new Scanner(System.in);
		
			int userChoice = userInput.nextInt();
			if(userChoice == 1)
				{
	changeGrade();
				}
			else
				{
					System.out.println("Sorry, you selected a choice not on our list. We will re-direct you to select again.");
					chooseChange();
				}
	}

	public static void changeGrade()
		{	

		}
}

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
	static int periodNumber;
	public static void main(String[] args)
	{
		displaySortMenu();

	}
	
	private static void displaySortMenu()
		{
			System.out.println("How Would you like to sort it?");
			System.out.println("Type (1) for by last name");
			System.out.println("Type (2) for by GPA");
			System.out.println("Type (3) for by class period");
			System.out.println("Type (4) to return to the main menu");
			
			int userChoice = userInput.nextInt();	
			
			switch(userChoice) {
				case 1: 
					Collections.sort(StudentList.studentList, new NameSorter());
					break;
				case 2:
					Collections.sort(StudentList.studentList, new GPASorter());
					break;
				case 3:
					Collections.sort(StudentList.studentList, new PeriodSorter());
					break;
				default:
					displayMainMenu();
					return;
			}
			SISrunner.displayData();
		}

	private static void sortPeriod() {
		System.out.println("\nEnter the class period you would like (1, 2, 3)");
		periodNumber = userInput.nextInt();
		Collections.sort(StudentList.studentList, new PeriodSorter(periodNumber));
	}
}


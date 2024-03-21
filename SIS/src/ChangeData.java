import java.util.Scanner;

import java.util.ArrayList;



public class ChangeData {

	public static void chooseChange()

	{

		//lets them choose whether to change a students grade or schedule

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

		//loops through students and displays it with a number assigment

		int counter = 1;

		for(int i = 0; i < StudentList.students.size(); i++)

		{

			System.out.print(counter + StudentList.students.get(i).getFirstName());

			System.out.print(StudentList.students.get(i).getLastName());

			System.out.print(StudentList.students.get(i).getGpa());

			System.out.print(StudentList.students.get(i).getAlgGrade());

			System.out.print(StudentList.students.get(i).getEngGrade());

			System.out.print(StudentList.students.get(i).getBiologyGrade());

			counter++;

		}

		

		//they select which student from the system

		System.out.println("Select what student you would like to select.");

		Scanner userInput = new Scanner(System.in);

		int studentPick = userInput.nextInt();

		studentPick--;

		

		//they select which grade to change and changes the grade

		System.out.println("Select what grade you would like to change. \n  (1) Algebra\n  (2) English\n  (3) Biology");

		int classPick = userInput.nextInt();

		

		System.out.println("Type in the grade you would like your student to have.");

		int newGrade = userInput.nextInt();

		

		if(classPick == 1)

		{

			StudentList.students.get(studentPick).setAlgGrade(newGrade);

		}

		else if(classPick == 2)

		{

			StudentList.students.get(studentPick).setEngGrade(newGrade);

		}

		else if(classPick == 3)

		{

			StudentList.students.get(studentPick).setBiologyGrade(newGrade);

		}



		//provides the choice to go back to main menu

		System.out.println("Changes saved! Type to 1 to return to the main menu.");

		int returnMain = userInput.nextInt();

		if(returnMain == 1)

		{

			int studentPick1 = userInput.nextInt();

		}

	}

}
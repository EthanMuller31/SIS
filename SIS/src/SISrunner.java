import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SISrunner
	{
		public static void main(String[] args) {
		    try {
		        StudentList.fileRead(); 
		        mainMenu(); 
		    } catch (IOException e) {
		        System.out.println("Failed to read student data file: " + e.getMessage());
		    }
		}


		public static void mainMenu()
			{
			System.out.println("Welcome to the Student Data Base! Would you like to \n  (1) Add or delete a student.\n  (2) Change a student's schedule or grade.\n  (3) Re-sort the student database.");
			Scanner userInput = new Scanner(System.in);
			
			int userChoice = userInput.nextInt();
			
			if(userChoice == 1)
			{
				AddClass.runAdd();
			}
			else if(userChoice == 2)
			{
				ChangeData.chooseChange();
			}
			else if(userChoice == 3)
			{
				SortClass.displaySortMenu();
			}
			else
			{
			System.out.println("Sorry, you selected a choice not on our list. We will re-direct you to select again.");
			mainMenu();
			}
			
			}
		
		
		public static void displayData() {
		    System.out.println("Displaying sorted student data:");
		    int counter = 1;

		    for (Student student : StudentList.getStudents()) {
		        System.out.println(counter + ") " + student.getFirstName() + " " + student.getLastName()
		            + " - GPA: " + String.format("%.2f", student.getGpa())
		            + ", Algebra: " + SISrunner.gradeToString(student.getAlgGrade())
		            + ", Biology: " + SISrunner.gradeToString(student.getBiologyGrade()) 
		            + ", English: " + SISrunner.gradeToString(student.getEngGrade()));
		        counter++;
		    }
		}

	        static String gradeToString(int grade) {
	            return switch (grade) {
	                case 4 -> "A";
	                case 3 -> "B";
	                case 2 -> "C";
	                case 1 -> "D";
	                default -> "F";
	            };
	    }
	        
	        public static int letterGradeToNumeric(String grade) {
	            return switch (grade.toUpperCase()) {
	                case "A" -> 4;
	                case "B" -> 3;
	                case "C" -> 2;
	                case "D" -> 1;
	                default -> 0; 
	            };
	        }
	}

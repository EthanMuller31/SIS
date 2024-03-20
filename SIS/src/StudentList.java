import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList 
	{
		static ArrayList<Student> studentList;
		public StudentList() {
			studentList = new ArrayList<>();
		}
		
		public void fileRead() throws IOException
			{
				
				Scanner studentFile = new Scanner(new File("studentData.txt"));
				while(studentFile.hasNextLine()) {
					String line = studentFile.nextLine();
					String[] section = line.split(" ");
					
					String firstName = section[0];
					String lastName = section[1];
					int algGrade = changeGrade(section[3]);
					int engGrade = changeGrade(section[5]);
					int chemGrade = changeGrade(section[7]);
					double gpa = (algGrade + engGrade + chemGrade) / 3.0;
					

					Student student = new Student(firstName, lastName, gpa, algGrade, engGrade, chemGrade);
					studentList.add(student);

				
				
				}
				
			}
		private int changeGrade(String section) {
			int gradeValue = switch (section.charAt(0)) {
				case 'A' -> 4;
				case 'B' -> 3;
				case 'C' -> 2;
				case 'D' -> 1;
				default -> 0;
			};
			
			return gradeValue;
		}
//This method is used to access the ArrayList for display menus etc.
		public static ArrayList<Student> getStudents() {
			return studentList;
		}
		
	}

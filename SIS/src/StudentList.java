import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList 
	{
		static ArrayList<Student>students = new ArrayList<Student>();
		
		
		public static  void fileRead() throws IOException
			{
				
				Scanner studentFile = new Scanner(new File("studentData.txt"));
				while(studentFile.hasNextLine()) {
					String line = studentFile.nextLine();
					String[] section = line.split(" ");
					
					String firstName = section[0];
					String lastName = section[1];
					int algGrade = changeGrade(section[3]);
					int engGrade = changeGrade(section[5]);
					int bioGrade = changeGrade(section[7]);
					double gpa = (algGrade + engGrade + bioGrade) / 3.0;
					

					Student student = new Student(firstName, lastName, gpa, algGrade, engGrade, bioGrade);
					students.add(student);


				}
				
			}
		private static int changeGrade(String section) {
			int gradeValue = switch (section.charAt(0)) {
				case 'A' -> 4;
				case 'B' -> 3;
				case 'C' -> 2;
				case 'D' -> 1;
				default -> 0;
			};
			
			return gradeValue;
		}

		public static ArrayList<Student> getStudents() {
			return students;
		}
		
	}

import java.util.Comparator;

public class PeriodSorter implements Comparator<Student>
	{
		private int period;
		
		public PeriodSorter(int period) {
			this.period = period;		
			}
		
		public int compare (Student s1, Student s2) {
			int grade1 = 0;
			int grade2 = 0;
			
			switch(period) {
				case 1:
					grade1 = s1.getFirstPeriodGrade();
					grade2 = s2.getFirstPeriodGrade();
					break;
				case 2:
					grade1 = s1.getSecondPeriodGrade();
					grade2 = s2.getSecondPeriodGrade();
					break;
				case 3: 
					grade1 = s1.getThirdPeriodGrade();
					grade2 = s2.getThirdPeriodGrade();
					break;
				default:
					System.out.println("Invalid Period Number");
					break;
			}
			return Integer.compare(grade1,grade2);
		}

	}

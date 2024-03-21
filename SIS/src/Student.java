
public class Student
	{
		private String firstName;
		private String lastName; 
		private double gpa;
		private int algGrade;
		private int engGrade;
		private int bioGrade;

		public Student(String firstName, String lastName, double gpa, int algGrade, int engGrade, int bioGrade)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.gpa = gpa;
			this.algGrade = algGrade;
			this.engGrade = engGrade;
			this.bioGrade = bioGrade;
		}
		//first name
		public String getFirstName()
		{
			return firstName;
		}
		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		//lastname
		public String getLastName()
		{
			return lastName;
		}
		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
		//gpa
		public double getGpa()
		{
			return gpa;
		}
		public void setGpa(double gpa)
		{
			this.gpa = gpa;
		}
		//algebra grade
		public int getFirstPeriodGrade()
		{
			return algGrade;
		}
		public void setFirstPeriodGrade(int algGrade)
		{
			this.algGrade = algGrade;
		}
		public int getAlgGrade()
			{
				return algGrade;
			}
			public void setAlgGrade(int algGrade)
			{
				this.algGrade = algGrade;
			}
		//english grade
		public int getThirdPeriodGrade()
		{
			return engGrade;
		}
		public void setThirdPeriodGrade(int engGrade)
		{
			this.engGrade = engGrade;
		}
		public int getEngGrade()
			{
				return engGrade;
			}
			public void setEngGrade(int engGrade)
			{
				this.engGrade = engGrade;
			}
		//chem grade
		public int getSecondPeriodGrade()
		{
			return bioGrade;
		}
		public void setSecondPeriodGrade(int bioGrade)
		{
			this.bioGrade = bioGrade;
		}
		public int getBiologyGrade()
			{
				return bioGrade;
			}
			public void setBiologyGrade(int bioGrade)
			{
				this.bioGrade = bioGrade;
			}
	}

//Course Enrollment
public class CourseEnrollment {
	
	
	
	private String course;
	private int credit;
    public int getCredit() {
		return credit;
	}
    
	public void setCredit(int credit) {
		this.credit = credit;
	}

	private String grade;
	private double GPA;
	
	public CourseEnrollment(){
		course = "";
		grade = "";
		GPA = 0;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		try{this.course = course;}
		catch(NullPointerException e){
			System.out.println("Undefined value of course");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		try{this.grade = grade;}
		catch(NullPointerException e){
			System.out.println("Undefined value of grade");
		}
	}

	public double getGPA() {
		return GPA;
	}

	public void calculate_GPA() {
		
		switch (grade){
		case "A":
			GPA = 4;
			break;
		case "B":
			GPA = 3;
			break;
		case "C":
			GPA = 2;
			break;
		case "D":
			GPA = 1;
			break;
		case "F":
			GPA = 0;
			break;
		default:
			System.out.println("Invalid course grade.");
			GPA = 0;
			break;
				
		}
		
		
	}

}

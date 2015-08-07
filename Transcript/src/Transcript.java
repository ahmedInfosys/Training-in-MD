//Transcript

import java.text.NumberFormat;
import java.util.ArrayList;

import org.junit.* ;
public class Transcript {
	
	private static double overall_credits = 0;
	private static double overall_gpa = 0;
	
	private ArrayList <String> list = new ArrayList <String>();
	private NumberFormat FORMAT = NumberFormat.getInstance();
	
	public void addCourse(CourseEnrollment courseenrollment){
	
		courseenrollment.calculate_overall_GPA();
		overall_gpa += courseenrollment.getCredit()*courseenrollment.getGPA();
		overall_credits += courseenrollment.getCredit();
		String str  = "";
		str = String.format("%-15s%-20d%-15s%-10f",courseenrollment.getCourse(),courseenrollment.getCredit(), courseenrollment.getGrade(),courseenrollment.getGPA());
		list.add(str);
	}
	

	public ArrayList<String> getCourses(){
		return list;
	}

	public double getOverallGPA(){
		return overall_gpa/overall_credits;
	}
	

	public String getFormattedGPA(){
		return FORMAT.format(overall_gpa/overall_credits);
	}


}

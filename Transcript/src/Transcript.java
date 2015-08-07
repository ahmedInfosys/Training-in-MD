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
	

		courseenrollment.calculate_GPA();
		overall_gpa += courseenrollment.getCredit()*courseenrollment.getGPA();
		overall_credits += courseenrollment.getCredit();
		String str  = "";
		try{
			str = String.format("%-15d%-20d%-15d%-10s",courseenrollment.getCourse(),courseenrollment.getCredit(), courseenrollment.getGrade(),courseenrollment.getGPA());
		}catch(ClassCastException e)
		{
			System.out.println("Can't convert from double to string");
		}catch (NullPointerException e){
			System.out.println("Empty Array cell");
		}
		list.add(str);
	}
	

	public ArrayList<String> getCourses(){
		return list;
	}

	public double getOverallGPA(){
		try{
			overall_gpa /= overall_credits;
		}catch (ArithmeticException e){
			System.out.println("Course credits should not contain zero");
		}catch(NullPointerException e){
			System.out.println("No value assigned for either overall GPA or overall credits");
		}
		return overall_gpa;
			
	}
	

	public String getFormattedGPA(){
		return FORMAT.format(overall_gpa/overall_credits);
	}


}

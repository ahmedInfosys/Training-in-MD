import static org.junit.Assert.*;

import org.junit.* ;
public class Transcript_test {
	private Transcript tran;
	private CourseEnrollment courseenrollment;
	//private Validator val;

	
	@Test
	public void getCourses(CourseEnrollment courseenrollment){
		courseenrollment.setCourse("ENG 101");
		courseenrollment.setCredit(3);
		courseenrollment.setGrade("A");
		tran.addCourse(courseenrollment);
		
		courseenrollment.setCourse("CSE 101");
		courseenrollment.setCredit(2);
		courseenrollment.setGrade("C");
		tran.addCourse(courseenrollment);
		
		System.out.println("Testing the getCourses method in Transcript class");
		assertTrue(! tran.getCourses().isEmpty());
	}
	
	@Test
	public void test_getOverallGPA(){
		System.out.println("Testing the getOverallGPA method in Transcript class");
		
	
		assertTrue(tran.getOverallGPA() > 0 && tran.getOverallGPA() <= 4);
	}
	
	@Test
	public void test_getFormattedGPA(){
		System.out.println("Testing the getFormattedGPA method in Transcript class");
		assertTrue(tran.getOverallGPA() == Double.parseDouble((tran.getFormattedGPA())));
	}
	
	@Test
	public void test_getCourse() {
		
		System.out.println("Testing the getCourse() method from CourseEnrollment class");
		assertTrue(!courseenrollment.getCourse().contains("  "));
	}
	
	@Test
	public void test_getcredit() {
		System.out.println("Testing the getCredit() method from CourseEnrollment class");
		assertTrue(courseenrollment.getCredit() <= 6);
	}
	
	@Test
	public void test_getGrade() {
		System.out.println("Testing the getsetGrade() method from CourseEnrollment class");
		assertTrue(courseenrollment.getGrade().length() == 1);
	}
	
	
	@Test
	public void test_getGPA(){
		System.out.println("Testing the getGPA() method from CourseEnrollment class");
		assertTrue(courseenrollment.getGPA() > 0 && courseenrollment.getGPA() <= 4);
	}
	
	@Test
	public void test_getString(){
		System.out.println("Testing the  getString() method from Validator class");
		assertTrue(courseenrollment.getGPA() > 0 && courseenrollment.getGPA() <= 4);
	}
	
	
	
}

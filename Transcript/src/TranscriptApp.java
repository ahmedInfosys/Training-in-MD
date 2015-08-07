//Transcript activity

import java.util.Scanner; 
import java.text.NumberFormat;  


import java.util.*;
public class TranscriptApp {     
	public static void main(String args[])     
	{         // display a welcome message         
		System.out.println("Welcome to the Transcript application.");         
        
		Scanner sc = new Scanner(System.in);  
		
		int credits;
		String course,grade;
	
		String choice = "y";    
		Transcript tran = new Transcript ();
		//double invoice_Total = 0;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		CourseEnrollment enrollment ;
		
		
		while (choice.equalsIgnoreCase("y")){  
			
			
			// get the input from the user   

			course = Validator.getString(sc,"Enter Course: ", 10); 
			credits =  Validator.getInt(sc,"Enter credits:     "); 
			grade = Validator.getString(sc,"Enter grade: ", 1); 
				
		
			
			//get the Product object            
			///enrollmen
			
			enrollment =  new CourseEnrollment();
		
			
			try{
				enrollment.setCourse(course);
				enrollment.setCredit(credits);
				enrollment.setGrade(grade);
				tran.addCourse(enrollment);
				
			}catch(NullPointerException e){
				System.out.println("Undefined variables course, credits,  or grade");
			}catch(IllegalArgumentException e){
				System.out.println("adcourse() method only accept arguments of type CourseEnrollment. "); 
			}

			System.out.println("Another course? (y/n): "); 
			choice = sc.nextLine();

			
		}
		
		System.out.println(" Course      Credits              Grade      Quality points");
		System.out.println("---------   ---------           ---------   -----------------");
		
		
		for (String list:tran.getCourses()){
			System.out.println(list);
		}
		
		String [] Array = tran.getCourses().toArray(new String [tran.getCourses().size()]); 
		
		try{
			System.out.println(Array[1000]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Can't reach index 1000");
		}
		
		
		
		System.out.println("                                  Overall GPA:     " + tran.getFormattedGPA());
		
	}
}
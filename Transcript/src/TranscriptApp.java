//Transcript activity

import java.util.Scanner; 
import java.text.NumberFormat;  


import java.util.*;
public class TranscriptApp {     
	public static void main(String args[])     
	{         // display a welcome message         
		System.out.println("Welcome to the Transcript application.");         
        
		Scanner sc = new Scanner(System.in);  
		
		
		String select_item;
		String choice = "y";    
		Transcript tran = new Transcript ();
		//double invoice_Total = 0;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		CourseEnrollment enrollment ;
		
		while (choice.equalsIgnoreCase("y")){  
			
			
			// get the input from the user             
			String course = Validator.getString(sc,"Enter Course: ", 10); 
			int credits =  Validator.getInt(sc,"Enter credits:     "); 
			String grade = Validator.getString(sc,"Enter grade: ", 1); 
			
			
			//get the Product object            
			///enrollmen
			enrollment =  new CourseEnrollment();
			
			enrollment.setCourse(course);
			enrollment.setCredit(credits);
			enrollment.setGrade(grade);
			
			tran.addCourse(enrollment);
			
			
			
/*			Bonus:
			for(int i=0; i < item.get_list().size(); i++){
				select_item = item.get_list().get(i) ;
				
				//&& i != item.get_list().size()
				if(select_item.substring(0,2).contains(productCode) && i != item.get_list().size()){
					quantity += Integer.parseInt(select_item.substring(42,43));       //index of the quantity in the list
					//invoice_Total -= Integer.parseInt(select_item
					item.delete_line_item(i);
					break Bonus;
				}
			}*/

			//invoice_Total += lineItem.getTotal();

			System.out.println("Another course? (y/n): "); 
			choice = sc.nextLine();
			
		}
		
		System.out.println(" Course      Credits              Grade      Quality points");
		System.out.println("---------   ---------           ---------   -----------------");
		
		
		for (String list:tran.getCourses()){
			System.out.println(list);
		}
		
		
		System.out.println("                                  Overall GPA:     " + tran.getFormattedGPA());
		
	}
}
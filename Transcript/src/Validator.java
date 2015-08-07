
//Validator
import java.util.*;  
public class Validator {     
	

	public static String getString(Scanner sc, String prompt, int number_of_characters) {
		System.out.print(prompt);         
		String s = "";  
		boolean isValid = false;
		// read the user entry         
		
		while( isValid == false){
			
			s = sc.nextLine();
			if(s.length() > number_of_characters){
				System.out.println("The item code should not exceed " +  number_of_characters + " characters, Try again.");
				
				}
			
			else { isValid = true;}     
			     
			}
		return s;
	}
	
	
	public static int getInt(Scanner sc, String prompt){         
		int i = 0;         
      
		try{  
			System.out.print(prompt);
			i = sc.nextInt();
			
		}catch(NumberFormatException e){
			System.out.println("Error! .The number should be positive. ");     
		} catch(InputMismatchException e){
			System.out.println("Error! .The entered value was a character or string."); 
		}
		sc.nextLine();
		return i; 

	}
}

//Validator
import java.util.Scanner;  
public class Validator {     
	
	@Test
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
		boolean isValid = false;         
		while (isValid == false){             
			System.out.print(prompt);
			if(sc.hasNextInt()){
				i = sc.nextInt();
				isValid = true;
			}else{                
				System.out.println("Error! Invalid integer value. Try again.");             
				}             
			sc.nextLine();  // discard any other        
			}        
		return i; 

	}
}
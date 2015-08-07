import java.util.Calendar; 
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Date_activity {
	public static void main(String [] args){
		
		GregorianCalendar past_date = new GregorianCalendar();
		Scanner key = new Scanner (System.in);
		
		
		random_message generator = new random_message();

		System.out.println("What is the date that you are asking about? ");
		
		past_date.set(key.nextInt(),key.nextInt(),key.nextInt());
		
		generator.setDay_of_week(past_date.DAY_OF_WEEK);
		
		
		System.out.println(generator.getAnswer());
		
	}
}

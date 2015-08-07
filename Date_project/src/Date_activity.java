import java.util.*;


public class Date_activity {
	public static void main(String [] args){
		
		String past_date;
		String [] past_date_array = new String[1000];//Stores all dates entered by the user.
		
		Scanner key = new Scanner(System.in);
		//Day of week 1 for Sun and 7 for Sat
		
		
		//Date format = mm/dd/yyyy
		//Initializing date to get inside WHILE loop
		past_date = " mm/dd/yyyy";
		
		
		
		int Year, Month, Day;
		int days_ago;
		
		
		int index = 0;
		
		//Generate objects of the following classes in order to save day and answers strings
		get_day_name [] get_it = new get_day_name [1000];
		generate_random_message [] gen = new generate_random_message [1000];
		
		//converting string date into integers for Year, Month, and Day of week.
		set_date d = new set_date ();
		
		while(past_date != ""){
			System.out.print("What is the date that you are asking about?    :");
			past_date = key.nextLine();
			
			
			d.setDate(past_date);
			past_date_array[index] = past_date;
		
			
			GregorianCalendar DATE = new GregorianCalendar(d.getYear(),d.getMonth(),d.getDay());
			
			
			get_it[index] = new get_day_name();
			
			gen[index] = new generate_random_message();
			
			get_it[index].setDay_name(DATE.get(Calendar.DAY_OF_WEEK));
			gen[index].setMessage();
			
			Date now = new Date();
			
			
			days_ago = (int) ((now.getTime() - DATE.getTimeInMillis())/(1000*24*60*60));
			
			for (int i=0;i <= index;i++){
				
				//
				if(past_date.equalsIgnoreCase(past_date_array[i])){
					System.out.println("It was " + get_it[index].getDay_name() + " and " + gen[i].getMessage() + " It was " + days_ago + " days ago.");
					break;
				}
				
				else if(i == index){
					System.out.println("It was " + get_it[index].getDay_name() + " " + gen[index].getMessage());
				}
				
			}
			
			
			index++;
		}
	}


}

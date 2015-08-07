import java.util.Random;

public class random_message {
	
	private String Answer;
	
	Random rand = new Random();
	
	
		public void setDay_of_week(int day_of_week) {
			
			day_of_week = rand.nextInt(6); 
			
			if (day_of_week == 0)
				Answer = "The weather was sunny.";
			else if  (day_of_week == 1)
				Answer = "The weather looked cool.";
			else if  (day_of_week == 2)
				Answer = "We had a snowing weather.";
			else if  (day_of_week == 3)
				Answer = "The weather was extremly snowing.";
			else if  (day_of_week == 4)
				Answer = "The streets were icy.";
			else if  (day_of_week == 5)
				Answer = "The weather was windy.";
			else if  (day_of_week == 6)
				Answer = "The weather was normal.";
			
		}
		public String getAnswer(){
			return Answer;
		}
		
	}
	


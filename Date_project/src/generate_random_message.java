//This class generate a random message related to the weather.. 
import java.util.Random;
public class generate_random_message {
	private String message;
	private Random rand = new Random();

	public String getMessage() {
		return message;
	}

	public void setMessage() {
		int guess = 1 + rand.nextInt(7);
		
		switch (guess){
		case 1:{
			message = "the weather was cool and temperature was 50 F.";
			break;
		}
		
		case 2:{
			message = "the weather was hot and temperature was 80 F.";
			break;
		}
		
		case 3:{
			message = "the weather was wendy and temperature was 40 F.";
			break;
		}
		
		case 4:{
			message = "the weather was rainy and temperature was 55 F.";
			break;
		}
		case 5:{
			message = "the weather was cloudy and temperature was 47 F.";
			break;
		}
		case 6:{
			message = "the weather was terrible and temperature was 90 F.";
			break;
		}
		case 7:{
			message = "the weather was extremlt cold and temperature was 30 F.";
			break;
		}
		
	}
  }
	
}

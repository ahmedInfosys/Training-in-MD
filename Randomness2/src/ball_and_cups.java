//Game superclass
import java.util.Random;
public class ball_and_cups {
	
	private int setNum;
	
	private Random auto = new Random();
	private String message;

	public int cash;
	

	public void setMessage(int choice, String [] pattern) {
		
		setNum = 1 + auto.nextInt(3);
		
		pattern[choice - 1] = "AA";
		if(choice == setNum){
			
			
			message = "You got the ace, it's number " + choice + "\n"+ pattern[0] + " " + pattern[1] + " " + pattern[2]+"\n1  2  3" ;
			
			cash += 5;
			
		}
		else {
			message = "Good luck next time, it's number "  + setNum + "\n"+ pattern[0] + " " + pattern[1] + " " + pattern[2]+"\n1  2  3" ;
			
			cash -= 5;
		}

	}
	
	
	public String getMessage(){
		return message;
	}
	
	public int getCash(){
		return cash;
	}
	
	public void setCash(int cash){
		this.cash = cash;
	}
}

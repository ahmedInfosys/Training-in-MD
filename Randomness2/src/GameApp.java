import java.util.Scanner;
import java.util.Random;


public class GameApp {
	public static void main(String [] args){
		
		
		//Initializing Randomness and input methos\d objects
		Scanner key = new Scanner(System.in);
		Random auto = new Random();
		
		//object of the card game
		ball_and_cups Game = new ball_and_cups ();
		
		//Player's choice
		int choice;
		
		String ace = "##";
		String [] pattern = new String[3];
		
		
		int enough_budget = 100;
		
		while(enough_budget > 0 && enough_budget <= 500){
			
			//reformatting game table
			for(int i = 0;i < pattern.length; i++){
				pattern[i] = ace;
			}
			
			Game.setCash( enough_budget);
			System.out.println("Which one is the ace? \n\n " + pattern[0] + " " + pattern[1] + " " + pattern[2] + "\n  1  2  3");
			
			choice = key.nextInt();
			
			Game.setMessage(choice, pattern);
			
			
			 enough_budget = Game.getCash();
			System.out.println( Game.getMessage());
			
			System.out.println("\n\nYour total money: $" + enough_budget);
			

			
		
			
			
		}
	}
}



import java.util.Random;
import java.util.Scanner;

import java.lang.String;

public class RandomnessApp {
	public static void main(String [] args){
		Randomness[] r = new Randomness[10000];
		
		Random  rand = new Random();
		int index = 0;
		
		Scanner key = new Scanner(System.in);
		
		String cont, question;
		
		System.out.println("Do you want to ask a question? (y/n)");
		cont = key.nextLine();
		
		int choice;
		
		while(cont.equalsIgnoreCase("y") && index < 10000){
			
			
			System.out.println("What's your question? ");
			question = key.nextLine();
			
			
	
			
			r[index] = new Randomness();
			choice = 1 + rand.nextInt(20);
			
			r[index].setQuestion(question);
			
			r[index].setAnswer(choice);
	
			
			
			if(question.contains("history")){

				for(int i = 0; i <= index; i++){
					System.out.println("Q: " + r[i].getQuestion());
					System.out.println("A: " + r[i].getAnswer());
					
					System.out.println();
				}
				
				index = -1;
			}
			
			index++;
			System.out.println("\n\nDo you want to ask a question? (y/n)");
			cont = key.nextLine();
			
		}
		
	}
}

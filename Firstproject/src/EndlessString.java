import java.util.Scanner;

public class EndlessString {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String userInput ;
        
        userInput = keyboard.next();
        
        while ( !userInput.equals("") )
        {
        	System.out.println(userInput);
        	userInput = keyboard.next();
            
            
        }
    }
}
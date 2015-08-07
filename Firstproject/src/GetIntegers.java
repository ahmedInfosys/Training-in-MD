import java.util.Scanner;

public class GetIntegers {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num, total = 0;
        int index = 1;
        while(index <= 10){
        // Loop should start here
	        num = keyboard.nextInt();
	        total += num;
	        index++;
        }
        //Loop should end here
        
        
        

        System.out.println("The total of all 10 numbers is " + total);
    }
}
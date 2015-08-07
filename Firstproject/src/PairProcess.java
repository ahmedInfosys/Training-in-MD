
import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		System.out.print(num1 + num2 + " ");
		if (num1 + num2 > 200){
			System.out.println("Asterisk");
		}

		
	}
}
import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//int num1, num2, num3; 
		double temp1, temp2;

		System.out.print( "First temperature? " );
		//num1 = keyboard.nextInt();
		temp1 = keyboard.nextDouble();
		System.out.print( "Second temperature? " );
		//num2 = keyboard.nextInt();
		temp2 = keyboard.nextDouble();

        //System.out.println("The max value is : " + Math.max(num1, num2));
		System.out.println("The average temperature is " + (temp1 + temp2)/2);
        }
}
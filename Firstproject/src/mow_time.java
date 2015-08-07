import java.util.Scanner;
public class mow_time {
	public static void main(String [] args){
		double mow_rate = 0.5;
		
		Scanner keyboard = new Scanner (System.in);
		int Length, Width;
		System.out.println("Enter lawn length");
		Length = keyboard.nextInt();
		
		System.out.println("Enter lawn width");
		Width = keyboard.nextInt();
		
		int area = Length*Width;
		
		double mow_time = area/mow_rate;
		
		System.out.println("The mowing time is " + mow_time + " minutes");
		
	}
}

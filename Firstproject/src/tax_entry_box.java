import java.util.Scanner;
public class tax_entry_box {
	public static void main(String [] args){

		
		double tax_rate, subtotal = 0,tax,grand_total = 0;
		int number_of_prices;
		Scanner key = new Scanner(System.in);
		System.out.println("tax rate? ");
		tax_rate = key.nextDouble();
		
		number_of_prices = key.nextInt();
		double[] prices = new double [number_of_prices] ;
		
		int index = 1;
		prices[index]= key.nextDouble();
		while (prices[index] != 0 ){
			subtotal += prices[index];
			
			index++;
			prices[index]= key.nextDouble();
		}
		
		tax = subtotal*tax_rate;
		grand_total = subtotal + tax;
		index = 1;
		while(index < prices.length){
			System.out.println("Price # " + index + ": " +prices[index] );
			index++;
		}
		System.out.println(subtotal + "subtotal");
		System.out.println(tax+" tax");
		System.out.println(grand_total + " grand total");
	}
}

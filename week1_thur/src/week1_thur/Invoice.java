package week1_thur;
/*import String;

import java.text.NumberFormat; 

	public class LineItem {         
		private int quantity;     
		private double price;      
		private static double subtotal = 0, grant_total = 0;
		
		public void setProductPrice(double price) {         
			this.price = price;     
			
		} 
		
		public void setProduectQuantity(int quantity){
			this.quantity = quantity;
		}
		
		public class get 

}*/
import java.text.NumberFormat;


import java.util.Scanner;
	public class Invoice {
		
		
		public static void main(String [] args){

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			double tax_rate, subtotal = 0,tax,grand_total = 0;
			int quantity = 1;
			
			//Initializing number of purchases to satisfy customer needs
			int number_of_prices = 10000;
			
			//Quantity array to print out all quantity that are corresponded to their inserted price.
			int [] quantity_array = new int[number_of_prices];
			
			Scanner key = new Scanner(System.in);
			System.out.println("tax rate? ");
			tax_rate = key.nextDouble();
			
			
			double[] prices = new double [number_of_prices] ;
			double price_of_single_item = 1 ;
			
			int index = 1;
			
			
			while (true){
				System.out.print("Item #" + index  +" " ); 
				
				price_of_single_item = key.nextDouble();
				prices[index]= price_of_single_item;
				System.out.println(); 
				
				
				System.out.print("Quantity: " ); 
				quantity = key.nextInt();
				quantity_array[index] = quantity;
				
				if((quantity > 0 && quantity < 50) && (price_of_single_item >= 0 && price_of_single_item <= 1000)){
					subtotal += prices[index]*quantity;
					index ++;
				}
				else{break;}
				
				
			}
			
			
			tax = subtotal*tax_rate;
			grand_total = subtotal + tax;
			int i = 1;
			while(i < index){
				System.out.println("Price # " + i + ": " + currency.format(prices[i] ) + " Quantity: " + quantity_array[i]);
				i++;
			}
			System.out.println("Subtotal    : " + currency.format(subtotal));
			System.out.println("Tax         : " + currency.format(tax));
			System.out.println("Grand total : " + currency.format(grand_total) );
		}
	}
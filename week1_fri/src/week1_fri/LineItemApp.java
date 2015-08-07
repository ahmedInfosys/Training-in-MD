package week1_fri;

import java.util.Scanner;
import java.text.NumberFormat;

public class LineItemApp {
	public static void main (String [] args){
		Scanner key = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		LineItem  first_customer = new LineItem();
		
		
		double [] items = new double [100000];
		int [] quantity = new int[items.length];
		String [] check_taxable_items = new String[items.length];
		
		int index = 1;
		
		double subtotal, tax, grand_total;
		
		System.out.println("Welcome to the shop, want to shop?");
		
		String choice = key.next();
		while (choice.equalsIgnoreCase("y")){

			System.out.println("Please inter item code\nOR for orange.\nAP for apple.\nTM for tomato.\nPK for pickles.\nCG for cigarettes.\nLT for lighter.");
			
			first_customer.get_item_code(key.next());
			first_customer.check_code();
			check_taxable_items[index] = first_customer.check_tax();
			
			System.out.println("Enter quantity:");
			quantity[index] = key.nextInt();
			
			items[index] = first_customer.get_total_price_each_item();
			
			first_customer.calculate_sub_total(items[index], quantity[index]);
			first_customer.calculate_tax();
			
			
			System.out.println("Want to continue shopping?");
			choice = key.next();
			index ++;
		}
		
		subtotal = first_customer.get_subtotal();
		tax = first_customer.get_tax();
		grand_total = first_customer.get_grand_total(tax);
		
		System.out.println("Receipt");
		System.out.println("-------------------------------------------------------");
		System.out.println("Items              Qantity");
		for (int i = 1;i <= index - 1;i++){
			
			System.out.println("Item #" + i +": " + "$" + items[i] + "        " + quantity[i] + "   "   + check_taxable_items[i]);
		}
		System.out.println("\n\n");
		
		System.out.println("Subtotal: " + currency.format(subtotal));
		System.out.println("Tax:      " + currency.format(tax));
		System.out.println("Total:    " + currency.format(grand_total));
		
	}
}

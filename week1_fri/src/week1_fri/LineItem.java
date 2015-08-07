package week1_fri;

import java.util.Scanner;
import  java.text.NumberFormat;


public class LineItem extends get_item_code{
	private static double subtotal = 0, tax = 0;
	
	
	//private get_item_code get_code = new get_item_code();
	
	public String check_tax(){
		if (tax_rate == 0){ return "Untaxable";}
		else return "Taxable";
	}
	
	public double get_total_price_each_item(){
		return price ;
	}
	
	public void calculate_sub_total(double price, int quantity){
		subtotal += price * quantity;
	}
	
	public double get_subtotal(){
		return subtotal;
	}
	public void calculate_tax(){
		tax += subtotal * tax_rate;
	}
	
	public double get_tax(){
		return tax;
	}
	
	public double get_grand_total(double tax){
		return subtotal + tax;
	}

}
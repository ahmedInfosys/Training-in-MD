package week1_thur;


import java.util.Scanner;
public class IsinStock {
	
		//Private book information
		private String title;
		private String author;
		private String description;
		private double price;
		private int instock;
		
		
		Scanner key = new Scanner(System.in);
		
		//Setting book information and put it in the database
		public void setbookinfo(String TITLE, String AUTHOR, String DESCRIPTION, double PRICE, int INSTOCK){
			title = TITLE;
			author = AUTHOR;
			description = DESCRIPTION;
			price = PRICE;
			instock = INSTOCK;
		}
		
		//Getting book title to the object
		public String gettitle(){
			return title;
		}
		
		//Getting book Author to the object
		public String get_author(){
			return author;
		}
		
		//Getting book description to the object
		public String get_description(){
			return description;
		}
		//Getting book price to the object
		public double get_price(){
			return price;
		}
		
		//Getting book availability in the stock
		public int get_instock(){
			return instock;
		}
		
		//Getting total price for available books
		public void get_total_book_price(){
			if (instock == 0){
				System.out.println("Out of stock");

			}
			else{
				System.out.print("Total price of all books in stock is $");
				System.out.print( price * instock);
			}
			
		}
		
		
	public static void main (String [] args){
		

		//Initializing object BOOK from class Isinstock
		IsinStock BOOK = new IsinStock();
		BOOK.setbookinfo("Hamlet", "Frederick Douglass", "Book for sale", 2.57, 10);
		
		Scanner key = new Scanner(System.in);
		
		// Display book information
		System.out.println(BOOK.gettitle());
		System.out.println(BOOK.get_author());
		System.out.println(BOOK.get_description());
		System.out.println("$" + BOOK.get_price());
		System.out.println(BOOK.get_instock());
		BOOK.get_total_book_price();
		
		
		

		}
		
		
}
	


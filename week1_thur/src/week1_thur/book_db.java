package week1_thur;


import java.util.Scanner;
public class book_db {
	
		private String title;
		private String author;
		private String description;
		private double price;
		private int instock;
		
		Scanner key = new Scanner(System.in);
		public void setbookinfo(String TITLE, String AUTHOR, String DESCRIPTION, double PRICE, int INSTOCK){
			title = TITLE;
			author = AUTHOR;
			description = DESCRIPTION;
			price = PRICE;
			instock = INSTOCK;
		}
		public String gettitle(){
			return title;
		}
		public String get_author(){
			return author;
		}
		public String get_description(){
			return description;
		}
		public double get_price(){
			return price;
		}
		public int get_instock(){
			return instock;
		}
		
		public void get_total_book_price(){
			if (instock == 0){
				System.out.println("Out of stock");

			}
			else{
				System.out.print("Total price of all books in stock is $");
				System.out.print( price * instock);
			}
			
		}
		
		public class BOOK_DB{
			public static book_db get_book_info (String title){
				book_db b = new book_db();
				
				b.setbookinfo(title, author, description, price, instock); 
				
				if (b.gettitle().equalsIgnoreCase(title)){
					System.out.println("Book info:");
					System.out.println("Title : " + b.gettitle());
					System.out.println("Author : " + b.get_author());
					System.out.println("Descriptiom : " + b.get_description());
					System.out.println("Price : " + b.get_price());
					System.out.println("Number of books in stock : " + b.get_instock())
				}
				
				else{
					System.out.println("Out of stock");
				}
				
			}
		}
		
		

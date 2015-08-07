import java.util.Scanner;
public class IsinStack {
	
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
	public static void main (String [] args){
		
		IsinStack BOOK = new IsinStack();
		BOOK.setbookinfo("Hamlet", "Frederick Douglass", "Book for sale", 2.00, 10);
		
		System.out.println(BOOK.gettitle());
		System.out.println(BOOK.get_author());
		System.out.println(BOOK.get_description());
		System.out.println(BOOK.get_price());
		System.out.println(BOOK.get_instock());
	}
	

}

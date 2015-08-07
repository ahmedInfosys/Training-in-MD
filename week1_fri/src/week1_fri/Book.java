package week1_fri;
import java.text.NumberFormat;

	

public class Book extends Product{
	
	public Book(){
		if (code.equalsIgnoreCase("book")){
			System.out.println("The chosen product is a book");
		}
		
		count ++;
	}
	
	public double get_total_price(int quantity){
		return price * count;
			
	}
}



import java.util.Scanner;


public class ProductApp {
    public static void main(String [] args){
    	

    	
    	
    	Scanner key = new Scanner(System.in);
		

		String code;
		double price,  subtotal = 0, grand_total;
		
		String decision = "y";
		System.out.println("Welcome to the shop, want to shop?");
		
		
		while (decision.equalsIgnoreCase("y"))
		{
			System.out.println("Please enter book/software code:");
			code = key.next();
	    	
	    	
			if(code.equalsIgnoreCase("book")){
				
			
				Book b = new Book();
				
				b.setCode(code);
				System.out.println("Please enter Author:");
				b.setAuthor(key.next());
				
				System.out.println("Please enter Description:");
				b.setDescription(key.next());
				
				System.out.println("Please enter Price:");
				
				price = key.nextDouble();
				b.setPrice(price);
				subtotal += b.getPrice();
				
				
				System.out.println(b.toString());
				
			}
			else{
				Software s = new Software();
				s.setCode(code);
				System.out.println("Please enter version:");
				s.setVersion(key.next());
				
				System.out.println("Please enter Description:");
				s.setDescription(key.next());
				
				System.out.println("Please enter Price:");
				
				price = key.nextDouble();
				s.setPrice(price);
				subtotal += s.getPrice();
				
				
				System.out.println(s.toString());
			}
			System.out.println("Wanna keep shopping ?(y/n)");
			decision = key.next();
		}
		
		System.out.println("Total Price: $" + subtotal);
		
    }
}

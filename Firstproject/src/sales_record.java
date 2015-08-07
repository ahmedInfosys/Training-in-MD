import java.util.Scanner;

public class sales_record {
	public static void main(String [] args){
		
		Scanner key = new Scanner(System.in);
		
		String NAME, tax_code ;
		double sales_amount, customer_number, tax_amount;
		
		System.out.println("Please eneter customer number: ");
		customer_number = key.nextDouble();
		
		System.out.println("Enter customer name: ");
		NAME = key.next();
		
		System.out.println("Enter sales: ");
		sales_amount = key.nextDouble();
		
		System.out.println("Enter tax code: ");
		tax_code = key.next();
		
		if (tax_code.equals("NRM")){
			tax_amount = 0.06;
			System.out.println(tax_amount);
		}else if (tax_code.equals("NPF")){
			tax_amount = 0;
			System.out.println(tax_amount);
	    }else if( tax_code.equals("BIZ")){
			tax_amount = 0.045;
			System.out.println(tax_amount);
    	}else {System.out.println("Invalid tax code");}
		
		

	}
}

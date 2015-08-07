//Invoice Application
import java.util.Scanner; 
import java.text.NumberFormat;  


import java.util.*;
public class invoiceApp {     
	public static void main(String args[])     
	{         // display a welcome message         
		System.out.println("Welcome to the Line Item Calculator");         
		System.out.println();          
		Scanner sc = new Scanner(System.in);  
		
		
		String select_item;
		String choice = "y";    
		Invoice item = new Invoice ();
		double invoice_Total = 0;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		while (choice.equalsIgnoreCase("y")){  
			
			
			// get the input from the user             
			String productCode = Validator.getString(sc,"Enter product code: "); 
			int quantity =  Validator.getInt(sc,"Enter quantity:     "); 
			
			
			//get the Product object            
			Product product = ProductDB.getProductInfo(productCode);   
			
			
			Bonus:
			for(int i=0; i < item.get_list().size(); i++){
				select_item = item.get_list().get(i) ;
				
				//&& i != item.get_list().size()
				if(select_item.substring(0,2).contains(productCode) && i != item.get_list().size()){
					quantity += Integer.parseInt(select_item.substring(42,43));       //index of the quantity in the list
					//invoice_Total -= Integer.parseInt(select_item
					item.delete_line_item(i);
					break Bonus;
				}
			}
			

			
			// create the LineItem object and set its fields             
			LineItem lineItem = new LineItem(); 
			
			
			
			lineItem.setProduct(product);             
			lineItem.setQuantity(quantity);
			
			
			
			//invoice_Total += lineItem.getTotal();
			
			
			
			
			item.store_line_item(lineItem.getProduct(), lineItem.getQuantity(), lineItem.getTotal());
			
		
			System.out.println("Another line item? (y/n): "); 
			choice = sc.nextLine();
			
		}
		
		System.out.println("Code  Description              Price      Qty           Total  ");
		System.out.println("----  ------------           ---------   -----         ------- ");
		
		
		for (String list:item.get_list()){
			
		
			invoice_Total += Double.parseDouble(list.substring(56,61));  //index of the total in the list
			System.out.println(list);
			
			
		}
		
		
		System.out.println("                                  Invoice total:     " + currency.format(invoice_Total));
		
	}
}
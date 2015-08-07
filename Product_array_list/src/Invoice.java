//Invoice


import java.util.*;
import java.text.NumberFormat;  

public class Invoice {
	private ArrayList <String>  items = new ArrayList <String>();
	private NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	private LineItem get_single_line;
	

	public void store_line_item (Product pro, int quantity, double total){
		
		String str  = "";
		str = String.format("%-6s%-27s%-10s%-12d%-10s",pro.getCode() ,pro.getDescription(),currency.format(pro.getPrice()), quantity ,currency.format(total));
		
		items.add(str);
		
	}
	
	public void delete_line_item (int index){
		items.remove(index);
	}

	
	public ArrayList<String> get_list(){
		return items;
	}
	
	
}

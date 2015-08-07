//Line item
import java.text.NumberFormat;  

public class LineItem {     
	private Product product;     
	private Validator validator;
	
	private int quantity;     
	private double total;      
	public LineItem() 
	{         
		         
		this.quantity = 0;        
		this.total = 0;     
	}      
	public void setProduct(Product product){         
		this.product = product;     
	} 
	public Product getProduct() {         
		return product;     
		}  
	
	public void setQuantity(int quantity){         
		this.quantity = quantity;     
		}      
	public int getQuantity()     
	{         
		return quantity;     
	}    
	
	public void calculateTotal(){
		total = product.getPrice() * quantity;
	}
	public double getTotal()     
	{         
		this.calculateTotal();         
		return total;     
		} 
}
//Product Super class	
public class Product 
{
    protected String code;
    protected double price;
    
    private String description;
    
    
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	protected static int count = 0;   // a protected 
                                      // static variable

    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
    // gets and sets  for the code, description, 
    // and price instance variables

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString()
    {
        return "Code:        " + code + "\n" +
               "Price:       " +
               price + "\n";
    }

    // create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }

}
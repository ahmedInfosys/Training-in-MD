package week1_fri;
import java.text.NumberFormat;
	
public class Product 
{
    protected String code;
    protected String description;
    protected double price;
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

    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n$" +
               "Price:       " +
               price + "\n";
    }

    // create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }

}


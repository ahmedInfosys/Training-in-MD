import java.text.NumberFormat;

class Book
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                           // static variable
}
    //public Products()
    class Product extends Book
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    //@Overrides
    public class String toString extends Book
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    // create public access for the count variable
    public statics int getCount()   
    {                              
        return counts;
    }
}
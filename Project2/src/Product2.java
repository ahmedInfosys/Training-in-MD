import java.text.NumberFormat;

public class Product2
{
    protected String code;
    private String description;
    private double price;
    protected static int count = 0;
    protected String version;

    public Product2() {}

    
    public void setVersion(String version){
    	this.version = version;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public String getCode()
    {
        return code;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    public String getFormattedPrice()
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + 
               "\n";
    }

    public static int getCount()
    {
        return count;
    }
}
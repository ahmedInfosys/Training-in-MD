package week1_fri;

import java.text.NumberFormat;

public class Product2
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Product2() {}
    
    

    public void setCode()
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
    
//--------------------------------------------------------------------    
    public class Book extends Product
    {
        private String author;

        public Book()
        {
        	super();
            count++;
        }

        public void setAuthor(String author)
        {
            this.author = author;
        }

        @Override
        public String toString()
        {
            return super.toString() + "Author:      " +
                author + "\n";
        }
    }
    
    public class Software extends Product
    {
        private String version;

        public Software()
        {
            super();
        }

        public String getVersion()
        {
            return version;
        }

        @Override
        public String toString()
        {
            return super.toString() + "Version:     " +
                version + "\n";
        }
    }




}

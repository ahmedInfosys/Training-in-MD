public class Book extends Product2
{
    private String author;

    public Book()
    {
    	super();
    	count++;		
    	System.out.println("The chosen product is a book");
    		

     
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Author:      " + author + "\n";
    }
}


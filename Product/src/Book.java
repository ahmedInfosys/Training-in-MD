
import java.util.Scanner;
	

public class Book extends Product {
    private String author;
    private int pages;
    
    public void print_results(){
    	System.out.println(toString() + "\nAuthor" +  get_author() + "\nPages " +  get_pages()  );
    }
    
    public void set_author(String author){
    	this.author = author;
    	
    }
    public void set_pages(int pages){
    	this.pages = pages;
    	
    }
    
    public String get_author(){
    	return author;
    	
    }
    public int get_pages(){
    	return pages;
    	
    }
}
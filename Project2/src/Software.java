import java.util.Scanner;

public class Software extends Product2
{
    

    public Software()
    {
  
    	System.out.println("The chosen product is a software");
    	count++;
    		
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


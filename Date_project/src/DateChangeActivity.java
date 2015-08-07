import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateChangeActivity {

	
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat defaultDate = DateFormat.getDateTimeInstance(); 
		 
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("'Date: 'E  MM/dd/yyyy \n'Time: 'hh:mm:ss");
	
		System.out.println(sdf.format(now));
		
	}

}


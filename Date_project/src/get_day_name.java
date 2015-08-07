//This class gives the day name according to day of week.
public class get_day_name {
	private String Day_name;

	public String getDay_name() {
		return Day_name;
	}

	public void setDay_name(int day_number) {
		 switch (day_number)
		 {
		 case 1:
			 	Day_name = "Sunday";
			 	break;
		 case 2:
			 	Day_name = "Monday";
			 	break;
		 case 3:
			 	Day_name = "Tuesday";
			 	break;
		 case 4:
			 	Day_name = "Wednesday";
			 	break;
		 case 5:
			 	Day_name = "Thursday";
			 	break;
		 case 6:
			 	Day_name = "Friday";
			 	break;
		 case 7:
			 	Day_name = "Saturday";
			 	break;
		 }
	}
	
	
	
}

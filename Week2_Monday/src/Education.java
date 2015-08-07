//Education class

import org.junit.* ;

import static org.junit.Assert.* ;

public class Education {
	

	private final int number_of_schools = 10;
	private static int school_index = 0;
	
	
	
	private String  [] ten_schools_attended = new String[number_of_schools];
	private String shape_string = "";
	
	@Test
	public void setTen_schools_attended(String school_attended) {
	
		
		
		if(school_index > number_of_schools - 1 ){
			
			for(int i =0; i < number_of_schools - 1;i++){
				ten_schools_attended[i] = ten_schools_attended[i+1];
			}
	
		}
		else{
				school_index++;
			}
		ten_schools_attended[school_index - 1] = school_attended;
	}
	@Test
	public String toString() {
		
		for (int i=0; i < number_of_schools;i++)
			shape_string += ten_schools_attended[i] + "\n";
		return "Last ten schools that person attended are: \n" + shape_string;
		
	}
}

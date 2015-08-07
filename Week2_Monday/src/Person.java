//Person final class
public final class Person {
    //composition has-a relationship
    private Job job;
    private Education edu;
    
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        job.setId(101157802);
        
        
        this.edu = new Education();
        edu.setTen_schools_attended("School 1");
        edu.setTen_schools_attended("School 2");
        edu.setTen_schools_attended("School 3");
        edu.setTen_schools_attended("School 4");
        edu.setTen_schools_attended("School 5");
        edu.setTen_schools_attended("School 6");
        edu.setTen_schools_attended("School 7");
        edu.setTen_schools_attended("School 8");
        edu.setTen_schools_attended("School 9");
        edu.setTen_schools_attended("School 10");
        edu.setTen_schools_attended("School 11");
        edu.setTen_schools_attended("School 12");
    }
    
    
    

    
	public String toString(){
		return job.toString() + "\n" + edu.toString();
	}
}

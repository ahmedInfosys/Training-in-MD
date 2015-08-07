package week1_thur;

import java.util.Scanner;

public class bonus_assignment {
	public static void main(String [] args){
		
		Scanner key = new Scanner(System.in);
		
		int number_of_students ;
		
		System.out.println("Enter number of students in the class:");
		number_of_students = key.nextInt(); 
		int index = 1;
		
		String grade;
		
		
		double gpa = 0, male_avg_gpa = 0, female_avg_gpa = 0;
		double ma_avg_gpa = 0, oh_avg_gpa = 0, pa_avg_gpa = 0, md_avg_gpa = 0;
		double ee_avg_gpa = 0, me_avg_gpa = 0, pe_avg_gpa = 0, ce_avg_gpa = 0;
		
		int count_males = 0, count_females = 0;
		int count_ma = 0, count_pa = 0, count_oh = 0, count_md = 0;
		int count_ee = 0, count_me = 0, count_pe = 0, count_ce = 0;
		int count_all = 0, gpa_average_all = 0;
		
		String name, major,state,gender;
		
		 while( index <= number_of_students ){
			 
			 
			 System.out.println("Please Enter student name: ");
			 name = key.next();
			 
			 System.out.println("Please enter your gender\n"
			 		+ "M for male\nF for femal");
			 gender = key.next();
			 
			 System.out.println("Please enter student grade: ");
			 grade = key.next();
			 
			 System.out.println("Please enter you major\n"
			 		+ " EE for Electrical Engneering\n"
			 		+ " ME for Mechanical Engineering\n"
			 		+ " PE for Powers Engineering\n"
			 		+ " CE for Computer Enginneing");
			 
			 major = key.next();
			 
			 System.out.println("Please enter the state you come from \n"
			 		+ "MA for Massachussets\n"
			 		+ "PA for Pennysalvinia\n"
			 		+ "OH for Ohio\n"
			 		+ "MD for Maryland");
			 state = key.next();
			 
			 
			 switch (grade){
			 case "A":
				 gpa = 4;
				 break;
			 case "B":
				 gpa = 3;
				 break;
			 case "C":
				 gpa = 2;
				 break;
			 case "D":
				 gpa = 1;
				 break;
			 case "F":
				 gpa = 0;
				 break;
			 }
			 
			 count_all++;
			 gpa_average_all += gpa;
			 
			 if( gender.equals("M")){ count_males++;
			 male_avg_gpa += gpa; 
			 }
			 else {
				 count_females++;
				 female_avg_gpa += gpa;
			 }
			 
			 switch (major){
			 case "MA":
				 count_ma++;
				 ma_avg_gpa += gpa;                                                                   
				 break;
			 case "PA":
				 count_pa++;
				 pa_avg_gpa += gpa; 
				 break;
			 case "OH": 
				 count_oh++;
				 oh_avg_gpa += gpa;
				 break;
			 case "MD":
				 count_md++;
				 md_avg_gpa += gpa;  
				 break;
			 }
			 
			 
			 switch (state){
			 case "EE":
				 count_ee++;
				 ee_avg_gpa += gpa;
				 break;
			 
			 case "ME":
				 count_me++;
				 me_avg_gpa += gpa;
				 break;
			 case "PE":
				 count_pe++;
				 pe_avg_gpa += gpa;
				 break;
			 case "CE":
				 count_ce++;
				 ce_avg_gpa += gpa;
				 break;
				 
		 }
	     index ++;
		
	}
		 
		 System.out.println("Overall average GPA: " + gpa_average_all/count_all);
		 
		 System.out.println("Average GPA by Genders\n"
		 		+ "Male students: " + male_avg_gpa/count_males + "\n"
		 				+ "Females students: " + female_avg_gpa/count_females);
		 System.out.println("Average GPA by states\n"
		 		+ "MA students " + ma_avg_gpa/count_ma +"\n"+
		 		"PA students " + pa_avg_gpa + "\n"
		 				+ "OH students " +oh_avg_gpa/count_oh + "\n" +
		 		"MD students " + md_avg_gpa/count_md);
		 System.out.println("Average GPA by major\n" + 
		 		"EE students " + ee_avg_gpa/count_ee +"\n" +
				 "ME students " + me_avg_gpa/count_me + "\n" +
		 		"PE students " + pe_avg_gpa/count_pe +"\n" +
				 "CE students " + ce_avg_gpa/count_ce);
		 
	}
}

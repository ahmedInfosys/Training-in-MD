//Calculator superclass

package week2_tue;



public class Calc_class {
	
    //private double num1,num2, result;
	  
	

	
	public double Addition(double num1, double num2){
		return num1 + num2;
	}
	
	
	public double Subtraction(double num1, double num2){
		return num1 + num2;
	}
	
	
	public double Multiplication(double num1, double num2){
		return num1 * num2;
	}
	
	
	public double Division(double num1, double num2){
		return num1 / num2;
	}
	
	
	public double Modulation(double num1, double num2){
		return num1 % num2;
	}

	//Method for bonus question.
	/*public double operation(double num1,String operator, double num2){
		switch (operator)
		{
			case "+":return num1 + num2;
				
			case "-":return num1 - num2;
				
			case "*":return num1 * num2;
				
			case "/":return num1 / num2;
				
			case "%":return num1 + num2;
			default: return 0;
			
		}
	}*/


}

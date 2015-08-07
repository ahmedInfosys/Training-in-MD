//Tested class

package week2_tue;

import org.junit.* ;

import static org.junit.Assert.* ;

import java.util.Scanner;
public class Calculator {
	Calc_class CALC = new Calc_class();
	Scanner key = new Scanner(System.in);
	private double num1,num2, result = 0;
	private String operator_string;
	
	@Test
	public void get_addition(){
		/*System.out.println("What is the the first number? :");
		num1 = key.nextDouble();
		
		System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Divition\n5 - Modulation");
		choice = key.nextInt();
		
		double result = 0;
		System.out.println("What is the the second number? :");
		num2 = key.nextDouble();
		
		
		switch (choice){
		case 1:
			result = CALC.Addition(num1, num2);
			operator_string = " + ";
			assertTrue(result == num1 + num2);
			break;
		case 2:
			result = CALC.Subtraction(num1, num2);
			operator_string = " - ";
			assertTrue(result == num1 - num2);
			break;
		case 3:
			result = CALC.Multiplication(num1, num2);
			operator_string = " * ";
			assertTrue(result == num1 * num2);
			break;
		case 4:
			result = CALC.Division(num1, num2);
			operator_string = " / ";
			assertTrue(result == num1 / num2);
			break;
		case 5:
			result = CALC.Modulation(num1, num2);
			operator_string = " % ";
			assertTrue(result == num1 % num2);
			break;
		}
		*/
		
		//The following code is for bonus.
		num1 = key.nextDouble();
		operator_string = key.next();
		num1 = key.nextDouble();
		result = CALC.operation(num1, operator_string, num2);
		System.out.print(" = " + result);
		
		switch (operator_string)
		{
			case "+":assertTrue(result == num1 + num2) ;
				
			case "-":assertTrue(result == num1 - num2) ;
				
			case "*":assertTrue(result == num1 * num2) ;
				
			case "/":assertTrue(result == num1 / num2) ;
				
			case "%":assertTrue(result == num1 % num2) ;
			
		}
		
		

		
		//System.out.println(num1 + operator_string + num2 + " = " + result);
		
		
	}
}

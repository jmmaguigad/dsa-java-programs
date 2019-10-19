/**
 * @(#)FactorialActivity.java
 *
 *
 * @John Manuel M. Maguigad
 * @version 1.00 2019/10/7
 */

import java.util.Scanner;
public class FactorialActivity {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number \t : ");
		int number = input.nextInt();	
		
		System.out.println("Factorial of " + number + " is " + getFactorial(number));	
	}

    static int getFactorial(int number) {
		int factorial = 1;
    	for (int i = 1; i <= number; i++){
			factorial *= i;
    	}
    	return factorial;
    }
    
    
}
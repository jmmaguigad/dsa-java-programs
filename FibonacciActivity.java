/**
 * @(#)FibonacciActivity.java
 *
 *
 * @author 
 * @version 1.00 2019/10/7
 */

import java.util.Scanner;
public class FibonacciActivity {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number \t : ");
		int number = input.nextInt();
		int num1 = 1, num2 = 1;
		
		System.out.println("Fibonacci Sequence of " + number + " is:");
		
		for (int i = 0; i < number; i++){
			System.out.print(" " + num1 + " ");
			int sumoftwo = num1 + num2;
			num1 = num2;
			num2 = sumoftwo;
		}
	}
		
}
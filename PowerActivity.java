/**
 * @(#)ExponentActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/6
 */

import java.util.Scanner;
public class PowerActivity {
	
   public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter Base \t : ");
		int base = input.nextInt();
		System.out.print("Enter Exponent \t : ");
		int exponent = input.nextInt();
				
		System.out.println(base + " raised to " + exponent + " is " + getPower(base,exponent));
   }
   
   static int getPower(int base, int exponent){
   		int power;
   		power = 1;
   		for (int j = 1; j <= exponent; j++){
			power = power * base;	
		} 
			return power;
   }    
}
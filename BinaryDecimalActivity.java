/**
 * @(#)BinaryDecimalActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/20
 *
 */

import java.util.Scanner;
public class BinaryDecimalActivity {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter binary value \t :");
		String binaryvalue = input.nextLine();
		
		char[] binaryvalueparser = binaryvalue.toCharArray();
		String one = "1";
		int decimalvalue = 0;
		
		for (int i = binaryvalueparser.length; i > 0; i--){	
			//using string manipulation
			if (binaryvalueparser[i-1] == one.charAt(0)) {
				decimalvalue += getPower(binaryvalueparser.length-i);
				//printing to see whats happening in every iteration
				//System.out.println("Hey its 1 : "+decimalvalue);
			}
		}
		System.out.println("Equivalent decimal is \t :" + decimalvalue);
	}
	
   static int getPower(int exponent){
   		int power;
   		power = 1;
   		for (int j = 1; j <= exponent; j++){
			power = power * 2;	
		} 
			return power;
   }	    
    
}
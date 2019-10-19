/**
 * @(#)DecimalBinaryActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/19
 */

import java.util.Scanner;
public class DecimalBinaryActivity {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter decimal value \t :");
    	int decimalvalue = input.nextInt(); 
    	int remainder;
    	String binaryvalue = "";
    	
    	do{
    		remainder = decimalvalue % 2;
    		binaryvalue = remainder + "" + binaryvalue;
    		decimalvalue = decimalvalue / 2;
    	}while (decimalvalue > 0);
    	
    	System.out.println("Equivalent binary is \t :" + binaryvalue);
    }
    
}
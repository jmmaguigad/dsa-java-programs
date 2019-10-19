/**
 * @(#)MinMaxActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/18
 */

import java.util.Scanner;
public class MinMaxActivity {

	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of items \t: ");
		int numberofitems = input.nextInt();
		int[] valarray = new int[numberofitems]; 
		int min = 0;
		int max = 0;
		
		for (int j = 0; j < numberofitems; j++){
			System.out.println("Enter " + (j + 1) + " number: "); 
			valarray[j] = input.nextInt();
		}
		
		min = valarray[0];	
		max = valarray[0];	
			
		for (int m = 0; m < valarray.length; m++){
			if (valarray[m]<min){
				min = valarray[m];
			}
			if (valarray[m]>max){
				max = valarray[m];
			}
		}
		System.out.println("Mininum number is: " + min);
		System.out.println("Maximum number is: " + max);
	}    
    
}
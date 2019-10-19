/**
 * @(#)MoneyDenominationActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/18
 */

import java.util.Scanner;
public class MoneyDenominationActivity {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Amount \t : ");
		int amount = input.nextInt();
		
		int[] moneyval = {1000,500,200,100,50,20,10,5};
		//size is 9 to allocate values from 1000 to Excess
		int[] denomination = new int[9];
		
		for (int i = 0; i <= moneyval.length; i++){
			if (i == 8) {
				denomination[i] = amount % 5;
				System.out.println("Excess \t : " + denomination[i]);
			} else {
				denomination[i] = amount / moneyval[i];
				amount = amount - (denomination[i] * moneyval[i]);
				System.out.println(moneyval[i] + "\t : " + denomination[i]);
			}
		}		
	}    
    
}
/**
 * @(#)VowelCounterActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/18
 */

import java.util.Scanner;
public class VowelCounterActivity {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string \t: ");
		String wordenter = input.nextLine();	
		String vowels = "aeiou";
		
		//convert string to array
		char[] vowelparser = vowels.toCharArray();	
		char[] wordparser = wordenter.toCharArray();
		int vowelcount = 0;
		
		for (int j = 0; j < vowelparser.length; j++){
			for (int i = 0; i< wordparser.length; i++){
				if (wordparser[i] == vowelparser[j]){
					vowelcount++;
				}
			}
			System.out.println(vowelparser[j] + "\t : " + vowelcount);
			vowelcount = 0;
		}
	}    
    
}
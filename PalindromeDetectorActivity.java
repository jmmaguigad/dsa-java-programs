/**
 * @(#)PalindromeDetectorActivity.java
 *
 *
 * @John Manuel M. Maguigad 
 * @version 1.00 2019/10/19
 */

import java.util.Scanner;
public class PalindromeDetectorActivity {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string \t :");		
		String wordenter = input.nextLine();
		
		char[] wordparser = wordenter.toCharArray();
		char[] reversedword = new char[wordparser.length];
		int counter = 0;
		//get characters for the reversed word
		for (int i = wordparser.length; i > 0; i--){
			reversedword[counter] = wordparser[i-1];
			counter++;
		}
		System.out.print("Reversed string \t :");
		//print out the reversed word
		for (int i = 0; i < reversedword.length; i++){
			System.out.print(reversedword[i]);
		}
		System.out.println();
		//checking if palindrome or not in a long method, short method would be using Arrays.equals() :)
		for (int i = 0; i < wordparser.length; i++){
			if (wordparser[i] != reversedword[i]){
				System.out.println("The inputted string is NOT a palindrome!");
				break;
			}
			if (i == wordparser.length - 1) {
				System.out.println("The inputted string is a palindrome!");
			}
		}
		
	}
    
}
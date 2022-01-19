package Questions;

import java.util.Scanner;

public class StutteringFunction {
	
	/*
	 Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.

		Examples
		stutter("incredible") ➞ "in... in... incredible?"
		
		stutter("enthusiastic") ➞ "en... en... enthusiastic?"
		
		stutter("outstanding") ➞ "ou... ou... outstanding?"
		Notes
		Assume all inputs are in lower case and at least two-character long.
		Check on the Resources tab for more helpful tips on String formatting in Java.
	 */

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		
		String str= scan.next();
		
		stuttering(str);
		

	}

	private static void stuttering(String str) {
		
		String newStr="";
		
		newStr=str.substring(0,2)+" ..." +str.substring(0,2)+"..."+str+"?";
		System.out.println(newStr);
	}

}

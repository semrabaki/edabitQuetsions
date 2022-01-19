package Questions;

import java.util.Scanner;

public class PronicNumber {
	
	/*
	 A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers, that is, a number of the form n(n + 1). Create a function that determines whether a number is pronic or not.

		Examples
		isHeteromecic(0) ➞ true
		// 0 * (0 + 1) = 0 * 1 = 0
		
		isHeteromecic(2) ➞ true
		// 1 * (1 + 1) = 1 * 2 = 2
		
		isHeteromecic(7) ➞ false
		
		isHeteromecic(110) ➞ true
		// 10 * (10 + 1) = 10 * 11 = 110
		
		isHeteromecic(136) ➞ false

	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num= scan.nextInt();
		
		System.out.println(isPronic(num));;
		

	}

	private static boolean isPronic(int num) {
	
		for(int i=0; i<=num; i++)
		{
			if(i*(i+1)==num)
			{
				return true;
			}
		}
		return false;
		
	}

}

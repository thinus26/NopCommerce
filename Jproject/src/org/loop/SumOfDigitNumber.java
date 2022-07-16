package org.loop;

import java.util.Scanner;

public class SumOfDigitNumber {
	public static void main(String[] args) {
		int sum = 0, n;
		Scanner sca = new Scanner(System.in);
		System.out.println("enter number");
		n = sca.nextInt();

		while (n > 0) {

			sum = sum + n % 10;
			n = n / 10;
		}
		 
			System.out.println(sum);	
		 
		
	
		
	}

}

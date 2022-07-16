package org.loop;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {

		long n, i;
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter number");
		n = sca.nextInt();
		for (i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
			
								
			}
		System.out.println(n);

		}
	}



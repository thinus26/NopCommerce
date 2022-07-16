package org.loop;

import java.util.Scanner;

public class Check {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int fact =1,i;
		Scanner sca = new Scanner(System.in);
		System.err.println("plz enter number");
		int num = sca.nextInt();
		
		for(i=1;i<=num;i++)
			fact=fact*i;
		
		System.out.println(fact);
		try {
			
		} finally {
			sca.close();		}
				
	}

}

package com.learninterface;

public class Customer {

	public static void main(String[] args) {
         Axis mybank = new Axis();
         boolean aadhar = mybank.aadharCardMandatory();
         System.out.println(aadhar);
         mybank.pandCardMandatory();
         mybank.interestFreeLoan();
         System.out.println(Axis.UPILIMIT);
         mybank.bikeLoan();
		
		RBI myRBI = new Axis();
		myRBI.aadharCardMandatory();
		
		
		
	}

}

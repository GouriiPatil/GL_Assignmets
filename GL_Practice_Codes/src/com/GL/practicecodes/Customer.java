package com.GL.practicecodes;

class demoCustomer {
	
	void displayInfo(int age, String fullName) {
		
	System.out.println("Customer FULLNAME is "+fullName+" and Age is "+age);
		
}
	
}

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoCustomer c = new demoCustomer();
		
		c.displayInfo(28, "Manju");

	}


}

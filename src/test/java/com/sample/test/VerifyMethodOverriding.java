package com.sample.test;

class Bird {
	
	public void sound (int a) {
		System.out.println("Tweet Tweet Tweet");
	}
	
}

class Robin extends Bird {
	
	
	
	public void sound (String str) {
		
		System.out.println("Chirp Chirp Chirp");
		
		
	}
}

class VerifyMethodOverriding {

	public static void main(String[] args) {
		
		Robin rbn = new Robin();
		rbn.sound("jk");

	}

}

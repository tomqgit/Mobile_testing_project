package com.sample.test;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Banana";
		String strReverse = "";
		for (int i=str.length()-1; i>=0;i--) {
			strReverse=strReverse+str.charAt(i);
			
			
		}
		
		System.out.println(strReverse);
	}

}

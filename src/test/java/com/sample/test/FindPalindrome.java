package com.sample.test;

public class FindPalindrome {

	public static void main(String[] args) {
		
		String p = "malayalammalayalammalayalammalayalammalayalammalayalammalayalam";
		int len = p.length();
		for (int i=0;i<len/2;i++)
		{
			char fwd = p.charAt(i);
			
			if(p.charAt(i) != p.charAt((len-1)-i)) {
			System.out.println("Not a palindrome");
				break;	
			}
			if(i==((len/2)-1)) {
				System.out.println("It is a palindrome");
				break;
			}
		}
		;
	}

}

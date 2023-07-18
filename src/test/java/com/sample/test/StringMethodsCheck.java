package com.sample.test;

public class StringMethodsCheck {

	public static void main(String[] args) {
		
		String str1 = "This is an amazing masterpiece";
		String str2 = "That one is a copy of this one";
		String str3 = "This is AN amazing masterpiece";
		
		/*System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		System.out.println(str1.charAt(5));
		System.out.println(str2.charAt(10));
		System.out.println(str3.charAt(5));
		String str4 = str1.concat(str2);
		System.out.println(str4);
		Boolean checkContains = str1.contains(str3);
		System.out.println(checkContains);
		System.out.println(str1.indexOf("a", 14));
		System.out.println(str1.split("i"));  */
		
		System.out.println(str1.compareToIgnoreCase(str2));
		String[] splitString = str1.split("i");
		System.out.println(splitString);
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.startsWith("is"));
		System.out.println(str2.endsWith("one"));
		System.out.println(str2.endsWith("on"));
	}

}

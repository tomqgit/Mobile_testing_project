package com.sample.test;

public class LongestStringInArray {

	public static void main(String[] args) {
		
		String [] str = {"apple", "banana","custardapple" ,"Orange", "ab", "pineappleapplesapples", "strawberry", "jackfruit", "grape", "apple", "gogogo"};
		
		
		/*int item_size1 = str[0].length();
		int item_size2 = str[1].length();
		int item_size3 = str[2].length();
		int item_size4 = str[3].length(); */
		
		//System.out.println(item_size1+" "+item_size2+" "+item_size3+" "+item_size4);
		//int item_long=0;
		//int [] itemlengths = new int[len];
		
		int index = 0;
		int elementlength = str[0].length();
		for(int i=0; i<str.length;i++)
		{
			if (str[i].length()<elementlength) {
				elementlength=str[i].length();
				index = i;
			}
			
			if (str[i].contains("e")) {
				System.out.println(str[i]);
			}
		}
		
		System.out.println(str[index]);
		
		//for(int i=0; i<len;i++) {
			//itemlengths[i]=str[i].length();
			//System.out.println(itemlengths[i]);
		
		
		
		//System.out.println(item_long);
	}

}

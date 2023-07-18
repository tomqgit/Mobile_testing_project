package com.sample.test;

public class Test {

	static int counter=0;
	
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] < arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.print(" "+arr[i]); 
				}  
		//System.out.println(arr);
		System.out.println("Now counter is" +counter);
		for(int k=1;k<=5;k++)
		System.out.println("only this is for block");
		testMethod();
		System.out.println(counter);
		counter = counter + 15;
		System.out.println(counter);
		counter = counter+3;
		System.out.println(counter);
		}  
		
		public static void testMethod() {
			counter=counter+2;
			System.out.println(counter);
			
		}
	}



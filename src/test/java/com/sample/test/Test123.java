package com.sample.test;

public class Test123 {

	public static void main(String[] args) {
		
/*String  str = "100";
int inti = 100001;

   int len = str.length();
   
   int [] arr = {2, 8, 11, 4, 12, 7, 15};
   int size = arr.length;
   int [] arrProduct = new int[size];
   
   
   
   for (int i=0; i<size; i++) {
	   
	   int product = 1;   
	   	for (int j=0; j<size; j++) {
	   		
	   		if (i!=j)
	   		 {
	   			product = product * arr[j];
	   			
	   		}
	   
	   	}
	   	arrProduct[i]=product;
	   	System.out.println(arrProduct[i]);
   }
   
   
   //int len1 = inti
   
   for (int i=0; i<len;i++) {
	   
	   if (str.charAt(i)!=str.charAt((len-1)-i)) {
		   System.out.println("It is not a palindrome");
		   break;
	   }
	   
	   if(i==len/2) {
		   System.out.println("It is a palindrome");
	   }
	   
   }*/
   
		int [] arr1 = {56,28,94,2,78,458,3,111,34,22312,1,765,3717457,5554,7665,0,6,0,3,9,7,-1};
		
		int [] arr2 = new int[arr1.length];
		
		int j=0;
		
		for (int i=arr1.length-1; i>=0;i--) {
			
			arr2[j]=arr1[i];
			System.out.print(arr2[j]+ " ");
			j++;
		}
		System.out.println(" ");
		for (j=0;j<arr1.length;j++) {
			arr1[j]=arr2[j];
			
			System.out.print(arr1[j]+ " ");
			
		}
		//array_reverse(arr1);

	}

	static void array_reverse(int [] array_reverse){

        
		int len = array_reverse.length;
		int [] arr2 = new int[len];
		int tempI = 0;
		int tempJ = 0;
		int j = len-1;
		
		for (int i = 0; i<len; i++)
		{
		
		
		/*tempI = array_reverse[i];
		tempJ = array_reverse[j];
		array_reverse[i] = tempJ;
		array_reverse[j] = tempI;*/
			
			//System.out.println("-before----");
			
			//System.out.println(arr2[j]);
			//System.out.println(array_reverse[i]);
			
						
		arr2[j]=array_reverse[i];
		
		//System.out.println("--after---");
		
		//System.out.println(arr2[j]);
		//System.out.println(array_reverse[i]);
		//
		j--;
		
		
		//System.out.println(j);
		System.out.println(arr2[i]);
		

		}

	}
}

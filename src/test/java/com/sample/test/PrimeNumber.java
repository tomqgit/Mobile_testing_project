package com.sample.test;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		System.out.println("Enter string");
		//str=sc.nextLine();
		str = sc.next();
		System.out.println(num);
		System.out.println(str);
		System.out.println(Integer.toString(num));
		System.out.println(Integer.valueOf(str));
		
		/*
		
		int outercounter=0, innercounter = 0;
		
		for (int number=2;number<=100;number++) {
			outercounter=outercounter+1;
		Boolean Is_prime=true;
		
		for (int i=2;i<=number/2;i++){
			innercounter=innercounter+1;
		int temp = number%i;
		if (temp ==0) {
			Is_prime = false;
			//System.out.println(i);
			break;
		}
		
		}
		
		//if(Is_prime==false)
		//{
			//System.out.println("Number%d is not prime"+number);
		
		//}
		
		if(Is_prime==true) {
			System.out.print(number+", ");
		}
		
		}
		System.out.println(outercounter+"inner counter, ");
		System.out.print(innercounter+"out counter, ");*/
	}

}

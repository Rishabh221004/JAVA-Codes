package Loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int m=n%10;
			sum+=m;
			n/=10;	
		}
		System.out.println("Sum of Digits of a number is "+sum);
		sc.close();

	}

}

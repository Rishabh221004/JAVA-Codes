package Loops;

import java.util.Scanner;

public class GpUptoNterms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Required GP upto n terms");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		// GP 1,2,4,8,....upto n terms
		int a=1;
		for(int i=1;i<=n;i++) {
			System.out.print(a+",");
			a*=2;
		}
		sc.close();

	}

}

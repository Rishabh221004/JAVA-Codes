package Pattern_Printing;

import java.util.Scanner;

public class AlphabetStarTriangleReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m :");
		int m=sc.nextInt();
		for(int i=m;i>=1;i-=1) {
			for(int j=1;j<=i;j+=1) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println(); // Move to the next line after each row
		}
		sc.close();

	}

}

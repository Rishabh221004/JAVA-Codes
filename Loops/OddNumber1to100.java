package Loops;
import java.util.Scanner;
public class OddNumber1to100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Odd Number from 1 to N");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		for(int i=1 ; i<=n ;i+=1) {
			if(i%2==0) {
				continue;
			}
		    System.out.print(i+" ");
	    }
		sc.close();
	}

}

package Loops;
import java.util.Scanner;
public class CompositeOrPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number is Prime or Composite");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		int x=0;
		for(int i=2;i<=(n-1);i++) {
			if(n%i==0) {
				System.out.println("Composite Number");
				x=1;
				break;
			}	 
		}
		if(n==1) System.out.println("Neither Composite nor Prime Number");
		else if(x==0) System.out.println("Prime Number");
		sc.close();	
	}
}

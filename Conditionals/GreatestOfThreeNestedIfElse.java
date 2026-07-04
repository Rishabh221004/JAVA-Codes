package Conditionals;
import java.util.Scanner;
public class GreatestOfThreeNestedIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number :");
		int a=sc.nextInt();
		System.out.print("Enter Second Number :");
		int b=sc.nextInt();
		System.out.print("Enter Third Number :");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) System.out.println(a+" is a greatest number");
			else System.out.println(c+" is a greatest number");
			}
		else {
			if(b>c) System.out.println(b+" is a greatest number");
			else System.out.println(c+" is a greatest number");
		}
		sc.close();

	}

}

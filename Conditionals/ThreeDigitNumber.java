package Conditionals;
import java.util.Scanner;
public class ThreeDigitNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int a=sc.nextInt();
		if(a>99 && a<1000) System.out.println("Three Digit NUmber");
		else System.out.println("Not a Three Digit Number");
		sc.close();

	}

}

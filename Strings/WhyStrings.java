package Strings;
import java.util.Scanner;

public class WhyStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String str=sc.nextLine();
		System.out.print("Hi ");
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		sc.close();
	}

}

package Strings;
import java.util.Scanner;
public class PlusOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		String s=n+"";
		System.out.println(s);
		System.out.println(s.length());
		sc.close();
	}
}

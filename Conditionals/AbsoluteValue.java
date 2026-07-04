package Conditionals;
import java.util.Scanner;
public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int a=sc.nextInt();
		if(a<0) System.out.println(-a);
		else System.out.println(a);
		sc.close();

	}

}

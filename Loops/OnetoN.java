package Loops;
import java.util.Scanner;
public class OnetoN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number from 1 to N");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		sc.close();			
	}

}

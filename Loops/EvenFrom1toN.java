package Loops;
import java.util.Scanner;
public class EvenFrom1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number from 1 to N");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i+=2) {
			System.out.print(i+" ");
		}
		sc.close();	
		

	}

}

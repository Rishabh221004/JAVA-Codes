package Loops;
import java.util.Scanner;
public class TableOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number from 1 to N");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		for(int i=n;i<=(n*10);i+=n) {
			System.out.print(i+" ");
		}
		sc.close();	

	}

}

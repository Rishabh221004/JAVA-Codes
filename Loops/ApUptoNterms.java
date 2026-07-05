package Loops;
import java.util.Scanner;
public class ApUptoNterms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Required AP upto n terms");
		System.out.print("Enter N ");
		int n=sc.nextInt();
		//AP 4,7,10,13......n terms
//		for(int i=4;i<=(3*n+1);i+=3) {
//			System.out.print(i+",");
//		}
		int a=4;
		for(int i=1;i<=n;i++) {
			System.out.print(a+",");
			a+=3;
		}
		sc.close();
	}
}

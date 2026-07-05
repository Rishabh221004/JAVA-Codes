package Loops;
import java.util.Scanner;
public class HelloWorldntimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many times:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("Hello World");
		}
		sc.close();
		
	}

}

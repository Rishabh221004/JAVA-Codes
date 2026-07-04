package Conditionals;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Marks :");
		int m=sc.nextInt();
		if(m>=81 && m<=100) System.out.print("Very Good");
		else if(m>=61 && m<=80) System.out.print("Good");
		else if(m>=41 && m<=60) System.out.print("Average");
		else System.out.print("Fail");
		sc.close();

	}

}

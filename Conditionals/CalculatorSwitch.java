package Conditionals;
import java.util.Scanner;
public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number :");
		int b=sc.nextInt();
		System.out.print("Enter Operator :");
		char op=sc.next().charAt(0);
//		if(op == '+') System.out.println(a+b);
//		if(op == '-') System.out.println(a-b);
//		if(op == '*') System.out.println(a*b);
//		if(op == '/') System.out.println(a/b);
//		else System.out.println("Invalid Operator");
		switch (op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid Operator");	
		}
		sc.close();
	}

}

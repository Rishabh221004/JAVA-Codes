package Conditionals;
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Selling price :");
		int sp=sc.nextInt();
		System.out.print("Enter a Cost price :");
		int cp=sc.nextInt();
		if(sp>cp) {
			System.out.print("Profit is :");
			System.out.println(sp-cp);
		}
		if(cp>sp) System.out.println("Loss is :"+(cp-sp));
		if(cp==sp) System.out.println("No Profit No Loss");
		
		sc.close();

	}

}

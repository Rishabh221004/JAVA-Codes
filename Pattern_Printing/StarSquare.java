package Pattern_Printing;
import java.util.Scanner;
public class StarSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side of square :");
		int m=sc.nextInt();
		for(int i=1;i<=m;i+=1) {
			for(int j=1;j<=m;j+=1) {
				System.out.print("* ");
			}
			System.out.println(); // Move to the next line after each row
		}
		sc.close();


	}

}

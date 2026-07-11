package Pattern_Printing;
import java.util.Scanner;
public class StarSolidSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows :");
		int m=sc.nextInt();
		System.out.print("Enter columns :");
		int n=sc.nextInt();
		for(int i=1;i<=m;i+=1) {
			for(int j=1;j<=n;j+=1) {
				System.out.print("* ");
			}
			System.out.println(); // Move to the next line after each row
		}
		sc.close();
	}

}

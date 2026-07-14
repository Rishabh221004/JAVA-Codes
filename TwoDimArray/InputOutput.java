package TwoDimArray;
import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		int[][] arr=new int[4][3];
		Scanner sc=new Scanner(System.in);
		int m=arr.length;    // no. of rows
		int n=arr[0].length; // no. of columns
		System.out.println(m);
		System.out.println(n);
		
		// Input
		for(int i=0;i<3;i+=1) {
			for(int j=0;j<3;j+=1) {
				arr[i][j]=sc.nextInt();
			}
		}

		// Output
		for(int i=0;i<3;i+=1) {
			for(int j=0;j<3;j+=1) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}

package arrays;
import java.util.Scanner;
public class InpOut {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		//Input
		for(int i=0;i<=n-1;i+=1)
		{
			arr[i]=sc.nextInt();	
		}
		//Output
		for(int i=0;i<=n-1;i+=1)
		{
			System.out.print(arr[i]+" ");	
		}
		sc.close();
				
		

	}

}

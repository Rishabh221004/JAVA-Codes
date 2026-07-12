package arrays;

public class BasicSyntax {

	public static void main(String[] args) {
		int[] arr; //declaration
		arr=new int[5]; //memory allocation
		// Or
//		int[] arr=new int[5];
		//initializing individual element
		arr[0]=100;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[0]=99;  //modify
		//output array elements
//		System.out.print(arr[0]+" ");
//		System.out.print(arr[1]+" ");
//		System.out.print(arr[2]+" ");
//		System.out.print(arr[3]+" ");
//		System.out.print(arr[4]+" ");
		for(int i=0;i<=4;i+=1)
		{
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		int[] arr2= {10,20,30,400,50,-86,98,77};
		int n=arr2.length;
		System.out.println(n);
		System.out.print(arr2[3]+" ");
	}

}

package arrays;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int[] arr= {40,70,10,60,45,94,78};
		// for each loop
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		
//     	int[] nums=arr;          //Shallow copy
//     	nums[0]=70;
//     	System.out.println(arr[0]);
     			
//		for(int ele : arr) {
//			System.out.print(ele+" ");
//		}
		//deep copy
		int[] brr=Arrays.copyOf(arr,arr.length);  
		for(int ele : brr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		brr[0]=70;
     	System.out.println(arr[0]);
     	
     	int[] crr= new int[arr.length];
     	for(int i=0;i<arr.length;i+=1) {
     		crr[i]=arr[i];
     	}
     	System.out.println();
		crr[0]=70;
     	System.out.println(arr[0]);
     	
	}

}

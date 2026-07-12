package arrays;

import java.util.Arrays;

public class BuiltInMethods {

	public static void main(String[] args) {
		int[] arr= {40,70,10,60,45,94,78};
		// for each loop
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		
	}

}

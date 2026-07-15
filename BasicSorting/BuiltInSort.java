package BasicSorting;

import java.util.Arrays;

public class BuiltInSort {

	public static void main(String[] args) {
		int[] arr= {1,31,26,45,6,44,28};
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println();

	}

}

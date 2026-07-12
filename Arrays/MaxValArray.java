package arrays;

public class MaxValArray {

	public static void main(String[] args) {
		int[] arr= {10,8,430,12,5,56,3,78};
		int n=arr.length;
//		int mx=arr[0];
//		for(int i=1;i<n;i+=1) {
//			if(arr[i]>mx) mx=arr[i];
//		}
		
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<n;i+=1) {
			mx=Math.max(mx,arr[i]);
		}
		
		System.out.println(mx);
		
	}
}

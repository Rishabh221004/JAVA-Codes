package arrays;

public class SecondMaxValArray {

	public static void main(String[] args) {
		int[] arr= {10,8,430,12,5,56,3,78};
		int n=arr.length;
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<n;i+=1) {
			mx=Math.max(mx,arr[i]);
		}
		int smx=Integer.MIN_VALUE;
		for(int i=0;i<n;i+=1) {
			if(arr[i] != mx) {
			smx=Math.max(smx,arr[i]);
		    }
		}
		System.out.println(smx);
	}
}


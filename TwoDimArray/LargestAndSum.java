package TwoDimArray;

public class LargestAndSum {

	public static void main(String[] args) {
		int[][] arr= {{14,26},{13,27},{10,30}};
		int m=arr.length;
		int n=arr[0].length;
		int mx=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<m;i+=1) {
			for(int j=0;j<n;j+=1) {
				mx=Math.max(arr[i][j], mx);
				sum+=arr[i][j];
			}
		}
		System.out.println("max value is : "+mx);
		System.out.println("sum is : "+sum);
	}

}

package arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr= {3,0,8,5,4,9,2};
		int x=11;
		int n=arr.length;
		for(int i=0;i<n;i+=1) {
			for(int j=i+1;j<n;j+=1) {
				if(arr[i]+arr[j]==x) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}	
	}
}

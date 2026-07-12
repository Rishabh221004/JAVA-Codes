package arrays;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		int[] arr= {0,1,2,0,1,2,1,2,0,0};
		int n=arr.length;
//		Method 1 
//		int noOfZeroes=0 , noOfOnes=0 ;
//		for(int i=0;i<n;i+=1) {
//			if(arr[i]==0) noOfZeroes+=1;
//			if(arr[i]==1) noOfOnes+=1;	
//		}
//		for(int i=0;i<n;i+=1) {
//			if(i<noOfZeroes) arr[i]=0;
//			else if(i<noOfZeroes+noOfOnes) arr[i]=1;
//			else arr[i]=2;
//		}
//		Method 2 :- Dutch Flag Algorithm
		int low=0,mid=0,high=n-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low+=1;mid+=1;
			}
			else if(arr[mid]==1) {
				mid+=1;
			}
			else {   //arr[mid]==2
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high-=1;
			}
		}
		for(int ele:arr) {
        	System.out.print(ele+" ");
        }
	}
}

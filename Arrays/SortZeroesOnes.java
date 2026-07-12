package arrays;

public class SortZeroesOnes {

	public static void main(String[] args) {
		int[] arr= {1,0,0,1,1,0,0,1,0};
		int n=arr.length;
//		method 1
//		int noOfZeroes=0;
//		for(int i=0;i<n;i+=1) {
//			if(arr[i]==0) noOfZeroes+=1;
//		}
//        for(int i=0;i<n;i+=1) {
//        	if(i<noOfZeroes) arr[i]=0;
//        	else arr[i]=1;
//        }
//		method 2 One Pass Solution
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]==0) i+=1;
			if(arr[j]==1) j-=1;
			if(i<j && arr[i]==1 && arr[j]==0) {
				arr[i]=0;
				arr[j]=1;
				i+=1;
				j-=1;
			}
		}
        for(int ele:arr) {
        	System.out.print(ele+" ");
        }
	}
        
}
